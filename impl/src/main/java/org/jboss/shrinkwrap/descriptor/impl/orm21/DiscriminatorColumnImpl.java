package org.jboss.shrinkwrap.descriptor.impl.orm21; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.orm21.DiscriminatorColumn;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.orm21.DiscriminatorType;

/**
 * This class implements the <code> discriminator-column </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class DiscriminatorColumnImpl<T> implements Child<T>, DiscriminatorColumn<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public DiscriminatorColumnImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public DiscriminatorColumnImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DiscriminatorColumn ElementName: xsd:string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>DiscriminatorColumn<T></code> 
    */
   public DiscriminatorColumn<T> name(String name)
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
    * @return the current instance of <code>DiscriminatorColumn<T></code> 
    */
   public DiscriminatorColumn<T> removeName()
   {
      childNode.removeAttribute("name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DiscriminatorColumn ElementName: orm:discriminator-type ElementType : discriminator-type
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>discriminator-type</code> attribute
    * @param discriminatorType the value for the attribute <code>discriminator-type</code> 
    * @return the current instance of <code>DiscriminatorColumn<T></code> 
    */
   public DiscriminatorColumn<T> discriminatorType(DiscriminatorType discriminatorType)
   {
      childNode.attribute("discriminator-type", discriminatorType);
      return this;
   }

   /**
    * Sets the <code>discriminator-type</code> attribute
    * @param discriminatorType the value for the attribute <code>discriminator-type</code> 
    * @return the current instance of <code>DiscriminatorColumn<T></code> 
    */
   public DiscriminatorColumn<T> discriminatorType(String discriminatorType)
   {
      childNode.attribute("discriminator-type", discriminatorType);
      return this;
   }

   /**
    * Returns the <code>discriminator-type</code> attribute
    * @return the value defined for the attribute <code>discriminator-type</code> 
    */
   public DiscriminatorType getDiscriminatorType()
   {
      return DiscriminatorType.getFromStringValue(childNode.getAttribute("discriminator-type"));
   }

   /**
    * Returns the <code>discriminator-type</code> attribute
    * @return the value found for the element <code>discriminator-type</code> 
    */
   public String  getDiscriminatorTypeAsString()
   {
      return childNode.getAttribute("discriminator-type");
   }

   /**
    * Removes the <code>discriminator-type</code> attribute 
    * @return the current instance of <code>DiscriminatorColumn<T></code> 
    */
   public DiscriminatorColumn<T> removeDiscriminatorType()
   {
      childNode.removeAttribute("discriminator-type");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DiscriminatorColumn ElementName: xsd:string ElementType : column-definition
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>column-definition</code> attribute
    * @param columnDefinition the value for the attribute <code>column-definition</code> 
    * @return the current instance of <code>DiscriminatorColumn<T></code> 
    */
   public DiscriminatorColumn<T> columnDefinition(String columnDefinition)
   {
      childNode.attribute("column-definition", columnDefinition);
      return this;
   }

   /**
    * Returns the <code>column-definition</code> attribute
    * @return the value defined for the attribute <code>column-definition</code> 
    */
      public String getColumnDefinition()
   {
      return childNode.getAttribute("column-definition");
   }

   /**
    * Removes the <code>column-definition</code> attribute 
    * @return the current instance of <code>DiscriminatorColumn<T></code> 
    */
   public DiscriminatorColumn<T> removeColumnDefinition()
   {
      childNode.removeAttribute("column-definition");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DiscriminatorColumn ElementName: xsd:int ElementType : length
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>length</code> attribute
    * @param length the value for the attribute <code>length</code> 
    * @return the current instance of <code>DiscriminatorColumn<T></code> 
    */
   public DiscriminatorColumn<T> length(Integer length)
   {
      childNode.attribute("length", length);
      return this;
   }

   /**
    * Returns the <code>length</code> attribute
    * @return the value defined for the attribute <code>length</code> 
    */
   public Integer getLength()
   {
      if(childNode.getAttribute("length") != null && !childNode.getAttribute("length").equals("null"))
      {
         return Integer.valueOf(childNode.getAttribute("length"));
      }
      return null;
   }

   /**
    * Removes the <code>length</code> attribute 
    * @return the current instance of <code>DiscriminatorColumn<T></code> 
    */
   public DiscriminatorColumn<T> removeLength()
   {
      childNode.removeAttribute("length");
      return this;
   }
}
