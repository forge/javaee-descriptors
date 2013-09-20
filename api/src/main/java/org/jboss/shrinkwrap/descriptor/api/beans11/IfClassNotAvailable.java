package org.jboss.shrinkwrap.descriptor.api.beans11; 

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> if-class-not-available </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface IfClassNotAvailable<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: IfClassNotAvailable ElementName: xsd:string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>IfClassNotAvailable<T></code> 
    */
   public IfClassNotAvailable<T> name(String name);

   /**
    * Returns the <code>name</code> attribute
    * @return the value defined for the attribute <code>name</code> 
    */
   public String getName();

   /**
    * Removes the <code>name</code> attribute 
    * @return the current instance of <code>IfClassNotAvailable<T></code> 
    */
   public IfClassNotAvailable<T> removeName();
}
