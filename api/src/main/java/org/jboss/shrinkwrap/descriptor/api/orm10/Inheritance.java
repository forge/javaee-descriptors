package org.jboss.shrinkwrap.descriptor.api.orm10; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.orm10.InheritanceType;
/**
 * This interface defines the contract for the <code> inheritance </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface Inheritance<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Inheritance ElementName: orm:inheritance-type ElementType : strategy
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>strategy</code> attribute
    * @param strategy the value for the attribute <code>strategy</code> 
    * @return the current instance of <code>Inheritance<T></code> 
    */
   public Inheritance<T> strategy(InheritanceType strategy);

   /**
    * Sets the <code>strategy</code> attribute
    * @param strategy the value for the attribute <code>strategy</code> 
    * @return the current instance of <code>Inheritance<T></code> 
    */
   public Inheritance<T> strategy(String strategy);

   /**
    * Returns the <code>strategy</code> attribute
    * @return the value defined for the attribute <code>strategy</code> 
    */
public InheritanceType getStrategy();

   /**
    * Returns the <code>strategy</code> attribute
    * @return the value found for the element <code>strategy</code> 
    */
   public String  getStrategyAsString();

   /**
    * Removes the <code>strategy</code> attribute 
    * @return the current instance of <code>Inheritance<T></code> 
    */
   public Inheritance<T> removeStrategy();
}
