package org.jboss.shrinkwrap.descriptor.api.javaee7; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee7.IconType;
/**
 * This interface defines the contract for the <code> message-destinationType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface MessageDestinationType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageDestinationType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>MessageDestinationType<T></code> 
    */
   public MessageDestinationType<T> description(String ... values);

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>MessageDestinationType<T></code> 
    */
   public MessageDestinationType<T> removeAllDescription();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageDestinationType ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>MessageDestinationType<T></code> 
    */
   public MessageDestinationType<T> displayName(String ... values);

   /**
    * Returns all <code>display-name</code> elements
    * @return list of <code>display-name</code> 
    */
   public List<String> getAllDisplayName();

   /**
    * Removes the <code>display-name</code> element 
    * @return the current instance of <code>MessageDestinationType<T></code> 
    */
   public MessageDestinationType<T> removeAllDisplayName();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageDestinationType ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<MessageDestinationType<T>> getOrCreateIcon();

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<MessageDestinationType<T>></code> 
    */
   public IconType<MessageDestinationType<T>> createIcon();

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<MessageDestinationType<T>>> getAllIcon();

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<MessageDestinationType<T>></code> 
    */
   public MessageDestinationType<T> removeAllIcon();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageDestinationType ElementName: xsd:token ElementType : message-destination-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>message-destination-name</code> element
    * @param messageDestinationName the value for the element <code>message-destination-name</code> 
    * @return the current instance of <code>MessageDestinationType<T></code> 
    */
   public MessageDestinationType<T> messageDestinationName(String messageDestinationName);

   /**
    * Returns the <code>message-destination-name</code> element
    * @return the node defined for the element <code>message-destination-name</code> 
    */
   public String getMessageDestinationName();

   /**
    * Removes the <code>message-destination-name</code> element 
    * @return the current instance of <code>MessageDestinationType<T></code> 
    */
   public MessageDestinationType<T> removeMessageDestinationName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageDestinationType ElementName: xsd:string ElementType : mapped-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>mapped-name</code> element
    * @param mappedName the value for the element <code>mapped-name</code> 
    * @return the current instance of <code>MessageDestinationType<T></code> 
    */
   public MessageDestinationType<T> mappedName(String mappedName);

   /**
    * Returns the <code>mapped-name</code> element
    * @return the node defined for the element <code>mapped-name</code> 
    */
   public String getMappedName();

   /**
    * Removes the <code>mapped-name</code> element 
    * @return the current instance of <code>MessageDestinationType<T></code> 
    */
   public MessageDestinationType<T> removeMappedName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageDestinationType ElementName: xsd:string ElementType : lookup-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>lookup-name</code> element
    * @param lookupName the value for the element <code>lookup-name</code> 
    * @return the current instance of <code>MessageDestinationType<T></code> 
    */
   public MessageDestinationType<T> lookupName(String lookupName);

   /**
    * Returns the <code>lookup-name</code> element
    * @return the node defined for the element <code>lookup-name</code> 
    */
   public String getLookupName();

   /**
    * Removes the <code>lookup-name</code> element 
    * @return the current instance of <code>MessageDestinationType<T></code> 
    */
   public MessageDestinationType<T> removeLookupName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageDestinationType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>MessageDestinationType<T></code> 
    */
   public MessageDestinationType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>MessageDestinationType<T></code> 
    */
   public MessageDestinationType<T> removeId();
}
