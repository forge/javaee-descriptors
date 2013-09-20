package org.jboss.shrinkwrap.descriptor.api.orm20; 

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> generated-value </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface GeneratedValue<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: GeneratedValue ElementName: orm:generation-type ElementType : strategy
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>strategy</code> attribute
    * @param strategy the value for the attribute <code>strategy</code> 
    * @return the current instance of <code>GeneratedValue<T></code> 
    */
   public GeneratedValue<T> strategy(GenerationType strategy);

   /**
    * Sets the <code>strategy</code> attribute
    * @param strategy the value for the attribute <code>strategy</code> 
    * @return the current instance of <code>GeneratedValue<T></code> 
    */
   public GeneratedValue<T> strategy(String strategy);

   /**
    * Returns the <code>strategy</code> attribute
    * @return the value defined for the attribute <code>strategy</code> 
    */
public GenerationType getStrategy();

   /**
    * Returns the <code>strategy</code> attribute
    * @return the value found for the element <code>strategy</code> 
    */
   public String  getStrategyAsString();

   /**
    * Removes the <code>strategy</code> attribute 
    * @return the current instance of <code>GeneratedValue<T></code> 
    */
   public GeneratedValue<T> removeStrategy();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: GeneratedValue ElementName: xsd:string ElementType : generator
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>generator</code> attribute
    * @param generator the value for the attribute <code>generator</code> 
    * @return the current instance of <code>GeneratedValue<T></code> 
    */
   public GeneratedValue<T> generator(String generator);

   /**
    * Returns the <code>generator</code> attribute
    * @return the value defined for the attribute <code>generator</code> 
    */
   public String getGenerator();

   /**
    * Removes the <code>generator</code> attribute 
    * @return the current instance of <code>GeneratedValue<T></code> 
    */
   public GeneratedValue<T> removeGenerator();
}
