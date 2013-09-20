package org.jboss.shrinkwrap.descriptor.api.javaee7; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee7.TransactionSupportType;
import org.jboss.shrinkwrap.descriptor.api.javaee7.PropertyType;
/**
 * This interface defines the contract for the <code> connection-factory-resourceType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface ConnectionFactoryResourceType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectionFactoryResourceType ElementName: xsd:string ElementType : description
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>description</code> element
    * @param description the value for the element <code>description</code> 
    * @return the current instance of <code>ConnectionFactoryResourceType<T></code> 
    */
   public ConnectionFactoryResourceType<T> description(String description);

   /**
    * Returns the <code>description</code> element
    * @return the node defined for the element <code>description</code> 
    */
   public String getDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>ConnectionFactoryResourceType<T></code> 
    */
   public ConnectionFactoryResourceType<T> removeDescription();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectionFactoryResourceType ElementName: xsd:token ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> element
    * @param name the value for the element <code>name</code> 
    * @return the current instance of <code>ConnectionFactoryResourceType<T></code> 
    */
   public ConnectionFactoryResourceType<T> name(String name);

   /**
    * Returns the <code>name</code> element
    * @return the node defined for the element <code>name</code> 
    */
   public String getName();

   /**
    * Removes the <code>name</code> element 
    * @return the current instance of <code>ConnectionFactoryResourceType<T></code> 
    */
   public ConnectionFactoryResourceType<T> removeName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectionFactoryResourceType ElementName: xsd:token ElementType : interface-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>interface-name</code> element
    * @param interfaceName the value for the element <code>interface-name</code> 
    * @return the current instance of <code>ConnectionFactoryResourceType<T></code> 
    */
   public ConnectionFactoryResourceType<T> interfaceName(String interfaceName);

   /**
    * Returns the <code>interface-name</code> element
    * @return the node defined for the element <code>interface-name</code> 
    */
   public String getInterfaceName();

   /**
    * Removes the <code>interface-name</code> element 
    * @return the current instance of <code>ConnectionFactoryResourceType<T></code> 
    */
   public ConnectionFactoryResourceType<T> removeInterfaceName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectionFactoryResourceType ElementName: xsd:token ElementType : resource-adapter
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>resource-adapter</code> element
    * @param resourceAdapter the value for the element <code>resource-adapter</code> 
    * @return the current instance of <code>ConnectionFactoryResourceType<T></code> 
    */
   public ConnectionFactoryResourceType<T> resourceAdapter(String resourceAdapter);

   /**
    * Returns the <code>resource-adapter</code> element
    * @return the node defined for the element <code>resource-adapter</code> 
    */
   public String getResourceAdapter();

   /**
    * Removes the <code>resource-adapter</code> element 
    * @return the current instance of <code>ConnectionFactoryResourceType<T></code> 
    */
   public ConnectionFactoryResourceType<T> removeResourceAdapter();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectionFactoryResourceType ElementName: xsd:integer ElementType : max-pool-size
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>max-pool-size</code> element
    * @param maxPoolSize the value for the element <code>max-pool-size</code> 
    * @return the current instance of <code>ConnectionFactoryResourceType<T></code> 
    */
   public ConnectionFactoryResourceType<T> maxPoolSize(Integer maxPoolSize);

   /**
    * Returns the <code>max-pool-size</code> element
    * @return the node defined for the element <code>max-pool-size</code> 
    */
   public Integer getMaxPoolSize();

   /**
    * Removes the <code>max-pool-size</code> element 
    * @return the current instance of <code>ConnectionFactoryResourceType<T></code> 
    */
   public ConnectionFactoryResourceType<T> removeMaxPoolSize();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectionFactoryResourceType ElementName: xsd:integer ElementType : min-pool-size
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>min-pool-size</code> element
    * @param minPoolSize the value for the element <code>min-pool-size</code> 
    * @return the current instance of <code>ConnectionFactoryResourceType<T></code> 
    */
   public ConnectionFactoryResourceType<T> minPoolSize(Integer minPoolSize);

   /**
    * Returns the <code>min-pool-size</code> element
    * @return the node defined for the element <code>min-pool-size</code> 
    */
   public Integer getMinPoolSize();

   /**
    * Removes the <code>min-pool-size</code> element 
    * @return the current instance of <code>ConnectionFactoryResourceType<T></code> 
    */
   public ConnectionFactoryResourceType<T> removeMinPoolSize();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectionFactoryResourceType ElementName: javaee:transaction-supportType ElementType : transaction-support
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>transaction-support</code> element
    * @param transactionSupport the value for the element <code>transaction-support</code> 
    * @return the current instance of <code>ConnectionFactoryResourceType<T></code> 
    */
   public ConnectionFactoryResourceType<T> transactionSupport(TransactionSupportType transactionSupport);
   /**
    * Sets the <code>transaction-support</code> element
    * @param transactionSupport the value for the element <code>transaction-support</code> 
    * @return the current instance of <code>ConnectionFactoryResourceType<T></code> 
    */
   public ConnectionFactoryResourceType<T> transactionSupport(String transactionSupport);

   /**
    * Returns the <code>transaction-support</code> element
    * @return the value found for the element <code>transaction-support</code> 
    */
   public TransactionSupportType getTransactionSupport();

   /**
    * Returns the <code>transaction-support</code> element
    * @return the value found for the element <code>transaction-support</code> 
    */
   public String  getTransactionSupportAsString();

   /**
    * Removes the <code>transaction-support</code> attribute 
    * @return the current instance of <code>ConnectionFactoryResourceType<T></code> 
    */
   public ConnectionFactoryResourceType<T> removeTransactionSupport();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectionFactoryResourceType ElementName: javaee:propertyType ElementType : property
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>property</code> element will be created and returned.
    * Otherwise, the first existing <code>property</code> element will be returned.
    * @return the instance defined for the element <code>property</code> 
    */
   public PropertyType<ConnectionFactoryResourceType<T>> getOrCreateProperty();

   /**
    * Creates a new <code>property</code> element 
    * @return the new created instance of <code>PropertyType<ConnectionFactoryResourceType<T>></code> 
    */
   public PropertyType<ConnectionFactoryResourceType<T>> createProperty();

   /**
    * Returns all <code>property</code> elements
    * @return list of <code>property</code> 
    */
   public List<PropertyType<ConnectionFactoryResourceType<T>>> getAllProperty();

   /**
    * Removes all <code>property</code> elements 
    * @return the current instance of <code>PropertyType<ConnectionFactoryResourceType<T>></code> 
    */
   public ConnectionFactoryResourceType<T> removeAllProperty();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectionFactoryResourceType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>ConnectionFactoryResourceType<T></code> 
    */
   public ConnectionFactoryResourceType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>ConnectionFactoryResourceType<T></code> 
    */
   public ConnectionFactoryResourceType<T> removeId();
}
