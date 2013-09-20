package org.jboss.shrinkwrap.descriptor.impl.jobXML10; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.Properties;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.Property;
import org.jboss.shrinkwrap.descriptor.impl.jobXML10.PropertyImpl;

/**
 * This class implements the <code> Properties </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class PropertiesImpl<T> implements Child<T>, Properties<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public PropertiesImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public PropertiesImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Properties ElementName: jsl:Property ElementType : property
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>property</code> element will be created and returned.
    * Otherwise, the first existing <code>property</code> element will be returned.
    * @return the instance defined for the element <code>property</code> 
    */
   public Property<Properties<T>> getOrCreateProperty()
   {
      List<Node> nodeList = childNode.get("property");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new PropertyImpl<Properties<T>>(this, "property", childNode, nodeList.get(0));
      }
      return createProperty();
   }

   /**
    * Creates a new <code>property</code> element 
    * @return the new created instance of <code>Property<Properties<T>></code> 
    */
   public Property<Properties<T>> createProperty()
   {
      return new PropertyImpl<Properties<T>>(this, "property", childNode);
   }

   /**
    * Returns all <code>property</code> elements
    * @return list of <code>property</code> 
    */
   public List<Property<Properties<T>>> getAllProperty()
   {
      List<Property<Properties<T>>> list = new ArrayList<Property<Properties<T>>>();
      List<Node> nodeList = childNode.get("property");
      for(Node node: nodeList)
      {
         Property<Properties<T>>  type = new PropertyImpl<Properties<T>>(this, "property", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>property</code> elements 
    * @return the current instance of <code>Property<Properties<T>></code> 
    */
   public Properties<T> removeAllProperty()
   {
      childNode.removeChildren("property");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Properties ElementName: xsd:string ElementType : partition
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>partition</code> attribute
    * @param partition the value for the attribute <code>partition</code> 
    * @return the current instance of <code>Properties<T></code> 
    */
   public Properties<T> partition(String partition)
   {
      childNode.attribute("partition", partition);
      return this;
   }

   /**
    * Returns the <code>partition</code> attribute
    * @return the value defined for the attribute <code>partition</code> 
    */
      public String getPartition()
   {
      return childNode.getAttribute("partition");
   }

   /**
    * Removes the <code>partition</code> attribute 
    * @return the current instance of <code>Properties<T></code> 
    */
   public Properties<T> removePartition()
   {
      childNode.removeAttribute("partition");
      return this;
   }
}
