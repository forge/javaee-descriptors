package org.jboss.shrinkwrap.descriptor.api.facesconfig22; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> faces-config-system-event-listenerType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface FacesConfigSystemEventListenerType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigSystemEventListenerType ElementName: xsd:token ElementType : system-event-listener-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>system-event-listener-class</code> element
    * @param systemEventListenerClass the value for the element <code>system-event-listener-class</code> 
    * @return the current instance of <code>FacesConfigSystemEventListenerType<T></code> 
    */
   public FacesConfigSystemEventListenerType<T> systemEventListenerClass(String systemEventListenerClass);

   /**
    * Returns the <code>system-event-listener-class</code> element
    * @return the node defined for the element <code>system-event-listener-class</code> 
    */
   public String getSystemEventListenerClass();

   /**
    * Removes the <code>system-event-listener-class</code> element 
    * @return the current instance of <code>FacesConfigSystemEventListenerType<T></code> 
    */
   public FacesConfigSystemEventListenerType<T> removeSystemEventListenerClass();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigSystemEventListenerType ElementName: xsd:token ElementType : system-event-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>system-event-class</code> element
    * @param systemEventClass the value for the element <code>system-event-class</code> 
    * @return the current instance of <code>FacesConfigSystemEventListenerType<T></code> 
    */
   public FacesConfigSystemEventListenerType<T> systemEventClass(String systemEventClass);

   /**
    * Returns the <code>system-event-class</code> element
    * @return the node defined for the element <code>system-event-class</code> 
    */
   public String getSystemEventClass();

   /**
    * Removes the <code>system-event-class</code> element 
    * @return the current instance of <code>FacesConfigSystemEventListenerType<T></code> 
    */
   public FacesConfigSystemEventListenerType<T> removeSystemEventClass();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigSystemEventListenerType ElementName: xsd:token ElementType : source-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>source-class</code> element
    * @param sourceClass the value for the element <code>source-class</code> 
    * @return the current instance of <code>FacesConfigSystemEventListenerType<T></code> 
    */
   public FacesConfigSystemEventListenerType<T> sourceClass(String sourceClass);

   /**
    * Returns the <code>source-class</code> element
    * @return the node defined for the element <code>source-class</code> 
    */
   public String getSourceClass();

   /**
    * Removes the <code>source-class</code> element 
    * @return the current instance of <code>FacesConfigSystemEventListenerType<T></code> 
    */
   public FacesConfigSystemEventListenerType<T> removeSourceClass();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigSystemEventListenerType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>FacesConfigSystemEventListenerType<T></code> 
    */
   public FacesConfigSystemEventListenerType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>FacesConfigSystemEventListenerType<T></code> 
    */
   public FacesConfigSystemEventListenerType<T> removeId();
}
