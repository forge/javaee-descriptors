package org.jboss.shrinkwrap.descriptor.impl.orm21; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.orm21.MapKeyColumn;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;

/**
 * This class implements the <code> map-key-column </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class MapKeyColumnImpl<T> implements Child<T>, MapKeyColumn<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public MapKeyColumnImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public MapKeyColumnImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MapKeyColumn ElementName: xsd:string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>MapKeyColumn<T></code> 
    */
   public MapKeyColumn<T> name(String name)
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
    * @return the current instance of <code>MapKeyColumn<T></code> 
    */
   public MapKeyColumn<T> removeName()
   {
      childNode.removeAttribute("name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MapKeyColumn ElementName: xsd:boolean ElementType : unique
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>unique</code> attribute
    * @param unique the value for the attribute <code>unique</code> 
    * @return the current instance of <code>MapKeyColumn<T></code> 
    */
   public MapKeyColumn<T> unique(Boolean unique)
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
    * @return the current instance of <code>MapKeyColumn<T></code> 
    */
   public MapKeyColumn<T> removeUnique()
   {
      childNode.removeAttribute("unique");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MapKeyColumn ElementName: xsd:boolean ElementType : nullable
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>nullable</code> attribute
    * @param nullable the value for the attribute <code>nullable</code> 
    * @return the current instance of <code>MapKeyColumn<T></code> 
    */
   public MapKeyColumn<T> nullable(Boolean nullable)
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
    * @return the current instance of <code>MapKeyColumn<T></code> 
    */
   public MapKeyColumn<T> removeNullable()
   {
      childNode.removeAttribute("nullable");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MapKeyColumn ElementName: xsd:boolean ElementType : insertable
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>insertable</code> attribute
    * @param insertable the value for the attribute <code>insertable</code> 
    * @return the current instance of <code>MapKeyColumn<T></code> 
    */
   public MapKeyColumn<T> insertable(Boolean insertable)
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
    * @return the current instance of <code>MapKeyColumn<T></code> 
    */
   public MapKeyColumn<T> removeInsertable()
   {
      childNode.removeAttribute("insertable");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MapKeyColumn ElementName: xsd:boolean ElementType : updatable
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>updatable</code> attribute
    * @param updatable the value for the attribute <code>updatable</code> 
    * @return the current instance of <code>MapKeyColumn<T></code> 
    */
   public MapKeyColumn<T> updatable(Boolean updatable)
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
    * @return the current instance of <code>MapKeyColumn<T></code> 
    */
   public MapKeyColumn<T> removeUpdatable()
   {
      childNode.removeAttribute("updatable");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MapKeyColumn ElementName: xsd:string ElementType : column-definition
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>column-definition</code> attribute
    * @param columnDefinition the value for the attribute <code>column-definition</code> 
    * @return the current instance of <code>MapKeyColumn<T></code> 
    */
   public MapKeyColumn<T> columnDefinition(String columnDefinition)
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
    * @return the current instance of <code>MapKeyColumn<T></code> 
    */
   public MapKeyColumn<T> removeColumnDefinition()
   {
      childNode.removeAttribute("column-definition");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MapKeyColumn ElementName: xsd:string ElementType : table
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>table</code> attribute
    * @param table the value for the attribute <code>table</code> 
    * @return the current instance of <code>MapKeyColumn<T></code> 
    */
   public MapKeyColumn<T> table(String table)
   {
      childNode.attribute("table", table);
      return this;
   }

   /**
    * Returns the <code>table</code> attribute
    * @return the value defined for the attribute <code>table</code> 
    */
      public String getTable()
   {
      return childNode.getAttribute("table");
   }

   /**
    * Removes the <code>table</code> attribute 
    * @return the current instance of <code>MapKeyColumn<T></code> 
    */
   public MapKeyColumn<T> removeTable()
   {
      childNode.removeAttribute("table");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MapKeyColumn ElementName: xsd:int ElementType : length
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>length</code> attribute
    * @param length the value for the attribute <code>length</code> 
    * @return the current instance of <code>MapKeyColumn<T></code> 
    */
   public MapKeyColumn<T> length(Integer length)
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
    * @return the current instance of <code>MapKeyColumn<T></code> 
    */
   public MapKeyColumn<T> removeLength()
   {
      childNode.removeAttribute("length");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MapKeyColumn ElementName: xsd:int ElementType : precision
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>precision</code> attribute
    * @param precision the value for the attribute <code>precision</code> 
    * @return the current instance of <code>MapKeyColumn<T></code> 
    */
   public MapKeyColumn<T> precision(Integer precision)
   {
      childNode.attribute("precision", precision);
      return this;
   }

   /**
    * Returns the <code>precision</code> attribute
    * @return the value defined for the attribute <code>precision</code> 
    */
   public Integer getPrecision()
   {
      if(childNode.getAttribute("precision") != null && !childNode.getAttribute("precision").equals("null"))
      {
         return Integer.valueOf(childNode.getAttribute("precision"));
      }
      return null;
   }

   /**
    * Removes the <code>precision</code> attribute 
    * @return the current instance of <code>MapKeyColumn<T></code> 
    */
   public MapKeyColumn<T> removePrecision()
   {
      childNode.removeAttribute("precision");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MapKeyColumn ElementName: xsd:int ElementType : scale
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>scale</code> attribute
    * @param scale the value for the attribute <code>scale</code> 
    * @return the current instance of <code>MapKeyColumn<T></code> 
    */
   public MapKeyColumn<T> scale(Integer scale)
   {
      childNode.attribute("scale", scale);
      return this;
   }

   /**
    * Returns the <code>scale</code> attribute
    * @return the value defined for the attribute <code>scale</code> 
    */
   public Integer getScale()
   {
      if(childNode.getAttribute("scale") != null && !childNode.getAttribute("scale").equals("null"))
      {
         return Integer.valueOf(childNode.getAttribute("scale"));
      }
      return null;
   }

   /**
    * Removes the <code>scale</code> attribute 
    * @return the current instance of <code>MapKeyColumn<T></code> 
    */
   public MapKeyColumn<T> removeScale()
   {
      childNode.removeAttribute("scale");
      return this;
   }
}
