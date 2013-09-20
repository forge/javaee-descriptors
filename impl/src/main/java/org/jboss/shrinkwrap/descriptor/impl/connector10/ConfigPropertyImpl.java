package org.jboss.shrinkwrap.descriptor.impl.connector10; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.connector10.ConfigProperty;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> config-property </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class ConfigPropertyImpl<T> implements Child<T>, ConfigProperty<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public ConfigPropertyImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public ConfigPropertyImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConfigProperty ElementName: xsd:string ElementType : config-property-value
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>config-property-value</code> element
    * @param configPropertyValue the value for the element <code>config-property-value</code> 
    * @return the current instance of <code>ConfigProperty<T></code> 
    */
   public ConfigProperty<T> configPropertyValue(String configPropertyValue)
   {
      childNode.getOrCreate("config-property-value").text(configPropertyValue);
      return this;
   }

   /**
    * Returns the <code>config-property-value</code> element
    * @return the node defined for the element <code>config-property-value</code> 
    */
   public String getConfigPropertyValue()
   {
      return childNode.getTextValueForPatternName("config-property-value");
   }

   /**
    * Removes the <code>config-property-value</code> element 
    * @return the current instance of <code>ConfigProperty<T></code> 
    */
   public ConfigProperty<T> removeConfigPropertyValue()
   {
      childNode.removeChildren("config-property-value");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConfigProperty ElementName: xsd:string ElementType : description
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>description</code> element
    * @param description the value for the element <code>description</code> 
    * @return the current instance of <code>ConfigProperty<T></code> 
    */
   public ConfigProperty<T> description(String description)
   {
      childNode.getOrCreate("description").text(description);
      return this;
   }

   /**
    * Returns the <code>description</code> element
    * @return the node defined for the element <code>description</code> 
    */
   public String getDescription()
   {
      return childNode.getTextValueForPatternName("description");
   }

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>ConfigProperty<T></code> 
    */
   public ConfigProperty<T> removeDescription()
   {
      childNode.removeChildren("description");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConfigProperty ElementName: xsd:string ElementType : config-property-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>config-property-name</code> element
    * @param configPropertyName the value for the element <code>config-property-name</code> 
    * @return the current instance of <code>ConfigProperty<T></code> 
    */
   public ConfigProperty<T> configPropertyName(String configPropertyName)
   {
      childNode.getOrCreate("config-property-name").text(configPropertyName);
      return this;
   }

   /**
    * Returns the <code>config-property-name</code> element
    * @return the node defined for the element <code>config-property-name</code> 
    */
   public String getConfigPropertyName()
   {
      return childNode.getTextValueForPatternName("config-property-name");
   }

   /**
    * Removes the <code>config-property-name</code> element 
    * @return the current instance of <code>ConfigProperty<T></code> 
    */
   public ConfigProperty<T> removeConfigPropertyName()
   {
      childNode.removeChildren("config-property-name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConfigProperty ElementName: xsd:string ElementType : config-property-type
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>config-property-type</code> element
    * @param configPropertyType the value for the element <code>config-property-type</code> 
    * @return the current instance of <code>ConfigProperty<T></code> 
    */
   public ConfigProperty<T> configPropertyType(String configPropertyType)
   {
      childNode.getOrCreate("config-property-type").text(configPropertyType);
      return this;
   }

   /**
    * Returns the <code>config-property-type</code> element
    * @return the node defined for the element <code>config-property-type</code> 
    */
   public String getConfigPropertyType()
   {
      return childNode.getTextValueForPatternName("config-property-type");
   }

   /**
    * Removes the <code>config-property-type</code> element 
    * @return the current instance of <code>ConfigProperty<T></code> 
    */
   public ConfigProperty<T> removeConfigPropertyType()
   {
      childNode.removeChildren("config-property-type");
      return this;
   }
}
