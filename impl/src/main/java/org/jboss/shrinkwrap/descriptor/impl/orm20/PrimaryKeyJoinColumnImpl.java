package org.jboss.shrinkwrap.descriptor.impl.orm20; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.orm20.PrimaryKeyJoinColumn;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;

/**
 * This class implements the <code> primary-key-join-column </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class PrimaryKeyJoinColumnImpl<T> implements Child<T>, PrimaryKeyJoinColumn<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public PrimaryKeyJoinColumnImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public PrimaryKeyJoinColumnImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PrimaryKeyJoinColumn ElementName: xsd:string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>PrimaryKeyJoinColumn<T></code> 
    */
   public PrimaryKeyJoinColumn<T> name(String name)
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
    * @return the current instance of <code>PrimaryKeyJoinColumn<T></code> 
    */
   public PrimaryKeyJoinColumn<T> removeName()
   {
      childNode.removeAttribute("name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PrimaryKeyJoinColumn ElementName: xsd:string ElementType : referenced-column-name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>referenced-column-name</code> attribute
    * @param referencedColumnName the value for the attribute <code>referenced-column-name</code> 
    * @return the current instance of <code>PrimaryKeyJoinColumn<T></code> 
    */
   public PrimaryKeyJoinColumn<T> referencedColumnName(String referencedColumnName)
   {
      childNode.attribute("referenced-column-name", referencedColumnName);
      return this;
   }

   /**
    * Returns the <code>referenced-column-name</code> attribute
    * @return the value defined for the attribute <code>referenced-column-name</code> 
    */
      public String getReferencedColumnName()
   {
      return childNode.getAttribute("referenced-column-name");
   }

   /**
    * Removes the <code>referenced-column-name</code> attribute 
    * @return the current instance of <code>PrimaryKeyJoinColumn<T></code> 
    */
   public PrimaryKeyJoinColumn<T> removeReferencedColumnName()
   {
      childNode.removeAttribute("referenced-column-name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PrimaryKeyJoinColumn ElementName: xsd:string ElementType : column-definition
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>column-definition</code> attribute
    * @param columnDefinition the value for the attribute <code>column-definition</code> 
    * @return the current instance of <code>PrimaryKeyJoinColumn<T></code> 
    */
   public PrimaryKeyJoinColumn<T> columnDefinition(String columnDefinition)
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
    * @return the current instance of <code>PrimaryKeyJoinColumn<T></code> 
    */
   public PrimaryKeyJoinColumn<T> removeColumnDefinition()
   {
      childNode.removeAttribute("column-definition");
      return this;
   }
}
