package org.jboss.shrinkwrap.descriptor.impl.orm20; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.orm20.GeneratedValue;
import org.jboss.shrinkwrap.descriptor.api.orm20.GenerationType;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> generated-value </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class GeneratedValueImpl<T> implements Child<T>, GeneratedValue<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public GeneratedValueImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public GeneratedValueImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: GeneratedValue ElementName: orm:generation-type ElementType : strategy
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>strategy</code> attribute
    * @param strategy the value for the attribute <code>strategy</code> 
    * @return the current instance of <code>GeneratedValue<T></code> 
    */
   public GeneratedValue<T> strategy(GenerationType strategy)
   {
      childNode.attribute("strategy", strategy);
      return this;
   }

   /**
    * Sets the <code>strategy</code> attribute
    * @param strategy the value for the attribute <code>strategy</code> 
    * @return the current instance of <code>GeneratedValue<T></code> 
    */
   public GeneratedValue<T> strategy(String strategy)
   {
      childNode.attribute("strategy", strategy);
      return this;
   }

   /**
    * Returns the <code>strategy</code> attribute
    * @return the value defined for the attribute <code>strategy</code> 
    */
   public GenerationType getStrategy()
   {
      return GenerationType.getFromStringValue(childNode.getAttribute("strategy"));
   }

   /**
    * Returns the <code>strategy</code> attribute
    * @return the value found for the element <code>strategy</code> 
    */
   public String  getStrategyAsString()
   {
      return childNode.getAttribute("strategy");
   }

   /**
    * Removes the <code>strategy</code> attribute 
    * @return the current instance of <code>GeneratedValue<T></code> 
    */
   public GeneratedValue<T> removeStrategy()
   {
      childNode.removeAttribute("strategy");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: GeneratedValue ElementName: xsd:string ElementType : generator
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>generator</code> attribute
    * @param generator the value for the attribute <code>generator</code> 
    * @return the current instance of <code>GeneratedValue<T></code> 
    */
   public GeneratedValue<T> generator(String generator)
   {
      childNode.attribute("generator", generator);
      return this;
   }

   /**
    * Returns the <code>generator</code> attribute
    * @return the value defined for the attribute <code>generator</code> 
    */
      public String getGenerator()
   {
      return childNode.getAttribute("generator");
   }

   /**
    * Removes the <code>generator</code> attribute 
    * @return the current instance of <code>GeneratedValue<T></code> 
    */
   public GeneratedValue<T> removeGenerator()
   {
      childNode.removeAttribute("generator");
      return this;
   }
}
