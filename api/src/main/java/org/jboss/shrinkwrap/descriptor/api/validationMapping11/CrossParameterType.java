package org.jboss.shrinkwrap.descriptor.api.validationMapping11; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> crossParameterType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface CrossParameterType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: CrossParameterType ElementName: map:constraintType ElementType : constraint
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>constraint</code> element will be created and returned.
    * Otherwise, the first existing <code>constraint</code> element will be returned.
    * @return the instance defined for the element <code>constraint</code> 
    */
   public ConstraintType<CrossParameterType<T>> getOrCreateConstraint();

   /**
    * Creates a new <code>constraint</code> element 
    * @return the new created instance of <code>ConstraintType<CrossParameterType<T>></code> 
    */
   public ConstraintType<CrossParameterType<T>> createConstraint();

   /**
    * Returns all <code>constraint</code> elements
    * @return list of <code>constraint</code> 
    */
   public List<ConstraintType<CrossParameterType<T>>> getAllConstraint();

   /**
    * Removes all <code>constraint</code> elements 
    * @return the current instance of <code>ConstraintType<CrossParameterType<T>></code> 
    */
   public CrossParameterType<T> removeAllConstraint();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: CrossParameterType ElementName: xsd:boolean ElementType : ignore-annotations
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>ignore-annotations</code> attribute
    * @param ignoreAnnotations the value for the attribute <code>ignore-annotations</code> 
    * @return the current instance of <code>CrossParameterType<T></code> 
    */
   public CrossParameterType<T> ignoreAnnotations(Boolean ignoreAnnotations);

   /**
    * Returns the <code>ignore-annotations</code> attribute
    * @return the value defined for the attribute <code>ignore-annotations</code> 
    */
public Boolean isIgnoreAnnotations();

   /**
    * Removes the <code>ignore-annotations</code> attribute 
    * @return the current instance of <code>CrossParameterType<T></code> 
    */
   public CrossParameterType<T> removeIgnoreAnnotations();
}
