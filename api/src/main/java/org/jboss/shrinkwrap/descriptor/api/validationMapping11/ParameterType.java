package org.jboss.shrinkwrap.descriptor.api.validationMapping11; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> parameterType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface ParameterType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ParameterType ElementName: xsd:string ElementType : valid
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>valid</code> element
    * @param valid the value for the element <code>valid</code> 
    * @return the current instance of <code>ParameterType<T></code> 
    */
   public ParameterType<T> valid(String valid);

   /**
    * Returns the <code>valid</code> element
    * @return the node defined for the element <code>valid</code> 
    */
   public String getValid();

   /**
    * Removes the <code>valid</code> element 
    * @return the current instance of <code>ParameterType<T></code> 
    */
   public ParameterType<T> removeValid();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ParameterType ElementName: map:groupConversionType ElementType : convert-group
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>convert-group</code> element will be created and returned.
    * Otherwise, the first existing <code>convert-group</code> element will be returned.
    * @return the instance defined for the element <code>convert-group</code> 
    */
   public GroupConversionType<ParameterType<T>> getOrCreateConvertGroup();

   /**
    * Creates a new <code>convert-group</code> element 
    * @return the new created instance of <code>GroupConversionType<ParameterType<T>></code> 
    */
   public GroupConversionType<ParameterType<T>> createConvertGroup();

   /**
    * Returns all <code>convert-group</code> elements
    * @return list of <code>convert-group</code> 
    */
   public List<GroupConversionType<ParameterType<T>>> getAllConvertGroup();

   /**
    * Removes all <code>convert-group</code> elements 
    * @return the current instance of <code>GroupConversionType<ParameterType<T>></code> 
    */
   public ParameterType<T> removeAllConvertGroup();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ParameterType ElementName: map:constraintType ElementType : constraint
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>constraint</code> element will be created and returned.
    * Otherwise, the first existing <code>constraint</code> element will be returned.
    * @return the instance defined for the element <code>constraint</code> 
    */
   public ConstraintType<ParameterType<T>> getOrCreateConstraint();

   /**
    * Creates a new <code>constraint</code> element 
    * @return the new created instance of <code>ConstraintType<ParameterType<T>></code> 
    */
   public ConstraintType<ParameterType<T>> createConstraint();

   /**
    * Returns all <code>constraint</code> elements
    * @return list of <code>constraint</code> 
    */
   public List<ConstraintType<ParameterType<T>>> getAllConstraint();

   /**
    * Removes all <code>constraint</code> elements 
    * @return the current instance of <code>ConstraintType<ParameterType<T>></code> 
    */
   public ParameterType<T> removeAllConstraint();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ParameterType ElementName: xsd:string ElementType : type
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>type</code> attribute
    * @param type the value for the attribute <code>type</code> 
    * @return the current instance of <code>ParameterType<T></code> 
    */
   public ParameterType<T> type(String type);

   /**
    * Returns the <code>type</code> attribute
    * @return the value defined for the attribute <code>type</code> 
    */
   public String getType();

   /**
    * Removes the <code>type</code> attribute 
    * @return the current instance of <code>ParameterType<T></code> 
    */
   public ParameterType<T> removeType();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ParameterType ElementName: xsd:boolean ElementType : ignore-annotations
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>ignore-annotations</code> attribute
    * @param ignoreAnnotations the value for the attribute <code>ignore-annotations</code> 
    * @return the current instance of <code>ParameterType<T></code> 
    */
   public ParameterType<T> ignoreAnnotations(Boolean ignoreAnnotations);

   /**
    * Returns the <code>ignore-annotations</code> attribute
    * @return the value defined for the attribute <code>ignore-annotations</code> 
    */
public Boolean isIgnoreAnnotations();

   /**
    * Removes the <code>ignore-annotations</code> attribute 
    * @return the current instance of <code>ParameterType<T></code> 
    */
   public ParameterType<T> removeIgnoreAnnotations();
}
