package org.jboss.shrinkwrap.descriptor.api.connector17; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.connector17.MessagelistenerType;
/**
 * This interface defines the contract for the <code> messageadapterType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface MessageadapterType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageadapterType ElementName: javaee:messagelistenerType ElementType : messagelistener
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>messagelistener</code> element will be created and returned.
    * Otherwise, the first existing <code>messagelistener</code> element will be returned.
    * @return the instance defined for the element <code>messagelistener</code> 
    */
   public MessagelistenerType<MessageadapterType<T>> getOrCreateMessagelistener();

   /**
    * Creates a new <code>messagelistener</code> element 
    * @return the new created instance of <code>MessagelistenerType<MessageadapterType<T>></code> 
    */
   public MessagelistenerType<MessageadapterType<T>> createMessagelistener();

   /**
    * Returns all <code>messagelistener</code> elements
    * @return list of <code>messagelistener</code> 
    */
   public List<MessagelistenerType<MessageadapterType<T>>> getAllMessagelistener();

   /**
    * Removes all <code>messagelistener</code> elements 
    * @return the current instance of <code>MessagelistenerType<MessageadapterType<T>></code> 
    */
   public MessageadapterType<T> removeAllMessagelistener();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageadapterType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>MessageadapterType<T></code> 
    */
   public MessageadapterType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>MessageadapterType<T></code> 
    */
   public MessageadapterType<T> removeId();
}
