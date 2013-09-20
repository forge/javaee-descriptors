package org.jboss.shrinkwrap.descriptor.impl.orm21; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.orm21.Convert;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> convert </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class ConvertImpl<T> implements Child<T>, Convert<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public ConvertImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public ConvertImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Convert ElementName: xsd:string ElementType : description
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>description</code> element
    * @param description the value for the element <code>description</code> 
    * @return the current instance of <code>Convert<T></code> 
    */
   public Convert<T> description(String description)
   {
      childNode.getOrCreate("description").text(description);
      return this;
   }

   /**
    * Returns the <code>description</code> element
    * @return the node defined for the element <code>description</code> 
    */
   public String getDescription()
   {
      return childNode.getTextValueForPatternName("description");
   }

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>Convert<T></code> 
    */
   public Convert<T> removeDescription()
   {
      childNode.removeChildren("description");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Convert ElementName: xsd:string ElementType : converter
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>converter</code> attribute
    * @param converter the value for the attribute <code>converter</code> 
    * @return the current instance of <code>Convert<T></code> 
    */
   public Convert<T> converter(String converter)
   {
      childNode.attribute("converter", converter);
      return this;
   }

   /**
    * Returns the <code>converter</code> attribute
    * @return the value defined for the attribute <code>converter</code> 
    */
      public String getConverter()
   {
      return childNode.getAttribute("converter");
   }

   /**
    * Removes the <code>converter</code> attribute 
    * @return the current instance of <code>Convert<T></code> 
    */
   public Convert<T> removeConverter()
   {
      childNode.removeAttribute("converter");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Convert ElementName: xsd:string ElementType : attribute-name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>attribute-name</code> attribute
    * @param attributeName the value for the attribute <code>attribute-name</code> 
    * @return the current instance of <code>Convert<T></code> 
    */
   public Convert<T> attributeName(String attributeName)
   {
      childNode.attribute("attribute-name", attributeName);
      return this;
   }

   /**
    * Returns the <code>attribute-name</code> attribute
    * @return the value defined for the attribute <code>attribute-name</code> 
    */
      public String getAttributeName()
   {
      return childNode.getAttribute("attribute-name");
   }

   /**
    * Removes the <code>attribute-name</code> attribute 
    * @return the current instance of <code>Convert<T></code> 
    */
   public Convert<T> removeAttributeName()
   {
      childNode.removeAttribute("attribute-name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Convert ElementName: xsd:boolean ElementType : disable-conversion
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>disable-conversion</code> attribute
    * @param disableConversion the value for the attribute <code>disable-conversion</code> 
    * @return the current instance of <code>Convert<T></code> 
    */
   public Convert<T> disableConversion(Boolean disableConversion)
   {
      childNode.attribute("disable-conversion", disableConversion);
      return this;
   }

   /**
    * Returns the <code>disable-conversion</code> attribute
    * @return the value defined for the attribute <code>disable-conversion</code> 
    */
   public Boolean isDisableConversion()
   {
      return Strings.isTrue(childNode.getAttribute("disable-conversion"));
   }

   /**
    * Removes the <code>disable-conversion</code> attribute 
    * @return the current instance of <code>Convert<T></code> 
    */
   public Convert<T> removeDisableConversion()
   {
      childNode.removeAttribute("disable-conversion");
      return this;
   }
}
