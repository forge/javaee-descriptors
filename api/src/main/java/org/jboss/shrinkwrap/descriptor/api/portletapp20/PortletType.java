package org.jboss.shrinkwrap.descriptor.api.portletapp20; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.portletapp20.InitParamType;
import org.jboss.shrinkwrap.descriptor.api.portletapp20.SupportsType;
import org.jboss.shrinkwrap.descriptor.api.portletapp20.PortletInfoType;
import org.jboss.shrinkwrap.descriptor.api.portletapp20.PortletPreferencesType;
import org.jboss.shrinkwrap.descriptor.api.portletapp20.SecurityRoleRefType;
import org.jboss.shrinkwrap.descriptor.api.portletapp20.EventDefinitionReferenceType;
import org.jboss.shrinkwrap.descriptor.api.portletapp20.EventDefinitionReferenceType;
import org.jboss.shrinkwrap.descriptor.api.portletapp20.ContainerRuntimeOptionType;
/**
 * This interface defines the contract for the <code> portletType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface PortletType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletType ElementName: string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>PortletType<T></code> 
    */
   public PortletType<T> description(String ... values);

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>PortletType<T></code> 
    */
   public PortletType<T> removeAllDescription();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletType ElementName: string ElementType : portlet-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>portlet-name</code> element
    * @param portletName the value for the element <code>portlet-name</code> 
    * @return the current instance of <code>PortletType<T></code> 
    */
   public PortletType<T> portletName(String portletName);

   /**
    * Returns the <code>portlet-name</code> element
    * @return the node defined for the element <code>portlet-name</code> 
    */
   public String getPortletName();

   /**
    * Removes the <code>portlet-name</code> element 
    * @return the current instance of <code>PortletType<T></code> 
    */
   public PortletType<T> removePortletName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletType ElementName: string ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>PortletType<T></code> 
    */
   public PortletType<T> displayName(String ... values);

   /**
    * Returns all <code>display-name</code> elements
    * @return list of <code>display-name</code> 
    */
   public List<String> getAllDisplayName();

   /**
    * Removes the <code>display-name</code> element 
    * @return the current instance of <code>PortletType<T></code> 
    */
   public PortletType<T> removeAllDisplayName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletType ElementName: string ElementType : portlet-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>portlet-class</code> element
    * @param portletClass the value for the element <code>portlet-class</code> 
    * @return the current instance of <code>PortletType<T></code> 
    */
   public PortletType<T> portletClass(String portletClass);

   /**
    * Returns the <code>portlet-class</code> element
    * @return the node defined for the element <code>portlet-class</code> 
    */
   public String getPortletClass();

   /**
    * Removes the <code>portlet-class</code> element 
    * @return the current instance of <code>PortletType<T></code> 
    */
   public PortletType<T> removePortletClass();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletType ElementName: portlet:init-paramType ElementType : init-param
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>init-param</code> element will be created and returned.
    * Otherwise, the first existing <code>init-param</code> element will be returned.
    * @return the instance defined for the element <code>init-param</code> 
    */
   public InitParamType<PortletType<T>> getOrCreateInitParam();

   /**
    * Creates a new <code>init-param</code> element 
    * @return the new created instance of <code>InitParamType<PortletType<T>></code> 
    */
   public InitParamType<PortletType<T>> createInitParam();

   /**
    * Returns all <code>init-param</code> elements
    * @return list of <code>init-param</code> 
    */
   public List<InitParamType<PortletType<T>>> getAllInitParam();

   /**
    * Removes all <code>init-param</code> elements 
    * @return the current instance of <code>InitParamType<PortletType<T>></code> 
    */
   public PortletType<T> removeAllInitParam();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletType ElementName: xsd:int ElementType : expiration-cache
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>expiration-cache</code> element
    * @param expirationCache the value for the element <code>expiration-cache</code> 
    * @return the current instance of <code>PortletType<T></code> 
    */
   public PortletType<T> expirationCache(Integer expirationCache);

   /**
    * Returns the <code>expiration-cache</code> element
    * @return the node defined for the element <code>expiration-cache</code> 
    */
   public Integer getExpirationCache();

   /**
    * Removes the <code>expiration-cache</code> element 
    * @return the current instance of <code>PortletType<T></code> 
    */
   public PortletType<T> removeExpirationCache();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletType ElementName: string ElementType : cache-scope
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>cache-scope</code> element
    * @param cacheScope the value for the element <code>cache-scope</code> 
    * @return the current instance of <code>PortletType<T></code> 
    */
   public PortletType<T> cacheScope(String cacheScope);

   /**
    * Returns the <code>cache-scope</code> element
    * @return the node defined for the element <code>cache-scope</code> 
    */
   public String getCacheScope();

   /**
    * Removes the <code>cache-scope</code> element 
    * @return the current instance of <code>PortletType<T></code> 
    */
   public PortletType<T> removeCacheScope();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletType ElementName: portlet:supportsType ElementType : supports
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>supports</code> element will be created and returned.
    * Otherwise, the first existing <code>supports</code> element will be returned.
    * @return the instance defined for the element <code>supports</code> 
    */
   public SupportsType<PortletType<T>> getOrCreateSupports();

   /**
    * Creates a new <code>supports</code> element 
    * @return the new created instance of <code>SupportsType<PortletType<T>></code> 
    */
   public SupportsType<PortletType<T>> createSupports();

   /**
    * Returns all <code>supports</code> elements
    * @return list of <code>supports</code> 
    */
   public List<SupportsType<PortletType<T>>> getAllSupports();

   /**
    * Removes all <code>supports</code> elements 
    * @return the current instance of <code>SupportsType<PortletType<T>></code> 
    */
   public PortletType<T> removeAllSupports();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletType ElementName: string ElementType : supported-locale
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>supported-locale</code> elements, 
    * a new <code>supported-locale</code> element 
    * @param values list of <code>supported-locale</code> objects 
    * @return the current instance of <code>PortletType<T></code> 
    */
   public PortletType<T> supportedLocale(String ... values);

   /**
    * Returns all <code>supported-locale</code> elements
    * @return list of <code>supported-locale</code> 
    */
   public List<String> getAllSupportedLocale();

   /**
    * Removes the <code>supported-locale</code> element 
    * @return the current instance of <code>PortletType<T></code> 
    */
   public PortletType<T> removeAllSupportedLocale();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletType ElementName: string ElementType : resource-bundle
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>resource-bundle</code> element
    * @param resourceBundle the value for the element <code>resource-bundle</code> 
    * @return the current instance of <code>PortletType<T></code> 
    */
   public PortletType<T> resourceBundle(String resourceBundle);

   /**
    * Returns the <code>resource-bundle</code> element
    * @return the node defined for the element <code>resource-bundle</code> 
    */
   public String getResourceBundle();

   /**
    * Removes the <code>resource-bundle</code> element 
    * @return the current instance of <code>PortletType<T></code> 
    */
   public PortletType<T> removeResourceBundle();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletType ElementName: portlet:portlet-infoType ElementType : portlet-info
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>portlet-info</code> element with the given value will be created.
    * Otherwise, the existing <code>portlet-info</code> element will be returned.
    * @return  a new or existing instance of <code>PortletInfoType<PortletType<T>></code> 
    */
   public PortletInfoType<PortletType<T>> getOrCreatePortletInfo();

   /**
    * Removes the <code>portlet-info</code> element 
    * @return the current instance of <code>PortletType<T></code> 
    */
   public PortletType<T> removePortletInfo();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletType ElementName: portlet:portlet-preferencesType ElementType : portlet-preferences
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>portlet-preferences</code> element with the given value will be created.
    * Otherwise, the existing <code>portlet-preferences</code> element will be returned.
    * @return  a new or existing instance of <code>PortletPreferencesType<PortletType<T>></code> 
    */
   public PortletPreferencesType<PortletType<T>> getOrCreatePortletPreferences();

   /**
    * Removes the <code>portlet-preferences</code> element 
    * @return the current instance of <code>PortletType<T></code> 
    */
   public PortletType<T> removePortletPreferences();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletType ElementName: portlet:security-role-refType ElementType : security-role-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>security-role-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>security-role-ref</code> element will be returned.
    * @return the instance defined for the element <code>security-role-ref</code> 
    */
   public SecurityRoleRefType<PortletType<T>> getOrCreateSecurityRoleRef();

   /**
    * Creates a new <code>security-role-ref</code> element 
    * @return the new created instance of <code>SecurityRoleRefType<PortletType<T>></code> 
    */
   public SecurityRoleRefType<PortletType<T>> createSecurityRoleRef();

   /**
    * Returns all <code>security-role-ref</code> elements
    * @return list of <code>security-role-ref</code> 
    */
   public List<SecurityRoleRefType<PortletType<T>>> getAllSecurityRoleRef();

   /**
    * Removes all <code>security-role-ref</code> elements 
    * @return the current instance of <code>SecurityRoleRefType<PortletType<T>></code> 
    */
   public PortletType<T> removeAllSecurityRoleRef();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletType ElementName: portlet:event-definition-referenceType ElementType : supported-processing-event
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>supported-processing-event</code> element will be created and returned.
    * Otherwise, the first existing <code>supported-processing-event</code> element will be returned.
    * @return the instance defined for the element <code>supported-processing-event</code> 
    */
   public EventDefinitionReferenceType<PortletType<T>> getOrCreateSupportedProcessingEvent();

   /**
    * Creates a new <code>supported-processing-event</code> element 
    * @return the new created instance of <code>EventDefinitionReferenceType<PortletType<T>></code> 
    */
   public EventDefinitionReferenceType<PortletType<T>> createSupportedProcessingEvent();

   /**
    * Returns all <code>supported-processing-event</code> elements
    * @return list of <code>supported-processing-event</code> 
    */
   public List<EventDefinitionReferenceType<PortletType<T>>> getAllSupportedProcessingEvent();

   /**
    * Removes all <code>supported-processing-event</code> elements 
    * @return the current instance of <code>EventDefinitionReferenceType<PortletType<T>></code> 
    */
   public PortletType<T> removeAllSupportedProcessingEvent();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletType ElementName: portlet:event-definition-referenceType ElementType : supported-publishing-event
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>supported-publishing-event</code> element will be created and returned.
    * Otherwise, the first existing <code>supported-publishing-event</code> element will be returned.
    * @return the instance defined for the element <code>supported-publishing-event</code> 
    */
   public EventDefinitionReferenceType<PortletType<T>> getOrCreateSupportedPublishingEvent();

   /**
    * Creates a new <code>supported-publishing-event</code> element 
    * @return the new created instance of <code>EventDefinitionReferenceType<PortletType<T>></code> 
    */
   public EventDefinitionReferenceType<PortletType<T>> createSupportedPublishingEvent();

   /**
    * Returns all <code>supported-publishing-event</code> elements
    * @return list of <code>supported-publishing-event</code> 
    */
   public List<EventDefinitionReferenceType<PortletType<T>>> getAllSupportedPublishingEvent();

   /**
    * Removes all <code>supported-publishing-event</code> elements 
    * @return the current instance of <code>EventDefinitionReferenceType<PortletType<T>></code> 
    */
   public PortletType<T> removeAllSupportedPublishingEvent();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletType ElementName: string ElementType : supported-public-render-parameter
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>supported-public-render-parameter</code> elements, 
    * a new <code>supported-public-render-parameter</code> element 
    * @param values list of <code>supported-public-render-parameter</code> objects 
    * @return the current instance of <code>PortletType<T></code> 
    */
   public PortletType<T> supportedPublicRenderParameter(String ... values);

   /**
    * Returns all <code>supported-public-render-parameter</code> elements
    * @return list of <code>supported-public-render-parameter</code> 
    */
   public List<String> getAllSupportedPublicRenderParameter();

   /**
    * Removes the <code>supported-public-render-parameter</code> element 
    * @return the current instance of <code>PortletType<T></code> 
    */
   public PortletType<T> removeAllSupportedPublicRenderParameter();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletType ElementName: portlet:container-runtime-optionType ElementType : container-runtime-option
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>container-runtime-option</code> element will be created and returned.
    * Otherwise, the first existing <code>container-runtime-option</code> element will be returned.
    * @return the instance defined for the element <code>container-runtime-option</code> 
    */
   public ContainerRuntimeOptionType<PortletType<T>> getOrCreateContainerRuntimeOption();

   /**
    * Creates a new <code>container-runtime-option</code> element 
    * @return the new created instance of <code>ContainerRuntimeOptionType<PortletType<T>></code> 
    */
   public ContainerRuntimeOptionType<PortletType<T>> createContainerRuntimeOption();

   /**
    * Returns all <code>container-runtime-option</code> elements
    * @return list of <code>container-runtime-option</code> 
    */
   public List<ContainerRuntimeOptionType<PortletType<T>>> getAllContainerRuntimeOption();

   /**
    * Removes all <code>container-runtime-option</code> elements 
    * @return the current instance of <code>ContainerRuntimeOptionType<PortletType<T>></code> 
    */
   public PortletType<T> removeAllContainerRuntimeOption();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletType ElementName: string ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>PortletType<T></code> 
    */
   public PortletType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>PortletType<T></code> 
    */
   public PortletType<T> removeId();
}
