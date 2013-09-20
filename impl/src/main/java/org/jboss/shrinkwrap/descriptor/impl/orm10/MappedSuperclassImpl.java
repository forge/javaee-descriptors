package org.jboss.shrinkwrap.descriptor.impl.orm10; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.orm10.MappedSuperclass;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.orm10.IdClass;
import org.jboss.shrinkwrap.descriptor.impl.orm10.IdClassImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee5.EmptyType;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.EmptyTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee5.EmptyType;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.EmptyTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.orm10.EntityListeners;
import org.jboss.shrinkwrap.descriptor.impl.orm10.EntityListenersImpl;
import org.jboss.shrinkwrap.descriptor.api.orm10.PrePersist;
import org.jboss.shrinkwrap.descriptor.impl.orm10.PrePersistImpl;
import org.jboss.shrinkwrap.descriptor.api.orm10.PostPersist;
import org.jboss.shrinkwrap.descriptor.impl.orm10.PostPersistImpl;
import org.jboss.shrinkwrap.descriptor.api.orm10.PreRemove;
import org.jboss.shrinkwrap.descriptor.impl.orm10.PreRemoveImpl;
import org.jboss.shrinkwrap.descriptor.api.orm10.PostRemove;
import org.jboss.shrinkwrap.descriptor.impl.orm10.PostRemoveImpl;
import org.jboss.shrinkwrap.descriptor.api.orm10.PreUpdate;
import org.jboss.shrinkwrap.descriptor.impl.orm10.PreUpdateImpl;
import org.jboss.shrinkwrap.descriptor.api.orm10.PostUpdate;
import org.jboss.shrinkwrap.descriptor.impl.orm10.PostUpdateImpl;
import org.jboss.shrinkwrap.descriptor.api.orm10.PostLoad;
import org.jboss.shrinkwrap.descriptor.impl.orm10.PostLoadImpl;
import org.jboss.shrinkwrap.descriptor.api.orm10.Attributes;
import org.jboss.shrinkwrap.descriptor.impl.orm10.AttributesImpl;
import org.jboss.shrinkwrap.descriptor.api.orm10.AccessType;

/**
 * This class implements the <code> mapped-superclass </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class MappedSuperclassImpl<T> implements Child<T>, MappedSuperclass<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public MappedSuperclassImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public MappedSuperclassImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MappedSuperclass ElementName: xsd:string ElementType : description
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>description</code> element
    * @param description the value for the element <code>description</code> 
    * @return the current instance of <code>MappedSuperclass<T></code> 
    */
   public MappedSuperclass<T> description(String description)
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
    * @return the current instance of <code>MappedSuperclass<T></code> 
    */
   public MappedSuperclass<T> removeDescription()
   {
      childNode.removeChildren("description");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MappedSuperclass ElementName: orm:id-class ElementType : id-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>id-class</code> element with the given value will be created.
    * Otherwise, the existing <code>id-class</code> element will be returned.
    * @return  a new or existing instance of <code>IdClass<MappedSuperclass<T>></code> 
    */
   public IdClass<MappedSuperclass<T>> getOrCreateIdClass()
   {
      Node node = childNode.getOrCreate("id-class");
      IdClass<MappedSuperclass<T>> idClass = new IdClassImpl<MappedSuperclass<T>>(this, "id-class", childNode, node);
      return idClass;
   }

   /**
    * Removes the <code>id-class</code> element 
    * @return the current instance of <code>MappedSuperclass<T></code> 
    */
   public MappedSuperclass<T> removeIdClass()
   {
      childNode.removeChildren("id-class");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MappedSuperclass ElementName: javaee:emptyType ElementType : exclude-default-listeners
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>exclude-default-listeners</code> element 
    * @return the current instance of <code>MappedSuperclass<T></code> 
    */
   public MappedSuperclass<T> excludeDefaultListeners()
   {
      childNode.getOrCreate("exclude-default-listeners");
      return this;
   }

   /**
    * Removes the <code>exclude-default-listeners</code> element 
    * @return the current instance of <code>MappedSuperclass<T></code> 
    */
   public Boolean isExcludeDefaultListeners()
   {
      return childNode.getSingle("exclude-default-listeners") != null;
   }

   /**
    * Removes the <code>exclude-default-listeners</code> element 
    * @return the current instance of <code>MappedSuperclass<T></code> 
    */
   public MappedSuperclass<T> removeExcludeDefaultListeners()
   {
      childNode.removeChild("exclude-default-listeners");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MappedSuperclass ElementName: javaee:emptyType ElementType : exclude-superclass-listeners
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>exclude-superclass-listeners</code> element 
    * @return the current instance of <code>MappedSuperclass<T></code> 
    */
   public MappedSuperclass<T> excludeSuperclassListeners()
   {
      childNode.getOrCreate("exclude-superclass-listeners");
      return this;
   }

   /**
    * Removes the <code>exclude-superclass-listeners</code> element 
    * @return the current instance of <code>MappedSuperclass<T></code> 
    */
   public Boolean isExcludeSuperclassListeners()
   {
      return childNode.getSingle("exclude-superclass-listeners") != null;
   }

   /**
    * Removes the <code>exclude-superclass-listeners</code> element 
    * @return the current instance of <code>MappedSuperclass<T></code> 
    */
   public MappedSuperclass<T> removeExcludeSuperclassListeners()
   {
      childNode.removeChild("exclude-superclass-listeners");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MappedSuperclass ElementName: orm:entity-listeners ElementType : entity-listeners
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>entity-listeners</code> element with the given value will be created.
    * Otherwise, the existing <code>entity-listeners</code> element will be returned.
    * @return  a new or existing instance of <code>EntityListeners<MappedSuperclass<T>></code> 
    */
   public EntityListeners<MappedSuperclass<T>> getOrCreateEntityListeners()
   {
      Node node = childNode.getOrCreate("entity-listeners");
      EntityListeners<MappedSuperclass<T>> entityListeners = new EntityListenersImpl<MappedSuperclass<T>>(this, "entity-listeners", childNode, node);
      return entityListeners;
   }

   /**
    * Removes the <code>entity-listeners</code> element 
    * @return the current instance of <code>MappedSuperclass<T></code> 
    */
   public MappedSuperclass<T> removeEntityListeners()
   {
      childNode.removeChildren("entity-listeners");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MappedSuperclass ElementName: orm:pre-persist ElementType : pre-persist
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>pre-persist</code> element with the given value will be created.
    * Otherwise, the existing <code>pre-persist</code> element will be returned.
    * @return  a new or existing instance of <code>PrePersist<MappedSuperclass<T>></code> 
    */
   public PrePersist<MappedSuperclass<T>> getOrCreatePrePersist()
   {
      Node node = childNode.getOrCreate("pre-persist");
      PrePersist<MappedSuperclass<T>> prePersist = new PrePersistImpl<MappedSuperclass<T>>(this, "pre-persist", childNode, node);
      return prePersist;
   }

   /**
    * Removes the <code>pre-persist</code> element 
    * @return the current instance of <code>MappedSuperclass<T></code> 
    */
   public MappedSuperclass<T> removePrePersist()
   {
      childNode.removeChildren("pre-persist");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MappedSuperclass ElementName: orm:post-persist ElementType : post-persist
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>post-persist</code> element with the given value will be created.
    * Otherwise, the existing <code>post-persist</code> element will be returned.
    * @return  a new or existing instance of <code>PostPersist<MappedSuperclass<T>></code> 
    */
   public PostPersist<MappedSuperclass<T>> getOrCreatePostPersist()
   {
      Node node = childNode.getOrCreate("post-persist");
      PostPersist<MappedSuperclass<T>> postPersist = new PostPersistImpl<MappedSuperclass<T>>(this, "post-persist", childNode, node);
      return postPersist;
   }

   /**
    * Removes the <code>post-persist</code> element 
    * @return the current instance of <code>MappedSuperclass<T></code> 
    */
   public MappedSuperclass<T> removePostPersist()
   {
      childNode.removeChildren("post-persist");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MappedSuperclass ElementName: orm:pre-remove ElementType : pre-remove
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>pre-remove</code> element with the given value will be created.
    * Otherwise, the existing <code>pre-remove</code> element will be returned.
    * @return  a new or existing instance of <code>PreRemove<MappedSuperclass<T>></code> 
    */
   public PreRemove<MappedSuperclass<T>> getOrCreatePreRemove()
   {
      Node node = childNode.getOrCreate("pre-remove");
      PreRemove<MappedSuperclass<T>> preRemove = new PreRemoveImpl<MappedSuperclass<T>>(this, "pre-remove", childNode, node);
      return preRemove;
   }

   /**
    * Removes the <code>pre-remove</code> element 
    * @return the current instance of <code>MappedSuperclass<T></code> 
    */
   public MappedSuperclass<T> removePreRemove()
   {
      childNode.removeChildren("pre-remove");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MappedSuperclass ElementName: orm:post-remove ElementType : post-remove
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>post-remove</code> element with the given value will be created.
    * Otherwise, the existing <code>post-remove</code> element will be returned.
    * @return  a new or existing instance of <code>PostRemove<MappedSuperclass<T>></code> 
    */
   public PostRemove<MappedSuperclass<T>> getOrCreatePostRemove()
   {
      Node node = childNode.getOrCreate("post-remove");
      PostRemove<MappedSuperclass<T>> postRemove = new PostRemoveImpl<MappedSuperclass<T>>(this, "post-remove", childNode, node);
      return postRemove;
   }

   /**
    * Removes the <code>post-remove</code> element 
    * @return the current instance of <code>MappedSuperclass<T></code> 
    */
   public MappedSuperclass<T> removePostRemove()
   {
      childNode.removeChildren("post-remove");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MappedSuperclass ElementName: orm:pre-update ElementType : pre-update
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>pre-update</code> element with the given value will be created.
    * Otherwise, the existing <code>pre-update</code> element will be returned.
    * @return  a new or existing instance of <code>PreUpdate<MappedSuperclass<T>></code> 
    */
   public PreUpdate<MappedSuperclass<T>> getOrCreatePreUpdate()
   {
      Node node = childNode.getOrCreate("pre-update");
      PreUpdate<MappedSuperclass<T>> preUpdate = new PreUpdateImpl<MappedSuperclass<T>>(this, "pre-update", childNode, node);
      return preUpdate;
   }

   /**
    * Removes the <code>pre-update</code> element 
    * @return the current instance of <code>MappedSuperclass<T></code> 
    */
   public MappedSuperclass<T> removePreUpdate()
   {
      childNode.removeChildren("pre-update");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MappedSuperclass ElementName: orm:post-update ElementType : post-update
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>post-update</code> element with the given value will be created.
    * Otherwise, the existing <code>post-update</code> element will be returned.
    * @return  a new or existing instance of <code>PostUpdate<MappedSuperclass<T>></code> 
    */
   public PostUpdate<MappedSuperclass<T>> getOrCreatePostUpdate()
   {
      Node node = childNode.getOrCreate("post-update");
      PostUpdate<MappedSuperclass<T>> postUpdate = new PostUpdateImpl<MappedSuperclass<T>>(this, "post-update", childNode, node);
      return postUpdate;
   }

   /**
    * Removes the <code>post-update</code> element 
    * @return the current instance of <code>MappedSuperclass<T></code> 
    */
   public MappedSuperclass<T> removePostUpdate()
   {
      childNode.removeChildren("post-update");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MappedSuperclass ElementName: orm:post-load ElementType : post-load
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>post-load</code> element with the given value will be created.
    * Otherwise, the existing <code>post-load</code> element will be returned.
    * @return  a new or existing instance of <code>PostLoad<MappedSuperclass<T>></code> 
    */
   public PostLoad<MappedSuperclass<T>> getOrCreatePostLoad()
   {
      Node node = childNode.getOrCreate("post-load");
      PostLoad<MappedSuperclass<T>> postLoad = new PostLoadImpl<MappedSuperclass<T>>(this, "post-load", childNode, node);
      return postLoad;
   }

   /**
    * Removes the <code>post-load</code> element 
    * @return the current instance of <code>MappedSuperclass<T></code> 
    */
   public MappedSuperclass<T> removePostLoad()
   {
      childNode.removeChildren("post-load");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MappedSuperclass ElementName: orm:attributes ElementType : attributes
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>attributes</code> element with the given value will be created.
    * Otherwise, the existing <code>attributes</code> element will be returned.
    * @return  a new or existing instance of <code>Attributes<MappedSuperclass<T>></code> 
    */
   public Attributes<MappedSuperclass<T>> getOrCreateAttributes()
   {
      Node node = childNode.getOrCreate("attributes");
      Attributes<MappedSuperclass<T>> attributes = new AttributesImpl<MappedSuperclass<T>>(this, "attributes", childNode, node);
      return attributes;
   }

   /**
    * Removes the <code>attributes</code> element 
    * @return the current instance of <code>MappedSuperclass<T></code> 
    */
   public MappedSuperclass<T> removeAttributes()
   {
      childNode.removeChildren("attributes");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MappedSuperclass ElementName: xsd:string ElementType : class
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>class</code> attribute
    * @param clazz the value for the attribute <code>class</code> 
    * @return the current instance of <code>MappedSuperclass<T></code> 
    */
   public MappedSuperclass<T> clazz(String clazz)
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
    * @return the current instance of <code>MappedSuperclass<T></code> 
    */
   public MappedSuperclass<T> removeClazzAttr()
   {
      childNode.removeAttribute("class");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MappedSuperclass ElementName: orm:access-type ElementType : access
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>access</code> attribute
    * @param access the value for the attribute <code>access</code> 
    * @return the current instance of <code>MappedSuperclass<T></code> 
    */
   public MappedSuperclass<T> access(AccessType access)
   {
      childNode.attribute("access", access);
      return this;
   }

   /**
    * Sets the <code>access</code> attribute
    * @param access the value for the attribute <code>access</code> 
    * @return the current instance of <code>MappedSuperclass<T></code> 
    */
   public MappedSuperclass<T> access(String access)
   {
      childNode.attribute("access", access);
      return this;
   }

   /**
    * Returns the <code>access</code> attribute
    * @return the value defined for the attribute <code>access</code> 
    */
   public AccessType getAccess()
   {
      return AccessType.getFromStringValue(childNode.getAttribute("access"));
   }

   /**
    * Returns the <code>access</code> attribute
    * @return the value found for the element <code>access</code> 
    */
   public String  getAccessAsString()
   {
      return childNode.getAttribute("access");
   }

   /**
    * Removes the <code>access</code> attribute 
    * @return the current instance of <code>MappedSuperclass<T></code> 
    */
   public MappedSuperclass<T> removeAccess()
   {
      childNode.removeAttribute("access");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MappedSuperclass ElementName: xsd:boolean ElementType : metadata-complete
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>metadata-complete</code> attribute
    * @param metadataComplete the value for the attribute <code>metadata-complete</code> 
    * @return the current instance of <code>MappedSuperclass<T></code> 
    */
   public MappedSuperclass<T> metadataComplete(Boolean metadataComplete)
   {
      childNode.attribute("metadata-complete", metadataComplete);
      return this;
   }

   /**
    * Returns the <code>metadata-complete</code> attribute
    * @return the value defined for the attribute <code>metadata-complete</code> 
    */
   public Boolean isMetadataComplete()
   {
      return Strings.isTrue(childNode.getAttribute("metadata-complete"));
   }

   /**
    * Removes the <code>metadata-complete</code> attribute 
    * @return the current instance of <code>MappedSuperclass<T></code> 
    */
   public MappedSuperclass<T> removeMetadataComplete()
   {
      childNode.removeAttribute("metadata-complete");
      return this;
   }
}
