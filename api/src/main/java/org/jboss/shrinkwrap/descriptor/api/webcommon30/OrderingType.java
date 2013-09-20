package org.jboss.shrinkwrap.descriptor.api.webcommon30; 

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> orderingType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface OrderingType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OrderingType ElementName: javaee:ordering-orderingType ElementType : after
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>after</code> element with the given value will be created.
    * Otherwise, the existing <code>after</code> element will be returned.
    * @return  a new or existing instance of <code>OrderingOrderingType<OrderingType<T>></code> 
    */
   public OrderingOrderingType<OrderingType<T>> getOrCreateAfter();

   /**
    * Removes the <code>after</code> element 
    * @return the current instance of <code>OrderingType<T></code> 
    */
   public OrderingType<T> removeAfter();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OrderingType ElementName: javaee:ordering-orderingType ElementType : before
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>before</code> element with the given value will be created.
    * Otherwise, the existing <code>before</code> element will be returned.
    * @return  a new or existing instance of <code>OrderingOrderingType<OrderingType<T>></code> 
    */
   public OrderingOrderingType<OrderingType<T>> getOrCreateBefore();

   /**
    * Removes the <code>before</code> element 
    * @return the current instance of <code>OrderingType<T></code> 
    */
   public OrderingType<T> removeBefore();
}
