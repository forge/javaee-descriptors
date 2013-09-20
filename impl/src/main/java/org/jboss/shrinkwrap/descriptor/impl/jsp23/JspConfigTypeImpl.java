package org.jboss.shrinkwrap.descriptor.impl.jsp23; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.jsp23.JspConfigType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.jsp23.TaglibType;
import org.jboss.shrinkwrap.descriptor.impl.jsp23.TaglibTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.jsp23.JspPropertyGroupType;
import org.jboss.shrinkwrap.descriptor.impl.jsp23.JspPropertyGroupTypeImpl;

/**
 * This class implements the <code> jsp-configType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class JspConfigTypeImpl<T> implements Child<T>, JspConfigType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public JspConfigTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public JspConfigTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JspConfigType ElementName: javaee:taglibType ElementType : taglib
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>taglib</code> element will be created and returned.
    * Otherwise, the first existing <code>taglib</code> element will be returned.
    * @return the instance defined for the element <code>taglib</code> 
    */
   public TaglibType<JspConfigType<T>> getOrCreateTaglib()
   {
      List<Node> nodeList = childNode.get("taglib");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new TaglibTypeImpl<JspConfigType<T>>(this, "taglib", childNode, nodeList.get(0));
      }
      return createTaglib();
   }

   /**
    * Creates a new <code>taglib</code> element 
    * @return the new created instance of <code>TaglibType<JspConfigType<T>></code> 
    */
   public TaglibType<JspConfigType<T>> createTaglib()
   {
      return new TaglibTypeImpl<JspConfigType<T>>(this, "taglib", childNode);
   }

   /**
    * Returns all <code>taglib</code> elements
    * @return list of <code>taglib</code> 
    */
   public List<TaglibType<JspConfigType<T>>> getAllTaglib()
   {
      List<TaglibType<JspConfigType<T>>> list = new ArrayList<TaglibType<JspConfigType<T>>>();
      List<Node> nodeList = childNode.get("taglib");
      for(Node node: nodeList)
      {
         TaglibType<JspConfigType<T>>  type = new TaglibTypeImpl<JspConfigType<T>>(this, "taglib", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>taglib</code> elements 
    * @return the current instance of <code>TaglibType<JspConfigType<T>></code> 
    */
   public JspConfigType<T> removeAllTaglib()
   {
      childNode.removeChildren("taglib");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JspConfigType ElementName: javaee:jsp-property-groupType ElementType : jsp-property-group
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>jsp-property-group</code> element will be created and returned.
    * Otherwise, the first existing <code>jsp-property-group</code> element will be returned.
    * @return the instance defined for the element <code>jsp-property-group</code> 
    */
   public JspPropertyGroupType<JspConfigType<T>> getOrCreateJspPropertyGroup()
   {
      List<Node> nodeList = childNode.get("jsp-property-group");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new JspPropertyGroupTypeImpl<JspConfigType<T>>(this, "jsp-property-group", childNode, nodeList.get(0));
      }
      return createJspPropertyGroup();
   }

   /**
    * Creates a new <code>jsp-property-group</code> element 
    * @return the new created instance of <code>JspPropertyGroupType<JspConfigType<T>></code> 
    */
   public JspPropertyGroupType<JspConfigType<T>> createJspPropertyGroup()
   {
      return new JspPropertyGroupTypeImpl<JspConfigType<T>>(this, "jsp-property-group", childNode);
   }

   /**
    * Returns all <code>jsp-property-group</code> elements
    * @return list of <code>jsp-property-group</code> 
    */
   public List<JspPropertyGroupType<JspConfigType<T>>> getAllJspPropertyGroup()
   {
      List<JspPropertyGroupType<JspConfigType<T>>> list = new ArrayList<JspPropertyGroupType<JspConfigType<T>>>();
      List<Node> nodeList = childNode.get("jsp-property-group");
      for(Node node: nodeList)
      {
         JspPropertyGroupType<JspConfigType<T>>  type = new JspPropertyGroupTypeImpl<JspConfigType<T>>(this, "jsp-property-group", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>jsp-property-group</code> elements 
    * @return the current instance of <code>JspPropertyGroupType<JspConfigType<T>></code> 
    */
   public JspConfigType<T> removeAllJspPropertyGroup()
   {
      childNode.removeChildren("jsp-property-group");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JspConfigType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>JspConfigType<T></code> 
    */
   public JspConfigType<T> id(String id)
   {
      childNode.attribute("id", id);
      return this;
   }

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
      public String getId()
   {
      return childNode.getAttribute("id");
   }

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>JspConfigType<T></code> 
    */
   public JspConfigType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
