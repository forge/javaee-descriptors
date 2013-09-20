package org.jboss.shrinkwrap.descriptor.api.webfragment31; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Descriptor;
import org.jboss.shrinkwrap.descriptor.api.DescriptorNamespace;
import org.jboss.shrinkwrap.descriptor.api.javaee7.AdministeredObjectType;
import org.jboss.shrinkwrap.descriptor.api.javaee7.ConnectionFactoryResourceType;
import org.jboss.shrinkwrap.descriptor.api.javaee7.DataSourceType;
import org.jboss.shrinkwrap.descriptor.api.javaee7.EjbLocalRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee7.EjbRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee7.EnvEntryType;
import org.jboss.shrinkwrap.descriptor.api.javaee7.IconType;
import org.jboss.shrinkwrap.descriptor.api.javaee7.JmsConnectionFactoryType;
import org.jboss.shrinkwrap.descriptor.api.javaee7.JmsDestinationType;
import org.jboss.shrinkwrap.descriptor.api.javaee7.LifecycleCallbackType;
import org.jboss.shrinkwrap.descriptor.api.javaee7.ListenerType;
import org.jboss.shrinkwrap.descriptor.api.javaee7.MailSessionType;
import org.jboss.shrinkwrap.descriptor.api.javaee7.MessageDestinationRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee7.MessageDestinationType;
import org.jboss.shrinkwrap.descriptor.api.javaee7.ParamValueType;
import org.jboss.shrinkwrap.descriptor.api.javaee7.PersistenceContextRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee7.PersistenceUnitRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee7.ResourceEnvRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee7.ResourceRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee7.SecurityRoleType;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient14.ServiceRefType;
import org.jboss.shrinkwrap.descriptor.api.jsp23.JspConfigType;
import org.jboss.shrinkwrap.descriptor.api.webcommon31.ErrorPageType;
import org.jboss.shrinkwrap.descriptor.api.webcommon31.FilterMappingType;
import org.jboss.shrinkwrap.descriptor.api.webcommon31.FilterType;
import org.jboss.shrinkwrap.descriptor.api.webcommon31.LocaleEncodingMappingListType;
import org.jboss.shrinkwrap.descriptor.api.webcommon31.LoginConfigType;
import org.jboss.shrinkwrap.descriptor.api.webcommon31.MimeMappingType;
import org.jboss.shrinkwrap.descriptor.api.webcommon31.SecurityConstraintType;
import org.jboss.shrinkwrap.descriptor.api.webcommon31.ServletMappingType;
import org.jboss.shrinkwrap.descriptor.api.webcommon31.ServletType;
import org.jboss.shrinkwrap.descriptor.api.webcommon31.SessionConfigType;
import org.jboss.shrinkwrap.descriptor.api.webcommon31.WebAppVersionType;
import org.jboss.shrinkwrap.descriptor.api.webcommon31.WelcomeFileListType;

/** 
 * <p> 
 * This deployment descriptor provides the functionalities as described in the  specification
 * <p> 
 * Example:
 * <p> 
 * <code> 
 *     WebFragmentDescriptor descriptor = Descriptors.create(WebFragmentDescriptor.class);
 * </code> 
 *
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface WebFragmentDescriptor extends Descriptor, DescriptorNamespace<WebFragmentDescriptor>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentDescriptor ElementName: javaee:emptyType ElementType : distributable
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>distributable</code> element 
    * @return the current instance of <code>WebFragmentDescriptor</code> 
    */
   public WebFragmentDescriptor distributable();

   /**
    * Removes the <code>distributable</code> element 
    * @return the current instance of <code>WebFragmentDescriptor</code> 
    */
   public Boolean isDistributable();

   /**
    * Removes the <code>distributable</code> element 
    * @return the current instance of <code>WebFragmentDescriptor</code> 
    */
   public WebFragmentDescriptor removeDistributable();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentDescriptor ElementName: javaee:param-valueType ElementType : context-param
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>context-param</code> element will be created and returned.
    * Otherwise, the first existing <code>context-param</code> element will be returned.
    * @return the instance defined for the element <code>context-param</code> 
    */
   public ParamValueType<WebFragmentDescriptor> getOrCreateContextParam();

   /**
    * Creates a new <code>context-param</code> element 
    * @return the new created instance of <code>ParamValueType<WebFragmentDescriptor></code> 
    */
   public ParamValueType<WebFragmentDescriptor> createContextParam();

   /**
    * Returns all <code>context-param</code> elements
    * @return list of <code>context-param</code> 
    */
   public List<ParamValueType<WebFragmentDescriptor>> getAllContextParam();

   /**
    * Removes all <code>context-param</code> elements 
    * @return the current instance of <code>ParamValueType<WebFragmentDescriptor></code> 
    */
   public WebFragmentDescriptor removeAllContextParam();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentDescriptor ElementName: javaee:filterType ElementType : filter
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>filter</code> element will be created and returned.
    * Otherwise, the first existing <code>filter</code> element will be returned.
    * @return the instance defined for the element <code>filter</code> 
    */
   public FilterType<WebFragmentDescriptor> getOrCreateFilter();

   /**
    * Creates a new <code>filter</code> element 
    * @return the new created instance of <code>FilterType<WebFragmentDescriptor></code> 
    */
   public FilterType<WebFragmentDescriptor> createFilter();

   /**
    * Returns all <code>filter</code> elements
    * @return list of <code>filter</code> 
    */
   public List<FilterType<WebFragmentDescriptor>> getAllFilter();

   /**
    * Removes all <code>filter</code> elements 
    * @return the current instance of <code>FilterType<WebFragmentDescriptor></code> 
    */
   public WebFragmentDescriptor removeAllFilter();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentDescriptor ElementName: javaee:filter-mappingType ElementType : filter-mapping
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>filter-mapping</code> element will be created and returned.
    * Otherwise, the first existing <code>filter-mapping</code> element will be returned.
    * @return the instance defined for the element <code>filter-mapping</code> 
    */
   public FilterMappingType<WebFragmentDescriptor> getOrCreateFilterMapping();

   /**
    * Creates a new <code>filter-mapping</code> element 
    * @return the new created instance of <code>FilterMappingType<WebFragmentDescriptor></code> 
    */
   public FilterMappingType<WebFragmentDescriptor> createFilterMapping();

   /**
    * Returns all <code>filter-mapping</code> elements
    * @return list of <code>filter-mapping</code> 
    */
   public List<FilterMappingType<WebFragmentDescriptor>> getAllFilterMapping();

   /**
    * Removes all <code>filter-mapping</code> elements 
    * @return the current instance of <code>FilterMappingType<WebFragmentDescriptor></code> 
    */
   public WebFragmentDescriptor removeAllFilterMapping();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentDescriptor ElementName: javaee:listenerType ElementType : listener
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>listener</code> element will be created and returned.
    * Otherwise, the first existing <code>listener</code> element will be returned.
    * @return the instance defined for the element <code>listener</code> 
    */
   public ListenerType<WebFragmentDescriptor> getOrCreateListener();

   /**
    * Creates a new <code>listener</code> element 
    * @return the new created instance of <code>ListenerType<WebFragmentDescriptor></code> 
    */
   public ListenerType<WebFragmentDescriptor> createListener();

   /**
    * Returns all <code>listener</code> elements
    * @return list of <code>listener</code> 
    */
   public List<ListenerType<WebFragmentDescriptor>> getAllListener();

   /**
    * Removes all <code>listener</code> elements 
    * @return the current instance of <code>ListenerType<WebFragmentDescriptor></code> 
    */
   public WebFragmentDescriptor removeAllListener();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentDescriptor ElementName: javaee:servletType ElementType : servlet
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>servlet</code> element will be created and returned.
    * Otherwise, the first existing <code>servlet</code> element will be returned.
    * @return the instance defined for the element <code>servlet</code> 
    */
   public ServletType<WebFragmentDescriptor> getOrCreateServlet();

   /**
    * Creates a new <code>servlet</code> element 
    * @return the new created instance of <code>ServletType<WebFragmentDescriptor></code> 
    */
   public ServletType<WebFragmentDescriptor> createServlet();

   /**
    * Returns all <code>servlet</code> elements
    * @return list of <code>servlet</code> 
    */
   public List<ServletType<WebFragmentDescriptor>> getAllServlet();

   /**
    * Removes all <code>servlet</code> elements 
    * @return the current instance of <code>ServletType<WebFragmentDescriptor></code> 
    */
   public WebFragmentDescriptor removeAllServlet();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentDescriptor ElementName: javaee:servlet-mappingType ElementType : servlet-mapping
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>servlet-mapping</code> element will be created and returned.
    * Otherwise, the first existing <code>servlet-mapping</code> element will be returned.
    * @return the instance defined for the element <code>servlet-mapping</code> 
    */
   public ServletMappingType<WebFragmentDescriptor> getOrCreateServletMapping();

   /**
    * Creates a new <code>servlet-mapping</code> element 
    * @return the new created instance of <code>ServletMappingType<WebFragmentDescriptor></code> 
    */
   public ServletMappingType<WebFragmentDescriptor> createServletMapping();

   /**
    * Returns all <code>servlet-mapping</code> elements
    * @return list of <code>servlet-mapping</code> 
    */
   public List<ServletMappingType<WebFragmentDescriptor>> getAllServletMapping();

   /**
    * Removes all <code>servlet-mapping</code> elements 
    * @return the current instance of <code>ServletMappingType<WebFragmentDescriptor></code> 
    */
   public WebFragmentDescriptor removeAllServletMapping();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentDescriptor ElementName: javaee:session-configType ElementType : session-config
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>session-config</code> element will be created and returned.
    * Otherwise, the first existing <code>session-config</code> element will be returned.
    * @return the instance defined for the element <code>session-config</code> 
    */
   public SessionConfigType<WebFragmentDescriptor> getOrCreateSessionConfig();

   /**
    * Creates a new <code>session-config</code> element 
    * @return the new created instance of <code>SessionConfigType<WebFragmentDescriptor></code> 
    */
   public SessionConfigType<WebFragmentDescriptor> createSessionConfig();

   /**
    * Returns all <code>session-config</code> elements
    * @return list of <code>session-config</code> 
    */
   public List<SessionConfigType<WebFragmentDescriptor>> getAllSessionConfig();

   /**
    * Removes all <code>session-config</code> elements 
    * @return the current instance of <code>SessionConfigType<WebFragmentDescriptor></code> 
    */
   public WebFragmentDescriptor removeAllSessionConfig();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentDescriptor ElementName: javaee:mime-mappingType ElementType : mime-mapping
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>mime-mapping</code> element will be created and returned.
    * Otherwise, the first existing <code>mime-mapping</code> element will be returned.
    * @return the instance defined for the element <code>mime-mapping</code> 
    */
   public MimeMappingType<WebFragmentDescriptor> getOrCreateMimeMapping();

   /**
    * Creates a new <code>mime-mapping</code> element 
    * @return the new created instance of <code>MimeMappingType<WebFragmentDescriptor></code> 
    */
   public MimeMappingType<WebFragmentDescriptor> createMimeMapping();

   /**
    * Returns all <code>mime-mapping</code> elements
    * @return list of <code>mime-mapping</code> 
    */
   public List<MimeMappingType<WebFragmentDescriptor>> getAllMimeMapping();

   /**
    * Removes all <code>mime-mapping</code> elements 
    * @return the current instance of <code>MimeMappingType<WebFragmentDescriptor></code> 
    */
   public WebFragmentDescriptor removeAllMimeMapping();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentDescriptor ElementName: javaee:welcome-file-listType ElementType : welcome-file-list
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>welcome-file-list</code> element will be created and returned.
    * Otherwise, the first existing <code>welcome-file-list</code> element will be returned.
    * @return the instance defined for the element <code>welcome-file-list</code> 
    */
   public WelcomeFileListType<WebFragmentDescriptor> getOrCreateWelcomeFileList();

   /**
    * Creates a new <code>welcome-file-list</code> element 
    * @return the new created instance of <code>WelcomeFileListType<WebFragmentDescriptor></code> 
    */
   public WelcomeFileListType<WebFragmentDescriptor> createWelcomeFileList();

   /**
    * Returns all <code>welcome-file-list</code> elements
    * @return list of <code>welcome-file-list</code> 
    */
   public List<WelcomeFileListType<WebFragmentDescriptor>> getAllWelcomeFileList();

   /**
    * Removes all <code>welcome-file-list</code> elements 
    * @return the current instance of <code>WelcomeFileListType<WebFragmentDescriptor></code> 
    */
   public WebFragmentDescriptor removeAllWelcomeFileList();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentDescriptor ElementName: javaee:error-pageType ElementType : error-page
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>error-page</code> element will be created and returned.
    * Otherwise, the first existing <code>error-page</code> element will be returned.
    * @return the instance defined for the element <code>error-page</code> 
    */
   public ErrorPageType<WebFragmentDescriptor> getOrCreateErrorPage();

   /**
    * Creates a new <code>error-page</code> element 
    * @return the new created instance of <code>ErrorPageType<WebFragmentDescriptor></code> 
    */
   public ErrorPageType<WebFragmentDescriptor> createErrorPage();

   /**
    * Returns all <code>error-page</code> elements
    * @return list of <code>error-page</code> 
    */
   public List<ErrorPageType<WebFragmentDescriptor>> getAllErrorPage();

   /**
    * Removes all <code>error-page</code> elements 
    * @return the current instance of <code>ErrorPageType<WebFragmentDescriptor></code> 
    */
   public WebFragmentDescriptor removeAllErrorPage();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentDescriptor ElementName: javaee:jsp-configType ElementType : jsp-config
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>jsp-config</code> element will be created and returned.
    * Otherwise, the first existing <code>jsp-config</code> element will be returned.
    * @return the instance defined for the element <code>jsp-config</code> 
    */
   public JspConfigType<WebFragmentDescriptor> getOrCreateJspConfig();

   /**
    * Creates a new <code>jsp-config</code> element 
    * @return the new created instance of <code>JspConfigType<WebFragmentDescriptor></code> 
    */
   public JspConfigType<WebFragmentDescriptor> createJspConfig();

   /**
    * Returns all <code>jsp-config</code> elements
    * @return list of <code>jsp-config</code> 
    */
   public List<JspConfigType<WebFragmentDescriptor>> getAllJspConfig();

   /**
    * Removes all <code>jsp-config</code> elements 
    * @return the current instance of <code>JspConfigType<WebFragmentDescriptor></code> 
    */
   public WebFragmentDescriptor removeAllJspConfig();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentDescriptor ElementName: javaee:security-constraintType ElementType : security-constraint
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>security-constraint</code> element will be created and returned.
    * Otherwise, the first existing <code>security-constraint</code> element will be returned.
    * @return the instance defined for the element <code>security-constraint</code> 
    */
   public SecurityConstraintType<WebFragmentDescriptor> getOrCreateSecurityConstraint();

   /**
    * Creates a new <code>security-constraint</code> element 
    * @return the new created instance of <code>SecurityConstraintType<WebFragmentDescriptor></code> 
    */
   public SecurityConstraintType<WebFragmentDescriptor> createSecurityConstraint();

   /**
    * Returns all <code>security-constraint</code> elements
    * @return list of <code>security-constraint</code> 
    */
   public List<SecurityConstraintType<WebFragmentDescriptor>> getAllSecurityConstraint();

   /**
    * Removes all <code>security-constraint</code> elements 
    * @return the current instance of <code>SecurityConstraintType<WebFragmentDescriptor></code> 
    */
   public WebFragmentDescriptor removeAllSecurityConstraint();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentDescriptor ElementName: javaee:login-configType ElementType : login-config
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>login-config</code> element will be created and returned.
    * Otherwise, the first existing <code>login-config</code> element will be returned.
    * @return the instance defined for the element <code>login-config</code> 
    */
   public LoginConfigType<WebFragmentDescriptor> getOrCreateLoginConfig();

   /**
    * Creates a new <code>login-config</code> element 
    * @return the new created instance of <code>LoginConfigType<WebFragmentDescriptor></code> 
    */
   public LoginConfigType<WebFragmentDescriptor> createLoginConfig();

   /**
    * Returns all <code>login-config</code> elements
    * @return list of <code>login-config</code> 
    */
   public List<LoginConfigType<WebFragmentDescriptor>> getAllLoginConfig();

   /**
    * Removes all <code>login-config</code> elements 
    * @return the current instance of <code>LoginConfigType<WebFragmentDescriptor></code> 
    */
   public WebFragmentDescriptor removeAllLoginConfig();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentDescriptor ElementName: javaee:security-roleType ElementType : security-role
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>security-role</code> element will be created and returned.
    * Otherwise, the first existing <code>security-role</code> element will be returned.
    * @return the instance defined for the element <code>security-role</code> 
    */
   public SecurityRoleType<WebFragmentDescriptor> getOrCreateSecurityRole();

   /**
    * Creates a new <code>security-role</code> element 
    * @return the new created instance of <code>SecurityRoleType<WebFragmentDescriptor></code> 
    */
   public SecurityRoleType<WebFragmentDescriptor> createSecurityRole();

   /**
    * Returns all <code>security-role</code> elements
    * @return list of <code>security-role</code> 
    */
   public List<SecurityRoleType<WebFragmentDescriptor>> getAllSecurityRole();

   /**
    * Removes all <code>security-role</code> elements 
    * @return the current instance of <code>SecurityRoleType<WebFragmentDescriptor></code> 
    */
   public WebFragmentDescriptor removeAllSecurityRole();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentDescriptor ElementName: javaee:message-destinationType ElementType : message-destination
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>message-destination</code> element will be created and returned.
    * Otherwise, the first existing <code>message-destination</code> element will be returned.
    * @return the instance defined for the element <code>message-destination</code> 
    */
   public MessageDestinationType<WebFragmentDescriptor> getOrCreateMessageDestination();

   /**
    * Creates a new <code>message-destination</code> element 
    * @return the new created instance of <code>MessageDestinationType<WebFragmentDescriptor></code> 
    */
   public MessageDestinationType<WebFragmentDescriptor> createMessageDestination();

   /**
    * Returns all <code>message-destination</code> elements
    * @return list of <code>message-destination</code> 
    */
   public List<MessageDestinationType<WebFragmentDescriptor>> getAllMessageDestination();

   /**
    * Removes all <code>message-destination</code> elements 
    * @return the current instance of <code>MessageDestinationType<WebFragmentDescriptor></code> 
    */
   public WebFragmentDescriptor removeAllMessageDestination();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentDescriptor ElementName: javaee:locale-encoding-mapping-listType ElementType : locale-encoding-mapping-list
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>locale-encoding-mapping-list</code> element will be created and returned.
    * Otherwise, the first existing <code>locale-encoding-mapping-list</code> element will be returned.
    * @return the instance defined for the element <code>locale-encoding-mapping-list</code> 
    */
   public LocaleEncodingMappingListType<WebFragmentDescriptor> getOrCreateLocaleEncodingMappingList();

   /**
    * Creates a new <code>locale-encoding-mapping-list</code> element 
    * @return the new created instance of <code>LocaleEncodingMappingListType<WebFragmentDescriptor></code> 
    */
   public LocaleEncodingMappingListType<WebFragmentDescriptor> createLocaleEncodingMappingList();

   /**
    * Returns all <code>locale-encoding-mapping-list</code> elements
    * @return list of <code>locale-encoding-mapping-list</code> 
    */
   public List<LocaleEncodingMappingListType<WebFragmentDescriptor>> getAllLocaleEncodingMappingList();

   /**
    * Removes all <code>locale-encoding-mapping-list</code> elements 
    * @return the current instance of <code>LocaleEncodingMappingListType<WebFragmentDescriptor></code> 
    */
   public WebFragmentDescriptor removeAllLocaleEncodingMappingList();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentDescriptor ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>WebFragmentDescriptor</code> 
    */
   public WebFragmentDescriptor description(String ... values);

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>WebFragmentDescriptor</code> 
    */
   public WebFragmentDescriptor removeAllDescription();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentDescriptor ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>WebFragmentDescriptor</code> 
    */
   public WebFragmentDescriptor displayName(String ... values);

   /**
    * Returns all <code>display-name</code> elements
    * @return list of <code>display-name</code> 
    */
   public List<String> getAllDisplayName();

   /**
    * Removes the <code>display-name</code> element 
    * @return the current instance of <code>WebFragmentDescriptor</code> 
    */
   public WebFragmentDescriptor removeAllDisplayName();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentDescriptor ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<WebFragmentDescriptor> getOrCreateIcon();

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<WebFragmentDescriptor></code> 
    */
   public IconType<WebFragmentDescriptor> createIcon();

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<WebFragmentDescriptor>> getAllIcon();

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<WebFragmentDescriptor></code> 
    */
   public WebFragmentDescriptor removeAllIcon();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentDescriptor ElementName: javaee:env-entryType ElementType : env-entry
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>env-entry</code> element will be created and returned.
    * Otherwise, the first existing <code>env-entry</code> element will be returned.
    * @return the instance defined for the element <code>env-entry</code> 
    */
   public EnvEntryType<WebFragmentDescriptor> getOrCreateEnvEntry();

   /**
    * Creates a new <code>env-entry</code> element 
    * @return the new created instance of <code>EnvEntryType<WebFragmentDescriptor></code> 
    */
   public EnvEntryType<WebFragmentDescriptor> createEnvEntry();

   /**
    * Returns all <code>env-entry</code> elements
    * @return list of <code>env-entry</code> 
    */
   public List<EnvEntryType<WebFragmentDescriptor>> getAllEnvEntry();

   /**
    * Removes all <code>env-entry</code> elements 
    * @return the current instance of <code>EnvEntryType<WebFragmentDescriptor></code> 
    */
   public WebFragmentDescriptor removeAllEnvEntry();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentDescriptor ElementName: javaee:ejb-refType ElementType : ejb-ref
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>ejb-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>ejb-ref</code> element will be returned.
    * @return the instance defined for the element <code>ejb-ref</code> 
    */
   public EjbRefType<WebFragmentDescriptor> getOrCreateEjbRef();

   /**
    * Creates a new <code>ejb-ref</code> element 
    * @return the new created instance of <code>EjbRefType<WebFragmentDescriptor></code> 
    */
   public EjbRefType<WebFragmentDescriptor> createEjbRef();

   /**
    * Returns all <code>ejb-ref</code> elements
    * @return list of <code>ejb-ref</code> 
    */
   public List<EjbRefType<WebFragmentDescriptor>> getAllEjbRef();

   /**
    * Removes all <code>ejb-ref</code> elements 
    * @return the current instance of <code>EjbRefType<WebFragmentDescriptor></code> 
    */
   public WebFragmentDescriptor removeAllEjbRef();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentDescriptor ElementName: javaee:ejb-local-refType ElementType : ejb-local-ref
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>ejb-local-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>ejb-local-ref</code> element will be returned.
    * @return the instance defined for the element <code>ejb-local-ref</code> 
    */
   public EjbLocalRefType<WebFragmentDescriptor> getOrCreateEjbLocalRef();

   /**
    * Creates a new <code>ejb-local-ref</code> element 
    * @return the new created instance of <code>EjbLocalRefType<WebFragmentDescriptor></code> 
    */
   public EjbLocalRefType<WebFragmentDescriptor> createEjbLocalRef();

   /**
    * Returns all <code>ejb-local-ref</code> elements
    * @return list of <code>ejb-local-ref</code> 
    */
   public List<EjbLocalRefType<WebFragmentDescriptor>> getAllEjbLocalRef();

   /**
    * Removes all <code>ejb-local-ref</code> elements 
    * @return the current instance of <code>EjbLocalRefType<WebFragmentDescriptor></code> 
    */
   public WebFragmentDescriptor removeAllEjbLocalRef();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentDescriptor ElementName: javaee:resource-refType ElementType : resource-ref
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>resource-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>resource-ref</code> element will be returned.
    * @return the instance defined for the element <code>resource-ref</code> 
    */
   public ResourceRefType<WebFragmentDescriptor> getOrCreateResourceRef();

   /**
    * Creates a new <code>resource-ref</code> element 
    * @return the new created instance of <code>ResourceRefType<WebFragmentDescriptor></code> 
    */
   public ResourceRefType<WebFragmentDescriptor> createResourceRef();

   /**
    * Returns all <code>resource-ref</code> elements
    * @return list of <code>resource-ref</code> 
    */
   public List<ResourceRefType<WebFragmentDescriptor>> getAllResourceRef();

   /**
    * Removes all <code>resource-ref</code> elements 
    * @return the current instance of <code>ResourceRefType<WebFragmentDescriptor></code> 
    */
   public WebFragmentDescriptor removeAllResourceRef();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentDescriptor ElementName: javaee:resource-env-refType ElementType : resource-env-ref
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>resource-env-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>resource-env-ref</code> element will be returned.
    * @return the instance defined for the element <code>resource-env-ref</code> 
    */
   public ResourceEnvRefType<WebFragmentDescriptor> getOrCreateResourceEnvRef();

   /**
    * Creates a new <code>resource-env-ref</code> element 
    * @return the new created instance of <code>ResourceEnvRefType<WebFragmentDescriptor></code> 
    */
   public ResourceEnvRefType<WebFragmentDescriptor> createResourceEnvRef();

   /**
    * Returns all <code>resource-env-ref</code> elements
    * @return list of <code>resource-env-ref</code> 
    */
   public List<ResourceEnvRefType<WebFragmentDescriptor>> getAllResourceEnvRef();

   /**
    * Removes all <code>resource-env-ref</code> elements 
    * @return the current instance of <code>ResourceEnvRefType<WebFragmentDescriptor></code> 
    */
   public WebFragmentDescriptor removeAllResourceEnvRef();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentDescriptor ElementName: javaee:message-destination-refType ElementType : message-destination-ref
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>message-destination-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>message-destination-ref</code> element will be returned.
    * @return the instance defined for the element <code>message-destination-ref</code> 
    */
   public MessageDestinationRefType<WebFragmentDescriptor> getOrCreateMessageDestinationRef();

   /**
    * Creates a new <code>message-destination-ref</code> element 
    * @return the new created instance of <code>MessageDestinationRefType<WebFragmentDescriptor></code> 
    */
   public MessageDestinationRefType<WebFragmentDescriptor> createMessageDestinationRef();

   /**
    * Returns all <code>message-destination-ref</code> elements
    * @return list of <code>message-destination-ref</code> 
    */
   public List<MessageDestinationRefType<WebFragmentDescriptor>> getAllMessageDestinationRef();

   /**
    * Removes all <code>message-destination-ref</code> elements 
    * @return the current instance of <code>MessageDestinationRefType<WebFragmentDescriptor></code> 
    */
   public WebFragmentDescriptor removeAllMessageDestinationRef();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentDescriptor ElementName: javaee:persistence-context-refType ElementType : persistence-context-ref
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>persistence-context-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>persistence-context-ref</code> element will be returned.
    * @return the instance defined for the element <code>persistence-context-ref</code> 
    */
   public PersistenceContextRefType<WebFragmentDescriptor> getOrCreatePersistenceContextRef();

   /**
    * Creates a new <code>persistence-context-ref</code> element 
    * @return the new created instance of <code>PersistenceContextRefType<WebFragmentDescriptor></code> 
    */
   public PersistenceContextRefType<WebFragmentDescriptor> createPersistenceContextRef();

   /**
    * Returns all <code>persistence-context-ref</code> elements
    * @return list of <code>persistence-context-ref</code> 
    */
   public List<PersistenceContextRefType<WebFragmentDescriptor>> getAllPersistenceContextRef();

   /**
    * Removes all <code>persistence-context-ref</code> elements 
    * @return the current instance of <code>PersistenceContextRefType<WebFragmentDescriptor></code> 
    */
   public WebFragmentDescriptor removeAllPersistenceContextRef();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentDescriptor ElementName: javaee:persistence-unit-refType ElementType : persistence-unit-ref
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>persistence-unit-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>persistence-unit-ref</code> element will be returned.
    * @return the instance defined for the element <code>persistence-unit-ref</code> 
    */
   public PersistenceUnitRefType<WebFragmentDescriptor> getOrCreatePersistenceUnitRef();

   /**
    * Creates a new <code>persistence-unit-ref</code> element 
    * @return the new created instance of <code>PersistenceUnitRefType<WebFragmentDescriptor></code> 
    */
   public PersistenceUnitRefType<WebFragmentDescriptor> createPersistenceUnitRef();

   /**
    * Returns all <code>persistence-unit-ref</code> elements
    * @return list of <code>persistence-unit-ref</code> 
    */
   public List<PersistenceUnitRefType<WebFragmentDescriptor>> getAllPersistenceUnitRef();

   /**
    * Removes all <code>persistence-unit-ref</code> elements 
    * @return the current instance of <code>PersistenceUnitRefType<WebFragmentDescriptor></code> 
    */
   public WebFragmentDescriptor removeAllPersistenceUnitRef();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentDescriptor ElementName: javaee:lifecycle-callbackType ElementType : post-construct
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>post-construct</code> element will be created and returned.
    * Otherwise, the first existing <code>post-construct</code> element will be returned.
    * @return the instance defined for the element <code>post-construct</code> 
    */
   public LifecycleCallbackType<WebFragmentDescriptor> getOrCreatePostConstruct();

   /**
    * Creates a new <code>post-construct</code> element 
    * @return the new created instance of <code>LifecycleCallbackType<WebFragmentDescriptor></code> 
    */
   public LifecycleCallbackType<WebFragmentDescriptor> createPostConstruct();

   /**
    * Returns all <code>post-construct</code> elements
    * @return list of <code>post-construct</code> 
    */
   public List<LifecycleCallbackType<WebFragmentDescriptor>> getAllPostConstruct();

   /**
    * Removes all <code>post-construct</code> elements 
    * @return the current instance of <code>LifecycleCallbackType<WebFragmentDescriptor></code> 
    */
   public WebFragmentDescriptor removeAllPostConstruct();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentDescriptor ElementName: javaee:lifecycle-callbackType ElementType : pre-destroy
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>pre-destroy</code> element will be created and returned.
    * Otherwise, the first existing <code>pre-destroy</code> element will be returned.
    * @return the instance defined for the element <code>pre-destroy</code> 
    */
   public LifecycleCallbackType<WebFragmentDescriptor> getOrCreatePreDestroy();

   /**
    * Creates a new <code>pre-destroy</code> element 
    * @return the new created instance of <code>LifecycleCallbackType<WebFragmentDescriptor></code> 
    */
   public LifecycleCallbackType<WebFragmentDescriptor> createPreDestroy();

   /**
    * Returns all <code>pre-destroy</code> elements
    * @return list of <code>pre-destroy</code> 
    */
   public List<LifecycleCallbackType<WebFragmentDescriptor>> getAllPreDestroy();

   /**
    * Removes all <code>pre-destroy</code> elements 
    * @return the current instance of <code>LifecycleCallbackType<WebFragmentDescriptor></code> 
    */
   public WebFragmentDescriptor removeAllPreDestroy();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentDescriptor ElementName: javaee:data-sourceType ElementType : data-source
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>data-source</code> element will be created and returned.
    * Otherwise, the first existing <code>data-source</code> element will be returned.
    * @return the instance defined for the element <code>data-source</code> 
    */
   public DataSourceType<WebFragmentDescriptor> getOrCreateDataSource();

   /**
    * Creates a new <code>data-source</code> element 
    * @return the new created instance of <code>DataSourceType<WebFragmentDescriptor></code> 
    */
   public DataSourceType<WebFragmentDescriptor> createDataSource();

   /**
    * Returns all <code>data-source</code> elements
    * @return list of <code>data-source</code> 
    */
   public List<DataSourceType<WebFragmentDescriptor>> getAllDataSource();

   /**
    * Removes all <code>data-source</code> elements 
    * @return the current instance of <code>DataSourceType<WebFragmentDescriptor></code> 
    */
   public WebFragmentDescriptor removeAllDataSource();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentDescriptor ElementName: javaee:jms-connection-factoryType ElementType : jms-connection-factory
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>jms-connection-factory</code> element will be created and returned.
    * Otherwise, the first existing <code>jms-connection-factory</code> element will be returned.
    * @return the instance defined for the element <code>jms-connection-factory</code> 
    */
   public JmsConnectionFactoryType<WebFragmentDescriptor> getOrCreateJmsConnectionFactory();

   /**
    * Creates a new <code>jms-connection-factory</code> element 
    * @return the new created instance of <code>JmsConnectionFactoryType<WebFragmentDescriptor></code> 
    */
   public JmsConnectionFactoryType<WebFragmentDescriptor> createJmsConnectionFactory();

   /**
    * Returns all <code>jms-connection-factory</code> elements
    * @return list of <code>jms-connection-factory</code> 
    */
   public List<JmsConnectionFactoryType<WebFragmentDescriptor>> getAllJmsConnectionFactory();

   /**
    * Removes all <code>jms-connection-factory</code> elements 
    * @return the current instance of <code>JmsConnectionFactoryType<WebFragmentDescriptor></code> 
    */
   public WebFragmentDescriptor removeAllJmsConnectionFactory();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentDescriptor ElementName: javaee:jms-destinationType ElementType : jms-destination
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>jms-destination</code> element will be created and returned.
    * Otherwise, the first existing <code>jms-destination</code> element will be returned.
    * @return the instance defined for the element <code>jms-destination</code> 
    */
   public JmsDestinationType<WebFragmentDescriptor> getOrCreateJmsDestination();

   /**
    * Creates a new <code>jms-destination</code> element 
    * @return the new created instance of <code>JmsDestinationType<WebFragmentDescriptor></code> 
    */
   public JmsDestinationType<WebFragmentDescriptor> createJmsDestination();

   /**
    * Returns all <code>jms-destination</code> elements
    * @return list of <code>jms-destination</code> 
    */
   public List<JmsDestinationType<WebFragmentDescriptor>> getAllJmsDestination();

   /**
    * Removes all <code>jms-destination</code> elements 
    * @return the current instance of <code>JmsDestinationType<WebFragmentDescriptor></code> 
    */
   public WebFragmentDescriptor removeAllJmsDestination();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentDescriptor ElementName: javaee:mail-sessionType ElementType : mail-session
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>mail-session</code> element will be created and returned.
    * Otherwise, the first existing <code>mail-session</code> element will be returned.
    * @return the instance defined for the element <code>mail-session</code> 
    */
   public MailSessionType<WebFragmentDescriptor> getOrCreateMailSession();

   /**
    * Creates a new <code>mail-session</code> element 
    * @return the new created instance of <code>MailSessionType<WebFragmentDescriptor></code> 
    */
   public MailSessionType<WebFragmentDescriptor> createMailSession();

   /**
    * Returns all <code>mail-session</code> elements
    * @return list of <code>mail-session</code> 
    */
   public List<MailSessionType<WebFragmentDescriptor>> getAllMailSession();

   /**
    * Removes all <code>mail-session</code> elements 
    * @return the current instance of <code>MailSessionType<WebFragmentDescriptor></code> 
    */
   public WebFragmentDescriptor removeAllMailSession();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentDescriptor ElementName: javaee:connection-factory-resourceType ElementType : connection-factory
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>connection-factory</code> element will be created and returned.
    * Otherwise, the first existing <code>connection-factory</code> element will be returned.
    * @return the instance defined for the element <code>connection-factory</code> 
    */
   public ConnectionFactoryResourceType<WebFragmentDescriptor> getOrCreateConnectionFactory();

   /**
    * Creates a new <code>connection-factory</code> element 
    * @return the new created instance of <code>ConnectionFactoryResourceType<WebFragmentDescriptor></code> 
    */
   public ConnectionFactoryResourceType<WebFragmentDescriptor> createConnectionFactory();

   /**
    * Returns all <code>connection-factory</code> elements
    * @return list of <code>connection-factory</code> 
    */
   public List<ConnectionFactoryResourceType<WebFragmentDescriptor>> getAllConnectionFactory();

   /**
    * Removes all <code>connection-factory</code> elements 
    * @return the current instance of <code>ConnectionFactoryResourceType<WebFragmentDescriptor></code> 
    */
   public WebFragmentDescriptor removeAllConnectionFactory();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentDescriptor ElementName: javaee:administered-objectType ElementType : administered-object
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>administered-object</code> element will be created and returned.
    * Otherwise, the first existing <code>administered-object</code> element will be returned.
    * @return the instance defined for the element <code>administered-object</code> 
    */
   public AdministeredObjectType<WebFragmentDescriptor> getOrCreateAdministeredObject();

   /**
    * Creates a new <code>administered-object</code> element 
    * @return the new created instance of <code>AdministeredObjectType<WebFragmentDescriptor></code> 
    */
   public AdministeredObjectType<WebFragmentDescriptor> createAdministeredObject();

   /**
    * Returns all <code>administered-object</code> elements
    * @return list of <code>administered-object</code> 
    */
   public List<AdministeredObjectType<WebFragmentDescriptor>> getAllAdministeredObject();

   /**
    * Removes all <code>administered-object</code> elements 
    * @return the current instance of <code>AdministeredObjectType<WebFragmentDescriptor></code> 
    */
   public WebFragmentDescriptor removeAllAdministeredObject();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentDescriptor ElementName: javaee:service-refType ElementType : service-ref
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>service-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>service-ref</code> element will be returned.
    * @return the instance defined for the element <code>service-ref</code> 
    */
   public ServiceRefType<WebFragmentDescriptor> getOrCreateServiceRef();

   /**
    * Creates a new <code>service-ref</code> element 
    * @return the new created instance of <code>ServiceRefType<WebFragmentDescriptor></code> 
    */
   public ServiceRefType<WebFragmentDescriptor> createServiceRef();

   /**
    * Returns all <code>service-ref</code> elements
    * @return list of <code>service-ref</code> 
    */
   public List<ServiceRefType<WebFragmentDescriptor>> getAllServiceRef();

   /**
    * Removes all <code>service-ref</code> elements 
    * @return the current instance of <code>ServiceRefType<WebFragmentDescriptor></code> 
    */
   public WebFragmentDescriptor removeAllServiceRef();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentDescriptor ElementName: javaee:web-app-versionType ElementType : version
   // MaxOccurs: -  isGeneric: false   isAttribute: true isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of <code>WebFragmentDescriptor</code> 
    */
   public WebFragmentDescriptor version(WebAppVersionType version);

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of <code>WebFragmentDescriptor</code> 
    */
   public WebFragmentDescriptor version(String version);

   /**
    * Returns the <code>version</code> attribute
    * @return the value defined for the attribute <code>version</code> 
    */
public WebAppVersionType getVersion();

   /**
    * Returns the <code>version</code> attribute
    * @return the value found for the element <code>version</code> 
    */
   public String  getVersionAsString();

   /**
    * Removes the <code>version</code> attribute 
    * @return the current instance of <code>WebFragmentDescriptor</code> 
    */
   public WebFragmentDescriptor removeVersion();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentDescriptor ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: false   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>WebFragmentDescriptor</code> 
    */
   public WebFragmentDescriptor id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>WebFragmentDescriptor</code> 
    */
   public WebFragmentDescriptor removeId();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentDescriptor ElementName: xsd:boolean ElementType : metadata-complete
   // MaxOccurs: -  isGeneric: false   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>metadata-complete</code> attribute
    * @param metadataComplete the value for the attribute <code>metadata-complete</code> 
    * @return the current instance of <code>WebFragmentDescriptor</code> 
    */
   public WebFragmentDescriptor metadataComplete(Boolean metadataComplete);

   /**
    * Returns the <code>metadata-complete</code> attribute
    * @return the value defined for the attribute <code>metadata-complete</code> 
    */
public Boolean isMetadataComplete();

   /**
    * Removes the <code>metadata-complete</code> attribute 
    * @return the current instance of <code>WebFragmentDescriptor</code> 
    */
   public WebFragmentDescriptor removeMetadataComplete();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentDescriptor ElementName: xsd:token ElementType : name
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>name</code> elements, 
    * a new <code>name</code> element 
    * @param values list of <code>name</code> objects 
    * @return the current instance of <code>WebFragmentDescriptor</code> 
    */
   public WebFragmentDescriptor name(String ... values);

   /**
    * Returns all <code>name</code> elements
    * @return list of <code>name</code> 
    */
   public List<String> getAllName();

   /**
    * Removes the <code>name</code> element 
    * @return the current instance of <code>WebFragmentDescriptor</code> 
    */
   public WebFragmentDescriptor removeAllName();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentDescriptor ElementName: javaee:orderingType ElementType : ordering
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>ordering</code> element will be created and returned.
    * Otherwise, the first existing <code>ordering</code> element will be returned.
    * @return the instance defined for the element <code>ordering</code> 
    */
   public OrderingType<WebFragmentDescriptor> getOrCreateOrdering();

   /**
    * Creates a new <code>ordering</code> element 
    * @return the new created instance of <code>OrderingType<WebFragmentDescriptor></code> 
    */
   public OrderingType<WebFragmentDescriptor> createOrdering();

   /**
    * Returns all <code>ordering</code> elements
    * @return list of <code>ordering</code> 
    */
   public List<OrderingType<WebFragmentDescriptor>> getAllOrdering();

   /**
    * Removes all <code>ordering</code> elements 
    * @return the current instance of <code>OrderingType<WebFragmentDescriptor></code> 
    */
   public WebFragmentDescriptor removeAllOrdering();
}
