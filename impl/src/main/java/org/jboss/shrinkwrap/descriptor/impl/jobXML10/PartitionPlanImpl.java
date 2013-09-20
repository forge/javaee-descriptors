package org.jboss.shrinkwrap.descriptor.impl.jobXML10; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.PartitionPlan;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.Properties;
import org.jboss.shrinkwrap.descriptor.impl.jobXML10.PropertiesImpl;

/**
 * This class implements the <code> PartitionPlan </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class PartitionPlanImpl<T> implements Child<T>, PartitionPlan<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public PartitionPlanImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public PartitionPlanImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PartitionPlan ElementName: jsl:Properties ElementType : properties
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>properties</code> element will be created and returned.
    * Otherwise, the first existing <code>properties</code> element will be returned.
    * @return the instance defined for the element <code>properties</code> 
    */
   public Properties<PartitionPlan<T>> getOrCreateProperties()
   {
      List<Node> nodeList = childNode.get("properties");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new PropertiesImpl<PartitionPlan<T>>(this, "properties", childNode, nodeList.get(0));
      }
      return createProperties();
   }

   /**
    * Creates a new <code>properties</code> element 
    * @return the new created instance of <code>Properties<PartitionPlan<T>></code> 
    */
   public Properties<PartitionPlan<T>> createProperties()
   {
      return new PropertiesImpl<PartitionPlan<T>>(this, "properties", childNode);
   }

   /**
    * Returns all <code>properties</code> elements
    * @return list of <code>properties</code> 
    */
   public List<Properties<PartitionPlan<T>>> getAllProperties()
   {
      List<Properties<PartitionPlan<T>>> list = new ArrayList<Properties<PartitionPlan<T>>>();
      List<Node> nodeList = childNode.get("properties");
      for(Node node: nodeList)
      {
         Properties<PartitionPlan<T>>  type = new PropertiesImpl<PartitionPlan<T>>(this, "properties", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>properties</code> elements 
    * @return the current instance of <code>Properties<PartitionPlan<T>></code> 
    */
   public PartitionPlan<T> removeAllProperties()
   {
      childNode.removeChildren("properties");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PartitionPlan ElementName: xsd:string ElementType : partitions
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>partitions</code> attribute
    * @param partitions the value for the attribute <code>partitions</code> 
    * @return the current instance of <code>PartitionPlan<T></code> 
    */
   public PartitionPlan<T> partitions(String partitions)
   {
      childNode.attribute("partitions", partitions);
      return this;
   }

   /**
    * Returns the <code>partitions</code> attribute
    * @return the value defined for the attribute <code>partitions</code> 
    */
      public String getPartitions()
   {
      return childNode.getAttribute("partitions");
   }

   /**
    * Removes the <code>partitions</code> attribute 
    * @return the current instance of <code>PartitionPlan<T></code> 
    */
   public PartitionPlan<T> removePartitions()
   {
      childNode.removeAttribute("partitions");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PartitionPlan ElementName: xsd:string ElementType : threads
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>threads</code> attribute
    * @param threads the value for the attribute <code>threads</code> 
    * @return the current instance of <code>PartitionPlan<T></code> 
    */
   public PartitionPlan<T> threads(String threads)
   {
      childNode.attribute("threads", threads);
      return this;
   }

   /**
    * Returns the <code>threads</code> attribute
    * @return the value defined for the attribute <code>threads</code> 
    */
      public String getThreads()
   {
      return childNode.getAttribute("threads");
   }

   /**
    * Removes the <code>threads</code> attribute 
    * @return the current instance of <code>PartitionPlan<T></code> 
    */
   public PartitionPlan<T> removeThreads()
   {
      childNode.removeAttribute("threads");
      return this;
   }
}
