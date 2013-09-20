package org.jboss.shrinkwrap.descriptor.impl.connector15; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.connector15.MessagelistenerType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.connector15.ActivationspecType;
import org.jboss.shrinkwrap.descriptor.impl.connector15.ActivationspecTypeImpl;

/**
 * This class implements the <code> messagelistenerType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class MessagelistenerTypeImpl<T> implements Child<T>, MessagelistenerType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public MessagelistenerTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public MessagelistenerTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessagelistenerType ElementName: xsd:token ElementType : messagelistener-type
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>messagelistener-type</code> element
    * @param messagelistenerType the value for the element <code>messagelistener-type</code> 
    * @return the current instance of <code>MessagelistenerType<T></code> 
    */
   public MessagelistenerType<T> messagelistenerType(String messagelistenerType)
   {
      childNode.getOrCreate("messagelistener-type").text(messagelistenerType);
      return this;
   }

   /**
    * Returns the <code>messagelistener-type</code> element
    * @return the node defined for the element <code>messagelistener-type</code> 
    */
   public String getMessagelistenerType()
   {
      return childNode.getTextValueForPatternName("messagelistener-type");
   }

   /**
    * Removes the <code>messagelistener-type</code> element 
    * @return the current instance of <code>MessagelistenerType<T></code> 
    */
   public MessagelistenerType<T> removeMessagelistenerType()
   {
      childNode.removeChildren("messagelistener-type");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessagelistenerType ElementName: j2ee:activationspecType ElementType : activationspec
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>activationspec</code> element with the given value will be created.
    * Otherwise, the existing <code>activationspec</code> element will be returned.
    * @return  a new or existing instance of <code>ActivationspecType<MessagelistenerType<T>></code> 
    */
   public ActivationspecType<MessagelistenerType<T>> getOrCreateActivationspec()
   {
      Node node = childNode.getOrCreate("activationspec");
      ActivationspecType<MessagelistenerType<T>> activationspec = new ActivationspecTypeImpl<MessagelistenerType<T>>(this, "activationspec", childNode, node);
      return activationspec;
   }

   /**
    * Removes the <code>activationspec</code> element 
    * @return the current instance of <code>MessagelistenerType<T></code> 
    */
   public MessagelistenerType<T> removeActivationspec()
   {
      childNode.removeChildren("activationspec");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessagelistenerType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>MessagelistenerType<T></code> 
    */
   public MessagelistenerType<T> id(String id)
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
    * @return the current instance of <code>MessagelistenerType<T></code> 
    */
   public MessagelistenerType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
