package org.jboss.shrinkwrap.descriptor.impl.webapp25; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.webapp25.SessionConfigType;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> session-configType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class SessionConfigTypeImpl<T> implements Child<T>, SessionConfigType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public SessionConfigTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public SessionConfigTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionConfigType ElementName: xsd:integer ElementType : session-timeout
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>session-timeout</code> element
    * @param sessionTimeout the value for the element <code>session-timeout</code> 
    * @return the current instance of <code>SessionConfigType<T></code> 
    */
   public SessionConfigType<T> sessionTimeout(Integer sessionTimeout)
   {
      childNode.getOrCreate("session-timeout").text(sessionTimeout);
      return this;
   }

   /**
    * Returns the <code>session-timeout</code> element
    * @return the node defined for the element <code>session-timeout</code> 
    */
   public Integer getSessionTimeout()
   {
      if (childNode.getTextValueForPatternName("session-timeout") != null && !childNode.getTextValueForPatternName("session-timeout").equals("null")) {
         return Integer.valueOf(childNode.getTextValueForPatternName("session-timeout"));
      }
      return null;
   }

   /**
    * Removes the <code>session-timeout</code> element 
    * @return the current instance of <code>SessionConfigType<T></code> 
    */
   public SessionConfigType<T> removeSessionTimeout()
   {
      childNode.removeChildren("session-timeout");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionConfigType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>SessionConfigType<T></code> 
    */
   public SessionConfigType<T> id(String id)
   {
      childNode.attribute("id", id);
      return this;
   }

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
      public String getId()
   {
      return childNode.getAttribute("id");
   }

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>SessionConfigType<T></code> 
    */
   public SessionConfigType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
