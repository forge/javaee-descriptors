package org.jboss.shrinkwrap.descriptor.impl.orm10; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.orm10.FieldResult;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> field-result </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class FieldResultImpl<T> implements Child<T>, FieldResult<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public FieldResultImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public FieldResultImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FieldResult ElementName: xsd:string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>FieldResult<T></code> 
    */
   public FieldResult<T> name(String name)
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
    * @return the current instance of <code>FieldResult<T></code> 
    */
   public FieldResult<T> removeName()
   {
      childNode.removeAttribute("name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FieldResult ElementName: xsd:string ElementType : column
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>column</code> attribute
    * @param column the value for the attribute <code>column</code> 
    * @return the current instance of <code>FieldResult<T></code> 
    */
   public FieldResult<T> column(String column)
   {
      childNode.attribute("column", column);
      return this;
   }

   /**
    * Returns the <code>column</code> attribute
    * @return the value defined for the attribute <code>column</code> 
    */
      public String getColumn()
   {
      return childNode.getAttribute("column");
   }

   /**
    * Removes the <code>column</code> attribute 
    * @return the current instance of <code>FieldResult<T></code> 
    */
   public FieldResult<T> removeColumn()
   {
      childNode.removeAttribute("column");
      return this;
   }
}
