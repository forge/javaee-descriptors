package org.jboss.shrinkwrap.descriptor.api.jobXML10; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> PartitionPlan </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface PartitionPlan<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PartitionPlan ElementName: jsl:Properties ElementType : properties
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>properties</code> element will be created and returned.
    * Otherwise, the first existing <code>properties</code> element will be returned.
    * @return the instance defined for the element <code>properties</code> 
    */
   public Properties<PartitionPlan<T>> getOrCreateProperties();

   /**
    * Creates a new <code>properties</code> element 
    * @return the new created instance of <code>Properties<PartitionPlan<T>></code> 
    */
   public Properties<PartitionPlan<T>> createProperties();

   /**
    * Returns all <code>properties</code> elements
    * @return list of <code>properties</code> 
    */
   public List<Properties<PartitionPlan<T>>> getAllProperties();

   /**
    * Removes all <code>properties</code> elements 
    * @return the current instance of <code>Properties<PartitionPlan<T>></code> 
    */
   public PartitionPlan<T> removeAllProperties();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PartitionPlan ElementName: xsd:string ElementType : partitions
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>partitions</code> attribute
    * @param partitions the value for the attribute <code>partitions</code> 
    * @return the current instance of <code>PartitionPlan<T></code> 
    */
   public PartitionPlan<T> partitions(String partitions);

   /**
    * Returns the <code>partitions</code> attribute
    * @return the value defined for the attribute <code>partitions</code> 
    */
   public String getPartitions();

   /**
    * Removes the <code>partitions</code> attribute 
    * @return the current instance of <code>PartitionPlan<T></code> 
    */
   public PartitionPlan<T> removePartitions();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PartitionPlan ElementName: xsd:string ElementType : threads
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>threads</code> attribute
    * @param threads the value for the attribute <code>threads</code> 
    * @return the current instance of <code>PartitionPlan<T></code> 
    */
   public PartitionPlan<T> threads(String threads);

   /**
    * Returns the <code>threads</code> attribute
    * @return the value defined for the attribute <code>threads</code> 
    */
   public String getThreads();

   /**
    * Removes the <code>threads</code> attribute 
    * @return the current instance of <code>PartitionPlan<T></code> 
    */
   public PartitionPlan<T> removeThreads();
}
