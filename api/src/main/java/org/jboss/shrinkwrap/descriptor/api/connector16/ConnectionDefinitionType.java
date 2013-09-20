package org.jboss.shrinkwrap.descriptor.api.connector16; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.connector16.ConfigPropertyType;
/**
 * This interface defines the contract for the <code> connection-definitionType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface ConnectionDefinitionType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectionDefinitionType ElementName: xsd:token ElementType : managedconnectionfactory-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>managedconnectionfactory-class</code> element
    * @param managedconnectionfactoryClass the value for the element <code>managedconnectionfactory-class</code> 
    * @return the current instance of <code>ConnectionDefinitionType<T></code> 
    */
   public ConnectionDefinitionType<T> managedconnectionfactoryClass(String managedconnectionfactoryClass);

   /**
    * Returns the <code>managedconnectionfactory-class</code> element
    * @return the node defined for the element <code>managedconnectionfactory-class</code> 
    */
   public String getManagedconnectionfactoryClass();

   /**
    * Removes the <code>managedconnectionfactory-class</code> element 
    * @return the current instance of <code>ConnectionDefinitionType<T></code> 
    */
   public ConnectionDefinitionType<T> removeManagedconnectionfactoryClass();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectionDefinitionType ElementName: javaee:config-propertyType ElementType : config-property
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>config-property</code> element will be created and returned.
    * Otherwise, the first existing <code>config-property</code> element will be returned.
    * @return the instance defined for the element <code>config-property</code> 
    */
   public ConfigPropertyType<ConnectionDefinitionType<T>> getOrCreateConfigProperty();

   /**
    * Creates a new <code>config-property</code> element 
    * @return the new created instance of <code>ConfigPropertyType<ConnectionDefinitionType<T>></code> 
    */
   public ConfigPropertyType<ConnectionDefinitionType<T>> createConfigProperty();

   /**
    * Returns all <code>config-property</code> elements
    * @return list of <code>config-property</code> 
    */
   public List<ConfigPropertyType<ConnectionDefinitionType<T>>> getAllConfigProperty();

   /**
    * Removes all <code>config-property</code> elements 
    * @return the current instance of <code>ConfigPropertyType<ConnectionDefinitionType<T>></code> 
    */
   public ConnectionDefinitionType<T> removeAllConfigProperty();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectionDefinitionType ElementName: xsd:token ElementType : connectionfactory-interface
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>connectionfactory-interface</code> element
    * @param connectionfactoryInterface the value for the element <code>connectionfactory-interface</code> 
    * @return the current instance of <code>ConnectionDefinitionType<T></code> 
    */
   public ConnectionDefinitionType<T> connectionfactoryInterface(String connectionfactoryInterface);

   /**
    * Returns the <code>connectionfactory-interface</code> element
    * @return the node defined for the element <code>connectionfactory-interface</code> 
    */
   public String getConnectionfactoryInterface();

   /**
    * Removes the <code>connectionfactory-interface</code> element 
    * @return the current instance of <code>ConnectionDefinitionType<T></code> 
    */
   public ConnectionDefinitionType<T> removeConnectionfactoryInterface();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectionDefinitionType ElementName: xsd:token ElementType : connectionfactory-impl-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>connectionfactory-impl-class</code> element
    * @param connectionfactoryImplClass the value for the element <code>connectionfactory-impl-class</code> 
    * @return the current instance of <code>ConnectionDefinitionType<T></code> 
    */
   public ConnectionDefinitionType<T> connectionfactoryImplClass(String connectionfactoryImplClass);

   /**
    * Returns the <code>connectionfactory-impl-class</code> element
    * @return the node defined for the element <code>connectionfactory-impl-class</code> 
    */
   public String getConnectionfactoryImplClass();

   /**
    * Removes the <code>connectionfactory-impl-class</code> element 
    * @return the current instance of <code>ConnectionDefinitionType<T></code> 
    */
   public ConnectionDefinitionType<T> removeConnectionfactoryImplClass();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectionDefinitionType ElementName: xsd:token ElementType : connection-interface
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>connection-interface</code> element
    * @param connectionInterface the value for the element <code>connection-interface</code> 
    * @return the current instance of <code>ConnectionDefinitionType<T></code> 
    */
   public ConnectionDefinitionType<T> connectionInterface(String connectionInterface);

   /**
    * Returns the <code>connection-interface</code> element
    * @return the node defined for the element <code>connection-interface</code> 
    */
   public String getConnectionInterface();

   /**
    * Removes the <code>connection-interface</code> element 
    * @return the current instance of <code>ConnectionDefinitionType<T></code> 
    */
   public ConnectionDefinitionType<T> removeConnectionInterface();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectionDefinitionType ElementName: xsd:token ElementType : connection-impl-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>connection-impl-class</code> element
    * @param connectionImplClass the value for the element <code>connection-impl-class</code> 
    * @return the current instance of <code>ConnectionDefinitionType<T></code> 
    */
   public ConnectionDefinitionType<T> connectionImplClass(String connectionImplClass);

   /**
    * Returns the <code>connection-impl-class</code> element
    * @return the node defined for the element <code>connection-impl-class</code> 
    */
   public String getConnectionImplClass();

   /**
    * Removes the <code>connection-impl-class</code> element 
    * @return the current instance of <code>ConnectionDefinitionType<T></code> 
    */
   public ConnectionDefinitionType<T> removeConnectionImplClass();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectionDefinitionType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>ConnectionDefinitionType<T></code> 
    */
   public ConnectionDefinitionType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>ConnectionDefinitionType<T></code> 
    */
   public ConnectionDefinitionType<T> removeId();
}
