package org.jboss.shrinkwrap.descriptor.impl.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.AroundInvokeType;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> around-invokeType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class AroundInvokeTypeImpl<T> implements Child<T>, AroundInvokeType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public AroundInvokeTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public AroundInvokeTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: AroundInvokeType ElementName: xsd:token ElementType : class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>class</code> element
    * @param clazz the value for the element <code>class</code> 
    * @return the current instance of <code>AroundInvokeType<T></code> 
    */
   public AroundInvokeType<T> clazz(String clazz)
   {
      childNode.getOrCreate("class").text(clazz);
      return this;
   }

   /**
    * Returns the <code>class</code> element
    * @return the node defined for the element <code>class</code> 
    */
   public String getClazz()
   {
      return childNode.getTextValueForPatternName("class");
   }

   /**
    * Removes the <code>class</code> element 
    * @return the current instance of <code>AroundInvokeType<T></code> 
    */
   public AroundInvokeType<T> removeClazz()
   {
      childNode.removeChildren("class");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: AroundInvokeType ElementName: xsd:token ElementType : method-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>method-name</code> element
    * @param methodName the value for the element <code>method-name</code> 
    * @return the current instance of <code>AroundInvokeType<T></code> 
    */
   public AroundInvokeType<T> methodName(String methodName)
   {
      childNode.getOrCreate("method-name").text(methodName);
      return this;
   }

   /**
    * Returns the <code>method-name</code> element
    * @return the node defined for the element <code>method-name</code> 
    */
   public String getMethodName()
   {
      return childNode.getTextValueForPatternName("method-name");
   }

   /**
    * Removes the <code>method-name</code> element 
    * @return the current instance of <code>AroundInvokeType<T></code> 
    */
   public AroundInvokeType<T> removeMethodName()
   {
      childNode.removeChildren("method-name");
      return this;
   }
}
