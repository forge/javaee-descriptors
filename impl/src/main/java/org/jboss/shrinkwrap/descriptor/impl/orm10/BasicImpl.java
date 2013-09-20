package org.jboss.shrinkwrap.descriptor.impl.orm10; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.orm10.Basic;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.orm10.Column;
import org.jboss.shrinkwrap.descriptor.impl.orm10.ColumnImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee5.EmptyType;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.EmptyTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.orm10.TemporalType;
import org.jboss.shrinkwrap.descriptor.api.orm10.EnumType;
import org.jboss.shrinkwrap.descriptor.api.orm10.FetchType;

/**
 * This class implements the <code> basic </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class BasicImpl<T> implements Child<T>, Basic<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public BasicImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public BasicImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Basic ElementName: orm:column ElementType : column
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>column</code> element with the given value will be created.
    * Otherwise, the existing <code>column</code> element will be returned.
    * @return  a new or existing instance of <code>Column<Basic<T>></code> 
    */
   public Column<Basic<T>> getOrCreateColumn()
   {
      Node node = childNode.getOrCreate("column");
      Column<Basic<T>> column = new ColumnImpl<Basic<T>>(this, "column", childNode, node);
      return column;
   }

   /**
    * Removes the <code>column</code> element 
    * @return the current instance of <code>Basic<T></code> 
    */
   public Basic<T> removeColumn()
   {
      childNode.removeChildren("column");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Basic ElementName: javaee:emptyType ElementType : lob
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>lob</code> element 
    * @return the current instance of <code>Basic<T></code> 
    */
   public Basic<T> lob()
   {
      childNode.getOrCreate("lob");
      return this;
   }

   /**
    * Removes the <code>lob</code> element 
    * @return the current instance of <code>Basic<T></code> 
    */
   public Boolean isLob()
   {
      return childNode.getSingle("lob") != null;
   }

   /**
    * Removes the <code>lob</code> element 
    * @return the current instance of <code>Basic<T></code> 
    */
   public Basic<T> removeLob()
   {
      childNode.removeChild("lob");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Basic ElementName: orm:temporal-type ElementType : temporal
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>temporal</code> element
    * @param temporal the value for the element <code>temporal</code> 
    * @return the current instance of <code>Basic<T></code> 
    */
   public Basic<T> temporal(TemporalType temporal)
   {
      childNode.getOrCreate("temporal").text(temporal);
      return this;
   }
   /**
    * Sets the <code>temporal</code> element
    * @param temporal the value for the element <code>temporal</code> 
    * @return the current instance of <code>Basic<T></code> 
    */
   public Basic<T> temporal(String temporal)
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
    * @return the current instance of <code>Basic<T></code> 
    */
   public Basic<T> removeTemporal()
   {
      childNode.removeAttribute("temporal");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Basic ElementName: orm:enum-type ElementType : enumerated
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>enumerated</code> element
    * @param enumerated the value for the element <code>enumerated</code> 
    * @return the current instance of <code>Basic<T></code> 
    */
   public Basic<T> enumerated(EnumType enumerated)
   {
      childNode.getOrCreate("enumerated").text(enumerated);
      return this;
   }
   /**
    * Sets the <code>enumerated</code> element
    * @param enumerated the value for the element <code>enumerated</code> 
    * @return the current instance of <code>Basic<T></code> 
    */
   public Basic<T> enumerated(String enumerated)
   {
      childNode.getOrCreate("enumerated").text(enumerated);
      return this;
   }

   /**
    * Returns the <code>enumerated</code> element
    * @return the value found for the element <code>enumerated</code> 
    */
   public EnumType getEnumerated()
   {
      return EnumType.getFromStringValue(childNode.getTextValueForPatternName("enumerated"));
   }

   /**
    * Returns the <code>enumerated</code> element
    * @return the value found for the element <code>enumerated</code> 
    */
   public String  getEnumeratedAsString()
   {
      return childNode.getTextValueForPatternName("enumerated");
   }

   /**
    * Removes the <code>enumerated</code> attribute 
    * @return the current instance of <code>Basic<T></code> 
    */
   public Basic<T> removeEnumerated()
   {
      childNode.removeAttribute("enumerated");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Basic ElementName: xsd:string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>Basic<T></code> 
    */
   public Basic<T> name(String name)
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
    * @return the current instance of <code>Basic<T></code> 
    */
   public Basic<T> removeName()
   {
      childNode.removeAttribute("name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Basic ElementName: orm:fetch-type ElementType : fetch
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>fetch</code> attribute
    * @param fetch the value for the attribute <code>fetch</code> 
    * @return the current instance of <code>Basic<T></code> 
    */
   public Basic<T> fetch(FetchType fetch)
   {
      childNode.attribute("fetch", fetch);
      return this;
   }

   /**
    * Sets the <code>fetch</code> attribute
    * @param fetch the value for the attribute <code>fetch</code> 
    * @return the current instance of <code>Basic<T></code> 
    */
   public Basic<T> fetch(String fetch)
   {
      childNode.attribute("fetch", fetch);
      return this;
   }

   /**
    * Returns the <code>fetch</code> attribute
    * @return the value defined for the attribute <code>fetch</code> 
    */
   public FetchType getFetch()
   {
      return FetchType.getFromStringValue(childNode.getAttribute("fetch"));
   }

   /**
    * Returns the <code>fetch</code> attribute
    * @return the value found for the element <code>fetch</code> 
    */
   public String  getFetchAsString()
   {
      return childNode.getAttribute("fetch");
   }

   /**
    * Removes the <code>fetch</code> attribute 
    * @return the current instance of <code>Basic<T></code> 
    */
   public Basic<T> removeFetch()
   {
      childNode.removeAttribute("fetch");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Basic ElementName: xsd:boolean ElementType : optional
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>optional</code> attribute
    * @param optional the value for the attribute <code>optional</code> 
    * @return the current instance of <code>Basic<T></code> 
    */
   public Basic<T> optional(Boolean optional)
   {
      childNode.attribute("optional", optional);
      return this;
   }

   /**
    * Returns the <code>optional</code> attribute
    * @return the value defined for the attribute <code>optional</code> 
    */
   public Boolean isOptional()
   {
      return Strings.isTrue(childNode.getAttribute("optional"));
   }

   /**
    * Removes the <code>optional</code> attribute 
    * @return the current instance of <code>Basic<T></code> 
    */
   public Basic<T> removeOptional()
   {
      childNode.removeAttribute("optional");
      return this;
   }
}
