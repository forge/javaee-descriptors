package org.jboss.shrinkwrap.descriptor.api.orm10; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> entity-listeners </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface EntityListeners<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityListeners ElementName: orm:entity-listener ElementType : entity-listener
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>entity-listener</code> element will be created and returned.
    * Otherwise, the first existing <code>entity-listener</code> element will be returned.
    * @return the instance defined for the element <code>entity-listener</code> 
    */
   public EntityListener<EntityListeners<T>> getOrCreateEntityListener();

   /**
    * Creates a new <code>entity-listener</code> element 
    * @return the new created instance of <code>EntityListener<EntityListeners<T>></code> 
    */
   public EntityListener<EntityListeners<T>> createEntityListener();

   /**
    * Returns all <code>entity-listener</code> elements
    * @return list of <code>entity-listener</code> 
    */
   public List<EntityListener<EntityListeners<T>>> getAllEntityListener();

   /**
    * Removes all <code>entity-listener</code> elements 
    * @return the current instance of <code>EntityListener<EntityListeners<T>></code> 
    */
   public EntityListeners<T> removeAllEntityListener();
}
