package org.jboss.shrinkwrap.descriptor.api.orm21; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> convert </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface Convert<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Convert ElementName: xsd:string ElementType : description
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>description</code> element
    * @param description the value for the element <code>description</code> 
    * @return the current instance of <code>Convert<T></code> 
    */
   public Convert<T> description(String description);

   /**
    * Returns the <code>description</code> element
    * @return the node defined for the element <code>description</code> 
    */
   public String getDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>Convert<T></code> 
    */
   public Convert<T> removeDescription();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Convert ElementName: xsd:string ElementType : converter
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>converter</code> attribute
    * @param converter the value for the attribute <code>converter</code> 
    * @return the current instance of <code>Convert<T></code> 
    */
   public Convert<T> converter(String converter);

   /**
    * Returns the <code>converter</code> attribute
    * @return the value defined for the attribute <code>converter</code> 
    */
   public String getConverter();

   /**
    * Removes the <code>converter</code> attribute 
    * @return the current instance of <code>Convert<T></code> 
    */
   public Convert<T> removeConverter();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Convert ElementName: xsd:string ElementType : attribute-name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>attribute-name</code> attribute
    * @param attributeName the value for the attribute <code>attribute-name</code> 
    * @return the current instance of <code>Convert<T></code> 
    */
   public Convert<T> attributeName(String attributeName);

   /**
    * Returns the <code>attribute-name</code> attribute
    * @return the value defined for the attribute <code>attribute-name</code> 
    */
   public String getAttributeName();

   /**
    * Removes the <code>attribute-name</code> attribute 
    * @return the current instance of <code>Convert<T></code> 
    */
   public Convert<T> removeAttributeName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Convert ElementName: xsd:boolean ElementType : disable-conversion
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>disable-conversion</code> attribute
    * @param disableConversion the value for the attribute <code>disable-conversion</code> 
    * @return the current instance of <code>Convert<T></code> 
    */
   public Convert<T> disableConversion(Boolean disableConversion);

   /**
    * Returns the <code>disable-conversion</code> attribute
    * @return the value defined for the attribute <code>disable-conversion</code> 
    */
public Boolean isDisableConversion();

   /**
    * Removes the <code>disable-conversion</code> attribute 
    * @return the current instance of <code>Convert<T></code> 
    */
   public Convert<T> removeDisableConversion();
}
