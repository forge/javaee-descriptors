package org.jboss.shrinkwrap.descriptor.api.orm21; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.orm21.ConstraintMode;
/**
 * This interface defines the contract for the <code> foreign-key </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface ForeignKey<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ForeignKey ElementName: xsd:string ElementType : description
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>description</code> element
    * @param description the value for the element <code>description</code> 
    * @return the current instance of <code>ForeignKey<T></code> 
    */
   public ForeignKey<T> description(String description);

   /**
    * Returns the <code>description</code> element
    * @return the node defined for the element <code>description</code> 
    */
   public String getDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>ForeignKey<T></code> 
    */
   public ForeignKey<T> removeDescription();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ForeignKey ElementName: xsd:string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>ForeignKey<T></code> 
    */
   public ForeignKey<T> name(String name);

   /**
    * Returns the <code>name</code> attribute
    * @return the value defined for the attribute <code>name</code> 
    */
   public String getName();

   /**
    * Removes the <code>name</code> attribute 
    * @return the current instance of <code>ForeignKey<T></code> 
    */
   public ForeignKey<T> removeName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ForeignKey ElementName: orm:constraint-mode ElementType : constraint-mode
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>constraint-mode</code> attribute
    * @param constraintMode the value for the attribute <code>constraint-mode</code> 
    * @return the current instance of <code>ForeignKey<T></code> 
    */
   public ForeignKey<T> constraintMode(ConstraintMode constraintMode);

   /**
    * Sets the <code>constraint-mode</code> attribute
    * @param constraintMode the value for the attribute <code>constraint-mode</code> 
    * @return the current instance of <code>ForeignKey<T></code> 
    */
   public ForeignKey<T> constraintMode(String constraintMode);

   /**
    * Returns the <code>constraint-mode</code> attribute
    * @return the value defined for the attribute <code>constraint-mode</code> 
    */
public ConstraintMode getConstraintMode();

   /**
    * Returns the <code>constraint-mode</code> attribute
    * @return the value found for the element <code>constraint-mode</code> 
    */
   public String  getConstraintModeAsString();

   /**
    * Removes the <code>constraint-mode</code> attribute 
    * @return the current instance of <code>ForeignKey<T></code> 
    */
   public ForeignKey<T> removeConstraintMode();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ForeignKey ElementName: xsd:string ElementType : foreign-key-definition
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>foreign-key-definition</code> attribute
    * @param foreignKeyDefinition the value for the attribute <code>foreign-key-definition</code> 
    * @return the current instance of <code>ForeignKey<T></code> 
    */
   public ForeignKey<T> foreignKeyDefinition(String foreignKeyDefinition);

   /**
    * Returns the <code>foreign-key-definition</code> attribute
    * @return the value defined for the attribute <code>foreign-key-definition</code> 
    */
   public String getForeignKeyDefinition();

   /**
    * Removes the <code>foreign-key-definition</code> attribute 
    * @return the current instance of <code>ForeignKey<T></code> 
    */
   public ForeignKey<T> removeForeignKeyDefinition();
}
