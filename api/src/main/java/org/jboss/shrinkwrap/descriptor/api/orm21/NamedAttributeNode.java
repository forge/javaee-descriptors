package org.jboss.shrinkwrap.descriptor.api.orm21; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> named-attribute-node </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface NamedAttributeNode<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: NamedAttributeNode ElementName: xsd:string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>NamedAttributeNode<T></code> 
    */
   public NamedAttributeNode<T> name(String name);

   /**
    * Returns the <code>name</code> attribute
    * @return the value defined for the attribute <code>name</code> 
    */
   public String getName();

   /**
    * Removes the <code>name</code> attribute 
    * @return the current instance of <code>NamedAttributeNode<T></code> 
    */
   public NamedAttributeNode<T> removeName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: NamedAttributeNode ElementName: xsd:string ElementType : subgraph
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>subgraph</code> attribute
    * @param subgraph the value for the attribute <code>subgraph</code> 
    * @return the current instance of <code>NamedAttributeNode<T></code> 
    */
   public NamedAttributeNode<T> subgraph(String subgraph);

   /**
    * Returns the <code>subgraph</code> attribute
    * @return the value defined for the attribute <code>subgraph</code> 
    */
   public String getSubgraph();

   /**
    * Removes the <code>subgraph</code> attribute 
    * @return the current instance of <code>NamedAttributeNode<T></code> 
    */
   public NamedAttributeNode<T> removeSubgraph();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: NamedAttributeNode ElementName: xsd:string ElementType : key-subgraph
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>key-subgraph</code> attribute
    * @param keySubgraph the value for the attribute <code>key-subgraph</code> 
    * @return the current instance of <code>NamedAttributeNode<T></code> 
    */
   public NamedAttributeNode<T> keySubgraph(String keySubgraph);

   /**
    * Returns the <code>key-subgraph</code> attribute
    * @return the value defined for the attribute <code>key-subgraph</code> 
    */
   public String getKeySubgraph();

   /**
    * Removes the <code>key-subgraph</code> attribute 
    * @return the current instance of <code>NamedAttributeNode<T></code> 
    */
   public NamedAttributeNode<T> removeKeySubgraph();
}
