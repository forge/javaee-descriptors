package org.jboss.shrinkwrap.descriptor.impl.orm21; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.orm21.ForeignKey;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.orm21.ConstraintMode;

/**
 * This class implements the <code> foreign-key </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class ForeignKeyImpl<T> implements Child<T>, ForeignKey<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public ForeignKeyImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public ForeignKeyImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ForeignKey ElementName: xsd:string ElementType : description
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>description</code> element
    * @param description the value for the element <code>description</code> 
    * @return the current instance of <code>ForeignKey<T></code> 
    */
   public ForeignKey<T> description(String description)
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
    * @return the current instance of <code>ForeignKey<T></code> 
    */
   public ForeignKey<T> removeDescription()
   {
      childNode.removeChildren("description");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ForeignKey ElementName: xsd:string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>ForeignKey<T></code> 
    */
   public ForeignKey<T> name(String name)
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
    * @return the current instance of <code>ForeignKey<T></code> 
    */
   public ForeignKey<T> removeName()
   {
      childNode.removeAttribute("name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ForeignKey ElementName: orm:constraint-mode ElementType : constraint-mode
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>constraint-mode</code> attribute
    * @param constraintMode the value for the attribute <code>constraint-mode</code> 
    * @return the current instance of <code>ForeignKey<T></code> 
    */
   public ForeignKey<T> constraintMode(ConstraintMode constraintMode)
   {
      childNode.attribute("constraint-mode", constraintMode);
      return this;
   }

   /**
    * Sets the <code>constraint-mode</code> attribute
    * @param constraintMode the value for the attribute <code>constraint-mode</code> 
    * @return the current instance of <code>ForeignKey<T></code> 
    */
   public ForeignKey<T> constraintMode(String constraintMode)
   {
      childNode.attribute("constraint-mode", constraintMode);
      return this;
   }

   /**
    * Returns the <code>constraint-mode</code> attribute
    * @return the value defined for the attribute <code>constraint-mode</code> 
    */
   public ConstraintMode getConstraintMode()
   {
      return ConstraintMode.getFromStringValue(childNode.getAttribute("constraint-mode"));
   }

   /**
    * Returns the <code>constraint-mode</code> attribute
    * @return the value found for the element <code>constraint-mode</code> 
    */
   public String  getConstraintModeAsString()
   {
      return childNode.getAttribute("constraint-mode");
   }

   /**
    * Removes the <code>constraint-mode</code> attribute 
    * @return the current instance of <code>ForeignKey<T></code> 
    */
   public ForeignKey<T> removeConstraintMode()
   {
      childNode.removeAttribute("constraint-mode");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ForeignKey ElementName: xsd:string ElementType : foreign-key-definition
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>foreign-key-definition</code> attribute
    * @param foreignKeyDefinition the value for the attribute <code>foreign-key-definition</code> 
    * @return the current instance of <code>ForeignKey<T></code> 
    */
   public ForeignKey<T> foreignKeyDefinition(String foreignKeyDefinition)
   {
      childNode.attribute("foreign-key-definition", foreignKeyDefinition);
      return this;
   }

   /**
    * Returns the <code>foreign-key-definition</code> attribute
    * @return the value defined for the attribute <code>foreign-key-definition</code> 
    */
      public String getForeignKeyDefinition()
   {
      return childNode.getAttribute("foreign-key-definition");
   }

   /**
    * Removes the <code>foreign-key-definition</code> attribute 
    * @return the current instance of <code>ForeignKey<T></code> 
    */
   public ForeignKey<T> removeForeignKeyDefinition()
   {
      childNode.removeAttribute("foreign-key-definition");
      return this;
   }
}
