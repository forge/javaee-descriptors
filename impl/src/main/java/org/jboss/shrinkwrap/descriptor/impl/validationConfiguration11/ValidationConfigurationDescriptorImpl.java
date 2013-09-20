package org.jboss.shrinkwrap.descriptor.impl.validationConfiguration11; 

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

import org.jboss.shrinkwrap.descriptor.api.DescriptorNamespace;
import org.jboss.shrinkwrap.descriptor.api.validationConfiguration11.ExecutableValidationType;
import org.jboss.shrinkwrap.descriptor.api.validationConfiguration11.PropertyType;
import org.jboss.shrinkwrap.descriptor.api.validationConfiguration11.ValidationConfigurationDescriptor;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.spi.node.NodeDescriptorImplBase;

/** 
 * <p> 
 * This deployment descriptor provides the functionalities as described in the  specification
 * <p> 
 * Example:
 * <p> 
 * <code> 
 *     ValidationConfigurationDescriptor descriptor = Descriptors.create(ValidationConfigurationDescriptor.class);
 * </code> 
 *
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class ValidationConfigurationDescriptorImpl extends NodeDescriptorImplBase implements DescriptorNamespace<ValidationConfigurationDescriptor>, ValidationConfigurationDescriptor
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private Node model;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public ValidationConfigurationDescriptorImpl(String descriptorName)
   {
       this(descriptorName, new Node("validation-config"));
   }

   public ValidationConfigurationDescriptorImpl(String descriptorName, Node node)
   {
      super(descriptorName);
      this.model = node;
      addDefaultNamespaces();
   }

   // -------------------------------------------------------------------------------------||
   // Methods 
   // -------------------------------------------------------------------------------------||

   public Node getRootNode()
   {
      return model;
   }



   // -------------------------------------------------------------------------------------||
   // Namespace 
   // -------------------------------------------------------------------------------------||


   /**
    * Adds the default namespaces as defined in the specification 
    * @return the current instance of <code>ValidationConfigurationDescriptor</code> 
    */
   public ValidationConfigurationDescriptor addDefaultNamespaces()
   {
      addNamespace("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
      addNamespace("xsi:schemaLocation", "http://jboss.org/xml/ns/javax/validation/configuration validation-configuration-1.1.xsd");
      addNamespace("xmlns", "http://jboss.org/xml/ns/javax/validation/configuration");
     return this;
   }

   /**
    * Adds a new namespace 
    * @return the current instance of <code>ValidationConfigurationDescriptor</code> 
    */
   public ValidationConfigurationDescriptor addNamespace(String name, String value)
   {
      model.attribute(name, value);
      return this;
   }

   /**
    * Returns all defined namespaces. 
    * @return all defined namespaces 
    */
   public List<String> getNamespaces()
   {
      List<String> namespaceList = new ArrayList<String>();
      java.util.Map<String, String> attributes = model.getAttributes();
      for (Entry<String, String> e : attributes.entrySet())
      {
         final String name = e.getKey();
         final String value = e.getValue();
         if (value != null && value.startsWith("http://")) 
         {
            namespaceList.add(name + "=" + value);
         }
      }
      return namespaceList;
   }

   /**
    * Removes all existing namespaces. 
    * @return the current instance of <code>ValidationConfigurationDescriptor</code> 
    */
   public ValidationConfigurationDescriptor removeAllNamespaces()
   {
      List<String> nameSpaceKeys = new ArrayList<String>();
      java.util.Map<String, String> attributes = model.getAttributes();
      for (Entry<String, String> e : attributes.entrySet())
      {
         final String name = e.getKey();
         final String value = e.getValue();
         if (value != null && value.startsWith("http://")) 
         {
            nameSpaceKeys.add(name);
         }
      }
      for (String name: nameSpaceKeys)
      {
         model.removeAttribute(name);
      }
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ValidationConfigurationDescriptor ElementName: xsd:string ElementType : default-provider
   // MaxOccurs: -  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>default-provider</code> element
    * @param defaultProvider the value for the element <code>default-provider</code> 
    * @return the current instance of <code>ValidationConfigurationDescriptor</code> 
    */
   public ValidationConfigurationDescriptor defaultProvider(String defaultProvider)
   {
      model.getOrCreate("default-provider").text(defaultProvider);
      return this;
   }

   /**
    * Returns the <code>default-provider</code> element
    * @return the node defined for the element <code>default-provider</code> 
    */
   public String getDefaultProvider()
   {
      return model.getTextValueForPatternName("default-provider");
   }

   /**
    * Removes the <code>default-provider</code> element 
    * @return the current instance of <code>ValidationConfigurationDescriptor</code> 
    */
   public ValidationConfigurationDescriptor removeDefaultProvider()
   {
      model.removeChildren("default-provider");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ValidationConfigurationDescriptor ElementName: xsd:string ElementType : message-interpolator
   // MaxOccurs: -  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>message-interpolator</code> element
    * @param messageInterpolator the value for the element <code>message-interpolator</code> 
    * @return the current instance of <code>ValidationConfigurationDescriptor</code> 
    */
   public ValidationConfigurationDescriptor messageInterpolator(String messageInterpolator)
   {
      model.getOrCreate("message-interpolator").text(messageInterpolator);
      return this;
   }

   /**
    * Returns the <code>message-interpolator</code> element
    * @return the node defined for the element <code>message-interpolator</code> 
    */
   public String getMessageInterpolator()
   {
      return model.getTextValueForPatternName("message-interpolator");
   }

   /**
    * Removes the <code>message-interpolator</code> element 
    * @return the current instance of <code>ValidationConfigurationDescriptor</code> 
    */
   public ValidationConfigurationDescriptor removeMessageInterpolator()
   {
      model.removeChildren("message-interpolator");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ValidationConfigurationDescriptor ElementName: xsd:string ElementType : traversable-resolver
   // MaxOccurs: -  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>traversable-resolver</code> element
    * @param traversableResolver the value for the element <code>traversable-resolver</code> 
    * @return the current instance of <code>ValidationConfigurationDescriptor</code> 
    */
   public ValidationConfigurationDescriptor traversableResolver(String traversableResolver)
   {
      model.getOrCreate("traversable-resolver").text(traversableResolver);
      return this;
   }

   /**
    * Returns the <code>traversable-resolver</code> element
    * @return the node defined for the element <code>traversable-resolver</code> 
    */
   public String getTraversableResolver()
   {
      return model.getTextValueForPatternName("traversable-resolver");
   }

   /**
    * Removes the <code>traversable-resolver</code> element 
    * @return the current instance of <code>ValidationConfigurationDescriptor</code> 
    */
   public ValidationConfigurationDescriptor removeTraversableResolver()
   {
      model.removeChildren("traversable-resolver");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ValidationConfigurationDescriptor ElementName: xsd:string ElementType : constraint-validator-factory
   // MaxOccurs: -  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>constraint-validator-factory</code> element
    * @param constraintValidatorFactory the value for the element <code>constraint-validator-factory</code> 
    * @return the current instance of <code>ValidationConfigurationDescriptor</code> 
    */
   public ValidationConfigurationDescriptor constraintValidatorFactory(String constraintValidatorFactory)
   {
      model.getOrCreate("constraint-validator-factory").text(constraintValidatorFactory);
      return this;
   }

   /**
    * Returns the <code>constraint-validator-factory</code> element
    * @return the node defined for the element <code>constraint-validator-factory</code> 
    */
   public String getConstraintValidatorFactory()
   {
      return model.getTextValueForPatternName("constraint-validator-factory");
   }

   /**
    * Removes the <code>constraint-validator-factory</code> element 
    * @return the current instance of <code>ValidationConfigurationDescriptor</code> 
    */
   public ValidationConfigurationDescriptor removeConstraintValidatorFactory()
   {
      model.removeChildren("constraint-validator-factory");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ValidationConfigurationDescriptor ElementName: xsd:string ElementType : parameter-name-provider
   // MaxOccurs: -  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>parameter-name-provider</code> element
    * @param parameterNameProvider the value for the element <code>parameter-name-provider</code> 
    * @return the current instance of <code>ValidationConfigurationDescriptor</code> 
    */
   public ValidationConfigurationDescriptor parameterNameProvider(String parameterNameProvider)
   {
      model.getOrCreate("parameter-name-provider").text(parameterNameProvider);
      return this;
   }

   /**
    * Returns the <code>parameter-name-provider</code> element
    * @return the node defined for the element <code>parameter-name-provider</code> 
    */
   public String getParameterNameProvider()
   {
      return model.getTextValueForPatternName("parameter-name-provider");
   }

   /**
    * Removes the <code>parameter-name-provider</code> element 
    * @return the current instance of <code>ValidationConfigurationDescriptor</code> 
    */
   public ValidationConfigurationDescriptor removeParameterNameProvider()
   {
      model.removeChildren("parameter-name-provider");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ValidationConfigurationDescriptor ElementName: config:executable-validationType ElementType : executable-validation
   // MaxOccurs: -  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>executable-validation</code> element with the given value will be created.
    * Otherwise, the existing <code>executable-validation</code> element will be returned.
    * @return  a new or existing instance of <code>ExecutableValidationType<ValidationConfigurationDescriptor></code> 
    */
   public ExecutableValidationType<ValidationConfigurationDescriptor> getOrCreateExecutableValidation()
   {
      Node node = model.getOrCreate("executable-validation");
      ExecutableValidationType<ValidationConfigurationDescriptor> executableValidation = new ExecutableValidationTypeImpl<ValidationConfigurationDescriptor>(this, "executable-validation", model, node);
      return executableValidation;
   }

   /**
    * Removes the <code>executable-validation</code> element 
    * @return the current instance of <code>ValidationConfigurationDescriptor</code> 
    */
   public ValidationConfigurationDescriptor removeExecutableValidation()
   {
      model.removeChildren("executable-validation");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ValidationConfigurationDescriptor ElementName: xsd:string ElementType : constraint-mapping
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>constraint-mapping</code> elements, 
    * a new <code>constraint-mapping</code> element 
    * @param values list of <code>constraint-mapping</code> objects 
    * @return the current instance of <code>ValidationConfigurationDescriptor</code> 
    */
   public ValidationConfigurationDescriptor constraintMapping(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            model.createChild("constraint-mapping").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>constraint-mapping</code> elements
    * @return list of <code>constraint-mapping</code> 
    */
public List<String> getAllConstraintMapping()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = model.get("constraint-mapping");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>constraint-mapping</code> element 
    * @return the current instance of <code>ValidationConfigurationDescriptor</code> 
    */
   public ValidationConfigurationDescriptor removeAllConstraintMapping()
   {
      model.removeChildren("constraint-mapping");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ValidationConfigurationDescriptor ElementName: config:propertyType ElementType : property
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>property</code> element will be created and returned.
    * Otherwise, the first existing <code>property</code> element will be returned.
    * @return the instance defined for the element <code>property</code> 
    */
   public PropertyType<ValidationConfigurationDescriptor> getOrCreateProperty()
   {
      List<Node> nodeList = model.get("property");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new PropertyTypeImpl<ValidationConfigurationDescriptor>(this, "property", model, nodeList.get(0));
      }
      return createProperty();
   }

   /**
    * Creates a new <code>property</code> element 
    * @return the new created instance of <code>PropertyType<ValidationConfigurationDescriptor></code> 
    */
   public PropertyType<ValidationConfigurationDescriptor> createProperty()
   {
      return new PropertyTypeImpl<ValidationConfigurationDescriptor>(this, "property", model);
   }

   /**
    * Returns all <code>property</code> elements
    * @return list of <code>property</code> 
    */
   public List<PropertyType<ValidationConfigurationDescriptor>> getAllProperty()
   {
      List<PropertyType<ValidationConfigurationDescriptor>> list = new ArrayList<PropertyType<ValidationConfigurationDescriptor>>();
      List<Node> nodeList = model.get("property");
      for(Node node: nodeList)
      {
         PropertyType<ValidationConfigurationDescriptor>  type = new PropertyTypeImpl<ValidationConfigurationDescriptor>(this, "property", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>property</code> elements 
    * @return the current instance of <code>PropertyType<ValidationConfigurationDescriptor></code> 
    */
   public ValidationConfigurationDescriptor removeAllProperty()
   {
      model.removeChildren("property");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ValidationConfigurationDescriptor ElementName: xsd:token ElementType : version
   // MaxOccurs: -  isGeneric: false   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of <code>ValidationConfigurationDescriptor</code> 
    */
   public ValidationConfigurationDescriptor version(String version)
   {
      model.attribute("version", version);
      return this;
   }

   /**
    * Returns the <code>version</code> attribute
    * @return the value defined for the attribute <code>version</code> 
    */
      public String getVersion()
   {
      return model.getAttribute("version");
   }

   /**
    * Removes the <code>version</code> attribute 
    * @return the current instance of <code>ValidationConfigurationDescriptor</code> 
    */
   public ValidationConfigurationDescriptor removeVersion()
   {
      model.removeAttribute("version");
      return this;
   }

}
