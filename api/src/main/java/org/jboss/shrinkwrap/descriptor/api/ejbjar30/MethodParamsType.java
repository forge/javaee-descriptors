package org.jboss.shrinkwrap.descriptor.api.ejbjar30; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> method-paramsType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface MethodParamsType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MethodParamsType ElementName: xsd:token ElementType : method-param
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>method-param</code> elements, 
    * a new <code>method-param</code> element 
    * @param values list of <code>method-param</code> objects 
    * @return the current instance of <code>MethodParamsType<T></code> 
    */
   public MethodParamsType<T> methodParam(String ... values);

   /**
    * Returns all <code>method-param</code> elements
    * @return list of <code>method-param</code> 
    */
   public List<String> getAllMethodParam();

   /**
    * Removes the <code>method-param</code> element 
    * @return the current instance of <code>MethodParamsType<T></code> 
    */
   public MethodParamsType<T> removeAllMethodParam();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MethodParamsType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>MethodParamsType<T></code> 
    */
   public MethodParamsType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>MethodParamsType<T></code> 
    */
   public MethodParamsType<T> removeId();
}
