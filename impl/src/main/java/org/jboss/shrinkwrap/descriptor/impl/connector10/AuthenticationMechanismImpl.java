package org.jboss.shrinkwrap.descriptor.impl.connector10; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.connector10.AuthenticationMechanism;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;

/**
 * This class implements the <code> authentication-mechanism </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class AuthenticationMechanismImpl<T> implements Child<T>, AuthenticationMechanism<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public AuthenticationMechanismImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public AuthenticationMechanismImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: AuthenticationMechanism ElementName: xsd:string ElementType : authentication-mechanism-type
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>authentication-mechanism-type</code> element
    * @param authenticationMechanismType the value for the element <code>authentication-mechanism-type</code> 
    * @return the current instance of <code>AuthenticationMechanism<T></code> 
    */
   public AuthenticationMechanism<T> authenticationMechanismType(String authenticationMechanismType)
   {
      childNode.getOrCreate("authentication-mechanism-type").text(authenticationMechanismType);
      return this;
   }

   /**
    * Returns the <code>authentication-mechanism-type</code> element
    * @return the node defined for the element <code>authentication-mechanism-type</code> 
    */
   public String getAuthenticationMechanismType()
   {
      return childNode.getTextValueForPatternName("authentication-mechanism-type");
   }

   /**
    * Removes the <code>authentication-mechanism-type</code> element 
    * @return the current instance of <code>AuthenticationMechanism<T></code> 
    */
   public AuthenticationMechanism<T> removeAuthenticationMechanismType()
   {
      childNode.removeChildren("authentication-mechanism-type");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: AuthenticationMechanism ElementName: xsd:string ElementType : description
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>description</code> element
    * @param description the value for the element <code>description</code> 
    * @return the current instance of <code>AuthenticationMechanism<T></code> 
    */
   public AuthenticationMechanism<T> description(String description)
   {
      childNode.getOrCreate("description").text(description);
      return this;
   }

   /**
    * Returns the <code>description</code> element
    * @return the node defined for the element <code>description</code> 
    */
   public String getDescription()
   {
      return childNode.getTextValueForPatternName("description");
   }

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>AuthenticationMechanism<T></code> 
    */
   public AuthenticationMechanism<T> removeDescription()
   {
      childNode.removeChildren("description");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: AuthenticationMechanism ElementName: xsd:string ElementType : credential-interface
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>credential-interface</code> element
    * @param credentialInterface the value for the element <code>credential-interface</code> 
    * @return the current instance of <code>AuthenticationMechanism<T></code> 
    */
   public AuthenticationMechanism<T> credentialInterface(String credentialInterface)
   {
      childNode.getOrCreate("credential-interface").text(credentialInterface);
      return this;
   }

   /**
    * Returns the <code>credential-interface</code> element
    * @return the node defined for the element <code>credential-interface</code> 
    */
   public String getCredentialInterface()
   {
      return childNode.getTextValueForPatternName("credential-interface");
   }

   /**
    * Removes the <code>credential-interface</code> element 
    * @return the current instance of <code>AuthenticationMechanism<T></code> 
    */
   public AuthenticationMechanism<T> removeCredentialInterface()
   {
      childNode.removeChildren("credential-interface");
      return this;
   }
}
