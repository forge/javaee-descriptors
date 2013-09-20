package org.jboss.shrinkwrap.descriptor.api.validationMapping11; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.validationMapping11.ElementType;
/**
 * This interface defines the contract for the <code> annotationType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface AnnotationType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: AnnotationType ElementName: map:elementType ElementType : element
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>element</code> element will be created and returned.
    * Otherwise, the first existing <code>element</code> element will be returned.
    * @return the instance defined for the element <code>element</code> 
    */
   public ElementType<AnnotationType<T>> getOrCreateElement();

   /**
    * Creates a new <code>element</code> element 
    * @return the new created instance of <code>ElementType<AnnotationType<T>></code> 
    */
   public ElementType<AnnotationType<T>> createElement();

   /**
    * Returns all <code>element</code> elements
    * @return list of <code>element</code> 
    */
   public List<ElementType<AnnotationType<T>>> getAllElement();

   /**
    * Removes all <code>element</code> elements 
    * @return the current instance of <code>ElementType<AnnotationType<T>></code> 
    */
   public AnnotationType<T> removeAllElement();
}
