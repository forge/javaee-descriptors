package org.jboss.shrinkwrap.descriptor.api.connector10; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> authentication-mechanism </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface AuthenticationMechanism<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: AuthenticationMechanism ElementName: xsd:string ElementType : authentication-mechanism-type
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>authentication-mechanism-type</code> element
    * @param authenticationMechanismType the value for the element <code>authentication-mechanism-type</code> 
    * @return the current instance of <code>AuthenticationMechanism<T></code> 
    */
   public AuthenticationMechanism<T> authenticationMechanismType(String authenticationMechanismType);

   /**
    * Returns the <code>authentication-mechanism-type</code> element
    * @return the node defined for the element <code>authentication-mechanism-type</code> 
    */
   public String getAuthenticationMechanismType();

   /**
    * Removes the <code>authentication-mechanism-type</code> element 
    * @return the current instance of <code>AuthenticationMechanism<T></code> 
    */
   public AuthenticationMechanism<T> removeAuthenticationMechanismType();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: AuthenticationMechanism ElementName: xsd:string ElementType : description
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>description</code> element
    * @param description the value for the element <code>description</code> 
    * @return the current instance of <code>AuthenticationMechanism<T></code> 
    */
   public AuthenticationMechanism<T> description(String description);

   /**
    * Returns the <code>description</code> element
    * @return the node defined for the element <code>description</code> 
    */
   public String getDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>AuthenticationMechanism<T></code> 
    */
   public AuthenticationMechanism<T> removeDescription();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: AuthenticationMechanism ElementName: xsd:string ElementType : credential-interface
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>credential-interface</code> element
    * @param credentialInterface the value for the element <code>credential-interface</code> 
    * @return the current instance of <code>AuthenticationMechanism<T></code> 
    */
   public AuthenticationMechanism<T> credentialInterface(String credentialInterface);

   /**
    * Returns the <code>credential-interface</code> element
    * @return the node defined for the element <code>credential-interface</code> 
    */
   public String getCredentialInterface();

   /**
    * Removes the <code>credential-interface</code> element 
    * @return the current instance of <code>AuthenticationMechanism<T></code> 
    */
   public AuthenticationMechanism<T> removeCredentialInterface();
}
