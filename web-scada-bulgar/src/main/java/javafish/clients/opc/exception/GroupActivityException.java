package javafish.clients.opc.exception;

import javafish.clients.opc.exception.OpcActivityException;

/**
 * Activity of group exception
 */
public class GroupActivityException extends OpcActivityException {
  private static final long serialVersionUID = 1736876239826472558L;
  
  public GroupActivityException(String message) {
    super(message);
  }

}
