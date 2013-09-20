package org.jboss.shrinkwrap.descriptor.impl.persistence20; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.persistence20.PersistenceUnit;
import org.jboss.shrinkwrap.descriptor.api.persistence20.PersistenceUnitCachingType;
import org.jboss.shrinkwrap.descriptor.api.persistence20.PersistenceUnitTransactionType;
import org.jboss.shrinkwrap.descriptor.api.persistence20.PersistenceUnitValidationModeType;
import org.jboss.shrinkwrap.descriptor.api.persistence20.Properties;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> persistence-unit </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class PersistenceUnitImpl<T> implements Child<T>, PersistenceUnit<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public PersistenceUnitImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public PersistenceUnitImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PersistenceUnit ElementName: xsd:string ElementType : description
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>description</code> element
    * @param description the value for the element <code>description</code> 
    * @return the current instance of <code>PersistenceUnit<T></code> 
    */
   public PersistenceUnit<T> description(String description)
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
    * @return the current instance of <code>PersistenceUnit<T></code> 
    */
   public PersistenceUnit<T> removeDescription()
   {
      childNode.removeChildren("description");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PersistenceUnit ElementName: xsd:string ElementType : provider
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>provider</code> element
    * @param provider the value for the element <code>provider</code> 
    * @return the current instance of <code>PersistenceUnit<T></code> 
    */
   public PersistenceUnit<T> provider(String provider)
   {
      childNode.getOrCreate("provider").text(provider);
      return this;
   }

   /**
    * Returns the <code>provider</code> element
    * @return the node defined for the element <code>provider</code> 
    */
   public String getProvider()
   {
      return childNode.getTextValueForPatternName("provider");
   }

   /**
    * Removes the <code>provider</code> element 
    * @return the current instance of <code>PersistenceUnit<T></code> 
    */
   public PersistenceUnit<T> removeProvider()
   {
      childNode.removeChildren("provider");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PersistenceUnit ElementName: xsd:string ElementType : jta-data-source
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>jta-data-source</code> element
    * @param jtaDataSource the value for the element <code>jta-data-source</code> 
    * @return the current instance of <code>PersistenceUnit<T></code> 
    */
   public PersistenceUnit<T> jtaDataSource(String jtaDataSource)
   {
      childNode.getOrCreate("jta-data-source").text(jtaDataSource);
      return this;
   }

   /**
    * Returns the <code>jta-data-source</code> element
    * @return the node defined for the element <code>jta-data-source</code> 
    */
   public String getJtaDataSource()
   {
      return childNode.getTextValueForPatternName("jta-data-source");
   }

   /**
    * Removes the <code>jta-data-source</code> element 
    * @return the current instance of <code>PersistenceUnit<T></code> 
    */
   public PersistenceUnit<T> removeJtaDataSource()
   {
      childNode.removeChildren("jta-data-source");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PersistenceUnit ElementName: xsd:string ElementType : non-jta-data-source
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>non-jta-data-source</code> element
    * @param nonJtaDataSource the value for the element <code>non-jta-data-source</code> 
    * @return the current instance of <code>PersistenceUnit<T></code> 
    */
   public PersistenceUnit<T> nonJtaDataSource(String nonJtaDataSource)
   {
      childNode.getOrCreate("non-jta-data-source").text(nonJtaDataSource);
      return this;
   }

   /**
    * Returns the <code>non-jta-data-source</code> element
    * @return the node defined for the element <code>non-jta-data-source</code> 
    */
   public String getNonJtaDataSource()
   {
      return childNode.getTextValueForPatternName("non-jta-data-source");
   }

   /**
    * Removes the <code>non-jta-data-source</code> element 
    * @return the current instance of <code>PersistenceUnit<T></code> 
    */
   public PersistenceUnit<T> removeNonJtaDataSource()
   {
      childNode.removeChildren("non-jta-data-source");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PersistenceUnit ElementName: xsd:string ElementType : mapping-file
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>mapping-file</code> elements, 
    * a new <code>mapping-file</code> element 
    * @param values list of <code>mapping-file</code> objects 
    * @return the current instance of <code>PersistenceUnit<T></code> 
    */
   public PersistenceUnit<T> mappingFile(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("mapping-file").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>mapping-file</code> elements
    * @return list of <code>mapping-file</code> 
    */
public List<String> getAllMappingFile()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("mapping-file");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>mapping-file</code> element 
    * @return the current instance of <code>PersistenceUnit<T></code> 
    */
   public PersistenceUnit<T> removeAllMappingFile()
   {
      childNode.removeChildren("mapping-file");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PersistenceUnit ElementName: xsd:string ElementType : jar-file
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>jar-file</code> elements, 
    * a new <code>jar-file</code> element 
    * @param values list of <code>jar-file</code> objects 
    * @return the current instance of <code>PersistenceUnit<T></code> 
    */
   public PersistenceUnit<T> jarFile(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("jar-file").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>jar-file</code> elements
    * @return list of <code>jar-file</code> 
    */
public List<String> getAllJarFile()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("jar-file");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>jar-file</code> element 
    * @return the current instance of <code>PersistenceUnit<T></code> 
    */
   public PersistenceUnit<T> removeAllJarFile()
   {
      childNode.removeChildren("jar-file");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PersistenceUnit ElementName: xsd:string ElementType : class
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>class</code> elements, 
    * a new <code>class</code> element 
    * @param values list of <code>class</code> objects 
    * @return the current instance of <code>PersistenceUnit<T></code> 
    */
   public PersistenceUnit<T> clazz(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("class").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>class</code> elements
    * @return list of <code>class</code> 
    */
public List<String> getAllClazz()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("class");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>class</code> element 
    * @return the current instance of <code>PersistenceUnit<T></code> 
    */
   public PersistenceUnit<T> removeAllClazz()
   {
      childNode.removeChildren("class");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PersistenceUnit ElementName: xsd:boolean ElementType : exclude-unlisted-classes
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>exclude-unlisted-classes</code> element
    * @param excludeUnlistedClasses the value for the element <code>exclude-unlisted-classes</code> 
    * @return the current instance of <code>PersistenceUnit<T></code> 
    */
   public PersistenceUnit<T> excludeUnlistedClasses(Boolean excludeUnlistedClasses)
   {
      childNode.getOrCreate("exclude-unlisted-classes").text(excludeUnlistedClasses);
      return this;
   }

   /**
    * Returns the <code>exclude-unlisted-classes</code> element
    * @return the node defined for the element <code>exclude-unlisted-classes</code> 
    */
   public Boolean isExcludeUnlistedClasses()
   {
      return Strings.isTrue(childNode.getTextValueForPatternName("exclude-unlisted-classes"));
   }

   /**
    * Removes the <code>exclude-unlisted-classes</code> element 
    * @return the current instance of <code>PersistenceUnit<T></code> 
    */
   public PersistenceUnit<T> removeExcludeUnlistedClasses()
   {
      childNode.removeChildren("exclude-unlisted-classes");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PersistenceUnit ElementName: persistence:persistence-unit-caching-type ElementType : shared-cache-mode
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>shared-cache-mode</code> element
    * @param sharedCacheMode the value for the element <code>shared-cache-mode</code> 
    * @return the current instance of <code>PersistenceUnit<T></code> 
    */
   public PersistenceUnit<T> sharedCacheMode(PersistenceUnitCachingType sharedCacheMode)
   {
      childNode.getOrCreate("shared-cache-mode").text(sharedCacheMode);
      return this;
   }
   /**
    * Sets the <code>shared-cache-mode</code> element
    * @param sharedCacheMode the value for the element <code>shared-cache-mode</code> 
    * @return the current instance of <code>PersistenceUnit<T></code> 
    */
   public PersistenceUnit<T> sharedCacheMode(String sharedCacheMode)
   {
      childNode.getOrCreate("shared-cache-mode").text(sharedCacheMode);
      return this;
   }

   /**
    * Returns the <code>shared-cache-mode</code> element
    * @return the value found for the element <code>shared-cache-mode</code> 
    */
   public PersistenceUnitCachingType getSharedCacheMode()
   {
      return PersistenceUnitCachingType.getFromStringValue(childNode.getTextValueForPatternName("shared-cache-mode"));
   }

   /**
    * Returns the <code>shared-cache-mode</code> element
    * @return the value found for the element <code>shared-cache-mode</code> 
    */
   public String  getSharedCacheModeAsString()
   {
      return childNode.getTextValueForPatternName("shared-cache-mode");
   }

   /**
    * Removes the <code>shared-cache-mode</code> attribute 
    * @return the current instance of <code>PersistenceUnit<T></code> 
    */
   public PersistenceUnit<T> removeSharedCacheMode()
   {
      childNode.removeAttribute("shared-cache-mode");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PersistenceUnit ElementName: persistence:persistence-unit-validation-mode-type ElementType : validation-mode
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>validation-mode</code> element
    * @param validationMode the value for the element <code>validation-mode</code> 
    * @return the current instance of <code>PersistenceUnit<T></code> 
    */
   public PersistenceUnit<T> validationMode(PersistenceUnitValidationModeType validationMode)
   {
      childNode.getOrCreate("validation-mode").text(validationMode);
      return this;
   }
   /**
    * Sets the <code>validation-mode</code> element
    * @param validationMode the value for the element <code>validation-mode</code> 
    * @return the current instance of <code>PersistenceUnit<T></code> 
    */
   public PersistenceUnit<T> validationMode(String validationMode)
   {
      childNode.getOrCreate("validation-mode").text(validationMode);
      return this;
   }

   /**
    * Returns the <code>validation-mode</code> element
    * @return the value found for the element <code>validation-mode</code> 
    */
   public PersistenceUnitValidationModeType getValidationMode()
   {
      return PersistenceUnitValidationModeType.getFromStringValue(childNode.getTextValueForPatternName("validation-mode"));
   }

   /**
    * Returns the <code>validation-mode</code> element
    * @return the value found for the element <code>validation-mode</code> 
    */
   public String  getValidationModeAsString()
   {
      return childNode.getTextValueForPatternName("validation-mode");
   }

   /**
    * Removes the <code>validation-mode</code> attribute 
    * @return the current instance of <code>PersistenceUnit<T></code> 
    */
   public PersistenceUnit<T> removeValidationMode()
   {
      childNode.removeAttribute("validation-mode");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PersistenceUnit ElementName: persistence:properties ElementType : properties
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>properties</code> element with the given value will be created.
    * Otherwise, the existing <code>properties</code> element will be returned.
    * @return  a new or existing instance of <code>Properties<PersistenceUnit<T>></code> 
    */
   public Properties<PersistenceUnit<T>> getOrCreateProperties()
   {
      Node node = childNode.getOrCreate("properties");
      Properties<PersistenceUnit<T>> properties = new PropertiesImpl<PersistenceUnit<T>>(this, "properties", childNode, node);
      return properties;
   }

   /**
    * Removes the <code>properties</code> element 
    * @return the current instance of <code>PersistenceUnit<T></code> 
    */
   public PersistenceUnit<T> removeProperties()
   {
      childNode.removeChildren("properties");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PersistenceUnit ElementName: xsd:string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>PersistenceUnit<T></code> 
    */
   public PersistenceUnit<T> name(String name)
   {
      childNode.attribute("name", name);
      return this;
   }

   /**
    * Returns the <code>name</code> attribute
    * @return the value defined for the attribute <code>name</code> 
    */
      public String getName()
   {
      return childNode.getAttribute("name");
   }

   /**
    * Removes the <code>name</code> attribute 
    * @return the current instance of <code>PersistenceUnit<T></code> 
    */
   public PersistenceUnit<T> removeName()
   {
      childNode.removeAttribute("name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PersistenceUnit ElementName: persistence:persistence-unit-transaction-type ElementType : transaction-type
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>transaction-type</code> attribute
    * @param transactionType the value for the attribute <code>transaction-type</code> 
    * @return the current instance of <code>PersistenceUnit<T></code> 
    */
   public PersistenceUnit<T> transactionType(PersistenceUnitTransactionType transactionType)
   {
      childNode.attribute("transaction-type", transactionType);
      return this;
   }

   /**
    * Sets the <code>transaction-type</code> attribute
    * @param transactionType the value for the attribute <code>transaction-type</code> 
    * @return the current instance of <code>PersistenceUnit<T></code> 
    */
   public PersistenceUnit<T> transactionType(String transactionType)
   {
      childNode.attribute("transaction-type", transactionType);
      return this;
   }

   /**
    * Returns the <code>transaction-type</code> attribute
    * @return the value defined for the attribute <code>transaction-type</code> 
    */
   public PersistenceUnitTransactionType getTransactionType()
   {
      return PersistenceUnitTransactionType.getFromStringValue(childNode.getAttribute("transaction-type"));
   }

   /**
    * Returns the <code>transaction-type</code> attribute
    * @return the value found for the element <code>transaction-type</code> 
    */
   public String  getTransactionTypeAsString()
   {
      return childNode.getAttribute("transaction-type");
   }

   /**
    * Removes the <code>transaction-type</code> attribute 
    * @return the current instance of <code>PersistenceUnit<T></code> 
    */
   public PersistenceUnit<T> removeTransactionType()
   {
      childNode.removeAttribute("transaction-type");
      return this;
   }
}
