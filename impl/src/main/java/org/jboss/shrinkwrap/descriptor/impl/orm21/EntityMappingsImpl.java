package org.jboss.shrinkwrap.descriptor.impl.orm21; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.orm21.AccessType;
import org.jboss.shrinkwrap.descriptor.api.orm21.Converter;
import org.jboss.shrinkwrap.descriptor.api.orm21.Embeddable;
import org.jboss.shrinkwrap.descriptor.api.orm21.Entity;
import org.jboss.shrinkwrap.descriptor.api.orm21.EntityMappings;
import org.jboss.shrinkwrap.descriptor.api.orm21.MappedSuperclass;
import org.jboss.shrinkwrap.descriptor.api.orm21.NamedNativeQuery;
import org.jboss.shrinkwrap.descriptor.api.orm21.NamedQuery;
import org.jboss.shrinkwrap.descriptor.api.orm21.NamedStoredProcedureQuery;
import org.jboss.shrinkwrap.descriptor.api.orm21.PersistenceUnitMetadata;
import org.jboss.shrinkwrap.descriptor.api.orm21.SequenceGenerator;
import org.jboss.shrinkwrap.descriptor.api.orm21.SqlResultSetMapping;
import org.jboss.shrinkwrap.descriptor.api.orm21.TableGenerator;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> entity-mappings </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class EntityMappingsImpl<T> implements Child<T>, EntityMappings<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public EntityMappingsImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public EntityMappingsImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityMappings ElementName: xsd:string ElementType : description
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>description</code> element
    * @param description the value for the element <code>description</code> 
    * @return the current instance of <code>EntityMappings<T></code> 
    */
   public EntityMappings<T> description(String description)
   {
      childNode.getOrCreate("description").text(description);
      return this;
   }

   /**
    * Returns the <code>description</code> element
    * @return the node defined for the element <code>description</code> 
    */
   public String getDescription()
   {
      return childNode.getTextValueForPatternName("description");
   }

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>EntityMappings<T></code> 
    */
   public EntityMappings<T> removeDescription()
   {
      childNode.removeChildren("description");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityMappings ElementName: orm:persistence-unit-metadata ElementType : persistence-unit-metadata
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>persistence-unit-metadata</code> element with the given value will be created.
    * Otherwise, the existing <code>persistence-unit-metadata</code> element will be returned.
    * @return  a new or existing instance of <code>PersistenceUnitMetadata<EntityMappings<T>></code> 
    */
   public PersistenceUnitMetadata<EntityMappings<T>> getOrCreatePersistenceUnitMetadata()
   {
      Node node = childNode.getOrCreate("persistence-unit-metadata");
      PersistenceUnitMetadata<EntityMappings<T>> persistenceUnitMetadata = new PersistenceUnitMetadataImpl<EntityMappings<T>>(this, "persistence-unit-metadata", childNode, node);
      return persistenceUnitMetadata;
   }

   /**
    * Removes the <code>persistence-unit-metadata</code> element 
    * @return the current instance of <code>EntityMappings<T></code> 
    */
   public EntityMappings<T> removePersistenceUnitMetadata()
   {
      childNode.removeChildren("persistence-unit-metadata");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityMappings ElementName: xsd:string ElementType : package
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>package</code> element
    * @param _package the value for the element <code>package</code> 
    * @return the current instance of <code>EntityMappings<T></code> 
    */
   public EntityMappings<T> _package(String _package)
   {
      childNode.getOrCreate("package").text(_package);
      return this;
   }

   /**
    * Returns the <code>package</code> element
    * @return the node defined for the element <code>package</code> 
    */
   public String getPackage()
   {
      return childNode.getTextValueForPatternName("package");
   }

   /**
    * Removes the <code>package</code> element 
    * @return the current instance of <code>EntityMappings<T></code> 
    */
   public EntityMappings<T> removePackage()
   {
      childNode.removeChildren("package");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityMappings ElementName: xsd:string ElementType : schema
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>schema</code> element
    * @param schema the value for the element <code>schema</code> 
    * @return the current instance of <code>EntityMappings<T></code> 
    */
   public EntityMappings<T> schema(String schema)
   {
      childNode.getOrCreate("schema").text(schema);
      return this;
   }

   /**
    * Returns the <code>schema</code> element
    * @return the node defined for the element <code>schema</code> 
    */
   public String getSchema()
   {
      return childNode.getTextValueForPatternName("schema");
   }

   /**
    * Removes the <code>schema</code> element 
    * @return the current instance of <code>EntityMappings<T></code> 
    */
   public EntityMappings<T> removeSchema()
   {
      childNode.removeChildren("schema");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityMappings ElementName: xsd:string ElementType : catalog
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>catalog</code> element
    * @param catalog the value for the element <code>catalog</code> 
    * @return the current instance of <code>EntityMappings<T></code> 
    */
   public EntityMappings<T> catalog(String catalog)
   {
      childNode.getOrCreate("catalog").text(catalog);
      return this;
   }

   /**
    * Returns the <code>catalog</code> element
    * @return the node defined for the element <code>catalog</code> 
    */
   public String getCatalog()
   {
      return childNode.getTextValueForPatternName("catalog");
   }

   /**
    * Removes the <code>catalog</code> element 
    * @return the current instance of <code>EntityMappings<T></code> 
    */
   public EntityMappings<T> removeCatalog()
   {
      childNode.removeChildren("catalog");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityMappings ElementName: orm:access-type ElementType : access
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>access</code> element
    * @param access the value for the element <code>access</code> 
    * @return the current instance of <code>EntityMappings<T></code> 
    */
   public EntityMappings<T> access(AccessType access)
   {
      childNode.getOrCreate("access").text(access);
      return this;
   }
   /**
    * Sets the <code>access</code> element
    * @param access the value for the element <code>access</code> 
    * @return the current instance of <code>EntityMappings<T></code> 
    */
   public EntityMappings<T> access(String access)
   {
      childNode.getOrCreate("access").text(access);
      return this;
   }

   /**
    * Returns the <code>access</code> element
    * @return the value found for the element <code>access</code> 
    */
   public AccessType getAccess()
   {
      return AccessType.getFromStringValue(childNode.getTextValueForPatternName("access"));
   }

   /**
    * Returns the <code>access</code> element
    * @return the value found for the element <code>access</code> 
    */
   public String  getAccessAsString()
   {
      return childNode.getTextValueForPatternName("access");
   }

   /**
    * Removes the <code>access</code> attribute 
    * @return the current instance of <code>EntityMappings<T></code> 
    */
   public EntityMappings<T> removeAccess()
   {
      childNode.removeAttribute("access");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityMappings ElementName: orm:sequence-generator ElementType : sequence-generator
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>sequence-generator</code> element will be created and returned.
    * Otherwise, the first existing <code>sequence-generator</code> element will be returned.
    * @return the instance defined for the element <code>sequence-generator</code> 
    */
   public SequenceGenerator<EntityMappings<T>> getOrCreateSequenceGenerator()
   {
      List<Node> nodeList = childNode.get("sequence-generator");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new SequenceGeneratorImpl<EntityMappings<T>>(this, "sequence-generator", childNode, nodeList.get(0));
      }
      return createSequenceGenerator();
   }

   /**
    * Creates a new <code>sequence-generator</code> element 
    * @return the new created instance of <code>SequenceGenerator<EntityMappings<T>></code> 
    */
   public SequenceGenerator<EntityMappings<T>> createSequenceGenerator()
   {
      return new SequenceGeneratorImpl<EntityMappings<T>>(this, "sequence-generator", childNode);
   }

   /**
    * Returns all <code>sequence-generator</code> elements
    * @return list of <code>sequence-generator</code> 
    */
   public List<SequenceGenerator<EntityMappings<T>>> getAllSequenceGenerator()
   {
      List<SequenceGenerator<EntityMappings<T>>> list = new ArrayList<SequenceGenerator<EntityMappings<T>>>();
      List<Node> nodeList = childNode.get("sequence-generator");
      for(Node node: nodeList)
      {
         SequenceGenerator<EntityMappings<T>>  type = new SequenceGeneratorImpl<EntityMappings<T>>(this, "sequence-generator", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>sequence-generator</code> elements 
    * @return the current instance of <code>SequenceGenerator<EntityMappings<T>></code> 
    */
   public EntityMappings<T> removeAllSequenceGenerator()
   {
      childNode.removeChildren("sequence-generator");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityMappings ElementName: orm:table-generator ElementType : table-generator
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>table-generator</code> element will be created and returned.
    * Otherwise, the first existing <code>table-generator</code> element will be returned.
    * @return the instance defined for the element <code>table-generator</code> 
    */
   public TableGenerator<EntityMappings<T>> getOrCreateTableGenerator()
   {
      List<Node> nodeList = childNode.get("table-generator");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new TableGeneratorImpl<EntityMappings<T>>(this, "table-generator", childNode, nodeList.get(0));
      }
      return createTableGenerator();
   }

   /**
    * Creates a new <code>table-generator</code> element 
    * @return the new created instance of <code>TableGenerator<EntityMappings<T>></code> 
    */
   public TableGenerator<EntityMappings<T>> createTableGenerator()
   {
      return new TableGeneratorImpl<EntityMappings<T>>(this, "table-generator", childNode);
   }

   /**
    * Returns all <code>table-generator</code> elements
    * @return list of <code>table-generator</code> 
    */
   public List<TableGenerator<EntityMappings<T>>> getAllTableGenerator()
   {
      List<TableGenerator<EntityMappings<T>>> list = new ArrayList<TableGenerator<EntityMappings<T>>>();
      List<Node> nodeList = childNode.get("table-generator");
      for(Node node: nodeList)
      {
         TableGenerator<EntityMappings<T>>  type = new TableGeneratorImpl<EntityMappings<T>>(this, "table-generator", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>table-generator</code> elements 
    * @return the current instance of <code>TableGenerator<EntityMappings<T>></code> 
    */
   public EntityMappings<T> removeAllTableGenerator()
   {
      childNode.removeChildren("table-generator");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityMappings ElementName: orm:named-query ElementType : named-query
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>named-query</code> element will be created and returned.
    * Otherwise, the first existing <code>named-query</code> element will be returned.
    * @return the instance defined for the element <code>named-query</code> 
    */
   public NamedQuery<EntityMappings<T>> getOrCreateNamedQuery()
   {
      List<Node> nodeList = childNode.get("named-query");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new NamedQueryImpl<EntityMappings<T>>(this, "named-query", childNode, nodeList.get(0));
      }
      return createNamedQuery();
   }

   /**
    * Creates a new <code>named-query</code> element 
    * @return the new created instance of <code>NamedQuery<EntityMappings<T>></code> 
    */
   public NamedQuery<EntityMappings<T>> createNamedQuery()
   {
      return new NamedQueryImpl<EntityMappings<T>>(this, "named-query", childNode);
   }

   /**
    * Returns all <code>named-query</code> elements
    * @return list of <code>named-query</code> 
    */
   public List<NamedQuery<EntityMappings<T>>> getAllNamedQuery()
   {
      List<NamedQuery<EntityMappings<T>>> list = new ArrayList<NamedQuery<EntityMappings<T>>>();
      List<Node> nodeList = childNode.get("named-query");
      for(Node node: nodeList)
      {
         NamedQuery<EntityMappings<T>>  type = new NamedQueryImpl<EntityMappings<T>>(this, "named-query", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>named-query</code> elements 
    * @return the current instance of <code>NamedQuery<EntityMappings<T>></code> 
    */
   public EntityMappings<T> removeAllNamedQuery()
   {
      childNode.removeChildren("named-query");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityMappings ElementName: orm:named-native-query ElementType : named-native-query
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>named-native-query</code> element will be created and returned.
    * Otherwise, the first existing <code>named-native-query</code> element will be returned.
    * @return the instance defined for the element <code>named-native-query</code> 
    */
   public NamedNativeQuery<EntityMappings<T>> getOrCreateNamedNativeQuery()
   {
      List<Node> nodeList = childNode.get("named-native-query");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new NamedNativeQueryImpl<EntityMappings<T>>(this, "named-native-query", childNode, nodeList.get(0));
      }
      return createNamedNativeQuery();
   }

   /**
    * Creates a new <code>named-native-query</code> element 
    * @return the new created instance of <code>NamedNativeQuery<EntityMappings<T>></code> 
    */
   public NamedNativeQuery<EntityMappings<T>> createNamedNativeQuery()
   {
      return new NamedNativeQueryImpl<EntityMappings<T>>(this, "named-native-query", childNode);
   }

   /**
    * Returns all <code>named-native-query</code> elements
    * @return list of <code>named-native-query</code> 
    */
   public List<NamedNativeQuery<EntityMappings<T>>> getAllNamedNativeQuery()
   {
      List<NamedNativeQuery<EntityMappings<T>>> list = new ArrayList<NamedNativeQuery<EntityMappings<T>>>();
      List<Node> nodeList = childNode.get("named-native-query");
      for(Node node: nodeList)
      {
         NamedNativeQuery<EntityMappings<T>>  type = new NamedNativeQueryImpl<EntityMappings<T>>(this, "named-native-query", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>named-native-query</code> elements 
    * @return the current instance of <code>NamedNativeQuery<EntityMappings<T>></code> 
    */
   public EntityMappings<T> removeAllNamedNativeQuery()
   {
      childNode.removeChildren("named-native-query");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityMappings ElementName: orm:named-stored-procedure-query ElementType : named-stored-procedure-query
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>named-stored-procedure-query</code> element will be created and returned.
    * Otherwise, the first existing <code>named-stored-procedure-query</code> element will be returned.
    * @return the instance defined for the element <code>named-stored-procedure-query</code> 
    */
   public NamedStoredProcedureQuery<EntityMappings<T>> getOrCreateNamedStoredProcedureQuery()
   {
      List<Node> nodeList = childNode.get("named-stored-procedure-query");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new NamedStoredProcedureQueryImpl<EntityMappings<T>>(this, "named-stored-procedure-query", childNode, nodeList.get(0));
      }
      return createNamedStoredProcedureQuery();
   }

   /**
    * Creates a new <code>named-stored-procedure-query</code> element 
    * @return the new created instance of <code>NamedStoredProcedureQuery<EntityMappings<T>></code> 
    */
   public NamedStoredProcedureQuery<EntityMappings<T>> createNamedStoredProcedureQuery()
   {
      return new NamedStoredProcedureQueryImpl<EntityMappings<T>>(this, "named-stored-procedure-query", childNode);
   }

   /**
    * Returns all <code>named-stored-procedure-query</code> elements
    * @return list of <code>named-stored-procedure-query</code> 
    */
   public List<NamedStoredProcedureQuery<EntityMappings<T>>> getAllNamedStoredProcedureQuery()
   {
      List<NamedStoredProcedureQuery<EntityMappings<T>>> list = new ArrayList<NamedStoredProcedureQuery<EntityMappings<T>>>();
      List<Node> nodeList = childNode.get("named-stored-procedure-query");
      for(Node node: nodeList)
      {
         NamedStoredProcedureQuery<EntityMappings<T>>  type = new NamedStoredProcedureQueryImpl<EntityMappings<T>>(this, "named-stored-procedure-query", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>named-stored-procedure-query</code> elements 
    * @return the current instance of <code>NamedStoredProcedureQuery<EntityMappings<T>></code> 
    */
   public EntityMappings<T> removeAllNamedStoredProcedureQuery()
   {
      childNode.removeChildren("named-stored-procedure-query");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityMappings ElementName: orm:sql-result-set-mapping ElementType : sql-result-set-mapping
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>sql-result-set-mapping</code> element will be created and returned.
    * Otherwise, the first existing <code>sql-result-set-mapping</code> element will be returned.
    * @return the instance defined for the element <code>sql-result-set-mapping</code> 
    */
   public SqlResultSetMapping<EntityMappings<T>> getOrCreateSqlResultSetMapping()
   {
      List<Node> nodeList = childNode.get("sql-result-set-mapping");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new SqlResultSetMappingImpl<EntityMappings<T>>(this, "sql-result-set-mapping", childNode, nodeList.get(0));
      }
      return createSqlResultSetMapping();
   }

   /**
    * Creates a new <code>sql-result-set-mapping</code> element 
    * @return the new created instance of <code>SqlResultSetMapping<EntityMappings<T>></code> 
    */
   public SqlResultSetMapping<EntityMappings<T>> createSqlResultSetMapping()
   {
      return new SqlResultSetMappingImpl<EntityMappings<T>>(this, "sql-result-set-mapping", childNode);
   }

   /**
    * Returns all <code>sql-result-set-mapping</code> elements
    * @return list of <code>sql-result-set-mapping</code> 
    */
   public List<SqlResultSetMapping<EntityMappings<T>>> getAllSqlResultSetMapping()
   {
      List<SqlResultSetMapping<EntityMappings<T>>> list = new ArrayList<SqlResultSetMapping<EntityMappings<T>>>();
      List<Node> nodeList = childNode.get("sql-result-set-mapping");
      for(Node node: nodeList)
      {
         SqlResultSetMapping<EntityMappings<T>>  type = new SqlResultSetMappingImpl<EntityMappings<T>>(this, "sql-result-set-mapping", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>sql-result-set-mapping</code> elements 
    * @return the current instance of <code>SqlResultSetMapping<EntityMappings<T>></code> 
    */
   public EntityMappings<T> removeAllSqlResultSetMapping()
   {
      childNode.removeChildren("sql-result-set-mapping");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityMappings ElementName: orm:mapped-superclass ElementType : mapped-superclass
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>mapped-superclass</code> element will be created and returned.
    * Otherwise, the first existing <code>mapped-superclass</code> element will be returned.
    * @return the instance defined for the element <code>mapped-superclass</code> 
    */
   public MappedSuperclass<EntityMappings<T>> getOrCreateMappedSuperclass()
   {
      List<Node> nodeList = childNode.get("mapped-superclass");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new MappedSuperclassImpl<EntityMappings<T>>(this, "mapped-superclass", childNode, nodeList.get(0));
      }
      return createMappedSuperclass();
   }

   /**
    * Creates a new <code>mapped-superclass</code> element 
    * @return the new created instance of <code>MappedSuperclass<EntityMappings<T>></code> 
    */
   public MappedSuperclass<EntityMappings<T>> createMappedSuperclass()
   {
      return new MappedSuperclassImpl<EntityMappings<T>>(this, "mapped-superclass", childNode);
   }

   /**
    * Returns all <code>mapped-superclass</code> elements
    * @return list of <code>mapped-superclass</code> 
    */
   public List<MappedSuperclass<EntityMappings<T>>> getAllMappedSuperclass()
   {
      List<MappedSuperclass<EntityMappings<T>>> list = new ArrayList<MappedSuperclass<EntityMappings<T>>>();
      List<Node> nodeList = childNode.get("mapped-superclass");
      for(Node node: nodeList)
      {
         MappedSuperclass<EntityMappings<T>>  type = new MappedSuperclassImpl<EntityMappings<T>>(this, "mapped-superclass", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>mapped-superclass</code> elements 
    * @return the current instance of <code>MappedSuperclass<EntityMappings<T>></code> 
    */
   public EntityMappings<T> removeAllMappedSuperclass()
   {
      childNode.removeChildren("mapped-superclass");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityMappings ElementName: orm:entity ElementType : entity
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>entity</code> element will be created and returned.
    * Otherwise, the first existing <code>entity</code> element will be returned.
    * @return the instance defined for the element <code>entity</code> 
    */
   public Entity<EntityMappings<T>> getOrCreateEntity()
   {
      List<Node> nodeList = childNode.get("entity");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new EntityImpl<EntityMappings<T>>(this, "entity", childNode, nodeList.get(0));
      }
      return createEntity();
   }

   /**
    * Creates a new <code>entity</code> element 
    * @return the new created instance of <code>Entity<EntityMappings<T>></code> 
    */
   public Entity<EntityMappings<T>> createEntity()
   {
      return new EntityImpl<EntityMappings<T>>(this, "entity", childNode);
   }

   /**
    * Returns all <code>entity</code> elements
    * @return list of <code>entity</code> 
    */
   public List<Entity<EntityMappings<T>>> getAllEntity()
   {
      List<Entity<EntityMappings<T>>> list = new ArrayList<Entity<EntityMappings<T>>>();
      List<Node> nodeList = childNode.get("entity");
      for(Node node: nodeList)
      {
         Entity<EntityMappings<T>>  type = new EntityImpl<EntityMappings<T>>(this, "entity", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>entity</code> elements 
    * @return the current instance of <code>Entity<EntityMappings<T>></code> 
    */
   public EntityMappings<T> removeAllEntity()
   {
      childNode.removeChildren("entity");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityMappings ElementName: orm:embeddable ElementType : embeddable
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>embeddable</code> element will be created and returned.
    * Otherwise, the first existing <code>embeddable</code> element will be returned.
    * @return the instance defined for the element <code>embeddable</code> 
    */
   public Embeddable<EntityMappings<T>> getOrCreateEmbeddable()
   {
      List<Node> nodeList = childNode.get("embeddable");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new EmbeddableImpl<EntityMappings<T>>(this, "embeddable", childNode, nodeList.get(0));
      }
      return createEmbeddable();
   }

   /**
    * Creates a new <code>embeddable</code> element 
    * @return the new created instance of <code>Embeddable<EntityMappings<T>></code> 
    */
   public Embeddable<EntityMappings<T>> createEmbeddable()
   {
      return new EmbeddableImpl<EntityMappings<T>>(this, "embeddable", childNode);
   }

   /**
    * Returns all <code>embeddable</code> elements
    * @return list of <code>embeddable</code> 
    */
   public List<Embeddable<EntityMappings<T>>> getAllEmbeddable()
   {
      List<Embeddable<EntityMappings<T>>> list = new ArrayList<Embeddable<EntityMappings<T>>>();
      List<Node> nodeList = childNode.get("embeddable");
      for(Node node: nodeList)
      {
         Embeddable<EntityMappings<T>>  type = new EmbeddableImpl<EntityMappings<T>>(this, "embeddable", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>embeddable</code> elements 
    * @return the current instance of <code>Embeddable<EntityMappings<T>></code> 
    */
   public EntityMappings<T> removeAllEmbeddable()
   {
      childNode.removeChildren("embeddable");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityMappings ElementName: orm:converter ElementType : converter
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>converter</code> element will be created and returned.
    * Otherwise, the first existing <code>converter</code> element will be returned.
    * @return the instance defined for the element <code>converter</code> 
    */
   public Converter<EntityMappings<T>> getOrCreateConverter()
   {
      List<Node> nodeList = childNode.get("converter");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ConverterImpl<EntityMappings<T>>(this, "converter", childNode, nodeList.get(0));
      }
      return createConverter();
   }

   /**
    * Creates a new <code>converter</code> element 
    * @return the new created instance of <code>Converter<EntityMappings<T>></code> 
    */
   public Converter<EntityMappings<T>> createConverter()
   {
      return new ConverterImpl<EntityMappings<T>>(this, "converter", childNode);
   }

   /**
    * Returns all <code>converter</code> elements
    * @return list of <code>converter</code> 
    */
   public List<Converter<EntityMappings<T>>> getAllConverter()
   {
      List<Converter<EntityMappings<T>>> list = new ArrayList<Converter<EntityMappings<T>>>();
      List<Node> nodeList = childNode.get("converter");
      for(Node node: nodeList)
      {
         Converter<EntityMappings<T>>  type = new ConverterImpl<EntityMappings<T>>(this, "converter", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>converter</code> elements 
    * @return the current instance of <code>Converter<EntityMappings<T>></code> 
    */
   public EntityMappings<T> removeAllConverter()
   {
      childNode.removeChildren("converter");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityMappings ElementName: xsd:token ElementType : version
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of <code>EntityMappings<T></code> 
    */
   public EntityMappings<T> version(String version)
   {
      childNode.attribute("version", version);
      return this;
   }

   /**
    * Returns the <code>version</code> attribute
    * @return the value defined for the attribute <code>version</code> 
    */
      public String getVersion()
   {
      return childNode.getAttribute("version");
   }

   /**
    * Removes the <code>version</code> attribute 
    * @return the current instance of <code>EntityMappings<T></code> 
    */
   public EntityMappings<T> removeVersion()
   {
      childNode.removeAttribute("version");
      return this;
   }
}
