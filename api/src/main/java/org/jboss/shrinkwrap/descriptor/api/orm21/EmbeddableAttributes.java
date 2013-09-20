package org.jboss.shrinkwrap.descriptor.api.orm21; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.orm21.Basic;
import org.jboss.shrinkwrap.descriptor.api.orm21.ManyToOne;
import org.jboss.shrinkwrap.descriptor.api.orm21.OneToMany;
import org.jboss.shrinkwrap.descriptor.api.orm21.OneToOne;
import org.jboss.shrinkwrap.descriptor.api.orm21.ManyToMany;
import org.jboss.shrinkwrap.descriptor.api.orm21.ElementCollection;
import org.jboss.shrinkwrap.descriptor.api.orm21.Embedded;
import org.jboss.shrinkwrap.descriptor.api.orm21.Transient;
/**
 * This interface defines the contract for the <code> embeddable-attributes </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface EmbeddableAttributes<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EmbeddableAttributes ElementName: orm:basic ElementType : basic
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>basic</code> element will be created and returned.
    * Otherwise, the first existing <code>basic</code> element will be returned.
    * @return the instance defined for the element <code>basic</code> 
    */
   public Basic<EmbeddableAttributes<T>> getOrCreateBasic();

   /**
    * Creates a new <code>basic</code> element 
    * @return the new created instance of <code>Basic<EmbeddableAttributes<T>></code> 
    */
   public Basic<EmbeddableAttributes<T>> createBasic();

   /**
    * Returns all <code>basic</code> elements
    * @return list of <code>basic</code> 
    */
   public List<Basic<EmbeddableAttributes<T>>> getAllBasic();

   /**
    * Removes all <code>basic</code> elements 
    * @return the current instance of <code>Basic<EmbeddableAttributes<T>></code> 
    */
   public EmbeddableAttributes<T> removeAllBasic();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EmbeddableAttributes ElementName: orm:many-to-one ElementType : many-to-one
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>many-to-one</code> element will be created and returned.
    * Otherwise, the first existing <code>many-to-one</code> element will be returned.
    * @return the instance defined for the element <code>many-to-one</code> 
    */
   public ManyToOne<EmbeddableAttributes<T>> getOrCreateManyToOne();

   /**
    * Creates a new <code>many-to-one</code> element 
    * @return the new created instance of <code>ManyToOne<EmbeddableAttributes<T>></code> 
    */
   public ManyToOne<EmbeddableAttributes<T>> createManyToOne();

   /**
    * Returns all <code>many-to-one</code> elements
    * @return list of <code>many-to-one</code> 
    */
   public List<ManyToOne<EmbeddableAttributes<T>>> getAllManyToOne();

   /**
    * Removes all <code>many-to-one</code> elements 
    * @return the current instance of <code>ManyToOne<EmbeddableAttributes<T>></code> 
    */
   public EmbeddableAttributes<T> removeAllManyToOne();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EmbeddableAttributes ElementName: orm:one-to-many ElementType : one-to-many
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>one-to-many</code> element will be created and returned.
    * Otherwise, the first existing <code>one-to-many</code> element will be returned.
    * @return the instance defined for the element <code>one-to-many</code> 
    */
   public OneToMany<EmbeddableAttributes<T>> getOrCreateOneToMany();

   /**
    * Creates a new <code>one-to-many</code> element 
    * @return the new created instance of <code>OneToMany<EmbeddableAttributes<T>></code> 
    */
   public OneToMany<EmbeddableAttributes<T>> createOneToMany();

   /**
    * Returns all <code>one-to-many</code> elements
    * @return list of <code>one-to-many</code> 
    */
   public List<OneToMany<EmbeddableAttributes<T>>> getAllOneToMany();

   /**
    * Removes all <code>one-to-many</code> elements 
    * @return the current instance of <code>OneToMany<EmbeddableAttributes<T>></code> 
    */
   public EmbeddableAttributes<T> removeAllOneToMany();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EmbeddableAttributes ElementName: orm:one-to-one ElementType : one-to-one
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>one-to-one</code> element will be created and returned.
    * Otherwise, the first existing <code>one-to-one</code> element will be returned.
    * @return the instance defined for the element <code>one-to-one</code> 
    */
   public OneToOne<EmbeddableAttributes<T>> getOrCreateOneToOne();

   /**
    * Creates a new <code>one-to-one</code> element 
    * @return the new created instance of <code>OneToOne<EmbeddableAttributes<T>></code> 
    */
   public OneToOne<EmbeddableAttributes<T>> createOneToOne();

   /**
    * Returns all <code>one-to-one</code> elements
    * @return list of <code>one-to-one</code> 
    */
   public List<OneToOne<EmbeddableAttributes<T>>> getAllOneToOne();

   /**
    * Removes all <code>one-to-one</code> elements 
    * @return the current instance of <code>OneToOne<EmbeddableAttributes<T>></code> 
    */
   public EmbeddableAttributes<T> removeAllOneToOne();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EmbeddableAttributes ElementName: orm:many-to-many ElementType : many-to-many
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>many-to-many</code> element will be created and returned.
    * Otherwise, the first existing <code>many-to-many</code> element will be returned.
    * @return the instance defined for the element <code>many-to-many</code> 
    */
   public ManyToMany<EmbeddableAttributes<T>> getOrCreateManyToMany();

   /**
    * Creates a new <code>many-to-many</code> element 
    * @return the new created instance of <code>ManyToMany<EmbeddableAttributes<T>></code> 
    */
   public ManyToMany<EmbeddableAttributes<T>> createManyToMany();

   /**
    * Returns all <code>many-to-many</code> elements
    * @return list of <code>many-to-many</code> 
    */
   public List<ManyToMany<EmbeddableAttributes<T>>> getAllManyToMany();

   /**
    * Removes all <code>many-to-many</code> elements 
    * @return the current instance of <code>ManyToMany<EmbeddableAttributes<T>></code> 
    */
   public EmbeddableAttributes<T> removeAllManyToMany();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EmbeddableAttributes ElementName: orm:element-collection ElementType : element-collection
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>element-collection</code> element will be created and returned.
    * Otherwise, the first existing <code>element-collection</code> element will be returned.
    * @return the instance defined for the element <code>element-collection</code> 
    */
   public ElementCollection<EmbeddableAttributes<T>> getOrCreateElementCollection();

   /**
    * Creates a new <code>element-collection</code> element 
    * @return the new created instance of <code>ElementCollection<EmbeddableAttributes<T>></code> 
    */
   public ElementCollection<EmbeddableAttributes<T>> createElementCollection();

   /**
    * Returns all <code>element-collection</code> elements
    * @return list of <code>element-collection</code> 
    */
   public List<ElementCollection<EmbeddableAttributes<T>>> getAllElementCollection();

   /**
    * Removes all <code>element-collection</code> elements 
    * @return the current instance of <code>ElementCollection<EmbeddableAttributes<T>></code> 
    */
   public EmbeddableAttributes<T> removeAllElementCollection();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EmbeddableAttributes ElementName: orm:embedded ElementType : embedded
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>embedded</code> element will be created and returned.
    * Otherwise, the first existing <code>embedded</code> element will be returned.
    * @return the instance defined for the element <code>embedded</code> 
    */
   public Embedded<EmbeddableAttributes<T>> getOrCreateEmbedded();

   /**
    * Creates a new <code>embedded</code> element 
    * @return the new created instance of <code>Embedded<EmbeddableAttributes<T>></code> 
    */
   public Embedded<EmbeddableAttributes<T>> createEmbedded();

   /**
    * Returns all <code>embedded</code> elements
    * @return list of <code>embedded</code> 
    */
   public List<Embedded<EmbeddableAttributes<T>>> getAllEmbedded();

   /**
    * Removes all <code>embedded</code> elements 
    * @return the current instance of <code>Embedded<EmbeddableAttributes<T>></code> 
    */
   public EmbeddableAttributes<T> removeAllEmbedded();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EmbeddableAttributes ElementName: orm:transient ElementType : transient
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>transient</code> element will be created and returned.
    * Otherwise, the first existing <code>transient</code> element will be returned.
    * @return the instance defined for the element <code>transient</code> 
    */
   public Transient<EmbeddableAttributes<T>> getOrCreateTransient();

   /**
    * Creates a new <code>transient</code> element 
    * @return the new created instance of <code>Transient<EmbeddableAttributes<T>></code> 
    */
   public Transient<EmbeddableAttributes<T>> createTransient();

   /**
    * Returns all <code>transient</code> elements
    * @return list of <code>transient</code> 
    */
   public List<Transient<EmbeddableAttributes<T>>> getAllTransient();

   /**
    * Removes all <code>transient</code> elements 
    * @return the current instance of <code>Transient<EmbeddableAttributes<T>></code> 
    */
   public EmbeddableAttributes<T> removeAllTransient();
}
