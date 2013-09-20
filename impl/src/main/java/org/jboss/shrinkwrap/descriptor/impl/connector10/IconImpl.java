package org.jboss.shrinkwrap.descriptor.impl.connector10; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.connector10.Icon;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;

/**
 * This class implements the <code> icon </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class IconImpl<T> implements Child<T>, Icon<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public IconImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public IconImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Icon ElementName: xsd:string ElementType : small-icon
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>small-icon</code> element
    * @param smallIcon the value for the element <code>small-icon</code> 
    * @return the current instance of <code>Icon<T></code> 
    */
   public Icon<T> smallIcon(String smallIcon)
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
    * @return the current instance of <code>Icon<T></code> 
    */
   public Icon<T> removeSmallIcon()
   {
      childNode.removeChildren("small-icon");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Icon ElementName: xsd:string ElementType : large-icon
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>large-icon</code> element
    * @param largeIcon the value for the element <code>large-icon</code> 
    * @return the current instance of <code>Icon<T></code> 
    */
   public Icon<T> largeIcon(String largeIcon)
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
    * @return the current instance of <code>Icon<T></code> 
    */
   public Icon<T> removeLargeIcon()
   {
      childNode.removeChildren("large-icon");
      return this;
   }
}
