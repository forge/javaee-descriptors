package org.jboss.shrinkwrap.descriptor.api.connector17; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.connector17.ConfigPropertyType;
import org.jboss.shrinkwrap.descriptor.api.connector17.OutboundResourceadapterType;
import org.jboss.shrinkwrap.descriptor.api.connector17.InboundResourceadapterType;
import org.jboss.shrinkwrap.descriptor.api.connector17.AdminobjectType;
import org.jboss.shrinkwrap.descriptor.api.connector17.SecurityPermissionType;
/**
 * This interface defines the contract for the <code> resourceadapterType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface ResourceadapterType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ResourceadapterType ElementName: xsd:token ElementType : resourceadapter-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>resourceadapter-class</code> element
    * @param resourceadapterClass the value for the element <code>resourceadapter-class</code> 
    * @return the current instance of <code>ResourceadapterType<T></code> 
    */
   public ResourceadapterType<T> resourceadapterClass(String resourceadapterClass);

   /**
    * Returns the <code>resourceadapter-class</code> element
    * @return the node defined for the element <code>resourceadapter-class</code> 
    */
   public String getResourceadapterClass();

   /**
    * Removes the <code>resourceadapter-class</code> element 
    * @return the current instance of <code>ResourceadapterType<T></code> 
    */
   public ResourceadapterType<T> removeResourceadapterClass();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ResourceadapterType ElementName: javaee:config-propertyType ElementType : config-property
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>config-property</code> element will be created and returned.
    * Otherwise, the first existing <code>config-property</code> element will be returned.
    * @return the instance defined for the element <code>config-property</code> 
    */
   public ConfigPropertyType<ResourceadapterType<T>> getOrCreateConfigProperty();

   /**
    * Creates a new <code>config-property</code> element 
    * @return the new created instance of <code>ConfigPropertyType<ResourceadapterType<T>></code> 
    */
   public ConfigPropertyType<ResourceadapterType<T>> createConfigProperty();

   /**
    * Returns all <code>config-property</code> elements
    * @return list of <code>config-property</code> 
    */
   public List<ConfigPropertyType<ResourceadapterType<T>>> getAllConfigProperty();

   /**
    * Removes all <code>config-property</code> elements 
    * @return the current instance of <code>ConfigPropertyType<ResourceadapterType<T>></code> 
    */
   public ResourceadapterType<T> removeAllConfigProperty();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ResourceadapterType ElementName: javaee:outbound-resourceadapterType ElementType : outbound-resourceadapter
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>outbound-resourceadapter</code> element with the given value will be created.
    * Otherwise, the existing <code>outbound-resourceadapter</code> element will be returned.
    * @return  a new or existing instance of <code>OutboundResourceadapterType<ResourceadapterType<T>></code> 
    */
   public OutboundResourceadapterType<ResourceadapterType<T>> getOrCreateOutboundResourceadapter();

   /**
    * Removes the <code>outbound-resourceadapter</code> element 
    * @return the current instance of <code>ResourceadapterType<T></code> 
    */
   public ResourceadapterType<T> removeOutboundResourceadapter();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ResourceadapterType ElementName: javaee:inbound-resourceadapterType ElementType : inbound-resourceadapter
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>inbound-resourceadapter</code> element with the given value will be created.
    * Otherwise, the existing <code>inbound-resourceadapter</code> element will be returned.
    * @return  a new or existing instance of <code>InboundResourceadapterType<ResourceadapterType<T>></code> 
    */
   public InboundResourceadapterType<ResourceadapterType<T>> getOrCreateInboundResourceadapter();

   /**
    * Removes the <code>inbound-resourceadapter</code> element 
    * @return the current instance of <code>ResourceadapterType<T></code> 
    */
   public ResourceadapterType<T> removeInboundResourceadapter();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ResourceadapterType ElementName: javaee:adminobjectType ElementType : adminobject
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>adminobject</code> element will be created and returned.
    * Otherwise, the first existing <code>adminobject</code> element will be returned.
    * @return the instance defined for the element <code>adminobject</code> 
    */
   public AdminobjectType<ResourceadapterType<T>> getOrCreateAdminobject();

   /**
    * Creates a new <code>adminobject</code> element 
    * @return the new created instance of <code>AdminobjectType<ResourceadapterType<T>></code> 
    */
   public AdminobjectType<ResourceadapterType<T>> createAdminobject();

   /**
    * Returns all <code>adminobject</code> elements
    * @return list of <code>adminobject</code> 
    */
   public List<AdminobjectType<ResourceadapterType<T>>> getAllAdminobject();

   /**
    * Removes all <code>adminobject</code> elements 
    * @return the current instance of <code>AdminobjectType<ResourceadapterType<T>></code> 
    */
   public ResourceadapterType<T> removeAllAdminobject();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ResourceadapterType ElementName: javaee:security-permissionType ElementType : security-permission
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>security-permission</code> element will be created and returned.
    * Otherwise, the first existing <code>security-permission</code> element will be returned.
    * @return the instance defined for the element <code>security-permission</code> 
    */
   public SecurityPermissionType<ResourceadapterType<T>> getOrCreateSecurityPermission();

   /**
    * Creates a new <code>security-permission</code> element 
    * @return the new created instance of <code>SecurityPermissionType<ResourceadapterType<T>></code> 
    */
   public SecurityPermissionType<ResourceadapterType<T>> createSecurityPermission();

   /**
    * Returns all <code>security-permission</code> elements
    * @return list of <code>security-permission</code> 
    */
   public List<SecurityPermissionType<ResourceadapterType<T>>> getAllSecurityPermission();

   /**
    * Removes all <code>security-permission</code> elements 
    * @return the current instance of <code>SecurityPermissionType<ResourceadapterType<T>></code> 
    */
   public ResourceadapterType<T> removeAllSecurityPermission();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ResourceadapterType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>ResourceadapterType<T></code> 
    */
   public ResourceadapterType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>ResourceadapterType<T></code> 
    */
   public ResourceadapterType<T> removeId();
}
