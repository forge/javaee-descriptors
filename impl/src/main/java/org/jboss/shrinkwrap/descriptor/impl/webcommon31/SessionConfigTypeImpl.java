package org.jboss.shrinkwrap.descriptor.impl.webcommon31; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.webcommon31.CookieConfigType;
import org.jboss.shrinkwrap.descriptor.api.webcommon31.SessionConfigType;
import org.jboss.shrinkwrap.descriptor.api.webcommon31.TrackingModeType;
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
   // ClassName: SessionConfigType ElementName: javaee:cookie-configType ElementType : cookie-config
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>cookie-config</code> element with the given value will be created.
    * Otherwise, the existing <code>cookie-config</code> element will be returned.
    * @return  a new or existing instance of <code>CookieConfigType<SessionConfigType<T>></code> 
    */
   public CookieConfigType<SessionConfigType<T>> getOrCreateCookieConfig()
   {
      Node node = childNode.getOrCreate("cookie-config");
      CookieConfigType<SessionConfigType<T>> cookieConfig = new CookieConfigTypeImpl<SessionConfigType<T>>(this, "cookie-config", childNode, node);
      return cookieConfig;
   }

   /**
    * Removes the <code>cookie-config</code> element 
    * @return the current instance of <code>SessionConfigType<T></code> 
    */
   public SessionConfigType<T> removeCookieConfig()
   {
      childNode.removeChildren("cookie-config");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionConfigType ElementName: javaee:tracking-modeType ElementType : tracking-mode
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all javaee:tracking-modeType objects representing <code>tracking-mode</code> elements, 
    * a new <code>tracking-mode</code> element 
    * @param values list of <code>tracking-mode</code> objects 
    * @return the current instance of <code>SessionConfigType<T></code> 
    */
   public SessionConfigType<T> trackingMode(TrackingModeType ... values)
   {
      if (values != null)
      {
         for(TrackingModeType name: values)
         {
            childNode.createChild("tracking-mode").text(name);
         }
      }
      return this;
   }

   /**
    * Creates for all String objects representing <code>tracking-mode</code> elements, 
    * a new <code>tracking-mode</code> element 
    * @param values list of <code>tracking-mode</code> objects 
    * @return the current instance of <code>SessionConfigType<T></code> 
    */
   public SessionConfigType<T> trackingMode(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("tracking-mode").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>tracking-mode</code> elements
    * @return list of <code>tracking-mode</code> 
    */
public List<String> getAllTrackingMode()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("tracking-mode");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>tracking-mode</code> element 
    * @return the current instance of <code>SessionConfigType<T></code> 
    */
   public SessionConfigType<T> removeAllTrackingMode()
   {
      childNode.removeChildren("tracking-mode");
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
