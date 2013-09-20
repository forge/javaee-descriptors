package org.jboss.shrinkwrap.descriptor.api.jobXML10; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> Properties </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface Properties<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Properties ElementName: jsl:Property ElementType : property
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>property</code> element will be created and returned.
    * Otherwise, the first existing <code>property</code> element will be returned.
    * @return the instance defined for the element <code>property</code> 
    */
   public Property<Properties<T>> getOrCreateProperty();

   /**
    * Creates a new <code>property</code> element 
    * @return the new created instance of <code>Property<Properties<T>></code> 
    */
   public Property<Properties<T>> createProperty();

   /**
    * Returns all <code>property</code> elements
    * @return list of <code>property</code> 
    */
   public List<Property<Properties<T>>> getAllProperty();

   /**
    * Removes all <code>property</code> elements 
    * @return the current instance of <code>Property<Properties<T>></code> 
    */
   public Properties<T> removeAllProperty();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Properties ElementName: xsd:string ElementType : partition
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>partition</code> attribute
    * @param partition the value for the attribute <code>partition</code> 
    * @return the current instance of <code>Properties<T></code> 
    */
   public Properties<T> partition(String partition);

   /**
    * Returns the <code>partition</code> attribute
    * @return the value defined for the attribute <code>partition</code> 
    */
   public String getPartition();

   /**
    * Removes the <code>partition</code> attribute 
    * @return the current instance of <code>Properties<T></code> 
    */
   public Properties<T> removePartition();
}
