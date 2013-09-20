package org.jboss.shrinkwrap.descriptor.api.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> access-timeoutType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface AccessTimeoutType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: AccessTimeoutType ElementName: xsd:integer ElementType : timeout
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>timeout</code> element
    * @param timeout the value for the element <code>timeout</code> 
    * @return the current instance of <code>AccessTimeoutType<T></code> 
    */
   public AccessTimeoutType<T> timeout(Integer timeout);

   /**
    * Returns the <code>timeout</code> element
    * @return the node defined for the element <code>timeout</code> 
    */
   public Integer getTimeout();

   /**
    * Removes the <code>timeout</code> element 
    * @return the current instance of <code>AccessTimeoutType<T></code> 
    */
   public AccessTimeoutType<T> removeTimeout();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: AccessTimeoutType ElementName: javaee:time-unit-typeType ElementType : unit
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>unit</code> element
    * @param unit the value for the element <code>unit</code> 
    * @return the current instance of <code>AccessTimeoutType<T></code> 
    */
   public AccessTimeoutType<T> unit(TimeUnitTypeType unit);
   /**
    * Sets the <code>unit</code> element
    * @param unit the value for the element <code>unit</code> 
    * @return the current instance of <code>AccessTimeoutType<T></code> 
    */
   public AccessTimeoutType<T> unit(String unit);

   /**
    * Returns the <code>unit</code> element
    * @return the value found for the element <code>unit</code> 
    */
   public TimeUnitTypeType getUnit();

   /**
    * Returns the <code>unit</code> element
    * @return the value found for the element <code>unit</code> 
    */
   public String  getUnitAsString();

   /**
    * Removes the <code>unit</code> attribute 
    * @return the current instance of <code>AccessTimeoutType<T></code> 
    */
   public AccessTimeoutType<T> removeUnit();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: AccessTimeoutType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>AccessTimeoutType<T></code> 
    */
   public AccessTimeoutType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>AccessTimeoutType<T></code> 
    */
   public AccessTimeoutType<T> removeId();
}
