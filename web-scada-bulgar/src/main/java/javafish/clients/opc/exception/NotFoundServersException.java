package javafish.clients.opc.exception;

import javafish.clients.opc.exception.OpcBrowserException;

/**
 * OPC Servers not found on specific host 
 */
public class NotFoundServersException extends OpcBrowserException {
  private static final long serialVersionUID = -7780587122150100350L;
  
  public NotFoundServersException(String message) {
   super(message); 
  }

}
