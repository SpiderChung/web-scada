package javafish.clients.opc.exception;

import javafish.clients.opc.exception.OpcAsynchException;

/**
 * Unadvise asynchronous group exception (asynch 2.0) 
 */
public class Asynch20UnadviseException extends OpcAsynchException {
  private static final long serialVersionUID = -515905757159909611L;
  
  public Asynch20UnadviseException(String message) {
    super(message);
  }

}
