package org.jboss.shrinkwrap.descriptor.api.javaee7; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee7.PropertyType;
/**
 * This interface defines the contract for the <code> jms-connection-factoryType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface JmsConnectionFactoryType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JmsConnectionFactoryType ElementName: xsd:string ElementType : description
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>description</code> element
    * @param description the value for the element <code>description</code> 
    * @return the current instance of <code>JmsConnectionFactoryType<T></code> 
    */
   public JmsConnectionFactoryType<T> description(String description);

   /**
    * Returns the <code>description</code> element
    * @return the node defined for the element <code>description</code> 
    */
   public String getDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>JmsConnectionFactoryType<T></code> 
    */
   public JmsConnectionFactoryType<T> removeDescription();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JmsConnectionFactoryType ElementName: xsd:token ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> element
    * @param name the value for the element <code>name</code> 
    * @return the current instance of <code>JmsConnectionFactoryType<T></code> 
    */
   public JmsConnectionFactoryType<T> name(String name);

   /**
    * Returns the <code>name</code> element
    * @return the node defined for the element <code>name</code> 
    */
   public String getName();

   /**
    * Removes the <code>name</code> element 
    * @return the current instance of <code>JmsConnectionFactoryType<T></code> 
    */
   public JmsConnectionFactoryType<T> removeName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JmsConnectionFactoryType ElementName: xsd:token ElementType : interface-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>interface-name</code> element
    * @param interfaceName the value for the element <code>interface-name</code> 
    * @return the current instance of <code>JmsConnectionFactoryType<T></code> 
    */
   public JmsConnectionFactoryType<T> interfaceName(String interfaceName);

   /**
    * Returns the <code>interface-name</code> element
    * @return the node defined for the element <code>interface-name</code> 
    */
   public String getInterfaceName();

   /**
    * Removes the <code>interface-name</code> element 
    * @return the current instance of <code>JmsConnectionFactoryType<T></code> 
    */
   public JmsConnectionFactoryType<T> removeInterfaceName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JmsConnectionFactoryType ElementName: xsd:token ElementType : class-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>class-name</code> element
    * @param className the value for the element <code>class-name</code> 
    * @return the current instance of <code>JmsConnectionFactoryType<T></code> 
    */
   public JmsConnectionFactoryType<T> className(String className);

   /**
    * Returns the <code>class-name</code> element
    * @return the node defined for the element <code>class-name</code> 
    */
   public String getClassName();

   /**
    * Removes the <code>class-name</code> element 
    * @return the current instance of <code>JmsConnectionFactoryType<T></code> 
    */
   public JmsConnectionFactoryType<T> removeClassName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JmsConnectionFactoryType ElementName: xsd:token ElementType : resource-adapter
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>resource-adapter</code> element
    * @param resourceAdapter the value for the element <code>resource-adapter</code> 
    * @return the current instance of <code>JmsConnectionFactoryType<T></code> 
    */
   public JmsConnectionFactoryType<T> resourceAdapter(String resourceAdapter);

   /**
    * Returns the <code>resource-adapter</code> element
    * @return the node defined for the element <code>resource-adapter</code> 
    */
   public String getResourceAdapter();

   /**
    * Removes the <code>resource-adapter</code> element 
    * @return the current instance of <code>JmsConnectionFactoryType<T></code> 
    */
   public JmsConnectionFactoryType<T> removeResourceAdapter();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JmsConnectionFactoryType ElementName: xsd:token ElementType : user
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>user</code> element
    * @param user the value for the element <code>user</code> 
    * @return the current instance of <code>JmsConnectionFactoryType<T></code> 
    */
   public JmsConnectionFactoryType<T> user(String user);

   /**
    * Returns the <code>user</code> element
    * @return the node defined for the element <code>user</code> 
    */
   public String getUser();

   /**
    * Removes the <code>user</code> element 
    * @return the current instance of <code>JmsConnectionFactoryType<T></code> 
    */
   public JmsConnectionFactoryType<T> removeUser();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JmsConnectionFactoryType ElementName: xsd:token ElementType : password
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>password</code> element
    * @param password the value for the element <code>password</code> 
    * @return the current instance of <code>JmsConnectionFactoryType<T></code> 
    */
   public JmsConnectionFactoryType<T> password(String password);

   /**
    * Returns the <code>password</code> element
    * @return the node defined for the element <code>password</code> 
    */
   public String getPassword();

   /**
    * Removes the <code>password</code> element 
    * @return the current instance of <code>JmsConnectionFactoryType<T></code> 
    */
   public JmsConnectionFactoryType<T> removePassword();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JmsConnectionFactoryType ElementName: xsd:token ElementType : client-id
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>client-id</code> element
    * @param clientId the value for the element <code>client-id</code> 
    * @return the current instance of <code>JmsConnectionFactoryType<T></code> 
    */
   public JmsConnectionFactoryType<T> clientId(String clientId);

   /**
    * Returns the <code>client-id</code> element
    * @return the node defined for the element <code>client-id</code> 
    */
   public String getClientId();

   /**
    * Removes the <code>client-id</code> element 
    * @return the current instance of <code>JmsConnectionFactoryType<T></code> 
    */
   public JmsConnectionFactoryType<T> removeClientId();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JmsConnectionFactoryType ElementName: javaee:propertyType ElementType : property
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>property</code> element will be created and returned.
    * Otherwise, the first existing <code>property</code> element will be returned.
    * @return the instance defined for the element <code>property</code> 
    */
   public PropertyType<JmsConnectionFactoryType<T>> getOrCreateProperty();

   /**
    * Creates a new <code>property</code> element 
    * @return the new created instance of <code>PropertyType<JmsConnectionFactoryType<T>></code> 
    */
   public PropertyType<JmsConnectionFactoryType<T>> createProperty();

   /**
    * Returns all <code>property</code> elements
    * @return list of <code>property</code> 
    */
   public List<PropertyType<JmsConnectionFactoryType<T>>> getAllProperty();

   /**
    * Removes all <code>property</code> elements 
    * @return the current instance of <code>PropertyType<JmsConnectionFactoryType<T>></code> 
    */
   public JmsConnectionFactoryType<T> removeAllProperty();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JmsConnectionFactoryType ElementName: xsd:boolean ElementType : transactional
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>transactional</code> element
    * @param transactional the value for the element <code>transactional</code> 
    * @return the current instance of <code>JmsConnectionFactoryType<T></code> 
    */
   public JmsConnectionFactoryType<T> transactional(Boolean transactional);

   /**
    * Returns the <code>transactional</code> element
    * @return the node defined for the element <code>transactional</code> 
    */
   public Boolean isTransactional();

   /**
    * Removes the <code>transactional</code> element 
    * @return the current instance of <code>JmsConnectionFactoryType<T></code> 
    */
   public JmsConnectionFactoryType<T> removeTransactional();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JmsConnectionFactoryType ElementName: xsd:integer ElementType : max-pool-size
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>max-pool-size</code> element
    * @param maxPoolSize the value for the element <code>max-pool-size</code> 
    * @return the current instance of <code>JmsConnectionFactoryType<T></code> 
    */
   public JmsConnectionFactoryType<T> maxPoolSize(Integer maxPoolSize);

   /**
    * Returns the <code>max-pool-size</code> element
    * @return the node defined for the element <code>max-pool-size</code> 
    */
   public Integer getMaxPoolSize();

   /**
    * Removes the <code>max-pool-size</code> element 
    * @return the current instance of <code>JmsConnectionFactoryType<T></code> 
    */
   public JmsConnectionFactoryType<T> removeMaxPoolSize();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JmsConnectionFactoryType ElementName: xsd:integer ElementType : min-pool-size
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>min-pool-size</code> element
    * @param minPoolSize the value for the element <code>min-pool-size</code> 
    * @return the current instance of <code>JmsConnectionFactoryType<T></code> 
    */
   public JmsConnectionFactoryType<T> minPoolSize(Integer minPoolSize);

   /**
    * Returns the <code>min-pool-size</code> element
    * @return the node defined for the element <code>min-pool-size</code> 
    */
   public Integer getMinPoolSize();

   /**
    * Removes the <code>min-pool-size</code> element 
    * @return the current instance of <code>JmsConnectionFactoryType<T></code> 
    */
   public JmsConnectionFactoryType<T> removeMinPoolSize();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JmsConnectionFactoryType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>JmsConnectionFactoryType<T></code> 
    */
   public JmsConnectionFactoryType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>JmsConnectionFactoryType<T></code> 
    */
   public JmsConnectionFactoryType<T> removeId();
}
