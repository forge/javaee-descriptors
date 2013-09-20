package org.jboss.shrinkwrap.descriptor.impl.facesconfig20; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.facesconfig20.FacesConfigOrderingOrderingType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig20.FacesConfigOrderingType;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> faces-config-orderingType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class FacesConfigOrderingTypeImpl<T> implements Child<T>, FacesConfigOrderingType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public FacesConfigOrderingTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public FacesConfigOrderingTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigOrderingType ElementName: javaee:faces-config-ordering-orderingType ElementType : after
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>after</code> element with the given value will be created.
    * Otherwise, the existing <code>after</code> element will be returned.
    * @return  a new or existing instance of <code>FacesConfigOrderingOrderingType<FacesConfigOrderingType<T>></code> 
    */
   public FacesConfigOrderingOrderingType<FacesConfigOrderingType<T>> getOrCreateAfter()
   {
      Node node = childNode.getOrCreate("after");
      FacesConfigOrderingOrderingType<FacesConfigOrderingType<T>> after = new FacesConfigOrderingOrderingTypeImpl<FacesConfigOrderingType<T>>(this, "after", childNode, node);
      return after;
   }

   /**
    * Removes the <code>after</code> element 
    * @return the current instance of <code>FacesConfigOrderingType<T></code> 
    */
   public FacesConfigOrderingType<T> removeAfter()
   {
      childNode.removeChildren("after");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigOrderingType ElementName: javaee:faces-config-ordering-orderingType ElementType : before
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>before</code> element with the given value will be created.
    * Otherwise, the existing <code>before</code> element will be returned.
    * @return  a new or existing instance of <code>FacesConfigOrderingOrderingType<FacesConfigOrderingType<T>></code> 
    */
   public FacesConfigOrderingOrderingType<FacesConfigOrderingType<T>> getOrCreateBefore()
   {
      Node node = childNode.getOrCreate("before");
      FacesConfigOrderingOrderingType<FacesConfigOrderingType<T>> before = new FacesConfigOrderingOrderingTypeImpl<FacesConfigOrderingType<T>>(this, "before", childNode, node);
      return before;
   }

   /**
    * Removes the <code>before</code> element 
    * @return the current instance of <code>FacesConfigOrderingType<T></code> 
    */
   public FacesConfigOrderingType<T> removeBefore()
   {
      childNode.removeChildren("before");
      return this;
   }
}
