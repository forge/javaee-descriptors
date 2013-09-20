package org.jboss.shrinkwrap.descriptor.api.webapp30;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Descriptor;
import org.jboss.shrinkwrap.descriptor.api.DescriptorNamespace;
import org.jboss.shrinkwrap.descriptor.api.javaee6.DataSourceType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EjbLocalRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EjbRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EnvEntryType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.LifecycleCallbackType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ListenerType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.MessageDestinationRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.MessageDestinationType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ParamValueType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.PersistenceContextRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.PersistenceUnitRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ResourceEnvRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ResourceRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.SecurityRoleType;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient13.ServiceRefType;
import org.jboss.shrinkwrap.descriptor.api.jsp22.JspConfigType;
import org.jboss.shrinkwrap.descriptor.api.webapp.WebAppCommonDescriptor;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.AbsoluteOrderingType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.ErrorPageType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.FilterMappingType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.FilterType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.LocaleEncodingMappingListType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.LoginConfigType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.MimeMappingType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.SecurityConstraintType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.ServletMappingType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.ServletType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.SessionConfigType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.WebAppVersionType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.WelcomeFileListType;

/**
 * <p>
 * This deployment descriptor provides the functionalities as described in the specification
 * <p>
 * Example:
 * <p>
 * <code> 
 *     WebAppDescriptor descriptor = Descriptors.create(WebAppDescriptor.class);
 * </code>
 * 
 * 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface WebAppDescriptor
         extends
         Descriptor,
         DescriptorNamespace<WebAppDescriptor>,
         WebAppCommonDescriptor<WebAppDescriptor, ParamValueType<WebAppDescriptor>, ServletType<WebAppDescriptor>, ServletMappingType<WebAppDescriptor>>
{

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppDescriptor ElementName: javaee:filterType ElementType : filter
   // MaxOccurs: -unbounded isGeneric: false isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>filter</code> element will be created and returned. Otherwise, the first
    * existing <code>filter</code> element will be returned.
    * 
    * @return the instance defined for the element <code>filter</code>
    */
   public FilterType<WebAppDescriptor> getOrCreateFilter();

   /**
    * Creates a new <code>filter</code> element
    * 
    * @return the new created instance of <code>FilterType<WebAppDescriptor></code>
    */
   public FilterType<WebAppDescriptor> createFilter();

   /**
    * Returns all <code>filter</code> elements
    * 
    * @return list of <code>filter</code>
    */
   public List<FilterType<WebAppDescriptor>> getAllFilter();

   /**
    * Removes all <code>filter</code> elements
    * 
    * @return the current instance of <code>FilterType<WebAppDescriptor></code>
    */
   public WebAppDescriptor removeAllFilter();

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppDescriptor ElementName: javaee:filter-mappingType ElementType : filter-mapping
   // MaxOccurs: -unbounded isGeneric: false isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>filter-mapping</code> element will be created and returned. Otherwise, the
    * first existing <code>filter-mapping</code> element will be returned.
    * 
    * @return the instance defined for the element <code>filter-mapping</code>
    */
   public FilterMappingType<WebAppDescriptor> getOrCreateFilterMapping();

   /**
    * Creates a new <code>filter-mapping</code> element
    * 
    * @return the new created instance of <code>FilterMappingType<WebAppDescriptor></code>
    */
   public FilterMappingType<WebAppDescriptor> createFilterMapping();

   /**
    * Returns all <code>filter-mapping</code> elements
    * 
    * @return list of <code>filter-mapping</code>
    */
   public List<FilterMappingType<WebAppDescriptor>> getAllFilterMapping();

   /**
    * Removes all <code>filter-mapping</code> elements
    * 
    * @return the current instance of <code>FilterMappingType<WebAppDescriptor></code>
    */
   public WebAppDescriptor removeAllFilterMapping();

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppDescriptor ElementName: javaee:listenerType ElementType : listener
   // MaxOccurs: -unbounded isGeneric: false isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>listener</code> element will be created and returned. Otherwise, the first
    * existing <code>listener</code> element will be returned.
    * 
    * @return the instance defined for the element <code>listener</code>
    */
   public ListenerType<WebAppDescriptor> getOrCreateListener();

   /**
    * Creates a new <code>listener</code> element
    * 
    * @return the new created instance of <code>ListenerType<WebAppDescriptor></code>
    */
   public ListenerType<WebAppDescriptor> createListener();

   /**
    * Returns all <code>listener</code> elements
    * 
    * @return list of <code>listener</code>
    */
   public List<ListenerType<WebAppDescriptor>> getAllListener();

   /**
    * Removes all <code>listener</code> elements
    * 
    * @return the current instance of <code>ListenerType<WebAppDescriptor></code>
    */
   public WebAppDescriptor removeAllListener();

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppDescriptor ElementName: javaee:servletType ElementType : servlet
   // MaxOccurs: -unbounded isGeneric: false isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>servlet</code> element will be created and returned. Otherwise, the first
    * existing <code>servlet</code> element will be returned.
    * 
    * @return the instance defined for the element <code>servlet</code>
    */
   public ServletType<WebAppDescriptor> getOrCreateServlet();

   /**
    * Creates a new <code>servlet</code> element
    * 
    * @return the new created instance of <code>ServletType<WebAppDescriptor></code>
    */
   public ServletType<WebAppDescriptor> createServlet();

   /**
    * Returns all <code>servlet</code> elements
    * 
    * @return list of <code>servlet</code>
    */
   public List<ServletType<WebAppDescriptor>> getAllServlet();

   /**
    * Removes all <code>servlet</code> elements
    * 
    * @return the current instance of <code>ServletType<WebAppDescriptor></code>
    */
   public WebAppDescriptor removeAllServlet();

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppDescriptor ElementName: javaee:servlet-mappingType ElementType : servlet-mapping
   // MaxOccurs: -unbounded isGeneric: false isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>servlet-mapping</code> element will be created and returned. Otherwise, the
    * first existing <code>servlet-mapping</code> element will be returned.
    * 
    * @return the instance defined for the element <code>servlet-mapping</code>
    */
   public ServletMappingType<WebAppDescriptor> getOrCreateServletMapping();

   /**
    * Creates a new <code>servlet-mapping</code> element
    * 
    * @return the new created instance of <code>ServletMappingType<WebAppDescriptor></code>
    */
   public ServletMappingType<WebAppDescriptor> createServletMapping();

   /**
    * Returns all <code>servlet-mapping</code> elements
    * 
    * @return list of <code>servlet-mapping</code>
    */
   public List<ServletMappingType<WebAppDescriptor>> getAllServletMapping();

   /**
    * Removes all <code>servlet-mapping</code> elements
    * 
    * @return the current instance of <code>ServletMappingType<WebAppDescriptor></code>
    */
   public WebAppDescriptor removeAllServletMapping();

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppDescriptor ElementName: javaee:session-configType ElementType : session-config
   // MaxOccurs: -unbounded isGeneric: false isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>session-config</code> element will be created and returned. Otherwise, the
    * first existing <code>session-config</code> element will be returned.
    * 
    * @return the instance defined for the element <code>session-config</code>
    */
   public SessionConfigType<WebAppDescriptor> getOrCreateSessionConfig();

   /**
    * Creates a new <code>session-config</code> element
    * 
    * @return the new created instance of <code>SessionConfigType<WebAppDescriptor></code>
    */
   public SessionConfigType<WebAppDescriptor> createSessionConfig();

   /**
    * Returns all <code>session-config</code> elements
    * 
    * @return list of <code>session-config</code>
    */
   public List<SessionConfigType<WebAppDescriptor>> getAllSessionConfig();

   /**
    * Removes all <code>session-config</code> elements
    * 
    * @return the current instance of <code>SessionConfigType<WebAppDescriptor></code>
    */
   public WebAppDescriptor removeAllSessionConfig();

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppDescriptor ElementName: javaee:mime-mappingType ElementType : mime-mapping
   // MaxOccurs: -unbounded isGeneric: false isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>mime-mapping</code> element will be created and returned. Otherwise, the first
    * existing <code>mime-mapping</code> element will be returned.
    * 
    * @return the instance defined for the element <code>mime-mapping</code>
    */
   public MimeMappingType<WebAppDescriptor> getOrCreateMimeMapping();

   /**
    * Creates a new <code>mime-mapping</code> element
    * 
    * @return the new created instance of <code>MimeMappingType<WebAppDescriptor></code>
    */
   public MimeMappingType<WebAppDescriptor> createMimeMapping();

   /**
    * Returns all <code>mime-mapping</code> elements
    * 
    * @return list of <code>mime-mapping</code>
    */
   public List<MimeMappingType<WebAppDescriptor>> getAllMimeMapping();

   /**
    * Removes all <code>mime-mapping</code> elements
    * 
    * @return the current instance of <code>MimeMappingType<WebAppDescriptor></code>
    */
   public WebAppDescriptor removeAllMimeMapping();

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppDescriptor ElementName: javaee:welcome-file-listType ElementType : welcome-file-list
   // MaxOccurs: -unbounded isGeneric: false isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>welcome-file-list</code> element will be created and returned. Otherwise, the
    * first existing <code>welcome-file-list</code> element will be returned.
    * 
    * @return the instance defined for the element <code>welcome-file-list</code>
    */
   public WelcomeFileListType<WebAppDescriptor> getOrCreateWelcomeFileList();

   /**
    * Creates a new <code>welcome-file-list</code> element
    * 
    * @return the new created instance of <code>WelcomeFileListType<WebAppDescriptor></code>
    */
   public WelcomeFileListType<WebAppDescriptor> createWelcomeFileList();

   /**
    * Returns all <code>welcome-file-list</code> elements
    * 
    * @return list of <code>welcome-file-list</code>
    */
   public List<WelcomeFileListType<WebAppDescriptor>> getAllWelcomeFileList();

   /**
    * Removes all <code>welcome-file-list</code> elements
    * 
    * @return the current instance of <code>WelcomeFileListType<WebAppDescriptor></code>
    */
   public WebAppDescriptor removeAllWelcomeFileList();

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppDescriptor ElementName: javaee:error-pageType ElementType : error-page
   // MaxOccurs: -unbounded isGeneric: false isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>error-page</code> element will be created and returned. Otherwise, the first
    * existing <code>error-page</code> element will be returned.
    * 
    * @return the instance defined for the element <code>error-page</code>
    */
   public ErrorPageType<WebAppDescriptor> getOrCreateErrorPage();

   /**
    * Creates a new <code>error-page</code> element
    * 
    * @return the new created instance of <code>ErrorPageType<WebAppDescriptor></code>
    */
   public ErrorPageType<WebAppDescriptor> createErrorPage();

   /**
    * Returns all <code>error-page</code> elements
    * 
    * @return list of <code>error-page</code>
    */
   public List<ErrorPageType<WebAppDescriptor>> getAllErrorPage();

   /**
    * Removes all <code>error-page</code> elements
    * 
    * @return the current instance of <code>ErrorPageType<WebAppDescriptor></code>
    */
   public WebAppDescriptor removeAllErrorPage();

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppDescriptor ElementName: javaee:jsp-configType ElementType : jsp-config
   // MaxOccurs: -unbounded isGeneric: false isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>jsp-config</code> element will be created and returned. Otherwise, the first
    * existing <code>jsp-config</code> element will be returned.
    * 
    * @return the instance defined for the element <code>jsp-config</code>
    */
   public JspConfigType<WebAppDescriptor> getOrCreateJspConfig();

   /**
    * Creates a new <code>jsp-config</code> element
    * 
    * @return the new created instance of <code>JspConfigType<WebAppDescriptor></code>
    */
   public JspConfigType<WebAppDescriptor> createJspConfig();

   /**
    * Returns all <code>jsp-config</code> elements
    * 
    * @return list of <code>jsp-config</code>
    */
   public List<JspConfigType<WebAppDescriptor>> getAllJspConfig();

   /**
    * Removes all <code>jsp-config</code> elements
    * 
    * @return the current instance of <code>JspConfigType<WebAppDescriptor></code>
    */
   public WebAppDescriptor removeAllJspConfig();

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppDescriptor ElementName: javaee:security-constraintType ElementType : security-constraint
   // MaxOccurs: -unbounded isGeneric: false isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>security-constraint</code> element will be created and returned. Otherwise,
    * the first existing <code>security-constraint</code> element will be returned.
    * 
    * @return the instance defined for the element <code>security-constraint</code>
    */
   public SecurityConstraintType<WebAppDescriptor> getOrCreateSecurityConstraint();

   /**
    * Creates a new <code>security-constraint</code> element
    * 
    * @return the new created instance of <code>SecurityConstraintType<WebAppDescriptor></code>
    */
   public SecurityConstraintType<WebAppDescriptor> createSecurityConstraint();

   /**
    * Returns all <code>security-constraint</code> elements
    * 
    * @return list of <code>security-constraint</code>
    */
   public List<SecurityConstraintType<WebAppDescriptor>> getAllSecurityConstraint();

   /**
    * Removes all <code>security-constraint</code> elements
    * 
    * @return the current instance of <code>SecurityConstraintType<WebAppDescriptor></code>
    */
   public WebAppDescriptor removeAllSecurityConstraint();

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppDescriptor ElementName: javaee:login-configType ElementType : login-config
   // MaxOccurs: -unbounded isGeneric: false isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>login-config</code> element will be created and returned. Otherwise, the first
    * existing <code>login-config</code> element will be returned.
    * 
    * @return the instance defined for the element <code>login-config</code>
    */
   public LoginConfigType<WebAppDescriptor> getOrCreateLoginConfig();

   /**
    * Creates a new <code>login-config</code> element
    * 
    * @return the new created instance of <code>LoginConfigType<WebAppDescriptor></code>
    */
   public LoginConfigType<WebAppDescriptor> createLoginConfig();

   /**
    * Returns all <code>login-config</code> elements
    * 
    * @return list of <code>login-config</code>
    */
   public List<LoginConfigType<WebAppDescriptor>> getAllLoginConfig();

   /**
    * Removes all <code>login-config</code> elements
    * 
    * @return the current instance of <code>LoginConfigType<WebAppDescriptor></code>
    */
   public WebAppDescriptor removeAllLoginConfig();

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppDescriptor ElementName: javaee:security-roleType ElementType : security-role
   // MaxOccurs: -unbounded isGeneric: false isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>security-role</code> element will be created and returned. Otherwise, the
    * first existing <code>security-role</code> element will be returned.
    * 
    * @return the instance defined for the element <code>security-role</code>
    */
   public SecurityRoleType<WebAppDescriptor> getOrCreateSecurityRole();

   /**
    * Creates a new <code>security-role</code> element
    * 
    * @return the new created instance of <code>SecurityRoleType<WebAppDescriptor></code>
    */
   public SecurityRoleType<WebAppDescriptor> createSecurityRole();

   /**
    * Returns all <code>security-role</code> elements
    * 
    * @return list of <code>security-role</code>
    */
   public List<SecurityRoleType<WebAppDescriptor>> getAllSecurityRole();

   /**
    * Removes all <code>security-role</code> elements
    * 
    * @return the current instance of <code>SecurityRoleType<WebAppDescriptor></code>
    */
   public WebAppDescriptor removeAllSecurityRole();

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppDescriptor ElementName: javaee:message-destinationType ElementType : message-destination
   // MaxOccurs: -unbounded isGeneric: false isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>message-destination</code> element will be created and returned. Otherwise,
    * the first existing <code>message-destination</code> element will be returned.
    * 
    * @return the instance defined for the element <code>message-destination</code>
    */
   public MessageDestinationType<WebAppDescriptor> getOrCreateMessageDestination();

   /**
    * Creates a new <code>message-destination</code> element
    * 
    * @return the new created instance of <code>MessageDestinationType<WebAppDescriptor></code>
    */
   public MessageDestinationType<WebAppDescriptor> createMessageDestination();

   /**
    * Returns all <code>message-destination</code> elements
    * 
    * @return list of <code>message-destination</code>
    */
   public List<MessageDestinationType<WebAppDescriptor>> getAllMessageDestination();

   /**
    * Removes all <code>message-destination</code> elements
    * 
    * @return the current instance of <code>MessageDestinationType<WebAppDescriptor></code>
    */
   public WebAppDescriptor removeAllMessageDestination();

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppDescriptor ElementName: javaee:locale-encoding-mapping-listType ElementType :
   // locale-encoding-mapping-list
   // MaxOccurs: -unbounded isGeneric: false isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>locale-encoding-mapping-list</code> element will be created and returned.
    * Otherwise, the first existing <code>locale-encoding-mapping-list</code> element will be returned.
    * 
    * @return the instance defined for the element <code>locale-encoding-mapping-list</code>
    */
   public LocaleEncodingMappingListType<WebAppDescriptor> getOrCreateLocaleEncodingMappingList();

   /**
    * Creates a new <code>locale-encoding-mapping-list</code> element
    * 
    * @return the new created instance of <code>LocaleEncodingMappingListType<WebAppDescriptor></code>
    */
   public LocaleEncodingMappingListType<WebAppDescriptor> createLocaleEncodingMappingList();

   /**
    * Returns all <code>locale-encoding-mapping-list</code> elements
    * 
    * @return list of <code>locale-encoding-mapping-list</code>
    */
   public List<LocaleEncodingMappingListType<WebAppDescriptor>> getAllLocaleEncodingMappingList();

   /**
    * Removes all <code>locale-encoding-mapping-list</code> elements
    * 
    * @return the current instance of <code>LocaleEncodingMappingListType<WebAppDescriptor></code>
    */
   public WebAppDescriptor removeAllLocaleEncodingMappingList();

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppDescriptor ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded isGeneric: false isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, a new <code>description</code>
    * element
    * 
    * @param values list of <code>description</code> objects
    * @return the current instance of <code>WebAppDescriptor</code>
    */
   public WebAppDescriptor description(String... values);

   /**
    * Returns all <code>description</code> elements
    * 
    * @return list of <code>description</code>
    */
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element
    * 
    * @return the current instance of <code>WebAppDescriptor</code>
    */
   public WebAppDescriptor removeAllDescription();

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppDescriptor ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded isGeneric: false isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, a new <code>display-name</code>
    * element
    * 
    * @param values list of <code>display-name</code> objects
    * @return the current instance of <code>WebAppDescriptor</code>
    */
   public WebAppDescriptor displayName(String... values);

   /**
    * Returns all <code>display-name</code> elements
    * 
    * @return list of <code>display-name</code>
    */
   public List<String> getAllDisplayName();

   /**
    * Removes the <code>display-name</code> element
    * 
    * @return the current instance of <code>WebAppDescriptor</code>
    */
   public WebAppDescriptor removeAllDisplayName();

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppDescriptor ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded isGeneric: false isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned. Otherwise, the first
    * existing <code>icon</code> element will be returned.
    * 
    * @return the instance defined for the element <code>icon</code>
    */
   public IconType<WebAppDescriptor> getOrCreateIcon();

   /**
    * Creates a new <code>icon</code> element
    * 
    * @return the new created instance of <code>IconType<WebAppDescriptor></code>
    */
   public IconType<WebAppDescriptor> createIcon();

   /**
    * Returns all <code>icon</code> elements
    * 
    * @return list of <code>icon</code>
    */
   public List<IconType<WebAppDescriptor>> getAllIcon();

   /**
    * Removes all <code>icon</code> elements
    * 
    * @return the current instance of <code>IconType<WebAppDescriptor></code>
    */
   public WebAppDescriptor removeAllIcon();

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppDescriptor ElementName: javaee:env-entryType ElementType : env-entry
   // MaxOccurs: -unbounded isGeneric: false isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>env-entry</code> element will be created and returned. Otherwise, the first
    * existing <code>env-entry</code> element will be returned.
    * 
    * @return the instance defined for the element <code>env-entry</code>
    */
   public EnvEntryType<WebAppDescriptor> getOrCreateEnvEntry();

   /**
    * Creates a new <code>env-entry</code> element
    * 
    * @return the new created instance of <code>EnvEntryType<WebAppDescriptor></code>
    */
   public EnvEntryType<WebAppDescriptor> createEnvEntry();

   /**
    * Returns all <code>env-entry</code> elements
    * 
    * @return list of <code>env-entry</code>
    */
   public List<EnvEntryType<WebAppDescriptor>> getAllEnvEntry();

   /**
    * Removes all <code>env-entry</code> elements
    * 
    * @return the current instance of <code>EnvEntryType<WebAppDescriptor></code>
    */
   public WebAppDescriptor removeAllEnvEntry();

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppDescriptor ElementName: javaee:ejb-refType ElementType : ejb-ref
   // MaxOccurs: -unbounded isGeneric: false isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>ejb-ref</code> element will be created and returned. Otherwise, the first
    * existing <code>ejb-ref</code> element will be returned.
    * 
    * @return the instance defined for the element <code>ejb-ref</code>
    */
   public EjbRefType<WebAppDescriptor> getOrCreateEjbRef();

   /**
    * Creates a new <code>ejb-ref</code> element
    * 
    * @return the new created instance of <code>EjbRefType<WebAppDescriptor></code>
    */
   public EjbRefType<WebAppDescriptor> createEjbRef();

   /**
    * Returns all <code>ejb-ref</code> elements
    * 
    * @return list of <code>ejb-ref</code>
    */
   public List<EjbRefType<WebAppDescriptor>> getAllEjbRef();

   /**
    * Removes all <code>ejb-ref</code> elements
    * 
    * @return the current instance of <code>EjbRefType<WebAppDescriptor></code>
    */
   public WebAppDescriptor removeAllEjbRef();

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppDescriptor ElementName: javaee:ejb-local-refType ElementType : ejb-local-ref
   // MaxOccurs: -unbounded isGeneric: false isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>ejb-local-ref</code> element will be created and returned. Otherwise, the
    * first existing <code>ejb-local-ref</code> element will be returned.
    * 
    * @return the instance defined for the element <code>ejb-local-ref</code>
    */
   public EjbLocalRefType<WebAppDescriptor> getOrCreateEjbLocalRef();

   /**
    * Creates a new <code>ejb-local-ref</code> element
    * 
    * @return the new created instance of <code>EjbLocalRefType<WebAppDescriptor></code>
    */
   public EjbLocalRefType<WebAppDescriptor> createEjbLocalRef();

   /**
    * Returns all <code>ejb-local-ref</code> elements
    * 
    * @return list of <code>ejb-local-ref</code>
    */
   public List<EjbLocalRefType<WebAppDescriptor>> getAllEjbLocalRef();

   /**
    * Removes all <code>ejb-local-ref</code> elements
    * 
    * @return the current instance of <code>EjbLocalRefType<WebAppDescriptor></code>
    */
   public WebAppDescriptor removeAllEjbLocalRef();

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppDescriptor ElementName: javaee:resource-refType ElementType : resource-ref
   // MaxOccurs: -unbounded isGeneric: false isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>resource-ref</code> element will be created and returned. Otherwise, the first
    * existing <code>resource-ref</code> element will be returned.
    * 
    * @return the instance defined for the element <code>resource-ref</code>
    */
   public ResourceRefType<WebAppDescriptor> getOrCreateResourceRef();

   /**
    * Creates a new <code>resource-ref</code> element
    * 
    * @return the new created instance of <code>ResourceRefType<WebAppDescriptor></code>
    */
   public ResourceRefType<WebAppDescriptor> createResourceRef();

   /**
    * Returns all <code>resource-ref</code> elements
    * 
    * @return list of <code>resource-ref</code>
    */
   public List<ResourceRefType<WebAppDescriptor>> getAllResourceRef();

   /**
    * Removes all <code>resource-ref</code> elements
    * 
    * @return the current instance of <code>ResourceRefType<WebAppDescriptor></code>
    */
   public WebAppDescriptor removeAllResourceRef();

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppDescriptor ElementName: javaee:resource-env-refType ElementType : resource-env-ref
   // MaxOccurs: -unbounded isGeneric: false isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>resource-env-ref</code> element will be created and returned. Otherwise, the
    * first existing <code>resource-env-ref</code> element will be returned.
    * 
    * @return the instance defined for the element <code>resource-env-ref</code>
    */
   public ResourceEnvRefType<WebAppDescriptor> getOrCreateResourceEnvRef();

   /**
    * Creates a new <code>resource-env-ref</code> element
    * 
    * @return the new created instance of <code>ResourceEnvRefType<WebAppDescriptor></code>
    */
   public ResourceEnvRefType<WebAppDescriptor> createResourceEnvRef();

   /**
    * Returns all <code>resource-env-ref</code> elements
    * 
    * @return list of <code>resource-env-ref</code>
    */
   public List<ResourceEnvRefType<WebAppDescriptor>> getAllResourceEnvRef();

   /**
    * Removes all <code>resource-env-ref</code> elements
    * 
    * @return the current instance of <code>ResourceEnvRefType<WebAppDescriptor></code>
    */
   public WebAppDescriptor removeAllResourceEnvRef();

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppDescriptor ElementName: javaee:message-destination-refType ElementType : message-destination-ref
   // MaxOccurs: -unbounded isGeneric: false isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>message-destination-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>message-destination-ref</code> element will be returned.
    * 
    * @return the instance defined for the element <code>message-destination-ref</code>
    */
   public MessageDestinationRefType<WebAppDescriptor> getOrCreateMessageDestinationRef();

   /**
    * Creates a new <code>message-destination-ref</code> element
    * 
    * @return the new created instance of <code>MessageDestinationRefType<WebAppDescriptor></code>
    */
   public MessageDestinationRefType<WebAppDescriptor> createMessageDestinationRef();

   /**
    * Returns all <code>message-destination-ref</code> elements
    * 
    * @return list of <code>message-destination-ref</code>
    */
   public List<MessageDestinationRefType<WebAppDescriptor>> getAllMessageDestinationRef();

   /**
    * Removes all <code>message-destination-ref</code> elements
    * 
    * @return the current instance of <code>MessageDestinationRefType<WebAppDescriptor></code>
    */
   public WebAppDescriptor removeAllMessageDestinationRef();

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppDescriptor ElementName: javaee:persistence-context-refType ElementType : persistence-context-ref
   // MaxOccurs: -unbounded isGeneric: false isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>persistence-context-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>persistence-context-ref</code> element will be returned.
    * 
    * @return the instance defined for the element <code>persistence-context-ref</code>
    */
   public PersistenceContextRefType<WebAppDescriptor> getOrCreatePersistenceContextRef();

   /**
    * Creates a new <code>persistence-context-ref</code> element
    * 
    * @return the new created instance of <code>PersistenceContextRefType<WebAppDescriptor></code>
    */
   public PersistenceContextRefType<WebAppDescriptor> createPersistenceContextRef();

   /**
    * Returns all <code>persistence-context-ref</code> elements
    * 
    * @return list of <code>persistence-context-ref</code>
    */
   public List<PersistenceContextRefType<WebAppDescriptor>> getAllPersistenceContextRef();

   /**
    * Removes all <code>persistence-context-ref</code> elements
    * 
    * @return the current instance of <code>PersistenceContextRefType<WebAppDescriptor></code>
    */
   public WebAppDescriptor removeAllPersistenceContextRef();

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppDescriptor ElementName: javaee:persistence-unit-refType ElementType : persistence-unit-ref
   // MaxOccurs: -unbounded isGeneric: false isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>persistence-unit-ref</code> element will be created and returned. Otherwise,
    * the first existing <code>persistence-unit-ref</code> element will be returned.
    * 
    * @return the instance defined for the element <code>persistence-unit-ref</code>
    */
   public PersistenceUnitRefType<WebAppDescriptor> getOrCreatePersistenceUnitRef();

   /**
    * Creates a new <code>persistence-unit-ref</code> element
    * 
    * @return the new created instance of <code>PersistenceUnitRefType<WebAppDescriptor></code>
    */
   public PersistenceUnitRefType<WebAppDescriptor> createPersistenceUnitRef();

   /**
    * Returns all <code>persistence-unit-ref</code> elements
    * 
    * @return list of <code>persistence-unit-ref</code>
    */
   public List<PersistenceUnitRefType<WebAppDescriptor>> getAllPersistenceUnitRef();

   /**
    * Removes all <code>persistence-unit-ref</code> elements
    * 
    * @return the current instance of <code>PersistenceUnitRefType<WebAppDescriptor></code>
    */
   public WebAppDescriptor removeAllPersistenceUnitRef();

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppDescriptor ElementName: javaee:lifecycle-callbackType ElementType : post-construct
   // MaxOccurs: -unbounded isGeneric: false isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>post-construct</code> element will be created and returned. Otherwise, the
    * first existing <code>post-construct</code> element will be returned.
    * 
    * @return the instance defined for the element <code>post-construct</code>
    */
   public LifecycleCallbackType<WebAppDescriptor> getOrCreatePostConstruct();

   /**
    * Creates a new <code>post-construct</code> element
    * 
    * @return the new created instance of <code>LifecycleCallbackType<WebAppDescriptor></code>
    */
   public LifecycleCallbackType<WebAppDescriptor> createPostConstruct();

   /**
    * Returns all <code>post-construct</code> elements
    * 
    * @return list of <code>post-construct</code>
    */
   public List<LifecycleCallbackType<WebAppDescriptor>> getAllPostConstruct();

   /**
    * Removes all <code>post-construct</code> elements
    * 
    * @return the current instance of <code>LifecycleCallbackType<WebAppDescriptor></code>
    */
   public WebAppDescriptor removeAllPostConstruct();

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppDescriptor ElementName: javaee:lifecycle-callbackType ElementType : pre-destroy
   // MaxOccurs: -unbounded isGeneric: false isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>pre-destroy</code> element will be created and returned. Otherwise, the first
    * existing <code>pre-destroy</code> element will be returned.
    * 
    * @return the instance defined for the element <code>pre-destroy</code>
    */
   public LifecycleCallbackType<WebAppDescriptor> getOrCreatePreDestroy();

   /**
    * Creates a new <code>pre-destroy</code> element
    * 
    * @return the new created instance of <code>LifecycleCallbackType<WebAppDescriptor></code>
    */
   public LifecycleCallbackType<WebAppDescriptor> createPreDestroy();

   /**
    * Returns all <code>pre-destroy</code> elements
    * 
    * @return list of <code>pre-destroy</code>
    */
   public List<LifecycleCallbackType<WebAppDescriptor>> getAllPreDestroy();

   /**
    * Removes all <code>pre-destroy</code> elements
    * 
    * @return the current instance of <code>LifecycleCallbackType<WebAppDescriptor></code>
    */
   public WebAppDescriptor removeAllPreDestroy();

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppDescriptor ElementName: javaee:data-sourceType ElementType : data-source
   // MaxOccurs: -unbounded isGeneric: false isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>data-source</code> element will be created and returned. Otherwise, the first
    * existing <code>data-source</code> element will be returned.
    * 
    * @return the instance defined for the element <code>data-source</code>
    */
   public DataSourceType<WebAppDescriptor> getOrCreateDataSource();

   /**
    * Creates a new <code>data-source</code> element
    * 
    * @return the new created instance of <code>DataSourceType<WebAppDescriptor></code>
    */
   public DataSourceType<WebAppDescriptor> createDataSource();

   /**
    * Returns all <code>data-source</code> elements
    * 
    * @return list of <code>data-source</code>
    */
   public List<DataSourceType<WebAppDescriptor>> getAllDataSource();

   /**
    * Removes all <code>data-source</code> elements
    * 
    * @return the current instance of <code>DataSourceType<WebAppDescriptor></code>
    */
   public WebAppDescriptor removeAllDataSource();

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppDescriptor ElementName: javaee:service-refType ElementType : service-ref
   // MaxOccurs: -unbounded isGeneric: false isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>service-ref</code> element will be created and returned. Otherwise, the first
    * existing <code>service-ref</code> element will be returned.
    * 
    * @return the instance defined for the element <code>service-ref</code>
    */
   public ServiceRefType<WebAppDescriptor> getOrCreateServiceRef();

   /**
    * Creates a new <code>service-ref</code> element
    * 
    * @return the new created instance of <code>ServiceRefType<WebAppDescriptor></code>
    */
   public ServiceRefType<WebAppDescriptor> createServiceRef();

   /**
    * Returns all <code>service-ref</code> elements
    * 
    * @return list of <code>service-ref</code>
    */
   public List<ServiceRefType<WebAppDescriptor>> getAllServiceRef();

   /**
    * Removes all <code>service-ref</code> elements
    * 
    * @return the current instance of <code>ServiceRefType<WebAppDescriptor></code>
    */
   public WebAppDescriptor removeAllServiceRef();

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppDescriptor ElementName: javaee:web-app-versionType ElementType : version
   // MaxOccurs: - isGeneric: false isAttribute: true isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>version</code> attribute
    * 
    * @param version the value for the attribute <code>version</code>
    * @return the current instance of <code>WebAppDescriptor</code>
    */
   public WebAppDescriptor version(WebAppVersionType version);

   /**
    * Sets the <code>version</code> attribute
    * 
    * @param version the value for the attribute <code>version</code>
    * @return the current instance of <code>WebAppDescriptor</code>
    */
   public WebAppDescriptor version(String version);

   /**
    * Returns the <code>version</code> attribute
    * 
    * @return the value defined for the attribute <code>version</code>
    */
   public WebAppVersionType getVersion();

   /**
    * Returns the <code>version</code> attribute
    * 
    * @return the value found for the element <code>version</code>
    */
   public String getVersionAsString();

   /**
    * Removes the <code>version</code> attribute
    * 
    * @return the current instance of <code>WebAppDescriptor</code>
    */
   public WebAppDescriptor removeVersion();

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppDescriptor ElementName: xsd:ID ElementType : id
   // MaxOccurs: - isGeneric: false isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * 
    * @param id the value for the attribute <code>id</code>
    * @return the current instance of <code>WebAppDescriptor</code>
    */
   public WebAppDescriptor id(String id);

   /**
    * Returns the <code>id</code> attribute
    * 
    * @return the value defined for the attribute <code>id</code>
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute
    * 
    * @return the current instance of <code>WebAppDescriptor</code>
    */
   public WebAppDescriptor removeId();

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppDescriptor ElementName: xsd:boolean ElementType : metadata-complete
   // MaxOccurs: - isGeneric: false isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>metadata-complete</code> attribute
    * 
    * @param metadataComplete the value for the attribute <code>metadata-complete</code>
    * @return the current instance of <code>WebAppDescriptor</code>
    */
   public WebAppDescriptor metadataComplete(Boolean metadataComplete);

   /**
    * Returns the <code>metadata-complete</code> attribute
    * 
    * @return the value defined for the attribute <code>metadata-complete</code>
    */
   public Boolean isMetadataComplete();

   /**
    * Removes the <code>metadata-complete</code> attribute
    * 
    * @return the current instance of <code>WebAppDescriptor</code>
    */
   public WebAppDescriptor removeMetadataComplete();

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppDescriptor ElementName: xsd:token ElementType : module-name
   // MaxOccurs: -unbounded isGeneric: false isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>module-name</code> elements, a new <code>module-name</code>
    * element
    * 
    * @param values list of <code>module-name</code> objects
    * @return the current instance of <code>WebAppDescriptor</code>
    */
   public WebAppDescriptor moduleName(String... values);

   /**
    * Returns all <code>module-name</code> elements
    * 
    * @return list of <code>module-name</code>
    */
   public List<String> getAllModuleName();

   /**
    * Removes the <code>module-name</code> element
    * 
    * @return the current instance of <code>WebAppDescriptor</code>
    */
   public WebAppDescriptor removeAllModuleName();

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppDescriptor ElementName: javaee:absoluteOrderingType ElementType : absolute-ordering
   // MaxOccurs: -unbounded isGeneric: false isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>absolute-ordering</code> element will be created and returned. Otherwise, the
    * first existing <code>absolute-ordering</code> element will be returned.
    * 
    * @return the instance defined for the element <code>absolute-ordering</code>
    */
   public AbsoluteOrderingType<WebAppDescriptor> getOrCreateAbsoluteOrdering();

   /**
    * Creates a new <code>absolute-ordering</code> element
    * 
    * @return the new created instance of <code>AbsoluteOrderingType<WebAppDescriptor></code>
    */
   public AbsoluteOrderingType<WebAppDescriptor> createAbsoluteOrdering();

   /**
    * Returns all <code>absolute-ordering</code> elements
    * 
    * @return list of <code>absolute-ordering</code>
    */
   public List<AbsoluteOrderingType<WebAppDescriptor>> getAllAbsoluteOrdering();

   /**
    * Removes all <code>absolute-ordering</code> elements
    * 
    * @return the current instance of <code>AbsoluteOrderingType<WebAppDescriptor></code>
    */
   public WebAppDescriptor removeAllAbsoluteOrdering();
}
