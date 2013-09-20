package org.jboss.shrinkwrap.descriptor.api.orm21; 

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> version </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface Version<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Version ElementName: orm:column ElementType : column
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>column</code> element with the given value will be created.
    * Otherwise, the existing <code>column</code> element will be returned.
    * @return  a new or existing instance of <code>Column<Version<T>></code> 
    */
   public Column<Version<T>> getOrCreateColumn();

   /**
    * Removes the <code>column</code> element 
    * @return the current instance of <code>Version<T></code> 
    */
   public Version<T> removeColumn();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Version ElementName: orm:temporal-type ElementType : temporal
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>temporal</code> element
    * @param temporal the value for the element <code>temporal</code> 
    * @return the current instance of <code>Version<T></code> 
    */
   public Version<T> temporal(TemporalType temporal);
   /**
    * Sets the <code>temporal</code> element
    * @param temporal the value for the element <code>temporal</code> 
    * @return the current instance of <code>Version<T></code> 
    */
   public Version<T> temporal(String temporal);

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
    * @return the current instance of <code>Version<T></code> 
    */
   public Version<T> removeTemporal();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Version ElementName: xsd:string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>Version<T></code> 
    */
   public Version<T> name(String name);

   /**
    * Returns the <code>name</code> attribute
    * @return the value defined for the attribute <code>name</code> 
    */
   public String getName();

   /**
    * Removes the <code>name</code> attribute 
    * @return the current instance of <code>Version<T></code> 
    */
   public Version<T> removeName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Version ElementName: orm:access-type ElementType : access
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>access</code> attribute
    * @param access the value for the attribute <code>access</code> 
    * @return the current instance of <code>Version<T></code> 
    */
   public Version<T> access(AccessType access);

   /**
    * Sets the <code>access</code> attribute
    * @param access the value for the attribute <code>access</code> 
    * @return the current instance of <code>Version<T></code> 
    */
   public Version<T> access(String access);

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
    * @return the current instance of <code>Version<T></code> 
    */
   public Version<T> removeAccess();
}
