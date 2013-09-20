package org.jboss.shrinkwrap.descriptor.impl.webapp25; 

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

import org.jboss.shrinkwrap.descriptor.api.DescriptorNamespace;
import org.jboss.shrinkwrap.descriptor.api.javaee5.EjbLocalRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.EjbRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.EnvEntryType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.LifecycleCallbackType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.ListenerType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.MessageDestinationRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.MessageDestinationType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.ParamValueType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.PersistenceContextRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.PersistenceUnitRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.ResourceEnvRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.ResourceRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.SecurityRoleType;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient12.ServiceRefType;
import org.jboss.shrinkwrap.descriptor.api.jsp21.JspConfigType;
import org.jboss.shrinkwrap.descriptor.api.webapp25.ErrorPageType;
import org.jboss.shrinkwrap.descriptor.api.webapp25.FilterMappingType;
import org.jboss.shrinkwrap.descriptor.api.webapp25.FilterType;
import org.jboss.shrinkwrap.descriptor.api.webapp25.LocaleEncodingMappingListType;
import org.jboss.shrinkwrap.descriptor.api.webapp25.LoginConfigType;
import org.jboss.shrinkwrap.descriptor.api.webapp25.MimeMappingType;
import org.jboss.shrinkwrap.descriptor.api.webapp25.SecurityConstraintType;
import org.jboss.shrinkwrap.descriptor.api.webapp25.ServletMappingType;
import org.jboss.shrinkwrap.descriptor.api.webapp25.ServletType;
import org.jboss.shrinkwrap.descriptor.api.webapp25.SessionConfigType;
import org.jboss.shrinkwrap.descriptor.api.webapp25.WebAppDescriptor;
import org.jboss.shrinkwrap.descriptor.api.webapp25.WebAppVersionType;
import org.jboss.shrinkwrap.descriptor.api.webapp25.WelcomeFileListType;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.EjbLocalRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.EjbRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.EnvEntryTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.IconTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.LifecycleCallbackTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.ListenerTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.MessageDestinationRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.MessageDestinationTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.ParamValueTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.PersistenceContextRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.PersistenceUnitRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.ResourceEnvRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.ResourceRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.SecurityRoleTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaeewebservicesclient12.ServiceRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.jsp21.JspConfigTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.spi.node.NodeDescriptorImplBase;

/** 
 * <p> 
 * This deployment descriptor provides the functionalities as described in the  specification
 * <p> 
 * Example:
 * <p> 
 * <code> 
 *     WebAppDescriptor descriptor = Descriptors.create(WebAppDescriptor.class);
 * </code> 
 *
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class WebAppDescriptorImpl extends NodeDescriptorImplBase implements DescriptorNamespace<WebAppDescriptor>, WebAppDescriptor
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private Node model;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public WebAppDescriptorImpl(String descriptorName)
   {
       this(descriptorName, new Node("web-app"));
   }

   public WebAppDescriptorImpl(String descriptorName, Node node)
   {
      super(descriptorName);
      this.model = node;
      addDefaultNamespaces();
      version("2.5");
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
    * @return the current instance of <code>WebAppDescriptor</code> 
    */
   public WebAppDescriptor addDefaultNamespaces()
   {
      addNamespace("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
      addNamespace("xsi:schemaLocation", "http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_2_5.xsd");
      addNamespace("xmlns", "http://java.sun.com/xml/ns/javaee");
     return this;
   }

   /**
    * Adds a new namespace 
    * @return the current instance of <code>WebAppDescriptor</code> 
    */
   public WebAppDescriptor addNamespace(String name, String value)
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
    * @return the current instance of <code>WebAppDescriptor</code> 
    */
   public WebAppDescriptor removeAllNamespaces()
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
   // ClassName: WebAppDescriptor ElementName: javaee:emptyType ElementType : distributable
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>distributable</code> element 
    * @return the current instance of <code>WebAppDescriptor</code> 
    */
   public WebAppDescriptor distributable()
   {
      model.getOrCreate("distributable");
      return this;
   }

   /**
    * Removes the <code>distributable</code> element 
    * @return the current instance of <code>WebAppDescriptor</code> 
    */
   public Boolean isDistributable()
   {
      return model.getSingle("distributable") != null;
   }

   /**
    * Removes the <code>distributable</code> element 
    * @return the current instance of <code>WebAppDescriptor</code> 
    */
   public WebAppDescriptor removeDistributable()
   {
      model.removeChild("distributable");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppDescriptor ElementName: javaee:param-valueType ElementType : context-param
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>context-param</code> element will be created and returned.
    * Otherwise, the first existing <code>context-param</code> element will be returned.
    * @return the instance defined for the element <code>context-param</code> 
    */
   public ParamValueType<WebAppDescriptor> getOrCreateContextParam()
   {
      List<Node> nodeList = model.get("context-param");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ParamValueTypeImpl<WebAppDescriptor>(this, "context-param", model, nodeList.get(0));
      }
      return createContextParam();
   }

   /**
    * Creates a new <code>context-param</code> element 
    * @return the new created instance of <code>ParamValueType<WebAppDescriptor></code> 
    */
   public ParamValueType<WebAppDescriptor> createContextParam()
   {
      return new ParamValueTypeImpl<WebAppDescriptor>(this, "context-param", model);
   }

   /**
    * Returns all <code>context-param</code> elements
    * @return list of <code>context-param</code> 
    */
   public List<ParamValueType<WebAppDescriptor>> getAllContextParam()
   {
      List<ParamValueType<WebAppDescriptor>> list = new ArrayList<ParamValueType<WebAppDescriptor>>();
      List<Node> nodeList = model.get("context-param");
      for(Node node: nodeList)
      {
         ParamValueType<WebAppDescriptor>  type = new ParamValueTypeImpl<WebAppDescriptor>(this, "context-param", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>context-param</code> elements 
    * @return the current instance of <code>ParamValueType<WebAppDescriptor></code> 
    */
   public WebAppDescriptor removeAllContextParam()
   {
      model.removeChildren("context-param");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppDescriptor ElementName: javaee:filterType ElementType : filter
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>filter</code> element will be created and returned.
    * Otherwise, the first existing <code>filter</code> element will be returned.
    * @return the instance defined for the element <code>filter</code> 
    */
   public FilterType<WebAppDescriptor> getOrCreateFilter()
   {
      List<Node> nodeList = model.get("filter");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new FilterTypeImpl<WebAppDescriptor>(this, "filter", model, nodeList.get(0));
      }
      return createFilter();
   }

   /**
    * Creates a new <code>filter</code> element 
    * @return the new created instance of <code>FilterType<WebAppDescriptor></code> 
    */
   public FilterType<WebAppDescriptor> createFilter()
   {
      return new FilterTypeImpl<WebAppDescriptor>(this, "filter", model);
   }

   /**
    * Returns all <code>filter</code> elements
    * @return list of <code>filter</code> 
    */
   public List<FilterType<WebAppDescriptor>> getAllFilter()
   {
      List<FilterType<WebAppDescriptor>> list = new ArrayList<FilterType<WebAppDescriptor>>();
      List<Node> nodeList = model.get("filter");
      for(Node node: nodeList)
      {
         FilterType<WebAppDescriptor>  type = new FilterTypeImpl<WebAppDescriptor>(this, "filter", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>filter</code> elements 
    * @return the current instance of <code>FilterType<WebAppDescriptor></code> 
    */
   public WebAppDescriptor removeAllFilter()
   {
      model.removeChildren("filter");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppDescriptor ElementName: javaee:filter-mappingType ElementType : filter-mapping
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>filter-mapping</code> element will be created and returned.
    * Otherwise, the first existing <code>filter-mapping</code> element will be returned.
    * @return the instance defined for the element <code>filter-mapping</code> 
    */
   public FilterMappingType<WebAppDescriptor> getOrCreateFilterMapping()
   {
      List<Node> nodeList = model.get("filter-mapping");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new FilterMappingTypeImpl<WebAppDescriptor>(this, "filter-mapping", model, nodeList.get(0));
      }
      return createFilterMapping();
   }

   /**
    * Creates a new <code>filter-mapping</code> element 
    * @return the new created instance of <code>FilterMappingType<WebAppDescriptor></code> 
    */
   public FilterMappingType<WebAppDescriptor> createFilterMapping()
   {
      return new FilterMappingTypeImpl<WebAppDescriptor>(this, "filter-mapping", model);
   }

   /**
    * Returns all <code>filter-mapping</code> elements
    * @return list of <code>filter-mapping</code> 
    */
   public List<FilterMappingType<WebAppDescriptor>> getAllFilterMapping()
   {
      List<FilterMappingType<WebAppDescriptor>> list = new ArrayList<FilterMappingType<WebAppDescriptor>>();
      List<Node> nodeList = model.get("filter-mapping");
      for(Node node: nodeList)
      {
         FilterMappingType<WebAppDescriptor>  type = new FilterMappingTypeImpl<WebAppDescriptor>(this, "filter-mapping", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>filter-mapping</code> elements 
    * @return the current instance of <code>FilterMappingType<WebAppDescriptor></code> 
    */
   public WebAppDescriptor removeAllFilterMapping()
   {
      model.removeChildren("filter-mapping");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppDescriptor ElementName: javaee:listenerType ElementType : listener
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>listener</code> element will be created and returned.
    * Otherwise, the first existing <code>listener</code> element will be returned.
    * @return the instance defined for the element <code>listener</code> 
    */
   public ListenerType<WebAppDescriptor> getOrCreateListener()
   {
      List<Node> nodeList = model.get("listener");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ListenerTypeImpl<WebAppDescriptor>(this, "listener", model, nodeList.get(0));
      }
      return createListener();
   }

   /**
    * Creates a new <code>listener</code> element 
    * @return the new created instance of <code>ListenerType<WebAppDescriptor></code> 
    */
   public ListenerType<WebAppDescriptor> createListener()
   {
      return new ListenerTypeImpl<WebAppDescriptor>(this, "listener", model);
   }

   /**
    * Returns all <code>listener</code> elements
    * @return list of <code>listener</code> 
    */
   public List<ListenerType<WebAppDescriptor>> getAllListener()
   {
      List<ListenerType<WebAppDescriptor>> list = new ArrayList<ListenerType<WebAppDescriptor>>();
      List<Node> nodeList = model.get("listener");
      for(Node node: nodeList)
      {
         ListenerType<WebAppDescriptor>  type = new ListenerTypeImpl<WebAppDescriptor>(this, "listener", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>listener</code> elements 
    * @return the current instance of <code>ListenerType<WebAppDescriptor></code> 
    */
   public WebAppDescriptor removeAllListener()
   {
      model.removeChildren("listener");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppDescriptor ElementName: javaee:servletType ElementType : servlet
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>servlet</code> element will be created and returned.
    * Otherwise, the first existing <code>servlet</code> element will be returned.
    * @return the instance defined for the element <code>servlet</code> 
    */
   public ServletType<WebAppDescriptor> getOrCreateServlet()
   {
      List<Node> nodeList = model.get("servlet");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ServletTypeImpl<WebAppDescriptor>(this, "servlet", model, nodeList.get(0));
      }
      return createServlet();
   }

   /**
    * Creates a new <code>servlet</code> element 
    * @return the new created instance of <code>ServletType<WebAppDescriptor></code> 
    */
   public ServletType<WebAppDescriptor> createServlet()
   {
      return new ServletTypeImpl<WebAppDescriptor>(this, "servlet", model);
   }

   /**
    * Returns all <code>servlet</code> elements
    * @return list of <code>servlet</code> 
    */
   public List<ServletType<WebAppDescriptor>> getAllServlet()
   {
      List<ServletType<WebAppDescriptor>> list = new ArrayList<ServletType<WebAppDescriptor>>();
      List<Node> nodeList = model.get("servlet");
      for(Node node: nodeList)
      {
         ServletType<WebAppDescriptor>  type = new ServletTypeImpl<WebAppDescriptor>(this, "servlet", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>servlet</code> elements 
    * @return the current instance of <code>ServletType<WebAppDescriptor></code> 
    */
   public WebAppDescriptor removeAllServlet()
   {
      model.removeChildren("servlet");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppDescriptor ElementName: javaee:servlet-mappingType ElementType : servlet-mapping
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>servlet-mapping</code> element will be created and returned.
    * Otherwise, the first existing <code>servlet-mapping</code> element will be returned.
    * @return the instance defined for the element <code>servlet-mapping</code> 
    */
   public ServletMappingType<WebAppDescriptor> getOrCreateServletMapping()
   {
      List<Node> nodeList = model.get("servlet-mapping");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ServletMappingTypeImpl<WebAppDescriptor>(this, "servlet-mapping", model, nodeList.get(0));
      }
      return createServletMapping();
   }

   /**
    * Creates a new <code>servlet-mapping</code> element 
    * @return the new created instance of <code>ServletMappingType<WebAppDescriptor></code> 
    */
   public ServletMappingType<WebAppDescriptor> createServletMapping()
   {
      return new ServletMappingTypeImpl<WebAppDescriptor>(this, "servlet-mapping", model);
   }

   /**
    * Returns all <code>servlet-mapping</code> elements
    * @return list of <code>servlet-mapping</code> 
    */
   public List<ServletMappingType<WebAppDescriptor>> getAllServletMapping()
   {
      List<ServletMappingType<WebAppDescriptor>> list = new ArrayList<ServletMappingType<WebAppDescriptor>>();
      List<Node> nodeList = model.get("servlet-mapping");
      for(Node node: nodeList)
      {
         ServletMappingType<WebAppDescriptor>  type = new ServletMappingTypeImpl<WebAppDescriptor>(this, "servlet-mapping", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>servlet-mapping</code> elements 
    * @return the current instance of <code>ServletMappingType<WebAppDescriptor></code> 
    */
   public WebAppDescriptor removeAllServletMapping()
   {
      model.removeChildren("servlet-mapping");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppDescriptor ElementName: javaee:session-configType ElementType : session-config
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>session-config</code> element will be created and returned.
    * Otherwise, the first existing <code>session-config</code> element will be returned.
    * @return the instance defined for the element <code>session-config</code> 
    */
   public SessionConfigType<WebAppDescriptor> getOrCreateSessionConfig()
   {
      List<Node> nodeList = model.get("session-config");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new SessionConfigTypeImpl<WebAppDescriptor>(this, "session-config", model, nodeList.get(0));
      }
      return createSessionConfig();
   }

   /**
    * Creates a new <code>session-config</code> element 
    * @return the new created instance of <code>SessionConfigType<WebAppDescriptor></code> 
    */
   public SessionConfigType<WebAppDescriptor> createSessionConfig()
   {
      return new SessionConfigTypeImpl<WebAppDescriptor>(this, "session-config", model);
   }

   /**
    * Returns all <code>session-config</code> elements
    * @return list of <code>session-config</code> 
    */
   public List<SessionConfigType<WebAppDescriptor>> getAllSessionConfig()
   {
      List<SessionConfigType<WebAppDescriptor>> list = new ArrayList<SessionConfigType<WebAppDescriptor>>();
      List<Node> nodeList = model.get("session-config");
      for(Node node: nodeList)
      {
         SessionConfigType<WebAppDescriptor>  type = new SessionConfigTypeImpl<WebAppDescriptor>(this, "session-config", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>session-config</code> elements 
    * @return the current instance of <code>SessionConfigType<WebAppDescriptor></code> 
    */
   public WebAppDescriptor removeAllSessionConfig()
   {
      model.removeChildren("session-config");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppDescriptor ElementName: javaee:mime-mappingType ElementType : mime-mapping
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>mime-mapping</code> element will be created and returned.
    * Otherwise, the first existing <code>mime-mapping</code> element will be returned.
    * @return the instance defined for the element <code>mime-mapping</code> 
    */
   public MimeMappingType<WebAppDescriptor> getOrCreateMimeMapping()
   {
      List<Node> nodeList = model.get("mime-mapping");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new MimeMappingTypeImpl<WebAppDescriptor>(this, "mime-mapping", model, nodeList.get(0));
      }
      return createMimeMapping();
   }

   /**
    * Creates a new <code>mime-mapping</code> element 
    * @return the new created instance of <code>MimeMappingType<WebAppDescriptor></code> 
    */
   public MimeMappingType<WebAppDescriptor> createMimeMapping()
   {
      return new MimeMappingTypeImpl<WebAppDescriptor>(this, "mime-mapping", model);
   }

   /**
    * Returns all <code>mime-mapping</code> elements
    * @return list of <code>mime-mapping</code> 
    */
   public List<MimeMappingType<WebAppDescriptor>> getAllMimeMapping()
   {
      List<MimeMappingType<WebAppDescriptor>> list = new ArrayList<MimeMappingType<WebAppDescriptor>>();
      List<Node> nodeList = model.get("mime-mapping");
      for(Node node: nodeList)
      {
         MimeMappingType<WebAppDescriptor>  type = new MimeMappingTypeImpl<WebAppDescriptor>(this, "mime-mapping", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>mime-mapping</code> elements 
    * @return the current instance of <code>MimeMappingType<WebAppDescriptor></code> 
    */
   public WebAppDescriptor removeAllMimeMapping()
   {
      model.removeChildren("mime-mapping");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppDescriptor ElementName: javaee:welcome-file-listType ElementType : welcome-file-list
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>welcome-file-list</code> element will be created and returned.
    * Otherwise, the first existing <code>welcome-file-list</code> element will be returned.
    * @return the instance defined for the element <code>welcome-file-list</code> 
    */
   public WelcomeFileListType<WebAppDescriptor> getOrCreateWelcomeFileList()
   {
      List<Node> nodeList = model.get("welcome-file-list");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new WelcomeFileListTypeImpl<WebAppDescriptor>(this, "welcome-file-list", model, nodeList.get(0));
      }
      return createWelcomeFileList();
   }

   /**
    * Creates a new <code>welcome-file-list</code> element 
    * @return the new created instance of <code>WelcomeFileListType<WebAppDescriptor></code> 
    */
   public WelcomeFileListType<WebAppDescriptor> createWelcomeFileList()
   {
      return new WelcomeFileListTypeImpl<WebAppDescriptor>(this, "welcome-file-list", model);
   }

   /**
    * Returns all <code>welcome-file-list</code> elements
    * @return list of <code>welcome-file-list</code> 
    */
   public List<WelcomeFileListType<WebAppDescriptor>> getAllWelcomeFileList()
   {
      List<WelcomeFileListType<WebAppDescriptor>> list = new ArrayList<WelcomeFileListType<WebAppDescriptor>>();
      List<Node> nodeList = model.get("welcome-file-list");
      for(Node node: nodeList)
      {
         WelcomeFileListType<WebAppDescriptor>  type = new WelcomeFileListTypeImpl<WebAppDescriptor>(this, "welcome-file-list", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>welcome-file-list</code> elements 
    * @return the current instance of <code>WelcomeFileListType<WebAppDescriptor></code> 
    */
   public WebAppDescriptor removeAllWelcomeFileList()
   {
      model.removeChildren("welcome-file-list");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppDescriptor ElementName: javaee:error-pageType ElementType : error-page
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>error-page</code> element will be created and returned.
    * Otherwise, the first existing <code>error-page</code> element will be returned.
    * @return the instance defined for the element <code>error-page</code> 
    */
   public ErrorPageType<WebAppDescriptor> getOrCreateErrorPage()
   {
      List<Node> nodeList = model.get("error-page");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ErrorPageTypeImpl<WebAppDescriptor>(this, "error-page", model, nodeList.get(0));
      }
      return createErrorPage();
   }

   /**
    * Creates a new <code>error-page</code> element 
    * @return the new created instance of <code>ErrorPageType<WebAppDescriptor></code> 
    */
   public ErrorPageType<WebAppDescriptor> createErrorPage()
   {
      return new ErrorPageTypeImpl<WebAppDescriptor>(this, "error-page", model);
   }

   /**
    * Returns all <code>error-page</code> elements
    * @return list of <code>error-page</code> 
    */
   public List<ErrorPageType<WebAppDescriptor>> getAllErrorPage()
   {
      List<ErrorPageType<WebAppDescriptor>> list = new ArrayList<ErrorPageType<WebAppDescriptor>>();
      List<Node> nodeList = model.get("error-page");
      for(Node node: nodeList)
      {
         ErrorPageType<WebAppDescriptor>  type = new ErrorPageTypeImpl<WebAppDescriptor>(this, "error-page", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>error-page</code> elements 
    * @return the current instance of <code>ErrorPageType<WebAppDescriptor></code> 
    */
   public WebAppDescriptor removeAllErrorPage()
   {
      model.removeChildren("error-page");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppDescriptor ElementName: javaee:jsp-configType ElementType : jsp-config
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>jsp-config</code> element will be created and returned.
    * Otherwise, the first existing <code>jsp-config</code> element will be returned.
    * @return the instance defined for the element <code>jsp-config</code> 
    */
   public JspConfigType<WebAppDescriptor> getOrCreateJspConfig()
   {
      List<Node> nodeList = model.get("jsp-config");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new JspConfigTypeImpl<WebAppDescriptor>(this, "jsp-config", model, nodeList.get(0));
      }
      return createJspConfig();
   }

   /**
    * Creates a new <code>jsp-config</code> element 
    * @return the new created instance of <code>JspConfigType<WebAppDescriptor></code> 
    */
   public JspConfigType<WebAppDescriptor> createJspConfig()
   {
      return new JspConfigTypeImpl<WebAppDescriptor>(this, "jsp-config", model);
   }

   /**
    * Returns all <code>jsp-config</code> elements
    * @return list of <code>jsp-config</code> 
    */
   public List<JspConfigType<WebAppDescriptor>> getAllJspConfig()
   {
      List<JspConfigType<WebAppDescriptor>> list = new ArrayList<JspConfigType<WebAppDescriptor>>();
      List<Node> nodeList = model.get("jsp-config");
      for(Node node: nodeList)
      {
         JspConfigType<WebAppDescriptor>  type = new JspConfigTypeImpl<WebAppDescriptor>(this, "jsp-config", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>jsp-config</code> elements 
    * @return the current instance of <code>JspConfigType<WebAppDescriptor></code> 
    */
   public WebAppDescriptor removeAllJspConfig()
   {
      model.removeChildren("jsp-config");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppDescriptor ElementName: javaee:security-constraintType ElementType : security-constraint
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>security-constraint</code> element will be created and returned.
    * Otherwise, the first existing <code>security-constraint</code> element will be returned.
    * @return the instance defined for the element <code>security-constraint</code> 
    */
   public SecurityConstraintType<WebAppDescriptor> getOrCreateSecurityConstraint()
   {
      List<Node> nodeList = model.get("security-constraint");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new SecurityConstraintTypeImpl<WebAppDescriptor>(this, "security-constraint", model, nodeList.get(0));
      }
      return createSecurityConstraint();
   }

   /**
    * Creates a new <code>security-constraint</code> element 
    * @return the new created instance of <code>SecurityConstraintType<WebAppDescriptor></code> 
    */
   public SecurityConstraintType<WebAppDescriptor> createSecurityConstraint()
   {
      return new SecurityConstraintTypeImpl<WebAppDescriptor>(this, "security-constraint", model);
   }

   /**
    * Returns all <code>security-constraint</code> elements
    * @return list of <code>security-constraint</code> 
    */
   public List<SecurityConstraintType<WebAppDescriptor>> getAllSecurityConstraint()
   {
      List<SecurityConstraintType<WebAppDescriptor>> list = new ArrayList<SecurityConstraintType<WebAppDescriptor>>();
      List<Node> nodeList = model.get("security-constraint");
      for(Node node: nodeList)
      {
         SecurityConstraintType<WebAppDescriptor>  type = new SecurityConstraintTypeImpl<WebAppDescriptor>(this, "security-constraint", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>security-constraint</code> elements 
    * @return the current instance of <code>SecurityConstraintType<WebAppDescriptor></code> 
    */
   public WebAppDescriptor removeAllSecurityConstraint()
   {
      model.removeChildren("security-constraint");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppDescriptor ElementName: javaee:login-configType ElementType : login-config
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>login-config</code> element will be created and returned.
    * Otherwise, the first existing <code>login-config</code> element will be returned.
    * @return the instance defined for the element <code>login-config</code> 
    */
   public LoginConfigType<WebAppDescriptor> getOrCreateLoginConfig()
   {
      List<Node> nodeList = model.get("login-config");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new LoginConfigTypeImpl<WebAppDescriptor>(this, "login-config", model, nodeList.get(0));
      }
      return createLoginConfig();
   }

   /**
    * Creates a new <code>login-config</code> element 
    * @return the new created instance of <code>LoginConfigType<WebAppDescriptor></code> 
    */
   public LoginConfigType<WebAppDescriptor> createLoginConfig()
   {
      return new LoginConfigTypeImpl<WebAppDescriptor>(this, "login-config", model);
   }

   /**
    * Returns all <code>login-config</code> elements
    * @return list of <code>login-config</code> 
    */
   public List<LoginConfigType<WebAppDescriptor>> getAllLoginConfig()
   {
      List<LoginConfigType<WebAppDescriptor>> list = new ArrayList<LoginConfigType<WebAppDescriptor>>();
      List<Node> nodeList = model.get("login-config");
      for(Node node: nodeList)
      {
         LoginConfigType<WebAppDescriptor>  type = new LoginConfigTypeImpl<WebAppDescriptor>(this, "login-config", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>login-config</code> elements 
    * @return the current instance of <code>LoginConfigType<WebAppDescriptor></code> 
    */
   public WebAppDescriptor removeAllLoginConfig()
   {
      model.removeChildren("login-config");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppDescriptor ElementName: javaee:security-roleType ElementType : security-role
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>security-role</code> element will be created and returned.
    * Otherwise, the first existing <code>security-role</code> element will be returned.
    * @return the instance defined for the element <code>security-role</code> 
    */
   public SecurityRoleType<WebAppDescriptor> getOrCreateSecurityRole()
   {
      List<Node> nodeList = model.get("security-role");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new SecurityRoleTypeImpl<WebAppDescriptor>(this, "security-role", model, nodeList.get(0));
      }
      return createSecurityRole();
   }

   /**
    * Creates a new <code>security-role</code> element 
    * @return the new created instance of <code>SecurityRoleType<WebAppDescriptor></code> 
    */
   public SecurityRoleType<WebAppDescriptor> createSecurityRole()
   {
      return new SecurityRoleTypeImpl<WebAppDescriptor>(this, "security-role", model);
   }

   /**
    * Returns all <code>security-role</code> elements
    * @return list of <code>security-role</code> 
    */
   public List<SecurityRoleType<WebAppDescriptor>> getAllSecurityRole()
   {
      List<SecurityRoleType<WebAppDescriptor>> list = new ArrayList<SecurityRoleType<WebAppDescriptor>>();
      List<Node> nodeList = model.get("security-role");
      for(Node node: nodeList)
      {
         SecurityRoleType<WebAppDescriptor>  type = new SecurityRoleTypeImpl<WebAppDescriptor>(this, "security-role", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>security-role</code> elements 
    * @return the current instance of <code>SecurityRoleType<WebAppDescriptor></code> 
    */
   public WebAppDescriptor removeAllSecurityRole()
   {
      model.removeChildren("security-role");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppDescriptor ElementName: javaee:message-destinationType ElementType : message-destination
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>message-destination</code> element will be created and returned.
    * Otherwise, the first existing <code>message-destination</code> element will be returned.
    * @return the instance defined for the element <code>message-destination</code> 
    */
   public MessageDestinationType<WebAppDescriptor> getOrCreateMessageDestination()
   {
      List<Node> nodeList = model.get("message-destination");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new MessageDestinationTypeImpl<WebAppDescriptor>(this, "message-destination", model, nodeList.get(0));
      }
      return createMessageDestination();
   }

   /**
    * Creates a new <code>message-destination</code> element 
    * @return the new created instance of <code>MessageDestinationType<WebAppDescriptor></code> 
    */
   public MessageDestinationType<WebAppDescriptor> createMessageDestination()
   {
      return new MessageDestinationTypeImpl<WebAppDescriptor>(this, "message-destination", model);
   }

   /**
    * Returns all <code>message-destination</code> elements
    * @return list of <code>message-destination</code> 
    */
   public List<MessageDestinationType<WebAppDescriptor>> getAllMessageDestination()
   {
      List<MessageDestinationType<WebAppDescriptor>> list = new ArrayList<MessageDestinationType<WebAppDescriptor>>();
      List<Node> nodeList = model.get("message-destination");
      for(Node node: nodeList)
      {
         MessageDestinationType<WebAppDescriptor>  type = new MessageDestinationTypeImpl<WebAppDescriptor>(this, "message-destination", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>message-destination</code> elements 
    * @return the current instance of <code>MessageDestinationType<WebAppDescriptor></code> 
    */
   public WebAppDescriptor removeAllMessageDestination()
   {
      model.removeChildren("message-destination");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppDescriptor ElementName: javaee:locale-encoding-mapping-listType ElementType : locale-encoding-mapping-list
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>locale-encoding-mapping-list</code> element will be created and returned.
    * Otherwise, the first existing <code>locale-encoding-mapping-list</code> element will be returned.
    * @return the instance defined for the element <code>locale-encoding-mapping-list</code> 
    */
   public LocaleEncodingMappingListType<WebAppDescriptor> getOrCreateLocaleEncodingMappingList()
   {
      List<Node> nodeList = model.get("locale-encoding-mapping-list");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new LocaleEncodingMappingListTypeImpl<WebAppDescriptor>(this, "locale-encoding-mapping-list", model, nodeList.get(0));
      }
      return createLocaleEncodingMappingList();
   }

   /**
    * Creates a new <code>locale-encoding-mapping-list</code> element 
    * @return the new created instance of <code>LocaleEncodingMappingListType<WebAppDescriptor></code> 
    */
   public LocaleEncodingMappingListType<WebAppDescriptor> createLocaleEncodingMappingList()
   {
      return new LocaleEncodingMappingListTypeImpl<WebAppDescriptor>(this, "locale-encoding-mapping-list", model);
   }

   /**
    * Returns all <code>locale-encoding-mapping-list</code> elements
    * @return list of <code>locale-encoding-mapping-list</code> 
    */
   public List<LocaleEncodingMappingListType<WebAppDescriptor>> getAllLocaleEncodingMappingList()
   {
      List<LocaleEncodingMappingListType<WebAppDescriptor>> list = new ArrayList<LocaleEncodingMappingListType<WebAppDescriptor>>();
      List<Node> nodeList = model.get("locale-encoding-mapping-list");
      for(Node node: nodeList)
      {
         LocaleEncodingMappingListType<WebAppDescriptor>  type = new LocaleEncodingMappingListTypeImpl<WebAppDescriptor>(this, "locale-encoding-mapping-list", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>locale-encoding-mapping-list</code> elements 
    * @return the current instance of <code>LocaleEncodingMappingListType<WebAppDescriptor></code> 
    */
   public WebAppDescriptor removeAllLocaleEncodingMappingList()
   {
      model.removeChildren("locale-encoding-mapping-list");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppDescriptor ElementName: javaee:web-app-versionType ElementType : version
   // MaxOccurs: -  isGeneric: false   isAttribute: true isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of <code>WebAppDescriptor</code> 
    */
   public WebAppDescriptor version(WebAppVersionType version)
   {
      model.attribute("version", version);
      return this;
   }

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of <code>WebAppDescriptor</code> 
    */
   public WebAppDescriptor version(String version)
   {
      model.attribute("version", version);
      return this;
   }

   /**
    * Returns the <code>version</code> attribute
    * @return the value defined for the attribute <code>version</code> 
    */
   public WebAppVersionType getVersion()
   {
      return WebAppVersionType.getFromStringValue(model.getAttribute("version"));
   }

   /**
    * Returns the <code>version</code> attribute
    * @return the value found for the element <code>version</code> 
    */
   public String  getVersionAsString()
   {
      return model.getAttribute("version");
   }

   /**
    * Removes the <code>version</code> attribute 
    * @return the current instance of <code>WebAppDescriptor</code> 
    */
   public WebAppDescriptor removeVersion()
   {
      model.removeAttribute("version");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppDescriptor ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: false   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>WebAppDescriptor</code> 
    */
   public WebAppDescriptor id(String id)
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
    * @return the current instance of <code>WebAppDescriptor</code> 
    */
   public WebAppDescriptor removeId()
   {
      model.removeAttribute("id");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppDescriptor ElementName: xsd:boolean ElementType : metadata-complete
   // MaxOccurs: -  isGeneric: false   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>metadata-complete</code> attribute
    * @param metadataComplete the value for the attribute <code>metadata-complete</code> 
    * @return the current instance of <code>WebAppDescriptor</code> 
    */
   public WebAppDescriptor metadataComplete(Boolean metadataComplete)
   {
      model.attribute("metadata-complete", metadataComplete);
      return this;
   }

   /**
    * Returns the <code>metadata-complete</code> attribute
    * @return the value defined for the attribute <code>metadata-complete</code> 
    */
   public Boolean isMetadataComplete()
   {
      return Strings.isTrue(model.getAttribute("metadata-complete"));
   }

   /**
    * Removes the <code>metadata-complete</code> attribute 
    * @return the current instance of <code>WebAppDescriptor</code> 
    */
   public WebAppDescriptor removeMetadataComplete()
   {
      model.removeAttribute("metadata-complete");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppDescriptor ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>WebAppDescriptor</code> 
    */
   public WebAppDescriptor description(String ... values)
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
    * @return the current instance of <code>WebAppDescriptor</code> 
    */
   public WebAppDescriptor removeAllDescription()
   {
      model.removeChildren("description");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppDescriptor ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>WebAppDescriptor</code> 
    */
   public WebAppDescriptor displayName(String ... values)
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
    * @return the current instance of <code>WebAppDescriptor</code> 
    */
   public WebAppDescriptor removeAllDisplayName()
   {
      model.removeChildren("display-name");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppDescriptor ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<WebAppDescriptor> getOrCreateIcon()
   {
      List<Node> nodeList = model.get("icon");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new IconTypeImpl<WebAppDescriptor>(this, "icon", model, nodeList.get(0));
      }
      return createIcon();
   }

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<WebAppDescriptor></code> 
    */
   public IconType<WebAppDescriptor> createIcon()
   {
      return new IconTypeImpl<WebAppDescriptor>(this, "icon", model);
   }

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<WebAppDescriptor>> getAllIcon()
   {
      List<IconType<WebAppDescriptor>> list = new ArrayList<IconType<WebAppDescriptor>>();
      List<Node> nodeList = model.get("icon");
      for(Node node: nodeList)
      {
         IconType<WebAppDescriptor>  type = new IconTypeImpl<WebAppDescriptor>(this, "icon", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<WebAppDescriptor></code> 
    */
   public WebAppDescriptor removeAllIcon()
   {
      model.removeChildren("icon");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppDescriptor ElementName: javaee:env-entryType ElementType : env-entry
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>env-entry</code> element will be created and returned.
    * Otherwise, the first existing <code>env-entry</code> element will be returned.
    * @return the instance defined for the element <code>env-entry</code> 
    */
   public EnvEntryType<WebAppDescriptor> getOrCreateEnvEntry()
   {
      List<Node> nodeList = model.get("env-entry");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new EnvEntryTypeImpl<WebAppDescriptor>(this, "env-entry", model, nodeList.get(0));
      }
      return createEnvEntry();
   }

   /**
    * Creates a new <code>env-entry</code> element 
    * @return the new created instance of <code>EnvEntryType<WebAppDescriptor></code> 
    */
   public EnvEntryType<WebAppDescriptor> createEnvEntry()
   {
      return new EnvEntryTypeImpl<WebAppDescriptor>(this, "env-entry", model);
   }

   /**
    * Returns all <code>env-entry</code> elements
    * @return list of <code>env-entry</code> 
    */
   public List<EnvEntryType<WebAppDescriptor>> getAllEnvEntry()
   {
      List<EnvEntryType<WebAppDescriptor>> list = new ArrayList<EnvEntryType<WebAppDescriptor>>();
      List<Node> nodeList = model.get("env-entry");
      for(Node node: nodeList)
      {
         EnvEntryType<WebAppDescriptor>  type = new EnvEntryTypeImpl<WebAppDescriptor>(this, "env-entry", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>env-entry</code> elements 
    * @return the current instance of <code>EnvEntryType<WebAppDescriptor></code> 
    */
   public WebAppDescriptor removeAllEnvEntry()
   {
      model.removeChildren("env-entry");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppDescriptor ElementName: javaee:ejb-refType ElementType : ejb-ref
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>ejb-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>ejb-ref</code> element will be returned.
    * @return the instance defined for the element <code>ejb-ref</code> 
    */
   public EjbRefType<WebAppDescriptor> getOrCreateEjbRef()
   {
      List<Node> nodeList = model.get("ejb-ref");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new EjbRefTypeImpl<WebAppDescriptor>(this, "ejb-ref", model, nodeList.get(0));
      }
      return createEjbRef();
   }

   /**
    * Creates a new <code>ejb-ref</code> element 
    * @return the new created instance of <code>EjbRefType<WebAppDescriptor></code> 
    */
   public EjbRefType<WebAppDescriptor> createEjbRef()
   {
      return new EjbRefTypeImpl<WebAppDescriptor>(this, "ejb-ref", model);
   }

   /**
    * Returns all <code>ejb-ref</code> elements
    * @return list of <code>ejb-ref</code> 
    */
   public List<EjbRefType<WebAppDescriptor>> getAllEjbRef()
   {
      List<EjbRefType<WebAppDescriptor>> list = new ArrayList<EjbRefType<WebAppDescriptor>>();
      List<Node> nodeList = model.get("ejb-ref");
      for(Node node: nodeList)
      {
         EjbRefType<WebAppDescriptor>  type = new EjbRefTypeImpl<WebAppDescriptor>(this, "ejb-ref", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>ejb-ref</code> elements 
    * @return the current instance of <code>EjbRefType<WebAppDescriptor></code> 
    */
   public WebAppDescriptor removeAllEjbRef()
   {
      model.removeChildren("ejb-ref");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppDescriptor ElementName: javaee:ejb-local-refType ElementType : ejb-local-ref
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>ejb-local-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>ejb-local-ref</code> element will be returned.
    * @return the instance defined for the element <code>ejb-local-ref</code> 
    */
   public EjbLocalRefType<WebAppDescriptor> getOrCreateEjbLocalRef()
   {
      List<Node> nodeList = model.get("ejb-local-ref");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new EjbLocalRefTypeImpl<WebAppDescriptor>(this, "ejb-local-ref", model, nodeList.get(0));
      }
      return createEjbLocalRef();
   }

   /**
    * Creates a new <code>ejb-local-ref</code> element 
    * @return the new created instance of <code>EjbLocalRefType<WebAppDescriptor></code> 
    */
   public EjbLocalRefType<WebAppDescriptor> createEjbLocalRef()
   {
      return new EjbLocalRefTypeImpl<WebAppDescriptor>(this, "ejb-local-ref", model);
   }

   /**
    * Returns all <code>ejb-local-ref</code> elements
    * @return list of <code>ejb-local-ref</code> 
    */
   public List<EjbLocalRefType<WebAppDescriptor>> getAllEjbLocalRef()
   {
      List<EjbLocalRefType<WebAppDescriptor>> list = new ArrayList<EjbLocalRefType<WebAppDescriptor>>();
      List<Node> nodeList = model.get("ejb-local-ref");
      for(Node node: nodeList)
      {
         EjbLocalRefType<WebAppDescriptor>  type = new EjbLocalRefTypeImpl<WebAppDescriptor>(this, "ejb-local-ref", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>ejb-local-ref</code> elements 
    * @return the current instance of <code>EjbLocalRefType<WebAppDescriptor></code> 
    */
   public WebAppDescriptor removeAllEjbLocalRef()
   {
      model.removeChildren("ejb-local-ref");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppDescriptor ElementName: javaee:resource-refType ElementType : resource-ref
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>resource-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>resource-ref</code> element will be returned.
    * @return the instance defined for the element <code>resource-ref</code> 
    */
   public ResourceRefType<WebAppDescriptor> getOrCreateResourceRef()
   {
      List<Node> nodeList = model.get("resource-ref");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ResourceRefTypeImpl<WebAppDescriptor>(this, "resource-ref", model, nodeList.get(0));
      }
      return createResourceRef();
   }

   /**
    * Creates a new <code>resource-ref</code> element 
    * @return the new created instance of <code>ResourceRefType<WebAppDescriptor></code> 
    */
   public ResourceRefType<WebAppDescriptor> createResourceRef()
   {
      return new ResourceRefTypeImpl<WebAppDescriptor>(this, "resource-ref", model);
   }

   /**
    * Returns all <code>resource-ref</code> elements
    * @return list of <code>resource-ref</code> 
    */
   public List<ResourceRefType<WebAppDescriptor>> getAllResourceRef()
   {
      List<ResourceRefType<WebAppDescriptor>> list = new ArrayList<ResourceRefType<WebAppDescriptor>>();
      List<Node> nodeList = model.get("resource-ref");
      for(Node node: nodeList)
      {
         ResourceRefType<WebAppDescriptor>  type = new ResourceRefTypeImpl<WebAppDescriptor>(this, "resource-ref", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>resource-ref</code> elements 
    * @return the current instance of <code>ResourceRefType<WebAppDescriptor></code> 
    */
   public WebAppDescriptor removeAllResourceRef()
   {
      model.removeChildren("resource-ref");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppDescriptor ElementName: javaee:resource-env-refType ElementType : resource-env-ref
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>resource-env-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>resource-env-ref</code> element will be returned.
    * @return the instance defined for the element <code>resource-env-ref</code> 
    */
   public ResourceEnvRefType<WebAppDescriptor> getOrCreateResourceEnvRef()
   {
      List<Node> nodeList = model.get("resource-env-ref");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ResourceEnvRefTypeImpl<WebAppDescriptor>(this, "resource-env-ref", model, nodeList.get(0));
      }
      return createResourceEnvRef();
   }

   /**
    * Creates a new <code>resource-env-ref</code> element 
    * @return the new created instance of <code>ResourceEnvRefType<WebAppDescriptor></code> 
    */
   public ResourceEnvRefType<WebAppDescriptor> createResourceEnvRef()
   {
      return new ResourceEnvRefTypeImpl<WebAppDescriptor>(this, "resource-env-ref", model);
   }

   /**
    * Returns all <code>resource-env-ref</code> elements
    * @return list of <code>resource-env-ref</code> 
    */
   public List<ResourceEnvRefType<WebAppDescriptor>> getAllResourceEnvRef()
   {
      List<ResourceEnvRefType<WebAppDescriptor>> list = new ArrayList<ResourceEnvRefType<WebAppDescriptor>>();
      List<Node> nodeList = model.get("resource-env-ref");
      for(Node node: nodeList)
      {
         ResourceEnvRefType<WebAppDescriptor>  type = new ResourceEnvRefTypeImpl<WebAppDescriptor>(this, "resource-env-ref", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>resource-env-ref</code> elements 
    * @return the current instance of <code>ResourceEnvRefType<WebAppDescriptor></code> 
    */
   public WebAppDescriptor removeAllResourceEnvRef()
   {
      model.removeChildren("resource-env-ref");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppDescriptor ElementName: javaee:message-destination-refType ElementType : message-destination-ref
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>message-destination-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>message-destination-ref</code> element will be returned.
    * @return the instance defined for the element <code>message-destination-ref</code> 
    */
   public MessageDestinationRefType<WebAppDescriptor> getOrCreateMessageDestinationRef()
   {
      List<Node> nodeList = model.get("message-destination-ref");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new MessageDestinationRefTypeImpl<WebAppDescriptor>(this, "message-destination-ref", model, nodeList.get(0));
      }
      return createMessageDestinationRef();
   }

   /**
    * Creates a new <code>message-destination-ref</code> element 
    * @return the new created instance of <code>MessageDestinationRefType<WebAppDescriptor></code> 
    */
   public MessageDestinationRefType<WebAppDescriptor> createMessageDestinationRef()
   {
      return new MessageDestinationRefTypeImpl<WebAppDescriptor>(this, "message-destination-ref", model);
   }

   /**
    * Returns all <code>message-destination-ref</code> elements
    * @return list of <code>message-destination-ref</code> 
    */
   public List<MessageDestinationRefType<WebAppDescriptor>> getAllMessageDestinationRef()
   {
      List<MessageDestinationRefType<WebAppDescriptor>> list = new ArrayList<MessageDestinationRefType<WebAppDescriptor>>();
      List<Node> nodeList = model.get("message-destination-ref");
      for(Node node: nodeList)
      {
         MessageDestinationRefType<WebAppDescriptor>  type = new MessageDestinationRefTypeImpl<WebAppDescriptor>(this, "message-destination-ref", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>message-destination-ref</code> elements 
    * @return the current instance of <code>MessageDestinationRefType<WebAppDescriptor></code> 
    */
   public WebAppDescriptor removeAllMessageDestinationRef()
   {
      model.removeChildren("message-destination-ref");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppDescriptor ElementName: javaee:persistence-context-refType ElementType : persistence-context-ref
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>persistence-context-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>persistence-context-ref</code> element will be returned.
    * @return the instance defined for the element <code>persistence-context-ref</code> 
    */
   public PersistenceContextRefType<WebAppDescriptor> getOrCreatePersistenceContextRef()
   {
      List<Node> nodeList = model.get("persistence-context-ref");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new PersistenceContextRefTypeImpl<WebAppDescriptor>(this, "persistence-context-ref", model, nodeList.get(0));
      }
      return createPersistenceContextRef();
   }

   /**
    * Creates a new <code>persistence-context-ref</code> element 
    * @return the new created instance of <code>PersistenceContextRefType<WebAppDescriptor></code> 
    */
   public PersistenceContextRefType<WebAppDescriptor> createPersistenceContextRef()
   {
      return new PersistenceContextRefTypeImpl<WebAppDescriptor>(this, "persistence-context-ref", model);
   }

   /**
    * Returns all <code>persistence-context-ref</code> elements
    * @return list of <code>persistence-context-ref</code> 
    */
   public List<PersistenceContextRefType<WebAppDescriptor>> getAllPersistenceContextRef()
   {
      List<PersistenceContextRefType<WebAppDescriptor>> list = new ArrayList<PersistenceContextRefType<WebAppDescriptor>>();
      List<Node> nodeList = model.get("persistence-context-ref");
      for(Node node: nodeList)
      {
         PersistenceContextRefType<WebAppDescriptor>  type = new PersistenceContextRefTypeImpl<WebAppDescriptor>(this, "persistence-context-ref", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>persistence-context-ref</code> elements 
    * @return the current instance of <code>PersistenceContextRefType<WebAppDescriptor></code> 
    */
   public WebAppDescriptor removeAllPersistenceContextRef()
   {
      model.removeChildren("persistence-context-ref");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppDescriptor ElementName: javaee:persistence-unit-refType ElementType : persistence-unit-ref
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>persistence-unit-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>persistence-unit-ref</code> element will be returned.
    * @return the instance defined for the element <code>persistence-unit-ref</code> 
    */
   public PersistenceUnitRefType<WebAppDescriptor> getOrCreatePersistenceUnitRef()
   {
      List<Node> nodeList = model.get("persistence-unit-ref");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new PersistenceUnitRefTypeImpl<WebAppDescriptor>(this, "persistence-unit-ref", model, nodeList.get(0));
      }
      return createPersistenceUnitRef();
   }

   /**
    * Creates a new <code>persistence-unit-ref</code> element 
    * @return the new created instance of <code>PersistenceUnitRefType<WebAppDescriptor></code> 
    */
   public PersistenceUnitRefType<WebAppDescriptor> createPersistenceUnitRef()
   {
      return new PersistenceUnitRefTypeImpl<WebAppDescriptor>(this, "persistence-unit-ref", model);
   }

   /**
    * Returns all <code>persistence-unit-ref</code> elements
    * @return list of <code>persistence-unit-ref</code> 
    */
   public List<PersistenceUnitRefType<WebAppDescriptor>> getAllPersistenceUnitRef()
   {
      List<PersistenceUnitRefType<WebAppDescriptor>> list = new ArrayList<PersistenceUnitRefType<WebAppDescriptor>>();
      List<Node> nodeList = model.get("persistence-unit-ref");
      for(Node node: nodeList)
      {
         PersistenceUnitRefType<WebAppDescriptor>  type = new PersistenceUnitRefTypeImpl<WebAppDescriptor>(this, "persistence-unit-ref", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>persistence-unit-ref</code> elements 
    * @return the current instance of <code>PersistenceUnitRefType<WebAppDescriptor></code> 
    */
   public WebAppDescriptor removeAllPersistenceUnitRef()
   {
      model.removeChildren("persistence-unit-ref");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppDescriptor ElementName: javaee:lifecycle-callbackType ElementType : post-construct
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>post-construct</code> element will be created and returned.
    * Otherwise, the first existing <code>post-construct</code> element will be returned.
    * @return the instance defined for the element <code>post-construct</code> 
    */
   public LifecycleCallbackType<WebAppDescriptor> getOrCreatePostConstruct()
   {
      List<Node> nodeList = model.get("post-construct");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new LifecycleCallbackTypeImpl<WebAppDescriptor>(this, "post-construct", model, nodeList.get(0));
      }
      return createPostConstruct();
   }

   /**
    * Creates a new <code>post-construct</code> element 
    * @return the new created instance of <code>LifecycleCallbackType<WebAppDescriptor></code> 
    */
   public LifecycleCallbackType<WebAppDescriptor> createPostConstruct()
   {
      return new LifecycleCallbackTypeImpl<WebAppDescriptor>(this, "post-construct", model);
   }

   /**
    * Returns all <code>post-construct</code> elements
    * @return list of <code>post-construct</code> 
    */
   public List<LifecycleCallbackType<WebAppDescriptor>> getAllPostConstruct()
   {
      List<LifecycleCallbackType<WebAppDescriptor>> list = new ArrayList<LifecycleCallbackType<WebAppDescriptor>>();
      List<Node> nodeList = model.get("post-construct");
      for(Node node: nodeList)
      {
         LifecycleCallbackType<WebAppDescriptor>  type = new LifecycleCallbackTypeImpl<WebAppDescriptor>(this, "post-construct", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>post-construct</code> elements 
    * @return the current instance of <code>LifecycleCallbackType<WebAppDescriptor></code> 
    */
   public WebAppDescriptor removeAllPostConstruct()
   {
      model.removeChildren("post-construct");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppDescriptor ElementName: javaee:lifecycle-callbackType ElementType : pre-destroy
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>pre-destroy</code> element will be created and returned.
    * Otherwise, the first existing <code>pre-destroy</code> element will be returned.
    * @return the instance defined for the element <code>pre-destroy</code> 
    */
   public LifecycleCallbackType<WebAppDescriptor> getOrCreatePreDestroy()
   {
      List<Node> nodeList = model.get("pre-destroy");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new LifecycleCallbackTypeImpl<WebAppDescriptor>(this, "pre-destroy", model, nodeList.get(0));
      }
      return createPreDestroy();
   }

   /**
    * Creates a new <code>pre-destroy</code> element 
    * @return the new created instance of <code>LifecycleCallbackType<WebAppDescriptor></code> 
    */
   public LifecycleCallbackType<WebAppDescriptor> createPreDestroy()
   {
      return new LifecycleCallbackTypeImpl<WebAppDescriptor>(this, "pre-destroy", model);
   }

   /**
    * Returns all <code>pre-destroy</code> elements
    * @return list of <code>pre-destroy</code> 
    */
   public List<LifecycleCallbackType<WebAppDescriptor>> getAllPreDestroy()
   {
      List<LifecycleCallbackType<WebAppDescriptor>> list = new ArrayList<LifecycleCallbackType<WebAppDescriptor>>();
      List<Node> nodeList = model.get("pre-destroy");
      for(Node node: nodeList)
      {
         LifecycleCallbackType<WebAppDescriptor>  type = new LifecycleCallbackTypeImpl<WebAppDescriptor>(this, "pre-destroy", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>pre-destroy</code> elements 
    * @return the current instance of <code>LifecycleCallbackType<WebAppDescriptor></code> 
    */
   public WebAppDescriptor removeAllPreDestroy()
   {
      model.removeChildren("pre-destroy");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppDescriptor ElementName: javaee:service-refType ElementType : service-ref
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>service-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>service-ref</code> element will be returned.
    * @return the instance defined for the element <code>service-ref</code> 
    */
   public ServiceRefType<WebAppDescriptor> getOrCreateServiceRef()
   {
      List<Node> nodeList = model.get("service-ref");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ServiceRefTypeImpl<WebAppDescriptor>(this, "service-ref", model, nodeList.get(0));
      }
      return createServiceRef();
   }

   /**
    * Creates a new <code>service-ref</code> element 
    * @return the new created instance of <code>ServiceRefType<WebAppDescriptor></code> 
    */
   public ServiceRefType<WebAppDescriptor> createServiceRef()
   {
      return new ServiceRefTypeImpl<WebAppDescriptor>(this, "service-ref", model);
   }

   /**
    * Returns all <code>service-ref</code> elements
    * @return list of <code>service-ref</code> 
    */
   public List<ServiceRefType<WebAppDescriptor>> getAllServiceRef()
   {
      List<ServiceRefType<WebAppDescriptor>> list = new ArrayList<ServiceRefType<WebAppDescriptor>>();
      List<Node> nodeList = model.get("service-ref");
      for(Node node: nodeList)
      {
         ServiceRefType<WebAppDescriptor>  type = new ServiceRefTypeImpl<WebAppDescriptor>(this, "service-ref", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>service-ref</code> elements 
    * @return the current instance of <code>ServiceRefType<WebAppDescriptor></code> 
    */
   public WebAppDescriptor removeAllServiceRef()
   {
      model.removeChildren("service-ref");
      return this;
   }

}
