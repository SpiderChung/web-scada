package javafish.clients.opc.exception;

import javafish.clients.opc.exception.OpcException;

/**
 * Update time of group change exception 
 */
public class GroupUpdateTimeException extends OpcException {
  private static final long serialVersionUID = -3555572559332734530L;
  
  public GroupUpdateTimeException(String message) {
    super(message);
  }

}
