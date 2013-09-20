package org.jboss.shrinkwrap.descriptor.impl.orm21; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.orm21.CollectionTable;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.orm21.JoinColumn;
import org.jboss.shrinkwrap.descriptor.impl.orm21.JoinColumnImpl;
import org.jboss.shrinkwrap.descriptor.api.orm21.ForeignKey;
import org.jboss.shrinkwrap.descriptor.impl.orm21.ForeignKeyImpl;
import org.jboss.shrinkwrap.descriptor.api.orm21.UniqueConstraint;
import org.jboss.shrinkwrap.descriptor.impl.orm21.UniqueConstraintImpl;
import org.jboss.shrinkwrap.descriptor.api.orm21.Index;
import org.jboss.shrinkwrap.descriptor.impl.orm21.IndexImpl;

/**
 * This class implements the <code> collection-table </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class CollectionTableImpl<T> implements Child<T>, CollectionTable<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public CollectionTableImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public CollectionTableImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: CollectionTable ElementName: orm:join-column ElementType : join-column
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>join-column</code> element will be created and returned.
    * Otherwise, the first existing <code>join-column</code> element will be returned.
    * @return the instance defined for the element <code>join-column</code> 
    */
   public JoinColumn<CollectionTable<T>> getOrCreateJoinColumn()
   {
      List<Node> nodeList = childNode.get("join-column");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new JoinColumnImpl<CollectionTable<T>>(this, "join-column", childNode, nodeList.get(0));
      }
      return createJoinColumn();
   }

   /**
    * Creates a new <code>join-column</code> element 
    * @return the new created instance of <code>JoinColumn<CollectionTable<T>></code> 
    */
   public JoinColumn<CollectionTable<T>> createJoinColumn()
   {
      return new JoinColumnImpl<CollectionTable<T>>(this, "join-column", childNode);
   }

   /**
    * Returns all <code>join-column</code> elements
    * @return list of <code>join-column</code> 
    */
   public List<JoinColumn<CollectionTable<T>>> getAllJoinColumn()
   {
      List<JoinColumn<CollectionTable<T>>> list = new ArrayList<JoinColumn<CollectionTable<T>>>();
      List<Node> nodeList = childNode.get("join-column");
      for(Node node: nodeList)
      {
         JoinColumn<CollectionTable<T>>  type = new JoinColumnImpl<CollectionTable<T>>(this, "join-column", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>join-column</code> elements 
    * @return the current instance of <code>JoinColumn<CollectionTable<T>></code> 
    */
   public CollectionTable<T> removeAllJoinColumn()
   {
      childNode.removeChildren("join-column");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: CollectionTable ElementName: orm:foreign-key ElementType : foreign-key
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>foreign-key</code> element with the given value will be created.
    * Otherwise, the existing <code>foreign-key</code> element will be returned.
    * @return  a new or existing instance of <code>ForeignKey<CollectionTable<T>></code> 
    */
   public ForeignKey<CollectionTable<T>> getOrCreateForeignKey()
   {
      Node node = childNode.getOrCreate("foreign-key");
      ForeignKey<CollectionTable<T>> foreignKey = new ForeignKeyImpl<CollectionTable<T>>(this, "foreign-key", childNode, node);
      return foreignKey;
   }

   /**
    * Removes the <code>foreign-key</code> element 
    * @return the current instance of <code>CollectionTable<T></code> 
    */
   public CollectionTable<T> removeForeignKey()
   {
      childNode.removeChildren("foreign-key");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: CollectionTable ElementName: orm:unique-constraint ElementType : unique-constraint
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>unique-constraint</code> element will be created and returned.
    * Otherwise, the first existing <code>unique-constraint</code> element will be returned.
    * @return the instance defined for the element <code>unique-constraint</code> 
    */
   public UniqueConstraint<CollectionTable<T>> getOrCreateUniqueConstraint()
   {
      List<Node> nodeList = childNode.get("unique-constraint");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new UniqueConstraintImpl<CollectionTable<T>>(this, "unique-constraint", childNode, nodeList.get(0));
      }
      return createUniqueConstraint();
   }

   /**
    * Creates a new <code>unique-constraint</code> element 
    * @return the new created instance of <code>UniqueConstraint<CollectionTable<T>></code> 
    */
   public UniqueConstraint<CollectionTable<T>> createUniqueConstraint()
   {
      return new UniqueConstraintImpl<CollectionTable<T>>(this, "unique-constraint", childNode);
   }

   /**
    * Returns all <code>unique-constraint</code> elements
    * @return list of <code>unique-constraint</code> 
    */
   public List<UniqueConstraint<CollectionTable<T>>> getAllUniqueConstraint()
   {
      List<UniqueConstraint<CollectionTable<T>>> list = new ArrayList<UniqueConstraint<CollectionTable<T>>>();
      List<Node> nodeList = childNode.get("unique-constraint");
      for(Node node: nodeList)
      {
         UniqueConstraint<CollectionTable<T>>  type = new UniqueConstraintImpl<CollectionTable<T>>(this, "unique-constraint", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>unique-constraint</code> elements 
    * @return the current instance of <code>UniqueConstraint<CollectionTable<T>></code> 
    */
   public CollectionTable<T> removeAllUniqueConstraint()
   {
      childNode.removeChildren("unique-constraint");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: CollectionTable ElementName: orm:index ElementType : index
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>index</code> element will be created and returned.
    * Otherwise, the first existing <code>index</code> element will be returned.
    * @return the instance defined for the element <code>index</code> 
    */
   public Index<CollectionTable<T>> getOrCreateIndex()
   {
      List<Node> nodeList = childNode.get("index");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new IndexImpl<CollectionTable<T>>(this, "index", childNode, nodeList.get(0));
      }
      return createIndex();
   }

   /**
    * Creates a new <code>index</code> element 
    * @return the new created instance of <code>Index<CollectionTable<T>></code> 
    */
   public Index<CollectionTable<T>> createIndex()
   {
      return new IndexImpl<CollectionTable<T>>(this, "index", childNode);
   }

   /**
    * Returns all <code>index</code> elements
    * @return list of <code>index</code> 
    */
   public List<Index<CollectionTable<T>>> getAllIndex()
   {
      List<Index<CollectionTable<T>>> list = new ArrayList<Index<CollectionTable<T>>>();
      List<Node> nodeList = childNode.get("index");
      for(Node node: nodeList)
      {
         Index<CollectionTable<T>>  type = new IndexImpl<CollectionTable<T>>(this, "index", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>index</code> elements 
    * @return the current instance of <code>Index<CollectionTable<T>></code> 
    */
   public CollectionTable<T> removeAllIndex()
   {
      childNode.removeChildren("index");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: CollectionTable ElementName: xsd:string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>CollectionTable<T></code> 
    */
   public CollectionTable<T> name(String name)
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
    * @return the current instance of <code>CollectionTable<T></code> 
    */
   public CollectionTable<T> removeName()
   {
      childNode.removeAttribute("name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: CollectionTable ElementName: xsd:string ElementType : catalog
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>catalog</code> attribute
    * @param catalog the value for the attribute <code>catalog</code> 
    * @return the current instance of <code>CollectionTable<T></code> 
    */
   public CollectionTable<T> catalog(String catalog)
   {
      childNode.attribute("catalog", catalog);
      return this;
   }

   /**
    * Returns the <code>catalog</code> attribute
    * @return the value defined for the attribute <code>catalog</code> 
    */
      public String getCatalog()
   {
      return childNode.getAttribute("catalog");
   }

   /**
    * Removes the <code>catalog</code> attribute 
    * @return the current instance of <code>CollectionTable<T></code> 
    */
   public CollectionTable<T> removeCatalog()
   {
      childNode.removeAttribute("catalog");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: CollectionTable ElementName: xsd:string ElementType : schema
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>schema</code> attribute
    * @param schema the value for the attribute <code>schema</code> 
    * @return the current instance of <code>CollectionTable<T></code> 
    */
   public CollectionTable<T> schema(String schema)
   {
      childNode.attribute("schema", schema);
      return this;
   }

   /**
    * Returns the <code>schema</code> attribute
    * @return the value defined for the attribute <code>schema</code> 
    */
      public String getSchema()
   {
      return childNode.getAttribute("schema");
   }

   /**
    * Removes the <code>schema</code> attribute 
    * @return the current instance of <code>CollectionTable<T></code> 
    */
   public CollectionTable<T> removeSchema()
   {
      childNode.removeAttribute("schema");
      return this;
   }
}
