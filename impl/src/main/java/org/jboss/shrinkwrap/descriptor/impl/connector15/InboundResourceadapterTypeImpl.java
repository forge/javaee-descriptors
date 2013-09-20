package org.jboss.shrinkwrap.descriptor.impl.connector15; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.connector15.InboundResourceadapterType;
import org.jboss.shrinkwrap.descriptor.api.connector15.MessageadapterType;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> inbound-resourceadapterType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class InboundResourceadapterTypeImpl<T> implements Child<T>, InboundResourceadapterType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public InboundResourceadapterTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public InboundResourceadapterTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: InboundResourceadapterType ElementName: j2ee:messageadapterType ElementType : messageadapter
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>messageadapter</code> element with the given value will be created.
    * Otherwise, the existing <code>messageadapter</code> element will be returned.
    * @return  a new or existing instance of <code>MessageadapterType<InboundResourceadapterType<T>></code> 
    */
   public MessageadapterType<InboundResourceadapterType<T>> getOrCreateMessageadapter()
   {
      Node node = childNode.getOrCreate("messageadapter");
      MessageadapterType<InboundResourceadapterType<T>> messageadapter = new MessageadapterTypeImpl<InboundResourceadapterType<T>>(this, "messageadapter", childNode, node);
      return messageadapter;
   }

   /**
    * Removes the <code>messageadapter</code> element 
    * @return the current instance of <code>InboundResourceadapterType<T></code> 
    */
   public InboundResourceadapterType<T> removeMessageadapter()
   {
      childNode.removeChildren("messageadapter");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: InboundResourceadapterType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>InboundResourceadapterType<T></code> 
    */
   public InboundResourceadapterType<T> id(String id)
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
    * @return the current instance of <code>InboundResourceadapterType<T></code> 
    */
   public InboundResourceadapterType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
