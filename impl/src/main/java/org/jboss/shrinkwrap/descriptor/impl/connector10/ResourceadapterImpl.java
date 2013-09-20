package org.jboss.shrinkwrap.descriptor.impl.connector10; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.connector10.AuthenticationMechanism;
import org.jboss.shrinkwrap.descriptor.api.connector10.ConfigProperty;
import org.jboss.shrinkwrap.descriptor.api.connector10.Resourceadapter;
import org.jboss.shrinkwrap.descriptor.api.connector10.SecurityPermission;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> resourceadapter </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class ResourceadapterImpl<T> implements Child<T>, Resourceadapter<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public ResourceadapterImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public ResourceadapterImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Resourceadapter ElementName: xsd:string ElementType : connection-interface
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>connection-interface</code> element
    * @param connectionInterface the value for the element <code>connection-interface</code> 
    * @return the current instance of <code>Resourceadapter<T></code> 
    */
   public Resourceadapter<T> connectionInterface(String connectionInterface)
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
    * @return the current instance of <code>Resourceadapter<T></code> 
    */
   public Resourceadapter<T> removeConnectionInterface()
   {
      childNode.removeChildren("connection-interface");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Resourceadapter ElementName: j2ee:config-property ElementType : config-property
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>config-property</code> element will be created and returned.
    * Otherwise, the first existing <code>config-property</code> element will be returned.
    * @return the instance defined for the element <code>config-property</code> 
    */
   public ConfigProperty<Resourceadapter<T>> getOrCreateConfigProperty()
   {
      List<Node> nodeList = childNode.get("config-property");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ConfigPropertyImpl<Resourceadapter<T>>(this, "config-property", childNode, nodeList.get(0));
      }
      return createConfigProperty();
   }

   /**
    * Creates a new <code>config-property</code> element 
    * @return the new created instance of <code>ConfigProperty<Resourceadapter<T>></code> 
    */
   public ConfigProperty<Resourceadapter<T>> createConfigProperty()
   {
      return new ConfigPropertyImpl<Resourceadapter<T>>(this, "config-property", childNode);
   }

   /**
    * Returns all <code>config-property</code> elements
    * @return list of <code>config-property</code> 
    */
   public List<ConfigProperty<Resourceadapter<T>>> getAllConfigProperty()
   {
      List<ConfigProperty<Resourceadapter<T>>> list = new ArrayList<ConfigProperty<Resourceadapter<T>>>();
      List<Node> nodeList = childNode.get("config-property");
      for(Node node: nodeList)
      {
         ConfigProperty<Resourceadapter<T>>  type = new ConfigPropertyImpl<Resourceadapter<T>>(this, "config-property", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>config-property</code> elements 
    * @return the current instance of <code>ConfigProperty<Resourceadapter<T>></code> 
    */
   public Resourceadapter<T> removeAllConfigProperty()
   {
      childNode.removeChildren("config-property");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Resourceadapter ElementName: xsd:string ElementType : connection-impl-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>connection-impl-class</code> element
    * @param connectionImplClass the value for the element <code>connection-impl-class</code> 
    * @return the current instance of <code>Resourceadapter<T></code> 
    */
   public Resourceadapter<T> connectionImplClass(String connectionImplClass)
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
    * @return the current instance of <code>Resourceadapter<T></code> 
    */
   public Resourceadapter<T> removeConnectionImplClass()
   {
      childNode.removeChildren("connection-impl-class");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Resourceadapter ElementName: xsd:string ElementType : connectionfactory-interface
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>connectionfactory-interface</code> element
    * @param connectionfactoryInterface the value for the element <code>connectionfactory-interface</code> 
    * @return the current instance of <code>Resourceadapter<T></code> 
    */
   public Resourceadapter<T> connectionfactoryInterface(String connectionfactoryInterface)
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
    * @return the current instance of <code>Resourceadapter<T></code> 
    */
   public Resourceadapter<T> removeConnectionfactoryInterface()
   {
      childNode.removeChildren("connectionfactory-interface");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Resourceadapter ElementName: xsd:string ElementType : reauthentication-support
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>reauthentication-support</code> element
    * @param reauthenticationSupport the value for the element <code>reauthentication-support</code> 
    * @return the current instance of <code>Resourceadapter<T></code> 
    */
   public Resourceadapter<T> reauthenticationSupport(String reauthenticationSupport)
   {
      childNode.getOrCreate("reauthentication-support").text(reauthenticationSupport);
      return this;
   }

   /**
    * Returns the <code>reauthentication-support</code> element
    * @return the node defined for the element <code>reauthentication-support</code> 
    */
   public String getReauthenticationSupport()
   {
      return childNode.getTextValueForPatternName("reauthentication-support");
   }

   /**
    * Removes the <code>reauthentication-support</code> element 
    * @return the current instance of <code>Resourceadapter<T></code> 
    */
   public Resourceadapter<T> removeReauthenticationSupport()
   {
      childNode.removeChildren("reauthentication-support");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Resourceadapter ElementName: j2ee:authentication-mechanism ElementType : authentication-mechanism
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>authentication-mechanism</code> element will be created and returned.
    * Otherwise, the first existing <code>authentication-mechanism</code> element will be returned.
    * @return the instance defined for the element <code>authentication-mechanism</code> 
    */
   public AuthenticationMechanism<Resourceadapter<T>> getOrCreateAuthenticationMechanism()
   {
      List<Node> nodeList = childNode.get("authentication-mechanism");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new AuthenticationMechanismImpl<Resourceadapter<T>>(this, "authentication-mechanism", childNode, nodeList.get(0));
      }
      return createAuthenticationMechanism();
   }

   /**
    * Creates a new <code>authentication-mechanism</code> element 
    * @return the new created instance of <code>AuthenticationMechanism<Resourceadapter<T>></code> 
    */
   public AuthenticationMechanism<Resourceadapter<T>> createAuthenticationMechanism()
   {
      return new AuthenticationMechanismImpl<Resourceadapter<T>>(this, "authentication-mechanism", childNode);
   }

   /**
    * Returns all <code>authentication-mechanism</code> elements
    * @return list of <code>authentication-mechanism</code> 
    */
   public List<AuthenticationMechanism<Resourceadapter<T>>> getAllAuthenticationMechanism()
   {
      List<AuthenticationMechanism<Resourceadapter<T>>> list = new ArrayList<AuthenticationMechanism<Resourceadapter<T>>>();
      List<Node> nodeList = childNode.get("authentication-mechanism");
      for(Node node: nodeList)
      {
         AuthenticationMechanism<Resourceadapter<T>>  type = new AuthenticationMechanismImpl<Resourceadapter<T>>(this, "authentication-mechanism", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>authentication-mechanism</code> elements 
    * @return the current instance of <code>AuthenticationMechanism<Resourceadapter<T>></code> 
    */
   public Resourceadapter<T> removeAllAuthenticationMechanism()
   {
      childNode.removeChildren("authentication-mechanism");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Resourceadapter ElementName: xsd:string ElementType : managedconnectionfactory-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>managedconnectionfactory-class</code> element
    * @param managedconnectionfactoryClass the value for the element <code>managedconnectionfactory-class</code> 
    * @return the current instance of <code>Resourceadapter<T></code> 
    */
   public Resourceadapter<T> managedconnectionfactoryClass(String managedconnectionfactoryClass)
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
    * @return the current instance of <code>Resourceadapter<T></code> 
    */
   public Resourceadapter<T> removeManagedconnectionfactoryClass()
   {
      childNode.removeChildren("managedconnectionfactory-class");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Resourceadapter ElementName: xsd:string ElementType : connectionfactory-impl-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>connectionfactory-impl-class</code> element
    * @param connectionfactoryImplClass the value for the element <code>connectionfactory-impl-class</code> 
    * @return the current instance of <code>Resourceadapter<T></code> 
    */
   public Resourceadapter<T> connectionfactoryImplClass(String connectionfactoryImplClass)
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
    * @return the current instance of <code>Resourceadapter<T></code> 
    */
   public Resourceadapter<T> removeConnectionfactoryImplClass()
   {
      childNode.removeChildren("connectionfactory-impl-class");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Resourceadapter ElementName: xsd:string ElementType : transaction-support
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>transaction-support</code> element
    * @param transactionSupport the value for the element <code>transaction-support</code> 
    * @return the current instance of <code>Resourceadapter<T></code> 
    */
   public Resourceadapter<T> transactionSupport(String transactionSupport)
   {
      childNode.getOrCreate("transaction-support").text(transactionSupport);
      return this;
   }

   /**
    * Returns the <code>transaction-support</code> element
    * @return the node defined for the element <code>transaction-support</code> 
    */
   public String getTransactionSupport()
   {
      return childNode.getTextValueForPatternName("transaction-support");
   }

   /**
    * Removes the <code>transaction-support</code> element 
    * @return the current instance of <code>Resourceadapter<T></code> 
    */
   public Resourceadapter<T> removeTransactionSupport()
   {
      childNode.removeChildren("transaction-support");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Resourceadapter ElementName: j2ee:security-permission ElementType : security-permission
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>security-permission</code> element will be created and returned.
    * Otherwise, the first existing <code>security-permission</code> element will be returned.
    * @return the instance defined for the element <code>security-permission</code> 
    */
   public SecurityPermission<Resourceadapter<T>> getOrCreateSecurityPermission()
   {
      List<Node> nodeList = childNode.get("security-permission");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new SecurityPermissionImpl<Resourceadapter<T>>(this, "security-permission", childNode, nodeList.get(0));
      }
      return createSecurityPermission();
   }

   /**
    * Creates a new <code>security-permission</code> element 
    * @return the new created instance of <code>SecurityPermission<Resourceadapter<T>></code> 
    */
   public SecurityPermission<Resourceadapter<T>> createSecurityPermission()
   {
      return new SecurityPermissionImpl<Resourceadapter<T>>(this, "security-permission", childNode);
   }

   /**
    * Returns all <code>security-permission</code> elements
    * @return list of <code>security-permission</code> 
    */
   public List<SecurityPermission<Resourceadapter<T>>> getAllSecurityPermission()
   {
      List<SecurityPermission<Resourceadapter<T>>> list = new ArrayList<SecurityPermission<Resourceadapter<T>>>();
      List<Node> nodeList = childNode.get("security-permission");
      for(Node node: nodeList)
      {
         SecurityPermission<Resourceadapter<T>>  type = new SecurityPermissionImpl<Resourceadapter<T>>(this, "security-permission", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>security-permission</code> elements 
    * @return the current instance of <code>SecurityPermission<Resourceadapter<T>></code> 
    */
   public Resourceadapter<T> removeAllSecurityPermission()
   {
      childNode.removeChildren("security-permission");
      return this;
   }
}
