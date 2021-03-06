package org.jboss.shrinkwrap.descriptor.api.ejbjar30; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee5.EjbLocalRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.EjbRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.EnvEntryType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.LifecycleCallbackType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.MessageDestinationRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.PersistenceContextRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.PersistenceUnitRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.ResourceEnvRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.ResourceRefType;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient12.ServiceRefType;
/**
 * This interface defines the contract for the <code> interceptorType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface InterceptorType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: InterceptorType ElementName: javaee:env-entryType ElementType : env-entry
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>env-entry</code> element will be created and returned.
    * Otherwise, the first existing <code>env-entry</code> element will be returned.
    * @return the instance defined for the element <code>env-entry</code> 
    */
   public EnvEntryType<InterceptorType<T>> getOrCreateEnvEntry();

   /**
    * Creates a new <code>env-entry</code> element 
    * @return the new created instance of <code>EnvEntryType<InterceptorType<T>></code> 
    */
   public EnvEntryType<InterceptorType<T>> createEnvEntry();

   /**
    * Returns all <code>env-entry</code> elements
    * @return list of <code>env-entry</code> 
    */
   public List<EnvEntryType<InterceptorType<T>>> getAllEnvEntry();

   /**
    * Removes all <code>env-entry</code> elements 
    * @return the current instance of <code>EnvEntryType<InterceptorType<T>></code> 
    */
   public InterceptorType<T> removeAllEnvEntry();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: InterceptorType ElementName: javaee:ejb-refType ElementType : ejb-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>ejb-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>ejb-ref</code> element will be returned.
    * @return the instance defined for the element <code>ejb-ref</code> 
    */
   public EjbRefType<InterceptorType<T>> getOrCreateEjbRef();

   /**
    * Creates a new <code>ejb-ref</code> element 
    * @return the new created instance of <code>EjbRefType<InterceptorType<T>></code> 
    */
   public EjbRefType<InterceptorType<T>> createEjbRef();

   /**
    * Returns all <code>ejb-ref</code> elements
    * @return list of <code>ejb-ref</code> 
    */
   public List<EjbRefType<InterceptorType<T>>> getAllEjbRef();

   /**
    * Removes all <code>ejb-ref</code> elements 
    * @return the current instance of <code>EjbRefType<InterceptorType<T>></code> 
    */
   public InterceptorType<T> removeAllEjbRef();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: InterceptorType ElementName: javaee:ejb-local-refType ElementType : ejb-local-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>ejb-local-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>ejb-local-ref</code> element will be returned.
    * @return the instance defined for the element <code>ejb-local-ref</code> 
    */
   public EjbLocalRefType<InterceptorType<T>> getOrCreateEjbLocalRef();

   /**
    * Creates a new <code>ejb-local-ref</code> element 
    * @return the new created instance of <code>EjbLocalRefType<InterceptorType<T>></code> 
    */
   public EjbLocalRefType<InterceptorType<T>> createEjbLocalRef();

   /**
    * Returns all <code>ejb-local-ref</code> elements
    * @return list of <code>ejb-local-ref</code> 
    */
   public List<EjbLocalRefType<InterceptorType<T>>> getAllEjbLocalRef();

   /**
    * Removes all <code>ejb-local-ref</code> elements 
    * @return the current instance of <code>EjbLocalRefType<InterceptorType<T>></code> 
    */
   public InterceptorType<T> removeAllEjbLocalRef();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: InterceptorType ElementName: javaee:resource-refType ElementType : resource-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>resource-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>resource-ref</code> element will be returned.
    * @return the instance defined for the element <code>resource-ref</code> 
    */
   public ResourceRefType<InterceptorType<T>> getOrCreateResourceRef();

   /**
    * Creates a new <code>resource-ref</code> element 
    * @return the new created instance of <code>ResourceRefType<InterceptorType<T>></code> 
    */
   public ResourceRefType<InterceptorType<T>> createResourceRef();

   /**
    * Returns all <code>resource-ref</code> elements
    * @return list of <code>resource-ref</code> 
    */
   public List<ResourceRefType<InterceptorType<T>>> getAllResourceRef();

   /**
    * Removes all <code>resource-ref</code> elements 
    * @return the current instance of <code>ResourceRefType<InterceptorType<T>></code> 
    */
   public InterceptorType<T> removeAllResourceRef();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: InterceptorType ElementName: javaee:resource-env-refType ElementType : resource-env-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>resource-env-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>resource-env-ref</code> element will be returned.
    * @return the instance defined for the element <code>resource-env-ref</code> 
    */
   public ResourceEnvRefType<InterceptorType<T>> getOrCreateResourceEnvRef();

   /**
    * Creates a new <code>resource-env-ref</code> element 
    * @return the new created instance of <code>ResourceEnvRefType<InterceptorType<T>></code> 
    */
   public ResourceEnvRefType<InterceptorType<T>> createResourceEnvRef();

   /**
    * Returns all <code>resource-env-ref</code> elements
    * @return list of <code>resource-env-ref</code> 
    */
   public List<ResourceEnvRefType<InterceptorType<T>>> getAllResourceEnvRef();

   /**
    * Removes all <code>resource-env-ref</code> elements 
    * @return the current instance of <code>ResourceEnvRefType<InterceptorType<T>></code> 
    */
   public InterceptorType<T> removeAllResourceEnvRef();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: InterceptorType ElementName: javaee:message-destination-refType ElementType : message-destination-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>message-destination-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>message-destination-ref</code> element will be returned.
    * @return the instance defined for the element <code>message-destination-ref</code> 
    */
   public MessageDestinationRefType<InterceptorType<T>> getOrCreateMessageDestinationRef();

   /**
    * Creates a new <code>message-destination-ref</code> element 
    * @return the new created instance of <code>MessageDestinationRefType<InterceptorType<T>></code> 
    */
   public MessageDestinationRefType<InterceptorType<T>> createMessageDestinationRef();

   /**
    * Returns all <code>message-destination-ref</code> elements
    * @return list of <code>message-destination-ref</code> 
    */
   public List<MessageDestinationRefType<InterceptorType<T>>> getAllMessageDestinationRef();

   /**
    * Removes all <code>message-destination-ref</code> elements 
    * @return the current instance of <code>MessageDestinationRefType<InterceptorType<T>></code> 
    */
   public InterceptorType<T> removeAllMessageDestinationRef();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: InterceptorType ElementName: javaee:persistence-context-refType ElementType : persistence-context-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>persistence-context-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>persistence-context-ref</code> element will be returned.
    * @return the instance defined for the element <code>persistence-context-ref</code> 
    */
   public PersistenceContextRefType<InterceptorType<T>> getOrCreatePersistenceContextRef();

   /**
    * Creates a new <code>persistence-context-ref</code> element 
    * @return the new created instance of <code>PersistenceContextRefType<InterceptorType<T>></code> 
    */
   public PersistenceContextRefType<InterceptorType<T>> createPersistenceContextRef();

   /**
    * Returns all <code>persistence-context-ref</code> elements
    * @return list of <code>persistence-context-ref</code> 
    */
   public List<PersistenceContextRefType<InterceptorType<T>>> getAllPersistenceContextRef();

   /**
    * Removes all <code>persistence-context-ref</code> elements 
    * @return the current instance of <code>PersistenceContextRefType<InterceptorType<T>></code> 
    */
   public InterceptorType<T> removeAllPersistenceContextRef();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: InterceptorType ElementName: javaee:persistence-unit-refType ElementType : persistence-unit-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>persistence-unit-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>persistence-unit-ref</code> element will be returned.
    * @return the instance defined for the element <code>persistence-unit-ref</code> 
    */
   public PersistenceUnitRefType<InterceptorType<T>> getOrCreatePersistenceUnitRef();

   /**
    * Creates a new <code>persistence-unit-ref</code> element 
    * @return the new created instance of <code>PersistenceUnitRefType<InterceptorType<T>></code> 
    */
   public PersistenceUnitRefType<InterceptorType<T>> createPersistenceUnitRef();

   /**
    * Returns all <code>persistence-unit-ref</code> elements
    * @return list of <code>persistence-unit-ref</code> 
    */
   public List<PersistenceUnitRefType<InterceptorType<T>>> getAllPersistenceUnitRef();

   /**
    * Removes all <code>persistence-unit-ref</code> elements 
    * @return the current instance of <code>PersistenceUnitRefType<InterceptorType<T>></code> 
    */
   public InterceptorType<T> removeAllPersistenceUnitRef();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: InterceptorType ElementName: javaee:lifecycle-callbackType ElementType : post-construct
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>post-construct</code> element will be created and returned.
    * Otherwise, the first existing <code>post-construct</code> element will be returned.
    * @return the instance defined for the element <code>post-construct</code> 
    */
   public LifecycleCallbackType<InterceptorType<T>> getOrCreatePostConstruct();

   /**
    * Creates a new <code>post-construct</code> element 
    * @return the new created instance of <code>LifecycleCallbackType<InterceptorType<T>></code> 
    */
   public LifecycleCallbackType<InterceptorType<T>> createPostConstruct();

   /**
    * Returns all <code>post-construct</code> elements
    * @return list of <code>post-construct</code> 
    */
   public List<LifecycleCallbackType<InterceptorType<T>>> getAllPostConstruct();

   /**
    * Removes all <code>post-construct</code> elements 
    * @return the current instance of <code>LifecycleCallbackType<InterceptorType<T>></code> 
    */
   public InterceptorType<T> removeAllPostConstruct();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: InterceptorType ElementName: javaee:lifecycle-callbackType ElementType : pre-destroy
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>pre-destroy</code> element will be created and returned.
    * Otherwise, the first existing <code>pre-destroy</code> element will be returned.
    * @return the instance defined for the element <code>pre-destroy</code> 
    */
   public LifecycleCallbackType<InterceptorType<T>> getOrCreatePreDestroy();

   /**
    * Creates a new <code>pre-destroy</code> element 
    * @return the new created instance of <code>LifecycleCallbackType<InterceptorType<T>></code> 
    */
   public LifecycleCallbackType<InterceptorType<T>> createPreDestroy();

   /**
    * Returns all <code>pre-destroy</code> elements
    * @return list of <code>pre-destroy</code> 
    */
   public List<LifecycleCallbackType<InterceptorType<T>>> getAllPreDestroy();

   /**
    * Removes all <code>pre-destroy</code> elements 
    * @return the current instance of <code>LifecycleCallbackType<InterceptorType<T>></code> 
    */
   public InterceptorType<T> removeAllPreDestroy();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: InterceptorType ElementName: javaee:service-refType ElementType : service-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>service-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>service-ref</code> element will be returned.
    * @return the instance defined for the element <code>service-ref</code> 
    */
   public ServiceRefType<InterceptorType<T>> getOrCreateServiceRef();

   /**
    * Creates a new <code>service-ref</code> element 
    * @return the new created instance of <code>ServiceRefType<InterceptorType<T>></code> 
    */
   public ServiceRefType<InterceptorType<T>> createServiceRef();

   /**
    * Returns all <code>service-ref</code> elements
    * @return list of <code>service-ref</code> 
    */
   public List<ServiceRefType<InterceptorType<T>>> getAllServiceRef();

   /**
    * Removes all <code>service-ref</code> elements 
    * @return the current instance of <code>ServiceRefType<InterceptorType<T>></code> 
    */
   public InterceptorType<T> removeAllServiceRef();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: InterceptorType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>InterceptorType<T></code> 
    */
   public InterceptorType<T> description(String ... values);

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>InterceptorType<T></code> 
    */
   public InterceptorType<T> removeAllDescription();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: InterceptorType ElementName: xsd:token ElementType : interceptor-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>interceptor-class</code> element
    * @param interceptorClass the value for the element <code>interceptor-class</code> 
    * @return the current instance of <code>InterceptorType<T></code> 
    */
   public InterceptorType<T> interceptorClass(String interceptorClass);

   /**
    * Returns the <code>interceptor-class</code> element
    * @return the node defined for the element <code>interceptor-class</code> 
    */
   public String getInterceptorClass();

   /**
    * Removes the <code>interceptor-class</code> element 
    * @return the current instance of <code>InterceptorType<T></code> 
    */
   public InterceptorType<T> removeInterceptorClass();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: InterceptorType ElementName: javaee:around-invokeType ElementType : around-invoke
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>around-invoke</code> element will be created and returned.
    * Otherwise, the first existing <code>around-invoke</code> element will be returned.
    * @return the instance defined for the element <code>around-invoke</code> 
    */
   public AroundInvokeType<InterceptorType<T>> getOrCreateAroundInvoke();

   /**
    * Creates a new <code>around-invoke</code> element 
    * @return the new created instance of <code>AroundInvokeType<InterceptorType<T>></code> 
    */
   public AroundInvokeType<InterceptorType<T>> createAroundInvoke();

   /**
    * Returns all <code>around-invoke</code> elements
    * @return list of <code>around-invoke</code> 
    */
   public List<AroundInvokeType<InterceptorType<T>>> getAllAroundInvoke();

   /**
    * Removes all <code>around-invoke</code> elements 
    * @return the current instance of <code>AroundInvokeType<InterceptorType<T>></code> 
    */
   public InterceptorType<T> removeAllAroundInvoke();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: InterceptorType ElementName: javaee:lifecycle-callbackType ElementType : post-activate
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>post-activate</code> element will be created and returned.
    * Otherwise, the first existing <code>post-activate</code> element will be returned.
    * @return the instance defined for the element <code>post-activate</code> 
    */
   public LifecycleCallbackType<InterceptorType<T>> getOrCreatePostActivate();

   /**
    * Creates a new <code>post-activate</code> element 
    * @return the new created instance of <code>LifecycleCallbackType<InterceptorType<T>></code> 
    */
   public LifecycleCallbackType<InterceptorType<T>> createPostActivate();

   /**
    * Returns all <code>post-activate</code> elements
    * @return list of <code>post-activate</code> 
    */
   public List<LifecycleCallbackType<InterceptorType<T>>> getAllPostActivate();

   /**
    * Removes all <code>post-activate</code> elements 
    * @return the current instance of <code>LifecycleCallbackType<InterceptorType<T>></code> 
    */
   public InterceptorType<T> removeAllPostActivate();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: InterceptorType ElementName: javaee:lifecycle-callbackType ElementType : pre-passivate
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>pre-passivate</code> element will be created and returned.
    * Otherwise, the first existing <code>pre-passivate</code> element will be returned.
    * @return the instance defined for the element <code>pre-passivate</code> 
    */
   public LifecycleCallbackType<InterceptorType<T>> getOrCreatePrePassivate();

   /**
    * Creates a new <code>pre-passivate</code> element 
    * @return the new created instance of <code>LifecycleCallbackType<InterceptorType<T>></code> 
    */
   public LifecycleCallbackType<InterceptorType<T>> createPrePassivate();

   /**
    * Returns all <code>pre-passivate</code> elements
    * @return list of <code>pre-passivate</code> 
    */
   public List<LifecycleCallbackType<InterceptorType<T>>> getAllPrePassivate();

   /**
    * Removes all <code>pre-passivate</code> elements 
    * @return the current instance of <code>LifecycleCallbackType<InterceptorType<T>></code> 
    */
   public InterceptorType<T> removeAllPrePassivate();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: InterceptorType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>InterceptorType<T></code> 
    */
   public InterceptorType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>InterceptorType<T></code> 
    */
   public InterceptorType<T> removeId();
}
