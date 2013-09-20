package org.jboss.shrinkwrap.descriptor.api.validationMapping11; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.validationMapping11.GroupSequenceType;
import org.jboss.shrinkwrap.descriptor.api.validationMapping11.ConstraintType;
/**
 * This interface defines the contract for the <code> classType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface ClassType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ClassType ElementName: map:groupSequenceType ElementType : group-sequence
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>group-sequence</code> element with the given value will be created.
    * Otherwise, the existing <code>group-sequence</code> element will be returned.
    * @return  a new or existing instance of <code>GroupSequenceType<ClassType<T>></code> 
    */
   public GroupSequenceType<ClassType<T>> getOrCreateGroupSequence();

   /**
    * Removes the <code>group-sequence</code> element 
    * @return the current instance of <code>ClassType<T></code> 
    */
   public ClassType<T> removeGroupSequence();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ClassType ElementName: map:constraintType ElementType : constraint
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>constraint</code> element will be created and returned.
    * Otherwise, the first existing <code>constraint</code> element will be returned.
    * @return the instance defined for the element <code>constraint</code> 
    */
   public ConstraintType<ClassType<T>> getOrCreateConstraint();

   /**
    * Creates a new <code>constraint</code> element 
    * @return the new created instance of <code>ConstraintType<ClassType<T>></code> 
    */
   public ConstraintType<ClassType<T>> createConstraint();

   /**
    * Returns all <code>constraint</code> elements
    * @return list of <code>constraint</code> 
    */
   public List<ConstraintType<ClassType<T>>> getAllConstraint();

   /**
    * Removes all <code>constraint</code> elements 
    * @return the current instance of <code>ConstraintType<ClassType<T>></code> 
    */
   public ClassType<T> removeAllConstraint();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ClassType ElementName: xsd:boolean ElementType : ignore-annotations
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>ignore-annotations</code> attribute
    * @param ignoreAnnotations the value for the attribute <code>ignore-annotations</code> 
    * @return the current instance of <code>ClassType<T></code> 
    */
   public ClassType<T> ignoreAnnotations(Boolean ignoreAnnotations);

   /**
    * Returns the <code>ignore-annotations</code> attribute
    * @return the value defined for the attribute <code>ignore-annotations</code> 
    */
public Boolean isIgnoreAnnotations();

   /**
    * Removes the <code>ignore-annotations</code> attribute 
    * @return the current instance of <code>ClassType<T></code> 
    */
   public ClassType<T> removeIgnoreAnnotations();
}
