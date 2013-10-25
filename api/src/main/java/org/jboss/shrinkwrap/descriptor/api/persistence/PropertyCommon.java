/**
 * Copyright 2013 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.jboss.shrinkwrap.descriptor.api.persistence;


/**
 * 
 * @author <a href="ggastald@redhat.com">George Gastaldi</a>
 */
public interface PropertyCommon<ORIGIN extends PropertyCommon<ORIGIN>>
{
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Property ElementName: xsd:string ElementType : name
   // MaxOccurs: - isGeneric: true isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * 
    * @param name the value for the attribute <code>name</code>
    * @return the current instance of <code>ORIGIN</code>
    */
   public ORIGIN name(String name);

   /**
    * Returns the <code>name</code> attribute
    * 
    * @return the value defined for the attribute <code>name</code>
    */
   public String getName();

   /**
    * Removes the <code>name</code> attribute
    * 
    * @return the current instance of <code>ORIGIN</code>
    */
   public ORIGIN removeName();

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Property ElementName: xsd:string ElementType : value
   // MaxOccurs: - isGeneric: true isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>value</code> attribute
    * 
    * @param value the value for the attribute <code>value</code>
    * @return the current instance of <code>ORIGIN</code>
    */
   public ORIGIN value(String value);

   /**
    * Returns the <code>value</code> attribute
    * 
    * @return the value defined for the attribute <code>value</code>
    */
   public String getValue();

   /**
    * Removes the <code>value</code> attribute
    * 
    * @return the current instance of <code>ORIGIN</code>
    */
   public ORIGIN removeValue();

}
