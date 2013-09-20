package org.jboss.shrinkwrap.descriptor.impl.orm20; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.orm20.EntityListener;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.orm20.PrePersist;
import org.jboss.shrinkwrap.descriptor.impl.orm20.PrePersistImpl;
import org.jboss.shrinkwrap.descriptor.api.orm20.PostPersist;
import org.jboss.shrinkwrap.descriptor.impl.orm20.PostPersistImpl;
import org.jboss.shrinkwrap.descriptor.api.orm20.PreRemove;
import org.jboss.shrinkwrap.descriptor.impl.orm20.PreRemoveImpl;
import org.jboss.shrinkwrap.descriptor.api.orm20.PostRemove;
import org.jboss.shrinkwrap.descriptor.impl.orm20.PostRemoveImpl;
import org.jboss.shrinkwrap.descriptor.api.orm20.PreUpdate;
import org.jboss.shrinkwrap.descriptor.impl.orm20.PreUpdateImpl;
import org.jboss.shrinkwrap.descriptor.api.orm20.PostUpdate;
import org.jboss.shrinkwrap.descriptor.impl.orm20.PostUpdateImpl;
import org.jboss.shrinkwrap.descriptor.api.orm20.PostLoad;
import org.jboss.shrinkwrap.descriptor.impl.orm20.PostLoadImpl;

/**
 * This class implements the <code> entity-listener </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class EntityListenerImpl<T> implements Child<T>, EntityListener<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public EntityListenerImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public EntityListenerImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityListener ElementName: xsd:string ElementType : description
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>description</code> element
    * @param description the value for the element <code>description</code> 
    * @return the current instance of <code>EntityListener<T></code> 
    */
   public EntityListener<T> description(String description)
   {
      childNode.getOrCreate("description").text(description);
      return this;
   }

   /**
    * Returns the <code>description</code> element
    * @return the node defined for the element <code>description</code> 
    */
   public String getDescription()
   {
      return childNode.getTextValueForPatternName("description");
   }

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>EntityListener<T></code> 
    */
   public EntityListener<T> removeDescription()
   {
      childNode.removeChildren("description");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityListener ElementName: orm:pre-persist ElementType : pre-persist
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>pre-persist</code> element with the given value will be created.
    * Otherwise, the existing <code>pre-persist</code> element will be returned.
    * @return  a new or existing instance of <code>PrePersist<EntityListener<T>></code> 
    */
   public PrePersist<EntityListener<T>> getOrCreatePrePersist()
   {
      Node node = childNode.getOrCreate("pre-persist");
      PrePersist<EntityListener<T>> prePersist = new PrePersistImpl<EntityListener<T>>(this, "pre-persist", childNode, node);
      return prePersist;
   }

   /**
    * Removes the <code>pre-persist</code> element 
    * @return the current instance of <code>EntityListener<T></code> 
    */
   public EntityListener<T> removePrePersist()
   {
      childNode.removeChildren("pre-persist");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityListener ElementName: orm:post-persist ElementType : post-persist
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>post-persist</code> element with the given value will be created.
    * Otherwise, the existing <code>post-persist</code> element will be returned.
    * @return  a new or existing instance of <code>PostPersist<EntityListener<T>></code> 
    */
   public PostPersist<EntityListener<T>> getOrCreatePostPersist()
   {
      Node node = childNode.getOrCreate("post-persist");
      PostPersist<EntityListener<T>> postPersist = new PostPersistImpl<EntityListener<T>>(this, "post-persist", childNode, node);
      return postPersist;
   }

   /**
    * Removes the <code>post-persist</code> element 
    * @return the current instance of <code>EntityListener<T></code> 
    */
   public EntityListener<T> removePostPersist()
   {
      childNode.removeChildren("post-persist");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityListener ElementName: orm:pre-remove ElementType : pre-remove
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>pre-remove</code> element with the given value will be created.
    * Otherwise, the existing <code>pre-remove</code> element will be returned.
    * @return  a new or existing instance of <code>PreRemove<EntityListener<T>></code> 
    */
   public PreRemove<EntityListener<T>> getOrCreatePreRemove()
   {
      Node node = childNode.getOrCreate("pre-remove");
      PreRemove<EntityListener<T>> preRemove = new PreRemoveImpl<EntityListener<T>>(this, "pre-remove", childNode, node);
      return preRemove;
   }

   /**
    * Removes the <code>pre-remove</code> element 
    * @return the current instance of <code>EntityListener<T></code> 
    */
   public EntityListener<T> removePreRemove()
   {
      childNode.removeChildren("pre-remove");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityListener ElementName: orm:post-remove ElementType : post-remove
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>post-remove</code> element with the given value will be created.
    * Otherwise, the existing <code>post-remove</code> element will be returned.
    * @return  a new or existing instance of <code>PostRemove<EntityListener<T>></code> 
    */
   public PostRemove<EntityListener<T>> getOrCreatePostRemove()
   {
      Node node = childNode.getOrCreate("post-remove");
      PostRemove<EntityListener<T>> postRemove = new PostRemoveImpl<EntityListener<T>>(this, "post-remove", childNode, node);
      return postRemove;
   }

   /**
    * Removes the <code>post-remove</code> element 
    * @return the current instance of <code>EntityListener<T></code> 
    */
   public EntityListener<T> removePostRemove()
   {
      childNode.removeChildren("post-remove");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityListener ElementName: orm:pre-update ElementType : pre-update
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>pre-update</code> element with the given value will be created.
    * Otherwise, the existing <code>pre-update</code> element will be returned.
    * @return  a new or existing instance of <code>PreUpdate<EntityListener<T>></code> 
    */
   public PreUpdate<EntityListener<T>> getOrCreatePreUpdate()
   {
      Node node = childNode.getOrCreate("pre-update");
      PreUpdate<EntityListener<T>> preUpdate = new PreUpdateImpl<EntityListener<T>>(this, "pre-update", childNode, node);
      return preUpdate;
   }

   /**
    * Removes the <code>pre-update</code> element 
    * @return the current instance of <code>EntityListener<T></code> 
    */
   public EntityListener<T> removePreUpdate()
   {
      childNode.removeChildren("pre-update");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityListener ElementName: orm:post-update ElementType : post-update
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>post-update</code> element with the given value will be created.
    * Otherwise, the existing <code>post-update</code> element will be returned.
    * @return  a new or existing instance of <code>PostUpdate<EntityListener<T>></code> 
    */
   public PostUpdate<EntityListener<T>> getOrCreatePostUpdate()
   {
      Node node = childNode.getOrCreate("post-update");
      PostUpdate<EntityListener<T>> postUpdate = new PostUpdateImpl<EntityListener<T>>(this, "post-update", childNode, node);
      return postUpdate;
   }

   /**
    * Removes the <code>post-update</code> element 
    * @return the current instance of <code>EntityListener<T></code> 
    */
   public EntityListener<T> removePostUpdate()
   {
      childNode.removeChildren("post-update");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityListener ElementName: orm:post-load ElementType : post-load
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>post-load</code> element with the given value will be created.
    * Otherwise, the existing <code>post-load</code> element will be returned.
    * @return  a new or existing instance of <code>PostLoad<EntityListener<T>></code> 
    */
   public PostLoad<EntityListener<T>> getOrCreatePostLoad()
   {
      Node node = childNode.getOrCreate("post-load");
      PostLoad<EntityListener<T>> postLoad = new PostLoadImpl<EntityListener<T>>(this, "post-load", childNode, node);
      return postLoad;
   }

   /**
    * Removes the <code>post-load</code> element 
    * @return the current instance of <code>EntityListener<T></code> 
    */
   public EntityListener<T> removePostLoad()
   {
      childNode.removeChildren("post-load");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityListener ElementName: xsd:string ElementType : class
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>class</code> attribute
    * @param clazz the value for the attribute <code>class</code> 
    * @return the current instance of <code>EntityListener<T></code> 
    */
   public EntityListener<T> clazz(String clazz)
   {
      childNode.attribute("class", clazz);
      return this;
   }

   /**
    * Returns the <code>class</code> attribute
    * @return the value defined for the attribute <code>class</code> 
    */
      public String getClazz()
   {
      return childNode.getAttribute("class");
   }

   /**
    * Removes the <code>class</code> attribute 
    * @return the current instance of <code>EntityListener<T></code> 
    */
   public EntityListener<T> removeClazzAttr()
   {
      childNode.removeAttribute("class");
      return this;
   }
}
