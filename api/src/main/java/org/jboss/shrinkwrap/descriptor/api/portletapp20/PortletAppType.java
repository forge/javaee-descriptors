package org.jboss.shrinkwrap.descriptor.api.portletapp20; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> portlet-appType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface PortletAppType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletAppType ElementName: portlet:portletType ElementType : portlet
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>portlet</code> element will be created and returned.
    * Otherwise, the first existing <code>portlet</code> element will be returned.
    * @return the instance defined for the element <code>portlet</code> 
    */
   public PortletType<PortletAppType<T>> getOrCreatePortlet();

   /**
    * Creates a new <code>portlet</code> element 
    * @return the new created instance of <code>PortletType<PortletAppType<T>></code> 
    */
   public PortletType<PortletAppType<T>> createPortlet();

   /**
    * Returns all <code>portlet</code> elements
    * @return list of <code>portlet</code> 
    */
   public List<PortletType<PortletAppType<T>>> getAllPortlet();

   /**
    * Removes all <code>portlet</code> elements 
    * @return the current instance of <code>PortletType<PortletAppType<T>></code> 
    */
   public PortletAppType<T> removeAllPortlet();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletAppType ElementName: portlet:custom-portlet-modeType ElementType : custom-portlet-mode
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>custom-portlet-mode</code> element will be created and returned.
    * Otherwise, the first existing <code>custom-portlet-mode</code> element will be returned.
    * @return the instance defined for the element <code>custom-portlet-mode</code> 
    */
   public CustomPortletModeType<PortletAppType<T>> getOrCreateCustomPortletMode();

   /**
    * Creates a new <code>custom-portlet-mode</code> element 
    * @return the new created instance of <code>CustomPortletModeType<PortletAppType<T>></code> 
    */
   public CustomPortletModeType<PortletAppType<T>> createCustomPortletMode();

   /**
    * Returns all <code>custom-portlet-mode</code> elements
    * @return list of <code>custom-portlet-mode</code> 
    */
   public List<CustomPortletModeType<PortletAppType<T>>> getAllCustomPortletMode();

   /**
    * Removes all <code>custom-portlet-mode</code> elements 
    * @return the current instance of <code>CustomPortletModeType<PortletAppType<T>></code> 
    */
   public PortletAppType<T> removeAllCustomPortletMode();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletAppType ElementName: portlet:custom-window-stateType ElementType : custom-window-state
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>custom-window-state</code> element will be created and returned.
    * Otherwise, the first existing <code>custom-window-state</code> element will be returned.
    * @return the instance defined for the element <code>custom-window-state</code> 
    */
   public CustomWindowStateType<PortletAppType<T>> getOrCreateCustomWindowState();

   /**
    * Creates a new <code>custom-window-state</code> element 
    * @return the new created instance of <code>CustomWindowStateType<PortletAppType<T>></code> 
    */
   public CustomWindowStateType<PortletAppType<T>> createCustomWindowState();

   /**
    * Returns all <code>custom-window-state</code> elements
    * @return list of <code>custom-window-state</code> 
    */
   public List<CustomWindowStateType<PortletAppType<T>>> getAllCustomWindowState();

   /**
    * Removes all <code>custom-window-state</code> elements 
    * @return the current instance of <code>CustomWindowStateType<PortletAppType<T>></code> 
    */
   public PortletAppType<T> removeAllCustomWindowState();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletAppType ElementName: portlet:user-attributeType ElementType : user-attribute
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>user-attribute</code> element will be created and returned.
    * Otherwise, the first existing <code>user-attribute</code> element will be returned.
    * @return the instance defined for the element <code>user-attribute</code> 
    */
   public UserAttributeType<PortletAppType<T>> getOrCreateUserAttribute();

   /**
    * Creates a new <code>user-attribute</code> element 
    * @return the new created instance of <code>UserAttributeType<PortletAppType<T>></code> 
    */
   public UserAttributeType<PortletAppType<T>> createUserAttribute();

   /**
    * Returns all <code>user-attribute</code> elements
    * @return list of <code>user-attribute</code> 
    */
   public List<UserAttributeType<PortletAppType<T>>> getAllUserAttribute();

   /**
    * Removes all <code>user-attribute</code> elements 
    * @return the current instance of <code>UserAttributeType<PortletAppType<T>></code> 
    */
   public PortletAppType<T> removeAllUserAttribute();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletAppType ElementName: portlet:security-constraintType ElementType : security-constraint
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>security-constraint</code> element will be created and returned.
    * Otherwise, the first existing <code>security-constraint</code> element will be returned.
    * @return the instance defined for the element <code>security-constraint</code> 
    */
   public SecurityConstraintType<PortletAppType<T>> getOrCreateSecurityConstraint();

   /**
    * Creates a new <code>security-constraint</code> element 
    * @return the new created instance of <code>SecurityConstraintType<PortletAppType<T>></code> 
    */
   public SecurityConstraintType<PortletAppType<T>> createSecurityConstraint();

   /**
    * Returns all <code>security-constraint</code> elements
    * @return list of <code>security-constraint</code> 
    */
   public List<SecurityConstraintType<PortletAppType<T>>> getAllSecurityConstraint();

   /**
    * Removes all <code>security-constraint</code> elements 
    * @return the current instance of <code>SecurityConstraintType<PortletAppType<T>></code> 
    */
   public PortletAppType<T> removeAllSecurityConstraint();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletAppType ElementName: string ElementType : resource-bundle
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>resource-bundle</code> element
    * @param resourceBundle the value for the element <code>resource-bundle</code> 
    * @return the current instance of <code>PortletAppType<T></code> 
    */
   public PortletAppType<T> resourceBundle(String resourceBundle);

   /**
    * Returns the <code>resource-bundle</code> element
    * @return the node defined for the element <code>resource-bundle</code> 
    */
   public String getResourceBundle();

   /**
    * Removes the <code>resource-bundle</code> element 
    * @return the current instance of <code>PortletAppType<T></code> 
    */
   public PortletAppType<T> removeResourceBundle();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletAppType ElementName: portlet:filterType ElementType : filter
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>filter</code> element will be created and returned.
    * Otherwise, the first existing <code>filter</code> element will be returned.
    * @return the instance defined for the element <code>filter</code> 
    */
   public FilterType<PortletAppType<T>> getOrCreateFilter();

   /**
    * Creates a new <code>filter</code> element 
    * @return the new created instance of <code>FilterType<PortletAppType<T>></code> 
    */
   public FilterType<PortletAppType<T>> createFilter();

   /**
    * Returns all <code>filter</code> elements
    * @return list of <code>filter</code> 
    */
   public List<FilterType<PortletAppType<T>>> getAllFilter();

   /**
    * Removes all <code>filter</code> elements 
    * @return the current instance of <code>FilterType<PortletAppType<T>></code> 
    */
   public PortletAppType<T> removeAllFilter();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletAppType ElementName: portlet:filter-mappingType ElementType : filter-mapping
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>filter-mapping</code> element will be created and returned.
    * Otherwise, the first existing <code>filter-mapping</code> element will be returned.
    * @return the instance defined for the element <code>filter-mapping</code> 
    */
   public FilterMappingType<PortletAppType<T>> getOrCreateFilterMapping();

   /**
    * Creates a new <code>filter-mapping</code> element 
    * @return the new created instance of <code>FilterMappingType<PortletAppType<T>></code> 
    */
   public FilterMappingType<PortletAppType<T>> createFilterMapping();

   /**
    * Returns all <code>filter-mapping</code> elements
    * @return list of <code>filter-mapping</code> 
    */
   public List<FilterMappingType<PortletAppType<T>>> getAllFilterMapping();

   /**
    * Removes all <code>filter-mapping</code> elements 
    * @return the current instance of <code>FilterMappingType<PortletAppType<T>></code> 
    */
   public PortletAppType<T> removeAllFilterMapping();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletAppType ElementName: xsd:anyURI ElementType : default-namespace
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>default-namespace</code> element
    * @param defaultNamespace the value for the element <code>default-namespace</code> 
    * @return the current instance of <code>PortletAppType<T></code> 
    */
   public PortletAppType<T> defaultNamespace(String defaultNamespace);

   /**
    * Returns the <code>default-namespace</code> element
    * @return the node defined for the element <code>default-namespace</code> 
    */
   public String getDefaultNamespace();

   /**
    * Removes the <code>default-namespace</code> element 
    * @return the current instance of <code>PortletAppType<T></code> 
    */
   public PortletAppType<T> removeDefaultNamespace();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletAppType ElementName: portlet:event-definitionType ElementType : event-definition
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>event-definition</code> element will be created and returned.
    * Otherwise, the first existing <code>event-definition</code> element will be returned.
    * @return the instance defined for the element <code>event-definition</code> 
    */
   public EventDefinitionType<PortletAppType<T>> getOrCreateEventDefinition();

   /**
    * Creates a new <code>event-definition</code> element 
    * @return the new created instance of <code>EventDefinitionType<PortletAppType<T>></code> 
    */
   public EventDefinitionType<PortletAppType<T>> createEventDefinition();

   /**
    * Returns all <code>event-definition</code> elements
    * @return list of <code>event-definition</code> 
    */
   public List<EventDefinitionType<PortletAppType<T>>> getAllEventDefinition();

   /**
    * Removes all <code>event-definition</code> elements 
    * @return the current instance of <code>EventDefinitionType<PortletAppType<T>></code> 
    */
   public PortletAppType<T> removeAllEventDefinition();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletAppType ElementName: portlet:public-render-parameterType ElementType : public-render-parameter
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>public-render-parameter</code> element will be created and returned.
    * Otherwise, the first existing <code>public-render-parameter</code> element will be returned.
    * @return the instance defined for the element <code>public-render-parameter</code> 
    */
   public PublicRenderParameterType<PortletAppType<T>> getOrCreatePublicRenderParameter();

   /**
    * Creates a new <code>public-render-parameter</code> element 
    * @return the new created instance of <code>PublicRenderParameterType<PortletAppType<T>></code> 
    */
   public PublicRenderParameterType<PortletAppType<T>> createPublicRenderParameter();

   /**
    * Returns all <code>public-render-parameter</code> elements
    * @return list of <code>public-render-parameter</code> 
    */
   public List<PublicRenderParameterType<PortletAppType<T>>> getAllPublicRenderParameter();

   /**
    * Removes all <code>public-render-parameter</code> elements 
    * @return the current instance of <code>PublicRenderParameterType<PortletAppType<T>></code> 
    */
   public PortletAppType<T> removeAllPublicRenderParameter();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletAppType ElementName: portlet:listenerType ElementType : listener
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>listener</code> element will be created and returned.
    * Otherwise, the first existing <code>listener</code> element will be returned.
    * @return the instance defined for the element <code>listener</code> 
    */
   public ListenerType<PortletAppType<T>> getOrCreateListener();

   /**
    * Creates a new <code>listener</code> element 
    * @return the new created instance of <code>ListenerType<PortletAppType<T>></code> 
    */
   public ListenerType<PortletAppType<T>> createListener();

   /**
    * Returns all <code>listener</code> elements
    * @return list of <code>listener</code> 
    */
   public List<ListenerType<PortletAppType<T>>> getAllListener();

   /**
    * Removes all <code>listener</code> elements 
    * @return the current instance of <code>ListenerType<PortletAppType<T>></code> 
    */
   public PortletAppType<T> removeAllListener();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletAppType ElementName: portlet:container-runtime-optionType ElementType : container-runtime-option
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>container-runtime-option</code> element will be created and returned.
    * Otherwise, the first existing <code>container-runtime-option</code> element will be returned.
    * @return the instance defined for the element <code>container-runtime-option</code> 
    */
   public ContainerRuntimeOptionType<PortletAppType<T>> getOrCreateContainerRuntimeOption();

   /**
    * Creates a new <code>container-runtime-option</code> element 
    * @return the new created instance of <code>ContainerRuntimeOptionType<PortletAppType<T>></code> 
    */
   public ContainerRuntimeOptionType<PortletAppType<T>> createContainerRuntimeOption();

   /**
    * Returns all <code>container-runtime-option</code> elements
    * @return list of <code>container-runtime-option</code> 
    */
   public List<ContainerRuntimeOptionType<PortletAppType<T>>> getAllContainerRuntimeOption();

   /**
    * Removes all <code>container-runtime-option</code> elements 
    * @return the current instance of <code>ContainerRuntimeOptionType<PortletAppType<T>></code> 
    */
   public PortletAppType<T> removeAllContainerRuntimeOption();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletAppType ElementName: string ElementType : version
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of <code>PortletAppType<T></code> 
    */
   public PortletAppType<T> version(String version);

   /**
    * Returns the <code>version</code> attribute
    * @return the value defined for the attribute <code>version</code> 
    */
   public String getVersion();

   /**
    * Removes the <code>version</code> attribute 
    * @return the current instance of <code>PortletAppType<T></code> 
    */
   public PortletAppType<T> removeVersion();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletAppType ElementName: string ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>PortletAppType<T></code> 
    */
   public PortletAppType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>PortletAppType<T></code> 
    */
   public PortletAppType<T> removeId();
}
