/**
 * Copyright 2015 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.jboss.shrinkwrap.descriptor.api.webcommon;

/**
 * Common implementation of LoginConfigType
 * 
 * @author <a href="mailto:ggastald@redhat.com">George Gastaldi</a>
 */
public interface LoginConfigCommonType<ORIGIN extends LoginConfigCommonType<ORIGIN, FORM_LOGIN>, FORM_LOGIN extends FormLoginConfigCommonType<FORM_LOGIN>>
{
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: LoginConfigType ElementName: javaee:string ElementType : auth-method
   // MaxOccurs: - isGeneric: true isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>auth-method</code> element
    * 
    * @param authMethod the value for the element <code>auth-method</code>
    * @return the current instance of <code>ORIGIN</code>
    */
   public ORIGIN authMethod(String authMethod);

   /**
    * Returns the <code>auth-method</code> element
    * 
    * @return the node defined for the element <code>auth-method</code>
    */
   public String getAuthMethod();

   /**
    * Removes the <code>auth-method</code> element
    * 
    * @return the current instance of <code>ORIGIN</code>
    */
   public ORIGIN removeAuthMethod();

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: LoginConfigType ElementName: xsd:token ElementType : realm-name
   // MaxOccurs: - isGeneric: true isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>realm-name</code> element
    * 
    * @param realmName the value for the element <code>realm-name</code>
    * @return the current instance of <code>ORIGIN</code>
    */
   public ORIGIN realmName(String realmName);

   /**
    * Returns the <code>realm-name</code> element
    * 
    * @return the node defined for the element <code>realm-name</code>
    */
   public String getRealmName();

   /**
    * Removes the <code>realm-name</code> element
    * 
    * @return the current instance of <code>ORIGIN</code>
    */
   public ORIGIN removeRealmName();

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: LoginConfigType ElementName: javaee:form-login-configType ElementType : form-login-config
   // MaxOccurs: - isGeneric: true isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>form-login-config</code> element with the given value will be created.
    * Otherwise, the existing <code>form-login-config</code> element will be returned.
    * 
    * @return a new or existing instance of <code>FormLoginConfigType<ORIGIN></code>
    */
   public FORM_LOGIN getOrCreateFormLoginConfig();

   /**
    * Removes the <code>form-login-config</code> element
    * 
    * @return the current instance of <code>ORIGIN</code>
    */
   public ORIGIN removeFormLoginConfig();

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: LoginConfigType ElementName: xsd:ID ElementType : id
   // MaxOccurs: - isGeneric: true isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * 
    * @param id the value for the attribute <code>id</code>
    * @return the current instance of <code>ORIGIN</code>
    */
   public ORIGIN id(String id);

   /**
    * Returns the <code>id</code> attribute
    * 
    * @return the value defined for the attribute <code>id</code>
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute
    * 
    * @return the current instance of <code>ORIGIN</code>
    */
   public ORIGIN removeId();
}
