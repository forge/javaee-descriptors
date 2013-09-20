package org.jboss.shrinkwrap.descriptor.api.orm21; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Descriptor;
import org.jboss.shrinkwrap.descriptor.api.DescriptorNamespace;

/** 
 * <p> 
 * This deployment descriptor provides the functionalities as described in the  specification
 * <p> 
 * Example:
 * <p> 
 * <code> 
 *     OrmDescriptor descriptor = Descriptors.create(OrmDescriptor.class);
 * </code> 
 *
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface OrmDescriptor extends Descriptor, DescriptorNamespace<OrmDescriptor>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OrmDescriptor ElementName: xsd:string ElementType : description
   // MaxOccurs: -  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>description</code> element
    * @param description the value for the element <code>description</code> 
    * @return the current instance of <code>OrmDescriptor</code> 
    */
   public OrmDescriptor description(String description);

   /**
    * Returns the <code>description</code> element
    * @return the node defined for the element <code>description</code> 
    */
   public String getDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>OrmDescriptor</code> 
    */
   public OrmDescriptor removeDescription();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OrmDescriptor ElementName: orm:persistence-unit-metadata ElementType : persistence-unit-metadata
   // MaxOccurs: -  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>persistence-unit-metadata</code> element with the given value will be created.
    * Otherwise, the existing <code>persistence-unit-metadata</code> element will be returned.
    * @return  a new or existing instance of <code>PersistenceUnitMetadata<OrmDescriptor></code> 
    */
   public PersistenceUnitMetadata<OrmDescriptor> getOrCreatePersistenceUnitMetadata();

   /**
    * Removes the <code>persistence-unit-metadata</code> element 
    * @return the current instance of <code>OrmDescriptor</code> 
    */
   public OrmDescriptor removePersistenceUnitMetadata();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OrmDescriptor ElementName: xsd:string ElementType : package
   // MaxOccurs: -  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>package</code> element
    * @param _package the value for the element <code>package</code> 
    * @return the current instance of <code>OrmDescriptor</code> 
    */
   public OrmDescriptor _package(String _package);

   /**
    * Returns the <code>package</code> element
    * @return the node defined for the element <code>package</code> 
    */
   public String getPackage();

   /**
    * Removes the <code>package</code> element 
    * @return the current instance of <code>OrmDescriptor</code> 
    */
   public OrmDescriptor removePackage();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OrmDescriptor ElementName: xsd:string ElementType : schema
   // MaxOccurs: -  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>schema</code> element
    * @param schema the value for the element <code>schema</code> 
    * @return the current instance of <code>OrmDescriptor</code> 
    */
   public OrmDescriptor schema(String schema);

   /**
    * Returns the <code>schema</code> element
    * @return the node defined for the element <code>schema</code> 
    */
   public String getSchema();

   /**
    * Removes the <code>schema</code> element 
    * @return the current instance of <code>OrmDescriptor</code> 
    */
   public OrmDescriptor removeSchema();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OrmDescriptor ElementName: xsd:string ElementType : catalog
   // MaxOccurs: -  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>catalog</code> element
    * @param catalog the value for the element <code>catalog</code> 
    * @return the current instance of <code>OrmDescriptor</code> 
    */
   public OrmDescriptor catalog(String catalog);

   /**
    * Returns the <code>catalog</code> element
    * @return the node defined for the element <code>catalog</code> 
    */
   public String getCatalog();

   /**
    * Removes the <code>catalog</code> element 
    * @return the current instance of <code>OrmDescriptor</code> 
    */
   public OrmDescriptor removeCatalog();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OrmDescriptor ElementName: orm:access-type ElementType : access
   // MaxOccurs: -  isGeneric: false   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>access</code> element
    * @param access the value for the element <code>access</code> 
    * @return the current instance of <code>OrmDescriptor</code> 
    */
   public OrmDescriptor access(AccessType access);
   /**
    * Sets the <code>access</code> element
    * @param access the value for the element <code>access</code> 
    * @return the current instance of <code>OrmDescriptor</code> 
    */
   public OrmDescriptor access(String access);

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
    * @return the current instance of <code>OrmDescriptor</code> 
    */
   public OrmDescriptor removeAccess();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OrmDescriptor ElementName: orm:sequence-generator ElementType : sequence-generator
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>sequence-generator</code> element will be created and returned.
    * Otherwise, the first existing <code>sequence-generator</code> element will be returned.
    * @return the instance defined for the element <code>sequence-generator</code> 
    */
   public SequenceGenerator<OrmDescriptor> getOrCreateSequenceGenerator();

   /**
    * Creates a new <code>sequence-generator</code> element 
    * @return the new created instance of <code>SequenceGenerator<OrmDescriptor></code> 
    */
   public SequenceGenerator<OrmDescriptor> createSequenceGenerator();

   /**
    * Returns all <code>sequence-generator</code> elements
    * @return list of <code>sequence-generator</code> 
    */
   public List<SequenceGenerator<OrmDescriptor>> getAllSequenceGenerator();

   /**
    * Removes all <code>sequence-generator</code> elements 
    * @return the current instance of <code>SequenceGenerator<OrmDescriptor></code> 
    */
   public OrmDescriptor removeAllSequenceGenerator();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OrmDescriptor ElementName: orm:table-generator ElementType : table-generator
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>table-generator</code> element will be created and returned.
    * Otherwise, the first existing <code>table-generator</code> element will be returned.
    * @return the instance defined for the element <code>table-generator</code> 
    */
   public TableGenerator<OrmDescriptor> getOrCreateTableGenerator();

   /**
    * Creates a new <code>table-generator</code> element 
    * @return the new created instance of <code>TableGenerator<OrmDescriptor></code> 
    */
   public TableGenerator<OrmDescriptor> createTableGenerator();

   /**
    * Returns all <code>table-generator</code> elements
    * @return list of <code>table-generator</code> 
    */
   public List<TableGenerator<OrmDescriptor>> getAllTableGenerator();

   /**
    * Removes all <code>table-generator</code> elements 
    * @return the current instance of <code>TableGenerator<OrmDescriptor></code> 
    */
   public OrmDescriptor removeAllTableGenerator();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OrmDescriptor ElementName: orm:named-query ElementType : named-query
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>named-query</code> element will be created and returned.
    * Otherwise, the first existing <code>named-query</code> element will be returned.
    * @return the instance defined for the element <code>named-query</code> 
    */
   public NamedQuery<OrmDescriptor> getOrCreateNamedQuery();

   /**
    * Creates a new <code>named-query</code> element 
    * @return the new created instance of <code>NamedQuery<OrmDescriptor></code> 
    */
   public NamedQuery<OrmDescriptor> createNamedQuery();

   /**
    * Returns all <code>named-query</code> elements
    * @return list of <code>named-query</code> 
    */
   public List<NamedQuery<OrmDescriptor>> getAllNamedQuery();

   /**
    * Removes all <code>named-query</code> elements 
    * @return the current instance of <code>NamedQuery<OrmDescriptor></code> 
    */
   public OrmDescriptor removeAllNamedQuery();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OrmDescriptor ElementName: orm:named-native-query ElementType : named-native-query
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>named-native-query</code> element will be created and returned.
    * Otherwise, the first existing <code>named-native-query</code> element will be returned.
    * @return the instance defined for the element <code>named-native-query</code> 
    */
   public NamedNativeQuery<OrmDescriptor> getOrCreateNamedNativeQuery();

   /**
    * Creates a new <code>named-native-query</code> element 
    * @return the new created instance of <code>NamedNativeQuery<OrmDescriptor></code> 
    */
   public NamedNativeQuery<OrmDescriptor> createNamedNativeQuery();

   /**
    * Returns all <code>named-native-query</code> elements
    * @return list of <code>named-native-query</code> 
    */
   public List<NamedNativeQuery<OrmDescriptor>> getAllNamedNativeQuery();

   /**
    * Removes all <code>named-native-query</code> elements 
    * @return the current instance of <code>NamedNativeQuery<OrmDescriptor></code> 
    */
   public OrmDescriptor removeAllNamedNativeQuery();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OrmDescriptor ElementName: orm:named-stored-procedure-query ElementType : named-stored-procedure-query
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>named-stored-procedure-query</code> element will be created and returned.
    * Otherwise, the first existing <code>named-stored-procedure-query</code> element will be returned.
    * @return the instance defined for the element <code>named-stored-procedure-query</code> 
    */
   public NamedStoredProcedureQuery<OrmDescriptor> getOrCreateNamedStoredProcedureQuery();

   /**
    * Creates a new <code>named-stored-procedure-query</code> element 
    * @return the new created instance of <code>NamedStoredProcedureQuery<OrmDescriptor></code> 
    */
   public NamedStoredProcedureQuery<OrmDescriptor> createNamedStoredProcedureQuery();

   /**
    * Returns all <code>named-stored-procedure-query</code> elements
    * @return list of <code>named-stored-procedure-query</code> 
    */
   public List<NamedStoredProcedureQuery<OrmDescriptor>> getAllNamedStoredProcedureQuery();

   /**
    * Removes all <code>named-stored-procedure-query</code> elements 
    * @return the current instance of <code>NamedStoredProcedureQuery<OrmDescriptor></code> 
    */
   public OrmDescriptor removeAllNamedStoredProcedureQuery();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OrmDescriptor ElementName: orm:sql-result-set-mapping ElementType : sql-result-set-mapping
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>sql-result-set-mapping</code> element will be created and returned.
    * Otherwise, the first existing <code>sql-result-set-mapping</code> element will be returned.
    * @return the instance defined for the element <code>sql-result-set-mapping</code> 
    */
   public SqlResultSetMapping<OrmDescriptor> getOrCreateSqlResultSetMapping();

   /**
    * Creates a new <code>sql-result-set-mapping</code> element 
    * @return the new created instance of <code>SqlResultSetMapping<OrmDescriptor></code> 
    */
   public SqlResultSetMapping<OrmDescriptor> createSqlResultSetMapping();

   /**
    * Returns all <code>sql-result-set-mapping</code> elements
    * @return list of <code>sql-result-set-mapping</code> 
    */
   public List<SqlResultSetMapping<OrmDescriptor>> getAllSqlResultSetMapping();

   /**
    * Removes all <code>sql-result-set-mapping</code> elements 
    * @return the current instance of <code>SqlResultSetMapping<OrmDescriptor></code> 
    */
   public OrmDescriptor removeAllSqlResultSetMapping();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OrmDescriptor ElementName: orm:mapped-superclass ElementType : mapped-superclass
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>mapped-superclass</code> element will be created and returned.
    * Otherwise, the first existing <code>mapped-superclass</code> element will be returned.
    * @return the instance defined for the element <code>mapped-superclass</code> 
    */
   public MappedSuperclass<OrmDescriptor> getOrCreateMappedSuperclass();

   /**
    * Creates a new <code>mapped-superclass</code> element 
    * @return the new created instance of <code>MappedSuperclass<OrmDescriptor></code> 
    */
   public MappedSuperclass<OrmDescriptor> createMappedSuperclass();

   /**
    * Returns all <code>mapped-superclass</code> elements
    * @return list of <code>mapped-superclass</code> 
    */
   public List<MappedSuperclass<OrmDescriptor>> getAllMappedSuperclass();

   /**
    * Removes all <code>mapped-superclass</code> elements 
    * @return the current instance of <code>MappedSuperclass<OrmDescriptor></code> 
    */
   public OrmDescriptor removeAllMappedSuperclass();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OrmDescriptor ElementName: orm:entity ElementType : entity
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>entity</code> element will be created and returned.
    * Otherwise, the first existing <code>entity</code> element will be returned.
    * @return the instance defined for the element <code>entity</code> 
    */
   public Entity<OrmDescriptor> getOrCreateEntity();

   /**
    * Creates a new <code>entity</code> element 
    * @return the new created instance of <code>Entity<OrmDescriptor></code> 
    */
   public Entity<OrmDescriptor> createEntity();

   /**
    * Returns all <code>entity</code> elements
    * @return list of <code>entity</code> 
    */
   public List<Entity<OrmDescriptor>> getAllEntity();

   /**
    * Removes all <code>entity</code> elements 
    * @return the current instance of <code>Entity<OrmDescriptor></code> 
    */
   public OrmDescriptor removeAllEntity();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OrmDescriptor ElementName: orm:embeddable ElementType : embeddable
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>embeddable</code> element will be created and returned.
    * Otherwise, the first existing <code>embeddable</code> element will be returned.
    * @return the instance defined for the element <code>embeddable</code> 
    */
   public Embeddable<OrmDescriptor> getOrCreateEmbeddable();

   /**
    * Creates a new <code>embeddable</code> element 
    * @return the new created instance of <code>Embeddable<OrmDescriptor></code> 
    */
   public Embeddable<OrmDescriptor> createEmbeddable();

   /**
    * Returns all <code>embeddable</code> elements
    * @return list of <code>embeddable</code> 
    */
   public List<Embeddable<OrmDescriptor>> getAllEmbeddable();

   /**
    * Removes all <code>embeddable</code> elements 
    * @return the current instance of <code>Embeddable<OrmDescriptor></code> 
    */
   public OrmDescriptor removeAllEmbeddable();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OrmDescriptor ElementName: orm:converter ElementType : converter
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>converter</code> element will be created and returned.
    * Otherwise, the first existing <code>converter</code> element will be returned.
    * @return the instance defined for the element <code>converter</code> 
    */
   public Converter<OrmDescriptor> getOrCreateConverter();

   /**
    * Creates a new <code>converter</code> element 
    * @return the new created instance of <code>Converter<OrmDescriptor></code> 
    */
   public Converter<OrmDescriptor> createConverter();

   /**
    * Returns all <code>converter</code> elements
    * @return list of <code>converter</code> 
    */
   public List<Converter<OrmDescriptor>> getAllConverter();

   /**
    * Removes all <code>converter</code> elements 
    * @return the current instance of <code>Converter<OrmDescriptor></code> 
    */
   public OrmDescriptor removeAllConverter();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OrmDescriptor ElementName: xsd:token ElementType : version
   // MaxOccurs: -  isGeneric: false   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   public static final String VERSION = "2.1";

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of <code>OrmDescriptor</code> 
    */
   public OrmDescriptor version(String version);

   /**
    * Returns the <code>version</code> attribute
    * @return the value defined for the attribute <code>version</code> 
    */
   public String getVersion();

   /**
    * Removes the <code>version</code> attribute 
    * @return the current instance of <code>OrmDescriptor</code> 
    */
   public OrmDescriptor removeVersion();
}
