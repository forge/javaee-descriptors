package org.jboss.shrinkwrap.descriptor.impl.connector16; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.connector16.AdminobjectType;
import org.jboss.shrinkwrap.descriptor.api.connector16.ConfigPropertyType;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> adminobjectType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class AdminobjectTypeImpl<T> implements Child<T>, AdminobjectType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public AdminobjectTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public AdminobjectTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: AdminobjectType ElementName: xsd:token ElementType : adminobject-interface
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>adminobject-interface</code> element
    * @param adminobjectInterface the value for the element <code>adminobject-interface</code> 
    * @return the current instance of <code>AdminobjectType<T></code> 
    */
   public AdminobjectType<T> adminobjectInterface(String adminobjectInterface)
   {
      childNode.getOrCreate("adminobject-interface").text(adminobjectInterface);
      return this;
   }

   /**
    * Returns the <code>adminobject-interface</code> element
    * @return the node defined for the element <code>adminobject-interface</code> 
    */
   public String getAdminobjectInterface()
   {
      return childNode.getTextValueForPatternName("adminobject-interface");
   }

   /**
    * Removes the <code>adminobject-interface</code> element 
    * @return the current instance of <code>AdminobjectType<T></code> 
    */
   public AdminobjectType<T> removeAdminobjectInterface()
   {
      childNode.removeChildren("adminobject-interface");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: AdminobjectType ElementName: xsd:token ElementType : adminobject-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>adminobject-class</code> element
    * @param adminobjectClass the value for the element <code>adminobject-class</code> 
    * @return the current instance of <code>AdminobjectType<T></code> 
    */
   public AdminobjectType<T> adminobjectClass(String adminobjectClass)
   {
      childNode.getOrCreate("adminobject-class").text(adminobjectClass);
      return this;
   }

   /**
    * Returns the <code>adminobject-class</code> element
    * @return the node defined for the element <code>adminobject-class</code> 
    */
   public String getAdminobjectClass()
   {
      return childNode.getTextValueForPatternName("adminobject-class");
   }

   /**
    * Removes the <code>adminobject-class</code> element 
    * @return the current instance of <code>AdminobjectType<T></code> 
    */
   public AdminobjectType<T> removeAdminobjectClass()
   {
      childNode.removeChildren("adminobject-class");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: AdminobjectType ElementName: javaee:config-propertyType ElementType : config-property
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>config-property</code> element will be created and returned.
    * Otherwise, the first existing <code>config-property</code> element will be returned.
    * @return the instance defined for the element <code>config-property</code> 
    */
   public ConfigPropertyType<AdminobjectType<T>> getOrCreateConfigProperty()
   {
      List<Node> nodeList = childNode.get("config-property");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ConfigPropertyTypeImpl<AdminobjectType<T>>(this, "config-property", childNode, nodeList.get(0));
      }
      return createConfigProperty();
   }

   /**
    * Creates a new <code>config-property</code> element 
    * @return the new created instance of <code>ConfigPropertyType<AdminobjectType<T>></code> 
    */
   public ConfigPropertyType<AdminobjectType<T>> createConfigProperty()
   {
      return new ConfigPropertyTypeImpl<AdminobjectType<T>>(this, "config-property", childNode);
   }

   /**
    * Returns all <code>config-property</code> elements
    * @return list of <code>config-property</code> 
    */
   public List<ConfigPropertyType<AdminobjectType<T>>> getAllConfigProperty()
   {
      List<ConfigPropertyType<AdminobjectType<T>>> list = new ArrayList<ConfigPropertyType<AdminobjectType<T>>>();
      List<Node> nodeList = childNode.get("config-property");
      for(Node node: nodeList)
      {
         ConfigPropertyType<AdminobjectType<T>>  type = new ConfigPropertyTypeImpl<AdminobjectType<T>>(this, "config-property", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>config-property</code> elements 
    * @return the current instance of <code>ConfigPropertyType<AdminobjectType<T>></code> 
    */
   public AdminobjectType<T> removeAllConfigProperty()
   {
      childNode.removeChildren("config-property");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: AdminobjectType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>AdminobjectType<T></code> 
    */
   public AdminobjectType<T> id(String id)
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
    * @return the current instance of <code>AdminobjectType<T></code> 
    */
   public AdminobjectType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
