package org.jboss.shrinkwrap.descriptor.api.ejbjar31; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.DataSourceType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EjbLocalRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EjbRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EnvEntryType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.LifecycleCallbackType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.MessageDestinationRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.PersistenceContextRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.PersistenceUnitRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ResourceEnvRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ResourceRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.SecurityRoleRefType;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient13.ServiceRefType;
/**
 * This interface defines the contract for the <code> entity-beanType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface EntityBeanType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityBeanType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>EntityBeanType<T></code> 
    */
   public EntityBeanType<T> description(String ... values);

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>EntityBeanType<T></code> 
    */
   public EntityBeanType<T> removeAllDescription();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityBeanType ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>EntityBeanType<T></code> 
    */
   public EntityBeanType<T> displayName(String ... values);

   /**
    * Returns all <code>display-name</code> elements
    * @return list of <code>display-name</code> 
    */
   public List<String> getAllDisplayName();

   /**
    * Removes the <code>display-name</code> element 
    * @return the current instance of <code>EntityBeanType<T></code> 
    */
   public EntityBeanType<T> removeAllDisplayName();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityBeanType ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<EntityBeanType<T>> getOrCreateIcon();

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<EntityBeanType<T>></code> 
    */
   public IconType<EntityBeanType<T>> createIcon();

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<EntityBeanType<T>>> getAllIcon();

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<EntityBeanType<T>></code> 
    */
   public EntityBeanType<T> removeAllIcon();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityBeanType ElementName: javaee:env-entryType ElementType : env-entry
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>env-entry</code> element will be created and returned.
    * Otherwise, the first existing <code>env-entry</code> element will be returned.
    * @return the instance defined for the element <code>env-entry</code> 
    */
   public EnvEntryType<EntityBeanType<T>> getOrCreateEnvEntry();

   /**
    * Creates a new <code>env-entry</code> element 
    * @return the new created instance of <code>EnvEntryType<EntityBeanType<T>></code> 
    */
   public EnvEntryType<EntityBeanType<T>> createEnvEntry();

   /**
    * Returns all <code>env-entry</code> elements
    * @return list of <code>env-entry</code> 
    */
   public List<EnvEntryType<EntityBeanType<T>>> getAllEnvEntry();

   /**
    * Removes all <code>env-entry</code> elements 
    * @return the current instance of <code>EnvEntryType<EntityBeanType<T>></code> 
    */
   public EntityBeanType<T> removeAllEnvEntry();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityBeanType ElementName: javaee:ejb-refType ElementType : ejb-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>ejb-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>ejb-ref</code> element will be returned.
    * @return the instance defined for the element <code>ejb-ref</code> 
    */
   public EjbRefType<EntityBeanType<T>> getOrCreateEjbRef();

   /**
    * Creates a new <code>ejb-ref</code> element 
    * @return the new created instance of <code>EjbRefType<EntityBeanType<T>></code> 
    */
   public EjbRefType<EntityBeanType<T>> createEjbRef();

   /**
    * Returns all <code>ejb-ref</code> elements
    * @return list of <code>ejb-ref</code> 
    */
   public List<EjbRefType<EntityBeanType<T>>> getAllEjbRef();

   /**
    * Removes all <code>ejb-ref</code> elements 
    * @return the current instance of <code>EjbRefType<EntityBeanType<T>></code> 
    */
   public EntityBeanType<T> removeAllEjbRef();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityBeanType ElementName: javaee:ejb-local-refType ElementType : ejb-local-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>ejb-local-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>ejb-local-ref</code> element will be returned.
    * @return the instance defined for the element <code>ejb-local-ref</code> 
    */
   public EjbLocalRefType<EntityBeanType<T>> getOrCreateEjbLocalRef();

   /**
    * Creates a new <code>ejb-local-ref</code> element 
    * @return the new created instance of <code>EjbLocalRefType<EntityBeanType<T>></code> 
    */
   public EjbLocalRefType<EntityBeanType<T>> createEjbLocalRef();

   /**
    * Returns all <code>ejb-local-ref</code> elements
    * @return list of <code>ejb-local-ref</code> 
    */
   public List<EjbLocalRefType<EntityBeanType<T>>> getAllEjbLocalRef();

   /**
    * Removes all <code>ejb-local-ref</code> elements 
    * @return the current instance of <code>EjbLocalRefType<EntityBeanType<T>></code> 
    */
   public EntityBeanType<T> removeAllEjbLocalRef();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityBeanType ElementName: javaee:resource-refType ElementType : resource-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>resource-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>resource-ref</code> element will be returned.
    * @return the instance defined for the element <code>resource-ref</code> 
    */
   public ResourceRefType<EntityBeanType<T>> getOrCreateResourceRef();

   /**
    * Creates a new <code>resource-ref</code> element 
    * @return the new created instance of <code>ResourceRefType<EntityBeanType<T>></code> 
    */
   public ResourceRefType<EntityBeanType<T>> createResourceRef();

   /**
    * Returns all <code>resource-ref</code> elements
    * @return list of <code>resource-ref</code> 
    */
   public List<ResourceRefType<EntityBeanType<T>>> getAllResourceRef();

   /**
    * Removes all <code>resource-ref</code> elements 
    * @return the current instance of <code>ResourceRefType<EntityBeanType<T>></code> 
    */
   public EntityBeanType<T> removeAllResourceRef();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityBeanType ElementName: javaee:resource-env-refType ElementType : resource-env-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>resource-env-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>resource-env-ref</code> element will be returned.
    * @return the instance defined for the element <code>resource-env-ref</code> 
    */
   public ResourceEnvRefType<EntityBeanType<T>> getOrCreateResourceEnvRef();

   /**
    * Creates a new <code>resource-env-ref</code> element 
    * @return the new created instance of <code>ResourceEnvRefType<EntityBeanType<T>></code> 
    */
   public ResourceEnvRefType<EntityBeanType<T>> createResourceEnvRef();

   /**
    * Returns all <code>resource-env-ref</code> elements
    * @return list of <code>resource-env-ref</code> 
    */
   public List<ResourceEnvRefType<EntityBeanType<T>>> getAllResourceEnvRef();

   /**
    * Removes all <code>resource-env-ref</code> elements 
    * @return the current instance of <code>ResourceEnvRefType<EntityBeanType<T>></code> 
    */
   public EntityBeanType<T> removeAllResourceEnvRef();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityBeanType ElementName: javaee:message-destination-refType ElementType : message-destination-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>message-destination-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>message-destination-ref</code> element will be returned.
    * @return the instance defined for the element <code>message-destination-ref</code> 
    */
   public MessageDestinationRefType<EntityBeanType<T>> getOrCreateMessageDestinationRef();

   /**
    * Creates a new <code>message-destination-ref</code> element 
    * @return the new created instance of <code>MessageDestinationRefType<EntityBeanType<T>></code> 
    */
   public MessageDestinationRefType<EntityBeanType<T>> createMessageDestinationRef();

   /**
    * Returns all <code>message-destination-ref</code> elements
    * @return list of <code>message-destination-ref</code> 
    */
   public List<MessageDestinationRefType<EntityBeanType<T>>> getAllMessageDestinationRef();

   /**
    * Removes all <code>message-destination-ref</code> elements 
    * @return the current instance of <code>MessageDestinationRefType<EntityBeanType<T>></code> 
    */
   public EntityBeanType<T> removeAllMessageDestinationRef();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityBeanType ElementName: javaee:persistence-context-refType ElementType : persistence-context-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>persistence-context-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>persistence-context-ref</code> element will be returned.
    * @return the instance defined for the element <code>persistence-context-ref</code> 
    */
   public PersistenceContextRefType<EntityBeanType<T>> getOrCreatePersistenceContextRef();

   /**
    * Creates a new <code>persistence-context-ref</code> element 
    * @return the new created instance of <code>PersistenceContextRefType<EntityBeanType<T>></code> 
    */
   public PersistenceContextRefType<EntityBeanType<T>> createPersistenceContextRef();

   /**
    * Returns all <code>persistence-context-ref</code> elements
    * @return list of <code>persistence-context-ref</code> 
    */
   public List<PersistenceContextRefType<EntityBeanType<T>>> getAllPersistenceContextRef();

   /**
    * Removes all <code>persistence-context-ref</code> elements 
    * @return the current instance of <code>PersistenceContextRefType<EntityBeanType<T>></code> 
    */
   public EntityBeanType<T> removeAllPersistenceContextRef();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityBeanType ElementName: javaee:persistence-unit-refType ElementType : persistence-unit-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>persistence-unit-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>persistence-unit-ref</code> element will be returned.
    * @return the instance defined for the element <code>persistence-unit-ref</code> 
    */
   public PersistenceUnitRefType<EntityBeanType<T>> getOrCreatePersistenceUnitRef();

   /**
    * Creates a new <code>persistence-unit-ref</code> element 
    * @return the new created instance of <code>PersistenceUnitRefType<EntityBeanType<T>></code> 
    */
   public PersistenceUnitRefType<EntityBeanType<T>> createPersistenceUnitRef();

   /**
    * Returns all <code>persistence-unit-ref</code> elements
    * @return list of <code>persistence-unit-ref</code> 
    */
   public List<PersistenceUnitRefType<EntityBeanType<T>>> getAllPersistenceUnitRef();

   /**
    * Removes all <code>persistence-unit-ref</code> elements 
    * @return the current instance of <code>PersistenceUnitRefType<EntityBeanType<T>></code> 
    */
   public EntityBeanType<T> removeAllPersistenceUnitRef();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityBeanType ElementName: javaee:lifecycle-callbackType ElementType : post-construct
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>post-construct</code> element will be created and returned.
    * Otherwise, the first existing <code>post-construct</code> element will be returned.
    * @return the instance defined for the element <code>post-construct</code> 
    */
   public LifecycleCallbackType<EntityBeanType<T>> getOrCreatePostConstruct();

   /**
    * Creates a new <code>post-construct</code> element 
    * @return the new created instance of <code>LifecycleCallbackType<EntityBeanType<T>></code> 
    */
   public LifecycleCallbackType<EntityBeanType<T>> createPostConstruct();

   /**
    * Returns all <code>post-construct</code> elements
    * @return list of <code>post-construct</code> 
    */
   public List<LifecycleCallbackType<EntityBeanType<T>>> getAllPostConstruct();

   /**
    * Removes all <code>post-construct</code> elements 
    * @return the current instance of <code>LifecycleCallbackType<EntityBeanType<T>></code> 
    */
   public EntityBeanType<T> removeAllPostConstruct();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityBeanType ElementName: javaee:lifecycle-callbackType ElementType : pre-destroy
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>pre-destroy</code> element will be created and returned.
    * Otherwise, the first existing <code>pre-destroy</code> element will be returned.
    * @return the instance defined for the element <code>pre-destroy</code> 
    */
   public LifecycleCallbackType<EntityBeanType<T>> getOrCreatePreDestroy();

   /**
    * Creates a new <code>pre-destroy</code> element 
    * @return the new created instance of <code>LifecycleCallbackType<EntityBeanType<T>></code> 
    */
   public LifecycleCallbackType<EntityBeanType<T>> createPreDestroy();

   /**
    * Returns all <code>pre-destroy</code> elements
    * @return list of <code>pre-destroy</code> 
    */
   public List<LifecycleCallbackType<EntityBeanType<T>>> getAllPreDestroy();

   /**
    * Removes all <code>pre-destroy</code> elements 
    * @return the current instance of <code>LifecycleCallbackType<EntityBeanType<T>></code> 
    */
   public EntityBeanType<T> removeAllPreDestroy();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityBeanType ElementName: javaee:data-sourceType ElementType : data-source
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>data-source</code> element will be created and returned.
    * Otherwise, the first existing <code>data-source</code> element will be returned.
    * @return the instance defined for the element <code>data-source</code> 
    */
   public DataSourceType<EntityBeanType<T>> getOrCreateDataSource();

   /**
    * Creates a new <code>data-source</code> element 
    * @return the new created instance of <code>DataSourceType<EntityBeanType<T>></code> 
    */
   public DataSourceType<EntityBeanType<T>> createDataSource();

   /**
    * Returns all <code>data-source</code> elements
    * @return list of <code>data-source</code> 
    */
   public List<DataSourceType<EntityBeanType<T>>> getAllDataSource();

   /**
    * Removes all <code>data-source</code> elements 
    * @return the current instance of <code>DataSourceType<EntityBeanType<T>></code> 
    */
   public EntityBeanType<T> removeAllDataSource();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityBeanType ElementName: javaee:service-refType ElementType : service-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>service-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>service-ref</code> element will be returned.
    * @return the instance defined for the element <code>service-ref</code> 
    */
   public ServiceRefType<EntityBeanType<T>> getOrCreateServiceRef();

   /**
    * Creates a new <code>service-ref</code> element 
    * @return the new created instance of <code>ServiceRefType<EntityBeanType<T>></code> 
    */
   public ServiceRefType<EntityBeanType<T>> createServiceRef();

   /**
    * Returns all <code>service-ref</code> elements
    * @return list of <code>service-ref</code> 
    */
   public List<ServiceRefType<EntityBeanType<T>>> getAllServiceRef();

   /**
    * Removes all <code>service-ref</code> elements 
    * @return the current instance of <code>ServiceRefType<EntityBeanType<T>></code> 
    */
   public EntityBeanType<T> removeAllServiceRef();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityBeanType ElementName: javaee:xsdNMTOKENType ElementType : ejb-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>ejb-name</code> element
    * @param ejbName the value for the element <code>ejb-name</code> 
    * @return the current instance of <code>EntityBeanType<T></code> 
    */
   public EntityBeanType<T> ejbName(String ejbName);

   /**
    * Returns the <code>ejb-name</code> element
    * @return the node defined for the element <code>ejb-name</code> 
    */
   public String getEjbName();

   /**
    * Removes the <code>ejb-name</code> element 
    * @return the current instance of <code>EntityBeanType<T></code> 
    */
   public EntityBeanType<T> removeEjbName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityBeanType ElementName: xsd:string ElementType : mapped-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>mapped-name</code> element
    * @param mappedName the value for the element <code>mapped-name</code> 
    * @return the current instance of <code>EntityBeanType<T></code> 
    */
   public EntityBeanType<T> mappedName(String mappedName);

   /**
    * Returns the <code>mapped-name</code> element
    * @return the node defined for the element <code>mapped-name</code> 
    */
   public String getMappedName();

   /**
    * Removes the <code>mapped-name</code> element 
    * @return the current instance of <code>EntityBeanType<T></code> 
    */
   public EntityBeanType<T> removeMappedName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityBeanType ElementName: javaee:fully-qualified-classType ElementType : home
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>home</code> element
    * @param home the value for the element <code>home</code> 
    * @return the current instance of <code>EntityBeanType<T></code> 
    */
   public EntityBeanType<T> home(String home);

   /**
    * Returns the <code>home</code> element
    * @return the node defined for the element <code>home</code> 
    */
   public String getHome();

   /**
    * Removes the <code>home</code> element 
    * @return the current instance of <code>EntityBeanType<T></code> 
    */
   public EntityBeanType<T> removeHome();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityBeanType ElementName: javaee:fully-qualified-classType ElementType : remote
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>remote</code> element
    * @param remote the value for the element <code>remote</code> 
    * @return the current instance of <code>EntityBeanType<T></code> 
    */
   public EntityBeanType<T> remote(String remote);

   /**
    * Returns the <code>remote</code> element
    * @return the node defined for the element <code>remote</code> 
    */
   public String getRemote();

   /**
    * Removes the <code>remote</code> element 
    * @return the current instance of <code>EntityBeanType<T></code> 
    */
   public EntityBeanType<T> removeRemote();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityBeanType ElementName: javaee:fully-qualified-classType ElementType : local-home
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>local-home</code> element
    * @param localHome the value for the element <code>local-home</code> 
    * @return the current instance of <code>EntityBeanType<T></code> 
    */
   public EntityBeanType<T> localHome(String localHome);

   /**
    * Returns the <code>local-home</code> element
    * @return the node defined for the element <code>local-home</code> 
    */
   public String getLocalHome();

   /**
    * Removes the <code>local-home</code> element 
    * @return the current instance of <code>EntityBeanType<T></code> 
    */
   public EntityBeanType<T> removeLocalHome();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityBeanType ElementName: javaee:fully-qualified-classType ElementType : local
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>local</code> element
    * @param local the value for the element <code>local</code> 
    * @return the current instance of <code>EntityBeanType<T></code> 
    */
   public EntityBeanType<T> local(String local);

   /**
    * Returns the <code>local</code> element
    * @return the node defined for the element <code>local</code> 
    */
   public String getLocal();

   /**
    * Removes the <code>local</code> element 
    * @return the current instance of <code>EntityBeanType<T></code> 
    */
   public EntityBeanType<T> removeLocal();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityBeanType ElementName: javaee:fully-qualified-classType ElementType : ejb-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>ejb-class</code> element
    * @param ejbClass the value for the element <code>ejb-class</code> 
    * @return the current instance of <code>EntityBeanType<T></code> 
    */
   public EntityBeanType<T> ejbClass(String ejbClass);

   /**
    * Returns the <code>ejb-class</code> element
    * @return the node defined for the element <code>ejb-class</code> 
    */
   public String getEjbClass();

   /**
    * Removes the <code>ejb-class</code> element 
    * @return the current instance of <code>EntityBeanType<T></code> 
    */
   public EntityBeanType<T> removeEjbClass();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityBeanType ElementName: javaee:persistence-typeType ElementType : persistence-type
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>persistence-type</code> element
    * @param persistenceType the value for the element <code>persistence-type</code> 
    * @return the current instance of <code>EntityBeanType<T></code> 
    */
   public EntityBeanType<T> persistenceType(PersistenceTypeType persistenceType);
   /**
    * Sets the <code>persistence-type</code> element
    * @param persistenceType the value for the element <code>persistence-type</code> 
    * @return the current instance of <code>EntityBeanType<T></code> 
    */
   public EntityBeanType<T> persistenceType(String persistenceType);

   /**
    * Returns the <code>persistence-type</code> element
    * @return the value found for the element <code>persistence-type</code> 
    */
   public PersistenceTypeType getPersistenceType();

   /**
    * Returns the <code>persistence-type</code> element
    * @return the value found for the element <code>persistence-type</code> 
    */
   public String  getPersistenceTypeAsString();

   /**
    * Removes the <code>persistence-type</code> attribute 
    * @return the current instance of <code>EntityBeanType<T></code> 
    */
   public EntityBeanType<T> removePersistenceType();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityBeanType ElementName: xsd:token ElementType : prim-key-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>prim-key-class</code> element
    * @param primKeyClass the value for the element <code>prim-key-class</code> 
    * @return the current instance of <code>EntityBeanType<T></code> 
    */
   public EntityBeanType<T> primKeyClass(String primKeyClass);

   /**
    * Returns the <code>prim-key-class</code> element
    * @return the node defined for the element <code>prim-key-class</code> 
    */
   public String getPrimKeyClass();

   /**
    * Removes the <code>prim-key-class</code> element 
    * @return the current instance of <code>EntityBeanType<T></code> 
    */
   public EntityBeanType<T> removePrimKeyClass();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityBeanType ElementName: javaee:xsdBooleanType ElementType : reentrant
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>reentrant</code> element
    * @param reentrant the value for the element <code>reentrant</code> 
    * @return the current instance of <code>EntityBeanType<T></code> 
    */
   public EntityBeanType<T> reentrant(Boolean reentrant);

   /**
    * Returns the <code>reentrant</code> element
    * @return the node defined for the element <code>reentrant</code> 
    */
   public Boolean isReentrant();

   /**
    * Removes the <code>reentrant</code> element 
    * @return the current instance of <code>EntityBeanType<T></code> 
    */
   public EntityBeanType<T> removeReentrant();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityBeanType ElementName: javaee:cmp-versionType ElementType : cmp-version
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>cmp-version</code> element
    * @param cmpVersion the value for the element <code>cmp-version</code> 
    * @return the current instance of <code>EntityBeanType<T></code> 
    */
   public EntityBeanType<T> cmpVersion(CmpVersionType cmpVersion);
   /**
    * Sets the <code>cmp-version</code> element
    * @param cmpVersion the value for the element <code>cmp-version</code> 
    * @return the current instance of <code>EntityBeanType<T></code> 
    */
   public EntityBeanType<T> cmpVersion(String cmpVersion);

   /**
    * Returns the <code>cmp-version</code> element
    * @return the value found for the element <code>cmp-version</code> 
    */
   public CmpVersionType getCmpVersion();

   /**
    * Returns the <code>cmp-version</code> element
    * @return the value found for the element <code>cmp-version</code> 
    */
   public String  getCmpVersionAsString();

   /**
    * Removes the <code>cmp-version</code> attribute 
    * @return the current instance of <code>EntityBeanType<T></code> 
    */
   public EntityBeanType<T> removeCmpVersion();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityBeanType ElementName: xsd:token ElementType : abstract-schema-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>abstract-schema-name</code> element
    * @param abstractSchemaName the value for the element <code>abstract-schema-name</code> 
    * @return the current instance of <code>EntityBeanType<T></code> 
    */
   public EntityBeanType<T> abstractSchemaName(String abstractSchemaName);

   /**
    * Returns the <code>abstract-schema-name</code> element
    * @return the node defined for the element <code>abstract-schema-name</code> 
    */
   public String getAbstractSchemaName();

   /**
    * Removes the <code>abstract-schema-name</code> element 
    * @return the current instance of <code>EntityBeanType<T></code> 
    */
   public EntityBeanType<T> removeAbstractSchemaName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityBeanType ElementName: javaee:cmp-fieldType ElementType : cmp-field
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>cmp-field</code> element will be created and returned.
    * Otherwise, the first existing <code>cmp-field</code> element will be returned.
    * @return the instance defined for the element <code>cmp-field</code> 
    */
   public CmpFieldType<EntityBeanType<T>> getOrCreateCmpField();

   /**
    * Creates a new <code>cmp-field</code> element 
    * @return the new created instance of <code>CmpFieldType<EntityBeanType<T>></code> 
    */
   public CmpFieldType<EntityBeanType<T>> createCmpField();

   /**
    * Returns all <code>cmp-field</code> elements
    * @return list of <code>cmp-field</code> 
    */
   public List<CmpFieldType<EntityBeanType<T>>> getAllCmpField();

   /**
    * Removes all <code>cmp-field</code> elements 
    * @return the current instance of <code>CmpFieldType<EntityBeanType<T>></code> 
    */
   public EntityBeanType<T> removeAllCmpField();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityBeanType ElementName: xsd:token ElementType : primkey-field
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>primkey-field</code> element
    * @param primkeyField the value for the element <code>primkey-field</code> 
    * @return the current instance of <code>EntityBeanType<T></code> 
    */
   public EntityBeanType<T> primkeyField(String primkeyField);

   /**
    * Returns the <code>primkey-field</code> element
    * @return the node defined for the element <code>primkey-field</code> 
    */
   public String getPrimkeyField();

   /**
    * Removes the <code>primkey-field</code> element 
    * @return the current instance of <code>EntityBeanType<T></code> 
    */
   public EntityBeanType<T> removePrimkeyField();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityBeanType ElementName: javaee:security-role-refType ElementType : security-role-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>security-role-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>security-role-ref</code> element will be returned.
    * @return the instance defined for the element <code>security-role-ref</code> 
    */
   public SecurityRoleRefType<EntityBeanType<T>> getOrCreateSecurityRoleRef();

   /**
    * Creates a new <code>security-role-ref</code> element 
    * @return the new created instance of <code>SecurityRoleRefType<EntityBeanType<T>></code> 
    */
   public SecurityRoleRefType<EntityBeanType<T>> createSecurityRoleRef();

   /**
    * Returns all <code>security-role-ref</code> elements
    * @return list of <code>security-role-ref</code> 
    */
   public List<SecurityRoleRefType<EntityBeanType<T>>> getAllSecurityRoleRef();

   /**
    * Removes all <code>security-role-ref</code> elements 
    * @return the current instance of <code>SecurityRoleRefType<EntityBeanType<T>></code> 
    */
   public EntityBeanType<T> removeAllSecurityRoleRef();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityBeanType ElementName: javaee:security-identityType ElementType : security-identity
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>security-identity</code> element with the given value will be created.
    * Otherwise, the existing <code>security-identity</code> element will be returned.
    * @return  a new or existing instance of <code>SecurityIdentityType<EntityBeanType<T>></code> 
    */
   public SecurityIdentityType<EntityBeanType<T>> getOrCreateSecurityIdentity();

   /**
    * Removes the <code>security-identity</code> element 
    * @return the current instance of <code>EntityBeanType<T></code> 
    */
   public EntityBeanType<T> removeSecurityIdentity();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityBeanType ElementName: javaee:queryType ElementType : query
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>query</code> element will be created and returned.
    * Otherwise, the first existing <code>query</code> element will be returned.
    * @return the instance defined for the element <code>query</code> 
    */
   public QueryType<EntityBeanType<T>> getOrCreateQuery();

   /**
    * Creates a new <code>query</code> element 
    * @return the new created instance of <code>QueryType<EntityBeanType<T>></code> 
    */
   public QueryType<EntityBeanType<T>> createQuery();

   /**
    * Returns all <code>query</code> elements
    * @return list of <code>query</code> 
    */
   public List<QueryType<EntityBeanType<T>>> getAllQuery();

   /**
    * Removes all <code>query</code> elements 
    * @return the current instance of <code>QueryType<EntityBeanType<T>></code> 
    */
   public EntityBeanType<T> removeAllQuery();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityBeanType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>EntityBeanType<T></code> 
    */
   public EntityBeanType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>EntityBeanType<T></code> 
    */
   public EntityBeanType<T> removeId();
}
