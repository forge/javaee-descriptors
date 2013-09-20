package org.jboss.shrinkwrap.descriptor.api.javaee7; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee7.PropertyType;
/**
 * This interface defines the contract for the <code> mail-sessionType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface MailSessionType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MailSessionType ElementName: xsd:string ElementType : description
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>description</code> element
    * @param description the value for the element <code>description</code> 
    * @return the current instance of <code>MailSessionType<T></code> 
    */
   public MailSessionType<T> description(String description);

   /**
    * Returns the <code>description</code> element
    * @return the node defined for the element <code>description</code> 
    */
   public String getDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>MailSessionType<T></code> 
    */
   public MailSessionType<T> removeDescription();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MailSessionType ElementName: xsd:token ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> element
    * @param name the value for the element <code>name</code> 
    * @return the current instance of <code>MailSessionType<T></code> 
    */
   public MailSessionType<T> name(String name);

   /**
    * Returns the <code>name</code> element
    * @return the node defined for the element <code>name</code> 
    */
   public String getName();

   /**
    * Removes the <code>name</code> element 
    * @return the current instance of <code>MailSessionType<T></code> 
    */
   public MailSessionType<T> removeName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MailSessionType ElementName: xsd:token ElementType : store-protocol
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>store-protocol</code> element
    * @param storeProtocol the value for the element <code>store-protocol</code> 
    * @return the current instance of <code>MailSessionType<T></code> 
    */
   public MailSessionType<T> storeProtocol(String storeProtocol);

   /**
    * Returns the <code>store-protocol</code> element
    * @return the node defined for the element <code>store-protocol</code> 
    */
   public String getStoreProtocol();

   /**
    * Removes the <code>store-protocol</code> element 
    * @return the current instance of <code>MailSessionType<T></code> 
    */
   public MailSessionType<T> removeStoreProtocol();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MailSessionType ElementName: xsd:token ElementType : store-protocol-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>store-protocol-class</code> element
    * @param storeProtocolClass the value for the element <code>store-protocol-class</code> 
    * @return the current instance of <code>MailSessionType<T></code> 
    */
   public MailSessionType<T> storeProtocolClass(String storeProtocolClass);

   /**
    * Returns the <code>store-protocol-class</code> element
    * @return the node defined for the element <code>store-protocol-class</code> 
    */
   public String getStoreProtocolClass();

   /**
    * Removes the <code>store-protocol-class</code> element 
    * @return the current instance of <code>MailSessionType<T></code> 
    */
   public MailSessionType<T> removeStoreProtocolClass();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MailSessionType ElementName: xsd:token ElementType : transport-protocol
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>transport-protocol</code> element
    * @param transportProtocol the value for the element <code>transport-protocol</code> 
    * @return the current instance of <code>MailSessionType<T></code> 
    */
   public MailSessionType<T> transportProtocol(String transportProtocol);

   /**
    * Returns the <code>transport-protocol</code> element
    * @return the node defined for the element <code>transport-protocol</code> 
    */
   public String getTransportProtocol();

   /**
    * Removes the <code>transport-protocol</code> element 
    * @return the current instance of <code>MailSessionType<T></code> 
    */
   public MailSessionType<T> removeTransportProtocol();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MailSessionType ElementName: xsd:token ElementType : transport-protocol-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>transport-protocol-class</code> element
    * @param transportProtocolClass the value for the element <code>transport-protocol-class</code> 
    * @return the current instance of <code>MailSessionType<T></code> 
    */
   public MailSessionType<T> transportProtocolClass(String transportProtocolClass);

   /**
    * Returns the <code>transport-protocol-class</code> element
    * @return the node defined for the element <code>transport-protocol-class</code> 
    */
   public String getTransportProtocolClass();

   /**
    * Removes the <code>transport-protocol-class</code> element 
    * @return the current instance of <code>MailSessionType<T></code> 
    */
   public MailSessionType<T> removeTransportProtocolClass();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MailSessionType ElementName: xsd:token ElementType : host
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>host</code> element
    * @param host the value for the element <code>host</code> 
    * @return the current instance of <code>MailSessionType<T></code> 
    */
   public MailSessionType<T> host(String host);

   /**
    * Returns the <code>host</code> element
    * @return the node defined for the element <code>host</code> 
    */
   public String getHost();

   /**
    * Removes the <code>host</code> element 
    * @return the current instance of <code>MailSessionType<T></code> 
    */
   public MailSessionType<T> removeHost();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MailSessionType ElementName: xsd:token ElementType : user
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>user</code> element
    * @param user the value for the element <code>user</code> 
    * @return the current instance of <code>MailSessionType<T></code> 
    */
   public MailSessionType<T> user(String user);

   /**
    * Returns the <code>user</code> element
    * @return the node defined for the element <code>user</code> 
    */
   public String getUser();

   /**
    * Removes the <code>user</code> element 
    * @return the current instance of <code>MailSessionType<T></code> 
    */
   public MailSessionType<T> removeUser();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MailSessionType ElementName: xsd:token ElementType : password
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>password</code> element
    * @param password the value for the element <code>password</code> 
    * @return the current instance of <code>MailSessionType<T></code> 
    */
   public MailSessionType<T> password(String password);

   /**
    * Returns the <code>password</code> element
    * @return the node defined for the element <code>password</code> 
    */
   public String getPassword();

   /**
    * Removes the <code>password</code> element 
    * @return the current instance of <code>MailSessionType<T></code> 
    */
   public MailSessionType<T> removePassword();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MailSessionType ElementName: xsd:token ElementType : from
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>from</code> element
    * @param from the value for the element <code>from</code> 
    * @return the current instance of <code>MailSessionType<T></code> 
    */
   public MailSessionType<T> from(String from);

   /**
    * Returns the <code>from</code> element
    * @return the node defined for the element <code>from</code> 
    */
   public String getFrom();

   /**
    * Removes the <code>from</code> element 
    * @return the current instance of <code>MailSessionType<T></code> 
    */
   public MailSessionType<T> removeFrom();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MailSessionType ElementName: javaee:propertyType ElementType : property
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>property</code> element will be created and returned.
    * Otherwise, the first existing <code>property</code> element will be returned.
    * @return the instance defined for the element <code>property</code> 
    */
   public PropertyType<MailSessionType<T>> getOrCreateProperty();

   /**
    * Creates a new <code>property</code> element 
    * @return the new created instance of <code>PropertyType<MailSessionType<T>></code> 
    */
   public PropertyType<MailSessionType<T>> createProperty();

   /**
    * Returns all <code>property</code> elements
    * @return list of <code>property</code> 
    */
   public List<PropertyType<MailSessionType<T>>> getAllProperty();

   /**
    * Removes all <code>property</code> elements 
    * @return the current instance of <code>PropertyType<MailSessionType<T>></code> 
    */
   public MailSessionType<T> removeAllProperty();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MailSessionType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>MailSessionType<T></code> 
    */
   public MailSessionType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>MailSessionType<T></code> 
    */
   public MailSessionType<T> removeId();
}
