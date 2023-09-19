package javafish.clients.opc.asynch;

import javafish.clients.opc.asynch.AsynchEvent;

import java.util.EventListener;


/**
 * Asynchronous OPC Group Listener
 * The listener for OPC asynchronous mode. The classes which can
 * get downloaded group (Asynch 1.0 or 2.0) has to implement 
 * this listener. 
 */
public interface OpcAsynchGroupListener extends EventListener {
  
  /**
   * Get asynchronous event
   * 
   * @param event AsynchEvent
   */
  public void getAsynchEvent(AsynchEvent event);

}
