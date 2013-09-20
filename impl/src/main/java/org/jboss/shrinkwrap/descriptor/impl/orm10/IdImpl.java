package org.jboss.shrinkwrap.descriptor.impl.orm10; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.orm10.Column;
import org.jboss.shrinkwrap.descriptor.api.orm10.GeneratedValue;
import org.jboss.shrinkwrap.descriptor.api.orm10.Id;
import org.jboss.shrinkwrap.descriptor.api.orm10.SequenceGenerator;
import org.jboss.shrinkwrap.descriptor.api.orm10.TableGenerator;
import org.jboss.shrinkwrap.descriptor.api.orm10.TemporalType;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> id </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class IdImpl<T> implements Child<T>, Id<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public IdImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public IdImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Id ElementName: orm:column ElementType : column
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>column</code> element with the given value will be created.
    * Otherwise, the existing <code>column</code> element will be returned.
    * @return  a new or existing instance of <code>Column<Id<T>></code> 
    */
   public Column<Id<T>> getOrCreateColumn()
   {
      Node node = childNode.getOrCreate("column");
      Column<Id<T>> column = new ColumnImpl<Id<T>>(this, "column", childNode, node);
      return column;
   }

   /**
    * Removes the <code>column</code> element 
    * @return the current instance of <code>Id<T></code> 
    */
   public Id<T> removeColumn()
   {
      childNode.removeChildren("column");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Id ElementName: orm:generated-value ElementType : generated-value
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>generated-value</code> element with the given value will be created.
    * Otherwise, the existing <code>generated-value</code> element will be returned.
    * @return  a new or existing instance of <code>GeneratedValue<Id<T>></code> 
    */
   public GeneratedValue<Id<T>> getOrCreateGeneratedValue()
   {
      Node node = childNode.getOrCreate("generated-value");
      GeneratedValue<Id<T>> generatedValue = new GeneratedValueImpl<Id<T>>(this, "generated-value", childNode, node);
      return generatedValue;
   }

   /**
    * Removes the <code>generated-value</code> element 
    * @return the current instance of <code>Id<T></code> 
    */
   public Id<T> removeGeneratedValue()
   {
      childNode.removeChildren("generated-value");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Id ElementName: orm:temporal-type ElementType : temporal
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>temporal</code> element
    * @param temporal the value for the element <code>temporal</code> 
    * @return the current instance of <code>Id<T></code> 
    */
   public Id<T> temporal(TemporalType temporal)
   {
      childNode.getOrCreate("temporal").text(temporal);
      return this;
   }
   /**
    * Sets the <code>temporal</code> element
    * @param temporal the value for the element <code>temporal</code> 
    * @return the current instance of <code>Id<T></code> 
    */
   public Id<T> temporal(String temporal)
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
    * @return the current instance of <code>Id<T></code> 
    */
   public Id<T> removeTemporal()
   {
      childNode.removeAttribute("temporal");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Id ElementName: orm:table-generator ElementType : table-generator
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>table-generator</code> element with the given value will be created.
    * Otherwise, the existing <code>table-generator</code> element will be returned.
    * @return  a new or existing instance of <code>TableGenerator<Id<T>></code> 
    */
   public TableGenerator<Id<T>> getOrCreateTableGenerator()
   {
      Node node = childNode.getOrCreate("table-generator");
      TableGenerator<Id<T>> tableGenerator = new TableGeneratorImpl<Id<T>>(this, "table-generator", childNode, node);
      return tableGenerator;
   }

   /**
    * Removes the <code>table-generator</code> element 
    * @return the current instance of <code>Id<T></code> 
    */
   public Id<T> removeTableGenerator()
   {
      childNode.removeChildren("table-generator");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Id ElementName: orm:sequence-generator ElementType : sequence-generator
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>sequence-generator</code> element with the given value will be created.
    * Otherwise, the existing <code>sequence-generator</code> element will be returned.
    * @return  a new or existing instance of <code>SequenceGenerator<Id<T>></code> 
    */
   public SequenceGenerator<Id<T>> getOrCreateSequenceGenerator()
   {
      Node node = childNode.getOrCreate("sequence-generator");
      SequenceGenerator<Id<T>> sequenceGenerator = new SequenceGeneratorImpl<Id<T>>(this, "sequence-generator", childNode, node);
      return sequenceGenerator;
   }

   /**
    * Removes the <code>sequence-generator</code> element 
    * @return the current instance of <code>Id<T></code> 
    */
   public Id<T> removeSequenceGenerator()
   {
      childNode.removeChildren("sequence-generator");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Id ElementName: xsd:string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>Id<T></code> 
    */
   public Id<T> name(String name)
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
    * @return the current instance of <code>Id<T></code> 
    */
   public Id<T> removeName()
   {
      childNode.removeAttribute("name");
      return this;
   }
}
