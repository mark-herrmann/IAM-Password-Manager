package com.doubleclue.dcem.core.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2022-04-07T15:10:01.108+0200")
@StaticMetamodel(DcemUserExtension.class)
public class DcemUserExtension_ {
	public static volatile SingularAttribute<DcemUserExtension, Integer> id;
	public static volatile SingularAttribute<DcemUserExtension, String> country;
	public static volatile SingularAttribute<DcemUserExtension, String> timezone;
	public static volatile SingularAttribute<DcemUserExtension, byte[]> photo;
}
