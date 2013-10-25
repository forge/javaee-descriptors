/**
 * Copyright 2013 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.jboss.shrinkwrap.descriptor.api.persistence;

import java.util.List;

/**
 * 
 * @author <a href="ggastald@redhat.com">George Gastaldi</a>
 */
public interface PropertiesCommon<ORIGIN extends PropertiesCommon<ORIGIN, PROPERTY>, PROPERTY extends PropertyCommon<PROPERTY>>
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
