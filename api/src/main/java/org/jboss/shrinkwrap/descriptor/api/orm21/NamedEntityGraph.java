package org.jboss.shrinkwrap.descriptor.api.orm21; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.orm21.NamedAttributeNode;
import org.jboss.shrinkwrap.descriptor.api.orm21.NamedSubgraph;
import org.jboss.shrinkwrap.descriptor.api.orm21.NamedSubgraph;
/**
 * This interface defines the contract for the <code> named-entity-graph </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface NamedEntityGraph<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: NamedEntityGraph ElementName: orm:named-attribute-node ElementType : named-attribute-node
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>named-attribute-node</code> element will be created and returned.
    * Otherwise, the first existing <code>named-attribute-node</code> element will be returned.
    * @return the instance defined for the element <code>named-attribute-node</code> 
    */
   public NamedAttributeNode<NamedEntityGraph<T>> getOrCreateNamedAttributeNode();

   /**
    * Creates a new <code>named-attribute-node</code> element 
    * @return the new created instance of <code>NamedAttributeNode<NamedEntityGraph<T>></code> 
    */
   public NamedAttributeNode<NamedEntityGraph<T>> createNamedAttributeNode();

   /**
    * Returns all <code>named-attribute-node</code> elements
    * @return list of <code>named-attribute-node</code> 
    */
   public List<NamedAttributeNode<NamedEntityGraph<T>>> getAllNamedAttributeNode();

   /**
    * Removes all <code>named-attribute-node</code> elements 
    * @return the current instance of <code>NamedAttributeNode<NamedEntityGraph<T>></code> 
    */
   public NamedEntityGraph<T> removeAllNamedAttributeNode();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: NamedEntityGraph ElementName: orm:named-subgraph ElementType : subgraph
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>subgraph</code> element will be created and returned.
    * Otherwise, the first existing <code>subgraph</code> element will be returned.
    * @return the instance defined for the element <code>subgraph</code> 
    */
   public NamedSubgraph<NamedEntityGraph<T>> getOrCreateSubgraph();

   /**
    * Creates a new <code>subgraph</code> element 
    * @return the new created instance of <code>NamedSubgraph<NamedEntityGraph<T>></code> 
    */
   public NamedSubgraph<NamedEntityGraph<T>> createSubgraph();

   /**
    * Returns all <code>subgraph</code> elements
    * @return list of <code>subgraph</code> 
    */
   public List<NamedSubgraph<NamedEntityGraph<T>>> getAllSubgraph();

   /**
    * Removes all <code>subgraph</code> elements 
    * @return the current instance of <code>NamedSubgraph<NamedEntityGraph<T>></code> 
    */
   public NamedEntityGraph<T> removeAllSubgraph();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: NamedEntityGraph ElementName: orm:named-subgraph ElementType : subclass-subgraph
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>subclass-subgraph</code> element will be created and returned.
    * Otherwise, the first existing <code>subclass-subgraph</code> element will be returned.
    * @return the instance defined for the element <code>subclass-subgraph</code> 
    */
   public NamedSubgraph<NamedEntityGraph<T>> getOrCreateSubclassSubgraph();

   /**
    * Creates a new <code>subclass-subgraph</code> element 
    * @return the new created instance of <code>NamedSubgraph<NamedEntityGraph<T>></code> 
    */
   public NamedSubgraph<NamedEntityGraph<T>> createSubclassSubgraph();

   /**
    * Returns all <code>subclass-subgraph</code> elements
    * @return list of <code>subclass-subgraph</code> 
    */
   public List<NamedSubgraph<NamedEntityGraph<T>>> getAllSubclassSubgraph();

   /**
    * Removes all <code>subclass-subgraph</code> elements 
    * @return the current instance of <code>NamedSubgraph<NamedEntityGraph<T>></code> 
    */
   public NamedEntityGraph<T> removeAllSubclassSubgraph();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: NamedEntityGraph ElementName: xsd:string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>NamedEntityGraph<T></code> 
    */
   public NamedEntityGraph<T> name(String name);

   /**
    * Returns the <code>name</code> attribute
    * @return the value defined for the attribute <code>name</code> 
    */
   public String getName();

   /**
    * Removes the <code>name</code> attribute 
    * @return the current instance of <code>NamedEntityGraph<T></code> 
    */
   public NamedEntityGraph<T> removeName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: NamedEntityGraph ElementName: xsd:boolean ElementType : include-all-attributes
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>include-all-attributes</code> attribute
    * @param includeAllAttributes the value for the attribute <code>include-all-attributes</code> 
    * @return the current instance of <code>NamedEntityGraph<T></code> 
    */
   public NamedEntityGraph<T> includeAllAttributes(Boolean includeAllAttributes);

   /**
    * Returns the <code>include-all-attributes</code> attribute
    * @return the value defined for the attribute <code>include-all-attributes</code> 
    */
public Boolean isIncludeAllAttributes();

   /**
    * Removes the <code>include-all-attributes</code> attribute 
    * @return the current instance of <code>NamedEntityGraph<T></code> 
    */
   public NamedEntityGraph<T> removeIncludeAllAttributes();
}
