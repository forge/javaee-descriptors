package org.jboss.shrinkwrap.descriptor.impl.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.NamedMethodType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.RemoveMethodType;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> remove-methodType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class RemoveMethodTypeImpl<T> implements Child<T>, RemoveMethodType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public RemoveMethodTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public RemoveMethodTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: RemoveMethodType ElementName: javaee:named-methodType ElementType : bean-method
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>bean-method</code> element with the given value will be created.
    * Otherwise, the existing <code>bean-method</code> element will be returned.
    * @return  a new or existing instance of <code>NamedMethodType<RemoveMethodType<T>></code> 
    */
   public NamedMethodType<RemoveMethodType<T>> getOrCreateBeanMethod()
   {
      Node node = childNode.getOrCreate("bean-method");
      NamedMethodType<RemoveMethodType<T>> beanMethod = new NamedMethodTypeImpl<RemoveMethodType<T>>(this, "bean-method", childNode, node);
      return beanMethod;
   }

   /**
    * Removes the <code>bean-method</code> element 
    * @return the current instance of <code>RemoveMethodType<T></code> 
    */
   public RemoveMethodType<T> removeBeanMethod()
   {
      childNode.removeChildren("bean-method");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: RemoveMethodType ElementName: javaee:xsdBooleanType ElementType : retain-if-exception
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>retain-if-exception</code> element
    * @param retainIfException the value for the element <code>retain-if-exception</code> 
    * @return the current instance of <code>RemoveMethodType<T></code> 
    */
   public RemoveMethodType<T> retainIfException(Boolean retainIfException)
   {
      childNode.getOrCreate("retain-if-exception").text(retainIfException);
      return this;
   }

   /**
    * Returns the <code>retain-if-exception</code> element
    * @return the node defined for the element <code>retain-if-exception</code> 
    */
   public Boolean isRetainIfException()
   {
      return Strings.isTrue(childNode.getTextValueForPatternName("retain-if-exception"));
   }

   /**
    * Removes the <code>retain-if-exception</code> element 
    * @return the current instance of <code>RemoveMethodType<T></code> 
    */
   public RemoveMethodType<T> removeRetainIfException()
   {
      childNode.removeChildren("retain-if-exception");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: RemoveMethodType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>RemoveMethodType<T></code> 
    */
   public RemoveMethodType<T> id(String id)
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
    * @return the current instance of <code>RemoveMethodType<T></code> 
    */
   public RemoveMethodType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
