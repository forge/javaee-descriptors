package org.jboss.shrinkwrap.descriptor.impl.facesconfig22; 

import org.jboss.shrinkwrap.descriptor.api.facesconfig22.WebFacesConfigDescriptor;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigApplicationType;
import org.jboss.shrinkwrap.descriptor.impl.facesconfig22.FacesConfigApplicationTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigOrderingType;
import org.jboss.shrinkwrap.descriptor.impl.facesconfig22.FacesConfigOrderingTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigAbsoluteOrderingType;
import org.jboss.shrinkwrap.descriptor.impl.facesconfig22.FacesConfigAbsoluteOrderingTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigFactoryType;
import org.jboss.shrinkwrap.descriptor.impl.facesconfig22.FacesConfigFactoryTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigComponentType;
import org.jboss.shrinkwrap.descriptor.impl.facesconfig22.FacesConfigComponentTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigConverterType;
import org.jboss.shrinkwrap.descriptor.impl.facesconfig22.FacesConfigConverterTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigManagedBeanType;
import org.jboss.shrinkwrap.descriptor.impl.facesconfig22.FacesConfigManagedBeanTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigFlowDefinitionType;
import org.jboss.shrinkwrap.descriptor.impl.facesconfig22.FacesConfigFlowDefinitionTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigNavigationRuleType;
import org.jboss.shrinkwrap.descriptor.impl.facesconfig22.FacesConfigNavigationRuleTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigProtectedViewsType;
import org.jboss.shrinkwrap.descriptor.impl.facesconfig22.FacesConfigProtectedViewsTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigReferencedBeanType;
import org.jboss.shrinkwrap.descriptor.impl.facesconfig22.FacesConfigReferencedBeanTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigRenderKitType;
import org.jboss.shrinkwrap.descriptor.impl.facesconfig22.FacesConfigRenderKitTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigLifecycleType;
import org.jboss.shrinkwrap.descriptor.impl.facesconfig22.FacesConfigLifecycleTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigValidatorType;
import org.jboss.shrinkwrap.descriptor.impl.facesconfig22.FacesConfigValidatorTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigBehaviorType;
import org.jboss.shrinkwrap.descriptor.impl.facesconfig22.FacesConfigBehaviorTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigExtensionType;
import org.jboss.shrinkwrap.descriptor.impl.facesconfig22.FacesConfigExtensionTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigVersionType;
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
 *     WebFacesConfigDescriptor descriptor = Descriptors.create(WebFacesConfigDescriptor.class);
 * </code> 
 *
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class WebFacesConfigDescriptorImpl extends NodeDescriptorImplBase implements DescriptorNamespace<WebFacesConfigDescriptor>, WebFacesConfigDescriptor
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private Node model;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public WebFacesConfigDescriptorImpl(String descriptorName)
   {
       this(descriptorName, new Node("faces-config"));
   }

   public WebFacesConfigDescriptorImpl(String descriptorName, Node node)
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
    * @return the current instance of <code>WebFacesConfigDescriptor</code> 
    */
   public WebFacesConfigDescriptor addDefaultNamespaces()
   {
      addNamespace("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
      addNamespace("xsi:schemaLocation", "http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/web-facesconfig_2_2.xsd");
      addNamespace("xmlns", "http://xmlns.jcp.org/xml/ns/javaee");
     return this;
   }

   /**
    * Adds a new namespace 
    * @return the current instance of <code>WebFacesConfigDescriptor</code> 
    */
   public WebFacesConfigDescriptor addNamespace(String name, String value)
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
    * @return the current instance of <code>WebFacesConfigDescriptor</code> 
    */
   public WebFacesConfigDescriptor removeAllNamespaces()
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
   // ClassName: WebFacesConfigDescriptor ElementName: javaee:faces-config-applicationType ElementType : application
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>application</code> element will be created and returned.
    * Otherwise, the first existing <code>application</code> element will be returned.
    * @return the instance defined for the element <code>application</code> 
    */
   public FacesConfigApplicationType<WebFacesConfigDescriptor> getOrCreateApplication()
   {
      List<Node> nodeList = model.get("application");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new FacesConfigApplicationTypeImpl<WebFacesConfigDescriptor>(this, "application", model, nodeList.get(0));
      }
      return createApplication();
   }

   /**
    * Creates a new <code>application</code> element 
    * @return the new created instance of <code>FacesConfigApplicationType<WebFacesConfigDescriptor></code> 
    */
   public FacesConfigApplicationType<WebFacesConfigDescriptor> createApplication()
   {
      return new FacesConfigApplicationTypeImpl<WebFacesConfigDescriptor>(this, "application", model);
   }

   /**
    * Returns all <code>application</code> elements
    * @return list of <code>application</code> 
    */
   public List<FacesConfigApplicationType<WebFacesConfigDescriptor>> getAllApplication()
   {
      List<FacesConfigApplicationType<WebFacesConfigDescriptor>> list = new ArrayList<FacesConfigApplicationType<WebFacesConfigDescriptor>>();
      List<Node> nodeList = model.get("application");
      for(Node node: nodeList)
      {
         FacesConfigApplicationType<WebFacesConfigDescriptor>  type = new FacesConfigApplicationTypeImpl<WebFacesConfigDescriptor>(this, "application", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>application</code> elements 
    * @return the current instance of <code>FacesConfigApplicationType<WebFacesConfigDescriptor></code> 
    */
   public WebFacesConfigDescriptor removeAllApplication()
   {
      model.removeChildren("application");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFacesConfigDescriptor ElementName: javaee:faces-config-orderingType ElementType : ordering
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>ordering</code> element will be created and returned.
    * Otherwise, the first existing <code>ordering</code> element will be returned.
    * @return the instance defined for the element <code>ordering</code> 
    */
   public FacesConfigOrderingType<WebFacesConfigDescriptor> getOrCreateOrdering()
   {
      List<Node> nodeList = model.get("ordering");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new FacesConfigOrderingTypeImpl<WebFacesConfigDescriptor>(this, "ordering", model, nodeList.get(0));
      }
      return createOrdering();
   }

   /**
    * Creates a new <code>ordering</code> element 
    * @return the new created instance of <code>FacesConfigOrderingType<WebFacesConfigDescriptor></code> 
    */
   public FacesConfigOrderingType<WebFacesConfigDescriptor> createOrdering()
   {
      return new FacesConfigOrderingTypeImpl<WebFacesConfigDescriptor>(this, "ordering", model);
   }

   /**
    * Returns all <code>ordering</code> elements
    * @return list of <code>ordering</code> 
    */
   public List<FacesConfigOrderingType<WebFacesConfigDescriptor>> getAllOrdering()
   {
      List<FacesConfigOrderingType<WebFacesConfigDescriptor>> list = new ArrayList<FacesConfigOrderingType<WebFacesConfigDescriptor>>();
      List<Node> nodeList = model.get("ordering");
      for(Node node: nodeList)
      {
         FacesConfigOrderingType<WebFacesConfigDescriptor>  type = new FacesConfigOrderingTypeImpl<WebFacesConfigDescriptor>(this, "ordering", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>ordering</code> elements 
    * @return the current instance of <code>FacesConfigOrderingType<WebFacesConfigDescriptor></code> 
    */
   public WebFacesConfigDescriptor removeAllOrdering()
   {
      model.removeChildren("ordering");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFacesConfigDescriptor ElementName: javaee:faces-config-absoluteOrderingType ElementType : absolute-ordering
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>absolute-ordering</code> element will be created and returned.
    * Otherwise, the first existing <code>absolute-ordering</code> element will be returned.
    * @return the instance defined for the element <code>absolute-ordering</code> 
    */
   public FacesConfigAbsoluteOrderingType<WebFacesConfigDescriptor> getOrCreateAbsoluteOrdering()
   {
      List<Node> nodeList = model.get("absolute-ordering");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new FacesConfigAbsoluteOrderingTypeImpl<WebFacesConfigDescriptor>(this, "absolute-ordering", model, nodeList.get(0));
      }
      return createAbsoluteOrdering();
   }

   /**
    * Creates a new <code>absolute-ordering</code> element 
    * @return the new created instance of <code>FacesConfigAbsoluteOrderingType<WebFacesConfigDescriptor></code> 
    */
   public FacesConfigAbsoluteOrderingType<WebFacesConfigDescriptor> createAbsoluteOrdering()
   {
      return new FacesConfigAbsoluteOrderingTypeImpl<WebFacesConfigDescriptor>(this, "absolute-ordering", model);
   }

   /**
    * Returns all <code>absolute-ordering</code> elements
    * @return list of <code>absolute-ordering</code> 
    */
   public List<FacesConfigAbsoluteOrderingType<WebFacesConfigDescriptor>> getAllAbsoluteOrdering()
   {
      List<FacesConfigAbsoluteOrderingType<WebFacesConfigDescriptor>> list = new ArrayList<FacesConfigAbsoluteOrderingType<WebFacesConfigDescriptor>>();
      List<Node> nodeList = model.get("absolute-ordering");
      for(Node node: nodeList)
      {
         FacesConfigAbsoluteOrderingType<WebFacesConfigDescriptor>  type = new FacesConfigAbsoluteOrderingTypeImpl<WebFacesConfigDescriptor>(this, "absolute-ordering", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>absolute-ordering</code> elements 
    * @return the current instance of <code>FacesConfigAbsoluteOrderingType<WebFacesConfigDescriptor></code> 
    */
   public WebFacesConfigDescriptor removeAllAbsoluteOrdering()
   {
      model.removeChildren("absolute-ordering");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFacesConfigDescriptor ElementName: javaee:faces-config-factoryType ElementType : factory
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>factory</code> element will be created and returned.
    * Otherwise, the first existing <code>factory</code> element will be returned.
    * @return the instance defined for the element <code>factory</code> 
    */
   public FacesConfigFactoryType<WebFacesConfigDescriptor> getOrCreateFactory()
   {
      List<Node> nodeList = model.get("factory");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new FacesConfigFactoryTypeImpl<WebFacesConfigDescriptor>(this, "factory", model, nodeList.get(0));
      }
      return createFactory();
   }

   /**
    * Creates a new <code>factory</code> element 
    * @return the new created instance of <code>FacesConfigFactoryType<WebFacesConfigDescriptor></code> 
    */
   public FacesConfigFactoryType<WebFacesConfigDescriptor> createFactory()
   {
      return new FacesConfigFactoryTypeImpl<WebFacesConfigDescriptor>(this, "factory", model);
   }

   /**
    * Returns all <code>factory</code> elements
    * @return list of <code>factory</code> 
    */
   public List<FacesConfigFactoryType<WebFacesConfigDescriptor>> getAllFactory()
   {
      List<FacesConfigFactoryType<WebFacesConfigDescriptor>> list = new ArrayList<FacesConfigFactoryType<WebFacesConfigDescriptor>>();
      List<Node> nodeList = model.get("factory");
      for(Node node: nodeList)
      {
         FacesConfigFactoryType<WebFacesConfigDescriptor>  type = new FacesConfigFactoryTypeImpl<WebFacesConfigDescriptor>(this, "factory", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>factory</code> elements 
    * @return the current instance of <code>FacesConfigFactoryType<WebFacesConfigDescriptor></code> 
    */
   public WebFacesConfigDescriptor removeAllFactory()
   {
      model.removeChildren("factory");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFacesConfigDescriptor ElementName: javaee:faces-config-componentType ElementType : component
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>component</code> element will be created and returned.
    * Otherwise, the first existing <code>component</code> element will be returned.
    * @return the instance defined for the element <code>component</code> 
    */
   public FacesConfigComponentType<WebFacesConfigDescriptor> getOrCreateComponent()
   {
      List<Node> nodeList = model.get("component");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new FacesConfigComponentTypeImpl<WebFacesConfigDescriptor>(this, "component", model, nodeList.get(0));
      }
      return createComponent();
   }

   /**
    * Creates a new <code>component</code> element 
    * @return the new created instance of <code>FacesConfigComponentType<WebFacesConfigDescriptor></code> 
    */
   public FacesConfigComponentType<WebFacesConfigDescriptor> createComponent()
   {
      return new FacesConfigComponentTypeImpl<WebFacesConfigDescriptor>(this, "component", model);
   }

   /**
    * Returns all <code>component</code> elements
    * @return list of <code>component</code> 
    */
   public List<FacesConfigComponentType<WebFacesConfigDescriptor>> getAllComponent()
   {
      List<FacesConfigComponentType<WebFacesConfigDescriptor>> list = new ArrayList<FacesConfigComponentType<WebFacesConfigDescriptor>>();
      List<Node> nodeList = model.get("component");
      for(Node node: nodeList)
      {
         FacesConfigComponentType<WebFacesConfigDescriptor>  type = new FacesConfigComponentTypeImpl<WebFacesConfigDescriptor>(this, "component", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>component</code> elements 
    * @return the current instance of <code>FacesConfigComponentType<WebFacesConfigDescriptor></code> 
    */
   public WebFacesConfigDescriptor removeAllComponent()
   {
      model.removeChildren("component");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFacesConfigDescriptor ElementName: javaee:faces-config-converterType ElementType : converter
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>converter</code> element will be created and returned.
    * Otherwise, the first existing <code>converter</code> element will be returned.
    * @return the instance defined for the element <code>converter</code> 
    */
   public FacesConfigConverterType<WebFacesConfigDescriptor> getOrCreateConverter()
   {
      List<Node> nodeList = model.get("converter");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new FacesConfigConverterTypeImpl<WebFacesConfigDescriptor>(this, "converter", model, nodeList.get(0));
      }
      return createConverter();
   }

   /**
    * Creates a new <code>converter</code> element 
    * @return the new created instance of <code>FacesConfigConverterType<WebFacesConfigDescriptor></code> 
    */
   public FacesConfigConverterType<WebFacesConfigDescriptor> createConverter()
   {
      return new FacesConfigConverterTypeImpl<WebFacesConfigDescriptor>(this, "converter", model);
   }

   /**
    * Returns all <code>converter</code> elements
    * @return list of <code>converter</code> 
    */
   public List<FacesConfigConverterType<WebFacesConfigDescriptor>> getAllConverter()
   {
      List<FacesConfigConverterType<WebFacesConfigDescriptor>> list = new ArrayList<FacesConfigConverterType<WebFacesConfigDescriptor>>();
      List<Node> nodeList = model.get("converter");
      for(Node node: nodeList)
      {
         FacesConfigConverterType<WebFacesConfigDescriptor>  type = new FacesConfigConverterTypeImpl<WebFacesConfigDescriptor>(this, "converter", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>converter</code> elements 
    * @return the current instance of <code>FacesConfigConverterType<WebFacesConfigDescriptor></code> 
    */
   public WebFacesConfigDescriptor removeAllConverter()
   {
      model.removeChildren("converter");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFacesConfigDescriptor ElementName: javaee:faces-config-managed-beanType ElementType : managed-bean
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>managed-bean</code> element will be created and returned.
    * Otherwise, the first existing <code>managed-bean</code> element will be returned.
    * @return the instance defined for the element <code>managed-bean</code> 
    */
   public FacesConfigManagedBeanType<WebFacesConfigDescriptor> getOrCreateManagedBean()
   {
      List<Node> nodeList = model.get("managed-bean");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new FacesConfigManagedBeanTypeImpl<WebFacesConfigDescriptor>(this, "managed-bean", model, nodeList.get(0));
      }
      return createManagedBean();
   }

   /**
    * Creates a new <code>managed-bean</code> element 
    * @return the new created instance of <code>FacesConfigManagedBeanType<WebFacesConfigDescriptor></code> 
    */
   public FacesConfigManagedBeanType<WebFacesConfigDescriptor> createManagedBean()
   {
      return new FacesConfigManagedBeanTypeImpl<WebFacesConfigDescriptor>(this, "managed-bean", model);
   }

   /**
    * Returns all <code>managed-bean</code> elements
    * @return list of <code>managed-bean</code> 
    */
   public List<FacesConfigManagedBeanType<WebFacesConfigDescriptor>> getAllManagedBean()
   {
      List<FacesConfigManagedBeanType<WebFacesConfigDescriptor>> list = new ArrayList<FacesConfigManagedBeanType<WebFacesConfigDescriptor>>();
      List<Node> nodeList = model.get("managed-bean");
      for(Node node: nodeList)
      {
         FacesConfigManagedBeanType<WebFacesConfigDescriptor>  type = new FacesConfigManagedBeanTypeImpl<WebFacesConfigDescriptor>(this, "managed-bean", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>managed-bean</code> elements 
    * @return the current instance of <code>FacesConfigManagedBeanType<WebFacesConfigDescriptor></code> 
    */
   public WebFacesConfigDescriptor removeAllManagedBean()
   {
      model.removeChildren("managed-bean");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFacesConfigDescriptor ElementName: javaee:faces-config-flow-definitionType ElementType : flow-definition
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>flow-definition</code> element will be created and returned.
    * Otherwise, the first existing <code>flow-definition</code> element will be returned.
    * @return the instance defined for the element <code>flow-definition</code> 
    */
   public FacesConfigFlowDefinitionType<WebFacesConfigDescriptor> getOrCreateFlowDefinition()
   {
      List<Node> nodeList = model.get("flow-definition");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new FacesConfigFlowDefinitionTypeImpl<WebFacesConfigDescriptor>(this, "flow-definition", model, nodeList.get(0));
      }
      return createFlowDefinition();
   }

   /**
    * Creates a new <code>flow-definition</code> element 
    * @return the new created instance of <code>FacesConfigFlowDefinitionType<WebFacesConfigDescriptor></code> 
    */
   public FacesConfigFlowDefinitionType<WebFacesConfigDescriptor> createFlowDefinition()
   {
      return new FacesConfigFlowDefinitionTypeImpl<WebFacesConfigDescriptor>(this, "flow-definition", model);
   }

   /**
    * Returns all <code>flow-definition</code> elements
    * @return list of <code>flow-definition</code> 
    */
   public List<FacesConfigFlowDefinitionType<WebFacesConfigDescriptor>> getAllFlowDefinition()
   {
      List<FacesConfigFlowDefinitionType<WebFacesConfigDescriptor>> list = new ArrayList<FacesConfigFlowDefinitionType<WebFacesConfigDescriptor>>();
      List<Node> nodeList = model.get("flow-definition");
      for(Node node: nodeList)
      {
         FacesConfigFlowDefinitionType<WebFacesConfigDescriptor>  type = new FacesConfigFlowDefinitionTypeImpl<WebFacesConfigDescriptor>(this, "flow-definition", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>flow-definition</code> elements 
    * @return the current instance of <code>FacesConfigFlowDefinitionType<WebFacesConfigDescriptor></code> 
    */
   public WebFacesConfigDescriptor removeAllFlowDefinition()
   {
      model.removeChildren("flow-definition");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFacesConfigDescriptor ElementName: xsd:token ElementType : name
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>name</code> elements, 
    * a new <code>name</code> element 
    * @param values list of <code>name</code> objects 
    * @return the current instance of <code>WebFacesConfigDescriptor</code> 
    */
   public WebFacesConfigDescriptor name(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            model.createChild("name").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>name</code> elements
    * @return list of <code>name</code> 
    */
public List<String> getAllName()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = model.get("name");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>name</code> element 
    * @return the current instance of <code>WebFacesConfigDescriptor</code> 
    */
   public WebFacesConfigDescriptor removeAllName()
   {
      model.removeChildren("name");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFacesConfigDescriptor ElementName: javaee:faces-config-navigation-ruleType ElementType : navigation-rule
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>navigation-rule</code> element will be created and returned.
    * Otherwise, the first existing <code>navigation-rule</code> element will be returned.
    * @return the instance defined for the element <code>navigation-rule</code> 
    */
   public FacesConfigNavigationRuleType<WebFacesConfigDescriptor> getOrCreateNavigationRule()
   {
      List<Node> nodeList = model.get("navigation-rule");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new FacesConfigNavigationRuleTypeImpl<WebFacesConfigDescriptor>(this, "navigation-rule", model, nodeList.get(0));
      }
      return createNavigationRule();
   }

   /**
    * Creates a new <code>navigation-rule</code> element 
    * @return the new created instance of <code>FacesConfigNavigationRuleType<WebFacesConfigDescriptor></code> 
    */
   public FacesConfigNavigationRuleType<WebFacesConfigDescriptor> createNavigationRule()
   {
      return new FacesConfigNavigationRuleTypeImpl<WebFacesConfigDescriptor>(this, "navigation-rule", model);
   }

   /**
    * Returns all <code>navigation-rule</code> elements
    * @return list of <code>navigation-rule</code> 
    */
   public List<FacesConfigNavigationRuleType<WebFacesConfigDescriptor>> getAllNavigationRule()
   {
      List<FacesConfigNavigationRuleType<WebFacesConfigDescriptor>> list = new ArrayList<FacesConfigNavigationRuleType<WebFacesConfigDescriptor>>();
      List<Node> nodeList = model.get("navigation-rule");
      for(Node node: nodeList)
      {
         FacesConfigNavigationRuleType<WebFacesConfigDescriptor>  type = new FacesConfigNavigationRuleTypeImpl<WebFacesConfigDescriptor>(this, "navigation-rule", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>navigation-rule</code> elements 
    * @return the current instance of <code>FacesConfigNavigationRuleType<WebFacesConfigDescriptor></code> 
    */
   public WebFacesConfigDescriptor removeAllNavigationRule()
   {
      model.removeChildren("navigation-rule");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFacesConfigDescriptor ElementName: javaee:faces-config-protected-viewsType ElementType : protected-views
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>protected-views</code> element will be created and returned.
    * Otherwise, the first existing <code>protected-views</code> element will be returned.
    * @return the instance defined for the element <code>protected-views</code> 
    */
   public FacesConfigProtectedViewsType<WebFacesConfigDescriptor> getOrCreateProtectedViews()
   {
      List<Node> nodeList = model.get("protected-views");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new FacesConfigProtectedViewsTypeImpl<WebFacesConfigDescriptor>(this, "protected-views", model, nodeList.get(0));
      }
      return createProtectedViews();
   }

   /**
    * Creates a new <code>protected-views</code> element 
    * @return the new created instance of <code>FacesConfigProtectedViewsType<WebFacesConfigDescriptor></code> 
    */
   public FacesConfigProtectedViewsType<WebFacesConfigDescriptor> createProtectedViews()
   {
      return new FacesConfigProtectedViewsTypeImpl<WebFacesConfigDescriptor>(this, "protected-views", model);
   }

   /**
    * Returns all <code>protected-views</code> elements
    * @return list of <code>protected-views</code> 
    */
   public List<FacesConfigProtectedViewsType<WebFacesConfigDescriptor>> getAllProtectedViews()
   {
      List<FacesConfigProtectedViewsType<WebFacesConfigDescriptor>> list = new ArrayList<FacesConfigProtectedViewsType<WebFacesConfigDescriptor>>();
      List<Node> nodeList = model.get("protected-views");
      for(Node node: nodeList)
      {
         FacesConfigProtectedViewsType<WebFacesConfigDescriptor>  type = new FacesConfigProtectedViewsTypeImpl<WebFacesConfigDescriptor>(this, "protected-views", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>protected-views</code> elements 
    * @return the current instance of <code>FacesConfigProtectedViewsType<WebFacesConfigDescriptor></code> 
    */
   public WebFacesConfigDescriptor removeAllProtectedViews()
   {
      model.removeChildren("protected-views");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFacesConfigDescriptor ElementName: javaee:faces-config-referenced-beanType ElementType : referenced-bean
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>referenced-bean</code> element will be created and returned.
    * Otherwise, the first existing <code>referenced-bean</code> element will be returned.
    * @return the instance defined for the element <code>referenced-bean</code> 
    */
   public FacesConfigReferencedBeanType<WebFacesConfigDescriptor> getOrCreateReferencedBean()
   {
      List<Node> nodeList = model.get("referenced-bean");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new FacesConfigReferencedBeanTypeImpl<WebFacesConfigDescriptor>(this, "referenced-bean", model, nodeList.get(0));
      }
      return createReferencedBean();
   }

   /**
    * Creates a new <code>referenced-bean</code> element 
    * @return the new created instance of <code>FacesConfigReferencedBeanType<WebFacesConfigDescriptor></code> 
    */
   public FacesConfigReferencedBeanType<WebFacesConfigDescriptor> createReferencedBean()
   {
      return new FacesConfigReferencedBeanTypeImpl<WebFacesConfigDescriptor>(this, "referenced-bean", model);
   }

   /**
    * Returns all <code>referenced-bean</code> elements
    * @return list of <code>referenced-bean</code> 
    */
   public List<FacesConfigReferencedBeanType<WebFacesConfigDescriptor>> getAllReferencedBean()
   {
      List<FacesConfigReferencedBeanType<WebFacesConfigDescriptor>> list = new ArrayList<FacesConfigReferencedBeanType<WebFacesConfigDescriptor>>();
      List<Node> nodeList = model.get("referenced-bean");
      for(Node node: nodeList)
      {
         FacesConfigReferencedBeanType<WebFacesConfigDescriptor>  type = new FacesConfigReferencedBeanTypeImpl<WebFacesConfigDescriptor>(this, "referenced-bean", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>referenced-bean</code> elements 
    * @return the current instance of <code>FacesConfigReferencedBeanType<WebFacesConfigDescriptor></code> 
    */
   public WebFacesConfigDescriptor removeAllReferencedBean()
   {
      model.removeChildren("referenced-bean");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFacesConfigDescriptor ElementName: javaee:faces-config-render-kitType ElementType : render-kit
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>render-kit</code> element will be created and returned.
    * Otherwise, the first existing <code>render-kit</code> element will be returned.
    * @return the instance defined for the element <code>render-kit</code> 
    */
   public FacesConfigRenderKitType<WebFacesConfigDescriptor> getOrCreateRenderKit()
   {
      List<Node> nodeList = model.get("render-kit");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new FacesConfigRenderKitTypeImpl<WebFacesConfigDescriptor>(this, "render-kit", model, nodeList.get(0));
      }
      return createRenderKit();
   }

   /**
    * Creates a new <code>render-kit</code> element 
    * @return the new created instance of <code>FacesConfigRenderKitType<WebFacesConfigDescriptor></code> 
    */
   public FacesConfigRenderKitType<WebFacesConfigDescriptor> createRenderKit()
   {
      return new FacesConfigRenderKitTypeImpl<WebFacesConfigDescriptor>(this, "render-kit", model);
   }

   /**
    * Returns all <code>render-kit</code> elements
    * @return list of <code>render-kit</code> 
    */
   public List<FacesConfigRenderKitType<WebFacesConfigDescriptor>> getAllRenderKit()
   {
      List<FacesConfigRenderKitType<WebFacesConfigDescriptor>> list = new ArrayList<FacesConfigRenderKitType<WebFacesConfigDescriptor>>();
      List<Node> nodeList = model.get("render-kit");
      for(Node node: nodeList)
      {
         FacesConfigRenderKitType<WebFacesConfigDescriptor>  type = new FacesConfigRenderKitTypeImpl<WebFacesConfigDescriptor>(this, "render-kit", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>render-kit</code> elements 
    * @return the current instance of <code>FacesConfigRenderKitType<WebFacesConfigDescriptor></code> 
    */
   public WebFacesConfigDescriptor removeAllRenderKit()
   {
      model.removeChildren("render-kit");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFacesConfigDescriptor ElementName: javaee:faces-config-lifecycleType ElementType : lifecycle
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>lifecycle</code> element will be created and returned.
    * Otherwise, the first existing <code>lifecycle</code> element will be returned.
    * @return the instance defined for the element <code>lifecycle</code> 
    */
   public FacesConfigLifecycleType<WebFacesConfigDescriptor> getOrCreateLifecycle()
   {
      List<Node> nodeList = model.get("lifecycle");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new FacesConfigLifecycleTypeImpl<WebFacesConfigDescriptor>(this, "lifecycle", model, nodeList.get(0));
      }
      return createLifecycle();
   }

   /**
    * Creates a new <code>lifecycle</code> element 
    * @return the new created instance of <code>FacesConfigLifecycleType<WebFacesConfigDescriptor></code> 
    */
   public FacesConfigLifecycleType<WebFacesConfigDescriptor> createLifecycle()
   {
      return new FacesConfigLifecycleTypeImpl<WebFacesConfigDescriptor>(this, "lifecycle", model);
   }

   /**
    * Returns all <code>lifecycle</code> elements
    * @return list of <code>lifecycle</code> 
    */
   public List<FacesConfigLifecycleType<WebFacesConfigDescriptor>> getAllLifecycle()
   {
      List<FacesConfigLifecycleType<WebFacesConfigDescriptor>> list = new ArrayList<FacesConfigLifecycleType<WebFacesConfigDescriptor>>();
      List<Node> nodeList = model.get("lifecycle");
      for(Node node: nodeList)
      {
         FacesConfigLifecycleType<WebFacesConfigDescriptor>  type = new FacesConfigLifecycleTypeImpl<WebFacesConfigDescriptor>(this, "lifecycle", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>lifecycle</code> elements 
    * @return the current instance of <code>FacesConfigLifecycleType<WebFacesConfigDescriptor></code> 
    */
   public WebFacesConfigDescriptor removeAllLifecycle()
   {
      model.removeChildren("lifecycle");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFacesConfigDescriptor ElementName: javaee:faces-config-validatorType ElementType : validator
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>validator</code> element will be created and returned.
    * Otherwise, the first existing <code>validator</code> element will be returned.
    * @return the instance defined for the element <code>validator</code> 
    */
   public FacesConfigValidatorType<WebFacesConfigDescriptor> getOrCreateValidator()
   {
      List<Node> nodeList = model.get("validator");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new FacesConfigValidatorTypeImpl<WebFacesConfigDescriptor>(this, "validator", model, nodeList.get(0));
      }
      return createValidator();
   }

   /**
    * Creates a new <code>validator</code> element 
    * @return the new created instance of <code>FacesConfigValidatorType<WebFacesConfigDescriptor></code> 
    */
   public FacesConfigValidatorType<WebFacesConfigDescriptor> createValidator()
   {
      return new FacesConfigValidatorTypeImpl<WebFacesConfigDescriptor>(this, "validator", model);
   }

   /**
    * Returns all <code>validator</code> elements
    * @return list of <code>validator</code> 
    */
   public List<FacesConfigValidatorType<WebFacesConfigDescriptor>> getAllValidator()
   {
      List<FacesConfigValidatorType<WebFacesConfigDescriptor>> list = new ArrayList<FacesConfigValidatorType<WebFacesConfigDescriptor>>();
      List<Node> nodeList = model.get("validator");
      for(Node node: nodeList)
      {
         FacesConfigValidatorType<WebFacesConfigDescriptor>  type = new FacesConfigValidatorTypeImpl<WebFacesConfigDescriptor>(this, "validator", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>validator</code> elements 
    * @return the current instance of <code>FacesConfigValidatorType<WebFacesConfigDescriptor></code> 
    */
   public WebFacesConfigDescriptor removeAllValidator()
   {
      model.removeChildren("validator");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFacesConfigDescriptor ElementName: javaee:faces-config-behaviorType ElementType : behavior
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>behavior</code> element will be created and returned.
    * Otherwise, the first existing <code>behavior</code> element will be returned.
    * @return the instance defined for the element <code>behavior</code> 
    */
   public FacesConfigBehaviorType<WebFacesConfigDescriptor> getOrCreateBehavior()
   {
      List<Node> nodeList = model.get("behavior");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new FacesConfigBehaviorTypeImpl<WebFacesConfigDescriptor>(this, "behavior", model, nodeList.get(0));
      }
      return createBehavior();
   }

   /**
    * Creates a new <code>behavior</code> element 
    * @return the new created instance of <code>FacesConfigBehaviorType<WebFacesConfigDescriptor></code> 
    */
   public FacesConfigBehaviorType<WebFacesConfigDescriptor> createBehavior()
   {
      return new FacesConfigBehaviorTypeImpl<WebFacesConfigDescriptor>(this, "behavior", model);
   }

   /**
    * Returns all <code>behavior</code> elements
    * @return list of <code>behavior</code> 
    */
   public List<FacesConfigBehaviorType<WebFacesConfigDescriptor>> getAllBehavior()
   {
      List<FacesConfigBehaviorType<WebFacesConfigDescriptor>> list = new ArrayList<FacesConfigBehaviorType<WebFacesConfigDescriptor>>();
      List<Node> nodeList = model.get("behavior");
      for(Node node: nodeList)
      {
         FacesConfigBehaviorType<WebFacesConfigDescriptor>  type = new FacesConfigBehaviorTypeImpl<WebFacesConfigDescriptor>(this, "behavior", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>behavior</code> elements 
    * @return the current instance of <code>FacesConfigBehaviorType<WebFacesConfigDescriptor></code> 
    */
   public WebFacesConfigDescriptor removeAllBehavior()
   {
      model.removeChildren("behavior");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFacesConfigDescriptor ElementName: javaee:faces-config-extensionType ElementType : faces-config-extension
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>faces-config-extension</code> element 
    * @return the current instance of <code>WebFacesConfigDescriptor</code> 
    */
   public WebFacesConfigDescriptor facesConfigExtension()
   {
      model.getOrCreate("faces-config-extension");
      return this;
   }

   /**
    * Removes the <code>faces-config-extension</code> element 
    * @return the current instance of <code>WebFacesConfigDescriptor</code> 
    */
   public Boolean isFacesConfigExtension()
   {
      return model.getSingle("faces-config-extension") != null;
   }

   /**
    * Removes the <code>faces-config-extension</code> element 
    * @return the current instance of <code>WebFacesConfigDescriptor</code> 
    */
   public WebFacesConfigDescriptor removeFacesConfigExtension()
   {
      model.removeChild("faces-config-extension");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFacesConfigDescriptor ElementName: xsd:boolean ElementType : metadata-complete
   // MaxOccurs: -  isGeneric: false   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>metadata-complete</code> attribute
    * @param metadataComplete the value for the attribute <code>metadata-complete</code> 
    * @return the current instance of <code>WebFacesConfigDescriptor</code> 
    */
   public WebFacesConfigDescriptor metadataComplete(Boolean metadataComplete)
   {
      model.attribute("metadata-complete", metadataComplete);
      return this;
   }

   /**
    * Returns the <code>metadata-complete</code> attribute
    * @return the value defined for the attribute <code>metadata-complete</code> 
    */
   public Boolean isMetadataComplete()
   {
      return Strings.isTrue(model.getAttribute("metadata-complete"));
   }

   /**
    * Removes the <code>metadata-complete</code> attribute 
    * @return the current instance of <code>WebFacesConfigDescriptor</code> 
    */
   public WebFacesConfigDescriptor removeMetadataComplete()
   {
      model.removeAttribute("metadata-complete");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFacesConfigDescriptor ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: false   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>WebFacesConfigDescriptor</code> 
    */
   public WebFacesConfigDescriptor id(String id)
   {
      model.attribute("id", id);
      return this;
   }

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
      public String getId()
   {
      return model.getAttribute("id");
   }

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>WebFacesConfigDescriptor</code> 
    */
   public WebFacesConfigDescriptor removeId()
   {
      model.removeAttribute("id");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFacesConfigDescriptor ElementName: javaee:faces-config-versionType ElementType : version
   // MaxOccurs: -  isGeneric: false   isAttribute: true isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of <code>WebFacesConfigDescriptor</code> 
    */
   public WebFacesConfigDescriptor version(FacesConfigVersionType version)
   {
      model.attribute("version", version);
      return this;
   }

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of <code>WebFacesConfigDescriptor</code> 
    */
   public WebFacesConfigDescriptor version(String version)
   {
      model.attribute("version", version);
      return this;
   }

   /**
    * Returns the <code>version</code> attribute
    * @return the value defined for the attribute <code>version</code> 
    */
   public FacesConfigVersionType getVersion()
   {
      return FacesConfigVersionType.getFromStringValue(model.getAttribute("version"));
   }

   /**
    * Returns the <code>version</code> attribute
    * @return the value found for the element <code>version</code> 
    */
   public String  getVersionAsString()
   {
      return model.getAttribute("version");
   }

   /**
    * Removes the <code>version</code> attribute 
    * @return the current instance of <code>WebFacesConfigDescriptor</code> 
    */
   public WebFacesConfigDescriptor removeVersion()
   {
      model.removeAttribute("version");
      return this;
   }

}
