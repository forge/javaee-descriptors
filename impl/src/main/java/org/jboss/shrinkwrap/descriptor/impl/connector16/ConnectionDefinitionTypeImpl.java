package org.jboss.shrinkwrap.descriptor.impl.connector16; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.connector16.ConnectionDefinitionType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.connector16.ConfigPropertyType;
import org.jboss.shrinkwrap.descriptor.impl.connector16.ConfigPropertyTypeImpl;

/**
 * This class implements the <code> connection-definitionType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class ConnectionDefinitionTypeImpl<T> implements Child<T>, ConnectionDefinitionType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public ConnectionDefinitionTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public ConnectionDefinitionTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectionDefinitionType ElementName: xsd:token ElementType : managedconnectionfactory-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>managedconnectionfactory-class</code> element
    * @param managedconnectionfactoryClass the value for the element <code>managedconnectionfactory-class</code> 
    * @return the current instance of <code>ConnectionDefinitionType<T></code> 
    */
   public ConnectionDefinitionType<T> managedconnectionfactoryClass(String managedconnectionfactoryClass)
   {
      childNode.getOrCreate("managedconnectionfactory-class").text(managedconnectionfactoryClass);
      return this;
   }

   /**
    * Returns the <code>managedconnectionfactory-class</code> element
    * @return the node defined for the element <code>managedconnectionfactory-class</code> 
    */
   public String getManagedconnectionfactoryClass()
   {
      return childNode.getTextValueForPatternName("managedconnectionfactory-class");
   }

   /**
    * Removes the <code>managedconnectionfactory-class</code> element 
    * @return the current instance of <code>ConnectionDefinitionType<T></code> 
    */
   public ConnectionDefinitionType<T> removeManagedconnectionfactoryClass()
   {
      childNode.removeChildren("managedconnectionfactory-class");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectionDefinitionType ElementName: javaee:config-propertyType ElementType : config-property
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>config-property</code> element will be created and returned.
    * Otherwise, the first existing <code>config-property</code> element will be returned.
    * @return the instance defined for the element <code>config-property</code> 
    */
   public ConfigPropertyType<ConnectionDefinitionType<T>> getOrCreateConfigProperty()
   {
      List<Node> nodeList = childNode.get("config-property");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ConfigPropertyTypeImpl<ConnectionDefinitionType<T>>(this, "config-property", childNode, nodeList.get(0));
      }
      return createConfigProperty();
   }

   /**
    * Creates a new <code>config-property</code> element 
    * @return the new created instance of <code>ConfigPropertyType<ConnectionDefinitionType<T>></code> 
    */
   public ConfigPropertyType<ConnectionDefinitionType<T>> createConfigProperty()
   {
      return new ConfigPropertyTypeImpl<ConnectionDefinitionType<T>>(this, "config-property", childNode);
   }

   /**
    * Returns all <code>config-property</code> elements
    * @return list of <code>config-property</code> 
    */
   public List<ConfigPropertyType<ConnectionDefinitionType<T>>> getAllConfigProperty()
   {
      List<ConfigPropertyType<ConnectionDefinitionType<T>>> list = new ArrayList<ConfigPropertyType<ConnectionDefinitionType<T>>>();
      List<Node> nodeList = childNode.get("config-property");
      for(Node node: nodeList)
      {
         ConfigPropertyType<ConnectionDefinitionType<T>>  type = new ConfigPropertyTypeImpl<ConnectionDefinitionType<T>>(this, "config-property", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>config-property</code> elements 
    * @return the current instance of <code>ConfigPropertyType<ConnectionDefinitionType<T>></code> 
    */
   public ConnectionDefinitionType<T> removeAllConfigProperty()
   {
      childNode.removeChildren("config-property");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectionDefinitionType ElementName: xsd:token ElementType : connectionfactory-interface
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>connectionfactory-interface</code> element
    * @param connectionfactoryInterface the value for the element <code>connectionfactory-interface</code> 
    * @return the current instance of <code>ConnectionDefinitionType<T></code> 
    */
   public ConnectionDefinitionType<T> connectionfactoryInterface(String connectionfactoryInterface)
   {
      childNode.getOrCreate("connectionfactory-interface").text(connectionfactoryInterface);
      return this;
   }

   /**
    * Returns the <code>connectionfactory-interface</code> element
    * @return the node defined for the element <code>connectionfactory-interface</code> 
    */
   public String getConnectionfactoryInterface()
   {
      return childNode.getTextValueForPatternName("connectionfactory-interface");
   }

   /**
    * Removes the <code>connectionfactory-interface</code> element 
    * @return the current instance of <code>ConnectionDefinitionType<T></code> 
    */
   public ConnectionDefinitionType<T> removeConnectionfactoryInterface()
   {
      childNode.removeChildren("connectionfactory-interface");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectionDefinitionType ElementName: xsd:token ElementType : connectionfactory-impl-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>connectionfactory-impl-class</code> element
    * @param connectionfactoryImplClass the value for the element <code>connectionfactory-impl-class</code> 
    * @return the current instance of <code>ConnectionDefinitionType<T></code> 
    */
   public ConnectionDefinitionType<T> connectionfactoryImplClass(String connectionfactoryImplClass)
   {
      childNode.getOrCreate("connectionfactory-impl-class").text(connectionfactoryImplClass);
      return this;
   }

   /**
    * Returns the <code>connectionfactory-impl-class</code> element
    * @return the node defined for the element <code>connectionfactory-impl-class</code> 
    */
   public String getConnectionfactoryImplClass()
   {
      return childNode.getTextValueForPatternName("connectionfactory-impl-class");
   }

   /**
    * Removes the <code>connectionfactory-impl-class</code> element 
    * @return the current instance of <code>ConnectionDefinitionType<T></code> 
    */
   public ConnectionDefinitionType<T> removeConnectionfactoryImplClass()
   {
      childNode.removeChildren("connectionfactory-impl-class");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectionDefinitionType ElementName: xsd:token ElementType : connection-interface
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>connection-interface</code> element
    * @param connectionInterface the value for the element <code>connection-interface</code> 
    * @return the current instance of <code>ConnectionDefinitionType<T></code> 
    */
   public ConnectionDefinitionType<T> connectionInterface(String connectionInterface)
   {
      childNode.getOrCreate("connection-interface").text(connectionInterface);
      return this;
   }

   /**
    * Returns the <code>connection-interface</code> element
    * @return the node defined for the element <code>connection-interface</code> 
    */
   public String getConnectionInterface()
   {
      return childNode.getTextValueForPatternName("connection-interface");
   }

   /**
    * Removes the <code>connection-interface</code> element 
    * @return the current instance of <code>ConnectionDefinitionType<T></code> 
    */
   public ConnectionDefinitionType<T> removeConnectionInterface()
   {
      childNode.removeChildren("connection-interface");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectionDefinitionType ElementName: xsd:token ElementType : connection-impl-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>connection-impl-class</code> element
    * @param connectionImplClass the value for the element <code>connection-impl-class</code> 
    * @return the current instance of <code>ConnectionDefinitionType<T></code> 
    */
   public ConnectionDefinitionType<T> connectionImplClass(String connectionImplClass)
   {
      childNode.getOrCreate("connection-impl-class").text(connectionImplClass);
      return this;
   }

   /**
    * Returns the <code>connection-impl-class</code> element
    * @return the node defined for the element <code>connection-impl-class</code> 
    */
   public String getConnectionImplClass()
   {
      return childNode.getTextValueForPatternName("connection-impl-class");
   }

   /**
    * Removes the <code>connection-impl-class</code> element 
    * @return the current instance of <code>ConnectionDefinitionType<T></code> 
    */
   public ConnectionDefinitionType<T> removeConnectionImplClass()
   {
      childNode.removeChildren("connection-impl-class");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectionDefinitionType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>ConnectionDefinitionType<T></code> 
    */
   public ConnectionDefinitionType<T> id(String id)
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
    * @return the current instance of <code>ConnectionDefinitionType<T></code> 
    */
   public ConnectionDefinitionType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
