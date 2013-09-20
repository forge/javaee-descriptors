package org.jboss.shrinkwrap.descriptor.api.orm21; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> field-result </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface FieldResult<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FieldResult ElementName: xsd:string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>FieldResult<T></code> 
    */
   public FieldResult<T> name(String name);

   /**
    * Returns the <code>name</code> attribute
    * @return the value defined for the attribute <code>name</code> 
    */
   public String getName();

   /**
    * Removes the <code>name</code> attribute 
    * @return the current instance of <code>FieldResult<T></code> 
    */
   public FieldResult<T> removeName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FieldResult ElementName: xsd:string ElementType : column
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>column</code> attribute
    * @param column the value for the attribute <code>column</code> 
    * @return the current instance of <code>FieldResult<T></code> 
    */
   public FieldResult<T> column(String column);

   /**
    * Returns the <code>column</code> attribute
    * @return the value defined for the attribute <code>column</code> 
    */
   public String getColumn();

   /**
    * Removes the <code>column</code> attribute 
    * @return the current instance of <code>FieldResult<T></code> 
    */
   public FieldResult<T> removeColumn();
}
