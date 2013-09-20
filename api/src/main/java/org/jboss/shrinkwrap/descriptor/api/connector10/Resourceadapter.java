package org.jboss.shrinkwrap.descriptor.api.connector10; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> resourceadapter </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface Resourceadapter<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Resourceadapter ElementName: xsd:string ElementType : connection-interface
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>connection-interface</code> element
    * @param connectionInterface the value for the element <code>connection-interface</code> 
    * @return the current instance of <code>Resourceadapter<T></code> 
    */
   public Resourceadapter<T> connectionInterface(String connectionInterface);

   /**
    * Returns the <code>connection-interface</code> element
    * @return the node defined for the element <code>connection-interface</code> 
    */
   public String getConnectionInterface();

   /**
    * Removes the <code>connection-interface</code> element 
    * @return the current instance of <code>Resourceadapter<T></code> 
    */
   public Resourceadapter<T> removeConnectionInterface();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Resourceadapter ElementName: j2ee:config-property ElementType : config-property
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>config-property</code> element will be created and returned.
    * Otherwise, the first existing <code>config-property</code> element will be returned.
    * @return the instance defined for the element <code>config-property</code> 
    */
   public ConfigProperty<Resourceadapter<T>> getOrCreateConfigProperty();

   /**
    * Creates a new <code>config-property</code> element 
    * @return the new created instance of <code>ConfigProperty<Resourceadapter<T>></code> 
    */
   public ConfigProperty<Resourceadapter<T>> createConfigProperty();

   /**
    * Returns all <code>config-property</code> elements
    * @return list of <code>config-property</code> 
    */
   public List<ConfigProperty<Resourceadapter<T>>> getAllConfigProperty();

   /**
    * Removes all <code>config-property</code> elements 
    * @return the current instance of <code>ConfigProperty<Resourceadapter<T>></code> 
    */
   public Resourceadapter<T> removeAllConfigProperty();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Resourceadapter ElementName: xsd:string ElementType : connection-impl-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>connection-impl-class</code> element
    * @param connectionImplClass the value for the element <code>connection-impl-class</code> 
    * @return the current instance of <code>Resourceadapter<T></code> 
    */
   public Resourceadapter<T> connectionImplClass(String connectionImplClass);

   /**
    * Returns the <code>connection-impl-class</code> element
    * @return the node defined for the element <code>connection-impl-class</code> 
    */
   public String getConnectionImplClass();

   /**
    * Removes the <code>connection-impl-class</code> element 
    * @return the current instance of <code>Resourceadapter<T></code> 
    */
   public Resourceadapter<T> removeConnectionImplClass();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Resourceadapter ElementName: xsd:string ElementType : connectionfactory-interface
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>connectionfactory-interface</code> element
    * @param connectionfactoryInterface the value for the element <code>connectionfactory-interface</code> 
    * @return the current instance of <code>Resourceadapter<T></code> 
    */
   public Resourceadapter<T> connectionfactoryInterface(String connectionfactoryInterface);

   /**
    * Returns the <code>connectionfactory-interface</code> element
    * @return the node defined for the element <code>connectionfactory-interface</code> 
    */
   public String getConnectionfactoryInterface();

   /**
    * Removes the <code>connectionfactory-interface</code> element 
    * @return the current instance of <code>Resourceadapter<T></code> 
    */
   public Resourceadapter<T> removeConnectionfactoryInterface();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Resourceadapter ElementName: xsd:string ElementType : reauthentication-support
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>reauthentication-support</code> element
    * @param reauthenticationSupport the value for the element <code>reauthentication-support</code> 
    * @return the current instance of <code>Resourceadapter<T></code> 
    */
   public Resourceadapter<T> reauthenticationSupport(String reauthenticationSupport);

   /**
    * Returns the <code>reauthentication-support</code> element
    * @return the node defined for the element <code>reauthentication-support</code> 
    */
   public String getReauthenticationSupport();

   /**
    * Removes the <code>reauthentication-support</code> element 
    * @return the current instance of <code>Resourceadapter<T></code> 
    */
   public Resourceadapter<T> removeReauthenticationSupport();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Resourceadapter ElementName: j2ee:authentication-mechanism ElementType : authentication-mechanism
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>authentication-mechanism</code> element will be created and returned.
    * Otherwise, the first existing <code>authentication-mechanism</code> element will be returned.
    * @return the instance defined for the element <code>authentication-mechanism</code> 
    */
   public AuthenticationMechanism<Resourceadapter<T>> getOrCreateAuthenticationMechanism();

   /**
    * Creates a new <code>authentication-mechanism</code> element 
    * @return the new created instance of <code>AuthenticationMechanism<Resourceadapter<T>></code> 
    */
   public AuthenticationMechanism<Resourceadapter<T>> createAuthenticationMechanism();

   /**
    * Returns all <code>authentication-mechanism</code> elements
    * @return list of <code>authentication-mechanism</code> 
    */
   public List<AuthenticationMechanism<Resourceadapter<T>>> getAllAuthenticationMechanism();

   /**
    * Removes all <code>authentication-mechanism</code> elements 
    * @return the current instance of <code>AuthenticationMechanism<Resourceadapter<T>></code> 
    */
   public Resourceadapter<T> removeAllAuthenticationMechanism();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Resourceadapter ElementName: xsd:string ElementType : managedconnectionfactory-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>managedconnectionfactory-class</code> element
    * @param managedconnectionfactoryClass the value for the element <code>managedconnectionfactory-class</code> 
    * @return the current instance of <code>Resourceadapter<T></code> 
    */
   public Resourceadapter<T> managedconnectionfactoryClass(String managedconnectionfactoryClass);

   /**
    * Returns the <code>managedconnectionfactory-class</code> element
    * @return the node defined for the element <code>managedconnectionfactory-class</code> 
    */
   public String getManagedconnectionfactoryClass();

   /**
    * Removes the <code>managedconnectionfactory-class</code> element 
    * @return the current instance of <code>Resourceadapter<T></code> 
    */
   public Resourceadapter<T> removeManagedconnectionfactoryClass();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Resourceadapter ElementName: xsd:string ElementType : connectionfactory-impl-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>connectionfactory-impl-class</code> element
    * @param connectionfactoryImplClass the value for the element <code>connectionfactory-impl-class</code> 
    * @return the current instance of <code>Resourceadapter<T></code> 
    */
   public Resourceadapter<T> connectionfactoryImplClass(String connectionfactoryImplClass);

   /**
    * Returns the <code>connectionfactory-impl-class</code> element
    * @return the node defined for the element <code>connectionfactory-impl-class</code> 
    */
   public String getConnectionfactoryImplClass();

   /**
    * Removes the <code>connectionfactory-impl-class</code> element 
    * @return the current instance of <code>Resourceadapter<T></code> 
    */
   public Resourceadapter<T> removeConnectionfactoryImplClass();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Resourceadapter ElementName: xsd:string ElementType : transaction-support
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>transaction-support</code> element
    * @param transactionSupport the value for the element <code>transaction-support</code> 
    * @return the current instance of <code>Resourceadapter<T></code> 
    */
   public Resourceadapter<T> transactionSupport(String transactionSupport);

   /**
    * Returns the <code>transaction-support</code> element
    * @return the node defined for the element <code>transaction-support</code> 
    */
   public String getTransactionSupport();

   /**
    * Removes the <code>transaction-support</code> element 
    * @return the current instance of <code>Resourceadapter<T></code> 
    */
   public Resourceadapter<T> removeTransactionSupport();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Resourceadapter ElementName: j2ee:security-permission ElementType : security-permission
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>security-permission</code> element will be created and returned.
    * Otherwise, the first existing <code>security-permission</code> element will be returned.
    * @return the instance defined for the element <code>security-permission</code> 
    */
   public SecurityPermission<Resourceadapter<T>> getOrCreateSecurityPermission();

   /**
    * Creates a new <code>security-permission</code> element 
    * @return the new created instance of <code>SecurityPermission<Resourceadapter<T>></code> 
    */
   public SecurityPermission<Resourceadapter<T>> createSecurityPermission();

   /**
    * Returns all <code>security-permission</code> elements
    * @return list of <code>security-permission</code> 
    */
   public List<SecurityPermission<Resourceadapter<T>>> getAllSecurityPermission();

   /**
    * Removes all <code>security-permission</code> elements 
    * @return the current instance of <code>SecurityPermission<Resourceadapter<T>></code> 
    */
   public Resourceadapter<T> removeAllSecurityPermission();
}
