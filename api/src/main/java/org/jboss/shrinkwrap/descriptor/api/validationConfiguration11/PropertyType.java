package org.jboss.shrinkwrap.descriptor.api.validationConfiguration11; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> propertyType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface PropertyType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PropertyType ElementName: text ElementType : propertyType
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the body text for the element <code>propertyType</code> 
    * @param propertyType the value for the body text <code>propertyType</code> 
    * @return the current instance of <code>PropertyType<T></code> 
    */
   public PropertyType<T> text(String value);

   /**
    * Returns the body text of the element <code>propertyType</code> 
    * @return the value defined for the text <code>propertyType</code> 
    */
   public String getText();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PropertyType ElementName: xsd:string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>PropertyType<T></code> 
    */
   public PropertyType<T> name(String name);

   /**
    * Returns the <code>name</code> attribute
    * @return the value defined for the attribute <code>name</code> 
    */
   public String getName();

   /**
    * Removes the <code>name</code> attribute 
    * @return the current instance of <code>PropertyType<T></code> 
    */
   public PropertyType<T> removeName();
}
