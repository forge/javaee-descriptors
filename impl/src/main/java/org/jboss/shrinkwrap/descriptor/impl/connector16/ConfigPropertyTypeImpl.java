package org.jboss.shrinkwrap.descriptor.impl.connector16; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.connector16.ConfigPropertyType;
import org.jboss.shrinkwrap.descriptor.api.connector16.ConfigPropertyTypeType;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> config-propertyType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class ConfigPropertyTypeImpl<T> implements Child<T>, ConfigPropertyType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public ConfigPropertyTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public ConfigPropertyTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
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
   public ConfigPropertyType<T> description(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("description").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
public List<String> getAllDescription()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("description");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>ConfigPropertyType<T></code> 
    */
   public ConfigPropertyType<T> removeAllDescription()
   {
      childNode.removeChildren("description");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConfigPropertyType ElementName: javaee:xsdStringType ElementType : config-property-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>config-property-name</code> element
    * @param configPropertyName the value for the element <code>config-property-name</code> 
    * @return the current instance of <code>ConfigPropertyType<T></code> 
    */
   public ConfigPropertyType<T> configPropertyName(String configPropertyName)
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
    * @return the current instance of <code>ConfigPropertyType<T></code> 
    */
   public ConfigPropertyType<T> removeConfigPropertyName()
   {
      childNode.removeChildren("config-property-name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConfigPropertyType ElementName: javaee:config-property-typeType ElementType : config-property-type
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>config-property-type</code> element
    * @param configPropertyType the value for the element <code>config-property-type</code> 
    * @return the current instance of <code>ConfigPropertyType<T></code> 
    */
   public ConfigPropertyType<T> configPropertyType(ConfigPropertyTypeType configPropertyType)
   {
      childNode.getOrCreate("config-property-type").text(configPropertyType);
      return this;
   }
   /**
    * Sets the <code>config-property-type</code> element
    * @param configPropertyType the value for the element <code>config-property-type</code> 
    * @return the current instance of <code>ConfigPropertyType<T></code> 
    */
   public ConfigPropertyType<T> configPropertyType(String configPropertyType)
   {
      childNode.getOrCreate("config-property-type").text(configPropertyType);
      return this;
   }

   /**
    * Returns the <code>config-property-type</code> element
    * @return the value found for the element <code>config-property-type</code> 
    */
   public ConfigPropertyTypeType getConfigPropertyType()
   {
      return ConfigPropertyTypeType.getFromStringValue(childNode.getTextValueForPatternName("config-property-type"));
   }

   /**
    * Returns the <code>config-property-type</code> element
    * @return the value found for the element <code>config-property-type</code> 
    */
   public String  getConfigPropertyTypeAsString()
   {
      return childNode.getTextValueForPatternName("config-property-type");
   }

   /**
    * Removes the <code>config-property-type</code> attribute 
    * @return the current instance of <code>ConfigPropertyType<T></code> 
    */
   public ConfigPropertyType<T> removeConfigPropertyType()
   {
      childNode.removeAttribute("config-property-type");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConfigPropertyType ElementName: xsd:string ElementType : config-property-value
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>config-property-value</code> element
    * @param configPropertyValue the value for the element <code>config-property-value</code> 
    * @return the current instance of <code>ConfigPropertyType<T></code> 
    */
   public ConfigPropertyType<T> configPropertyValue(String configPropertyValue)
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
    * @return the current instance of <code>ConfigPropertyType<T></code> 
    */
   public ConfigPropertyType<T> removeConfigPropertyValue()
   {
      childNode.removeChildren("config-property-value");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConfigPropertyType ElementName: javaee:xsdBooleanType ElementType : config-property-ignore
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>config-property-ignore</code> element
    * @param configPropertyIgnore the value for the element <code>config-property-ignore</code> 
    * @return the current instance of <code>ConfigPropertyType<T></code> 
    */
   public ConfigPropertyType<T> configPropertyIgnore(Boolean configPropertyIgnore)
   {
      childNode.getOrCreate("config-property-ignore").text(configPropertyIgnore);
      return this;
   }

   /**
    * Returns the <code>config-property-ignore</code> element
    * @return the node defined for the element <code>config-property-ignore</code> 
    */
   public Boolean isConfigPropertyIgnore()
   {
      return Strings.isTrue(childNode.getTextValueForPatternName("config-property-ignore"));
   }

   /**
    * Removes the <code>config-property-ignore</code> element 
    * @return the current instance of <code>ConfigPropertyType<T></code> 
    */
   public ConfigPropertyType<T> removeConfigPropertyIgnore()
   {
      childNode.removeChildren("config-property-ignore");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConfigPropertyType ElementName: javaee:xsdBooleanType ElementType : config-property-supports-dynamic-updates
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>config-property-supports-dynamic-updates</code> element
    * @param configPropertySupportsDynamicUpdates the value for the element <code>config-property-supports-dynamic-updates</code> 
    * @return the current instance of <code>ConfigPropertyType<T></code> 
    */
   public ConfigPropertyType<T> configPropertySupportsDynamicUpdates(Boolean configPropertySupportsDynamicUpdates)
   {
      childNode.getOrCreate("config-property-supports-dynamic-updates").text(configPropertySupportsDynamicUpdates);
      return this;
   }

   /**
    * Returns the <code>config-property-supports-dynamic-updates</code> element
    * @return the node defined for the element <code>config-property-supports-dynamic-updates</code> 
    */
   public Boolean isConfigPropertySupportsDynamicUpdates()
   {
      return Strings.isTrue(childNode.getTextValueForPatternName("config-property-supports-dynamic-updates"));
   }

   /**
    * Removes the <code>config-property-supports-dynamic-updates</code> element 
    * @return the current instance of <code>ConfigPropertyType<T></code> 
    */
   public ConfigPropertyType<T> removeConfigPropertySupportsDynamicUpdates()
   {
      childNode.removeChildren("config-property-supports-dynamic-updates");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConfigPropertyType ElementName: javaee:xsdBooleanType ElementType : config-property-confidential
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>config-property-confidential</code> element
    * @param configPropertyConfidential the value for the element <code>config-property-confidential</code> 
    * @return the current instance of <code>ConfigPropertyType<T></code> 
    */
   public ConfigPropertyType<T> configPropertyConfidential(Boolean configPropertyConfidential)
   {
      childNode.getOrCreate("config-property-confidential").text(configPropertyConfidential);
      return this;
   }

   /**
    * Returns the <code>config-property-confidential</code> element
    * @return the node defined for the element <code>config-property-confidential</code> 
    */
   public Boolean isConfigPropertyConfidential()
   {
      return Strings.isTrue(childNode.getTextValueForPatternName("config-property-confidential"));
   }

   /**
    * Removes the <code>config-property-confidential</code> element 
    * @return the current instance of <code>ConfigPropertyType<T></code> 
    */
   public ConfigPropertyType<T> removeConfigPropertyConfidential()
   {
      childNode.removeChildren("config-property-confidential");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConfigPropertyType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>ConfigPropertyType<T></code> 
    */
   public ConfigPropertyType<T> id(String id)
   {
      childNode.attribute("id", id);
      return this;
   }

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
      public String getId()
   {
      return childNode.getAttribute("id");
   }

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>ConfigPropertyType<T></code> 
    */
   public ConfigPropertyType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
