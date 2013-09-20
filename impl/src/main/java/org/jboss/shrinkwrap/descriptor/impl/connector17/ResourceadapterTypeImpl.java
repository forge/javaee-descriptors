package org.jboss.shrinkwrap.descriptor.impl.connector17; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.connector17.AdminobjectType;
import org.jboss.shrinkwrap.descriptor.api.connector17.ConfigPropertyType;
import org.jboss.shrinkwrap.descriptor.api.connector17.InboundResourceadapterType;
import org.jboss.shrinkwrap.descriptor.api.connector17.OutboundResourceadapterType;
import org.jboss.shrinkwrap.descriptor.api.connector17.ResourceadapterType;
import org.jboss.shrinkwrap.descriptor.api.connector17.SecurityPermissionType;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> resourceadapterType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class ResourceadapterTypeImpl<T> implements Child<T>, ResourceadapterType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public ResourceadapterTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public ResourceadapterTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ResourceadapterType ElementName: xsd:token ElementType : resourceadapter-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>resourceadapter-class</code> element
    * @param resourceadapterClass the value for the element <code>resourceadapter-class</code> 
    * @return the current instance of <code>ResourceadapterType<T></code> 
    */
   public ResourceadapterType<T> resourceadapterClass(String resourceadapterClass)
   {
      childNode.getOrCreate("resourceadapter-class").text(resourceadapterClass);
      return this;
   }

   /**
    * Returns the <code>resourceadapter-class</code> element
    * @return the node defined for the element <code>resourceadapter-class</code> 
    */
   public String getResourceadapterClass()
   {
      return childNode.getTextValueForPatternName("resourceadapter-class");
   }

   /**
    * Removes the <code>resourceadapter-class</code> element 
    * @return the current instance of <code>ResourceadapterType<T></code> 
    */
   public ResourceadapterType<T> removeResourceadapterClass()
   {
      childNode.removeChildren("resourceadapter-class");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ResourceadapterType ElementName: javaee:config-propertyType ElementType : config-property
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>config-property</code> element will be created and returned.
    * Otherwise, the first existing <code>config-property</code> element will be returned.
    * @return the instance defined for the element <code>config-property</code> 
    */
   public ConfigPropertyType<ResourceadapterType<T>> getOrCreateConfigProperty()
   {
      List<Node> nodeList = childNode.get("config-property");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ConfigPropertyTypeImpl<ResourceadapterType<T>>(this, "config-property", childNode, nodeList.get(0));
      }
      return createConfigProperty();
   }

   /**
    * Creates a new <code>config-property</code> element 
    * @return the new created instance of <code>ConfigPropertyType<ResourceadapterType<T>></code> 
    */
   public ConfigPropertyType<ResourceadapterType<T>> createConfigProperty()
   {
      return new ConfigPropertyTypeImpl<ResourceadapterType<T>>(this, "config-property", childNode);
   }

   /**
    * Returns all <code>config-property</code> elements
    * @return list of <code>config-property</code> 
    */
   public List<ConfigPropertyType<ResourceadapterType<T>>> getAllConfigProperty()
   {
      List<ConfigPropertyType<ResourceadapterType<T>>> list = new ArrayList<ConfigPropertyType<ResourceadapterType<T>>>();
      List<Node> nodeList = childNode.get("config-property");
      for(Node node: nodeList)
      {
         ConfigPropertyType<ResourceadapterType<T>>  type = new ConfigPropertyTypeImpl<ResourceadapterType<T>>(this, "config-property", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>config-property</code> elements 
    * @return the current instance of <code>ConfigPropertyType<ResourceadapterType<T>></code> 
    */
   public ResourceadapterType<T> removeAllConfigProperty()
   {
      childNode.removeChildren("config-property");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ResourceadapterType ElementName: javaee:outbound-resourceadapterType ElementType : outbound-resourceadapter
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>outbound-resourceadapter</code> element with the given value will be created.
    * Otherwise, the existing <code>outbound-resourceadapter</code> element will be returned.
    * @return  a new or existing instance of <code>OutboundResourceadapterType<ResourceadapterType<T>></code> 
    */
   public OutboundResourceadapterType<ResourceadapterType<T>> getOrCreateOutboundResourceadapter()
   {
      Node node = childNode.getOrCreate("outbound-resourceadapter");
      OutboundResourceadapterType<ResourceadapterType<T>> outboundResourceadapter = new OutboundResourceadapterTypeImpl<ResourceadapterType<T>>(this, "outbound-resourceadapter", childNode, node);
      return outboundResourceadapter;
   }

   /**
    * Removes the <code>outbound-resourceadapter</code> element 
    * @return the current instance of <code>ResourceadapterType<T></code> 
    */
   public ResourceadapterType<T> removeOutboundResourceadapter()
   {
      childNode.removeChildren("outbound-resourceadapter");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ResourceadapterType ElementName: javaee:inbound-resourceadapterType ElementType : inbound-resourceadapter
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>inbound-resourceadapter</code> element with the given value will be created.
    * Otherwise, the existing <code>inbound-resourceadapter</code> element will be returned.
    * @return  a new or existing instance of <code>InboundResourceadapterType<ResourceadapterType<T>></code> 
    */
   public InboundResourceadapterType<ResourceadapterType<T>> getOrCreateInboundResourceadapter()
   {
      Node node = childNode.getOrCreate("inbound-resourceadapter");
      InboundResourceadapterType<ResourceadapterType<T>> inboundResourceadapter = new InboundResourceadapterTypeImpl<ResourceadapterType<T>>(this, "inbound-resourceadapter", childNode, node);
      return inboundResourceadapter;
   }

   /**
    * Removes the <code>inbound-resourceadapter</code> element 
    * @return the current instance of <code>ResourceadapterType<T></code> 
    */
   public ResourceadapterType<T> removeInboundResourceadapter()
   {
      childNode.removeChildren("inbound-resourceadapter");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ResourceadapterType ElementName: javaee:adminobjectType ElementType : adminobject
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>adminobject</code> element will be created and returned.
    * Otherwise, the first existing <code>adminobject</code> element will be returned.
    * @return the instance defined for the element <code>adminobject</code> 
    */
   public AdminobjectType<ResourceadapterType<T>> getOrCreateAdminobject()
   {
      List<Node> nodeList = childNode.get("adminobject");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new AdminobjectTypeImpl<ResourceadapterType<T>>(this, "adminobject", childNode, nodeList.get(0));
      }
      return createAdminobject();
   }

   /**
    * Creates a new <code>adminobject</code> element 
    * @return the new created instance of <code>AdminobjectType<ResourceadapterType<T>></code> 
    */
   public AdminobjectType<ResourceadapterType<T>> createAdminobject()
   {
      return new AdminobjectTypeImpl<ResourceadapterType<T>>(this, "adminobject", childNode);
   }

   /**
    * Returns all <code>adminobject</code> elements
    * @return list of <code>adminobject</code> 
    */
   public List<AdminobjectType<ResourceadapterType<T>>> getAllAdminobject()
   {
      List<AdminobjectType<ResourceadapterType<T>>> list = new ArrayList<AdminobjectType<ResourceadapterType<T>>>();
      List<Node> nodeList = childNode.get("adminobject");
      for(Node node: nodeList)
      {
         AdminobjectType<ResourceadapterType<T>>  type = new AdminobjectTypeImpl<ResourceadapterType<T>>(this, "adminobject", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>adminobject</code> elements 
    * @return the current instance of <code>AdminobjectType<ResourceadapterType<T>></code> 
    */
   public ResourceadapterType<T> removeAllAdminobject()
   {
      childNode.removeChildren("adminobject");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ResourceadapterType ElementName: javaee:security-permissionType ElementType : security-permission
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>security-permission</code> element will be created and returned.
    * Otherwise, the first existing <code>security-permission</code> element will be returned.
    * @return the instance defined for the element <code>security-permission</code> 
    */
   public SecurityPermissionType<ResourceadapterType<T>> getOrCreateSecurityPermission()
   {
      List<Node> nodeList = childNode.get("security-permission");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new SecurityPermissionTypeImpl<ResourceadapterType<T>>(this, "security-permission", childNode, nodeList.get(0));
      }
      return createSecurityPermission();
   }

   /**
    * Creates a new <code>security-permission</code> element 
    * @return the new created instance of <code>SecurityPermissionType<ResourceadapterType<T>></code> 
    */
   public SecurityPermissionType<ResourceadapterType<T>> createSecurityPermission()
   {
      return new SecurityPermissionTypeImpl<ResourceadapterType<T>>(this, "security-permission", childNode);
   }

   /**
    * Returns all <code>security-permission</code> elements
    * @return list of <code>security-permission</code> 
    */
   public List<SecurityPermissionType<ResourceadapterType<T>>> getAllSecurityPermission()
   {
      List<SecurityPermissionType<ResourceadapterType<T>>> list = new ArrayList<SecurityPermissionType<ResourceadapterType<T>>>();
      List<Node> nodeList = childNode.get("security-permission");
      for(Node node: nodeList)
      {
         SecurityPermissionType<ResourceadapterType<T>>  type = new SecurityPermissionTypeImpl<ResourceadapterType<T>>(this, "security-permission", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>security-permission</code> elements 
    * @return the current instance of <code>SecurityPermissionType<ResourceadapterType<T>></code> 
    */
   public ResourceadapterType<T> removeAllSecurityPermission()
   {
      childNode.removeChildren("security-permission");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ResourceadapterType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>ResourceadapterType<T></code> 
    */
   public ResourceadapterType<T> id(String id)
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
    * @return the current instance of <code>ResourceadapterType<T></code> 
    */
   public ResourceadapterType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
