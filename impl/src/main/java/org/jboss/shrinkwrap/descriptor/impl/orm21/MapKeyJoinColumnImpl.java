package org.jboss.shrinkwrap.descriptor.impl.orm21; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.orm21.MapKeyJoinColumn;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> map-key-join-column </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class MapKeyJoinColumnImpl<T> implements Child<T>, MapKeyJoinColumn<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public MapKeyJoinColumnImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public MapKeyJoinColumnImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MapKeyJoinColumn ElementName: xsd:string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>MapKeyJoinColumn<T></code> 
    */
   public MapKeyJoinColumn<T> name(String name)
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
    * @return the current instance of <code>MapKeyJoinColumn<T></code> 
    */
   public MapKeyJoinColumn<T> removeName()
   {
      childNode.removeAttribute("name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MapKeyJoinColumn ElementName: xsd:string ElementType : referenced-column-name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>referenced-column-name</code> attribute
    * @param referencedColumnName the value for the attribute <code>referenced-column-name</code> 
    * @return the current instance of <code>MapKeyJoinColumn<T></code> 
    */
   public MapKeyJoinColumn<T> referencedColumnName(String referencedColumnName)
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
    * @return the current instance of <code>MapKeyJoinColumn<T></code> 
    */
   public MapKeyJoinColumn<T> removeReferencedColumnName()
   {
      childNode.removeAttribute("referenced-column-name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MapKeyJoinColumn ElementName: xsd:boolean ElementType : unique
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>unique</code> attribute
    * @param unique the value for the attribute <code>unique</code> 
    * @return the current instance of <code>MapKeyJoinColumn<T></code> 
    */
   public MapKeyJoinColumn<T> unique(Boolean unique)
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
    * @return the current instance of <code>MapKeyJoinColumn<T></code> 
    */
   public MapKeyJoinColumn<T> removeUnique()
   {
      childNode.removeAttribute("unique");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MapKeyJoinColumn ElementName: xsd:boolean ElementType : nullable
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>nullable</code> attribute
    * @param nullable the value for the attribute <code>nullable</code> 
    * @return the current instance of <code>MapKeyJoinColumn<T></code> 
    */
   public MapKeyJoinColumn<T> nullable(Boolean nullable)
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
    * @return the current instance of <code>MapKeyJoinColumn<T></code> 
    */
   public MapKeyJoinColumn<T> removeNullable()
   {
      childNode.removeAttribute("nullable");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MapKeyJoinColumn ElementName: xsd:boolean ElementType : insertable
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>insertable</code> attribute
    * @param insertable the value for the attribute <code>insertable</code> 
    * @return the current instance of <code>MapKeyJoinColumn<T></code> 
    */
   public MapKeyJoinColumn<T> insertable(Boolean insertable)
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
    * @return the current instance of <code>MapKeyJoinColumn<T></code> 
    */
   public MapKeyJoinColumn<T> removeInsertable()
   {
      childNode.removeAttribute("insertable");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MapKeyJoinColumn ElementName: xsd:boolean ElementType : updatable
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>updatable</code> attribute
    * @param updatable the value for the attribute <code>updatable</code> 
    * @return the current instance of <code>MapKeyJoinColumn<T></code> 
    */
   public MapKeyJoinColumn<T> updatable(Boolean updatable)
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
    * @return the current instance of <code>MapKeyJoinColumn<T></code> 
    */
   public MapKeyJoinColumn<T> removeUpdatable()
   {
      childNode.removeAttribute("updatable");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MapKeyJoinColumn ElementName: xsd:string ElementType : column-definition
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>column-definition</code> attribute
    * @param columnDefinition the value for the attribute <code>column-definition</code> 
    * @return the current instance of <code>MapKeyJoinColumn<T></code> 
    */
   public MapKeyJoinColumn<T> columnDefinition(String columnDefinition)
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
    * @return the current instance of <code>MapKeyJoinColumn<T></code> 
    */
   public MapKeyJoinColumn<T> removeColumnDefinition()
   {
      childNode.removeAttribute("column-definition");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MapKeyJoinColumn ElementName: xsd:string ElementType : table
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>table</code> attribute
    * @param table the value for the attribute <code>table</code> 
    * @return the current instance of <code>MapKeyJoinColumn<T></code> 
    */
   public MapKeyJoinColumn<T> table(String table)
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
    * @return the current instance of <code>MapKeyJoinColumn<T></code> 
    */
   public MapKeyJoinColumn<T> removeTable()
   {
      childNode.removeAttribute("table");
      return this;
   }
}
