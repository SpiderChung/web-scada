package javafish.clients.opc.exception;

import javafish.clients.opc.exception.OpcAsynchException;

/**
 * Unadvise asynchronous group exception (asynch 1.0) 
 */
public class Asynch10UnadviseException extends OpcAsynchException {
  private static final long serialVersionUID = -1290085786823584248L;
  
  public Asynch10UnadviseException(String message) {
    super(message);
  }

}
