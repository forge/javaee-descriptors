package org.jboss.shrinkwrap.descriptor.impl.ejbjar32; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar32.AccessTimeoutType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar32.ConcurrentLockTypeType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar32.ConcurrentMethodType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar32.NamedMethodType;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> concurrent-methodType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class ConcurrentMethodTypeImpl<T> implements Child<T>, ConcurrentMethodType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public ConcurrentMethodTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public ConcurrentMethodTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConcurrentMethodType ElementName: javaee:named-methodType ElementType : method
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>method</code> element with the given value will be created.
    * Otherwise, the existing <code>method</code> element will be returned.
    * @return  a new or existing instance of <code>NamedMethodType<ConcurrentMethodType<T>></code> 
    */
   public NamedMethodType<ConcurrentMethodType<T>> getOrCreateMethod()
   {
      Node node = childNode.getOrCreate("method");
      NamedMethodType<ConcurrentMethodType<T>> method = new NamedMethodTypeImpl<ConcurrentMethodType<T>>(this, "method", childNode, node);
      return method;
   }

   /**
    * Removes the <code>method</code> element 
    * @return the current instance of <code>ConcurrentMethodType<T></code> 
    */
   public ConcurrentMethodType<T> removeMethod()
   {
      childNode.removeChildren("method");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConcurrentMethodType ElementName: javaee:concurrent-lock-typeType ElementType : lock
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>lock</code> element
    * @param lock the value for the element <code>lock</code> 
    * @return the current instance of <code>ConcurrentMethodType<T></code> 
    */
   public ConcurrentMethodType<T> lock(ConcurrentLockTypeType lock)
   {
      childNode.getOrCreate("lock").text(lock);
      return this;
   }
   /**
    * Sets the <code>lock</code> element
    * @param lock the value for the element <code>lock</code> 
    * @return the current instance of <code>ConcurrentMethodType<T></code> 
    */
   public ConcurrentMethodType<T> lock(String lock)
   {
      childNode.getOrCreate("lock").text(lock);
      return this;
   }

   /**
    * Returns the <code>lock</code> element
    * @return the value found for the element <code>lock</code> 
    */
   public ConcurrentLockTypeType getLock()
   {
      return ConcurrentLockTypeType.getFromStringValue(childNode.getTextValueForPatternName("lock"));
   }

   /**
    * Returns the <code>lock</code> element
    * @return the value found for the element <code>lock</code> 
    */
   public String  getLockAsString()
   {
      return childNode.getTextValueForPatternName("lock");
   }

   /**
    * Removes the <code>lock</code> attribute 
    * @return the current instance of <code>ConcurrentMethodType<T></code> 
    */
   public ConcurrentMethodType<T> removeLock()
   {
      childNode.removeAttribute("lock");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConcurrentMethodType ElementName: javaee:access-timeoutType ElementType : access-timeout
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>access-timeout</code> element with the given value will be created.
    * Otherwise, the existing <code>access-timeout</code> element will be returned.
    * @return  a new or existing instance of <code>AccessTimeoutType<ConcurrentMethodType<T>></code> 
    */
   public AccessTimeoutType<ConcurrentMethodType<T>> getOrCreateAccessTimeout()
   {
      Node node = childNode.getOrCreate("access-timeout");
      AccessTimeoutType<ConcurrentMethodType<T>> accessTimeout = new AccessTimeoutTypeImpl<ConcurrentMethodType<T>>(this, "access-timeout", childNode, node);
      return accessTimeout;
   }

   /**
    * Removes the <code>access-timeout</code> element 
    * @return the current instance of <code>ConcurrentMethodType<T></code> 
    */
   public ConcurrentMethodType<T> removeAccessTimeout()
   {
      childNode.removeChildren("access-timeout");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConcurrentMethodType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>ConcurrentMethodType<T></code> 
    */
   public ConcurrentMethodType<T> id(String id)
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
    * @return the current instance of <code>ConcurrentMethodType<T></code> 
    */
   public ConcurrentMethodType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
