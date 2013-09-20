package org.jboss.shrinkwrap.descriptor.api.validationMapping11; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> constructorType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface ConstructorType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConstructorType ElementName: map:parameterType ElementType : parameter
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>parameter</code> element will be created and returned.
    * Otherwise, the first existing <code>parameter</code> element will be returned.
    * @return the instance defined for the element <code>parameter</code> 
    */
   public ParameterType<ConstructorType<T>> getOrCreateParameter();

   /**
    * Creates a new <code>parameter</code> element 
    * @return the new created instance of <code>ParameterType<ConstructorType<T>></code> 
    */
   public ParameterType<ConstructorType<T>> createParameter();

   /**
    * Returns all <code>parameter</code> elements
    * @return list of <code>parameter</code> 
    */
   public List<ParameterType<ConstructorType<T>>> getAllParameter();

   /**
    * Removes all <code>parameter</code> elements 
    * @return the current instance of <code>ParameterType<ConstructorType<T>></code> 
    */
   public ConstructorType<T> removeAllParameter();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConstructorType ElementName: map:crossParameterType ElementType : cross-parameter
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>cross-parameter</code> element with the given value will be created.
    * Otherwise, the existing <code>cross-parameter</code> element will be returned.
    * @return  a new or existing instance of <code>CrossParameterType<ConstructorType<T>></code> 
    */
   public CrossParameterType<ConstructorType<T>> getOrCreateCrossParameter();

   /**
    * Removes the <code>cross-parameter</code> element 
    * @return the current instance of <code>ConstructorType<T></code> 
    */
   public ConstructorType<T> removeCrossParameter();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConstructorType ElementName: map:returnValueType ElementType : return-value
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>return-value</code> element with the given value will be created.
    * Otherwise, the existing <code>return-value</code> element will be returned.
    * @return  a new or existing instance of <code>ReturnValueType<ConstructorType<T>></code> 
    */
   public ReturnValueType<ConstructorType<T>> getOrCreateReturnValue();

   /**
    * Removes the <code>return-value</code> element 
    * @return the current instance of <code>ConstructorType<T></code> 
    */
   public ConstructorType<T> removeReturnValue();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConstructorType ElementName: xsd:boolean ElementType : ignore-annotations
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>ignore-annotations</code> attribute
    * @param ignoreAnnotations the value for the attribute <code>ignore-annotations</code> 
    * @return the current instance of <code>ConstructorType<T></code> 
    */
   public ConstructorType<T> ignoreAnnotations(Boolean ignoreAnnotations);

   /**
    * Returns the <code>ignore-annotations</code> attribute
    * @return the value defined for the attribute <code>ignore-annotations</code> 
    */
public Boolean isIgnoreAnnotations();

   /**
    * Removes the <code>ignore-annotations</code> attribute 
    * @return the current instance of <code>ConstructorType<T></code> 
    */
   public ConstructorType<T> removeIgnoreAnnotations();
}
