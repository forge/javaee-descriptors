package org.jboss.shrinkwrap.descriptor.impl.orm20; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.orm20.Version;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.orm20.Column;
import org.jboss.shrinkwrap.descriptor.impl.orm20.ColumnImpl;
import org.jboss.shrinkwrap.descriptor.api.orm20.TemporalType;
import org.jboss.shrinkwrap.descriptor.api.orm20.AccessType;

/**
 * This class implements the <code> version </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class VersionImpl<T> implements Child<T>, Version<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public VersionImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public VersionImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Version ElementName: orm:column ElementType : column
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>column</code> element with the given value will be created.
    * Otherwise, the existing <code>column</code> element will be returned.
    * @return  a new or existing instance of <code>Column<Version<T>></code> 
    */
   public Column<Version<T>> getOrCreateColumn()
   {
      Node node = childNode.getOrCreate("column");
      Column<Version<T>> column = new ColumnImpl<Version<T>>(this, "column", childNode, node);
      return column;
   }

   /**
    * Removes the <code>column</code> element 
    * @return the current instance of <code>Version<T></code> 
    */
   public Version<T> removeColumn()
   {
      childNode.removeChildren("column");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Version ElementName: orm:temporal-type ElementType : temporal
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>temporal</code> element
    * @param temporal the value for the element <code>temporal</code> 
    * @return the current instance of <code>Version<T></code> 
    */
   public Version<T> temporal(TemporalType temporal)
   {
      childNode.getOrCreate("temporal").text(temporal);
      return this;
   }
   /**
    * Sets the <code>temporal</code> element
    * @param temporal the value for the element <code>temporal</code> 
    * @return the current instance of <code>Version<T></code> 
    */
   public Version<T> temporal(String temporal)
   {
      childNode.getOrCreate("temporal").text(temporal);
      return this;
   }

   /**
    * Returns the <code>temporal</code> element
    * @return the value found for the element <code>temporal</code> 
    */
   public TemporalType getTemporal()
   {
      return TemporalType.getFromStringValue(childNode.getTextValueForPatternName("temporal"));
   }

   /**
    * Returns the <code>temporal</code> element
    * @return the value found for the element <code>temporal</code> 
    */
   public String  getTemporalAsString()
   {
      return childNode.getTextValueForPatternName("temporal");
   }

   /**
    * Removes the <code>temporal</code> attribute 
    * @return the current instance of <code>Version<T></code> 
    */
   public Version<T> removeTemporal()
   {
      childNode.removeAttribute("temporal");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Version ElementName: xsd:string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>Version<T></code> 
    */
   public Version<T> name(String name)
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
    * @return the current instance of <code>Version<T></code> 
    */
   public Version<T> removeName()
   {
      childNode.removeAttribute("name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Version ElementName: orm:access-type ElementType : access
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>access</code> attribute
    * @param access the value for the attribute <code>access</code> 
    * @return the current instance of <code>Version<T></code> 
    */
   public Version<T> access(AccessType access)
   {
      childNode.attribute("access", access);
      return this;
   }

   /**
    * Sets the <code>access</code> attribute
    * @param access the value for the attribute <code>access</code> 
    * @return the current instance of <code>Version<T></code> 
    */
   public Version<T> access(String access)
   {
      childNode.attribute("access", access);
      return this;
   }

   /**
    * Returns the <code>access</code> attribute
    * @return the value defined for the attribute <code>access</code> 
    */
   public AccessType getAccess()
   {
      return AccessType.getFromStringValue(childNode.getAttribute("access"));
   }

   /**
    * Returns the <code>access</code> attribute
    * @return the value found for the element <code>access</code> 
    */
   public String  getAccessAsString()
   {
      return childNode.getAttribute("access");
   }

   /**
    * Removes the <code>access</code> attribute 
    * @return the current instance of <code>Version<T></code> 
    */
   public Version<T> removeAccess()
   {
      childNode.removeAttribute("access");
      return this;
   }
}
