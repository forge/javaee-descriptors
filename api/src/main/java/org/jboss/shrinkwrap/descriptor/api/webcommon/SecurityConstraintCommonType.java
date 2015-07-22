/**
 * Copyright 2015 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.jboss.shrinkwrap.descriptor.api.webcommon;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * 
 * @author <a href="mailto:ggastald@redhat.com">George Gastaldi</a>
 */
public interface SecurityConstraintCommonType<PARENT, ORIGIN extends SecurityConstraintCommonType<PARENT, ORIGIN, WEB_RESOURCE_COLLECTION_TYPE, AUTH_CONSTRAINT_TYPE, USER_DATA_CONSTRAINT_TYPE>, WEB_RESOURCE_COLLECTION_TYPE extends WebResourceCollectionCommonType<WEB_RESOURCE_COLLECTION_TYPE>, AUTH_CONSTRAINT_TYPE extends AuthConstraintCommonType<AUTH_CONSTRAINT_TYPE>, USER_DATA_CONSTRAINT_TYPE extends UserDataConstraintCommonType<USER_DATA_CONSTRAINT_TYPE>>
         extends Child<PARENT>
{
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SecurityConstraintType ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded isGeneric: true isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, a new <code>display-name</code>
    * element
    * 
    * @param values list of <code>display-name</code> objects
    * @return the current instance of <code>ORIGIN</code>
    */
   public ORIGIN displayName(String... values);

   /**
    * Returns all <code>display-name</code> elements
    * 
    * @return list of <code>display-name</code>
    */
   public List<String> getAllDisplayName();

   /**
    * Removes the <code>display-name</code> element
    * 
    * @return the current instance of <code>ORIGIN</code>
    */
   public ORIGIN removeAllDisplayName();

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SecurityConstraintType ElementName: javaee:web-resource-collectionType ElementType :
   // web-resource-collection
   // MaxOccurs: -unbounded isGeneric: true isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>web-resource-collection</code> element will be created and returned.
    * Otherwise, the first existing <code>web-resource-collection</code> element will be returned.
    * 
    * @return the instance defined for the element <code>web-resource-collection</code>
    */
   public WEB_RESOURCE_COLLECTION_TYPE getOrCreateWebResourceCollection();

   /**
    * Creates a new <code>web-resource-collection</code> element
    * 
    * @return the new created instance of <code>WEB_RESOURCE_COLLECTION_TYPE</code>
    */
   public WEB_RESOURCE_COLLECTION_TYPE createWebResourceCollection();

   /**
    * Returns all <code>web-resource-collection</code> elements
    * 
    * @return list of <code>web-resource-collection</code>
    */
   public List<WEB_RESOURCE_COLLECTION_TYPE> getAllWebResourceCollection();

   /**
    * Removes all <code>web-resource-collection</code> elements
    * 
    * @return the current instance of <code>WEB_RESOURCE_COLLECTION_TYPE</code>
    */
   public ORIGIN removeAllWebResourceCollection();

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SecurityConstraintType ElementName: javaee:auth-constraintType ElementType : auth-constraint
   // MaxOccurs: - isGeneric: true isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>auth-constraint</code> element with the given value will be created.
    * Otherwise, the existing <code>auth-constraint</code> element will be returned.
    * 
    * @return a new or existing instance of <code>AUTH_CONSTRAINT_TYPE</code>
    */
   public AUTH_CONSTRAINT_TYPE getOrCreateAuthConstraint();

   /**
    * Removes the <code>auth-constraint</code> element
    * 
    * @return the current instance of <code>ORIGIN</code>
    */
   public ORIGIN removeAuthConstraint();

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SecurityConstraintType ElementName: javaee:user-data-constraintType ElementType : user-data-constraint
   // MaxOccurs: - isGeneric: true isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>user-data-constraint</code> element with the given value will be created.
    * Otherwise, the existing <code>user-data-constraint</code> element will be returned.
    * 
    * @return a new or existing instance of <code>UserDataConstraintType<ORIGIN></code>
    */
   public USER_DATA_CONSTRAINT_TYPE getOrCreateUserDataConstraint();

   /**
    * Removes the <code>user-data-constraint</code> element
    * 
    * @return the current instance of <code>ORIGIN</code>
    */
   public ORIGIN removeUserDataConstraint();

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SecurityConstraintType ElementName: xsd:ID ElementType : id
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
