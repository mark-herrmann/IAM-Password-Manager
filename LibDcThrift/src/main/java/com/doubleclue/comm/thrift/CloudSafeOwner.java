/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.doubleclue.comm.thrift;


@javax.annotation.Generated(value = "Autogenerated by Thrift Compiler (0.13.0)", date = "2021-10-21")
public enum CloudSafeOwner implements org.apache.thrift.TEnum {
  GLOBAL(0),
  USER(1),
  DEVICE(2),
  GROUP(3);

  private final int value;

  private CloudSafeOwner(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  @org.apache.thrift.annotation.Nullable
  public static CloudSafeOwner findByValue(int value) { 
    switch (value) {
      case 0:
        return GLOBAL;
      case 1:
        return USER;
      case 2:
        return DEVICE;
      case 3:
        return GROUP;
      default:
        return null;
    }
  }
}
