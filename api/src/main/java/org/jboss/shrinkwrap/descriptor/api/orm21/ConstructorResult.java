package org.jboss.shrinkwrap.descriptor.api.orm21; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> constructor-result </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface ConstructorResult<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConstructorResult ElementName: orm:column-result ElementType : column
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>column</code> element will be created and returned.
    * Otherwise, the first existing <code>column</code> element will be returned.
    * @return the instance defined for the element <code>column</code> 
    */
   public ColumnResult<ConstructorResult<T>> getOrCreateColumn();

   /**
    * Creates a new <code>column</code> element 
    * @return the new created instance of <code>ColumnResult<ConstructorResult<T>></code> 
    */
   public ColumnResult<ConstructorResult<T>> createColumn();

   /**
    * Returns all <code>column</code> elements
    * @return list of <code>column</code> 
    */
   public List<ColumnResult<ConstructorResult<T>>> getAllColumn();

   /**
    * Removes all <code>column</code> elements 
    * @return the current instance of <code>ColumnResult<ConstructorResult<T>></code> 
    */
   public ConstructorResult<T> removeAllColumn();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConstructorResult ElementName: xsd:string ElementType : target-class
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>target-class</code> attribute
    * @param targetClass the value for the attribute <code>target-class</code> 
    * @return the current instance of <code>ConstructorResult<T></code> 
    */
   public ConstructorResult<T> targetClass(String targetClass);

   /**
    * Returns the <code>target-class</code> attribute
    * @return the value defined for the attribute <code>target-class</code> 
    */
   public String getTargetClass();

   /**
    * Removes the <code>target-class</code> attribute 
    * @return the current instance of <code>ConstructorResult<T></code> 
    */
   public ConstructorResult<T> removeTargetClass();
}
