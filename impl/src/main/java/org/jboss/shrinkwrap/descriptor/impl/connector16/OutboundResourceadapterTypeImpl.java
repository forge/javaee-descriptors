package org.jboss.shrinkwrap.descriptor.impl.connector16; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.connector16.AuthenticationMechanismType;
import org.jboss.shrinkwrap.descriptor.api.connector16.ConnectionDefinitionType;
import org.jboss.shrinkwrap.descriptor.api.connector16.OutboundResourceadapterType;
import org.jboss.shrinkwrap.descriptor.api.connector16.TransactionSupportType;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> outbound-resourceadapterType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class OutboundResourceadapterTypeImpl<T> implements Child<T>, OutboundResourceadapterType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public OutboundResourceadapterTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public OutboundResourceadapterTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OutboundResourceadapterType ElementName: javaee:connection-definitionType ElementType : connection-definition
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>connection-definition</code> element will be created and returned.
    * Otherwise, the first existing <code>connection-definition</code> element will be returned.
    * @return the instance defined for the element <code>connection-definition</code> 
    */
   public ConnectionDefinitionType<OutboundResourceadapterType<T>> getOrCreateConnectionDefinition()
   {
      List<Node> nodeList = childNode.get("connection-definition");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ConnectionDefinitionTypeImpl<OutboundResourceadapterType<T>>(this, "connection-definition", childNode, nodeList.get(0));
      }
      return createConnectionDefinition();
   }

   /**
    * Creates a new <code>connection-definition</code> element 
    * @return the new created instance of <code>ConnectionDefinitionType<OutboundResourceadapterType<T>></code> 
    */
   public ConnectionDefinitionType<OutboundResourceadapterType<T>> createConnectionDefinition()
   {
      return new ConnectionDefinitionTypeImpl<OutboundResourceadapterType<T>>(this, "connection-definition", childNode);
   }

   /**
    * Returns all <code>connection-definition</code> elements
    * @return list of <code>connection-definition</code> 
    */
   public List<ConnectionDefinitionType<OutboundResourceadapterType<T>>> getAllConnectionDefinition()
   {
      List<ConnectionDefinitionType<OutboundResourceadapterType<T>>> list = new ArrayList<ConnectionDefinitionType<OutboundResourceadapterType<T>>>();
      List<Node> nodeList = childNode.get("connection-definition");
      for(Node node: nodeList)
      {
         ConnectionDefinitionType<OutboundResourceadapterType<T>>  type = new ConnectionDefinitionTypeImpl<OutboundResourceadapterType<T>>(this, "connection-definition", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>connection-definition</code> elements 
    * @return the current instance of <code>ConnectionDefinitionType<OutboundResourceadapterType<T>></code> 
    */
   public OutboundResourceadapterType<T> removeAllConnectionDefinition()
   {
      childNode.removeChildren("connection-definition");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OutboundResourceadapterType ElementName: javaee:transaction-supportType ElementType : transaction-support
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>transaction-support</code> element
    * @param transactionSupport the value for the element <code>transaction-support</code> 
    * @return the current instance of <code>OutboundResourceadapterType<T></code> 
    */
   public OutboundResourceadapterType<T> transactionSupport(TransactionSupportType transactionSupport)
   {
      childNode.getOrCreate("transaction-support").text(transactionSupport);
      return this;
   }
   /**
    * Sets the <code>transaction-support</code> element
    * @param transactionSupport the value for the element <code>transaction-support</code> 
    * @return the current instance of <code>OutboundResourceadapterType<T></code> 
    */
   public OutboundResourceadapterType<T> transactionSupport(String transactionSupport)
   {
      childNode.getOrCreate("transaction-support").text(transactionSupport);
      return this;
   }

   /**
    * Returns the <code>transaction-support</code> element
    * @return the value found for the element <code>transaction-support</code> 
    */
   public TransactionSupportType getTransactionSupport()
   {
      return TransactionSupportType.getFromStringValue(childNode.getTextValueForPatternName("transaction-support"));
   }

   /**
    * Returns the <code>transaction-support</code> element
    * @return the value found for the element <code>transaction-support</code> 
    */
   public String  getTransactionSupportAsString()
   {
      return childNode.getTextValueForPatternName("transaction-support");
   }

   /**
    * Removes the <code>transaction-support</code> attribute 
    * @return the current instance of <code>OutboundResourceadapterType<T></code> 
    */
   public OutboundResourceadapterType<T> removeTransactionSupport()
   {
      childNode.removeAttribute("transaction-support");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OutboundResourceadapterType ElementName: javaee:authentication-mechanismType ElementType : authentication-mechanism
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>authentication-mechanism</code> element will be created and returned.
    * Otherwise, the first existing <code>authentication-mechanism</code> element will be returned.
    * @return the instance defined for the element <code>authentication-mechanism</code> 
    */
   public AuthenticationMechanismType<OutboundResourceadapterType<T>> getOrCreateAuthenticationMechanism()
   {
      List<Node> nodeList = childNode.get("authentication-mechanism");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new AuthenticationMechanismTypeImpl<OutboundResourceadapterType<T>>(this, "authentication-mechanism", childNode, nodeList.get(0));
      }
      return createAuthenticationMechanism();
   }

   /**
    * Creates a new <code>authentication-mechanism</code> element 
    * @return the new created instance of <code>AuthenticationMechanismType<OutboundResourceadapterType<T>></code> 
    */
   public AuthenticationMechanismType<OutboundResourceadapterType<T>> createAuthenticationMechanism()
   {
      return new AuthenticationMechanismTypeImpl<OutboundResourceadapterType<T>>(this, "authentication-mechanism", childNode);
   }

   /**
    * Returns all <code>authentication-mechanism</code> elements
    * @return list of <code>authentication-mechanism</code> 
    */
   public List<AuthenticationMechanismType<OutboundResourceadapterType<T>>> getAllAuthenticationMechanism()
   {
      List<AuthenticationMechanismType<OutboundResourceadapterType<T>>> list = new ArrayList<AuthenticationMechanismType<OutboundResourceadapterType<T>>>();
      List<Node> nodeList = childNode.get("authentication-mechanism");
      for(Node node: nodeList)
      {
         AuthenticationMechanismType<OutboundResourceadapterType<T>>  type = new AuthenticationMechanismTypeImpl<OutboundResourceadapterType<T>>(this, "authentication-mechanism", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>authentication-mechanism</code> elements 
    * @return the current instance of <code>AuthenticationMechanismType<OutboundResourceadapterType<T>></code> 
    */
   public OutboundResourceadapterType<T> removeAllAuthenticationMechanism()
   {
      childNode.removeChildren("authentication-mechanism");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OutboundResourceadapterType ElementName: javaee:xsdBooleanType ElementType : reauthentication-support
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>reauthentication-support</code> element
    * @param reauthenticationSupport the value for the element <code>reauthentication-support</code> 
    * @return the current instance of <code>OutboundResourceadapterType<T></code> 
    */
   public OutboundResourceadapterType<T> reauthenticationSupport(Boolean reauthenticationSupport)
   {
      childNode.getOrCreate("reauthentication-support").text(reauthenticationSupport);
      return this;
   }

   /**
    * Returns the <code>reauthentication-support</code> element
    * @return the node defined for the element <code>reauthentication-support</code> 
    */
   public Boolean isReauthenticationSupport()
   {
      return Strings.isTrue(childNode.getTextValueForPatternName("reauthentication-support"));
   }

   /**
    * Removes the <code>reauthentication-support</code> element 
    * @return the current instance of <code>OutboundResourceadapterType<T></code> 
    */
   public OutboundResourceadapterType<T> removeReauthenticationSupport()
   {
      childNode.removeChildren("reauthentication-support");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OutboundResourceadapterType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>OutboundResourceadapterType<T></code> 
    */
   public OutboundResourceadapterType<T> id(String id)
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
    * @return the current instance of <code>OutboundResourceadapterType<T></code> 
    */
   public OutboundResourceadapterType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
