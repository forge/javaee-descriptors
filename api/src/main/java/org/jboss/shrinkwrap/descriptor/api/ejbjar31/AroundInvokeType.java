package org.jboss.shrinkwrap.descriptor.api.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> around-invokeType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface AroundInvokeType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: AroundInvokeType ElementName: xsd:token ElementType : class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>class</code> element
    * @param clazz the value for the element <code>class</code> 
    * @return the current instance of <code>AroundInvokeType<T></code> 
    */
   public AroundInvokeType<T> clazz(String clazz);

   /**
    * Returns the <code>class</code> element
    * @return the node defined for the element <code>class</code> 
    */
   public String getClazz();

   /**
    * Removes the <code>class</code> element 
    * @return the current instance of <code>AroundInvokeType<T></code> 
    */
   public AroundInvokeType<T> removeClazz();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: AroundInvokeType ElementName: xsd:token ElementType : method-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>method-name</code> element
    * @param methodName the value for the element <code>method-name</code> 
    * @return the current instance of <code>AroundInvokeType<T></code> 
    */
   public AroundInvokeType<T> methodName(String methodName);

   /**
    * Returns the <code>method-name</code> element
    * @return the node defined for the element <code>method-name</code> 
    */
   public String getMethodName();

   /**
    * Removes the <code>method-name</code> element 
    * @return the current instance of <code>AroundInvokeType<T></code> 
    */
   public AroundInvokeType<T> removeMethodName();
}
