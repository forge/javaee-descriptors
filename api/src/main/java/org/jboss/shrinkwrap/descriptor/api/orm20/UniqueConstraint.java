package org.jboss.shrinkwrap.descriptor.api.orm20; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> unique-constraint </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface UniqueConstraint<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: UniqueConstraint ElementName: xsd:string ElementType : column-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>column-name</code> elements, 
    * a new <code>column-name</code> element 
    * @param values list of <code>column-name</code> objects 
    * @return the current instance of <code>UniqueConstraint<T></code> 
    */
   public UniqueConstraint<T> columnName(String ... values);

   /**
    * Returns all <code>column-name</code> elements
    * @return list of <code>column-name</code> 
    */
   public List<String> getAllColumnName();

   /**
    * Removes the <code>column-name</code> element 
    * @return the current instance of <code>UniqueConstraint<T></code> 
    */
   public UniqueConstraint<T> removeAllColumnName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: UniqueConstraint ElementName: xsd:string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>UniqueConstraint<T></code> 
    */
   public UniqueConstraint<T> name(String name);

   /**
    * Returns the <code>name</code> attribute
    * @return the value defined for the attribute <code>name</code> 
    */
   public String getName();

   /**
    * Removes the <code>name</code> attribute 
    * @return the current instance of <code>UniqueConstraint<T></code> 
    */
   public UniqueConstraint<T> removeName();
}
