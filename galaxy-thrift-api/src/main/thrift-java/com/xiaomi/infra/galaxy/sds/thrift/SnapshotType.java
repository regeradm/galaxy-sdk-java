/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.xiaomi.infra.galaxy.sds.thrift;


import java.util.Map;
import java.util.HashMap;
import libthrift091.TEnum;

/**
 * 快照类型
 */
public enum SnapshotType implements libthrift091.TEnum {
  /**
   * 用户触发打的快照
   */
  USER(1),
  /**
   * 系统软删除打的快照
   */
  SYSTEM(2),
  /**
   * 打开了point-in-time recovery 打的快照
   */
  PITR(3);

  private final int value;

  private SnapshotType(int value) {
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
  public static SnapshotType findByValue(int value) { 
    switch (value) {
      case 1:
        return USER;
      case 2:
        return SYSTEM;
      case 3:
        return PITR;
      default:
        return null;
    }
  }
}
