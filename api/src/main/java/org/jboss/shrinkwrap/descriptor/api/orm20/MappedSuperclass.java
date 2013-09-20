package org.jboss.shrinkwrap.descriptor.api.orm20; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.orm20.IdClass;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EmptyType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EmptyType;
import org.jboss.shrinkwrap.descriptor.api.orm20.EntityListeners;
import org.jboss.shrinkwrap.descriptor.api.orm20.PrePersist;
import org.jboss.shrinkwrap.descriptor.api.orm20.PostPersist;
import org.jboss.shrinkwrap.descriptor.api.orm20.PreRemove;
import org.jboss.shrinkwrap.descriptor.api.orm20.PostRemove;
import org.jboss.shrinkwrap.descriptor.api.orm20.PreUpdate;
import org.jboss.shrinkwrap.descriptor.api.orm20.PostUpdate;
import org.jboss.shrinkwrap.descriptor.api.orm20.PostLoad;
import org.jboss.shrinkwrap.descriptor.api.orm20.Attributes;
import org.jboss.shrinkwrap.descriptor.api.orm20.AccessType;
/**
 * This interface defines the contract for the <code> mapped-superclass </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface MappedSuperclass<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MappedSuperclass ElementName: xsd:string ElementType : description
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>description</code> element
    * @param description the value for the element <code>description</code> 
    * @return the current instance of <code>MappedSuperclass<T></code> 
    */
   public MappedSuperclass<T> description(String description);

   /**
    * Returns the <code>description</code> element
    * @return the node defined for the element <code>description</code> 
    */
   public String getDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>MappedSuperclass<T></code> 
    */
   public MappedSuperclass<T> removeDescription();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MappedSuperclass ElementName: orm:id-class ElementType : id-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>id-class</code> element with the given value will be created.
    * Otherwise, the existing <code>id-class</code> element will be returned.
    * @return  a new or existing instance of <code>IdClass<MappedSuperclass<T>></code> 
    */
   public IdClass<MappedSuperclass<T>> getOrCreateIdClass();

   /**
    * Removes the <code>id-class</code> element 
    * @return the current instance of <code>MappedSuperclass<T></code> 
    */
   public MappedSuperclass<T> removeIdClass();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MappedSuperclass ElementName: javaee:emptyType ElementType : exclude-default-listeners
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>exclude-default-listeners</code> element 
    * @return the current instance of <code>MappedSuperclass<T></code> 
    */
   public MappedSuperclass<T> excludeDefaultListeners();

   /**
    * Removes the <code>exclude-default-listeners</code> element 
    * @return the current instance of <code>MappedSuperclass<T></code> 
    */
   public Boolean isExcludeDefaultListeners();

   /**
    * Removes the <code>exclude-default-listeners</code> element 
    * @return the current instance of <code>MappedSuperclass<T></code> 
    */
   public MappedSuperclass<T> removeExcludeDefaultListeners();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MappedSuperclass ElementName: javaee:emptyType ElementType : exclude-superclass-listeners
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>exclude-superclass-listeners</code> element 
    * @return the current instance of <code>MappedSuperclass<T></code> 
    */
   public MappedSuperclass<T> excludeSuperclassListeners();

   /**
    * Removes the <code>exclude-superclass-listeners</code> element 
    * @return the current instance of <code>MappedSuperclass<T></code> 
    */
   public Boolean isExcludeSuperclassListeners();

   /**
    * Removes the <code>exclude-superclass-listeners</code> element 
    * @return the current instance of <code>MappedSuperclass<T></code> 
    */
   public MappedSuperclass<T> removeExcludeSuperclassListeners();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MappedSuperclass ElementName: orm:entity-listeners ElementType : entity-listeners
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>entity-listeners</code> element with the given value will be created.
    * Otherwise, the existing <code>entity-listeners</code> element will be returned.
    * @return  a new or existing instance of <code>EntityListeners<MappedSuperclass<T>></code> 
    */
   public EntityListeners<MappedSuperclass<T>> getOrCreateEntityListeners();

   /**
    * Removes the <code>entity-listeners</code> element 
    * @return the current instance of <code>MappedSuperclass<T></code> 
    */
   public MappedSuperclass<T> removeEntityListeners();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MappedSuperclass ElementName: orm:pre-persist ElementType : pre-persist
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>pre-persist</code> element with the given value will be created.
    * Otherwise, the existing <code>pre-persist</code> element will be returned.
    * @return  a new or existing instance of <code>PrePersist<MappedSuperclass<T>></code> 
    */
   public PrePersist<MappedSuperclass<T>> getOrCreatePrePersist();

   /**
    * Removes the <code>pre-persist</code> element 
    * @return the current instance of <code>MappedSuperclass<T></code> 
    */
   public MappedSuperclass<T> removePrePersist();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MappedSuperclass ElementName: orm:post-persist ElementType : post-persist
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>post-persist</code> element with the given value will be created.
    * Otherwise, the existing <code>post-persist</code> element will be returned.
    * @return  a new or existing instance of <code>PostPersist<MappedSuperclass<T>></code> 
    */
   public PostPersist<MappedSuperclass<T>> getOrCreatePostPersist();

   /**
    * Removes the <code>post-persist</code> element 
    * @return the current instance of <code>MappedSuperclass<T></code> 
    */
   public MappedSuperclass<T> removePostPersist();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MappedSuperclass ElementName: orm:pre-remove ElementType : pre-remove
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>pre-remove</code> element with the given value will be created.
    * Otherwise, the existing <code>pre-remove</code> element will be returned.
    * @return  a new or existing instance of <code>PreRemove<MappedSuperclass<T>></code> 
    */
   public PreRemove<MappedSuperclass<T>> getOrCreatePreRemove();

   /**
    * Removes the <code>pre-remove</code> element 
    * @return the current instance of <code>MappedSuperclass<T></code> 
    */
   public MappedSuperclass<T> removePreRemove();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MappedSuperclass ElementName: orm:post-remove ElementType : post-remove
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>post-remove</code> element with the given value will be created.
    * Otherwise, the existing <code>post-remove</code> element will be returned.
    * @return  a new or existing instance of <code>PostRemove<MappedSuperclass<T>></code> 
    */
   public PostRemove<MappedSuperclass<T>> getOrCreatePostRemove();

   /**
    * Removes the <code>post-remove</code> element 
    * @return the current instance of <code>MappedSuperclass<T></code> 
    */
   public MappedSuperclass<T> removePostRemove();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MappedSuperclass ElementName: orm:pre-update ElementType : pre-update
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>pre-update</code> element with the given value will be created.
    * Otherwise, the existing <code>pre-update</code> element will be returned.
    * @return  a new or existing instance of <code>PreUpdate<MappedSuperclass<T>></code> 
    */
   public PreUpdate<MappedSuperclass<T>> getOrCreatePreUpdate();

   /**
    * Removes the <code>pre-update</code> element 
    * @return the current instance of <code>MappedSuperclass<T></code> 
    */
   public MappedSuperclass<T> removePreUpdate();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MappedSuperclass ElementName: orm:post-update ElementType : post-update
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>post-update</code> element with the given value will be created.
    * Otherwise, the existing <code>post-update</code> element will be returned.
    * @return  a new or existing instance of <code>PostUpdate<MappedSuperclass<T>></code> 
    */
   public PostUpdate<MappedSuperclass<T>> getOrCreatePostUpdate();

   /**
    * Removes the <code>post-update</code> element 
    * @return the current instance of <code>MappedSuperclass<T></code> 
    */
   public MappedSuperclass<T> removePostUpdate();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MappedSuperclass ElementName: orm:post-load ElementType : post-load
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>post-load</code> element with the given value will be created.
    * Otherwise, the existing <code>post-load</code> element will be returned.
    * @return  a new or existing instance of <code>PostLoad<MappedSuperclass<T>></code> 
    */
   public PostLoad<MappedSuperclass<T>> getOrCreatePostLoad();

   /**
    * Removes the <code>post-load</code> element 
    * @return the current instance of <code>MappedSuperclass<T></code> 
    */
   public MappedSuperclass<T> removePostLoad();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MappedSuperclass ElementName: orm:attributes ElementType : attributes
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>attributes</code> element with the given value will be created.
    * Otherwise, the existing <code>attributes</code> element will be returned.
    * @return  a new or existing instance of <code>Attributes<MappedSuperclass<T>></code> 
    */
   public Attributes<MappedSuperclass<T>> getOrCreateAttributes();

   /**
    * Removes the <code>attributes</code> element 
    * @return the current instance of <code>MappedSuperclass<T></code> 
    */
   public MappedSuperclass<T> removeAttributes();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MappedSuperclass ElementName: xsd:string ElementType : class
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>class</code> attribute
    * @param clazz the value for the attribute <code>class</code> 
    * @return the current instance of <code>MappedSuperclass<T></code> 
    */
   public MappedSuperclass<T> clazz(String clazz);

   /**
    * Returns the <code>class</code> attribute
    * @return the value defined for the attribute <code>class</code> 
    */
   public String getClazz();

   /**
    * Removes the <code>class</code> attribute 
    * @return the current instance of <code>MappedSuperclass<T></code> 
    */
   public MappedSuperclass<T> removeClazzAttr();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MappedSuperclass ElementName: orm:access-type ElementType : access
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>access</code> attribute
    * @param access the value for the attribute <code>access</code> 
    * @return the current instance of <code>MappedSuperclass<T></code> 
    */
   public MappedSuperclass<T> access(AccessType access);

   /**
    * Sets the <code>access</code> attribute
    * @param access the value for the attribute <code>access</code> 
    * @return the current instance of <code>MappedSuperclass<T></code> 
    */
   public MappedSuperclass<T> access(String access);

   /**
    * Returns the <code>access</code> attribute
    * @return the value defined for the attribute <code>access</code> 
    */
public AccessType getAccess();

   /**
    * Returns the <code>access</code> attribute
    * @return the value found for the element <code>access</code> 
    */
   public String  getAccessAsString();

   /**
    * Removes the <code>access</code> attribute 
    * @return the current instance of <code>MappedSuperclass<T></code> 
    */
   public MappedSuperclass<T> removeAccess();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MappedSuperclass ElementName: xsd:boolean ElementType : metadata-complete
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>metadata-complete</code> attribute
    * @param metadataComplete the value for the attribute <code>metadata-complete</code> 
    * @return the current instance of <code>MappedSuperclass<T></code> 
    */
   public MappedSuperclass<T> metadataComplete(Boolean metadataComplete);

   /**
    * Returns the <code>metadata-complete</code> attribute
    * @return the value defined for the attribute <code>metadata-complete</code> 
    */
public Boolean isMetadataComplete();

   /**
    * Removes the <code>metadata-complete</code> attribute 
    * @return the current instance of <code>MappedSuperclass<T></code> 
    */
   public MappedSuperclass<T> removeMetadataComplete();
}
