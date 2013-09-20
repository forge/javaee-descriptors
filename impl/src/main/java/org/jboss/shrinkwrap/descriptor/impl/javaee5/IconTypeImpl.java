package org.jboss.shrinkwrap.descriptor.impl.javaee5; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> iconType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class IconTypeImpl<T> implements Child<T>, IconType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public IconTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public IconTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: IconType ElementName: xsd:token ElementType : small-icon
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>small-icon</code> element
    * @param smallIcon the value for the element <code>small-icon</code> 
    * @return the current instance of <code>IconType<T></code> 
    */
   public IconType<T> smallIcon(String smallIcon)
   {
      childNode.getOrCreate("small-icon").text(smallIcon);
      return this;
   }

   /**
    * Returns the <code>small-icon</code> element
    * @return the node defined for the element <code>small-icon</code> 
    */
   public String getSmallIcon()
   {
      return childNode.getTextValueForPatternName("small-icon");
   }

   /**
    * Removes the <code>small-icon</code> element 
    * @return the current instance of <code>IconType<T></code> 
    */
   public IconType<T> removeSmallIcon()
   {
      childNode.removeChildren("small-icon");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: IconType ElementName: xsd:token ElementType : large-icon
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>large-icon</code> element
    * @param largeIcon the value for the element <code>large-icon</code> 
    * @return the current instance of <code>IconType<T></code> 
    */
   public IconType<T> largeIcon(String largeIcon)
   {
      childNode.getOrCreate("large-icon").text(largeIcon);
      return this;
   }

   /**
    * Returns the <code>large-icon</code> element
    * @return the node defined for the element <code>large-icon</code> 
    */
   public String getLargeIcon()
   {
      return childNode.getTextValueForPatternName("large-icon");
   }

   /**
    * Removes the <code>large-icon</code> element 
    * @return the current instance of <code>IconType<T></code> 
    */
   public IconType<T> removeLargeIcon()
   {
      childNode.removeChildren("large-icon");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: IconType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>IconType<T></code> 
    */
   public IconType<T> id(String id)
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
    * @return the current instance of <code>IconType<T></code> 
    */
   public IconType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
