/**
 * Copyright 2015 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.jboss.shrinkwrap.descriptor.api.javaee;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * Common implementation of SecurityRoleType
 * 
 * @author <a href="mailto:ggastald@redhat.com">George Gastaldi</a>
 */
public interface SecurityRoleCommonType<PARENT, ORIGIN extends SecurityRoleCommonType<PARENT, ORIGIN>>
         extends Child<PARENT>
{
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SecurityRoleType ElementName: xsd:string ElementType : description
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
   // ClassName: SecurityRoleType ElementName: xsd:token ElementType : role-name
   // MaxOccurs: - isGeneric: true isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>role-name</code> element
    * 
    * @param roleName the value for the element <code>role-name</code>
    * @return the current instance of <code>ORIGIN</code>
    */
   public ORIGIN roleName(String roleName);

   /**
    * Returns the <code>role-name</code> element
    * 
    * @return the node defined for the element <code>role-name</code>
    */
   public String getRoleName();

   /**
    * Removes the <code>role-name</code> element
    * 
    * @return the current instance of <code>ORIGIN</code>
    */
   public ORIGIN removeRoleName();

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SecurityRoleType ElementName: xsd:ID ElementType : id
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
