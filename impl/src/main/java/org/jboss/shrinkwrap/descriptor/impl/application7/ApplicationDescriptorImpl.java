package org.jboss.shrinkwrap.descriptor.impl.application7; 

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

import org.jboss.shrinkwrap.descriptor.api.DescriptorNamespace;
import org.jboss.shrinkwrap.descriptor.api.application7.ApplicationDescriptor;
import org.jboss.shrinkwrap.descriptor.api.application7.ModuleType;
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
import org.jboss.shrinkwrap.descriptor.impl.javaee7.AdministeredObjectTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee7.ConnectionFactoryResourceTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee7.DataSourceTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee7.EjbLocalRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee7.EjbRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee7.EnvEntryTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee7.IconTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee7.JmsConnectionFactoryTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee7.JmsDestinationTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee7.MailSessionTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee7.MessageDestinationRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee7.MessageDestinationTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee7.PersistenceContextRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee7.PersistenceUnitRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee7.ResourceEnvRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee7.ResourceRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee7.SecurityRoleTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaeewebservicesclient14.ServiceRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.spi.node.NodeDescriptorImplBase;

/** 
 * <p> 
 * This deployment descriptor provides the functionalities as described in the  specification
 * <p> 
 * Example:
 * <p> 
 * <code> 
 *     ApplicationDescriptor descriptor = Descriptors.create(ApplicationDescriptor.class);
 * </code> 
 *
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class ApplicationDescriptorImpl extends NodeDescriptorImplBase implements DescriptorNamespace<ApplicationDescriptor>, ApplicationDescriptor
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private Node model;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public ApplicationDescriptorImpl(String descriptorName)
   {
       this(descriptorName, new Node("application"));
   }

   public ApplicationDescriptorImpl(String descriptorName, Node node)
   {
      super(descriptorName);
      this.model = node;
      addDefaultNamespaces();
   }

   // -------------------------------------------------------------------------------------||
   // Methods 
   // -------------------------------------------------------------------------------------||

   public Node getRootNode()
   {
      return model;
   }



   // -------------------------------------------------------------------------------------||
   // Namespace 
   // -------------------------------------------------------------------------------------||


   /**
    * Adds the default namespaces as defined in the specification 
    * @return the current instance of <code>ApplicationDescriptor</code> 
    */
   public ApplicationDescriptor addDefaultNamespaces()
   {
      addNamespace("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
      addNamespace("xsi:schemaLocation", "http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/application_7.xsd");
      addNamespace("xmlns", "http://xmlns.jcp.org/xml/ns/javaee");
     return this;
   }

   /**
    * Adds a new namespace 
    * @return the current instance of <code>ApplicationDescriptor</code> 
    */
   public ApplicationDescriptor addNamespace(String name, String value)
   {
      model.attribute(name, value);
      return this;
   }

   /**
    * Returns all defined namespaces. 
    * @return all defined namespaces 
    */
   public List<String> getNamespaces()
   {
      List<String> namespaceList = new ArrayList<String>();
      java.util.Map<String, String> attributes = model.getAttributes();
      for (Entry<String, String> e : attributes.entrySet())
      {
         final String name = e.getKey();
         final String value = e.getValue();
         if (value != null && value.startsWith("http://")) 
         {
            namespaceList.add(name + "=" + value);
         }
      }
      return namespaceList;
   }

   /**
    * Removes all existing namespaces. 
    * @return the current instance of <code>ApplicationDescriptor</code> 
    */
   public ApplicationDescriptor removeAllNamespaces()
   {
      List<String> nameSpaceKeys = new ArrayList<String>();
      java.util.Map<String, String> attributes = model.getAttributes();
      for (Entry<String, String> e : attributes.entrySet())
      {
         final String name = e.getKey();
         final String value = e.getValue();
         if (value != null && value.startsWith("http://")) 
         {
            nameSpaceKeys.add(name);
         }
      }
      for (String name: nameSpaceKeys)
      {
         model.removeAttribute(name);
      }
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationDescriptor ElementName: xsd:token ElementType : application-name
   // MaxOccurs: -  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>application-name</code> element
    * @param applicationName the value for the element <code>application-name</code> 
    * @return the current instance of <code>ApplicationDescriptor</code> 
    */
   public ApplicationDescriptor applicationName(String applicationName)
   {
      model.getOrCreate("application-name").text(applicationName);
      return this;
   }

   /**
    * Returns the <code>application-name</code> element
    * @return the node defined for the element <code>application-name</code> 
    */
   public String getApplicationName()
   {
      return model.getTextValueForPatternName("application-name");
   }

   /**
    * Removes the <code>application-name</code> element 
    * @return the current instance of <code>ApplicationDescriptor</code> 
    */
   public ApplicationDescriptor removeApplicationName()
   {
      model.removeChildren("application-name");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationDescriptor ElementName: javaee:generic-booleanType ElementType : initialize-in-order
   // MaxOccurs: -1  isGeneric: false   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>initialize-in-order</code> element
    * @param initializeInOrder the value for the element <code>initialize-in-order</code> 
    * @return the current instance of <code>ApplicationDescriptor</code> 
    */
   public ApplicationDescriptor initializeInOrder(GenericBooleanType initializeInOrder)
   {
      model.getOrCreate("initialize-in-order").text(initializeInOrder);
      return this;
   }
   /**
    * Sets the <code>initialize-in-order</code> element
    * @param initializeInOrder the value for the element <code>initialize-in-order</code> 
    * @return the current instance of <code>ApplicationDescriptor</code> 
    */
   public ApplicationDescriptor initializeInOrder(String initializeInOrder)
   {
      model.getOrCreate("initialize-in-order").text(initializeInOrder);
      return this;
   }

   /**
    * Returns the <code>initialize-in-order</code> element
    * @return the value found for the element <code>initialize-in-order</code> 
    */
   public GenericBooleanType getInitializeInOrder()
   {
      return GenericBooleanType.getFromStringValue(model.getTextValueForPatternName("initialize-in-order"));
   }

   /**
    * Returns the <code>initialize-in-order</code> element
    * @return the value found for the element <code>initialize-in-order</code> 
    */
   public String  getInitializeInOrderAsString()
   {
      return model.getTextValueForPatternName("initialize-in-order");
   }

   /**
    * Removes the <code>initialize-in-order</code> attribute 
    * @return the current instance of <code>ApplicationDescriptor</code> 
    */
   public ApplicationDescriptor removeInitializeInOrder()
   {
      model.removeAttribute("initialize-in-order");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationDescriptor ElementName: javaee:moduleType ElementType : module
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>module</code> element will be created and returned.
    * Otherwise, the first existing <code>module</code> element will be returned.
    * @return the instance defined for the element <code>module</code> 
    */
   public ModuleType<ApplicationDescriptor> getOrCreateModule()
   {
      List<Node> nodeList = model.get("module");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ModuleTypeImpl<ApplicationDescriptor>(this, "module", model, nodeList.get(0));
      }
      return createModule();
   }

   /**
    * Creates a new <code>module</code> element 
    * @return the new created instance of <code>ModuleType<ApplicationDescriptor></code> 
    */
   public ModuleType<ApplicationDescriptor> createModule()
   {
      return new ModuleTypeImpl<ApplicationDescriptor>(this, "module", model);
   }

   /**
    * Returns all <code>module</code> elements
    * @return list of <code>module</code> 
    */
   public List<ModuleType<ApplicationDescriptor>> getAllModule()
   {
      List<ModuleType<ApplicationDescriptor>> list = new ArrayList<ModuleType<ApplicationDescriptor>>();
      List<Node> nodeList = model.get("module");
      for(Node node: nodeList)
      {
         ModuleType<ApplicationDescriptor>  type = new ModuleTypeImpl<ApplicationDescriptor>(this, "module", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>module</code> elements 
    * @return the current instance of <code>ModuleType<ApplicationDescriptor></code> 
    */
   public ApplicationDescriptor removeAllModule()
   {
      model.removeChildren("module");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationDescriptor ElementName: javaee:security-roleType ElementType : security-role
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>security-role</code> element will be created and returned.
    * Otherwise, the first existing <code>security-role</code> element will be returned.
    * @return the instance defined for the element <code>security-role</code> 
    */
   public SecurityRoleType<ApplicationDescriptor> getOrCreateSecurityRole()
   {
      List<Node> nodeList = model.get("security-role");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new SecurityRoleTypeImpl<ApplicationDescriptor>(this, "security-role", model, nodeList.get(0));
      }
      return createSecurityRole();
   }

   /**
    * Creates a new <code>security-role</code> element 
    * @return the new created instance of <code>SecurityRoleType<ApplicationDescriptor></code> 
    */
   public SecurityRoleType<ApplicationDescriptor> createSecurityRole()
   {
      return new SecurityRoleTypeImpl<ApplicationDescriptor>(this, "security-role", model);
   }

   /**
    * Returns all <code>security-role</code> elements
    * @return list of <code>security-role</code> 
    */
   public List<SecurityRoleType<ApplicationDescriptor>> getAllSecurityRole()
   {
      List<SecurityRoleType<ApplicationDescriptor>> list = new ArrayList<SecurityRoleType<ApplicationDescriptor>>();
      List<Node> nodeList = model.get("security-role");
      for(Node node: nodeList)
      {
         SecurityRoleType<ApplicationDescriptor>  type = new SecurityRoleTypeImpl<ApplicationDescriptor>(this, "security-role", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>security-role</code> elements 
    * @return the current instance of <code>SecurityRoleType<ApplicationDescriptor></code> 
    */
   public ApplicationDescriptor removeAllSecurityRole()
   {
      model.removeChildren("security-role");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationDescriptor ElementName: xsd:token ElementType : library-directory
   // MaxOccurs: -1  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>library-directory</code> element
    * @param libraryDirectory the value for the element <code>library-directory</code> 
    * @return the current instance of <code>ApplicationDescriptor</code> 
    */
   public ApplicationDescriptor libraryDirectory(String libraryDirectory)
   {
      model.getOrCreate("library-directory").text(libraryDirectory);
      return this;
   }

   /**
    * Returns the <code>library-directory</code> element
    * @return the node defined for the element <code>library-directory</code> 
    */
   public String getLibraryDirectory()
   {
      return model.getTextValueForPatternName("library-directory");
   }

   /**
    * Removes the <code>library-directory</code> element 
    * @return the current instance of <code>ApplicationDescriptor</code> 
    */
   public ApplicationDescriptor removeLibraryDirectory()
   {
      model.removeChildren("library-directory");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationDescriptor ElementName: javaee:env-entryType ElementType : env-entry
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>env-entry</code> element will be created and returned.
    * Otherwise, the first existing <code>env-entry</code> element will be returned.
    * @return the instance defined for the element <code>env-entry</code> 
    */
   public EnvEntryType<ApplicationDescriptor> getOrCreateEnvEntry()
   {
      List<Node> nodeList = model.get("env-entry");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new EnvEntryTypeImpl<ApplicationDescriptor>(this, "env-entry", model, nodeList.get(0));
      }
      return createEnvEntry();
   }

   /**
    * Creates a new <code>env-entry</code> element 
    * @return the new created instance of <code>EnvEntryType<ApplicationDescriptor></code> 
    */
   public EnvEntryType<ApplicationDescriptor> createEnvEntry()
   {
      return new EnvEntryTypeImpl<ApplicationDescriptor>(this, "env-entry", model);
   }

   /**
    * Returns all <code>env-entry</code> elements
    * @return list of <code>env-entry</code> 
    */
   public List<EnvEntryType<ApplicationDescriptor>> getAllEnvEntry()
   {
      List<EnvEntryType<ApplicationDescriptor>> list = new ArrayList<EnvEntryType<ApplicationDescriptor>>();
      List<Node> nodeList = model.get("env-entry");
      for(Node node: nodeList)
      {
         EnvEntryType<ApplicationDescriptor>  type = new EnvEntryTypeImpl<ApplicationDescriptor>(this, "env-entry", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>env-entry</code> elements 
    * @return the current instance of <code>EnvEntryType<ApplicationDescriptor></code> 
    */
   public ApplicationDescriptor removeAllEnvEntry()
   {
      model.removeChildren("env-entry");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationDescriptor ElementName: javaee:ejb-refType ElementType : ejb-ref
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>ejb-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>ejb-ref</code> element will be returned.
    * @return the instance defined for the element <code>ejb-ref</code> 
    */
   public EjbRefType<ApplicationDescriptor> getOrCreateEjbRef()
   {
      List<Node> nodeList = model.get("ejb-ref");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new EjbRefTypeImpl<ApplicationDescriptor>(this, "ejb-ref", model, nodeList.get(0));
      }
      return createEjbRef();
   }

   /**
    * Creates a new <code>ejb-ref</code> element 
    * @return the new created instance of <code>EjbRefType<ApplicationDescriptor></code> 
    */
   public EjbRefType<ApplicationDescriptor> createEjbRef()
   {
      return new EjbRefTypeImpl<ApplicationDescriptor>(this, "ejb-ref", model);
   }

   /**
    * Returns all <code>ejb-ref</code> elements
    * @return list of <code>ejb-ref</code> 
    */
   public List<EjbRefType<ApplicationDescriptor>> getAllEjbRef()
   {
      List<EjbRefType<ApplicationDescriptor>> list = new ArrayList<EjbRefType<ApplicationDescriptor>>();
      List<Node> nodeList = model.get("ejb-ref");
      for(Node node: nodeList)
      {
         EjbRefType<ApplicationDescriptor>  type = new EjbRefTypeImpl<ApplicationDescriptor>(this, "ejb-ref", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>ejb-ref</code> elements 
    * @return the current instance of <code>EjbRefType<ApplicationDescriptor></code> 
    */
   public ApplicationDescriptor removeAllEjbRef()
   {
      model.removeChildren("ejb-ref");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationDescriptor ElementName: javaee:ejb-local-refType ElementType : ejb-local-ref
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>ejb-local-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>ejb-local-ref</code> element will be returned.
    * @return the instance defined for the element <code>ejb-local-ref</code> 
    */
   public EjbLocalRefType<ApplicationDescriptor> getOrCreateEjbLocalRef()
   {
      List<Node> nodeList = model.get("ejb-local-ref");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new EjbLocalRefTypeImpl<ApplicationDescriptor>(this, "ejb-local-ref", model, nodeList.get(0));
      }
      return createEjbLocalRef();
   }

   /**
    * Creates a new <code>ejb-local-ref</code> element 
    * @return the new created instance of <code>EjbLocalRefType<ApplicationDescriptor></code> 
    */
   public EjbLocalRefType<ApplicationDescriptor> createEjbLocalRef()
   {
      return new EjbLocalRefTypeImpl<ApplicationDescriptor>(this, "ejb-local-ref", model);
   }

   /**
    * Returns all <code>ejb-local-ref</code> elements
    * @return list of <code>ejb-local-ref</code> 
    */
   public List<EjbLocalRefType<ApplicationDescriptor>> getAllEjbLocalRef()
   {
      List<EjbLocalRefType<ApplicationDescriptor>> list = new ArrayList<EjbLocalRefType<ApplicationDescriptor>>();
      List<Node> nodeList = model.get("ejb-local-ref");
      for(Node node: nodeList)
      {
         EjbLocalRefType<ApplicationDescriptor>  type = new EjbLocalRefTypeImpl<ApplicationDescriptor>(this, "ejb-local-ref", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>ejb-local-ref</code> elements 
    * @return the current instance of <code>EjbLocalRefType<ApplicationDescriptor></code> 
    */
   public ApplicationDescriptor removeAllEjbLocalRef()
   {
      model.removeChildren("ejb-local-ref");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationDescriptor ElementName: javaee:resource-refType ElementType : resource-ref
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>resource-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>resource-ref</code> element will be returned.
    * @return the instance defined for the element <code>resource-ref</code> 
    */
   public ResourceRefType<ApplicationDescriptor> getOrCreateResourceRef()
   {
      List<Node> nodeList = model.get("resource-ref");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ResourceRefTypeImpl<ApplicationDescriptor>(this, "resource-ref", model, nodeList.get(0));
      }
      return createResourceRef();
   }

   /**
    * Creates a new <code>resource-ref</code> element 
    * @return the new created instance of <code>ResourceRefType<ApplicationDescriptor></code> 
    */
   public ResourceRefType<ApplicationDescriptor> createResourceRef()
   {
      return new ResourceRefTypeImpl<ApplicationDescriptor>(this, "resource-ref", model);
   }

   /**
    * Returns all <code>resource-ref</code> elements
    * @return list of <code>resource-ref</code> 
    */
   public List<ResourceRefType<ApplicationDescriptor>> getAllResourceRef()
   {
      List<ResourceRefType<ApplicationDescriptor>> list = new ArrayList<ResourceRefType<ApplicationDescriptor>>();
      List<Node> nodeList = model.get("resource-ref");
      for(Node node: nodeList)
      {
         ResourceRefType<ApplicationDescriptor>  type = new ResourceRefTypeImpl<ApplicationDescriptor>(this, "resource-ref", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>resource-ref</code> elements 
    * @return the current instance of <code>ResourceRefType<ApplicationDescriptor></code> 
    */
   public ApplicationDescriptor removeAllResourceRef()
   {
      model.removeChildren("resource-ref");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationDescriptor ElementName: javaee:resource-env-refType ElementType : resource-env-ref
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>resource-env-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>resource-env-ref</code> element will be returned.
    * @return the instance defined for the element <code>resource-env-ref</code> 
    */
   public ResourceEnvRefType<ApplicationDescriptor> getOrCreateResourceEnvRef()
   {
      List<Node> nodeList = model.get("resource-env-ref");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ResourceEnvRefTypeImpl<ApplicationDescriptor>(this, "resource-env-ref", model, nodeList.get(0));
      }
      return createResourceEnvRef();
   }

   /**
    * Creates a new <code>resource-env-ref</code> element 
    * @return the new created instance of <code>ResourceEnvRefType<ApplicationDescriptor></code> 
    */
   public ResourceEnvRefType<ApplicationDescriptor> createResourceEnvRef()
   {
      return new ResourceEnvRefTypeImpl<ApplicationDescriptor>(this, "resource-env-ref", model);
   }

   /**
    * Returns all <code>resource-env-ref</code> elements
    * @return list of <code>resource-env-ref</code> 
    */
   public List<ResourceEnvRefType<ApplicationDescriptor>> getAllResourceEnvRef()
   {
      List<ResourceEnvRefType<ApplicationDescriptor>> list = new ArrayList<ResourceEnvRefType<ApplicationDescriptor>>();
      List<Node> nodeList = model.get("resource-env-ref");
      for(Node node: nodeList)
      {
         ResourceEnvRefType<ApplicationDescriptor>  type = new ResourceEnvRefTypeImpl<ApplicationDescriptor>(this, "resource-env-ref", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>resource-env-ref</code> elements 
    * @return the current instance of <code>ResourceEnvRefType<ApplicationDescriptor></code> 
    */
   public ApplicationDescriptor removeAllResourceEnvRef()
   {
      model.removeChildren("resource-env-ref");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationDescriptor ElementName: javaee:message-destination-refType ElementType : message-destination-ref
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>message-destination-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>message-destination-ref</code> element will be returned.
    * @return the instance defined for the element <code>message-destination-ref</code> 
    */
   public MessageDestinationRefType<ApplicationDescriptor> getOrCreateMessageDestinationRef()
   {
      List<Node> nodeList = model.get("message-destination-ref");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new MessageDestinationRefTypeImpl<ApplicationDescriptor>(this, "message-destination-ref", model, nodeList.get(0));
      }
      return createMessageDestinationRef();
   }

   /**
    * Creates a new <code>message-destination-ref</code> element 
    * @return the new created instance of <code>MessageDestinationRefType<ApplicationDescriptor></code> 
    */
   public MessageDestinationRefType<ApplicationDescriptor> createMessageDestinationRef()
   {
      return new MessageDestinationRefTypeImpl<ApplicationDescriptor>(this, "message-destination-ref", model);
   }

   /**
    * Returns all <code>message-destination-ref</code> elements
    * @return list of <code>message-destination-ref</code> 
    */
   public List<MessageDestinationRefType<ApplicationDescriptor>> getAllMessageDestinationRef()
   {
      List<MessageDestinationRefType<ApplicationDescriptor>> list = new ArrayList<MessageDestinationRefType<ApplicationDescriptor>>();
      List<Node> nodeList = model.get("message-destination-ref");
      for(Node node: nodeList)
      {
         MessageDestinationRefType<ApplicationDescriptor>  type = new MessageDestinationRefTypeImpl<ApplicationDescriptor>(this, "message-destination-ref", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>message-destination-ref</code> elements 
    * @return the current instance of <code>MessageDestinationRefType<ApplicationDescriptor></code> 
    */
   public ApplicationDescriptor removeAllMessageDestinationRef()
   {
      model.removeChildren("message-destination-ref");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationDescriptor ElementName: javaee:persistence-context-refType ElementType : persistence-context-ref
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>persistence-context-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>persistence-context-ref</code> element will be returned.
    * @return the instance defined for the element <code>persistence-context-ref</code> 
    */
   public PersistenceContextRefType<ApplicationDescriptor> getOrCreatePersistenceContextRef()
   {
      List<Node> nodeList = model.get("persistence-context-ref");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new PersistenceContextRefTypeImpl<ApplicationDescriptor>(this, "persistence-context-ref", model, nodeList.get(0));
      }
      return createPersistenceContextRef();
   }

   /**
    * Creates a new <code>persistence-context-ref</code> element 
    * @return the new created instance of <code>PersistenceContextRefType<ApplicationDescriptor></code> 
    */
   public PersistenceContextRefType<ApplicationDescriptor> createPersistenceContextRef()
   {
      return new PersistenceContextRefTypeImpl<ApplicationDescriptor>(this, "persistence-context-ref", model);
   }

   /**
    * Returns all <code>persistence-context-ref</code> elements
    * @return list of <code>persistence-context-ref</code> 
    */
   public List<PersistenceContextRefType<ApplicationDescriptor>> getAllPersistenceContextRef()
   {
      List<PersistenceContextRefType<ApplicationDescriptor>> list = new ArrayList<PersistenceContextRefType<ApplicationDescriptor>>();
      List<Node> nodeList = model.get("persistence-context-ref");
      for(Node node: nodeList)
      {
         PersistenceContextRefType<ApplicationDescriptor>  type = new PersistenceContextRefTypeImpl<ApplicationDescriptor>(this, "persistence-context-ref", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>persistence-context-ref</code> elements 
    * @return the current instance of <code>PersistenceContextRefType<ApplicationDescriptor></code> 
    */
   public ApplicationDescriptor removeAllPersistenceContextRef()
   {
      model.removeChildren("persistence-context-ref");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationDescriptor ElementName: javaee:persistence-unit-refType ElementType : persistence-unit-ref
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>persistence-unit-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>persistence-unit-ref</code> element will be returned.
    * @return the instance defined for the element <code>persistence-unit-ref</code> 
    */
   public PersistenceUnitRefType<ApplicationDescriptor> getOrCreatePersistenceUnitRef()
   {
      List<Node> nodeList = model.get("persistence-unit-ref");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new PersistenceUnitRefTypeImpl<ApplicationDescriptor>(this, "persistence-unit-ref", model, nodeList.get(0));
      }
      return createPersistenceUnitRef();
   }

   /**
    * Creates a new <code>persistence-unit-ref</code> element 
    * @return the new created instance of <code>PersistenceUnitRefType<ApplicationDescriptor></code> 
    */
   public PersistenceUnitRefType<ApplicationDescriptor> createPersistenceUnitRef()
   {
      return new PersistenceUnitRefTypeImpl<ApplicationDescriptor>(this, "persistence-unit-ref", model);
   }

   /**
    * Returns all <code>persistence-unit-ref</code> elements
    * @return list of <code>persistence-unit-ref</code> 
    */
   public List<PersistenceUnitRefType<ApplicationDescriptor>> getAllPersistenceUnitRef()
   {
      List<PersistenceUnitRefType<ApplicationDescriptor>> list = new ArrayList<PersistenceUnitRefType<ApplicationDescriptor>>();
      List<Node> nodeList = model.get("persistence-unit-ref");
      for(Node node: nodeList)
      {
         PersistenceUnitRefType<ApplicationDescriptor>  type = new PersistenceUnitRefTypeImpl<ApplicationDescriptor>(this, "persistence-unit-ref", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>persistence-unit-ref</code> elements 
    * @return the current instance of <code>PersistenceUnitRefType<ApplicationDescriptor></code> 
    */
   public ApplicationDescriptor removeAllPersistenceUnitRef()
   {
      model.removeChildren("persistence-unit-ref");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationDescriptor ElementName: javaee:message-destinationType ElementType : message-destination
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>message-destination</code> element will be created and returned.
    * Otherwise, the first existing <code>message-destination</code> element will be returned.
    * @return the instance defined for the element <code>message-destination</code> 
    */
   public MessageDestinationType<ApplicationDescriptor> getOrCreateMessageDestination()
   {
      List<Node> nodeList = model.get("message-destination");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new MessageDestinationTypeImpl<ApplicationDescriptor>(this, "message-destination", model, nodeList.get(0));
      }
      return createMessageDestination();
   }

   /**
    * Creates a new <code>message-destination</code> element 
    * @return the new created instance of <code>MessageDestinationType<ApplicationDescriptor></code> 
    */
   public MessageDestinationType<ApplicationDescriptor> createMessageDestination()
   {
      return new MessageDestinationTypeImpl<ApplicationDescriptor>(this, "message-destination", model);
   }

   /**
    * Returns all <code>message-destination</code> elements
    * @return list of <code>message-destination</code> 
    */
   public List<MessageDestinationType<ApplicationDescriptor>> getAllMessageDestination()
   {
      List<MessageDestinationType<ApplicationDescriptor>> list = new ArrayList<MessageDestinationType<ApplicationDescriptor>>();
      List<Node> nodeList = model.get("message-destination");
      for(Node node: nodeList)
      {
         MessageDestinationType<ApplicationDescriptor>  type = new MessageDestinationTypeImpl<ApplicationDescriptor>(this, "message-destination", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>message-destination</code> elements 
    * @return the current instance of <code>MessageDestinationType<ApplicationDescriptor></code> 
    */
   public ApplicationDescriptor removeAllMessageDestination()
   {
      model.removeChildren("message-destination");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationDescriptor ElementName: javaee:data-sourceType ElementType : data-source
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>data-source</code> element will be created and returned.
    * Otherwise, the first existing <code>data-source</code> element will be returned.
    * @return the instance defined for the element <code>data-source</code> 
    */
   public DataSourceType<ApplicationDescriptor> getOrCreateDataSource()
   {
      List<Node> nodeList = model.get("data-source");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new DataSourceTypeImpl<ApplicationDescriptor>(this, "data-source", model, nodeList.get(0));
      }
      return createDataSource();
   }

   /**
    * Creates a new <code>data-source</code> element 
    * @return the new created instance of <code>DataSourceType<ApplicationDescriptor></code> 
    */
   public DataSourceType<ApplicationDescriptor> createDataSource()
   {
      return new DataSourceTypeImpl<ApplicationDescriptor>(this, "data-source", model);
   }

   /**
    * Returns all <code>data-source</code> elements
    * @return list of <code>data-source</code> 
    */
   public List<DataSourceType<ApplicationDescriptor>> getAllDataSource()
   {
      List<DataSourceType<ApplicationDescriptor>> list = new ArrayList<DataSourceType<ApplicationDescriptor>>();
      List<Node> nodeList = model.get("data-source");
      for(Node node: nodeList)
      {
         DataSourceType<ApplicationDescriptor>  type = new DataSourceTypeImpl<ApplicationDescriptor>(this, "data-source", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>data-source</code> elements 
    * @return the current instance of <code>DataSourceType<ApplicationDescriptor></code> 
    */
   public ApplicationDescriptor removeAllDataSource()
   {
      model.removeChildren("data-source");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationDescriptor ElementName: javaee:jms-connection-factoryType ElementType : jms-connection-factory
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>jms-connection-factory</code> element will be created and returned.
    * Otherwise, the first existing <code>jms-connection-factory</code> element will be returned.
    * @return the instance defined for the element <code>jms-connection-factory</code> 
    */
   public JmsConnectionFactoryType<ApplicationDescriptor> getOrCreateJmsConnectionFactory()
   {
      List<Node> nodeList = model.get("jms-connection-factory");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new JmsConnectionFactoryTypeImpl<ApplicationDescriptor>(this, "jms-connection-factory", model, nodeList.get(0));
      }
      return createJmsConnectionFactory();
   }

   /**
    * Creates a new <code>jms-connection-factory</code> element 
    * @return the new created instance of <code>JmsConnectionFactoryType<ApplicationDescriptor></code> 
    */
   public JmsConnectionFactoryType<ApplicationDescriptor> createJmsConnectionFactory()
   {
      return new JmsConnectionFactoryTypeImpl<ApplicationDescriptor>(this, "jms-connection-factory", model);
   }

   /**
    * Returns all <code>jms-connection-factory</code> elements
    * @return list of <code>jms-connection-factory</code> 
    */
   public List<JmsConnectionFactoryType<ApplicationDescriptor>> getAllJmsConnectionFactory()
   {
      List<JmsConnectionFactoryType<ApplicationDescriptor>> list = new ArrayList<JmsConnectionFactoryType<ApplicationDescriptor>>();
      List<Node> nodeList = model.get("jms-connection-factory");
      for(Node node: nodeList)
      {
         JmsConnectionFactoryType<ApplicationDescriptor>  type = new JmsConnectionFactoryTypeImpl<ApplicationDescriptor>(this, "jms-connection-factory", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>jms-connection-factory</code> elements 
    * @return the current instance of <code>JmsConnectionFactoryType<ApplicationDescriptor></code> 
    */
   public ApplicationDescriptor removeAllJmsConnectionFactory()
   {
      model.removeChildren("jms-connection-factory");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationDescriptor ElementName: javaee:jms-destinationType ElementType : jms-destination
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>jms-destination</code> element will be created and returned.
    * Otherwise, the first existing <code>jms-destination</code> element will be returned.
    * @return the instance defined for the element <code>jms-destination</code> 
    */
   public JmsDestinationType<ApplicationDescriptor> getOrCreateJmsDestination()
   {
      List<Node> nodeList = model.get("jms-destination");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new JmsDestinationTypeImpl<ApplicationDescriptor>(this, "jms-destination", model, nodeList.get(0));
      }
      return createJmsDestination();
   }

   /**
    * Creates a new <code>jms-destination</code> element 
    * @return the new created instance of <code>JmsDestinationType<ApplicationDescriptor></code> 
    */
   public JmsDestinationType<ApplicationDescriptor> createJmsDestination()
   {
      return new JmsDestinationTypeImpl<ApplicationDescriptor>(this, "jms-destination", model);
   }

   /**
    * Returns all <code>jms-destination</code> elements
    * @return list of <code>jms-destination</code> 
    */
   public List<JmsDestinationType<ApplicationDescriptor>> getAllJmsDestination()
   {
      List<JmsDestinationType<ApplicationDescriptor>> list = new ArrayList<JmsDestinationType<ApplicationDescriptor>>();
      List<Node> nodeList = model.get("jms-destination");
      for(Node node: nodeList)
      {
         JmsDestinationType<ApplicationDescriptor>  type = new JmsDestinationTypeImpl<ApplicationDescriptor>(this, "jms-destination", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>jms-destination</code> elements 
    * @return the current instance of <code>JmsDestinationType<ApplicationDescriptor></code> 
    */
   public ApplicationDescriptor removeAllJmsDestination()
   {
      model.removeChildren("jms-destination");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationDescriptor ElementName: javaee:mail-sessionType ElementType : mail-session
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>mail-session</code> element will be created and returned.
    * Otherwise, the first existing <code>mail-session</code> element will be returned.
    * @return the instance defined for the element <code>mail-session</code> 
    */
   public MailSessionType<ApplicationDescriptor> getOrCreateMailSession()
   {
      List<Node> nodeList = model.get("mail-session");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new MailSessionTypeImpl<ApplicationDescriptor>(this, "mail-session", model, nodeList.get(0));
      }
      return createMailSession();
   }

   /**
    * Creates a new <code>mail-session</code> element 
    * @return the new created instance of <code>MailSessionType<ApplicationDescriptor></code> 
    */
   public MailSessionType<ApplicationDescriptor> createMailSession()
   {
      return new MailSessionTypeImpl<ApplicationDescriptor>(this, "mail-session", model);
   }

   /**
    * Returns all <code>mail-session</code> elements
    * @return list of <code>mail-session</code> 
    */
   public List<MailSessionType<ApplicationDescriptor>> getAllMailSession()
   {
      List<MailSessionType<ApplicationDescriptor>> list = new ArrayList<MailSessionType<ApplicationDescriptor>>();
      List<Node> nodeList = model.get("mail-session");
      for(Node node: nodeList)
      {
         MailSessionType<ApplicationDescriptor>  type = new MailSessionTypeImpl<ApplicationDescriptor>(this, "mail-session", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>mail-session</code> elements 
    * @return the current instance of <code>MailSessionType<ApplicationDescriptor></code> 
    */
   public ApplicationDescriptor removeAllMailSession()
   {
      model.removeChildren("mail-session");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationDescriptor ElementName: javaee:connection-factory-resourceType ElementType : connection-factory
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>connection-factory</code> element will be created and returned.
    * Otherwise, the first existing <code>connection-factory</code> element will be returned.
    * @return the instance defined for the element <code>connection-factory</code> 
    */
   public ConnectionFactoryResourceType<ApplicationDescriptor> getOrCreateConnectionFactory()
   {
      List<Node> nodeList = model.get("connection-factory");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ConnectionFactoryResourceTypeImpl<ApplicationDescriptor>(this, "connection-factory", model, nodeList.get(0));
      }
      return createConnectionFactory();
   }

   /**
    * Creates a new <code>connection-factory</code> element 
    * @return the new created instance of <code>ConnectionFactoryResourceType<ApplicationDescriptor></code> 
    */
   public ConnectionFactoryResourceType<ApplicationDescriptor> createConnectionFactory()
   {
      return new ConnectionFactoryResourceTypeImpl<ApplicationDescriptor>(this, "connection-factory", model);
   }

   /**
    * Returns all <code>connection-factory</code> elements
    * @return list of <code>connection-factory</code> 
    */
   public List<ConnectionFactoryResourceType<ApplicationDescriptor>> getAllConnectionFactory()
   {
      List<ConnectionFactoryResourceType<ApplicationDescriptor>> list = new ArrayList<ConnectionFactoryResourceType<ApplicationDescriptor>>();
      List<Node> nodeList = model.get("connection-factory");
      for(Node node: nodeList)
      {
         ConnectionFactoryResourceType<ApplicationDescriptor>  type = new ConnectionFactoryResourceTypeImpl<ApplicationDescriptor>(this, "connection-factory", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>connection-factory</code> elements 
    * @return the current instance of <code>ConnectionFactoryResourceType<ApplicationDescriptor></code> 
    */
   public ApplicationDescriptor removeAllConnectionFactory()
   {
      model.removeChildren("connection-factory");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationDescriptor ElementName: javaee:administered-objectType ElementType : administered-object
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>administered-object</code> element will be created and returned.
    * Otherwise, the first existing <code>administered-object</code> element will be returned.
    * @return the instance defined for the element <code>administered-object</code> 
    */
   public AdministeredObjectType<ApplicationDescriptor> getOrCreateAdministeredObject()
   {
      List<Node> nodeList = model.get("administered-object");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new AdministeredObjectTypeImpl<ApplicationDescriptor>(this, "administered-object", model, nodeList.get(0));
      }
      return createAdministeredObject();
   }

   /**
    * Creates a new <code>administered-object</code> element 
    * @return the new created instance of <code>AdministeredObjectType<ApplicationDescriptor></code> 
    */
   public AdministeredObjectType<ApplicationDescriptor> createAdministeredObject()
   {
      return new AdministeredObjectTypeImpl<ApplicationDescriptor>(this, "administered-object", model);
   }

   /**
    * Returns all <code>administered-object</code> elements
    * @return list of <code>administered-object</code> 
    */
   public List<AdministeredObjectType<ApplicationDescriptor>> getAllAdministeredObject()
   {
      List<AdministeredObjectType<ApplicationDescriptor>> list = new ArrayList<AdministeredObjectType<ApplicationDescriptor>>();
      List<Node> nodeList = model.get("administered-object");
      for(Node node: nodeList)
      {
         AdministeredObjectType<ApplicationDescriptor>  type = new AdministeredObjectTypeImpl<ApplicationDescriptor>(this, "administered-object", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>administered-object</code> elements 
    * @return the current instance of <code>AdministeredObjectType<ApplicationDescriptor></code> 
    */
   public ApplicationDescriptor removeAllAdministeredObject()
   {
      model.removeChildren("administered-object");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationDescriptor ElementName: xsd:token ElementType : version
   // MaxOccurs: -  isGeneric: false   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of <code>ApplicationDescriptor</code> 
    */
   public ApplicationDescriptor version(String version)
   {
      model.attribute("version", version);
      return this;
   }

   /**
    * Returns the <code>version</code> attribute
    * @return the value defined for the attribute <code>version</code> 
    */
      public String getVersion()
   {
      return model.getAttribute("version");
   }

   /**
    * Removes the <code>version</code> attribute 
    * @return the current instance of <code>ApplicationDescriptor</code> 
    */
   public ApplicationDescriptor removeVersion()
   {
      model.removeAttribute("version");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationDescriptor ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: false   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>ApplicationDescriptor</code> 
    */
   public ApplicationDescriptor id(String id)
   {
      model.attribute("id", id);
      return this;
   }

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
      public String getId()
   {
      return model.getAttribute("id");
   }

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>ApplicationDescriptor</code> 
    */
   public ApplicationDescriptor removeId()
   {
      model.removeAttribute("id");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationDescriptor ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>ApplicationDescriptor</code> 
    */
   public ApplicationDescriptor description(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            model.createChild("description").text(name);
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
      List<Node> nodes = model.get("description");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>ApplicationDescriptor</code> 
    */
   public ApplicationDescriptor removeAllDescription()
   {
      model.removeChildren("description");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationDescriptor ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>ApplicationDescriptor</code> 
    */
   public ApplicationDescriptor displayName(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            model.createChild("display-name").text(name);
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
      List<Node> nodes = model.get("display-name");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>display-name</code> element 
    * @return the current instance of <code>ApplicationDescriptor</code> 
    */
   public ApplicationDescriptor removeAllDisplayName()
   {
      model.removeChildren("display-name");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationDescriptor ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<ApplicationDescriptor> getOrCreateIcon()
   {
      List<Node> nodeList = model.get("icon");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new IconTypeImpl<ApplicationDescriptor>(this, "icon", model, nodeList.get(0));
      }
      return createIcon();
   }

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<ApplicationDescriptor></code> 
    */
   public IconType<ApplicationDescriptor> createIcon()
   {
      return new IconTypeImpl<ApplicationDescriptor>(this, "icon", model);
   }

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<ApplicationDescriptor>> getAllIcon()
   {
      List<IconType<ApplicationDescriptor>> list = new ArrayList<IconType<ApplicationDescriptor>>();
      List<Node> nodeList = model.get("icon");
      for(Node node: nodeList)
      {
         IconType<ApplicationDescriptor>  type = new IconTypeImpl<ApplicationDescriptor>(this, "icon", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<ApplicationDescriptor></code> 
    */
   public ApplicationDescriptor removeAllIcon()
   {
      model.removeChildren("icon");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationDescriptor ElementName: javaee:service-refType ElementType : service-ref
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>service-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>service-ref</code> element will be returned.
    * @return the instance defined for the element <code>service-ref</code> 
    */
   public ServiceRefType<ApplicationDescriptor> getOrCreateServiceRef()
   {
      List<Node> nodeList = model.get("service-ref");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ServiceRefTypeImpl<ApplicationDescriptor>(this, "service-ref", model, nodeList.get(0));
      }
      return createServiceRef();
   }

   /**
    * Creates a new <code>service-ref</code> element 
    * @return the new created instance of <code>ServiceRefType<ApplicationDescriptor></code> 
    */
   public ServiceRefType<ApplicationDescriptor> createServiceRef()
   {
      return new ServiceRefTypeImpl<ApplicationDescriptor>(this, "service-ref", model);
   }

   /**
    * Returns all <code>service-ref</code> elements
    * @return list of <code>service-ref</code> 
    */
   public List<ServiceRefType<ApplicationDescriptor>> getAllServiceRef()
   {
      List<ServiceRefType<ApplicationDescriptor>> list = new ArrayList<ServiceRefType<ApplicationDescriptor>>();
      List<Node> nodeList = model.get("service-ref");
      for(Node node: nodeList)
      {
         ServiceRefType<ApplicationDescriptor>  type = new ServiceRefTypeImpl<ApplicationDescriptor>(this, "service-ref", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>service-ref</code> elements 
    * @return the current instance of <code>ServiceRefType<ApplicationDescriptor></code> 
    */
   public ApplicationDescriptor removeAllServiceRef()
   {
      model.removeChildren("service-ref");
      return this;
   }

}
