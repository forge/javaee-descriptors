package org.jboss.shrinkwrap.descriptor.api.connector16; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> config-propertyType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface ConfigPropertyType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConfigPropertyType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>ConfigPropertyType<T></code> 
    */
   public ConfigPropertyType<T> description(String ... values);

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>ConfigPropertyType<T></code> 
    */
   public ConfigPropertyType<T> removeAllDescription();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConfigPropertyType ElementName: javaee:xsdStringType ElementType : config-property-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>config-property-name</code> element
    * @param configPropertyName the value for the element <code>config-property-name</code> 
    * @return the current instance of <code>ConfigPropertyType<T></code> 
    */
   public ConfigPropertyType<T> configPropertyName(String configPropertyName);

   /**
    * Returns the <code>config-property-name</code> element
    * @return the node defined for the element <code>config-property-name</code> 
    */
   public String getConfigPropertyName();

   /**
    * Removes the <code>config-property-name</code> element 
    * @return the current instance of <code>ConfigPropertyType<T></code> 
    */
   public ConfigPropertyType<T> removeConfigPropertyName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConfigPropertyType ElementName: javaee:config-property-typeType ElementType : config-property-type
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>config-property-type</code> element
    * @param configPropertyType the value for the element <code>config-property-type</code> 
    * @return the current instance of <code>ConfigPropertyType<T></code> 
    */
   public ConfigPropertyType<T> configPropertyType(ConfigPropertyTypeType configPropertyType);
   /**
    * Sets the <code>config-property-type</code> element
    * @param configPropertyType the value for the element <code>config-property-type</code> 
    * @return the current instance of <code>ConfigPropertyType<T></code> 
    */
   public ConfigPropertyType<T> configPropertyType(String configPropertyType);

   /**
    * Returns the <code>config-property-type</code> element
    * @return the value found for the element <code>config-property-type</code> 
    */
   public ConfigPropertyTypeType getConfigPropertyType();

   /**
    * Returns the <code>config-property-type</code> element
    * @return the value found for the element <code>config-property-type</code> 
    */
   public String  getConfigPropertyTypeAsString();

   /**
    * Removes the <code>config-property-type</code> attribute 
    * @return the current instance of <code>ConfigPropertyType<T></code> 
    */
   public ConfigPropertyType<T> removeConfigPropertyType();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConfigPropertyType ElementName: xsd:string ElementType : config-property-value
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>config-property-value</code> element
    * @param configPropertyValue the value for the element <code>config-property-value</code> 
    * @return the current instance of <code>ConfigPropertyType<T></code> 
    */
   public ConfigPropertyType<T> configPropertyValue(String configPropertyValue);

   /**
    * Returns the <code>config-property-value</code> element
    * @return the node defined for the element <code>config-property-value</code> 
    */
   public String getConfigPropertyValue();

   /**
    * Removes the <code>config-property-value</code> element 
    * @return the current instance of <code>ConfigPropertyType<T></code> 
    */
   public ConfigPropertyType<T> removeConfigPropertyValue();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConfigPropertyType ElementName: javaee:xsdBooleanType ElementType : config-property-ignore
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>config-property-ignore</code> element
    * @param configPropertyIgnore the value for the element <code>config-property-ignore</code> 
    * @return the current instance of <code>ConfigPropertyType<T></code> 
    */
   public ConfigPropertyType<T> configPropertyIgnore(Boolean configPropertyIgnore);

   /**
    * Returns the <code>config-property-ignore</code> element
    * @return the node defined for the element <code>config-property-ignore</code> 
    */
   public Boolean isConfigPropertyIgnore();

   /**
    * Removes the <code>config-property-ignore</code> element 
    * @return the current instance of <code>ConfigPropertyType<T></code> 
    */
   public ConfigPropertyType<T> removeConfigPropertyIgnore();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConfigPropertyType ElementName: javaee:xsdBooleanType ElementType : config-property-supports-dynamic-updates
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>config-property-supports-dynamic-updates</code> element
    * @param configPropertySupportsDynamicUpdates the value for the element <code>config-property-supports-dynamic-updates</code> 
    * @return the current instance of <code>ConfigPropertyType<T></code> 
    */
   public ConfigPropertyType<T> configPropertySupportsDynamicUpdates(Boolean configPropertySupportsDynamicUpdates);

   /**
    * Returns the <code>config-property-supports-dynamic-updates</code> element
    * @return the node defined for the element <code>config-property-supports-dynamic-updates</code> 
    */
   public Boolean isConfigPropertySupportsDynamicUpdates();

   /**
    * Removes the <code>config-property-supports-dynamic-updates</code> element 
    * @return the current instance of <code>ConfigPropertyType<T></code> 
    */
   public ConfigPropertyType<T> removeConfigPropertySupportsDynamicUpdates();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConfigPropertyType ElementName: javaee:xsdBooleanType ElementType : config-property-confidential
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>config-property-confidential</code> element
    * @param configPropertyConfidential the value for the element <code>config-property-confidential</code> 
    * @return the current instance of <code>ConfigPropertyType<T></code> 
    */
   public ConfigPropertyType<T> configPropertyConfidential(Boolean configPropertyConfidential);

   /**
    * Returns the <code>config-property-confidential</code> element
    * @return the node defined for the element <code>config-property-confidential</code> 
    */
   public Boolean isConfigPropertyConfidential();

   /**
    * Removes the <code>config-property-confidential</code> element 
    * @return the current instance of <code>ConfigPropertyType<T></code> 
    */
   public ConfigPropertyType<T> removeConfigPropertyConfidential();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConfigPropertyType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>ConfigPropertyType<T></code> 
    */
   public ConfigPropertyType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>ConfigPropertyType<T></code> 
    */
   public ConfigPropertyType<T> removeId();
}
