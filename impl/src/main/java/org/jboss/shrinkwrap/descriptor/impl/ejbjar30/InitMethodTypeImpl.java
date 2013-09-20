package org.jboss.shrinkwrap.descriptor.impl.ejbjar30; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.InitMethodType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.NamedMethodType;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> init-methodType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class InitMethodTypeImpl<T> implements Child<T>, InitMethodType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public InitMethodTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public InitMethodTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: InitMethodType ElementName: javaee:named-methodType ElementType : create-method
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>create-method</code> element with the given value will be created.
    * Otherwise, the existing <code>create-method</code> element will be returned.
    * @return  a new or existing instance of <code>NamedMethodType<InitMethodType<T>></code> 
    */
   public NamedMethodType<InitMethodType<T>> getOrCreateCreateMethod()
   {
      Node node = childNode.getOrCreate("create-method");
      NamedMethodType<InitMethodType<T>> createMethod = new NamedMethodTypeImpl<InitMethodType<T>>(this, "create-method", childNode, node);
      return createMethod;
   }

   /**
    * Removes the <code>create-method</code> element 
    * @return the current instance of <code>InitMethodType<T></code> 
    */
   public InitMethodType<T> removeCreateMethod()
   {
      childNode.removeChildren("create-method");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: InitMethodType ElementName: javaee:named-methodType ElementType : bean-method
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>bean-method</code> element with the given value will be created.
    * Otherwise, the existing <code>bean-method</code> element will be returned.
    * @return  a new or existing instance of <code>NamedMethodType<InitMethodType<T>></code> 
    */
   public NamedMethodType<InitMethodType<T>> getOrCreateBeanMethod()
   {
      Node node = childNode.getOrCreate("bean-method");
      NamedMethodType<InitMethodType<T>> beanMethod = new NamedMethodTypeImpl<InitMethodType<T>>(this, "bean-method", childNode, node);
      return beanMethod;
   }

   /**
    * Removes the <code>bean-method</code> element 
    * @return the current instance of <code>InitMethodType<T></code> 
    */
   public InitMethodType<T> removeBeanMethod()
   {
      childNode.removeChildren("bean-method");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: InitMethodType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>InitMethodType<T></code> 
    */
   public InitMethodType<T> id(String id)
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
    * @return the current instance of <code>InitMethodType<T></code> 
    */
   public InitMethodType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
