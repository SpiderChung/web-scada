package javafish.clients.opc.exception;

import javafish.clients.opc.exception.OpcBrowserException;

/**
 * Unable browse specific branch of opc browser 
 */
public class UnableBrowseBranchException extends OpcBrowserException {
  private static final long serialVersionUID = 5978201440270662885L;
  
  public UnableBrowseBranchException(String message) {
    super(message);
  }

}
