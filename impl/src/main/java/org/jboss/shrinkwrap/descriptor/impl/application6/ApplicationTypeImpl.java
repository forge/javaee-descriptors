package org.jboss.shrinkwrap.descriptor.impl.application6; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.application6.ApplicationType;
import org.jboss.shrinkwrap.descriptor.api.application6.ModuleType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.DataSourceType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EjbLocalRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EjbRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EnvEntryType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.GenericBooleanType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.MessageDestinationRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.MessageDestinationType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.PersistenceContextRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.PersistenceUnitRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ResourceEnvRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ResourceRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.SecurityRoleType;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient13.ServiceRefType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.DataSourceTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.EjbLocalRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.EjbRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.EnvEntryTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.IconTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.MessageDestinationRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.MessageDestinationTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.PersistenceContextRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.PersistenceUnitRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.ResourceEnvRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.ResourceRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.SecurityRoleTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaeewebservicesclient13.ServiceRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> applicationType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class ApplicationTypeImpl<T> implements Child<T>, ApplicationType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public ApplicationTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public ApplicationTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
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
   public ApplicationType<T> description(String ... values)
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
    * @return the current instance of <code>ApplicationType<T></code> 
    */
   public ApplicationType<T> removeAllDescription()
   {
      childNode.removeChildren("description");
      return this;
   }
 
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
   public ApplicationType<T> displayName(String ... values)
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
    * @return the current instance of <code>ApplicationType<T></code> 
    */
   public ApplicationType<T> removeAllDisplayName()
   {
      childNode.removeChildren("display-name");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationType ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<ApplicationType<T>> getOrCreateIcon()
   {
      List<Node> nodeList = childNode.get("icon");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new IconTypeImpl<ApplicationType<T>>(this, "icon", childNode, nodeList.get(0));
      }
      return createIcon();
   }

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<ApplicationType<T>></code> 
    */
   public IconType<ApplicationType<T>> createIcon()
   {
      return new IconTypeImpl<ApplicationType<T>>(this, "icon", childNode);
   }

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<ApplicationType<T>>> getAllIcon()
   {
      List<IconType<ApplicationType<T>>> list = new ArrayList<IconType<ApplicationType<T>>>();
      List<Node> nodeList = childNode.get("icon");
      for(Node node: nodeList)
      {
         IconType<ApplicationType<T>>  type = new IconTypeImpl<ApplicationType<T>>(this, "icon", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<ApplicationType<T>></code> 
    */
   public ApplicationType<T> removeAllIcon()
   {
      childNode.removeChildren("icon");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationType ElementName: javaee:service-refType ElementType : service-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>service-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>service-ref</code> element will be returned.
    * @return the instance defined for the element <code>service-ref</code> 
    */
   public ServiceRefType<ApplicationType<T>> getOrCreateServiceRef()
   {
      List<Node> nodeList = childNode.get("service-ref");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ServiceRefTypeImpl<ApplicationType<T>>(this, "service-ref", childNode, nodeList.get(0));
      }
      return createServiceRef();
   }

   /**
    * Creates a new <code>service-ref</code> element 
    * @return the new created instance of <code>ServiceRefType<ApplicationType<T>></code> 
    */
   public ServiceRefType<ApplicationType<T>> createServiceRef()
   {
      return new ServiceRefTypeImpl<ApplicationType<T>>(this, "service-ref", childNode);
   }

   /**
    * Returns all <code>service-ref</code> elements
    * @return list of <code>service-ref</code> 
    */
   public List<ServiceRefType<ApplicationType<T>>> getAllServiceRef()
   {
      List<ServiceRefType<ApplicationType<T>>> list = new ArrayList<ServiceRefType<ApplicationType<T>>>();
      List<Node> nodeList = childNode.get("service-ref");
      for(Node node: nodeList)
      {
         ServiceRefType<ApplicationType<T>>  type = new ServiceRefTypeImpl<ApplicationType<T>>(this, "service-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>service-ref</code> elements 
    * @return the current instance of <code>ServiceRefType<ApplicationType<T>></code> 
    */
   public ApplicationType<T> removeAllServiceRef()
   {
      childNode.removeChildren("service-ref");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationType ElementName: xsd:token ElementType : application-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>application-name</code> element
    * @param applicationName the value for the element <code>application-name</code> 
    * @return the current instance of <code>ApplicationType<T></code> 
    */
   public ApplicationType<T> applicationName(String applicationName)
   {
      childNode.getOrCreate("application-name").text(applicationName);
      return this;
   }

   /**
    * Returns the <code>application-name</code> element
    * @return the node defined for the element <code>application-name</code> 
    */
   public String getApplicationName()
   {
      return childNode.getTextValueForPatternName("application-name");
   }

   /**
    * Removes the <code>application-name</code> element 
    * @return the current instance of <code>ApplicationType<T></code> 
    */
   public ApplicationType<T> removeApplicationName()
   {
      childNode.removeChildren("application-name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationType ElementName: javaee:generic-booleanType ElementType : initialize-in-order
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>initialize-in-order</code> element
    * @param initializeInOrder the value for the element <code>initialize-in-order</code> 
    * @return the current instance of <code>ApplicationType<T></code> 
    */
   public ApplicationType<T> initializeInOrder(GenericBooleanType initializeInOrder)
   {
      childNode.getOrCreate("initialize-in-order").text(initializeInOrder);
      return this;
   }
   /**
    * Sets the <code>initialize-in-order</code> element
    * @param initializeInOrder the value for the element <code>initialize-in-order</code> 
    * @return the current instance of <code>ApplicationType<T></code> 
    */
   public ApplicationType<T> initializeInOrder(String initializeInOrder)
   {
      childNode.getOrCreate("initialize-in-order").text(initializeInOrder);
      return this;
   }

   /**
    * Returns the <code>initialize-in-order</code> element
    * @return the value found for the element <code>initialize-in-order</code> 
    */
   public GenericBooleanType getInitializeInOrder()
   {
      return GenericBooleanType.getFromStringValue(childNode.getTextValueForPatternName("initialize-in-order"));
   }

   /**
    * Returns the <code>initialize-in-order</code> element
    * @return the value found for the element <code>initialize-in-order</code> 
    */
   public String  getInitializeInOrderAsString()
   {
      return childNode.getTextValueForPatternName("initialize-in-order");
   }

   /**
    * Removes the <code>initialize-in-order</code> attribute 
    * @return the current instance of <code>ApplicationType<T></code> 
    */
   public ApplicationType<T> removeInitializeInOrder()
   {
      childNode.removeAttribute("initialize-in-order");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationType ElementName: javaee:moduleType ElementType : module
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>module</code> element will be created and returned.
    * Otherwise, the first existing <code>module</code> element will be returned.
    * @return the instance defined for the element <code>module</code> 
    */
   public ModuleType<ApplicationType<T>> getOrCreateModule()
   {
      List<Node> nodeList = childNode.get("module");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ModuleTypeImpl<ApplicationType<T>>(this, "module", childNode, nodeList.get(0));
      }
      return createModule();
   }

   /**
    * Creates a new <code>module</code> element 
    * @return the new created instance of <code>ModuleType<ApplicationType<T>></code> 
    */
   public ModuleType<ApplicationType<T>> createModule()
   {
      return new ModuleTypeImpl<ApplicationType<T>>(this, "module", childNode);
   }

   /**
    * Returns all <code>module</code> elements
    * @return list of <code>module</code> 
    */
   public List<ModuleType<ApplicationType<T>>> getAllModule()
   {
      List<ModuleType<ApplicationType<T>>> list = new ArrayList<ModuleType<ApplicationType<T>>>();
      List<Node> nodeList = childNode.get("module");
      for(Node node: nodeList)
      {
         ModuleType<ApplicationType<T>>  type = new ModuleTypeImpl<ApplicationType<T>>(this, "module", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>module</code> elements 
    * @return the current instance of <code>ModuleType<ApplicationType<T>></code> 
    */
   public ApplicationType<T> removeAllModule()
   {
      childNode.removeChildren("module");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationType ElementName: javaee:security-roleType ElementType : security-role
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>security-role</code> element will be created and returned.
    * Otherwise, the first existing <code>security-role</code> element will be returned.
    * @return the instance defined for the element <code>security-role</code> 
    */
   public SecurityRoleType<ApplicationType<T>> getOrCreateSecurityRole()
   {
      List<Node> nodeList = childNode.get("security-role");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new SecurityRoleTypeImpl<ApplicationType<T>>(this, "security-role", childNode, nodeList.get(0));
      }
      return createSecurityRole();
   }

   /**
    * Creates a new <code>security-role</code> element 
    * @return the new created instance of <code>SecurityRoleType<ApplicationType<T>></code> 
    */
   public SecurityRoleType<ApplicationType<T>> createSecurityRole()
   {
      return new SecurityRoleTypeImpl<ApplicationType<T>>(this, "security-role", childNode);
   }

   /**
    * Returns all <code>security-role</code> elements
    * @return list of <code>security-role</code> 
    */
   public List<SecurityRoleType<ApplicationType<T>>> getAllSecurityRole()
   {
      List<SecurityRoleType<ApplicationType<T>>> list = new ArrayList<SecurityRoleType<ApplicationType<T>>>();
      List<Node> nodeList = childNode.get("security-role");
      for(Node node: nodeList)
      {
         SecurityRoleType<ApplicationType<T>>  type = new SecurityRoleTypeImpl<ApplicationType<T>>(this, "security-role", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>security-role</code> elements 
    * @return the current instance of <code>SecurityRoleType<ApplicationType<T>></code> 
    */
   public ApplicationType<T> removeAllSecurityRole()
   {
      childNode.removeChildren("security-role");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationType ElementName: xsd:token ElementType : library-directory
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>library-directory</code> element
    * @param libraryDirectory the value for the element <code>library-directory</code> 
    * @return the current instance of <code>ApplicationType<T></code> 
    */
   public ApplicationType<T> libraryDirectory(String libraryDirectory)
   {
      childNode.getOrCreate("library-directory").text(libraryDirectory);
      return this;
   }

   /**
    * Returns the <code>library-directory</code> element
    * @return the node defined for the element <code>library-directory</code> 
    */
   public String getLibraryDirectory()
   {
      return childNode.getTextValueForPatternName("library-directory");
   }

   /**
    * Removes the <code>library-directory</code> element 
    * @return the current instance of <code>ApplicationType<T></code> 
    */
   public ApplicationType<T> removeLibraryDirectory()
   {
      childNode.removeChildren("library-directory");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationType ElementName: javaee:env-entryType ElementType : env-entry
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>env-entry</code> element will be created and returned.
    * Otherwise, the first existing <code>env-entry</code> element will be returned.
    * @return the instance defined for the element <code>env-entry</code> 
    */
   public EnvEntryType<ApplicationType<T>> getOrCreateEnvEntry()
   {
      List<Node> nodeList = childNode.get("env-entry");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new EnvEntryTypeImpl<ApplicationType<T>>(this, "env-entry", childNode, nodeList.get(0));
      }
      return createEnvEntry();
   }

   /**
    * Creates a new <code>env-entry</code> element 
    * @return the new created instance of <code>EnvEntryType<ApplicationType<T>></code> 
    */
   public EnvEntryType<ApplicationType<T>> createEnvEntry()
   {
      return new EnvEntryTypeImpl<ApplicationType<T>>(this, "env-entry", childNode);
   }

   /**
    * Returns all <code>env-entry</code> elements
    * @return list of <code>env-entry</code> 
    */
   public List<EnvEntryType<ApplicationType<T>>> getAllEnvEntry()
   {
      List<EnvEntryType<ApplicationType<T>>> list = new ArrayList<EnvEntryType<ApplicationType<T>>>();
      List<Node> nodeList = childNode.get("env-entry");
      for(Node node: nodeList)
      {
         EnvEntryType<ApplicationType<T>>  type = new EnvEntryTypeImpl<ApplicationType<T>>(this, "env-entry", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>env-entry</code> elements 
    * @return the current instance of <code>EnvEntryType<ApplicationType<T>></code> 
    */
   public ApplicationType<T> removeAllEnvEntry()
   {
      childNode.removeChildren("env-entry");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationType ElementName: javaee:ejb-refType ElementType : ejb-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>ejb-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>ejb-ref</code> element will be returned.
    * @return the instance defined for the element <code>ejb-ref</code> 
    */
   public EjbRefType<ApplicationType<T>> getOrCreateEjbRef()
   {
      List<Node> nodeList = childNode.get("ejb-ref");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new EjbRefTypeImpl<ApplicationType<T>>(this, "ejb-ref", childNode, nodeList.get(0));
      }
      return createEjbRef();
   }

   /**
    * Creates a new <code>ejb-ref</code> element 
    * @return the new created instance of <code>EjbRefType<ApplicationType<T>></code> 
    */
   public EjbRefType<ApplicationType<T>> createEjbRef()
   {
      return new EjbRefTypeImpl<ApplicationType<T>>(this, "ejb-ref", childNode);
   }

   /**
    * Returns all <code>ejb-ref</code> elements
    * @return list of <code>ejb-ref</code> 
    */
   public List<EjbRefType<ApplicationType<T>>> getAllEjbRef()
   {
      List<EjbRefType<ApplicationType<T>>> list = new ArrayList<EjbRefType<ApplicationType<T>>>();
      List<Node> nodeList = childNode.get("ejb-ref");
      for(Node node: nodeList)
      {
         EjbRefType<ApplicationType<T>>  type = new EjbRefTypeImpl<ApplicationType<T>>(this, "ejb-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>ejb-ref</code> elements 
    * @return the current instance of <code>EjbRefType<ApplicationType<T>></code> 
    */
   public ApplicationType<T> removeAllEjbRef()
   {
      childNode.removeChildren("ejb-ref");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationType ElementName: javaee:ejb-local-refType ElementType : ejb-local-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>ejb-local-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>ejb-local-ref</code> element will be returned.
    * @return the instance defined for the element <code>ejb-local-ref</code> 
    */
   public EjbLocalRefType<ApplicationType<T>> getOrCreateEjbLocalRef()
   {
      List<Node> nodeList = childNode.get("ejb-local-ref");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new EjbLocalRefTypeImpl<ApplicationType<T>>(this, "ejb-local-ref", childNode, nodeList.get(0));
      }
      return createEjbLocalRef();
   }

   /**
    * Creates a new <code>ejb-local-ref</code> element 
    * @return the new created instance of <code>EjbLocalRefType<ApplicationType<T>></code> 
    */
   public EjbLocalRefType<ApplicationType<T>> createEjbLocalRef()
   {
      return new EjbLocalRefTypeImpl<ApplicationType<T>>(this, "ejb-local-ref", childNode);
   }

   /**
    * Returns all <code>ejb-local-ref</code> elements
    * @return list of <code>ejb-local-ref</code> 
    */
   public List<EjbLocalRefType<ApplicationType<T>>> getAllEjbLocalRef()
   {
      List<EjbLocalRefType<ApplicationType<T>>> list = new ArrayList<EjbLocalRefType<ApplicationType<T>>>();
      List<Node> nodeList = childNode.get("ejb-local-ref");
      for(Node node: nodeList)
      {
         EjbLocalRefType<ApplicationType<T>>  type = new EjbLocalRefTypeImpl<ApplicationType<T>>(this, "ejb-local-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>ejb-local-ref</code> elements 
    * @return the current instance of <code>EjbLocalRefType<ApplicationType<T>></code> 
    */
   public ApplicationType<T> removeAllEjbLocalRef()
   {
      childNode.removeChildren("ejb-local-ref");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationType ElementName: javaee:resource-refType ElementType : resource-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>resource-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>resource-ref</code> element will be returned.
    * @return the instance defined for the element <code>resource-ref</code> 
    */
   public ResourceRefType<ApplicationType<T>> getOrCreateResourceRef()
   {
      List<Node> nodeList = childNode.get("resource-ref");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ResourceRefTypeImpl<ApplicationType<T>>(this, "resource-ref", childNode, nodeList.get(0));
      }
      return createResourceRef();
   }

   /**
    * Creates a new <code>resource-ref</code> element 
    * @return the new created instance of <code>ResourceRefType<ApplicationType<T>></code> 
    */
   public ResourceRefType<ApplicationType<T>> createResourceRef()
   {
      return new ResourceRefTypeImpl<ApplicationType<T>>(this, "resource-ref", childNode);
   }

   /**
    * Returns all <code>resource-ref</code> elements
    * @return list of <code>resource-ref</code> 
    */
   public List<ResourceRefType<ApplicationType<T>>> getAllResourceRef()
   {
      List<ResourceRefType<ApplicationType<T>>> list = new ArrayList<ResourceRefType<ApplicationType<T>>>();
      List<Node> nodeList = childNode.get("resource-ref");
      for(Node node: nodeList)
      {
         ResourceRefType<ApplicationType<T>>  type = new ResourceRefTypeImpl<ApplicationType<T>>(this, "resource-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>resource-ref</code> elements 
    * @return the current instance of <code>ResourceRefType<ApplicationType<T>></code> 
    */
   public ApplicationType<T> removeAllResourceRef()
   {
      childNode.removeChildren("resource-ref");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationType ElementName: javaee:resource-env-refType ElementType : resource-env-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>resource-env-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>resource-env-ref</code> element will be returned.
    * @return the instance defined for the element <code>resource-env-ref</code> 
    */
   public ResourceEnvRefType<ApplicationType<T>> getOrCreateResourceEnvRef()
   {
      List<Node> nodeList = childNode.get("resource-env-ref");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ResourceEnvRefTypeImpl<ApplicationType<T>>(this, "resource-env-ref", childNode, nodeList.get(0));
      }
      return createResourceEnvRef();
   }

   /**
    * Creates a new <code>resource-env-ref</code> element 
    * @return the new created instance of <code>ResourceEnvRefType<ApplicationType<T>></code> 
    */
   public ResourceEnvRefType<ApplicationType<T>> createResourceEnvRef()
   {
      return new ResourceEnvRefTypeImpl<ApplicationType<T>>(this, "resource-env-ref", childNode);
   }

   /**
    * Returns all <code>resource-env-ref</code> elements
    * @return list of <code>resource-env-ref</code> 
    */
   public List<ResourceEnvRefType<ApplicationType<T>>> getAllResourceEnvRef()
   {
      List<ResourceEnvRefType<ApplicationType<T>>> list = new ArrayList<ResourceEnvRefType<ApplicationType<T>>>();
      List<Node> nodeList = childNode.get("resource-env-ref");
      for(Node node: nodeList)
      {
         ResourceEnvRefType<ApplicationType<T>>  type = new ResourceEnvRefTypeImpl<ApplicationType<T>>(this, "resource-env-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>resource-env-ref</code> elements 
    * @return the current instance of <code>ResourceEnvRefType<ApplicationType<T>></code> 
    */
   public ApplicationType<T> removeAllResourceEnvRef()
   {
      childNode.removeChildren("resource-env-ref");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationType ElementName: javaee:message-destination-refType ElementType : message-destination-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>message-destination-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>message-destination-ref</code> element will be returned.
    * @return the instance defined for the element <code>message-destination-ref</code> 
    */
   public MessageDestinationRefType<ApplicationType<T>> getOrCreateMessageDestinationRef()
   {
      List<Node> nodeList = childNode.get("message-destination-ref");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new MessageDestinationRefTypeImpl<ApplicationType<T>>(this, "message-destination-ref", childNode, nodeList.get(0));
      }
      return createMessageDestinationRef();
   }

   /**
    * Creates a new <code>message-destination-ref</code> element 
    * @return the new created instance of <code>MessageDestinationRefType<ApplicationType<T>></code> 
    */
   public MessageDestinationRefType<ApplicationType<T>> createMessageDestinationRef()
   {
      return new MessageDestinationRefTypeImpl<ApplicationType<T>>(this, "message-destination-ref", childNode);
   }

   /**
    * Returns all <code>message-destination-ref</code> elements
    * @return list of <code>message-destination-ref</code> 
    */
   public List<MessageDestinationRefType<ApplicationType<T>>> getAllMessageDestinationRef()
   {
      List<MessageDestinationRefType<ApplicationType<T>>> list = new ArrayList<MessageDestinationRefType<ApplicationType<T>>>();
      List<Node> nodeList = childNode.get("message-destination-ref");
      for(Node node: nodeList)
      {
         MessageDestinationRefType<ApplicationType<T>>  type = new MessageDestinationRefTypeImpl<ApplicationType<T>>(this, "message-destination-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>message-destination-ref</code> elements 
    * @return the current instance of <code>MessageDestinationRefType<ApplicationType<T>></code> 
    */
   public ApplicationType<T> removeAllMessageDestinationRef()
   {
      childNode.removeChildren("message-destination-ref");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationType ElementName: javaee:persistence-context-refType ElementType : persistence-context-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>persistence-context-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>persistence-context-ref</code> element will be returned.
    * @return the instance defined for the element <code>persistence-context-ref</code> 
    */
   public PersistenceContextRefType<ApplicationType<T>> getOrCreatePersistenceContextRef()
   {
      List<Node> nodeList = childNode.get("persistence-context-ref");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new PersistenceContextRefTypeImpl<ApplicationType<T>>(this, "persistence-context-ref", childNode, nodeList.get(0));
      }
      return createPersistenceContextRef();
   }

   /**
    * Creates a new <code>persistence-context-ref</code> element 
    * @return the new created instance of <code>PersistenceContextRefType<ApplicationType<T>></code> 
    */
   public PersistenceContextRefType<ApplicationType<T>> createPersistenceContextRef()
   {
      return new PersistenceContextRefTypeImpl<ApplicationType<T>>(this, "persistence-context-ref", childNode);
   }

   /**
    * Returns all <code>persistence-context-ref</code> elements
    * @return list of <code>persistence-context-ref</code> 
    */
   public List<PersistenceContextRefType<ApplicationType<T>>> getAllPersistenceContextRef()
   {
      List<PersistenceContextRefType<ApplicationType<T>>> list = new ArrayList<PersistenceContextRefType<ApplicationType<T>>>();
      List<Node> nodeList = childNode.get("persistence-context-ref");
      for(Node node: nodeList)
      {
         PersistenceContextRefType<ApplicationType<T>>  type = new PersistenceContextRefTypeImpl<ApplicationType<T>>(this, "persistence-context-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>persistence-context-ref</code> elements 
    * @return the current instance of <code>PersistenceContextRefType<ApplicationType<T>></code> 
    */
   public ApplicationType<T> removeAllPersistenceContextRef()
   {
      childNode.removeChildren("persistence-context-ref");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationType ElementName: javaee:persistence-unit-refType ElementType : persistence-unit-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>persistence-unit-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>persistence-unit-ref</code> element will be returned.
    * @return the instance defined for the element <code>persistence-unit-ref</code> 
    */
   public PersistenceUnitRefType<ApplicationType<T>> getOrCreatePersistenceUnitRef()
   {
      List<Node> nodeList = childNode.get("persistence-unit-ref");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new PersistenceUnitRefTypeImpl<ApplicationType<T>>(this, "persistence-unit-ref", childNode, nodeList.get(0));
      }
      return createPersistenceUnitRef();
   }

   /**
    * Creates a new <code>persistence-unit-ref</code> element 
    * @return the new created instance of <code>PersistenceUnitRefType<ApplicationType<T>></code> 
    */
   public PersistenceUnitRefType<ApplicationType<T>> createPersistenceUnitRef()
   {
      return new PersistenceUnitRefTypeImpl<ApplicationType<T>>(this, "persistence-unit-ref", childNode);
   }

   /**
    * Returns all <code>persistence-unit-ref</code> elements
    * @return list of <code>persistence-unit-ref</code> 
    */
   public List<PersistenceUnitRefType<ApplicationType<T>>> getAllPersistenceUnitRef()
   {
      List<PersistenceUnitRefType<ApplicationType<T>>> list = new ArrayList<PersistenceUnitRefType<ApplicationType<T>>>();
      List<Node> nodeList = childNode.get("persistence-unit-ref");
      for(Node node: nodeList)
      {
         PersistenceUnitRefType<ApplicationType<T>>  type = new PersistenceUnitRefTypeImpl<ApplicationType<T>>(this, "persistence-unit-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>persistence-unit-ref</code> elements 
    * @return the current instance of <code>PersistenceUnitRefType<ApplicationType<T>></code> 
    */
   public ApplicationType<T> removeAllPersistenceUnitRef()
   {
      childNode.removeChildren("persistence-unit-ref");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationType ElementName: javaee:message-destinationType ElementType : message-destination
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>message-destination</code> element will be created and returned.
    * Otherwise, the first existing <code>message-destination</code> element will be returned.
    * @return the instance defined for the element <code>message-destination</code> 
    */
   public MessageDestinationType<ApplicationType<T>> getOrCreateMessageDestination()
   {
      List<Node> nodeList = childNode.get("message-destination");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new MessageDestinationTypeImpl<ApplicationType<T>>(this, "message-destination", childNode, nodeList.get(0));
      }
      return createMessageDestination();
   }

   /**
    * Creates a new <code>message-destination</code> element 
    * @return the new created instance of <code>MessageDestinationType<ApplicationType<T>></code> 
    */
   public MessageDestinationType<ApplicationType<T>> createMessageDestination()
   {
      return new MessageDestinationTypeImpl<ApplicationType<T>>(this, "message-destination", childNode);
   }

   /**
    * Returns all <code>message-destination</code> elements
    * @return list of <code>message-destination</code> 
    */
   public List<MessageDestinationType<ApplicationType<T>>> getAllMessageDestination()
   {
      List<MessageDestinationType<ApplicationType<T>>> list = new ArrayList<MessageDestinationType<ApplicationType<T>>>();
      List<Node> nodeList = childNode.get("message-destination");
      for(Node node: nodeList)
      {
         MessageDestinationType<ApplicationType<T>>  type = new MessageDestinationTypeImpl<ApplicationType<T>>(this, "message-destination", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>message-destination</code> elements 
    * @return the current instance of <code>MessageDestinationType<ApplicationType<T>></code> 
    */
   public ApplicationType<T> removeAllMessageDestination()
   {
      childNode.removeChildren("message-destination");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationType ElementName: javaee:data-sourceType ElementType : data-source
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>data-source</code> element will be created and returned.
    * Otherwise, the first existing <code>data-source</code> element will be returned.
    * @return the instance defined for the element <code>data-source</code> 
    */
   public DataSourceType<ApplicationType<T>> getOrCreateDataSource()
   {
      List<Node> nodeList = childNode.get("data-source");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new DataSourceTypeImpl<ApplicationType<T>>(this, "data-source", childNode, nodeList.get(0));
      }
      return createDataSource();
   }

   /**
    * Creates a new <code>data-source</code> element 
    * @return the new created instance of <code>DataSourceType<ApplicationType<T>></code> 
    */
   public DataSourceType<ApplicationType<T>> createDataSource()
   {
      return new DataSourceTypeImpl<ApplicationType<T>>(this, "data-source", childNode);
   }

   /**
    * Returns all <code>data-source</code> elements
    * @return list of <code>data-source</code> 
    */
   public List<DataSourceType<ApplicationType<T>>> getAllDataSource()
   {
      List<DataSourceType<ApplicationType<T>>> list = new ArrayList<DataSourceType<ApplicationType<T>>>();
      List<Node> nodeList = childNode.get("data-source");
      for(Node node: nodeList)
      {
         DataSourceType<ApplicationType<T>>  type = new DataSourceTypeImpl<ApplicationType<T>>(this, "data-source", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>data-source</code> elements 
    * @return the current instance of <code>DataSourceType<ApplicationType<T>></code> 
    */
   public ApplicationType<T> removeAllDataSource()
   {
      childNode.removeChildren("data-source");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationType ElementName: xsd:token ElementType : version
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of <code>ApplicationType<T></code> 
    */
   public ApplicationType<T> version(String version)
   {
      childNode.attribute("version", version);
      return this;
   }

   /**
    * Returns the <code>version</code> attribute
    * @return the value defined for the attribute <code>version</code> 
    */
      public String getVersion()
   {
      return childNode.getAttribute("version");
   }

   /**
    * Removes the <code>version</code> attribute 
    * @return the current instance of <code>ApplicationType<T></code> 
    */
   public ApplicationType<T> removeVersion()
   {
      childNode.removeAttribute("version");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>ApplicationType<T></code> 
    */
   public ApplicationType<T> id(String id)
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
    * @return the current instance of <code>ApplicationType<T></code> 
    */
   public ApplicationType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
