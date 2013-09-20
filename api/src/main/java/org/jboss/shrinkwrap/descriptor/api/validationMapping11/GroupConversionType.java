package org.jboss.shrinkwrap.descriptor.api.validationMapping11; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> groupConversionType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface GroupConversionType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: GroupConversionType ElementName: xsd:string ElementType : from
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>from</code> attribute
    * @param from the value for the attribute <code>from</code> 
    * @return the current instance of <code>GroupConversionType<T></code> 
    */
   public GroupConversionType<T> from(String from);

   /**
    * Returns the <code>from</code> attribute
    * @return the value defined for the attribute <code>from</code> 
    */
   public String getFrom();

   /**
    * Removes the <code>from</code> attribute 
    * @return the current instance of <code>GroupConversionType<T></code> 
    */
   public GroupConversionType<T> removeFrom();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: GroupConversionType ElementName: xsd:string ElementType : to
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>to</code> attribute
    * @param to the value for the attribute <code>to</code> 
    * @return the current instance of <code>GroupConversionType<T></code> 
    */
   public GroupConversionType<T> to(String to);

   /**
    * Returns the <code>to</code> attribute
    * @return the value defined for the attribute <code>to</code> 
    */
   public String getTo();

   /**
    * Removes the <code>to</code> attribute 
    * @return the current instance of <code>GroupConversionType<T></code> 
    */
   public GroupConversionType<T> removeTo();
}
