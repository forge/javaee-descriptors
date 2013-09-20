package org.jboss.shrinkwrap.descriptor.api.ejbjar30; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee5.EjbLocalRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.EjbRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.EnvEntryType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.LifecycleCallbackType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.MessageDestinationRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.PersistenceContextRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.PersistenceUnitRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.ResourceEnvRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.ResourceRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.SecurityRoleRefType;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient12.ServiceRefType;
/**
 * This interface defines the contract for the <code> session-beanType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface SessionBeanType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionBeanType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>SessionBeanType<T></code> 
    */
   public SessionBeanType<T> description(String ... values);

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>SessionBeanType<T></code> 
    */
   public SessionBeanType<T> removeAllDescription();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionBeanType ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>SessionBeanType<T></code> 
    */
   public SessionBeanType<T> displayName(String ... values);

   /**
    * Returns all <code>display-name</code> elements
    * @return list of <code>display-name</code> 
    */
   public List<String> getAllDisplayName();

   /**
    * Removes the <code>display-name</code> element 
    * @return the current instance of <code>SessionBeanType<T></code> 
    */
   public SessionBeanType<T> removeAllDisplayName();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionBeanType ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<SessionBeanType<T>> getOrCreateIcon();

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<SessionBeanType<T>></code> 
    */
   public IconType<SessionBeanType<T>> createIcon();

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<SessionBeanType<T>>> getAllIcon();

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<SessionBeanType<T>></code> 
    */
   public SessionBeanType<T> removeAllIcon();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionBeanType ElementName: javaee:env-entryType ElementType : env-entry
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>env-entry</code> element will be created and returned.
    * Otherwise, the first existing <code>env-entry</code> element will be returned.
    * @return the instance defined for the element <code>env-entry</code> 
    */
   public EnvEntryType<SessionBeanType<T>> getOrCreateEnvEntry();

   /**
    * Creates a new <code>env-entry</code> element 
    * @return the new created instance of <code>EnvEntryType<SessionBeanType<T>></code> 
    */
   public EnvEntryType<SessionBeanType<T>> createEnvEntry();

   /**
    * Returns all <code>env-entry</code> elements
    * @return list of <code>env-entry</code> 
    */
   public List<EnvEntryType<SessionBeanType<T>>> getAllEnvEntry();

   /**
    * Removes all <code>env-entry</code> elements 
    * @return the current instance of <code>EnvEntryType<SessionBeanType<T>></code> 
    */
   public SessionBeanType<T> removeAllEnvEntry();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionBeanType ElementName: javaee:ejb-refType ElementType : ejb-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>ejb-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>ejb-ref</code> element will be returned.
    * @return the instance defined for the element <code>ejb-ref</code> 
    */
   public EjbRefType<SessionBeanType<T>> getOrCreateEjbRef();

   /**
    * Creates a new <code>ejb-ref</code> element 
    * @return the new created instance of <code>EjbRefType<SessionBeanType<T>></code> 
    */
   public EjbRefType<SessionBeanType<T>> createEjbRef();

   /**
    * Returns all <code>ejb-ref</code> elements
    * @return list of <code>ejb-ref</code> 
    */
   public List<EjbRefType<SessionBeanType<T>>> getAllEjbRef();

   /**
    * Removes all <code>ejb-ref</code> elements 
    * @return the current instance of <code>EjbRefType<SessionBeanType<T>></code> 
    */
   public SessionBeanType<T> removeAllEjbRef();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionBeanType ElementName: javaee:ejb-local-refType ElementType : ejb-local-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>ejb-local-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>ejb-local-ref</code> element will be returned.
    * @return the instance defined for the element <code>ejb-local-ref</code> 
    */
   public EjbLocalRefType<SessionBeanType<T>> getOrCreateEjbLocalRef();

   /**
    * Creates a new <code>ejb-local-ref</code> element 
    * @return the new created instance of <code>EjbLocalRefType<SessionBeanType<T>></code> 
    */
   public EjbLocalRefType<SessionBeanType<T>> createEjbLocalRef();

   /**
    * Returns all <code>ejb-local-ref</code> elements
    * @return list of <code>ejb-local-ref</code> 
    */
   public List<EjbLocalRefType<SessionBeanType<T>>> getAllEjbLocalRef();

   /**
    * Removes all <code>ejb-local-ref</code> elements 
    * @return the current instance of <code>EjbLocalRefType<SessionBeanType<T>></code> 
    */
   public SessionBeanType<T> removeAllEjbLocalRef();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionBeanType ElementName: javaee:resource-refType ElementType : resource-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>resource-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>resource-ref</code> element will be returned.
    * @return the instance defined for the element <code>resource-ref</code> 
    */
   public ResourceRefType<SessionBeanType<T>> getOrCreateResourceRef();

   /**
    * Creates a new <code>resource-ref</code> element 
    * @return the new created instance of <code>ResourceRefType<SessionBeanType<T>></code> 
    */
   public ResourceRefType<SessionBeanType<T>> createResourceRef();

   /**
    * Returns all <code>resource-ref</code> elements
    * @return list of <code>resource-ref</code> 
    */
   public List<ResourceRefType<SessionBeanType<T>>> getAllResourceRef();

   /**
    * Removes all <code>resource-ref</code> elements 
    * @return the current instance of <code>ResourceRefType<SessionBeanType<T>></code> 
    */
   public SessionBeanType<T> removeAllResourceRef();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionBeanType ElementName: javaee:resource-env-refType ElementType : resource-env-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>resource-env-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>resource-env-ref</code> element will be returned.
    * @return the instance defined for the element <code>resource-env-ref</code> 
    */
   public ResourceEnvRefType<SessionBeanType<T>> getOrCreateResourceEnvRef();

   /**
    * Creates a new <code>resource-env-ref</code> element 
    * @return the new created instance of <code>ResourceEnvRefType<SessionBeanType<T>></code> 
    */
   public ResourceEnvRefType<SessionBeanType<T>> createResourceEnvRef();

   /**
    * Returns all <code>resource-env-ref</code> elements
    * @return list of <code>resource-env-ref</code> 
    */
   public List<ResourceEnvRefType<SessionBeanType<T>>> getAllResourceEnvRef();

   /**
    * Removes all <code>resource-env-ref</code> elements 
    * @return the current instance of <code>ResourceEnvRefType<SessionBeanType<T>></code> 
    */
   public SessionBeanType<T> removeAllResourceEnvRef();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionBeanType ElementName: javaee:message-destination-refType ElementType : message-destination-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>message-destination-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>message-destination-ref</code> element will be returned.
    * @return the instance defined for the element <code>message-destination-ref</code> 
    */
   public MessageDestinationRefType<SessionBeanType<T>> getOrCreateMessageDestinationRef();

   /**
    * Creates a new <code>message-destination-ref</code> element 
    * @return the new created instance of <code>MessageDestinationRefType<SessionBeanType<T>></code> 
    */
   public MessageDestinationRefType<SessionBeanType<T>> createMessageDestinationRef();

   /**
    * Returns all <code>message-destination-ref</code> elements
    * @return list of <code>message-destination-ref</code> 
    */
   public List<MessageDestinationRefType<SessionBeanType<T>>> getAllMessageDestinationRef();

   /**
    * Removes all <code>message-destination-ref</code> elements 
    * @return the current instance of <code>MessageDestinationRefType<SessionBeanType<T>></code> 
    */
   public SessionBeanType<T> removeAllMessageDestinationRef();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionBeanType ElementName: javaee:persistence-context-refType ElementType : persistence-context-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>persistence-context-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>persistence-context-ref</code> element will be returned.
    * @return the instance defined for the element <code>persistence-context-ref</code> 
    */
   public PersistenceContextRefType<SessionBeanType<T>> getOrCreatePersistenceContextRef();

   /**
    * Creates a new <code>persistence-context-ref</code> element 
    * @return the new created instance of <code>PersistenceContextRefType<SessionBeanType<T>></code> 
    */
   public PersistenceContextRefType<SessionBeanType<T>> createPersistenceContextRef();

   /**
    * Returns all <code>persistence-context-ref</code> elements
    * @return list of <code>persistence-context-ref</code> 
    */
   public List<PersistenceContextRefType<SessionBeanType<T>>> getAllPersistenceContextRef();

   /**
    * Removes all <code>persistence-context-ref</code> elements 
    * @return the current instance of <code>PersistenceContextRefType<SessionBeanType<T>></code> 
    */
   public SessionBeanType<T> removeAllPersistenceContextRef();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionBeanType ElementName: javaee:persistence-unit-refType ElementType : persistence-unit-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>persistence-unit-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>persistence-unit-ref</code> element will be returned.
    * @return the instance defined for the element <code>persistence-unit-ref</code> 
    */
   public PersistenceUnitRefType<SessionBeanType<T>> getOrCreatePersistenceUnitRef();

   /**
    * Creates a new <code>persistence-unit-ref</code> element 
    * @return the new created instance of <code>PersistenceUnitRefType<SessionBeanType<T>></code> 
    */
   public PersistenceUnitRefType<SessionBeanType<T>> createPersistenceUnitRef();

   /**
    * Returns all <code>persistence-unit-ref</code> elements
    * @return list of <code>persistence-unit-ref</code> 
    */
   public List<PersistenceUnitRefType<SessionBeanType<T>>> getAllPersistenceUnitRef();

   /**
    * Removes all <code>persistence-unit-ref</code> elements 
    * @return the current instance of <code>PersistenceUnitRefType<SessionBeanType<T>></code> 
    */
   public SessionBeanType<T> removeAllPersistenceUnitRef();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionBeanType ElementName: javaee:lifecycle-callbackType ElementType : post-construct
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>post-construct</code> element will be created and returned.
    * Otherwise, the first existing <code>post-construct</code> element will be returned.
    * @return the instance defined for the element <code>post-construct</code> 
    */
   public LifecycleCallbackType<SessionBeanType<T>> getOrCreatePostConstruct();

   /**
    * Creates a new <code>post-construct</code> element 
    * @return the new created instance of <code>LifecycleCallbackType<SessionBeanType<T>></code> 
    */
   public LifecycleCallbackType<SessionBeanType<T>> createPostConstruct();

   /**
    * Returns all <code>post-construct</code> elements
    * @return list of <code>post-construct</code> 
    */
   public List<LifecycleCallbackType<SessionBeanType<T>>> getAllPostConstruct();

   /**
    * Removes all <code>post-construct</code> elements 
    * @return the current instance of <code>LifecycleCallbackType<SessionBeanType<T>></code> 
    */
   public SessionBeanType<T> removeAllPostConstruct();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionBeanType ElementName: javaee:lifecycle-callbackType ElementType : pre-destroy
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>pre-destroy</code> element will be created and returned.
    * Otherwise, the first existing <code>pre-destroy</code> element will be returned.
    * @return the instance defined for the element <code>pre-destroy</code> 
    */
   public LifecycleCallbackType<SessionBeanType<T>> getOrCreatePreDestroy();

   /**
    * Creates a new <code>pre-destroy</code> element 
    * @return the new created instance of <code>LifecycleCallbackType<SessionBeanType<T>></code> 
    */
   public LifecycleCallbackType<SessionBeanType<T>> createPreDestroy();

   /**
    * Returns all <code>pre-destroy</code> elements
    * @return list of <code>pre-destroy</code> 
    */
   public List<LifecycleCallbackType<SessionBeanType<T>>> getAllPreDestroy();

   /**
    * Removes all <code>pre-destroy</code> elements 
    * @return the current instance of <code>LifecycleCallbackType<SessionBeanType<T>></code> 
    */
   public SessionBeanType<T> removeAllPreDestroy();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionBeanType ElementName: javaee:service-refType ElementType : service-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>service-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>service-ref</code> element will be returned.
    * @return the instance defined for the element <code>service-ref</code> 
    */
   public ServiceRefType<SessionBeanType<T>> getOrCreateServiceRef();

   /**
    * Creates a new <code>service-ref</code> element 
    * @return the new created instance of <code>ServiceRefType<SessionBeanType<T>></code> 
    */
   public ServiceRefType<SessionBeanType<T>> createServiceRef();

   /**
    * Returns all <code>service-ref</code> elements
    * @return list of <code>service-ref</code> 
    */
   public List<ServiceRefType<SessionBeanType<T>>> getAllServiceRef();

   /**
    * Removes all <code>service-ref</code> elements 
    * @return the current instance of <code>ServiceRefType<SessionBeanType<T>></code> 
    */
   public SessionBeanType<T> removeAllServiceRef();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionBeanType ElementName: javaee:xsdNMTOKENType ElementType : ejb-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>ejb-name</code> element
    * @param ejbName the value for the element <code>ejb-name</code> 
    * @return the current instance of <code>SessionBeanType<T></code> 
    */
   public SessionBeanType<T> ejbName(String ejbName);

   /**
    * Returns the <code>ejb-name</code> element
    * @return the node defined for the element <code>ejb-name</code> 
    */
   public String getEjbName();

   /**
    * Removes the <code>ejb-name</code> element 
    * @return the current instance of <code>SessionBeanType<T></code> 
    */
   public SessionBeanType<T> removeEjbName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionBeanType ElementName: xsd:string ElementType : mapped-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>mapped-name</code> element
    * @param mappedName the value for the element <code>mapped-name</code> 
    * @return the current instance of <code>SessionBeanType<T></code> 
    */
   public SessionBeanType<T> mappedName(String mappedName);

   /**
    * Returns the <code>mapped-name</code> element
    * @return the node defined for the element <code>mapped-name</code> 
    */
   public String getMappedName();

   /**
    * Removes the <code>mapped-name</code> element 
    * @return the current instance of <code>SessionBeanType<T></code> 
    */
   public SessionBeanType<T> removeMappedName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionBeanType ElementName: javaee:fully-qualified-classType ElementType : home
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>home</code> element
    * @param home the value for the element <code>home</code> 
    * @return the current instance of <code>SessionBeanType<T></code> 
    */
   public SessionBeanType<T> home(String home);

   /**
    * Returns the <code>home</code> element
    * @return the node defined for the element <code>home</code> 
    */
   public String getHome();

   /**
    * Removes the <code>home</code> element 
    * @return the current instance of <code>SessionBeanType<T></code> 
    */
   public SessionBeanType<T> removeHome();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionBeanType ElementName: javaee:fully-qualified-classType ElementType : remote
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>remote</code> element
    * @param remote the value for the element <code>remote</code> 
    * @return the current instance of <code>SessionBeanType<T></code> 
    */
   public SessionBeanType<T> remote(String remote);

   /**
    * Returns the <code>remote</code> element
    * @return the node defined for the element <code>remote</code> 
    */
   public String getRemote();

   /**
    * Removes the <code>remote</code> element 
    * @return the current instance of <code>SessionBeanType<T></code> 
    */
   public SessionBeanType<T> removeRemote();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionBeanType ElementName: javaee:fully-qualified-classType ElementType : local-home
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>local-home</code> element
    * @param localHome the value for the element <code>local-home</code> 
    * @return the current instance of <code>SessionBeanType<T></code> 
    */
   public SessionBeanType<T> localHome(String localHome);

   /**
    * Returns the <code>local-home</code> element
    * @return the node defined for the element <code>local-home</code> 
    */
   public String getLocalHome();

   /**
    * Removes the <code>local-home</code> element 
    * @return the current instance of <code>SessionBeanType<T></code> 
    */
   public SessionBeanType<T> removeLocalHome();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionBeanType ElementName: javaee:fully-qualified-classType ElementType : local
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>local</code> element
    * @param local the value for the element <code>local</code> 
    * @return the current instance of <code>SessionBeanType<T></code> 
    */
   public SessionBeanType<T> local(String local);

   /**
    * Returns the <code>local</code> element
    * @return the node defined for the element <code>local</code> 
    */
   public String getLocal();

   /**
    * Removes the <code>local</code> element 
    * @return the current instance of <code>SessionBeanType<T></code> 
    */
   public SessionBeanType<T> removeLocal();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionBeanType ElementName: xsd:token ElementType : business-local
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>business-local</code> elements, 
    * a new <code>business-local</code> element 
    * @param values list of <code>business-local</code> objects 
    * @return the current instance of <code>SessionBeanType<T></code> 
    */
   public SessionBeanType<T> businessLocal(String ... values);

   /**
    * Returns all <code>business-local</code> elements
    * @return list of <code>business-local</code> 
    */
   public List<String> getAllBusinessLocal();

   /**
    * Removes the <code>business-local</code> element 
    * @return the current instance of <code>SessionBeanType<T></code> 
    */
   public SessionBeanType<T> removeAllBusinessLocal();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionBeanType ElementName: xsd:token ElementType : business-remote
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>business-remote</code> elements, 
    * a new <code>business-remote</code> element 
    * @param values list of <code>business-remote</code> objects 
    * @return the current instance of <code>SessionBeanType<T></code> 
    */
   public SessionBeanType<T> businessRemote(String ... values);

   /**
    * Returns all <code>business-remote</code> elements
    * @return list of <code>business-remote</code> 
    */
   public List<String> getAllBusinessRemote();

   /**
    * Removes the <code>business-remote</code> element 
    * @return the current instance of <code>SessionBeanType<T></code> 
    */
   public SessionBeanType<T> removeAllBusinessRemote();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionBeanType ElementName: xsd:token ElementType : service-endpoint
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>service-endpoint</code> element
    * @param serviceEndpoint the value for the element <code>service-endpoint</code> 
    * @return the current instance of <code>SessionBeanType<T></code> 
    */
   public SessionBeanType<T> serviceEndpoint(String serviceEndpoint);

   /**
    * Returns the <code>service-endpoint</code> element
    * @return the node defined for the element <code>service-endpoint</code> 
    */
   public String getServiceEndpoint();

   /**
    * Removes the <code>service-endpoint</code> element 
    * @return the current instance of <code>SessionBeanType<T></code> 
    */
   public SessionBeanType<T> removeServiceEndpoint();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionBeanType ElementName: javaee:fully-qualified-classType ElementType : ejb-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>ejb-class</code> element
    * @param ejbClass the value for the element <code>ejb-class</code> 
    * @return the current instance of <code>SessionBeanType<T></code> 
    */
   public SessionBeanType<T> ejbClass(String ejbClass);

   /**
    * Returns the <code>ejb-class</code> element
    * @return the node defined for the element <code>ejb-class</code> 
    */
   public String getEjbClass();

   /**
    * Removes the <code>ejb-class</code> element 
    * @return the current instance of <code>SessionBeanType<T></code> 
    */
   public SessionBeanType<T> removeEjbClass();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionBeanType ElementName: javaee:session-typeType ElementType : session-type
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>session-type</code> element
    * @param sessionType the value for the element <code>session-type</code> 
    * @return the current instance of <code>SessionBeanType<T></code> 
    */
   public SessionBeanType<T> sessionType(SessionTypeType sessionType);
   /**
    * Sets the <code>session-type</code> element
    * @param sessionType the value for the element <code>session-type</code> 
    * @return the current instance of <code>SessionBeanType<T></code> 
    */
   public SessionBeanType<T> sessionType(String sessionType);

   /**
    * Returns the <code>session-type</code> element
    * @return the value found for the element <code>session-type</code> 
    */
   public SessionTypeType getSessionType();

   /**
    * Returns the <code>session-type</code> element
    * @return the value found for the element <code>session-type</code> 
    */
   public String  getSessionTypeAsString();

   /**
    * Removes the <code>session-type</code> attribute 
    * @return the current instance of <code>SessionBeanType<T></code> 
    */
   public SessionBeanType<T> removeSessionType();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionBeanType ElementName: javaee:named-methodType ElementType : timeout-method
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>timeout-method</code> element with the given value will be created.
    * Otherwise, the existing <code>timeout-method</code> element will be returned.
    * @return  a new or existing instance of <code>NamedMethodType<SessionBeanType<T>></code> 
    */
   public NamedMethodType<SessionBeanType<T>> getOrCreateTimeoutMethod();

   /**
    * Removes the <code>timeout-method</code> element 
    * @return the current instance of <code>SessionBeanType<T></code> 
    */
   public SessionBeanType<T> removeTimeoutMethod();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionBeanType ElementName: javaee:init-methodType ElementType : init-method
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>init-method</code> element will be created and returned.
    * Otherwise, the first existing <code>init-method</code> element will be returned.
    * @return the instance defined for the element <code>init-method</code> 
    */
   public InitMethodType<SessionBeanType<T>> getOrCreateInitMethod();

   /**
    * Creates a new <code>init-method</code> element 
    * @return the new created instance of <code>InitMethodType<SessionBeanType<T>></code> 
    */
   public InitMethodType<SessionBeanType<T>> createInitMethod();

   /**
    * Returns all <code>init-method</code> elements
    * @return list of <code>init-method</code> 
    */
   public List<InitMethodType<SessionBeanType<T>>> getAllInitMethod();

   /**
    * Removes all <code>init-method</code> elements 
    * @return the current instance of <code>InitMethodType<SessionBeanType<T>></code> 
    */
   public SessionBeanType<T> removeAllInitMethod();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionBeanType ElementName: javaee:remove-methodType ElementType : remove-method
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>remove-method</code> element will be created and returned.
    * Otherwise, the first existing <code>remove-method</code> element will be returned.
    * @return the instance defined for the element <code>remove-method</code> 
    */
   public RemoveMethodType<SessionBeanType<T>> getOrCreateRemoveMethod();

   /**
    * Creates a new <code>remove-method</code> element 
    * @return the new created instance of <code>RemoveMethodType<SessionBeanType<T>></code> 
    */
   public RemoveMethodType<SessionBeanType<T>> createRemoveMethod();

   /**
    * Returns all <code>remove-method</code> elements
    * @return list of <code>remove-method</code> 
    */
   public List<RemoveMethodType<SessionBeanType<T>>> getAllRemoveMethod();

   /**
    * Removes all <code>remove-method</code> elements 
    * @return the current instance of <code>RemoveMethodType<SessionBeanType<T>></code> 
    */
   public SessionBeanType<T> removeAllRemoveMethod();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionBeanType ElementName: javaee:transaction-typeType ElementType : transaction-type
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>transaction-type</code> element
    * @param transactionType the value for the element <code>transaction-type</code> 
    * @return the current instance of <code>SessionBeanType<T></code> 
    */
   public SessionBeanType<T> transactionType(TransactionTypeType transactionType);
   /**
    * Sets the <code>transaction-type</code> element
    * @param transactionType the value for the element <code>transaction-type</code> 
    * @return the current instance of <code>SessionBeanType<T></code> 
    */
   public SessionBeanType<T> transactionType(String transactionType);

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
    * @return the current instance of <code>SessionBeanType<T></code> 
    */
   public SessionBeanType<T> removeTransactionType();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionBeanType ElementName: javaee:around-invokeType ElementType : around-invoke
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>around-invoke</code> element will be created and returned.
    * Otherwise, the first existing <code>around-invoke</code> element will be returned.
    * @return the instance defined for the element <code>around-invoke</code> 
    */
   public AroundInvokeType<SessionBeanType<T>> getOrCreateAroundInvoke();

   /**
    * Creates a new <code>around-invoke</code> element 
    * @return the new created instance of <code>AroundInvokeType<SessionBeanType<T>></code> 
    */
   public AroundInvokeType<SessionBeanType<T>> createAroundInvoke();

   /**
    * Returns all <code>around-invoke</code> elements
    * @return list of <code>around-invoke</code> 
    */
   public List<AroundInvokeType<SessionBeanType<T>>> getAllAroundInvoke();

   /**
    * Removes all <code>around-invoke</code> elements 
    * @return the current instance of <code>AroundInvokeType<SessionBeanType<T>></code> 
    */
   public SessionBeanType<T> removeAllAroundInvoke();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionBeanType ElementName: javaee:lifecycle-callbackType ElementType : post-activate
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>post-activate</code> element will be created and returned.
    * Otherwise, the first existing <code>post-activate</code> element will be returned.
    * @return the instance defined for the element <code>post-activate</code> 
    */
   public LifecycleCallbackType<SessionBeanType<T>> getOrCreatePostActivate();

   /**
    * Creates a new <code>post-activate</code> element 
    * @return the new created instance of <code>LifecycleCallbackType<SessionBeanType<T>></code> 
    */
   public LifecycleCallbackType<SessionBeanType<T>> createPostActivate();

   /**
    * Returns all <code>post-activate</code> elements
    * @return list of <code>post-activate</code> 
    */
   public List<LifecycleCallbackType<SessionBeanType<T>>> getAllPostActivate();

   /**
    * Removes all <code>post-activate</code> elements 
    * @return the current instance of <code>LifecycleCallbackType<SessionBeanType<T>></code> 
    */
   public SessionBeanType<T> removeAllPostActivate();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionBeanType ElementName: javaee:lifecycle-callbackType ElementType : pre-passivate
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>pre-passivate</code> element will be created and returned.
    * Otherwise, the first existing <code>pre-passivate</code> element will be returned.
    * @return the instance defined for the element <code>pre-passivate</code> 
    */
   public LifecycleCallbackType<SessionBeanType<T>> getOrCreatePrePassivate();

   /**
    * Creates a new <code>pre-passivate</code> element 
    * @return the new created instance of <code>LifecycleCallbackType<SessionBeanType<T>></code> 
    */
   public LifecycleCallbackType<SessionBeanType<T>> createPrePassivate();

   /**
    * Returns all <code>pre-passivate</code> elements
    * @return list of <code>pre-passivate</code> 
    */
   public List<LifecycleCallbackType<SessionBeanType<T>>> getAllPrePassivate();

   /**
    * Removes all <code>pre-passivate</code> elements 
    * @return the current instance of <code>LifecycleCallbackType<SessionBeanType<T>></code> 
    */
   public SessionBeanType<T> removeAllPrePassivate();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionBeanType ElementName: javaee:security-role-refType ElementType : security-role-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>security-role-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>security-role-ref</code> element will be returned.
    * @return the instance defined for the element <code>security-role-ref</code> 
    */
   public SecurityRoleRefType<SessionBeanType<T>> getOrCreateSecurityRoleRef();

   /**
    * Creates a new <code>security-role-ref</code> element 
    * @return the new created instance of <code>SecurityRoleRefType<SessionBeanType<T>></code> 
    */
   public SecurityRoleRefType<SessionBeanType<T>> createSecurityRoleRef();

   /**
    * Returns all <code>security-role-ref</code> elements
    * @return list of <code>security-role-ref</code> 
    */
   public List<SecurityRoleRefType<SessionBeanType<T>>> getAllSecurityRoleRef();

   /**
    * Removes all <code>security-role-ref</code> elements 
    * @return the current instance of <code>SecurityRoleRefType<SessionBeanType<T>></code> 
    */
   public SessionBeanType<T> removeAllSecurityRoleRef();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionBeanType ElementName: javaee:security-identityType ElementType : security-identity
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>security-identity</code> element with the given value will be created.
    * Otherwise, the existing <code>security-identity</code> element will be returned.
    * @return  a new or existing instance of <code>SecurityIdentityType<SessionBeanType<T>></code> 
    */
   public SecurityIdentityType<SessionBeanType<T>> getOrCreateSecurityIdentity();

   /**
    * Removes the <code>security-identity</code> element 
    * @return the current instance of <code>SessionBeanType<T></code> 
    */
   public SessionBeanType<T> removeSecurityIdentity();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionBeanType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>SessionBeanType<T></code> 
    */
   public SessionBeanType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>SessionBeanType<T></code> 
    */
   public SessionBeanType<T> removeId();
}
