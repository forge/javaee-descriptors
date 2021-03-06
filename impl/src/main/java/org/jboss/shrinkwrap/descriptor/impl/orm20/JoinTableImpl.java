package org.jboss.shrinkwrap.descriptor.impl.orm20; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.orm20.JoinColumn;
import org.jboss.shrinkwrap.descriptor.api.orm20.JoinTable;
import org.jboss.shrinkwrap.descriptor.api.orm20.UniqueConstraint;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> join-table </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class JoinTableImpl<T> implements Child<T>, JoinTable<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public JoinTableImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public JoinTableImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JoinTable ElementName: orm:join-column ElementType : join-column
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>join-column</code> element will be created and returned.
    * Otherwise, the first existing <code>join-column</code> element will be returned.
    * @return the instance defined for the element <code>join-column</code> 
    */
   public JoinColumn<JoinTable<T>> getOrCreateJoinColumn()
   {
      List<Node> nodeList = childNode.get("join-column");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new JoinColumnImpl<JoinTable<T>>(this, "join-column", childNode, nodeList.get(0));
      }
      return createJoinColumn();
   }

   /**
    * Creates a new <code>join-column</code> element 
    * @return the new created instance of <code>JoinColumn<JoinTable<T>></code> 
    */
   public JoinColumn<JoinTable<T>> createJoinColumn()
   {
      return new JoinColumnImpl<JoinTable<T>>(this, "join-column", childNode);
   }

   /**
    * Returns all <code>join-column</code> elements
    * @return list of <code>join-column</code> 
    */
   public List<JoinColumn<JoinTable<T>>> getAllJoinColumn()
   {
      List<JoinColumn<JoinTable<T>>> list = new ArrayList<JoinColumn<JoinTable<T>>>();
      List<Node> nodeList = childNode.get("join-column");
      for(Node node: nodeList)
      {
         JoinColumn<JoinTable<T>>  type = new JoinColumnImpl<JoinTable<T>>(this, "join-column", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>join-column</code> elements 
    * @return the current instance of <code>JoinColumn<JoinTable<T>></code> 
    */
   public JoinTable<T> removeAllJoinColumn()
   {
      childNode.removeChildren("join-column");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JoinTable ElementName: orm:join-column ElementType : inverse-join-column
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>inverse-join-column</code> element will be created and returned.
    * Otherwise, the first existing <code>inverse-join-column</code> element will be returned.
    * @return the instance defined for the element <code>inverse-join-column</code> 
    */
   public JoinColumn<JoinTable<T>> getOrCreateInverseJoinColumn()
   {
      List<Node> nodeList = childNode.get("inverse-join-column");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new JoinColumnImpl<JoinTable<T>>(this, "inverse-join-column", childNode, nodeList.get(0));
      }
      return createInverseJoinColumn();
   }

   /**
    * Creates a new <code>inverse-join-column</code> element 
    * @return the new created instance of <code>JoinColumn<JoinTable<T>></code> 
    */
   public JoinColumn<JoinTable<T>> createInverseJoinColumn()
   {
      return new JoinColumnImpl<JoinTable<T>>(this, "inverse-join-column", childNode);
   }

   /**
    * Returns all <code>inverse-join-column</code> elements
    * @return list of <code>inverse-join-column</code> 
    */
   public List<JoinColumn<JoinTable<T>>> getAllInverseJoinColumn()
   {
      List<JoinColumn<JoinTable<T>>> list = new ArrayList<JoinColumn<JoinTable<T>>>();
      List<Node> nodeList = childNode.get("inverse-join-column");
      for(Node node: nodeList)
      {
         JoinColumn<JoinTable<T>>  type = new JoinColumnImpl<JoinTable<T>>(this, "inverse-join-column", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>inverse-join-column</code> elements 
    * @return the current instance of <code>JoinColumn<JoinTable<T>></code> 
    */
   public JoinTable<T> removeAllInverseJoinColumn()
   {
      childNode.removeChildren("inverse-join-column");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JoinTable ElementName: orm:unique-constraint ElementType : unique-constraint
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>unique-constraint</code> element will be created and returned.
    * Otherwise, the first existing <code>unique-constraint</code> element will be returned.
    * @return the instance defined for the element <code>unique-constraint</code> 
    */
   public UniqueConstraint<JoinTable<T>> getOrCreateUniqueConstraint()
   {
      List<Node> nodeList = childNode.get("unique-constraint");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new UniqueConstraintImpl<JoinTable<T>>(this, "unique-constraint", childNode, nodeList.get(0));
      }
      return createUniqueConstraint();
   }

   /**
    * Creates a new <code>unique-constraint</code> element 
    * @return the new created instance of <code>UniqueConstraint<JoinTable<T>></code> 
    */
   public UniqueConstraint<JoinTable<T>> createUniqueConstraint()
   {
      return new UniqueConstraintImpl<JoinTable<T>>(this, "unique-constraint", childNode);
   }

   /**
    * Returns all <code>unique-constraint</code> elements
    * @return list of <code>unique-constraint</code> 
    */
   public List<UniqueConstraint<JoinTable<T>>> getAllUniqueConstraint()
   {
      List<UniqueConstraint<JoinTable<T>>> list = new ArrayList<UniqueConstraint<JoinTable<T>>>();
      List<Node> nodeList = childNode.get("unique-constraint");
      for(Node node: nodeList)
      {
         UniqueConstraint<JoinTable<T>>  type = new UniqueConstraintImpl<JoinTable<T>>(this, "unique-constraint", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>unique-constraint</code> elements 
    * @return the current instance of <code>UniqueConstraint<JoinTable<T>></code> 
    */
   public JoinTable<T> removeAllUniqueConstraint()
   {
      childNode.removeChildren("unique-constraint");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JoinTable ElementName: xsd:string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>JoinTable<T></code> 
    */
   public JoinTable<T> name(String name)
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
    * @return the current instance of <code>JoinTable<T></code> 
    */
   public JoinTable<T> removeName()
   {
      childNode.removeAttribute("name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JoinTable ElementName: xsd:string ElementType : catalog
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>catalog</code> attribute
    * @param catalog the value for the attribute <code>catalog</code> 
    * @return the current instance of <code>JoinTable<T></code> 
    */
   public JoinTable<T> catalog(String catalog)
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
    * @return the current instance of <code>JoinTable<T></code> 
    */
   public JoinTable<T> removeCatalog()
   {
      childNode.removeAttribute("catalog");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JoinTable ElementName: xsd:string ElementType : schema
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>schema</code> attribute
    * @param schema the value for the attribute <code>schema</code> 
    * @return the current instance of <code>JoinTable<T></code> 
    */
   public JoinTable<T> schema(String schema)
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
    * @return the current instance of <code>JoinTable<T></code> 
    */
   public JoinTable<T> removeSchema()
   {
      childNode.removeAttribute("schema");
      return this;
   }
}
