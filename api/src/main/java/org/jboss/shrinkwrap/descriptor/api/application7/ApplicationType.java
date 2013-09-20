package org.jboss.shrinkwrap.descriptor.api.application7; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee7.AdministeredObjectType;
import org.jboss.shrinkwrap.descriptor.api.javaee7.ConnectionFactoryResourceType;
import org.jboss.shrinkwrap.descriptor.api.javaee7.DataSourceType;
import org.jboss.shrinkwrap.descriptor.api.javaee7.EjbLocalRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee7.EjbRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee7.EnvEntryType;
import org.jboss.shrinkwrap.descriptor.api.javaee7.GenericBooleanType;
import org.jboss.shrinkwrap.descriptor.api.javaee7.IconType;
import org.jboss.shrinkwrap.descriptor.api.javaee7.JmsConnectionFactoryType;
import org.jboss.shrinkwrap.descriptor.api.javaee7.JmsDestinationType;
import org.jboss.shrinkwrap.descriptor.api.javaee7.MailSessionType;
import org.jboss.shrinkwrap.descriptor.api.javaee7.MessageDestinationRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee7.MessageDestinationType;
import org.jboss.shrinkwrap.descriptor.api.javaee7.PersistenceContextRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee7.PersistenceUnitRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee7.ResourceEnvRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee7.ResourceRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee7.SecurityRoleType;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient14.ServiceRefType;
/**
 * This interface defines the contract for the <code> applicationType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface ApplicationType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>ApplicationType<T></code> 
    */
   public ApplicationType<T> description(String ... values);

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>ApplicationType<T></code> 
    */
   public ApplicationType<T> removeAllDescription();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationType ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>ApplicationType<T></code> 
    */
   public ApplicationType<T> displayName(String ... values);

   /**
    * Returns all <code>display-name</code> elements
    * @return list of <code>display-name</code> 
    */
   public List<String> getAllDisplayName();

   /**
    * Removes the <code>display-name</code> element 
    * @return the current instance of <code>ApplicationType<T></code> 
    */
   public ApplicationType<T> removeAllDisplayName();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationType ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<ApplicationType<T>> getOrCreateIcon();

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<ApplicationType<T>></code> 
    */
   public IconType<ApplicationType<T>> createIcon();

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<ApplicationType<T>>> getAllIcon();

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<ApplicationType<T>></code> 
    */
   public ApplicationType<T> removeAllIcon();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationType ElementName: javaee:service-refType ElementType : service-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>service-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>service-ref</code> element will be returned.
    * @return the instance defined for the element <code>service-ref</code> 
    */
   public ServiceRefType<ApplicationType<T>> getOrCreateServiceRef();

   /**
    * Creates a new <code>service-ref</code> element 
    * @return the new created instance of <code>ServiceRefType<ApplicationType<T>></code> 
    */
   public ServiceRefType<ApplicationType<T>> createServiceRef();

   /**
    * Returns all <code>service-ref</code> elements
    * @return list of <code>service-ref</code> 
    */
   public List<ServiceRefType<ApplicationType<T>>> getAllServiceRef();

   /**
    * Removes all <code>service-ref</code> elements 
    * @return the current instance of <code>ServiceRefType<ApplicationType<T>></code> 
    */
   public ApplicationType<T> removeAllServiceRef();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationType ElementName: xsd:token ElementType : application-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>application-name</code> element
    * @param applicationName the value for the element <code>application-name</code> 
    * @return the current instance of <code>ApplicationType<T></code> 
    */
   public ApplicationType<T> applicationName(String applicationName);

   /**
    * Returns the <code>application-name</code> element
    * @return the node defined for the element <code>application-name</code> 
    */
   public String getApplicationName();

   /**
    * Removes the <code>application-name</code> element 
    * @return the current instance of <code>ApplicationType<T></code> 
    */
   public ApplicationType<T> removeApplicationName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationType ElementName: javaee:generic-booleanType ElementType : initialize-in-order
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>initialize-in-order</code> element
    * @param initializeInOrder the value for the element <code>initialize-in-order</code> 
    * @return the current instance of <code>ApplicationType<T></code> 
    */
   public ApplicationType<T> initializeInOrder(GenericBooleanType initializeInOrder);
   /**
    * Sets the <code>initialize-in-order</code> element
    * @param initializeInOrder the value for the element <code>initialize-in-order</code> 
    * @return the current instance of <code>ApplicationType<T></code> 
    */
   public ApplicationType<T> initializeInOrder(String initializeInOrder);

   /**
    * Returns the <code>initialize-in-order</code> element
    * @return the value found for the element <code>initialize-in-order</code> 
    */
   public GenericBooleanType getInitializeInOrder();

   /**
    * Returns the <code>initialize-in-order</code> element
    * @return the value found for the element <code>initialize-in-order</code> 
    */
   public String  getInitializeInOrderAsString();

   /**
    * Removes the <code>initialize-in-order</code> attribute 
    * @return the current instance of <code>ApplicationType<T></code> 
    */
   public ApplicationType<T> removeInitializeInOrder();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationType ElementName: javaee:moduleType ElementType : module
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>module</code> element will be created and returned.
    * Otherwise, the first existing <code>module</code> element will be returned.
    * @return the instance defined for the element <code>module</code> 
    */
   public ModuleType<ApplicationType<T>> getOrCreateModule();

   /**
    * Creates a new <code>module</code> element 
    * @return the new created instance of <code>ModuleType<ApplicationType<T>></code> 
    */
   public ModuleType<ApplicationType<T>> createModule();

   /**
    * Returns all <code>module</code> elements
    * @return list of <code>module</code> 
    */
   public List<ModuleType<ApplicationType<T>>> getAllModule();

   /**
    * Removes all <code>module</code> elements 
    * @return the current instance of <code>ModuleType<ApplicationType<T>></code> 
    */
   public ApplicationType<T> removeAllModule();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationType ElementName: javaee:security-roleType ElementType : security-role
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>security-role</code> element will be created and returned.
    * Otherwise, the first existing <code>security-role</code> element will be returned.
    * @return the instance defined for the element <code>security-role</code> 
    */
   public SecurityRoleType<ApplicationType<T>> getOrCreateSecurityRole();

   /**
    * Creates a new <code>security-role</code> element 
    * @return the new created instance of <code>SecurityRoleType<ApplicationType<T>></code> 
    */
   public SecurityRoleType<ApplicationType<T>> createSecurityRole();

   /**
    * Returns all <code>security-role</code> elements
    * @return list of <code>security-role</code> 
    */
   public List<SecurityRoleType<ApplicationType<T>>> getAllSecurityRole();

   /**
    * Removes all <code>security-role</code> elements 
    * @return the current instance of <code>SecurityRoleType<ApplicationType<T>></code> 
    */
   public ApplicationType<T> removeAllSecurityRole();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationType ElementName: xsd:token ElementType : library-directory
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>library-directory</code> element
    * @param libraryDirectory the value for the element <code>library-directory</code> 
    * @return the current instance of <code>ApplicationType<T></code> 
    */
   public ApplicationType<T> libraryDirectory(String libraryDirectory);

   /**
    * Returns the <code>library-directory</code> element
    * @return the node defined for the element <code>library-directory</code> 
    */
   public String getLibraryDirectory();

   /**
    * Removes the <code>library-directory</code> element 
    * @return the current instance of <code>ApplicationType<T></code> 
    */
   public ApplicationType<T> removeLibraryDirectory();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationType ElementName: javaee:env-entryType ElementType : env-entry
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>env-entry</code> element will be created and returned.
    * Otherwise, the first existing <code>env-entry</code> element will be returned.
    * @return the instance defined for the element <code>env-entry</code> 
    */
   public EnvEntryType<ApplicationType<T>> getOrCreateEnvEntry();

   /**
    * Creates a new <code>env-entry</code> element 
    * @return the new created instance of <code>EnvEntryType<ApplicationType<T>></code> 
    */
   public EnvEntryType<ApplicationType<T>> createEnvEntry();

   /**
    * Returns all <code>env-entry</code> elements
    * @return list of <code>env-entry</code> 
    */
   public List<EnvEntryType<ApplicationType<T>>> getAllEnvEntry();

   /**
    * Removes all <code>env-entry</code> elements 
    * @return the current instance of <code>EnvEntryType<ApplicationType<T>></code> 
    */
   public ApplicationType<T> removeAllEnvEntry();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationType ElementName: javaee:ejb-refType ElementType : ejb-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>ejb-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>ejb-ref</code> element will be returned.
    * @return the instance defined for the element <code>ejb-ref</code> 
    */
   public EjbRefType<ApplicationType<T>> getOrCreateEjbRef();

   /**
    * Creates a new <code>ejb-ref</code> element 
    * @return the new created instance of <code>EjbRefType<ApplicationType<T>></code> 
    */
   public EjbRefType<ApplicationType<T>> createEjbRef();

   /**
    * Returns all <code>ejb-ref</code> elements
    * @return list of <code>ejb-ref</code> 
    */
   public List<EjbRefType<ApplicationType<T>>> getAllEjbRef();

   /**
    * Removes all <code>ejb-ref</code> elements 
    * @return the current instance of <code>EjbRefType<ApplicationType<T>></code> 
    */
   public ApplicationType<T> removeAllEjbRef();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationType ElementName: javaee:ejb-local-refType ElementType : ejb-local-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>ejb-local-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>ejb-local-ref</code> element will be returned.
    * @return the instance defined for the element <code>ejb-local-ref</code> 
    */
   public EjbLocalRefType<ApplicationType<T>> getOrCreateEjbLocalRef();

   /**
    * Creates a new <code>ejb-local-ref</code> element 
    * @return the new created instance of <code>EjbLocalRefType<ApplicationType<T>></code> 
    */
   public EjbLocalRefType<ApplicationType<T>> createEjbLocalRef();

   /**
    * Returns all <code>ejb-local-ref</code> elements
    * @return list of <code>ejb-local-ref</code> 
    */
   public List<EjbLocalRefType<ApplicationType<T>>> getAllEjbLocalRef();

   /**
    * Removes all <code>ejb-local-ref</code> elements 
    * @return the current instance of <code>EjbLocalRefType<ApplicationType<T>></code> 
    */
   public ApplicationType<T> removeAllEjbLocalRef();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationType ElementName: javaee:resource-refType ElementType : resource-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>resource-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>resource-ref</code> element will be returned.
    * @return the instance defined for the element <code>resource-ref</code> 
    */
   public ResourceRefType<ApplicationType<T>> getOrCreateResourceRef();

   /**
    * Creates a new <code>resource-ref</code> element 
    * @return the new created instance of <code>ResourceRefType<ApplicationType<T>></code> 
    */
   public ResourceRefType<ApplicationType<T>> createResourceRef();

   /**
    * Returns all <code>resource-ref</code> elements
    * @return list of <code>resource-ref</code> 
    */
   public List<ResourceRefType<ApplicationType<T>>> getAllResourceRef();

   /**
    * Removes all <code>resource-ref</code> elements 
    * @return the current instance of <code>ResourceRefType<ApplicationType<T>></code> 
    */
   public ApplicationType<T> removeAllResourceRef();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationType ElementName: javaee:resource-env-refType ElementType : resource-env-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>resource-env-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>resource-env-ref</code> element will be returned.
    * @return the instance defined for the element <code>resource-env-ref</code> 
    */
   public ResourceEnvRefType<ApplicationType<T>> getOrCreateResourceEnvRef();

   /**
    * Creates a new <code>resource-env-ref</code> element 
    * @return the new created instance of <code>ResourceEnvRefType<ApplicationType<T>></code> 
    */
   public ResourceEnvRefType<ApplicationType<T>> createResourceEnvRef();

   /**
    * Returns all <code>resource-env-ref</code> elements
    * @return list of <code>resource-env-ref</code> 
    */
   public List<ResourceEnvRefType<ApplicationType<T>>> getAllResourceEnvRef();

   /**
    * Removes all <code>resource-env-ref</code> elements 
    * @return the current instance of <code>ResourceEnvRefType<ApplicationType<T>></code> 
    */
   public ApplicationType<T> removeAllResourceEnvRef();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationType ElementName: javaee:message-destination-refType ElementType : message-destination-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>message-destination-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>message-destination-ref</code> element will be returned.
    * @return the instance defined for the element <code>message-destination-ref</code> 
    */
   public MessageDestinationRefType<ApplicationType<T>> getOrCreateMessageDestinationRef();

   /**
    * Creates a new <code>message-destination-ref</code> element 
    * @return the new created instance of <code>MessageDestinationRefType<ApplicationType<T>></code> 
    */
   public MessageDestinationRefType<ApplicationType<T>> createMessageDestinationRef();

   /**
    * Returns all <code>message-destination-ref</code> elements
    * @return list of <code>message-destination-ref</code> 
    */
   public List<MessageDestinationRefType<ApplicationType<T>>> getAllMessageDestinationRef();

   /**
    * Removes all <code>message-destination-ref</code> elements 
    * @return the current instance of <code>MessageDestinationRefType<ApplicationType<T>></code> 
    */
   public ApplicationType<T> removeAllMessageDestinationRef();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationType ElementName: javaee:persistence-context-refType ElementType : persistence-context-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>persistence-context-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>persistence-context-ref</code> element will be returned.
    * @return the instance defined for the element <code>persistence-context-ref</code> 
    */
   public PersistenceContextRefType<ApplicationType<T>> getOrCreatePersistenceContextRef();

   /**
    * Creates a new <code>persistence-context-ref</code> element 
    * @return the new created instance of <code>PersistenceContextRefType<ApplicationType<T>></code> 
    */
   public PersistenceContextRefType<ApplicationType<T>> createPersistenceContextRef();

   /**
    * Returns all <code>persistence-context-ref</code> elements
    * @return list of <code>persistence-context-ref</code> 
    */
   public List<PersistenceContextRefType<ApplicationType<T>>> getAllPersistenceContextRef();

   /**
    * Removes all <code>persistence-context-ref</code> elements 
    * @return the current instance of <code>PersistenceContextRefType<ApplicationType<T>></code> 
    */
   public ApplicationType<T> removeAllPersistenceContextRef();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationType ElementName: javaee:persistence-unit-refType ElementType : persistence-unit-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>persistence-unit-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>persistence-unit-ref</code> element will be returned.
    * @return the instance defined for the element <code>persistence-unit-ref</code> 
    */
   public PersistenceUnitRefType<ApplicationType<T>> getOrCreatePersistenceUnitRef();

   /**
    * Creates a new <code>persistence-unit-ref</code> element 
    * @return the new created instance of <code>PersistenceUnitRefType<ApplicationType<T>></code> 
    */
   public PersistenceUnitRefType<ApplicationType<T>> createPersistenceUnitRef();

   /**
    * Returns all <code>persistence-unit-ref</code> elements
    * @return list of <code>persistence-unit-ref</code> 
    */
   public List<PersistenceUnitRefType<ApplicationType<T>>> getAllPersistenceUnitRef();

   /**
    * Removes all <code>persistence-unit-ref</code> elements 
    * @return the current instance of <code>PersistenceUnitRefType<ApplicationType<T>></code> 
    */
   public ApplicationType<T> removeAllPersistenceUnitRef();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationType ElementName: javaee:message-destinationType ElementType : message-destination
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>message-destination</code> element will be created and returned.
    * Otherwise, the first existing <code>message-destination</code> element will be returned.
    * @return the instance defined for the element <code>message-destination</code> 
    */
   public MessageDestinationType<ApplicationType<T>> getOrCreateMessageDestination();

   /**
    * Creates a new <code>message-destination</code> element 
    * @return the new created instance of <code>MessageDestinationType<ApplicationType<T>></code> 
    */
   public MessageDestinationType<ApplicationType<T>> createMessageDestination();

   /**
    * Returns all <code>message-destination</code> elements
    * @return list of <code>message-destination</code> 
    */
   public List<MessageDestinationType<ApplicationType<T>>> getAllMessageDestination();

   /**
    * Removes all <code>message-destination</code> elements 
    * @return the current instance of <code>MessageDestinationType<ApplicationType<T>></code> 
    */
   public ApplicationType<T> removeAllMessageDestination();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationType ElementName: javaee:data-sourceType ElementType : data-source
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>data-source</code> element will be created and returned.
    * Otherwise, the first existing <code>data-source</code> element will be returned.
    * @return the instance defined for the element <code>data-source</code> 
    */
   public DataSourceType<ApplicationType<T>> getOrCreateDataSource();

   /**
    * Creates a new <code>data-source</code> element 
    * @return the new created instance of <code>DataSourceType<ApplicationType<T>></code> 
    */
   public DataSourceType<ApplicationType<T>> createDataSource();

   /**
    * Returns all <code>data-source</code> elements
    * @return list of <code>data-source</code> 
    */
   public List<DataSourceType<ApplicationType<T>>> getAllDataSource();

   /**
    * Removes all <code>data-source</code> elements 
    * @return the current instance of <code>DataSourceType<ApplicationType<T>></code> 
    */
   public ApplicationType<T> removeAllDataSource();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationType ElementName: javaee:jms-connection-factoryType ElementType : jms-connection-factory
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>jms-connection-factory</code> element will be created and returned.
    * Otherwise, the first existing <code>jms-connection-factory</code> element will be returned.
    * @return the instance defined for the element <code>jms-connection-factory</code> 
    */
   public JmsConnectionFactoryType<ApplicationType<T>> getOrCreateJmsConnectionFactory();

   /**
    * Creates a new <code>jms-connection-factory</code> element 
    * @return the new created instance of <code>JmsConnectionFactoryType<ApplicationType<T>></code> 
    */
   public JmsConnectionFactoryType<ApplicationType<T>> createJmsConnectionFactory();

   /**
    * Returns all <code>jms-connection-factory</code> elements
    * @return list of <code>jms-connection-factory</code> 
    */
   public List<JmsConnectionFactoryType<ApplicationType<T>>> getAllJmsConnectionFactory();

   /**
    * Removes all <code>jms-connection-factory</code> elements 
    * @return the current instance of <code>JmsConnectionFactoryType<ApplicationType<T>></code> 
    */
   public ApplicationType<T> removeAllJmsConnectionFactory();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationType ElementName: javaee:jms-destinationType ElementType : jms-destination
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>jms-destination</code> element will be created and returned.
    * Otherwise, the first existing <code>jms-destination</code> element will be returned.
    * @return the instance defined for the element <code>jms-destination</code> 
    */
   public JmsDestinationType<ApplicationType<T>> getOrCreateJmsDestination();

   /**
    * Creates a new <code>jms-destination</code> element 
    * @return the new created instance of <code>JmsDestinationType<ApplicationType<T>></code> 
    */
   public JmsDestinationType<ApplicationType<T>> createJmsDestination();

   /**
    * Returns all <code>jms-destination</code> elements
    * @return list of <code>jms-destination</code> 
    */
   public List<JmsDestinationType<ApplicationType<T>>> getAllJmsDestination();

   /**
    * Removes all <code>jms-destination</code> elements 
    * @return the current instance of <code>JmsDestinationType<ApplicationType<T>></code> 
    */
   public ApplicationType<T> removeAllJmsDestination();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationType ElementName: javaee:mail-sessionType ElementType : mail-session
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>mail-session</code> element will be created and returned.
    * Otherwise, the first existing <code>mail-session</code> element will be returned.
    * @return the instance defined for the element <code>mail-session</code> 
    */
   public MailSessionType<ApplicationType<T>> getOrCreateMailSession();

   /**
    * Creates a new <code>mail-session</code> element 
    * @return the new created instance of <code>MailSessionType<ApplicationType<T>></code> 
    */
   public MailSessionType<ApplicationType<T>> createMailSession();

   /**
    * Returns all <code>mail-session</code> elements
    * @return list of <code>mail-session</code> 
    */
   public List<MailSessionType<ApplicationType<T>>> getAllMailSession();

   /**
    * Removes all <code>mail-session</code> elements 
    * @return the current instance of <code>MailSessionType<ApplicationType<T>></code> 
    */
   public ApplicationType<T> removeAllMailSession();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationType ElementName: javaee:connection-factory-resourceType ElementType : connection-factory
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>connection-factory</code> element will be created and returned.
    * Otherwise, the first existing <code>connection-factory</code> element will be returned.
    * @return the instance defined for the element <code>connection-factory</code> 
    */
   public ConnectionFactoryResourceType<ApplicationType<T>> getOrCreateConnectionFactory();

   /**
    * Creates a new <code>connection-factory</code> element 
    * @return the new created instance of <code>ConnectionFactoryResourceType<ApplicationType<T>></code> 
    */
   public ConnectionFactoryResourceType<ApplicationType<T>> createConnectionFactory();

   /**
    * Returns all <code>connection-factory</code> elements
    * @return list of <code>connection-factory</code> 
    */
   public List<ConnectionFactoryResourceType<ApplicationType<T>>> getAllConnectionFactory();

   /**
    * Removes all <code>connection-factory</code> elements 
    * @return the current instance of <code>ConnectionFactoryResourceType<ApplicationType<T>></code> 
    */
   public ApplicationType<T> removeAllConnectionFactory();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationType ElementName: javaee:administered-objectType ElementType : administered-object
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>administered-object</code> element will be created and returned.
    * Otherwise, the first existing <code>administered-object</code> element will be returned.
    * @return the instance defined for the element <code>administered-object</code> 
    */
   public AdministeredObjectType<ApplicationType<T>> getOrCreateAdministeredObject();

   /**
    * Creates a new <code>administered-object</code> element 
    * @return the new created instance of <code>AdministeredObjectType<ApplicationType<T>></code> 
    */
   public AdministeredObjectType<ApplicationType<T>> createAdministeredObject();

   /**
    * Returns all <code>administered-object</code> elements
    * @return list of <code>administered-object</code> 
    */
   public List<AdministeredObjectType<ApplicationType<T>>> getAllAdministeredObject();

   /**
    * Removes all <code>administered-object</code> elements 
    * @return the current instance of <code>AdministeredObjectType<ApplicationType<T>></code> 
    */
   public ApplicationType<T> removeAllAdministeredObject();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationType ElementName: xsd:token ElementType : version
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   public static final String VERSION = "7";

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of <code>ApplicationType<T></code> 
    */
   public ApplicationType<T> version(String version);

   /**
    * Returns the <code>version</code> attribute
    * @return the value defined for the attribute <code>version</code> 
    */
   public String getVersion();

   /**
    * Removes the <code>version</code> attribute 
    * @return the current instance of <code>ApplicationType<T></code> 
    */
   public ApplicationType<T> removeVersion();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>ApplicationType<T></code> 
    */
   public ApplicationType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>ApplicationType<T></code> 
    */
   public ApplicationType<T> removeId();
}
