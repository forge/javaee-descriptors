package org.jboss.shrinkwrap.descriptor.impl.validationConfiguration11; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.validationConfiguration11.PropertyType;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> propertyType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class PropertyTypeImpl<T> implements Child<T>, PropertyType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public PropertyTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public PropertyTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PropertyType ElementName: text ElementType : propertyType
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the body text for the element <code>propertyType</code> 
    * @param propertyType the value for the body text <code>propertyType</code> 
    * @return the current instance of <code>PropertyType<T></code> 
    */
   public PropertyType<T> text(String value)
   {
      childNode.text(value);
      return this;
   }

   /**
    * Returns the body text of the element <code>propertyType</code> 
    * @return the value defined for the text <code>propertyType</code> 
    */
   public String getText()
   {
      return childNode.getText();
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PropertyType ElementName: xsd:string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>PropertyType<T></code> 
    */
   public PropertyType<T> name(String name)
   {
      childNode.attribute("name", name);
      return this;
   }

   /**
    * Returns the <code>name</code> attribute
    * @return the value defined for the attribute <code>name</code> 
    */
      public String getName()
   {
      return childNode.getAttribute("name");
   }

   /**
    * Removes the <code>name</code> attribute 
    * @return the current instance of <code>PropertyType<T></code> 
    */
   public PropertyType<T> removeName()
   {
      childNode.removeAttribute("name");
      return this;
   }
}
