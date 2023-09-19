package javafish.clients.opc.exception;

import javafish.clients.opc.exception.OpcActivityException;

/**
 * Activity of item exception
 */
public class ItemActivityException extends OpcActivityException {
  private static final long serialVersionUID = -8809832709603468310L;
  
  public ItemActivityException(String message) {
    super(message);
  }
}
