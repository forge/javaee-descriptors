package org.jboss.shrinkwrap.descriptor.api.javaee6; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> message-destination-refType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface MessageDestinationRefType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageDestinationRefType ElementName: xsd:string ElementType : lookup-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>lookup-name</code> element
    * @param lookupName the value for the element <code>lookup-name</code> 
    * @return the current instance of <code>MessageDestinationRefType<T></code> 
    */
   public MessageDestinationRefType<T> lookupName(String lookupName);

   /**
    * Returns the <code>lookup-name</code> element
    * @return the node defined for the element <code>lookup-name</code> 
    */
   public String getLookupName();

   /**
    * Removes the <code>lookup-name</code> element 
    * @return the current instance of <code>MessageDestinationRefType<T></code> 
    */
   public MessageDestinationRefType<T> removeLookupName();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageDestinationRefType ElementName: xsd:string ElementType : mapped-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>mapped-name</code> element
    * @param mappedName the value for the element <code>mapped-name</code> 
    * @return the current instance of <code>MessageDestinationRefType<T></code> 
    */
   public MessageDestinationRefType<T> mappedName(String mappedName);

   /**
    * Returns the <code>mapped-name</code> element
    * @return the node defined for the element <code>mapped-name</code> 
    */
   public String getMappedName();

   /**
    * Removes the <code>mapped-name</code> element 
    * @return the current instance of <code>MessageDestinationRefType<T></code> 
    */
   public MessageDestinationRefType<T> removeMappedName();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageDestinationRefType ElementName: javaee:injection-targetType ElementType : injection-target
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>injection-target</code> element will be created and returned.
    * Otherwise, the first existing <code>injection-target</code> element will be returned.
    * @return the instance defined for the element <code>injection-target</code> 
    */
   public InjectionTargetType<MessageDestinationRefType<T>> getOrCreateInjectionTarget();

   /**
    * Creates a new <code>injection-target</code> element 
    * @return the new created instance of <code>InjectionTargetType<MessageDestinationRefType<T>></code> 
    */
   public InjectionTargetType<MessageDestinationRefType<T>> createInjectionTarget();

   /**
    * Returns all <code>injection-target</code> elements
    * @return list of <code>injection-target</code> 
    */
   public List<InjectionTargetType<MessageDestinationRefType<T>>> getAllInjectionTarget();

   /**
    * Removes all <code>injection-target</code> elements 
    * @return the current instance of <code>InjectionTargetType<MessageDestinationRefType<T>></code> 
    */
   public MessageDestinationRefType<T> removeAllInjectionTarget();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageDestinationRefType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>MessageDestinationRefType<T></code> 
    */
   public MessageDestinationRefType<T> description(String ... values);

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>MessageDestinationRefType<T></code> 
    */
   public MessageDestinationRefType<T> removeAllDescription();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageDestinationRefType ElementName: xsd:token ElementType : message-destination-ref-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>message-destination-ref-name</code> element
    * @param messageDestinationRefName the value for the element <code>message-destination-ref-name</code> 
    * @return the current instance of <code>MessageDestinationRefType<T></code> 
    */
   public MessageDestinationRefType<T> messageDestinationRefName(String messageDestinationRefName);

   /**
    * Returns the <code>message-destination-ref-name</code> element
    * @return the node defined for the element <code>message-destination-ref-name</code> 
    */
   public String getMessageDestinationRefName();

   /**
    * Removes the <code>message-destination-ref-name</code> element 
    * @return the current instance of <code>MessageDestinationRefType<T></code> 
    */
   public MessageDestinationRefType<T> removeMessageDestinationRefName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageDestinationRefType ElementName: javaee:fully-qualified-classType ElementType : message-destination-type
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>message-destination-type</code> element
    * @param messageDestinationType the value for the element <code>message-destination-type</code> 
    * @return the current instance of <code>MessageDestinationRefType<T></code> 
    */
   public MessageDestinationRefType<T> messageDestinationType(String messageDestinationType);

   /**
    * Returns the <code>message-destination-type</code> element
    * @return the node defined for the element <code>message-destination-type</code> 
    */
   public String getMessageDestinationType();

   /**
    * Removes the <code>message-destination-type</code> element 
    * @return the current instance of <code>MessageDestinationRefType<T></code> 
    */
   public MessageDestinationRefType<T> removeMessageDestinationType();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageDestinationRefType ElementName: javaee:message-destination-usageType ElementType : message-destination-usage
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>message-destination-usage</code> element
    * @param messageDestinationUsage the value for the element <code>message-destination-usage</code> 
    * @return the current instance of <code>MessageDestinationRefType<T></code> 
    */
   public MessageDestinationRefType<T> messageDestinationUsage(MessageDestinationUsageType messageDestinationUsage);
   /**
    * Sets the <code>message-destination-usage</code> element
    * @param messageDestinationUsage the value for the element <code>message-destination-usage</code> 
    * @return the current instance of <code>MessageDestinationRefType<T></code> 
    */
   public MessageDestinationRefType<T> messageDestinationUsage(String messageDestinationUsage);

   /**
    * Returns the <code>message-destination-usage</code> element
    * @return the value found for the element <code>message-destination-usage</code> 
    */
   public MessageDestinationUsageType getMessageDestinationUsage();

   /**
    * Returns the <code>message-destination-usage</code> element
    * @return the value found for the element <code>message-destination-usage</code> 
    */
   public String  getMessageDestinationUsageAsString();

   /**
    * Removes the <code>message-destination-usage</code> attribute 
    * @return the current instance of <code>MessageDestinationRefType<T></code> 
    */
   public MessageDestinationRefType<T> removeMessageDestinationUsage();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageDestinationRefType ElementName: javaee:string ElementType : message-destination-link
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>message-destination-link</code> element
    * @param messageDestinationLink the value for the element <code>message-destination-link</code> 
    * @return the current instance of <code>MessageDestinationRefType<T></code> 
    */
   public MessageDestinationRefType<T> messageDestinationLink(String messageDestinationLink);

   /**
    * Returns the <code>message-destination-link</code> element
    * @return the node defined for the element <code>message-destination-link</code> 
    */
   public String getMessageDestinationLink();

   /**
    * Removes the <code>message-destination-link</code> element 
    * @return the current instance of <code>MessageDestinationRefType<T></code> 
    */
   public MessageDestinationRefType<T> removeMessageDestinationLink();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageDestinationRefType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>MessageDestinationRefType<T></code> 
    */
   public MessageDestinationRefType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>MessageDestinationRefType<T></code> 
    */
   public MessageDestinationRefType<T> removeId();
}
