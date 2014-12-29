/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.sds.thrift;


import java.util.Map;
import java.util.HashMap;
import libthrift091.TEnum;

/**
 * 签名使用的HMMAC算法
 */
public enum MacAlgorithm implements libthrift091.TEnum {
  HmacMD5(1),
  HmacSHA1(2),
  HmacSHA256(3);

  private final int value;

  private MacAlgorithm(int value) {
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
  public static MacAlgorithm findByValue(int value) { 
    switch (value) {
      case 1:
        return HmacMD5;
      case 2:
        return HmacSHA1;
      case 3:
        return HmacSHA256;
      default:
        return null;
    }
  }
}
