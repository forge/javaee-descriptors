package org.jboss.shrinkwrap.descriptor.api.ejbjar31; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.TimeUnitTypeType;
/**
 * This interface defines the contract for the <code> stateful-timeoutType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface StatefulTimeoutType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: StatefulTimeoutType ElementName: xsd:integer ElementType : timeout
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>timeout</code> element
    * @param timeout the value for the element <code>timeout</code> 
    * @return the current instance of <code>StatefulTimeoutType<T></code> 
    */
   public StatefulTimeoutType<T> timeout(Integer timeout);

   /**
    * Returns the <code>timeout</code> element
    * @return the node defined for the element <code>timeout</code> 
    */
   public Integer getTimeout();

   /**
    * Removes the <code>timeout</code> element 
    * @return the current instance of <code>StatefulTimeoutType<T></code> 
    */
   public StatefulTimeoutType<T> removeTimeout();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: StatefulTimeoutType ElementName: javaee:time-unit-typeType ElementType : unit
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>unit</code> element
    * @param unit the value for the element <code>unit</code> 
    * @return the current instance of <code>StatefulTimeoutType<T></code> 
    */
   public StatefulTimeoutType<T> unit(TimeUnitTypeType unit);
   /**
    * Sets the <code>unit</code> element
    * @param unit the value for the element <code>unit</code> 
    * @return the current instance of <code>StatefulTimeoutType<T></code> 
    */
   public StatefulTimeoutType<T> unit(String unit);

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
    * @return the current instance of <code>StatefulTimeoutType<T></code> 
    */
   public StatefulTimeoutType<T> removeUnit();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: StatefulTimeoutType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>StatefulTimeoutType<T></code> 
    */
   public StatefulTimeoutType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>StatefulTimeoutType<T></code> 
    */
   public StatefulTimeoutType<T> removeId();
}
