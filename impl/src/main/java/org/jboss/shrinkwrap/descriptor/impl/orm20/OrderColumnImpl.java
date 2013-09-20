package org.jboss.shrinkwrap.descriptor.impl.orm20; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.orm20.OrderColumn;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;

/**
 * This class implements the <code> order-column </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class OrderColumnImpl<T> implements Child<T>, OrderColumn<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public OrderColumnImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public OrderColumnImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OrderColumn ElementName: xsd:string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>OrderColumn<T></code> 
    */
   public OrderColumn<T> name(String name)
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
    * @return the current instance of <code>OrderColumn<T></code> 
    */
   public OrderColumn<T> removeName()
   {
      childNode.removeAttribute("name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OrderColumn ElementName: xsd:boolean ElementType : nullable
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>nullable</code> attribute
    * @param nullable the value for the attribute <code>nullable</code> 
    * @return the current instance of <code>OrderColumn<T></code> 
    */
   public OrderColumn<T> nullable(Boolean nullable)
   {
      childNode.attribute("nullable", nullable);
      return this;
   }

   /**
    * Returns the <code>nullable</code> attribute
    * @return the value defined for the attribute <code>nullable</code> 
    */
   public Boolean isNullable()
   {
      return Strings.isTrue(childNode.getAttribute("nullable"));
   }

   /**
    * Removes the <code>nullable</code> attribute 
    * @return the current instance of <code>OrderColumn<T></code> 
    */
   public OrderColumn<T> removeNullable()
   {
      childNode.removeAttribute("nullable");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OrderColumn ElementName: xsd:boolean ElementType : insertable
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>insertable</code> attribute
    * @param insertable the value for the attribute <code>insertable</code> 
    * @return the current instance of <code>OrderColumn<T></code> 
    */
   public OrderColumn<T> insertable(Boolean insertable)
   {
      childNode.attribute("insertable", insertable);
      return this;
   }

   /**
    * Returns the <code>insertable</code> attribute
    * @return the value defined for the attribute <code>insertable</code> 
    */
   public Boolean isInsertable()
   {
      return Strings.isTrue(childNode.getAttribute("insertable"));
   }

   /**
    * Removes the <code>insertable</code> attribute 
    * @return the current instance of <code>OrderColumn<T></code> 
    */
   public OrderColumn<T> removeInsertable()
   {
      childNode.removeAttribute("insertable");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OrderColumn ElementName: xsd:boolean ElementType : updatable
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>updatable</code> attribute
    * @param updatable the value for the attribute <code>updatable</code> 
    * @return the current instance of <code>OrderColumn<T></code> 
    */
   public OrderColumn<T> updatable(Boolean updatable)
   {
      childNode.attribute("updatable", updatable);
      return this;
   }

   /**
    * Returns the <code>updatable</code> attribute
    * @return the value defined for the attribute <code>updatable</code> 
    */
   public Boolean isUpdatable()
   {
      return Strings.isTrue(childNode.getAttribute("updatable"));
   }

   /**
    * Removes the <code>updatable</code> attribute 
    * @return the current instance of <code>OrderColumn<T></code> 
    */
   public OrderColumn<T> removeUpdatable()
   {
      childNode.removeAttribute("updatable");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OrderColumn ElementName: xsd:string ElementType : column-definition
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>column-definition</code> attribute
    * @param columnDefinition the value for the attribute <code>column-definition</code> 
    * @return the current instance of <code>OrderColumn<T></code> 
    */
   public OrderColumn<T> columnDefinition(String columnDefinition)
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
    * @return the current instance of <code>OrderColumn<T></code> 
    */
   public OrderColumn<T> removeColumnDefinition()
   {
      childNode.removeAttribute("column-definition");
      return this;
   }
}
