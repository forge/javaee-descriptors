package org.jboss.shrinkwrap.descriptor.impl.jobXML10; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.Stop;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> Stop </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class StopImpl<T> implements Child<T>, Stop<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public StopImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public StopImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Stop ElementName: xsd:string ElementType : on
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>on</code> attribute
    * @param on the value for the attribute <code>on</code> 
    * @return the current instance of <code>Stop<T></code> 
    */
   public Stop<T> on(String on)
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
    * @return the current instance of <code>Stop<T></code> 
    */
   public Stop<T> removeOn()
   {
      childNode.removeAttribute("on");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Stop ElementName: xsd:string ElementType : exit-status
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>exit-status</code> attribute
    * @param exitStatus the value for the attribute <code>exit-status</code> 
    * @return the current instance of <code>Stop<T></code> 
    */
   public Stop<T> exitStatus(String exitStatus)
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
    * @return the current instance of <code>Stop<T></code> 
    */
   public Stop<T> removeExitStatus()
   {
      childNode.removeAttribute("exit-status");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Stop ElementName: xsd:string ElementType : restart
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>restart</code> attribute
    * @param restart the value for the attribute <code>restart</code> 
    * @return the current instance of <code>Stop<T></code> 
    */
   public Stop<T> restart(String restart)
   {
      childNode.attribute("restart", restart);
      return this;
   }

   /**
    * Returns the <code>restart</code> attribute
    * @return the value defined for the attribute <code>restart</code> 
    */
      public String getRestart()
   {
      return childNode.getAttribute("restart");
   }

   /**
    * Removes the <code>restart</code> attribute 
    * @return the current instance of <code>Stop<T></code> 
    */
   public Stop<T> removeRestart()
   {
      childNode.removeAttribute("restart");
      return this;
   }
}
