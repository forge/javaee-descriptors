package org.jboss.shrinkwrap.descriptor.impl.validationMapping11; 

import org.jboss.shrinkwrap.descriptor.api.validationMapping11.ValidationMappingDescriptor;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.validationMapping11.BeanType;
import org.jboss.shrinkwrap.descriptor.impl.validationMapping11.BeanTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.validationMapping11.ConstraintDefinitionType;
import org.jboss.shrinkwrap.descriptor.impl.validationMapping11.ConstraintDefinitionTypeImpl;
import java.util.Map.Entry;

import org.jboss.shrinkwrap.descriptor.api.DescriptorNamespace;

import org.jboss.shrinkwrap.descriptor.spi.node.NodeDescriptorImplBase;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/** 
 * <p> 
 * This deployment descriptor provides the functionalities as described in the  specification
 * <p> 
 * Example:
 * <p> 
 * <code> 
 *     ValidationMappingDescriptor descriptor = Descriptors.create(ValidationMappingDescriptor.class);
 * </code> 
 *
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class ValidationMappingDescriptorImpl extends NodeDescriptorImplBase implements DescriptorNamespace<ValidationMappingDescriptor>, ValidationMappingDescriptor
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private Node model;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public ValidationMappingDescriptorImpl(String descriptorName)
   {
       this(descriptorName, new Node("constraint-mappings"));
   }

   public ValidationMappingDescriptorImpl(String descriptorName, Node node)
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
    * @return the current instance of <code>ValidationMappingDescriptor</code> 
    */
   public ValidationMappingDescriptor addDefaultNamespaces()
   {
      addNamespace("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
      addNamespace("xsi:schemaLocation", "http://jboss.org/xml/ns/javax/validation/mapping validation-mapping-1.1.xsd");
      addNamespace("xmlns", "http://jboss.org/xml/ns/javax/validation/mapping");
     return this;
   }

   /**
    * Adds a new namespace 
    * @return the current instance of <code>ValidationMappingDescriptor</code> 
    */
   public ValidationMappingDescriptor addNamespace(String name, String value)
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
    * @return the current instance of <code>ValidationMappingDescriptor</code> 
    */
   public ValidationMappingDescriptor removeAllNamespaces()
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
   // ClassName: ValidationMappingDescriptor ElementName: xsd:string ElementType : default-package
   // MaxOccurs: -  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>default-package</code> element
    * @param defaultPackage the value for the element <code>default-package</code> 
    * @return the current instance of <code>ValidationMappingDescriptor</code> 
    */
   public ValidationMappingDescriptor defaultPackage(String defaultPackage)
   {
      model.getOrCreate("default-package").text(defaultPackage);
      return this;
   }

   /**
    * Returns the <code>default-package</code> element
    * @return the node defined for the element <code>default-package</code> 
    */
   public String getDefaultPackage()
   {
      return model.getTextValueForPatternName("default-package");
   }

   /**
    * Removes the <code>default-package</code> element 
    * @return the current instance of <code>ValidationMappingDescriptor</code> 
    */
   public ValidationMappingDescriptor removeDefaultPackage()
   {
      model.removeChildren("default-package");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ValidationMappingDescriptor ElementName: map:beanType ElementType : bean
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>bean</code> element will be created and returned.
    * Otherwise, the first existing <code>bean</code> element will be returned.
    * @return the instance defined for the element <code>bean</code> 
    */
   public BeanType<ValidationMappingDescriptor> getOrCreateBean()
   {
      List<Node> nodeList = model.get("bean");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new BeanTypeImpl<ValidationMappingDescriptor>(this, "bean", model, nodeList.get(0));
      }
      return createBean();
   }

   /**
    * Creates a new <code>bean</code> element 
    * @return the new created instance of <code>BeanType<ValidationMappingDescriptor></code> 
    */
   public BeanType<ValidationMappingDescriptor> createBean()
   {
      return new BeanTypeImpl<ValidationMappingDescriptor>(this, "bean", model);
   }

   /**
    * Returns all <code>bean</code> elements
    * @return list of <code>bean</code> 
    */
   public List<BeanType<ValidationMappingDescriptor>> getAllBean()
   {
      List<BeanType<ValidationMappingDescriptor>> list = new ArrayList<BeanType<ValidationMappingDescriptor>>();
      List<Node> nodeList = model.get("bean");
      for(Node node: nodeList)
      {
         BeanType<ValidationMappingDescriptor>  type = new BeanTypeImpl<ValidationMappingDescriptor>(this, "bean", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>bean</code> elements 
    * @return the current instance of <code>BeanType<ValidationMappingDescriptor></code> 
    */
   public ValidationMappingDescriptor removeAllBean()
   {
      model.removeChildren("bean");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ValidationMappingDescriptor ElementName: map:constraint-definitionType ElementType : constraint-definition
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>constraint-definition</code> element will be created and returned.
    * Otherwise, the first existing <code>constraint-definition</code> element will be returned.
    * @return the instance defined for the element <code>constraint-definition</code> 
    */
   public ConstraintDefinitionType<ValidationMappingDescriptor> getOrCreateConstraintDefinition()
   {
      List<Node> nodeList = model.get("constraint-definition");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ConstraintDefinitionTypeImpl<ValidationMappingDescriptor>(this, "constraint-definition", model, nodeList.get(0));
      }
      return createConstraintDefinition();
   }

   /**
    * Creates a new <code>constraint-definition</code> element 
    * @return the new created instance of <code>ConstraintDefinitionType<ValidationMappingDescriptor></code> 
    */
   public ConstraintDefinitionType<ValidationMappingDescriptor> createConstraintDefinition()
   {
      return new ConstraintDefinitionTypeImpl<ValidationMappingDescriptor>(this, "constraint-definition", model);
   }

   /**
    * Returns all <code>constraint-definition</code> elements
    * @return list of <code>constraint-definition</code> 
    */
   public List<ConstraintDefinitionType<ValidationMappingDescriptor>> getAllConstraintDefinition()
   {
      List<ConstraintDefinitionType<ValidationMappingDescriptor>> list = new ArrayList<ConstraintDefinitionType<ValidationMappingDescriptor>>();
      List<Node> nodeList = model.get("constraint-definition");
      for(Node node: nodeList)
      {
         ConstraintDefinitionType<ValidationMappingDescriptor>  type = new ConstraintDefinitionTypeImpl<ValidationMappingDescriptor>(this, "constraint-definition", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>constraint-definition</code> elements 
    * @return the current instance of <code>ConstraintDefinitionType<ValidationMappingDescriptor></code> 
    */
   public ValidationMappingDescriptor removeAllConstraintDefinition()
   {
      model.removeChildren("constraint-definition");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ValidationMappingDescriptor ElementName: xsd:token ElementType : version
   // MaxOccurs: -  isGeneric: false   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of <code>ValidationMappingDescriptor</code> 
    */
   public ValidationMappingDescriptor version(String version)
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
    * @return the current instance of <code>ValidationMappingDescriptor</code> 
    */
   public ValidationMappingDescriptor removeVersion()
   {
      model.removeAttribute("version");
      return this;
   }

}
