package org.jboss.shrinkwrap.descriptor.api.orm21; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.orm21.NamedAttributeNode;
/**
 * This interface defines the contract for the <code> named-subgraph </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface NamedSubgraph<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: NamedSubgraph ElementName: orm:named-attribute-node ElementType : named-attribute-node
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>named-attribute-node</code> element will be created and returned.
    * Otherwise, the first existing <code>named-attribute-node</code> element will be returned.
    * @return the instance defined for the element <code>named-attribute-node</code> 
    */
   public NamedAttributeNode<NamedSubgraph<T>> getOrCreateNamedAttributeNode();

   /**
    * Creates a new <code>named-attribute-node</code> element 
    * @return the new created instance of <code>NamedAttributeNode<NamedSubgraph<T>></code> 
    */
   public NamedAttributeNode<NamedSubgraph<T>> createNamedAttributeNode();

   /**
    * Returns all <code>named-attribute-node</code> elements
    * @return list of <code>named-attribute-node</code> 
    */
   public List<NamedAttributeNode<NamedSubgraph<T>>> getAllNamedAttributeNode();

   /**
    * Removes all <code>named-attribute-node</code> elements 
    * @return the current instance of <code>NamedAttributeNode<NamedSubgraph<T>></code> 
    */
   public NamedSubgraph<T> removeAllNamedAttributeNode();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: NamedSubgraph ElementName: xsd:string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>NamedSubgraph<T></code> 
    */
   public NamedSubgraph<T> name(String name);

   /**
    * Returns the <code>name</code> attribute
    * @return the value defined for the attribute <code>name</code> 
    */
   public String getName();

   /**
    * Removes the <code>name</code> attribute 
    * @return the current instance of <code>NamedSubgraph<T></code> 
    */
   public NamedSubgraph<T> removeName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: NamedSubgraph ElementName: xsd:string ElementType : class
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>class</code> attribute
    * @param clazz the value for the attribute <code>class</code> 
    * @return the current instance of <code>NamedSubgraph<T></code> 
    */
   public NamedSubgraph<T> clazz(String clazz);

   /**
    * Returns the <code>class</code> attribute
    * @return the value defined for the attribute <code>class</code> 
    */
   public String getClazz();

   /**
    * Removes the <code>class</code> attribute 
    * @return the current instance of <code>NamedSubgraph<T></code> 
    */
   public NamedSubgraph<T> removeClazzAttr();
}
