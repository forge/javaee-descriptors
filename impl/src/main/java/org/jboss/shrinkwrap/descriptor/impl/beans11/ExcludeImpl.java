package org.jboss.shrinkwrap.descriptor.impl.beans11; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.beans11.Exclude;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.beans11.IfClassAvailable;
import org.jboss.shrinkwrap.descriptor.impl.beans11.IfClassAvailableImpl;
import org.jboss.shrinkwrap.descriptor.api.beans11.IfClassNotAvailable;
import org.jboss.shrinkwrap.descriptor.impl.beans11.IfClassNotAvailableImpl;
import org.jboss.shrinkwrap.descriptor.api.beans11.IfSystemProperty;
import org.jboss.shrinkwrap.descriptor.impl.beans11.IfSystemPropertyImpl;

/**
 * This class implements the <code> exclude </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class ExcludeImpl<T> implements Child<T>, Exclude<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public ExcludeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public ExcludeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Exclude ElementName: javaee:if-class-available ElementType : if-class-available
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>if-class-available</code> element will be created and returned.
    * Otherwise, the first existing <code>if-class-available</code> element will be returned.
    * @return the instance defined for the element <code>if-class-available</code> 
    */
   public IfClassAvailable<Exclude<T>> getOrCreateIfClassAvailable()
   {
      List<Node> nodeList = childNode.get("if-class-available");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new IfClassAvailableImpl<Exclude<T>>(this, "if-class-available", childNode, nodeList.get(0));
      }
      return createIfClassAvailable();
   }

   /**
    * Creates a new <code>if-class-available</code> element 
    * @return the new created instance of <code>IfClassAvailable<Exclude<T>></code> 
    */
   public IfClassAvailable<Exclude<T>> createIfClassAvailable()
   {
      return new IfClassAvailableImpl<Exclude<T>>(this, "if-class-available", childNode);
   }

   /**
    * Returns all <code>if-class-available</code> elements
    * @return list of <code>if-class-available</code> 
    */
   public List<IfClassAvailable<Exclude<T>>> getAllIfClassAvailable()
   {
      List<IfClassAvailable<Exclude<T>>> list = new ArrayList<IfClassAvailable<Exclude<T>>>();
      List<Node> nodeList = childNode.get("if-class-available");
      for(Node node: nodeList)
      {
         IfClassAvailable<Exclude<T>>  type = new IfClassAvailableImpl<Exclude<T>>(this, "if-class-available", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>if-class-available</code> elements 
    * @return the current instance of <code>IfClassAvailable<Exclude<T>></code> 
    */
   public Exclude<T> removeAllIfClassAvailable()
   {
      childNode.removeChildren("if-class-available");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Exclude ElementName: javaee:if-class-not-available ElementType : if-class-not-available
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>if-class-not-available</code> element will be created and returned.
    * Otherwise, the first existing <code>if-class-not-available</code> element will be returned.
    * @return the instance defined for the element <code>if-class-not-available</code> 
    */
   public IfClassNotAvailable<Exclude<T>> getOrCreateIfClassNotAvailable()
   {
      List<Node> nodeList = childNode.get("if-class-not-available");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new IfClassNotAvailableImpl<Exclude<T>>(this, "if-class-not-available", childNode, nodeList.get(0));
      }
      return createIfClassNotAvailable();
   }

   /**
    * Creates a new <code>if-class-not-available</code> element 
    * @return the new created instance of <code>IfClassNotAvailable<Exclude<T>></code> 
    */
   public IfClassNotAvailable<Exclude<T>> createIfClassNotAvailable()
   {
      return new IfClassNotAvailableImpl<Exclude<T>>(this, "if-class-not-available", childNode);
   }

   /**
    * Returns all <code>if-class-not-available</code> elements
    * @return list of <code>if-class-not-available</code> 
    */
   public List<IfClassNotAvailable<Exclude<T>>> getAllIfClassNotAvailable()
   {
      List<IfClassNotAvailable<Exclude<T>>> list = new ArrayList<IfClassNotAvailable<Exclude<T>>>();
      List<Node> nodeList = childNode.get("if-class-not-available");
      for(Node node: nodeList)
      {
         IfClassNotAvailable<Exclude<T>>  type = new IfClassNotAvailableImpl<Exclude<T>>(this, "if-class-not-available", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>if-class-not-available</code> elements 
    * @return the current instance of <code>IfClassNotAvailable<Exclude<T>></code> 
    */
   public Exclude<T> removeAllIfClassNotAvailable()
   {
      childNode.removeChildren("if-class-not-available");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Exclude ElementName: javaee:if-system-property ElementType : if-system-property
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>if-system-property</code> element will be created and returned.
    * Otherwise, the first existing <code>if-system-property</code> element will be returned.
    * @return the instance defined for the element <code>if-system-property</code> 
    */
   public IfSystemProperty<Exclude<T>> getOrCreateIfSystemProperty()
   {
      List<Node> nodeList = childNode.get("if-system-property");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new IfSystemPropertyImpl<Exclude<T>>(this, "if-system-property", childNode, nodeList.get(0));
      }
      return createIfSystemProperty();
   }

   /**
    * Creates a new <code>if-system-property</code> element 
    * @return the new created instance of <code>IfSystemProperty<Exclude<T>></code> 
    */
   public IfSystemProperty<Exclude<T>> createIfSystemProperty()
   {
      return new IfSystemPropertyImpl<Exclude<T>>(this, "if-system-property", childNode);
   }

   /**
    * Returns all <code>if-system-property</code> elements
    * @return list of <code>if-system-property</code> 
    */
   public List<IfSystemProperty<Exclude<T>>> getAllIfSystemProperty()
   {
      List<IfSystemProperty<Exclude<T>>> list = new ArrayList<IfSystemProperty<Exclude<T>>>();
      List<Node> nodeList = childNode.get("if-system-property");
      for(Node node: nodeList)
      {
         IfSystemProperty<Exclude<T>>  type = new IfSystemPropertyImpl<Exclude<T>>(this, "if-system-property", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>if-system-property</code> elements 
    * @return the current instance of <code>IfSystemProperty<Exclude<T>></code> 
    */
   public Exclude<T> removeAllIfSystemProperty()
   {
      childNode.removeChildren("if-system-property");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Exclude ElementName: xsd:string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>Exclude<T></code> 
    */
   public Exclude<T> name(String name)
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
    * @return the current instance of <code>Exclude<T></code> 
    */
   public Exclude<T> removeName()
   {
      childNode.removeAttribute("name");
      return this;
   }
}
