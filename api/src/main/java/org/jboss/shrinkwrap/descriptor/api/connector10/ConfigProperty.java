package org.jboss.shrinkwrap.descriptor.api.connector10; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> config-property </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface ConfigProperty<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConfigProperty ElementName: xsd:string ElementType : config-property-value
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>config-property-value</code> element
    * @param configPropertyValue the value for the element <code>config-property-value</code> 
    * @return the current instance of <code>ConfigProperty<T></code> 
    */
   public ConfigProperty<T> configPropertyValue(String configPropertyValue);

   /**
    * Returns the <code>config-property-value</code> element
    * @return the node defined for the element <code>config-property-value</code> 
    */
   public String getConfigPropertyValue();

   /**
    * Removes the <code>config-property-value</code> element 
    * @return the current instance of <code>ConfigProperty<T></code> 
    */
   public ConfigProperty<T> removeConfigPropertyValue();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConfigProperty ElementName: xsd:string ElementType : description
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>description</code> element
    * @param description the value for the element <code>description</code> 
    * @return the current instance of <code>ConfigProperty<T></code> 
    */
   public ConfigProperty<T> description(String description);

   /**
    * Returns the <code>description</code> element
    * @return the node defined for the element <code>description</code> 
    */
   public String getDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>ConfigProperty<T></code> 
    */
   public ConfigProperty<T> removeDescription();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConfigProperty ElementName: xsd:string ElementType : config-property-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>config-property-name</code> element
    * @param configPropertyName the value for the element <code>config-property-name</code> 
    * @return the current instance of <code>ConfigProperty<T></code> 
    */
   public ConfigProperty<T> configPropertyName(String configPropertyName);

   /**
    * Returns the <code>config-property-name</code> element
    * @return the node defined for the element <code>config-property-name</code> 
    */
   public String getConfigPropertyName();

   /**
    * Removes the <code>config-property-name</code> element 
    * @return the current instance of <code>ConfigProperty<T></code> 
    */
   public ConfigProperty<T> removeConfigPropertyName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConfigProperty ElementName: xsd:string ElementType : config-property-type
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>config-property-type</code> element
    * @param configPropertyType the value for the element <code>config-property-type</code> 
    * @return the current instance of <code>ConfigProperty<T></code> 
    */
   public ConfigProperty<T> configPropertyType(String configPropertyType);

   /**
    * Returns the <code>config-property-type</code> element
    * @return the node defined for the element <code>config-property-type</code> 
    */
   public String getConfigPropertyType();

   /**
    * Removes the <code>config-property-type</code> element 
    * @return the current instance of <code>ConfigProperty<T></code> 
    */
   public ConfigProperty<T> removeConfigPropertyType();
}
