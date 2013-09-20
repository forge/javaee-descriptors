package org.jboss.shrinkwrap.descriptor.api.webapp31; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
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
 * This interface defines the contract for the <code> web-appType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface WebAppType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppType ElementName: javaee:emptyType ElementType : distributable
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>distributable</code> element 
    * @return the current instance of <code>WebAppType<T></code> 
    */
   public WebAppType<T> distributable();

   /**
    * Removes the <code>distributable</code> element 
    * @return the current instance of <code>WebAppType<T></code> 
    */
   public Boolean isDistributable();

   /**
    * Removes the <code>distributable</code> element 
    * @return the current instance of <code>WebAppType<T></code> 
    */
   public WebAppType<T> removeDistributable();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppType ElementName: javaee:param-valueType ElementType : context-param
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>context-param</code> element will be created and returned.
    * Otherwise, the first existing <code>context-param</code> element will be returned.
    * @return the instance defined for the element <code>context-param</code> 
    */
   public ParamValueType<WebAppType<T>> getOrCreateContextParam();

   /**
    * Creates a new <code>context-param</code> element 
    * @return the new created instance of <code>ParamValueType<WebAppType<T>></code> 
    */
   public ParamValueType<WebAppType<T>> createContextParam();

   /**
    * Returns all <code>context-param</code> elements
    * @return list of <code>context-param</code> 
    */
   public List<ParamValueType<WebAppType<T>>> getAllContextParam();

   /**
    * Removes all <code>context-param</code> elements 
    * @return the current instance of <code>ParamValueType<WebAppType<T>></code> 
    */
   public WebAppType<T> removeAllContextParam();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppType ElementName: javaee:filterType ElementType : filter
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>filter</code> element will be created and returned.
    * Otherwise, the first existing <code>filter</code> element will be returned.
    * @return the instance defined for the element <code>filter</code> 
    */
   public FilterType<WebAppType<T>> getOrCreateFilter();

   /**
    * Creates a new <code>filter</code> element 
    * @return the new created instance of <code>FilterType<WebAppType<T>></code> 
    */
   public FilterType<WebAppType<T>> createFilter();

   /**
    * Returns all <code>filter</code> elements
    * @return list of <code>filter</code> 
    */
   public List<FilterType<WebAppType<T>>> getAllFilter();

   /**
    * Removes all <code>filter</code> elements 
    * @return the current instance of <code>FilterType<WebAppType<T>></code> 
    */
   public WebAppType<T> removeAllFilter();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppType ElementName: javaee:filter-mappingType ElementType : filter-mapping
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>filter-mapping</code> element will be created and returned.
    * Otherwise, the first existing <code>filter-mapping</code> element will be returned.
    * @return the instance defined for the element <code>filter-mapping</code> 
    */
   public FilterMappingType<WebAppType<T>> getOrCreateFilterMapping();

   /**
    * Creates a new <code>filter-mapping</code> element 
    * @return the new created instance of <code>FilterMappingType<WebAppType<T>></code> 
    */
   public FilterMappingType<WebAppType<T>> createFilterMapping();

   /**
    * Returns all <code>filter-mapping</code> elements
    * @return list of <code>filter-mapping</code> 
    */
   public List<FilterMappingType<WebAppType<T>>> getAllFilterMapping();

   /**
    * Removes all <code>filter-mapping</code> elements 
    * @return the current instance of <code>FilterMappingType<WebAppType<T>></code> 
    */
   public WebAppType<T> removeAllFilterMapping();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppType ElementName: javaee:listenerType ElementType : listener
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>listener</code> element will be created and returned.
    * Otherwise, the first existing <code>listener</code> element will be returned.
    * @return the instance defined for the element <code>listener</code> 
    */
   public ListenerType<WebAppType<T>> getOrCreateListener();

   /**
    * Creates a new <code>listener</code> element 
    * @return the new created instance of <code>ListenerType<WebAppType<T>></code> 
    */
   public ListenerType<WebAppType<T>> createListener();

   /**
    * Returns all <code>listener</code> elements
    * @return list of <code>listener</code> 
    */
   public List<ListenerType<WebAppType<T>>> getAllListener();

   /**
    * Removes all <code>listener</code> elements 
    * @return the current instance of <code>ListenerType<WebAppType<T>></code> 
    */
   public WebAppType<T> removeAllListener();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppType ElementName: javaee:servletType ElementType : servlet
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>servlet</code> element will be created and returned.
    * Otherwise, the first existing <code>servlet</code> element will be returned.
    * @return the instance defined for the element <code>servlet</code> 
    */
   public ServletType<WebAppType<T>> getOrCreateServlet();

   /**
    * Creates a new <code>servlet</code> element 
    * @return the new created instance of <code>ServletType<WebAppType<T>></code> 
    */
   public ServletType<WebAppType<T>> createServlet();

   /**
    * Returns all <code>servlet</code> elements
    * @return list of <code>servlet</code> 
    */
   public List<ServletType<WebAppType<T>>> getAllServlet();

   /**
    * Removes all <code>servlet</code> elements 
    * @return the current instance of <code>ServletType<WebAppType<T>></code> 
    */
   public WebAppType<T> removeAllServlet();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppType ElementName: javaee:servlet-mappingType ElementType : servlet-mapping
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>servlet-mapping</code> element will be created and returned.
    * Otherwise, the first existing <code>servlet-mapping</code> element will be returned.
    * @return the instance defined for the element <code>servlet-mapping</code> 
    */
   public ServletMappingType<WebAppType<T>> getOrCreateServletMapping();

   /**
    * Creates a new <code>servlet-mapping</code> element 
    * @return the new created instance of <code>ServletMappingType<WebAppType<T>></code> 
    */
   public ServletMappingType<WebAppType<T>> createServletMapping();

   /**
    * Returns all <code>servlet-mapping</code> elements
    * @return list of <code>servlet-mapping</code> 
    */
   public List<ServletMappingType<WebAppType<T>>> getAllServletMapping();

   /**
    * Removes all <code>servlet-mapping</code> elements 
    * @return the current instance of <code>ServletMappingType<WebAppType<T>></code> 
    */
   public WebAppType<T> removeAllServletMapping();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppType ElementName: javaee:session-configType ElementType : session-config
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>session-config</code> element will be created and returned.
    * Otherwise, the first existing <code>session-config</code> element will be returned.
    * @return the instance defined for the element <code>session-config</code> 
    */
   public SessionConfigType<WebAppType<T>> getOrCreateSessionConfig();

   /**
    * Creates a new <code>session-config</code> element 
    * @return the new created instance of <code>SessionConfigType<WebAppType<T>></code> 
    */
   public SessionConfigType<WebAppType<T>> createSessionConfig();

   /**
    * Returns all <code>session-config</code> elements
    * @return list of <code>session-config</code> 
    */
   public List<SessionConfigType<WebAppType<T>>> getAllSessionConfig();

   /**
    * Removes all <code>session-config</code> elements 
    * @return the current instance of <code>SessionConfigType<WebAppType<T>></code> 
    */
   public WebAppType<T> removeAllSessionConfig();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppType ElementName: javaee:mime-mappingType ElementType : mime-mapping
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>mime-mapping</code> element will be created and returned.
    * Otherwise, the first existing <code>mime-mapping</code> element will be returned.
    * @return the instance defined for the element <code>mime-mapping</code> 
    */
   public MimeMappingType<WebAppType<T>> getOrCreateMimeMapping();

   /**
    * Creates a new <code>mime-mapping</code> element 
    * @return the new created instance of <code>MimeMappingType<WebAppType<T>></code> 
    */
   public MimeMappingType<WebAppType<T>> createMimeMapping();

   /**
    * Returns all <code>mime-mapping</code> elements
    * @return list of <code>mime-mapping</code> 
    */
   public List<MimeMappingType<WebAppType<T>>> getAllMimeMapping();

   /**
    * Removes all <code>mime-mapping</code> elements 
    * @return the current instance of <code>MimeMappingType<WebAppType<T>></code> 
    */
   public WebAppType<T> removeAllMimeMapping();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppType ElementName: javaee:welcome-file-listType ElementType : welcome-file-list
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>welcome-file-list</code> element will be created and returned.
    * Otherwise, the first existing <code>welcome-file-list</code> element will be returned.
    * @return the instance defined for the element <code>welcome-file-list</code> 
    */
   public WelcomeFileListType<WebAppType<T>> getOrCreateWelcomeFileList();

   /**
    * Creates a new <code>welcome-file-list</code> element 
    * @return the new created instance of <code>WelcomeFileListType<WebAppType<T>></code> 
    */
   public WelcomeFileListType<WebAppType<T>> createWelcomeFileList();

   /**
    * Returns all <code>welcome-file-list</code> elements
    * @return list of <code>welcome-file-list</code> 
    */
   public List<WelcomeFileListType<WebAppType<T>>> getAllWelcomeFileList();

   /**
    * Removes all <code>welcome-file-list</code> elements 
    * @return the current instance of <code>WelcomeFileListType<WebAppType<T>></code> 
    */
   public WebAppType<T> removeAllWelcomeFileList();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppType ElementName: javaee:error-pageType ElementType : error-page
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>error-page</code> element will be created and returned.
    * Otherwise, the first existing <code>error-page</code> element will be returned.
    * @return the instance defined for the element <code>error-page</code> 
    */
   public ErrorPageType<WebAppType<T>> getOrCreateErrorPage();

   /**
    * Creates a new <code>error-page</code> element 
    * @return the new created instance of <code>ErrorPageType<WebAppType<T>></code> 
    */
   public ErrorPageType<WebAppType<T>> createErrorPage();

   /**
    * Returns all <code>error-page</code> elements
    * @return list of <code>error-page</code> 
    */
   public List<ErrorPageType<WebAppType<T>>> getAllErrorPage();

   /**
    * Removes all <code>error-page</code> elements 
    * @return the current instance of <code>ErrorPageType<WebAppType<T>></code> 
    */
   public WebAppType<T> removeAllErrorPage();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppType ElementName: javaee:jsp-configType ElementType : jsp-config
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>jsp-config</code> element will be created and returned.
    * Otherwise, the first existing <code>jsp-config</code> element will be returned.
    * @return the instance defined for the element <code>jsp-config</code> 
    */
   public JspConfigType<WebAppType<T>> getOrCreateJspConfig();

   /**
    * Creates a new <code>jsp-config</code> element 
    * @return the new created instance of <code>JspConfigType<WebAppType<T>></code> 
    */
   public JspConfigType<WebAppType<T>> createJspConfig();

   /**
    * Returns all <code>jsp-config</code> elements
    * @return list of <code>jsp-config</code> 
    */
   public List<JspConfigType<WebAppType<T>>> getAllJspConfig();

   /**
    * Removes all <code>jsp-config</code> elements 
    * @return the current instance of <code>JspConfigType<WebAppType<T>></code> 
    */
   public WebAppType<T> removeAllJspConfig();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppType ElementName: javaee:security-constraintType ElementType : security-constraint
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>security-constraint</code> element will be created and returned.
    * Otherwise, the first existing <code>security-constraint</code> element will be returned.
    * @return the instance defined for the element <code>security-constraint</code> 
    */
   public SecurityConstraintType<WebAppType<T>> getOrCreateSecurityConstraint();

   /**
    * Creates a new <code>security-constraint</code> element 
    * @return the new created instance of <code>SecurityConstraintType<WebAppType<T>></code> 
    */
   public SecurityConstraintType<WebAppType<T>> createSecurityConstraint();

   /**
    * Returns all <code>security-constraint</code> elements
    * @return list of <code>security-constraint</code> 
    */
   public List<SecurityConstraintType<WebAppType<T>>> getAllSecurityConstraint();

   /**
    * Removes all <code>security-constraint</code> elements 
    * @return the current instance of <code>SecurityConstraintType<WebAppType<T>></code> 
    */
   public WebAppType<T> removeAllSecurityConstraint();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppType ElementName: javaee:login-configType ElementType : login-config
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>login-config</code> element will be created and returned.
    * Otherwise, the first existing <code>login-config</code> element will be returned.
    * @return the instance defined for the element <code>login-config</code> 
    */
   public LoginConfigType<WebAppType<T>> getOrCreateLoginConfig();

   /**
    * Creates a new <code>login-config</code> element 
    * @return the new created instance of <code>LoginConfigType<WebAppType<T>></code> 
    */
   public LoginConfigType<WebAppType<T>> createLoginConfig();

   /**
    * Returns all <code>login-config</code> elements
    * @return list of <code>login-config</code> 
    */
   public List<LoginConfigType<WebAppType<T>>> getAllLoginConfig();

   /**
    * Removes all <code>login-config</code> elements 
    * @return the current instance of <code>LoginConfigType<WebAppType<T>></code> 
    */
   public WebAppType<T> removeAllLoginConfig();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppType ElementName: javaee:security-roleType ElementType : security-role
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>security-role</code> element will be created and returned.
    * Otherwise, the first existing <code>security-role</code> element will be returned.
    * @return the instance defined for the element <code>security-role</code> 
    */
   public SecurityRoleType<WebAppType<T>> getOrCreateSecurityRole();

   /**
    * Creates a new <code>security-role</code> element 
    * @return the new created instance of <code>SecurityRoleType<WebAppType<T>></code> 
    */
   public SecurityRoleType<WebAppType<T>> createSecurityRole();

   /**
    * Returns all <code>security-role</code> elements
    * @return list of <code>security-role</code> 
    */
   public List<SecurityRoleType<WebAppType<T>>> getAllSecurityRole();

   /**
    * Removes all <code>security-role</code> elements 
    * @return the current instance of <code>SecurityRoleType<WebAppType<T>></code> 
    */
   public WebAppType<T> removeAllSecurityRole();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppType ElementName: javaee:message-destinationType ElementType : message-destination
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>message-destination</code> element will be created and returned.
    * Otherwise, the first existing <code>message-destination</code> element will be returned.
    * @return the instance defined for the element <code>message-destination</code> 
    */
   public MessageDestinationType<WebAppType<T>> getOrCreateMessageDestination();

   /**
    * Creates a new <code>message-destination</code> element 
    * @return the new created instance of <code>MessageDestinationType<WebAppType<T>></code> 
    */
   public MessageDestinationType<WebAppType<T>> createMessageDestination();

   /**
    * Returns all <code>message-destination</code> elements
    * @return list of <code>message-destination</code> 
    */
   public List<MessageDestinationType<WebAppType<T>>> getAllMessageDestination();

   /**
    * Removes all <code>message-destination</code> elements 
    * @return the current instance of <code>MessageDestinationType<WebAppType<T>></code> 
    */
   public WebAppType<T> removeAllMessageDestination();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppType ElementName: javaee:locale-encoding-mapping-listType ElementType : locale-encoding-mapping-list
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>locale-encoding-mapping-list</code> element will be created and returned.
    * Otherwise, the first existing <code>locale-encoding-mapping-list</code> element will be returned.
    * @return the instance defined for the element <code>locale-encoding-mapping-list</code> 
    */
   public LocaleEncodingMappingListType<WebAppType<T>> getOrCreateLocaleEncodingMappingList();

   /**
    * Creates a new <code>locale-encoding-mapping-list</code> element 
    * @return the new created instance of <code>LocaleEncodingMappingListType<WebAppType<T>></code> 
    */
   public LocaleEncodingMappingListType<WebAppType<T>> createLocaleEncodingMappingList();

   /**
    * Returns all <code>locale-encoding-mapping-list</code> elements
    * @return list of <code>locale-encoding-mapping-list</code> 
    */
   public List<LocaleEncodingMappingListType<WebAppType<T>>> getAllLocaleEncodingMappingList();

   /**
    * Removes all <code>locale-encoding-mapping-list</code> elements 
    * @return the current instance of <code>LocaleEncodingMappingListType<WebAppType<T>></code> 
    */
   public WebAppType<T> removeAllLocaleEncodingMappingList();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>WebAppType<T></code> 
    */
   public WebAppType<T> description(String ... values);

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>WebAppType<T></code> 
    */
   public WebAppType<T> removeAllDescription();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppType ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>WebAppType<T></code> 
    */
   public WebAppType<T> displayName(String ... values);

   /**
    * Returns all <code>display-name</code> elements
    * @return list of <code>display-name</code> 
    */
   public List<String> getAllDisplayName();

   /**
    * Removes the <code>display-name</code> element 
    * @return the current instance of <code>WebAppType<T></code> 
    */
   public WebAppType<T> removeAllDisplayName();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppType ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<WebAppType<T>> getOrCreateIcon();

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<WebAppType<T>></code> 
    */
   public IconType<WebAppType<T>> createIcon();

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<WebAppType<T>>> getAllIcon();

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<WebAppType<T>></code> 
    */
   public WebAppType<T> removeAllIcon();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppType ElementName: javaee:env-entryType ElementType : env-entry
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>env-entry</code> element will be created and returned.
    * Otherwise, the first existing <code>env-entry</code> element will be returned.
    * @return the instance defined for the element <code>env-entry</code> 
    */
   public EnvEntryType<WebAppType<T>> getOrCreateEnvEntry();

   /**
    * Creates a new <code>env-entry</code> element 
    * @return the new created instance of <code>EnvEntryType<WebAppType<T>></code> 
    */
   public EnvEntryType<WebAppType<T>> createEnvEntry();

   /**
    * Returns all <code>env-entry</code> elements
    * @return list of <code>env-entry</code> 
    */
   public List<EnvEntryType<WebAppType<T>>> getAllEnvEntry();

   /**
    * Removes all <code>env-entry</code> elements 
    * @return the current instance of <code>EnvEntryType<WebAppType<T>></code> 
    */
   public WebAppType<T> removeAllEnvEntry();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppType ElementName: javaee:ejb-refType ElementType : ejb-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>ejb-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>ejb-ref</code> element will be returned.
    * @return the instance defined for the element <code>ejb-ref</code> 
    */
   public EjbRefType<WebAppType<T>> getOrCreateEjbRef();

   /**
    * Creates a new <code>ejb-ref</code> element 
    * @return the new created instance of <code>EjbRefType<WebAppType<T>></code> 
    */
   public EjbRefType<WebAppType<T>> createEjbRef();

   /**
    * Returns all <code>ejb-ref</code> elements
    * @return list of <code>ejb-ref</code> 
    */
   public List<EjbRefType<WebAppType<T>>> getAllEjbRef();

   /**
    * Removes all <code>ejb-ref</code> elements 
    * @return the current instance of <code>EjbRefType<WebAppType<T>></code> 
    */
   public WebAppType<T> removeAllEjbRef();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppType ElementName: javaee:ejb-local-refType ElementType : ejb-local-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>ejb-local-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>ejb-local-ref</code> element will be returned.
    * @return the instance defined for the element <code>ejb-local-ref</code> 
    */
   public EjbLocalRefType<WebAppType<T>> getOrCreateEjbLocalRef();

   /**
    * Creates a new <code>ejb-local-ref</code> element 
    * @return the new created instance of <code>EjbLocalRefType<WebAppType<T>></code> 
    */
   public EjbLocalRefType<WebAppType<T>> createEjbLocalRef();

   /**
    * Returns all <code>ejb-local-ref</code> elements
    * @return list of <code>ejb-local-ref</code> 
    */
   public List<EjbLocalRefType<WebAppType<T>>> getAllEjbLocalRef();

   /**
    * Removes all <code>ejb-local-ref</code> elements 
    * @return the current instance of <code>EjbLocalRefType<WebAppType<T>></code> 
    */
   public WebAppType<T> removeAllEjbLocalRef();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppType ElementName: javaee:resource-refType ElementType : resource-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>resource-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>resource-ref</code> element will be returned.
    * @return the instance defined for the element <code>resource-ref</code> 
    */
   public ResourceRefType<WebAppType<T>> getOrCreateResourceRef();

   /**
    * Creates a new <code>resource-ref</code> element 
    * @return the new created instance of <code>ResourceRefType<WebAppType<T>></code> 
    */
   public ResourceRefType<WebAppType<T>> createResourceRef();

   /**
    * Returns all <code>resource-ref</code> elements
    * @return list of <code>resource-ref</code> 
    */
   public List<ResourceRefType<WebAppType<T>>> getAllResourceRef();

   /**
    * Removes all <code>resource-ref</code> elements 
    * @return the current instance of <code>ResourceRefType<WebAppType<T>></code> 
    */
   public WebAppType<T> removeAllResourceRef();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppType ElementName: javaee:resource-env-refType ElementType : resource-env-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>resource-env-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>resource-env-ref</code> element will be returned.
    * @return the instance defined for the element <code>resource-env-ref</code> 
    */
   public ResourceEnvRefType<WebAppType<T>> getOrCreateResourceEnvRef();

   /**
    * Creates a new <code>resource-env-ref</code> element 
    * @return the new created instance of <code>ResourceEnvRefType<WebAppType<T>></code> 
    */
   public ResourceEnvRefType<WebAppType<T>> createResourceEnvRef();

   /**
    * Returns all <code>resource-env-ref</code> elements
    * @return list of <code>resource-env-ref</code> 
    */
   public List<ResourceEnvRefType<WebAppType<T>>> getAllResourceEnvRef();

   /**
    * Removes all <code>resource-env-ref</code> elements 
    * @return the current instance of <code>ResourceEnvRefType<WebAppType<T>></code> 
    */
   public WebAppType<T> removeAllResourceEnvRef();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppType ElementName: javaee:message-destination-refType ElementType : message-destination-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>message-destination-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>message-destination-ref</code> element will be returned.
    * @return the instance defined for the element <code>message-destination-ref</code> 
    */
   public MessageDestinationRefType<WebAppType<T>> getOrCreateMessageDestinationRef();

   /**
    * Creates a new <code>message-destination-ref</code> element 
    * @return the new created instance of <code>MessageDestinationRefType<WebAppType<T>></code> 
    */
   public MessageDestinationRefType<WebAppType<T>> createMessageDestinationRef();

   /**
    * Returns all <code>message-destination-ref</code> elements
    * @return list of <code>message-destination-ref</code> 
    */
   public List<MessageDestinationRefType<WebAppType<T>>> getAllMessageDestinationRef();

   /**
    * Removes all <code>message-destination-ref</code> elements 
    * @return the current instance of <code>MessageDestinationRefType<WebAppType<T>></code> 
    */
   public WebAppType<T> removeAllMessageDestinationRef();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppType ElementName: javaee:persistence-context-refType ElementType : persistence-context-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>persistence-context-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>persistence-context-ref</code> element will be returned.
    * @return the instance defined for the element <code>persistence-context-ref</code> 
    */
   public PersistenceContextRefType<WebAppType<T>> getOrCreatePersistenceContextRef();

   /**
    * Creates a new <code>persistence-context-ref</code> element 
    * @return the new created instance of <code>PersistenceContextRefType<WebAppType<T>></code> 
    */
   public PersistenceContextRefType<WebAppType<T>> createPersistenceContextRef();

   /**
    * Returns all <code>persistence-context-ref</code> elements
    * @return list of <code>persistence-context-ref</code> 
    */
   public List<PersistenceContextRefType<WebAppType<T>>> getAllPersistenceContextRef();

   /**
    * Removes all <code>persistence-context-ref</code> elements 
    * @return the current instance of <code>PersistenceContextRefType<WebAppType<T>></code> 
    */
   public WebAppType<T> removeAllPersistenceContextRef();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppType ElementName: javaee:persistence-unit-refType ElementType : persistence-unit-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>persistence-unit-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>persistence-unit-ref</code> element will be returned.
    * @return the instance defined for the element <code>persistence-unit-ref</code> 
    */
   public PersistenceUnitRefType<WebAppType<T>> getOrCreatePersistenceUnitRef();

   /**
    * Creates a new <code>persistence-unit-ref</code> element 
    * @return the new created instance of <code>PersistenceUnitRefType<WebAppType<T>></code> 
    */
   public PersistenceUnitRefType<WebAppType<T>> createPersistenceUnitRef();

   /**
    * Returns all <code>persistence-unit-ref</code> elements
    * @return list of <code>persistence-unit-ref</code> 
    */
   public List<PersistenceUnitRefType<WebAppType<T>>> getAllPersistenceUnitRef();

   /**
    * Removes all <code>persistence-unit-ref</code> elements 
    * @return the current instance of <code>PersistenceUnitRefType<WebAppType<T>></code> 
    */
   public WebAppType<T> removeAllPersistenceUnitRef();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppType ElementName: javaee:lifecycle-callbackType ElementType : post-construct
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>post-construct</code> element will be created and returned.
    * Otherwise, the first existing <code>post-construct</code> element will be returned.
    * @return the instance defined for the element <code>post-construct</code> 
    */
   public LifecycleCallbackType<WebAppType<T>> getOrCreatePostConstruct();

   /**
    * Creates a new <code>post-construct</code> element 
    * @return the new created instance of <code>LifecycleCallbackType<WebAppType<T>></code> 
    */
   public LifecycleCallbackType<WebAppType<T>> createPostConstruct();

   /**
    * Returns all <code>post-construct</code> elements
    * @return list of <code>post-construct</code> 
    */
   public List<LifecycleCallbackType<WebAppType<T>>> getAllPostConstruct();

   /**
    * Removes all <code>post-construct</code> elements 
    * @return the current instance of <code>LifecycleCallbackType<WebAppType<T>></code> 
    */
   public WebAppType<T> removeAllPostConstruct();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppType ElementName: javaee:lifecycle-callbackType ElementType : pre-destroy
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>pre-destroy</code> element will be created and returned.
    * Otherwise, the first existing <code>pre-destroy</code> element will be returned.
    * @return the instance defined for the element <code>pre-destroy</code> 
    */
   public LifecycleCallbackType<WebAppType<T>> getOrCreatePreDestroy();

   /**
    * Creates a new <code>pre-destroy</code> element 
    * @return the new created instance of <code>LifecycleCallbackType<WebAppType<T>></code> 
    */
   public LifecycleCallbackType<WebAppType<T>> createPreDestroy();

   /**
    * Returns all <code>pre-destroy</code> elements
    * @return list of <code>pre-destroy</code> 
    */
   public List<LifecycleCallbackType<WebAppType<T>>> getAllPreDestroy();

   /**
    * Removes all <code>pre-destroy</code> elements 
    * @return the current instance of <code>LifecycleCallbackType<WebAppType<T>></code> 
    */
   public WebAppType<T> removeAllPreDestroy();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppType ElementName: javaee:data-sourceType ElementType : data-source
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>data-source</code> element will be created and returned.
    * Otherwise, the first existing <code>data-source</code> element will be returned.
    * @return the instance defined for the element <code>data-source</code> 
    */
   public DataSourceType<WebAppType<T>> getOrCreateDataSource();

   /**
    * Creates a new <code>data-source</code> element 
    * @return the new created instance of <code>DataSourceType<WebAppType<T>></code> 
    */
   public DataSourceType<WebAppType<T>> createDataSource();

   /**
    * Returns all <code>data-source</code> elements
    * @return list of <code>data-source</code> 
    */
   public List<DataSourceType<WebAppType<T>>> getAllDataSource();

   /**
    * Removes all <code>data-source</code> elements 
    * @return the current instance of <code>DataSourceType<WebAppType<T>></code> 
    */
   public WebAppType<T> removeAllDataSource();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppType ElementName: javaee:jms-connection-factoryType ElementType : jms-connection-factory
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>jms-connection-factory</code> element will be created and returned.
    * Otherwise, the first existing <code>jms-connection-factory</code> element will be returned.
    * @return the instance defined for the element <code>jms-connection-factory</code> 
    */
   public JmsConnectionFactoryType<WebAppType<T>> getOrCreateJmsConnectionFactory();

   /**
    * Creates a new <code>jms-connection-factory</code> element 
    * @return the new created instance of <code>JmsConnectionFactoryType<WebAppType<T>></code> 
    */
   public JmsConnectionFactoryType<WebAppType<T>> createJmsConnectionFactory();

   /**
    * Returns all <code>jms-connection-factory</code> elements
    * @return list of <code>jms-connection-factory</code> 
    */
   public List<JmsConnectionFactoryType<WebAppType<T>>> getAllJmsConnectionFactory();

   /**
    * Removes all <code>jms-connection-factory</code> elements 
    * @return the current instance of <code>JmsConnectionFactoryType<WebAppType<T>></code> 
    */
   public WebAppType<T> removeAllJmsConnectionFactory();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppType ElementName: javaee:jms-destinationType ElementType : jms-destination
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>jms-destination</code> element will be created and returned.
    * Otherwise, the first existing <code>jms-destination</code> element will be returned.
    * @return the instance defined for the element <code>jms-destination</code> 
    */
   public JmsDestinationType<WebAppType<T>> getOrCreateJmsDestination();

   /**
    * Creates a new <code>jms-destination</code> element 
    * @return the new created instance of <code>JmsDestinationType<WebAppType<T>></code> 
    */
   public JmsDestinationType<WebAppType<T>> createJmsDestination();

   /**
    * Returns all <code>jms-destination</code> elements
    * @return list of <code>jms-destination</code> 
    */
   public List<JmsDestinationType<WebAppType<T>>> getAllJmsDestination();

   /**
    * Removes all <code>jms-destination</code> elements 
    * @return the current instance of <code>JmsDestinationType<WebAppType<T>></code> 
    */
   public WebAppType<T> removeAllJmsDestination();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppType ElementName: javaee:mail-sessionType ElementType : mail-session
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>mail-session</code> element will be created and returned.
    * Otherwise, the first existing <code>mail-session</code> element will be returned.
    * @return the instance defined for the element <code>mail-session</code> 
    */
   public MailSessionType<WebAppType<T>> getOrCreateMailSession();

   /**
    * Creates a new <code>mail-session</code> element 
    * @return the new created instance of <code>MailSessionType<WebAppType<T>></code> 
    */
   public MailSessionType<WebAppType<T>> createMailSession();

   /**
    * Returns all <code>mail-session</code> elements
    * @return list of <code>mail-session</code> 
    */
   public List<MailSessionType<WebAppType<T>>> getAllMailSession();

   /**
    * Removes all <code>mail-session</code> elements 
    * @return the current instance of <code>MailSessionType<WebAppType<T>></code> 
    */
   public WebAppType<T> removeAllMailSession();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppType ElementName: javaee:connection-factory-resourceType ElementType : connection-factory
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>connection-factory</code> element will be created and returned.
    * Otherwise, the first existing <code>connection-factory</code> element will be returned.
    * @return the instance defined for the element <code>connection-factory</code> 
    */
   public ConnectionFactoryResourceType<WebAppType<T>> getOrCreateConnectionFactory();

   /**
    * Creates a new <code>connection-factory</code> element 
    * @return the new created instance of <code>ConnectionFactoryResourceType<WebAppType<T>></code> 
    */
   public ConnectionFactoryResourceType<WebAppType<T>> createConnectionFactory();

   /**
    * Returns all <code>connection-factory</code> elements
    * @return list of <code>connection-factory</code> 
    */
   public List<ConnectionFactoryResourceType<WebAppType<T>>> getAllConnectionFactory();

   /**
    * Removes all <code>connection-factory</code> elements 
    * @return the current instance of <code>ConnectionFactoryResourceType<WebAppType<T>></code> 
    */
   public WebAppType<T> removeAllConnectionFactory();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppType ElementName: javaee:administered-objectType ElementType : administered-object
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>administered-object</code> element will be created and returned.
    * Otherwise, the first existing <code>administered-object</code> element will be returned.
    * @return the instance defined for the element <code>administered-object</code> 
    */
   public AdministeredObjectType<WebAppType<T>> getOrCreateAdministeredObject();

   /**
    * Creates a new <code>administered-object</code> element 
    * @return the new created instance of <code>AdministeredObjectType<WebAppType<T>></code> 
    */
   public AdministeredObjectType<WebAppType<T>> createAdministeredObject();

   /**
    * Returns all <code>administered-object</code> elements
    * @return list of <code>administered-object</code> 
    */
   public List<AdministeredObjectType<WebAppType<T>>> getAllAdministeredObject();

   /**
    * Removes all <code>administered-object</code> elements 
    * @return the current instance of <code>AdministeredObjectType<WebAppType<T>></code> 
    */
   public WebAppType<T> removeAllAdministeredObject();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppType ElementName: javaee:service-refType ElementType : service-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>service-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>service-ref</code> element will be returned.
    * @return the instance defined for the element <code>service-ref</code> 
    */
   public ServiceRefType<WebAppType<T>> getOrCreateServiceRef();

   /**
    * Creates a new <code>service-ref</code> element 
    * @return the new created instance of <code>ServiceRefType<WebAppType<T>></code> 
    */
   public ServiceRefType<WebAppType<T>> createServiceRef();

   /**
    * Returns all <code>service-ref</code> elements
    * @return list of <code>service-ref</code> 
    */
   public List<ServiceRefType<WebAppType<T>>> getAllServiceRef();

   /**
    * Removes all <code>service-ref</code> elements 
    * @return the current instance of <code>ServiceRefType<WebAppType<T>></code> 
    */
   public WebAppType<T> removeAllServiceRef();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppType ElementName: javaee:web-app-versionType ElementType : version
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of <code>WebAppType<T></code> 
    */
   public WebAppType<T> version(WebAppVersionType version);

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of <code>WebAppType<T></code> 
    */
   public WebAppType<T> version(String version);

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
    * @return the current instance of <code>WebAppType<T></code> 
    */
   public WebAppType<T> removeVersion();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>WebAppType<T></code> 
    */
   public WebAppType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>WebAppType<T></code> 
    */
   public WebAppType<T> removeId();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppType ElementName: xsd:boolean ElementType : metadata-complete
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>metadata-complete</code> attribute
    * @param metadataComplete the value for the attribute <code>metadata-complete</code> 
    * @return the current instance of <code>WebAppType<T></code> 
    */
   public WebAppType<T> metadataComplete(Boolean metadataComplete);

   /**
    * Returns the <code>metadata-complete</code> attribute
    * @return the value defined for the attribute <code>metadata-complete</code> 
    */
public Boolean isMetadataComplete();

   /**
    * Removes the <code>metadata-complete</code> attribute 
    * @return the current instance of <code>WebAppType<T></code> 
    */
   public WebAppType<T> removeMetadataComplete();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppType ElementName: xsd:token ElementType : module-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>module-name</code> elements, 
    * a new <code>module-name</code> element 
    * @param values list of <code>module-name</code> objects 
    * @return the current instance of <code>WebAppType<T></code> 
    */
   public WebAppType<T> moduleName(String ... values);

   /**
    * Returns all <code>module-name</code> elements
    * @return list of <code>module-name</code> 
    */
   public List<String> getAllModuleName();

   /**
    * Removes the <code>module-name</code> element 
    * @return the current instance of <code>WebAppType<T></code> 
    */
   public WebAppType<T> removeAllModuleName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppType ElementName: javaee:emptyType ElementType : deny-uncovered-http-methods
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>deny-uncovered-http-methods</code> element 
    * @return the current instance of <code>WebAppType<T></code> 
    */
   public WebAppType<T> denyUncoveredHttpMethods();

   /**
    * Removes the <code>deny-uncovered-http-methods</code> element 
    * @return the current instance of <code>WebAppType<T></code> 
    */
   public Boolean isDenyUncoveredHttpMethods();

   /**
    * Removes the <code>deny-uncovered-http-methods</code> element 
    * @return the current instance of <code>WebAppType<T></code> 
    */
   public WebAppType<T> removeDenyUncoveredHttpMethods();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppType ElementName: javaee:absoluteOrderingType ElementType : absolute-ordering
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>absolute-ordering</code> element will be created and returned.
    * Otherwise, the first existing <code>absolute-ordering</code> element will be returned.
    * @return the instance defined for the element <code>absolute-ordering</code> 
    */
   public AbsoluteOrderingType<WebAppType<T>> getOrCreateAbsoluteOrdering();

   /**
    * Creates a new <code>absolute-ordering</code> element 
    * @return the new created instance of <code>AbsoluteOrderingType<WebAppType<T>></code> 
    */
   public AbsoluteOrderingType<WebAppType<T>> createAbsoluteOrdering();

   /**
    * Returns all <code>absolute-ordering</code> elements
    * @return list of <code>absolute-ordering</code> 
    */
   public List<AbsoluteOrderingType<WebAppType<T>>> getAllAbsoluteOrdering();

   /**
    * Removes all <code>absolute-ordering</code> elements 
    * @return the current instance of <code>AbsoluteOrderingType<WebAppType<T>></code> 
    */
   public WebAppType<T> removeAllAbsoluteOrdering();
}
