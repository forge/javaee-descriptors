package org.jboss.shrinkwrap.descriptor.api.orm20; 

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> id </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface Id<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Id ElementName: orm:column ElementType : column
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>column</code> element with the given value will be created.
    * Otherwise, the existing <code>column</code> element will be returned.
    * @return  a new or existing instance of <code>Column<Id<T>></code> 
    */
   public Column<Id<T>> getOrCreateColumn();

   /**
    * Removes the <code>column</code> element 
    * @return the current instance of <code>Id<T></code> 
    */
   public Id<T> removeColumn();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Id ElementName: orm:generated-value ElementType : generated-value
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>generated-value</code> element with the given value will be created.
    * Otherwise, the existing <code>generated-value</code> element will be returned.
    * @return  a new or existing instance of <code>GeneratedValue<Id<T>></code> 
    */
   public GeneratedValue<Id<T>> getOrCreateGeneratedValue();

   /**
    * Removes the <code>generated-value</code> element 
    * @return the current instance of <code>Id<T></code> 
    */
   public Id<T> removeGeneratedValue();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Id ElementName: orm:temporal-type ElementType : temporal
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>temporal</code> element
    * @param temporal the value for the element <code>temporal</code> 
    * @return the current instance of <code>Id<T></code> 
    */
   public Id<T> temporal(TemporalType temporal);
   /**
    * Sets the <code>temporal</code> element
    * @param temporal the value for the element <code>temporal</code> 
    * @return the current instance of <code>Id<T></code> 
    */
   public Id<T> temporal(String temporal);

   /**
    * Returns the <code>temporal</code> element
    * @return the value found for the element <code>temporal</code> 
    */
   public TemporalType getTemporal();

   /**
    * Returns the <code>temporal</code> element
    * @return the value found for the element <code>temporal</code> 
    */
   public String  getTemporalAsString();

   /**
    * Removes the <code>temporal</code> attribute 
    * @return the current instance of <code>Id<T></code> 
    */
   public Id<T> removeTemporal();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Id ElementName: orm:table-generator ElementType : table-generator
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>table-generator</code> element with the given value will be created.
    * Otherwise, the existing <code>table-generator</code> element will be returned.
    * @return  a new or existing instance of <code>TableGenerator<Id<T>></code> 
    */
   public TableGenerator<Id<T>> getOrCreateTableGenerator();

   /**
    * Removes the <code>table-generator</code> element 
    * @return the current instance of <code>Id<T></code> 
    */
   public Id<T> removeTableGenerator();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Id ElementName: orm:sequence-generator ElementType : sequence-generator
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>sequence-generator</code> element with the given value will be created.
    * Otherwise, the existing <code>sequence-generator</code> element will be returned.
    * @return  a new or existing instance of <code>SequenceGenerator<Id<T>></code> 
    */
   public SequenceGenerator<Id<T>> getOrCreateSequenceGenerator();

   /**
    * Removes the <code>sequence-generator</code> element 
    * @return the current instance of <code>Id<T></code> 
    */
   public Id<T> removeSequenceGenerator();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Id ElementName: xsd:string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>Id<T></code> 
    */
   public Id<T> name(String name);

   /**
    * Returns the <code>name</code> attribute
    * @return the value defined for the attribute <code>name</code> 
    */
   public String getName();

   /**
    * Removes the <code>name</code> attribute 
    * @return the current instance of <code>Id<T></code> 
    */
   public Id<T> removeName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Id ElementName: orm:access-type ElementType : access
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>access</code> attribute
    * @param access the value for the attribute <code>access</code> 
    * @return the current instance of <code>Id<T></code> 
    */
   public Id<T> access(AccessType access);

   /**
    * Sets the <code>access</code> attribute
    * @param access the value for the attribute <code>access</code> 
    * @return the current instance of <code>Id<T></code> 
    */
   public Id<T> access(String access);

   /**
    * Returns the <code>access</code> attribute
    * @return the value defined for the attribute <code>access</code> 
    */
public AccessType getAccess();

   /**
    * Returns the <code>access</code> attribute
    * @return the value found for the element <code>access</code> 
    */
   public String  getAccessAsString();

   /**
    * Removes the <code>access</code> attribute 
    * @return the current instance of <code>Id<T></code> 
    */
   public Id<T> removeAccess();
}
