package org.jboss.shrinkwrap.descriptor.impl.javaee6; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.LifecycleCallbackType;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> lifecycle-callbackType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class LifecycleCallbackTypeImpl<T> implements Child<T>, LifecycleCallbackType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public LifecycleCallbackTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public LifecycleCallbackTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: LifecycleCallbackType ElementName: xsd:token ElementType : lifecycle-callback-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>lifecycle-callback-class</code> element
    * @param lifecycleCallbackClass the value for the element <code>lifecycle-callback-class</code> 
    * @return the current instance of <code>LifecycleCallbackType<T></code> 
    */
   public LifecycleCallbackType<T> lifecycleCallbackClass(String lifecycleCallbackClass)
   {
      childNode.getOrCreate("lifecycle-callback-class").text(lifecycleCallbackClass);
      return this;
   }

   /**
    * Returns the <code>lifecycle-callback-class</code> element
    * @return the node defined for the element <code>lifecycle-callback-class</code> 
    */
   public String getLifecycleCallbackClass()
   {
      return childNode.getTextValueForPatternName("lifecycle-callback-class");
   }

   /**
    * Removes the <code>lifecycle-callback-class</code> element 
    * @return the current instance of <code>LifecycleCallbackType<T></code> 
    */
   public LifecycleCallbackType<T> removeLifecycleCallbackClass()
   {
      childNode.removeChildren("lifecycle-callback-class");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: LifecycleCallbackType ElementName: xsd:token ElementType : lifecycle-callback-method
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>lifecycle-callback-method</code> element
    * @param lifecycleCallbackMethod the value for the element <code>lifecycle-callback-method</code> 
    * @return the current instance of <code>LifecycleCallbackType<T></code> 
    */
   public LifecycleCallbackType<T> lifecycleCallbackMethod(String lifecycleCallbackMethod)
   {
      childNode.getOrCreate("lifecycle-callback-method").text(lifecycleCallbackMethod);
      return this;
   }

   /**
    * Returns the <code>lifecycle-callback-method</code> element
    * @return the node defined for the element <code>lifecycle-callback-method</code> 
    */
   public String getLifecycleCallbackMethod()
   {
      return childNode.getTextValueForPatternName("lifecycle-callback-method");
   }

   /**
    * Removes the <code>lifecycle-callback-method</code> element 
    * @return the current instance of <code>LifecycleCallbackType<T></code> 
    */
   public LifecycleCallbackType<T> removeLifecycleCallbackMethod()
   {
      childNode.removeChildren("lifecycle-callback-method");
      return this;
   }
}
