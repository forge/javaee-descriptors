package org.jboss.shrinkwrap.descriptor.api.validationMapping11; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.validationMapping11.GroupsType;
import org.jboss.shrinkwrap.descriptor.api.validationMapping11.PayloadType;
import org.jboss.shrinkwrap.descriptor.api.validationMapping11.ElementType;
/**
 * This interface defines the contract for the <code> constraintType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface ConstraintType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConstraintType ElementName: xsd:string ElementType : message
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>message</code> element
    * @param message the value for the element <code>message</code> 
    * @return the current instance of <code>ConstraintType<T></code> 
    */
   public ConstraintType<T> message(String message);

   /**
    * Returns the <code>message</code> element
    * @return the node defined for the element <code>message</code> 
    */
   public String getMessage();

   /**
    * Removes the <code>message</code> element 
    * @return the current instance of <code>ConstraintType<T></code> 
    */
   public ConstraintType<T> removeMessage();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConstraintType ElementName: map:groupsType ElementType : groups
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>groups</code> element with the given value will be created.
    * Otherwise, the existing <code>groups</code> element will be returned.
    * @return  a new or existing instance of <code>GroupsType<ConstraintType<T>></code> 
    */
   public GroupsType<ConstraintType<T>> getOrCreateGroups();

   /**
    * Removes the <code>groups</code> element 
    * @return the current instance of <code>ConstraintType<T></code> 
    */
   public ConstraintType<T> removeGroups();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConstraintType ElementName: map:payloadType ElementType : payload
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>payload</code> element with the given value will be created.
    * Otherwise, the existing <code>payload</code> element will be returned.
    * @return  a new or existing instance of <code>PayloadType<ConstraintType<T>></code> 
    */
   public PayloadType<ConstraintType<T>> getOrCreatePayload();

   /**
    * Removes the <code>payload</code> element 
    * @return the current instance of <code>ConstraintType<T></code> 
    */
   public ConstraintType<T> removePayload();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConstraintType ElementName: map:elementType ElementType : element
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>element</code> element will be created and returned.
    * Otherwise, the first existing <code>element</code> element will be returned.
    * @return the instance defined for the element <code>element</code> 
    */
   public ElementType<ConstraintType<T>> getOrCreateElement();

   /**
    * Creates a new <code>element</code> element 
    * @return the new created instance of <code>ElementType<ConstraintType<T>></code> 
    */
   public ElementType<ConstraintType<T>> createElement();

   /**
    * Returns all <code>element</code> elements
    * @return list of <code>element</code> 
    */
   public List<ElementType<ConstraintType<T>>> getAllElement();

   /**
    * Removes all <code>element</code> elements 
    * @return the current instance of <code>ElementType<ConstraintType<T>></code> 
    */
   public ConstraintType<T> removeAllElement();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConstraintType ElementName: xsd:string ElementType : annotation
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>annotation</code> attribute
    * @param annotation the value for the attribute <code>annotation</code> 
    * @return the current instance of <code>ConstraintType<T></code> 
    */
   public ConstraintType<T> annotation(String annotation);

   /**
    * Returns the <code>annotation</code> attribute
    * @return the value defined for the attribute <code>annotation</code> 
    */
   public String getAnnotation();

   /**
    * Removes the <code>annotation</code> attribute 
    * @return the current instance of <code>ConstraintType<T></code> 
    */
   public ConstraintType<T> removeAnnotation();
}
