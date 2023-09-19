package javafish.clients.opc.exception;

import javafish.clients.opc.exception.OpcException;

/**
 * Connect server exception 
 */
public class ConnectivityException extends OpcException {
  private static final long serialVersionUID = 2807275044228057234L;

  public ConnectivityException(String message) {
    super(message);    
  }
}
