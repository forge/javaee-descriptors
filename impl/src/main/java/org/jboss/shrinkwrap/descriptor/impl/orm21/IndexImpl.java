package org.jboss.shrinkwrap.descriptor.impl.orm21; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.orm21.Index;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> index </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class IndexImpl<T> implements Child<T>, Index<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public IndexImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public IndexImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Index ElementName: xsd:string ElementType : description
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>description</code> element
    * @param description the value for the element <code>description</code> 
    * @return the current instance of <code>Index<T></code> 
    */
   public Index<T> description(String description)
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
    * @return the current instance of <code>Index<T></code> 
    */
   public Index<T> removeDescription()
   {
      childNode.removeChildren("description");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Index ElementName: xsd:string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>Index<T></code> 
    */
   public Index<T> name(String name)
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
    * @return the current instance of <code>Index<T></code> 
    */
   public Index<T> removeName()
   {
      childNode.removeAttribute("name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Index ElementName: xsd:string ElementType : column-list
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>column-list</code> attribute
    * @param columnList the value for the attribute <code>column-list</code> 
    * @return the current instance of <code>Index<T></code> 
    */
   public Index<T> columnList(String columnList)
   {
      childNode.attribute("column-list", columnList);
      return this;
   }

   /**
    * Returns the <code>column-list</code> attribute
    * @return the value defined for the attribute <code>column-list</code> 
    */
      public String getColumnList()
   {
      return childNode.getAttribute("column-list");
   }

   /**
    * Removes the <code>column-list</code> attribute 
    * @return the current instance of <code>Index<T></code> 
    */
   public Index<T> removeColumnList()
   {
      childNode.removeAttribute("column-list");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Index ElementName: xsd:boolean ElementType : unique
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>unique</code> attribute
    * @param unique the value for the attribute <code>unique</code> 
    * @return the current instance of <code>Index<T></code> 
    */
   public Index<T> unique(Boolean unique)
   {
      childNode.attribute("unique", unique);
      return this;
   }

   /**
    * Returns the <code>unique</code> attribute
    * @return the value defined for the attribute <code>unique</code> 
    */
   public Boolean isUnique()
   {
      return Strings.isTrue(childNode.getAttribute("unique"));
   }

   /**
    * Removes the <code>unique</code> attribute 
    * @return the current instance of <code>Index<T></code> 
    */
   public Index<T> removeUnique()
   {
      childNode.removeAttribute("unique");
      return this;
   }
}
