package org.jboss.shrinkwrap.descriptor.api.orm21; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> entity </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface Entity<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Entity ElementName: xsd:string ElementType : description
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>description</code> element
    * @param description the value for the element <code>description</code> 
    * @return the current instance of <code>Entity<T></code> 
    */
   public Entity<T> description(String description);

   /**
    * Returns the <code>description</code> element
    * @return the node defined for the element <code>description</code> 
    */
   public String getDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>Entity<T></code> 
    */
   public Entity<T> removeDescription();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Entity ElementName: orm:table ElementType : table
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>table</code> element with the given value will be created.
    * Otherwise, the existing <code>table</code> element will be returned.
    * @return  a new or existing instance of <code>Table<Entity<T>></code> 
    */
   public Table<Entity<T>> getOrCreateTable();

   /**
    * Removes the <code>table</code> element 
    * @return the current instance of <code>Entity<T></code> 
    */
   public Entity<T> removeTable();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Entity ElementName: orm:secondary-table ElementType : secondary-table
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>secondary-table</code> element will be created and returned.
    * Otherwise, the first existing <code>secondary-table</code> element will be returned.
    * @return the instance defined for the element <code>secondary-table</code> 
    */
   public SecondaryTable<Entity<T>> getOrCreateSecondaryTable();

   /**
    * Creates a new <code>secondary-table</code> element 
    * @return the new created instance of <code>SecondaryTable<Entity<T>></code> 
    */
   public SecondaryTable<Entity<T>> createSecondaryTable();

   /**
    * Returns all <code>secondary-table</code> elements
    * @return list of <code>secondary-table</code> 
    */
   public List<SecondaryTable<Entity<T>>> getAllSecondaryTable();

   /**
    * Removes all <code>secondary-table</code> elements 
    * @return the current instance of <code>SecondaryTable<Entity<T>></code> 
    */
   public Entity<T> removeAllSecondaryTable();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Entity ElementName: orm:primary-key-join-column ElementType : primary-key-join-column
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>primary-key-join-column</code> element will be created and returned.
    * Otherwise, the first existing <code>primary-key-join-column</code> element will be returned.
    * @return the instance defined for the element <code>primary-key-join-column</code> 
    */
   public PrimaryKeyJoinColumn<Entity<T>> getOrCreatePrimaryKeyJoinColumn();

   /**
    * Creates a new <code>primary-key-join-column</code> element 
    * @return the new created instance of <code>PrimaryKeyJoinColumn<Entity<T>></code> 
    */
   public PrimaryKeyJoinColumn<Entity<T>> createPrimaryKeyJoinColumn();

   /**
    * Returns all <code>primary-key-join-column</code> elements
    * @return list of <code>primary-key-join-column</code> 
    */
   public List<PrimaryKeyJoinColumn<Entity<T>>> getAllPrimaryKeyJoinColumn();

   /**
    * Removes all <code>primary-key-join-column</code> elements 
    * @return the current instance of <code>PrimaryKeyJoinColumn<Entity<T>></code> 
    */
   public Entity<T> removeAllPrimaryKeyJoinColumn();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Entity ElementName: orm:foreign-key ElementType : primary-key-foreign-key
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>primary-key-foreign-key</code> element with the given value will be created.
    * Otherwise, the existing <code>primary-key-foreign-key</code> element will be returned.
    * @return  a new or existing instance of <code>ForeignKey<Entity<T>></code> 
    */
   public ForeignKey<Entity<T>> getOrCreatePrimaryKeyForeignKey();

   /**
    * Removes the <code>primary-key-foreign-key</code> element 
    * @return the current instance of <code>Entity<T></code> 
    */
   public Entity<T> removePrimaryKeyForeignKey();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Entity ElementName: orm:id-class ElementType : id-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>id-class</code> element with the given value will be created.
    * Otherwise, the existing <code>id-class</code> element will be returned.
    * @return  a new or existing instance of <code>IdClass<Entity<T>></code> 
    */
   public IdClass<Entity<T>> getOrCreateIdClass();

   /**
    * Removes the <code>id-class</code> element 
    * @return the current instance of <code>Entity<T></code> 
    */
   public Entity<T> removeIdClass();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Entity ElementName: orm:inheritance ElementType : inheritance
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>inheritance</code> element with the given value will be created.
    * Otherwise, the existing <code>inheritance</code> element will be returned.
    * @return  a new or existing instance of <code>Inheritance<Entity<T>></code> 
    */
   public Inheritance<Entity<T>> getOrCreateInheritance();

   /**
    * Removes the <code>inheritance</code> element 
    * @return the current instance of <code>Entity<T></code> 
    */
   public Entity<T> removeInheritance();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Entity ElementName: xsd:string ElementType : discriminator-value
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>discriminator-value</code> element
    * @param discriminatorValue the value for the element <code>discriminator-value</code> 
    * @return the current instance of <code>Entity<T></code> 
    */
   public Entity<T> discriminatorValue(String discriminatorValue);

   /**
    * Returns the <code>discriminator-value</code> element
    * @return the node defined for the element <code>discriminator-value</code> 
    */
   public String getDiscriminatorValue();

   /**
    * Removes the <code>discriminator-value</code> element 
    * @return the current instance of <code>Entity<T></code> 
    */
   public Entity<T> removeDiscriminatorValue();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Entity ElementName: orm:discriminator-column ElementType : discriminator-column
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>discriminator-column</code> element with the given value will be created.
    * Otherwise, the existing <code>discriminator-column</code> element will be returned.
    * @return  a new or existing instance of <code>DiscriminatorColumn<Entity<T>></code> 
    */
   public DiscriminatorColumn<Entity<T>> getOrCreateDiscriminatorColumn();

   /**
    * Removes the <code>discriminator-column</code> element 
    * @return the current instance of <code>Entity<T></code> 
    */
   public Entity<T> removeDiscriminatorColumn();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Entity ElementName: orm:sequence-generator ElementType : sequence-generator
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>sequence-generator</code> element with the given value will be created.
    * Otherwise, the existing <code>sequence-generator</code> element will be returned.
    * @return  a new or existing instance of <code>SequenceGenerator<Entity<T>></code> 
    */
   public SequenceGenerator<Entity<T>> getOrCreateSequenceGenerator();

   /**
    * Removes the <code>sequence-generator</code> element 
    * @return the current instance of <code>Entity<T></code> 
    */
   public Entity<T> removeSequenceGenerator();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Entity ElementName: orm:table-generator ElementType : table-generator
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>table-generator</code> element with the given value will be created.
    * Otherwise, the existing <code>table-generator</code> element will be returned.
    * @return  a new or existing instance of <code>TableGenerator<Entity<T>></code> 
    */
   public TableGenerator<Entity<T>> getOrCreateTableGenerator();

   /**
    * Removes the <code>table-generator</code> element 
    * @return the current instance of <code>Entity<T></code> 
    */
   public Entity<T> removeTableGenerator();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Entity ElementName: orm:named-query ElementType : named-query
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>named-query</code> element will be created and returned.
    * Otherwise, the first existing <code>named-query</code> element will be returned.
    * @return the instance defined for the element <code>named-query</code> 
    */
   public NamedQuery<Entity<T>> getOrCreateNamedQuery();

   /**
    * Creates a new <code>named-query</code> element 
    * @return the new created instance of <code>NamedQuery<Entity<T>></code> 
    */
   public NamedQuery<Entity<T>> createNamedQuery();

   /**
    * Returns all <code>named-query</code> elements
    * @return list of <code>named-query</code> 
    */
   public List<NamedQuery<Entity<T>>> getAllNamedQuery();

   /**
    * Removes all <code>named-query</code> elements 
    * @return the current instance of <code>NamedQuery<Entity<T>></code> 
    */
   public Entity<T> removeAllNamedQuery();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Entity ElementName: orm:named-native-query ElementType : named-native-query
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>named-native-query</code> element will be created and returned.
    * Otherwise, the first existing <code>named-native-query</code> element will be returned.
    * @return the instance defined for the element <code>named-native-query</code> 
    */
   public NamedNativeQuery<Entity<T>> getOrCreateNamedNativeQuery();

   /**
    * Creates a new <code>named-native-query</code> element 
    * @return the new created instance of <code>NamedNativeQuery<Entity<T>></code> 
    */
   public NamedNativeQuery<Entity<T>> createNamedNativeQuery();

   /**
    * Returns all <code>named-native-query</code> elements
    * @return list of <code>named-native-query</code> 
    */
   public List<NamedNativeQuery<Entity<T>>> getAllNamedNativeQuery();

   /**
    * Removes all <code>named-native-query</code> elements 
    * @return the current instance of <code>NamedNativeQuery<Entity<T>></code> 
    */
   public Entity<T> removeAllNamedNativeQuery();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Entity ElementName: orm:named-stored-procedure-query ElementType : named-stored-procedure-query
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>named-stored-procedure-query</code> element will be created and returned.
    * Otherwise, the first existing <code>named-stored-procedure-query</code> element will be returned.
    * @return the instance defined for the element <code>named-stored-procedure-query</code> 
    */
   public NamedStoredProcedureQuery<Entity<T>> getOrCreateNamedStoredProcedureQuery();

   /**
    * Creates a new <code>named-stored-procedure-query</code> element 
    * @return the new created instance of <code>NamedStoredProcedureQuery<Entity<T>></code> 
    */
   public NamedStoredProcedureQuery<Entity<T>> createNamedStoredProcedureQuery();

   /**
    * Returns all <code>named-stored-procedure-query</code> elements
    * @return list of <code>named-stored-procedure-query</code> 
    */
   public List<NamedStoredProcedureQuery<Entity<T>>> getAllNamedStoredProcedureQuery();

   /**
    * Removes all <code>named-stored-procedure-query</code> elements 
    * @return the current instance of <code>NamedStoredProcedureQuery<Entity<T>></code> 
    */
   public Entity<T> removeAllNamedStoredProcedureQuery();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Entity ElementName: orm:sql-result-set-mapping ElementType : sql-result-set-mapping
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>sql-result-set-mapping</code> element will be created and returned.
    * Otherwise, the first existing <code>sql-result-set-mapping</code> element will be returned.
    * @return the instance defined for the element <code>sql-result-set-mapping</code> 
    */
   public SqlResultSetMapping<Entity<T>> getOrCreateSqlResultSetMapping();

   /**
    * Creates a new <code>sql-result-set-mapping</code> element 
    * @return the new created instance of <code>SqlResultSetMapping<Entity<T>></code> 
    */
   public SqlResultSetMapping<Entity<T>> createSqlResultSetMapping();

   /**
    * Returns all <code>sql-result-set-mapping</code> elements
    * @return list of <code>sql-result-set-mapping</code> 
    */
   public List<SqlResultSetMapping<Entity<T>>> getAllSqlResultSetMapping();

   /**
    * Removes all <code>sql-result-set-mapping</code> elements 
    * @return the current instance of <code>SqlResultSetMapping<Entity<T>></code> 
    */
   public Entity<T> removeAllSqlResultSetMapping();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Entity ElementName: javaee:emptyType ElementType : exclude-default-listeners
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>exclude-default-listeners</code> element 
    * @return the current instance of <code>Entity<T></code> 
    */
   public Entity<T> excludeDefaultListeners();

   /**
    * Removes the <code>exclude-default-listeners</code> element 
    * @return the current instance of <code>Entity<T></code> 
    */
   public Boolean isExcludeDefaultListeners();

   /**
    * Removes the <code>exclude-default-listeners</code> element 
    * @return the current instance of <code>Entity<T></code> 
    */
   public Entity<T> removeExcludeDefaultListeners();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Entity ElementName: javaee:emptyType ElementType : exclude-superclass-listeners
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>exclude-superclass-listeners</code> element 
    * @return the current instance of <code>Entity<T></code> 
    */
   public Entity<T> excludeSuperclassListeners();

   /**
    * Removes the <code>exclude-superclass-listeners</code> element 
    * @return the current instance of <code>Entity<T></code> 
    */
   public Boolean isExcludeSuperclassListeners();

   /**
    * Removes the <code>exclude-superclass-listeners</code> element 
    * @return the current instance of <code>Entity<T></code> 
    */
   public Entity<T> removeExcludeSuperclassListeners();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Entity ElementName: orm:entity-listeners ElementType : entity-listeners
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>entity-listeners</code> element with the given value will be created.
    * Otherwise, the existing <code>entity-listeners</code> element will be returned.
    * @return  a new or existing instance of <code>EntityListeners<Entity<T>></code> 
    */
   public EntityListeners<Entity<T>> getOrCreateEntityListeners();

   /**
    * Removes the <code>entity-listeners</code> element 
    * @return the current instance of <code>Entity<T></code> 
    */
   public Entity<T> removeEntityListeners();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Entity ElementName: orm:pre-persist ElementType : pre-persist
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>pre-persist</code> element with the given value will be created.
    * Otherwise, the existing <code>pre-persist</code> element will be returned.
    * @return  a new or existing instance of <code>PrePersist<Entity<T>></code> 
    */
   public PrePersist<Entity<T>> getOrCreatePrePersist();

   /**
    * Removes the <code>pre-persist</code> element 
    * @return the current instance of <code>Entity<T></code> 
    */
   public Entity<T> removePrePersist();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Entity ElementName: orm:post-persist ElementType : post-persist
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>post-persist</code> element with the given value will be created.
    * Otherwise, the existing <code>post-persist</code> element will be returned.
    * @return  a new or existing instance of <code>PostPersist<Entity<T>></code> 
    */
   public PostPersist<Entity<T>> getOrCreatePostPersist();

   /**
    * Removes the <code>post-persist</code> element 
    * @return the current instance of <code>Entity<T></code> 
    */
   public Entity<T> removePostPersist();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Entity ElementName: orm:pre-remove ElementType : pre-remove
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>pre-remove</code> element with the given value will be created.
    * Otherwise, the existing <code>pre-remove</code> element will be returned.
    * @return  a new or existing instance of <code>PreRemove<Entity<T>></code> 
    */
   public PreRemove<Entity<T>> getOrCreatePreRemove();

   /**
    * Removes the <code>pre-remove</code> element 
    * @return the current instance of <code>Entity<T></code> 
    */
   public Entity<T> removePreRemove();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Entity ElementName: orm:post-remove ElementType : post-remove
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>post-remove</code> element with the given value will be created.
    * Otherwise, the existing <code>post-remove</code> element will be returned.
    * @return  a new or existing instance of <code>PostRemove<Entity<T>></code> 
    */
   public PostRemove<Entity<T>> getOrCreatePostRemove();

   /**
    * Removes the <code>post-remove</code> element 
    * @return the current instance of <code>Entity<T></code> 
    */
   public Entity<T> removePostRemove();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Entity ElementName: orm:pre-update ElementType : pre-update
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>pre-update</code> element with the given value will be created.
    * Otherwise, the existing <code>pre-update</code> element will be returned.
    * @return  a new or existing instance of <code>PreUpdate<Entity<T>></code> 
    */
   public PreUpdate<Entity<T>> getOrCreatePreUpdate();

   /**
    * Removes the <code>pre-update</code> element 
    * @return the current instance of <code>Entity<T></code> 
    */
   public Entity<T> removePreUpdate();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Entity ElementName: orm:post-update ElementType : post-update
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>post-update</code> element with the given value will be created.
    * Otherwise, the existing <code>post-update</code> element will be returned.
    * @return  a new or existing instance of <code>PostUpdate<Entity<T>></code> 
    */
   public PostUpdate<Entity<T>> getOrCreatePostUpdate();

   /**
    * Removes the <code>post-update</code> element 
    * @return the current instance of <code>Entity<T></code> 
    */
   public Entity<T> removePostUpdate();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Entity ElementName: orm:post-load ElementType : post-load
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>post-load</code> element with the given value will be created.
    * Otherwise, the existing <code>post-load</code> element will be returned.
    * @return  a new or existing instance of <code>PostLoad<Entity<T>></code> 
    */
   public PostLoad<Entity<T>> getOrCreatePostLoad();

   /**
    * Removes the <code>post-load</code> element 
    * @return the current instance of <code>Entity<T></code> 
    */
   public Entity<T> removePostLoad();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Entity ElementName: orm:attribute-override ElementType : attribute-override
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>attribute-override</code> element will be created and returned.
    * Otherwise, the first existing <code>attribute-override</code> element will be returned.
    * @return the instance defined for the element <code>attribute-override</code> 
    */
   public AttributeOverride<Entity<T>> getOrCreateAttributeOverride();

   /**
    * Creates a new <code>attribute-override</code> element 
    * @return the new created instance of <code>AttributeOverride<Entity<T>></code> 
    */
   public AttributeOverride<Entity<T>> createAttributeOverride();

   /**
    * Returns all <code>attribute-override</code> elements
    * @return list of <code>attribute-override</code> 
    */
   public List<AttributeOverride<Entity<T>>> getAllAttributeOverride();

   /**
    * Removes all <code>attribute-override</code> elements 
    * @return the current instance of <code>AttributeOverride<Entity<T>></code> 
    */
   public Entity<T> removeAllAttributeOverride();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Entity ElementName: orm:association-override ElementType : association-override
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>association-override</code> element will be created and returned.
    * Otherwise, the first existing <code>association-override</code> element will be returned.
    * @return the instance defined for the element <code>association-override</code> 
    */
   public AssociationOverride<Entity<T>> getOrCreateAssociationOverride();

   /**
    * Creates a new <code>association-override</code> element 
    * @return the new created instance of <code>AssociationOverride<Entity<T>></code> 
    */
   public AssociationOverride<Entity<T>> createAssociationOverride();

   /**
    * Returns all <code>association-override</code> elements
    * @return list of <code>association-override</code> 
    */
   public List<AssociationOverride<Entity<T>>> getAllAssociationOverride();

   /**
    * Removes all <code>association-override</code> elements 
    * @return the current instance of <code>AssociationOverride<Entity<T>></code> 
    */
   public Entity<T> removeAllAssociationOverride();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Entity ElementName: orm:convert ElementType : convert
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>convert</code> element will be created and returned.
    * Otherwise, the first existing <code>convert</code> element will be returned.
    * @return the instance defined for the element <code>convert</code> 
    */
   public Convert<Entity<T>> getOrCreateConvert();

   /**
    * Creates a new <code>convert</code> element 
    * @return the new created instance of <code>Convert<Entity<T>></code> 
    */
   public Convert<Entity<T>> createConvert();

   /**
    * Returns all <code>convert</code> elements
    * @return list of <code>convert</code> 
    */
   public List<Convert<Entity<T>>> getAllConvert();

   /**
    * Removes all <code>convert</code> elements 
    * @return the current instance of <code>Convert<Entity<T>></code> 
    */
   public Entity<T> removeAllConvert();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Entity ElementName: orm:named-entity-graph ElementType : named-entity-graph
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>named-entity-graph</code> element will be created and returned.
    * Otherwise, the first existing <code>named-entity-graph</code> element will be returned.
    * @return the instance defined for the element <code>named-entity-graph</code> 
    */
   public NamedEntityGraph<Entity<T>> getOrCreateNamedEntityGraph();

   /**
    * Creates a new <code>named-entity-graph</code> element 
    * @return the new created instance of <code>NamedEntityGraph<Entity<T>></code> 
    */
   public NamedEntityGraph<Entity<T>> createNamedEntityGraph();

   /**
    * Returns all <code>named-entity-graph</code> elements
    * @return list of <code>named-entity-graph</code> 
    */
   public List<NamedEntityGraph<Entity<T>>> getAllNamedEntityGraph();

   /**
    * Removes all <code>named-entity-graph</code> elements 
    * @return the current instance of <code>NamedEntityGraph<Entity<T>></code> 
    */
   public Entity<T> removeAllNamedEntityGraph();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Entity ElementName: orm:attributes ElementType : attributes
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>attributes</code> element with the given value will be created.
    * Otherwise, the existing <code>attributes</code> element will be returned.
    * @return  a new or existing instance of <code>Attributes<Entity<T>></code> 
    */
   public Attributes<Entity<T>> getOrCreateAttributes();

   /**
    * Removes the <code>attributes</code> element 
    * @return the current instance of <code>Entity<T></code> 
    */
   public Entity<T> removeAttributes();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Entity ElementName: xsd:string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>Entity<T></code> 
    */
   public Entity<T> name(String name);

   /**
    * Returns the <code>name</code> attribute
    * @return the value defined for the attribute <code>name</code> 
    */
   public String getName();

   /**
    * Removes the <code>name</code> attribute 
    * @return the current instance of <code>Entity<T></code> 
    */
   public Entity<T> removeName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Entity ElementName: xsd:string ElementType : class
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>class</code> attribute
    * @param clazz the value for the attribute <code>class</code> 
    * @return the current instance of <code>Entity<T></code> 
    */
   public Entity<T> clazz(String clazz);

   /**
    * Returns the <code>class</code> attribute
    * @return the value defined for the attribute <code>class</code> 
    */
   public String getClazz();

   /**
    * Removes the <code>class</code> attribute 
    * @return the current instance of <code>Entity<T></code> 
    */
   public Entity<T> removeClazzAttr();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Entity ElementName: orm:access-type ElementType : access
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>access</code> attribute
    * @param access the value for the attribute <code>access</code> 
    * @return the current instance of <code>Entity<T></code> 
    */
   public Entity<T> access(AccessType access);

   /**
    * Sets the <code>access</code> attribute
    * @param access the value for the attribute <code>access</code> 
    * @return the current instance of <code>Entity<T></code> 
    */
   public Entity<T> access(String access);

   /**
    * Returns the <code>access</code> attribute
    * @return the value defined for the attribute <code>access</code> 
    */
public AccessType getAccess();

   /**
    * Returns the <code>access</code> attribute
    * @return the value found for the element <code>access</code> 
    */
   public String  getAccessAsString();

   /**
    * Removes the <code>access</code> attribute 
    * @return the current instance of <code>Entity<T></code> 
    */
   public Entity<T> removeAccess();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Entity ElementName: xsd:boolean ElementType : cacheable
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>cacheable</code> attribute
    * @param cacheable the value for the attribute <code>cacheable</code> 
    * @return the current instance of <code>Entity<T></code> 
    */
   public Entity<T> cacheable(Boolean cacheable);

   /**
    * Returns the <code>cacheable</code> attribute
    * @return the value defined for the attribute <code>cacheable</code> 
    */
public Boolean isCacheable();

   /**
    * Removes the <code>cacheable</code> attribute 
    * @return the current instance of <code>Entity<T></code> 
    */
   public Entity<T> removeCacheable();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Entity ElementName: xsd:boolean ElementType : metadata-complete
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>metadata-complete</code> attribute
    * @param metadataComplete the value for the attribute <code>metadata-complete</code> 
    * @return the current instance of <code>Entity<T></code> 
    */
   public Entity<T> metadataComplete(Boolean metadataComplete);

   /**
    * Returns the <code>metadata-complete</code> attribute
    * @return the value defined for the attribute <code>metadata-complete</code> 
    */
public Boolean isMetadataComplete();

   /**
    * Removes the <code>metadata-complete</code> attribute 
    * @return the current instance of <code>Entity<T></code> 
    */
   public Entity<T> removeMetadataComplete();
}
