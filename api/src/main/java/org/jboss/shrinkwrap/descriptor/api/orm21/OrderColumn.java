package org.jboss.shrinkwrap.descriptor.api.orm21; 

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> order-column </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface OrderColumn<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OrderColumn ElementName: xsd:string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>OrderColumn<T></code> 
    */
   public OrderColumn<T> name(String name);

   /**
    * Returns the <code>name</code> attribute
    * @return the value defined for the attribute <code>name</code> 
    */
   public String getName();

   /**
    * Removes the <code>name</code> attribute 
    * @return the current instance of <code>OrderColumn<T></code> 
    */
   public OrderColumn<T> removeName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OrderColumn ElementName: xsd:boolean ElementType : nullable
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>nullable</code> attribute
    * @param nullable the value for the attribute <code>nullable</code> 
    * @return the current instance of <code>OrderColumn<T></code> 
    */
   public OrderColumn<T> nullable(Boolean nullable);

   /**
    * Returns the <code>nullable</code> attribute
    * @return the value defined for the attribute <code>nullable</code> 
    */
public Boolean isNullable();

   /**
    * Removes the <code>nullable</code> attribute 
    * @return the current instance of <code>OrderColumn<T></code> 
    */
   public OrderColumn<T> removeNullable();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OrderColumn ElementName: xsd:boolean ElementType : insertable
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>insertable</code> attribute
    * @param insertable the value for the attribute <code>insertable</code> 
    * @return the current instance of <code>OrderColumn<T></code> 
    */
   public OrderColumn<T> insertable(Boolean insertable);

   /**
    * Returns the <code>insertable</code> attribute
    * @return the value defined for the attribute <code>insertable</code> 
    */
public Boolean isInsertable();

   /**
    * Removes the <code>insertable</code> attribute 
    * @return the current instance of <code>OrderColumn<T></code> 
    */
   public OrderColumn<T> removeInsertable();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OrderColumn ElementName: xsd:boolean ElementType : updatable
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>updatable</code> attribute
    * @param updatable the value for the attribute <code>updatable</code> 
    * @return the current instance of <code>OrderColumn<T></code> 
    */
   public OrderColumn<T> updatable(Boolean updatable);

   /**
    * Returns the <code>updatable</code> attribute
    * @return the value defined for the attribute <code>updatable</code> 
    */
public Boolean isUpdatable();

   /**
    * Removes the <code>updatable</code> attribute 
    * @return the current instance of <code>OrderColumn<T></code> 
    */
   public OrderColumn<T> removeUpdatable();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OrderColumn ElementName: xsd:string ElementType : column-definition
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>column-definition</code> attribute
    * @param columnDefinition the value for the attribute <code>column-definition</code> 
    * @return the current instance of <code>OrderColumn<T></code> 
    */
   public OrderColumn<T> columnDefinition(String columnDefinition);

   /**
    * Returns the <code>column-definition</code> attribute
    * @return the value defined for the attribute <code>column-definition</code> 
    */
   public String getColumnDefinition();

   /**
    * Removes the <code>column-definition</code> attribute 
    * @return the current instance of <code>OrderColumn<T></code> 
    */
   public OrderColumn<T> removeColumnDefinition();
}
