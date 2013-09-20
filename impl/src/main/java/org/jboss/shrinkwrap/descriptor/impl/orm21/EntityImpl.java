package org.jboss.shrinkwrap.descriptor.impl.orm21; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.orm21.Entity;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.orm21.Table;
import org.jboss.shrinkwrap.descriptor.impl.orm21.TableImpl;
import org.jboss.shrinkwrap.descriptor.api.orm21.SecondaryTable;
import org.jboss.shrinkwrap.descriptor.impl.orm21.SecondaryTableImpl;
import org.jboss.shrinkwrap.descriptor.api.orm21.PrimaryKeyJoinColumn;
import org.jboss.shrinkwrap.descriptor.impl.orm21.PrimaryKeyJoinColumnImpl;
import org.jboss.shrinkwrap.descriptor.api.orm21.ForeignKey;
import org.jboss.shrinkwrap.descriptor.impl.orm21.ForeignKeyImpl;
import org.jboss.shrinkwrap.descriptor.api.orm21.IdClass;
import org.jboss.shrinkwrap.descriptor.impl.orm21.IdClassImpl;
import org.jboss.shrinkwrap.descriptor.api.orm21.Inheritance;
import org.jboss.shrinkwrap.descriptor.impl.orm21.InheritanceImpl;
import org.jboss.shrinkwrap.descriptor.api.orm21.DiscriminatorColumn;
import org.jboss.shrinkwrap.descriptor.impl.orm21.DiscriminatorColumnImpl;
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
import org.jboss.shrinkwrap.descriptor.api.javaee7.EmptyType;
import org.jboss.shrinkwrap.descriptor.impl.javaee7.EmptyTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee7.EmptyType;
import org.jboss.shrinkwrap.descriptor.impl.javaee7.EmptyTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.orm21.EntityListeners;
import org.jboss.shrinkwrap.descriptor.impl.orm21.EntityListenersImpl;
import org.jboss.shrinkwrap.descriptor.api.orm21.PrePersist;
import org.jboss.shrinkwrap.descriptor.impl.orm21.PrePersistImpl;
import org.jboss.shrinkwrap.descriptor.api.orm21.PostPersist;
import org.jboss.shrinkwrap.descriptor.impl.orm21.PostPersistImpl;
import org.jboss.shrinkwrap.descriptor.api.orm21.PreRemove;
import org.jboss.shrinkwrap.descriptor.impl.orm21.PreRemoveImpl;
import org.jboss.shrinkwrap.descriptor.api.orm21.PostRemove;
import org.jboss.shrinkwrap.descriptor.impl.orm21.PostRemoveImpl;
import org.jboss.shrinkwrap.descriptor.api.orm21.PreUpdate;
import org.jboss.shrinkwrap.descriptor.impl.orm21.PreUpdateImpl;
import org.jboss.shrinkwrap.descriptor.api.orm21.PostUpdate;
import org.jboss.shrinkwrap.descriptor.impl.orm21.PostUpdateImpl;
import org.jboss.shrinkwrap.descriptor.api.orm21.PostLoad;
import org.jboss.shrinkwrap.descriptor.impl.orm21.PostLoadImpl;
import org.jboss.shrinkwrap.descriptor.api.orm21.AttributeOverride;
import org.jboss.shrinkwrap.descriptor.impl.orm21.AttributeOverrideImpl;
import org.jboss.shrinkwrap.descriptor.api.orm21.AssociationOverride;
import org.jboss.shrinkwrap.descriptor.impl.orm21.AssociationOverrideImpl;
import org.jboss.shrinkwrap.descriptor.api.orm21.Convert;
import org.jboss.shrinkwrap.descriptor.impl.orm21.ConvertImpl;
import org.jboss.shrinkwrap.descriptor.api.orm21.NamedEntityGraph;
import org.jboss.shrinkwrap.descriptor.impl.orm21.NamedEntityGraphImpl;
import org.jboss.shrinkwrap.descriptor.api.orm21.Attributes;
import org.jboss.shrinkwrap.descriptor.impl.orm21.AttributesImpl;
import org.jboss.shrinkwrap.descriptor.api.orm21.AccessType;

/**
 * This class implements the <code> entity </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class EntityImpl<T> implements Child<T>, Entity<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public EntityImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public EntityImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Entity ElementName: xsd:string ElementType : description
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>description</code> element
    * @param description the value for the element <code>description</code> 
    * @return the current instance of <code>Entity<T></code> 
    */
   public Entity<T> description(String description)
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
    * @return the current instance of <code>Entity<T></code> 
    */
   public Entity<T> removeDescription()
   {
      childNode.removeChildren("description");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Entity ElementName: orm:table ElementType : table
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>table</code> element with the given value will be created.
    * Otherwise, the existing <code>table</code> element will be returned.
    * @return  a new or existing instance of <code>Table<Entity<T>></code> 
    */
   public Table<Entity<T>> getOrCreateTable()
   {
      Node node = childNode.getOrCreate("table");
      Table<Entity<T>> table = new TableImpl<Entity<T>>(this, "table", childNode, node);
      return table;
   }

   /**
    * Removes the <code>table</code> element 
    * @return the current instance of <code>Entity<T></code> 
    */
   public Entity<T> removeTable()
   {
      childNode.removeChildren("table");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Entity ElementName: orm:secondary-table ElementType : secondary-table
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>secondary-table</code> element will be created and returned.
    * Otherwise, the first existing <code>secondary-table</code> element will be returned.
    * @return the instance defined for the element <code>secondary-table</code> 
    */
   public SecondaryTable<Entity<T>> getOrCreateSecondaryTable()
   {
      List<Node> nodeList = childNode.get("secondary-table");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new SecondaryTableImpl<Entity<T>>(this, "secondary-table", childNode, nodeList.get(0));
      }
      return createSecondaryTable();
   }

   /**
    * Creates a new <code>secondary-table</code> element 
    * @return the new created instance of <code>SecondaryTable<Entity<T>></code> 
    */
   public SecondaryTable<Entity<T>> createSecondaryTable()
   {
      return new SecondaryTableImpl<Entity<T>>(this, "secondary-table", childNode);
   }

   /**
    * Returns all <code>secondary-table</code> elements
    * @return list of <code>secondary-table</code> 
    */
   public List<SecondaryTable<Entity<T>>> getAllSecondaryTable()
   {
      List<SecondaryTable<Entity<T>>> list = new ArrayList<SecondaryTable<Entity<T>>>();
      List<Node> nodeList = childNode.get("secondary-table");
      for(Node node: nodeList)
      {
         SecondaryTable<Entity<T>>  type = new SecondaryTableImpl<Entity<T>>(this, "secondary-table", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>secondary-table</code> elements 
    * @return the current instance of <code>SecondaryTable<Entity<T>></code> 
    */
   public Entity<T> removeAllSecondaryTable()
   {
      childNode.removeChildren("secondary-table");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Entity ElementName: orm:primary-key-join-column ElementType : primary-key-join-column
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>primary-key-join-column</code> element will be created and returned.
    * Otherwise, the first existing <code>primary-key-join-column</code> element will be returned.
    * @return the instance defined for the element <code>primary-key-join-column</code> 
    */
   public PrimaryKeyJoinColumn<Entity<T>> getOrCreatePrimaryKeyJoinColumn()
   {
      List<Node> nodeList = childNode.get("primary-key-join-column");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new PrimaryKeyJoinColumnImpl<Entity<T>>(this, "primary-key-join-column", childNode, nodeList.get(0));
      }
      return createPrimaryKeyJoinColumn();
   }

   /**
    * Creates a new <code>primary-key-join-column</code> element 
    * @return the new created instance of <code>PrimaryKeyJoinColumn<Entity<T>></code> 
    */
   public PrimaryKeyJoinColumn<Entity<T>> createPrimaryKeyJoinColumn()
   {
      return new PrimaryKeyJoinColumnImpl<Entity<T>>(this, "primary-key-join-column", childNode);
   }

   /**
    * Returns all <code>primary-key-join-column</code> elements
    * @return list of <code>primary-key-join-column</code> 
    */
   public List<PrimaryKeyJoinColumn<Entity<T>>> getAllPrimaryKeyJoinColumn()
   {
      List<PrimaryKeyJoinColumn<Entity<T>>> list = new ArrayList<PrimaryKeyJoinColumn<Entity<T>>>();
      List<Node> nodeList = childNode.get("primary-key-join-column");
      for(Node node: nodeList)
      {
         PrimaryKeyJoinColumn<Entity<T>>  type = new PrimaryKeyJoinColumnImpl<Entity<T>>(this, "primary-key-join-column", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>primary-key-join-column</code> elements 
    * @return the current instance of <code>PrimaryKeyJoinColumn<Entity<T>></code> 
    */
   public Entity<T> removeAllPrimaryKeyJoinColumn()
   {
      childNode.removeChildren("primary-key-join-column");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Entity ElementName: orm:foreign-key ElementType : primary-key-foreign-key
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>primary-key-foreign-key</code> element with the given value will be created.
    * Otherwise, the existing <code>primary-key-foreign-key</code> element will be returned.
    * @return  a new or existing instance of <code>ForeignKey<Entity<T>></code> 
    */
   public ForeignKey<Entity<T>> getOrCreatePrimaryKeyForeignKey()
   {
      Node node = childNode.getOrCreate("primary-key-foreign-key");
      ForeignKey<Entity<T>> primaryKeyForeignKey = new ForeignKeyImpl<Entity<T>>(this, "primary-key-foreign-key", childNode, node);
      return primaryKeyForeignKey;
   }

   /**
    * Removes the <code>primary-key-foreign-key</code> element 
    * @return the current instance of <code>Entity<T></code> 
    */
   public Entity<T> removePrimaryKeyForeignKey()
   {
      childNode.removeChildren("primary-key-foreign-key");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Entity ElementName: orm:id-class ElementType : id-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>id-class</code> element with the given value will be created.
    * Otherwise, the existing <code>id-class</code> element will be returned.
    * @return  a new or existing instance of <code>IdClass<Entity<T>></code> 
    */
   public IdClass<Entity<T>> getOrCreateIdClass()
   {
      Node node = childNode.getOrCreate("id-class");
      IdClass<Entity<T>> idClass = new IdClassImpl<Entity<T>>(this, "id-class", childNode, node);
      return idClass;
   }

   /**
    * Removes the <code>id-class</code> element 
    * @return the current instance of <code>Entity<T></code> 
    */
   public Entity<T> removeIdClass()
   {
      childNode.removeChildren("id-class");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Entity ElementName: orm:inheritance ElementType : inheritance
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>inheritance</code> element with the given value will be created.
    * Otherwise, the existing <code>inheritance</code> element will be returned.
    * @return  a new or existing instance of <code>Inheritance<Entity<T>></code> 
    */
   public Inheritance<Entity<T>> getOrCreateInheritance()
   {
      Node node = childNode.getOrCreate("inheritance");
      Inheritance<Entity<T>> inheritance = new InheritanceImpl<Entity<T>>(this, "inheritance", childNode, node);
      return inheritance;
   }

   /**
    * Removes the <code>inheritance</code> element 
    * @return the current instance of <code>Entity<T></code> 
    */
   public Entity<T> removeInheritance()
   {
      childNode.removeChildren("inheritance");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Entity ElementName: xsd:string ElementType : discriminator-value
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>discriminator-value</code> element
    * @param discriminatorValue the value for the element <code>discriminator-value</code> 
    * @return the current instance of <code>Entity<T></code> 
    */
   public Entity<T> discriminatorValue(String discriminatorValue)
   {
      childNode.getOrCreate("discriminator-value").text(discriminatorValue);
      return this;
   }

   /**
    * Returns the <code>discriminator-value</code> element
    * @return the node defined for the element <code>discriminator-value</code> 
    */
   public String getDiscriminatorValue()
   {
      return childNode.getTextValueForPatternName("discriminator-value");
   }

   /**
    * Removes the <code>discriminator-value</code> element 
    * @return the current instance of <code>Entity<T></code> 
    */
   public Entity<T> removeDiscriminatorValue()
   {
      childNode.removeChildren("discriminator-value");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Entity ElementName: orm:discriminator-column ElementType : discriminator-column
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>discriminator-column</code> element with the given value will be created.
    * Otherwise, the existing <code>discriminator-column</code> element will be returned.
    * @return  a new or existing instance of <code>DiscriminatorColumn<Entity<T>></code> 
    */
   public DiscriminatorColumn<Entity<T>> getOrCreateDiscriminatorColumn()
   {
      Node node = childNode.getOrCreate("discriminator-column");
      DiscriminatorColumn<Entity<T>> discriminatorColumn = new DiscriminatorColumnImpl<Entity<T>>(this, "discriminator-column", childNode, node);
      return discriminatorColumn;
   }

   /**
    * Removes the <code>discriminator-column</code> element 
    * @return the current instance of <code>Entity<T></code> 
    */
   public Entity<T> removeDiscriminatorColumn()
   {
      childNode.removeChildren("discriminator-column");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Entity ElementName: orm:sequence-generator ElementType : sequence-generator
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>sequence-generator</code> element with the given value will be created.
    * Otherwise, the existing <code>sequence-generator</code> element will be returned.
    * @return  a new or existing instance of <code>SequenceGenerator<Entity<T>></code> 
    */
   public SequenceGenerator<Entity<T>> getOrCreateSequenceGenerator()
   {
      Node node = childNode.getOrCreate("sequence-generator");
      SequenceGenerator<Entity<T>> sequenceGenerator = new SequenceGeneratorImpl<Entity<T>>(this, "sequence-generator", childNode, node);
      return sequenceGenerator;
   }

   /**
    * Removes the <code>sequence-generator</code> element 
    * @return the current instance of <code>Entity<T></code> 
    */
   public Entity<T> removeSequenceGenerator()
   {
      childNode.removeChildren("sequence-generator");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Entity ElementName: orm:table-generator ElementType : table-generator
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>table-generator</code> element with the given value will be created.
    * Otherwise, the existing <code>table-generator</code> element will be returned.
    * @return  a new or existing instance of <code>TableGenerator<Entity<T>></code> 
    */
   public TableGenerator<Entity<T>> getOrCreateTableGenerator()
   {
      Node node = childNode.getOrCreate("table-generator");
      TableGenerator<Entity<T>> tableGenerator = new TableGeneratorImpl<Entity<T>>(this, "table-generator", childNode, node);
      return tableGenerator;
   }

   /**
    * Removes the <code>table-generator</code> element 
    * @return the current instance of <code>Entity<T></code> 
    */
   public Entity<T> removeTableGenerator()
   {
      childNode.removeChildren("table-generator");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Entity ElementName: orm:named-query ElementType : named-query
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>named-query</code> element will be created and returned.
    * Otherwise, the first existing <code>named-query</code> element will be returned.
    * @return the instance defined for the element <code>named-query</code> 
    */
   public NamedQuery<Entity<T>> getOrCreateNamedQuery()
   {
      List<Node> nodeList = childNode.get("named-query");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new NamedQueryImpl<Entity<T>>(this, "named-query", childNode, nodeList.get(0));
      }
      return createNamedQuery();
   }

   /**
    * Creates a new <code>named-query</code> element 
    * @return the new created instance of <code>NamedQuery<Entity<T>></code> 
    */
   public NamedQuery<Entity<T>> createNamedQuery()
   {
      return new NamedQueryImpl<Entity<T>>(this, "named-query", childNode);
   }

   /**
    * Returns all <code>named-query</code> elements
    * @return list of <code>named-query</code> 
    */
   public List<NamedQuery<Entity<T>>> getAllNamedQuery()
   {
      List<NamedQuery<Entity<T>>> list = new ArrayList<NamedQuery<Entity<T>>>();
      List<Node> nodeList = childNode.get("named-query");
      for(Node node: nodeList)
      {
         NamedQuery<Entity<T>>  type = new NamedQueryImpl<Entity<T>>(this, "named-query", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>named-query</code> elements 
    * @return the current instance of <code>NamedQuery<Entity<T>></code> 
    */
   public Entity<T> removeAllNamedQuery()
   {
      childNode.removeChildren("named-query");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Entity ElementName: orm:named-native-query ElementType : named-native-query
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>named-native-query</code> element will be created and returned.
    * Otherwise, the first existing <code>named-native-query</code> element will be returned.
    * @return the instance defined for the element <code>named-native-query</code> 
    */
   public NamedNativeQuery<Entity<T>> getOrCreateNamedNativeQuery()
   {
      List<Node> nodeList = childNode.get("named-native-query");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new NamedNativeQueryImpl<Entity<T>>(this, "named-native-query", childNode, nodeList.get(0));
      }
      return createNamedNativeQuery();
   }

   /**
    * Creates a new <code>named-native-query</code> element 
    * @return the new created instance of <code>NamedNativeQuery<Entity<T>></code> 
    */
   public NamedNativeQuery<Entity<T>> createNamedNativeQuery()
   {
      return new NamedNativeQueryImpl<Entity<T>>(this, "named-native-query", childNode);
   }

   /**
    * Returns all <code>named-native-query</code> elements
    * @return list of <code>named-native-query</code> 
    */
   public List<NamedNativeQuery<Entity<T>>> getAllNamedNativeQuery()
   {
      List<NamedNativeQuery<Entity<T>>> list = new ArrayList<NamedNativeQuery<Entity<T>>>();
      List<Node> nodeList = childNode.get("named-native-query");
      for(Node node: nodeList)
      {
         NamedNativeQuery<Entity<T>>  type = new NamedNativeQueryImpl<Entity<T>>(this, "named-native-query", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>named-native-query</code> elements 
    * @return the current instance of <code>NamedNativeQuery<Entity<T>></code> 
    */
   public Entity<T> removeAllNamedNativeQuery()
   {
      childNode.removeChildren("named-native-query");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Entity ElementName: orm:named-stored-procedure-query ElementType : named-stored-procedure-query
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>named-stored-procedure-query</code> element will be created and returned.
    * Otherwise, the first existing <code>named-stored-procedure-query</code> element will be returned.
    * @return the instance defined for the element <code>named-stored-procedure-query</code> 
    */
   public NamedStoredProcedureQuery<Entity<T>> getOrCreateNamedStoredProcedureQuery()
   {
      List<Node> nodeList = childNode.get("named-stored-procedure-query");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new NamedStoredProcedureQueryImpl<Entity<T>>(this, "named-stored-procedure-query", childNode, nodeList.get(0));
      }
      return createNamedStoredProcedureQuery();
   }

   /**
    * Creates a new <code>named-stored-procedure-query</code> element 
    * @return the new created instance of <code>NamedStoredProcedureQuery<Entity<T>></code> 
    */
   public NamedStoredProcedureQuery<Entity<T>> createNamedStoredProcedureQuery()
   {
      return new NamedStoredProcedureQueryImpl<Entity<T>>(this, "named-stored-procedure-query", childNode);
   }

   /**
    * Returns all <code>named-stored-procedure-query</code> elements
    * @return list of <code>named-stored-procedure-query</code> 
    */
   public List<NamedStoredProcedureQuery<Entity<T>>> getAllNamedStoredProcedureQuery()
   {
      List<NamedStoredProcedureQuery<Entity<T>>> list = new ArrayList<NamedStoredProcedureQuery<Entity<T>>>();
      List<Node> nodeList = childNode.get("named-stored-procedure-query");
      for(Node node: nodeList)
      {
         NamedStoredProcedureQuery<Entity<T>>  type = new NamedStoredProcedureQueryImpl<Entity<T>>(this, "named-stored-procedure-query", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>named-stored-procedure-query</code> elements 
    * @return the current instance of <code>NamedStoredProcedureQuery<Entity<T>></code> 
    */
   public Entity<T> removeAllNamedStoredProcedureQuery()
   {
      childNode.removeChildren("named-stored-procedure-query");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Entity ElementName: orm:sql-result-set-mapping ElementType : sql-result-set-mapping
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>sql-result-set-mapping</code> element will be created and returned.
    * Otherwise, the first existing <code>sql-result-set-mapping</code> element will be returned.
    * @return the instance defined for the element <code>sql-result-set-mapping</code> 
    */
   public SqlResultSetMapping<Entity<T>> getOrCreateSqlResultSetMapping()
   {
      List<Node> nodeList = childNode.get("sql-result-set-mapping");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new SqlResultSetMappingImpl<Entity<T>>(this, "sql-result-set-mapping", childNode, nodeList.get(0));
      }
      return createSqlResultSetMapping();
   }

   /**
    * Creates a new <code>sql-result-set-mapping</code> element 
    * @return the new created instance of <code>SqlResultSetMapping<Entity<T>></code> 
    */
   public SqlResultSetMapping<Entity<T>> createSqlResultSetMapping()
   {
      return new SqlResultSetMappingImpl<Entity<T>>(this, "sql-result-set-mapping", childNode);
   }

   /**
    * Returns all <code>sql-result-set-mapping</code> elements
    * @return list of <code>sql-result-set-mapping</code> 
    */
   public List<SqlResultSetMapping<Entity<T>>> getAllSqlResultSetMapping()
   {
      List<SqlResultSetMapping<Entity<T>>> list = new ArrayList<SqlResultSetMapping<Entity<T>>>();
      List<Node> nodeList = childNode.get("sql-result-set-mapping");
      for(Node node: nodeList)
      {
         SqlResultSetMapping<Entity<T>>  type = new SqlResultSetMappingImpl<Entity<T>>(this, "sql-result-set-mapping", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>sql-result-set-mapping</code> elements 
    * @return the current instance of <code>SqlResultSetMapping<Entity<T>></code> 
    */
   public Entity<T> removeAllSqlResultSetMapping()
   {
      childNode.removeChildren("sql-result-set-mapping");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Entity ElementName: javaee:emptyType ElementType : exclude-default-listeners
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>exclude-default-listeners</code> element 
    * @return the current instance of <code>Entity<T></code> 
    */
   public Entity<T> excludeDefaultListeners()
   {
      childNode.getOrCreate("exclude-default-listeners");
      return this;
   }

   /**
    * Removes the <code>exclude-default-listeners</code> element 
    * @return the current instance of <code>Entity<T></code> 
    */
   public Boolean isExcludeDefaultListeners()
   {
      return childNode.getSingle("exclude-default-listeners") != null;
   }

   /**
    * Removes the <code>exclude-default-listeners</code> element 
    * @return the current instance of <code>Entity<T></code> 
    */
   public Entity<T> removeExcludeDefaultListeners()
   {
      childNode.removeChild("exclude-default-listeners");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Entity ElementName: javaee:emptyType ElementType : exclude-superclass-listeners
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>exclude-superclass-listeners</code> element 
    * @return the current instance of <code>Entity<T></code> 
    */
   public Entity<T> excludeSuperclassListeners()
   {
      childNode.getOrCreate("exclude-superclass-listeners");
      return this;
   }

   /**
    * Removes the <code>exclude-superclass-listeners</code> element 
    * @return the current instance of <code>Entity<T></code> 
    */
   public Boolean isExcludeSuperclassListeners()
   {
      return childNode.getSingle("exclude-superclass-listeners") != null;
   }

   /**
    * Removes the <code>exclude-superclass-listeners</code> element 
    * @return the current instance of <code>Entity<T></code> 
    */
   public Entity<T> removeExcludeSuperclassListeners()
   {
      childNode.removeChild("exclude-superclass-listeners");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Entity ElementName: orm:entity-listeners ElementType : entity-listeners
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>entity-listeners</code> element with the given value will be created.
    * Otherwise, the existing <code>entity-listeners</code> element will be returned.
    * @return  a new or existing instance of <code>EntityListeners<Entity<T>></code> 
    */
   public EntityListeners<Entity<T>> getOrCreateEntityListeners()
   {
      Node node = childNode.getOrCreate("entity-listeners");
      EntityListeners<Entity<T>> entityListeners = new EntityListenersImpl<Entity<T>>(this, "entity-listeners", childNode, node);
      return entityListeners;
   }

   /**
    * Removes the <code>entity-listeners</code> element 
    * @return the current instance of <code>Entity<T></code> 
    */
   public Entity<T> removeEntityListeners()
   {
      childNode.removeChildren("entity-listeners");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Entity ElementName: orm:pre-persist ElementType : pre-persist
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>pre-persist</code> element with the given value will be created.
    * Otherwise, the existing <code>pre-persist</code> element will be returned.
    * @return  a new or existing instance of <code>PrePersist<Entity<T>></code> 
    */
   public PrePersist<Entity<T>> getOrCreatePrePersist()
   {
      Node node = childNode.getOrCreate("pre-persist");
      PrePersist<Entity<T>> prePersist = new PrePersistImpl<Entity<T>>(this, "pre-persist", childNode, node);
      return prePersist;
   }

   /**
    * Removes the <code>pre-persist</code> element 
    * @return the current instance of <code>Entity<T></code> 
    */
   public Entity<T> removePrePersist()
   {
      childNode.removeChildren("pre-persist");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Entity ElementName: orm:post-persist ElementType : post-persist
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>post-persist</code> element with the given value will be created.
    * Otherwise, the existing <code>post-persist</code> element will be returned.
    * @return  a new or existing instance of <code>PostPersist<Entity<T>></code> 
    */
   public PostPersist<Entity<T>> getOrCreatePostPersist()
   {
      Node node = childNode.getOrCreate("post-persist");
      PostPersist<Entity<T>> postPersist = new PostPersistImpl<Entity<T>>(this, "post-persist", childNode, node);
      return postPersist;
   }

   /**
    * Removes the <code>post-persist</code> element 
    * @return the current instance of <code>Entity<T></code> 
    */
   public Entity<T> removePostPersist()
   {
      childNode.removeChildren("post-persist");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Entity ElementName: orm:pre-remove ElementType : pre-remove
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>pre-remove</code> element with the given value will be created.
    * Otherwise, the existing <code>pre-remove</code> element will be returned.
    * @return  a new or existing instance of <code>PreRemove<Entity<T>></code> 
    */
   public PreRemove<Entity<T>> getOrCreatePreRemove()
   {
      Node node = childNode.getOrCreate("pre-remove");
      PreRemove<Entity<T>> preRemove = new PreRemoveImpl<Entity<T>>(this, "pre-remove", childNode, node);
      return preRemove;
   }

   /**
    * Removes the <code>pre-remove</code> element 
    * @return the current instance of <code>Entity<T></code> 
    */
   public Entity<T> removePreRemove()
   {
      childNode.removeChildren("pre-remove");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Entity ElementName: orm:post-remove ElementType : post-remove
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>post-remove</code> element with the given value will be created.
    * Otherwise, the existing <code>post-remove</code> element will be returned.
    * @return  a new or existing instance of <code>PostRemove<Entity<T>></code> 
    */
   public PostRemove<Entity<T>> getOrCreatePostRemove()
   {
      Node node = childNode.getOrCreate("post-remove");
      PostRemove<Entity<T>> postRemove = new PostRemoveImpl<Entity<T>>(this, "post-remove", childNode, node);
      return postRemove;
   }

   /**
    * Removes the <code>post-remove</code> element 
    * @return the current instance of <code>Entity<T></code> 
    */
   public Entity<T> removePostRemove()
   {
      childNode.removeChildren("post-remove");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Entity ElementName: orm:pre-update ElementType : pre-update
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>pre-update</code> element with the given value will be created.
    * Otherwise, the existing <code>pre-update</code> element will be returned.
    * @return  a new or existing instance of <code>PreUpdate<Entity<T>></code> 
    */
   public PreUpdate<Entity<T>> getOrCreatePreUpdate()
   {
      Node node = childNode.getOrCreate("pre-update");
      PreUpdate<Entity<T>> preUpdate = new PreUpdateImpl<Entity<T>>(this, "pre-update", childNode, node);
      return preUpdate;
   }

   /**
    * Removes the <code>pre-update</code> element 
    * @return the current instance of <code>Entity<T></code> 
    */
   public Entity<T> removePreUpdate()
   {
      childNode.removeChildren("pre-update");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Entity ElementName: orm:post-update ElementType : post-update
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>post-update</code> element with the given value will be created.
    * Otherwise, the existing <code>post-update</code> element will be returned.
    * @return  a new or existing instance of <code>PostUpdate<Entity<T>></code> 
    */
   public PostUpdate<Entity<T>> getOrCreatePostUpdate()
   {
      Node node = childNode.getOrCreate("post-update");
      PostUpdate<Entity<T>> postUpdate = new PostUpdateImpl<Entity<T>>(this, "post-update", childNode, node);
      return postUpdate;
   }

   /**
    * Removes the <code>post-update</code> element 
    * @return the current instance of <code>Entity<T></code> 
    */
   public Entity<T> removePostUpdate()
   {
      childNode.removeChildren("post-update");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Entity ElementName: orm:post-load ElementType : post-load
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>post-load</code> element with the given value will be created.
    * Otherwise, the existing <code>post-load</code> element will be returned.
    * @return  a new or existing instance of <code>PostLoad<Entity<T>></code> 
    */
   public PostLoad<Entity<T>> getOrCreatePostLoad()
   {
      Node node = childNode.getOrCreate("post-load");
      PostLoad<Entity<T>> postLoad = new PostLoadImpl<Entity<T>>(this, "post-load", childNode, node);
      return postLoad;
   }

   /**
    * Removes the <code>post-load</code> element 
    * @return the current instance of <code>Entity<T></code> 
    */
   public Entity<T> removePostLoad()
   {
      childNode.removeChildren("post-load");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Entity ElementName: orm:attribute-override ElementType : attribute-override
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>attribute-override</code> element will be created and returned.
    * Otherwise, the first existing <code>attribute-override</code> element will be returned.
    * @return the instance defined for the element <code>attribute-override</code> 
    */
   public AttributeOverride<Entity<T>> getOrCreateAttributeOverride()
   {
      List<Node> nodeList = childNode.get("attribute-override");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new AttributeOverrideImpl<Entity<T>>(this, "attribute-override", childNode, nodeList.get(0));
      }
      return createAttributeOverride();
   }

   /**
    * Creates a new <code>attribute-override</code> element 
    * @return the new created instance of <code>AttributeOverride<Entity<T>></code> 
    */
   public AttributeOverride<Entity<T>> createAttributeOverride()
   {
      return new AttributeOverrideImpl<Entity<T>>(this, "attribute-override", childNode);
   }

   /**
    * Returns all <code>attribute-override</code> elements
    * @return list of <code>attribute-override</code> 
    */
   public List<AttributeOverride<Entity<T>>> getAllAttributeOverride()
   {
      List<AttributeOverride<Entity<T>>> list = new ArrayList<AttributeOverride<Entity<T>>>();
      List<Node> nodeList = childNode.get("attribute-override");
      for(Node node: nodeList)
      {
         AttributeOverride<Entity<T>>  type = new AttributeOverrideImpl<Entity<T>>(this, "attribute-override", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>attribute-override</code> elements 
    * @return the current instance of <code>AttributeOverride<Entity<T>></code> 
    */
   public Entity<T> removeAllAttributeOverride()
   {
      childNode.removeChildren("attribute-override");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Entity ElementName: orm:association-override ElementType : association-override
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>association-override</code> element will be created and returned.
    * Otherwise, the first existing <code>association-override</code> element will be returned.
    * @return the instance defined for the element <code>association-override</code> 
    */
   public AssociationOverride<Entity<T>> getOrCreateAssociationOverride()
   {
      List<Node> nodeList = childNode.get("association-override");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new AssociationOverrideImpl<Entity<T>>(this, "association-override", childNode, nodeList.get(0));
      }
      return createAssociationOverride();
   }

   /**
    * Creates a new <code>association-override</code> element 
    * @return the new created instance of <code>AssociationOverride<Entity<T>></code> 
    */
   public AssociationOverride<Entity<T>> createAssociationOverride()
   {
      return new AssociationOverrideImpl<Entity<T>>(this, "association-override", childNode);
   }

   /**
    * Returns all <code>association-override</code> elements
    * @return list of <code>association-override</code> 
    */
   public List<AssociationOverride<Entity<T>>> getAllAssociationOverride()
   {
      List<AssociationOverride<Entity<T>>> list = new ArrayList<AssociationOverride<Entity<T>>>();
      List<Node> nodeList = childNode.get("association-override");
      for(Node node: nodeList)
      {
         AssociationOverride<Entity<T>>  type = new AssociationOverrideImpl<Entity<T>>(this, "association-override", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>association-override</code> elements 
    * @return the current instance of <code>AssociationOverride<Entity<T>></code> 
    */
   public Entity<T> removeAllAssociationOverride()
   {
      childNode.removeChildren("association-override");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Entity ElementName: orm:convert ElementType : convert
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>convert</code> element will be created and returned.
    * Otherwise, the first existing <code>convert</code> element will be returned.
    * @return the instance defined for the element <code>convert</code> 
    */
   public Convert<Entity<T>> getOrCreateConvert()
   {
      List<Node> nodeList = childNode.get("convert");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ConvertImpl<Entity<T>>(this, "convert", childNode, nodeList.get(0));
      }
      return createConvert();
   }

   /**
    * Creates a new <code>convert</code> element 
    * @return the new created instance of <code>Convert<Entity<T>></code> 
    */
   public Convert<Entity<T>> createConvert()
   {
      return new ConvertImpl<Entity<T>>(this, "convert", childNode);
   }

   /**
    * Returns all <code>convert</code> elements
    * @return list of <code>convert</code> 
    */
   public List<Convert<Entity<T>>> getAllConvert()
   {
      List<Convert<Entity<T>>> list = new ArrayList<Convert<Entity<T>>>();
      List<Node> nodeList = childNode.get("convert");
      for(Node node: nodeList)
      {
         Convert<Entity<T>>  type = new ConvertImpl<Entity<T>>(this, "convert", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>convert</code> elements 
    * @return the current instance of <code>Convert<Entity<T>></code> 
    */
   public Entity<T> removeAllConvert()
   {
      childNode.removeChildren("convert");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Entity ElementName: orm:named-entity-graph ElementType : named-entity-graph
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>named-entity-graph</code> element will be created and returned.
    * Otherwise, the first existing <code>named-entity-graph</code> element will be returned.
    * @return the instance defined for the element <code>named-entity-graph</code> 
    */
   public NamedEntityGraph<Entity<T>> getOrCreateNamedEntityGraph()
   {
      List<Node> nodeList = childNode.get("named-entity-graph");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new NamedEntityGraphImpl<Entity<T>>(this, "named-entity-graph", childNode, nodeList.get(0));
      }
      return createNamedEntityGraph();
   }

   /**
    * Creates a new <code>named-entity-graph</code> element 
    * @return the new created instance of <code>NamedEntityGraph<Entity<T>></code> 
    */
   public NamedEntityGraph<Entity<T>> createNamedEntityGraph()
   {
      return new NamedEntityGraphImpl<Entity<T>>(this, "named-entity-graph", childNode);
   }

   /**
    * Returns all <code>named-entity-graph</code> elements
    * @return list of <code>named-entity-graph</code> 
    */
   public List<NamedEntityGraph<Entity<T>>> getAllNamedEntityGraph()
   {
      List<NamedEntityGraph<Entity<T>>> list = new ArrayList<NamedEntityGraph<Entity<T>>>();
      List<Node> nodeList = childNode.get("named-entity-graph");
      for(Node node: nodeList)
      {
         NamedEntityGraph<Entity<T>>  type = new NamedEntityGraphImpl<Entity<T>>(this, "named-entity-graph", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>named-entity-graph</code> elements 
    * @return the current instance of <code>NamedEntityGraph<Entity<T>></code> 
    */
   public Entity<T> removeAllNamedEntityGraph()
   {
      childNode.removeChildren("named-entity-graph");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Entity ElementName: orm:attributes ElementType : attributes
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>attributes</code> element with the given value will be created.
    * Otherwise, the existing <code>attributes</code> element will be returned.
    * @return  a new or existing instance of <code>Attributes<Entity<T>></code> 
    */
   public Attributes<Entity<T>> getOrCreateAttributes()
   {
      Node node = childNode.getOrCreate("attributes");
      Attributes<Entity<T>> attributes = new AttributesImpl<Entity<T>>(this, "attributes", childNode, node);
      return attributes;
   }

   /**
    * Removes the <code>attributes</code> element 
    * @return the current instance of <code>Entity<T></code> 
    */
   public Entity<T> removeAttributes()
   {
      childNode.removeChildren("attributes");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Entity ElementName: xsd:string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>Entity<T></code> 
    */
   public Entity<T> name(String name)
   {
      childNode.attribute("name", name);
      return this;
   }

   /**
    * Returns the <code>name</code> attribute
    * @return the value defined for the attribute <code>name</code> 
    */
      public String getName()
   {
      return childNode.getAttribute("name");
   }

   /**
    * Removes the <code>name</code> attribute 
    * @return the current instance of <code>Entity<T></code> 
    */
   public Entity<T> removeName()
   {
      childNode.removeAttribute("name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Entity ElementName: xsd:string ElementType : class
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>class</code> attribute
    * @param clazz the value for the attribute <code>class</code> 
    * @return the current instance of <code>Entity<T></code> 
    */
   public Entity<T> clazz(String clazz)
   {
      childNode.attribute("class", clazz);
      return this;
   }

   /**
    * Returns the <code>class</code> attribute
    * @return the value defined for the attribute <code>class</code> 
    */
      public String getClazz()
   {
      return childNode.getAttribute("class");
   }

   /**
    * Removes the <code>class</code> attribute 
    * @return the current instance of <code>Entity<T></code> 
    */
   public Entity<T> removeClazzAttr()
   {
      childNode.removeAttribute("class");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Entity ElementName: orm:access-type ElementType : access
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>access</code> attribute
    * @param access the value for the attribute <code>access</code> 
    * @return the current instance of <code>Entity<T></code> 
    */
   public Entity<T> access(AccessType access)
   {
      childNode.attribute("access", access);
      return this;
   }

   /**
    * Sets the <code>access</code> attribute
    * @param access the value for the attribute <code>access</code> 
    * @return the current instance of <code>Entity<T></code> 
    */
   public Entity<T> access(String access)
   {
      childNode.attribute("access", access);
      return this;
   }

   /**
    * Returns the <code>access</code> attribute
    * @return the value defined for the attribute <code>access</code> 
    */
   public AccessType getAccess()
   {
      return AccessType.getFromStringValue(childNode.getAttribute("access"));
   }

   /**
    * Returns the <code>access</code> attribute
    * @return the value found for the element <code>access</code> 
    */
   public String  getAccessAsString()
   {
      return childNode.getAttribute("access");
   }

   /**
    * Removes the <code>access</code> attribute 
    * @return the current instance of <code>Entity<T></code> 
    */
   public Entity<T> removeAccess()
   {
      childNode.removeAttribute("access");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Entity ElementName: xsd:boolean ElementType : cacheable
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>cacheable</code> attribute
    * @param cacheable the value for the attribute <code>cacheable</code> 
    * @return the current instance of <code>Entity<T></code> 
    */
   public Entity<T> cacheable(Boolean cacheable)
   {
      childNode.attribute("cacheable", cacheable);
      return this;
   }

   /**
    * Returns the <code>cacheable</code> attribute
    * @return the value defined for the attribute <code>cacheable</code> 
    */
   public Boolean isCacheable()
   {
      return Strings.isTrue(childNode.getAttribute("cacheable"));
   }

   /**
    * Removes the <code>cacheable</code> attribute 
    * @return the current instance of <code>Entity<T></code> 
    */
   public Entity<T> removeCacheable()
   {
      childNode.removeAttribute("cacheable");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Entity ElementName: xsd:boolean ElementType : metadata-complete
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>metadata-complete</code> attribute
    * @param metadataComplete the value for the attribute <code>metadata-complete</code> 
    * @return the current instance of <code>Entity<T></code> 
    */
   public Entity<T> metadataComplete(Boolean metadataComplete)
   {
      childNode.attribute("metadata-complete", metadataComplete);
      return this;
   }

   /**
    * Returns the <code>metadata-complete</code> attribute
    * @return the value defined for the attribute <code>metadata-complete</code> 
    */
   public Boolean isMetadataComplete()
   {
      return Strings.isTrue(childNode.getAttribute("metadata-complete"));
   }

   /**
    * Removes the <code>metadata-complete</code> attribute 
    * @return the current instance of <code>Entity<T></code> 
    */
   public Entity<T> removeMetadataComplete()
   {
      childNode.removeAttribute("metadata-complete");
      return this;
   }
}
