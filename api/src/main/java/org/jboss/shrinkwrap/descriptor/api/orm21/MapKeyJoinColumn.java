package org.jboss.shrinkwrap.descriptor.api.orm21; 

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> map-key-join-column </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface MapKeyJoinColumn<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MapKeyJoinColumn ElementName: xsd:string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>MapKeyJoinColumn<T></code> 
    */
   public MapKeyJoinColumn<T> name(String name);

   /**
    * Returns the <code>name</code> attribute
    * @return the value defined for the attribute <code>name</code> 
    */
   public String getName();

   /**
    * Removes the <code>name</code> attribute 
    * @return the current instance of <code>MapKeyJoinColumn<T></code> 
    */
   public MapKeyJoinColumn<T> removeName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MapKeyJoinColumn ElementName: xsd:string ElementType : referenced-column-name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>referenced-column-name</code> attribute
    * @param referencedColumnName the value for the attribute <code>referenced-column-name</code> 
    * @return the current instance of <code>MapKeyJoinColumn<T></code> 
    */
   public MapKeyJoinColumn<T> referencedColumnName(String referencedColumnName);

   /**
    * Returns the <code>referenced-column-name</code> attribute
    * @return the value defined for the attribute <code>referenced-column-name</code> 
    */
   public String getReferencedColumnName();

   /**
    * Removes the <code>referenced-column-name</code> attribute 
    * @return the current instance of <code>MapKeyJoinColumn<T></code> 
    */
   public MapKeyJoinColumn<T> removeReferencedColumnName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MapKeyJoinColumn ElementName: xsd:boolean ElementType : unique
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>unique</code> attribute
    * @param unique the value for the attribute <code>unique</code> 
    * @return the current instance of <code>MapKeyJoinColumn<T></code> 
    */
   public MapKeyJoinColumn<T> unique(Boolean unique);

   /**
    * Returns the <code>unique</code> attribute
    * @return the value defined for the attribute <code>unique</code> 
    */
public Boolean isUnique();

   /**
    * Removes the <code>unique</code> attribute 
    * @return the current instance of <code>MapKeyJoinColumn<T></code> 
    */
   public MapKeyJoinColumn<T> removeUnique();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MapKeyJoinColumn ElementName: xsd:boolean ElementType : nullable
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>nullable</code> attribute
    * @param nullable the value for the attribute <code>nullable</code> 
    * @return the current instance of <code>MapKeyJoinColumn<T></code> 
    */
   public MapKeyJoinColumn<T> nullable(Boolean nullable);

   /**
    * Returns the <code>nullable</code> attribute
    * @return the value defined for the attribute <code>nullable</code> 
    */
public Boolean isNullable();

   /**
    * Removes the <code>nullable</code> attribute 
    * @return the current instance of <code>MapKeyJoinColumn<T></code> 
    */
   public MapKeyJoinColumn<T> removeNullable();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MapKeyJoinColumn ElementName: xsd:boolean ElementType : insertable
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>insertable</code> attribute
    * @param insertable the value for the attribute <code>insertable</code> 
    * @return the current instance of <code>MapKeyJoinColumn<T></code> 
    */
   public MapKeyJoinColumn<T> insertable(Boolean insertable);

   /**
    * Returns the <code>insertable</code> attribute
    * @return the value defined for the attribute <code>insertable</code> 
    */
public Boolean isInsertable();

   /**
    * Removes the <code>insertable</code> attribute 
    * @return the current instance of <code>MapKeyJoinColumn<T></code> 
    */
   public MapKeyJoinColumn<T> removeInsertable();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MapKeyJoinColumn ElementName: xsd:boolean ElementType : updatable
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>updatable</code> attribute
    * @param updatable the value for the attribute <code>updatable</code> 
    * @return the current instance of <code>MapKeyJoinColumn<T></code> 
    */
   public MapKeyJoinColumn<T> updatable(Boolean updatable);

   /**
    * Returns the <code>updatable</code> attribute
    * @return the value defined for the attribute <code>updatable</code> 
    */
public Boolean isUpdatable();

   /**
    * Removes the <code>updatable</code> attribute 
    * @return the current instance of <code>MapKeyJoinColumn<T></code> 
    */
   public MapKeyJoinColumn<T> removeUpdatable();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MapKeyJoinColumn ElementName: xsd:string ElementType : column-definition
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>column-definition</code> attribute
    * @param columnDefinition the value for the attribute <code>column-definition</code> 
    * @return the current instance of <code>MapKeyJoinColumn<T></code> 
    */
   public MapKeyJoinColumn<T> columnDefinition(String columnDefinition);

   /**
    * Returns the <code>column-definition</code> attribute
    * @return the value defined for the attribute <code>column-definition</code> 
    */
   public String getColumnDefinition();

   /**
    * Removes the <code>column-definition</code> attribute 
    * @return the current instance of <code>MapKeyJoinColumn<T></code> 
    */
   public MapKeyJoinColumn<T> removeColumnDefinition();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MapKeyJoinColumn ElementName: xsd:string ElementType : table
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>table</code> attribute
    * @param table the value for the attribute <code>table</code> 
    * @return the current instance of <code>MapKeyJoinColumn<T></code> 
    */
   public MapKeyJoinColumn<T> table(String table);

   /**
    * Returns the <code>table</code> attribute
    * @return the value defined for the attribute <code>table</code> 
    */
   public String getTable();

   /**
    * Removes the <code>table</code> attribute 
    * @return the current instance of <code>MapKeyJoinColumn<T></code> 
    */
   public MapKeyJoinColumn<T> removeTable();
}
