package org.jboss.shrinkwrap.descriptor.impl.orm21; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.orm21.Index;
import org.jboss.shrinkwrap.descriptor.api.orm21.Table;
import org.jboss.shrinkwrap.descriptor.api.orm21.UniqueConstraint;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> table </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class TableImpl<T> implements Child<T>, Table<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public TableImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public TableImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Table ElementName: orm:unique-constraint ElementType : unique-constraint
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>unique-constraint</code> element will be created and returned.
    * Otherwise, the first existing <code>unique-constraint</code> element will be returned.
    * @return the instance defined for the element <code>unique-constraint</code> 
    */
   public UniqueConstraint<Table<T>> getOrCreateUniqueConstraint()
   {
      List<Node> nodeList = childNode.get("unique-constraint");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new UniqueConstraintImpl<Table<T>>(this, "unique-constraint", childNode, nodeList.get(0));
      }
      return createUniqueConstraint();
   }

   /**
    * Creates a new <code>unique-constraint</code> element 
    * @return the new created instance of <code>UniqueConstraint<Table<T>></code> 
    */
   public UniqueConstraint<Table<T>> createUniqueConstraint()
   {
      return new UniqueConstraintImpl<Table<T>>(this, "unique-constraint", childNode);
   }

   /**
    * Returns all <code>unique-constraint</code> elements
    * @return list of <code>unique-constraint</code> 
    */
   public List<UniqueConstraint<Table<T>>> getAllUniqueConstraint()
   {
      List<UniqueConstraint<Table<T>>> list = new ArrayList<UniqueConstraint<Table<T>>>();
      List<Node> nodeList = childNode.get("unique-constraint");
      for(Node node: nodeList)
      {
         UniqueConstraint<Table<T>>  type = new UniqueConstraintImpl<Table<T>>(this, "unique-constraint", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>unique-constraint</code> elements 
    * @return the current instance of <code>UniqueConstraint<Table<T>></code> 
    */
   public Table<T> removeAllUniqueConstraint()
   {
      childNode.removeChildren("unique-constraint");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Table ElementName: orm:index ElementType : index
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>index</code> element will be created and returned.
    * Otherwise, the first existing <code>index</code> element will be returned.
    * @return the instance defined for the element <code>index</code> 
    */
   public Index<Table<T>> getOrCreateIndex()
   {
      List<Node> nodeList = childNode.get("index");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new IndexImpl<Table<T>>(this, "index", childNode, nodeList.get(0));
      }
      return createIndex();
   }

   /**
    * Creates a new <code>index</code> element 
    * @return the new created instance of <code>Index<Table<T>></code> 
    */
   public Index<Table<T>> createIndex()
   {
      return new IndexImpl<Table<T>>(this, "index", childNode);
   }

   /**
    * Returns all <code>index</code> elements
    * @return list of <code>index</code> 
    */
   public List<Index<Table<T>>> getAllIndex()
   {
      List<Index<Table<T>>> list = new ArrayList<Index<Table<T>>>();
      List<Node> nodeList = childNode.get("index");
      for(Node node: nodeList)
      {
         Index<Table<T>>  type = new IndexImpl<Table<T>>(this, "index", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>index</code> elements 
    * @return the current instance of <code>Index<Table<T>></code> 
    */
   public Table<T> removeAllIndex()
   {
      childNode.removeChildren("index");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Table ElementName: xsd:string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>Table<T></code> 
    */
   public Table<T> name(String name)
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
    * @return the current instance of <code>Table<T></code> 
    */
   public Table<T> removeName()
   {
      childNode.removeAttribute("name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Table ElementName: xsd:string ElementType : catalog
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>catalog</code> attribute
    * @param catalog the value for the attribute <code>catalog</code> 
    * @return the current instance of <code>Table<T></code> 
    */
   public Table<T> catalog(String catalog)
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
    * @return the current instance of <code>Table<T></code> 
    */
   public Table<T> removeCatalog()
   {
      childNode.removeAttribute("catalog");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Table ElementName: xsd:string ElementType : schema
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>schema</code> attribute
    * @param schema the value for the attribute <code>schema</code> 
    * @return the current instance of <code>Table<T></code> 
    */
   public Table<T> schema(String schema)
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
    * @return the current instance of <code>Table<T></code> 
    */
   public Table<T> removeSchema()
   {
      childNode.removeAttribute("schema");
      return this;
   }
}
