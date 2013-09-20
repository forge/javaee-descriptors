package org.jboss.shrinkwrap.descriptor.impl.orm20; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.orm20.Inheritance;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.orm20.InheritanceType;

/**
 * This class implements the <code> inheritance </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class InheritanceImpl<T> implements Child<T>, Inheritance<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public InheritanceImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public InheritanceImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Inheritance ElementName: orm:inheritance-type ElementType : strategy
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>strategy</code> attribute
    * @param strategy the value for the attribute <code>strategy</code> 
    * @return the current instance of <code>Inheritance<T></code> 
    */
   public Inheritance<T> strategy(InheritanceType strategy)
   {
      childNode.attribute("strategy", strategy);
      return this;
   }

   /**
    * Sets the <code>strategy</code> attribute
    * @param strategy the value for the attribute <code>strategy</code> 
    * @return the current instance of <code>Inheritance<T></code> 
    */
   public Inheritance<T> strategy(String strategy)
   {
      childNode.attribute("strategy", strategy);
      return this;
   }

   /**
    * Returns the <code>strategy</code> attribute
    * @return the value defined for the attribute <code>strategy</code> 
    */
   public InheritanceType getStrategy()
   {
      return InheritanceType.getFromStringValue(childNode.getAttribute("strategy"));
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
    * @return the current instance of <code>Inheritance<T></code> 
    */
   public Inheritance<T> removeStrategy()
   {
      childNode.removeAttribute("strategy");
      return this;
   }
}
