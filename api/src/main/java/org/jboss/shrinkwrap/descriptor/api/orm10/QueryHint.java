package org.jboss.shrinkwrap.descriptor.api.orm10; 

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> query-hint </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface QueryHint<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: QueryHint ElementName: xsd:string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>QueryHint<T></code> 
    */
   public QueryHint<T> name(String name);

   /**
    * Returns the <code>name</code> attribute
    * @return the value defined for the attribute <code>name</code> 
    */
   public String getName();

   /**
    * Removes the <code>name</code> attribute 
    * @return the current instance of <code>QueryHint<T></code> 
    */
   public QueryHint<T> removeName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: QueryHint ElementName: xsd:string ElementType : value
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>value</code> attribute
    * @param value the value for the attribute <code>value</code> 
    * @return the current instance of <code>QueryHint<T></code> 
    */
   public QueryHint<T> value(String value);

   /**
    * Returns the <code>value</code> attribute
    * @return the value defined for the attribute <code>value</code> 
    */
   public String getValue();

   /**
    * Removes the <code>value</code> attribute 
    * @return the current instance of <code>QueryHint<T></code> 
    */
   public QueryHint<T> removeValue();
}
