package org.jboss.shrinkwrap.descriptor.impl.facesconfig22; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigSystemEventListenerType;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> faces-config-system-event-listenerType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class FacesConfigSystemEventListenerTypeImpl<T> implements Child<T>, FacesConfigSystemEventListenerType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public FacesConfigSystemEventListenerTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public FacesConfigSystemEventListenerTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigSystemEventListenerType ElementName: xsd:token ElementType : system-event-listener-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>system-event-listener-class</code> element
    * @param systemEventListenerClass the value for the element <code>system-event-listener-class</code> 
    * @return the current instance of <code>FacesConfigSystemEventListenerType<T></code> 
    */
   public FacesConfigSystemEventListenerType<T> systemEventListenerClass(String systemEventListenerClass)
   {
      childNode.getOrCreate("system-event-listener-class").text(systemEventListenerClass);
      return this;
   }

   /**
    * Returns the <code>system-event-listener-class</code> element
    * @return the node defined for the element <code>system-event-listener-class</code> 
    */
   public String getSystemEventListenerClass()
   {
      return childNode.getTextValueForPatternName("system-event-listener-class");
   }

   /**
    * Removes the <code>system-event-listener-class</code> element 
    * @return the current instance of <code>FacesConfigSystemEventListenerType<T></code> 
    */
   public FacesConfigSystemEventListenerType<T> removeSystemEventListenerClass()
   {
      childNode.removeChildren("system-event-listener-class");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigSystemEventListenerType ElementName: xsd:token ElementType : system-event-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>system-event-class</code> element
    * @param systemEventClass the value for the element <code>system-event-class</code> 
    * @return the current instance of <code>FacesConfigSystemEventListenerType<T></code> 
    */
   public FacesConfigSystemEventListenerType<T> systemEventClass(String systemEventClass)
   {
      childNode.getOrCreate("system-event-class").text(systemEventClass);
      return this;
   }

   /**
    * Returns the <code>system-event-class</code> element
    * @return the node defined for the element <code>system-event-class</code> 
    */
   public String getSystemEventClass()
   {
      return childNode.getTextValueForPatternName("system-event-class");
   }

   /**
    * Removes the <code>system-event-class</code> element 
    * @return the current instance of <code>FacesConfigSystemEventListenerType<T></code> 
    */
   public FacesConfigSystemEventListenerType<T> removeSystemEventClass()
   {
      childNode.removeChildren("system-event-class");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigSystemEventListenerType ElementName: xsd:token ElementType : source-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>source-class</code> element
    * @param sourceClass the value for the element <code>source-class</code> 
    * @return the current instance of <code>FacesConfigSystemEventListenerType<T></code> 
    */
   public FacesConfigSystemEventListenerType<T> sourceClass(String sourceClass)
   {
      childNode.getOrCreate("source-class").text(sourceClass);
      return this;
   }

   /**
    * Returns the <code>source-class</code> element
    * @return the node defined for the element <code>source-class</code> 
    */
   public String getSourceClass()
   {
      return childNode.getTextValueForPatternName("source-class");
   }

   /**
    * Removes the <code>source-class</code> element 
    * @return the current instance of <code>FacesConfigSystemEventListenerType<T></code> 
    */
   public FacesConfigSystemEventListenerType<T> removeSourceClass()
   {
      childNode.removeChildren("source-class");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigSystemEventListenerType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>FacesConfigSystemEventListenerType<T></code> 
    */
   public FacesConfigSystemEventListenerType<T> id(String id)
   {
      childNode.attribute("id", id);
      return this;
   }

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
      public String getId()
   {
      return childNode.getAttribute("id");
   }

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>FacesConfigSystemEventListenerType<T></code> 
    */
   public FacesConfigSystemEventListenerType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
