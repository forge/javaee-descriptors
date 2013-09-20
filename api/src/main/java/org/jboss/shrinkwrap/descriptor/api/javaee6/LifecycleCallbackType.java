package org.jboss.shrinkwrap.descriptor.api.javaee6; 

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> lifecycle-callbackType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface LifecycleCallbackType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: LifecycleCallbackType ElementName: xsd:token ElementType : lifecycle-callback-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>lifecycle-callback-class</code> element
    * @param lifecycleCallbackClass the value for the element <code>lifecycle-callback-class</code> 
    * @return the current instance of <code>LifecycleCallbackType<T></code> 
    */
   public LifecycleCallbackType<T> lifecycleCallbackClass(String lifecycleCallbackClass);

   /**
    * Returns the <code>lifecycle-callback-class</code> element
    * @return the node defined for the element <code>lifecycle-callback-class</code> 
    */
   public String getLifecycleCallbackClass();

   /**
    * Removes the <code>lifecycle-callback-class</code> element 
    * @return the current instance of <code>LifecycleCallbackType<T></code> 
    */
   public LifecycleCallbackType<T> removeLifecycleCallbackClass();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: LifecycleCallbackType ElementName: xsd:token ElementType : lifecycle-callback-method
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>lifecycle-callback-method</code> element
    * @param lifecycleCallbackMethod the value for the element <code>lifecycle-callback-method</code> 
    * @return the current instance of <code>LifecycleCallbackType<T></code> 
    */
   public LifecycleCallbackType<T> lifecycleCallbackMethod(String lifecycleCallbackMethod);

   /**
    * Returns the <code>lifecycle-callback-method</code> element
    * @return the node defined for the element <code>lifecycle-callback-method</code> 
    */
   public String getLifecycleCallbackMethod();

   /**
    * Removes the <code>lifecycle-callback-method</code> element 
    * @return the current instance of <code>LifecycleCallbackType<T></code> 
    */
   public LifecycleCallbackType<T> removeLifecycleCallbackMethod();
}
