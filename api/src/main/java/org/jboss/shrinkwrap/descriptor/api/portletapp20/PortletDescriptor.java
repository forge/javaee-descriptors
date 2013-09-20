package org.jboss.shrinkwrap.descriptor.api.portletapp20; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.portletapp20.PortletType;
import org.jboss.shrinkwrap.descriptor.api.portletapp20.CustomPortletModeType;
import org.jboss.shrinkwrap.descriptor.api.portletapp20.CustomWindowStateType;
import org.jboss.shrinkwrap.descriptor.api.portletapp20.UserAttributeType;
import org.jboss.shrinkwrap.descriptor.api.portletapp20.SecurityConstraintType;
import org.jboss.shrinkwrap.descriptor.api.portletapp20.FilterType;
import org.jboss.shrinkwrap.descriptor.api.portletapp20.FilterMappingType;
import org.jboss.shrinkwrap.descriptor.api.portletapp20.EventDefinitionType;
import org.jboss.shrinkwrap.descriptor.api.portletapp20.PublicRenderParameterType;
import org.jboss.shrinkwrap.descriptor.api.portletapp20.ListenerType;
import org.jboss.shrinkwrap.descriptor.api.portletapp20.ContainerRuntimeOptionType;
import org.jboss.shrinkwrap.descriptor.api.Descriptor;
import org.jboss.shrinkwrap.descriptor.api.DescriptorNamespace;

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
public interface PortletDescriptor extends Descriptor, DescriptorNamespace<PortletDescriptor>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletDescriptor ElementName: portlet:portletType ElementType : portlet
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>portlet</code> element will be created and returned.
    * Otherwise, the first existing <code>portlet</code> element will be returned.
    * @return the instance defined for the element <code>portlet</code> 
    */
   public PortletType<PortletDescriptor> getOrCreatePortlet();

   /**
    * Creates a new <code>portlet</code> element 
    * @return the new created instance of <code>PortletType<PortletDescriptor></code> 
    */
   public PortletType<PortletDescriptor> createPortlet();

   /**
    * Returns all <code>portlet</code> elements
    * @return list of <code>portlet</code> 
    */
   public List<PortletType<PortletDescriptor>> getAllPortlet();

   /**
    * Removes all <code>portlet</code> elements 
    * @return the current instance of <code>PortletType<PortletDescriptor></code> 
    */
   public PortletDescriptor removeAllPortlet();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletDescriptor ElementName: portlet:custom-portlet-modeType ElementType : custom-portlet-mode
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>custom-portlet-mode</code> element will be created and returned.
    * Otherwise, the first existing <code>custom-portlet-mode</code> element will be returned.
    * @return the instance defined for the element <code>custom-portlet-mode</code> 
    */
   public CustomPortletModeType<PortletDescriptor> getOrCreateCustomPortletMode();

   /**
    * Creates a new <code>custom-portlet-mode</code> element 
    * @return the new created instance of <code>CustomPortletModeType<PortletDescriptor></code> 
    */
   public CustomPortletModeType<PortletDescriptor> createCustomPortletMode();

   /**
    * Returns all <code>custom-portlet-mode</code> elements
    * @return list of <code>custom-portlet-mode</code> 
    */
   public List<CustomPortletModeType<PortletDescriptor>> getAllCustomPortletMode();

   /**
    * Removes all <code>custom-portlet-mode</code> elements 
    * @return the current instance of <code>CustomPortletModeType<PortletDescriptor></code> 
    */
   public PortletDescriptor removeAllCustomPortletMode();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletDescriptor ElementName: portlet:custom-window-stateType ElementType : custom-window-state
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>custom-window-state</code> element will be created and returned.
    * Otherwise, the first existing <code>custom-window-state</code> element will be returned.
    * @return the instance defined for the element <code>custom-window-state</code> 
    */
   public CustomWindowStateType<PortletDescriptor> getOrCreateCustomWindowState();

   /**
    * Creates a new <code>custom-window-state</code> element 
    * @return the new created instance of <code>CustomWindowStateType<PortletDescriptor></code> 
    */
   public CustomWindowStateType<PortletDescriptor> createCustomWindowState();

   /**
    * Returns all <code>custom-window-state</code> elements
    * @return list of <code>custom-window-state</code> 
    */
   public List<CustomWindowStateType<PortletDescriptor>> getAllCustomWindowState();

   /**
    * Removes all <code>custom-window-state</code> elements 
    * @return the current instance of <code>CustomWindowStateType<PortletDescriptor></code> 
    */
   public PortletDescriptor removeAllCustomWindowState();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletDescriptor ElementName: portlet:user-attributeType ElementType : user-attribute
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>user-attribute</code> element will be created and returned.
    * Otherwise, the first existing <code>user-attribute</code> element will be returned.
    * @return the instance defined for the element <code>user-attribute</code> 
    */
   public UserAttributeType<PortletDescriptor> getOrCreateUserAttribute();

   /**
    * Creates a new <code>user-attribute</code> element 
    * @return the new created instance of <code>UserAttributeType<PortletDescriptor></code> 
    */
   public UserAttributeType<PortletDescriptor> createUserAttribute();

   /**
    * Returns all <code>user-attribute</code> elements
    * @return list of <code>user-attribute</code> 
    */
   public List<UserAttributeType<PortletDescriptor>> getAllUserAttribute();

   /**
    * Removes all <code>user-attribute</code> elements 
    * @return the current instance of <code>UserAttributeType<PortletDescriptor></code> 
    */
   public PortletDescriptor removeAllUserAttribute();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletDescriptor ElementName: portlet:security-constraintType ElementType : security-constraint
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>security-constraint</code> element will be created and returned.
    * Otherwise, the first existing <code>security-constraint</code> element will be returned.
    * @return the instance defined for the element <code>security-constraint</code> 
    */
   public SecurityConstraintType<PortletDescriptor> getOrCreateSecurityConstraint();

   /**
    * Creates a new <code>security-constraint</code> element 
    * @return the new created instance of <code>SecurityConstraintType<PortletDescriptor></code> 
    */
   public SecurityConstraintType<PortletDescriptor> createSecurityConstraint();

   /**
    * Returns all <code>security-constraint</code> elements
    * @return list of <code>security-constraint</code> 
    */
   public List<SecurityConstraintType<PortletDescriptor>> getAllSecurityConstraint();

   /**
    * Removes all <code>security-constraint</code> elements 
    * @return the current instance of <code>SecurityConstraintType<PortletDescriptor></code> 
    */
   public PortletDescriptor removeAllSecurityConstraint();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletDescriptor ElementName: string ElementType : resource-bundle
   // MaxOccurs: -  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>resource-bundle</code> element
    * @param resourceBundle the value for the element <code>resource-bundle</code> 
    * @return the current instance of <code>PortletDescriptor</code> 
    */
   public PortletDescriptor resourceBundle(String resourceBundle);

   /**
    * Returns the <code>resource-bundle</code> element
    * @return the node defined for the element <code>resource-bundle</code> 
    */
   public String getResourceBundle();

   /**
    * Removes the <code>resource-bundle</code> element 
    * @return the current instance of <code>PortletDescriptor</code> 
    */
   public PortletDescriptor removeResourceBundle();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletDescriptor ElementName: portlet:filterType ElementType : filter
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>filter</code> element will be created and returned.
    * Otherwise, the first existing <code>filter</code> element will be returned.
    * @return the instance defined for the element <code>filter</code> 
    */
   public FilterType<PortletDescriptor> getOrCreateFilter();

   /**
    * Creates a new <code>filter</code> element 
    * @return the new created instance of <code>FilterType<PortletDescriptor></code> 
    */
   public FilterType<PortletDescriptor> createFilter();

   /**
    * Returns all <code>filter</code> elements
    * @return list of <code>filter</code> 
    */
   public List<FilterType<PortletDescriptor>> getAllFilter();

   /**
    * Removes all <code>filter</code> elements 
    * @return the current instance of <code>FilterType<PortletDescriptor></code> 
    */
   public PortletDescriptor removeAllFilter();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletDescriptor ElementName: portlet:filter-mappingType ElementType : filter-mapping
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>filter-mapping</code> element will be created and returned.
    * Otherwise, the first existing <code>filter-mapping</code> element will be returned.
    * @return the instance defined for the element <code>filter-mapping</code> 
    */
   public FilterMappingType<PortletDescriptor> getOrCreateFilterMapping();

   /**
    * Creates a new <code>filter-mapping</code> element 
    * @return the new created instance of <code>FilterMappingType<PortletDescriptor></code> 
    */
   public FilterMappingType<PortletDescriptor> createFilterMapping();

   /**
    * Returns all <code>filter-mapping</code> elements
    * @return list of <code>filter-mapping</code> 
    */
   public List<FilterMappingType<PortletDescriptor>> getAllFilterMapping();

   /**
    * Removes all <code>filter-mapping</code> elements 
    * @return the current instance of <code>FilterMappingType<PortletDescriptor></code> 
    */
   public PortletDescriptor removeAllFilterMapping();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletDescriptor ElementName: xsd:anyURI ElementType : default-namespace
   // MaxOccurs: -  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>default-namespace</code> element
    * @param defaultNamespace the value for the element <code>default-namespace</code> 
    * @return the current instance of <code>PortletDescriptor</code> 
    */
   public PortletDescriptor defaultNamespace(String defaultNamespace);

   /**
    * Returns the <code>default-namespace</code> element
    * @return the node defined for the element <code>default-namespace</code> 
    */
   public String getDefaultNamespace();

   /**
    * Removes the <code>default-namespace</code> element 
    * @return the current instance of <code>PortletDescriptor</code> 
    */
   public PortletDescriptor removeDefaultNamespace();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletDescriptor ElementName: portlet:event-definitionType ElementType : event-definition
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>event-definition</code> element will be created and returned.
    * Otherwise, the first existing <code>event-definition</code> element will be returned.
    * @return the instance defined for the element <code>event-definition</code> 
    */
   public EventDefinitionType<PortletDescriptor> getOrCreateEventDefinition();

   /**
    * Creates a new <code>event-definition</code> element 
    * @return the new created instance of <code>EventDefinitionType<PortletDescriptor></code> 
    */
   public EventDefinitionType<PortletDescriptor> createEventDefinition();

   /**
    * Returns all <code>event-definition</code> elements
    * @return list of <code>event-definition</code> 
    */
   public List<EventDefinitionType<PortletDescriptor>> getAllEventDefinition();

   /**
    * Removes all <code>event-definition</code> elements 
    * @return the current instance of <code>EventDefinitionType<PortletDescriptor></code> 
    */
   public PortletDescriptor removeAllEventDefinition();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletDescriptor ElementName: portlet:public-render-parameterType ElementType : public-render-parameter
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>public-render-parameter</code> element will be created and returned.
    * Otherwise, the first existing <code>public-render-parameter</code> element will be returned.
    * @return the instance defined for the element <code>public-render-parameter</code> 
    */
   public PublicRenderParameterType<PortletDescriptor> getOrCreatePublicRenderParameter();

   /**
    * Creates a new <code>public-render-parameter</code> element 
    * @return the new created instance of <code>PublicRenderParameterType<PortletDescriptor></code> 
    */
   public PublicRenderParameterType<PortletDescriptor> createPublicRenderParameter();

   /**
    * Returns all <code>public-render-parameter</code> elements
    * @return list of <code>public-render-parameter</code> 
    */
   public List<PublicRenderParameterType<PortletDescriptor>> getAllPublicRenderParameter();

   /**
    * Removes all <code>public-render-parameter</code> elements 
    * @return the current instance of <code>PublicRenderParameterType<PortletDescriptor></code> 
    */
   public PortletDescriptor removeAllPublicRenderParameter();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletDescriptor ElementName: portlet:listenerType ElementType : listener
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>listener</code> element will be created and returned.
    * Otherwise, the first existing <code>listener</code> element will be returned.
    * @return the instance defined for the element <code>listener</code> 
    */
   public ListenerType<PortletDescriptor> getOrCreateListener();

   /**
    * Creates a new <code>listener</code> element 
    * @return the new created instance of <code>ListenerType<PortletDescriptor></code> 
    */
   public ListenerType<PortletDescriptor> createListener();

   /**
    * Returns all <code>listener</code> elements
    * @return list of <code>listener</code> 
    */
   public List<ListenerType<PortletDescriptor>> getAllListener();

   /**
    * Removes all <code>listener</code> elements 
    * @return the current instance of <code>ListenerType<PortletDescriptor></code> 
    */
   public PortletDescriptor removeAllListener();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletDescriptor ElementName: portlet:container-runtime-optionType ElementType : container-runtime-option
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>container-runtime-option</code> element will be created and returned.
    * Otherwise, the first existing <code>container-runtime-option</code> element will be returned.
    * @return the instance defined for the element <code>container-runtime-option</code> 
    */
   public ContainerRuntimeOptionType<PortletDescriptor> getOrCreateContainerRuntimeOption();

   /**
    * Creates a new <code>container-runtime-option</code> element 
    * @return the new created instance of <code>ContainerRuntimeOptionType<PortletDescriptor></code> 
    */
   public ContainerRuntimeOptionType<PortletDescriptor> createContainerRuntimeOption();

   /**
    * Returns all <code>container-runtime-option</code> elements
    * @return list of <code>container-runtime-option</code> 
    */
   public List<ContainerRuntimeOptionType<PortletDescriptor>> getAllContainerRuntimeOption();

   /**
    * Removes all <code>container-runtime-option</code> elements 
    * @return the current instance of <code>ContainerRuntimeOptionType<PortletDescriptor></code> 
    */
   public PortletDescriptor removeAllContainerRuntimeOption();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletDescriptor ElementName: string ElementType : version
   // MaxOccurs: -  isGeneric: false   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of <code>PortletDescriptor</code> 
    */
   public PortletDescriptor version(String version);

   /**
    * Returns the <code>version</code> attribute
    * @return the value defined for the attribute <code>version</code> 
    */
   public String getVersion();

   /**
    * Removes the <code>version</code> attribute 
    * @return the current instance of <code>PortletDescriptor</code> 
    */
   public PortletDescriptor removeVersion();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletDescriptor ElementName: string ElementType : id
   // MaxOccurs: -  isGeneric: false   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>PortletDescriptor</code> 
    */
   public PortletDescriptor id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>PortletDescriptor</code> 
    */
   public PortletDescriptor removeId();
}
