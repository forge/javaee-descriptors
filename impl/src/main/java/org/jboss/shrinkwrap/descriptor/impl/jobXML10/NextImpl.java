package org.jboss.shrinkwrap.descriptor.impl.jobXML10; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.Next;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> Next </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class NextImpl<T> implements Child<T>, Next<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public NextImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public NextImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Next ElementName: xsd:string ElementType : on
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>on</code> attribute
    * @param on the value for the attribute <code>on</code> 
    * @return the current instance of <code>Next<T></code> 
    */
   public Next<T> on(String on)
   {
      childNode.attribute("on", on);
      return this;
   }

   /**
    * Returns the <code>on</code> attribute
    * @return the value defined for the attribute <code>on</code> 
    */
      public String getOn()
   {
      return childNode.getAttribute("on");
   }

   /**
    * Removes the <code>on</code> attribute 
    * @return the current instance of <code>Next<T></code> 
    */
   public Next<T> removeOn()
   {
      childNode.removeAttribute("on");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Next ElementName: xsd:string ElementType : to
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>to</code> attribute
    * @param to the value for the attribute <code>to</code> 
    * @return the current instance of <code>Next<T></code> 
    */
   public Next<T> to(String to)
   {
      childNode.attribute("to", to);
      return this;
   }

   /**
    * Returns the <code>to</code> attribute
    * @return the value defined for the attribute <code>to</code> 
    */
      public String getTo()
   {
      return childNode.getAttribute("to");
   }

   /**
    * Removes the <code>to</code> attribute 
    * @return the current instance of <code>Next<T></code> 
    */
   public Next<T> removeTo()
   {
      childNode.removeAttribute("to");
      return this;
   }
}
