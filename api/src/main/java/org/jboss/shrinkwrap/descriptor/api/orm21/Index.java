package org.jboss.shrinkwrap.descriptor.api.orm21; 

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> index </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface Index<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Index ElementName: xsd:string ElementType : description
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>description</code> element
    * @param description the value for the element <code>description</code> 
    * @return the current instance of <code>Index<T></code> 
    */
   public Index<T> description(String description);

   /**
    * Returns the <code>description</code> element
    * @return the node defined for the element <code>description</code> 
    */
   public String getDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>Index<T></code> 
    */
   public Index<T> removeDescription();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Index ElementName: xsd:string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>Index<T></code> 
    */
   public Index<T> name(String name);

   /**
    * Returns the <code>name</code> attribute
    * @return the value defined for the attribute <code>name</code> 
    */
   public String getName();

   /**
    * Removes the <code>name</code> attribute 
    * @return the current instance of <code>Index<T></code> 
    */
   public Index<T> removeName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Index ElementName: xsd:string ElementType : column-list
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>column-list</code> attribute
    * @param columnList the value for the attribute <code>column-list</code> 
    * @return the current instance of <code>Index<T></code> 
    */
   public Index<T> columnList(String columnList);

   /**
    * Returns the <code>column-list</code> attribute
    * @return the value defined for the attribute <code>column-list</code> 
    */
   public String getColumnList();

   /**
    * Removes the <code>column-list</code> attribute 
    * @return the current instance of <code>Index<T></code> 
    */
   public Index<T> removeColumnList();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Index ElementName: xsd:boolean ElementType : unique
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>unique</code> attribute
    * @param unique the value for the attribute <code>unique</code> 
    * @return the current instance of <code>Index<T></code> 
    */
   public Index<T> unique(Boolean unique);

   /**
    * Returns the <code>unique</code> attribute
    * @return the value defined for the attribute <code>unique</code> 
    */
public Boolean isUnique();

   /**
    * Removes the <code>unique</code> attribute 
    * @return the current instance of <code>Index<T></code> 
    */
   public Index<T> removeUnique();
}
