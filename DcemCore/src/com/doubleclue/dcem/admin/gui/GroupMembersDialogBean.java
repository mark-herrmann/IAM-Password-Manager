package com.doubleclue.dcem.admin.gui;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.faces.model.SelectItem;
import javax.inject.Inject;
import javax.inject.Named;

import com.doubleclue.dcem.admin.logic.AdminModule;
import com.doubleclue.dcem.core.DcemConstants;
import com.doubleclue.dcem.core.entities.DcemGroup;
import com.doubleclue.dcem.core.entities.DcemUser;
import com.doubleclue.dcem.core.exceptions.DcemErrorCodes;
import com.doubleclue.dcem.core.exceptions.DcemException;
import com.doubleclue.dcem.core.gui.AutoViewAction;
import com.doubleclue.dcem.core.gui.DcemDialog;
import com.doubleclue.dcem.core.gui.DcemView;
import com.doubleclue.dcem.core.gui.JsfUtils;
import com.doubleclue.dcem.core.logic.DomainLogic;
import com.doubleclue.dcem.core.logic.GroupLogic;
import com.doubleclue.dcem.core.logic.JpaLogic;
import com.doubleclue.dcem.core.logic.UserLogic;

@Named("groupMembersDialog")
@SessionScoped
public class GroupMembersDialogBean extends DcemDialog {

	@Inject
	UserLogic userLogic;

	@Inject
	GroupLogic groupLogic;

	@Inject
	DomainLogic domainLogic;

	@Inject
	AdminModule adminModule;

	@Inject
	JpaLogic jpaLogic;

	private String domainName;
	private String name;
	private String userLoginId;
	private List<DcemUser> selectedUsers;
	private List<DcemUser> members;
	private static final long serialVersionUID = 1L;

	@PostConstruct
	private void init() {
	}

	public void changeDomain() {
		userLoginId = null;
	}

	public void actionAddMember() {
		try {
			groupLogic.addMember((DcemGroup) getActionObject(), userLoginId);
			members = null;
			userLoginId = null;
		} catch (DcemException dcemExp) {
			if (dcemExp.getErrorCode() == DcemErrorCodes.CONSTRAIN_VIOLATION_DB) {
				JsfUtils.addErrorMessage("User is already member of this group");
			} else {
				JsfUtils.addErrorMessage(dcemExp.getLocalizedMessage());
			}
		}
	}

	public void actionRemoveMembers() {
		if (selectedUsers == null) {
			JsfUtils.addErrorMessage(adminModule.getResourceName(), "selectMember");
			return;
		}
		groupLogic.removeMembers((DcemGroup) getActionObject(), selectedUsers);
		members = null;
	}

	@Override
	public void actionConfirm() throws Exception {
		super.actionConfirm();
	}

	public String getDomainName() {
		return domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}

	public List<SelectItem> getLdapDomainNames() {
		return domainLogic.getDomainNames();
	}

	public void show(DcemView dcemView, AutoViewAction autoViewAction) throws Exception {
		DcemGroup group = (DcemGroup) this.getActionObject();
		if (group.getName() != null) {
			String[] domainUser = group.getName().split(DcemConstants.DOMAIN_SEPERATOR_REGEX);
			if (domainUser.length > 1) {
				domainName = domainUser[0];
			}
			name = group.getName();
		} else {
			name = null;
			domainName = null;
		}
		members = null;
		selectedUsers = null;
		userLoginId = null;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<DcemUser> getMembers() {
		if (members != null) {
			return members;
		}
		DcemGroup dcemGroup = groupLogic.getGroup(((DcemGroup) this.getActionObject()).getId());
		try {
			members = groupLogic.getMembers(dcemGroup);
		} catch (DcemException e) {
			if (e.getErrorCode() == DcemErrorCodes.DOMAIN_DISABLED) {
				JsfUtils.addErrorMessage(AdminModule.RESOURCE_NAME, "ldap.error.disabled", e.getMessage());
				members = new ArrayList<>(0);
				return null;
			}
			JsfUtils.addErrorMessage(e.toString());
			return null;
		}
		return members;
	}

	public List<String> completeUser(String name) {
		if (domainName == null || domainName.isEmpty()) {
			return userLogic.getCompleteUserList(name, 50);
		} else {
			return userLogic.getCompleteUserList(domainName + DcemConstants.DOMAIN_SEPERATOR + name, 50);
		}
	}

	public String getUserLoginId() {
		return userLoginId;
	}

	public void setUserLoginId(String userLoginId) {
		this.userLoginId = userLoginId;
	}

	public List<DcemUser> getSelectedUsers() {
		return selectedUsers;
	}

	public void setSelectedUsers(List<DcemUser> selectedUsers) {
		this.selectedUsers = selectedUsers;
	}

	public String getHeight() {
		return "650px";
	}

	public String getWidth() {
		return "500px";
	}

	public void leavingDialog() {
		members = null;
		selectedUsers = null;
	}
}
