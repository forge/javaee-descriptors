package org.jboss.shrinkwrap.descriptor.api.jsptaglibrary21; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee5.ParamValueType;
/**
 * This interface defines the contract for the <code> validatorType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface ValidatorType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ValidatorType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>ValidatorType<T></code> 
    */
   public ValidatorType<T> description(String ... values);

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>ValidatorType<T></code> 
    */
   public ValidatorType<T> removeAllDescription();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ValidatorType ElementName: xsd:token ElementType : validator-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>validator-class</code> element
    * @param validatorClass the value for the element <code>validator-class</code> 
    * @return the current instance of <code>ValidatorType<T></code> 
    */
   public ValidatorType<T> validatorClass(String validatorClass);

   /**
    * Returns the <code>validator-class</code> element
    * @return the node defined for the element <code>validator-class</code> 
    */
   public String getValidatorClass();

   /**
    * Removes the <code>validator-class</code> element 
    * @return the current instance of <code>ValidatorType<T></code> 
    */
   public ValidatorType<T> removeValidatorClass();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ValidatorType ElementName: javaee:param-valueType ElementType : init-param
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>init-param</code> element will be created and returned.
    * Otherwise, the first existing <code>init-param</code> element will be returned.
    * @return the instance defined for the element <code>init-param</code> 
    */
   public ParamValueType<ValidatorType<T>> getOrCreateInitParam();

   /**
    * Creates a new <code>init-param</code> element 
    * @return the new created instance of <code>ParamValueType<ValidatorType<T>></code> 
    */
   public ParamValueType<ValidatorType<T>> createInitParam();

   /**
    * Returns all <code>init-param</code> elements
    * @return list of <code>init-param</code> 
    */
   public List<ParamValueType<ValidatorType<T>>> getAllInitParam();

   /**
    * Removes all <code>init-param</code> elements 
    * @return the current instance of <code>ParamValueType<ValidatorType<T>></code> 
    */
   public ValidatorType<T> removeAllInitParam();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ValidatorType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>ValidatorType<T></code> 
    */
   public ValidatorType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>ValidatorType<T></code> 
    */
   public ValidatorType<T> removeId();
}
