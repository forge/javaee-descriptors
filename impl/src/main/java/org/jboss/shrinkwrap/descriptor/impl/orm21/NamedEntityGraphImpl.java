package org.jboss.shrinkwrap.descriptor.impl.orm21; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.orm21.NamedAttributeNode;
import org.jboss.shrinkwrap.descriptor.api.orm21.NamedEntityGraph;
import org.jboss.shrinkwrap.descriptor.api.orm21.NamedSubgraph;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> named-entity-graph </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class NamedEntityGraphImpl<T> implements Child<T>, NamedEntityGraph<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public NamedEntityGraphImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public NamedEntityGraphImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: NamedEntityGraph ElementName: orm:named-attribute-node ElementType : named-attribute-node
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>named-attribute-node</code> element will be created and returned.
    * Otherwise, the first existing <code>named-attribute-node</code> element will be returned.
    * @return the instance defined for the element <code>named-attribute-node</code> 
    */
   public NamedAttributeNode<NamedEntityGraph<T>> getOrCreateNamedAttributeNode()
   {
      List<Node> nodeList = childNode.get("named-attribute-node");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new NamedAttributeNodeImpl<NamedEntityGraph<T>>(this, "named-attribute-node", childNode, nodeList.get(0));
      }
      return createNamedAttributeNode();
   }

   /**
    * Creates a new <code>named-attribute-node</code> element 
    * @return the new created instance of <code>NamedAttributeNode<NamedEntityGraph<T>></code> 
    */
   public NamedAttributeNode<NamedEntityGraph<T>> createNamedAttributeNode()
   {
      return new NamedAttributeNodeImpl<NamedEntityGraph<T>>(this, "named-attribute-node", childNode);
   }

   /**
    * Returns all <code>named-attribute-node</code> elements
    * @return list of <code>named-attribute-node</code> 
    */
   public List<NamedAttributeNode<NamedEntityGraph<T>>> getAllNamedAttributeNode()
   {
      List<NamedAttributeNode<NamedEntityGraph<T>>> list = new ArrayList<NamedAttributeNode<NamedEntityGraph<T>>>();
      List<Node> nodeList = childNode.get("named-attribute-node");
      for(Node node: nodeList)
      {
         NamedAttributeNode<NamedEntityGraph<T>>  type = new NamedAttributeNodeImpl<NamedEntityGraph<T>>(this, "named-attribute-node", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>named-attribute-node</code> elements 
    * @return the current instance of <code>NamedAttributeNode<NamedEntityGraph<T>></code> 
    */
   public NamedEntityGraph<T> removeAllNamedAttributeNode()
   {
      childNode.removeChildren("named-attribute-node");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: NamedEntityGraph ElementName: orm:named-subgraph ElementType : subgraph
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>subgraph</code> element will be created and returned.
    * Otherwise, the first existing <code>subgraph</code> element will be returned.
    * @return the instance defined for the element <code>subgraph</code> 
    */
   public NamedSubgraph<NamedEntityGraph<T>> getOrCreateSubgraph()
   {
      List<Node> nodeList = childNode.get("subgraph");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new NamedSubgraphImpl<NamedEntityGraph<T>>(this, "subgraph", childNode, nodeList.get(0));
      }
      return createSubgraph();
   }

   /**
    * Creates a new <code>subgraph</code> element 
    * @return the new created instance of <code>NamedSubgraph<NamedEntityGraph<T>></code> 
    */
   public NamedSubgraph<NamedEntityGraph<T>> createSubgraph()
   {
      return new NamedSubgraphImpl<NamedEntityGraph<T>>(this, "subgraph", childNode);
   }

   /**
    * Returns all <code>subgraph</code> elements
    * @return list of <code>subgraph</code> 
    */
   public List<NamedSubgraph<NamedEntityGraph<T>>> getAllSubgraph()
   {
      List<NamedSubgraph<NamedEntityGraph<T>>> list = new ArrayList<NamedSubgraph<NamedEntityGraph<T>>>();
      List<Node> nodeList = childNode.get("subgraph");
      for(Node node: nodeList)
      {
         NamedSubgraph<NamedEntityGraph<T>>  type = new NamedSubgraphImpl<NamedEntityGraph<T>>(this, "subgraph", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>subgraph</code> elements 
    * @return the current instance of <code>NamedSubgraph<NamedEntityGraph<T>></code> 
    */
   public NamedEntityGraph<T> removeAllSubgraph()
   {
      childNode.removeChildren("subgraph");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: NamedEntityGraph ElementName: orm:named-subgraph ElementType : subclass-subgraph
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>subclass-subgraph</code> element will be created and returned.
    * Otherwise, the first existing <code>subclass-subgraph</code> element will be returned.
    * @return the instance defined for the element <code>subclass-subgraph</code> 
    */
   public NamedSubgraph<NamedEntityGraph<T>> getOrCreateSubclassSubgraph()
   {
      List<Node> nodeList = childNode.get("subclass-subgraph");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new NamedSubgraphImpl<NamedEntityGraph<T>>(this, "subclass-subgraph", childNode, nodeList.get(0));
      }
      return createSubclassSubgraph();
   }

   /**
    * Creates a new <code>subclass-subgraph</code> element 
    * @return the new created instance of <code>NamedSubgraph<NamedEntityGraph<T>></code> 
    */
   public NamedSubgraph<NamedEntityGraph<T>> createSubclassSubgraph()
   {
      return new NamedSubgraphImpl<NamedEntityGraph<T>>(this, "subclass-subgraph", childNode);
   }

   /**
    * Returns all <code>subclass-subgraph</code> elements
    * @return list of <code>subclass-subgraph</code> 
    */
   public List<NamedSubgraph<NamedEntityGraph<T>>> getAllSubclassSubgraph()
   {
      List<NamedSubgraph<NamedEntityGraph<T>>> list = new ArrayList<NamedSubgraph<NamedEntityGraph<T>>>();
      List<Node> nodeList = childNode.get("subclass-subgraph");
      for(Node node: nodeList)
      {
         NamedSubgraph<NamedEntityGraph<T>>  type = new NamedSubgraphImpl<NamedEntityGraph<T>>(this, "subclass-subgraph", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>subclass-subgraph</code> elements 
    * @return the current instance of <code>NamedSubgraph<NamedEntityGraph<T>></code> 
    */
   public NamedEntityGraph<T> removeAllSubclassSubgraph()
   {
      childNode.removeChildren("subclass-subgraph");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: NamedEntityGraph ElementName: xsd:string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>NamedEntityGraph<T></code> 
    */
   public NamedEntityGraph<T> name(String name)
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
    * @return the current instance of <code>NamedEntityGraph<T></code> 
    */
   public NamedEntityGraph<T> removeName()
   {
      childNode.removeAttribute("name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: NamedEntityGraph ElementName: xsd:boolean ElementType : include-all-attributes
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>include-all-attributes</code> attribute
    * @param includeAllAttributes the value for the attribute <code>include-all-attributes</code> 
    * @return the current instance of <code>NamedEntityGraph<T></code> 
    */
   public NamedEntityGraph<T> includeAllAttributes(Boolean includeAllAttributes)
   {
      childNode.attribute("include-all-attributes", includeAllAttributes);
      return this;
   }

   /**
    * Returns the <code>include-all-attributes</code> attribute
    * @return the value defined for the attribute <code>include-all-attributes</code> 
    */
   public Boolean isIncludeAllAttributes()
   {
      return Strings.isTrue(childNode.getAttribute("include-all-attributes"));
   }

   /**
    * Removes the <code>include-all-attributes</code> attribute 
    * @return the current instance of <code>NamedEntityGraph<T></code> 
    */
   public NamedEntityGraph<T> removeIncludeAllAttributes()
   {
      childNode.removeAttribute("include-all-attributes");
      return this;
   }
}
