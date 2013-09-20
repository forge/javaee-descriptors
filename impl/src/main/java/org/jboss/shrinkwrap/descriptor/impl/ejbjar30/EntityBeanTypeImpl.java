package org.jboss.shrinkwrap.descriptor.impl.ejbjar30; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.CmpFieldType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.CmpVersionType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.EntityBeanType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.PersistenceTypeType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.QueryType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.SecurityIdentityType;
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
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.EjbLocalRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.EjbRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.EnvEntryTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.IconTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.LifecycleCallbackTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.MessageDestinationRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.PersistenceContextRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.PersistenceUnitRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.ResourceEnvRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.ResourceRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.SecurityRoleRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaeewebservicesclient12.ServiceRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> entity-beanType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class EntityBeanTypeImpl<T> implements Child<T>, EntityBeanType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public EntityBeanTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public EntityBeanTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
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
   public EntityBeanType<T> description(String ... values)
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
    * @return the current instance of <code>EntityBeanType<T></code> 
    */
   public EntityBeanType<T> removeAllDescription()
   {
      childNode.removeChildren("description");
      return this;
   }
 
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
   public EntityBeanType<T> displayName(String ... values)
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
    * @return the current instance of <code>EntityBeanType<T></code> 
    */
   public EntityBeanType<T> removeAllDisplayName()
   {
      childNode.removeChildren("display-name");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityBeanType ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<EntityBeanType<T>> getOrCreateIcon()
   {
      List<Node> nodeList = childNode.get("icon");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new IconTypeImpl<EntityBeanType<T>>(this, "icon", childNode, nodeList.get(0));
      }
      return createIcon();
   }

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<EntityBeanType<T>></code> 
    */
   public IconType<EntityBeanType<T>> createIcon()
   {
      return new IconTypeImpl<EntityBeanType<T>>(this, "icon", childNode);
   }

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<EntityBeanType<T>>> getAllIcon()
   {
      List<IconType<EntityBeanType<T>>> list = new ArrayList<IconType<EntityBeanType<T>>>();
      List<Node> nodeList = childNode.get("icon");
      for(Node node: nodeList)
      {
         IconType<EntityBeanType<T>>  type = new IconTypeImpl<EntityBeanType<T>>(this, "icon", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<EntityBeanType<T>></code> 
    */
   public EntityBeanType<T> removeAllIcon()
   {
      childNode.removeChildren("icon");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityBeanType ElementName: javaee:env-entryType ElementType : env-entry
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>env-entry</code> element will be created and returned.
    * Otherwise, the first existing <code>env-entry</code> element will be returned.
    * @return the instance defined for the element <code>env-entry</code> 
    */
   public EnvEntryType<EntityBeanType<T>> getOrCreateEnvEntry()
   {
      List<Node> nodeList = childNode.get("env-entry");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new EnvEntryTypeImpl<EntityBeanType<T>>(this, "env-entry", childNode, nodeList.get(0));
      }
      return createEnvEntry();
   }

   /**
    * Creates a new <code>env-entry</code> element 
    * @return the new created instance of <code>EnvEntryType<EntityBeanType<T>></code> 
    */
   public EnvEntryType<EntityBeanType<T>> createEnvEntry()
   {
      return new EnvEntryTypeImpl<EntityBeanType<T>>(this, "env-entry", childNode);
   }

   /**
    * Returns all <code>env-entry</code> elements
    * @return list of <code>env-entry</code> 
    */
   public List<EnvEntryType<EntityBeanType<T>>> getAllEnvEntry()
   {
      List<EnvEntryType<EntityBeanType<T>>> list = new ArrayList<EnvEntryType<EntityBeanType<T>>>();
      List<Node> nodeList = childNode.get("env-entry");
      for(Node node: nodeList)
      {
         EnvEntryType<EntityBeanType<T>>  type = new EnvEntryTypeImpl<EntityBeanType<T>>(this, "env-entry", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>env-entry</code> elements 
    * @return the current instance of <code>EnvEntryType<EntityBeanType<T>></code> 
    */
   public EntityBeanType<T> removeAllEnvEntry()
   {
      childNode.removeChildren("env-entry");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityBeanType ElementName: javaee:ejb-refType ElementType : ejb-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>ejb-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>ejb-ref</code> element will be returned.
    * @return the instance defined for the element <code>ejb-ref</code> 
    */
   public EjbRefType<EntityBeanType<T>> getOrCreateEjbRef()
   {
      List<Node> nodeList = childNode.get("ejb-ref");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new EjbRefTypeImpl<EntityBeanType<T>>(this, "ejb-ref", childNode, nodeList.get(0));
      }
      return createEjbRef();
   }

   /**
    * Creates a new <code>ejb-ref</code> element 
    * @return the new created instance of <code>EjbRefType<EntityBeanType<T>></code> 
    */
   public EjbRefType<EntityBeanType<T>> createEjbRef()
   {
      return new EjbRefTypeImpl<EntityBeanType<T>>(this, "ejb-ref", childNode);
   }

   /**
    * Returns all <code>ejb-ref</code> elements
    * @return list of <code>ejb-ref</code> 
    */
   public List<EjbRefType<EntityBeanType<T>>> getAllEjbRef()
   {
      List<EjbRefType<EntityBeanType<T>>> list = new ArrayList<EjbRefType<EntityBeanType<T>>>();
      List<Node> nodeList = childNode.get("ejb-ref");
      for(Node node: nodeList)
      {
         EjbRefType<EntityBeanType<T>>  type = new EjbRefTypeImpl<EntityBeanType<T>>(this, "ejb-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>ejb-ref</code> elements 
    * @return the current instance of <code>EjbRefType<EntityBeanType<T>></code> 
    */
   public EntityBeanType<T> removeAllEjbRef()
   {
      childNode.removeChildren("ejb-ref");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityBeanType ElementName: javaee:ejb-local-refType ElementType : ejb-local-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>ejb-local-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>ejb-local-ref</code> element will be returned.
    * @return the instance defined for the element <code>ejb-local-ref</code> 
    */
   public EjbLocalRefType<EntityBeanType<T>> getOrCreateEjbLocalRef()
   {
      List<Node> nodeList = childNode.get("ejb-local-ref");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new EjbLocalRefTypeImpl<EntityBeanType<T>>(this, "ejb-local-ref", childNode, nodeList.get(0));
      }
      return createEjbLocalRef();
   }

   /**
    * Creates a new <code>ejb-local-ref</code> element 
    * @return the new created instance of <code>EjbLocalRefType<EntityBeanType<T>></code> 
    */
   public EjbLocalRefType<EntityBeanType<T>> createEjbLocalRef()
   {
      return new EjbLocalRefTypeImpl<EntityBeanType<T>>(this, "ejb-local-ref", childNode);
   }

   /**
    * Returns all <code>ejb-local-ref</code> elements
    * @return list of <code>ejb-local-ref</code> 
    */
   public List<EjbLocalRefType<EntityBeanType<T>>> getAllEjbLocalRef()
   {
      List<EjbLocalRefType<EntityBeanType<T>>> list = new ArrayList<EjbLocalRefType<EntityBeanType<T>>>();
      List<Node> nodeList = childNode.get("ejb-local-ref");
      for(Node node: nodeList)
      {
         EjbLocalRefType<EntityBeanType<T>>  type = new EjbLocalRefTypeImpl<EntityBeanType<T>>(this, "ejb-local-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>ejb-local-ref</code> elements 
    * @return the current instance of <code>EjbLocalRefType<EntityBeanType<T>></code> 
    */
   public EntityBeanType<T> removeAllEjbLocalRef()
   {
      childNode.removeChildren("ejb-local-ref");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityBeanType ElementName: javaee:resource-refType ElementType : resource-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>resource-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>resource-ref</code> element will be returned.
    * @return the instance defined for the element <code>resource-ref</code> 
    */
   public ResourceRefType<EntityBeanType<T>> getOrCreateResourceRef()
   {
      List<Node> nodeList = childNode.get("resource-ref");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ResourceRefTypeImpl<EntityBeanType<T>>(this, "resource-ref", childNode, nodeList.get(0));
      }
      return createResourceRef();
   }

   /**
    * Creates a new <code>resource-ref</code> element 
    * @return the new created instance of <code>ResourceRefType<EntityBeanType<T>></code> 
    */
   public ResourceRefType<EntityBeanType<T>> createResourceRef()
   {
      return new ResourceRefTypeImpl<EntityBeanType<T>>(this, "resource-ref", childNode);
   }

   /**
    * Returns all <code>resource-ref</code> elements
    * @return list of <code>resource-ref</code> 
    */
   public List<ResourceRefType<EntityBeanType<T>>> getAllResourceRef()
   {
      List<ResourceRefType<EntityBeanType<T>>> list = new ArrayList<ResourceRefType<EntityBeanType<T>>>();
      List<Node> nodeList = childNode.get("resource-ref");
      for(Node node: nodeList)
      {
         ResourceRefType<EntityBeanType<T>>  type = new ResourceRefTypeImpl<EntityBeanType<T>>(this, "resource-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>resource-ref</code> elements 
    * @return the current instance of <code>ResourceRefType<EntityBeanType<T>></code> 
    */
   public EntityBeanType<T> removeAllResourceRef()
   {
      childNode.removeChildren("resource-ref");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityBeanType ElementName: javaee:resource-env-refType ElementType : resource-env-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>resource-env-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>resource-env-ref</code> element will be returned.
    * @return the instance defined for the element <code>resource-env-ref</code> 
    */
   public ResourceEnvRefType<EntityBeanType<T>> getOrCreateResourceEnvRef()
   {
      List<Node> nodeList = childNode.get("resource-env-ref");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ResourceEnvRefTypeImpl<EntityBeanType<T>>(this, "resource-env-ref", childNode, nodeList.get(0));
      }
      return createResourceEnvRef();
   }

   /**
    * Creates a new <code>resource-env-ref</code> element 
    * @return the new created instance of <code>ResourceEnvRefType<EntityBeanType<T>></code> 
    */
   public ResourceEnvRefType<EntityBeanType<T>> createResourceEnvRef()
   {
      return new ResourceEnvRefTypeImpl<EntityBeanType<T>>(this, "resource-env-ref", childNode);
   }

   /**
    * Returns all <code>resource-env-ref</code> elements
    * @return list of <code>resource-env-ref</code> 
    */
   public List<ResourceEnvRefType<EntityBeanType<T>>> getAllResourceEnvRef()
   {
      List<ResourceEnvRefType<EntityBeanType<T>>> list = new ArrayList<ResourceEnvRefType<EntityBeanType<T>>>();
      List<Node> nodeList = childNode.get("resource-env-ref");
      for(Node node: nodeList)
      {
         ResourceEnvRefType<EntityBeanType<T>>  type = new ResourceEnvRefTypeImpl<EntityBeanType<T>>(this, "resource-env-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>resource-env-ref</code> elements 
    * @return the current instance of <code>ResourceEnvRefType<EntityBeanType<T>></code> 
    */
   public EntityBeanType<T> removeAllResourceEnvRef()
   {
      childNode.removeChildren("resource-env-ref");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityBeanType ElementName: javaee:message-destination-refType ElementType : message-destination-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>message-destination-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>message-destination-ref</code> element will be returned.
    * @return the instance defined for the element <code>message-destination-ref</code> 
    */
   public MessageDestinationRefType<EntityBeanType<T>> getOrCreateMessageDestinationRef()
   {
      List<Node> nodeList = childNode.get("message-destination-ref");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new MessageDestinationRefTypeImpl<EntityBeanType<T>>(this, "message-destination-ref", childNode, nodeList.get(0));
      }
      return createMessageDestinationRef();
   }

   /**
    * Creates a new <code>message-destination-ref</code> element 
    * @return the new created instance of <code>MessageDestinationRefType<EntityBeanType<T>></code> 
    */
   public MessageDestinationRefType<EntityBeanType<T>> createMessageDestinationRef()
   {
      return new MessageDestinationRefTypeImpl<EntityBeanType<T>>(this, "message-destination-ref", childNode);
   }

   /**
    * Returns all <code>message-destination-ref</code> elements
    * @return list of <code>message-destination-ref</code> 
    */
   public List<MessageDestinationRefType<EntityBeanType<T>>> getAllMessageDestinationRef()
   {
      List<MessageDestinationRefType<EntityBeanType<T>>> list = new ArrayList<MessageDestinationRefType<EntityBeanType<T>>>();
      List<Node> nodeList = childNode.get("message-destination-ref");
      for(Node node: nodeList)
      {
         MessageDestinationRefType<EntityBeanType<T>>  type = new MessageDestinationRefTypeImpl<EntityBeanType<T>>(this, "message-destination-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>message-destination-ref</code> elements 
    * @return the current instance of <code>MessageDestinationRefType<EntityBeanType<T>></code> 
    */
   public EntityBeanType<T> removeAllMessageDestinationRef()
   {
      childNode.removeChildren("message-destination-ref");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityBeanType ElementName: javaee:persistence-context-refType ElementType : persistence-context-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>persistence-context-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>persistence-context-ref</code> element will be returned.
    * @return the instance defined for the element <code>persistence-context-ref</code> 
    */
   public PersistenceContextRefType<EntityBeanType<T>> getOrCreatePersistenceContextRef()
   {
      List<Node> nodeList = childNode.get("persistence-context-ref");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new PersistenceContextRefTypeImpl<EntityBeanType<T>>(this, "persistence-context-ref", childNode, nodeList.get(0));
      }
      return createPersistenceContextRef();
   }

   /**
    * Creates a new <code>persistence-context-ref</code> element 
    * @return the new created instance of <code>PersistenceContextRefType<EntityBeanType<T>></code> 
    */
   public PersistenceContextRefType<EntityBeanType<T>> createPersistenceContextRef()
   {
      return new PersistenceContextRefTypeImpl<EntityBeanType<T>>(this, "persistence-context-ref", childNode);
   }

   /**
    * Returns all <code>persistence-context-ref</code> elements
    * @return list of <code>persistence-context-ref</code> 
    */
   public List<PersistenceContextRefType<EntityBeanType<T>>> getAllPersistenceContextRef()
   {
      List<PersistenceContextRefType<EntityBeanType<T>>> list = new ArrayList<PersistenceContextRefType<EntityBeanType<T>>>();
      List<Node> nodeList = childNode.get("persistence-context-ref");
      for(Node node: nodeList)
      {
         PersistenceContextRefType<EntityBeanType<T>>  type = new PersistenceContextRefTypeImpl<EntityBeanType<T>>(this, "persistence-context-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>persistence-context-ref</code> elements 
    * @return the current instance of <code>PersistenceContextRefType<EntityBeanType<T>></code> 
    */
   public EntityBeanType<T> removeAllPersistenceContextRef()
   {
      childNode.removeChildren("persistence-context-ref");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityBeanType ElementName: javaee:persistence-unit-refType ElementType : persistence-unit-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>persistence-unit-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>persistence-unit-ref</code> element will be returned.
    * @return the instance defined for the element <code>persistence-unit-ref</code> 
    */
   public PersistenceUnitRefType<EntityBeanType<T>> getOrCreatePersistenceUnitRef()
   {
      List<Node> nodeList = childNode.get("persistence-unit-ref");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new PersistenceUnitRefTypeImpl<EntityBeanType<T>>(this, "persistence-unit-ref", childNode, nodeList.get(0));
      }
      return createPersistenceUnitRef();
   }

   /**
    * Creates a new <code>persistence-unit-ref</code> element 
    * @return the new created instance of <code>PersistenceUnitRefType<EntityBeanType<T>></code> 
    */
   public PersistenceUnitRefType<EntityBeanType<T>> createPersistenceUnitRef()
   {
      return new PersistenceUnitRefTypeImpl<EntityBeanType<T>>(this, "persistence-unit-ref", childNode);
   }

   /**
    * Returns all <code>persistence-unit-ref</code> elements
    * @return list of <code>persistence-unit-ref</code> 
    */
   public List<PersistenceUnitRefType<EntityBeanType<T>>> getAllPersistenceUnitRef()
   {
      List<PersistenceUnitRefType<EntityBeanType<T>>> list = new ArrayList<PersistenceUnitRefType<EntityBeanType<T>>>();
      List<Node> nodeList = childNode.get("persistence-unit-ref");
      for(Node node: nodeList)
      {
         PersistenceUnitRefType<EntityBeanType<T>>  type = new PersistenceUnitRefTypeImpl<EntityBeanType<T>>(this, "persistence-unit-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>persistence-unit-ref</code> elements 
    * @return the current instance of <code>PersistenceUnitRefType<EntityBeanType<T>></code> 
    */
   public EntityBeanType<T> removeAllPersistenceUnitRef()
   {
      childNode.removeChildren("persistence-unit-ref");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityBeanType ElementName: javaee:lifecycle-callbackType ElementType : post-construct
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>post-construct</code> element will be created and returned.
    * Otherwise, the first existing <code>post-construct</code> element will be returned.
    * @return the instance defined for the element <code>post-construct</code> 
    */
   public LifecycleCallbackType<EntityBeanType<T>> getOrCreatePostConstruct()
   {
      List<Node> nodeList = childNode.get("post-construct");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new LifecycleCallbackTypeImpl<EntityBeanType<T>>(this, "post-construct", childNode, nodeList.get(0));
      }
      return createPostConstruct();
   }

   /**
    * Creates a new <code>post-construct</code> element 
    * @return the new created instance of <code>LifecycleCallbackType<EntityBeanType<T>></code> 
    */
   public LifecycleCallbackType<EntityBeanType<T>> createPostConstruct()
   {
      return new LifecycleCallbackTypeImpl<EntityBeanType<T>>(this, "post-construct", childNode);
   }

   /**
    * Returns all <code>post-construct</code> elements
    * @return list of <code>post-construct</code> 
    */
   public List<LifecycleCallbackType<EntityBeanType<T>>> getAllPostConstruct()
   {
      List<LifecycleCallbackType<EntityBeanType<T>>> list = new ArrayList<LifecycleCallbackType<EntityBeanType<T>>>();
      List<Node> nodeList = childNode.get("post-construct");
      for(Node node: nodeList)
      {
         LifecycleCallbackType<EntityBeanType<T>>  type = new LifecycleCallbackTypeImpl<EntityBeanType<T>>(this, "post-construct", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>post-construct</code> elements 
    * @return the current instance of <code>LifecycleCallbackType<EntityBeanType<T>></code> 
    */
   public EntityBeanType<T> removeAllPostConstruct()
   {
      childNode.removeChildren("post-construct");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityBeanType ElementName: javaee:lifecycle-callbackType ElementType : pre-destroy
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>pre-destroy</code> element will be created and returned.
    * Otherwise, the first existing <code>pre-destroy</code> element will be returned.
    * @return the instance defined for the element <code>pre-destroy</code> 
    */
   public LifecycleCallbackType<EntityBeanType<T>> getOrCreatePreDestroy()
   {
      List<Node> nodeList = childNode.get("pre-destroy");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new LifecycleCallbackTypeImpl<EntityBeanType<T>>(this, "pre-destroy", childNode, nodeList.get(0));
      }
      return createPreDestroy();
   }

   /**
    * Creates a new <code>pre-destroy</code> element 
    * @return the new created instance of <code>LifecycleCallbackType<EntityBeanType<T>></code> 
    */
   public LifecycleCallbackType<EntityBeanType<T>> createPreDestroy()
   {
      return new LifecycleCallbackTypeImpl<EntityBeanType<T>>(this, "pre-destroy", childNode);
   }

   /**
    * Returns all <code>pre-destroy</code> elements
    * @return list of <code>pre-destroy</code> 
    */
   public List<LifecycleCallbackType<EntityBeanType<T>>> getAllPreDestroy()
   {
      List<LifecycleCallbackType<EntityBeanType<T>>> list = new ArrayList<LifecycleCallbackType<EntityBeanType<T>>>();
      List<Node> nodeList = childNode.get("pre-destroy");
      for(Node node: nodeList)
      {
         LifecycleCallbackType<EntityBeanType<T>>  type = new LifecycleCallbackTypeImpl<EntityBeanType<T>>(this, "pre-destroy", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>pre-destroy</code> elements 
    * @return the current instance of <code>LifecycleCallbackType<EntityBeanType<T>></code> 
    */
   public EntityBeanType<T> removeAllPreDestroy()
   {
      childNode.removeChildren("pre-destroy");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityBeanType ElementName: javaee:service-refType ElementType : service-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>service-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>service-ref</code> element will be returned.
    * @return the instance defined for the element <code>service-ref</code> 
    */
   public ServiceRefType<EntityBeanType<T>> getOrCreateServiceRef()
   {
      List<Node> nodeList = childNode.get("service-ref");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ServiceRefTypeImpl<EntityBeanType<T>>(this, "service-ref", childNode, nodeList.get(0));
      }
      return createServiceRef();
   }

   /**
    * Creates a new <code>service-ref</code> element 
    * @return the new created instance of <code>ServiceRefType<EntityBeanType<T>></code> 
    */
   public ServiceRefType<EntityBeanType<T>> createServiceRef()
   {
      return new ServiceRefTypeImpl<EntityBeanType<T>>(this, "service-ref", childNode);
   }

   /**
    * Returns all <code>service-ref</code> elements
    * @return list of <code>service-ref</code> 
    */
   public List<ServiceRefType<EntityBeanType<T>>> getAllServiceRef()
   {
      List<ServiceRefType<EntityBeanType<T>>> list = new ArrayList<ServiceRefType<EntityBeanType<T>>>();
      List<Node> nodeList = childNode.get("service-ref");
      for(Node node: nodeList)
      {
         ServiceRefType<EntityBeanType<T>>  type = new ServiceRefTypeImpl<EntityBeanType<T>>(this, "service-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>service-ref</code> elements 
    * @return the current instance of <code>ServiceRefType<EntityBeanType<T>></code> 
    */
   public EntityBeanType<T> removeAllServiceRef()
   {
      childNode.removeChildren("service-ref");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityBeanType ElementName: javaee:xsdNMTOKENType ElementType : ejb-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>ejb-name</code> element
    * @param ejbName the value for the element <code>ejb-name</code> 
    * @return the current instance of <code>EntityBeanType<T></code> 
    */
   public EntityBeanType<T> ejbName(String ejbName)
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
    * @return the current instance of <code>EntityBeanType<T></code> 
    */
   public EntityBeanType<T> removeEjbName()
   {
      childNode.removeChildren("ejb-name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityBeanType ElementName: xsd:string ElementType : mapped-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>mapped-name</code> element
    * @param mappedName the value for the element <code>mapped-name</code> 
    * @return the current instance of <code>EntityBeanType<T></code> 
    */
   public EntityBeanType<T> mappedName(String mappedName)
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
    * @return the current instance of <code>EntityBeanType<T></code> 
    */
   public EntityBeanType<T> removeMappedName()
   {
      childNode.removeChildren("mapped-name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityBeanType ElementName: javaee:fully-qualified-classType ElementType : home
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>home</code> element
    * @param home the value for the element <code>home</code> 
    * @return the current instance of <code>EntityBeanType<T></code> 
    */
   public EntityBeanType<T> home(String home)
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
    * @return the current instance of <code>EntityBeanType<T></code> 
    */
   public EntityBeanType<T> removeHome()
   {
      childNode.removeChildren("home");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityBeanType ElementName: javaee:fully-qualified-classType ElementType : remote
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>remote</code> element
    * @param remote the value for the element <code>remote</code> 
    * @return the current instance of <code>EntityBeanType<T></code> 
    */
   public EntityBeanType<T> remote(String remote)
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
    * @return the current instance of <code>EntityBeanType<T></code> 
    */
   public EntityBeanType<T> removeRemote()
   {
      childNode.removeChildren("remote");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityBeanType ElementName: javaee:fully-qualified-classType ElementType : local-home
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>local-home</code> element
    * @param localHome the value for the element <code>local-home</code> 
    * @return the current instance of <code>EntityBeanType<T></code> 
    */
   public EntityBeanType<T> localHome(String localHome)
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
    * @return the current instance of <code>EntityBeanType<T></code> 
    */
   public EntityBeanType<T> removeLocalHome()
   {
      childNode.removeChildren("local-home");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityBeanType ElementName: javaee:fully-qualified-classType ElementType : local
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>local</code> element
    * @param local the value for the element <code>local</code> 
    * @return the current instance of <code>EntityBeanType<T></code> 
    */
   public EntityBeanType<T> local(String local)
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
    * @return the current instance of <code>EntityBeanType<T></code> 
    */
   public EntityBeanType<T> removeLocal()
   {
      childNode.removeChildren("local");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityBeanType ElementName: javaee:fully-qualified-classType ElementType : ejb-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>ejb-class</code> element
    * @param ejbClass the value for the element <code>ejb-class</code> 
    * @return the current instance of <code>EntityBeanType<T></code> 
    */
   public EntityBeanType<T> ejbClass(String ejbClass)
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
    * @return the current instance of <code>EntityBeanType<T></code> 
    */
   public EntityBeanType<T> removeEjbClass()
   {
      childNode.removeChildren("ejb-class");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityBeanType ElementName: javaee:persistence-typeType ElementType : persistence-type
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>persistence-type</code> element
    * @param persistenceType the value for the element <code>persistence-type</code> 
    * @return the current instance of <code>EntityBeanType<T></code> 
    */
   public EntityBeanType<T> persistenceType(PersistenceTypeType persistenceType)
   {
      childNode.getOrCreate("persistence-type").text(persistenceType);
      return this;
   }
   /**
    * Sets the <code>persistence-type</code> element
    * @param persistenceType the value for the element <code>persistence-type</code> 
    * @return the current instance of <code>EntityBeanType<T></code> 
    */
   public EntityBeanType<T> persistenceType(String persistenceType)
   {
      childNode.getOrCreate("persistence-type").text(persistenceType);
      return this;
   }

   /**
    * Returns the <code>persistence-type</code> element
    * @return the value found for the element <code>persistence-type</code> 
    */
   public PersistenceTypeType getPersistenceType()
   {
      return PersistenceTypeType.getFromStringValue(childNode.getTextValueForPatternName("persistence-type"));
   }

   /**
    * Returns the <code>persistence-type</code> element
    * @return the value found for the element <code>persistence-type</code> 
    */
   public String  getPersistenceTypeAsString()
   {
      return childNode.getTextValueForPatternName("persistence-type");
   }

   /**
    * Removes the <code>persistence-type</code> attribute 
    * @return the current instance of <code>EntityBeanType<T></code> 
    */
   public EntityBeanType<T> removePersistenceType()
   {
      childNode.removeAttribute("persistence-type");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityBeanType ElementName: xsd:token ElementType : prim-key-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>prim-key-class</code> element
    * @param primKeyClass the value for the element <code>prim-key-class</code> 
    * @return the current instance of <code>EntityBeanType<T></code> 
    */
   public EntityBeanType<T> primKeyClass(String primKeyClass)
   {
      childNode.getOrCreate("prim-key-class").text(primKeyClass);
      return this;
   }

   /**
    * Returns the <code>prim-key-class</code> element
    * @return the node defined for the element <code>prim-key-class</code> 
    */
   public String getPrimKeyClass()
   {
      return childNode.getTextValueForPatternName("prim-key-class");
   }

   /**
    * Removes the <code>prim-key-class</code> element 
    * @return the current instance of <code>EntityBeanType<T></code> 
    */
   public EntityBeanType<T> removePrimKeyClass()
   {
      childNode.removeChildren("prim-key-class");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityBeanType ElementName: xsd:boolean ElementType : reentrant
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>reentrant</code> element
    * @param reentrant the value for the element <code>reentrant</code> 
    * @return the current instance of <code>EntityBeanType<T></code> 
    */
   public EntityBeanType<T> reentrant(Boolean reentrant)
   {
      childNode.getOrCreate("reentrant").text(reentrant);
      return this;
   }

   /**
    * Returns the <code>reentrant</code> element
    * @return the node defined for the element <code>reentrant</code> 
    */
   public Boolean isReentrant()
   {
      return Strings.isTrue(childNode.getTextValueForPatternName("reentrant"));
   }

   /**
    * Removes the <code>reentrant</code> element 
    * @return the current instance of <code>EntityBeanType<T></code> 
    */
   public EntityBeanType<T> removeReentrant()
   {
      childNode.removeChildren("reentrant");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityBeanType ElementName: javaee:cmp-versionType ElementType : cmp-version
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>cmp-version</code> element
    * @param cmpVersion the value for the element <code>cmp-version</code> 
    * @return the current instance of <code>EntityBeanType<T></code> 
    */
   public EntityBeanType<T> cmpVersion(CmpVersionType cmpVersion)
   {
      childNode.getOrCreate("cmp-version").text(cmpVersion);
      return this;
   }
   /**
    * Sets the <code>cmp-version</code> element
    * @param cmpVersion the value for the element <code>cmp-version</code> 
    * @return the current instance of <code>EntityBeanType<T></code> 
    */
   public EntityBeanType<T> cmpVersion(String cmpVersion)
   {
      childNode.getOrCreate("cmp-version").text(cmpVersion);
      return this;
   }

   /**
    * Returns the <code>cmp-version</code> element
    * @return the value found for the element <code>cmp-version</code> 
    */
   public CmpVersionType getCmpVersion()
   {
      return CmpVersionType.getFromStringValue(childNode.getTextValueForPatternName("cmp-version"));
   }

   /**
    * Returns the <code>cmp-version</code> element
    * @return the value found for the element <code>cmp-version</code> 
    */
   public String  getCmpVersionAsString()
   {
      return childNode.getTextValueForPatternName("cmp-version");
   }

   /**
    * Removes the <code>cmp-version</code> attribute 
    * @return the current instance of <code>EntityBeanType<T></code> 
    */
   public EntityBeanType<T> removeCmpVersion()
   {
      childNode.removeAttribute("cmp-version");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityBeanType ElementName: xsd:token ElementType : abstract-schema-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>abstract-schema-name</code> element
    * @param abstractSchemaName the value for the element <code>abstract-schema-name</code> 
    * @return the current instance of <code>EntityBeanType<T></code> 
    */
   public EntityBeanType<T> abstractSchemaName(String abstractSchemaName)
   {
      childNode.getOrCreate("abstract-schema-name").text(abstractSchemaName);
      return this;
   }

   /**
    * Returns the <code>abstract-schema-name</code> element
    * @return the node defined for the element <code>abstract-schema-name</code> 
    */
   public String getAbstractSchemaName()
   {
      return childNode.getTextValueForPatternName("abstract-schema-name");
   }

   /**
    * Removes the <code>abstract-schema-name</code> element 
    * @return the current instance of <code>EntityBeanType<T></code> 
    */
   public EntityBeanType<T> removeAbstractSchemaName()
   {
      childNode.removeChildren("abstract-schema-name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityBeanType ElementName: javaee:cmp-fieldType ElementType : cmp-field
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>cmp-field</code> element will be created and returned.
    * Otherwise, the first existing <code>cmp-field</code> element will be returned.
    * @return the instance defined for the element <code>cmp-field</code> 
    */
   public CmpFieldType<EntityBeanType<T>> getOrCreateCmpField()
   {
      List<Node> nodeList = childNode.get("cmp-field");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new CmpFieldTypeImpl<EntityBeanType<T>>(this, "cmp-field", childNode, nodeList.get(0));
      }
      return createCmpField();
   }

   /**
    * Creates a new <code>cmp-field</code> element 
    * @return the new created instance of <code>CmpFieldType<EntityBeanType<T>></code> 
    */
   public CmpFieldType<EntityBeanType<T>> createCmpField()
   {
      return new CmpFieldTypeImpl<EntityBeanType<T>>(this, "cmp-field", childNode);
   }

   /**
    * Returns all <code>cmp-field</code> elements
    * @return list of <code>cmp-field</code> 
    */
   public List<CmpFieldType<EntityBeanType<T>>> getAllCmpField()
   {
      List<CmpFieldType<EntityBeanType<T>>> list = new ArrayList<CmpFieldType<EntityBeanType<T>>>();
      List<Node> nodeList = childNode.get("cmp-field");
      for(Node node: nodeList)
      {
         CmpFieldType<EntityBeanType<T>>  type = new CmpFieldTypeImpl<EntityBeanType<T>>(this, "cmp-field", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>cmp-field</code> elements 
    * @return the current instance of <code>CmpFieldType<EntityBeanType<T>></code> 
    */
   public EntityBeanType<T> removeAllCmpField()
   {
      childNode.removeChildren("cmp-field");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityBeanType ElementName: xsd:token ElementType : primkey-field
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>primkey-field</code> element
    * @param primkeyField the value for the element <code>primkey-field</code> 
    * @return the current instance of <code>EntityBeanType<T></code> 
    */
   public EntityBeanType<T> primkeyField(String primkeyField)
   {
      childNode.getOrCreate("primkey-field").text(primkeyField);
      return this;
   }

   /**
    * Returns the <code>primkey-field</code> element
    * @return the node defined for the element <code>primkey-field</code> 
    */
   public String getPrimkeyField()
   {
      return childNode.getTextValueForPatternName("primkey-field");
   }

   /**
    * Removes the <code>primkey-field</code> element 
    * @return the current instance of <code>EntityBeanType<T></code> 
    */
   public EntityBeanType<T> removePrimkeyField()
   {
      childNode.removeChildren("primkey-field");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityBeanType ElementName: javaee:security-role-refType ElementType : security-role-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>security-role-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>security-role-ref</code> element will be returned.
    * @return the instance defined for the element <code>security-role-ref</code> 
    */
   public SecurityRoleRefType<EntityBeanType<T>> getOrCreateSecurityRoleRef()
   {
      List<Node> nodeList = childNode.get("security-role-ref");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new SecurityRoleRefTypeImpl<EntityBeanType<T>>(this, "security-role-ref", childNode, nodeList.get(0));
      }
      return createSecurityRoleRef();
   }

   /**
    * Creates a new <code>security-role-ref</code> element 
    * @return the new created instance of <code>SecurityRoleRefType<EntityBeanType<T>></code> 
    */
   public SecurityRoleRefType<EntityBeanType<T>> createSecurityRoleRef()
   {
      return new SecurityRoleRefTypeImpl<EntityBeanType<T>>(this, "security-role-ref", childNode);
   }

   /**
    * Returns all <code>security-role-ref</code> elements
    * @return list of <code>security-role-ref</code> 
    */
   public List<SecurityRoleRefType<EntityBeanType<T>>> getAllSecurityRoleRef()
   {
      List<SecurityRoleRefType<EntityBeanType<T>>> list = new ArrayList<SecurityRoleRefType<EntityBeanType<T>>>();
      List<Node> nodeList = childNode.get("security-role-ref");
      for(Node node: nodeList)
      {
         SecurityRoleRefType<EntityBeanType<T>>  type = new SecurityRoleRefTypeImpl<EntityBeanType<T>>(this, "security-role-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>security-role-ref</code> elements 
    * @return the current instance of <code>SecurityRoleRefType<EntityBeanType<T>></code> 
    */
   public EntityBeanType<T> removeAllSecurityRoleRef()
   {
      childNode.removeChildren("security-role-ref");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityBeanType ElementName: javaee:security-identityType ElementType : security-identity
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>security-identity</code> element with the given value will be created.
    * Otherwise, the existing <code>security-identity</code> element will be returned.
    * @return  a new or existing instance of <code>SecurityIdentityType<EntityBeanType<T>></code> 
    */
   public SecurityIdentityType<EntityBeanType<T>> getOrCreateSecurityIdentity()
   {
      Node node = childNode.getOrCreate("security-identity");
      SecurityIdentityType<EntityBeanType<T>> securityIdentity = new SecurityIdentityTypeImpl<EntityBeanType<T>>(this, "security-identity", childNode, node);
      return securityIdentity;
   }

   /**
    * Removes the <code>security-identity</code> element 
    * @return the current instance of <code>EntityBeanType<T></code> 
    */
   public EntityBeanType<T> removeSecurityIdentity()
   {
      childNode.removeChildren("security-identity");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityBeanType ElementName: javaee:queryType ElementType : query
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>query</code> element will be created and returned.
    * Otherwise, the first existing <code>query</code> element will be returned.
    * @return the instance defined for the element <code>query</code> 
    */
   public QueryType<EntityBeanType<T>> getOrCreateQuery()
   {
      List<Node> nodeList = childNode.get("query");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new QueryTypeImpl<EntityBeanType<T>>(this, "query", childNode, nodeList.get(0));
      }
      return createQuery();
   }

   /**
    * Creates a new <code>query</code> element 
    * @return the new created instance of <code>QueryType<EntityBeanType<T>></code> 
    */
   public QueryType<EntityBeanType<T>> createQuery()
   {
      return new QueryTypeImpl<EntityBeanType<T>>(this, "query", childNode);
   }

   /**
    * Returns all <code>query</code> elements
    * @return list of <code>query</code> 
    */
   public List<QueryType<EntityBeanType<T>>> getAllQuery()
   {
      List<QueryType<EntityBeanType<T>>> list = new ArrayList<QueryType<EntityBeanType<T>>>();
      List<Node> nodeList = childNode.get("query");
      for(Node node: nodeList)
      {
         QueryType<EntityBeanType<T>>  type = new QueryTypeImpl<EntityBeanType<T>>(this, "query", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>query</code> elements 
    * @return the current instance of <code>QueryType<EntityBeanType<T>></code> 
    */
   public EntityBeanType<T> removeAllQuery()
   {
      childNode.removeChildren("query");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityBeanType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>EntityBeanType<T></code> 
    */
   public EntityBeanType<T> id(String id)
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
    * @return the current instance of <code>EntityBeanType<T></code> 
    */
   public EntityBeanType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
