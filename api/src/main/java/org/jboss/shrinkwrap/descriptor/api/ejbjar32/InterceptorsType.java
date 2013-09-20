package org.jboss.shrinkwrap.descriptor.api.ejbjar32; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> interceptorsType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface InterceptorsType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: InterceptorsType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>InterceptorsType<T></code> 
    */
   public InterceptorsType<T> description(String ... values);

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>InterceptorsType<T></code> 
    */
   public InterceptorsType<T> removeAllDescription();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: InterceptorsType ElementName: javaee:interceptorType ElementType : interceptor
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>interceptor</code> element will be created and returned.
    * Otherwise, the first existing <code>interceptor</code> element will be returned.
    * @return the instance defined for the element <code>interceptor</code> 
    */
   public InterceptorType<InterceptorsType<T>> getOrCreateInterceptor();

   /**
    * Creates a new <code>interceptor</code> element 
    * @return the new created instance of <code>InterceptorType<InterceptorsType<T>></code> 
    */
   public InterceptorType<InterceptorsType<T>> createInterceptor();

   /**
    * Returns all <code>interceptor</code> elements
    * @return list of <code>interceptor</code> 
    */
   public List<InterceptorType<InterceptorsType<T>>> getAllInterceptor();

   /**
    * Removes all <code>interceptor</code> elements 
    * @return the current instance of <code>InterceptorType<InterceptorsType<T>></code> 
    */
   public InterceptorsType<T> removeAllInterceptor();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: InterceptorsType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>InterceptorsType<T></code> 
    */
   public InterceptorsType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>InterceptorsType<T></code> 
    */
   public InterceptorsType<T> removeId();
}
