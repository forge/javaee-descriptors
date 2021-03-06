package org.jboss.shrinkwrap.descriptor.api.connector16; 

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> messagelistenerType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface MessagelistenerType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessagelistenerType ElementName: xsd:token ElementType : messagelistener-type
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>messagelistener-type</code> element
    * @param messagelistenerType the value for the element <code>messagelistener-type</code> 
    * @return the current instance of <code>MessagelistenerType<T></code> 
    */
   public MessagelistenerType<T> messagelistenerType(String messagelistenerType);

   /**
    * Returns the <code>messagelistener-type</code> element
    * @return the node defined for the element <code>messagelistener-type</code> 
    */
   public String getMessagelistenerType();

   /**
    * Removes the <code>messagelistener-type</code> element 
    * @return the current instance of <code>MessagelistenerType<T></code> 
    */
   public MessagelistenerType<T> removeMessagelistenerType();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessagelistenerType ElementName: javaee:activationspecType ElementType : activationspec
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>activationspec</code> element with the given value will be created.
    * Otherwise, the existing <code>activationspec</code> element will be returned.
    * @return  a new or existing instance of <code>ActivationspecType<MessagelistenerType<T>></code> 
    */
   public ActivationspecType<MessagelistenerType<T>> getOrCreateActivationspec();

   /**
    * Removes the <code>activationspec</code> element 
    * @return the current instance of <code>MessagelistenerType<T></code> 
    */
   public MessagelistenerType<T> removeActivationspec();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessagelistenerType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>MessagelistenerType<T></code> 
    */
   public MessagelistenerType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>MessagelistenerType<T></code> 
    */
   public MessagelistenerType<T> removeId();
}
