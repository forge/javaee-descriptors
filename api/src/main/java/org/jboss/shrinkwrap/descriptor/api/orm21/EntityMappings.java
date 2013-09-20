package org.jboss.shrinkwrap.descriptor.api.orm21; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> entity-mappings </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface EntityMappings<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityMappings ElementName: xsd:string ElementType : description
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>description</code> element
    * @param description the value for the element <code>description</code> 
    * @return the current instance of <code>EntityMappings<T></code> 
    */
   public EntityMappings<T> description(String description);

   /**
    * Returns the <code>description</code> element
    * @return the node defined for the element <code>description</code> 
    */
   public String getDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>EntityMappings<T></code> 
    */
   public EntityMappings<T> removeDescription();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityMappings ElementName: orm:persistence-unit-metadata ElementType : persistence-unit-metadata
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>persistence-unit-metadata</code> element with the given value will be created.
    * Otherwise, the existing <code>persistence-unit-metadata</code> element will be returned.
    * @return  a new or existing instance of <code>PersistenceUnitMetadata<EntityMappings<T>></code> 
    */
   public PersistenceUnitMetadata<EntityMappings<T>> getOrCreatePersistenceUnitMetadata();

   /**
    * Removes the <code>persistence-unit-metadata</code> element 
    * @return the current instance of <code>EntityMappings<T></code> 
    */
   public EntityMappings<T> removePersistenceUnitMetadata();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityMappings ElementName: xsd:string ElementType : package
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>package</code> element
    * @param _package the value for the element <code>package</code> 
    * @return the current instance of <code>EntityMappings<T></code> 
    */
   public EntityMappings<T> _package(String _package);

   /**
    * Returns the <code>package</code> element
    * @return the node defined for the element <code>package</code> 
    */
   public String getPackage();

   /**
    * Removes the <code>package</code> element 
    * @return the current instance of <code>EntityMappings<T></code> 
    */
   public EntityMappings<T> removePackage();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityMappings ElementName: xsd:string ElementType : schema
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>schema</code> element
    * @param schema the value for the element <code>schema</code> 
    * @return the current instance of <code>EntityMappings<T></code> 
    */
   public EntityMappings<T> schema(String schema);

   /**
    * Returns the <code>schema</code> element
    * @return the node defined for the element <code>schema</code> 
    */
   public String getSchema();

   /**
    * Removes the <code>schema</code> element 
    * @return the current instance of <code>EntityMappings<T></code> 
    */
   public EntityMappings<T> removeSchema();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityMappings ElementName: xsd:string ElementType : catalog
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>catalog</code> element
    * @param catalog the value for the element <code>catalog</code> 
    * @return the current instance of <code>EntityMappings<T></code> 
    */
   public EntityMappings<T> catalog(String catalog);

   /**
    * Returns the <code>catalog</code> element
    * @return the node defined for the element <code>catalog</code> 
    */
   public String getCatalog();

   /**
    * Removes the <code>catalog</code> element 
    * @return the current instance of <code>EntityMappings<T></code> 
    */
   public EntityMappings<T> removeCatalog();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityMappings ElementName: orm:access-type ElementType : access
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>access</code> element
    * @param access the value for the element <code>access</code> 
    * @return the current instance of <code>EntityMappings<T></code> 
    */
   public EntityMappings<T> access(AccessType access);
   /**
    * Sets the <code>access</code> element
    * @param access the value for the element <code>access</code> 
    * @return the current instance of <code>EntityMappings<T></code> 
    */
   public EntityMappings<T> access(String access);

   /**
    * Returns the <code>access</code> element
    * @return the value found for the element <code>access</code> 
    */
   public AccessType getAccess();

   /**
    * Returns the <code>access</code> element
    * @return the value found for the element <code>access</code> 
    */
   public String  getAccessAsString();

   /**
    * Removes the <code>access</code> attribute 
    * @return the current instance of <code>EntityMappings<T></code> 
    */
   public EntityMappings<T> removeAccess();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityMappings ElementName: orm:sequence-generator ElementType : sequence-generator
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>sequence-generator</code> element will be created and returned.
    * Otherwise, the first existing <code>sequence-generator</code> element will be returned.
    * @return the instance defined for the element <code>sequence-generator</code> 
    */
   public SequenceGenerator<EntityMappings<T>> getOrCreateSequenceGenerator();

   /**
    * Creates a new <code>sequence-generator</code> element 
    * @return the new created instance of <code>SequenceGenerator<EntityMappings<T>></code> 
    */
   public SequenceGenerator<EntityMappings<T>> createSequenceGenerator();

   /**
    * Returns all <code>sequence-generator</code> elements
    * @return list of <code>sequence-generator</code> 
    */
   public List<SequenceGenerator<EntityMappings<T>>> getAllSequenceGenerator();

   /**
    * Removes all <code>sequence-generator</code> elements 
    * @return the current instance of <code>SequenceGenerator<EntityMappings<T>></code> 
    */
   public EntityMappings<T> removeAllSequenceGenerator();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityMappings ElementName: orm:table-generator ElementType : table-generator
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>table-generator</code> element will be created and returned.
    * Otherwise, the first existing <code>table-generator</code> element will be returned.
    * @return the instance defined for the element <code>table-generator</code> 
    */
   public TableGenerator<EntityMappings<T>> getOrCreateTableGenerator();

   /**
    * Creates a new <code>table-generator</code> element 
    * @return the new created instance of <code>TableGenerator<EntityMappings<T>></code> 
    */
   public TableGenerator<EntityMappings<T>> createTableGenerator();

   /**
    * Returns all <code>table-generator</code> elements
    * @return list of <code>table-generator</code> 
    */
   public List<TableGenerator<EntityMappings<T>>> getAllTableGenerator();

   /**
    * Removes all <code>table-generator</code> elements 
    * @return the current instance of <code>TableGenerator<EntityMappings<T>></code> 
    */
   public EntityMappings<T> removeAllTableGenerator();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityMappings ElementName: orm:named-query ElementType : named-query
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>named-query</code> element will be created and returned.
    * Otherwise, the first existing <code>named-query</code> element will be returned.
    * @return the instance defined for the element <code>named-query</code> 
    */
   public NamedQuery<EntityMappings<T>> getOrCreateNamedQuery();

   /**
    * Creates a new <code>named-query</code> element 
    * @return the new created instance of <code>NamedQuery<EntityMappings<T>></code> 
    */
   public NamedQuery<EntityMappings<T>> createNamedQuery();

   /**
    * Returns all <code>named-query</code> elements
    * @return list of <code>named-query</code> 
    */
   public List<NamedQuery<EntityMappings<T>>> getAllNamedQuery();

   /**
    * Removes all <code>named-query</code> elements 
    * @return the current instance of <code>NamedQuery<EntityMappings<T>></code> 
    */
   public EntityMappings<T> removeAllNamedQuery();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityMappings ElementName: orm:named-native-query ElementType : named-native-query
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>named-native-query</code> element will be created and returned.
    * Otherwise, the first existing <code>named-native-query</code> element will be returned.
    * @return the instance defined for the element <code>named-native-query</code> 
    */
   public NamedNativeQuery<EntityMappings<T>> getOrCreateNamedNativeQuery();

   /**
    * Creates a new <code>named-native-query</code> element 
    * @return the new created instance of <code>NamedNativeQuery<EntityMappings<T>></code> 
    */
   public NamedNativeQuery<EntityMappings<T>> createNamedNativeQuery();

   /**
    * Returns all <code>named-native-query</code> elements
    * @return list of <code>named-native-query</code> 
    */
   public List<NamedNativeQuery<EntityMappings<T>>> getAllNamedNativeQuery();

   /**
    * Removes all <code>named-native-query</code> elements 
    * @return the current instance of <code>NamedNativeQuery<EntityMappings<T>></code> 
    */
   public EntityMappings<T> removeAllNamedNativeQuery();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityMappings ElementName: orm:named-stored-procedure-query ElementType : named-stored-procedure-query
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>named-stored-procedure-query</code> element will be created and returned.
    * Otherwise, the first existing <code>named-stored-procedure-query</code> element will be returned.
    * @return the instance defined for the element <code>named-stored-procedure-query</code> 
    */
   public NamedStoredProcedureQuery<EntityMappings<T>> getOrCreateNamedStoredProcedureQuery();

   /**
    * Creates a new <code>named-stored-procedure-query</code> element 
    * @return the new created instance of <code>NamedStoredProcedureQuery<EntityMappings<T>></code> 
    */
   public NamedStoredProcedureQuery<EntityMappings<T>> createNamedStoredProcedureQuery();

   /**
    * Returns all <code>named-stored-procedure-query</code> elements
    * @return list of <code>named-stored-procedure-query</code> 
    */
   public List<NamedStoredProcedureQuery<EntityMappings<T>>> getAllNamedStoredProcedureQuery();

   /**
    * Removes all <code>named-stored-procedure-query</code> elements 
    * @return the current instance of <code>NamedStoredProcedureQuery<EntityMappings<T>></code> 
    */
   public EntityMappings<T> removeAllNamedStoredProcedureQuery();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityMappings ElementName: orm:sql-result-set-mapping ElementType : sql-result-set-mapping
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>sql-result-set-mapping</code> element will be created and returned.
    * Otherwise, the first existing <code>sql-result-set-mapping</code> element will be returned.
    * @return the instance defined for the element <code>sql-result-set-mapping</code> 
    */
   public SqlResultSetMapping<EntityMappings<T>> getOrCreateSqlResultSetMapping();

   /**
    * Creates a new <code>sql-result-set-mapping</code> element 
    * @return the new created instance of <code>SqlResultSetMapping<EntityMappings<T>></code> 
    */
   public SqlResultSetMapping<EntityMappings<T>> createSqlResultSetMapping();

   /**
    * Returns all <code>sql-result-set-mapping</code> elements
    * @return list of <code>sql-result-set-mapping</code> 
    */
   public List<SqlResultSetMapping<EntityMappings<T>>> getAllSqlResultSetMapping();

   /**
    * Removes all <code>sql-result-set-mapping</code> elements 
    * @return the current instance of <code>SqlResultSetMapping<EntityMappings<T>></code> 
    */
   public EntityMappings<T> removeAllSqlResultSetMapping();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityMappings ElementName: orm:mapped-superclass ElementType : mapped-superclass
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>mapped-superclass</code> element will be created and returned.
    * Otherwise, the first existing <code>mapped-superclass</code> element will be returned.
    * @return the instance defined for the element <code>mapped-superclass</code> 
    */
   public MappedSuperclass<EntityMappings<T>> getOrCreateMappedSuperclass();

   /**
    * Creates a new <code>mapped-superclass</code> element 
    * @return the new created instance of <code>MappedSuperclass<EntityMappings<T>></code> 
    */
   public MappedSuperclass<EntityMappings<T>> createMappedSuperclass();

   /**
    * Returns all <code>mapped-superclass</code> elements
    * @return list of <code>mapped-superclass</code> 
    */
   public List<MappedSuperclass<EntityMappings<T>>> getAllMappedSuperclass();

   /**
    * Removes all <code>mapped-superclass</code> elements 
    * @return the current instance of <code>MappedSuperclass<EntityMappings<T>></code> 
    */
   public EntityMappings<T> removeAllMappedSuperclass();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityMappings ElementName: orm:entity ElementType : entity
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>entity</code> element will be created and returned.
    * Otherwise, the first existing <code>entity</code> element will be returned.
    * @return the instance defined for the element <code>entity</code> 
    */
   public Entity<EntityMappings<T>> getOrCreateEntity();

   /**
    * Creates a new <code>entity</code> element 
    * @return the new created instance of <code>Entity<EntityMappings<T>></code> 
    */
   public Entity<EntityMappings<T>> createEntity();

   /**
    * Returns all <code>entity</code> elements
    * @return list of <code>entity</code> 
    */
   public List<Entity<EntityMappings<T>>> getAllEntity();

   /**
    * Removes all <code>entity</code> elements 
    * @return the current instance of <code>Entity<EntityMappings<T>></code> 
    */
   public EntityMappings<T> removeAllEntity();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityMappings ElementName: orm:embeddable ElementType : embeddable
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>embeddable</code> element will be created and returned.
    * Otherwise, the first existing <code>embeddable</code> element will be returned.
    * @return the instance defined for the element <code>embeddable</code> 
    */
   public Embeddable<EntityMappings<T>> getOrCreateEmbeddable();

   /**
    * Creates a new <code>embeddable</code> element 
    * @return the new created instance of <code>Embeddable<EntityMappings<T>></code> 
    */
   public Embeddable<EntityMappings<T>> createEmbeddable();

   /**
    * Returns all <code>embeddable</code> elements
    * @return list of <code>embeddable</code> 
    */
   public List<Embeddable<EntityMappings<T>>> getAllEmbeddable();

   /**
    * Removes all <code>embeddable</code> elements 
    * @return the current instance of <code>Embeddable<EntityMappings<T>></code> 
    */
   public EntityMappings<T> removeAllEmbeddable();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityMappings ElementName: orm:converter ElementType : converter
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>converter</code> element will be created and returned.
    * Otherwise, the first existing <code>converter</code> element will be returned.
    * @return the instance defined for the element <code>converter</code> 
    */
   public Converter<EntityMappings<T>> getOrCreateConverter();

   /**
    * Creates a new <code>converter</code> element 
    * @return the new created instance of <code>Converter<EntityMappings<T>></code> 
    */
   public Converter<EntityMappings<T>> createConverter();

   /**
    * Returns all <code>converter</code> elements
    * @return list of <code>converter</code> 
    */
   public List<Converter<EntityMappings<T>>> getAllConverter();

   /**
    * Removes all <code>converter</code> elements 
    * @return the current instance of <code>Converter<EntityMappings<T>></code> 
    */
   public EntityMappings<T> removeAllConverter();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityMappings ElementName: xsd:token ElementType : version
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   public static final String VERSION = "2.1";

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of <code>EntityMappings<T></code> 
    */
   public EntityMappings<T> version(String version);

   /**
    * Returns the <code>version</code> attribute
    * @return the value defined for the attribute <code>version</code> 
    */
   public String getVersion();

   /**
    * Removes the <code>version</code> attribute 
    * @return the current instance of <code>EntityMappings<T></code> 
    */
   public EntityMappings<T> removeVersion();
}
