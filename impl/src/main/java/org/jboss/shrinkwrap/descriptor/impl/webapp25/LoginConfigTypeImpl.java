package org.jboss.shrinkwrap.descriptor.impl.webapp25; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.webapp25.LoginConfigType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.webapp25.FormLoginConfigType;
import org.jboss.shrinkwrap.descriptor.impl.webapp25.FormLoginConfigTypeImpl;

/**
 * This class implements the <code> login-configType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class LoginConfigTypeImpl<T> implements Child<T>, LoginConfigType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public LoginConfigTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public LoginConfigTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: LoginConfigType ElementName: javaee:string ElementType : auth-method
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>auth-method</code> element
    * @param authMethod the value for the element <code>auth-method</code> 
    * @return the current instance of <code>LoginConfigType<T></code> 
    */
   public LoginConfigType<T> authMethod(String authMethod)
   {
      childNode.getOrCreate("auth-method").text(authMethod);
      return this;
   }

   /**
    * Returns the <code>auth-method</code> element
    * @return the node defined for the element <code>auth-method</code> 
    */
   public String getAuthMethod()
   {
      return childNode.getTextValueForPatternName("auth-method");
   }

   /**
    * Removes the <code>auth-method</code> element 
    * @return the current instance of <code>LoginConfigType<T></code> 
    */
   public LoginConfigType<T> removeAuthMethod()
   {
      childNode.removeChildren("auth-method");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: LoginConfigType ElementName: xsd:token ElementType : realm-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>realm-name</code> element
    * @param realmName the value for the element <code>realm-name</code> 
    * @return the current instance of <code>LoginConfigType<T></code> 
    */
   public LoginConfigType<T> realmName(String realmName)
   {
      childNode.getOrCreate("realm-name").text(realmName);
      return this;
   }

   /**
    * Returns the <code>realm-name</code> element
    * @return the node defined for the element <code>realm-name</code> 
    */
   public String getRealmName()
   {
      return childNode.getTextValueForPatternName("realm-name");
   }

   /**
    * Removes the <code>realm-name</code> element 
    * @return the current instance of <code>LoginConfigType<T></code> 
    */
   public LoginConfigType<T> removeRealmName()
   {
      childNode.removeChildren("realm-name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: LoginConfigType ElementName: javaee:form-login-configType ElementType : form-login-config
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>form-login-config</code> element with the given value will be created.
    * Otherwise, the existing <code>form-login-config</code> element will be returned.
    * @return  a new or existing instance of <code>FormLoginConfigType<LoginConfigType<T>></code> 
    */
   public FormLoginConfigType<LoginConfigType<T>> getOrCreateFormLoginConfig()
   {
      Node node = childNode.getOrCreate("form-login-config");
      FormLoginConfigType<LoginConfigType<T>> formLoginConfig = new FormLoginConfigTypeImpl<LoginConfigType<T>>(this, "form-login-config", childNode, node);
      return formLoginConfig;
   }

   /**
    * Removes the <code>form-login-config</code> element 
    * @return the current instance of <code>LoginConfigType<T></code> 
    */
   public LoginConfigType<T> removeFormLoginConfig()
   {
      childNode.removeChildren("form-login-config");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: LoginConfigType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>LoginConfigType<T></code> 
    */
   public LoginConfigType<T> id(String id)
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
    * @return the current instance of <code>LoginConfigType<T></code> 
    */
   public LoginConfigType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
