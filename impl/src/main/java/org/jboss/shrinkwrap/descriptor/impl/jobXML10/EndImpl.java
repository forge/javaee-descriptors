package org.jboss.shrinkwrap.descriptor.impl.jobXML10; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.End;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> End </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class EndImpl<T> implements Child<T>, End<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public EndImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public EndImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: End ElementName: xsd:string ElementType : on
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>on</code> attribute
    * @param on the value for the attribute <code>on</code> 
    * @return the current instance of <code>End<T></code> 
    */
   public End<T> on(String on)
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
    * @return the current instance of <code>End<T></code> 
    */
   public End<T> removeOn()
   {
      childNode.removeAttribute("on");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: End ElementName: xsd:string ElementType : exit-status
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>exit-status</code> attribute
    * @param exitStatus the value for the attribute <code>exit-status</code> 
    * @return the current instance of <code>End<T></code> 
    */
   public End<T> exitStatus(String exitStatus)
   {
      childNode.attribute("exit-status", exitStatus);
      return this;
   }

   /**
    * Returns the <code>exit-status</code> attribute
    * @return the value defined for the attribute <code>exit-status</code> 
    */
      public String getExitStatus()
   {
      return childNode.getAttribute("exit-status");
   }

   /**
    * Removes the <code>exit-status</code> attribute 
    * @return the current instance of <code>End<T></code> 
    */
   public End<T> removeExitStatus()
   {
      childNode.removeAttribute("exit-status");
      return this;
   }
}
