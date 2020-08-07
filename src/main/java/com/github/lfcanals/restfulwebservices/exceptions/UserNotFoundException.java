package com.github.lfcanals.restfulwebservices.exceptions;

public class UserNotFoundException extends RuntimeException {
  public UserNotFoundException(final String msg) {
    super(msg);
  }
}
