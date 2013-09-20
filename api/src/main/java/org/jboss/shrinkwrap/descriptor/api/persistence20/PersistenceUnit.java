package org.jboss.shrinkwrap.descriptor.api.persistence20; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> persistence-unit </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface PersistenceUnit<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PersistenceUnit ElementName: xsd:string ElementType : description
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>description</code> element
    * @param description the value for the element <code>description</code> 
    * @return the current instance of <code>PersistenceUnit<T></code> 
    */
   public PersistenceUnit<T> description(String description);

   /**
    * Returns the <code>description</code> element
    * @return the node defined for the element <code>description</code> 
    */
   public String getDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>PersistenceUnit<T></code> 
    */
   public PersistenceUnit<T> removeDescription();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PersistenceUnit ElementName: xsd:string ElementType : provider
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>provider</code> element
    * @param provider the value for the element <code>provider</code> 
    * @return the current instance of <code>PersistenceUnit<T></code> 
    */
   public PersistenceUnit<T> provider(String provider);

   /**
    * Returns the <code>provider</code> element
    * @return the node defined for the element <code>provider</code> 
    */
   public String getProvider();

   /**
    * Removes the <code>provider</code> element 
    * @return the current instance of <code>PersistenceUnit<T></code> 
    */
   public PersistenceUnit<T> removeProvider();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PersistenceUnit ElementName: xsd:string ElementType : jta-data-source
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>jta-data-source</code> element
    * @param jtaDataSource the value for the element <code>jta-data-source</code> 
    * @return the current instance of <code>PersistenceUnit<T></code> 
    */
   public PersistenceUnit<T> jtaDataSource(String jtaDataSource);

   /**
    * Returns the <code>jta-data-source</code> element
    * @return the node defined for the element <code>jta-data-source</code> 
    */
   public String getJtaDataSource();

   /**
    * Removes the <code>jta-data-source</code> element 
    * @return the current instance of <code>PersistenceUnit<T></code> 
    */
   public PersistenceUnit<T> removeJtaDataSource();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PersistenceUnit ElementName: xsd:string ElementType : non-jta-data-source
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>non-jta-data-source</code> element
    * @param nonJtaDataSource the value for the element <code>non-jta-data-source</code> 
    * @return the current instance of <code>PersistenceUnit<T></code> 
    */
   public PersistenceUnit<T> nonJtaDataSource(String nonJtaDataSource);

   /**
    * Returns the <code>non-jta-data-source</code> element
    * @return the node defined for the element <code>non-jta-data-source</code> 
    */
   public String getNonJtaDataSource();

   /**
    * Removes the <code>non-jta-data-source</code> element 
    * @return the current instance of <code>PersistenceUnit<T></code> 
    */
   public PersistenceUnit<T> removeNonJtaDataSource();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PersistenceUnit ElementName: xsd:string ElementType : mapping-file
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>mapping-file</code> elements, 
    * a new <code>mapping-file</code> element 
    * @param values list of <code>mapping-file</code> objects 
    * @return the current instance of <code>PersistenceUnit<T></code> 
    */
   public PersistenceUnit<T> mappingFile(String ... values);

   /**
    * Returns all <code>mapping-file</code> elements
    * @return list of <code>mapping-file</code> 
    */
   public List<String> getAllMappingFile();

   /**
    * Removes the <code>mapping-file</code> element 
    * @return the current instance of <code>PersistenceUnit<T></code> 
    */
   public PersistenceUnit<T> removeAllMappingFile();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PersistenceUnit ElementName: xsd:string ElementType : jar-file
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>jar-file</code> elements, 
    * a new <code>jar-file</code> element 
    * @param values list of <code>jar-file</code> objects 
    * @return the current instance of <code>PersistenceUnit<T></code> 
    */
   public PersistenceUnit<T> jarFile(String ... values);

   /**
    * Returns all <code>jar-file</code> elements
    * @return list of <code>jar-file</code> 
    */
   public List<String> getAllJarFile();

   /**
    * Removes the <code>jar-file</code> element 
    * @return the current instance of <code>PersistenceUnit<T></code> 
    */
   public PersistenceUnit<T> removeAllJarFile();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PersistenceUnit ElementName: xsd:string ElementType : class
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>class</code> elements, 
    * a new <code>class</code> element 
    * @param values list of <code>class</code> objects 
    * @return the current instance of <code>PersistenceUnit<T></code> 
    */
   public PersistenceUnit<T> clazz(String ... values);

   /**
    * Returns all <code>class</code> elements
    * @return list of <code>class</code> 
    */
   public List<String> getAllClazz();

   /**
    * Removes the <code>class</code> element 
    * @return the current instance of <code>PersistenceUnit<T></code> 
    */
   public PersistenceUnit<T> removeAllClazz();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PersistenceUnit ElementName: xsd:boolean ElementType : exclude-unlisted-classes
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>exclude-unlisted-classes</code> element
    * @param excludeUnlistedClasses the value for the element <code>exclude-unlisted-classes</code> 
    * @return the current instance of <code>PersistenceUnit<T></code> 
    */
   public PersistenceUnit<T> excludeUnlistedClasses(Boolean excludeUnlistedClasses);

   /**
    * Returns the <code>exclude-unlisted-classes</code> element
    * @return the node defined for the element <code>exclude-unlisted-classes</code> 
    */
   public Boolean isExcludeUnlistedClasses();

   /**
    * Removes the <code>exclude-unlisted-classes</code> element 
    * @return the current instance of <code>PersistenceUnit<T></code> 
    */
   public PersistenceUnit<T> removeExcludeUnlistedClasses();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PersistenceUnit ElementName: persistence:persistence-unit-caching-type ElementType : shared-cache-mode
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>shared-cache-mode</code> element
    * @param sharedCacheMode the value for the element <code>shared-cache-mode</code> 
    * @return the current instance of <code>PersistenceUnit<T></code> 
    */
   public PersistenceUnit<T> sharedCacheMode(PersistenceUnitCachingType sharedCacheMode);
   /**
    * Sets the <code>shared-cache-mode</code> element
    * @param sharedCacheMode the value for the element <code>shared-cache-mode</code> 
    * @return the current instance of <code>PersistenceUnit<T></code> 
    */
   public PersistenceUnit<T> sharedCacheMode(String sharedCacheMode);

   /**
    * Returns the <code>shared-cache-mode</code> element
    * @return the value found for the element <code>shared-cache-mode</code> 
    */
   public PersistenceUnitCachingType getSharedCacheMode();

   /**
    * Returns the <code>shared-cache-mode</code> element
    * @return the value found for the element <code>shared-cache-mode</code> 
    */
   public String  getSharedCacheModeAsString();

   /**
    * Removes the <code>shared-cache-mode</code> attribute 
    * @return the current instance of <code>PersistenceUnit<T></code> 
    */
   public PersistenceUnit<T> removeSharedCacheMode();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PersistenceUnit ElementName: persistence:persistence-unit-validation-mode-type ElementType : validation-mode
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>validation-mode</code> element
    * @param validationMode the value for the element <code>validation-mode</code> 
    * @return the current instance of <code>PersistenceUnit<T></code> 
    */
   public PersistenceUnit<T> validationMode(PersistenceUnitValidationModeType validationMode);
   /**
    * Sets the <code>validation-mode</code> element
    * @param validationMode the value for the element <code>validation-mode</code> 
    * @return the current instance of <code>PersistenceUnit<T></code> 
    */
   public PersistenceUnit<T> validationMode(String validationMode);

   /**
    * Returns the <code>validation-mode</code> element
    * @return the value found for the element <code>validation-mode</code> 
    */
   public PersistenceUnitValidationModeType getValidationMode();

   /**
    * Returns the <code>validation-mode</code> element
    * @return the value found for the element <code>validation-mode</code> 
    */
   public String  getValidationModeAsString();

   /**
    * Removes the <code>validation-mode</code> attribute 
    * @return the current instance of <code>PersistenceUnit<T></code> 
    */
   public PersistenceUnit<T> removeValidationMode();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PersistenceUnit ElementName: persistence:properties ElementType : properties
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>properties</code> element with the given value will be created.
    * Otherwise, the existing <code>properties</code> element will be returned.
    * @return  a new or existing instance of <code>Properties<PersistenceUnit<T>></code> 
    */
   public Properties<PersistenceUnit<T>> getOrCreateProperties();

   /**
    * Removes the <code>properties</code> element 
    * @return the current instance of <code>PersistenceUnit<T></code> 
    */
   public PersistenceUnit<T> removeProperties();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PersistenceUnit ElementName: xsd:string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>PersistenceUnit<T></code> 
    */
   public PersistenceUnit<T> name(String name);

   /**
    * Returns the <code>name</code> attribute
    * @return the value defined for the attribute <code>name</code> 
    */
   public String getName();

   /**
    * Removes the <code>name</code> attribute 
    * @return the current instance of <code>PersistenceUnit<T></code> 
    */
   public PersistenceUnit<T> removeName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PersistenceUnit ElementName: persistence:persistence-unit-transaction-type ElementType : transaction-type
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>transaction-type</code> attribute
    * @param transactionType the value for the attribute <code>transaction-type</code> 
    * @return the current instance of <code>PersistenceUnit<T></code> 
    */
   public PersistenceUnit<T> transactionType(PersistenceUnitTransactionType transactionType);

   /**
    * Sets the <code>transaction-type</code> attribute
    * @param transactionType the value for the attribute <code>transaction-type</code> 
    * @return the current instance of <code>PersistenceUnit<T></code> 
    */
   public PersistenceUnit<T> transactionType(String transactionType);

   /**
    * Returns the <code>transaction-type</code> attribute
    * @return the value defined for the attribute <code>transaction-type</code> 
    */
public PersistenceUnitTransactionType getTransactionType();

   /**
    * Returns the <code>transaction-type</code> attribute
    * @return the value found for the element <code>transaction-type</code> 
    */
   public String  getTransactionTypeAsString();

   /**
    * Removes the <code>transaction-type</code> attribute 
    * @return the current instance of <code>PersistenceUnit<T></code> 
    */
   public PersistenceUnit<T> removeTransactionType();
}
