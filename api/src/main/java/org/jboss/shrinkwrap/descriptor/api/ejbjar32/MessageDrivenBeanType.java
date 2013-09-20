package org.jboss.shrinkwrap.descriptor.api.ejbjar32; 

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
import org.jboss.shrinkwrap.descriptor.api.javaee7.MailSessionType;
import org.jboss.shrinkwrap.descriptor.api.javaee7.MessageDestinationRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee7.PersistenceContextRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee7.PersistenceUnitRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee7.ResourceEnvRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee7.ResourceRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee7.SecurityRoleRefType;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient14.ServiceRefType;
/**
 * This interface defines the contract for the <code> message-driven-beanType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface MessageDrivenBeanType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageDrivenBeanType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>MessageDrivenBeanType<T></code> 
    */
   public MessageDrivenBeanType<T> description(String ... values);

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>MessageDrivenBeanType<T></code> 
    */
   public MessageDrivenBeanType<T> removeAllDescription();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageDrivenBeanType ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>MessageDrivenBeanType<T></code> 
    */
   public MessageDrivenBeanType<T> displayName(String ... values);

   /**
    * Returns all <code>display-name</code> elements
    * @return list of <code>display-name</code> 
    */
   public List<String> getAllDisplayName();

   /**
    * Removes the <code>display-name</code> element 
    * @return the current instance of <code>MessageDrivenBeanType<T></code> 
    */
   public MessageDrivenBeanType<T> removeAllDisplayName();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageDrivenBeanType ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<MessageDrivenBeanType<T>> getOrCreateIcon();

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<MessageDrivenBeanType<T>></code> 
    */
   public IconType<MessageDrivenBeanType<T>> createIcon();

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<MessageDrivenBeanType<T>>> getAllIcon();

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<MessageDrivenBeanType<T>></code> 
    */
   public MessageDrivenBeanType<T> removeAllIcon();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageDrivenBeanType ElementName: javaee:env-entryType ElementType : env-entry
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>env-entry</code> element will be created and returned.
    * Otherwise, the first existing <code>env-entry</code> element will be returned.
    * @return the instance defined for the element <code>env-entry</code> 
    */
   public EnvEntryType<MessageDrivenBeanType<T>> getOrCreateEnvEntry();

   /**
    * Creates a new <code>env-entry</code> element 
    * @return the new created instance of <code>EnvEntryType<MessageDrivenBeanType<T>></code> 
    */
   public EnvEntryType<MessageDrivenBeanType<T>> createEnvEntry();

   /**
    * Returns all <code>env-entry</code> elements
    * @return list of <code>env-entry</code> 
    */
   public List<EnvEntryType<MessageDrivenBeanType<T>>> getAllEnvEntry();

   /**
    * Removes all <code>env-entry</code> elements 
    * @return the current instance of <code>EnvEntryType<MessageDrivenBeanType<T>></code> 
    */
   public MessageDrivenBeanType<T> removeAllEnvEntry();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageDrivenBeanType ElementName: javaee:ejb-refType ElementType : ejb-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>ejb-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>ejb-ref</code> element will be returned.
    * @return the instance defined for the element <code>ejb-ref</code> 
    */
   public EjbRefType<MessageDrivenBeanType<T>> getOrCreateEjbRef();

   /**
    * Creates a new <code>ejb-ref</code> element 
    * @return the new created instance of <code>EjbRefType<MessageDrivenBeanType<T>></code> 
    */
   public EjbRefType<MessageDrivenBeanType<T>> createEjbRef();

   /**
    * Returns all <code>ejb-ref</code> elements
    * @return list of <code>ejb-ref</code> 
    */
   public List<EjbRefType<MessageDrivenBeanType<T>>> getAllEjbRef();

   /**
    * Removes all <code>ejb-ref</code> elements 
    * @return the current instance of <code>EjbRefType<MessageDrivenBeanType<T>></code> 
    */
   public MessageDrivenBeanType<T> removeAllEjbRef();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageDrivenBeanType ElementName: javaee:ejb-local-refType ElementType : ejb-local-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>ejb-local-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>ejb-local-ref</code> element will be returned.
    * @return the instance defined for the element <code>ejb-local-ref</code> 
    */
   public EjbLocalRefType<MessageDrivenBeanType<T>> getOrCreateEjbLocalRef();

   /**
    * Creates a new <code>ejb-local-ref</code> element 
    * @return the new created instance of <code>EjbLocalRefType<MessageDrivenBeanType<T>></code> 
    */
   public EjbLocalRefType<MessageDrivenBeanType<T>> createEjbLocalRef();

   /**
    * Returns all <code>ejb-local-ref</code> elements
    * @return list of <code>ejb-local-ref</code> 
    */
   public List<EjbLocalRefType<MessageDrivenBeanType<T>>> getAllEjbLocalRef();

   /**
    * Removes all <code>ejb-local-ref</code> elements 
    * @return the current instance of <code>EjbLocalRefType<MessageDrivenBeanType<T>></code> 
    */
   public MessageDrivenBeanType<T> removeAllEjbLocalRef();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageDrivenBeanType ElementName: javaee:resource-refType ElementType : resource-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>resource-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>resource-ref</code> element will be returned.
    * @return the instance defined for the element <code>resource-ref</code> 
    */
   public ResourceRefType<MessageDrivenBeanType<T>> getOrCreateResourceRef();

   /**
    * Creates a new <code>resource-ref</code> element 
    * @return the new created instance of <code>ResourceRefType<MessageDrivenBeanType<T>></code> 
    */
   public ResourceRefType<MessageDrivenBeanType<T>> createResourceRef();

   /**
    * Returns all <code>resource-ref</code> elements
    * @return list of <code>resource-ref</code> 
    */
   public List<ResourceRefType<MessageDrivenBeanType<T>>> getAllResourceRef();

   /**
    * Removes all <code>resource-ref</code> elements 
    * @return the current instance of <code>ResourceRefType<MessageDrivenBeanType<T>></code> 
    */
   public MessageDrivenBeanType<T> removeAllResourceRef();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageDrivenBeanType ElementName: javaee:resource-env-refType ElementType : resource-env-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>resource-env-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>resource-env-ref</code> element will be returned.
    * @return the instance defined for the element <code>resource-env-ref</code> 
    */
   public ResourceEnvRefType<MessageDrivenBeanType<T>> getOrCreateResourceEnvRef();

   /**
    * Creates a new <code>resource-env-ref</code> element 
    * @return the new created instance of <code>ResourceEnvRefType<MessageDrivenBeanType<T>></code> 
    */
   public ResourceEnvRefType<MessageDrivenBeanType<T>> createResourceEnvRef();

   /**
    * Returns all <code>resource-env-ref</code> elements
    * @return list of <code>resource-env-ref</code> 
    */
   public List<ResourceEnvRefType<MessageDrivenBeanType<T>>> getAllResourceEnvRef();

   /**
    * Removes all <code>resource-env-ref</code> elements 
    * @return the current instance of <code>ResourceEnvRefType<MessageDrivenBeanType<T>></code> 
    */
   public MessageDrivenBeanType<T> removeAllResourceEnvRef();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageDrivenBeanType ElementName: javaee:message-destination-refType ElementType : message-destination-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>message-destination-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>message-destination-ref</code> element will be returned.
    * @return the instance defined for the element <code>message-destination-ref</code> 
    */
   public MessageDestinationRefType<MessageDrivenBeanType<T>> getOrCreateMessageDestinationRef();

   /**
    * Creates a new <code>message-destination-ref</code> element 
    * @return the new created instance of <code>MessageDestinationRefType<MessageDrivenBeanType<T>></code> 
    */
   public MessageDestinationRefType<MessageDrivenBeanType<T>> createMessageDestinationRef();

   /**
    * Returns all <code>message-destination-ref</code> elements
    * @return list of <code>message-destination-ref</code> 
    */
   public List<MessageDestinationRefType<MessageDrivenBeanType<T>>> getAllMessageDestinationRef();

   /**
    * Removes all <code>message-destination-ref</code> elements 
    * @return the current instance of <code>MessageDestinationRefType<MessageDrivenBeanType<T>></code> 
    */
   public MessageDrivenBeanType<T> removeAllMessageDestinationRef();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageDrivenBeanType ElementName: javaee:persistence-context-refType ElementType : persistence-context-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>persistence-context-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>persistence-context-ref</code> element will be returned.
    * @return the instance defined for the element <code>persistence-context-ref</code> 
    */
   public PersistenceContextRefType<MessageDrivenBeanType<T>> getOrCreatePersistenceContextRef();

   /**
    * Creates a new <code>persistence-context-ref</code> element 
    * @return the new created instance of <code>PersistenceContextRefType<MessageDrivenBeanType<T>></code> 
    */
   public PersistenceContextRefType<MessageDrivenBeanType<T>> createPersistenceContextRef();

   /**
    * Returns all <code>persistence-context-ref</code> elements
    * @return list of <code>persistence-context-ref</code> 
    */
   public List<PersistenceContextRefType<MessageDrivenBeanType<T>>> getAllPersistenceContextRef();

   /**
    * Removes all <code>persistence-context-ref</code> elements 
    * @return the current instance of <code>PersistenceContextRefType<MessageDrivenBeanType<T>></code> 
    */
   public MessageDrivenBeanType<T> removeAllPersistenceContextRef();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageDrivenBeanType ElementName: javaee:persistence-unit-refType ElementType : persistence-unit-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>persistence-unit-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>persistence-unit-ref</code> element will be returned.
    * @return the instance defined for the element <code>persistence-unit-ref</code> 
    */
   public PersistenceUnitRefType<MessageDrivenBeanType<T>> getOrCreatePersistenceUnitRef();

   /**
    * Creates a new <code>persistence-unit-ref</code> element 
    * @return the new created instance of <code>PersistenceUnitRefType<MessageDrivenBeanType<T>></code> 
    */
   public PersistenceUnitRefType<MessageDrivenBeanType<T>> createPersistenceUnitRef();

   /**
    * Returns all <code>persistence-unit-ref</code> elements
    * @return list of <code>persistence-unit-ref</code> 
    */
   public List<PersistenceUnitRefType<MessageDrivenBeanType<T>>> getAllPersistenceUnitRef();

   /**
    * Removes all <code>persistence-unit-ref</code> elements 
    * @return the current instance of <code>PersistenceUnitRefType<MessageDrivenBeanType<T>></code> 
    */
   public MessageDrivenBeanType<T> removeAllPersistenceUnitRef();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageDrivenBeanType ElementName: javaee:lifecycle-callbackType ElementType : post-construct
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>post-construct</code> element will be created and returned.
    * Otherwise, the first existing <code>post-construct</code> element will be returned.
    * @return the instance defined for the element <code>post-construct</code> 
    */
   public LifecycleCallbackType<MessageDrivenBeanType<T>> getOrCreatePostConstruct();

   /**
    * Creates a new <code>post-construct</code> element 
    * @return the new created instance of <code>LifecycleCallbackType<MessageDrivenBeanType<T>></code> 
    */
   public LifecycleCallbackType<MessageDrivenBeanType<T>> createPostConstruct();

   /**
    * Returns all <code>post-construct</code> elements
    * @return list of <code>post-construct</code> 
    */
   public List<LifecycleCallbackType<MessageDrivenBeanType<T>>> getAllPostConstruct();

   /**
    * Removes all <code>post-construct</code> elements 
    * @return the current instance of <code>LifecycleCallbackType<MessageDrivenBeanType<T>></code> 
    */
   public MessageDrivenBeanType<T> removeAllPostConstruct();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageDrivenBeanType ElementName: javaee:lifecycle-callbackType ElementType : pre-destroy
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>pre-destroy</code> element will be created and returned.
    * Otherwise, the first existing <code>pre-destroy</code> element will be returned.
    * @return the instance defined for the element <code>pre-destroy</code> 
    */
   public LifecycleCallbackType<MessageDrivenBeanType<T>> getOrCreatePreDestroy();

   /**
    * Creates a new <code>pre-destroy</code> element 
    * @return the new created instance of <code>LifecycleCallbackType<MessageDrivenBeanType<T>></code> 
    */
   public LifecycleCallbackType<MessageDrivenBeanType<T>> createPreDestroy();

   /**
    * Returns all <code>pre-destroy</code> elements
    * @return list of <code>pre-destroy</code> 
    */
   public List<LifecycleCallbackType<MessageDrivenBeanType<T>>> getAllPreDestroy();

   /**
    * Removes all <code>pre-destroy</code> elements 
    * @return the current instance of <code>LifecycleCallbackType<MessageDrivenBeanType<T>></code> 
    */
   public MessageDrivenBeanType<T> removeAllPreDestroy();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageDrivenBeanType ElementName: javaee:data-sourceType ElementType : data-source
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>data-source</code> element will be created and returned.
    * Otherwise, the first existing <code>data-source</code> element will be returned.
    * @return the instance defined for the element <code>data-source</code> 
    */
   public DataSourceType<MessageDrivenBeanType<T>> getOrCreateDataSource();

   /**
    * Creates a new <code>data-source</code> element 
    * @return the new created instance of <code>DataSourceType<MessageDrivenBeanType<T>></code> 
    */
   public DataSourceType<MessageDrivenBeanType<T>> createDataSource();

   /**
    * Returns all <code>data-source</code> elements
    * @return list of <code>data-source</code> 
    */
   public List<DataSourceType<MessageDrivenBeanType<T>>> getAllDataSource();

   /**
    * Removes all <code>data-source</code> elements 
    * @return the current instance of <code>DataSourceType<MessageDrivenBeanType<T>></code> 
    */
   public MessageDrivenBeanType<T> removeAllDataSource();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageDrivenBeanType ElementName: javaee:jms-connection-factoryType ElementType : jms-connection-factory
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>jms-connection-factory</code> element will be created and returned.
    * Otherwise, the first existing <code>jms-connection-factory</code> element will be returned.
    * @return the instance defined for the element <code>jms-connection-factory</code> 
    */
   public JmsConnectionFactoryType<MessageDrivenBeanType<T>> getOrCreateJmsConnectionFactory();

   /**
    * Creates a new <code>jms-connection-factory</code> element 
    * @return the new created instance of <code>JmsConnectionFactoryType<MessageDrivenBeanType<T>></code> 
    */
   public JmsConnectionFactoryType<MessageDrivenBeanType<T>> createJmsConnectionFactory();

   /**
    * Returns all <code>jms-connection-factory</code> elements
    * @return list of <code>jms-connection-factory</code> 
    */
   public List<JmsConnectionFactoryType<MessageDrivenBeanType<T>>> getAllJmsConnectionFactory();

   /**
    * Removes all <code>jms-connection-factory</code> elements 
    * @return the current instance of <code>JmsConnectionFactoryType<MessageDrivenBeanType<T>></code> 
    */
   public MessageDrivenBeanType<T> removeAllJmsConnectionFactory();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageDrivenBeanType ElementName: javaee:jms-destinationType ElementType : jms-destination
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>jms-destination</code> element will be created and returned.
    * Otherwise, the first existing <code>jms-destination</code> element will be returned.
    * @return the instance defined for the element <code>jms-destination</code> 
    */
   public JmsDestinationType<MessageDrivenBeanType<T>> getOrCreateJmsDestination();

   /**
    * Creates a new <code>jms-destination</code> element 
    * @return the new created instance of <code>JmsDestinationType<MessageDrivenBeanType<T>></code> 
    */
   public JmsDestinationType<MessageDrivenBeanType<T>> createJmsDestination();

   /**
    * Returns all <code>jms-destination</code> elements
    * @return list of <code>jms-destination</code> 
    */
   public List<JmsDestinationType<MessageDrivenBeanType<T>>> getAllJmsDestination();

   /**
    * Removes all <code>jms-destination</code> elements 
    * @return the current instance of <code>JmsDestinationType<MessageDrivenBeanType<T>></code> 
    */
   public MessageDrivenBeanType<T> removeAllJmsDestination();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageDrivenBeanType ElementName: javaee:mail-sessionType ElementType : mail-session
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>mail-session</code> element will be created and returned.
    * Otherwise, the first existing <code>mail-session</code> element will be returned.
    * @return the instance defined for the element <code>mail-session</code> 
    */
   public MailSessionType<MessageDrivenBeanType<T>> getOrCreateMailSession();

   /**
    * Creates a new <code>mail-session</code> element 
    * @return the new created instance of <code>MailSessionType<MessageDrivenBeanType<T>></code> 
    */
   public MailSessionType<MessageDrivenBeanType<T>> createMailSession();

   /**
    * Returns all <code>mail-session</code> elements
    * @return list of <code>mail-session</code> 
    */
   public List<MailSessionType<MessageDrivenBeanType<T>>> getAllMailSession();

   /**
    * Removes all <code>mail-session</code> elements 
    * @return the current instance of <code>MailSessionType<MessageDrivenBeanType<T>></code> 
    */
   public MessageDrivenBeanType<T> removeAllMailSession();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageDrivenBeanType ElementName: javaee:connection-factory-resourceType ElementType : connection-factory
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>connection-factory</code> element will be created and returned.
    * Otherwise, the first existing <code>connection-factory</code> element will be returned.
    * @return the instance defined for the element <code>connection-factory</code> 
    */
   public ConnectionFactoryResourceType<MessageDrivenBeanType<T>> getOrCreateConnectionFactory();

   /**
    * Creates a new <code>connection-factory</code> element 
    * @return the new created instance of <code>ConnectionFactoryResourceType<MessageDrivenBeanType<T>></code> 
    */
   public ConnectionFactoryResourceType<MessageDrivenBeanType<T>> createConnectionFactory();

   /**
    * Returns all <code>connection-factory</code> elements
    * @return list of <code>connection-factory</code> 
    */
   public List<ConnectionFactoryResourceType<MessageDrivenBeanType<T>>> getAllConnectionFactory();

   /**
    * Removes all <code>connection-factory</code> elements 
    * @return the current instance of <code>ConnectionFactoryResourceType<MessageDrivenBeanType<T>></code> 
    */
   public MessageDrivenBeanType<T> removeAllConnectionFactory();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageDrivenBeanType ElementName: javaee:administered-objectType ElementType : administered-object
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>administered-object</code> element will be created and returned.
    * Otherwise, the first existing <code>administered-object</code> element will be returned.
    * @return the instance defined for the element <code>administered-object</code> 
    */
   public AdministeredObjectType<MessageDrivenBeanType<T>> getOrCreateAdministeredObject();

   /**
    * Creates a new <code>administered-object</code> element 
    * @return the new created instance of <code>AdministeredObjectType<MessageDrivenBeanType<T>></code> 
    */
   public AdministeredObjectType<MessageDrivenBeanType<T>> createAdministeredObject();

   /**
    * Returns all <code>administered-object</code> elements
    * @return list of <code>administered-object</code> 
    */
   public List<AdministeredObjectType<MessageDrivenBeanType<T>>> getAllAdministeredObject();

   /**
    * Removes all <code>administered-object</code> elements 
    * @return the current instance of <code>AdministeredObjectType<MessageDrivenBeanType<T>></code> 
    */
   public MessageDrivenBeanType<T> removeAllAdministeredObject();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageDrivenBeanType ElementName: javaee:service-refType ElementType : service-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>service-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>service-ref</code> element will be returned.
    * @return the instance defined for the element <code>service-ref</code> 
    */
   public ServiceRefType<MessageDrivenBeanType<T>> getOrCreateServiceRef();

   /**
    * Creates a new <code>service-ref</code> element 
    * @return the new created instance of <code>ServiceRefType<MessageDrivenBeanType<T>></code> 
    */
   public ServiceRefType<MessageDrivenBeanType<T>> createServiceRef();

   /**
    * Returns all <code>service-ref</code> elements
    * @return list of <code>service-ref</code> 
    */
   public List<ServiceRefType<MessageDrivenBeanType<T>>> getAllServiceRef();

   /**
    * Removes all <code>service-ref</code> elements 
    * @return the current instance of <code>ServiceRefType<MessageDrivenBeanType<T>></code> 
    */
   public MessageDrivenBeanType<T> removeAllServiceRef();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageDrivenBeanType ElementName: javaee:xsdNMTOKENType ElementType : ejb-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>ejb-name</code> element
    * @param ejbName the value for the element <code>ejb-name</code> 
    * @return the current instance of <code>MessageDrivenBeanType<T></code> 
    */
   public MessageDrivenBeanType<T> ejbName(String ejbName);

   /**
    * Returns the <code>ejb-name</code> element
    * @return the node defined for the element <code>ejb-name</code> 
    */
   public String getEjbName();

   /**
    * Removes the <code>ejb-name</code> element 
    * @return the current instance of <code>MessageDrivenBeanType<T></code> 
    */
   public MessageDrivenBeanType<T> removeEjbName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageDrivenBeanType ElementName: xsd:string ElementType : mapped-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>mapped-name</code> element
    * @param mappedName the value for the element <code>mapped-name</code> 
    * @return the current instance of <code>MessageDrivenBeanType<T></code> 
    */
   public MessageDrivenBeanType<T> mappedName(String mappedName);

   /**
    * Returns the <code>mapped-name</code> element
    * @return the node defined for the element <code>mapped-name</code> 
    */
   public String getMappedName();

   /**
    * Removes the <code>mapped-name</code> element 
    * @return the current instance of <code>MessageDrivenBeanType<T></code> 
    */
   public MessageDrivenBeanType<T> removeMappedName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageDrivenBeanType ElementName: javaee:fully-qualified-classType ElementType : ejb-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>ejb-class</code> element
    * @param ejbClass the value for the element <code>ejb-class</code> 
    * @return the current instance of <code>MessageDrivenBeanType<T></code> 
    */
   public MessageDrivenBeanType<T> ejbClass(String ejbClass);

   /**
    * Returns the <code>ejb-class</code> element
    * @return the node defined for the element <code>ejb-class</code> 
    */
   public String getEjbClass();

   /**
    * Removes the <code>ejb-class</code> element 
    * @return the current instance of <code>MessageDrivenBeanType<T></code> 
    */
   public MessageDrivenBeanType<T> removeEjbClass();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageDrivenBeanType ElementName: xsd:token ElementType : messaging-type
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>messaging-type</code> element
    * @param messagingType the value for the element <code>messaging-type</code> 
    * @return the current instance of <code>MessageDrivenBeanType<T></code> 
    */
   public MessageDrivenBeanType<T> messagingType(String messagingType);

   /**
    * Returns the <code>messaging-type</code> element
    * @return the node defined for the element <code>messaging-type</code> 
    */
   public String getMessagingType();

   /**
    * Removes the <code>messaging-type</code> element 
    * @return the current instance of <code>MessageDrivenBeanType<T></code> 
    */
   public MessageDrivenBeanType<T> removeMessagingType();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageDrivenBeanType ElementName: javaee:named-methodType ElementType : timeout-method
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>timeout-method</code> element with the given value will be created.
    * Otherwise, the existing <code>timeout-method</code> element will be returned.
    * @return  a new or existing instance of <code>NamedMethodType<MessageDrivenBeanType<T>></code> 
    */
   public NamedMethodType<MessageDrivenBeanType<T>> getOrCreateTimeoutMethod();

   /**
    * Removes the <code>timeout-method</code> element 
    * @return the current instance of <code>MessageDrivenBeanType<T></code> 
    */
   public MessageDrivenBeanType<T> removeTimeoutMethod();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageDrivenBeanType ElementName: javaee:timerType ElementType : timer
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>timer</code> element will be created and returned.
    * Otherwise, the first existing <code>timer</code> element will be returned.
    * @return the instance defined for the element <code>timer</code> 
    */
   public TimerType<MessageDrivenBeanType<T>> getOrCreateTimer();

   /**
    * Creates a new <code>timer</code> element 
    * @return the new created instance of <code>TimerType<MessageDrivenBeanType<T>></code> 
    */
   public TimerType<MessageDrivenBeanType<T>> createTimer();

   /**
    * Returns all <code>timer</code> elements
    * @return list of <code>timer</code> 
    */
   public List<TimerType<MessageDrivenBeanType<T>>> getAllTimer();

   /**
    * Removes all <code>timer</code> elements 
    * @return the current instance of <code>TimerType<MessageDrivenBeanType<T>></code> 
    */
   public MessageDrivenBeanType<T> removeAllTimer();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageDrivenBeanType ElementName: javaee:transaction-typeType ElementType : transaction-type
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>transaction-type</code> element
    * @param transactionType the value for the element <code>transaction-type</code> 
    * @return the current instance of <code>MessageDrivenBeanType<T></code> 
    */
   public MessageDrivenBeanType<T> transactionType(TransactionTypeType transactionType);
   /**
    * Sets the <code>transaction-type</code> element
    * @param transactionType the value for the element <code>transaction-type</code> 
    * @return the current instance of <code>MessageDrivenBeanType<T></code> 
    */
   public MessageDrivenBeanType<T> transactionType(String transactionType);

   /**
    * Returns the <code>transaction-type</code> element
    * @return the value found for the element <code>transaction-type</code> 
    */
   public TransactionTypeType getTransactionType();

   /**
    * Returns the <code>transaction-type</code> element
    * @return the value found for the element <code>transaction-type</code> 
    */
   public String  getTransactionTypeAsString();

   /**
    * Removes the <code>transaction-type</code> attribute 
    * @return the current instance of <code>MessageDrivenBeanType<T></code> 
    */
   public MessageDrivenBeanType<T> removeTransactionType();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageDrivenBeanType ElementName: javaee:fully-qualified-classType ElementType : message-destination-type
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>message-destination-type</code> element
    * @param messageDestinationType the value for the element <code>message-destination-type</code> 
    * @return the current instance of <code>MessageDrivenBeanType<T></code> 
    */
   public MessageDrivenBeanType<T> messageDestinationType(String messageDestinationType);

   /**
    * Returns the <code>message-destination-type</code> element
    * @return the node defined for the element <code>message-destination-type</code> 
    */
   public String getMessageDestinationType();

   /**
    * Removes the <code>message-destination-type</code> element 
    * @return the current instance of <code>MessageDrivenBeanType<T></code> 
    */
   public MessageDrivenBeanType<T> removeMessageDestinationType();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageDrivenBeanType ElementName: javaee:string ElementType : message-destination-link
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>message-destination-link</code> element
    * @param messageDestinationLink the value for the element <code>message-destination-link</code> 
    * @return the current instance of <code>MessageDrivenBeanType<T></code> 
    */
   public MessageDrivenBeanType<T> messageDestinationLink(String messageDestinationLink);

   /**
    * Returns the <code>message-destination-link</code> element
    * @return the node defined for the element <code>message-destination-link</code> 
    */
   public String getMessageDestinationLink();

   /**
    * Removes the <code>message-destination-link</code> element 
    * @return the current instance of <code>MessageDrivenBeanType<T></code> 
    */
   public MessageDrivenBeanType<T> removeMessageDestinationLink();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageDrivenBeanType ElementName: javaee:activation-configType ElementType : activation-config
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>activation-config</code> element with the given value will be created.
    * Otherwise, the existing <code>activation-config</code> element will be returned.
    * @return  a new or existing instance of <code>ActivationConfigType<MessageDrivenBeanType<T>></code> 
    */
   public ActivationConfigType<MessageDrivenBeanType<T>> getOrCreateActivationConfig();

   /**
    * Removes the <code>activation-config</code> element 
    * @return the current instance of <code>MessageDrivenBeanType<T></code> 
    */
   public MessageDrivenBeanType<T> removeActivationConfig();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageDrivenBeanType ElementName: javaee:around-invokeType ElementType : around-invoke
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>around-invoke</code> element will be created and returned.
    * Otherwise, the first existing <code>around-invoke</code> element will be returned.
    * @return the instance defined for the element <code>around-invoke</code> 
    */
   public AroundInvokeType<MessageDrivenBeanType<T>> getOrCreateAroundInvoke();

   /**
    * Creates a new <code>around-invoke</code> element 
    * @return the new created instance of <code>AroundInvokeType<MessageDrivenBeanType<T>></code> 
    */
   public AroundInvokeType<MessageDrivenBeanType<T>> createAroundInvoke();

   /**
    * Returns all <code>around-invoke</code> elements
    * @return list of <code>around-invoke</code> 
    */
   public List<AroundInvokeType<MessageDrivenBeanType<T>>> getAllAroundInvoke();

   /**
    * Removes all <code>around-invoke</code> elements 
    * @return the current instance of <code>AroundInvokeType<MessageDrivenBeanType<T>></code> 
    */
   public MessageDrivenBeanType<T> removeAllAroundInvoke();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageDrivenBeanType ElementName: javaee:around-timeoutType ElementType : around-timeout
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>around-timeout</code> element will be created and returned.
    * Otherwise, the first existing <code>around-timeout</code> element will be returned.
    * @return the instance defined for the element <code>around-timeout</code> 
    */
   public AroundTimeoutType<MessageDrivenBeanType<T>> getOrCreateAroundTimeout();

   /**
    * Creates a new <code>around-timeout</code> element 
    * @return the new created instance of <code>AroundTimeoutType<MessageDrivenBeanType<T>></code> 
    */
   public AroundTimeoutType<MessageDrivenBeanType<T>> createAroundTimeout();

   /**
    * Returns all <code>around-timeout</code> elements
    * @return list of <code>around-timeout</code> 
    */
   public List<AroundTimeoutType<MessageDrivenBeanType<T>>> getAllAroundTimeout();

   /**
    * Removes all <code>around-timeout</code> elements 
    * @return the current instance of <code>AroundTimeoutType<MessageDrivenBeanType<T>></code> 
    */
   public MessageDrivenBeanType<T> removeAllAroundTimeout();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageDrivenBeanType ElementName: javaee:security-role-refType ElementType : security-role-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>security-role-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>security-role-ref</code> element will be returned.
    * @return the instance defined for the element <code>security-role-ref</code> 
    */
   public SecurityRoleRefType<MessageDrivenBeanType<T>> getOrCreateSecurityRoleRef();

   /**
    * Creates a new <code>security-role-ref</code> element 
    * @return the new created instance of <code>SecurityRoleRefType<MessageDrivenBeanType<T>></code> 
    */
   public SecurityRoleRefType<MessageDrivenBeanType<T>> createSecurityRoleRef();

   /**
    * Returns all <code>security-role-ref</code> elements
    * @return list of <code>security-role-ref</code> 
    */
   public List<SecurityRoleRefType<MessageDrivenBeanType<T>>> getAllSecurityRoleRef();

   /**
    * Removes all <code>security-role-ref</code> elements 
    * @return the current instance of <code>SecurityRoleRefType<MessageDrivenBeanType<T>></code> 
    */
   public MessageDrivenBeanType<T> removeAllSecurityRoleRef();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageDrivenBeanType ElementName: javaee:security-identityType ElementType : security-identity
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>security-identity</code> element with the given value will be created.
    * Otherwise, the existing <code>security-identity</code> element will be returned.
    * @return  a new or existing instance of <code>SecurityIdentityType<MessageDrivenBeanType<T>></code> 
    */
   public SecurityIdentityType<MessageDrivenBeanType<T>> getOrCreateSecurityIdentity();

   /**
    * Removes the <code>security-identity</code> element 
    * @return the current instance of <code>MessageDrivenBeanType<T></code> 
    */
   public MessageDrivenBeanType<T> removeSecurityIdentity();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageDrivenBeanType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>MessageDrivenBeanType<T></code> 
    */
   public MessageDrivenBeanType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>MessageDrivenBeanType<T></code> 
    */
   public MessageDrivenBeanType<T> removeId();
}
