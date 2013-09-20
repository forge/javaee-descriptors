package org.jboss.shrinkwrap.descriptor.api.orm21; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.orm21.DiscriminatorType;
/**
 * This interface defines the contract for the <code> discriminator-column </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface DiscriminatorColumn<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DiscriminatorColumn ElementName: xsd:string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>DiscriminatorColumn<T></code> 
    */
   public DiscriminatorColumn<T> name(String name);

   /**
    * Returns the <code>name</code> attribute
    * @return the value defined for the attribute <code>name</code> 
    */
   public String getName();

   /**
    * Removes the <code>name</code> attribute 
    * @return the current instance of <code>DiscriminatorColumn<T></code> 
    */
   public DiscriminatorColumn<T> removeName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DiscriminatorColumn ElementName: orm:discriminator-type ElementType : discriminator-type
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>discriminator-type</code> attribute
    * @param discriminatorType the value for the attribute <code>discriminator-type</code> 
    * @return the current instance of <code>DiscriminatorColumn<T></code> 
    */
   public DiscriminatorColumn<T> discriminatorType(DiscriminatorType discriminatorType);

   /**
    * Sets the <code>discriminator-type</code> attribute
    * @param discriminatorType the value for the attribute <code>discriminator-type</code> 
    * @return the current instance of <code>DiscriminatorColumn<T></code> 
    */
   public DiscriminatorColumn<T> discriminatorType(String discriminatorType);

   /**
    * Returns the <code>discriminator-type</code> attribute
    * @return the value defined for the attribute <code>discriminator-type</code> 
    */
public DiscriminatorType getDiscriminatorType();

   /**
    * Returns the <code>discriminator-type</code> attribute
    * @return the value found for the element <code>discriminator-type</code> 
    */
   public String  getDiscriminatorTypeAsString();

   /**
    * Removes the <code>discriminator-type</code> attribute 
    * @return the current instance of <code>DiscriminatorColumn<T></code> 
    */
   public DiscriminatorColumn<T> removeDiscriminatorType();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DiscriminatorColumn ElementName: xsd:string ElementType : column-definition
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>column-definition</code> attribute
    * @param columnDefinition the value for the attribute <code>column-definition</code> 
    * @return the current instance of <code>DiscriminatorColumn<T></code> 
    */
   public DiscriminatorColumn<T> columnDefinition(String columnDefinition);

   /**
    * Returns the <code>column-definition</code> attribute
    * @return the value defined for the attribute <code>column-definition</code> 
    */
   public String getColumnDefinition();

   /**
    * Removes the <code>column-definition</code> attribute 
    * @return the current instance of <code>DiscriminatorColumn<T></code> 
    */
   public DiscriminatorColumn<T> removeColumnDefinition();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DiscriminatorColumn ElementName: xsd:int ElementType : length
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>length</code> attribute
    * @param length the value for the attribute <code>length</code> 
    * @return the current instance of <code>DiscriminatorColumn<T></code> 
    */
   public DiscriminatorColumn<T> length(Integer length);

   /**
    * Returns the <code>length</code> attribute
    * @return the value defined for the attribute <code>length</code> 
    */
public Integer getLength();

   /**
    * Removes the <code>length</code> attribute 
    * @return the current instance of <code>DiscriminatorColumn<T></code> 
    */
   public DiscriminatorColumn<T> removeLength();
}
