package org.jboss.shrinkwrap.descriptor.impl.facespartialresponse20; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.facespartialresponse20.PartialResponseUpdateType;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> partial-response-updateType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class PartialResponseUpdateTypeImpl<T> implements Child<T>, PartialResponseUpdateType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public PartialResponseUpdateTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public PartialResponseUpdateTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PartialResponseUpdateType ElementName: text ElementType : partial-response-updateType
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the body text for the element <code>partial-response-updateType</code> 
    * @param partialResponseUpdateType the value for the body text <code>partial-response-updateType</code> 
    * @return the current instance of <code>PartialResponseUpdateType<T></code> 
    */
   public PartialResponseUpdateType<T> text(String value)
   {
      childNode.text(value);
      return this;
   }

   /**
    * Returns the body text of the element <code>partial-response-updateType</code> 
    * @return the value defined for the text <code>partial-response-updateType</code> 
    */
   public String getText()
   {
      return childNode.getText();
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PartialResponseUpdateType ElementName: xsd:string ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>PartialResponseUpdateType<T></code> 
    */
   public PartialResponseUpdateType<T> id(String id)
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
    * @return the current instance of <code>PartialResponseUpdateType<T></code> 
    */
   public PartialResponseUpdateType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
