package org.jboss.shrinkwrap.descriptor.api.ejbjar31; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.MethodParamsType;
/**
 * This interface defines the contract for the <code> query-methodType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface QueryMethodType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: QueryMethodType ElementName: javaee:string ElementType : method-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>method-name</code> element
    * @param methodName the value for the element <code>method-name</code> 
    * @return the current instance of <code>QueryMethodType<T></code> 
    */
   public QueryMethodType<T> methodName(String methodName);

   /**
    * Returns the <code>method-name</code> element
    * @return the node defined for the element <code>method-name</code> 
    */
   public String getMethodName();

   /**
    * Removes the <code>method-name</code> element 
    * @return the current instance of <code>QueryMethodType<T></code> 
    */
   public QueryMethodType<T> removeMethodName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: QueryMethodType ElementName: javaee:method-paramsType ElementType : method-params
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>method-params</code> element with the given value will be created.
    * Otherwise, the existing <code>method-params</code> element will be returned.
    * @return  a new or existing instance of <code>MethodParamsType<QueryMethodType<T>></code> 
    */
   public MethodParamsType<QueryMethodType<T>> getOrCreateMethodParams();

   /**
    * Removes the <code>method-params</code> element 
    * @return the current instance of <code>QueryMethodType<T></code> 
    */
   public QueryMethodType<T> removeMethodParams();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: QueryMethodType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>QueryMethodType<T></code> 
    */
   public QueryMethodType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>QueryMethodType<T></code> 
    */
   public QueryMethodType<T> removeId();
}
