package org.jboss.shrinkwrap.descriptor.api.validationMapping11; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.validationMapping11.ClassType;
import org.jboss.shrinkwrap.descriptor.api.validationMapping11.FieldType;
import org.jboss.shrinkwrap.descriptor.api.validationMapping11.GetterType;
import org.jboss.shrinkwrap.descriptor.api.validationMapping11.ConstructorType;
import org.jboss.shrinkwrap.descriptor.api.validationMapping11.MethodType;
/**
 * This interface defines the contract for the <code> beanType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface BeanType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: BeanType ElementName: map:classType ElementType : class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>class</code> element with the given value will be created.
    * Otherwise, the existing <code>class</code> element will be returned.
    * @return  a new or existing instance of <code>ClassType<BeanType<T>></code> 
    */
   public ClassType<BeanType<T>> getOrCreateClazz();

   /**
    * Removes the <code>class</code> element 
    * @return the current instance of <code>BeanType<T></code> 
    */
   public BeanType<T> removeClazz();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: BeanType ElementName: map:fieldType ElementType : field
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>field</code> element will be created and returned.
    * Otherwise, the first existing <code>field</code> element will be returned.
    * @return the instance defined for the element <code>field</code> 
    */
   public FieldType<BeanType<T>> getOrCreateField();

   /**
    * Creates a new <code>field</code> element 
    * @return the new created instance of <code>FieldType<BeanType<T>></code> 
    */
   public FieldType<BeanType<T>> createField();

   /**
    * Returns all <code>field</code> elements
    * @return list of <code>field</code> 
    */
   public List<FieldType<BeanType<T>>> getAllField();

   /**
    * Removes all <code>field</code> elements 
    * @return the current instance of <code>FieldType<BeanType<T>></code> 
    */
   public BeanType<T> removeAllField();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: BeanType ElementName: map:getterType ElementType : getter
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>getter</code> element will be created and returned.
    * Otherwise, the first existing <code>getter</code> element will be returned.
    * @return the instance defined for the element <code>getter</code> 
    */
   public GetterType<BeanType<T>> getOrCreateGetter();

   /**
    * Creates a new <code>getter</code> element 
    * @return the new created instance of <code>GetterType<BeanType<T>></code> 
    */
   public GetterType<BeanType<T>> createGetter();

   /**
    * Returns all <code>getter</code> elements
    * @return list of <code>getter</code> 
    */
   public List<GetterType<BeanType<T>>> getAllGetter();

   /**
    * Removes all <code>getter</code> elements 
    * @return the current instance of <code>GetterType<BeanType<T>></code> 
    */
   public BeanType<T> removeAllGetter();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: BeanType ElementName: map:constructorType ElementType : constructor
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>constructor</code> element will be created and returned.
    * Otherwise, the first existing <code>constructor</code> element will be returned.
    * @return the instance defined for the element <code>constructor</code> 
    */
   public ConstructorType<BeanType<T>> getOrCreateConstructor();

   /**
    * Creates a new <code>constructor</code> element 
    * @return the new created instance of <code>ConstructorType<BeanType<T>></code> 
    */
   public ConstructorType<BeanType<T>> createConstructor();

   /**
    * Returns all <code>constructor</code> elements
    * @return list of <code>constructor</code> 
    */
   public List<ConstructorType<BeanType<T>>> getAllConstructor();

   /**
    * Removes all <code>constructor</code> elements 
    * @return the current instance of <code>ConstructorType<BeanType<T>></code> 
    */
   public BeanType<T> removeAllConstructor();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: BeanType ElementName: map:methodType ElementType : method
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>method</code> element will be created and returned.
    * Otherwise, the first existing <code>method</code> element will be returned.
    * @return the instance defined for the element <code>method</code> 
    */
   public MethodType<BeanType<T>> getOrCreateMethod();

   /**
    * Creates a new <code>method</code> element 
    * @return the new created instance of <code>MethodType<BeanType<T>></code> 
    */
   public MethodType<BeanType<T>> createMethod();

   /**
    * Returns all <code>method</code> elements
    * @return list of <code>method</code> 
    */
   public List<MethodType<BeanType<T>>> getAllMethod();

   /**
    * Removes all <code>method</code> elements 
    * @return the current instance of <code>MethodType<BeanType<T>></code> 
    */
   public BeanType<T> removeAllMethod();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: BeanType ElementName: xsd:string ElementType : class
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>class</code> attribute
    * @param clazz the value for the attribute <code>class</code> 
    * @return the current instance of <code>BeanType<T></code> 
    */
   public BeanType<T> clazz(String clazz);

   /**
    * Returns the <code>class</code> attribute
    * @return the value defined for the attribute <code>class</code> 
    */
   public String getClazz();

   /**
    * Removes the <code>class</code> attribute 
    * @return the current instance of <code>BeanType<T></code> 
    */
   public BeanType<T> removeClazzAttr();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: BeanType ElementName: xsd:boolean ElementType : ignore-annotations
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>ignore-annotations</code> attribute
    * @param ignoreAnnotations the value for the attribute <code>ignore-annotations</code> 
    * @return the current instance of <code>BeanType<T></code> 
    */
   public BeanType<T> ignoreAnnotations(Boolean ignoreAnnotations);

   /**
    * Returns the <code>ignore-annotations</code> attribute
    * @return the value defined for the attribute <code>ignore-annotations</code> 
    */
public Boolean isIgnoreAnnotations();

   /**
    * Removes the <code>ignore-annotations</code> attribute 
    * @return the current instance of <code>BeanType<T></code> 
    */
   public BeanType<T> removeIgnoreAnnotations();
}
