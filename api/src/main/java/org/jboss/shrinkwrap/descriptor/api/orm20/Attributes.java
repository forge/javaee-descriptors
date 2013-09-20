package org.jboss.shrinkwrap.descriptor.api.orm20; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> attributes </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface Attributes<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Attributes ElementName: xsd:string ElementType : description
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>description</code> element
    * @param description the value for the element <code>description</code> 
    * @return the current instance of <code>Attributes<T></code> 
    */
   public Attributes<T> description(String description);

   /**
    * Returns the <code>description</code> element
    * @return the node defined for the element <code>description</code> 
    */
   public String getDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>Attributes<T></code> 
    */
   public Attributes<T> removeDescription();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Attributes ElementName: orm:id ElementType : id
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>id</code> element will be created and returned.
    * Otherwise, the first existing <code>id</code> element will be returned.
    * @return the instance defined for the element <code>id</code> 
    */
   public Id<Attributes<T>> getOrCreateId();

   /**
    * Creates a new <code>id</code> element 
    * @return the new created instance of <code>Id<Attributes<T>></code> 
    */
   public Id<Attributes<T>> createId();

   /**
    * Returns all <code>id</code> elements
    * @return list of <code>id</code> 
    */
   public List<Id<Attributes<T>>> getAllId();

   /**
    * Removes all <code>id</code> elements 
    * @return the current instance of <code>Id<Attributes<T>></code> 
    */
   public Attributes<T> removeAllId();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Attributes ElementName: orm:embedded-id ElementType : embedded-id
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>embedded-id</code> element with the given value will be created.
    * Otherwise, the existing <code>embedded-id</code> element will be returned.
    * @return  a new or existing instance of <code>EmbeddedId<Attributes<T>></code> 
    */
   public EmbeddedId<Attributes<T>> getOrCreateEmbeddedId();

   /**
    * Removes the <code>embedded-id</code> element 
    * @return the current instance of <code>Attributes<T></code> 
    */
   public Attributes<T> removeEmbeddedId();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Attributes ElementName: orm:basic ElementType : basic
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>basic</code> element will be created and returned.
    * Otherwise, the first existing <code>basic</code> element will be returned.
    * @return the instance defined for the element <code>basic</code> 
    */
   public Basic<Attributes<T>> getOrCreateBasic();

   /**
    * Creates a new <code>basic</code> element 
    * @return the new created instance of <code>Basic<Attributes<T>></code> 
    */
   public Basic<Attributes<T>> createBasic();

   /**
    * Returns all <code>basic</code> elements
    * @return list of <code>basic</code> 
    */
   public List<Basic<Attributes<T>>> getAllBasic();

   /**
    * Removes all <code>basic</code> elements 
    * @return the current instance of <code>Basic<Attributes<T>></code> 
    */
   public Attributes<T> removeAllBasic();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Attributes ElementName: orm:version ElementType : version
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>version</code> element will be created and returned.
    * Otherwise, the first existing <code>version</code> element will be returned.
    * @return the instance defined for the element <code>version</code> 
    */
   public Version<Attributes<T>> getOrCreateVersion();

   /**
    * Creates a new <code>version</code> element 
    * @return the new created instance of <code>Version<Attributes<T>></code> 
    */
   public Version<Attributes<T>> createVersion();

   /**
    * Returns all <code>version</code> elements
    * @return list of <code>version</code> 
    */
   public List<Version<Attributes<T>>> getAllVersion();

   /**
    * Removes all <code>version</code> elements 
    * @return the current instance of <code>Version<Attributes<T>></code> 
    */
   public Attributes<T> removeAllVersion();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Attributes ElementName: orm:many-to-one ElementType : many-to-one
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>many-to-one</code> element will be created and returned.
    * Otherwise, the first existing <code>many-to-one</code> element will be returned.
    * @return the instance defined for the element <code>many-to-one</code> 
    */
   public ManyToOne<Attributes<T>> getOrCreateManyToOne();

   /**
    * Creates a new <code>many-to-one</code> element 
    * @return the new created instance of <code>ManyToOne<Attributes<T>></code> 
    */
   public ManyToOne<Attributes<T>> createManyToOne();

   /**
    * Returns all <code>many-to-one</code> elements
    * @return list of <code>many-to-one</code> 
    */
   public List<ManyToOne<Attributes<T>>> getAllManyToOne();

   /**
    * Removes all <code>many-to-one</code> elements 
    * @return the current instance of <code>ManyToOne<Attributes<T>></code> 
    */
   public Attributes<T> removeAllManyToOne();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Attributes ElementName: orm:one-to-many ElementType : one-to-many
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>one-to-many</code> element will be created and returned.
    * Otherwise, the first existing <code>one-to-many</code> element will be returned.
    * @return the instance defined for the element <code>one-to-many</code> 
    */
   public OneToMany<Attributes<T>> getOrCreateOneToMany();

   /**
    * Creates a new <code>one-to-many</code> element 
    * @return the new created instance of <code>OneToMany<Attributes<T>></code> 
    */
   public OneToMany<Attributes<T>> createOneToMany();

   /**
    * Returns all <code>one-to-many</code> elements
    * @return list of <code>one-to-many</code> 
    */
   public List<OneToMany<Attributes<T>>> getAllOneToMany();

   /**
    * Removes all <code>one-to-many</code> elements 
    * @return the current instance of <code>OneToMany<Attributes<T>></code> 
    */
   public Attributes<T> removeAllOneToMany();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Attributes ElementName: orm:one-to-one ElementType : one-to-one
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>one-to-one</code> element will be created and returned.
    * Otherwise, the first existing <code>one-to-one</code> element will be returned.
    * @return the instance defined for the element <code>one-to-one</code> 
    */
   public OneToOne<Attributes<T>> getOrCreateOneToOne();

   /**
    * Creates a new <code>one-to-one</code> element 
    * @return the new created instance of <code>OneToOne<Attributes<T>></code> 
    */
   public OneToOne<Attributes<T>> createOneToOne();

   /**
    * Returns all <code>one-to-one</code> elements
    * @return list of <code>one-to-one</code> 
    */
   public List<OneToOne<Attributes<T>>> getAllOneToOne();

   /**
    * Removes all <code>one-to-one</code> elements 
    * @return the current instance of <code>OneToOne<Attributes<T>></code> 
    */
   public Attributes<T> removeAllOneToOne();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Attributes ElementName: orm:many-to-many ElementType : many-to-many
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>many-to-many</code> element will be created and returned.
    * Otherwise, the first existing <code>many-to-many</code> element will be returned.
    * @return the instance defined for the element <code>many-to-many</code> 
    */
   public ManyToMany<Attributes<T>> getOrCreateManyToMany();

   /**
    * Creates a new <code>many-to-many</code> element 
    * @return the new created instance of <code>ManyToMany<Attributes<T>></code> 
    */
   public ManyToMany<Attributes<T>> createManyToMany();

   /**
    * Returns all <code>many-to-many</code> elements
    * @return list of <code>many-to-many</code> 
    */
   public List<ManyToMany<Attributes<T>>> getAllManyToMany();

   /**
    * Removes all <code>many-to-many</code> elements 
    * @return the current instance of <code>ManyToMany<Attributes<T>></code> 
    */
   public Attributes<T> removeAllManyToMany();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Attributes ElementName: orm:element-collection ElementType : element-collection
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>element-collection</code> element will be created and returned.
    * Otherwise, the first existing <code>element-collection</code> element will be returned.
    * @return the instance defined for the element <code>element-collection</code> 
    */
   public ElementCollection<Attributes<T>> getOrCreateElementCollection();

   /**
    * Creates a new <code>element-collection</code> element 
    * @return the new created instance of <code>ElementCollection<Attributes<T>></code> 
    */
   public ElementCollection<Attributes<T>> createElementCollection();

   /**
    * Returns all <code>element-collection</code> elements
    * @return list of <code>element-collection</code> 
    */
   public List<ElementCollection<Attributes<T>>> getAllElementCollection();

   /**
    * Removes all <code>element-collection</code> elements 
    * @return the current instance of <code>ElementCollection<Attributes<T>></code> 
    */
   public Attributes<T> removeAllElementCollection();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Attributes ElementName: orm:embedded ElementType : embedded
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>embedded</code> element will be created and returned.
    * Otherwise, the first existing <code>embedded</code> element will be returned.
    * @return the instance defined for the element <code>embedded</code> 
    */
   public Embedded<Attributes<T>> getOrCreateEmbedded();

   /**
    * Creates a new <code>embedded</code> element 
    * @return the new created instance of <code>Embedded<Attributes<T>></code> 
    */
   public Embedded<Attributes<T>> createEmbedded();

   /**
    * Returns all <code>embedded</code> elements
    * @return list of <code>embedded</code> 
    */
   public List<Embedded<Attributes<T>>> getAllEmbedded();

   /**
    * Removes all <code>embedded</code> elements 
    * @return the current instance of <code>Embedded<Attributes<T>></code> 
    */
   public Attributes<T> removeAllEmbedded();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Attributes ElementName: orm:transient ElementType : transient
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>transient</code> element will be created and returned.
    * Otherwise, the first existing <code>transient</code> element will be returned.
    * @return the instance defined for the element <code>transient</code> 
    */
   public Transient<Attributes<T>> getOrCreateTransient();

   /**
    * Creates a new <code>transient</code> element 
    * @return the new created instance of <code>Transient<Attributes<T>></code> 
    */
   public Transient<Attributes<T>> createTransient();

   /**
    * Returns all <code>transient</code> elements
    * @return list of <code>transient</code> 
    */
   public List<Transient<Attributes<T>>> getAllTransient();

   /**
    * Removes all <code>transient</code> elements 
    * @return the current instance of <code>Transient<Attributes<T>></code> 
    */
   public Attributes<T> removeAllTransient();
}
