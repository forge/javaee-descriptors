package org.jboss.shrinkwrap.descriptor.impl.orm21; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.orm21.NamedAttributeNode;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;

/**
 * This class implements the <code> named-attribute-node </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class NamedAttributeNodeImpl<T> implements Child<T>, NamedAttributeNode<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public NamedAttributeNodeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public NamedAttributeNodeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: NamedAttributeNode ElementName: xsd:string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>NamedAttributeNode<T></code> 
    */
   public NamedAttributeNode<T> name(String name)
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
    * @return the current instance of <code>NamedAttributeNode<T></code> 
    */
   public NamedAttributeNode<T> removeName()
   {
      childNode.removeAttribute("name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: NamedAttributeNode ElementName: xsd:string ElementType : subgraph
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>subgraph</code> attribute
    * @param subgraph the value for the attribute <code>subgraph</code> 
    * @return the current instance of <code>NamedAttributeNode<T></code> 
    */
   public NamedAttributeNode<T> subgraph(String subgraph)
   {
      childNode.attribute("subgraph", subgraph);
      return this;
   }

   /**
    * Returns the <code>subgraph</code> attribute
    * @return the value defined for the attribute <code>subgraph</code> 
    */
      public String getSubgraph()
   {
      return childNode.getAttribute("subgraph");
   }

   /**
    * Removes the <code>subgraph</code> attribute 
    * @return the current instance of <code>NamedAttributeNode<T></code> 
    */
   public NamedAttributeNode<T> removeSubgraph()
   {
      childNode.removeAttribute("subgraph");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: NamedAttributeNode ElementName: xsd:string ElementType : key-subgraph
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>key-subgraph</code> attribute
    * @param keySubgraph the value for the attribute <code>key-subgraph</code> 
    * @return the current instance of <code>NamedAttributeNode<T></code> 
    */
   public NamedAttributeNode<T> keySubgraph(String keySubgraph)
   {
      childNode.attribute("key-subgraph", keySubgraph);
      return this;
   }

   /**
    * Returns the <code>key-subgraph</code> attribute
    * @return the value defined for the attribute <code>key-subgraph</code> 
    */
      public String getKeySubgraph()
   {
      return childNode.getAttribute("key-subgraph");
   }

   /**
    * Removes the <code>key-subgraph</code> attribute 
    * @return the current instance of <code>NamedAttributeNode<T></code> 
    */
   public NamedAttributeNode<T> removeKeySubgraph()
   {
      childNode.removeAttribute("key-subgraph");
      return this;
   }
}
