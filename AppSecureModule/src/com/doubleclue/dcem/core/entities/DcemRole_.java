package com.doubleclue.dcem.core.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2020-09-24T15:35:17.029+0200")
@StaticMetamodel(DcemRole.class)
public class DcemRole_ {
	public static volatile SingularAttribute<DcemRole, Integer> id;
	public static volatile SingularAttribute<DcemRole, String> name;
	public static volatile SingularAttribute<DcemRole, Boolean> systemRole;
	public static volatile SingularAttribute<DcemRole, Boolean> disabled;
	public static volatile SingularAttribute<DcemRole, Integer> rank;
	public static volatile SingularAttribute<DcemRole, Integer> jpaVersion;
	public static volatile SetAttribute<DcemRole, DcemAction> actions;
}
