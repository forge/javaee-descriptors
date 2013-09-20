package org.jboss.shrinkwrap.descriptor.api.validationMapping11; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.validationMapping11.AnnotationType;
/**
 * This interface defines the contract for the <code> elementType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface ElementType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ElementType ElementName: text ElementType : elementType
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the body text for the element <code>elementType</code> 
    * @param elementType the value for the body text <code>elementType</code> 
    * @return the current instance of <code>ElementType<T></code> 
    */
   public ElementType<T> text(String value);

   /**
    * Returns the body text of the element <code>elementType</code> 
    * @return the value defined for the text <code>elementType</code> 
    */
   public String getText();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ElementType ElementName: xsd:string ElementType : value
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>value</code> elements, 
    * a new <code>value</code> element 
    * @param values list of <code>value</code> objects 
    * @return the current instance of <code>ElementType<T></code> 
    */
   public ElementType<T> value(String ... values);

   /**
    * Returns all <code>value</code> elements
    * @return list of <code>value</code> 
    */
   public List<String> getAllValue();

   /**
    * Removes the <code>value</code> element 
    * @return the current instance of <code>ElementType<T></code> 
    */
   public ElementType<T> removeAllValue();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ElementType ElementName: map:annotationType ElementType : annotation
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>annotation</code> element will be created and returned.
    * Otherwise, the first existing <code>annotation</code> element will be returned.
    * @return the instance defined for the element <code>annotation</code> 
    */
   public AnnotationType<ElementType<T>> getOrCreateAnnotation();

   /**
    * Creates a new <code>annotation</code> element 
    * @return the new created instance of <code>AnnotationType<ElementType<T>></code> 
    */
   public AnnotationType<ElementType<T>> createAnnotation();

   /**
    * Returns all <code>annotation</code> elements
    * @return list of <code>annotation</code> 
    */
   public List<AnnotationType<ElementType<T>>> getAllAnnotation();

   /**
    * Removes all <code>annotation</code> elements 
    * @return the current instance of <code>AnnotationType<ElementType<T>></code> 
    */
   public ElementType<T> removeAllAnnotation();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ElementType ElementName: xsd:string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>ElementType<T></code> 
    */
   public ElementType<T> name(String name);

   /**
    * Returns the <code>name</code> attribute
    * @return the value defined for the attribute <code>name</code> 
    */
   public String getName();

   /**
    * Removes the <code>name</code> attribute 
    * @return the current instance of <code>ElementType<T></code> 
    */
   public ElementType<T> removeName();
}
