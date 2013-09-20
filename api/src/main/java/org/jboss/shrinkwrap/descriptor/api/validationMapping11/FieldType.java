package org.jboss.shrinkwrap.descriptor.api.validationMapping11; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.validationMapping11.GroupConversionType;
import org.jboss.shrinkwrap.descriptor.api.validationMapping11.ConstraintType;
/**
 * This interface defines the contract for the <code> fieldType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface FieldType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FieldType ElementName: xsd:string ElementType : valid
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>valid</code> element
    * @param valid the value for the element <code>valid</code> 
    * @return the current instance of <code>FieldType<T></code> 
    */
   public FieldType<T> valid(String valid);

   /**
    * Returns the <code>valid</code> element
    * @return the node defined for the element <code>valid</code> 
    */
   public String getValid();

   /**
    * Removes the <code>valid</code> element 
    * @return the current instance of <code>FieldType<T></code> 
    */
   public FieldType<T> removeValid();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FieldType ElementName: map:groupConversionType ElementType : convert-group
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>convert-group</code> element will be created and returned.
    * Otherwise, the first existing <code>convert-group</code> element will be returned.
    * @return the instance defined for the element <code>convert-group</code> 
    */
   public GroupConversionType<FieldType<T>> getOrCreateConvertGroup();

   /**
    * Creates a new <code>convert-group</code> element 
    * @return the new created instance of <code>GroupConversionType<FieldType<T>></code> 
    */
   public GroupConversionType<FieldType<T>> createConvertGroup();

   /**
    * Returns all <code>convert-group</code> elements
    * @return list of <code>convert-group</code> 
    */
   public List<GroupConversionType<FieldType<T>>> getAllConvertGroup();

   /**
    * Removes all <code>convert-group</code> elements 
    * @return the current instance of <code>GroupConversionType<FieldType<T>></code> 
    */
   public FieldType<T> removeAllConvertGroup();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FieldType ElementName: map:constraintType ElementType : constraint
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>constraint</code> element will be created and returned.
    * Otherwise, the first existing <code>constraint</code> element will be returned.
    * @return the instance defined for the element <code>constraint</code> 
    */
   public ConstraintType<FieldType<T>> getOrCreateConstraint();

   /**
    * Creates a new <code>constraint</code> element 
    * @return the new created instance of <code>ConstraintType<FieldType<T>></code> 
    */
   public ConstraintType<FieldType<T>> createConstraint();

   /**
    * Returns all <code>constraint</code> elements
    * @return list of <code>constraint</code> 
    */
   public List<ConstraintType<FieldType<T>>> getAllConstraint();

   /**
    * Removes all <code>constraint</code> elements 
    * @return the current instance of <code>ConstraintType<FieldType<T>></code> 
    */
   public FieldType<T> removeAllConstraint();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FieldType ElementName: xsd:string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>FieldType<T></code> 
    */
   public FieldType<T> name(String name);

   /**
    * Returns the <code>name</code> attribute
    * @return the value defined for the attribute <code>name</code> 
    */
   public String getName();

   /**
    * Removes the <code>name</code> attribute 
    * @return the current instance of <code>FieldType<T></code> 
    */
   public FieldType<T> removeName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FieldType ElementName: xsd:boolean ElementType : ignore-annotations
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>ignore-annotations</code> attribute
    * @param ignoreAnnotations the value for the attribute <code>ignore-annotations</code> 
    * @return the current instance of <code>FieldType<T></code> 
    */
   public FieldType<T> ignoreAnnotations(Boolean ignoreAnnotations);

   /**
    * Returns the <code>ignore-annotations</code> attribute
    * @return the value defined for the attribute <code>ignore-annotations</code> 
    */
public Boolean isIgnoreAnnotations();

   /**
    * Removes the <code>ignore-annotations</code> attribute 
    * @return the current instance of <code>FieldType<T></code> 
    */
   public FieldType<T> removeIgnoreAnnotations();
}
