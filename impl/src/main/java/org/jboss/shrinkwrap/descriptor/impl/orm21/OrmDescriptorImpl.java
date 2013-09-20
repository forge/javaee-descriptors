package org.jboss.shrinkwrap.descriptor.impl.orm21; 

import org.jboss.shrinkwrap.descriptor.api.orm21.OrmDescriptor;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.orm21.PersistenceUnitMetadata;
import org.jboss.shrinkwrap.descriptor.impl.orm21.PersistenceUnitMetadataImpl;
import org.jboss.shrinkwrap.descriptor.api.orm21.AccessType;
import org.jboss.shrinkwrap.descriptor.api.orm21.SequenceGenerator;
import org.jboss.shrinkwrap.descriptor.impl.orm21.SequenceGeneratorImpl;
import org.jboss.shrinkwrap.descriptor.api.orm21.TableGenerator;
import org.jboss.shrinkwrap.descriptor.impl.orm21.TableGeneratorImpl;
import org.jboss.shrinkwrap.descriptor.api.orm21.NamedQuery;
import org.jboss.shrinkwrap.descriptor.impl.orm21.NamedQueryImpl;
import org.jboss.shrinkwrap.descriptor.api.orm21.NamedNativeQuery;
import org.jboss.shrinkwrap.descriptor.impl.orm21.NamedNativeQueryImpl;
import org.jboss.shrinkwrap.descriptor.api.orm21.NamedStoredProcedureQuery;
import org.jboss.shrinkwrap.descriptor.impl.orm21.NamedStoredProcedureQueryImpl;
import org.jboss.shrinkwrap.descriptor.api.orm21.SqlResultSetMapping;
import org.jboss.shrinkwrap.descriptor.impl.orm21.SqlResultSetMappingImpl;
import org.jboss.shrinkwrap.descriptor.api.orm21.MappedSuperclass;
import org.jboss.shrinkwrap.descriptor.impl.orm21.MappedSuperclassImpl;
import org.jboss.shrinkwrap.descriptor.api.orm21.Entity;
import org.jboss.shrinkwrap.descriptor.impl.orm21.EntityImpl;
import org.jboss.shrinkwrap.descriptor.api.orm21.Embeddable;
import org.jboss.shrinkwrap.descriptor.impl.orm21.EmbeddableImpl;
import org.jboss.shrinkwrap.descriptor.api.orm21.Converter;
import org.jboss.shrinkwrap.descriptor.impl.orm21.ConverterImpl;
import java.util.Map.Entry;

import org.jboss.shrinkwrap.descriptor.api.DescriptorNamespace;

import org.jboss.shrinkwrap.descriptor.spi.node.NodeDescriptorImplBase;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

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
public class OrmDescriptorImpl extends NodeDescriptorImplBase implements DescriptorNamespace<OrmDescriptor>, OrmDescriptor
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private Node model;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public OrmDescriptorImpl(String descriptorName)
   {
       this(descriptorName, new Node("entity-mappings"));
   }

   public OrmDescriptorImpl(String descriptorName, Node node)
   {
      super(descriptorName);
      this.model = node;
      addDefaultNamespaces();
   }

   // -------------------------------------------------------------------------------------||
   // Methods 
   // -------------------------------------------------------------------------------------||

   public Node getRootNode()
   {
      return model;
   }



   // -------------------------------------------------------------------------------------||
   // Namespace 
   // -------------------------------------------------------------------------------------||


   /**
    * Adds the default namespaces as defined in the specification 
    * @return the current instance of <code>OrmDescriptor</code> 
    */
   public OrmDescriptor addDefaultNamespaces()
   {
      addNamespace("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
      addNamespace("xsi:schemaLocation", "http://xmlns.jcp.org/xml/ns/persistence/orm http://xmlns.jcp.org/xml/ns/persistence/orm_2_1.xsd");
      addNamespace("xmlns", "http://xmlns.jcp.org/xml/ns/persistence/orm");
     return this;
   }

   /**
    * Adds a new namespace 
    * @return the current instance of <code>OrmDescriptor</code> 
    */
   public OrmDescriptor addNamespace(String name, String value)
   {
      model.attribute(name, value);
      return this;
   }

   /**
    * Returns all defined namespaces. 
    * @return all defined namespaces 
    */
   public List<String> getNamespaces()
   {
      List<String> namespaceList = new ArrayList<String>();
      java.util.Map<String, String> attributes = model.getAttributes();
      for (Entry<String, String> e : attributes.entrySet())
      {
         final String name = e.getKey();
         final String value = e.getValue();
         if (value != null && value.startsWith("http://")) 
         {
            namespaceList.add(name + "=" + value);
         }
      }
      return namespaceList;
   }

   /**
    * Removes all existing namespaces. 
    * @return the current instance of <code>OrmDescriptor</code> 
    */
   public OrmDescriptor removeAllNamespaces()
   {
      List<String> nameSpaceKeys = new ArrayList<String>();
      java.util.Map<String, String> attributes = model.getAttributes();
      for (Entry<String, String> e : attributes.entrySet())
      {
         final String name = e.getKey();
         final String value = e.getValue();
         if (value != null && value.startsWith("http://")) 
         {
            nameSpaceKeys.add(name);
         }
      }
      for (String name: nameSpaceKeys)
      {
         model.removeAttribute(name);
      }
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OrmDescriptor ElementName: xsd:string ElementType : description
   // MaxOccurs: -  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>description</code> element
    * @param description the value for the element <code>description</code> 
    * @return the current instance of <code>OrmDescriptor</code> 
    */
   public OrmDescriptor description(String description)
   {
      model.getOrCreate("description").text(description);
      return this;
   }

   /**
    * Returns the <code>description</code> element
    * @return the node defined for the element <code>description</code> 
    */
   public String getDescription()
   {
      return model.getTextValueForPatternName("description");
   }

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>OrmDescriptor</code> 
    */
   public OrmDescriptor removeDescription()
   {
      model.removeChildren("description");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OrmDescriptor ElementName: orm:persistence-unit-metadata ElementType : persistence-unit-metadata
   // MaxOccurs: -  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>persistence-unit-metadata</code> element with the given value will be created.
    * Otherwise, the existing <code>persistence-unit-metadata</code> element will be returned.
    * @return  a new or existing instance of <code>PersistenceUnitMetadata<OrmDescriptor></code> 
    */
   public PersistenceUnitMetadata<OrmDescriptor> getOrCreatePersistenceUnitMetadata()
   {
      Node node = model.getOrCreate("persistence-unit-metadata");
      PersistenceUnitMetadata<OrmDescriptor> persistenceUnitMetadata = new PersistenceUnitMetadataImpl<OrmDescriptor>(this, "persistence-unit-metadata", model, node);
      return persistenceUnitMetadata;
   }

   /**
    * Removes the <code>persistence-unit-metadata</code> element 
    * @return the current instance of <code>OrmDescriptor</code> 
    */
   public OrmDescriptor removePersistenceUnitMetadata()
   {
      model.removeChildren("persistence-unit-metadata");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OrmDescriptor ElementName: xsd:string ElementType : package
   // MaxOccurs: -  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>package</code> element
    * @param _package the value for the element <code>package</code> 
    * @return the current instance of <code>OrmDescriptor</code> 
    */
   public OrmDescriptor _package(String _package)
   {
      model.getOrCreate("package").text(_package);
      return this;
   }

   /**
    * Returns the <code>package</code> element
    * @return the node defined for the element <code>package</code> 
    */
   public String getPackage()
   {
      return model.getTextValueForPatternName("package");
   }

   /**
    * Removes the <code>package</code> element 
    * @return the current instance of <code>OrmDescriptor</code> 
    */
   public OrmDescriptor removePackage()
   {
      model.removeChildren("package");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OrmDescriptor ElementName: xsd:string ElementType : schema
   // MaxOccurs: -  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>schema</code> element
    * @param schema the value for the element <code>schema</code> 
    * @return the current instance of <code>OrmDescriptor</code> 
    */
   public OrmDescriptor schema(String schema)
   {
      model.getOrCreate("schema").text(schema);
      return this;
   }

   /**
    * Returns the <code>schema</code> element
    * @return the node defined for the element <code>schema</code> 
    */
   public String getSchema()
   {
      return model.getTextValueForPatternName("schema");
   }

   /**
    * Removes the <code>schema</code> element 
    * @return the current instance of <code>OrmDescriptor</code> 
    */
   public OrmDescriptor removeSchema()
   {
      model.removeChildren("schema");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OrmDescriptor ElementName: xsd:string ElementType : catalog
   // MaxOccurs: -  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>catalog</code> element
    * @param catalog the value for the element <code>catalog</code> 
    * @return the current instance of <code>OrmDescriptor</code> 
    */
   public OrmDescriptor catalog(String catalog)
   {
      model.getOrCreate("catalog").text(catalog);
      return this;
   }

   /**
    * Returns the <code>catalog</code> element
    * @return the node defined for the element <code>catalog</code> 
    */
   public String getCatalog()
   {
      return model.getTextValueForPatternName("catalog");
   }

   /**
    * Removes the <code>catalog</code> element 
    * @return the current instance of <code>OrmDescriptor</code> 
    */
   public OrmDescriptor removeCatalog()
   {
      model.removeChildren("catalog");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OrmDescriptor ElementName: orm:access-type ElementType : access
   // MaxOccurs: -  isGeneric: false   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>access</code> element
    * @param access the value for the element <code>access</code> 
    * @return the current instance of <code>OrmDescriptor</code> 
    */
   public OrmDescriptor access(AccessType access)
   {
      model.getOrCreate("access").text(access);
      return this;
   }
   /**
    * Sets the <code>access</code> element
    * @param access the value for the element <code>access</code> 
    * @return the current instance of <code>OrmDescriptor</code> 
    */
   public OrmDescriptor access(String access)
   {
      model.getOrCreate("access").text(access);
      return this;
   }

   /**
    * Returns the <code>access</code> element
    * @return the value found for the element <code>access</code> 
    */
   public AccessType getAccess()
   {
      return AccessType.getFromStringValue(model.getTextValueForPatternName("access"));
   }

   /**
    * Returns the <code>access</code> element
    * @return the value found for the element <code>access</code> 
    */
   public String  getAccessAsString()
   {
      return model.getTextValueForPatternName("access");
   }

   /**
    * Removes the <code>access</code> attribute 
    * @return the current instance of <code>OrmDescriptor</code> 
    */
   public OrmDescriptor removeAccess()
   {
      model.removeAttribute("access");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OrmDescriptor ElementName: orm:sequence-generator ElementType : sequence-generator
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>sequence-generator</code> element will be created and returned.
    * Otherwise, the first existing <code>sequence-generator</code> element will be returned.
    * @return the instance defined for the element <code>sequence-generator</code> 
    */
   public SequenceGenerator<OrmDescriptor> getOrCreateSequenceGenerator()
   {
      List<Node> nodeList = model.get("sequence-generator");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new SequenceGeneratorImpl<OrmDescriptor>(this, "sequence-generator", model, nodeList.get(0));
      }
      return createSequenceGenerator();
   }

   /**
    * Creates a new <code>sequence-generator</code> element 
    * @return the new created instance of <code>SequenceGenerator<OrmDescriptor></code> 
    */
   public SequenceGenerator<OrmDescriptor> createSequenceGenerator()
   {
      return new SequenceGeneratorImpl<OrmDescriptor>(this, "sequence-generator", model);
   }

   /**
    * Returns all <code>sequence-generator</code> elements
    * @return list of <code>sequence-generator</code> 
    */
   public List<SequenceGenerator<OrmDescriptor>> getAllSequenceGenerator()
   {
      List<SequenceGenerator<OrmDescriptor>> list = new ArrayList<SequenceGenerator<OrmDescriptor>>();
      List<Node> nodeList = model.get("sequence-generator");
      for(Node node: nodeList)
      {
         SequenceGenerator<OrmDescriptor>  type = new SequenceGeneratorImpl<OrmDescriptor>(this, "sequence-generator", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>sequence-generator</code> elements 
    * @return the current instance of <code>SequenceGenerator<OrmDescriptor></code> 
    */
   public OrmDescriptor removeAllSequenceGenerator()
   {
      model.removeChildren("sequence-generator");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OrmDescriptor ElementName: orm:table-generator ElementType : table-generator
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>table-generator</code> element will be created and returned.
    * Otherwise, the first existing <code>table-generator</code> element will be returned.
    * @return the instance defined for the element <code>table-generator</code> 
    */
   public TableGenerator<OrmDescriptor> getOrCreateTableGenerator()
   {
      List<Node> nodeList = model.get("table-generator");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new TableGeneratorImpl<OrmDescriptor>(this, "table-generator", model, nodeList.get(0));
      }
      return createTableGenerator();
   }

   /**
    * Creates a new <code>table-generator</code> element 
    * @return the new created instance of <code>TableGenerator<OrmDescriptor></code> 
    */
   public TableGenerator<OrmDescriptor> createTableGenerator()
   {
      return new TableGeneratorImpl<OrmDescriptor>(this, "table-generator", model);
   }

   /**
    * Returns all <code>table-generator</code> elements
    * @return list of <code>table-generator</code> 
    */
   public List<TableGenerator<OrmDescriptor>> getAllTableGenerator()
   {
      List<TableGenerator<OrmDescriptor>> list = new ArrayList<TableGenerator<OrmDescriptor>>();
      List<Node> nodeList = model.get("table-generator");
      for(Node node: nodeList)
      {
         TableGenerator<OrmDescriptor>  type = new TableGeneratorImpl<OrmDescriptor>(this, "table-generator", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>table-generator</code> elements 
    * @return the current instance of <code>TableGenerator<OrmDescriptor></code> 
    */
   public OrmDescriptor removeAllTableGenerator()
   {
      model.removeChildren("table-generator");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OrmDescriptor ElementName: orm:named-query ElementType : named-query
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>named-query</code> element will be created and returned.
    * Otherwise, the first existing <code>named-query</code> element will be returned.
    * @return the instance defined for the element <code>named-query</code> 
    */
   public NamedQuery<OrmDescriptor> getOrCreateNamedQuery()
   {
      List<Node> nodeList = model.get("named-query");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new NamedQueryImpl<OrmDescriptor>(this, "named-query", model, nodeList.get(0));
      }
      return createNamedQuery();
   }

   /**
    * Creates a new <code>named-query</code> element 
    * @return the new created instance of <code>NamedQuery<OrmDescriptor></code> 
    */
   public NamedQuery<OrmDescriptor> createNamedQuery()
   {
      return new NamedQueryImpl<OrmDescriptor>(this, "named-query", model);
   }

   /**
    * Returns all <code>named-query</code> elements
    * @return list of <code>named-query</code> 
    */
   public List<NamedQuery<OrmDescriptor>> getAllNamedQuery()
   {
      List<NamedQuery<OrmDescriptor>> list = new ArrayList<NamedQuery<OrmDescriptor>>();
      List<Node> nodeList = model.get("named-query");
      for(Node node: nodeList)
      {
         NamedQuery<OrmDescriptor>  type = new NamedQueryImpl<OrmDescriptor>(this, "named-query", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>named-query</code> elements 
    * @return the current instance of <code>NamedQuery<OrmDescriptor></code> 
    */
   public OrmDescriptor removeAllNamedQuery()
   {
      model.removeChildren("named-query");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OrmDescriptor ElementName: orm:named-native-query ElementType : named-native-query
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>named-native-query</code> element will be created and returned.
    * Otherwise, the first existing <code>named-native-query</code> element will be returned.
    * @return the instance defined for the element <code>named-native-query</code> 
    */
   public NamedNativeQuery<OrmDescriptor> getOrCreateNamedNativeQuery()
   {
      List<Node> nodeList = model.get("named-native-query");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new NamedNativeQueryImpl<OrmDescriptor>(this, "named-native-query", model, nodeList.get(0));
      }
      return createNamedNativeQuery();
   }

   /**
    * Creates a new <code>named-native-query</code> element 
    * @return the new created instance of <code>NamedNativeQuery<OrmDescriptor></code> 
    */
   public NamedNativeQuery<OrmDescriptor> createNamedNativeQuery()
   {
      return new NamedNativeQueryImpl<OrmDescriptor>(this, "named-native-query", model);
   }

   /**
    * Returns all <code>named-native-query</code> elements
    * @return list of <code>named-native-query</code> 
    */
   public List<NamedNativeQuery<OrmDescriptor>> getAllNamedNativeQuery()
   {
      List<NamedNativeQuery<OrmDescriptor>> list = new ArrayList<NamedNativeQuery<OrmDescriptor>>();
      List<Node> nodeList = model.get("named-native-query");
      for(Node node: nodeList)
      {
         NamedNativeQuery<OrmDescriptor>  type = new NamedNativeQueryImpl<OrmDescriptor>(this, "named-native-query", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>named-native-query</code> elements 
    * @return the current instance of <code>NamedNativeQuery<OrmDescriptor></code> 
    */
   public OrmDescriptor removeAllNamedNativeQuery()
   {
      model.removeChildren("named-native-query");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OrmDescriptor ElementName: orm:named-stored-procedure-query ElementType : named-stored-procedure-query
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>named-stored-procedure-query</code> element will be created and returned.
    * Otherwise, the first existing <code>named-stored-procedure-query</code> element will be returned.
    * @return the instance defined for the element <code>named-stored-procedure-query</code> 
    */
   public NamedStoredProcedureQuery<OrmDescriptor> getOrCreateNamedStoredProcedureQuery()
   {
      List<Node> nodeList = model.get("named-stored-procedure-query");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new NamedStoredProcedureQueryImpl<OrmDescriptor>(this, "named-stored-procedure-query", model, nodeList.get(0));
      }
      return createNamedStoredProcedureQuery();
   }

   /**
    * Creates a new <code>named-stored-procedure-query</code> element 
    * @return the new created instance of <code>NamedStoredProcedureQuery<OrmDescriptor></code> 
    */
   public NamedStoredProcedureQuery<OrmDescriptor> createNamedStoredProcedureQuery()
   {
      return new NamedStoredProcedureQueryImpl<OrmDescriptor>(this, "named-stored-procedure-query", model);
   }

   /**
    * Returns all <code>named-stored-procedure-query</code> elements
    * @return list of <code>named-stored-procedure-query</code> 
    */
   public List<NamedStoredProcedureQuery<OrmDescriptor>> getAllNamedStoredProcedureQuery()
   {
      List<NamedStoredProcedureQuery<OrmDescriptor>> list = new ArrayList<NamedStoredProcedureQuery<OrmDescriptor>>();
      List<Node> nodeList = model.get("named-stored-procedure-query");
      for(Node node: nodeList)
      {
         NamedStoredProcedureQuery<OrmDescriptor>  type = new NamedStoredProcedureQueryImpl<OrmDescriptor>(this, "named-stored-procedure-query", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>named-stored-procedure-query</code> elements 
    * @return the current instance of <code>NamedStoredProcedureQuery<OrmDescriptor></code> 
    */
   public OrmDescriptor removeAllNamedStoredProcedureQuery()
   {
      model.removeChildren("named-stored-procedure-query");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OrmDescriptor ElementName: orm:sql-result-set-mapping ElementType : sql-result-set-mapping
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>sql-result-set-mapping</code> element will be created and returned.
    * Otherwise, the first existing <code>sql-result-set-mapping</code> element will be returned.
    * @return the instance defined for the element <code>sql-result-set-mapping</code> 
    */
   public SqlResultSetMapping<OrmDescriptor> getOrCreateSqlResultSetMapping()
   {
      List<Node> nodeList = model.get("sql-result-set-mapping");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new SqlResultSetMappingImpl<OrmDescriptor>(this, "sql-result-set-mapping", model, nodeList.get(0));
      }
      return createSqlResultSetMapping();
   }

   /**
    * Creates a new <code>sql-result-set-mapping</code> element 
    * @return the new created instance of <code>SqlResultSetMapping<OrmDescriptor></code> 
    */
   public SqlResultSetMapping<OrmDescriptor> createSqlResultSetMapping()
   {
      return new SqlResultSetMappingImpl<OrmDescriptor>(this, "sql-result-set-mapping", model);
   }

   /**
    * Returns all <code>sql-result-set-mapping</code> elements
    * @return list of <code>sql-result-set-mapping</code> 
    */
   public List<SqlResultSetMapping<OrmDescriptor>> getAllSqlResultSetMapping()
   {
      List<SqlResultSetMapping<OrmDescriptor>> list = new ArrayList<SqlResultSetMapping<OrmDescriptor>>();
      List<Node> nodeList = model.get("sql-result-set-mapping");
      for(Node node: nodeList)
      {
         SqlResultSetMapping<OrmDescriptor>  type = new SqlResultSetMappingImpl<OrmDescriptor>(this, "sql-result-set-mapping", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>sql-result-set-mapping</code> elements 
    * @return the current instance of <code>SqlResultSetMapping<OrmDescriptor></code> 
    */
   public OrmDescriptor removeAllSqlResultSetMapping()
   {
      model.removeChildren("sql-result-set-mapping");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OrmDescriptor ElementName: orm:mapped-superclass ElementType : mapped-superclass
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>mapped-superclass</code> element will be created and returned.
    * Otherwise, the first existing <code>mapped-superclass</code> element will be returned.
    * @return the instance defined for the element <code>mapped-superclass</code> 
    */
   public MappedSuperclass<OrmDescriptor> getOrCreateMappedSuperclass()
   {
      List<Node> nodeList = model.get("mapped-superclass");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new MappedSuperclassImpl<OrmDescriptor>(this, "mapped-superclass", model, nodeList.get(0));
      }
      return createMappedSuperclass();
   }

   /**
    * Creates a new <code>mapped-superclass</code> element 
    * @return the new created instance of <code>MappedSuperclass<OrmDescriptor></code> 
    */
   public MappedSuperclass<OrmDescriptor> createMappedSuperclass()
   {
      return new MappedSuperclassImpl<OrmDescriptor>(this, "mapped-superclass", model);
   }

   /**
    * Returns all <code>mapped-superclass</code> elements
    * @return list of <code>mapped-superclass</code> 
    */
   public List<MappedSuperclass<OrmDescriptor>> getAllMappedSuperclass()
   {
      List<MappedSuperclass<OrmDescriptor>> list = new ArrayList<MappedSuperclass<OrmDescriptor>>();
      List<Node> nodeList = model.get("mapped-superclass");
      for(Node node: nodeList)
      {
         MappedSuperclass<OrmDescriptor>  type = new MappedSuperclassImpl<OrmDescriptor>(this, "mapped-superclass", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>mapped-superclass</code> elements 
    * @return the current instance of <code>MappedSuperclass<OrmDescriptor></code> 
    */
   public OrmDescriptor removeAllMappedSuperclass()
   {
      model.removeChildren("mapped-superclass");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OrmDescriptor ElementName: orm:entity ElementType : entity
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>entity</code> element will be created and returned.
    * Otherwise, the first existing <code>entity</code> element will be returned.
    * @return the instance defined for the element <code>entity</code> 
    */
   public Entity<OrmDescriptor> getOrCreateEntity()
   {
      List<Node> nodeList = model.get("entity");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new EntityImpl<OrmDescriptor>(this, "entity", model, nodeList.get(0));
      }
      return createEntity();
   }

   /**
    * Creates a new <code>entity</code> element 
    * @return the new created instance of <code>Entity<OrmDescriptor></code> 
    */
   public Entity<OrmDescriptor> createEntity()
   {
      return new EntityImpl<OrmDescriptor>(this, "entity", model);
   }

   /**
    * Returns all <code>entity</code> elements
    * @return list of <code>entity</code> 
    */
   public List<Entity<OrmDescriptor>> getAllEntity()
   {
      List<Entity<OrmDescriptor>> list = new ArrayList<Entity<OrmDescriptor>>();
      List<Node> nodeList = model.get("entity");
      for(Node node: nodeList)
      {
         Entity<OrmDescriptor>  type = new EntityImpl<OrmDescriptor>(this, "entity", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>entity</code> elements 
    * @return the current instance of <code>Entity<OrmDescriptor></code> 
    */
   public OrmDescriptor removeAllEntity()
   {
      model.removeChildren("entity");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OrmDescriptor ElementName: orm:embeddable ElementType : embeddable
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>embeddable</code> element will be created and returned.
    * Otherwise, the first existing <code>embeddable</code> element will be returned.
    * @return the instance defined for the element <code>embeddable</code> 
    */
   public Embeddable<OrmDescriptor> getOrCreateEmbeddable()
   {
      List<Node> nodeList = model.get("embeddable");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new EmbeddableImpl<OrmDescriptor>(this, "embeddable", model, nodeList.get(0));
      }
      return createEmbeddable();
   }

   /**
    * Creates a new <code>embeddable</code> element 
    * @return the new created instance of <code>Embeddable<OrmDescriptor></code> 
    */
   public Embeddable<OrmDescriptor> createEmbeddable()
   {
      return new EmbeddableImpl<OrmDescriptor>(this, "embeddable", model);
   }

   /**
    * Returns all <code>embeddable</code> elements
    * @return list of <code>embeddable</code> 
    */
   public List<Embeddable<OrmDescriptor>> getAllEmbeddable()
   {
      List<Embeddable<OrmDescriptor>> list = new ArrayList<Embeddable<OrmDescriptor>>();
      List<Node> nodeList = model.get("embeddable");
      for(Node node: nodeList)
      {
         Embeddable<OrmDescriptor>  type = new EmbeddableImpl<OrmDescriptor>(this, "embeddable", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>embeddable</code> elements 
    * @return the current instance of <code>Embeddable<OrmDescriptor></code> 
    */
   public OrmDescriptor removeAllEmbeddable()
   {
      model.removeChildren("embeddable");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OrmDescriptor ElementName: orm:converter ElementType : converter
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>converter</code> element will be created and returned.
    * Otherwise, the first existing <code>converter</code> element will be returned.
    * @return the instance defined for the element <code>converter</code> 
    */
   public Converter<OrmDescriptor> getOrCreateConverter()
   {
      List<Node> nodeList = model.get("converter");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ConverterImpl<OrmDescriptor>(this, "converter", model, nodeList.get(0));
      }
      return createConverter();
   }

   /**
    * Creates a new <code>converter</code> element 
    * @return the new created instance of <code>Converter<OrmDescriptor></code> 
    */
   public Converter<OrmDescriptor> createConverter()
   {
      return new ConverterImpl<OrmDescriptor>(this, "converter", model);
   }

   /**
    * Returns all <code>converter</code> elements
    * @return list of <code>converter</code> 
    */
   public List<Converter<OrmDescriptor>> getAllConverter()
   {
      List<Converter<OrmDescriptor>> list = new ArrayList<Converter<OrmDescriptor>>();
      List<Node> nodeList = model.get("converter");
      for(Node node: nodeList)
      {
         Converter<OrmDescriptor>  type = new ConverterImpl<OrmDescriptor>(this, "converter", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>converter</code> elements 
    * @return the current instance of <code>Converter<OrmDescriptor></code> 
    */
   public OrmDescriptor removeAllConverter()
   {
      model.removeChildren("converter");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OrmDescriptor ElementName: xsd:token ElementType : version
   // MaxOccurs: -  isGeneric: false   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of <code>OrmDescriptor</code> 
    */
   public OrmDescriptor version(String version)
   {
      model.attribute("version", version);
      return this;
   }

   /**
    * Returns the <code>version</code> attribute
    * @return the value defined for the attribute <code>version</code> 
    */
      public String getVersion()
   {
      return model.getAttribute("version");
   }

   /**
    * Removes the <code>version</code> attribute 
    * @return the current instance of <code>OrmDescriptor</code> 
    */
   public OrmDescriptor removeVersion()
   {
      model.removeAttribute("version");
      return this;
   }

}
