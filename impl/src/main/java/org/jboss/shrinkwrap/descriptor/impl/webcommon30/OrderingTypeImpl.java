package org.jboss.shrinkwrap.descriptor.impl.webcommon30; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.OrderingType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.OrderingOrderingType;
import org.jboss.shrinkwrap.descriptor.impl.webcommon30.OrderingOrderingTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.OrderingOrderingType;
import org.jboss.shrinkwrap.descriptor.impl.webcommon30.OrderingOrderingTypeImpl;

/**
 * This class implements the <code> orderingType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class OrderingTypeImpl<T> implements Child<T>, OrderingType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public OrderingTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public OrderingTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OrderingType ElementName: javaee:ordering-orderingType ElementType : after
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>after</code> element with the given value will be created.
    * Otherwise, the existing <code>after</code> element will be returned.
    * @return  a new or existing instance of <code>OrderingOrderingType<OrderingType<T>></code> 
    */
   public OrderingOrderingType<OrderingType<T>> getOrCreateAfter()
   {
      Node node = childNode.getOrCreate("after");
      OrderingOrderingType<OrderingType<T>> after = new OrderingOrderingTypeImpl<OrderingType<T>>(this, "after", childNode, node);
      return after;
   }

   /**
    * Removes the <code>after</code> element 
    * @return the current instance of <code>OrderingType<T></code> 
    */
   public OrderingType<T> removeAfter()
   {
      childNode.removeChildren("after");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OrderingType ElementName: javaee:ordering-orderingType ElementType : before
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>before</code> element with the given value will be created.
    * Otherwise, the existing <code>before</code> element will be returned.
    * @return  a new or existing instance of <code>OrderingOrderingType<OrderingType<T>></code> 
    */
   public OrderingOrderingType<OrderingType<T>> getOrCreateBefore()
   {
      Node node = childNode.getOrCreate("before");
      OrderingOrderingType<OrderingType<T>> before = new OrderingOrderingTypeImpl<OrderingType<T>>(this, "before", childNode, node);
      return before;
   }

   /**
    * Removes the <code>before</code> element 
    * @return the current instance of <code>OrderingType<T></code> 
    */
   public OrderingType<T> removeBefore()
   {
      childNode.removeChildren("before");
      return this;
   }
}
