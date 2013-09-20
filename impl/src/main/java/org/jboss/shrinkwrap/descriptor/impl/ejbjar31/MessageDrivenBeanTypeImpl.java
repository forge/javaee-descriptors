package org.jboss.shrinkwrap.descriptor.impl.ejbjar31; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.ActivationConfigType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.AroundInvokeType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.AroundTimeoutType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.MessageDrivenBeanType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.NamedMethodType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.SecurityIdentityType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.TimerType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.TransactionTypeType;
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
import org.jboss.shrinkwrap.descriptor.impl.javaee6.DataSourceTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.EjbLocalRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.EjbRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.EnvEntryTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.IconTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.LifecycleCallbackTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.MessageDestinationRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.PersistenceContextRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.PersistenceUnitRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.ResourceEnvRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.ResourceRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.SecurityRoleRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaeewebservicesclient13.ServiceRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> message-driven-beanType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class MessageDrivenBeanTypeImpl<T> implements Child<T>, MessageDrivenBeanType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public MessageDrivenBeanTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public MessageDrivenBeanTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
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
   public MessageDrivenBeanType<T> description(String ... values)
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
    * @return the current instance of <code>MessageDrivenBeanType<T></code> 
    */
   public MessageDrivenBeanType<T> removeAllDescription()
   {
      childNode.removeChildren("description");
      return this;
   }
 
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
   public MessageDrivenBeanType<T> displayName(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("display-name").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>display-name</code> elements
    * @return list of <code>display-name</code> 
    */
public List<String> getAllDisplayName()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("display-name");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>display-name</code> element 
    * @return the current instance of <code>MessageDrivenBeanType<T></code> 
    */
   public MessageDrivenBeanType<T> removeAllDisplayName()
   {
      childNode.removeChildren("display-name");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageDrivenBeanType ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<MessageDrivenBeanType<T>> getOrCreateIcon()
   {
      List<Node> nodeList = childNode.get("icon");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new IconTypeImpl<MessageDrivenBeanType<T>>(this, "icon", childNode, nodeList.get(0));
      }
      return createIcon();
   }

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<MessageDrivenBeanType<T>></code> 
    */
   public IconType<MessageDrivenBeanType<T>> createIcon()
   {
      return new IconTypeImpl<MessageDrivenBeanType<T>>(this, "icon", childNode);
   }

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<MessageDrivenBeanType<T>>> getAllIcon()
   {
      List<IconType<MessageDrivenBeanType<T>>> list = new ArrayList<IconType<MessageDrivenBeanType<T>>>();
      List<Node> nodeList = childNode.get("icon");
      for(Node node: nodeList)
      {
         IconType<MessageDrivenBeanType<T>>  type = new IconTypeImpl<MessageDrivenBeanType<T>>(this, "icon", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<MessageDrivenBeanType<T>></code> 
    */
   public MessageDrivenBeanType<T> removeAllIcon()
   {
      childNode.removeChildren("icon");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageDrivenBeanType ElementName: javaee:env-entryType ElementType : env-entry
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>env-entry</code> element will be created and returned.
    * Otherwise, the first existing <code>env-entry</code> element will be returned.
    * @return the instance defined for the element <code>env-entry</code> 
    */
   public EnvEntryType<MessageDrivenBeanType<T>> getOrCreateEnvEntry()
   {
      List<Node> nodeList = childNode.get("env-entry");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new EnvEntryTypeImpl<MessageDrivenBeanType<T>>(this, "env-entry", childNode, nodeList.get(0));
      }
      return createEnvEntry();
   }

   /**
    * Creates a new <code>env-entry</code> element 
    * @return the new created instance of <code>EnvEntryType<MessageDrivenBeanType<T>></code> 
    */
   public EnvEntryType<MessageDrivenBeanType<T>> createEnvEntry()
   {
      return new EnvEntryTypeImpl<MessageDrivenBeanType<T>>(this, "env-entry", childNode);
   }

   /**
    * Returns all <code>env-entry</code> elements
    * @return list of <code>env-entry</code> 
    */
   public List<EnvEntryType<MessageDrivenBeanType<T>>> getAllEnvEntry()
   {
      List<EnvEntryType<MessageDrivenBeanType<T>>> list = new ArrayList<EnvEntryType<MessageDrivenBeanType<T>>>();
      List<Node> nodeList = childNode.get("env-entry");
      for(Node node: nodeList)
      {
         EnvEntryType<MessageDrivenBeanType<T>>  type = new EnvEntryTypeImpl<MessageDrivenBeanType<T>>(this, "env-entry", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>env-entry</code> elements 
    * @return the current instance of <code>EnvEntryType<MessageDrivenBeanType<T>></code> 
    */
   public MessageDrivenBeanType<T> removeAllEnvEntry()
   {
      childNode.removeChildren("env-entry");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageDrivenBeanType ElementName: javaee:ejb-refType ElementType : ejb-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>ejb-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>ejb-ref</code> element will be returned.
    * @return the instance defined for the element <code>ejb-ref</code> 
    */
   public EjbRefType<MessageDrivenBeanType<T>> getOrCreateEjbRef()
   {
      List<Node> nodeList = childNode.get("ejb-ref");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new EjbRefTypeImpl<MessageDrivenBeanType<T>>(this, "ejb-ref", childNode, nodeList.get(0));
      }
      return createEjbRef();
   }

   /**
    * Creates a new <code>ejb-ref</code> element 
    * @return the new created instance of <code>EjbRefType<MessageDrivenBeanType<T>></code> 
    */
   public EjbRefType<MessageDrivenBeanType<T>> createEjbRef()
   {
      return new EjbRefTypeImpl<MessageDrivenBeanType<T>>(this, "ejb-ref", childNode);
   }

   /**
    * Returns all <code>ejb-ref</code> elements
    * @return list of <code>ejb-ref</code> 
    */
   public List<EjbRefType<MessageDrivenBeanType<T>>> getAllEjbRef()
   {
      List<EjbRefType<MessageDrivenBeanType<T>>> list = new ArrayList<EjbRefType<MessageDrivenBeanType<T>>>();
      List<Node> nodeList = childNode.get("ejb-ref");
      for(Node node: nodeList)
      {
         EjbRefType<MessageDrivenBeanType<T>>  type = new EjbRefTypeImpl<MessageDrivenBeanType<T>>(this, "ejb-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>ejb-ref</code> elements 
    * @return the current instance of <code>EjbRefType<MessageDrivenBeanType<T>></code> 
    */
   public MessageDrivenBeanType<T> removeAllEjbRef()
   {
      childNode.removeChildren("ejb-ref");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageDrivenBeanType ElementName: javaee:ejb-local-refType ElementType : ejb-local-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>ejb-local-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>ejb-local-ref</code> element will be returned.
    * @return the instance defined for the element <code>ejb-local-ref</code> 
    */
   public EjbLocalRefType<MessageDrivenBeanType<T>> getOrCreateEjbLocalRef()
   {
      List<Node> nodeList = childNode.get("ejb-local-ref");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new EjbLocalRefTypeImpl<MessageDrivenBeanType<T>>(this, "ejb-local-ref", childNode, nodeList.get(0));
      }
      return createEjbLocalRef();
   }

   /**
    * Creates a new <code>ejb-local-ref</code> element 
    * @return the new created instance of <code>EjbLocalRefType<MessageDrivenBeanType<T>></code> 
    */
   public EjbLocalRefType<MessageDrivenBeanType<T>> createEjbLocalRef()
   {
      return new EjbLocalRefTypeImpl<MessageDrivenBeanType<T>>(this, "ejb-local-ref", childNode);
   }

   /**
    * Returns all <code>ejb-local-ref</code> elements
    * @return list of <code>ejb-local-ref</code> 
    */
   public List<EjbLocalRefType<MessageDrivenBeanType<T>>> getAllEjbLocalRef()
   {
      List<EjbLocalRefType<MessageDrivenBeanType<T>>> list = new ArrayList<EjbLocalRefType<MessageDrivenBeanType<T>>>();
      List<Node> nodeList = childNode.get("ejb-local-ref");
      for(Node node: nodeList)
      {
         EjbLocalRefType<MessageDrivenBeanType<T>>  type = new EjbLocalRefTypeImpl<MessageDrivenBeanType<T>>(this, "ejb-local-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>ejb-local-ref</code> elements 
    * @return the current instance of <code>EjbLocalRefType<MessageDrivenBeanType<T>></code> 
    */
   public MessageDrivenBeanType<T> removeAllEjbLocalRef()
   {
      childNode.removeChildren("ejb-local-ref");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageDrivenBeanType ElementName: javaee:resource-refType ElementType : resource-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>resource-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>resource-ref</code> element will be returned.
    * @return the instance defined for the element <code>resource-ref</code> 
    */
   public ResourceRefType<MessageDrivenBeanType<T>> getOrCreateResourceRef()
   {
      List<Node> nodeList = childNode.get("resource-ref");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ResourceRefTypeImpl<MessageDrivenBeanType<T>>(this, "resource-ref", childNode, nodeList.get(0));
      }
      return createResourceRef();
   }

   /**
    * Creates a new <code>resource-ref</code> element 
    * @return the new created instance of <code>ResourceRefType<MessageDrivenBeanType<T>></code> 
    */
   public ResourceRefType<MessageDrivenBeanType<T>> createResourceRef()
   {
      return new ResourceRefTypeImpl<MessageDrivenBeanType<T>>(this, "resource-ref", childNode);
   }

   /**
    * Returns all <code>resource-ref</code> elements
    * @return list of <code>resource-ref</code> 
    */
   public List<ResourceRefType<MessageDrivenBeanType<T>>> getAllResourceRef()
   {
      List<ResourceRefType<MessageDrivenBeanType<T>>> list = new ArrayList<ResourceRefType<MessageDrivenBeanType<T>>>();
      List<Node> nodeList = childNode.get("resource-ref");
      for(Node node: nodeList)
      {
         ResourceRefType<MessageDrivenBeanType<T>>  type = new ResourceRefTypeImpl<MessageDrivenBeanType<T>>(this, "resource-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>resource-ref</code> elements 
    * @return the current instance of <code>ResourceRefType<MessageDrivenBeanType<T>></code> 
    */
   public MessageDrivenBeanType<T> removeAllResourceRef()
   {
      childNode.removeChildren("resource-ref");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageDrivenBeanType ElementName: javaee:resource-env-refType ElementType : resource-env-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>resource-env-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>resource-env-ref</code> element will be returned.
    * @return the instance defined for the element <code>resource-env-ref</code> 
    */
   public ResourceEnvRefType<MessageDrivenBeanType<T>> getOrCreateResourceEnvRef()
   {
      List<Node> nodeList = childNode.get("resource-env-ref");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ResourceEnvRefTypeImpl<MessageDrivenBeanType<T>>(this, "resource-env-ref", childNode, nodeList.get(0));
      }
      return createResourceEnvRef();
   }

   /**
    * Creates a new <code>resource-env-ref</code> element 
    * @return the new created instance of <code>ResourceEnvRefType<MessageDrivenBeanType<T>></code> 
    */
   public ResourceEnvRefType<MessageDrivenBeanType<T>> createResourceEnvRef()
   {
      return new ResourceEnvRefTypeImpl<MessageDrivenBeanType<T>>(this, "resource-env-ref", childNode);
   }

   /**
    * Returns all <code>resource-env-ref</code> elements
    * @return list of <code>resource-env-ref</code> 
    */
   public List<ResourceEnvRefType<MessageDrivenBeanType<T>>> getAllResourceEnvRef()
   {
      List<ResourceEnvRefType<MessageDrivenBeanType<T>>> list = new ArrayList<ResourceEnvRefType<MessageDrivenBeanType<T>>>();
      List<Node> nodeList = childNode.get("resource-env-ref");
      for(Node node: nodeList)
      {
         ResourceEnvRefType<MessageDrivenBeanType<T>>  type = new ResourceEnvRefTypeImpl<MessageDrivenBeanType<T>>(this, "resource-env-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>resource-env-ref</code> elements 
    * @return the current instance of <code>ResourceEnvRefType<MessageDrivenBeanType<T>></code> 
    */
   public MessageDrivenBeanType<T> removeAllResourceEnvRef()
   {
      childNode.removeChildren("resource-env-ref");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageDrivenBeanType ElementName: javaee:message-destination-refType ElementType : message-destination-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>message-destination-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>message-destination-ref</code> element will be returned.
    * @return the instance defined for the element <code>message-destination-ref</code> 
    */
   public MessageDestinationRefType<MessageDrivenBeanType<T>> getOrCreateMessageDestinationRef()
   {
      List<Node> nodeList = childNode.get("message-destination-ref");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new MessageDestinationRefTypeImpl<MessageDrivenBeanType<T>>(this, "message-destination-ref", childNode, nodeList.get(0));
      }
      return createMessageDestinationRef();
   }

   /**
    * Creates a new <code>message-destination-ref</code> element 
    * @return the new created instance of <code>MessageDestinationRefType<MessageDrivenBeanType<T>></code> 
    */
   public MessageDestinationRefType<MessageDrivenBeanType<T>> createMessageDestinationRef()
   {
      return new MessageDestinationRefTypeImpl<MessageDrivenBeanType<T>>(this, "message-destination-ref", childNode);
   }

   /**
    * Returns all <code>message-destination-ref</code> elements
    * @return list of <code>message-destination-ref</code> 
    */
   public List<MessageDestinationRefType<MessageDrivenBeanType<T>>> getAllMessageDestinationRef()
   {
      List<MessageDestinationRefType<MessageDrivenBeanType<T>>> list = new ArrayList<MessageDestinationRefType<MessageDrivenBeanType<T>>>();
      List<Node> nodeList = childNode.get("message-destination-ref");
      for(Node node: nodeList)
      {
         MessageDestinationRefType<MessageDrivenBeanType<T>>  type = new MessageDestinationRefTypeImpl<MessageDrivenBeanType<T>>(this, "message-destination-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>message-destination-ref</code> elements 
    * @return the current instance of <code>MessageDestinationRefType<MessageDrivenBeanType<T>></code> 
    */
   public MessageDrivenBeanType<T> removeAllMessageDestinationRef()
   {
      childNode.removeChildren("message-destination-ref");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageDrivenBeanType ElementName: javaee:persistence-context-refType ElementType : persistence-context-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>persistence-context-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>persistence-context-ref</code> element will be returned.
    * @return the instance defined for the element <code>persistence-context-ref</code> 
    */
   public PersistenceContextRefType<MessageDrivenBeanType<T>> getOrCreatePersistenceContextRef()
   {
      List<Node> nodeList = childNode.get("persistence-context-ref");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new PersistenceContextRefTypeImpl<MessageDrivenBeanType<T>>(this, "persistence-context-ref", childNode, nodeList.get(0));
      }
      return createPersistenceContextRef();
   }

   /**
    * Creates a new <code>persistence-context-ref</code> element 
    * @return the new created instance of <code>PersistenceContextRefType<MessageDrivenBeanType<T>></code> 
    */
   public PersistenceContextRefType<MessageDrivenBeanType<T>> createPersistenceContextRef()
   {
      return new PersistenceContextRefTypeImpl<MessageDrivenBeanType<T>>(this, "persistence-context-ref", childNode);
   }

   /**
    * Returns all <code>persistence-context-ref</code> elements
    * @return list of <code>persistence-context-ref</code> 
    */
   public List<PersistenceContextRefType<MessageDrivenBeanType<T>>> getAllPersistenceContextRef()
   {
      List<PersistenceContextRefType<MessageDrivenBeanType<T>>> list = new ArrayList<PersistenceContextRefType<MessageDrivenBeanType<T>>>();
      List<Node> nodeList = childNode.get("persistence-context-ref");
      for(Node node: nodeList)
      {
         PersistenceContextRefType<MessageDrivenBeanType<T>>  type = new PersistenceContextRefTypeImpl<MessageDrivenBeanType<T>>(this, "persistence-context-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>persistence-context-ref</code> elements 
    * @return the current instance of <code>PersistenceContextRefType<MessageDrivenBeanType<T>></code> 
    */
   public MessageDrivenBeanType<T> removeAllPersistenceContextRef()
   {
      childNode.removeChildren("persistence-context-ref");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageDrivenBeanType ElementName: javaee:persistence-unit-refType ElementType : persistence-unit-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>persistence-unit-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>persistence-unit-ref</code> element will be returned.
    * @return the instance defined for the element <code>persistence-unit-ref</code> 
    */
   public PersistenceUnitRefType<MessageDrivenBeanType<T>> getOrCreatePersistenceUnitRef()
   {
      List<Node> nodeList = childNode.get("persistence-unit-ref");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new PersistenceUnitRefTypeImpl<MessageDrivenBeanType<T>>(this, "persistence-unit-ref", childNode, nodeList.get(0));
      }
      return createPersistenceUnitRef();
   }

   /**
    * Creates a new <code>persistence-unit-ref</code> element 
    * @return the new created instance of <code>PersistenceUnitRefType<MessageDrivenBeanType<T>></code> 
    */
   public PersistenceUnitRefType<MessageDrivenBeanType<T>> createPersistenceUnitRef()
   {
      return new PersistenceUnitRefTypeImpl<MessageDrivenBeanType<T>>(this, "persistence-unit-ref", childNode);
   }

   /**
    * Returns all <code>persistence-unit-ref</code> elements
    * @return list of <code>persistence-unit-ref</code> 
    */
   public List<PersistenceUnitRefType<MessageDrivenBeanType<T>>> getAllPersistenceUnitRef()
   {
      List<PersistenceUnitRefType<MessageDrivenBeanType<T>>> list = new ArrayList<PersistenceUnitRefType<MessageDrivenBeanType<T>>>();
      List<Node> nodeList = childNode.get("persistence-unit-ref");
      for(Node node: nodeList)
      {
         PersistenceUnitRefType<MessageDrivenBeanType<T>>  type = new PersistenceUnitRefTypeImpl<MessageDrivenBeanType<T>>(this, "persistence-unit-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>persistence-unit-ref</code> elements 
    * @return the current instance of <code>PersistenceUnitRefType<MessageDrivenBeanType<T>></code> 
    */
   public MessageDrivenBeanType<T> removeAllPersistenceUnitRef()
   {
      childNode.removeChildren("persistence-unit-ref");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageDrivenBeanType ElementName: javaee:lifecycle-callbackType ElementType : post-construct
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>post-construct</code> element will be created and returned.
    * Otherwise, the first existing <code>post-construct</code> element will be returned.
    * @return the instance defined for the element <code>post-construct</code> 
    */
   public LifecycleCallbackType<MessageDrivenBeanType<T>> getOrCreatePostConstruct()
   {
      List<Node> nodeList = childNode.get("post-construct");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new LifecycleCallbackTypeImpl<MessageDrivenBeanType<T>>(this, "post-construct", childNode, nodeList.get(0));
      }
      return createPostConstruct();
   }

   /**
    * Creates a new <code>post-construct</code> element 
    * @return the new created instance of <code>LifecycleCallbackType<MessageDrivenBeanType<T>></code> 
    */
   public LifecycleCallbackType<MessageDrivenBeanType<T>> createPostConstruct()
   {
      return new LifecycleCallbackTypeImpl<MessageDrivenBeanType<T>>(this, "post-construct", childNode);
   }

   /**
    * Returns all <code>post-construct</code> elements
    * @return list of <code>post-construct</code> 
    */
   public List<LifecycleCallbackType<MessageDrivenBeanType<T>>> getAllPostConstruct()
   {
      List<LifecycleCallbackType<MessageDrivenBeanType<T>>> list = new ArrayList<LifecycleCallbackType<MessageDrivenBeanType<T>>>();
      List<Node> nodeList = childNode.get("post-construct");
      for(Node node: nodeList)
      {
         LifecycleCallbackType<MessageDrivenBeanType<T>>  type = new LifecycleCallbackTypeImpl<MessageDrivenBeanType<T>>(this, "post-construct", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>post-construct</code> elements 
    * @return the current instance of <code>LifecycleCallbackType<MessageDrivenBeanType<T>></code> 
    */
   public MessageDrivenBeanType<T> removeAllPostConstruct()
   {
      childNode.removeChildren("post-construct");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageDrivenBeanType ElementName: javaee:lifecycle-callbackType ElementType : pre-destroy
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>pre-destroy</code> element will be created and returned.
    * Otherwise, the first existing <code>pre-destroy</code> element will be returned.
    * @return the instance defined for the element <code>pre-destroy</code> 
    */
   public LifecycleCallbackType<MessageDrivenBeanType<T>> getOrCreatePreDestroy()
   {
      List<Node> nodeList = childNode.get("pre-destroy");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new LifecycleCallbackTypeImpl<MessageDrivenBeanType<T>>(this, "pre-destroy", childNode, nodeList.get(0));
      }
      return createPreDestroy();
   }

   /**
    * Creates a new <code>pre-destroy</code> element 
    * @return the new created instance of <code>LifecycleCallbackType<MessageDrivenBeanType<T>></code> 
    */
   public LifecycleCallbackType<MessageDrivenBeanType<T>> createPreDestroy()
   {
      return new LifecycleCallbackTypeImpl<MessageDrivenBeanType<T>>(this, "pre-destroy", childNode);
   }

   /**
    * Returns all <code>pre-destroy</code> elements
    * @return list of <code>pre-destroy</code> 
    */
   public List<LifecycleCallbackType<MessageDrivenBeanType<T>>> getAllPreDestroy()
   {
      List<LifecycleCallbackType<MessageDrivenBeanType<T>>> list = new ArrayList<LifecycleCallbackType<MessageDrivenBeanType<T>>>();
      List<Node> nodeList = childNode.get("pre-destroy");
      for(Node node: nodeList)
      {
         LifecycleCallbackType<MessageDrivenBeanType<T>>  type = new LifecycleCallbackTypeImpl<MessageDrivenBeanType<T>>(this, "pre-destroy", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>pre-destroy</code> elements 
    * @return the current instance of <code>LifecycleCallbackType<MessageDrivenBeanType<T>></code> 
    */
   public MessageDrivenBeanType<T> removeAllPreDestroy()
   {
      childNode.removeChildren("pre-destroy");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageDrivenBeanType ElementName: javaee:data-sourceType ElementType : data-source
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>data-source</code> element will be created and returned.
    * Otherwise, the first existing <code>data-source</code> element will be returned.
    * @return the instance defined for the element <code>data-source</code> 
    */
   public DataSourceType<MessageDrivenBeanType<T>> getOrCreateDataSource()
   {
      List<Node> nodeList = childNode.get("data-source");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new DataSourceTypeImpl<MessageDrivenBeanType<T>>(this, "data-source", childNode, nodeList.get(0));
      }
      return createDataSource();
   }

   /**
    * Creates a new <code>data-source</code> element 
    * @return the new created instance of <code>DataSourceType<MessageDrivenBeanType<T>></code> 
    */
   public DataSourceType<MessageDrivenBeanType<T>> createDataSource()
   {
      return new DataSourceTypeImpl<MessageDrivenBeanType<T>>(this, "data-source", childNode);
   }

   /**
    * Returns all <code>data-source</code> elements
    * @return list of <code>data-source</code> 
    */
   public List<DataSourceType<MessageDrivenBeanType<T>>> getAllDataSource()
   {
      List<DataSourceType<MessageDrivenBeanType<T>>> list = new ArrayList<DataSourceType<MessageDrivenBeanType<T>>>();
      List<Node> nodeList = childNode.get("data-source");
      for(Node node: nodeList)
      {
         DataSourceType<MessageDrivenBeanType<T>>  type = new DataSourceTypeImpl<MessageDrivenBeanType<T>>(this, "data-source", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>data-source</code> elements 
    * @return the current instance of <code>DataSourceType<MessageDrivenBeanType<T>></code> 
    */
   public MessageDrivenBeanType<T> removeAllDataSource()
   {
      childNode.removeChildren("data-source");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageDrivenBeanType ElementName: javaee:service-refType ElementType : service-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>service-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>service-ref</code> element will be returned.
    * @return the instance defined for the element <code>service-ref</code> 
    */
   public ServiceRefType<MessageDrivenBeanType<T>> getOrCreateServiceRef()
   {
      List<Node> nodeList = childNode.get("service-ref");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ServiceRefTypeImpl<MessageDrivenBeanType<T>>(this, "service-ref", childNode, nodeList.get(0));
      }
      return createServiceRef();
   }

   /**
    * Creates a new <code>service-ref</code> element 
    * @return the new created instance of <code>ServiceRefType<MessageDrivenBeanType<T>></code> 
    */
   public ServiceRefType<MessageDrivenBeanType<T>> createServiceRef()
   {
      return new ServiceRefTypeImpl<MessageDrivenBeanType<T>>(this, "service-ref", childNode);
   }

   /**
    * Returns all <code>service-ref</code> elements
    * @return list of <code>service-ref</code> 
    */
   public List<ServiceRefType<MessageDrivenBeanType<T>>> getAllServiceRef()
   {
      List<ServiceRefType<MessageDrivenBeanType<T>>> list = new ArrayList<ServiceRefType<MessageDrivenBeanType<T>>>();
      List<Node> nodeList = childNode.get("service-ref");
      for(Node node: nodeList)
      {
         ServiceRefType<MessageDrivenBeanType<T>>  type = new ServiceRefTypeImpl<MessageDrivenBeanType<T>>(this, "service-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>service-ref</code> elements 
    * @return the current instance of <code>ServiceRefType<MessageDrivenBeanType<T>></code> 
    */
   public MessageDrivenBeanType<T> removeAllServiceRef()
   {
      childNode.removeChildren("service-ref");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageDrivenBeanType ElementName: javaee:xsdNMTOKENType ElementType : ejb-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>ejb-name</code> element
    * @param ejbName the value for the element <code>ejb-name</code> 
    * @return the current instance of <code>MessageDrivenBeanType<T></code> 
    */
   public MessageDrivenBeanType<T> ejbName(String ejbName)
   {
      childNode.getOrCreate("ejb-name").text(ejbName);
      return this;
   }

   /**
    * Returns the <code>ejb-name</code> element
    * @return the node defined for the element <code>ejb-name</code> 
    */
   public String getEjbName()
   {
      return childNode.getTextValueForPatternName("ejb-name");
   }

   /**
    * Removes the <code>ejb-name</code> element 
    * @return the current instance of <code>MessageDrivenBeanType<T></code> 
    */
   public MessageDrivenBeanType<T> removeEjbName()
   {
      childNode.removeChildren("ejb-name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageDrivenBeanType ElementName: xsd:string ElementType : mapped-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>mapped-name</code> element
    * @param mappedName the value for the element <code>mapped-name</code> 
    * @return the current instance of <code>MessageDrivenBeanType<T></code> 
    */
   public MessageDrivenBeanType<T> mappedName(String mappedName)
   {
      childNode.getOrCreate("mapped-name").text(mappedName);
      return this;
   }

   /**
    * Returns the <code>mapped-name</code> element
    * @return the node defined for the element <code>mapped-name</code> 
    */
   public String getMappedName()
   {
      return childNode.getTextValueForPatternName("mapped-name");
   }

   /**
    * Removes the <code>mapped-name</code> element 
    * @return the current instance of <code>MessageDrivenBeanType<T></code> 
    */
   public MessageDrivenBeanType<T> removeMappedName()
   {
      childNode.removeChildren("mapped-name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageDrivenBeanType ElementName: javaee:fully-qualified-classType ElementType : ejb-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>ejb-class</code> element
    * @param ejbClass the value for the element <code>ejb-class</code> 
    * @return the current instance of <code>MessageDrivenBeanType<T></code> 
    */
   public MessageDrivenBeanType<T> ejbClass(String ejbClass)
   {
      childNode.getOrCreate("ejb-class").text(ejbClass);
      return this;
   }

   /**
    * Returns the <code>ejb-class</code> element
    * @return the node defined for the element <code>ejb-class</code> 
    */
   public String getEjbClass()
   {
      return childNode.getTextValueForPatternName("ejb-class");
   }

   /**
    * Removes the <code>ejb-class</code> element 
    * @return the current instance of <code>MessageDrivenBeanType<T></code> 
    */
   public MessageDrivenBeanType<T> removeEjbClass()
   {
      childNode.removeChildren("ejb-class");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageDrivenBeanType ElementName: xsd:token ElementType : messaging-type
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>messaging-type</code> element
    * @param messagingType the value for the element <code>messaging-type</code> 
    * @return the current instance of <code>MessageDrivenBeanType<T></code> 
    */
   public MessageDrivenBeanType<T> messagingType(String messagingType)
   {
      childNode.getOrCreate("messaging-type").text(messagingType);
      return this;
   }

   /**
    * Returns the <code>messaging-type</code> element
    * @return the node defined for the element <code>messaging-type</code> 
    */
   public String getMessagingType()
   {
      return childNode.getTextValueForPatternName("messaging-type");
   }

   /**
    * Removes the <code>messaging-type</code> element 
    * @return the current instance of <code>MessageDrivenBeanType<T></code> 
    */
   public MessageDrivenBeanType<T> removeMessagingType()
   {
      childNode.removeChildren("messaging-type");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageDrivenBeanType ElementName: javaee:named-methodType ElementType : timeout-method
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>timeout-method</code> element with the given value will be created.
    * Otherwise, the existing <code>timeout-method</code> element will be returned.
    * @return  a new or existing instance of <code>NamedMethodType<MessageDrivenBeanType<T>></code> 
    */
   public NamedMethodType<MessageDrivenBeanType<T>> getOrCreateTimeoutMethod()
   {
      Node node = childNode.getOrCreate("timeout-method");
      NamedMethodType<MessageDrivenBeanType<T>> timeoutMethod = new NamedMethodTypeImpl<MessageDrivenBeanType<T>>(this, "timeout-method", childNode, node);
      return timeoutMethod;
   }

   /**
    * Removes the <code>timeout-method</code> element 
    * @return the current instance of <code>MessageDrivenBeanType<T></code> 
    */
   public MessageDrivenBeanType<T> removeTimeoutMethod()
   {
      childNode.removeChildren("timeout-method");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageDrivenBeanType ElementName: javaee:timerType ElementType : timer
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>timer</code> element will be created and returned.
    * Otherwise, the first existing <code>timer</code> element will be returned.
    * @return the instance defined for the element <code>timer</code> 
    */
   public TimerType<MessageDrivenBeanType<T>> getOrCreateTimer()
   {
      List<Node> nodeList = childNode.get("timer");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new TimerTypeImpl<MessageDrivenBeanType<T>>(this, "timer", childNode, nodeList.get(0));
      }
      return createTimer();
   }

   /**
    * Creates a new <code>timer</code> element 
    * @return the new created instance of <code>TimerType<MessageDrivenBeanType<T>></code> 
    */
   public TimerType<MessageDrivenBeanType<T>> createTimer()
   {
      return new TimerTypeImpl<MessageDrivenBeanType<T>>(this, "timer", childNode);
   }

   /**
    * Returns all <code>timer</code> elements
    * @return list of <code>timer</code> 
    */
   public List<TimerType<MessageDrivenBeanType<T>>> getAllTimer()
   {
      List<TimerType<MessageDrivenBeanType<T>>> list = new ArrayList<TimerType<MessageDrivenBeanType<T>>>();
      List<Node> nodeList = childNode.get("timer");
      for(Node node: nodeList)
      {
         TimerType<MessageDrivenBeanType<T>>  type = new TimerTypeImpl<MessageDrivenBeanType<T>>(this, "timer", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>timer</code> elements 
    * @return the current instance of <code>TimerType<MessageDrivenBeanType<T>></code> 
    */
   public MessageDrivenBeanType<T> removeAllTimer()
   {
      childNode.removeChildren("timer");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageDrivenBeanType ElementName: javaee:transaction-typeType ElementType : transaction-type
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>transaction-type</code> element
    * @param transactionType the value for the element <code>transaction-type</code> 
    * @return the current instance of <code>MessageDrivenBeanType<T></code> 
    */
   public MessageDrivenBeanType<T> transactionType(TransactionTypeType transactionType)
   {
      childNode.getOrCreate("transaction-type").text(transactionType);
      return this;
   }
   /**
    * Sets the <code>transaction-type</code> element
    * @param transactionType the value for the element <code>transaction-type</code> 
    * @return the current instance of <code>MessageDrivenBeanType<T></code> 
    */
   public MessageDrivenBeanType<T> transactionType(String transactionType)
   {
      childNode.getOrCreate("transaction-type").text(transactionType);
      return this;
   }

   /**
    * Returns the <code>transaction-type</code> element
    * @return the value found for the element <code>transaction-type</code> 
    */
   public TransactionTypeType getTransactionType()
   {
      return TransactionTypeType.getFromStringValue(childNode.getTextValueForPatternName("transaction-type"));
   }

   /**
    * Returns the <code>transaction-type</code> element
    * @return the value found for the element <code>transaction-type</code> 
    */
   public String  getTransactionTypeAsString()
   {
      return childNode.getTextValueForPatternName("transaction-type");
   }

   /**
    * Removes the <code>transaction-type</code> attribute 
    * @return the current instance of <code>MessageDrivenBeanType<T></code> 
    */
   public MessageDrivenBeanType<T> removeTransactionType()
   {
      childNode.removeAttribute("transaction-type");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageDrivenBeanType ElementName: javaee:fully-qualified-classType ElementType : message-destination-type
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>message-destination-type</code> element
    * @param messageDestinationType the value for the element <code>message-destination-type</code> 
    * @return the current instance of <code>MessageDrivenBeanType<T></code> 
    */
   public MessageDrivenBeanType<T> messageDestinationType(String messageDestinationType)
   {
      childNode.getOrCreate("message-destination-type").text(messageDestinationType);
      return this;
   }

   /**
    * Returns the <code>message-destination-type</code> element
    * @return the node defined for the element <code>message-destination-type</code> 
    */
   public String getMessageDestinationType()
   {
      return childNode.getTextValueForPatternName("message-destination-type");
   }

   /**
    * Removes the <code>message-destination-type</code> element 
    * @return the current instance of <code>MessageDrivenBeanType<T></code> 
    */
   public MessageDrivenBeanType<T> removeMessageDestinationType()
   {
      childNode.removeChildren("message-destination-type");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageDrivenBeanType ElementName: javaee:string ElementType : message-destination-link
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>message-destination-link</code> element
    * @param messageDestinationLink the value for the element <code>message-destination-link</code> 
    * @return the current instance of <code>MessageDrivenBeanType<T></code> 
    */
   public MessageDrivenBeanType<T> messageDestinationLink(String messageDestinationLink)
   {
      childNode.getOrCreate("message-destination-link").text(messageDestinationLink);
      return this;
   }

   /**
    * Returns the <code>message-destination-link</code> element
    * @return the node defined for the element <code>message-destination-link</code> 
    */
   public String getMessageDestinationLink()
   {
      return childNode.getTextValueForPatternName("message-destination-link");
   }

   /**
    * Removes the <code>message-destination-link</code> element 
    * @return the current instance of <code>MessageDrivenBeanType<T></code> 
    */
   public MessageDrivenBeanType<T> removeMessageDestinationLink()
   {
      childNode.removeChildren("message-destination-link");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageDrivenBeanType ElementName: javaee:activation-configType ElementType : activation-config
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>activation-config</code> element with the given value will be created.
    * Otherwise, the existing <code>activation-config</code> element will be returned.
    * @return  a new or existing instance of <code>ActivationConfigType<MessageDrivenBeanType<T>></code> 
    */
   public ActivationConfigType<MessageDrivenBeanType<T>> getOrCreateActivationConfig()
   {
      Node node = childNode.getOrCreate("activation-config");
      ActivationConfigType<MessageDrivenBeanType<T>> activationConfig = new ActivationConfigTypeImpl<MessageDrivenBeanType<T>>(this, "activation-config", childNode, node);
      return activationConfig;
   }

   /**
    * Removes the <code>activation-config</code> element 
    * @return the current instance of <code>MessageDrivenBeanType<T></code> 
    */
   public MessageDrivenBeanType<T> removeActivationConfig()
   {
      childNode.removeChildren("activation-config");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageDrivenBeanType ElementName: javaee:around-invokeType ElementType : around-invoke
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>around-invoke</code> element will be created and returned.
    * Otherwise, the first existing <code>around-invoke</code> element will be returned.
    * @return the instance defined for the element <code>around-invoke</code> 
    */
   public AroundInvokeType<MessageDrivenBeanType<T>> getOrCreateAroundInvoke()
   {
      List<Node> nodeList = childNode.get("around-invoke");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new AroundInvokeTypeImpl<MessageDrivenBeanType<T>>(this, "around-invoke", childNode, nodeList.get(0));
      }
      return createAroundInvoke();
   }

   /**
    * Creates a new <code>around-invoke</code> element 
    * @return the new created instance of <code>AroundInvokeType<MessageDrivenBeanType<T>></code> 
    */
   public AroundInvokeType<MessageDrivenBeanType<T>> createAroundInvoke()
   {
      return new AroundInvokeTypeImpl<MessageDrivenBeanType<T>>(this, "around-invoke", childNode);
   }

   /**
    * Returns all <code>around-invoke</code> elements
    * @return list of <code>around-invoke</code> 
    */
   public List<AroundInvokeType<MessageDrivenBeanType<T>>> getAllAroundInvoke()
   {
      List<AroundInvokeType<MessageDrivenBeanType<T>>> list = new ArrayList<AroundInvokeType<MessageDrivenBeanType<T>>>();
      List<Node> nodeList = childNode.get("around-invoke");
      for(Node node: nodeList)
      {
         AroundInvokeType<MessageDrivenBeanType<T>>  type = new AroundInvokeTypeImpl<MessageDrivenBeanType<T>>(this, "around-invoke", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>around-invoke</code> elements 
    * @return the current instance of <code>AroundInvokeType<MessageDrivenBeanType<T>></code> 
    */
   public MessageDrivenBeanType<T> removeAllAroundInvoke()
   {
      childNode.removeChildren("around-invoke");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageDrivenBeanType ElementName: javaee:around-timeoutType ElementType : around-timeout
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>around-timeout</code> element will be created and returned.
    * Otherwise, the first existing <code>around-timeout</code> element will be returned.
    * @return the instance defined for the element <code>around-timeout</code> 
    */
   public AroundTimeoutType<MessageDrivenBeanType<T>> getOrCreateAroundTimeout()
   {
      List<Node> nodeList = childNode.get("around-timeout");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new AroundTimeoutTypeImpl<MessageDrivenBeanType<T>>(this, "around-timeout", childNode, nodeList.get(0));
      }
      return createAroundTimeout();
   }

   /**
    * Creates a new <code>around-timeout</code> element 
    * @return the new created instance of <code>AroundTimeoutType<MessageDrivenBeanType<T>></code> 
    */
   public AroundTimeoutType<MessageDrivenBeanType<T>> createAroundTimeout()
   {
      return new AroundTimeoutTypeImpl<MessageDrivenBeanType<T>>(this, "around-timeout", childNode);
   }

   /**
    * Returns all <code>around-timeout</code> elements
    * @return list of <code>around-timeout</code> 
    */
   public List<AroundTimeoutType<MessageDrivenBeanType<T>>> getAllAroundTimeout()
   {
      List<AroundTimeoutType<MessageDrivenBeanType<T>>> list = new ArrayList<AroundTimeoutType<MessageDrivenBeanType<T>>>();
      List<Node> nodeList = childNode.get("around-timeout");
      for(Node node: nodeList)
      {
         AroundTimeoutType<MessageDrivenBeanType<T>>  type = new AroundTimeoutTypeImpl<MessageDrivenBeanType<T>>(this, "around-timeout", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>around-timeout</code> elements 
    * @return the current instance of <code>AroundTimeoutType<MessageDrivenBeanType<T>></code> 
    */
   public MessageDrivenBeanType<T> removeAllAroundTimeout()
   {
      childNode.removeChildren("around-timeout");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageDrivenBeanType ElementName: javaee:security-role-refType ElementType : security-role-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>security-role-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>security-role-ref</code> element will be returned.
    * @return the instance defined for the element <code>security-role-ref</code> 
    */
   public SecurityRoleRefType<MessageDrivenBeanType<T>> getOrCreateSecurityRoleRef()
   {
      List<Node> nodeList = childNode.get("security-role-ref");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new SecurityRoleRefTypeImpl<MessageDrivenBeanType<T>>(this, "security-role-ref", childNode, nodeList.get(0));
      }
      return createSecurityRoleRef();
   }

   /**
    * Creates a new <code>security-role-ref</code> element 
    * @return the new created instance of <code>SecurityRoleRefType<MessageDrivenBeanType<T>></code> 
    */
   public SecurityRoleRefType<MessageDrivenBeanType<T>> createSecurityRoleRef()
   {
      return new SecurityRoleRefTypeImpl<MessageDrivenBeanType<T>>(this, "security-role-ref", childNode);
   }

   /**
    * Returns all <code>security-role-ref</code> elements
    * @return list of <code>security-role-ref</code> 
    */
   public List<SecurityRoleRefType<MessageDrivenBeanType<T>>> getAllSecurityRoleRef()
   {
      List<SecurityRoleRefType<MessageDrivenBeanType<T>>> list = new ArrayList<SecurityRoleRefType<MessageDrivenBeanType<T>>>();
      List<Node> nodeList = childNode.get("security-role-ref");
      for(Node node: nodeList)
      {
         SecurityRoleRefType<MessageDrivenBeanType<T>>  type = new SecurityRoleRefTypeImpl<MessageDrivenBeanType<T>>(this, "security-role-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>security-role-ref</code> elements 
    * @return the current instance of <code>SecurityRoleRefType<MessageDrivenBeanType<T>></code> 
    */
   public MessageDrivenBeanType<T> removeAllSecurityRoleRef()
   {
      childNode.removeChildren("security-role-ref");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageDrivenBeanType ElementName: javaee:security-identityType ElementType : security-identity
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>security-identity</code> element with the given value will be created.
    * Otherwise, the existing <code>security-identity</code> element will be returned.
    * @return  a new or existing instance of <code>SecurityIdentityType<MessageDrivenBeanType<T>></code> 
    */
   public SecurityIdentityType<MessageDrivenBeanType<T>> getOrCreateSecurityIdentity()
   {
      Node node = childNode.getOrCreate("security-identity");
      SecurityIdentityType<MessageDrivenBeanType<T>> securityIdentity = new SecurityIdentityTypeImpl<MessageDrivenBeanType<T>>(this, "security-identity", childNode, node);
      return securityIdentity;
   }

   /**
    * Removes the <code>security-identity</code> element 
    * @return the current instance of <code>MessageDrivenBeanType<T></code> 
    */
   public MessageDrivenBeanType<T> removeSecurityIdentity()
   {
      childNode.removeChildren("security-identity");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MessageDrivenBeanType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>MessageDrivenBeanType<T></code> 
    */
   public MessageDrivenBeanType<T> id(String id)
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
    * @return the current instance of <code>MessageDrivenBeanType<T></code> 
    */
   public MessageDrivenBeanType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
