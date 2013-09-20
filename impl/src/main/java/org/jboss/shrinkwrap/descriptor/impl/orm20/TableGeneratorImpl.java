package org.jboss.shrinkwrap.descriptor.impl.orm20; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.orm20.TableGenerator;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.orm20.UniqueConstraint;
import org.jboss.shrinkwrap.descriptor.impl.orm20.UniqueConstraintImpl;

/**
 * This class implements the <code> table-generator </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class TableGeneratorImpl<T> implements Child<T>, TableGenerator<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public TableGeneratorImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public TableGeneratorImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TableGenerator ElementName: xsd:string ElementType : description
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>description</code> element
    * @param description the value for the element <code>description</code> 
    * @return the current instance of <code>TableGenerator<T></code> 
    */
   public TableGenerator<T> description(String description)
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
    * @return the current instance of <code>TableGenerator<T></code> 
    */
   public TableGenerator<T> removeDescription()
   {
      childNode.removeChildren("description");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TableGenerator ElementName: orm:unique-constraint ElementType : unique-constraint
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>unique-constraint</code> element will be created and returned.
    * Otherwise, the first existing <code>unique-constraint</code> element will be returned.
    * @return the instance defined for the element <code>unique-constraint</code> 
    */
   public UniqueConstraint<TableGenerator<T>> getOrCreateUniqueConstraint()
   {
      List<Node> nodeList = childNode.get("unique-constraint");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new UniqueConstraintImpl<TableGenerator<T>>(this, "unique-constraint", childNode, nodeList.get(0));
      }
      return createUniqueConstraint();
   }

   /**
    * Creates a new <code>unique-constraint</code> element 
    * @return the new created instance of <code>UniqueConstraint<TableGenerator<T>></code> 
    */
   public UniqueConstraint<TableGenerator<T>> createUniqueConstraint()
   {
      return new UniqueConstraintImpl<TableGenerator<T>>(this, "unique-constraint", childNode);
   }

   /**
    * Returns all <code>unique-constraint</code> elements
    * @return list of <code>unique-constraint</code> 
    */
   public List<UniqueConstraint<TableGenerator<T>>> getAllUniqueConstraint()
   {
      List<UniqueConstraint<TableGenerator<T>>> list = new ArrayList<UniqueConstraint<TableGenerator<T>>>();
      List<Node> nodeList = childNode.get("unique-constraint");
      for(Node node: nodeList)
      {
         UniqueConstraint<TableGenerator<T>>  type = new UniqueConstraintImpl<TableGenerator<T>>(this, "unique-constraint", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>unique-constraint</code> elements 
    * @return the current instance of <code>UniqueConstraint<TableGenerator<T>></code> 
    */
   public TableGenerator<T> removeAllUniqueConstraint()
   {
      childNode.removeChildren("unique-constraint");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TableGenerator ElementName: xsd:string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>TableGenerator<T></code> 
    */
   public TableGenerator<T> name(String name)
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
    * @return the current instance of <code>TableGenerator<T></code> 
    */
   public TableGenerator<T> removeName()
   {
      childNode.removeAttribute("name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TableGenerator ElementName: xsd:string ElementType : table
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>table</code> attribute
    * @param table the value for the attribute <code>table</code> 
    * @return the current instance of <code>TableGenerator<T></code> 
    */
   public TableGenerator<T> table(String table)
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
    * @return the current instance of <code>TableGenerator<T></code> 
    */
   public TableGenerator<T> removeTable()
   {
      childNode.removeAttribute("table");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TableGenerator ElementName: xsd:string ElementType : catalog
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>catalog</code> attribute
    * @param catalog the value for the attribute <code>catalog</code> 
    * @return the current instance of <code>TableGenerator<T></code> 
    */
   public TableGenerator<T> catalog(String catalog)
   {
      childNode.attribute("catalog", catalog);
      return this;
   }

   /**
    * Returns the <code>catalog</code> attribute
    * @return the value defined for the attribute <code>catalog</code> 
    */
      public String getCatalog()
   {
      return childNode.getAttribute("catalog");
   }

   /**
    * Removes the <code>catalog</code> attribute 
    * @return the current instance of <code>TableGenerator<T></code> 
    */
   public TableGenerator<T> removeCatalog()
   {
      childNode.removeAttribute("catalog");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TableGenerator ElementName: xsd:string ElementType : schema
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>schema</code> attribute
    * @param schema the value for the attribute <code>schema</code> 
    * @return the current instance of <code>TableGenerator<T></code> 
    */
   public TableGenerator<T> schema(String schema)
   {
      childNode.attribute("schema", schema);
      return this;
   }

   /**
    * Returns the <code>schema</code> attribute
    * @return the value defined for the attribute <code>schema</code> 
    */
      public String getSchema()
   {
      return childNode.getAttribute("schema");
   }

   /**
    * Removes the <code>schema</code> attribute 
    * @return the current instance of <code>TableGenerator<T></code> 
    */
   public TableGenerator<T> removeSchema()
   {
      childNode.removeAttribute("schema");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TableGenerator ElementName: xsd:string ElementType : pk-column-name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>pk-column-name</code> attribute
    * @param pkColumnName the value for the attribute <code>pk-column-name</code> 
    * @return the current instance of <code>TableGenerator<T></code> 
    */
   public TableGenerator<T> pkColumnName(String pkColumnName)
   {
      childNode.attribute("pk-column-name", pkColumnName);
      return this;
   }

   /**
    * Returns the <code>pk-column-name</code> attribute
    * @return the value defined for the attribute <code>pk-column-name</code> 
    */
      public String getPkColumnName()
   {
      return childNode.getAttribute("pk-column-name");
   }

   /**
    * Removes the <code>pk-column-name</code> attribute 
    * @return the current instance of <code>TableGenerator<T></code> 
    */
   public TableGenerator<T> removePkColumnName()
   {
      childNode.removeAttribute("pk-column-name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TableGenerator ElementName: xsd:string ElementType : value-column-name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>value-column-name</code> attribute
    * @param valueColumnName the value for the attribute <code>value-column-name</code> 
    * @return the current instance of <code>TableGenerator<T></code> 
    */
   public TableGenerator<T> valueColumnName(String valueColumnName)
   {
      childNode.attribute("value-column-name", valueColumnName);
      return this;
   }

   /**
    * Returns the <code>value-column-name</code> attribute
    * @return the value defined for the attribute <code>value-column-name</code> 
    */
      public String getValueColumnName()
   {
      return childNode.getAttribute("value-column-name");
   }

   /**
    * Removes the <code>value-column-name</code> attribute 
    * @return the current instance of <code>TableGenerator<T></code> 
    */
   public TableGenerator<T> removeValueColumnName()
   {
      childNode.removeAttribute("value-column-name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TableGenerator ElementName: xsd:string ElementType : pk-column-value
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>pk-column-value</code> attribute
    * @param pkColumnValue the value for the attribute <code>pk-column-value</code> 
    * @return the current instance of <code>TableGenerator<T></code> 
    */
   public TableGenerator<T> pkColumnValue(String pkColumnValue)
   {
      childNode.attribute("pk-column-value", pkColumnValue);
      return this;
   }

   /**
    * Returns the <code>pk-column-value</code> attribute
    * @return the value defined for the attribute <code>pk-column-value</code> 
    */
      public String getPkColumnValue()
   {
      return childNode.getAttribute("pk-column-value");
   }

   /**
    * Removes the <code>pk-column-value</code> attribute 
    * @return the current instance of <code>TableGenerator<T></code> 
    */
   public TableGenerator<T> removePkColumnValue()
   {
      childNode.removeAttribute("pk-column-value");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TableGenerator ElementName: xsd:int ElementType : initial-value
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>initial-value</code> attribute
    * @param initialValue the value for the attribute <code>initial-value</code> 
    * @return the current instance of <code>TableGenerator<T></code> 
    */
   public TableGenerator<T> initialValue(Integer initialValue)
   {
      childNode.attribute("initial-value", initialValue);
      return this;
   }

   /**
    * Returns the <code>initial-value</code> attribute
    * @return the value defined for the attribute <code>initial-value</code> 
    */
   public Integer getInitialValue()
   {
      if(childNode.getAttribute("initial-value") != null && !childNode.getAttribute("initial-value").equals("null"))
      {
         return Integer.valueOf(childNode.getAttribute("initial-value"));
      }
      return null;
   }

   /**
    * Removes the <code>initial-value</code> attribute 
    * @return the current instance of <code>TableGenerator<T></code> 
    */
   public TableGenerator<T> removeInitialValue()
   {
      childNode.removeAttribute("initial-value");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TableGenerator ElementName: xsd:int ElementType : allocation-size
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>allocation-size</code> attribute
    * @param allocationSize the value for the attribute <code>allocation-size</code> 
    * @return the current instance of <code>TableGenerator<T></code> 
    */
   public TableGenerator<T> allocationSize(Integer allocationSize)
   {
      childNode.attribute("allocation-size", allocationSize);
      return this;
   }

   /**
    * Returns the <code>allocation-size</code> attribute
    * @return the value defined for the attribute <code>allocation-size</code> 
    */
   public Integer getAllocationSize()
   {
      if(childNode.getAttribute("allocation-size") != null && !childNode.getAttribute("allocation-size").equals("null"))
      {
         return Integer.valueOf(childNode.getAttribute("allocation-size"));
      }
      return null;
   }

   /**
    * Removes the <code>allocation-size</code> attribute 
    * @return the current instance of <code>TableGenerator<T></code> 
    */
   public TableGenerator<T> removeAllocationSize()
   {
      childNode.removeAttribute("allocation-size");
      return this;
   }
}
