package org.jboss.shrinkwrap.descriptor.api.validationMapping11; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.validationMapping11.ParameterType;
import org.jboss.shrinkwrap.descriptor.api.validationMapping11.CrossParameterType;
import org.jboss.shrinkwrap.descriptor.api.validationMapping11.ReturnValueType;
/**
 * This interface defines the contract for the <code> methodType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface MethodType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MethodType ElementName: map:parameterType ElementType : parameter
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>parameter</code> element will be created and returned.
    * Otherwise, the first existing <code>parameter</code> element will be returned.
    * @return the instance defined for the element <code>parameter</code> 
    */
   public ParameterType<MethodType<T>> getOrCreateParameter();

   /**
    * Creates a new <code>parameter</code> element 
    * @return the new created instance of <code>ParameterType<MethodType<T>></code> 
    */
   public ParameterType<MethodType<T>> createParameter();

   /**
    * Returns all <code>parameter</code> elements
    * @return list of <code>parameter</code> 
    */
   public List<ParameterType<MethodType<T>>> getAllParameter();

   /**
    * Removes all <code>parameter</code> elements 
    * @return the current instance of <code>ParameterType<MethodType<T>></code> 
    */
   public MethodType<T> removeAllParameter();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MethodType ElementName: map:crossParameterType ElementType : cross-parameter
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>cross-parameter</code> element with the given value will be created.
    * Otherwise, the existing <code>cross-parameter</code> element will be returned.
    * @return  a new or existing instance of <code>CrossParameterType<MethodType<T>></code> 
    */
   public CrossParameterType<MethodType<T>> getOrCreateCrossParameter();

   /**
    * Removes the <code>cross-parameter</code> element 
    * @return the current instance of <code>MethodType<T></code> 
    */
   public MethodType<T> removeCrossParameter();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MethodType ElementName: map:returnValueType ElementType : return-value
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>return-value</code> element with the given value will be created.
    * Otherwise, the existing <code>return-value</code> element will be returned.
    * @return  a new or existing instance of <code>ReturnValueType<MethodType<T>></code> 
    */
   public ReturnValueType<MethodType<T>> getOrCreateReturnValue();

   /**
    * Removes the <code>return-value</code> element 
    * @return the current instance of <code>MethodType<T></code> 
    */
   public MethodType<T> removeReturnValue();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MethodType ElementName: xsd:string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>MethodType<T></code> 
    */
   public MethodType<T> name(String name);

   /**
    * Returns the <code>name</code> attribute
    * @return the value defined for the attribute <code>name</code> 
    */
   public String getName();

   /**
    * Removes the <code>name</code> attribute 
    * @return the current instance of <code>MethodType<T></code> 
    */
   public MethodType<T> removeName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MethodType ElementName: xsd:boolean ElementType : ignore-annotations
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>ignore-annotations</code> attribute
    * @param ignoreAnnotations the value for the attribute <code>ignore-annotations</code> 
    * @return the current instance of <code>MethodType<T></code> 
    */
   public MethodType<T> ignoreAnnotations(Boolean ignoreAnnotations);

   /**
    * Returns the <code>ignore-annotations</code> attribute
    * @return the value defined for the attribute <code>ignore-annotations</code> 
    */
public Boolean isIgnoreAnnotations();

   /**
    * Removes the <code>ignore-annotations</code> attribute 
    * @return the current instance of <code>MethodType<T></code> 
    */
   public MethodType<T> removeIgnoreAnnotations();
}
