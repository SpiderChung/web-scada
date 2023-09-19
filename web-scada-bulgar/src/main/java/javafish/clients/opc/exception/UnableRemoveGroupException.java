package javafish.clients.opc.exception;

import javafish.clients.opc.exception.OpcSignException;

/**
 * Unable to remove group from opc-server exception 
 */
public class UnableRemoveGroupException extends OpcSignException {
  private static final long serialVersionUID = 9155386300268389184L;
  
  public UnableRemoveGroupException(String message) {
    super(message);
  }

}
