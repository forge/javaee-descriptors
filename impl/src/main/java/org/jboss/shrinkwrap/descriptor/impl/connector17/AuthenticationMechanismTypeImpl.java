package org.jboss.shrinkwrap.descriptor.impl.connector17; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.connector17.AuthenticationMechanismType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.connector17.CredentialInterfaceType;

/**
 * This class implements the <code> authentication-mechanismType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class AuthenticationMechanismTypeImpl<T> implements Child<T>, AuthenticationMechanismType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public AuthenticationMechanismTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public AuthenticationMechanismTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: AuthenticationMechanismType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>AuthenticationMechanismType<T></code> 
    */
   public AuthenticationMechanismType<T> description(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("description").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
public List<String> getAllDescription()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("description");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>AuthenticationMechanismType<T></code> 
    */
   public AuthenticationMechanismType<T> removeAllDescription()
   {
      childNode.removeChildren("description");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: AuthenticationMechanismType ElementName: xsd:string ElementType : authentication-mechanism-type
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>authentication-mechanism-type</code> element
    * @param authenticationMechanismType the value for the element <code>authentication-mechanism-type</code> 
    * @return the current instance of <code>AuthenticationMechanismType<T></code> 
    */
   public AuthenticationMechanismType<T> authenticationMechanismType(String authenticationMechanismType)
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
    * @return the current instance of <code>AuthenticationMechanismType<T></code> 
    */
   public AuthenticationMechanismType<T> removeAuthenticationMechanismType()
   {
      childNode.removeChildren("authentication-mechanism-type");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: AuthenticationMechanismType ElementName: javaee:credential-interfaceType ElementType : credential-interface
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>credential-interface</code> element
    * @param credentialInterface the value for the element <code>credential-interface</code> 
    * @return the current instance of <code>AuthenticationMechanismType<T></code> 
    */
   public AuthenticationMechanismType<T> credentialInterface(CredentialInterfaceType credentialInterface)
   {
      childNode.getOrCreate("credential-interface").text(credentialInterface);
      return this;
   }
   /**
    * Sets the <code>credential-interface</code> element
    * @param credentialInterface the value for the element <code>credential-interface</code> 
    * @return the current instance of <code>AuthenticationMechanismType<T></code> 
    */
   public AuthenticationMechanismType<T> credentialInterface(String credentialInterface)
   {
      childNode.getOrCreate("credential-interface").text(credentialInterface);
      return this;
   }

   /**
    * Returns the <code>credential-interface</code> element
    * @return the value found for the element <code>credential-interface</code> 
    */
   public CredentialInterfaceType getCredentialInterface()
   {
      return CredentialInterfaceType.getFromStringValue(childNode.getTextValueForPatternName("credential-interface"));
   }

   /**
    * Returns the <code>credential-interface</code> element
    * @return the value found for the element <code>credential-interface</code> 
    */
   public String  getCredentialInterfaceAsString()
   {
      return childNode.getTextValueForPatternName("credential-interface");
   }

   /**
    * Removes the <code>credential-interface</code> attribute 
    * @return the current instance of <code>AuthenticationMechanismType<T></code> 
    */
   public AuthenticationMechanismType<T> removeCredentialInterface()
   {
      childNode.removeAttribute("credential-interface");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: AuthenticationMechanismType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>AuthenticationMechanismType<T></code> 
    */
   public AuthenticationMechanismType<T> id(String id)
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
    * @return the current instance of <code>AuthenticationMechanismType<T></code> 
    */
   public AuthenticationMechanismType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
