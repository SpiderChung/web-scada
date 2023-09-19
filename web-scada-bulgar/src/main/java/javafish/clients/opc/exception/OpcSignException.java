package javafish.clients.opc.exception;

import javafish.clients.opc.exception.OpcException;

/**
 * Opc sign exception (addition interface)
 */
public class OpcSignException extends OpcException {
  private static final long serialVersionUID = -6330477677677022360L;
  
  public OpcSignException(String message) {
    super(message);
  }

}
