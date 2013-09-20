package org.jboss.shrinkwrap.descriptor.impl.orm21; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.orm21.NamedSubgraph;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.orm21.NamedAttributeNode;
import org.jboss.shrinkwrap.descriptor.impl.orm21.NamedAttributeNodeImpl;

/**
 * This class implements the <code> named-subgraph </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class NamedSubgraphImpl<T> implements Child<T>, NamedSubgraph<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public NamedSubgraphImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public NamedSubgraphImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: NamedSubgraph ElementName: orm:named-attribute-node ElementType : named-attribute-node
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>named-attribute-node</code> element will be created and returned.
    * Otherwise, the first existing <code>named-attribute-node</code> element will be returned.
    * @return the instance defined for the element <code>named-attribute-node</code> 
    */
   public NamedAttributeNode<NamedSubgraph<T>> getOrCreateNamedAttributeNode()
   {
      List<Node> nodeList = childNode.get("named-attribute-node");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new NamedAttributeNodeImpl<NamedSubgraph<T>>(this, "named-attribute-node", childNode, nodeList.get(0));
      }
      return createNamedAttributeNode();
   }

   /**
    * Creates a new <code>named-attribute-node</code> element 
    * @return the new created instance of <code>NamedAttributeNode<NamedSubgraph<T>></code> 
    */
   public NamedAttributeNode<NamedSubgraph<T>> createNamedAttributeNode()
   {
      return new NamedAttributeNodeImpl<NamedSubgraph<T>>(this, "named-attribute-node", childNode);
   }

   /**
    * Returns all <code>named-attribute-node</code> elements
    * @return list of <code>named-attribute-node</code> 
    */
   public List<NamedAttributeNode<NamedSubgraph<T>>> getAllNamedAttributeNode()
   {
      List<NamedAttributeNode<NamedSubgraph<T>>> list = new ArrayList<NamedAttributeNode<NamedSubgraph<T>>>();
      List<Node> nodeList = childNode.get("named-attribute-node");
      for(Node node: nodeList)
      {
         NamedAttributeNode<NamedSubgraph<T>>  type = new NamedAttributeNodeImpl<NamedSubgraph<T>>(this, "named-attribute-node", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>named-attribute-node</code> elements 
    * @return the current instance of <code>NamedAttributeNode<NamedSubgraph<T>></code> 
    */
   public NamedSubgraph<T> removeAllNamedAttributeNode()
   {
      childNode.removeChildren("named-attribute-node");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: NamedSubgraph ElementName: xsd:string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>NamedSubgraph<T></code> 
    */
   public NamedSubgraph<T> name(String name)
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
    * @return the current instance of <code>NamedSubgraph<T></code> 
    */
   public NamedSubgraph<T> removeName()
   {
      childNode.removeAttribute("name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: NamedSubgraph ElementName: xsd:string ElementType : class
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>class</code> attribute
    * @param clazz the value for the attribute <code>class</code> 
    * @return the current instance of <code>NamedSubgraph<T></code> 
    */
   public NamedSubgraph<T> clazz(String clazz)
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
    * @return the current instance of <code>NamedSubgraph<T></code> 
    */
   public NamedSubgraph<T> removeClazzAttr()
   {
      childNode.removeAttribute("class");
      return this;
   }
}
