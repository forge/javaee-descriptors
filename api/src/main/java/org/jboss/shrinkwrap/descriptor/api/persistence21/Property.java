package org.jboss.shrinkwrap.descriptor.api.persistence21;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.persistence.PropertyCommon;

/**
 * This interface defines the contract for the <code> property </code> xsd type
 * 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface Property<T> extends Child<T>, PropertyCommon<T, Property<T>>
{

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Property ElementName: xsd:string ElementType : name
   // MaxOccurs: - isGeneric: true isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * 
    * @param name the value for the attribute <code>name</code>
    * @return the current instance of <code>Property<T></code>
    */
   public Property<T> name(String name);

   /**
    * Returns the <code>name</code> attribute
    * 
    * @return the value defined for the attribute <code>name</code>
    */
   public String getName();

   /**
    * Removes the <code>name</code> attribute
    * 
    * @return the current instance of <code>Property<T></code>
    */
   public Property<T> removeName();

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Property ElementName: xsd:string ElementType : value
   // MaxOccurs: - isGeneric: true isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>value</code> attribute
    * 
    * @param value the value for the attribute <code>value</code>
    * @return the current instance of <code>Property<T></code>
    */
   public Property<T> value(String value);

   /**
    * Returns the <code>value</code> attribute
    * 
    * @return the value defined for the attribute <code>value</code>
    */
   public String getValue();

   /**
    * Removes the <code>value</code> attribute
    * 
    * @return the current instance of <code>Property<T></code>
    */
   public Property<T> removeValue();
}
