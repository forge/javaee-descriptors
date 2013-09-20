package org.jboss.shrinkwrap.descriptor.impl.webfragment30; 

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

import org.jboss.shrinkwrap.descriptor.api.DescriptorNamespace;
import org.jboss.shrinkwrap.descriptor.api.javaee6.DataSourceType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EjbLocalRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EjbRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EnvEntryType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.LifecycleCallbackType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ListenerType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.MessageDestinationRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.MessageDestinationType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ParamValueType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.PersistenceContextRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.PersistenceUnitRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ResourceEnvRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ResourceRefType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.SecurityRoleType;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient13.ServiceRefType;
import org.jboss.shrinkwrap.descriptor.api.jsp22.JspConfigType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.ErrorPageType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.FilterMappingType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.FilterType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.LocaleEncodingMappingListType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.LoginConfigType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.MimeMappingType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.OrderingType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.SecurityConstraintType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.ServletMappingType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.ServletType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.SessionConfigType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.WebAppVersionType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.WelcomeFileListType;
import org.jboss.shrinkwrap.descriptor.api.webfragment30.WebFragmentDescriptor;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.DataSourceTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.EjbLocalRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.EjbRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.EnvEntryTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.IconTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.LifecycleCallbackTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.ListenerTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.MessageDestinationRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.MessageDestinationTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.ParamValueTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.PersistenceContextRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.PersistenceUnitRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.ResourceEnvRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.ResourceRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.SecurityRoleTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.javaeewebservicesclient13.ServiceRefTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.jsp22.JspConfigTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.webcommon30.ErrorPageTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.webcommon30.FilterMappingTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.webcommon30.FilterTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.webcommon30.LocaleEncodingMappingListTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.webcommon30.LoginConfigTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.webcommon30.MimeMappingTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.webcommon30.OrderingTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.webcommon30.SecurityConstraintTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.webcommon30.ServletMappingTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.webcommon30.ServletTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.webcommon30.SessionConfigTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.webcommon30.WelcomeFileListTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.spi.node.NodeDescriptorImplBase;

/** 
 * <p> 
 * This deployment descriptor provides the functionalities as described in the  specification
 * <p> 
 * Example:
 * <p> 
 * <code> 
 *     WebFragmentDescriptor descriptor = Descriptors.create(WebFragmentDescriptor.class);
 * </code> 
 *
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class WebFragmentDescriptorImpl extends NodeDescriptorImplBase implements DescriptorNamespace<WebFragmentDescriptor>, WebFragmentDescriptor
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private Node model;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public WebFragmentDescriptorImpl(String descriptorName)
   {
       this(descriptorName, new Node("web-fragment"));
   }

   public WebFragmentDescriptorImpl(String descriptorName, Node node)
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
    * @return the current instance of <code>WebFragmentDescriptor</code> 
    */
   public WebFragmentDescriptor addDefaultNamespaces()
   {
      addNamespace("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
      addNamespace("xsi:schemaLocation", "http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-fragment_3_0.xsd");
      addNamespace("xmlns", "http://java.sun.com/xml/ns/javaee");
     return this;
   }

   /**
    * Adds a new namespace 
    * @return the current instance of <code>WebFragmentDescriptor</code> 
    */
   public WebFragmentDescriptor addNamespace(String name, String value)
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
    * @return the current instance of <code>WebFragmentDescriptor</code> 
    */
   public WebFragmentDescriptor removeAllNamespaces()
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
   // ClassName: WebFragmentDescriptor ElementName: xsd:token ElementType : name
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>name</code> elements, 
    * a new <code>name</code> element 
    * @param values list of <code>name</code> objects 
    * @return the current instance of <code>WebFragmentDescriptor</code> 
    */
   public WebFragmentDescriptor name(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            model.createChild("name").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>name</code> elements
    * @return list of <code>name</code> 
    */
public List<String> getAllName()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = model.get("name");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>name</code> element 
    * @return the current instance of <code>WebFragmentDescriptor</code> 
    */
   public WebFragmentDescriptor removeAllName()
   {
      model.removeChildren("name");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentDescriptor ElementName: javaee:orderingType ElementType : ordering
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>ordering</code> element will be created and returned.
    * Otherwise, the first existing <code>ordering</code> element will be returned.
    * @return the instance defined for the element <code>ordering</code> 
    */
   public OrderingType<WebFragmentDescriptor> getOrCreateOrdering()
   {
      List<Node> nodeList = model.get("ordering");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new OrderingTypeImpl<WebFragmentDescriptor>(this, "ordering", model, nodeList.get(0));
      }
      return createOrdering();
   }

   /**
    * Creates a new <code>ordering</code> element 
    * @return the new created instance of <code>OrderingType<WebFragmentDescriptor></code> 
    */
   public OrderingType<WebFragmentDescriptor> createOrdering()
   {
      return new OrderingTypeImpl<WebFragmentDescriptor>(this, "ordering", model);
   }

   /**
    * Returns all <code>ordering</code> elements
    * @return list of <code>ordering</code> 
    */
   public List<OrderingType<WebFragmentDescriptor>> getAllOrdering()
   {
      List<OrderingType<WebFragmentDescriptor>> list = new ArrayList<OrderingType<WebFragmentDescriptor>>();
      List<Node> nodeList = model.get("ordering");
      for(Node node: nodeList)
      {
         OrderingType<WebFragmentDescriptor>  type = new OrderingTypeImpl<WebFragmentDescriptor>(this, "ordering", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>ordering</code> elements 
    * @return the current instance of <code>OrderingType<WebFragmentDescriptor></code> 
    */
   public WebFragmentDescriptor removeAllOrdering()
   {
      model.removeChildren("ordering");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentDescriptor ElementName: javaee:emptyType ElementType : distributable
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>distributable</code> element 
    * @return the current instance of <code>WebFragmentDescriptor</code> 
    */
   public WebFragmentDescriptor distributable()
   {
      model.getOrCreate("distributable");
      return this;
   }

   /**
    * Removes the <code>distributable</code> element 
    * @return the current instance of <code>WebFragmentDescriptor</code> 
    */
   public Boolean isDistributable()
   {
      return model.getSingle("distributable") != null;
   }

   /**
    * Removes the <code>distributable</code> element 
    * @return the current instance of <code>WebFragmentDescriptor</code> 
    */
   public WebFragmentDescriptor removeDistributable()
   {
      model.removeChild("distributable");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentDescriptor ElementName: javaee:param-valueType ElementType : context-param
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>context-param</code> element will be created and returned.
    * Otherwise, the first existing <code>context-param</code> element will be returned.
    * @return the instance defined for the element <code>context-param</code> 
    */
   public ParamValueType<WebFragmentDescriptor> getOrCreateContextParam()
   {
      List<Node> nodeList = model.get("context-param");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ParamValueTypeImpl<WebFragmentDescriptor>(this, "context-param", model, nodeList.get(0));
      }
      return createContextParam();
   }

   /**
    * Creates a new <code>context-param</code> element 
    * @return the new created instance of <code>ParamValueType<WebFragmentDescriptor></code> 
    */
   public ParamValueType<WebFragmentDescriptor> createContextParam()
   {
      return new ParamValueTypeImpl<WebFragmentDescriptor>(this, "context-param", model);
   }

   /**
    * Returns all <code>context-param</code> elements
    * @return list of <code>context-param</code> 
    */
   public List<ParamValueType<WebFragmentDescriptor>> getAllContextParam()
   {
      List<ParamValueType<WebFragmentDescriptor>> list = new ArrayList<ParamValueType<WebFragmentDescriptor>>();
      List<Node> nodeList = model.get("context-param");
      for(Node node: nodeList)
      {
         ParamValueType<WebFragmentDescriptor>  type = new ParamValueTypeImpl<WebFragmentDescriptor>(this, "context-param", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>context-param</code> elements 
    * @return the current instance of <code>ParamValueType<WebFragmentDescriptor></code> 
    */
   public WebFragmentDescriptor removeAllContextParam()
   {
      model.removeChildren("context-param");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentDescriptor ElementName: javaee:filterType ElementType : filter
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>filter</code> element will be created and returned.
    * Otherwise, the first existing <code>filter</code> element will be returned.
    * @return the instance defined for the element <code>filter</code> 
    */
   public FilterType<WebFragmentDescriptor> getOrCreateFilter()
   {
      List<Node> nodeList = model.get("filter");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new FilterTypeImpl<WebFragmentDescriptor>(this, "filter", model, nodeList.get(0));
      }
      return createFilter();
   }

   /**
    * Creates a new <code>filter</code> element 
    * @return the new created instance of <code>FilterType<WebFragmentDescriptor></code> 
    */
   public FilterType<WebFragmentDescriptor> createFilter()
   {
      return new FilterTypeImpl<WebFragmentDescriptor>(this, "filter", model);
   }

   /**
    * Returns all <code>filter</code> elements
    * @return list of <code>filter</code> 
    */
   public List<FilterType<WebFragmentDescriptor>> getAllFilter()
   {
      List<FilterType<WebFragmentDescriptor>> list = new ArrayList<FilterType<WebFragmentDescriptor>>();
      List<Node> nodeList = model.get("filter");
      for(Node node: nodeList)
      {
         FilterType<WebFragmentDescriptor>  type = new FilterTypeImpl<WebFragmentDescriptor>(this, "filter", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>filter</code> elements 
    * @return the current instance of <code>FilterType<WebFragmentDescriptor></code> 
    */
   public WebFragmentDescriptor removeAllFilter()
   {
      model.removeChildren("filter");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentDescriptor ElementName: javaee:filter-mappingType ElementType : filter-mapping
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>filter-mapping</code> element will be created and returned.
    * Otherwise, the first existing <code>filter-mapping</code> element will be returned.
    * @return the instance defined for the element <code>filter-mapping</code> 
    */
   public FilterMappingType<WebFragmentDescriptor> getOrCreateFilterMapping()
   {
      List<Node> nodeList = model.get("filter-mapping");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new FilterMappingTypeImpl<WebFragmentDescriptor>(this, "filter-mapping", model, nodeList.get(0));
      }
      return createFilterMapping();
   }

   /**
    * Creates a new <code>filter-mapping</code> element 
    * @return the new created instance of <code>FilterMappingType<WebFragmentDescriptor></code> 
    */
   public FilterMappingType<WebFragmentDescriptor> createFilterMapping()
   {
      return new FilterMappingTypeImpl<WebFragmentDescriptor>(this, "filter-mapping", model);
   }

   /**
    * Returns all <code>filter-mapping</code> elements
    * @return list of <code>filter-mapping</code> 
    */
   public List<FilterMappingType<WebFragmentDescriptor>> getAllFilterMapping()
   {
      List<FilterMappingType<WebFragmentDescriptor>> list = new ArrayList<FilterMappingType<WebFragmentDescriptor>>();
      List<Node> nodeList = model.get("filter-mapping");
      for(Node node: nodeList)
      {
         FilterMappingType<WebFragmentDescriptor>  type = new FilterMappingTypeImpl<WebFragmentDescriptor>(this, "filter-mapping", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>filter-mapping</code> elements 
    * @return the current instance of <code>FilterMappingType<WebFragmentDescriptor></code> 
    */
   public WebFragmentDescriptor removeAllFilterMapping()
   {
      model.removeChildren("filter-mapping");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentDescriptor ElementName: javaee:listenerType ElementType : listener
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>listener</code> element will be created and returned.
    * Otherwise, the first existing <code>listener</code> element will be returned.
    * @return the instance defined for the element <code>listener</code> 
    */
   public ListenerType<WebFragmentDescriptor> getOrCreateListener()
   {
      List<Node> nodeList = model.get("listener");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ListenerTypeImpl<WebFragmentDescriptor>(this, "listener", model, nodeList.get(0));
      }
      return createListener();
   }

   /**
    * Creates a new <code>listener</code> element 
    * @return the new created instance of <code>ListenerType<WebFragmentDescriptor></code> 
    */
   public ListenerType<WebFragmentDescriptor> createListener()
   {
      return new ListenerTypeImpl<WebFragmentDescriptor>(this, "listener", model);
   }

   /**
    * Returns all <code>listener</code> elements
    * @return list of <code>listener</code> 
    */
   public List<ListenerType<WebFragmentDescriptor>> getAllListener()
   {
      List<ListenerType<WebFragmentDescriptor>> list = new ArrayList<ListenerType<WebFragmentDescriptor>>();
      List<Node> nodeList = model.get("listener");
      for(Node node: nodeList)
      {
         ListenerType<WebFragmentDescriptor>  type = new ListenerTypeImpl<WebFragmentDescriptor>(this, "listener", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>listener</code> elements 
    * @return the current instance of <code>ListenerType<WebFragmentDescriptor></code> 
    */
   public WebFragmentDescriptor removeAllListener()
   {
      model.removeChildren("listener");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentDescriptor ElementName: javaee:servletType ElementType : servlet
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>servlet</code> element will be created and returned.
    * Otherwise, the first existing <code>servlet</code> element will be returned.
    * @return the instance defined for the element <code>servlet</code> 
    */
   public ServletType<WebFragmentDescriptor> getOrCreateServlet()
   {
      List<Node> nodeList = model.get("servlet");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ServletTypeImpl<WebFragmentDescriptor>(this, "servlet", model, nodeList.get(0));
      }
      return createServlet();
   }

   /**
    * Creates a new <code>servlet</code> element 
    * @return the new created instance of <code>ServletType<WebFragmentDescriptor></code> 
    */
   public ServletType<WebFragmentDescriptor> createServlet()
   {
      return new ServletTypeImpl<WebFragmentDescriptor>(this, "servlet", model);
   }

   /**
    * Returns all <code>servlet</code> elements
    * @return list of <code>servlet</code> 
    */
   public List<ServletType<WebFragmentDescriptor>> getAllServlet()
   {
      List<ServletType<WebFragmentDescriptor>> list = new ArrayList<ServletType<WebFragmentDescriptor>>();
      List<Node> nodeList = model.get("servlet");
      for(Node node: nodeList)
      {
         ServletType<WebFragmentDescriptor>  type = new ServletTypeImpl<WebFragmentDescriptor>(this, "servlet", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>servlet</code> elements 
    * @return the current instance of <code>ServletType<WebFragmentDescriptor></code> 
    */
   public WebFragmentDescriptor removeAllServlet()
   {
      model.removeChildren("servlet");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentDescriptor ElementName: javaee:servlet-mappingType ElementType : servlet-mapping
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>servlet-mapping</code> element will be created and returned.
    * Otherwise, the first existing <code>servlet-mapping</code> element will be returned.
    * @return the instance defined for the element <code>servlet-mapping</code> 
    */
   public ServletMappingType<WebFragmentDescriptor> getOrCreateServletMapping()
   {
      List<Node> nodeList = model.get("servlet-mapping");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ServletMappingTypeImpl<WebFragmentDescriptor>(this, "servlet-mapping", model, nodeList.get(0));
      }
      return createServletMapping();
   }

   /**
    * Creates a new <code>servlet-mapping</code> element 
    * @return the new created instance of <code>ServletMappingType<WebFragmentDescriptor></code> 
    */
   public ServletMappingType<WebFragmentDescriptor> createServletMapping()
   {
      return new ServletMappingTypeImpl<WebFragmentDescriptor>(this, "servlet-mapping", model);
   }

   /**
    * Returns all <code>servlet-mapping</code> elements
    * @return list of <code>servlet-mapping</code> 
    */
   public List<ServletMappingType<WebFragmentDescriptor>> getAllServletMapping()
   {
      List<ServletMappingType<WebFragmentDescriptor>> list = new ArrayList<ServletMappingType<WebFragmentDescriptor>>();
      List<Node> nodeList = model.get("servlet-mapping");
      for(Node node: nodeList)
      {
         ServletMappingType<WebFragmentDescriptor>  type = new ServletMappingTypeImpl<WebFragmentDescriptor>(this, "servlet-mapping", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>servlet-mapping</code> elements 
    * @return the current instance of <code>ServletMappingType<WebFragmentDescriptor></code> 
    */
   public WebFragmentDescriptor removeAllServletMapping()
   {
      model.removeChildren("servlet-mapping");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentDescriptor ElementName: javaee:session-configType ElementType : session-config
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>session-config</code> element will be created and returned.
    * Otherwise, the first existing <code>session-config</code> element will be returned.
    * @return the instance defined for the element <code>session-config</code> 
    */
   public SessionConfigType<WebFragmentDescriptor> getOrCreateSessionConfig()
   {
      List<Node> nodeList = model.get("session-config");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new SessionConfigTypeImpl<WebFragmentDescriptor>(this, "session-config", model, nodeList.get(0));
      }
      return createSessionConfig();
   }

   /**
    * Creates a new <code>session-config</code> element 
    * @return the new created instance of <code>SessionConfigType<WebFragmentDescriptor></code> 
    */
   public SessionConfigType<WebFragmentDescriptor> createSessionConfig()
   {
      return new SessionConfigTypeImpl<WebFragmentDescriptor>(this, "session-config", model);
   }

   /**
    * Returns all <code>session-config</code> elements
    * @return list of <code>session-config</code> 
    */
   public List<SessionConfigType<WebFragmentDescriptor>> getAllSessionConfig()
   {
      List<SessionConfigType<WebFragmentDescriptor>> list = new ArrayList<SessionConfigType<WebFragmentDescriptor>>();
      List<Node> nodeList = model.get("session-config");
      for(Node node: nodeList)
      {
         SessionConfigType<WebFragmentDescriptor>  type = new SessionConfigTypeImpl<WebFragmentDescriptor>(this, "session-config", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>session-config</code> elements 
    * @return the current instance of <code>SessionConfigType<WebFragmentDescriptor></code> 
    */
   public WebFragmentDescriptor removeAllSessionConfig()
   {
      model.removeChildren("session-config");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentDescriptor ElementName: javaee:mime-mappingType ElementType : mime-mapping
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>mime-mapping</code> element will be created and returned.
    * Otherwise, the first existing <code>mime-mapping</code> element will be returned.
    * @return the instance defined for the element <code>mime-mapping</code> 
    */
   public MimeMappingType<WebFragmentDescriptor> getOrCreateMimeMapping()
   {
      List<Node> nodeList = model.get("mime-mapping");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new MimeMappingTypeImpl<WebFragmentDescriptor>(this, "mime-mapping", model, nodeList.get(0));
      }
      return createMimeMapping();
   }

   /**
    * Creates a new <code>mime-mapping</code> element 
    * @return the new created instance of <code>MimeMappingType<WebFragmentDescriptor></code> 
    */
   public MimeMappingType<WebFragmentDescriptor> createMimeMapping()
   {
      return new MimeMappingTypeImpl<WebFragmentDescriptor>(this, "mime-mapping", model);
   }

   /**
    * Returns all <code>mime-mapping</code> elements
    * @return list of <code>mime-mapping</code> 
    */
   public List<MimeMappingType<WebFragmentDescriptor>> getAllMimeMapping()
   {
      List<MimeMappingType<WebFragmentDescriptor>> list = new ArrayList<MimeMappingType<WebFragmentDescriptor>>();
      List<Node> nodeList = model.get("mime-mapping");
      for(Node node: nodeList)
      {
         MimeMappingType<WebFragmentDescriptor>  type = new MimeMappingTypeImpl<WebFragmentDescriptor>(this, "mime-mapping", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>mime-mapping</code> elements 
    * @return the current instance of <code>MimeMappingType<WebFragmentDescriptor></code> 
    */
   public WebFragmentDescriptor removeAllMimeMapping()
   {
      model.removeChildren("mime-mapping");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentDescriptor ElementName: javaee:welcome-file-listType ElementType : welcome-file-list
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>welcome-file-list</code> element will be created and returned.
    * Otherwise, the first existing <code>welcome-file-list</code> element will be returned.
    * @return the instance defined for the element <code>welcome-file-list</code> 
    */
   public WelcomeFileListType<WebFragmentDescriptor> getOrCreateWelcomeFileList()
   {
      List<Node> nodeList = model.get("welcome-file-list");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new WelcomeFileListTypeImpl<WebFragmentDescriptor>(this, "welcome-file-list", model, nodeList.get(0));
      }
      return createWelcomeFileList();
   }

   /**
    * Creates a new <code>welcome-file-list</code> element 
    * @return the new created instance of <code>WelcomeFileListType<WebFragmentDescriptor></code> 
    */
   public WelcomeFileListType<WebFragmentDescriptor> createWelcomeFileList()
   {
      return new WelcomeFileListTypeImpl<WebFragmentDescriptor>(this, "welcome-file-list", model);
   }

   /**
    * Returns all <code>welcome-file-list</code> elements
    * @return list of <code>welcome-file-list</code> 
    */
   public List<WelcomeFileListType<WebFragmentDescriptor>> getAllWelcomeFileList()
   {
      List<WelcomeFileListType<WebFragmentDescriptor>> list = new ArrayList<WelcomeFileListType<WebFragmentDescriptor>>();
      List<Node> nodeList = model.get("welcome-file-list");
      for(Node node: nodeList)
      {
         WelcomeFileListType<WebFragmentDescriptor>  type = new WelcomeFileListTypeImpl<WebFragmentDescriptor>(this, "welcome-file-list", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>welcome-file-list</code> elements 
    * @return the current instance of <code>WelcomeFileListType<WebFragmentDescriptor></code> 
    */
   public WebFragmentDescriptor removeAllWelcomeFileList()
   {
      model.removeChildren("welcome-file-list");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentDescriptor ElementName: javaee:error-pageType ElementType : error-page
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>error-page</code> element will be created and returned.
    * Otherwise, the first existing <code>error-page</code> element will be returned.
    * @return the instance defined for the element <code>error-page</code> 
    */
   public ErrorPageType<WebFragmentDescriptor> getOrCreateErrorPage()
   {
      List<Node> nodeList = model.get("error-page");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ErrorPageTypeImpl<WebFragmentDescriptor>(this, "error-page", model, nodeList.get(0));
      }
      return createErrorPage();
   }

   /**
    * Creates a new <code>error-page</code> element 
    * @return the new created instance of <code>ErrorPageType<WebFragmentDescriptor></code> 
    */
   public ErrorPageType<WebFragmentDescriptor> createErrorPage()
   {
      return new ErrorPageTypeImpl<WebFragmentDescriptor>(this, "error-page", model);
   }

   /**
    * Returns all <code>error-page</code> elements
    * @return list of <code>error-page</code> 
    */
   public List<ErrorPageType<WebFragmentDescriptor>> getAllErrorPage()
   {
      List<ErrorPageType<WebFragmentDescriptor>> list = new ArrayList<ErrorPageType<WebFragmentDescriptor>>();
      List<Node> nodeList = model.get("error-page");
      for(Node node: nodeList)
      {
         ErrorPageType<WebFragmentDescriptor>  type = new ErrorPageTypeImpl<WebFragmentDescriptor>(this, "error-page", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>error-page</code> elements 
    * @return the current instance of <code>ErrorPageType<WebFragmentDescriptor></code> 
    */
   public WebFragmentDescriptor removeAllErrorPage()
   {
      model.removeChildren("error-page");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentDescriptor ElementName: javaee:jsp-configType ElementType : jsp-config
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>jsp-config</code> element will be created and returned.
    * Otherwise, the first existing <code>jsp-config</code> element will be returned.
    * @return the instance defined for the element <code>jsp-config</code> 
    */
   public JspConfigType<WebFragmentDescriptor> getOrCreateJspConfig()
   {
      List<Node> nodeList = model.get("jsp-config");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new JspConfigTypeImpl<WebFragmentDescriptor>(this, "jsp-config", model, nodeList.get(0));
      }
      return createJspConfig();
   }

   /**
    * Creates a new <code>jsp-config</code> element 
    * @return the new created instance of <code>JspConfigType<WebFragmentDescriptor></code> 
    */
   public JspConfigType<WebFragmentDescriptor> createJspConfig()
   {
      return new JspConfigTypeImpl<WebFragmentDescriptor>(this, "jsp-config", model);
   }

   /**
    * Returns all <code>jsp-config</code> elements
    * @return list of <code>jsp-config</code> 
    */
   public List<JspConfigType<WebFragmentDescriptor>> getAllJspConfig()
   {
      List<JspConfigType<WebFragmentDescriptor>> list = new ArrayList<JspConfigType<WebFragmentDescriptor>>();
      List<Node> nodeList = model.get("jsp-config");
      for(Node node: nodeList)
      {
         JspConfigType<WebFragmentDescriptor>  type = new JspConfigTypeImpl<WebFragmentDescriptor>(this, "jsp-config", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>jsp-config</code> elements 
    * @return the current instance of <code>JspConfigType<WebFragmentDescriptor></code> 
    */
   public WebFragmentDescriptor removeAllJspConfig()
   {
      model.removeChildren("jsp-config");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentDescriptor ElementName: javaee:security-constraintType ElementType : security-constraint
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>security-constraint</code> element will be created and returned.
    * Otherwise, the first existing <code>security-constraint</code> element will be returned.
    * @return the instance defined for the element <code>security-constraint</code> 
    */
   public SecurityConstraintType<WebFragmentDescriptor> getOrCreateSecurityConstraint()
   {
      List<Node> nodeList = model.get("security-constraint");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new SecurityConstraintTypeImpl<WebFragmentDescriptor>(this, "security-constraint", model, nodeList.get(0));
      }
      return createSecurityConstraint();
   }

   /**
    * Creates a new <code>security-constraint</code> element 
    * @return the new created instance of <code>SecurityConstraintType<WebFragmentDescriptor></code> 
    */
   public SecurityConstraintType<WebFragmentDescriptor> createSecurityConstraint()
   {
      return new SecurityConstraintTypeImpl<WebFragmentDescriptor>(this, "security-constraint", model);
   }

   /**
    * Returns all <code>security-constraint</code> elements
    * @return list of <code>security-constraint</code> 
    */
   public List<SecurityConstraintType<WebFragmentDescriptor>> getAllSecurityConstraint()
   {
      List<SecurityConstraintType<WebFragmentDescriptor>> list = new ArrayList<SecurityConstraintType<WebFragmentDescriptor>>();
      List<Node> nodeList = model.get("security-constraint");
      for(Node node: nodeList)
      {
         SecurityConstraintType<WebFragmentDescriptor>  type = new SecurityConstraintTypeImpl<WebFragmentDescriptor>(this, "security-constraint", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>security-constraint</code> elements 
    * @return the current instance of <code>SecurityConstraintType<WebFragmentDescriptor></code> 
    */
   public WebFragmentDescriptor removeAllSecurityConstraint()
   {
      model.removeChildren("security-constraint");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentDescriptor ElementName: javaee:login-configType ElementType : login-config
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>login-config</code> element will be created and returned.
    * Otherwise, the first existing <code>login-config</code> element will be returned.
    * @return the instance defined for the element <code>login-config</code> 
    */
   public LoginConfigType<WebFragmentDescriptor> getOrCreateLoginConfig()
   {
      List<Node> nodeList = model.get("login-config");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new LoginConfigTypeImpl<WebFragmentDescriptor>(this, "login-config", model, nodeList.get(0));
      }
      return createLoginConfig();
   }

   /**
    * Creates a new <code>login-config</code> element 
    * @return the new created instance of <code>LoginConfigType<WebFragmentDescriptor></code> 
    */
   public LoginConfigType<WebFragmentDescriptor> createLoginConfig()
   {
      return new LoginConfigTypeImpl<WebFragmentDescriptor>(this, "login-config", model);
   }

   /**
    * Returns all <code>login-config</code> elements
    * @return list of <code>login-config</code> 
    */
   public List<LoginConfigType<WebFragmentDescriptor>> getAllLoginConfig()
   {
      List<LoginConfigType<WebFragmentDescriptor>> list = new ArrayList<LoginConfigType<WebFragmentDescriptor>>();
      List<Node> nodeList = model.get("login-config");
      for(Node node: nodeList)
      {
         LoginConfigType<WebFragmentDescriptor>  type = new LoginConfigTypeImpl<WebFragmentDescriptor>(this, "login-config", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>login-config</code> elements 
    * @return the current instance of <code>LoginConfigType<WebFragmentDescriptor></code> 
    */
   public WebFragmentDescriptor removeAllLoginConfig()
   {
      model.removeChildren("login-config");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentDescriptor ElementName: javaee:security-roleType ElementType : security-role
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>security-role</code> element will be created and returned.
    * Otherwise, the first existing <code>security-role</code> element will be returned.
    * @return the instance defined for the element <code>security-role</code> 
    */
   public SecurityRoleType<WebFragmentDescriptor> getOrCreateSecurityRole()
   {
      List<Node> nodeList = model.get("security-role");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new SecurityRoleTypeImpl<WebFragmentDescriptor>(this, "security-role", model, nodeList.get(0));
      }
      return createSecurityRole();
   }

   /**
    * Creates a new <code>security-role</code> element 
    * @return the new created instance of <code>SecurityRoleType<WebFragmentDescriptor></code> 
    */
   public SecurityRoleType<WebFragmentDescriptor> createSecurityRole()
   {
      return new SecurityRoleTypeImpl<WebFragmentDescriptor>(this, "security-role", model);
   }

   /**
    * Returns all <code>security-role</code> elements
    * @return list of <code>security-role</code> 
    */
   public List<SecurityRoleType<WebFragmentDescriptor>> getAllSecurityRole()
   {
      List<SecurityRoleType<WebFragmentDescriptor>> list = new ArrayList<SecurityRoleType<WebFragmentDescriptor>>();
      List<Node> nodeList = model.get("security-role");
      for(Node node: nodeList)
      {
         SecurityRoleType<WebFragmentDescriptor>  type = new SecurityRoleTypeImpl<WebFragmentDescriptor>(this, "security-role", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>security-role</code> elements 
    * @return the current instance of <code>SecurityRoleType<WebFragmentDescriptor></code> 
    */
   public WebFragmentDescriptor removeAllSecurityRole()
   {
      model.removeChildren("security-role");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentDescriptor ElementName: javaee:message-destinationType ElementType : message-destination
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>message-destination</code> element will be created and returned.
    * Otherwise, the first existing <code>message-destination</code> element will be returned.
    * @return the instance defined for the element <code>message-destination</code> 
    */
   public MessageDestinationType<WebFragmentDescriptor> getOrCreateMessageDestination()
   {
      List<Node> nodeList = model.get("message-destination");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new MessageDestinationTypeImpl<WebFragmentDescriptor>(this, "message-destination", model, nodeList.get(0));
      }
      return createMessageDestination();
   }

   /**
    * Creates a new <code>message-destination</code> element 
    * @return the new created instance of <code>MessageDestinationType<WebFragmentDescriptor></code> 
    */
   public MessageDestinationType<WebFragmentDescriptor> createMessageDestination()
   {
      return new MessageDestinationTypeImpl<WebFragmentDescriptor>(this, "message-destination", model);
   }

   /**
    * Returns all <code>message-destination</code> elements
    * @return list of <code>message-destination</code> 
    */
   public List<MessageDestinationType<WebFragmentDescriptor>> getAllMessageDestination()
   {
      List<MessageDestinationType<WebFragmentDescriptor>> list = new ArrayList<MessageDestinationType<WebFragmentDescriptor>>();
      List<Node> nodeList = model.get("message-destination");
      for(Node node: nodeList)
      {
         MessageDestinationType<WebFragmentDescriptor>  type = new MessageDestinationTypeImpl<WebFragmentDescriptor>(this, "message-destination", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>message-destination</code> elements 
    * @return the current instance of <code>MessageDestinationType<WebFragmentDescriptor></code> 
    */
   public WebFragmentDescriptor removeAllMessageDestination()
   {
      model.removeChildren("message-destination");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentDescriptor ElementName: javaee:locale-encoding-mapping-listType ElementType : locale-encoding-mapping-list
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>locale-encoding-mapping-list</code> element will be created and returned.
    * Otherwise, the first existing <code>locale-encoding-mapping-list</code> element will be returned.
    * @return the instance defined for the element <code>locale-encoding-mapping-list</code> 
    */
   public LocaleEncodingMappingListType<WebFragmentDescriptor> getOrCreateLocaleEncodingMappingList()
   {
      List<Node> nodeList = model.get("locale-encoding-mapping-list");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new LocaleEncodingMappingListTypeImpl<WebFragmentDescriptor>(this, "locale-encoding-mapping-list", model, nodeList.get(0));
      }
      return createLocaleEncodingMappingList();
   }

   /**
    * Creates a new <code>locale-encoding-mapping-list</code> element 
    * @return the new created instance of <code>LocaleEncodingMappingListType<WebFragmentDescriptor></code> 
    */
   public LocaleEncodingMappingListType<WebFragmentDescriptor> createLocaleEncodingMappingList()
   {
      return new LocaleEncodingMappingListTypeImpl<WebFragmentDescriptor>(this, "locale-encoding-mapping-list", model);
   }

   /**
    * Returns all <code>locale-encoding-mapping-list</code> elements
    * @return list of <code>locale-encoding-mapping-list</code> 
    */
   public List<LocaleEncodingMappingListType<WebFragmentDescriptor>> getAllLocaleEncodingMappingList()
   {
      List<LocaleEncodingMappingListType<WebFragmentDescriptor>> list = new ArrayList<LocaleEncodingMappingListType<WebFragmentDescriptor>>();
      List<Node> nodeList = model.get("locale-encoding-mapping-list");
      for(Node node: nodeList)
      {
         LocaleEncodingMappingListType<WebFragmentDescriptor>  type = new LocaleEncodingMappingListTypeImpl<WebFragmentDescriptor>(this, "locale-encoding-mapping-list", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>locale-encoding-mapping-list</code> elements 
    * @return the current instance of <code>LocaleEncodingMappingListType<WebFragmentDescriptor></code> 
    */
   public WebFragmentDescriptor removeAllLocaleEncodingMappingList()
   {
      model.removeChildren("locale-encoding-mapping-list");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentDescriptor ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>WebFragmentDescriptor</code> 
    */
   public WebFragmentDescriptor description(String ... values)
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
    * @return the current instance of <code>WebFragmentDescriptor</code> 
    */
   public WebFragmentDescriptor removeAllDescription()
   {
      model.removeChildren("description");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentDescriptor ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>WebFragmentDescriptor</code> 
    */
   public WebFragmentDescriptor displayName(String ... values)
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
    * @return the current instance of <code>WebFragmentDescriptor</code> 
    */
   public WebFragmentDescriptor removeAllDisplayName()
   {
      model.removeChildren("display-name");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentDescriptor ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<WebFragmentDescriptor> getOrCreateIcon()
   {
      List<Node> nodeList = model.get("icon");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new IconTypeImpl<WebFragmentDescriptor>(this, "icon", model, nodeList.get(0));
      }
      return createIcon();
   }

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<WebFragmentDescriptor></code> 
    */
   public IconType<WebFragmentDescriptor> createIcon()
   {
      return new IconTypeImpl<WebFragmentDescriptor>(this, "icon", model);
   }

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<WebFragmentDescriptor>> getAllIcon()
   {
      List<IconType<WebFragmentDescriptor>> list = new ArrayList<IconType<WebFragmentDescriptor>>();
      List<Node> nodeList = model.get("icon");
      for(Node node: nodeList)
      {
         IconType<WebFragmentDescriptor>  type = new IconTypeImpl<WebFragmentDescriptor>(this, "icon", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<WebFragmentDescriptor></code> 
    */
   public WebFragmentDescriptor removeAllIcon()
   {
      model.removeChildren("icon");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentDescriptor ElementName: javaee:env-entryType ElementType : env-entry
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>env-entry</code> element will be created and returned.
    * Otherwise, the first existing <code>env-entry</code> element will be returned.
    * @return the instance defined for the element <code>env-entry</code> 
    */
   public EnvEntryType<WebFragmentDescriptor> getOrCreateEnvEntry()
   {
      List<Node> nodeList = model.get("env-entry");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new EnvEntryTypeImpl<WebFragmentDescriptor>(this, "env-entry", model, nodeList.get(0));
      }
      return createEnvEntry();
   }

   /**
    * Creates a new <code>env-entry</code> element 
    * @return the new created instance of <code>EnvEntryType<WebFragmentDescriptor></code> 
    */
   public EnvEntryType<WebFragmentDescriptor> createEnvEntry()
   {
      return new EnvEntryTypeImpl<WebFragmentDescriptor>(this, "env-entry", model);
   }

   /**
    * Returns all <code>env-entry</code> elements
    * @return list of <code>env-entry</code> 
    */
   public List<EnvEntryType<WebFragmentDescriptor>> getAllEnvEntry()
   {
      List<EnvEntryType<WebFragmentDescriptor>> list = new ArrayList<EnvEntryType<WebFragmentDescriptor>>();
      List<Node> nodeList = model.get("env-entry");
      for(Node node: nodeList)
      {
         EnvEntryType<WebFragmentDescriptor>  type = new EnvEntryTypeImpl<WebFragmentDescriptor>(this, "env-entry", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>env-entry</code> elements 
    * @return the current instance of <code>EnvEntryType<WebFragmentDescriptor></code> 
    */
   public WebFragmentDescriptor removeAllEnvEntry()
   {
      model.removeChildren("env-entry");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentDescriptor ElementName: javaee:ejb-refType ElementType : ejb-ref
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>ejb-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>ejb-ref</code> element will be returned.
    * @return the instance defined for the element <code>ejb-ref</code> 
    */
   public EjbRefType<WebFragmentDescriptor> getOrCreateEjbRef()
   {
      List<Node> nodeList = model.get("ejb-ref");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new EjbRefTypeImpl<WebFragmentDescriptor>(this, "ejb-ref", model, nodeList.get(0));
      }
      return createEjbRef();
   }

   /**
    * Creates a new <code>ejb-ref</code> element 
    * @return the new created instance of <code>EjbRefType<WebFragmentDescriptor></code> 
    */
   public EjbRefType<WebFragmentDescriptor> createEjbRef()
   {
      return new EjbRefTypeImpl<WebFragmentDescriptor>(this, "ejb-ref", model);
   }

   /**
    * Returns all <code>ejb-ref</code> elements
    * @return list of <code>ejb-ref</code> 
    */
   public List<EjbRefType<WebFragmentDescriptor>> getAllEjbRef()
   {
      List<EjbRefType<WebFragmentDescriptor>> list = new ArrayList<EjbRefType<WebFragmentDescriptor>>();
      List<Node> nodeList = model.get("ejb-ref");
      for(Node node: nodeList)
      {
         EjbRefType<WebFragmentDescriptor>  type = new EjbRefTypeImpl<WebFragmentDescriptor>(this, "ejb-ref", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>ejb-ref</code> elements 
    * @return the current instance of <code>EjbRefType<WebFragmentDescriptor></code> 
    */
   public WebFragmentDescriptor removeAllEjbRef()
   {
      model.removeChildren("ejb-ref");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentDescriptor ElementName: javaee:ejb-local-refType ElementType : ejb-local-ref
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>ejb-local-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>ejb-local-ref</code> element will be returned.
    * @return the instance defined for the element <code>ejb-local-ref</code> 
    */
   public EjbLocalRefType<WebFragmentDescriptor> getOrCreateEjbLocalRef()
   {
      List<Node> nodeList = model.get("ejb-local-ref");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new EjbLocalRefTypeImpl<WebFragmentDescriptor>(this, "ejb-local-ref", model, nodeList.get(0));
      }
      return createEjbLocalRef();
   }

   /**
    * Creates a new <code>ejb-local-ref</code> element 
    * @return the new created instance of <code>EjbLocalRefType<WebFragmentDescriptor></code> 
    */
   public EjbLocalRefType<WebFragmentDescriptor> createEjbLocalRef()
   {
      return new EjbLocalRefTypeImpl<WebFragmentDescriptor>(this, "ejb-local-ref", model);
   }

   /**
    * Returns all <code>ejb-local-ref</code> elements
    * @return list of <code>ejb-local-ref</code> 
    */
   public List<EjbLocalRefType<WebFragmentDescriptor>> getAllEjbLocalRef()
   {
      List<EjbLocalRefType<WebFragmentDescriptor>> list = new ArrayList<EjbLocalRefType<WebFragmentDescriptor>>();
      List<Node> nodeList = model.get("ejb-local-ref");
      for(Node node: nodeList)
      {
         EjbLocalRefType<WebFragmentDescriptor>  type = new EjbLocalRefTypeImpl<WebFragmentDescriptor>(this, "ejb-local-ref", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>ejb-local-ref</code> elements 
    * @return the current instance of <code>EjbLocalRefType<WebFragmentDescriptor></code> 
    */
   public WebFragmentDescriptor removeAllEjbLocalRef()
   {
      model.removeChildren("ejb-local-ref");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentDescriptor ElementName: javaee:resource-refType ElementType : resource-ref
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>resource-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>resource-ref</code> element will be returned.
    * @return the instance defined for the element <code>resource-ref</code> 
    */
   public ResourceRefType<WebFragmentDescriptor> getOrCreateResourceRef()
   {
      List<Node> nodeList = model.get("resource-ref");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ResourceRefTypeImpl<WebFragmentDescriptor>(this, "resource-ref", model, nodeList.get(0));
      }
      return createResourceRef();
   }

   /**
    * Creates a new <code>resource-ref</code> element 
    * @return the new created instance of <code>ResourceRefType<WebFragmentDescriptor></code> 
    */
   public ResourceRefType<WebFragmentDescriptor> createResourceRef()
   {
      return new ResourceRefTypeImpl<WebFragmentDescriptor>(this, "resource-ref", model);
   }

   /**
    * Returns all <code>resource-ref</code> elements
    * @return list of <code>resource-ref</code> 
    */
   public List<ResourceRefType<WebFragmentDescriptor>> getAllResourceRef()
   {
      List<ResourceRefType<WebFragmentDescriptor>> list = new ArrayList<ResourceRefType<WebFragmentDescriptor>>();
      List<Node> nodeList = model.get("resource-ref");
      for(Node node: nodeList)
      {
         ResourceRefType<WebFragmentDescriptor>  type = new ResourceRefTypeImpl<WebFragmentDescriptor>(this, "resource-ref", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>resource-ref</code> elements 
    * @return the current instance of <code>ResourceRefType<WebFragmentDescriptor></code> 
    */
   public WebFragmentDescriptor removeAllResourceRef()
   {
      model.removeChildren("resource-ref");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentDescriptor ElementName: javaee:resource-env-refType ElementType : resource-env-ref
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>resource-env-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>resource-env-ref</code> element will be returned.
    * @return the instance defined for the element <code>resource-env-ref</code> 
    */
   public ResourceEnvRefType<WebFragmentDescriptor> getOrCreateResourceEnvRef()
   {
      List<Node> nodeList = model.get("resource-env-ref");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ResourceEnvRefTypeImpl<WebFragmentDescriptor>(this, "resource-env-ref", model, nodeList.get(0));
      }
      return createResourceEnvRef();
   }

   /**
    * Creates a new <code>resource-env-ref</code> element 
    * @return the new created instance of <code>ResourceEnvRefType<WebFragmentDescriptor></code> 
    */
   public ResourceEnvRefType<WebFragmentDescriptor> createResourceEnvRef()
   {
      return new ResourceEnvRefTypeImpl<WebFragmentDescriptor>(this, "resource-env-ref", model);
   }

   /**
    * Returns all <code>resource-env-ref</code> elements
    * @return list of <code>resource-env-ref</code> 
    */
   public List<ResourceEnvRefType<WebFragmentDescriptor>> getAllResourceEnvRef()
   {
      List<ResourceEnvRefType<WebFragmentDescriptor>> list = new ArrayList<ResourceEnvRefType<WebFragmentDescriptor>>();
      List<Node> nodeList = model.get("resource-env-ref");
      for(Node node: nodeList)
      {
         ResourceEnvRefType<WebFragmentDescriptor>  type = new ResourceEnvRefTypeImpl<WebFragmentDescriptor>(this, "resource-env-ref", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>resource-env-ref</code> elements 
    * @return the current instance of <code>ResourceEnvRefType<WebFragmentDescriptor></code> 
    */
   public WebFragmentDescriptor removeAllResourceEnvRef()
   {
      model.removeChildren("resource-env-ref");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentDescriptor ElementName: javaee:message-destination-refType ElementType : message-destination-ref
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>message-destination-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>message-destination-ref</code> element will be returned.
    * @return the instance defined for the element <code>message-destination-ref</code> 
    */
   public MessageDestinationRefType<WebFragmentDescriptor> getOrCreateMessageDestinationRef()
   {
      List<Node> nodeList = model.get("message-destination-ref");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new MessageDestinationRefTypeImpl<WebFragmentDescriptor>(this, "message-destination-ref", model, nodeList.get(0));
      }
      return createMessageDestinationRef();
   }

   /**
    * Creates a new <code>message-destination-ref</code> element 
    * @return the new created instance of <code>MessageDestinationRefType<WebFragmentDescriptor></code> 
    */
   public MessageDestinationRefType<WebFragmentDescriptor> createMessageDestinationRef()
   {
      return new MessageDestinationRefTypeImpl<WebFragmentDescriptor>(this, "message-destination-ref", model);
   }

   /**
    * Returns all <code>message-destination-ref</code> elements
    * @return list of <code>message-destination-ref</code> 
    */
   public List<MessageDestinationRefType<WebFragmentDescriptor>> getAllMessageDestinationRef()
   {
      List<MessageDestinationRefType<WebFragmentDescriptor>> list = new ArrayList<MessageDestinationRefType<WebFragmentDescriptor>>();
      List<Node> nodeList = model.get("message-destination-ref");
      for(Node node: nodeList)
      {
         MessageDestinationRefType<WebFragmentDescriptor>  type = new MessageDestinationRefTypeImpl<WebFragmentDescriptor>(this, "message-destination-ref", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>message-destination-ref</code> elements 
    * @return the current instance of <code>MessageDestinationRefType<WebFragmentDescriptor></code> 
    */
   public WebFragmentDescriptor removeAllMessageDestinationRef()
   {
      model.removeChildren("message-destination-ref");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentDescriptor ElementName: javaee:persistence-context-refType ElementType : persistence-context-ref
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>persistence-context-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>persistence-context-ref</code> element will be returned.
    * @return the instance defined for the element <code>persistence-context-ref</code> 
    */
   public PersistenceContextRefType<WebFragmentDescriptor> getOrCreatePersistenceContextRef()
   {
      List<Node> nodeList = model.get("persistence-context-ref");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new PersistenceContextRefTypeImpl<WebFragmentDescriptor>(this, "persistence-context-ref", model, nodeList.get(0));
      }
      return createPersistenceContextRef();
   }

   /**
    * Creates a new <code>persistence-context-ref</code> element 
    * @return the new created instance of <code>PersistenceContextRefType<WebFragmentDescriptor></code> 
    */
   public PersistenceContextRefType<WebFragmentDescriptor> createPersistenceContextRef()
   {
      return new PersistenceContextRefTypeImpl<WebFragmentDescriptor>(this, "persistence-context-ref", model);
   }

   /**
    * Returns all <code>persistence-context-ref</code> elements
    * @return list of <code>persistence-context-ref</code> 
    */
   public List<PersistenceContextRefType<WebFragmentDescriptor>> getAllPersistenceContextRef()
   {
      List<PersistenceContextRefType<WebFragmentDescriptor>> list = new ArrayList<PersistenceContextRefType<WebFragmentDescriptor>>();
      List<Node> nodeList = model.get("persistence-context-ref");
      for(Node node: nodeList)
      {
         PersistenceContextRefType<WebFragmentDescriptor>  type = new PersistenceContextRefTypeImpl<WebFragmentDescriptor>(this, "persistence-context-ref", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>persistence-context-ref</code> elements 
    * @return the current instance of <code>PersistenceContextRefType<WebFragmentDescriptor></code> 
    */
   public WebFragmentDescriptor removeAllPersistenceContextRef()
   {
      model.removeChildren("persistence-context-ref");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentDescriptor ElementName: javaee:persistence-unit-refType ElementType : persistence-unit-ref
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>persistence-unit-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>persistence-unit-ref</code> element will be returned.
    * @return the instance defined for the element <code>persistence-unit-ref</code> 
    */
   public PersistenceUnitRefType<WebFragmentDescriptor> getOrCreatePersistenceUnitRef()
   {
      List<Node> nodeList = model.get("persistence-unit-ref");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new PersistenceUnitRefTypeImpl<WebFragmentDescriptor>(this, "persistence-unit-ref", model, nodeList.get(0));
      }
      return createPersistenceUnitRef();
   }

   /**
    * Creates a new <code>persistence-unit-ref</code> element 
    * @return the new created instance of <code>PersistenceUnitRefType<WebFragmentDescriptor></code> 
    */
   public PersistenceUnitRefType<WebFragmentDescriptor> createPersistenceUnitRef()
   {
      return new PersistenceUnitRefTypeImpl<WebFragmentDescriptor>(this, "persistence-unit-ref", model);
   }

   /**
    * Returns all <code>persistence-unit-ref</code> elements
    * @return list of <code>persistence-unit-ref</code> 
    */
   public List<PersistenceUnitRefType<WebFragmentDescriptor>> getAllPersistenceUnitRef()
   {
      List<PersistenceUnitRefType<WebFragmentDescriptor>> list = new ArrayList<PersistenceUnitRefType<WebFragmentDescriptor>>();
      List<Node> nodeList = model.get("persistence-unit-ref");
      for(Node node: nodeList)
      {
         PersistenceUnitRefType<WebFragmentDescriptor>  type = new PersistenceUnitRefTypeImpl<WebFragmentDescriptor>(this, "persistence-unit-ref", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>persistence-unit-ref</code> elements 
    * @return the current instance of <code>PersistenceUnitRefType<WebFragmentDescriptor></code> 
    */
   public WebFragmentDescriptor removeAllPersistenceUnitRef()
   {
      model.removeChildren("persistence-unit-ref");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentDescriptor ElementName: javaee:lifecycle-callbackType ElementType : post-construct
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>post-construct</code> element will be created and returned.
    * Otherwise, the first existing <code>post-construct</code> element will be returned.
    * @return the instance defined for the element <code>post-construct</code> 
    */
   public LifecycleCallbackType<WebFragmentDescriptor> getOrCreatePostConstruct()
   {
      List<Node> nodeList = model.get("post-construct");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new LifecycleCallbackTypeImpl<WebFragmentDescriptor>(this, "post-construct", model, nodeList.get(0));
      }
      return createPostConstruct();
   }

   /**
    * Creates a new <code>post-construct</code> element 
    * @return the new created instance of <code>LifecycleCallbackType<WebFragmentDescriptor></code> 
    */
   public LifecycleCallbackType<WebFragmentDescriptor> createPostConstruct()
   {
      return new LifecycleCallbackTypeImpl<WebFragmentDescriptor>(this, "post-construct", model);
   }

   /**
    * Returns all <code>post-construct</code> elements
    * @return list of <code>post-construct</code> 
    */
   public List<LifecycleCallbackType<WebFragmentDescriptor>> getAllPostConstruct()
   {
      List<LifecycleCallbackType<WebFragmentDescriptor>> list = new ArrayList<LifecycleCallbackType<WebFragmentDescriptor>>();
      List<Node> nodeList = model.get("post-construct");
      for(Node node: nodeList)
      {
         LifecycleCallbackType<WebFragmentDescriptor>  type = new LifecycleCallbackTypeImpl<WebFragmentDescriptor>(this, "post-construct", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>post-construct</code> elements 
    * @return the current instance of <code>LifecycleCallbackType<WebFragmentDescriptor></code> 
    */
   public WebFragmentDescriptor removeAllPostConstruct()
   {
      model.removeChildren("post-construct");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentDescriptor ElementName: javaee:lifecycle-callbackType ElementType : pre-destroy
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>pre-destroy</code> element will be created and returned.
    * Otherwise, the first existing <code>pre-destroy</code> element will be returned.
    * @return the instance defined for the element <code>pre-destroy</code> 
    */
   public LifecycleCallbackType<WebFragmentDescriptor> getOrCreatePreDestroy()
   {
      List<Node> nodeList = model.get("pre-destroy");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new LifecycleCallbackTypeImpl<WebFragmentDescriptor>(this, "pre-destroy", model, nodeList.get(0));
      }
      return createPreDestroy();
   }

   /**
    * Creates a new <code>pre-destroy</code> element 
    * @return the new created instance of <code>LifecycleCallbackType<WebFragmentDescriptor></code> 
    */
   public LifecycleCallbackType<WebFragmentDescriptor> createPreDestroy()
   {
      return new LifecycleCallbackTypeImpl<WebFragmentDescriptor>(this, "pre-destroy", model);
   }

   /**
    * Returns all <code>pre-destroy</code> elements
    * @return list of <code>pre-destroy</code> 
    */
   public List<LifecycleCallbackType<WebFragmentDescriptor>> getAllPreDestroy()
   {
      List<LifecycleCallbackType<WebFragmentDescriptor>> list = new ArrayList<LifecycleCallbackType<WebFragmentDescriptor>>();
      List<Node> nodeList = model.get("pre-destroy");
      for(Node node: nodeList)
      {
         LifecycleCallbackType<WebFragmentDescriptor>  type = new LifecycleCallbackTypeImpl<WebFragmentDescriptor>(this, "pre-destroy", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>pre-destroy</code> elements 
    * @return the current instance of <code>LifecycleCallbackType<WebFragmentDescriptor></code> 
    */
   public WebFragmentDescriptor removeAllPreDestroy()
   {
      model.removeChildren("pre-destroy");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentDescriptor ElementName: javaee:data-sourceType ElementType : data-source
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>data-source</code> element will be created and returned.
    * Otherwise, the first existing <code>data-source</code> element will be returned.
    * @return the instance defined for the element <code>data-source</code> 
    */
   public DataSourceType<WebFragmentDescriptor> getOrCreateDataSource()
   {
      List<Node> nodeList = model.get("data-source");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new DataSourceTypeImpl<WebFragmentDescriptor>(this, "data-source", model, nodeList.get(0));
      }
      return createDataSource();
   }

   /**
    * Creates a new <code>data-source</code> element 
    * @return the new created instance of <code>DataSourceType<WebFragmentDescriptor></code> 
    */
   public DataSourceType<WebFragmentDescriptor> createDataSource()
   {
      return new DataSourceTypeImpl<WebFragmentDescriptor>(this, "data-source", model);
   }

   /**
    * Returns all <code>data-source</code> elements
    * @return list of <code>data-source</code> 
    */
   public List<DataSourceType<WebFragmentDescriptor>> getAllDataSource()
   {
      List<DataSourceType<WebFragmentDescriptor>> list = new ArrayList<DataSourceType<WebFragmentDescriptor>>();
      List<Node> nodeList = model.get("data-source");
      for(Node node: nodeList)
      {
         DataSourceType<WebFragmentDescriptor>  type = new DataSourceTypeImpl<WebFragmentDescriptor>(this, "data-source", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>data-source</code> elements 
    * @return the current instance of <code>DataSourceType<WebFragmentDescriptor></code> 
    */
   public WebFragmentDescriptor removeAllDataSource()
   {
      model.removeChildren("data-source");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentDescriptor ElementName: javaee:service-refType ElementType : service-ref
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>service-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>service-ref</code> element will be returned.
    * @return the instance defined for the element <code>service-ref</code> 
    */
   public ServiceRefType<WebFragmentDescriptor> getOrCreateServiceRef()
   {
      List<Node> nodeList = model.get("service-ref");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ServiceRefTypeImpl<WebFragmentDescriptor>(this, "service-ref", model, nodeList.get(0));
      }
      return createServiceRef();
   }

   /**
    * Creates a new <code>service-ref</code> element 
    * @return the new created instance of <code>ServiceRefType<WebFragmentDescriptor></code> 
    */
   public ServiceRefType<WebFragmentDescriptor> createServiceRef()
   {
      return new ServiceRefTypeImpl<WebFragmentDescriptor>(this, "service-ref", model);
   }

   /**
    * Returns all <code>service-ref</code> elements
    * @return list of <code>service-ref</code> 
    */
   public List<ServiceRefType<WebFragmentDescriptor>> getAllServiceRef()
   {
      List<ServiceRefType<WebFragmentDescriptor>> list = new ArrayList<ServiceRefType<WebFragmentDescriptor>>();
      List<Node> nodeList = model.get("service-ref");
      for(Node node: nodeList)
      {
         ServiceRefType<WebFragmentDescriptor>  type = new ServiceRefTypeImpl<WebFragmentDescriptor>(this, "service-ref", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>service-ref</code> elements 
    * @return the current instance of <code>ServiceRefType<WebFragmentDescriptor></code> 
    */
   public WebFragmentDescriptor removeAllServiceRef()
   {
      model.removeChildren("service-ref");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentDescriptor ElementName: javaee:web-app-versionType ElementType : version
   // MaxOccurs: -  isGeneric: false   isAttribute: true isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of <code>WebFragmentDescriptor</code> 
    */
   public WebFragmentDescriptor version(WebAppVersionType version)
   {
      model.attribute("version", version);
      return this;
   }

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of <code>WebFragmentDescriptor</code> 
    */
   public WebFragmentDescriptor version(String version)
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
    * @return the current instance of <code>WebFragmentDescriptor</code> 
    */
   public WebFragmentDescriptor removeVersion()
   {
      model.removeAttribute("version");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentDescriptor ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: false   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>WebFragmentDescriptor</code> 
    */
   public WebFragmentDescriptor id(String id)
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
    * @return the current instance of <code>WebFragmentDescriptor</code> 
    */
   public WebFragmentDescriptor removeId()
   {
      model.removeAttribute("id");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentDescriptor ElementName: xsd:boolean ElementType : metadata-complete
   // MaxOccurs: -  isGeneric: false   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>metadata-complete</code> attribute
    * @param metadataComplete the value for the attribute <code>metadata-complete</code> 
    * @return the current instance of <code>WebFragmentDescriptor</code> 
    */
   public WebFragmentDescriptor metadataComplete(Boolean metadataComplete)
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
    * @return the current instance of <code>WebFragmentDescriptor</code> 
    */
   public WebFragmentDescriptor removeMetadataComplete()
   {
      model.removeAttribute("metadata-complete");
      return this;
   }

}
