package org.jboss.shrinkwrap.descriptor.api.webcommon31; 

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> ordering-othersType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface OrderingOthersType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OrderingOthersType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>OrderingOthersType<T></code> 
    */
   public OrderingOthersType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>OrderingOthersType<T></code> 
    */
   public OrderingOthersType<T> removeId();
}