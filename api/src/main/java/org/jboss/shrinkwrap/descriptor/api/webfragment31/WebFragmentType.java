package org.jboss.shrinkwrap.descriptor.api.webfragment31; 

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
 * This interface defines the contract for the <code> web-fragmentType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface WebFragmentType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentType ElementName: javaee:emptyType ElementType : distributable
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>distributable</code> element 
    * @return the current instance of <code>WebFragmentType<T></code> 
    */
   public WebFragmentType<T> distributable();

   /**
    * Removes the <code>distributable</code> element 
    * @return the current instance of <code>WebFragmentType<T></code> 
    */
   public Boolean isDistributable();

   /**
    * Removes the <code>distributable</code> element 
    * @return the current instance of <code>WebFragmentType<T></code> 
    */
   public WebFragmentType<T> removeDistributable();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentType ElementName: javaee:param-valueType ElementType : context-param
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>context-param</code> element will be created and returned.
    * Otherwise, the first existing <code>context-param</code> element will be returned.
    * @return the instance defined for the element <code>context-param</code> 
    */
   public ParamValueType<WebFragmentType<T>> getOrCreateContextParam();

   /**
    * Creates a new <code>context-param</code> element 
    * @return the new created instance of <code>ParamValueType<WebFragmentType<T>></code> 
    */
   public ParamValueType<WebFragmentType<T>> createContextParam();

   /**
    * Returns all <code>context-param</code> elements
    * @return list of <code>context-param</code> 
    */
   public List<ParamValueType<WebFragmentType<T>>> getAllContextParam();

   /**
    * Removes all <code>context-param</code> elements 
    * @return the current instance of <code>ParamValueType<WebFragmentType<T>></code> 
    */
   public WebFragmentType<T> removeAllContextParam();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentType ElementName: javaee:filterType ElementType : filter
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>filter</code> element will be created and returned.
    * Otherwise, the first existing <code>filter</code> element will be returned.
    * @return the instance defined for the element <code>filter</code> 
    */
   public FilterType<WebFragmentType<T>> getOrCreateFilter();

   /**
    * Creates a new <code>filter</code> element 
    * @return the new created instance of <code>FilterType<WebFragmentType<T>></code> 
    */
   public FilterType<WebFragmentType<T>> createFilter();

   /**
    * Returns all <code>filter</code> elements
    * @return list of <code>filter</code> 
    */
   public List<FilterType<WebFragmentType<T>>> getAllFilter();

   /**
    * Removes all <code>filter</code> elements 
    * @return the current instance of <code>FilterType<WebFragmentType<T>></code> 
    */
   public WebFragmentType<T> removeAllFilter();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentType ElementName: javaee:filter-mappingType ElementType : filter-mapping
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>filter-mapping</code> element will be created and returned.
    * Otherwise, the first existing <code>filter-mapping</code> element will be returned.
    * @return the instance defined for the element <code>filter-mapping</code> 
    */
   public FilterMappingType<WebFragmentType<T>> getOrCreateFilterMapping();

   /**
    * Creates a new <code>filter-mapping</code> element 
    * @return the new created instance of <code>FilterMappingType<WebFragmentType<T>></code> 
    */
   public FilterMappingType<WebFragmentType<T>> createFilterMapping();

   /**
    * Returns all <code>filter-mapping</code> elements
    * @return list of <code>filter-mapping</code> 
    */
   public List<FilterMappingType<WebFragmentType<T>>> getAllFilterMapping();

   /**
    * Removes all <code>filter-mapping</code> elements 
    * @return the current instance of <code>FilterMappingType<WebFragmentType<T>></code> 
    */
   public WebFragmentType<T> removeAllFilterMapping();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentType ElementName: javaee:listenerType ElementType : listener
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>listener</code> element will be created and returned.
    * Otherwise, the first existing <code>listener</code> element will be returned.
    * @return the instance defined for the element <code>listener</code> 
    */
   public ListenerType<WebFragmentType<T>> getOrCreateListener();

   /**
    * Creates a new <code>listener</code> element 
    * @return the new created instance of <code>ListenerType<WebFragmentType<T>></code> 
    */
   public ListenerType<WebFragmentType<T>> createListener();

   /**
    * Returns all <code>listener</code> elements
    * @return list of <code>listener</code> 
    */
   public List<ListenerType<WebFragmentType<T>>> getAllListener();

   /**
    * Removes all <code>listener</code> elements 
    * @return the current instance of <code>ListenerType<WebFragmentType<T>></code> 
    */
   public WebFragmentType<T> removeAllListener();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentType ElementName: javaee:servletType ElementType : servlet
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>servlet</code> element will be created and returned.
    * Otherwise, the first existing <code>servlet</code> element will be returned.
    * @return the instance defined for the element <code>servlet</code> 
    */
   public ServletType<WebFragmentType<T>> getOrCreateServlet();

   /**
    * Creates a new <code>servlet</code> element 
    * @return the new created instance of <code>ServletType<WebFragmentType<T>></code> 
    */
   public ServletType<WebFragmentType<T>> createServlet();

   /**
    * Returns all <code>servlet</code> elements
    * @return list of <code>servlet</code> 
    */
   public List<ServletType<WebFragmentType<T>>> getAllServlet();

   /**
    * Removes all <code>servlet</code> elements 
    * @return the current instance of <code>ServletType<WebFragmentType<T>></code> 
    */
   public WebFragmentType<T> removeAllServlet();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentType ElementName: javaee:servlet-mappingType ElementType : servlet-mapping
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>servlet-mapping</code> element will be created and returned.
    * Otherwise, the first existing <code>servlet-mapping</code> element will be returned.
    * @return the instance defined for the element <code>servlet-mapping</code> 
    */
   public ServletMappingType<WebFragmentType<T>> getOrCreateServletMapping();

   /**
    * Creates a new <code>servlet-mapping</code> element 
    * @return the new created instance of <code>ServletMappingType<WebFragmentType<T>></code> 
    */
   public ServletMappingType<WebFragmentType<T>> createServletMapping();

   /**
    * Returns all <code>servlet-mapping</code> elements
    * @return list of <code>servlet-mapping</code> 
    */
   public List<ServletMappingType<WebFragmentType<T>>> getAllServletMapping();

   /**
    * Removes all <code>servlet-mapping</code> elements 
    * @return the current instance of <code>ServletMappingType<WebFragmentType<T>></code> 
    */
   public WebFragmentType<T> removeAllServletMapping();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentType ElementName: javaee:session-configType ElementType : session-config
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>session-config</code> element will be created and returned.
    * Otherwise, the first existing <code>session-config</code> element will be returned.
    * @return the instance defined for the element <code>session-config</code> 
    */
   public SessionConfigType<WebFragmentType<T>> getOrCreateSessionConfig();

   /**
    * Creates a new <code>session-config</code> element 
    * @return the new created instance of <code>SessionConfigType<WebFragmentType<T>></code> 
    */
   public SessionConfigType<WebFragmentType<T>> createSessionConfig();

   /**
    * Returns all <code>session-config</code> elements
    * @return list of <code>session-config</code> 
    */
   public List<SessionConfigType<WebFragmentType<T>>> getAllSessionConfig();

   /**
    * Removes all <code>session-config</code> elements 
    * @return the current instance of <code>SessionConfigType<WebFragmentType<T>></code> 
    */
   public WebFragmentType<T> removeAllSessionConfig();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentType ElementName: javaee:mime-mappingType ElementType : mime-mapping
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>mime-mapping</code> element will be created and returned.
    * Otherwise, the first existing <code>mime-mapping</code> element will be returned.
    * @return the instance defined for the element <code>mime-mapping</code> 
    */
   public MimeMappingType<WebFragmentType<T>> getOrCreateMimeMapping();

   /**
    * Creates a new <code>mime-mapping</code> element 
    * @return the new created instance of <code>MimeMappingType<WebFragmentType<T>></code> 
    */
   public MimeMappingType<WebFragmentType<T>> createMimeMapping();

   /**
    * Returns all <code>mime-mapping</code> elements
    * @return list of <code>mime-mapping</code> 
    */
   public List<MimeMappingType<WebFragmentType<T>>> getAllMimeMapping();

   /**
    * Removes all <code>mime-mapping</code> elements 
    * @return the current instance of <code>MimeMappingType<WebFragmentType<T>></code> 
    */
   public WebFragmentType<T> removeAllMimeMapping();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentType ElementName: javaee:welcome-file-listType ElementType : welcome-file-list
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>welcome-file-list</code> element will be created and returned.
    * Otherwise, the first existing <code>welcome-file-list</code> element will be returned.
    * @return the instance defined for the element <code>welcome-file-list</code> 
    */
   public WelcomeFileListType<WebFragmentType<T>> getOrCreateWelcomeFileList();

   /**
    * Creates a new <code>welcome-file-list</code> element 
    * @return the new created instance of <code>WelcomeFileListType<WebFragmentType<T>></code> 
    */
   public WelcomeFileListType<WebFragmentType<T>> createWelcomeFileList();

   /**
    * Returns all <code>welcome-file-list</code> elements
    * @return list of <code>welcome-file-list</code> 
    */
   public List<WelcomeFileListType<WebFragmentType<T>>> getAllWelcomeFileList();

   /**
    * Removes all <code>welcome-file-list</code> elements 
    * @return the current instance of <code>WelcomeFileListType<WebFragmentType<T>></code> 
    */
   public WebFragmentType<T> removeAllWelcomeFileList();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentType ElementName: javaee:error-pageType ElementType : error-page
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>error-page</code> element will be created and returned.
    * Otherwise, the first existing <code>error-page</code> element will be returned.
    * @return the instance defined for the element <code>error-page</code> 
    */
   public ErrorPageType<WebFragmentType<T>> getOrCreateErrorPage();

   /**
    * Creates a new <code>error-page</code> element 
    * @return the new created instance of <code>ErrorPageType<WebFragmentType<T>></code> 
    */
   public ErrorPageType<WebFragmentType<T>> createErrorPage();

   /**
    * Returns all <code>error-page</code> elements
    * @return list of <code>error-page</code> 
    */
   public List<ErrorPageType<WebFragmentType<T>>> getAllErrorPage();

   /**
    * Removes all <code>error-page</code> elements 
    * @return the current instance of <code>ErrorPageType<WebFragmentType<T>></code> 
    */
   public WebFragmentType<T> removeAllErrorPage();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentType ElementName: javaee:jsp-configType ElementType : jsp-config
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>jsp-config</code> element will be created and returned.
    * Otherwise, the first existing <code>jsp-config</code> element will be returned.
    * @return the instance defined for the element <code>jsp-config</code> 
    */
   public JspConfigType<WebFragmentType<T>> getOrCreateJspConfig();

   /**
    * Creates a new <code>jsp-config</code> element 
    * @return the new created instance of <code>JspConfigType<WebFragmentType<T>></code> 
    */
   public JspConfigType<WebFragmentType<T>> createJspConfig();

   /**
    * Returns all <code>jsp-config</code> elements
    * @return list of <code>jsp-config</code> 
    */
   public List<JspConfigType<WebFragmentType<T>>> getAllJspConfig();

   /**
    * Removes all <code>jsp-config</code> elements 
    * @return the current instance of <code>JspConfigType<WebFragmentType<T>></code> 
    */
   public WebFragmentType<T> removeAllJspConfig();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentType ElementName: javaee:security-constraintType ElementType : security-constraint
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>security-constraint</code> element will be created and returned.
    * Otherwise, the first existing <code>security-constraint</code> element will be returned.
    * @return the instance defined for the element <code>security-constraint</code> 
    */
   public SecurityConstraintType<WebFragmentType<T>> getOrCreateSecurityConstraint();

   /**
    * Creates a new <code>security-constraint</code> element 
    * @return the new created instance of <code>SecurityConstraintType<WebFragmentType<T>></code> 
    */
   public SecurityConstraintType<WebFragmentType<T>> createSecurityConstraint();

   /**
    * Returns all <code>security-constraint</code> elements
    * @return list of <code>security-constraint</code> 
    */
   public List<SecurityConstraintType<WebFragmentType<T>>> getAllSecurityConstraint();

   /**
    * Removes all <code>security-constraint</code> elements 
    * @return the current instance of <code>SecurityConstraintType<WebFragmentType<T>></code> 
    */
   public WebFragmentType<T> removeAllSecurityConstraint();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentType ElementName: javaee:login-configType ElementType : login-config
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>login-config</code> element will be created and returned.
    * Otherwise, the first existing <code>login-config</code> element will be returned.
    * @return the instance defined for the element <code>login-config</code> 
    */
   public LoginConfigType<WebFragmentType<T>> getOrCreateLoginConfig();

   /**
    * Creates a new <code>login-config</code> element 
    * @return the new created instance of <code>LoginConfigType<WebFragmentType<T>></code> 
    */
   public LoginConfigType<WebFragmentType<T>> createLoginConfig();

   /**
    * Returns all <code>login-config</code> elements
    * @return list of <code>login-config</code> 
    */
   public List<LoginConfigType<WebFragmentType<T>>> getAllLoginConfig();

   /**
    * Removes all <code>login-config</code> elements 
    * @return the current instance of <code>LoginConfigType<WebFragmentType<T>></code> 
    */
   public WebFragmentType<T> removeAllLoginConfig();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentType ElementName: javaee:security-roleType ElementType : security-role
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>security-role</code> element will be created and returned.
    * Otherwise, the first existing <code>security-role</code> element will be returned.
    * @return the instance defined for the element <code>security-role</code> 
    */
   public SecurityRoleType<WebFragmentType<T>> getOrCreateSecurityRole();

   /**
    * Creates a new <code>security-role</code> element 
    * @return the new created instance of <code>SecurityRoleType<WebFragmentType<T>></code> 
    */
   public SecurityRoleType<WebFragmentType<T>> createSecurityRole();

   /**
    * Returns all <code>security-role</code> elements
    * @return list of <code>security-role</code> 
    */
   public List<SecurityRoleType<WebFragmentType<T>>> getAllSecurityRole();

   /**
    * Removes all <code>security-role</code> elements 
    * @return the current instance of <code>SecurityRoleType<WebFragmentType<T>></code> 
    */
   public WebFragmentType<T> removeAllSecurityRole();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentType ElementName: javaee:message-destinationType ElementType : message-destination
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>message-destination</code> element will be created and returned.
    * Otherwise, the first existing <code>message-destination</code> element will be returned.
    * @return the instance defined for the element <code>message-destination</code> 
    */
   public MessageDestinationType<WebFragmentType<T>> getOrCreateMessageDestination();

   /**
    * Creates a new <code>message-destination</code> element 
    * @return the new created instance of <code>MessageDestinationType<WebFragmentType<T>></code> 
    */
   public MessageDestinationType<WebFragmentType<T>> createMessageDestination();

   /**
    * Returns all <code>message-destination</code> elements
    * @return list of <code>message-destination</code> 
    */
   public List<MessageDestinationType<WebFragmentType<T>>> getAllMessageDestination();

   /**
    * Removes all <code>message-destination</code> elements 
    * @return the current instance of <code>MessageDestinationType<WebFragmentType<T>></code> 
    */
   public WebFragmentType<T> removeAllMessageDestination();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentType ElementName: javaee:locale-encoding-mapping-listType ElementType : locale-encoding-mapping-list
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>locale-encoding-mapping-list</code> element will be created and returned.
    * Otherwise, the first existing <code>locale-encoding-mapping-list</code> element will be returned.
    * @return the instance defined for the element <code>locale-encoding-mapping-list</code> 
    */
   public LocaleEncodingMappingListType<WebFragmentType<T>> getOrCreateLocaleEncodingMappingList();

   /**
    * Creates a new <code>locale-encoding-mapping-list</code> element 
    * @return the new created instance of <code>LocaleEncodingMappingListType<WebFragmentType<T>></code> 
    */
   public LocaleEncodingMappingListType<WebFragmentType<T>> createLocaleEncodingMappingList();

   /**
    * Returns all <code>locale-encoding-mapping-list</code> elements
    * @return list of <code>locale-encoding-mapping-list</code> 
    */
   public List<LocaleEncodingMappingListType<WebFragmentType<T>>> getAllLocaleEncodingMappingList();

   /**
    * Removes all <code>locale-encoding-mapping-list</code> elements 
    * @return the current instance of <code>LocaleEncodingMappingListType<WebFragmentType<T>></code> 
    */
   public WebFragmentType<T> removeAllLocaleEncodingMappingList();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>WebFragmentType<T></code> 
    */
   public WebFragmentType<T> description(String ... values);

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>WebFragmentType<T></code> 
    */
   public WebFragmentType<T> removeAllDescription();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentType ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>WebFragmentType<T></code> 
    */
   public WebFragmentType<T> displayName(String ... values);

   /**
    * Returns all <code>display-name</code> elements
    * @return list of <code>display-name</code> 
    */
   public List<String> getAllDisplayName();

   /**
    * Removes the <code>display-name</code> element 
    * @return the current instance of <code>WebFragmentType<T></code> 
    */
   public WebFragmentType<T> removeAllDisplayName();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentType ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<WebFragmentType<T>> getOrCreateIcon();

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<WebFragmentType<T>></code> 
    */
   public IconType<WebFragmentType<T>> createIcon();

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<WebFragmentType<T>>> getAllIcon();

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<WebFragmentType<T>></code> 
    */
   public WebFragmentType<T> removeAllIcon();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentType ElementName: javaee:env-entryType ElementType : env-entry
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>env-entry</code> element will be created and returned.
    * Otherwise, the first existing <code>env-entry</code> element will be returned.
    * @return the instance defined for the element <code>env-entry</code> 
    */
   public EnvEntryType<WebFragmentType<T>> getOrCreateEnvEntry();

   /**
    * Creates a new <code>env-entry</code> element 
    * @return the new created instance of <code>EnvEntryType<WebFragmentType<T>></code> 
    */
   public EnvEntryType<WebFragmentType<T>> createEnvEntry();

   /**
    * Returns all <code>env-entry</code> elements
    * @return list of <code>env-entry</code> 
    */
   public List<EnvEntryType<WebFragmentType<T>>> getAllEnvEntry();

   /**
    * Removes all <code>env-entry</code> elements 
    * @return the current instance of <code>EnvEntryType<WebFragmentType<T>></code> 
    */
   public WebFragmentType<T> removeAllEnvEntry();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentType ElementName: javaee:ejb-refType ElementType : ejb-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>ejb-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>ejb-ref</code> element will be returned.
    * @return the instance defined for the element <code>ejb-ref</code> 
    */
   public EjbRefType<WebFragmentType<T>> getOrCreateEjbRef();

   /**
    * Creates a new <code>ejb-ref</code> element 
    * @return the new created instance of <code>EjbRefType<WebFragmentType<T>></code> 
    */
   public EjbRefType<WebFragmentType<T>> createEjbRef();

   /**
    * Returns all <code>ejb-ref</code> elements
    * @return list of <code>ejb-ref</code> 
    */
   public List<EjbRefType<WebFragmentType<T>>> getAllEjbRef();

   /**
    * Removes all <code>ejb-ref</code> elements 
    * @return the current instance of <code>EjbRefType<WebFragmentType<T>></code> 
    */
   public WebFragmentType<T> removeAllEjbRef();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentType ElementName: javaee:ejb-local-refType ElementType : ejb-local-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>ejb-local-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>ejb-local-ref</code> element will be returned.
    * @return the instance defined for the element <code>ejb-local-ref</code> 
    */
   public EjbLocalRefType<WebFragmentType<T>> getOrCreateEjbLocalRef();

   /**
    * Creates a new <code>ejb-local-ref</code> element 
    * @return the new created instance of <code>EjbLocalRefType<WebFragmentType<T>></code> 
    */
   public EjbLocalRefType<WebFragmentType<T>> createEjbLocalRef();

   /**
    * Returns all <code>ejb-local-ref</code> elements
    * @return list of <code>ejb-local-ref</code> 
    */
   public List<EjbLocalRefType<WebFragmentType<T>>> getAllEjbLocalRef();

   /**
    * Removes all <code>ejb-local-ref</code> elements 
    * @return the current instance of <code>EjbLocalRefType<WebFragmentType<T>></code> 
    */
   public WebFragmentType<T> removeAllEjbLocalRef();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentType ElementName: javaee:resource-refType ElementType : resource-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>resource-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>resource-ref</code> element will be returned.
    * @return the instance defined for the element <code>resource-ref</code> 
    */
   public ResourceRefType<WebFragmentType<T>> getOrCreateResourceRef();

   /**
    * Creates a new <code>resource-ref</code> element 
    * @return the new created instance of <code>ResourceRefType<WebFragmentType<T>></code> 
    */
   public ResourceRefType<WebFragmentType<T>> createResourceRef();

   /**
    * Returns all <code>resource-ref</code> elements
    * @return list of <code>resource-ref</code> 
    */
   public List<ResourceRefType<WebFragmentType<T>>> getAllResourceRef();

   /**
    * Removes all <code>resource-ref</code> elements 
    * @return the current instance of <code>ResourceRefType<WebFragmentType<T>></code> 
    */
   public WebFragmentType<T> removeAllResourceRef();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentType ElementName: javaee:resource-env-refType ElementType : resource-env-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>resource-env-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>resource-env-ref</code> element will be returned.
    * @return the instance defined for the element <code>resource-env-ref</code> 
    */
   public ResourceEnvRefType<WebFragmentType<T>> getOrCreateResourceEnvRef();

   /**
    * Creates a new <code>resource-env-ref</code> element 
    * @return the new created instance of <code>ResourceEnvRefType<WebFragmentType<T>></code> 
    */
   public ResourceEnvRefType<WebFragmentType<T>> createResourceEnvRef();

   /**
    * Returns all <code>resource-env-ref</code> elements
    * @return list of <code>resource-env-ref</code> 
    */
   public List<ResourceEnvRefType<WebFragmentType<T>>> getAllResourceEnvRef();

   /**
    * Removes all <code>resource-env-ref</code> elements 
    * @return the current instance of <code>ResourceEnvRefType<WebFragmentType<T>></code> 
    */
   public WebFragmentType<T> removeAllResourceEnvRef();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentType ElementName: javaee:message-destination-refType ElementType : message-destination-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>message-destination-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>message-destination-ref</code> element will be returned.
    * @return the instance defined for the element <code>message-destination-ref</code> 
    */
   public MessageDestinationRefType<WebFragmentType<T>> getOrCreateMessageDestinationRef();

   /**
    * Creates a new <code>message-destination-ref</code> element 
    * @return the new created instance of <code>MessageDestinationRefType<WebFragmentType<T>></code> 
    */
   public MessageDestinationRefType<WebFragmentType<T>> createMessageDestinationRef();

   /**
    * Returns all <code>message-destination-ref</code> elements
    * @return list of <code>message-destination-ref</code> 
    */
   public List<MessageDestinationRefType<WebFragmentType<T>>> getAllMessageDestinationRef();

   /**
    * Removes all <code>message-destination-ref</code> elements 
    * @return the current instance of <code>MessageDestinationRefType<WebFragmentType<T>></code> 
    */
   public WebFragmentType<T> removeAllMessageDestinationRef();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentType ElementName: javaee:persistence-context-refType ElementType : persistence-context-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>persistence-context-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>persistence-context-ref</code> element will be returned.
    * @return the instance defined for the element <code>persistence-context-ref</code> 
    */
   public PersistenceContextRefType<WebFragmentType<T>> getOrCreatePersistenceContextRef();

   /**
    * Creates a new <code>persistence-context-ref</code> element 
    * @return the new created instance of <code>PersistenceContextRefType<WebFragmentType<T>></code> 
    */
   public PersistenceContextRefType<WebFragmentType<T>> createPersistenceContextRef();

   /**
    * Returns all <code>persistence-context-ref</code> elements
    * @return list of <code>persistence-context-ref</code> 
    */
   public List<PersistenceContextRefType<WebFragmentType<T>>> getAllPersistenceContextRef();

   /**
    * Removes all <code>persistence-context-ref</code> elements 
    * @return the current instance of <code>PersistenceContextRefType<WebFragmentType<T>></code> 
    */
   public WebFragmentType<T> removeAllPersistenceContextRef();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentType ElementName: javaee:persistence-unit-refType ElementType : persistence-unit-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>persistence-unit-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>persistence-unit-ref</code> element will be returned.
    * @return the instance defined for the element <code>persistence-unit-ref</code> 
    */
   public PersistenceUnitRefType<WebFragmentType<T>> getOrCreatePersistenceUnitRef();

   /**
    * Creates a new <code>persistence-unit-ref</code> element 
    * @return the new created instance of <code>PersistenceUnitRefType<WebFragmentType<T>></code> 
    */
   public PersistenceUnitRefType<WebFragmentType<T>> createPersistenceUnitRef();

   /**
    * Returns all <code>persistence-unit-ref</code> elements
    * @return list of <code>persistence-unit-ref</code> 
    */
   public List<PersistenceUnitRefType<WebFragmentType<T>>> getAllPersistenceUnitRef();

   /**
    * Removes all <code>persistence-unit-ref</code> elements 
    * @return the current instance of <code>PersistenceUnitRefType<WebFragmentType<T>></code> 
    */
   public WebFragmentType<T> removeAllPersistenceUnitRef();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentType ElementName: javaee:lifecycle-callbackType ElementType : post-construct
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>post-construct</code> element will be created and returned.
    * Otherwise, the first existing <code>post-construct</code> element will be returned.
    * @return the instance defined for the element <code>post-construct</code> 
    */
   public LifecycleCallbackType<WebFragmentType<T>> getOrCreatePostConstruct();

   /**
    * Creates a new <code>post-construct</code> element 
    * @return the new created instance of <code>LifecycleCallbackType<WebFragmentType<T>></code> 
    */
   public LifecycleCallbackType<WebFragmentType<T>> createPostConstruct();

   /**
    * Returns all <code>post-construct</code> elements
    * @return list of <code>post-construct</code> 
    */
   public List<LifecycleCallbackType<WebFragmentType<T>>> getAllPostConstruct();

   /**
    * Removes all <code>post-construct</code> elements 
    * @return the current instance of <code>LifecycleCallbackType<WebFragmentType<T>></code> 
    */
   public WebFragmentType<T> removeAllPostConstruct();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentType ElementName: javaee:lifecycle-callbackType ElementType : pre-destroy
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>pre-destroy</code> element will be created and returned.
    * Otherwise, the first existing <code>pre-destroy</code> element will be returned.
    * @return the instance defined for the element <code>pre-destroy</code> 
    */
   public LifecycleCallbackType<WebFragmentType<T>> getOrCreatePreDestroy();

   /**
    * Creates a new <code>pre-destroy</code> element 
    * @return the new created instance of <code>LifecycleCallbackType<WebFragmentType<T>></code> 
    */
   public LifecycleCallbackType<WebFragmentType<T>> createPreDestroy();

   /**
    * Returns all <code>pre-destroy</code> elements
    * @return list of <code>pre-destroy</code> 
    */
   public List<LifecycleCallbackType<WebFragmentType<T>>> getAllPreDestroy();

   /**
    * Removes all <code>pre-destroy</code> elements 
    * @return the current instance of <code>LifecycleCallbackType<WebFragmentType<T>></code> 
    */
   public WebFragmentType<T> removeAllPreDestroy();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentType ElementName: javaee:data-sourceType ElementType : data-source
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>data-source</code> element will be created and returned.
    * Otherwise, the first existing <code>data-source</code> element will be returned.
    * @return the instance defined for the element <code>data-source</code> 
    */
   public DataSourceType<WebFragmentType<T>> getOrCreateDataSource();

   /**
    * Creates a new <code>data-source</code> element 
    * @return the new created instance of <code>DataSourceType<WebFragmentType<T>></code> 
    */
   public DataSourceType<WebFragmentType<T>> createDataSource();

   /**
    * Returns all <code>data-source</code> elements
    * @return list of <code>data-source</code> 
    */
   public List<DataSourceType<WebFragmentType<T>>> getAllDataSource();

   /**
    * Removes all <code>data-source</code> elements 
    * @return the current instance of <code>DataSourceType<WebFragmentType<T>></code> 
    */
   public WebFragmentType<T> removeAllDataSource();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentType ElementName: javaee:jms-connection-factoryType ElementType : jms-connection-factory
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>jms-connection-factory</code> element will be created and returned.
    * Otherwise, the first existing <code>jms-connection-factory</code> element will be returned.
    * @return the instance defined for the element <code>jms-connection-factory</code> 
    */
   public JmsConnectionFactoryType<WebFragmentType<T>> getOrCreateJmsConnectionFactory();

   /**
    * Creates a new <code>jms-connection-factory</code> element 
    * @return the new created instance of <code>JmsConnectionFactoryType<WebFragmentType<T>></code> 
    */
   public JmsConnectionFactoryType<WebFragmentType<T>> createJmsConnectionFactory();

   /**
    * Returns all <code>jms-connection-factory</code> elements
    * @return list of <code>jms-connection-factory</code> 
    */
   public List<JmsConnectionFactoryType<WebFragmentType<T>>> getAllJmsConnectionFactory();

   /**
    * Removes all <code>jms-connection-factory</code> elements 
    * @return the current instance of <code>JmsConnectionFactoryType<WebFragmentType<T>></code> 
    */
   public WebFragmentType<T> removeAllJmsConnectionFactory();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentType ElementName: javaee:jms-destinationType ElementType : jms-destination
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>jms-destination</code> element will be created and returned.
    * Otherwise, the first existing <code>jms-destination</code> element will be returned.
    * @return the instance defined for the element <code>jms-destination</code> 
    */
   public JmsDestinationType<WebFragmentType<T>> getOrCreateJmsDestination();

   /**
    * Creates a new <code>jms-destination</code> element 
    * @return the new created instance of <code>JmsDestinationType<WebFragmentType<T>></code> 
    */
   public JmsDestinationType<WebFragmentType<T>> createJmsDestination();

   /**
    * Returns all <code>jms-destination</code> elements
    * @return list of <code>jms-destination</code> 
    */
   public List<JmsDestinationType<WebFragmentType<T>>> getAllJmsDestination();

   /**
    * Removes all <code>jms-destination</code> elements 
    * @return the current instance of <code>JmsDestinationType<WebFragmentType<T>></code> 
    */
   public WebFragmentType<T> removeAllJmsDestination();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentType ElementName: javaee:mail-sessionType ElementType : mail-session
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>mail-session</code> element will be created and returned.
    * Otherwise, the first existing <code>mail-session</code> element will be returned.
    * @return the instance defined for the element <code>mail-session</code> 
    */
   public MailSessionType<WebFragmentType<T>> getOrCreateMailSession();

   /**
    * Creates a new <code>mail-session</code> element 
    * @return the new created instance of <code>MailSessionType<WebFragmentType<T>></code> 
    */
   public MailSessionType<WebFragmentType<T>> createMailSession();

   /**
    * Returns all <code>mail-session</code> elements
    * @return list of <code>mail-session</code> 
    */
   public List<MailSessionType<WebFragmentType<T>>> getAllMailSession();

   /**
    * Removes all <code>mail-session</code> elements 
    * @return the current instance of <code>MailSessionType<WebFragmentType<T>></code> 
    */
   public WebFragmentType<T> removeAllMailSession();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentType ElementName: javaee:connection-factory-resourceType ElementType : connection-factory
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>connection-factory</code> element will be created and returned.
    * Otherwise, the first existing <code>connection-factory</code> element will be returned.
    * @return the instance defined for the element <code>connection-factory</code> 
    */
   public ConnectionFactoryResourceType<WebFragmentType<T>> getOrCreateConnectionFactory();

   /**
    * Creates a new <code>connection-factory</code> element 
    * @return the new created instance of <code>ConnectionFactoryResourceType<WebFragmentType<T>></code> 
    */
   public ConnectionFactoryResourceType<WebFragmentType<T>> createConnectionFactory();

   /**
    * Returns all <code>connection-factory</code> elements
    * @return list of <code>connection-factory</code> 
    */
   public List<ConnectionFactoryResourceType<WebFragmentType<T>>> getAllConnectionFactory();

   /**
    * Removes all <code>connection-factory</code> elements 
    * @return the current instance of <code>ConnectionFactoryResourceType<WebFragmentType<T>></code> 
    */
   public WebFragmentType<T> removeAllConnectionFactory();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentType ElementName: javaee:administered-objectType ElementType : administered-object
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>administered-object</code> element will be created and returned.
    * Otherwise, the first existing <code>administered-object</code> element will be returned.
    * @return the instance defined for the element <code>administered-object</code> 
    */
   public AdministeredObjectType<WebFragmentType<T>> getOrCreateAdministeredObject();

   /**
    * Creates a new <code>administered-object</code> element 
    * @return the new created instance of <code>AdministeredObjectType<WebFragmentType<T>></code> 
    */
   public AdministeredObjectType<WebFragmentType<T>> createAdministeredObject();

   /**
    * Returns all <code>administered-object</code> elements
    * @return list of <code>administered-object</code> 
    */
   public List<AdministeredObjectType<WebFragmentType<T>>> getAllAdministeredObject();

   /**
    * Removes all <code>administered-object</code> elements 
    * @return the current instance of <code>AdministeredObjectType<WebFragmentType<T>></code> 
    */
   public WebFragmentType<T> removeAllAdministeredObject();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentType ElementName: javaee:service-refType ElementType : service-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>service-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>service-ref</code> element will be returned.
    * @return the instance defined for the element <code>service-ref</code> 
    */
   public ServiceRefType<WebFragmentType<T>> getOrCreateServiceRef();

   /**
    * Creates a new <code>service-ref</code> element 
    * @return the new created instance of <code>ServiceRefType<WebFragmentType<T>></code> 
    */
   public ServiceRefType<WebFragmentType<T>> createServiceRef();

   /**
    * Returns all <code>service-ref</code> elements
    * @return list of <code>service-ref</code> 
    */
   public List<ServiceRefType<WebFragmentType<T>>> getAllServiceRef();

   /**
    * Removes all <code>service-ref</code> elements 
    * @return the current instance of <code>ServiceRefType<WebFragmentType<T>></code> 
    */
   public WebFragmentType<T> removeAllServiceRef();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentType ElementName: javaee:web-app-versionType ElementType : version
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of <code>WebFragmentType<T></code> 
    */
   public WebFragmentType<T> version(WebAppVersionType version);

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of <code>WebFragmentType<T></code> 
    */
   public WebFragmentType<T> version(String version);

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
    * @return the current instance of <code>WebFragmentType<T></code> 
    */
   public WebFragmentType<T> removeVersion();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>WebFragmentType<T></code> 
    */
   public WebFragmentType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>WebFragmentType<T></code> 
    */
   public WebFragmentType<T> removeId();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentType ElementName: xsd:boolean ElementType : metadata-complete
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>metadata-complete</code> attribute
    * @param metadataComplete the value for the attribute <code>metadata-complete</code> 
    * @return the current instance of <code>WebFragmentType<T></code> 
    */
   public WebFragmentType<T> metadataComplete(Boolean metadataComplete);

   /**
    * Returns the <code>metadata-complete</code> attribute
    * @return the value defined for the attribute <code>metadata-complete</code> 
    */
public Boolean isMetadataComplete();

   /**
    * Removes the <code>metadata-complete</code> attribute 
    * @return the current instance of <code>WebFragmentType<T></code> 
    */
   public WebFragmentType<T> removeMetadataComplete();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentType ElementName: xsd:token ElementType : name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>name</code> elements, 
    * a new <code>name</code> element 
    * @param values list of <code>name</code> objects 
    * @return the current instance of <code>WebFragmentType<T></code> 
    */
   public WebFragmentType<T> name(String ... values);

   /**
    * Returns all <code>name</code> elements
    * @return list of <code>name</code> 
    */
   public List<String> getAllName();

   /**
    * Removes the <code>name</code> element 
    * @return the current instance of <code>WebFragmentType<T></code> 
    */
   public WebFragmentType<T> removeAllName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentType ElementName: javaee:orderingType ElementType : ordering
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>ordering</code> element will be created and returned.
    * Otherwise, the first existing <code>ordering</code> element will be returned.
    * @return the instance defined for the element <code>ordering</code> 
    */
   public OrderingType<WebFragmentType<T>> getOrCreateOrdering();

   /**
    * Creates a new <code>ordering</code> element 
    * @return the new created instance of <code>OrderingType<WebFragmentType<T>></code> 
    */
   public OrderingType<WebFragmentType<T>> createOrdering();

   /**
    * Returns all <code>ordering</code> elements
    * @return list of <code>ordering</code> 
    */
   public List<OrderingType<WebFragmentType<T>>> getAllOrdering();

   /**
    * Removes all <code>ordering</code> elements 
    * @return the current instance of <code>OrderingType<WebFragmentType<T>></code> 
    */
   public WebFragmentType<T> removeAllOrdering();
}
