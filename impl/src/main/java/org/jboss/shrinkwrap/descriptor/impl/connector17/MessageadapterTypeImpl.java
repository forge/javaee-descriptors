package org.jboss.shrinkwrap.descriptor.impl.connector17; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.connector17.MessageadapterType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.connector17.MessagelistenerType;
import org.jboss.shrinkwrap.descriptor.impl.connector17.MessagelistenerTypeImpl;

/**
 * This class implements the <code> messageadapterType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class MessageadapterTypeImpl<T> implements Child<T>, MessageadapterType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public MessageadapterTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public MessageadapterTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageadapterType ElementName: javaee:messagelistenerType ElementType : messagelistener
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>messagelistener</code> element will be created and returned.
    * Otherwise, the first existing <code>messagelistener</code> element will be returned.
    * @return the instance defined for the element <code>messagelistener</code> 
    */
   public MessagelistenerType<MessageadapterType<T>> getOrCreateMessagelistener()
   {
      List<Node> nodeList = childNode.get("messagelistener");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new MessagelistenerTypeImpl<MessageadapterType<T>>(this, "messagelistener", childNode, nodeList.get(0));
      }
      return createMessagelistener();
   }

   /**
    * Creates a new <code>messagelistener</code> element 
    * @return the new created instance of <code>MessagelistenerType<MessageadapterType<T>></code> 
    */
   public MessagelistenerType<MessageadapterType<T>> createMessagelistener()
   {
      return new MessagelistenerTypeImpl<MessageadapterType<T>>(this, "messagelistener", childNode);
   }

   /**
    * Returns all <code>messagelistener</code> elements
    * @return list of <code>messagelistener</code> 
    */
   public List<MessagelistenerType<MessageadapterType<T>>> getAllMessagelistener()
   {
      List<MessagelistenerType<MessageadapterType<T>>> list = new ArrayList<MessagelistenerType<MessageadapterType<T>>>();
      List<Node> nodeList = childNode.get("messagelistener");
      for(Node node: nodeList)
      {
         MessagelistenerType<MessageadapterType<T>>  type = new MessagelistenerTypeImpl<MessageadapterType<T>>(this, "messagelistener", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>messagelistener</code> elements 
    * @return the current instance of <code>MessagelistenerType<MessageadapterType<T>></code> 
    */
   public MessageadapterType<T> removeAllMessagelistener()
   {
      childNode.removeChildren("messagelistener");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageadapterType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>MessageadapterType<T></code> 
    */
   public MessageadapterType<T> id(String id)
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
    * @return the current instance of <code>MessageadapterType<T></code> 
    */
   public MessageadapterType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
