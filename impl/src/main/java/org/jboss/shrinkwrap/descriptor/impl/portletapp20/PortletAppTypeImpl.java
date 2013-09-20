package org.jboss.shrinkwrap.descriptor.impl.portletapp20; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.portletapp20.PortletAppType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.portletapp20.PortletType;
import org.jboss.shrinkwrap.descriptor.impl.portletapp20.PortletTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.portletapp20.CustomPortletModeType;
import org.jboss.shrinkwrap.descriptor.impl.portletapp20.CustomPortletModeTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.portletapp20.CustomWindowStateType;
import org.jboss.shrinkwrap.descriptor.impl.portletapp20.CustomWindowStateTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.portletapp20.UserAttributeType;
import org.jboss.shrinkwrap.descriptor.impl.portletapp20.UserAttributeTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.portletapp20.SecurityConstraintType;
import org.jboss.shrinkwrap.descriptor.impl.portletapp20.SecurityConstraintTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.portletapp20.FilterType;
import org.jboss.shrinkwrap.descriptor.impl.portletapp20.FilterTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.portletapp20.FilterMappingType;
import org.jboss.shrinkwrap.descriptor.impl.portletapp20.FilterMappingTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.portletapp20.EventDefinitionType;
import org.jboss.shrinkwrap.descriptor.impl.portletapp20.EventDefinitionTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.portletapp20.PublicRenderParameterType;
import org.jboss.shrinkwrap.descriptor.impl.portletapp20.PublicRenderParameterTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.portletapp20.ListenerType;
import org.jboss.shrinkwrap.descriptor.impl.portletapp20.ListenerTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.portletapp20.ContainerRuntimeOptionType;
import org.jboss.shrinkwrap.descriptor.impl.portletapp20.ContainerRuntimeOptionTypeImpl;

/**
 * This class implements the <code> portlet-appType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class PortletAppTypeImpl<T> implements Child<T>, PortletAppType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public PortletAppTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public PortletAppTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletAppType ElementName: portlet:portletType ElementType : portlet
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>portlet</code> element will be created and returned.
    * Otherwise, the first existing <code>portlet</code> element will be returned.
    * @return the instance defined for the element <code>portlet</code> 
    */
   public PortletType<PortletAppType<T>> getOrCreatePortlet()
   {
      List<Node> nodeList = childNode.get("portlet");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new PortletTypeImpl<PortletAppType<T>>(this, "portlet", childNode, nodeList.get(0));
      }
      return createPortlet();
   }

   /**
    * Creates a new <code>portlet</code> element 
    * @return the new created instance of <code>PortletType<PortletAppType<T>></code> 
    */
   public PortletType<PortletAppType<T>> createPortlet()
   {
      return new PortletTypeImpl<PortletAppType<T>>(this, "portlet", childNode);
   }

   /**
    * Returns all <code>portlet</code> elements
    * @return list of <code>portlet</code> 
    */
   public List<PortletType<PortletAppType<T>>> getAllPortlet()
   {
      List<PortletType<PortletAppType<T>>> list = new ArrayList<PortletType<PortletAppType<T>>>();
      List<Node> nodeList = childNode.get("portlet");
      for(Node node: nodeList)
      {
         PortletType<PortletAppType<T>>  type = new PortletTypeImpl<PortletAppType<T>>(this, "portlet", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>portlet</code> elements 
    * @return the current instance of <code>PortletType<PortletAppType<T>></code> 
    */
   public PortletAppType<T> removeAllPortlet()
   {
      childNode.removeChildren("portlet");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletAppType ElementName: portlet:custom-portlet-modeType ElementType : custom-portlet-mode
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>custom-portlet-mode</code> element will be created and returned.
    * Otherwise, the first existing <code>custom-portlet-mode</code> element will be returned.
    * @return the instance defined for the element <code>custom-portlet-mode</code> 
    */
   public CustomPortletModeType<PortletAppType<T>> getOrCreateCustomPortletMode()
   {
      List<Node> nodeList = childNode.get("custom-portlet-mode");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new CustomPortletModeTypeImpl<PortletAppType<T>>(this, "custom-portlet-mode", childNode, nodeList.get(0));
      }
      return createCustomPortletMode();
   }

   /**
    * Creates a new <code>custom-portlet-mode</code> element 
    * @return the new created instance of <code>CustomPortletModeType<PortletAppType<T>></code> 
    */
   public CustomPortletModeType<PortletAppType<T>> createCustomPortletMode()
   {
      return new CustomPortletModeTypeImpl<PortletAppType<T>>(this, "custom-portlet-mode", childNode);
   }

   /**
    * Returns all <code>custom-portlet-mode</code> elements
    * @return list of <code>custom-portlet-mode</code> 
    */
   public List<CustomPortletModeType<PortletAppType<T>>> getAllCustomPortletMode()
   {
      List<CustomPortletModeType<PortletAppType<T>>> list = new ArrayList<CustomPortletModeType<PortletAppType<T>>>();
      List<Node> nodeList = childNode.get("custom-portlet-mode");
      for(Node node: nodeList)
      {
         CustomPortletModeType<PortletAppType<T>>  type = new CustomPortletModeTypeImpl<PortletAppType<T>>(this, "custom-portlet-mode", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>custom-portlet-mode</code> elements 
    * @return the current instance of <code>CustomPortletModeType<PortletAppType<T>></code> 
    */
   public PortletAppType<T> removeAllCustomPortletMode()
   {
      childNode.removeChildren("custom-portlet-mode");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletAppType ElementName: portlet:custom-window-stateType ElementType : custom-window-state
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>custom-window-state</code> element will be created and returned.
    * Otherwise, the first existing <code>custom-window-state</code> element will be returned.
    * @return the instance defined for the element <code>custom-window-state</code> 
    */
   public CustomWindowStateType<PortletAppType<T>> getOrCreateCustomWindowState()
   {
      List<Node> nodeList = childNode.get("custom-window-state");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new CustomWindowStateTypeImpl<PortletAppType<T>>(this, "custom-window-state", childNode, nodeList.get(0));
      }
      return createCustomWindowState();
   }

   /**
    * Creates a new <code>custom-window-state</code> element 
    * @return the new created instance of <code>CustomWindowStateType<PortletAppType<T>></code> 
    */
   public CustomWindowStateType<PortletAppType<T>> createCustomWindowState()
   {
      return new CustomWindowStateTypeImpl<PortletAppType<T>>(this, "custom-window-state", childNode);
   }

   /**
    * Returns all <code>custom-window-state</code> elements
    * @return list of <code>custom-window-state</code> 
    */
   public List<CustomWindowStateType<PortletAppType<T>>> getAllCustomWindowState()
   {
      List<CustomWindowStateType<PortletAppType<T>>> list = new ArrayList<CustomWindowStateType<PortletAppType<T>>>();
      List<Node> nodeList = childNode.get("custom-window-state");
      for(Node node: nodeList)
      {
         CustomWindowStateType<PortletAppType<T>>  type = new CustomWindowStateTypeImpl<PortletAppType<T>>(this, "custom-window-state", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>custom-window-state</code> elements 
    * @return the current instance of <code>CustomWindowStateType<PortletAppType<T>></code> 
    */
   public PortletAppType<T> removeAllCustomWindowState()
   {
      childNode.removeChildren("custom-window-state");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletAppType ElementName: portlet:user-attributeType ElementType : user-attribute
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>user-attribute</code> element will be created and returned.
    * Otherwise, the first existing <code>user-attribute</code> element will be returned.
    * @return the instance defined for the element <code>user-attribute</code> 
    */
   public UserAttributeType<PortletAppType<T>> getOrCreateUserAttribute()
   {
      List<Node> nodeList = childNode.get("user-attribute");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new UserAttributeTypeImpl<PortletAppType<T>>(this, "user-attribute", childNode, nodeList.get(0));
      }
      return createUserAttribute();
   }

   /**
    * Creates a new <code>user-attribute</code> element 
    * @return the new created instance of <code>UserAttributeType<PortletAppType<T>></code> 
    */
   public UserAttributeType<PortletAppType<T>> createUserAttribute()
   {
      return new UserAttributeTypeImpl<PortletAppType<T>>(this, "user-attribute", childNode);
   }

   /**
    * Returns all <code>user-attribute</code> elements
    * @return list of <code>user-attribute</code> 
    */
   public List<UserAttributeType<PortletAppType<T>>> getAllUserAttribute()
   {
      List<UserAttributeType<PortletAppType<T>>> list = new ArrayList<UserAttributeType<PortletAppType<T>>>();
      List<Node> nodeList = childNode.get("user-attribute");
      for(Node node: nodeList)
      {
         UserAttributeType<PortletAppType<T>>  type = new UserAttributeTypeImpl<PortletAppType<T>>(this, "user-attribute", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>user-attribute</code> elements 
    * @return the current instance of <code>UserAttributeType<PortletAppType<T>></code> 
    */
   public PortletAppType<T> removeAllUserAttribute()
   {
      childNode.removeChildren("user-attribute");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletAppType ElementName: portlet:security-constraintType ElementType : security-constraint
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>security-constraint</code> element will be created and returned.
    * Otherwise, the first existing <code>security-constraint</code> element will be returned.
    * @return the instance defined for the element <code>security-constraint</code> 
    */
   public SecurityConstraintType<PortletAppType<T>> getOrCreateSecurityConstraint()
   {
      List<Node> nodeList = childNode.get("security-constraint");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new SecurityConstraintTypeImpl<PortletAppType<T>>(this, "security-constraint", childNode, nodeList.get(0));
      }
      return createSecurityConstraint();
   }

   /**
    * Creates a new <code>security-constraint</code> element 
    * @return the new created instance of <code>SecurityConstraintType<PortletAppType<T>></code> 
    */
   public SecurityConstraintType<PortletAppType<T>> createSecurityConstraint()
   {
      return new SecurityConstraintTypeImpl<PortletAppType<T>>(this, "security-constraint", childNode);
   }

   /**
    * Returns all <code>security-constraint</code> elements
    * @return list of <code>security-constraint</code> 
    */
   public List<SecurityConstraintType<PortletAppType<T>>> getAllSecurityConstraint()
   {
      List<SecurityConstraintType<PortletAppType<T>>> list = new ArrayList<SecurityConstraintType<PortletAppType<T>>>();
      List<Node> nodeList = childNode.get("security-constraint");
      for(Node node: nodeList)
      {
         SecurityConstraintType<PortletAppType<T>>  type = new SecurityConstraintTypeImpl<PortletAppType<T>>(this, "security-constraint", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>security-constraint</code> elements 
    * @return the current instance of <code>SecurityConstraintType<PortletAppType<T>></code> 
    */
   public PortletAppType<T> removeAllSecurityConstraint()
   {
      childNode.removeChildren("security-constraint");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletAppType ElementName: string ElementType : resource-bundle
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>resource-bundle</code> element
    * @param resourceBundle the value for the element <code>resource-bundle</code> 
    * @return the current instance of <code>PortletAppType<T></code> 
    */
   public PortletAppType<T> resourceBundle(String resourceBundle)
   {
      childNode.getOrCreate("resource-bundle").text(resourceBundle);
      return this;
   }

   /**
    * Returns the <code>resource-bundle</code> element
    * @return the node defined for the element <code>resource-bundle</code> 
    */
   public String getResourceBundle()
   {
      return childNode.getTextValueForPatternName("resource-bundle");
   }

   /**
    * Removes the <code>resource-bundle</code> element 
    * @return the current instance of <code>PortletAppType<T></code> 
    */
   public PortletAppType<T> removeResourceBundle()
   {
      childNode.removeChildren("resource-bundle");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletAppType ElementName: portlet:filterType ElementType : filter
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>filter</code> element will be created and returned.
    * Otherwise, the first existing <code>filter</code> element will be returned.
    * @return the instance defined for the element <code>filter</code> 
    */
   public FilterType<PortletAppType<T>> getOrCreateFilter()
   {
      List<Node> nodeList = childNode.get("filter");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new FilterTypeImpl<PortletAppType<T>>(this, "filter", childNode, nodeList.get(0));
      }
      return createFilter();
   }

   /**
    * Creates a new <code>filter</code> element 
    * @return the new created instance of <code>FilterType<PortletAppType<T>></code> 
    */
   public FilterType<PortletAppType<T>> createFilter()
   {
      return new FilterTypeImpl<PortletAppType<T>>(this, "filter", childNode);
   }

   /**
    * Returns all <code>filter</code> elements
    * @return list of <code>filter</code> 
    */
   public List<FilterType<PortletAppType<T>>> getAllFilter()
   {
      List<FilterType<PortletAppType<T>>> list = new ArrayList<FilterType<PortletAppType<T>>>();
      List<Node> nodeList = childNode.get("filter");
      for(Node node: nodeList)
      {
         FilterType<PortletAppType<T>>  type = new FilterTypeImpl<PortletAppType<T>>(this, "filter", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>filter</code> elements 
    * @return the current instance of <code>FilterType<PortletAppType<T>></code> 
    */
   public PortletAppType<T> removeAllFilter()
   {
      childNode.removeChildren("filter");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletAppType ElementName: portlet:filter-mappingType ElementType : filter-mapping
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>filter-mapping</code> element will be created and returned.
    * Otherwise, the first existing <code>filter-mapping</code> element will be returned.
    * @return the instance defined for the element <code>filter-mapping</code> 
    */
   public FilterMappingType<PortletAppType<T>> getOrCreateFilterMapping()
   {
      List<Node> nodeList = childNode.get("filter-mapping");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new FilterMappingTypeImpl<PortletAppType<T>>(this, "filter-mapping", childNode, nodeList.get(0));
      }
      return createFilterMapping();
   }

   /**
    * Creates a new <code>filter-mapping</code> element 
    * @return the new created instance of <code>FilterMappingType<PortletAppType<T>></code> 
    */
   public FilterMappingType<PortletAppType<T>> createFilterMapping()
   {
      return new FilterMappingTypeImpl<PortletAppType<T>>(this, "filter-mapping", childNode);
   }

   /**
    * Returns all <code>filter-mapping</code> elements
    * @return list of <code>filter-mapping</code> 
    */
   public List<FilterMappingType<PortletAppType<T>>> getAllFilterMapping()
   {
      List<FilterMappingType<PortletAppType<T>>> list = new ArrayList<FilterMappingType<PortletAppType<T>>>();
      List<Node> nodeList = childNode.get("filter-mapping");
      for(Node node: nodeList)
      {
         FilterMappingType<PortletAppType<T>>  type = new FilterMappingTypeImpl<PortletAppType<T>>(this, "filter-mapping", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>filter-mapping</code> elements 
    * @return the current instance of <code>FilterMappingType<PortletAppType<T>></code> 
    */
   public PortletAppType<T> removeAllFilterMapping()
   {
      childNode.removeChildren("filter-mapping");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletAppType ElementName: xsd:anyURI ElementType : default-namespace
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>default-namespace</code> element
    * @param defaultNamespace the value for the element <code>default-namespace</code> 
    * @return the current instance of <code>PortletAppType<T></code> 
    */
   public PortletAppType<T> defaultNamespace(String defaultNamespace)
   {
      childNode.getOrCreate("default-namespace").text(defaultNamespace);
      return this;
   }

   /**
    * Returns the <code>default-namespace</code> element
    * @return the node defined for the element <code>default-namespace</code> 
    */
   public String getDefaultNamespace()
   {
      return childNode.getTextValueForPatternName("default-namespace");
   }

   /**
    * Removes the <code>default-namespace</code> element 
    * @return the current instance of <code>PortletAppType<T></code> 
    */
   public PortletAppType<T> removeDefaultNamespace()
   {
      childNode.removeChildren("default-namespace");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletAppType ElementName: portlet:event-definitionType ElementType : event-definition
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>event-definition</code> element will be created and returned.
    * Otherwise, the first existing <code>event-definition</code> element will be returned.
    * @return the instance defined for the element <code>event-definition</code> 
    */
   public EventDefinitionType<PortletAppType<T>> getOrCreateEventDefinition()
   {
      List<Node> nodeList = childNode.get("event-definition");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new EventDefinitionTypeImpl<PortletAppType<T>>(this, "event-definition", childNode, nodeList.get(0));
      }
      return createEventDefinition();
   }

   /**
    * Creates a new <code>event-definition</code> element 
    * @return the new created instance of <code>EventDefinitionType<PortletAppType<T>></code> 
    */
   public EventDefinitionType<PortletAppType<T>> createEventDefinition()
   {
      return new EventDefinitionTypeImpl<PortletAppType<T>>(this, "event-definition", childNode);
   }

   /**
    * Returns all <code>event-definition</code> elements
    * @return list of <code>event-definition</code> 
    */
   public List<EventDefinitionType<PortletAppType<T>>> getAllEventDefinition()
   {
      List<EventDefinitionType<PortletAppType<T>>> list = new ArrayList<EventDefinitionType<PortletAppType<T>>>();
      List<Node> nodeList = childNode.get("event-definition");
      for(Node node: nodeList)
      {
         EventDefinitionType<PortletAppType<T>>  type = new EventDefinitionTypeImpl<PortletAppType<T>>(this, "event-definition", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>event-definition</code> elements 
    * @return the current instance of <code>EventDefinitionType<PortletAppType<T>></code> 
    */
   public PortletAppType<T> removeAllEventDefinition()
   {
      childNode.removeChildren("event-definition");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletAppType ElementName: portlet:public-render-parameterType ElementType : public-render-parameter
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>public-render-parameter</code> element will be created and returned.
    * Otherwise, the first existing <code>public-render-parameter</code> element will be returned.
    * @return the instance defined for the element <code>public-render-parameter</code> 
    */
   public PublicRenderParameterType<PortletAppType<T>> getOrCreatePublicRenderParameter()
   {
      List<Node> nodeList = childNode.get("public-render-parameter");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new PublicRenderParameterTypeImpl<PortletAppType<T>>(this, "public-render-parameter", childNode, nodeList.get(0));
      }
      return createPublicRenderParameter();
   }

   /**
    * Creates a new <code>public-render-parameter</code> element 
    * @return the new created instance of <code>PublicRenderParameterType<PortletAppType<T>></code> 
    */
   public PublicRenderParameterType<PortletAppType<T>> createPublicRenderParameter()
   {
      return new PublicRenderParameterTypeImpl<PortletAppType<T>>(this, "public-render-parameter", childNode);
   }

   /**
    * Returns all <code>public-render-parameter</code> elements
    * @return list of <code>public-render-parameter</code> 
    */
   public List<PublicRenderParameterType<PortletAppType<T>>> getAllPublicRenderParameter()
   {
      List<PublicRenderParameterType<PortletAppType<T>>> list = new ArrayList<PublicRenderParameterType<PortletAppType<T>>>();
      List<Node> nodeList = childNode.get("public-render-parameter");
      for(Node node: nodeList)
      {
         PublicRenderParameterType<PortletAppType<T>>  type = new PublicRenderParameterTypeImpl<PortletAppType<T>>(this, "public-render-parameter", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>public-render-parameter</code> elements 
    * @return the current instance of <code>PublicRenderParameterType<PortletAppType<T>></code> 
    */
   public PortletAppType<T> removeAllPublicRenderParameter()
   {
      childNode.removeChildren("public-render-parameter");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletAppType ElementName: portlet:listenerType ElementType : listener
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>listener</code> element will be created and returned.
    * Otherwise, the first existing <code>listener</code> element will be returned.
    * @return the instance defined for the element <code>listener</code> 
    */
   public ListenerType<PortletAppType<T>> getOrCreateListener()
   {
      List<Node> nodeList = childNode.get("listener");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ListenerTypeImpl<PortletAppType<T>>(this, "listener", childNode, nodeList.get(0));
      }
      return createListener();
   }

   /**
    * Creates a new <code>listener</code> element 
    * @return the new created instance of <code>ListenerType<PortletAppType<T>></code> 
    */
   public ListenerType<PortletAppType<T>> createListener()
   {
      return new ListenerTypeImpl<PortletAppType<T>>(this, "listener", childNode);
   }

   /**
    * Returns all <code>listener</code> elements
    * @return list of <code>listener</code> 
    */
   public List<ListenerType<PortletAppType<T>>> getAllListener()
   {
      List<ListenerType<PortletAppType<T>>> list = new ArrayList<ListenerType<PortletAppType<T>>>();
      List<Node> nodeList = childNode.get("listener");
      for(Node node: nodeList)
      {
         ListenerType<PortletAppType<T>>  type = new ListenerTypeImpl<PortletAppType<T>>(this, "listener", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>listener</code> elements 
    * @return the current instance of <code>ListenerType<PortletAppType<T>></code> 
    */
   public PortletAppType<T> removeAllListener()
   {
      childNode.removeChildren("listener");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletAppType ElementName: portlet:container-runtime-optionType ElementType : container-runtime-option
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>container-runtime-option</code> element will be created and returned.
    * Otherwise, the first existing <code>container-runtime-option</code> element will be returned.
    * @return the instance defined for the element <code>container-runtime-option</code> 
    */
   public ContainerRuntimeOptionType<PortletAppType<T>> getOrCreateContainerRuntimeOption()
   {
      List<Node> nodeList = childNode.get("container-runtime-option");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ContainerRuntimeOptionTypeImpl<PortletAppType<T>>(this, "container-runtime-option", childNode, nodeList.get(0));
      }
      return createContainerRuntimeOption();
   }

   /**
    * Creates a new <code>container-runtime-option</code> element 
    * @return the new created instance of <code>ContainerRuntimeOptionType<PortletAppType<T>></code> 
    */
   public ContainerRuntimeOptionType<PortletAppType<T>> createContainerRuntimeOption()
   {
      return new ContainerRuntimeOptionTypeImpl<PortletAppType<T>>(this, "container-runtime-option", childNode);
   }

   /**
    * Returns all <code>container-runtime-option</code> elements
    * @return list of <code>container-runtime-option</code> 
    */
   public List<ContainerRuntimeOptionType<PortletAppType<T>>> getAllContainerRuntimeOption()
   {
      List<ContainerRuntimeOptionType<PortletAppType<T>>> list = new ArrayList<ContainerRuntimeOptionType<PortletAppType<T>>>();
      List<Node> nodeList = childNode.get("container-runtime-option");
      for(Node node: nodeList)
      {
         ContainerRuntimeOptionType<PortletAppType<T>>  type = new ContainerRuntimeOptionTypeImpl<PortletAppType<T>>(this, "container-runtime-option", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>container-runtime-option</code> elements 
    * @return the current instance of <code>ContainerRuntimeOptionType<PortletAppType<T>></code> 
    */
   public PortletAppType<T> removeAllContainerRuntimeOption()
   {
      childNode.removeChildren("container-runtime-option");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletAppType ElementName: string ElementType : version
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of <code>PortletAppType<T></code> 
    */
   public PortletAppType<T> version(String version)
   {
      childNode.attribute("version", version);
      return this;
   }

   /**
    * Returns the <code>version</code> attribute
    * @return the value defined for the attribute <code>version</code> 
    */
      public String getVersion()
   {
      return childNode.getAttribute("version");
   }

   /**
    * Removes the <code>version</code> attribute 
    * @return the current instance of <code>PortletAppType<T></code> 
    */
   public PortletAppType<T> removeVersion()
   {
      childNode.removeAttribute("version");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletAppType ElementName: string ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>PortletAppType<T></code> 
    */
   public PortletAppType<T> id(String id)
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
    * @return the current instance of <code>PortletAppType<T></code> 
    */
   public PortletAppType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
