package org.jboss.shrinkwrap.descriptor.api.ejbjar30; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> interceptor-bindingType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface InterceptorBindingType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: InterceptorBindingType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>InterceptorBindingType<T></code> 
    */
   public InterceptorBindingType<T> description(String ... values);

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>InterceptorBindingType<T></code> 
    */
   public InterceptorBindingType<T> removeAllDescription();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: InterceptorBindingType ElementName: xsd:token ElementType : ejb-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>ejb-name</code> element
    * @param ejbName the value for the element <code>ejb-name</code> 
    * @return the current instance of <code>InterceptorBindingType<T></code> 
    */
   public InterceptorBindingType<T> ejbName(String ejbName);

   /**
    * Returns the <code>ejb-name</code> element
    * @return the node defined for the element <code>ejb-name</code> 
    */
   public String getEjbName();

   /**
    * Removes the <code>ejb-name</code> element 
    * @return the current instance of <code>InterceptorBindingType<T></code> 
    */
   public InterceptorBindingType<T> removeEjbName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: InterceptorBindingType ElementName: xsd:token ElementType : interceptor-class
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>interceptor-class</code> elements, 
    * a new <code>interceptor-class</code> element 
    * @param values list of <code>interceptor-class</code> objects 
    * @return the current instance of <code>InterceptorBindingType<T></code> 
    */
   public InterceptorBindingType<T> interceptorClass(String ... values);

   /**
    * Returns all <code>interceptor-class</code> elements
    * @return list of <code>interceptor-class</code> 
    */
   public List<String> getAllInterceptorClass();

   /**
    * Removes the <code>interceptor-class</code> element 
    * @return the current instance of <code>InterceptorBindingType<T></code> 
    */
   public InterceptorBindingType<T> removeAllInterceptorClass();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: InterceptorBindingType ElementName: javaee:interceptor-orderType ElementType : interceptor-order
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>interceptor-order</code> element with the given value will be created.
    * Otherwise, the existing <code>interceptor-order</code> element will be returned.
    * @return  a new or existing instance of <code>InterceptorOrderType<InterceptorBindingType<T>></code> 
    */
   public InterceptorOrderType<InterceptorBindingType<T>> getOrCreateInterceptorOrder();

   /**
    * Removes the <code>interceptor-order</code> element 
    * @return the current instance of <code>InterceptorBindingType<T></code> 
    */
   public InterceptorBindingType<T> removeInterceptorOrder();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: InterceptorBindingType ElementName: xsd:boolean ElementType : exclude-default-interceptors
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>exclude-default-interceptors</code> element
    * @param excludeDefaultInterceptors the value for the element <code>exclude-default-interceptors</code> 
    * @return the current instance of <code>InterceptorBindingType<T></code> 
    */
   public InterceptorBindingType<T> excludeDefaultInterceptors(Boolean excludeDefaultInterceptors);

   /**
    * Returns the <code>exclude-default-interceptors</code> element
    * @return the node defined for the element <code>exclude-default-interceptors</code> 
    */
   public Boolean isExcludeDefaultInterceptors();

   /**
    * Removes the <code>exclude-default-interceptors</code> element 
    * @return the current instance of <code>InterceptorBindingType<T></code> 
    */
   public InterceptorBindingType<T> removeExcludeDefaultInterceptors();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: InterceptorBindingType ElementName: xsd:boolean ElementType : exclude-class-interceptors
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>exclude-class-interceptors</code> element
    * @param excludeClassInterceptors the value for the element <code>exclude-class-interceptors</code> 
    * @return the current instance of <code>InterceptorBindingType<T></code> 
    */
   public InterceptorBindingType<T> excludeClassInterceptors(Boolean excludeClassInterceptors);

   /**
    * Returns the <code>exclude-class-interceptors</code> element
    * @return the node defined for the element <code>exclude-class-interceptors</code> 
    */
   public Boolean isExcludeClassInterceptors();

   /**
    * Removes the <code>exclude-class-interceptors</code> element 
    * @return the current instance of <code>InterceptorBindingType<T></code> 
    */
   public InterceptorBindingType<T> removeExcludeClassInterceptors();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: InterceptorBindingType ElementName: javaee:named-methodType ElementType : method
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>method</code> element with the given value will be created.
    * Otherwise, the existing <code>method</code> element will be returned.
    * @return  a new or existing instance of <code>NamedMethodType<InterceptorBindingType<T>></code> 
    */
   public NamedMethodType<InterceptorBindingType<T>> getOrCreateMethod();

   /**
    * Removes the <code>method</code> element 
    * @return the current instance of <code>InterceptorBindingType<T></code> 
    */
   public InterceptorBindingType<T> removeMethod();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: InterceptorBindingType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>InterceptorBindingType<T></code> 
    */
   public InterceptorBindingType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>InterceptorBindingType<T></code> 
    */
   public InterceptorBindingType<T> removeId();
}
