package org.jboss.shrinkwrap.descriptor.api.orm20; 

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> entity-listener </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface EntityListener<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityListener ElementName: xsd:string ElementType : description
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>description</code> element
    * @param description the value for the element <code>description</code> 
    * @return the current instance of <code>EntityListener<T></code> 
    */
   public EntityListener<T> description(String description);

   /**
    * Returns the <code>description</code> element
    * @return the node defined for the element <code>description</code> 
    */
   public String getDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>EntityListener<T></code> 
    */
   public EntityListener<T> removeDescription();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityListener ElementName: orm:pre-persist ElementType : pre-persist
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>pre-persist</code> element with the given value will be created.
    * Otherwise, the existing <code>pre-persist</code> element will be returned.
    * @return  a new or existing instance of <code>PrePersist<EntityListener<T>></code> 
    */
   public PrePersist<EntityListener<T>> getOrCreatePrePersist();

   /**
    * Removes the <code>pre-persist</code> element 
    * @return the current instance of <code>EntityListener<T></code> 
    */
   public EntityListener<T> removePrePersist();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityListener ElementName: orm:post-persist ElementType : post-persist
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>post-persist</code> element with the given value will be created.
    * Otherwise, the existing <code>post-persist</code> element will be returned.
    * @return  a new or existing instance of <code>PostPersist<EntityListener<T>></code> 
    */
   public PostPersist<EntityListener<T>> getOrCreatePostPersist();

   /**
    * Removes the <code>post-persist</code> element 
    * @return the current instance of <code>EntityListener<T></code> 
    */
   public EntityListener<T> removePostPersist();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityListener ElementName: orm:pre-remove ElementType : pre-remove
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>pre-remove</code> element with the given value will be created.
    * Otherwise, the existing <code>pre-remove</code> element will be returned.
    * @return  a new or existing instance of <code>PreRemove<EntityListener<T>></code> 
    */
   public PreRemove<EntityListener<T>> getOrCreatePreRemove();

   /**
    * Removes the <code>pre-remove</code> element 
    * @return the current instance of <code>EntityListener<T></code> 
    */
   public EntityListener<T> removePreRemove();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityListener ElementName: orm:post-remove ElementType : post-remove
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>post-remove</code> element with the given value will be created.
    * Otherwise, the existing <code>post-remove</code> element will be returned.
    * @return  a new or existing instance of <code>PostRemove<EntityListener<T>></code> 
    */
   public PostRemove<EntityListener<T>> getOrCreatePostRemove();

   /**
    * Removes the <code>post-remove</code> element 
    * @return the current instance of <code>EntityListener<T></code> 
    */
   public EntityListener<T> removePostRemove();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityListener ElementName: orm:pre-update ElementType : pre-update
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>pre-update</code> element with the given value will be created.
    * Otherwise, the existing <code>pre-update</code> element will be returned.
    * @return  a new or existing instance of <code>PreUpdate<EntityListener<T>></code> 
    */
   public PreUpdate<EntityListener<T>> getOrCreatePreUpdate();

   /**
    * Removes the <code>pre-update</code> element 
    * @return the current instance of <code>EntityListener<T></code> 
    */
   public EntityListener<T> removePreUpdate();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityListener ElementName: orm:post-update ElementType : post-update
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>post-update</code> element with the given value will be created.
    * Otherwise, the existing <code>post-update</code> element will be returned.
    * @return  a new or existing instance of <code>PostUpdate<EntityListener<T>></code> 
    */
   public PostUpdate<EntityListener<T>> getOrCreatePostUpdate();

   /**
    * Removes the <code>post-update</code> element 
    * @return the current instance of <code>EntityListener<T></code> 
    */
   public EntityListener<T> removePostUpdate();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityListener ElementName: orm:post-load ElementType : post-load
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>post-load</code> element with the given value will be created.
    * Otherwise, the existing <code>post-load</code> element will be returned.
    * @return  a new or existing instance of <code>PostLoad<EntityListener<T>></code> 
    */
   public PostLoad<EntityListener<T>> getOrCreatePostLoad();

   /**
    * Removes the <code>post-load</code> element 
    * @return the current instance of <code>EntityListener<T></code> 
    */
   public EntityListener<T> removePostLoad();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityListener ElementName: xsd:string ElementType : class
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>class</code> attribute
    * @param clazz the value for the attribute <code>class</code> 
    * @return the current instance of <code>EntityListener<T></code> 
    */
   public EntityListener<T> clazz(String clazz);

   /**
    * Returns the <code>class</code> attribute
    * @return the value defined for the attribute <code>class</code> 
    */
   public String getClazz();

   /**
    * Removes the <code>class</code> attribute 
    * @return the current instance of <code>EntityListener<T></code> 
    */
   public EntityListener<T> removeClazzAttr();
}
