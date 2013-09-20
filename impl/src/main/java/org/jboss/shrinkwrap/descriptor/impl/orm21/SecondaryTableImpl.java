package org.jboss.shrinkwrap.descriptor.impl.orm21; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.orm21.ForeignKey;
import org.jboss.shrinkwrap.descriptor.api.orm21.Index;
import org.jboss.shrinkwrap.descriptor.api.orm21.PrimaryKeyJoinColumn;
import org.jboss.shrinkwrap.descriptor.api.orm21.SecondaryTable;
import org.jboss.shrinkwrap.descriptor.api.orm21.UniqueConstraint;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> secondary-table </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class SecondaryTableImpl<T> implements Child<T>, SecondaryTable<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public SecondaryTableImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public SecondaryTableImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SecondaryTable ElementName: orm:primary-key-join-column ElementType : primary-key-join-column
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>primary-key-join-column</code> element will be created and returned.
    * Otherwise, the first existing <code>primary-key-join-column</code> element will be returned.
    * @return the instance defined for the element <code>primary-key-join-column</code> 
    */
   public PrimaryKeyJoinColumn<SecondaryTable<T>> getOrCreatePrimaryKeyJoinColumn()
   {
      List<Node> nodeList = childNode.get("primary-key-join-column");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new PrimaryKeyJoinColumnImpl<SecondaryTable<T>>(this, "primary-key-join-column", childNode, nodeList.get(0));
      }
      return createPrimaryKeyJoinColumn();
   }

   /**
    * Creates a new <code>primary-key-join-column</code> element 
    * @return the new created instance of <code>PrimaryKeyJoinColumn<SecondaryTable<T>></code> 
    */
   public PrimaryKeyJoinColumn<SecondaryTable<T>> createPrimaryKeyJoinColumn()
   {
      return new PrimaryKeyJoinColumnImpl<SecondaryTable<T>>(this, "primary-key-join-column", childNode);
   }

   /**
    * Returns all <code>primary-key-join-column</code> elements
    * @return list of <code>primary-key-join-column</code> 
    */
   public List<PrimaryKeyJoinColumn<SecondaryTable<T>>> getAllPrimaryKeyJoinColumn()
   {
      List<PrimaryKeyJoinColumn<SecondaryTable<T>>> list = new ArrayList<PrimaryKeyJoinColumn<SecondaryTable<T>>>();
      List<Node> nodeList = childNode.get("primary-key-join-column");
      for(Node node: nodeList)
      {
         PrimaryKeyJoinColumn<SecondaryTable<T>>  type = new PrimaryKeyJoinColumnImpl<SecondaryTable<T>>(this, "primary-key-join-column", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>primary-key-join-column</code> elements 
    * @return the current instance of <code>PrimaryKeyJoinColumn<SecondaryTable<T>></code> 
    */
   public SecondaryTable<T> removeAllPrimaryKeyJoinColumn()
   {
      childNode.removeChildren("primary-key-join-column");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SecondaryTable ElementName: orm:foreign-key ElementType : primary-key-foreign-key
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>primary-key-foreign-key</code> element with the given value will be created.
    * Otherwise, the existing <code>primary-key-foreign-key</code> element will be returned.
    * @return  a new or existing instance of <code>ForeignKey<SecondaryTable<T>></code> 
    */
   public ForeignKey<SecondaryTable<T>> getOrCreatePrimaryKeyForeignKey()
   {
      Node node = childNode.getOrCreate("primary-key-foreign-key");
      ForeignKey<SecondaryTable<T>> primaryKeyForeignKey = new ForeignKeyImpl<SecondaryTable<T>>(this, "primary-key-foreign-key", childNode, node);
      return primaryKeyForeignKey;
   }

   /**
    * Removes the <code>primary-key-foreign-key</code> element 
    * @return the current instance of <code>SecondaryTable<T></code> 
    */
   public SecondaryTable<T> removePrimaryKeyForeignKey()
   {
      childNode.removeChildren("primary-key-foreign-key");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SecondaryTable ElementName: orm:unique-constraint ElementType : unique-constraint
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>unique-constraint</code> element will be created and returned.
    * Otherwise, the first existing <code>unique-constraint</code> element will be returned.
    * @return the instance defined for the element <code>unique-constraint</code> 
    */
   public UniqueConstraint<SecondaryTable<T>> getOrCreateUniqueConstraint()
   {
      List<Node> nodeList = childNode.get("unique-constraint");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new UniqueConstraintImpl<SecondaryTable<T>>(this, "unique-constraint", childNode, nodeList.get(0));
      }
      return createUniqueConstraint();
   }

   /**
    * Creates a new <code>unique-constraint</code> element 
    * @return the new created instance of <code>UniqueConstraint<SecondaryTable<T>></code> 
    */
   public UniqueConstraint<SecondaryTable<T>> createUniqueConstraint()
   {
      return new UniqueConstraintImpl<SecondaryTable<T>>(this, "unique-constraint", childNode);
   }

   /**
    * Returns all <code>unique-constraint</code> elements
    * @return list of <code>unique-constraint</code> 
    */
   public List<UniqueConstraint<SecondaryTable<T>>> getAllUniqueConstraint()
   {
      List<UniqueConstraint<SecondaryTable<T>>> list = new ArrayList<UniqueConstraint<SecondaryTable<T>>>();
      List<Node> nodeList = childNode.get("unique-constraint");
      for(Node node: nodeList)
      {
         UniqueConstraint<SecondaryTable<T>>  type = new UniqueConstraintImpl<SecondaryTable<T>>(this, "unique-constraint", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>unique-constraint</code> elements 
    * @return the current instance of <code>UniqueConstraint<SecondaryTable<T>></code> 
    */
   public SecondaryTable<T> removeAllUniqueConstraint()
   {
      childNode.removeChildren("unique-constraint");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SecondaryTable ElementName: orm:index ElementType : index
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>index</code> element will be created and returned.
    * Otherwise, the first existing <code>index</code> element will be returned.
    * @return the instance defined for the element <code>index</code> 
    */
   public Index<SecondaryTable<T>> getOrCreateIndex()
   {
      List<Node> nodeList = childNode.get("index");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new IndexImpl<SecondaryTable<T>>(this, "index", childNode, nodeList.get(0));
      }
      return createIndex();
   }

   /**
    * Creates a new <code>index</code> element 
    * @return the new created instance of <code>Index<SecondaryTable<T>></code> 
    */
   public Index<SecondaryTable<T>> createIndex()
   {
      return new IndexImpl<SecondaryTable<T>>(this, "index", childNode);
   }

   /**
    * Returns all <code>index</code> elements
    * @return list of <code>index</code> 
    */
   public List<Index<SecondaryTable<T>>> getAllIndex()
   {
      List<Index<SecondaryTable<T>>> list = new ArrayList<Index<SecondaryTable<T>>>();
      List<Node> nodeList = childNode.get("index");
      for(Node node: nodeList)
      {
         Index<SecondaryTable<T>>  type = new IndexImpl<SecondaryTable<T>>(this, "index", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>index</code> elements 
    * @return the current instance of <code>Index<SecondaryTable<T>></code> 
    */
   public SecondaryTable<T> removeAllIndex()
   {
      childNode.removeChildren("index");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SecondaryTable ElementName: xsd:string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>SecondaryTable<T></code> 
    */
   public SecondaryTable<T> name(String name)
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
    * @return the current instance of <code>SecondaryTable<T></code> 
    */
   public SecondaryTable<T> removeName()
   {
      childNode.removeAttribute("name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SecondaryTable ElementName: xsd:string ElementType : catalog
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>catalog</code> attribute
    * @param catalog the value for the attribute <code>catalog</code> 
    * @return the current instance of <code>SecondaryTable<T></code> 
    */
   public SecondaryTable<T> catalog(String catalog)
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
    * @return the current instance of <code>SecondaryTable<T></code> 
    */
   public SecondaryTable<T> removeCatalog()
   {
      childNode.removeAttribute("catalog");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SecondaryTable ElementName: xsd:string ElementType : schema
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>schema</code> attribute
    * @param schema the value for the attribute <code>schema</code> 
    * @return the current instance of <code>SecondaryTable<T></code> 
    */
   public SecondaryTable<T> schema(String schema)
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
    * @return the current instance of <code>SecondaryTable<T></code> 
    */
   public SecondaryTable<T> removeSchema()
   {
      childNode.removeAttribute("schema");
      return this;
   }
}
