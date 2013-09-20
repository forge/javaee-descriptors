package org.jboss.shrinkwrap.descriptor.impl.jsptaglibrary21; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.jsptaglibrary21.TldDeferredMethodType;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> tld-deferred-methodType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class TldDeferredMethodTypeImpl<T> implements Child<T>, TldDeferredMethodType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public TldDeferredMethodTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public TldDeferredMethodTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TldDeferredMethodType ElementName: xsd:token ElementType : method-signature
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>method-signature</code> element
    * @param methodSignature the value for the element <code>method-signature</code> 
    * @return the current instance of <code>TldDeferredMethodType<T></code> 
    */
   public TldDeferredMethodType<T> methodSignature(String methodSignature)
   {
      childNode.getOrCreate("method-signature").text(methodSignature);
      return this;
   }

   /**
    * Returns the <code>method-signature</code> element
    * @return the node defined for the element <code>method-signature</code> 
    */
   public String getMethodSignature()
   {
      return childNode.getTextValueForPatternName("method-signature");
   }

   /**
    * Removes the <code>method-signature</code> element 
    * @return the current instance of <code>TldDeferredMethodType<T></code> 
    */
   public TldDeferredMethodType<T> removeMethodSignature()
   {
      childNode.removeChildren("method-signature");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TldDeferredMethodType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>TldDeferredMethodType<T></code> 
    */
   public TldDeferredMethodType<T> id(String id)
   {
      childNode.attribute("id", id);
      return this;
   }

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
      public String getId()
   {
      return childNode.getAttribute("id");
   }

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>TldDeferredMethodType<T></code> 
    */
   public TldDeferredMethodType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
