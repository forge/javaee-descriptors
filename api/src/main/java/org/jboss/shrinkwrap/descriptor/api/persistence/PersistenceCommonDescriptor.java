/**
 * Copyright 2013 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.jboss.shrinkwrap.descriptor.api.persistence;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Descriptor;

/**
 * 
 * @author <a href="ggastald@redhat.com">George Gastaldi</a>
 */
public interface PersistenceCommonDescriptor<T, PERSISTENCE_UNIT extends PersistenceUnitCommon<T, PERSISTENCE_UNIT, ?>>
         extends Descriptor
{

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PersistenceDescriptor ElementName: persistence:persistence-unit ElementType : persistence-unit
   // MaxOccurs: -unbounded isGeneric: false isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>persistence-unit</code> element will be created and returned. Otherwise, the
    * first existing <code>persistence-unit</code> element will be returned.
    * 
    * @return the instance defined for the element <code>persistence-unit</code>
    */
   public PERSISTENCE_UNIT getOrCreatePersistenceUnit();

   /**
    * Creates a new <code>persistence-unit</code> element
    * 
    * @return the new created instance of <code>PersistenceUnit<PersistenceDescriptor></code>
    */
   public PERSISTENCE_UNIT createPersistenceUnit();

   /**
    * Returns all <code>persistence-unit</code> elements
    * 
    * @return list of <code>persistence-unit</code>
    */
   public List<PERSISTENCE_UNIT> getAllPersistenceUnit();

   /**
    * Removes all <code>persistence-unit</code> elements
    * 
    * @return the current instance of <code>PersistenceUnit<PersistenceDescriptor></code>
    */
   public T removeAllPersistenceUnit();

   /**
    * Sets the <code>version</code> attribute
    * 
    * @param version the value for the attribute <code>version</code>
    * @return the current instance of <code>PersistenceDescriptor</code>
    */
   public T version(String version);

   /**
    * Returns the <code>version</code> attribute
    * 
    * @return the value defined for the attribute <code>version</code>
    */
   public String getVersion();

   /**
    * Removes the <code>version</code> attribute
    * 
    * @return the current instance of <code>PersistenceDescriptor</code>
    */
   public T removeVersion();

}
