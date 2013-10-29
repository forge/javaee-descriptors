/**
 * Copyright 2013 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.jboss.shrinkwrap.descriptor.api.webcommon;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * Common implementation of ErrorPage
 * 
 * @author <a href="ggastald@redhat.com">George Gastaldi</a>
 */
public interface ErrorPageCommonType<PARENT, ORIGIN extends ErrorPageCommonType<PARENT, ORIGIN>> extends Child<PARENT>
{
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ErrorPageType ElementName: javaee:xsdPositiveIntegerType ElementType : error-code
   // MaxOccurs: - isGeneric: true isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>error-code</code> element
    * 
    * @param errorCode the value for the element <code>error-code</code>
    * @return the current instance of <code>ORIGIN</code>
    */
   public ORIGIN errorCode(String errorCode);

   /**
    * Returns the <code>error-code</code> element
    * 
    * @return the node defined for the element <code>error-code</code>
    */
   public String getErrorCode();

   /**
    * Removes the <code>error-code</code> element
    * 
    * @return the current instance of <code>ORIGIN</code>
    */
   public ORIGIN removeErrorCode();

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ErrorPageType ElementName: xsd:token ElementType : exception-type
   // MaxOccurs: - isGeneric: true isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>exception-type</code> element
    * 
    * @param exceptionType the value for the element <code>exception-type</code>
    * @return the current instance of <code>ORIGIN</code>
    */
   public ORIGIN exceptionType(String exceptionType);

   /**
    * Returns the <code>exception-type</code> element
    * 
    * @return the node defined for the element <code>exception-type</code>
    */
   public String getExceptionType();

   /**
    * Removes the <code>exception-type</code> element
    * 
    * @return the current instance of <code>ORIGIN</code>
    */
   public ORIGIN removeExceptionType();

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ErrorPageType ElementName: javaee:string ElementType : location
   // MaxOccurs: - isGeneric: true isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>location</code> element
    * 
    * @param location the value for the element <code>location</code>
    * @return the current instance of <code>ORIGIN</code>
    */
   public ORIGIN location(String location);

   /**
    * Returns the <code>location</code> element
    * 
    * @return the node defined for the element <code>location</code>
    */
   public String getLocation();

   /**
    * Removes the <code>location</code> element
    * 
    * @return the current instance of <code>ORIGIN</code>
    */
   public ORIGIN removeLocation();

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ErrorPageType ElementName: xsd:ID ElementType : id
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
