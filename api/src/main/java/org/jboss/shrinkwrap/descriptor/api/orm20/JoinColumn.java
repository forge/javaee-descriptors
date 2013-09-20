package org.jboss.shrinkwrap.descriptor.api.orm20; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> join-column </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface JoinColumn<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JoinColumn ElementName: xsd:string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>JoinColumn<T></code> 
    */
   public JoinColumn<T> name(String name);

   /**
    * Returns the <code>name</code> attribute
    * @return the value defined for the attribute <code>name</code> 
    */
   public String getName();

   /**
    * Removes the <code>name</code> attribute 
    * @return the current instance of <code>JoinColumn<T></code> 
    */
   public JoinColumn<T> removeName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JoinColumn ElementName: xsd:string ElementType : referenced-column-name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>referenced-column-name</code> attribute
    * @param referencedColumnName the value for the attribute <code>referenced-column-name</code> 
    * @return the current instance of <code>JoinColumn<T></code> 
    */
   public JoinColumn<T> referencedColumnName(String referencedColumnName);

   /**
    * Returns the <code>referenced-column-name</code> attribute
    * @return the value defined for the attribute <code>referenced-column-name</code> 
    */
   public String getReferencedColumnName();

   /**
    * Removes the <code>referenced-column-name</code> attribute 
    * @return the current instance of <code>JoinColumn<T></code> 
    */
   public JoinColumn<T> removeReferencedColumnName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JoinColumn ElementName: xsd:boolean ElementType : unique
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>unique</code> attribute
    * @param unique the value for the attribute <code>unique</code> 
    * @return the current instance of <code>JoinColumn<T></code> 
    */
   public JoinColumn<T> unique(Boolean unique);

   /**
    * Returns the <code>unique</code> attribute
    * @return the value defined for the attribute <code>unique</code> 
    */
public Boolean isUnique();

   /**
    * Removes the <code>unique</code> attribute 
    * @return the current instance of <code>JoinColumn<T></code> 
    */
   public JoinColumn<T> removeUnique();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JoinColumn ElementName: xsd:boolean ElementType : nullable
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>nullable</code> attribute
    * @param nullable the value for the attribute <code>nullable</code> 
    * @return the current instance of <code>JoinColumn<T></code> 
    */
   public JoinColumn<T> nullable(Boolean nullable);

   /**
    * Returns the <code>nullable</code> attribute
    * @return the value defined for the attribute <code>nullable</code> 
    */
public Boolean isNullable();

   /**
    * Removes the <code>nullable</code> attribute 
    * @return the current instance of <code>JoinColumn<T></code> 
    */
   public JoinColumn<T> removeNullable();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JoinColumn ElementName: xsd:boolean ElementType : insertable
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>insertable</code> attribute
    * @param insertable the value for the attribute <code>insertable</code> 
    * @return the current instance of <code>JoinColumn<T></code> 
    */
   public JoinColumn<T> insertable(Boolean insertable);

   /**
    * Returns the <code>insertable</code> attribute
    * @return the value defined for the attribute <code>insertable</code> 
    */
public Boolean isInsertable();

   /**
    * Removes the <code>insertable</code> attribute 
    * @return the current instance of <code>JoinColumn<T></code> 
    */
   public JoinColumn<T> removeInsertable();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JoinColumn ElementName: xsd:boolean ElementType : updatable
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>updatable</code> attribute
    * @param updatable the value for the attribute <code>updatable</code> 
    * @return the current instance of <code>JoinColumn<T></code> 
    */
   public JoinColumn<T> updatable(Boolean updatable);

   /**
    * Returns the <code>updatable</code> attribute
    * @return the value defined for the attribute <code>updatable</code> 
    */
public Boolean isUpdatable();

   /**
    * Removes the <code>updatable</code> attribute 
    * @return the current instance of <code>JoinColumn<T></code> 
    */
   public JoinColumn<T> removeUpdatable();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JoinColumn ElementName: xsd:string ElementType : column-definition
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>column-definition</code> attribute
    * @param columnDefinition the value for the attribute <code>column-definition</code> 
    * @return the current instance of <code>JoinColumn<T></code> 
    */
   public JoinColumn<T> columnDefinition(String columnDefinition);

   /**
    * Returns the <code>column-definition</code> attribute
    * @return the value defined for the attribute <code>column-definition</code> 
    */
   public String getColumnDefinition();

   /**
    * Removes the <code>column-definition</code> attribute 
    * @return the current instance of <code>JoinColumn<T></code> 
    */
   public JoinColumn<T> removeColumnDefinition();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JoinColumn ElementName: xsd:string ElementType : table
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>table</code> attribute
    * @param table the value for the attribute <code>table</code> 
    * @return the current instance of <code>JoinColumn<T></code> 
    */
   public JoinColumn<T> table(String table);

   /**
    * Returns the <code>table</code> attribute
    * @return the value defined for the attribute <code>table</code> 
    */
   public String getTable();

   /**
    * Removes the <code>table</code> attribute 
    * @return the current instance of <code>JoinColumn<T></code> 
    */
   public JoinColumn<T> removeTable();
}
