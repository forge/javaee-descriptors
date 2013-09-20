package org.jboss.shrinkwrap.descriptor.api.orm10; 

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> attribute-override </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface AttributeOverride<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: AttributeOverride ElementName: orm:column ElementType : column
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>column</code> element with the given value will be created.
    * Otherwise, the existing <code>column</code> element will be returned.
    * @return  a new or existing instance of <code>Column<AttributeOverride<T>></code> 
    */
   public Column<AttributeOverride<T>> getOrCreateColumn();

   /**
    * Removes the <code>column</code> element 
    * @return the current instance of <code>AttributeOverride<T></code> 
    */
   public AttributeOverride<T> removeColumn();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: AttributeOverride ElementName: xsd:string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>AttributeOverride<T></code> 
    */
   public AttributeOverride<T> name(String name);

   /**
    * Returns the <code>name</code> attribute
    * @return the value defined for the attribute <code>name</code> 
    */
   public String getName();

   /**
    * Removes the <code>name</code> attribute 
    * @return the current instance of <code>AttributeOverride<T></code> 
    */
   public AttributeOverride<T> removeName();
}
