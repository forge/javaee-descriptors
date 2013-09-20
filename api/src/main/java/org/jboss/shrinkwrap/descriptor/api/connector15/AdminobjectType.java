package org.jboss.shrinkwrap.descriptor.api.connector15; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> adminobjectType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface AdminobjectType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: AdminobjectType ElementName: xsd:token ElementType : adminobject-interface
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>adminobject-interface</code> element
    * @param adminobjectInterface the value for the element <code>adminobject-interface</code> 
    * @return the current instance of <code>AdminobjectType<T></code> 
    */
   public AdminobjectType<T> adminobjectInterface(String adminobjectInterface);

   /**
    * Returns the <code>adminobject-interface</code> element
    * @return the node defined for the element <code>adminobject-interface</code> 
    */
   public String getAdminobjectInterface();

   /**
    * Removes the <code>adminobject-interface</code> element 
    * @return the current instance of <code>AdminobjectType<T></code> 
    */
   public AdminobjectType<T> removeAdminobjectInterface();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: AdminobjectType ElementName: xsd:token ElementType : adminobject-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>adminobject-class</code> element
    * @param adminobjectClass the value for the element <code>adminobject-class</code> 
    * @return the current instance of <code>AdminobjectType<T></code> 
    */
   public AdminobjectType<T> adminobjectClass(String adminobjectClass);

   /**
    * Returns the <code>adminobject-class</code> element
    * @return the node defined for the element <code>adminobject-class</code> 
    */
   public String getAdminobjectClass();

   /**
    * Removes the <code>adminobject-class</code> element 
    * @return the current instance of <code>AdminobjectType<T></code> 
    */
   public AdminobjectType<T> removeAdminobjectClass();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: AdminobjectType ElementName: j2ee:config-propertyType ElementType : config-property
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>config-property</code> element will be created and returned.
    * Otherwise, the first existing <code>config-property</code> element will be returned.
    * @return the instance defined for the element <code>config-property</code> 
    */
   public ConfigPropertyType<AdminobjectType<T>> getOrCreateConfigProperty();

   /**
    * Creates a new <code>config-property</code> element 
    * @return the new created instance of <code>ConfigPropertyType<AdminobjectType<T>></code> 
    */
   public ConfigPropertyType<AdminobjectType<T>> createConfigProperty();

   /**
    * Returns all <code>config-property</code> elements
    * @return list of <code>config-property</code> 
    */
   public List<ConfigPropertyType<AdminobjectType<T>>> getAllConfigProperty();

   /**
    * Removes all <code>config-property</code> elements 
    * @return the current instance of <code>ConfigPropertyType<AdminobjectType<T>></code> 
    */
   public AdminobjectType<T> removeAllConfigProperty();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: AdminobjectType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>AdminobjectType<T></code> 
    */
   public AdminobjectType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>AdminobjectType<T></code> 
    */
   public AdminobjectType<T> removeId();
}
