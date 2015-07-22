/**
 * Copyright 2015 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.jboss.shrinkwrap.descriptor.api.webcommon;

/**
 * 
 * @author <a href="mailto:ggastald@redhat.com">George Gastaldi</a>
 */
public interface FormLoginConfigCommonType<ORIGIN extends FormLoginConfigCommonType<ORIGIN>>
{
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FormLoginConfigType ElementName: javaee:string ElementType : form-login-page
   // MaxOccurs: - isGeneric: true isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>form-login-page</code> element
    * 
    * @param formLoginPage the value for the element <code>form-login-page</code>
    * @return the current instance of <code>ORIGIN</code>
    */
   public ORIGIN formLoginPage(String formLoginPage);

   /**
    * Returns the <code>form-login-page</code> element
    * 
    * @return the node defined for the element <code>form-login-page</code>
    */
   public String getFormLoginPage();

   /**
    * Removes the <code>form-login-page</code> element
    * 
    * @return the current instance of <code>ORIGIN</code>
    */
   public ORIGIN removeFormLoginPage();

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FormLoginConfigType ElementName: javaee:string ElementType : form-error-page
   // MaxOccurs: - isGeneric: true isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>form-error-page</code> element
    * 
    * @param formErrorPage the value for the element <code>form-error-page</code>
    * @return the current instance of <code>ORIGIN</code>
    */
   public ORIGIN formErrorPage(String formErrorPage);

   /**
    * Returns the <code>form-error-page</code> element
    * 
    * @return the node defined for the element <code>form-error-page</code>
    */
   public String getFormErrorPage();

   /**
    * Removes the <code>form-error-page</code> element
    * 
    * @return the current instance of <code>ORIGIN</code>
    */
   public ORIGIN removeFormErrorPage();

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FormLoginConfigType ElementName: xsd:ID ElementType : id
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
