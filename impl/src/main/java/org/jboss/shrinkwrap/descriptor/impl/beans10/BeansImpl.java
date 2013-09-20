package org.jboss.shrinkwrap.descriptor.impl.beans10; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.beans10.Alternatives;
import org.jboss.shrinkwrap.descriptor.api.beans10.Beans;
import org.jboss.shrinkwrap.descriptor.api.beans10.Decorators;
import org.jboss.shrinkwrap.descriptor.api.beans10.Interceptors;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> beans </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class BeansImpl<T> implements Child<T>, Beans<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public BeansImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public BeansImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Beans ElementName: javaee:interceptors ElementType : interceptors
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>interceptors</code> element with the given value will be created.
    * Otherwise, the existing <code>interceptors</code> element will be returned.
    * @return  a new or existing instance of <code>Interceptors<Beans<T>></code> 
    */
   public Interceptors<Beans<T>> getOrCreateInterceptors()
   {
      Node node = childNode.getOrCreate("interceptors");
      Interceptors<Beans<T>> interceptors = new InterceptorsImpl<Beans<T>>(this, "interceptors", childNode, node);
      return interceptors;
   }

   /**
    * Removes the <code>interceptors</code> element 
    * @return the current instance of <code>Beans<T></code> 
    */
   public Beans<T> removeInterceptors()
   {
      childNode.removeChildren("interceptors");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Beans ElementName: javaee:decorators ElementType : decorators
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>decorators</code> element with the given value will be created.
    * Otherwise, the existing <code>decorators</code> element will be returned.
    * @return  a new or existing instance of <code>Decorators<Beans<T>></code> 
    */
   public Decorators<Beans<T>> getOrCreateDecorators()
   {
      Node node = childNode.getOrCreate("decorators");
      Decorators<Beans<T>> decorators = new DecoratorsImpl<Beans<T>>(this, "decorators", childNode, node);
      return decorators;
   }

   /**
    * Removes the <code>decorators</code> element 
    * @return the current instance of <code>Beans<T></code> 
    */
   public Beans<T> removeDecorators()
   {
      childNode.removeChildren("decorators");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Beans ElementName: javaee:alternatives ElementType : alternatives
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>alternatives</code> element with the given value will be created.
    * Otherwise, the existing <code>alternatives</code> element will be returned.
    * @return  a new or existing instance of <code>Alternatives<Beans<T>></code> 
    */
   public Alternatives<Beans<T>> getOrCreateAlternatives()
   {
      Node node = childNode.getOrCreate("alternatives");
      Alternatives<Beans<T>> alternatives = new AlternativesImpl<Beans<T>>(this, "alternatives", childNode, node);
      return alternatives;
   }

   /**
    * Removes the <code>alternatives</code> element 
    * @return the current instance of <code>Beans<T></code> 
    */
   public Beans<T> removeAlternatives()
   {
      childNode.removeChildren("alternatives");
      return this;
   }
}
