/**
 * Copyright 2015 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.jboss.shrinkwrap.descriptor.api.webcommon;

import java.util.List;

/**
 * 
 * @author <a href="mailto:ggastald@redhat.com">George Gastaldi</a>
 */
public interface UserDataConstraintCommonType<ORIGIN extends UserDataConstraintCommonType<ORIGIN>>
{
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: UserDataConstraintType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded isGeneric: true isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, a new <code>description</code>
    * element
    * 
    * @param values list of <code>description</code> objects
    * @return the current instance of <code>ORIGIN</code>
    */
   public ORIGIN description(String... values);

   /**
    * Returns all <code>description</code> elements
    * 
    * @return list of <code>description</code>
    */
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element
    * 
    * @return the current instance of <code>ORIGIN</code>
    */
   public ORIGIN removeAllDescription();

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: UserDataConstraintType ElementName: javaee:transport-guaranteeType ElementType : transport-guarantee
   // MaxOccurs: - isGeneric: true isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>transport-guarantee</code> element
    * 
    * @param transportGuarantee the value for the element <code>transport-guarantee</code>
    * @return the current instance of <code>ORIGIN</code>
    */
   public ORIGIN transportGuarantee(String transportGuarantee);

   /**
    * Returns the <code>transport-guarantee</code> element
    * 
    * @return the value found for the element <code>transport-guarantee</code>
    */
   public String getTransportGuaranteeAsString();

   /**
    * Removes the <code>transport-guarantee</code> attribute
    * 
    * @return the current instance of <code>ORIGIN</code>
    */
   public ORIGIN removeTransportGuarantee();

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: UserDataConstraintType ElementName: xsd:ID ElementType : id
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
