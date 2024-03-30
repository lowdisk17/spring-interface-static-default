package com.sample.sample.service;

public interface ServiceInterface {

  default boolean isNameMoreThanThreeCharacters (String name) {
    if (checkStringLengthToThree(name)) {
      return true;
    }
    return false;
  }

  public static boolean isNameEqualToOneCharacter (String name) {
    if (checkStringLengthToOne(name)) {
      return true;
    }
    return false;
  }

  private boolean checkStringLengthToThree (String name) {
    return name.length() > 3;
  } 

  private static boolean checkStringLengthToOne (String name) {
    return name.length() == 1;
  } 
}
