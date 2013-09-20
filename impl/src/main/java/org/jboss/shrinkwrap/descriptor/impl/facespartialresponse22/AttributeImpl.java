package org.jboss.shrinkwrap.descriptor.impl.facespartialresponse22; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.facespartialresponse22.Attribute;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> attribute </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class AttributeImpl<T> implements Child<T>, Attribute<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public AttributeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public AttributeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Attribute ElementName: xsd:string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>Attribute<T></code> 
    */
   public Attribute<T> name(String name)
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
    * @return the current instance of <code>Attribute<T></code> 
    */
   public Attribute<T> removeName()
   {
      childNode.removeAttribute("name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Attribute ElementName: xsd:string ElementType : value
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>value</code> attribute
    * @param value the value for the attribute <code>value</code> 
    * @return the current instance of <code>Attribute<T></code> 
    */
   public Attribute<T> value(String value)
   {
      childNode.attribute("value", value);
      return this;
   }

   /**
    * Returns the <code>value</code> attribute
    * @return the value defined for the attribute <code>value</code> 
    */
      public String getValue()
   {
      return childNode.getAttribute("value");
   }

   /**
    * Removes the <code>value</code> attribute 
    * @return the current instance of <code>Attribute<T></code> 
    */
   public Attribute<T> removeValue()
   {
      childNode.removeAttribute("value");
      return this;
   }
}
