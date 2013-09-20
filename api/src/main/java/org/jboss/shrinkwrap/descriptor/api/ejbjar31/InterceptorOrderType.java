package org.jboss.shrinkwrap.descriptor.api.ejbjar31; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> interceptor-orderType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface InterceptorOrderType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: InterceptorOrderType ElementName: xsd:token ElementType : interceptor-class
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>interceptor-class</code> elements, 
    * a new <code>interceptor-class</code> element 
    * @param values list of <code>interceptor-class</code> objects 
    * @return the current instance of <code>InterceptorOrderType<T></code> 
    */
   public InterceptorOrderType<T> interceptorClass(String ... values);

   /**
    * Returns all <code>interceptor-class</code> elements
    * @return list of <code>interceptor-class</code> 
    */
   public List<String> getAllInterceptorClass();

   /**
    * Removes the <code>interceptor-class</code> element 
    * @return the current instance of <code>InterceptorOrderType<T></code> 
    */
   public InterceptorOrderType<T> removeAllInterceptorClass();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: InterceptorOrderType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>InterceptorOrderType<T></code> 
    */
   public InterceptorOrderType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>InterceptorOrderType<T></code> 
    */
   public InterceptorOrderType<T> removeId();
}
