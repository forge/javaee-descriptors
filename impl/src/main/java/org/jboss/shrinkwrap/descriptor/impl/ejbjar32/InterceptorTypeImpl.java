package org.jboss.shrinkwrap.descriptor.impl.ejbjar32; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar32.AroundInvokeType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar32.AroundTimeoutType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar32.InterceptorType;
import org.jboss.shrinkwrap.descriptor.api.javaee7.AdministeredObjectType;
import org.jboss.shrinkwrap.descriptor.api.javaee7.ConnectionFactoryResourceType;
import org.jboss.shrinkwrap.descriptor.api.javaee7.DataSourceType;
import org.jboss.shrinkwrap.descriptor.api.javaee7.EjbLocalRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee7.EjbRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee7.EnvEntryType;
import org.jboss.shrinkwrap.descriptor.api.javaee7.JmsConnectionFactoryType;
import org.jboss.shrinkwrap.descriptor.api.javaee7.JmsDestinationType;
import org.jboss.shrinkwrap.descriptor.api.javaee7.LifecycleCallbackType;
import org.jboss.shrinkwrap.descriptor.api.javaee7.MailSessionType;
import org.jboss.shrinkwrap.descriptor.api.javaee7.MessageDestinationRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee7.PersistenceContextRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee7.PersistenceUnitRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee7.ResourceEnvRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee7.ResourceRefType;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient14.ServiceRefType;
import org.jboss.shrinkwrap.descriptor.impl.javaee7.AdministeredObjectTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee7.ConnectionFactoryResourceTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee7.DataSourceTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee7.EjbLocalRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee7.EjbRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee7.EnvEntryTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee7.JmsConnectionFactoryTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee7.JmsDestinationTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee7.LifecycleCallbackTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee7.MailSessionTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee7.MessageDestinationRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee7.PersistenceContextRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee7.PersistenceUnitRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee7.ResourceEnvRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee7.ResourceRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaeewebservicesclient14.ServiceRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> interceptorType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class InterceptorTypeImpl<T> implements Child<T>, InterceptorType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public InterceptorTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public InterceptorTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: InterceptorType ElementName: javaee:env-entryType ElementType : env-entry
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>env-entry</code> element will be created and returned.
    * Otherwise, the first existing <code>env-entry</code> element will be returned.
    * @return the instance defined for the element <code>env-entry</code> 
    */
   public EnvEntryType<InterceptorType<T>> getOrCreateEnvEntry()
   {
      List<Node> nodeList = childNode.get("env-entry");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new EnvEntryTypeImpl<InterceptorType<T>>(this, "env-entry", childNode, nodeList.get(0));
      }
      return createEnvEntry();
   }

   /**
    * Creates a new <code>env-entry</code> element 
    * @return the new created instance of <code>EnvEntryType<InterceptorType<T>></code> 
    */
   public EnvEntryType<InterceptorType<T>> createEnvEntry()
   {
      return new EnvEntryTypeImpl<InterceptorType<T>>(this, "env-entry", childNode);
   }

   /**
    * Returns all <code>env-entry</code> elements
    * @return list of <code>env-entry</code> 
    */
   public List<EnvEntryType<InterceptorType<T>>> getAllEnvEntry()
   {
      List<EnvEntryType<InterceptorType<T>>> list = new ArrayList<EnvEntryType<InterceptorType<T>>>();
      List<Node> nodeList = childNode.get("env-entry");
      for(Node node: nodeList)
      {
         EnvEntryType<InterceptorType<T>>  type = new EnvEntryTypeImpl<InterceptorType<T>>(this, "env-entry", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>env-entry</code> elements 
    * @return the current instance of <code>EnvEntryType<InterceptorType<T>></code> 
    */
   public InterceptorType<T> removeAllEnvEntry()
   {
      childNode.removeChildren("env-entry");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: InterceptorType ElementName: javaee:ejb-refType ElementType : ejb-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>ejb-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>ejb-ref</code> element will be returned.
    * @return the instance defined for the element <code>ejb-ref</code> 
    */
   public EjbRefType<InterceptorType<T>> getOrCreateEjbRef()
   {
      List<Node> nodeList = childNode.get("ejb-ref");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new EjbRefTypeImpl<InterceptorType<T>>(this, "ejb-ref", childNode, nodeList.get(0));
      }
      return createEjbRef();
   }

   /**
    * Creates a new <code>ejb-ref</code> element 
    * @return the new created instance of <code>EjbRefType<InterceptorType<T>></code> 
    */
   public EjbRefType<InterceptorType<T>> createEjbRef()
   {
      return new EjbRefTypeImpl<InterceptorType<T>>(this, "ejb-ref", childNode);
   }

   /**
    * Returns all <code>ejb-ref</code> elements
    * @return list of <code>ejb-ref</code> 
    */
   public List<EjbRefType<InterceptorType<T>>> getAllEjbRef()
   {
      List<EjbRefType<InterceptorType<T>>> list = new ArrayList<EjbRefType<InterceptorType<T>>>();
      List<Node> nodeList = childNode.get("ejb-ref");
      for(Node node: nodeList)
      {
         EjbRefType<InterceptorType<T>>  type = new EjbRefTypeImpl<InterceptorType<T>>(this, "ejb-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>ejb-ref</code> elements 
    * @return the current instance of <code>EjbRefType<InterceptorType<T>></code> 
    */
   public InterceptorType<T> removeAllEjbRef()
   {
      childNode.removeChildren("ejb-ref");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: InterceptorType ElementName: javaee:ejb-local-refType ElementType : ejb-local-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>ejb-local-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>ejb-local-ref</code> element will be returned.
    * @return the instance defined for the element <code>ejb-local-ref</code> 
    */
   public EjbLocalRefType<InterceptorType<T>> getOrCreateEjbLocalRef()
   {
      List<Node> nodeList = childNode.get("ejb-local-ref");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new EjbLocalRefTypeImpl<InterceptorType<T>>(this, "ejb-local-ref", childNode, nodeList.get(0));
      }
      return createEjbLocalRef();
   }

   /**
    * Creates a new <code>ejb-local-ref</code> element 
    * @return the new created instance of <code>EjbLocalRefType<InterceptorType<T>></code> 
    */
   public EjbLocalRefType<InterceptorType<T>> createEjbLocalRef()
   {
      return new EjbLocalRefTypeImpl<InterceptorType<T>>(this, "ejb-local-ref", childNode);
   }

   /**
    * Returns all <code>ejb-local-ref</code> elements
    * @return list of <code>ejb-local-ref</code> 
    */
   public List<EjbLocalRefType<InterceptorType<T>>> getAllEjbLocalRef()
   {
      List<EjbLocalRefType<InterceptorType<T>>> list = new ArrayList<EjbLocalRefType<InterceptorType<T>>>();
      List<Node> nodeList = childNode.get("ejb-local-ref");
      for(Node node: nodeList)
      {
         EjbLocalRefType<InterceptorType<T>>  type = new EjbLocalRefTypeImpl<InterceptorType<T>>(this, "ejb-local-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>ejb-local-ref</code> elements 
    * @return the current instance of <code>EjbLocalRefType<InterceptorType<T>></code> 
    */
   public InterceptorType<T> removeAllEjbLocalRef()
   {
      childNode.removeChildren("ejb-local-ref");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: InterceptorType ElementName: javaee:resource-refType ElementType : resource-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>resource-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>resource-ref</code> element will be returned.
    * @return the instance defined for the element <code>resource-ref</code> 
    */
   public ResourceRefType<InterceptorType<T>> getOrCreateResourceRef()
   {
      List<Node> nodeList = childNode.get("resource-ref");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ResourceRefTypeImpl<InterceptorType<T>>(this, "resource-ref", childNode, nodeList.get(0));
      }
      return createResourceRef();
   }

   /**
    * Creates a new <code>resource-ref</code> element 
    * @return the new created instance of <code>ResourceRefType<InterceptorType<T>></code> 
    */
   public ResourceRefType<InterceptorType<T>> createResourceRef()
   {
      return new ResourceRefTypeImpl<InterceptorType<T>>(this, "resource-ref", childNode);
   }

   /**
    * Returns all <code>resource-ref</code> elements
    * @return list of <code>resource-ref</code> 
    */
   public List<ResourceRefType<InterceptorType<T>>> getAllResourceRef()
   {
      List<ResourceRefType<InterceptorType<T>>> list = new ArrayList<ResourceRefType<InterceptorType<T>>>();
      List<Node> nodeList = childNode.get("resource-ref");
      for(Node node: nodeList)
      {
         ResourceRefType<InterceptorType<T>>  type = new ResourceRefTypeImpl<InterceptorType<T>>(this, "resource-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>resource-ref</code> elements 
    * @return the current instance of <code>ResourceRefType<InterceptorType<T>></code> 
    */
   public InterceptorType<T> removeAllResourceRef()
   {
      childNode.removeChildren("resource-ref");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: InterceptorType ElementName: javaee:resource-env-refType ElementType : resource-env-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>resource-env-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>resource-env-ref</code> element will be returned.
    * @return the instance defined for the element <code>resource-env-ref</code> 
    */
   public ResourceEnvRefType<InterceptorType<T>> getOrCreateResourceEnvRef()
   {
      List<Node> nodeList = childNode.get("resource-env-ref");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ResourceEnvRefTypeImpl<InterceptorType<T>>(this, "resource-env-ref", childNode, nodeList.get(0));
      }
      return createResourceEnvRef();
   }

   /**
    * Creates a new <code>resource-env-ref</code> element 
    * @return the new created instance of <code>ResourceEnvRefType<InterceptorType<T>></code> 
    */
   public ResourceEnvRefType<InterceptorType<T>> createResourceEnvRef()
   {
      return new ResourceEnvRefTypeImpl<InterceptorType<T>>(this, "resource-env-ref", childNode);
   }

   /**
    * Returns all <code>resource-env-ref</code> elements
    * @return list of <code>resource-env-ref</code> 
    */
   public List<ResourceEnvRefType<InterceptorType<T>>> getAllResourceEnvRef()
   {
      List<ResourceEnvRefType<InterceptorType<T>>> list = new ArrayList<ResourceEnvRefType<InterceptorType<T>>>();
      List<Node> nodeList = childNode.get("resource-env-ref");
      for(Node node: nodeList)
      {
         ResourceEnvRefType<InterceptorType<T>>  type = new ResourceEnvRefTypeImpl<InterceptorType<T>>(this, "resource-env-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>resource-env-ref</code> elements 
    * @return the current instance of <code>ResourceEnvRefType<InterceptorType<T>></code> 
    */
   public InterceptorType<T> removeAllResourceEnvRef()
   {
      childNode.removeChildren("resource-env-ref");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: InterceptorType ElementName: javaee:message-destination-refType ElementType : message-destination-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>message-destination-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>message-destination-ref</code> element will be returned.
    * @return the instance defined for the element <code>message-destination-ref</code> 
    */
   public MessageDestinationRefType<InterceptorType<T>> getOrCreateMessageDestinationRef()
   {
      List<Node> nodeList = childNode.get("message-destination-ref");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new MessageDestinationRefTypeImpl<InterceptorType<T>>(this, "message-destination-ref", childNode, nodeList.get(0));
      }
      return createMessageDestinationRef();
   }

   /**
    * Creates a new <code>message-destination-ref</code> element 
    * @return the new created instance of <code>MessageDestinationRefType<InterceptorType<T>></code> 
    */
   public MessageDestinationRefType<InterceptorType<T>> createMessageDestinationRef()
   {
      return new MessageDestinationRefTypeImpl<InterceptorType<T>>(this, "message-destination-ref", childNode);
   }

   /**
    * Returns all <code>message-destination-ref</code> elements
    * @return list of <code>message-destination-ref</code> 
    */
   public List<MessageDestinationRefType<InterceptorType<T>>> getAllMessageDestinationRef()
   {
      List<MessageDestinationRefType<InterceptorType<T>>> list = new ArrayList<MessageDestinationRefType<InterceptorType<T>>>();
      List<Node> nodeList = childNode.get("message-destination-ref");
      for(Node node: nodeList)
      {
         MessageDestinationRefType<InterceptorType<T>>  type = new MessageDestinationRefTypeImpl<InterceptorType<T>>(this, "message-destination-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>message-destination-ref</code> elements 
    * @return the current instance of <code>MessageDestinationRefType<InterceptorType<T>></code> 
    */
   public InterceptorType<T> removeAllMessageDestinationRef()
   {
      childNode.removeChildren("message-destination-ref");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: InterceptorType ElementName: javaee:persistence-context-refType ElementType : persistence-context-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>persistence-context-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>persistence-context-ref</code> element will be returned.
    * @return the instance defined for the element <code>persistence-context-ref</code> 
    */
   public PersistenceContextRefType<InterceptorType<T>> getOrCreatePersistenceContextRef()
   {
      List<Node> nodeList = childNode.get("persistence-context-ref");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new PersistenceContextRefTypeImpl<InterceptorType<T>>(this, "persistence-context-ref", childNode, nodeList.get(0));
      }
      return createPersistenceContextRef();
   }

   /**
    * Creates a new <code>persistence-context-ref</code> element 
    * @return the new created instance of <code>PersistenceContextRefType<InterceptorType<T>></code> 
    */
   public PersistenceContextRefType<InterceptorType<T>> createPersistenceContextRef()
   {
      return new PersistenceContextRefTypeImpl<InterceptorType<T>>(this, "persistence-context-ref", childNode);
   }

   /**
    * Returns all <code>persistence-context-ref</code> elements
    * @return list of <code>persistence-context-ref</code> 
    */
   public List<PersistenceContextRefType<InterceptorType<T>>> getAllPersistenceContextRef()
   {
      List<PersistenceContextRefType<InterceptorType<T>>> list = new ArrayList<PersistenceContextRefType<InterceptorType<T>>>();
      List<Node> nodeList = childNode.get("persistence-context-ref");
      for(Node node: nodeList)
      {
         PersistenceContextRefType<InterceptorType<T>>  type = new PersistenceContextRefTypeImpl<InterceptorType<T>>(this, "persistence-context-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>persistence-context-ref</code> elements 
    * @return the current instance of <code>PersistenceContextRefType<InterceptorType<T>></code> 
    */
   public InterceptorType<T> removeAllPersistenceContextRef()
   {
      childNode.removeChildren("persistence-context-ref");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: InterceptorType ElementName: javaee:persistence-unit-refType ElementType : persistence-unit-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>persistence-unit-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>persistence-unit-ref</code> element will be returned.
    * @return the instance defined for the element <code>persistence-unit-ref</code> 
    */
   public PersistenceUnitRefType<InterceptorType<T>> getOrCreatePersistenceUnitRef()
   {
      List<Node> nodeList = childNode.get("persistence-unit-ref");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new PersistenceUnitRefTypeImpl<InterceptorType<T>>(this, "persistence-unit-ref", childNode, nodeList.get(0));
      }
      return createPersistenceUnitRef();
   }

   /**
    * Creates a new <code>persistence-unit-ref</code> element 
    * @return the new created instance of <code>PersistenceUnitRefType<InterceptorType<T>></code> 
    */
   public PersistenceUnitRefType<InterceptorType<T>> createPersistenceUnitRef()
   {
      return new PersistenceUnitRefTypeImpl<InterceptorType<T>>(this, "persistence-unit-ref", childNode);
   }

   /**
    * Returns all <code>persistence-unit-ref</code> elements
    * @return list of <code>persistence-unit-ref</code> 
    */
   public List<PersistenceUnitRefType<InterceptorType<T>>> getAllPersistenceUnitRef()
   {
      List<PersistenceUnitRefType<InterceptorType<T>>> list = new ArrayList<PersistenceUnitRefType<InterceptorType<T>>>();
      List<Node> nodeList = childNode.get("persistence-unit-ref");
      for(Node node: nodeList)
      {
         PersistenceUnitRefType<InterceptorType<T>>  type = new PersistenceUnitRefTypeImpl<InterceptorType<T>>(this, "persistence-unit-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>persistence-unit-ref</code> elements 
    * @return the current instance of <code>PersistenceUnitRefType<InterceptorType<T>></code> 
    */
   public InterceptorType<T> removeAllPersistenceUnitRef()
   {
      childNode.removeChildren("persistence-unit-ref");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: InterceptorType ElementName: javaee:lifecycle-callbackType ElementType : post-construct
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>post-construct</code> element will be created and returned.
    * Otherwise, the first existing <code>post-construct</code> element will be returned.
    * @return the instance defined for the element <code>post-construct</code> 
    */
   public LifecycleCallbackType<InterceptorType<T>> getOrCreatePostConstruct()
   {
      List<Node> nodeList = childNode.get("post-construct");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new LifecycleCallbackTypeImpl<InterceptorType<T>>(this, "post-construct", childNode, nodeList.get(0));
      }
      return createPostConstruct();
   }

   /**
    * Creates a new <code>post-construct</code> element 
    * @return the new created instance of <code>LifecycleCallbackType<InterceptorType<T>></code> 
    */
   public LifecycleCallbackType<InterceptorType<T>> createPostConstruct()
   {
      return new LifecycleCallbackTypeImpl<InterceptorType<T>>(this, "post-construct", childNode);
   }

   /**
    * Returns all <code>post-construct</code> elements
    * @return list of <code>post-construct</code> 
    */
   public List<LifecycleCallbackType<InterceptorType<T>>> getAllPostConstruct()
   {
      List<LifecycleCallbackType<InterceptorType<T>>> list = new ArrayList<LifecycleCallbackType<InterceptorType<T>>>();
      List<Node> nodeList = childNode.get("post-construct");
      for(Node node: nodeList)
      {
         LifecycleCallbackType<InterceptorType<T>>  type = new LifecycleCallbackTypeImpl<InterceptorType<T>>(this, "post-construct", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>post-construct</code> elements 
    * @return the current instance of <code>LifecycleCallbackType<InterceptorType<T>></code> 
    */
   public InterceptorType<T> removeAllPostConstruct()
   {
      childNode.removeChildren("post-construct");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: InterceptorType ElementName: javaee:lifecycle-callbackType ElementType : pre-destroy
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>pre-destroy</code> element will be created and returned.
    * Otherwise, the first existing <code>pre-destroy</code> element will be returned.
    * @return the instance defined for the element <code>pre-destroy</code> 
    */
   public LifecycleCallbackType<InterceptorType<T>> getOrCreatePreDestroy()
   {
      List<Node> nodeList = childNode.get("pre-destroy");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new LifecycleCallbackTypeImpl<InterceptorType<T>>(this, "pre-destroy", childNode, nodeList.get(0));
      }
      return createPreDestroy();
   }

   /**
    * Creates a new <code>pre-destroy</code> element 
    * @return the new created instance of <code>LifecycleCallbackType<InterceptorType<T>></code> 
    */
   public LifecycleCallbackType<InterceptorType<T>> createPreDestroy()
   {
      return new LifecycleCallbackTypeImpl<InterceptorType<T>>(this, "pre-destroy", childNode);
   }

   /**
    * Returns all <code>pre-destroy</code> elements
    * @return list of <code>pre-destroy</code> 
    */
   public List<LifecycleCallbackType<InterceptorType<T>>> getAllPreDestroy()
   {
      List<LifecycleCallbackType<InterceptorType<T>>> list = new ArrayList<LifecycleCallbackType<InterceptorType<T>>>();
      List<Node> nodeList = childNode.get("pre-destroy");
      for(Node node: nodeList)
      {
         LifecycleCallbackType<InterceptorType<T>>  type = new LifecycleCallbackTypeImpl<InterceptorType<T>>(this, "pre-destroy", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>pre-destroy</code> elements 
    * @return the current instance of <code>LifecycleCallbackType<InterceptorType<T>></code> 
    */
   public InterceptorType<T> removeAllPreDestroy()
   {
      childNode.removeChildren("pre-destroy");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: InterceptorType ElementName: javaee:data-sourceType ElementType : data-source
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>data-source</code> element will be created and returned.
    * Otherwise, the first existing <code>data-source</code> element will be returned.
    * @return the instance defined for the element <code>data-source</code> 
    */
   public DataSourceType<InterceptorType<T>> getOrCreateDataSource()
   {
      List<Node> nodeList = childNode.get("data-source");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new DataSourceTypeImpl<InterceptorType<T>>(this, "data-source", childNode, nodeList.get(0));
      }
      return createDataSource();
   }

   /**
    * Creates a new <code>data-source</code> element 
    * @return the new created instance of <code>DataSourceType<InterceptorType<T>></code> 
    */
   public DataSourceType<InterceptorType<T>> createDataSource()
   {
      return new DataSourceTypeImpl<InterceptorType<T>>(this, "data-source", childNode);
   }

   /**
    * Returns all <code>data-source</code> elements
    * @return list of <code>data-source</code> 
    */
   public List<DataSourceType<InterceptorType<T>>> getAllDataSource()
   {
      List<DataSourceType<InterceptorType<T>>> list = new ArrayList<DataSourceType<InterceptorType<T>>>();
      List<Node> nodeList = childNode.get("data-source");
      for(Node node: nodeList)
      {
         DataSourceType<InterceptorType<T>>  type = new DataSourceTypeImpl<InterceptorType<T>>(this, "data-source", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>data-source</code> elements 
    * @return the current instance of <code>DataSourceType<InterceptorType<T>></code> 
    */
   public InterceptorType<T> removeAllDataSource()
   {
      childNode.removeChildren("data-source");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: InterceptorType ElementName: javaee:jms-connection-factoryType ElementType : jms-connection-factory
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>jms-connection-factory</code> element will be created and returned.
    * Otherwise, the first existing <code>jms-connection-factory</code> element will be returned.
    * @return the instance defined for the element <code>jms-connection-factory</code> 
    */
   public JmsConnectionFactoryType<InterceptorType<T>> getOrCreateJmsConnectionFactory()
   {
      List<Node> nodeList = childNode.get("jms-connection-factory");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new JmsConnectionFactoryTypeImpl<InterceptorType<T>>(this, "jms-connection-factory", childNode, nodeList.get(0));
      }
      return createJmsConnectionFactory();
   }

   /**
    * Creates a new <code>jms-connection-factory</code> element 
    * @return the new created instance of <code>JmsConnectionFactoryType<InterceptorType<T>></code> 
    */
   public JmsConnectionFactoryType<InterceptorType<T>> createJmsConnectionFactory()
   {
      return new JmsConnectionFactoryTypeImpl<InterceptorType<T>>(this, "jms-connection-factory", childNode);
   }

   /**
    * Returns all <code>jms-connection-factory</code> elements
    * @return list of <code>jms-connection-factory</code> 
    */
   public List<JmsConnectionFactoryType<InterceptorType<T>>> getAllJmsConnectionFactory()
   {
      List<JmsConnectionFactoryType<InterceptorType<T>>> list = new ArrayList<JmsConnectionFactoryType<InterceptorType<T>>>();
      List<Node> nodeList = childNode.get("jms-connection-factory");
      for(Node node: nodeList)
      {
         JmsConnectionFactoryType<InterceptorType<T>>  type = new JmsConnectionFactoryTypeImpl<InterceptorType<T>>(this, "jms-connection-factory", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>jms-connection-factory</code> elements 
    * @return the current instance of <code>JmsConnectionFactoryType<InterceptorType<T>></code> 
    */
   public InterceptorType<T> removeAllJmsConnectionFactory()
   {
      childNode.removeChildren("jms-connection-factory");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: InterceptorType ElementName: javaee:jms-destinationType ElementType : jms-destination
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>jms-destination</code> element will be created and returned.
    * Otherwise, the first existing <code>jms-destination</code> element will be returned.
    * @return the instance defined for the element <code>jms-destination</code> 
    */
   public JmsDestinationType<InterceptorType<T>> getOrCreateJmsDestination()
   {
      List<Node> nodeList = childNode.get("jms-destination");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new JmsDestinationTypeImpl<InterceptorType<T>>(this, "jms-destination", childNode, nodeList.get(0));
      }
      return createJmsDestination();
   }

   /**
    * Creates a new <code>jms-destination</code> element 
    * @return the new created instance of <code>JmsDestinationType<InterceptorType<T>></code> 
    */
   public JmsDestinationType<InterceptorType<T>> createJmsDestination()
   {
      return new JmsDestinationTypeImpl<InterceptorType<T>>(this, "jms-destination", childNode);
   }

   /**
    * Returns all <code>jms-destination</code> elements
    * @return list of <code>jms-destination</code> 
    */
   public List<JmsDestinationType<InterceptorType<T>>> getAllJmsDestination()
   {
      List<JmsDestinationType<InterceptorType<T>>> list = new ArrayList<JmsDestinationType<InterceptorType<T>>>();
      List<Node> nodeList = childNode.get("jms-destination");
      for(Node node: nodeList)
      {
         JmsDestinationType<InterceptorType<T>>  type = new JmsDestinationTypeImpl<InterceptorType<T>>(this, "jms-destination", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>jms-destination</code> elements 
    * @return the current instance of <code>JmsDestinationType<InterceptorType<T>></code> 
    */
   public InterceptorType<T> removeAllJmsDestination()
   {
      childNode.removeChildren("jms-destination");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: InterceptorType ElementName: javaee:mail-sessionType ElementType : mail-session
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>mail-session</code> element will be created and returned.
    * Otherwise, the first existing <code>mail-session</code> element will be returned.
    * @return the instance defined for the element <code>mail-session</code> 
    */
   public MailSessionType<InterceptorType<T>> getOrCreateMailSession()
   {
      List<Node> nodeList = childNode.get("mail-session");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new MailSessionTypeImpl<InterceptorType<T>>(this, "mail-session", childNode, nodeList.get(0));
      }
      return createMailSession();
   }

   /**
    * Creates a new <code>mail-session</code> element 
    * @return the new created instance of <code>MailSessionType<InterceptorType<T>></code> 
    */
   public MailSessionType<InterceptorType<T>> createMailSession()
   {
      return new MailSessionTypeImpl<InterceptorType<T>>(this, "mail-session", childNode);
   }

   /**
    * Returns all <code>mail-session</code> elements
    * @return list of <code>mail-session</code> 
    */
   public List<MailSessionType<InterceptorType<T>>> getAllMailSession()
   {
      List<MailSessionType<InterceptorType<T>>> list = new ArrayList<MailSessionType<InterceptorType<T>>>();
      List<Node> nodeList = childNode.get("mail-session");
      for(Node node: nodeList)
      {
         MailSessionType<InterceptorType<T>>  type = new MailSessionTypeImpl<InterceptorType<T>>(this, "mail-session", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>mail-session</code> elements 
    * @return the current instance of <code>MailSessionType<InterceptorType<T>></code> 
    */
   public InterceptorType<T> removeAllMailSession()
   {
      childNode.removeChildren("mail-session");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: InterceptorType ElementName: javaee:connection-factory-resourceType ElementType : connection-factory
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>connection-factory</code> element will be created and returned.
    * Otherwise, the first existing <code>connection-factory</code> element will be returned.
    * @return the instance defined for the element <code>connection-factory</code> 
    */
   public ConnectionFactoryResourceType<InterceptorType<T>> getOrCreateConnectionFactory()
   {
      List<Node> nodeList = childNode.get("connection-factory");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ConnectionFactoryResourceTypeImpl<InterceptorType<T>>(this, "connection-factory", childNode, nodeList.get(0));
      }
      return createConnectionFactory();
   }

   /**
    * Creates a new <code>connection-factory</code> element 
    * @return the new created instance of <code>ConnectionFactoryResourceType<InterceptorType<T>></code> 
    */
   public ConnectionFactoryResourceType<InterceptorType<T>> createConnectionFactory()
   {
      return new ConnectionFactoryResourceTypeImpl<InterceptorType<T>>(this, "connection-factory", childNode);
   }

   /**
    * Returns all <code>connection-factory</code> elements
    * @return list of <code>connection-factory</code> 
    */
   public List<ConnectionFactoryResourceType<InterceptorType<T>>> getAllConnectionFactory()
   {
      List<ConnectionFactoryResourceType<InterceptorType<T>>> list = new ArrayList<ConnectionFactoryResourceType<InterceptorType<T>>>();
      List<Node> nodeList = childNode.get("connection-factory");
      for(Node node: nodeList)
      {
         ConnectionFactoryResourceType<InterceptorType<T>>  type = new ConnectionFactoryResourceTypeImpl<InterceptorType<T>>(this, "connection-factory", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>connection-factory</code> elements 
    * @return the current instance of <code>ConnectionFactoryResourceType<InterceptorType<T>></code> 
    */
   public InterceptorType<T> removeAllConnectionFactory()
   {
      childNode.removeChildren("connection-factory");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: InterceptorType ElementName: javaee:administered-objectType ElementType : administered-object
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>administered-object</code> element will be created and returned.
    * Otherwise, the first existing <code>administered-object</code> element will be returned.
    * @return the instance defined for the element <code>administered-object</code> 
    */
   public AdministeredObjectType<InterceptorType<T>> getOrCreateAdministeredObject()
   {
      List<Node> nodeList = childNode.get("administered-object");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new AdministeredObjectTypeImpl<InterceptorType<T>>(this, "administered-object", childNode, nodeList.get(0));
      }
      return createAdministeredObject();
   }

   /**
    * Creates a new <code>administered-object</code> element 
    * @return the new created instance of <code>AdministeredObjectType<InterceptorType<T>></code> 
    */
   public AdministeredObjectType<InterceptorType<T>> createAdministeredObject()
   {
      return new AdministeredObjectTypeImpl<InterceptorType<T>>(this, "administered-object", childNode);
   }

   /**
    * Returns all <code>administered-object</code> elements
    * @return list of <code>administered-object</code> 
    */
   public List<AdministeredObjectType<InterceptorType<T>>> getAllAdministeredObject()
   {
      List<AdministeredObjectType<InterceptorType<T>>> list = new ArrayList<AdministeredObjectType<InterceptorType<T>>>();
      List<Node> nodeList = childNode.get("administered-object");
      for(Node node: nodeList)
      {
         AdministeredObjectType<InterceptorType<T>>  type = new AdministeredObjectTypeImpl<InterceptorType<T>>(this, "administered-object", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>administered-object</code> elements 
    * @return the current instance of <code>AdministeredObjectType<InterceptorType<T>></code> 
    */
   public InterceptorType<T> removeAllAdministeredObject()
   {
      childNode.removeChildren("administered-object");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: InterceptorType ElementName: javaee:service-refType ElementType : service-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>service-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>service-ref</code> element will be returned.
    * @return the instance defined for the element <code>service-ref</code> 
    */
   public ServiceRefType<InterceptorType<T>> getOrCreateServiceRef()
   {
      List<Node> nodeList = childNode.get("service-ref");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ServiceRefTypeImpl<InterceptorType<T>>(this, "service-ref", childNode, nodeList.get(0));
      }
      return createServiceRef();
   }

   /**
    * Creates a new <code>service-ref</code> element 
    * @return the new created instance of <code>ServiceRefType<InterceptorType<T>></code> 
    */
   public ServiceRefType<InterceptorType<T>> createServiceRef()
   {
      return new ServiceRefTypeImpl<InterceptorType<T>>(this, "service-ref", childNode);
   }

   /**
    * Returns all <code>service-ref</code> elements
    * @return list of <code>service-ref</code> 
    */
   public List<ServiceRefType<InterceptorType<T>>> getAllServiceRef()
   {
      List<ServiceRefType<InterceptorType<T>>> list = new ArrayList<ServiceRefType<InterceptorType<T>>>();
      List<Node> nodeList = childNode.get("service-ref");
      for(Node node: nodeList)
      {
         ServiceRefType<InterceptorType<T>>  type = new ServiceRefTypeImpl<InterceptorType<T>>(this, "service-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>service-ref</code> elements 
    * @return the current instance of <code>ServiceRefType<InterceptorType<T>></code> 
    */
   public InterceptorType<T> removeAllServiceRef()
   {
      childNode.removeChildren("service-ref");
      return this;
   }
 
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
   public InterceptorType<T> description(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("description").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
public List<String> getAllDescription()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("description");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>InterceptorType<T></code> 
    */
   public InterceptorType<T> removeAllDescription()
   {
      childNode.removeChildren("description");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: InterceptorType ElementName: xsd:token ElementType : interceptor-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>interceptor-class</code> element
    * @param interceptorClass the value for the element <code>interceptor-class</code> 
    * @return the current instance of <code>InterceptorType<T></code> 
    */
   public InterceptorType<T> interceptorClass(String interceptorClass)
   {
      childNode.getOrCreate("interceptor-class").text(interceptorClass);
      return this;
   }

   /**
    * Returns the <code>interceptor-class</code> element
    * @return the node defined for the element <code>interceptor-class</code> 
    */
   public String getInterceptorClass()
   {
      return childNode.getTextValueForPatternName("interceptor-class");
   }

   /**
    * Removes the <code>interceptor-class</code> element 
    * @return the current instance of <code>InterceptorType<T></code> 
    */
   public InterceptorType<T> removeInterceptorClass()
   {
      childNode.removeChildren("interceptor-class");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: InterceptorType ElementName: javaee:around-invokeType ElementType : around-invoke
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>around-invoke</code> element will be created and returned.
    * Otherwise, the first existing <code>around-invoke</code> element will be returned.
    * @return the instance defined for the element <code>around-invoke</code> 
    */
   public AroundInvokeType<InterceptorType<T>> getOrCreateAroundInvoke()
   {
      List<Node> nodeList = childNode.get("around-invoke");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new AroundInvokeTypeImpl<InterceptorType<T>>(this, "around-invoke", childNode, nodeList.get(0));
      }
      return createAroundInvoke();
   }

   /**
    * Creates a new <code>around-invoke</code> element 
    * @return the new created instance of <code>AroundInvokeType<InterceptorType<T>></code> 
    */
   public AroundInvokeType<InterceptorType<T>> createAroundInvoke()
   {
      return new AroundInvokeTypeImpl<InterceptorType<T>>(this, "around-invoke", childNode);
   }

   /**
    * Returns all <code>around-invoke</code> elements
    * @return list of <code>around-invoke</code> 
    */
   public List<AroundInvokeType<InterceptorType<T>>> getAllAroundInvoke()
   {
      List<AroundInvokeType<InterceptorType<T>>> list = new ArrayList<AroundInvokeType<InterceptorType<T>>>();
      List<Node> nodeList = childNode.get("around-invoke");
      for(Node node: nodeList)
      {
         AroundInvokeType<InterceptorType<T>>  type = new AroundInvokeTypeImpl<InterceptorType<T>>(this, "around-invoke", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>around-invoke</code> elements 
    * @return the current instance of <code>AroundInvokeType<InterceptorType<T>></code> 
    */
   public InterceptorType<T> removeAllAroundInvoke()
   {
      childNode.removeChildren("around-invoke");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: InterceptorType ElementName: javaee:around-timeoutType ElementType : around-timeout
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>around-timeout</code> element will be created and returned.
    * Otherwise, the first existing <code>around-timeout</code> element will be returned.
    * @return the instance defined for the element <code>around-timeout</code> 
    */
   public AroundTimeoutType<InterceptorType<T>> getOrCreateAroundTimeout()
   {
      List<Node> nodeList = childNode.get("around-timeout");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new AroundTimeoutTypeImpl<InterceptorType<T>>(this, "around-timeout", childNode, nodeList.get(0));
      }
      return createAroundTimeout();
   }

   /**
    * Creates a new <code>around-timeout</code> element 
    * @return the new created instance of <code>AroundTimeoutType<InterceptorType<T>></code> 
    */
   public AroundTimeoutType<InterceptorType<T>> createAroundTimeout()
   {
      return new AroundTimeoutTypeImpl<InterceptorType<T>>(this, "around-timeout", childNode);
   }

   /**
    * Returns all <code>around-timeout</code> elements
    * @return list of <code>around-timeout</code> 
    */
   public List<AroundTimeoutType<InterceptorType<T>>> getAllAroundTimeout()
   {
      List<AroundTimeoutType<InterceptorType<T>>> list = new ArrayList<AroundTimeoutType<InterceptorType<T>>>();
      List<Node> nodeList = childNode.get("around-timeout");
      for(Node node: nodeList)
      {
         AroundTimeoutType<InterceptorType<T>>  type = new AroundTimeoutTypeImpl<InterceptorType<T>>(this, "around-timeout", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>around-timeout</code> elements 
    * @return the current instance of <code>AroundTimeoutType<InterceptorType<T>></code> 
    */
   public InterceptorType<T> removeAllAroundTimeout()
   {
      childNode.removeChildren("around-timeout");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: InterceptorType ElementName: javaee:lifecycle-callbackType ElementType : around-construct
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>around-construct</code> element will be created and returned.
    * Otherwise, the first existing <code>around-construct</code> element will be returned.
    * @return the instance defined for the element <code>around-construct</code> 
    */
   public LifecycleCallbackType<InterceptorType<T>> getOrCreateAroundConstruct()
   {
      List<Node> nodeList = childNode.get("around-construct");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new LifecycleCallbackTypeImpl<InterceptorType<T>>(this, "around-construct", childNode, nodeList.get(0));
      }
      return createAroundConstruct();
   }

   /**
    * Creates a new <code>around-construct</code> element 
    * @return the new created instance of <code>LifecycleCallbackType<InterceptorType<T>></code> 
    */
   public LifecycleCallbackType<InterceptorType<T>> createAroundConstruct()
   {
      return new LifecycleCallbackTypeImpl<InterceptorType<T>>(this, "around-construct", childNode);
   }

   /**
    * Returns all <code>around-construct</code> elements
    * @return list of <code>around-construct</code> 
    */
   public List<LifecycleCallbackType<InterceptorType<T>>> getAllAroundConstruct()
   {
      List<LifecycleCallbackType<InterceptorType<T>>> list = new ArrayList<LifecycleCallbackType<InterceptorType<T>>>();
      List<Node> nodeList = childNode.get("around-construct");
      for(Node node: nodeList)
      {
         LifecycleCallbackType<InterceptorType<T>>  type = new LifecycleCallbackTypeImpl<InterceptorType<T>>(this, "around-construct", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>around-construct</code> elements 
    * @return the current instance of <code>LifecycleCallbackType<InterceptorType<T>></code> 
    */
   public InterceptorType<T> removeAllAroundConstruct()
   {
      childNode.removeChildren("around-construct");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: InterceptorType ElementName: javaee:lifecycle-callbackType ElementType : post-activate
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>post-activate</code> element will be created and returned.
    * Otherwise, the first existing <code>post-activate</code> element will be returned.
    * @return the instance defined for the element <code>post-activate</code> 
    */
   public LifecycleCallbackType<InterceptorType<T>> getOrCreatePostActivate()
   {
      List<Node> nodeList = childNode.get("post-activate");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new LifecycleCallbackTypeImpl<InterceptorType<T>>(this, "post-activate", childNode, nodeList.get(0));
      }
      return createPostActivate();
   }

   /**
    * Creates a new <code>post-activate</code> element 
    * @return the new created instance of <code>LifecycleCallbackType<InterceptorType<T>></code> 
    */
   public LifecycleCallbackType<InterceptorType<T>> createPostActivate()
   {
      return new LifecycleCallbackTypeImpl<InterceptorType<T>>(this, "post-activate", childNode);
   }

   /**
    * Returns all <code>post-activate</code> elements
    * @return list of <code>post-activate</code> 
    */
   public List<LifecycleCallbackType<InterceptorType<T>>> getAllPostActivate()
   {
      List<LifecycleCallbackType<InterceptorType<T>>> list = new ArrayList<LifecycleCallbackType<InterceptorType<T>>>();
      List<Node> nodeList = childNode.get("post-activate");
      for(Node node: nodeList)
      {
         LifecycleCallbackType<InterceptorType<T>>  type = new LifecycleCallbackTypeImpl<InterceptorType<T>>(this, "post-activate", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>post-activate</code> elements 
    * @return the current instance of <code>LifecycleCallbackType<InterceptorType<T>></code> 
    */
   public InterceptorType<T> removeAllPostActivate()
   {
      childNode.removeChildren("post-activate");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: InterceptorType ElementName: javaee:lifecycle-callbackType ElementType : pre-passivate
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>pre-passivate</code> element will be created and returned.
    * Otherwise, the first existing <code>pre-passivate</code> element will be returned.
    * @return the instance defined for the element <code>pre-passivate</code> 
    */
   public LifecycleCallbackType<InterceptorType<T>> getOrCreatePrePassivate()
   {
      List<Node> nodeList = childNode.get("pre-passivate");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new LifecycleCallbackTypeImpl<InterceptorType<T>>(this, "pre-passivate", childNode, nodeList.get(0));
      }
      return createPrePassivate();
   }

   /**
    * Creates a new <code>pre-passivate</code> element 
    * @return the new created instance of <code>LifecycleCallbackType<InterceptorType<T>></code> 
    */
   public LifecycleCallbackType<InterceptorType<T>> createPrePassivate()
   {
      return new LifecycleCallbackTypeImpl<InterceptorType<T>>(this, "pre-passivate", childNode);
   }

   /**
    * Returns all <code>pre-passivate</code> elements
    * @return list of <code>pre-passivate</code> 
    */
   public List<LifecycleCallbackType<InterceptorType<T>>> getAllPrePassivate()
   {
      List<LifecycleCallbackType<InterceptorType<T>>> list = new ArrayList<LifecycleCallbackType<InterceptorType<T>>>();
      List<Node> nodeList = childNode.get("pre-passivate");
      for(Node node: nodeList)
      {
         LifecycleCallbackType<InterceptorType<T>>  type = new LifecycleCallbackTypeImpl<InterceptorType<T>>(this, "pre-passivate", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>pre-passivate</code> elements 
    * @return the current instance of <code>LifecycleCallbackType<InterceptorType<T>></code> 
    */
   public InterceptorType<T> removeAllPrePassivate()
   {
      childNode.removeChildren("pre-passivate");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: InterceptorType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>InterceptorType<T></code> 
    */
   public InterceptorType<T> id(String id)
   {
      childNode.attribute("id", id);
      return this;
   }

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
      public String getId()
   {
      return childNode.getAttribute("id");
   }

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>InterceptorType<T></code> 
    */
   public InterceptorType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
