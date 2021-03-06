package org.jboss.shrinkwrap.descriptor.impl.orm10; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.orm10.AttributeOverride;
import org.jboss.shrinkwrap.descriptor.api.orm10.Column;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> attribute-override </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class AttributeOverrideImpl<T> implements Child<T>, AttributeOverride<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public AttributeOverrideImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public AttributeOverrideImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: AttributeOverride ElementName: orm:column ElementType : column
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>column</code> element with the given value will be created.
    * Otherwise, the existing <code>column</code> element will be returned.
    * @return  a new or existing instance of <code>Column<AttributeOverride<T>></code> 
    */
   public Column<AttributeOverride<T>> getOrCreateColumn()
   {
      Node node = childNode.getOrCreate("column");
      Column<AttributeOverride<T>> column = new ColumnImpl<AttributeOverride<T>>(this, "column", childNode, node);
      return column;
   }

   /**
    * Removes the <code>column</code> element 
    * @return the current instance of <code>AttributeOverride<T></code> 
    */
   public AttributeOverride<T> removeColumn()
   {
      childNode.removeChildren("column");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: AttributeOverride ElementName: xsd:string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>AttributeOverride<T></code> 
    */
   public AttributeOverride<T> name(String name)
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
    * @return the current instance of <code>AttributeOverride<T></code> 
    */
   public AttributeOverride<T> removeName()
   {
      childNode.removeAttribute("name");
      return this;
   }
}
