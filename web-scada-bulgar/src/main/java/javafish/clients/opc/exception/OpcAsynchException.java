package javafish.clients.opc.exception;

import javafish.clients.opc.exception.OpcException;

/**
 * Opc asynchronous exception
 */
public class OpcAsynchException extends OpcException {
  private static final long serialVersionUID = 2456365232226155289L;
  
  public OpcAsynchException(String message) {
    super(message);
  }

}
