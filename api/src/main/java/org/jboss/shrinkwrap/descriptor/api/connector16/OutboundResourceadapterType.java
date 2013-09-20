package org.jboss.shrinkwrap.descriptor.api.connector16; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> outbound-resourceadapterType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface OutboundResourceadapterType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OutboundResourceadapterType ElementName: javaee:connection-definitionType ElementType : connection-definition
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>connection-definition</code> element will be created and returned.
    * Otherwise, the first existing <code>connection-definition</code> element will be returned.
    * @return the instance defined for the element <code>connection-definition</code> 
    */
   public ConnectionDefinitionType<OutboundResourceadapterType<T>> getOrCreateConnectionDefinition();

   /**
    * Creates a new <code>connection-definition</code> element 
    * @return the new created instance of <code>ConnectionDefinitionType<OutboundResourceadapterType<T>></code> 
    */
   public ConnectionDefinitionType<OutboundResourceadapterType<T>> createConnectionDefinition();

   /**
    * Returns all <code>connection-definition</code> elements
    * @return list of <code>connection-definition</code> 
    */
   public List<ConnectionDefinitionType<OutboundResourceadapterType<T>>> getAllConnectionDefinition();

   /**
    * Removes all <code>connection-definition</code> elements 
    * @return the current instance of <code>ConnectionDefinitionType<OutboundResourceadapterType<T>></code> 
    */
   public OutboundResourceadapterType<T> removeAllConnectionDefinition();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OutboundResourceadapterType ElementName: javaee:transaction-supportType ElementType : transaction-support
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>transaction-support</code> element
    * @param transactionSupport the value for the element <code>transaction-support</code> 
    * @return the current instance of <code>OutboundResourceadapterType<T></code> 
    */
   public OutboundResourceadapterType<T> transactionSupport(TransactionSupportType transactionSupport);
   /**
    * Sets the <code>transaction-support</code> element
    * @param transactionSupport the value for the element <code>transaction-support</code> 
    * @return the current instance of <code>OutboundResourceadapterType<T></code> 
    */
   public OutboundResourceadapterType<T> transactionSupport(String transactionSupport);

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
    * @return the current instance of <code>OutboundResourceadapterType<T></code> 
    */
   public OutboundResourceadapterType<T> removeTransactionSupport();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OutboundResourceadapterType ElementName: javaee:authentication-mechanismType ElementType : authentication-mechanism
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>authentication-mechanism</code> element will be created and returned.
    * Otherwise, the first existing <code>authentication-mechanism</code> element will be returned.
    * @return the instance defined for the element <code>authentication-mechanism</code> 
    */
   public AuthenticationMechanismType<OutboundResourceadapterType<T>> getOrCreateAuthenticationMechanism();

   /**
    * Creates a new <code>authentication-mechanism</code> element 
    * @return the new created instance of <code>AuthenticationMechanismType<OutboundResourceadapterType<T>></code> 
    */
   public AuthenticationMechanismType<OutboundResourceadapterType<T>> createAuthenticationMechanism();

   /**
    * Returns all <code>authentication-mechanism</code> elements
    * @return list of <code>authentication-mechanism</code> 
    */
   public List<AuthenticationMechanismType<OutboundResourceadapterType<T>>> getAllAuthenticationMechanism();

   /**
    * Removes all <code>authentication-mechanism</code> elements 
    * @return the current instance of <code>AuthenticationMechanismType<OutboundResourceadapterType<T>></code> 
    */
   public OutboundResourceadapterType<T> removeAllAuthenticationMechanism();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OutboundResourceadapterType ElementName: javaee:xsdBooleanType ElementType : reauthentication-support
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>reauthentication-support</code> element
    * @param reauthenticationSupport the value for the element <code>reauthentication-support</code> 
    * @return the current instance of <code>OutboundResourceadapterType<T></code> 
    */
   public OutboundResourceadapterType<T> reauthenticationSupport(Boolean reauthenticationSupport);

   /**
    * Returns the <code>reauthentication-support</code> element
    * @return the node defined for the element <code>reauthentication-support</code> 
    */
   public Boolean isReauthenticationSupport();

   /**
    * Removes the <code>reauthentication-support</code> element 
    * @return the current instance of <code>OutboundResourceadapterType<T></code> 
    */
   public OutboundResourceadapterType<T> removeReauthenticationSupport();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OutboundResourceadapterType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>OutboundResourceadapterType<T></code> 
    */
   public OutboundResourceadapterType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>OutboundResourceadapterType<T></code> 
    */
   public OutboundResourceadapterType<T> removeId();
}
