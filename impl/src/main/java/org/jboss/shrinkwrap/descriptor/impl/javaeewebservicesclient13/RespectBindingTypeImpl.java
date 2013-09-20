package org.jboss.shrinkwrap.descriptor.impl.javaeewebservicesclient13; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient13.RespectBindingType;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> respect-bindingType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class RespectBindingTypeImpl<T> implements Child<T>, RespectBindingType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public RespectBindingTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public RespectBindingTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: RespectBindingType ElementName: javaee:xsdBooleanType ElementType : enabled
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>enabled</code> element
    * @param enabled the value for the element <code>enabled</code> 
    * @return the current instance of <code>RespectBindingType<T></code> 
    */
   public RespectBindingType<T> enabled(Boolean enabled)
   {
      childNode.getOrCreate("enabled").text(enabled);
      return this;
   }

   /**
    * Returns the <code>enabled</code> element
    * @return the node defined for the element <code>enabled</code> 
    */
   public Boolean isEnabled()
   {
      return Strings.isTrue(childNode.getTextValueForPatternName("enabled"));
   }

   /**
    * Removes the <code>enabled</code> element 
    * @return the current instance of <code>RespectBindingType<T></code> 
    */
   public RespectBindingType<T> removeEnabled()
   {
      childNode.removeChildren("enabled");
      return this;
   }
}
