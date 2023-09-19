package javafish.clients.opc.exception;

import javafish.clients.opc.exception.OpcSynchException;

/**
 * Synchronous reading exception
 */
public class SynchReadException extends OpcSynchException {
  private static final long serialVersionUID = 3984589399856109670L;
  
  public SynchReadException(String message) {
    super(message);
  }

}
