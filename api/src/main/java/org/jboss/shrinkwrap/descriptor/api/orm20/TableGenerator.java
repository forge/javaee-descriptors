package org.jboss.shrinkwrap.descriptor.api.orm20; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.orm20.UniqueConstraint;
/**
 * This interface defines the contract for the <code> table-generator </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface TableGenerator<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TableGenerator ElementName: xsd:string ElementType : description
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>description</code> element
    * @param description the value for the element <code>description</code> 
    * @return the current instance of <code>TableGenerator<T></code> 
    */
   public TableGenerator<T> description(String description);

   /**
    * Returns the <code>description</code> element
    * @return the node defined for the element <code>description</code> 
    */
   public String getDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>TableGenerator<T></code> 
    */
   public TableGenerator<T> removeDescription();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TableGenerator ElementName: orm:unique-constraint ElementType : unique-constraint
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>unique-constraint</code> element will be created and returned.
    * Otherwise, the first existing <code>unique-constraint</code> element will be returned.
    * @return the instance defined for the element <code>unique-constraint</code> 
    */
   public UniqueConstraint<TableGenerator<T>> getOrCreateUniqueConstraint();

   /**
    * Creates a new <code>unique-constraint</code> element 
    * @return the new created instance of <code>UniqueConstraint<TableGenerator<T>></code> 
    */
   public UniqueConstraint<TableGenerator<T>> createUniqueConstraint();

   /**
    * Returns all <code>unique-constraint</code> elements
    * @return list of <code>unique-constraint</code> 
    */
   public List<UniqueConstraint<TableGenerator<T>>> getAllUniqueConstraint();

   /**
    * Removes all <code>unique-constraint</code> elements 
    * @return the current instance of <code>UniqueConstraint<TableGenerator<T>></code> 
    */
   public TableGenerator<T> removeAllUniqueConstraint();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TableGenerator ElementName: xsd:string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>TableGenerator<T></code> 
    */
   public TableGenerator<T> name(String name);

   /**
    * Returns the <code>name</code> attribute
    * @return the value defined for the attribute <code>name</code> 
    */
   public String getName();

   /**
    * Removes the <code>name</code> attribute 
    * @return the current instance of <code>TableGenerator<T></code> 
    */
   public TableGenerator<T> removeName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TableGenerator ElementName: xsd:string ElementType : table
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>table</code> attribute
    * @param table the value for the attribute <code>table</code> 
    * @return the current instance of <code>TableGenerator<T></code> 
    */
   public TableGenerator<T> table(String table);

   /**
    * Returns the <code>table</code> attribute
    * @return the value defined for the attribute <code>table</code> 
    */
   public String getTable();

   /**
    * Removes the <code>table</code> attribute 
    * @return the current instance of <code>TableGenerator<T></code> 
    */
   public TableGenerator<T> removeTable();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TableGenerator ElementName: xsd:string ElementType : catalog
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>catalog</code> attribute
    * @param catalog the value for the attribute <code>catalog</code> 
    * @return the current instance of <code>TableGenerator<T></code> 
    */
   public TableGenerator<T> catalog(String catalog);

   /**
    * Returns the <code>catalog</code> attribute
    * @return the value defined for the attribute <code>catalog</code> 
    */
   public String getCatalog();

   /**
    * Removes the <code>catalog</code> attribute 
    * @return the current instance of <code>TableGenerator<T></code> 
    */
   public TableGenerator<T> removeCatalog();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TableGenerator ElementName: xsd:string ElementType : schema
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>schema</code> attribute
    * @param schema the value for the attribute <code>schema</code> 
    * @return the current instance of <code>TableGenerator<T></code> 
    */
   public TableGenerator<T> schema(String schema);

   /**
    * Returns the <code>schema</code> attribute
    * @return the value defined for the attribute <code>schema</code> 
    */
   public String getSchema();

   /**
    * Removes the <code>schema</code> attribute 
    * @return the current instance of <code>TableGenerator<T></code> 
    */
   public TableGenerator<T> removeSchema();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TableGenerator ElementName: xsd:string ElementType : pk-column-name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>pk-column-name</code> attribute
    * @param pkColumnName the value for the attribute <code>pk-column-name</code> 
    * @return the current instance of <code>TableGenerator<T></code> 
    */
   public TableGenerator<T> pkColumnName(String pkColumnName);

   /**
    * Returns the <code>pk-column-name</code> attribute
    * @return the value defined for the attribute <code>pk-column-name</code> 
    */
   public String getPkColumnName();

   /**
    * Removes the <code>pk-column-name</code> attribute 
    * @return the current instance of <code>TableGenerator<T></code> 
    */
   public TableGenerator<T> removePkColumnName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TableGenerator ElementName: xsd:string ElementType : value-column-name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>value-column-name</code> attribute
    * @param valueColumnName the value for the attribute <code>value-column-name</code> 
    * @return the current instance of <code>TableGenerator<T></code> 
    */
   public TableGenerator<T> valueColumnName(String valueColumnName);

   /**
    * Returns the <code>value-column-name</code> attribute
    * @return the value defined for the attribute <code>value-column-name</code> 
    */
   public String getValueColumnName();

   /**
    * Removes the <code>value-column-name</code> attribute 
    * @return the current instance of <code>TableGenerator<T></code> 
    */
   public TableGenerator<T> removeValueColumnName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TableGenerator ElementName: xsd:string ElementType : pk-column-value
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>pk-column-value</code> attribute
    * @param pkColumnValue the value for the attribute <code>pk-column-value</code> 
    * @return the current instance of <code>TableGenerator<T></code> 
    */
   public TableGenerator<T> pkColumnValue(String pkColumnValue);

   /**
    * Returns the <code>pk-column-value</code> attribute
    * @return the value defined for the attribute <code>pk-column-value</code> 
    */
   public String getPkColumnValue();

   /**
    * Removes the <code>pk-column-value</code> attribute 
    * @return the current instance of <code>TableGenerator<T></code> 
    */
   public TableGenerator<T> removePkColumnValue();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TableGenerator ElementName: xsd:int ElementType : initial-value
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>initial-value</code> attribute
    * @param initialValue the value for the attribute <code>initial-value</code> 
    * @return the current instance of <code>TableGenerator<T></code> 
    */
   public TableGenerator<T> initialValue(Integer initialValue);

   /**
    * Returns the <code>initial-value</code> attribute
    * @return the value defined for the attribute <code>initial-value</code> 
    */
public Integer getInitialValue();

   /**
    * Removes the <code>initial-value</code> attribute 
    * @return the current instance of <code>TableGenerator<T></code> 
    */
   public TableGenerator<T> removeInitialValue();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TableGenerator ElementName: xsd:int ElementType : allocation-size
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>allocation-size</code> attribute
    * @param allocationSize the value for the attribute <code>allocation-size</code> 
    * @return the current instance of <code>TableGenerator<T></code> 
    */
   public TableGenerator<T> allocationSize(Integer allocationSize);

   /**
    * Returns the <code>allocation-size</code> attribute
    * @return the value defined for the attribute <code>allocation-size</code> 
    */
public Integer getAllocationSize();

   /**
    * Removes the <code>allocation-size</code> attribute 
    * @return the current instance of <code>TableGenerator<T></code> 
    */
   public TableGenerator<T> removeAllocationSize();
}
