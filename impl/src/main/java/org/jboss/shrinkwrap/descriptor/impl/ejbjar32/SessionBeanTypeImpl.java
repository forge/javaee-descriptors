package org.jboss.shrinkwrap.descriptor.impl.ejbjar32; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.ejbjar32.SessionBeanType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.javaee7.EmptyType;
import org.jboss.shrinkwrap.descriptor.impl.javaee7.EmptyTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.ejbjar32.SessionTypeType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar32.StatefulTimeoutType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar32.StatefulTimeoutTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.ejbjar32.NamedMethodType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar32.NamedMethodTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.ejbjar32.TimerType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar32.TimerTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.ejbjar32.ConcurrencyManagementTypeType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar32.ConcurrentMethodType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar32.ConcurrentMethodTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.ejbjar32.DependsOnType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar32.DependsOnTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.ejbjar32.InitMethodType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar32.InitMethodTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.ejbjar32.RemoveMethodType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar32.RemoveMethodTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.ejbjar32.AsyncMethodType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar32.AsyncMethodTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.ejbjar32.TransactionTypeType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar32.NamedMethodType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar32.NamedMethodTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.ejbjar32.NamedMethodType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar32.NamedMethodTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.ejbjar32.NamedMethodType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar32.NamedMethodTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.ejbjar32.AroundInvokeType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar32.AroundInvokeTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.ejbjar32.AroundTimeoutType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar32.AroundTimeoutTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee7.LifecycleCallbackType;
import org.jboss.shrinkwrap.descriptor.impl.javaee7.LifecycleCallbackTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee7.LifecycleCallbackType;
import org.jboss.shrinkwrap.descriptor.impl.javaee7.LifecycleCallbackTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee7.SecurityRoleRefType;
import org.jboss.shrinkwrap.descriptor.impl.javaee7.SecurityRoleRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.ejbjar32.SecurityIdentityType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar32.SecurityIdentityTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee7.IconType;
import org.jboss.shrinkwrap.descriptor.impl.javaee7.IconTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee7.EnvEntryType;
import org.jboss.shrinkwrap.descriptor.impl.javaee7.EnvEntryTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee7.EjbRefType;
import org.jboss.shrinkwrap.descriptor.impl.javaee7.EjbRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee7.EjbLocalRefType;
import org.jboss.shrinkwrap.descriptor.impl.javaee7.EjbLocalRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee7.ResourceRefType;
import org.jboss.shrinkwrap.descriptor.impl.javaee7.ResourceRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee7.ResourceEnvRefType;
import org.jboss.shrinkwrap.descriptor.impl.javaee7.ResourceEnvRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee7.MessageDestinationRefType;
import org.jboss.shrinkwrap.descriptor.impl.javaee7.MessageDestinationRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee7.PersistenceContextRefType;
import org.jboss.shrinkwrap.descriptor.impl.javaee7.PersistenceContextRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee7.PersistenceUnitRefType;
import org.jboss.shrinkwrap.descriptor.impl.javaee7.PersistenceUnitRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee7.LifecycleCallbackType;
import org.jboss.shrinkwrap.descriptor.impl.javaee7.LifecycleCallbackTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee7.LifecycleCallbackType;
import org.jboss.shrinkwrap.descriptor.impl.javaee7.LifecycleCallbackTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee7.DataSourceType;
import org.jboss.shrinkwrap.descriptor.impl.javaee7.DataSourceTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee7.JmsConnectionFactoryType;
import org.jboss.shrinkwrap.descriptor.impl.javaee7.JmsConnectionFactoryTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee7.JmsDestinationType;
import org.jboss.shrinkwrap.descriptor.impl.javaee7.JmsDestinationTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee7.MailSessionType;
import org.jboss.shrinkwrap.descriptor.impl.javaee7.MailSessionTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee7.ConnectionFactoryResourceType;
import org.jboss.shrinkwrap.descriptor.impl.javaee7.ConnectionFactoryResourceTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee7.AdministeredObjectType;
import org.jboss.shrinkwrap.descriptor.impl.javaee7.AdministeredObjectTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient14.ServiceRefType;
import org.jboss.shrinkwrap.descriptor.impl.javaeewebservicesclient14.ServiceRefTypeImpl;

/**
 * This class implements the <code> session-beanType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class SessionBeanTypeImpl<T> implements Child<T>, SessionBeanType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public SessionBeanTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public SessionBeanTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
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
   public SessionBeanType<T> description(String ... values)
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
    * @return the current instance of <code>SessionBeanType<T></code> 
    */
   public SessionBeanType<T> removeAllDescription()
   {
      childNode.removeChildren("description");
      return this;
   }
 
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
   public SessionBeanType<T> displayName(String ... values)
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
    * @return the current instance of <code>SessionBeanType<T></code> 
    */
   public SessionBeanType<T> removeAllDisplayName()
   {
      childNode.removeChildren("display-name");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionBeanType ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<SessionBeanType<T>> getOrCreateIcon()
   {
      List<Node> nodeList = childNode.get("icon");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new IconTypeImpl<SessionBeanType<T>>(this, "icon", childNode, nodeList.get(0));
      }
      return createIcon();
   }

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<SessionBeanType<T>></code> 
    */
   public IconType<SessionBeanType<T>> createIcon()
   {
      return new IconTypeImpl<SessionBeanType<T>>(this, "icon", childNode);
   }

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<SessionBeanType<T>>> getAllIcon()
   {
      List<IconType<SessionBeanType<T>>> list = new ArrayList<IconType<SessionBeanType<T>>>();
      List<Node> nodeList = childNode.get("icon");
      for(Node node: nodeList)
      {
         IconType<SessionBeanType<T>>  type = new IconTypeImpl<SessionBeanType<T>>(this, "icon", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<SessionBeanType<T>></code> 
    */
   public SessionBeanType<T> removeAllIcon()
   {
      childNode.removeChildren("icon");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionBeanType ElementName: javaee:env-entryType ElementType : env-entry
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>env-entry</code> element will be created and returned.
    * Otherwise, the first existing <code>env-entry</code> element will be returned.
    * @return the instance defined for the element <code>env-entry</code> 
    */
   public EnvEntryType<SessionBeanType<T>> getOrCreateEnvEntry()
   {
      List<Node> nodeList = childNode.get("env-entry");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new EnvEntryTypeImpl<SessionBeanType<T>>(this, "env-entry", childNode, nodeList.get(0));
      }
      return createEnvEntry();
   }

   /**
    * Creates a new <code>env-entry</code> element 
    * @return the new created instance of <code>EnvEntryType<SessionBeanType<T>></code> 
    */
   public EnvEntryType<SessionBeanType<T>> createEnvEntry()
   {
      return new EnvEntryTypeImpl<SessionBeanType<T>>(this, "env-entry", childNode);
   }

   /**
    * Returns all <code>env-entry</code> elements
    * @return list of <code>env-entry</code> 
    */
   public List<EnvEntryType<SessionBeanType<T>>> getAllEnvEntry()
   {
      List<EnvEntryType<SessionBeanType<T>>> list = new ArrayList<EnvEntryType<SessionBeanType<T>>>();
      List<Node> nodeList = childNode.get("env-entry");
      for(Node node: nodeList)
      {
         EnvEntryType<SessionBeanType<T>>  type = new EnvEntryTypeImpl<SessionBeanType<T>>(this, "env-entry", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>env-entry</code> elements 
    * @return the current instance of <code>EnvEntryType<SessionBeanType<T>></code> 
    */
   public SessionBeanType<T> removeAllEnvEntry()
   {
      childNode.removeChildren("env-entry");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionBeanType ElementName: javaee:ejb-refType ElementType : ejb-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>ejb-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>ejb-ref</code> element will be returned.
    * @return the instance defined for the element <code>ejb-ref</code> 
    */
   public EjbRefType<SessionBeanType<T>> getOrCreateEjbRef()
   {
      List<Node> nodeList = childNode.get("ejb-ref");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new EjbRefTypeImpl<SessionBeanType<T>>(this, "ejb-ref", childNode, nodeList.get(0));
      }
      return createEjbRef();
   }

   /**
    * Creates a new <code>ejb-ref</code> element 
    * @return the new created instance of <code>EjbRefType<SessionBeanType<T>></code> 
    */
   public EjbRefType<SessionBeanType<T>> createEjbRef()
   {
      return new EjbRefTypeImpl<SessionBeanType<T>>(this, "ejb-ref", childNode);
   }

   /**
    * Returns all <code>ejb-ref</code> elements
    * @return list of <code>ejb-ref</code> 
    */
   public List<EjbRefType<SessionBeanType<T>>> getAllEjbRef()
   {
      List<EjbRefType<SessionBeanType<T>>> list = new ArrayList<EjbRefType<SessionBeanType<T>>>();
      List<Node> nodeList = childNode.get("ejb-ref");
      for(Node node: nodeList)
      {
         EjbRefType<SessionBeanType<T>>  type = new EjbRefTypeImpl<SessionBeanType<T>>(this, "ejb-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>ejb-ref</code> elements 
    * @return the current instance of <code>EjbRefType<SessionBeanType<T>></code> 
    */
   public SessionBeanType<T> removeAllEjbRef()
   {
      childNode.removeChildren("ejb-ref");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionBeanType ElementName: javaee:ejb-local-refType ElementType : ejb-local-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>ejb-local-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>ejb-local-ref</code> element will be returned.
    * @return the instance defined for the element <code>ejb-local-ref</code> 
    */
   public EjbLocalRefType<SessionBeanType<T>> getOrCreateEjbLocalRef()
   {
      List<Node> nodeList = childNode.get("ejb-local-ref");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new EjbLocalRefTypeImpl<SessionBeanType<T>>(this, "ejb-local-ref", childNode, nodeList.get(0));
      }
      return createEjbLocalRef();
   }

   /**
    * Creates a new <code>ejb-local-ref</code> element 
    * @return the new created instance of <code>EjbLocalRefType<SessionBeanType<T>></code> 
    */
   public EjbLocalRefType<SessionBeanType<T>> createEjbLocalRef()
   {
      return new EjbLocalRefTypeImpl<SessionBeanType<T>>(this, "ejb-local-ref", childNode);
   }

   /**
    * Returns all <code>ejb-local-ref</code> elements
    * @return list of <code>ejb-local-ref</code> 
    */
   public List<EjbLocalRefType<SessionBeanType<T>>> getAllEjbLocalRef()
   {
      List<EjbLocalRefType<SessionBeanType<T>>> list = new ArrayList<EjbLocalRefType<SessionBeanType<T>>>();
      List<Node> nodeList = childNode.get("ejb-local-ref");
      for(Node node: nodeList)
      {
         EjbLocalRefType<SessionBeanType<T>>  type = new EjbLocalRefTypeImpl<SessionBeanType<T>>(this, "ejb-local-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>ejb-local-ref</code> elements 
    * @return the current instance of <code>EjbLocalRefType<SessionBeanType<T>></code> 
    */
   public SessionBeanType<T> removeAllEjbLocalRef()
   {
      childNode.removeChildren("ejb-local-ref");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionBeanType ElementName: javaee:resource-refType ElementType : resource-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>resource-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>resource-ref</code> element will be returned.
    * @return the instance defined for the element <code>resource-ref</code> 
    */
   public ResourceRefType<SessionBeanType<T>> getOrCreateResourceRef()
   {
      List<Node> nodeList = childNode.get("resource-ref");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ResourceRefTypeImpl<SessionBeanType<T>>(this, "resource-ref", childNode, nodeList.get(0));
      }
      return createResourceRef();
   }

   /**
    * Creates a new <code>resource-ref</code> element 
    * @return the new created instance of <code>ResourceRefType<SessionBeanType<T>></code> 
    */
   public ResourceRefType<SessionBeanType<T>> createResourceRef()
   {
      return new ResourceRefTypeImpl<SessionBeanType<T>>(this, "resource-ref", childNode);
   }

   /**
    * Returns all <code>resource-ref</code> elements
    * @return list of <code>resource-ref</code> 
    */
   public List<ResourceRefType<SessionBeanType<T>>> getAllResourceRef()
   {
      List<ResourceRefType<SessionBeanType<T>>> list = new ArrayList<ResourceRefType<SessionBeanType<T>>>();
      List<Node> nodeList = childNode.get("resource-ref");
      for(Node node: nodeList)
      {
         ResourceRefType<SessionBeanType<T>>  type = new ResourceRefTypeImpl<SessionBeanType<T>>(this, "resource-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>resource-ref</code> elements 
    * @return the current instance of <code>ResourceRefType<SessionBeanType<T>></code> 
    */
   public SessionBeanType<T> removeAllResourceRef()
   {
      childNode.removeChildren("resource-ref");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionBeanType ElementName: javaee:resource-env-refType ElementType : resource-env-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>resource-env-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>resource-env-ref</code> element will be returned.
    * @return the instance defined for the element <code>resource-env-ref</code> 
    */
   public ResourceEnvRefType<SessionBeanType<T>> getOrCreateResourceEnvRef()
   {
      List<Node> nodeList = childNode.get("resource-env-ref");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ResourceEnvRefTypeImpl<SessionBeanType<T>>(this, "resource-env-ref", childNode, nodeList.get(0));
      }
      return createResourceEnvRef();
   }

   /**
    * Creates a new <code>resource-env-ref</code> element 
    * @return the new created instance of <code>ResourceEnvRefType<SessionBeanType<T>></code> 
    */
   public ResourceEnvRefType<SessionBeanType<T>> createResourceEnvRef()
   {
      return new ResourceEnvRefTypeImpl<SessionBeanType<T>>(this, "resource-env-ref", childNode);
   }

   /**
    * Returns all <code>resource-env-ref</code> elements
    * @return list of <code>resource-env-ref</code> 
    */
   public List<ResourceEnvRefType<SessionBeanType<T>>> getAllResourceEnvRef()
   {
      List<ResourceEnvRefType<SessionBeanType<T>>> list = new ArrayList<ResourceEnvRefType<SessionBeanType<T>>>();
      List<Node> nodeList = childNode.get("resource-env-ref");
      for(Node node: nodeList)
      {
         ResourceEnvRefType<SessionBeanType<T>>  type = new ResourceEnvRefTypeImpl<SessionBeanType<T>>(this, "resource-env-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>resource-env-ref</code> elements 
    * @return the current instance of <code>ResourceEnvRefType<SessionBeanType<T>></code> 
    */
   public SessionBeanType<T> removeAllResourceEnvRef()
   {
      childNode.removeChildren("resource-env-ref");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionBeanType ElementName: javaee:message-destination-refType ElementType : message-destination-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>message-destination-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>message-destination-ref</code> element will be returned.
    * @return the instance defined for the element <code>message-destination-ref</code> 
    */
   public MessageDestinationRefType<SessionBeanType<T>> getOrCreateMessageDestinationRef()
   {
      List<Node> nodeList = childNode.get("message-destination-ref");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new MessageDestinationRefTypeImpl<SessionBeanType<T>>(this, "message-destination-ref", childNode, nodeList.get(0));
      }
      return createMessageDestinationRef();
   }

   /**
    * Creates a new <code>message-destination-ref</code> element 
    * @return the new created instance of <code>MessageDestinationRefType<SessionBeanType<T>></code> 
    */
   public MessageDestinationRefType<SessionBeanType<T>> createMessageDestinationRef()
   {
      return new MessageDestinationRefTypeImpl<SessionBeanType<T>>(this, "message-destination-ref", childNode);
   }

   /**
    * Returns all <code>message-destination-ref</code> elements
    * @return list of <code>message-destination-ref</code> 
    */
   public List<MessageDestinationRefType<SessionBeanType<T>>> getAllMessageDestinationRef()
   {
      List<MessageDestinationRefType<SessionBeanType<T>>> list = new ArrayList<MessageDestinationRefType<SessionBeanType<T>>>();
      List<Node> nodeList = childNode.get("message-destination-ref");
      for(Node node: nodeList)
      {
         MessageDestinationRefType<SessionBeanType<T>>  type = new MessageDestinationRefTypeImpl<SessionBeanType<T>>(this, "message-destination-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>message-destination-ref</code> elements 
    * @return the current instance of <code>MessageDestinationRefType<SessionBeanType<T>></code> 
    */
   public SessionBeanType<T> removeAllMessageDestinationRef()
   {
      childNode.removeChildren("message-destination-ref");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionBeanType ElementName: javaee:persistence-context-refType ElementType : persistence-context-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>persistence-context-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>persistence-context-ref</code> element will be returned.
    * @return the instance defined for the element <code>persistence-context-ref</code> 
    */
   public PersistenceContextRefType<SessionBeanType<T>> getOrCreatePersistenceContextRef()
   {
      List<Node> nodeList = childNode.get("persistence-context-ref");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new PersistenceContextRefTypeImpl<SessionBeanType<T>>(this, "persistence-context-ref", childNode, nodeList.get(0));
      }
      return createPersistenceContextRef();
   }

   /**
    * Creates a new <code>persistence-context-ref</code> element 
    * @return the new created instance of <code>PersistenceContextRefType<SessionBeanType<T>></code> 
    */
   public PersistenceContextRefType<SessionBeanType<T>> createPersistenceContextRef()
   {
      return new PersistenceContextRefTypeImpl<SessionBeanType<T>>(this, "persistence-context-ref", childNode);
   }

   /**
    * Returns all <code>persistence-context-ref</code> elements
    * @return list of <code>persistence-context-ref</code> 
    */
   public List<PersistenceContextRefType<SessionBeanType<T>>> getAllPersistenceContextRef()
   {
      List<PersistenceContextRefType<SessionBeanType<T>>> list = new ArrayList<PersistenceContextRefType<SessionBeanType<T>>>();
      List<Node> nodeList = childNode.get("persistence-context-ref");
      for(Node node: nodeList)
      {
         PersistenceContextRefType<SessionBeanType<T>>  type = new PersistenceContextRefTypeImpl<SessionBeanType<T>>(this, "persistence-context-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>persistence-context-ref</code> elements 
    * @return the current instance of <code>PersistenceContextRefType<SessionBeanType<T>></code> 
    */
   public SessionBeanType<T> removeAllPersistenceContextRef()
   {
      childNode.removeChildren("persistence-context-ref");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionBeanType ElementName: javaee:persistence-unit-refType ElementType : persistence-unit-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>persistence-unit-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>persistence-unit-ref</code> element will be returned.
    * @return the instance defined for the element <code>persistence-unit-ref</code> 
    */
   public PersistenceUnitRefType<SessionBeanType<T>> getOrCreatePersistenceUnitRef()
   {
      List<Node> nodeList = childNode.get("persistence-unit-ref");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new PersistenceUnitRefTypeImpl<SessionBeanType<T>>(this, "persistence-unit-ref", childNode, nodeList.get(0));
      }
      return createPersistenceUnitRef();
   }

   /**
    * Creates a new <code>persistence-unit-ref</code> element 
    * @return the new created instance of <code>PersistenceUnitRefType<SessionBeanType<T>></code> 
    */
   public PersistenceUnitRefType<SessionBeanType<T>> createPersistenceUnitRef()
   {
      return new PersistenceUnitRefTypeImpl<SessionBeanType<T>>(this, "persistence-unit-ref", childNode);
   }

   /**
    * Returns all <code>persistence-unit-ref</code> elements
    * @return list of <code>persistence-unit-ref</code> 
    */
   public List<PersistenceUnitRefType<SessionBeanType<T>>> getAllPersistenceUnitRef()
   {
      List<PersistenceUnitRefType<SessionBeanType<T>>> list = new ArrayList<PersistenceUnitRefType<SessionBeanType<T>>>();
      List<Node> nodeList = childNode.get("persistence-unit-ref");
      for(Node node: nodeList)
      {
         PersistenceUnitRefType<SessionBeanType<T>>  type = new PersistenceUnitRefTypeImpl<SessionBeanType<T>>(this, "persistence-unit-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>persistence-unit-ref</code> elements 
    * @return the current instance of <code>PersistenceUnitRefType<SessionBeanType<T>></code> 
    */
   public SessionBeanType<T> removeAllPersistenceUnitRef()
   {
      childNode.removeChildren("persistence-unit-ref");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionBeanType ElementName: javaee:lifecycle-callbackType ElementType : post-construct
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>post-construct</code> element will be created and returned.
    * Otherwise, the first existing <code>post-construct</code> element will be returned.
    * @return the instance defined for the element <code>post-construct</code> 
    */
   public LifecycleCallbackType<SessionBeanType<T>> getOrCreatePostConstruct()
   {
      List<Node> nodeList = childNode.get("post-construct");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new LifecycleCallbackTypeImpl<SessionBeanType<T>>(this, "post-construct", childNode, nodeList.get(0));
      }
      return createPostConstruct();
   }

   /**
    * Creates a new <code>post-construct</code> element 
    * @return the new created instance of <code>LifecycleCallbackType<SessionBeanType<T>></code> 
    */
   public LifecycleCallbackType<SessionBeanType<T>> createPostConstruct()
   {
      return new LifecycleCallbackTypeImpl<SessionBeanType<T>>(this, "post-construct", childNode);
   }

   /**
    * Returns all <code>post-construct</code> elements
    * @return list of <code>post-construct</code> 
    */
   public List<LifecycleCallbackType<SessionBeanType<T>>> getAllPostConstruct()
   {
      List<LifecycleCallbackType<SessionBeanType<T>>> list = new ArrayList<LifecycleCallbackType<SessionBeanType<T>>>();
      List<Node> nodeList = childNode.get("post-construct");
      for(Node node: nodeList)
      {
         LifecycleCallbackType<SessionBeanType<T>>  type = new LifecycleCallbackTypeImpl<SessionBeanType<T>>(this, "post-construct", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>post-construct</code> elements 
    * @return the current instance of <code>LifecycleCallbackType<SessionBeanType<T>></code> 
    */
   public SessionBeanType<T> removeAllPostConstruct()
   {
      childNode.removeChildren("post-construct");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionBeanType ElementName: javaee:lifecycle-callbackType ElementType : pre-destroy
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>pre-destroy</code> element will be created and returned.
    * Otherwise, the first existing <code>pre-destroy</code> element will be returned.
    * @return the instance defined for the element <code>pre-destroy</code> 
    */
   public LifecycleCallbackType<SessionBeanType<T>> getOrCreatePreDestroy()
   {
      List<Node> nodeList = childNode.get("pre-destroy");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new LifecycleCallbackTypeImpl<SessionBeanType<T>>(this, "pre-destroy", childNode, nodeList.get(0));
      }
      return createPreDestroy();
   }

   /**
    * Creates a new <code>pre-destroy</code> element 
    * @return the new created instance of <code>LifecycleCallbackType<SessionBeanType<T>></code> 
    */
   public LifecycleCallbackType<SessionBeanType<T>> createPreDestroy()
   {
      return new LifecycleCallbackTypeImpl<SessionBeanType<T>>(this, "pre-destroy", childNode);
   }

   /**
    * Returns all <code>pre-destroy</code> elements
    * @return list of <code>pre-destroy</code> 
    */
   public List<LifecycleCallbackType<SessionBeanType<T>>> getAllPreDestroy()
   {
      List<LifecycleCallbackType<SessionBeanType<T>>> list = new ArrayList<LifecycleCallbackType<SessionBeanType<T>>>();
      List<Node> nodeList = childNode.get("pre-destroy");
      for(Node node: nodeList)
      {
         LifecycleCallbackType<SessionBeanType<T>>  type = new LifecycleCallbackTypeImpl<SessionBeanType<T>>(this, "pre-destroy", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>pre-destroy</code> elements 
    * @return the current instance of <code>LifecycleCallbackType<SessionBeanType<T>></code> 
    */
   public SessionBeanType<T> removeAllPreDestroy()
   {
      childNode.removeChildren("pre-destroy");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionBeanType ElementName: javaee:data-sourceType ElementType : data-source
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>data-source</code> element will be created and returned.
    * Otherwise, the first existing <code>data-source</code> element will be returned.
    * @return the instance defined for the element <code>data-source</code> 
    */
   public DataSourceType<SessionBeanType<T>> getOrCreateDataSource()
   {
      List<Node> nodeList = childNode.get("data-source");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new DataSourceTypeImpl<SessionBeanType<T>>(this, "data-source", childNode, nodeList.get(0));
      }
      return createDataSource();
   }

   /**
    * Creates a new <code>data-source</code> element 
    * @return the new created instance of <code>DataSourceType<SessionBeanType<T>></code> 
    */
   public DataSourceType<SessionBeanType<T>> createDataSource()
   {
      return new DataSourceTypeImpl<SessionBeanType<T>>(this, "data-source", childNode);
   }

   /**
    * Returns all <code>data-source</code> elements
    * @return list of <code>data-source</code> 
    */
   public List<DataSourceType<SessionBeanType<T>>> getAllDataSource()
   {
      List<DataSourceType<SessionBeanType<T>>> list = new ArrayList<DataSourceType<SessionBeanType<T>>>();
      List<Node> nodeList = childNode.get("data-source");
      for(Node node: nodeList)
      {
         DataSourceType<SessionBeanType<T>>  type = new DataSourceTypeImpl<SessionBeanType<T>>(this, "data-source", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>data-source</code> elements 
    * @return the current instance of <code>DataSourceType<SessionBeanType<T>></code> 
    */
   public SessionBeanType<T> removeAllDataSource()
   {
      childNode.removeChildren("data-source");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionBeanType ElementName: javaee:jms-connection-factoryType ElementType : jms-connection-factory
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>jms-connection-factory</code> element will be created and returned.
    * Otherwise, the first existing <code>jms-connection-factory</code> element will be returned.
    * @return the instance defined for the element <code>jms-connection-factory</code> 
    */
   public JmsConnectionFactoryType<SessionBeanType<T>> getOrCreateJmsConnectionFactory()
   {
      List<Node> nodeList = childNode.get("jms-connection-factory");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new JmsConnectionFactoryTypeImpl<SessionBeanType<T>>(this, "jms-connection-factory", childNode, nodeList.get(0));
      }
      return createJmsConnectionFactory();
   }

   /**
    * Creates a new <code>jms-connection-factory</code> element 
    * @return the new created instance of <code>JmsConnectionFactoryType<SessionBeanType<T>></code> 
    */
   public JmsConnectionFactoryType<SessionBeanType<T>> createJmsConnectionFactory()
   {
      return new JmsConnectionFactoryTypeImpl<SessionBeanType<T>>(this, "jms-connection-factory", childNode);
   }

   /**
    * Returns all <code>jms-connection-factory</code> elements
    * @return list of <code>jms-connection-factory</code> 
    */
   public List<JmsConnectionFactoryType<SessionBeanType<T>>> getAllJmsConnectionFactory()
   {
      List<JmsConnectionFactoryType<SessionBeanType<T>>> list = new ArrayList<JmsConnectionFactoryType<SessionBeanType<T>>>();
      List<Node> nodeList = childNode.get("jms-connection-factory");
      for(Node node: nodeList)
      {
         JmsConnectionFactoryType<SessionBeanType<T>>  type = new JmsConnectionFactoryTypeImpl<SessionBeanType<T>>(this, "jms-connection-factory", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>jms-connection-factory</code> elements 
    * @return the current instance of <code>JmsConnectionFactoryType<SessionBeanType<T>></code> 
    */
   public SessionBeanType<T> removeAllJmsConnectionFactory()
   {
      childNode.removeChildren("jms-connection-factory");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionBeanType ElementName: javaee:jms-destinationType ElementType : jms-destination
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>jms-destination</code> element will be created and returned.
    * Otherwise, the first existing <code>jms-destination</code> element will be returned.
    * @return the instance defined for the element <code>jms-destination</code> 
    */
   public JmsDestinationType<SessionBeanType<T>> getOrCreateJmsDestination()
   {
      List<Node> nodeList = childNode.get("jms-destination");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new JmsDestinationTypeImpl<SessionBeanType<T>>(this, "jms-destination", childNode, nodeList.get(0));
      }
      return createJmsDestination();
   }

   /**
    * Creates a new <code>jms-destination</code> element 
    * @return the new created instance of <code>JmsDestinationType<SessionBeanType<T>></code> 
    */
   public JmsDestinationType<SessionBeanType<T>> createJmsDestination()
   {
      return new JmsDestinationTypeImpl<SessionBeanType<T>>(this, "jms-destination", childNode);
   }

   /**
    * Returns all <code>jms-destination</code> elements
    * @return list of <code>jms-destination</code> 
    */
   public List<JmsDestinationType<SessionBeanType<T>>> getAllJmsDestination()
   {
      List<JmsDestinationType<SessionBeanType<T>>> list = new ArrayList<JmsDestinationType<SessionBeanType<T>>>();
      List<Node> nodeList = childNode.get("jms-destination");
      for(Node node: nodeList)
      {
         JmsDestinationType<SessionBeanType<T>>  type = new JmsDestinationTypeImpl<SessionBeanType<T>>(this, "jms-destination", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>jms-destination</code> elements 
    * @return the current instance of <code>JmsDestinationType<SessionBeanType<T>></code> 
    */
   public SessionBeanType<T> removeAllJmsDestination()
   {
      childNode.removeChildren("jms-destination");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionBeanType ElementName: javaee:mail-sessionType ElementType : mail-session
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>mail-session</code> element will be created and returned.
    * Otherwise, the first existing <code>mail-session</code> element will be returned.
    * @return the instance defined for the element <code>mail-session</code> 
    */
   public MailSessionType<SessionBeanType<T>> getOrCreateMailSession()
   {
      List<Node> nodeList = childNode.get("mail-session");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new MailSessionTypeImpl<SessionBeanType<T>>(this, "mail-session", childNode, nodeList.get(0));
      }
      return createMailSession();
   }

   /**
    * Creates a new <code>mail-session</code> element 
    * @return the new created instance of <code>MailSessionType<SessionBeanType<T>></code> 
    */
   public MailSessionType<SessionBeanType<T>> createMailSession()
   {
      return new MailSessionTypeImpl<SessionBeanType<T>>(this, "mail-session", childNode);
   }

   /**
    * Returns all <code>mail-session</code> elements
    * @return list of <code>mail-session</code> 
    */
   public List<MailSessionType<SessionBeanType<T>>> getAllMailSession()
   {
      List<MailSessionType<SessionBeanType<T>>> list = new ArrayList<MailSessionType<SessionBeanType<T>>>();
      List<Node> nodeList = childNode.get("mail-session");
      for(Node node: nodeList)
      {
         MailSessionType<SessionBeanType<T>>  type = new MailSessionTypeImpl<SessionBeanType<T>>(this, "mail-session", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>mail-session</code> elements 
    * @return the current instance of <code>MailSessionType<SessionBeanType<T>></code> 
    */
   public SessionBeanType<T> removeAllMailSession()
   {
      childNode.removeChildren("mail-session");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionBeanType ElementName: javaee:connection-factory-resourceType ElementType : connection-factory
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>connection-factory</code> element will be created and returned.
    * Otherwise, the first existing <code>connection-factory</code> element will be returned.
    * @return the instance defined for the element <code>connection-factory</code> 
    */
   public ConnectionFactoryResourceType<SessionBeanType<T>> getOrCreateConnectionFactory()
   {
      List<Node> nodeList = childNode.get("connection-factory");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ConnectionFactoryResourceTypeImpl<SessionBeanType<T>>(this, "connection-factory", childNode, nodeList.get(0));
      }
      return createConnectionFactory();
   }

   /**
    * Creates a new <code>connection-factory</code> element 
    * @return the new created instance of <code>ConnectionFactoryResourceType<SessionBeanType<T>></code> 
    */
   public ConnectionFactoryResourceType<SessionBeanType<T>> createConnectionFactory()
   {
      return new ConnectionFactoryResourceTypeImpl<SessionBeanType<T>>(this, "connection-factory", childNode);
   }

   /**
    * Returns all <code>connection-factory</code> elements
    * @return list of <code>connection-factory</code> 
    */
   public List<ConnectionFactoryResourceType<SessionBeanType<T>>> getAllConnectionFactory()
   {
      List<ConnectionFactoryResourceType<SessionBeanType<T>>> list = new ArrayList<ConnectionFactoryResourceType<SessionBeanType<T>>>();
      List<Node> nodeList = childNode.get("connection-factory");
      for(Node node: nodeList)
      {
         ConnectionFactoryResourceType<SessionBeanType<T>>  type = new ConnectionFactoryResourceTypeImpl<SessionBeanType<T>>(this, "connection-factory", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>connection-factory</code> elements 
    * @return the current instance of <code>ConnectionFactoryResourceType<SessionBeanType<T>></code> 
    */
   public SessionBeanType<T> removeAllConnectionFactory()
   {
      childNode.removeChildren("connection-factory");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionBeanType ElementName: javaee:administered-objectType ElementType : administered-object
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>administered-object</code> element will be created and returned.
    * Otherwise, the first existing <code>administered-object</code> element will be returned.
    * @return the instance defined for the element <code>administered-object</code> 
    */
   public AdministeredObjectType<SessionBeanType<T>> getOrCreateAdministeredObject()
   {
      List<Node> nodeList = childNode.get("administered-object");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new AdministeredObjectTypeImpl<SessionBeanType<T>>(this, "administered-object", childNode, nodeList.get(0));
      }
      return createAdministeredObject();
   }

   /**
    * Creates a new <code>administered-object</code> element 
    * @return the new created instance of <code>AdministeredObjectType<SessionBeanType<T>></code> 
    */
   public AdministeredObjectType<SessionBeanType<T>> createAdministeredObject()
   {
      return new AdministeredObjectTypeImpl<SessionBeanType<T>>(this, "administered-object", childNode);
   }

   /**
    * Returns all <code>administered-object</code> elements
    * @return list of <code>administered-object</code> 
    */
   public List<AdministeredObjectType<SessionBeanType<T>>> getAllAdministeredObject()
   {
      List<AdministeredObjectType<SessionBeanType<T>>> list = new ArrayList<AdministeredObjectType<SessionBeanType<T>>>();
      List<Node> nodeList = childNode.get("administered-object");
      for(Node node: nodeList)
      {
         AdministeredObjectType<SessionBeanType<T>>  type = new AdministeredObjectTypeImpl<SessionBeanType<T>>(this, "administered-object", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>administered-object</code> elements 
    * @return the current instance of <code>AdministeredObjectType<SessionBeanType<T>></code> 
    */
   public SessionBeanType<T> removeAllAdministeredObject()
   {
      childNode.removeChildren("administered-object");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionBeanType ElementName: javaee:service-refType ElementType : service-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>service-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>service-ref</code> element will be returned.
    * @return the instance defined for the element <code>service-ref</code> 
    */
   public ServiceRefType<SessionBeanType<T>> getOrCreateServiceRef()
   {
      List<Node> nodeList = childNode.get("service-ref");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ServiceRefTypeImpl<SessionBeanType<T>>(this, "service-ref", childNode, nodeList.get(0));
      }
      return createServiceRef();
   }

   /**
    * Creates a new <code>service-ref</code> element 
    * @return the new created instance of <code>ServiceRefType<SessionBeanType<T>></code> 
    */
   public ServiceRefType<SessionBeanType<T>> createServiceRef()
   {
      return new ServiceRefTypeImpl<SessionBeanType<T>>(this, "service-ref", childNode);
   }

   /**
    * Returns all <code>service-ref</code> elements
    * @return list of <code>service-ref</code> 
    */
   public List<ServiceRefType<SessionBeanType<T>>> getAllServiceRef()
   {
      List<ServiceRefType<SessionBeanType<T>>> list = new ArrayList<ServiceRefType<SessionBeanType<T>>>();
      List<Node> nodeList = childNode.get("service-ref");
      for(Node node: nodeList)
      {
         ServiceRefType<SessionBeanType<T>>  type = new ServiceRefTypeImpl<SessionBeanType<T>>(this, "service-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>service-ref</code> elements 
    * @return the current instance of <code>ServiceRefType<SessionBeanType<T>></code> 
    */
   public SessionBeanType<T> removeAllServiceRef()
   {
      childNode.removeChildren("service-ref");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionBeanType ElementName: javaee:xsdNMTOKENType ElementType : ejb-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>ejb-name</code> element
    * @param ejbName the value for the element <code>ejb-name</code> 
    * @return the current instance of <code>SessionBeanType<T></code> 
    */
   public SessionBeanType<T> ejbName(String ejbName)
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
    * @return the current instance of <code>SessionBeanType<T></code> 
    */
   public SessionBeanType<T> removeEjbName()
   {
      childNode.removeChildren("ejb-name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionBeanType ElementName: xsd:string ElementType : mapped-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>mapped-name</code> element
    * @param mappedName the value for the element <code>mapped-name</code> 
    * @return the current instance of <code>SessionBeanType<T></code> 
    */
   public SessionBeanType<T> mappedName(String mappedName)
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
    * @return the current instance of <code>SessionBeanType<T></code> 
    */
   public SessionBeanType<T> removeMappedName()
   {
      childNode.removeChildren("mapped-name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionBeanType ElementName: javaee:fully-qualified-classType ElementType : home
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>home</code> element
    * @param home the value for the element <code>home</code> 
    * @return the current instance of <code>SessionBeanType<T></code> 
    */
   public SessionBeanType<T> home(String home)
   {
      childNode.getOrCreate("home").text(home);
      return this;
   }

   /**
    * Returns the <code>home</code> element
    * @return the node defined for the element <code>home</code> 
    */
   public String getHome()
   {
      return childNode.getTextValueForPatternName("home");
   }

   /**
    * Removes the <code>home</code> element 
    * @return the current instance of <code>SessionBeanType<T></code> 
    */
   public SessionBeanType<T> removeHome()
   {
      childNode.removeChildren("home");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionBeanType ElementName: javaee:fully-qualified-classType ElementType : remote
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>remote</code> element
    * @param remote the value for the element <code>remote</code> 
    * @return the current instance of <code>SessionBeanType<T></code> 
    */
   public SessionBeanType<T> remote(String remote)
   {
      childNode.getOrCreate("remote").text(remote);
      return this;
   }

   /**
    * Returns the <code>remote</code> element
    * @return the node defined for the element <code>remote</code> 
    */
   public String getRemote()
   {
      return childNode.getTextValueForPatternName("remote");
   }

   /**
    * Removes the <code>remote</code> element 
    * @return the current instance of <code>SessionBeanType<T></code> 
    */
   public SessionBeanType<T> removeRemote()
   {
      childNode.removeChildren("remote");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionBeanType ElementName: javaee:fully-qualified-classType ElementType : local-home
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>local-home</code> element
    * @param localHome the value for the element <code>local-home</code> 
    * @return the current instance of <code>SessionBeanType<T></code> 
    */
   public SessionBeanType<T> localHome(String localHome)
   {
      childNode.getOrCreate("local-home").text(localHome);
      return this;
   }

   /**
    * Returns the <code>local-home</code> element
    * @return the node defined for the element <code>local-home</code> 
    */
   public String getLocalHome()
   {
      return childNode.getTextValueForPatternName("local-home");
   }

   /**
    * Removes the <code>local-home</code> element 
    * @return the current instance of <code>SessionBeanType<T></code> 
    */
   public SessionBeanType<T> removeLocalHome()
   {
      childNode.removeChildren("local-home");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionBeanType ElementName: javaee:fully-qualified-classType ElementType : local
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>local</code> element
    * @param local the value for the element <code>local</code> 
    * @return the current instance of <code>SessionBeanType<T></code> 
    */
   public SessionBeanType<T> local(String local)
   {
      childNode.getOrCreate("local").text(local);
      return this;
   }

   /**
    * Returns the <code>local</code> element
    * @return the node defined for the element <code>local</code> 
    */
   public String getLocal()
   {
      return childNode.getTextValueForPatternName("local");
   }

   /**
    * Removes the <code>local</code> element 
    * @return the current instance of <code>SessionBeanType<T></code> 
    */
   public SessionBeanType<T> removeLocal()
   {
      childNode.removeChildren("local");
      return this;
   }

 
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
   public SessionBeanType<T> businessLocal(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("business-local").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>business-local</code> elements
    * @return list of <code>business-local</code> 
    */
public List<String> getAllBusinessLocal()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("business-local");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>business-local</code> element 
    * @return the current instance of <code>SessionBeanType<T></code> 
    */
   public SessionBeanType<T> removeAllBusinessLocal()
   {
      childNode.removeChildren("business-local");
      return this;
   }

 
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
   public SessionBeanType<T> businessRemote(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("business-remote").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>business-remote</code> elements
    * @return list of <code>business-remote</code> 
    */
public List<String> getAllBusinessRemote()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("business-remote");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>business-remote</code> element 
    * @return the current instance of <code>SessionBeanType<T></code> 
    */
   public SessionBeanType<T> removeAllBusinessRemote()
   {
      childNode.removeChildren("business-remote");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionBeanType ElementName: javaee:emptyType ElementType : local-bean
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>local-bean</code> element 
    * @return the current instance of <code>SessionBeanType<T></code> 
    */
   public SessionBeanType<T> localBean()
   {
      childNode.getOrCreate("local-bean");
      return this;
   }

   /**
    * Removes the <code>local-bean</code> element 
    * @return the current instance of <code>SessionBeanType<T></code> 
    */
   public Boolean isLocalBean()
   {
      return childNode.getSingle("local-bean") != null;
   }

   /**
    * Removes the <code>local-bean</code> element 
    * @return the current instance of <code>SessionBeanType<T></code> 
    */
   public SessionBeanType<T> removeLocalBean()
   {
      childNode.removeChild("local-bean");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionBeanType ElementName: xsd:token ElementType : service-endpoint
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>service-endpoint</code> element
    * @param serviceEndpoint the value for the element <code>service-endpoint</code> 
    * @return the current instance of <code>SessionBeanType<T></code> 
    */
   public SessionBeanType<T> serviceEndpoint(String serviceEndpoint)
   {
      childNode.getOrCreate("service-endpoint").text(serviceEndpoint);
      return this;
   }

   /**
    * Returns the <code>service-endpoint</code> element
    * @return the node defined for the element <code>service-endpoint</code> 
    */
   public String getServiceEndpoint()
   {
      return childNode.getTextValueForPatternName("service-endpoint");
   }

   /**
    * Removes the <code>service-endpoint</code> element 
    * @return the current instance of <code>SessionBeanType<T></code> 
    */
   public SessionBeanType<T> removeServiceEndpoint()
   {
      childNode.removeChildren("service-endpoint");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionBeanType ElementName: javaee:fully-qualified-classType ElementType : ejb-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>ejb-class</code> element
    * @param ejbClass the value for the element <code>ejb-class</code> 
    * @return the current instance of <code>SessionBeanType<T></code> 
    */
   public SessionBeanType<T> ejbClass(String ejbClass)
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
    * @return the current instance of <code>SessionBeanType<T></code> 
    */
   public SessionBeanType<T> removeEjbClass()
   {
      childNode.removeChildren("ejb-class");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionBeanType ElementName: javaee:session-typeType ElementType : session-type
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>session-type</code> element
    * @param sessionType the value for the element <code>session-type</code> 
    * @return the current instance of <code>SessionBeanType<T></code> 
    */
   public SessionBeanType<T> sessionType(SessionTypeType sessionType)
   {
      childNode.getOrCreate("session-type").text(sessionType);
      return this;
   }
   /**
    * Sets the <code>session-type</code> element
    * @param sessionType the value for the element <code>session-type</code> 
    * @return the current instance of <code>SessionBeanType<T></code> 
    */
   public SessionBeanType<T> sessionType(String sessionType)
   {
      childNode.getOrCreate("session-type").text(sessionType);
      return this;
   }

   /**
    * Returns the <code>session-type</code> element
    * @return the value found for the element <code>session-type</code> 
    */
   public SessionTypeType getSessionType()
   {
      return SessionTypeType.getFromStringValue(childNode.getTextValueForPatternName("session-type"));
   }

   /**
    * Returns the <code>session-type</code> element
    * @return the value found for the element <code>session-type</code> 
    */
   public String  getSessionTypeAsString()
   {
      return childNode.getTextValueForPatternName("session-type");
   }

   /**
    * Removes the <code>session-type</code> attribute 
    * @return the current instance of <code>SessionBeanType<T></code> 
    */
   public SessionBeanType<T> removeSessionType()
   {
      childNode.removeAttribute("session-type");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionBeanType ElementName: javaee:stateful-timeoutType ElementType : stateful-timeout
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>stateful-timeout</code> element with the given value will be created.
    * Otherwise, the existing <code>stateful-timeout</code> element will be returned.
    * @return  a new or existing instance of <code>StatefulTimeoutType<SessionBeanType<T>></code> 
    */
   public StatefulTimeoutType<SessionBeanType<T>> getOrCreateStatefulTimeout()
   {
      Node node = childNode.getOrCreate("stateful-timeout");
      StatefulTimeoutType<SessionBeanType<T>> statefulTimeout = new StatefulTimeoutTypeImpl<SessionBeanType<T>>(this, "stateful-timeout", childNode, node);
      return statefulTimeout;
   }

   /**
    * Removes the <code>stateful-timeout</code> element 
    * @return the current instance of <code>SessionBeanType<T></code> 
    */
   public SessionBeanType<T> removeStatefulTimeout()
   {
      childNode.removeChildren("stateful-timeout");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionBeanType ElementName: javaee:named-methodType ElementType : timeout-method
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>timeout-method</code> element with the given value will be created.
    * Otherwise, the existing <code>timeout-method</code> element will be returned.
    * @return  a new or existing instance of <code>NamedMethodType<SessionBeanType<T>></code> 
    */
   public NamedMethodType<SessionBeanType<T>> getOrCreateTimeoutMethod()
   {
      Node node = childNode.getOrCreate("timeout-method");
      NamedMethodType<SessionBeanType<T>> timeoutMethod = new NamedMethodTypeImpl<SessionBeanType<T>>(this, "timeout-method", childNode, node);
      return timeoutMethod;
   }

   /**
    * Removes the <code>timeout-method</code> element 
    * @return the current instance of <code>SessionBeanType<T></code> 
    */
   public SessionBeanType<T> removeTimeoutMethod()
   {
      childNode.removeChildren("timeout-method");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionBeanType ElementName: javaee:timerType ElementType : timer
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>timer</code> element will be created and returned.
    * Otherwise, the first existing <code>timer</code> element will be returned.
    * @return the instance defined for the element <code>timer</code> 
    */
   public TimerType<SessionBeanType<T>> getOrCreateTimer()
   {
      List<Node> nodeList = childNode.get("timer");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new TimerTypeImpl<SessionBeanType<T>>(this, "timer", childNode, nodeList.get(0));
      }
      return createTimer();
   }

   /**
    * Creates a new <code>timer</code> element 
    * @return the new created instance of <code>TimerType<SessionBeanType<T>></code> 
    */
   public TimerType<SessionBeanType<T>> createTimer()
   {
      return new TimerTypeImpl<SessionBeanType<T>>(this, "timer", childNode);
   }

   /**
    * Returns all <code>timer</code> elements
    * @return list of <code>timer</code> 
    */
   public List<TimerType<SessionBeanType<T>>> getAllTimer()
   {
      List<TimerType<SessionBeanType<T>>> list = new ArrayList<TimerType<SessionBeanType<T>>>();
      List<Node> nodeList = childNode.get("timer");
      for(Node node: nodeList)
      {
         TimerType<SessionBeanType<T>>  type = new TimerTypeImpl<SessionBeanType<T>>(this, "timer", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>timer</code> elements 
    * @return the current instance of <code>TimerType<SessionBeanType<T>></code> 
    */
   public SessionBeanType<T> removeAllTimer()
   {
      childNode.removeChildren("timer");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionBeanType ElementName: javaee:xsdBooleanType ElementType : init-on-startup
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>init-on-startup</code> element
    * @param initOnStartup the value for the element <code>init-on-startup</code> 
    * @return the current instance of <code>SessionBeanType<T></code> 
    */
   public SessionBeanType<T> initOnStartup(Boolean initOnStartup)
   {
      childNode.getOrCreate("init-on-startup").text(initOnStartup);
      return this;
   }

   /**
    * Returns the <code>init-on-startup</code> element
    * @return the node defined for the element <code>init-on-startup</code> 
    */
   public Boolean isInitOnStartup()
   {
      return Strings.isTrue(childNode.getTextValueForPatternName("init-on-startup"));
   }

   /**
    * Removes the <code>init-on-startup</code> element 
    * @return the current instance of <code>SessionBeanType<T></code> 
    */
   public SessionBeanType<T> removeInitOnStartup()
   {
      childNode.removeChildren("init-on-startup");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionBeanType ElementName: javaee:concurrency-management-typeType ElementType : concurrency-management-type
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>concurrency-management-type</code> element
    * @param concurrencyManagementType the value for the element <code>concurrency-management-type</code> 
    * @return the current instance of <code>SessionBeanType<T></code> 
    */
   public SessionBeanType<T> concurrencyManagementType(ConcurrencyManagementTypeType concurrencyManagementType)
   {
      childNode.getOrCreate("concurrency-management-type").text(concurrencyManagementType);
      return this;
   }
   /**
    * Sets the <code>concurrency-management-type</code> element
    * @param concurrencyManagementType the value for the element <code>concurrency-management-type</code> 
    * @return the current instance of <code>SessionBeanType<T></code> 
    */
   public SessionBeanType<T> concurrencyManagementType(String concurrencyManagementType)
   {
      childNode.getOrCreate("concurrency-management-type").text(concurrencyManagementType);
      return this;
   }

   /**
    * Returns the <code>concurrency-management-type</code> element
    * @return the value found for the element <code>concurrency-management-type</code> 
    */
   public ConcurrencyManagementTypeType getConcurrencyManagementType()
   {
      return ConcurrencyManagementTypeType.getFromStringValue(childNode.getTextValueForPatternName("concurrency-management-type"));
   }

   /**
    * Returns the <code>concurrency-management-type</code> element
    * @return the value found for the element <code>concurrency-management-type</code> 
    */
   public String  getConcurrencyManagementTypeAsString()
   {
      return childNode.getTextValueForPatternName("concurrency-management-type");
   }

   /**
    * Removes the <code>concurrency-management-type</code> attribute 
    * @return the current instance of <code>SessionBeanType<T></code> 
    */
   public SessionBeanType<T> removeConcurrencyManagementType()
   {
      childNode.removeAttribute("concurrency-management-type");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionBeanType ElementName: javaee:concurrent-methodType ElementType : concurrent-method
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>concurrent-method</code> element will be created and returned.
    * Otherwise, the first existing <code>concurrent-method</code> element will be returned.
    * @return the instance defined for the element <code>concurrent-method</code> 
    */
   public ConcurrentMethodType<SessionBeanType<T>> getOrCreateConcurrentMethod()
   {
      List<Node> nodeList = childNode.get("concurrent-method");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ConcurrentMethodTypeImpl<SessionBeanType<T>>(this, "concurrent-method", childNode, nodeList.get(0));
      }
      return createConcurrentMethod();
   }

   /**
    * Creates a new <code>concurrent-method</code> element 
    * @return the new created instance of <code>ConcurrentMethodType<SessionBeanType<T>></code> 
    */
   public ConcurrentMethodType<SessionBeanType<T>> createConcurrentMethod()
   {
      return new ConcurrentMethodTypeImpl<SessionBeanType<T>>(this, "concurrent-method", childNode);
   }

   /**
    * Returns all <code>concurrent-method</code> elements
    * @return list of <code>concurrent-method</code> 
    */
   public List<ConcurrentMethodType<SessionBeanType<T>>> getAllConcurrentMethod()
   {
      List<ConcurrentMethodType<SessionBeanType<T>>> list = new ArrayList<ConcurrentMethodType<SessionBeanType<T>>>();
      List<Node> nodeList = childNode.get("concurrent-method");
      for(Node node: nodeList)
      {
         ConcurrentMethodType<SessionBeanType<T>>  type = new ConcurrentMethodTypeImpl<SessionBeanType<T>>(this, "concurrent-method", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>concurrent-method</code> elements 
    * @return the current instance of <code>ConcurrentMethodType<SessionBeanType<T>></code> 
    */
   public SessionBeanType<T> removeAllConcurrentMethod()
   {
      childNode.removeChildren("concurrent-method");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionBeanType ElementName: javaee:depends-onType ElementType : depends-on
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>depends-on</code> element with the given value will be created.
    * Otherwise, the existing <code>depends-on</code> element will be returned.
    * @return  a new or existing instance of <code>DependsOnType<SessionBeanType<T>></code> 
    */
   public DependsOnType<SessionBeanType<T>> getOrCreateDependsOn()
   {
      Node node = childNode.getOrCreate("depends-on");
      DependsOnType<SessionBeanType<T>> dependsOn = new DependsOnTypeImpl<SessionBeanType<T>>(this, "depends-on", childNode, node);
      return dependsOn;
   }

   /**
    * Removes the <code>depends-on</code> element 
    * @return the current instance of <code>SessionBeanType<T></code> 
    */
   public SessionBeanType<T> removeDependsOn()
   {
      childNode.removeChildren("depends-on");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionBeanType ElementName: javaee:init-methodType ElementType : init-method
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>init-method</code> element will be created and returned.
    * Otherwise, the first existing <code>init-method</code> element will be returned.
    * @return the instance defined for the element <code>init-method</code> 
    */
   public InitMethodType<SessionBeanType<T>> getOrCreateInitMethod()
   {
      List<Node> nodeList = childNode.get("init-method");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new InitMethodTypeImpl<SessionBeanType<T>>(this, "init-method", childNode, nodeList.get(0));
      }
      return createInitMethod();
   }

   /**
    * Creates a new <code>init-method</code> element 
    * @return the new created instance of <code>InitMethodType<SessionBeanType<T>></code> 
    */
   public InitMethodType<SessionBeanType<T>> createInitMethod()
   {
      return new InitMethodTypeImpl<SessionBeanType<T>>(this, "init-method", childNode);
   }

   /**
    * Returns all <code>init-method</code> elements
    * @return list of <code>init-method</code> 
    */
   public List<InitMethodType<SessionBeanType<T>>> getAllInitMethod()
   {
      List<InitMethodType<SessionBeanType<T>>> list = new ArrayList<InitMethodType<SessionBeanType<T>>>();
      List<Node> nodeList = childNode.get("init-method");
      for(Node node: nodeList)
      {
         InitMethodType<SessionBeanType<T>>  type = new InitMethodTypeImpl<SessionBeanType<T>>(this, "init-method", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>init-method</code> elements 
    * @return the current instance of <code>InitMethodType<SessionBeanType<T>></code> 
    */
   public SessionBeanType<T> removeAllInitMethod()
   {
      childNode.removeChildren("init-method");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionBeanType ElementName: javaee:remove-methodType ElementType : remove-method
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>remove-method</code> element will be created and returned.
    * Otherwise, the first existing <code>remove-method</code> element will be returned.
    * @return the instance defined for the element <code>remove-method</code> 
    */
   public RemoveMethodType<SessionBeanType<T>> getOrCreateRemoveMethod()
   {
      List<Node> nodeList = childNode.get("remove-method");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new RemoveMethodTypeImpl<SessionBeanType<T>>(this, "remove-method", childNode, nodeList.get(0));
      }
      return createRemoveMethod();
   }

   /**
    * Creates a new <code>remove-method</code> element 
    * @return the new created instance of <code>RemoveMethodType<SessionBeanType<T>></code> 
    */
   public RemoveMethodType<SessionBeanType<T>> createRemoveMethod()
   {
      return new RemoveMethodTypeImpl<SessionBeanType<T>>(this, "remove-method", childNode);
   }

   /**
    * Returns all <code>remove-method</code> elements
    * @return list of <code>remove-method</code> 
    */
   public List<RemoveMethodType<SessionBeanType<T>>> getAllRemoveMethod()
   {
      List<RemoveMethodType<SessionBeanType<T>>> list = new ArrayList<RemoveMethodType<SessionBeanType<T>>>();
      List<Node> nodeList = childNode.get("remove-method");
      for(Node node: nodeList)
      {
         RemoveMethodType<SessionBeanType<T>>  type = new RemoveMethodTypeImpl<SessionBeanType<T>>(this, "remove-method", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>remove-method</code> elements 
    * @return the current instance of <code>RemoveMethodType<SessionBeanType<T>></code> 
    */
   public SessionBeanType<T> removeAllRemoveMethod()
   {
      childNode.removeChildren("remove-method");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionBeanType ElementName: javaee:async-methodType ElementType : async-method
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>async-method</code> element will be created and returned.
    * Otherwise, the first existing <code>async-method</code> element will be returned.
    * @return the instance defined for the element <code>async-method</code> 
    */
   public AsyncMethodType<SessionBeanType<T>> getOrCreateAsyncMethod()
   {
      List<Node> nodeList = childNode.get("async-method");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new AsyncMethodTypeImpl<SessionBeanType<T>>(this, "async-method", childNode, nodeList.get(0));
      }
      return createAsyncMethod();
   }

   /**
    * Creates a new <code>async-method</code> element 
    * @return the new created instance of <code>AsyncMethodType<SessionBeanType<T>></code> 
    */
   public AsyncMethodType<SessionBeanType<T>> createAsyncMethod()
   {
      return new AsyncMethodTypeImpl<SessionBeanType<T>>(this, "async-method", childNode);
   }

   /**
    * Returns all <code>async-method</code> elements
    * @return list of <code>async-method</code> 
    */
   public List<AsyncMethodType<SessionBeanType<T>>> getAllAsyncMethod()
   {
      List<AsyncMethodType<SessionBeanType<T>>> list = new ArrayList<AsyncMethodType<SessionBeanType<T>>>();
      List<Node> nodeList = childNode.get("async-method");
      for(Node node: nodeList)
      {
         AsyncMethodType<SessionBeanType<T>>  type = new AsyncMethodTypeImpl<SessionBeanType<T>>(this, "async-method", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>async-method</code> elements 
    * @return the current instance of <code>AsyncMethodType<SessionBeanType<T>></code> 
    */
   public SessionBeanType<T> removeAllAsyncMethod()
   {
      childNode.removeChildren("async-method");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionBeanType ElementName: javaee:transaction-typeType ElementType : transaction-type
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>transaction-type</code> element
    * @param transactionType the value for the element <code>transaction-type</code> 
    * @return the current instance of <code>SessionBeanType<T></code> 
    */
   public SessionBeanType<T> transactionType(TransactionTypeType transactionType)
   {
      childNode.getOrCreate("transaction-type").text(transactionType);
      return this;
   }
   /**
    * Sets the <code>transaction-type</code> element
    * @param transactionType the value for the element <code>transaction-type</code> 
    * @return the current instance of <code>SessionBeanType<T></code> 
    */
   public SessionBeanType<T> transactionType(String transactionType)
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
    * @return the current instance of <code>SessionBeanType<T></code> 
    */
   public SessionBeanType<T> removeTransactionType()
   {
      childNode.removeAttribute("transaction-type");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionBeanType ElementName: javaee:named-methodType ElementType : after-begin-method
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>after-begin-method</code> element with the given value will be created.
    * Otherwise, the existing <code>after-begin-method</code> element will be returned.
    * @return  a new or existing instance of <code>NamedMethodType<SessionBeanType<T>></code> 
    */
   public NamedMethodType<SessionBeanType<T>> getOrCreateAfterBeginMethod()
   {
      Node node = childNode.getOrCreate("after-begin-method");
      NamedMethodType<SessionBeanType<T>> afterBeginMethod = new NamedMethodTypeImpl<SessionBeanType<T>>(this, "after-begin-method", childNode, node);
      return afterBeginMethod;
   }

   /**
    * Removes the <code>after-begin-method</code> element 
    * @return the current instance of <code>SessionBeanType<T></code> 
    */
   public SessionBeanType<T> removeAfterBeginMethod()
   {
      childNode.removeChildren("after-begin-method");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionBeanType ElementName: javaee:named-methodType ElementType : before-completion-method
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>before-completion-method</code> element with the given value will be created.
    * Otherwise, the existing <code>before-completion-method</code> element will be returned.
    * @return  a new or existing instance of <code>NamedMethodType<SessionBeanType<T>></code> 
    */
   public NamedMethodType<SessionBeanType<T>> getOrCreateBeforeCompletionMethod()
   {
      Node node = childNode.getOrCreate("before-completion-method");
      NamedMethodType<SessionBeanType<T>> beforeCompletionMethod = new NamedMethodTypeImpl<SessionBeanType<T>>(this, "before-completion-method", childNode, node);
      return beforeCompletionMethod;
   }

   /**
    * Removes the <code>before-completion-method</code> element 
    * @return the current instance of <code>SessionBeanType<T></code> 
    */
   public SessionBeanType<T> removeBeforeCompletionMethod()
   {
      childNode.removeChildren("before-completion-method");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionBeanType ElementName: javaee:named-methodType ElementType : after-completion-method
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>after-completion-method</code> element with the given value will be created.
    * Otherwise, the existing <code>after-completion-method</code> element will be returned.
    * @return  a new or existing instance of <code>NamedMethodType<SessionBeanType<T>></code> 
    */
   public NamedMethodType<SessionBeanType<T>> getOrCreateAfterCompletionMethod()
   {
      Node node = childNode.getOrCreate("after-completion-method");
      NamedMethodType<SessionBeanType<T>> afterCompletionMethod = new NamedMethodTypeImpl<SessionBeanType<T>>(this, "after-completion-method", childNode, node);
      return afterCompletionMethod;
   }

   /**
    * Removes the <code>after-completion-method</code> element 
    * @return the current instance of <code>SessionBeanType<T></code> 
    */
   public SessionBeanType<T> removeAfterCompletionMethod()
   {
      childNode.removeChildren("after-completion-method");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionBeanType ElementName: javaee:around-invokeType ElementType : around-invoke
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>around-invoke</code> element will be created and returned.
    * Otherwise, the first existing <code>around-invoke</code> element will be returned.
    * @return the instance defined for the element <code>around-invoke</code> 
    */
   public AroundInvokeType<SessionBeanType<T>> getOrCreateAroundInvoke()
   {
      List<Node> nodeList = childNode.get("around-invoke");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new AroundInvokeTypeImpl<SessionBeanType<T>>(this, "around-invoke", childNode, nodeList.get(0));
      }
      return createAroundInvoke();
   }

   /**
    * Creates a new <code>around-invoke</code> element 
    * @return the new created instance of <code>AroundInvokeType<SessionBeanType<T>></code> 
    */
   public AroundInvokeType<SessionBeanType<T>> createAroundInvoke()
   {
      return new AroundInvokeTypeImpl<SessionBeanType<T>>(this, "around-invoke", childNode);
   }

   /**
    * Returns all <code>around-invoke</code> elements
    * @return list of <code>around-invoke</code> 
    */
   public List<AroundInvokeType<SessionBeanType<T>>> getAllAroundInvoke()
   {
      List<AroundInvokeType<SessionBeanType<T>>> list = new ArrayList<AroundInvokeType<SessionBeanType<T>>>();
      List<Node> nodeList = childNode.get("around-invoke");
      for(Node node: nodeList)
      {
         AroundInvokeType<SessionBeanType<T>>  type = new AroundInvokeTypeImpl<SessionBeanType<T>>(this, "around-invoke", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>around-invoke</code> elements 
    * @return the current instance of <code>AroundInvokeType<SessionBeanType<T>></code> 
    */
   public SessionBeanType<T> removeAllAroundInvoke()
   {
      childNode.removeChildren("around-invoke");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionBeanType ElementName: javaee:around-timeoutType ElementType : around-timeout
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>around-timeout</code> element will be created and returned.
    * Otherwise, the first existing <code>around-timeout</code> element will be returned.
    * @return the instance defined for the element <code>around-timeout</code> 
    */
   public AroundTimeoutType<SessionBeanType<T>> getOrCreateAroundTimeout()
   {
      List<Node> nodeList = childNode.get("around-timeout");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new AroundTimeoutTypeImpl<SessionBeanType<T>>(this, "around-timeout", childNode, nodeList.get(0));
      }
      return createAroundTimeout();
   }

   /**
    * Creates a new <code>around-timeout</code> element 
    * @return the new created instance of <code>AroundTimeoutType<SessionBeanType<T>></code> 
    */
   public AroundTimeoutType<SessionBeanType<T>> createAroundTimeout()
   {
      return new AroundTimeoutTypeImpl<SessionBeanType<T>>(this, "around-timeout", childNode);
   }

   /**
    * Returns all <code>around-timeout</code> elements
    * @return list of <code>around-timeout</code> 
    */
   public List<AroundTimeoutType<SessionBeanType<T>>> getAllAroundTimeout()
   {
      List<AroundTimeoutType<SessionBeanType<T>>> list = new ArrayList<AroundTimeoutType<SessionBeanType<T>>>();
      List<Node> nodeList = childNode.get("around-timeout");
      for(Node node: nodeList)
      {
         AroundTimeoutType<SessionBeanType<T>>  type = new AroundTimeoutTypeImpl<SessionBeanType<T>>(this, "around-timeout", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>around-timeout</code> elements 
    * @return the current instance of <code>AroundTimeoutType<SessionBeanType<T>></code> 
    */
   public SessionBeanType<T> removeAllAroundTimeout()
   {
      childNode.removeChildren("around-timeout");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionBeanType ElementName: javaee:lifecycle-callbackType ElementType : post-activate
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>post-activate</code> element will be created and returned.
    * Otherwise, the first existing <code>post-activate</code> element will be returned.
    * @return the instance defined for the element <code>post-activate</code> 
    */
   public LifecycleCallbackType<SessionBeanType<T>> getOrCreatePostActivate()
   {
      List<Node> nodeList = childNode.get("post-activate");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new LifecycleCallbackTypeImpl<SessionBeanType<T>>(this, "post-activate", childNode, nodeList.get(0));
      }
      return createPostActivate();
   }

   /**
    * Creates a new <code>post-activate</code> element 
    * @return the new created instance of <code>LifecycleCallbackType<SessionBeanType<T>></code> 
    */
   public LifecycleCallbackType<SessionBeanType<T>> createPostActivate()
   {
      return new LifecycleCallbackTypeImpl<SessionBeanType<T>>(this, "post-activate", childNode);
   }

   /**
    * Returns all <code>post-activate</code> elements
    * @return list of <code>post-activate</code> 
    */
   public List<LifecycleCallbackType<SessionBeanType<T>>> getAllPostActivate()
   {
      List<LifecycleCallbackType<SessionBeanType<T>>> list = new ArrayList<LifecycleCallbackType<SessionBeanType<T>>>();
      List<Node> nodeList = childNode.get("post-activate");
      for(Node node: nodeList)
      {
         LifecycleCallbackType<SessionBeanType<T>>  type = new LifecycleCallbackTypeImpl<SessionBeanType<T>>(this, "post-activate", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>post-activate</code> elements 
    * @return the current instance of <code>LifecycleCallbackType<SessionBeanType<T>></code> 
    */
   public SessionBeanType<T> removeAllPostActivate()
   {
      childNode.removeChildren("post-activate");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionBeanType ElementName: javaee:lifecycle-callbackType ElementType : pre-passivate
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>pre-passivate</code> element will be created and returned.
    * Otherwise, the first existing <code>pre-passivate</code> element will be returned.
    * @return the instance defined for the element <code>pre-passivate</code> 
    */
   public LifecycleCallbackType<SessionBeanType<T>> getOrCreatePrePassivate()
   {
      List<Node> nodeList = childNode.get("pre-passivate");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new LifecycleCallbackTypeImpl<SessionBeanType<T>>(this, "pre-passivate", childNode, nodeList.get(0));
      }
      return createPrePassivate();
   }

   /**
    * Creates a new <code>pre-passivate</code> element 
    * @return the new created instance of <code>LifecycleCallbackType<SessionBeanType<T>></code> 
    */
   public LifecycleCallbackType<SessionBeanType<T>> createPrePassivate()
   {
      return new LifecycleCallbackTypeImpl<SessionBeanType<T>>(this, "pre-passivate", childNode);
   }

   /**
    * Returns all <code>pre-passivate</code> elements
    * @return list of <code>pre-passivate</code> 
    */
   public List<LifecycleCallbackType<SessionBeanType<T>>> getAllPrePassivate()
   {
      List<LifecycleCallbackType<SessionBeanType<T>>> list = new ArrayList<LifecycleCallbackType<SessionBeanType<T>>>();
      List<Node> nodeList = childNode.get("pre-passivate");
      for(Node node: nodeList)
      {
         LifecycleCallbackType<SessionBeanType<T>>  type = new LifecycleCallbackTypeImpl<SessionBeanType<T>>(this, "pre-passivate", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>pre-passivate</code> elements 
    * @return the current instance of <code>LifecycleCallbackType<SessionBeanType<T>></code> 
    */
   public SessionBeanType<T> removeAllPrePassivate()
   {
      childNode.removeChildren("pre-passivate");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionBeanType ElementName: javaee:security-role-refType ElementType : security-role-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>security-role-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>security-role-ref</code> element will be returned.
    * @return the instance defined for the element <code>security-role-ref</code> 
    */
   public SecurityRoleRefType<SessionBeanType<T>> getOrCreateSecurityRoleRef()
   {
      List<Node> nodeList = childNode.get("security-role-ref");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new SecurityRoleRefTypeImpl<SessionBeanType<T>>(this, "security-role-ref", childNode, nodeList.get(0));
      }
      return createSecurityRoleRef();
   }

   /**
    * Creates a new <code>security-role-ref</code> element 
    * @return the new created instance of <code>SecurityRoleRefType<SessionBeanType<T>></code> 
    */
   public SecurityRoleRefType<SessionBeanType<T>> createSecurityRoleRef()
   {
      return new SecurityRoleRefTypeImpl<SessionBeanType<T>>(this, "security-role-ref", childNode);
   }

   /**
    * Returns all <code>security-role-ref</code> elements
    * @return list of <code>security-role-ref</code> 
    */
   public List<SecurityRoleRefType<SessionBeanType<T>>> getAllSecurityRoleRef()
   {
      List<SecurityRoleRefType<SessionBeanType<T>>> list = new ArrayList<SecurityRoleRefType<SessionBeanType<T>>>();
      List<Node> nodeList = childNode.get("security-role-ref");
      for(Node node: nodeList)
      {
         SecurityRoleRefType<SessionBeanType<T>>  type = new SecurityRoleRefTypeImpl<SessionBeanType<T>>(this, "security-role-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>security-role-ref</code> elements 
    * @return the current instance of <code>SecurityRoleRefType<SessionBeanType<T>></code> 
    */
   public SessionBeanType<T> removeAllSecurityRoleRef()
   {
      childNode.removeChildren("security-role-ref");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionBeanType ElementName: javaee:security-identityType ElementType : security-identity
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>security-identity</code> element with the given value will be created.
    * Otherwise, the existing <code>security-identity</code> element will be returned.
    * @return  a new or existing instance of <code>SecurityIdentityType<SessionBeanType<T>></code> 
    */
   public SecurityIdentityType<SessionBeanType<T>> getOrCreateSecurityIdentity()
   {
      Node node = childNode.getOrCreate("security-identity");
      SecurityIdentityType<SessionBeanType<T>> securityIdentity = new SecurityIdentityTypeImpl<SessionBeanType<T>>(this, "security-identity", childNode, node);
      return securityIdentity;
   }

   /**
    * Removes the <code>security-identity</code> element 
    * @return the current instance of <code>SessionBeanType<T></code> 
    */
   public SessionBeanType<T> removeSecurityIdentity()
   {
      childNode.removeChildren("security-identity");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionBeanType ElementName: xsd:boolean ElementType : passivation-capable
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>passivation-capable</code> element
    * @param passivationCapable the value for the element <code>passivation-capable</code> 
    * @return the current instance of <code>SessionBeanType<T></code> 
    */
   public SessionBeanType<T> passivationCapable(Boolean passivationCapable)
   {
      childNode.getOrCreate("passivation-capable").text(passivationCapable);
      return this;
   }

   /**
    * Returns the <code>passivation-capable</code> element
    * @return the node defined for the element <code>passivation-capable</code> 
    */
   public Boolean isPassivationCapable()
   {
      return Strings.isTrue(childNode.getTextValueForPatternName("passivation-capable"));
   }

   /**
    * Removes the <code>passivation-capable</code> element 
    * @return the current instance of <code>SessionBeanType<T></code> 
    */
   public SessionBeanType<T> removePassivationCapable()
   {
      childNode.removeChildren("passivation-capable");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionBeanType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>SessionBeanType<T></code> 
    */
   public SessionBeanType<T> id(String id)
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
    * @return the current instance of <code>SessionBeanType<T></code> 
    */
   public SessionBeanType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
