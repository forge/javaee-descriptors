package org.jboss.shrinkwrap.descriptor.api.orm21; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> column </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface Column<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Column ElementName: xsd:string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>Column<T></code> 
    */
   public Column<T> name(String name);

   /**
    * Returns the <code>name</code> attribute
    * @return the value defined for the attribute <code>name</code> 
    */
   public String getName();

   /**
    * Removes the <code>name</code> attribute 
    * @return the current instance of <code>Column<T></code> 
    */
   public Column<T> removeName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Column ElementName: xsd:boolean ElementType : unique
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>unique</code> attribute
    * @param unique the value for the attribute <code>unique</code> 
    * @return the current instance of <code>Column<T></code> 
    */
   public Column<T> unique(Boolean unique);

   /**
    * Returns the <code>unique</code> attribute
    * @return the value defined for the attribute <code>unique</code> 
    */
public Boolean isUnique();

   /**
    * Removes the <code>unique</code> attribute 
    * @return the current instance of <code>Column<T></code> 
    */
   public Column<T> removeUnique();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Column ElementName: xsd:boolean ElementType : nullable
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>nullable</code> attribute
    * @param nullable the value for the attribute <code>nullable</code> 
    * @return the current instance of <code>Column<T></code> 
    */
   public Column<T> nullable(Boolean nullable);

   /**
    * Returns the <code>nullable</code> attribute
    * @return the value defined for the attribute <code>nullable</code> 
    */
public Boolean isNullable();

   /**
    * Removes the <code>nullable</code> attribute 
    * @return the current instance of <code>Column<T></code> 
    */
   public Column<T> removeNullable();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Column ElementName: xsd:boolean ElementType : insertable
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>insertable</code> attribute
    * @param insertable the value for the attribute <code>insertable</code> 
    * @return the current instance of <code>Column<T></code> 
    */
   public Column<T> insertable(Boolean insertable);

   /**
    * Returns the <code>insertable</code> attribute
    * @return the value defined for the attribute <code>insertable</code> 
    */
public Boolean isInsertable();

   /**
    * Removes the <code>insertable</code> attribute 
    * @return the current instance of <code>Column<T></code> 
    */
   public Column<T> removeInsertable();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Column ElementName: xsd:boolean ElementType : updatable
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>updatable</code> attribute
    * @param updatable the value for the attribute <code>updatable</code> 
    * @return the current instance of <code>Column<T></code> 
    */
   public Column<T> updatable(Boolean updatable);

   /**
    * Returns the <code>updatable</code> attribute
    * @return the value defined for the attribute <code>updatable</code> 
    */
public Boolean isUpdatable();

   /**
    * Removes the <code>updatable</code> attribute 
    * @return the current instance of <code>Column<T></code> 
    */
   public Column<T> removeUpdatable();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Column ElementName: xsd:string ElementType : column-definition
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>column-definition</code> attribute
    * @param columnDefinition the value for the attribute <code>column-definition</code> 
    * @return the current instance of <code>Column<T></code> 
    */
   public Column<T> columnDefinition(String columnDefinition);

   /**
    * Returns the <code>column-definition</code> attribute
    * @return the value defined for the attribute <code>column-definition</code> 
    */
   public String getColumnDefinition();

   /**
    * Removes the <code>column-definition</code> attribute 
    * @return the current instance of <code>Column<T></code> 
    */
   public Column<T> removeColumnDefinition();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Column ElementName: xsd:string ElementType : table
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>table</code> attribute
    * @param table the value for the attribute <code>table</code> 
    * @return the current instance of <code>Column<T></code> 
    */
   public Column<T> table(String table);

   /**
    * Returns the <code>table</code> attribute
    * @return the value defined for the attribute <code>table</code> 
    */
   public String getTable();

   /**
    * Removes the <code>table</code> attribute 
    * @return the current instance of <code>Column<T></code> 
    */
   public Column<T> removeTable();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Column ElementName: xsd:int ElementType : length
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>length</code> attribute
    * @param length the value for the attribute <code>length</code> 
    * @return the current instance of <code>Column<T></code> 
    */
   public Column<T> length(Integer length);

   /**
    * Returns the <code>length</code> attribute
    * @return the value defined for the attribute <code>length</code> 
    */
public Integer getLength();

   /**
    * Removes the <code>length</code> attribute 
    * @return the current instance of <code>Column<T></code> 
    */
   public Column<T> removeLength();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Column ElementName: xsd:int ElementType : precision
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>precision</code> attribute
    * @param precision the value for the attribute <code>precision</code> 
    * @return the current instance of <code>Column<T></code> 
    */
   public Column<T> precision(Integer precision);

   /**
    * Returns the <code>precision</code> attribute
    * @return the value defined for the attribute <code>precision</code> 
    */
public Integer getPrecision();

   /**
    * Removes the <code>precision</code> attribute 
    * @return the current instance of <code>Column<T></code> 
    */
   public Column<T> removePrecision();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Column ElementName: xsd:int ElementType : scale
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>scale</code> attribute
    * @param scale the value for the attribute <code>scale</code> 
    * @return the current instance of <code>Column<T></code> 
    */
   public Column<T> scale(Integer scale);

   /**
    * Returns the <code>scale</code> attribute
    * @return the value defined for the attribute <code>scale</code> 
    */
public Integer getScale();

   /**
    * Removes the <code>scale</code> attribute 
    * @return the current instance of <code>Column<T></code> 
    */
   public Column<T> removeScale();
}
