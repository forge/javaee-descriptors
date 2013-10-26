/**
 * Copyright 2013 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.jboss.shrinkwrap.descriptor.api.persistence;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;

/**
 * 
 * @author <a href="ggastald@redhat.com">George Gastaldi</a>
 */
public interface PropertiesCommon<PARENT, ORIGIN extends PropertiesCommon<PARENT, ORIGIN, PROPERTY>, PROPERTY extends PropertyCommon<ORIGIN, PROPERTY>>
         extends Child<PARENT>
{
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Properties ElementName: persistence:property ElementType : property
   // MaxOccurs: -unbounded isGeneric: true isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>property</code> element will be created and returned. Otherwise, the first
    * existing <code>property</code> element will be returned.
    * 
    * @return the instance defined for the element <code>property</code>
    */
   public PROPERTY getOrCreateProperty();

   /**
    * Creates a new <code>property</code> element
    * 
    * @return the new created instance of <code>Property<ORIGIN></code>
    */
   public PROPERTY createProperty();

   /**
    * Returns all <code>property</code> elements
    * 
    * @return list of <code>property</code>
    */
   public List<PROPERTY> getAllProperty();

   /**
    * Removes all <code>property</code> elements
    * 
    * @return the current instance of <code>Property<ORIGIN></code>
    */
   public ORIGIN removeAllProperty();

}
