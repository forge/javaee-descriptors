package org.jboss.shrinkwrap.descriptor.impl.portletapp20; 

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

import org.jboss.shrinkwrap.descriptor.api.DescriptorNamespace;
import org.jboss.shrinkwrap.descriptor.api.portletapp20.ContainerRuntimeOptionType;
import org.jboss.shrinkwrap.descriptor.api.portletapp20.CustomPortletModeType;
import org.jboss.shrinkwrap.descriptor.api.portletapp20.CustomWindowStateType;
import org.jboss.shrinkwrap.descriptor.api.portletapp20.EventDefinitionType;
import org.jboss.shrinkwrap.descriptor.api.portletapp20.FilterMappingType;
import org.jboss.shrinkwrap.descriptor.api.portletapp20.FilterType;
import org.jboss.shrinkwrap.descriptor.api.portletapp20.ListenerType;
import org.jboss.shrinkwrap.descriptor.api.portletapp20.PortletDescriptor;
import org.jboss.shrinkwrap.descriptor.api.portletapp20.PortletType;
import org.jboss.shrinkwrap.descriptor.api.portletapp20.PublicRenderParameterType;
import org.jboss.shrinkwrap.descriptor.api.portletapp20.SecurityConstraintType;
import org.jboss.shrinkwrap.descriptor.api.portletapp20.UserAttributeType;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.spi.node.NodeDescriptorImplBase;

/** 
 * <p> 
 * This deployment descriptor provides the functionalities as described in the  specification
 * <p> 
 * Example:
 * <p> 
 * <code> 
 *     PortletDescriptor descriptor = Descriptors.create(PortletDescriptor.class);
 * </code> 
 *
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class PortletDescriptorImpl extends NodeDescriptorImplBase implements DescriptorNamespace<PortletDescriptor>, PortletDescriptor
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private Node model;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public PortletDescriptorImpl(String descriptorName)
   {
       this(descriptorName, new Node("portlet-app"));
   }

   public PortletDescriptorImpl(String descriptorName, Node node)
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
    * @return the current instance of <code>PortletDescriptor</code> 
    */
   public PortletDescriptor addDefaultNamespaces()
   {
      addNamespace("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
      addNamespace("xsi:schemaLocation", "http://java.sun.com/xml/ns/portlet/portlet-app_2_0.xsd http://java.sun.com/xml/ns/portlet/portlet-app_2_0.xsd");
      addNamespace("xmlns", "http://java.sun.com/xml/ns/portlet/portlet-app_2_0.xsd");
     return this;
   }

   /**
    * Adds a new namespace 
    * @return the current instance of <code>PortletDescriptor</code> 
    */
   public PortletDescriptor addNamespace(String name, String value)
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
    * @return the current instance of <code>PortletDescriptor</code> 
    */
   public PortletDescriptor removeAllNamespaces()
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
   // ClassName: PortletDescriptor ElementName: portlet:portletType ElementType : portlet
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>portlet</code> element will be created and returned.
    * Otherwise, the first existing <code>portlet</code> element will be returned.
    * @return the instance defined for the element <code>portlet</code> 
    */
   public PortletType<PortletDescriptor> getOrCreatePortlet()
   {
      List<Node> nodeList = model.get("portlet");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new PortletTypeImpl<PortletDescriptor>(this, "portlet", model, nodeList.get(0));
      }
      return createPortlet();
   }

   /**
    * Creates a new <code>portlet</code> element 
    * @return the new created instance of <code>PortletType<PortletDescriptor></code> 
    */
   public PortletType<PortletDescriptor> createPortlet()
   {
      return new PortletTypeImpl<PortletDescriptor>(this, "portlet", model);
   }

   /**
    * Returns all <code>portlet</code> elements
    * @return list of <code>portlet</code> 
    */
   public List<PortletType<PortletDescriptor>> getAllPortlet()
   {
      List<PortletType<PortletDescriptor>> list = new ArrayList<PortletType<PortletDescriptor>>();
      List<Node> nodeList = model.get("portlet");
      for(Node node: nodeList)
      {
         PortletType<PortletDescriptor>  type = new PortletTypeImpl<PortletDescriptor>(this, "portlet", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>portlet</code> elements 
    * @return the current instance of <code>PortletType<PortletDescriptor></code> 
    */
   public PortletDescriptor removeAllPortlet()
   {
      model.removeChildren("portlet");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletDescriptor ElementName: portlet:custom-portlet-modeType ElementType : custom-portlet-mode
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>custom-portlet-mode</code> element will be created and returned.
    * Otherwise, the first existing <code>custom-portlet-mode</code> element will be returned.
    * @return the instance defined for the element <code>custom-portlet-mode</code> 
    */
   public CustomPortletModeType<PortletDescriptor> getOrCreateCustomPortletMode()
   {
      List<Node> nodeList = model.get("custom-portlet-mode");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new CustomPortletModeTypeImpl<PortletDescriptor>(this, "custom-portlet-mode", model, nodeList.get(0));
      }
      return createCustomPortletMode();
   }

   /**
    * Creates a new <code>custom-portlet-mode</code> element 
    * @return the new created instance of <code>CustomPortletModeType<PortletDescriptor></code> 
    */
   public CustomPortletModeType<PortletDescriptor> createCustomPortletMode()
   {
      return new CustomPortletModeTypeImpl<PortletDescriptor>(this, "custom-portlet-mode", model);
   }

   /**
    * Returns all <code>custom-portlet-mode</code> elements
    * @return list of <code>custom-portlet-mode</code> 
    */
   public List<CustomPortletModeType<PortletDescriptor>> getAllCustomPortletMode()
   {
      List<CustomPortletModeType<PortletDescriptor>> list = new ArrayList<CustomPortletModeType<PortletDescriptor>>();
      List<Node> nodeList = model.get("custom-portlet-mode");
      for(Node node: nodeList)
      {
         CustomPortletModeType<PortletDescriptor>  type = new CustomPortletModeTypeImpl<PortletDescriptor>(this, "custom-portlet-mode", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>custom-portlet-mode</code> elements 
    * @return the current instance of <code>CustomPortletModeType<PortletDescriptor></code> 
    */
   public PortletDescriptor removeAllCustomPortletMode()
   {
      model.removeChildren("custom-portlet-mode");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletDescriptor ElementName: portlet:custom-window-stateType ElementType : custom-window-state
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>custom-window-state</code> element will be created and returned.
    * Otherwise, the first existing <code>custom-window-state</code> element will be returned.
    * @return the instance defined for the element <code>custom-window-state</code> 
    */
   public CustomWindowStateType<PortletDescriptor> getOrCreateCustomWindowState()
   {
      List<Node> nodeList = model.get("custom-window-state");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new CustomWindowStateTypeImpl<PortletDescriptor>(this, "custom-window-state", model, nodeList.get(0));
      }
      return createCustomWindowState();
   }

   /**
    * Creates a new <code>custom-window-state</code> element 
    * @return the new created instance of <code>CustomWindowStateType<PortletDescriptor></code> 
    */
   public CustomWindowStateType<PortletDescriptor> createCustomWindowState()
   {
      return new CustomWindowStateTypeImpl<PortletDescriptor>(this, "custom-window-state", model);
   }

   /**
    * Returns all <code>custom-window-state</code> elements
    * @return list of <code>custom-window-state</code> 
    */
   public List<CustomWindowStateType<PortletDescriptor>> getAllCustomWindowState()
   {
      List<CustomWindowStateType<PortletDescriptor>> list = new ArrayList<CustomWindowStateType<PortletDescriptor>>();
      List<Node> nodeList = model.get("custom-window-state");
      for(Node node: nodeList)
      {
         CustomWindowStateType<PortletDescriptor>  type = new CustomWindowStateTypeImpl<PortletDescriptor>(this, "custom-window-state", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>custom-window-state</code> elements 
    * @return the current instance of <code>CustomWindowStateType<PortletDescriptor></code> 
    */
   public PortletDescriptor removeAllCustomWindowState()
   {
      model.removeChildren("custom-window-state");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletDescriptor ElementName: portlet:user-attributeType ElementType : user-attribute
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>user-attribute</code> element will be created and returned.
    * Otherwise, the first existing <code>user-attribute</code> element will be returned.
    * @return the instance defined for the element <code>user-attribute</code> 
    */
   public UserAttributeType<PortletDescriptor> getOrCreateUserAttribute()
   {
      List<Node> nodeList = model.get("user-attribute");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new UserAttributeTypeImpl<PortletDescriptor>(this, "user-attribute", model, nodeList.get(0));
      }
      return createUserAttribute();
   }

   /**
    * Creates a new <code>user-attribute</code> element 
    * @return the new created instance of <code>UserAttributeType<PortletDescriptor></code> 
    */
   public UserAttributeType<PortletDescriptor> createUserAttribute()
   {
      return new UserAttributeTypeImpl<PortletDescriptor>(this, "user-attribute", model);
   }

   /**
    * Returns all <code>user-attribute</code> elements
    * @return list of <code>user-attribute</code> 
    */
   public List<UserAttributeType<PortletDescriptor>> getAllUserAttribute()
   {
      List<UserAttributeType<PortletDescriptor>> list = new ArrayList<UserAttributeType<PortletDescriptor>>();
      List<Node> nodeList = model.get("user-attribute");
      for(Node node: nodeList)
      {
         UserAttributeType<PortletDescriptor>  type = new UserAttributeTypeImpl<PortletDescriptor>(this, "user-attribute", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>user-attribute</code> elements 
    * @return the current instance of <code>UserAttributeType<PortletDescriptor></code> 
    */
   public PortletDescriptor removeAllUserAttribute()
   {
      model.removeChildren("user-attribute");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletDescriptor ElementName: portlet:security-constraintType ElementType : security-constraint
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>security-constraint</code> element will be created and returned.
    * Otherwise, the first existing <code>security-constraint</code> element will be returned.
    * @return the instance defined for the element <code>security-constraint</code> 
    */
   public SecurityConstraintType<PortletDescriptor> getOrCreateSecurityConstraint()
   {
      List<Node> nodeList = model.get("security-constraint");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new SecurityConstraintTypeImpl<PortletDescriptor>(this, "security-constraint", model, nodeList.get(0));
      }
      return createSecurityConstraint();
   }

   /**
    * Creates a new <code>security-constraint</code> element 
    * @return the new created instance of <code>SecurityConstraintType<PortletDescriptor></code> 
    */
   public SecurityConstraintType<PortletDescriptor> createSecurityConstraint()
   {
      return new SecurityConstraintTypeImpl<PortletDescriptor>(this, "security-constraint", model);
   }

   /**
    * Returns all <code>security-constraint</code> elements
    * @return list of <code>security-constraint</code> 
    */
   public List<SecurityConstraintType<PortletDescriptor>> getAllSecurityConstraint()
   {
      List<SecurityConstraintType<PortletDescriptor>> list = new ArrayList<SecurityConstraintType<PortletDescriptor>>();
      List<Node> nodeList = model.get("security-constraint");
      for(Node node: nodeList)
      {
         SecurityConstraintType<PortletDescriptor>  type = new SecurityConstraintTypeImpl<PortletDescriptor>(this, "security-constraint", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>security-constraint</code> elements 
    * @return the current instance of <code>SecurityConstraintType<PortletDescriptor></code> 
    */
   public PortletDescriptor removeAllSecurityConstraint()
   {
      model.removeChildren("security-constraint");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletDescriptor ElementName: string ElementType : resource-bundle
   // MaxOccurs: -  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>resource-bundle</code> element
    * @param resourceBundle the value for the element <code>resource-bundle</code> 
    * @return the current instance of <code>PortletDescriptor</code> 
    */
   public PortletDescriptor resourceBundle(String resourceBundle)
   {
      model.getOrCreate("resource-bundle").text(resourceBundle);
      return this;
   }

   /**
    * Returns the <code>resource-bundle</code> element
    * @return the node defined for the element <code>resource-bundle</code> 
    */
   public String getResourceBundle()
   {
      return model.getTextValueForPatternName("resource-bundle");
   }

   /**
    * Removes the <code>resource-bundle</code> element 
    * @return the current instance of <code>PortletDescriptor</code> 
    */
   public PortletDescriptor removeResourceBundle()
   {
      model.removeChildren("resource-bundle");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletDescriptor ElementName: portlet:filterType ElementType : filter
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>filter</code> element will be created and returned.
    * Otherwise, the first existing <code>filter</code> element will be returned.
    * @return the instance defined for the element <code>filter</code> 
    */
   public FilterType<PortletDescriptor> getOrCreateFilter()
   {
      List<Node> nodeList = model.get("filter");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new FilterTypeImpl<PortletDescriptor>(this, "filter", model, nodeList.get(0));
      }
      return createFilter();
   }

   /**
    * Creates a new <code>filter</code> element 
    * @return the new created instance of <code>FilterType<PortletDescriptor></code> 
    */
   public FilterType<PortletDescriptor> createFilter()
   {
      return new FilterTypeImpl<PortletDescriptor>(this, "filter", model);
   }

   /**
    * Returns all <code>filter</code> elements
    * @return list of <code>filter</code> 
    */
   public List<FilterType<PortletDescriptor>> getAllFilter()
   {
      List<FilterType<PortletDescriptor>> list = new ArrayList<FilterType<PortletDescriptor>>();
      List<Node> nodeList = model.get("filter");
      for(Node node: nodeList)
      {
         FilterType<PortletDescriptor>  type = new FilterTypeImpl<PortletDescriptor>(this, "filter", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>filter</code> elements 
    * @return the current instance of <code>FilterType<PortletDescriptor></code> 
    */
   public PortletDescriptor removeAllFilter()
   {
      model.removeChildren("filter");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletDescriptor ElementName: portlet:filter-mappingType ElementType : filter-mapping
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>filter-mapping</code> element will be created and returned.
    * Otherwise, the first existing <code>filter-mapping</code> element will be returned.
    * @return the instance defined for the element <code>filter-mapping</code> 
    */
   public FilterMappingType<PortletDescriptor> getOrCreateFilterMapping()
   {
      List<Node> nodeList = model.get("filter-mapping");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new FilterMappingTypeImpl<PortletDescriptor>(this, "filter-mapping", model, nodeList.get(0));
      }
      return createFilterMapping();
   }

   /**
    * Creates a new <code>filter-mapping</code> element 
    * @return the new created instance of <code>FilterMappingType<PortletDescriptor></code> 
    */
   public FilterMappingType<PortletDescriptor> createFilterMapping()
   {
      return new FilterMappingTypeImpl<PortletDescriptor>(this, "filter-mapping", model);
   }

   /**
    * Returns all <code>filter-mapping</code> elements
    * @return list of <code>filter-mapping</code> 
    */
   public List<FilterMappingType<PortletDescriptor>> getAllFilterMapping()
   {
      List<FilterMappingType<PortletDescriptor>> list = new ArrayList<FilterMappingType<PortletDescriptor>>();
      List<Node> nodeList = model.get("filter-mapping");
      for(Node node: nodeList)
      {
         FilterMappingType<PortletDescriptor>  type = new FilterMappingTypeImpl<PortletDescriptor>(this, "filter-mapping", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>filter-mapping</code> elements 
    * @return the current instance of <code>FilterMappingType<PortletDescriptor></code> 
    */
   public PortletDescriptor removeAllFilterMapping()
   {
      model.removeChildren("filter-mapping");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletDescriptor ElementName: xsd:anyURI ElementType : default-namespace
   // MaxOccurs: -  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>default-namespace</code> element
    * @param defaultNamespace the value for the element <code>default-namespace</code> 
    * @return the current instance of <code>PortletDescriptor</code> 
    */
   public PortletDescriptor defaultNamespace(String defaultNamespace)
   {
      model.getOrCreate("default-namespace").text(defaultNamespace);
      return this;
   }

   /**
    * Returns the <code>default-namespace</code> element
    * @return the node defined for the element <code>default-namespace</code> 
    */
   public String getDefaultNamespace()
   {
      return model.getTextValueForPatternName("default-namespace");
   }

   /**
    * Removes the <code>default-namespace</code> element 
    * @return the current instance of <code>PortletDescriptor</code> 
    */
   public PortletDescriptor removeDefaultNamespace()
   {
      model.removeChildren("default-namespace");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletDescriptor ElementName: portlet:event-definitionType ElementType : event-definition
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>event-definition</code> element will be created and returned.
    * Otherwise, the first existing <code>event-definition</code> element will be returned.
    * @return the instance defined for the element <code>event-definition</code> 
    */
   public EventDefinitionType<PortletDescriptor> getOrCreateEventDefinition()
   {
      List<Node> nodeList = model.get("event-definition");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new EventDefinitionTypeImpl<PortletDescriptor>(this, "event-definition", model, nodeList.get(0));
      }
      return createEventDefinition();
   }

   /**
    * Creates a new <code>event-definition</code> element 
    * @return the new created instance of <code>EventDefinitionType<PortletDescriptor></code> 
    */
   public EventDefinitionType<PortletDescriptor> createEventDefinition()
   {
      return new EventDefinitionTypeImpl<PortletDescriptor>(this, "event-definition", model);
   }

   /**
    * Returns all <code>event-definition</code> elements
    * @return list of <code>event-definition</code> 
    */
   public List<EventDefinitionType<PortletDescriptor>> getAllEventDefinition()
   {
      List<EventDefinitionType<PortletDescriptor>> list = new ArrayList<EventDefinitionType<PortletDescriptor>>();
      List<Node> nodeList = model.get("event-definition");
      for(Node node: nodeList)
      {
         EventDefinitionType<PortletDescriptor>  type = new EventDefinitionTypeImpl<PortletDescriptor>(this, "event-definition", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>event-definition</code> elements 
    * @return the current instance of <code>EventDefinitionType<PortletDescriptor></code> 
    */
   public PortletDescriptor removeAllEventDefinition()
   {
      model.removeChildren("event-definition");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletDescriptor ElementName: portlet:public-render-parameterType ElementType : public-render-parameter
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>public-render-parameter</code> element will be created and returned.
    * Otherwise, the first existing <code>public-render-parameter</code> element will be returned.
    * @return the instance defined for the element <code>public-render-parameter</code> 
    */
   public PublicRenderParameterType<PortletDescriptor> getOrCreatePublicRenderParameter()
   {
      List<Node> nodeList = model.get("public-render-parameter");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new PublicRenderParameterTypeImpl<PortletDescriptor>(this, "public-render-parameter", model, nodeList.get(0));
      }
      return createPublicRenderParameter();
   }

   /**
    * Creates a new <code>public-render-parameter</code> element 
    * @return the new created instance of <code>PublicRenderParameterType<PortletDescriptor></code> 
    */
   public PublicRenderParameterType<PortletDescriptor> createPublicRenderParameter()
   {
      return new PublicRenderParameterTypeImpl<PortletDescriptor>(this, "public-render-parameter", model);
   }

   /**
    * Returns all <code>public-render-parameter</code> elements
    * @return list of <code>public-render-parameter</code> 
    */
   public List<PublicRenderParameterType<PortletDescriptor>> getAllPublicRenderParameter()
   {
      List<PublicRenderParameterType<PortletDescriptor>> list = new ArrayList<PublicRenderParameterType<PortletDescriptor>>();
      List<Node> nodeList = model.get("public-render-parameter");
      for(Node node: nodeList)
      {
         PublicRenderParameterType<PortletDescriptor>  type = new PublicRenderParameterTypeImpl<PortletDescriptor>(this, "public-render-parameter", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>public-render-parameter</code> elements 
    * @return the current instance of <code>PublicRenderParameterType<PortletDescriptor></code> 
    */
   public PortletDescriptor removeAllPublicRenderParameter()
   {
      model.removeChildren("public-render-parameter");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletDescriptor ElementName: portlet:listenerType ElementType : listener
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>listener</code> element will be created and returned.
    * Otherwise, the first existing <code>listener</code> element will be returned.
    * @return the instance defined for the element <code>listener</code> 
    */
   public ListenerType<PortletDescriptor> getOrCreateListener()
   {
      List<Node> nodeList = model.get("listener");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ListenerTypeImpl<PortletDescriptor>(this, "listener", model, nodeList.get(0));
      }
      return createListener();
   }

   /**
    * Creates a new <code>listener</code> element 
    * @return the new created instance of <code>ListenerType<PortletDescriptor></code> 
    */
   public ListenerType<PortletDescriptor> createListener()
   {
      return new ListenerTypeImpl<PortletDescriptor>(this, "listener", model);
   }

   /**
    * Returns all <code>listener</code> elements
    * @return list of <code>listener</code> 
    */
   public List<ListenerType<PortletDescriptor>> getAllListener()
   {
      List<ListenerType<PortletDescriptor>> list = new ArrayList<ListenerType<PortletDescriptor>>();
      List<Node> nodeList = model.get("listener");
      for(Node node: nodeList)
      {
         ListenerType<PortletDescriptor>  type = new ListenerTypeImpl<PortletDescriptor>(this, "listener", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>listener</code> elements 
    * @return the current instance of <code>ListenerType<PortletDescriptor></code> 
    */
   public PortletDescriptor removeAllListener()
   {
      model.removeChildren("listener");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletDescriptor ElementName: portlet:container-runtime-optionType ElementType : container-runtime-option
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>container-runtime-option</code> element will be created and returned.
    * Otherwise, the first existing <code>container-runtime-option</code> element will be returned.
    * @return the instance defined for the element <code>container-runtime-option</code> 
    */
   public ContainerRuntimeOptionType<PortletDescriptor> getOrCreateContainerRuntimeOption()
   {
      List<Node> nodeList = model.get("container-runtime-option");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ContainerRuntimeOptionTypeImpl<PortletDescriptor>(this, "container-runtime-option", model, nodeList.get(0));
      }
      return createContainerRuntimeOption();
   }

   /**
    * Creates a new <code>container-runtime-option</code> element 
    * @return the new created instance of <code>ContainerRuntimeOptionType<PortletDescriptor></code> 
    */
   public ContainerRuntimeOptionType<PortletDescriptor> createContainerRuntimeOption()
   {
      return new ContainerRuntimeOptionTypeImpl<PortletDescriptor>(this, "container-runtime-option", model);
   }

   /**
    * Returns all <code>container-runtime-option</code> elements
    * @return list of <code>container-runtime-option</code> 
    */
   public List<ContainerRuntimeOptionType<PortletDescriptor>> getAllContainerRuntimeOption()
   {
      List<ContainerRuntimeOptionType<PortletDescriptor>> list = new ArrayList<ContainerRuntimeOptionType<PortletDescriptor>>();
      List<Node> nodeList = model.get("container-runtime-option");
      for(Node node: nodeList)
      {
         ContainerRuntimeOptionType<PortletDescriptor>  type = new ContainerRuntimeOptionTypeImpl<PortletDescriptor>(this, "container-runtime-option", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>container-runtime-option</code> elements 
    * @return the current instance of <code>ContainerRuntimeOptionType<PortletDescriptor></code> 
    */
   public PortletDescriptor removeAllContainerRuntimeOption()
   {
      model.removeChildren("container-runtime-option");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletDescriptor ElementName: string ElementType : version
   // MaxOccurs: -  isGeneric: false   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of <code>PortletDescriptor</code> 
    */
   public PortletDescriptor version(String version)
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
    * @return the current instance of <code>PortletDescriptor</code> 
    */
   public PortletDescriptor removeVersion()
   {
      model.removeAttribute("version");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletDescriptor ElementName: string ElementType : id
   // MaxOccurs: -  isGeneric: false   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>PortletDescriptor</code> 
    */
   public PortletDescriptor id(String id)
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
    * @return the current instance of <code>PortletDescriptor</code> 
    */
   public PortletDescriptor removeId()
   {
      model.removeAttribute("id");
      return this;
   }

}
