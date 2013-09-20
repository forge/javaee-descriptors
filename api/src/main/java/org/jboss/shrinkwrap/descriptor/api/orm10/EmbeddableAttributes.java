package org.jboss.shrinkwrap.descriptor.api.orm10; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.orm10.Basic;
import org.jboss.shrinkwrap.descriptor.api.orm10.Transient;
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
