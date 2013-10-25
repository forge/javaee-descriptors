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
@SuppressWarnings("rawtypes")
public interface PersistenceUnitCommon<ORIGIN extends PersistenceUnitCommon<ORIGIN, PROPERTIES>, PROPERTIES extends PropertiesCommon>
{

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PersistenceUnit ElementName: xsd:string ElementType : description
   // MaxOccurs: - isGeneric: true isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>description</code> element
    * 
    * @param description the value for the element <code>description</code>
    * @return the current instance of <code>ORIGIN</code>
    */
   public ORIGIN description(String description);

   /**
    * Returns the <code>description</code> element
    * 
    * @return the node defined for the element <code>description</code>
    */
   public String getDescription();

   /**
    * Removes the <code>description</code> element
    * 
    * @return the current instance of <code>ORIGIN</code>
    */
   public ORIGIN removeDescription();

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PersistenceUnit ElementName: xsd:string ElementType : provider
   // MaxOccurs: - isGeneric: true isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>provider</code> element
    * 
    * @param provider the value for the element <code>provider</code>
    * @return the current instance of <code>ORIGIN</code>
    */
   public ORIGIN provider(String provider);

   /**
    * Returns the <code>provider</code> element
    * 
    * @return the node defined for the element <code>provider</code>
    */
   public String getProvider();

   /**
    * Removes the <code>provider</code> element
    * 
    * @return the current instance of <code>ORIGIN</code>
    */
   public ORIGIN removeProvider();

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PersistenceUnit ElementName: xsd:string ElementType : jta-data-source
   // MaxOccurs: - isGeneric: true isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>jta-data-source</code> element
    * 
    * @param jtaDataSource the value for the element <code>jta-data-source</code>
    * @return the current instance of <code>ORIGIN</code>
    */
   public ORIGIN jtaDataSource(String jtaDataSource);

   /**
    * Returns the <code>jta-data-source</code> element
    * 
    * @return the node defined for the element <code>jta-data-source</code>
    */
   public String getJtaDataSource();

   /**
    * Removes the <code>jta-data-source</code> element
    * 
    * @return the current instance of <code>ORIGIN</code>
    */
   public ORIGIN removeJtaDataSource();

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PersistenceUnit ElementName: xsd:string ElementType : non-jta-data-source
   // MaxOccurs: - isGeneric: true isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>non-jta-data-source</code> element
    * 
    * @param nonJtaDataSource the value for the element <code>non-jta-data-source</code>
    * @return the current instance of <code>ORIGIN</code>
    */
   public ORIGIN nonJtaDataSource(String nonJtaDataSource);

   /**
    * Returns the <code>non-jta-data-source</code> element
    * 
    * @return the node defined for the element <code>non-jta-data-source</code>
    */
   public String getNonJtaDataSource();

   /**
    * Removes the <code>non-jta-data-source</code> element
    * 
    * @return the current instance of <code>ORIGIN</code>
    */
   public ORIGIN removeNonJtaDataSource();

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PersistenceUnit ElementName: xsd:string ElementType : mapping-file
   // MaxOccurs: -unbounded isGeneric: true isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>mapping-file</code> elements, a new <code>mapping-file</code>
    * element
    * 
    * @param values list of <code>mapping-file</code> objects
    * @return the current instance of <code>ORIGIN</code>
    */
   public ORIGIN mappingFile(String... values);

   /**
    * Returns all <code>mapping-file</code> elements
    * 
    * @return list of <code>mapping-file</code>
    */
   public List<String> getAllMappingFile();

   /**
    * Removes the <code>mapping-file</code> element
    * 
    * @return the current instance of <code>ORIGIN</code>
    */
   public ORIGIN removeAllMappingFile();

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PersistenceUnit ElementName: xsd:string ElementType : jar-file
   // MaxOccurs: -unbounded isGeneric: true isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>jar-file</code> elements, a new <code>jar-file</code> element
    * 
    * @param values list of <code>jar-file</code> objects
    * @return the current instance of <code>ORIGIN</code>
    */
   public ORIGIN jarFile(String... values);

   /**
    * Returns all <code>jar-file</code> elements
    * 
    * @return list of <code>jar-file</code>
    */
   public List<String> getAllJarFile();

   /**
    * Removes the <code>jar-file</code> element
    * 
    * @return the current instance of <code>ORIGIN</code>
    */
   public ORIGIN removeAllJarFile();

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PersistenceUnit ElementName: xsd:string ElementType : class
   // MaxOccurs: -unbounded isGeneric: true isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>class</code> elements, a new <code>class</code> element
    * 
    * @param values list of <code>class</code> objects
    * @return the current instance of <code>ORIGIN</code>
    */
   public ORIGIN clazz(String... values);

   /**
    * Returns all <code>class</code> elements
    * 
    * @return list of <code>class</code>
    */
   public List<String> getAllClazz();

   /**
    * Removes the <code>class</code> element
    * 
    * @return the current instance of <code>ORIGIN</code>
    */
   public ORIGIN removeAllClazz();

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PersistenceUnit ElementName: xsd:boolean ElementType : exclude-unlisted-classes
   // MaxOccurs: - isGeneric: true isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>exclude-unlisted-classes</code> element
    * 
    * @param excludeUnlistedClasses the value for the element <code>exclude-unlisted-classes</code>
    * @return the current instance of <code>ORIGIN</code>
    */
   public ORIGIN excludeUnlistedClasses(Boolean excludeUnlistedClasses);

   /**
    * Returns the <code>exclude-unlisted-classes</code> element
    * 
    * @return the node defined for the element <code>exclude-unlisted-classes</code>
    */
   public Boolean isExcludeUnlistedClasses();

   /**
    * Removes the <code>exclude-unlisted-classes</code> element
    * 
    * @return the current instance of <code>ORIGIN</code>
    */
   public ORIGIN removeExcludeUnlistedClasses();

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PersistenceUnit ElementName: persistence:properties ElementType : properties
   // MaxOccurs: - isGeneric: true isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>properties</code> element with the given value will be created. Otherwise, the
    * existing <code>properties</code> element will be returned.
    * 
    * @return a new or existing instance of <code>Properties<ORIGIN></code>
    */
   public PROPERTIES getOrCreateProperties();

   /**
    * Removes the <code>properties</code> element
    * 
    * @return the current instance of <code>ORIGIN</code>
    */
   public ORIGIN removeProperties();

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PersistenceUnit ElementName: xsd:string ElementType : name
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
   
   /**
    * Sets the <code>transaction-type</code> attribute
    * 
    * @param transactionType the value for the attribute <code>transaction-type</code>
    * @return the current instance of <code>PersistenceUnit<T></code>
    */
   public ORIGIN transactionType(String transactionType);
   

}
