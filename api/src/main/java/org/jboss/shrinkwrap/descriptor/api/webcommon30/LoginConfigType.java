package org.jboss.shrinkwrap.descriptor.api.webcommon30; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.FormLoginConfigType;
/**
 * This interface defines the contract for the <code> login-configType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface LoginConfigType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: LoginConfigType ElementName: javaee:string ElementType : auth-method
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>auth-method</code> element
    * @param authMethod the value for the element <code>auth-method</code> 
    * @return the current instance of <code>LoginConfigType<T></code> 
    */
   public LoginConfigType<T> authMethod(String authMethod);

   /**
    * Returns the <code>auth-method</code> element
    * @return the node defined for the element <code>auth-method</code> 
    */
   public String getAuthMethod();

   /**
    * Removes the <code>auth-method</code> element 
    * @return the current instance of <code>LoginConfigType<T></code> 
    */
   public LoginConfigType<T> removeAuthMethod();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: LoginConfigType ElementName: xsd:token ElementType : realm-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>realm-name</code> element
    * @param realmName the value for the element <code>realm-name</code> 
    * @return the current instance of <code>LoginConfigType<T></code> 
    */
   public LoginConfigType<T> realmName(String realmName);

   /**
    * Returns the <code>realm-name</code> element
    * @return the node defined for the element <code>realm-name</code> 
    */
   public String getRealmName();

   /**
    * Removes the <code>realm-name</code> element 
    * @return the current instance of <code>LoginConfigType<T></code> 
    */
   public LoginConfigType<T> removeRealmName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: LoginConfigType ElementName: javaee:form-login-configType ElementType : form-login-config
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>form-login-config</code> element with the given value will be created.
    * Otherwise, the existing <code>form-login-config</code> element will be returned.
    * @return  a new or existing instance of <code>FormLoginConfigType<LoginConfigType<T>></code> 
    */
   public FormLoginConfigType<LoginConfigType<T>> getOrCreateFormLoginConfig();

   /**
    * Removes the <code>form-login-config</code> element 
    * @return the current instance of <code>LoginConfigType<T></code> 
    */
   public LoginConfigType<T> removeFormLoginConfig();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: LoginConfigType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>LoginConfigType<T></code> 
    */
   public LoginConfigType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>LoginConfigType<T></code> 
    */
   public LoginConfigType<T> removeId();
}
