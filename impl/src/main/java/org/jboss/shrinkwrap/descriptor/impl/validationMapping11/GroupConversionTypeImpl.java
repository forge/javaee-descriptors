package org.jboss.shrinkwrap.descriptor.impl.validationMapping11; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.validationMapping11.GroupConversionType;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> groupConversionType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class GroupConversionTypeImpl<T> implements Child<T>, GroupConversionType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public GroupConversionTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public GroupConversionTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: GroupConversionType ElementName: xsd:string ElementType : from
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>from</code> attribute
    * @param from the value for the attribute <code>from</code> 
    * @return the current instance of <code>GroupConversionType<T></code> 
    */
   public GroupConversionType<T> from(String from)
   {
      childNode.attribute("from", from);
      return this;
   }

   /**
    * Returns the <code>from</code> attribute
    * @return the value defined for the attribute <code>from</code> 
    */
      public String getFrom()
   {
      return childNode.getAttribute("from");
   }

   /**
    * Removes the <code>from</code> attribute 
    * @return the current instance of <code>GroupConversionType<T></code> 
    */
   public GroupConversionType<T> removeFrom()
   {
      childNode.removeAttribute("from");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: GroupConversionType ElementName: xsd:string ElementType : to
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>to</code> attribute
    * @param to the value for the attribute <code>to</code> 
    * @return the current instance of <code>GroupConversionType<T></code> 
    */
   public GroupConversionType<T> to(String to)
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
    * @return the current instance of <code>GroupConversionType<T></code> 
    */
   public GroupConversionType<T> removeTo()
   {
      childNode.removeAttribute("to");
      return this;
   }
}
