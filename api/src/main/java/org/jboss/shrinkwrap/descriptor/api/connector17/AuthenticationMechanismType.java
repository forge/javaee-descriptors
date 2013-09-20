package org.jboss.shrinkwrap.descriptor.api.connector17; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.connector17.CredentialInterfaceType;
/**
 * This interface defines the contract for the <code> authentication-mechanismType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface AuthenticationMechanismType<T> extends Child<T>
{
 
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
   public AuthenticationMechanismType<T> description(String ... values);

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>AuthenticationMechanismType<T></code> 
    */
   public AuthenticationMechanismType<T> removeAllDescription();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: AuthenticationMechanismType ElementName: xsd:string ElementType : authentication-mechanism-type
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>authentication-mechanism-type</code> element
    * @param authenticationMechanismType the value for the element <code>authentication-mechanism-type</code> 
    * @return the current instance of <code>AuthenticationMechanismType<T></code> 
    */
   public AuthenticationMechanismType<T> authenticationMechanismType(String authenticationMechanismType);

   /**
    * Returns the <code>authentication-mechanism-type</code> element
    * @return the node defined for the element <code>authentication-mechanism-type</code> 
    */
   public String getAuthenticationMechanismType();

   /**
    * Removes the <code>authentication-mechanism-type</code> element 
    * @return the current instance of <code>AuthenticationMechanismType<T></code> 
    */
   public AuthenticationMechanismType<T> removeAuthenticationMechanismType();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: AuthenticationMechanismType ElementName: javaee:credential-interfaceType ElementType : credential-interface
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>credential-interface</code> element
    * @param credentialInterface the value for the element <code>credential-interface</code> 
    * @return the current instance of <code>AuthenticationMechanismType<T></code> 
    */
   public AuthenticationMechanismType<T> credentialInterface(CredentialInterfaceType credentialInterface);
   /**
    * Sets the <code>credential-interface</code> element
    * @param credentialInterface the value for the element <code>credential-interface</code> 
    * @return the current instance of <code>AuthenticationMechanismType<T></code> 
    */
   public AuthenticationMechanismType<T> credentialInterface(String credentialInterface);

   /**
    * Returns the <code>credential-interface</code> element
    * @return the value found for the element <code>credential-interface</code> 
    */
   public CredentialInterfaceType getCredentialInterface();

   /**
    * Returns the <code>credential-interface</code> element
    * @return the value found for the element <code>credential-interface</code> 
    */
   public String  getCredentialInterfaceAsString();

   /**
    * Removes the <code>credential-interface</code> attribute 
    * @return the current instance of <code>AuthenticationMechanismType<T></code> 
    */
   public AuthenticationMechanismType<T> removeCredentialInterface();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: AuthenticationMechanismType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>AuthenticationMechanismType<T></code> 
    */
   public AuthenticationMechanismType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>AuthenticationMechanismType<T></code> 
    */
   public AuthenticationMechanismType<T> removeId();
}
