package org.jboss.shrinkwrap.descriptor.impl.webfragment31; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.webfragment31.WebFragmentType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.webfragment31.OrderingType;
import org.jboss.shrinkwrap.descriptor.impl.webfragment31.OrderingTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee7.EmptyType;
import org.jboss.shrinkwrap.descriptor.impl.javaee7.EmptyTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee7.ParamValueType;
import org.jboss.shrinkwrap.descriptor.impl.javaee7.ParamValueTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.webcommon31.FilterType;
import org.jboss.shrinkwrap.descriptor.impl.webcommon31.FilterTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.webcommon31.FilterMappingType;
import org.jboss.shrinkwrap.descriptor.impl.webcommon31.FilterMappingTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee7.ListenerType;
import org.jboss.shrinkwrap.descriptor.impl.javaee7.ListenerTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.webcommon31.ServletType;
import org.jboss.shrinkwrap.descriptor.impl.webcommon31.ServletTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.webcommon31.ServletMappingType;
import org.jboss.shrinkwrap.descriptor.impl.webcommon31.ServletMappingTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.webcommon31.SessionConfigType;
import org.jboss.shrinkwrap.descriptor.impl.webcommon31.SessionConfigTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.webcommon31.MimeMappingType;
import org.jboss.shrinkwrap.descriptor.impl.webcommon31.MimeMappingTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.webcommon31.WelcomeFileListType;
import org.jboss.shrinkwrap.descriptor.impl.webcommon31.WelcomeFileListTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.webcommon31.ErrorPageType;
import org.jboss.shrinkwrap.descriptor.impl.webcommon31.ErrorPageTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.jsp23.JspConfigType;
import org.jboss.shrinkwrap.descriptor.impl.jsp23.JspConfigTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.webcommon31.SecurityConstraintType;
import org.jboss.shrinkwrap.descriptor.impl.webcommon31.SecurityConstraintTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.webcommon31.LoginConfigType;
import org.jboss.shrinkwrap.descriptor.impl.webcommon31.LoginConfigTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee7.SecurityRoleType;
import org.jboss.shrinkwrap.descriptor.impl.javaee7.SecurityRoleTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee7.MessageDestinationType;
import org.jboss.shrinkwrap.descriptor.impl.javaee7.MessageDestinationTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.webcommon31.LocaleEncodingMappingListType;
import org.jboss.shrinkwrap.descriptor.impl.webcommon31.LocaleEncodingMappingListTypeImpl;
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
import org.jboss.shrinkwrap.descriptor.api.webcommon31.WebAppVersionType;

/**
 * This class implements the <code> web-fragmentType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class WebFragmentTypeImpl<T> implements Child<T>, WebFragmentType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public WebFragmentTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public WebFragmentTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentType ElementName: javaee:emptyType ElementType : distributable
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>distributable</code> element 
    * @return the current instance of <code>WebFragmentType<T></code> 
    */
   public WebFragmentType<T> distributable()
   {
      childNode.getOrCreate("distributable");
      return this;
   }

   /**
    * Removes the <code>distributable</code> element 
    * @return the current instance of <code>WebFragmentType<T></code> 
    */
   public Boolean isDistributable()
   {
      return childNode.getSingle("distributable") != null;
   }

   /**
    * Removes the <code>distributable</code> element 
    * @return the current instance of <code>WebFragmentType<T></code> 
    */
   public WebFragmentType<T> removeDistributable()
   {
      childNode.removeChild("distributable");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentType ElementName: javaee:param-valueType ElementType : context-param
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>context-param</code> element will be created and returned.
    * Otherwise, the first existing <code>context-param</code> element will be returned.
    * @return the instance defined for the element <code>context-param</code> 
    */
   public ParamValueType<WebFragmentType<T>> getOrCreateContextParam()
   {
      List<Node> nodeList = childNode.get("context-param");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ParamValueTypeImpl<WebFragmentType<T>>(this, "context-param", childNode, nodeList.get(0));
      }
      return createContextParam();
   }

   /**
    * Creates a new <code>context-param</code> element 
    * @return the new created instance of <code>ParamValueType<WebFragmentType<T>></code> 
    */
   public ParamValueType<WebFragmentType<T>> createContextParam()
   {
      return new ParamValueTypeImpl<WebFragmentType<T>>(this, "context-param", childNode);
   }

   /**
    * Returns all <code>context-param</code> elements
    * @return list of <code>context-param</code> 
    */
   public List<ParamValueType<WebFragmentType<T>>> getAllContextParam()
   {
      List<ParamValueType<WebFragmentType<T>>> list = new ArrayList<ParamValueType<WebFragmentType<T>>>();
      List<Node> nodeList = childNode.get("context-param");
      for(Node node: nodeList)
      {
         ParamValueType<WebFragmentType<T>>  type = new ParamValueTypeImpl<WebFragmentType<T>>(this, "context-param", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>context-param</code> elements 
    * @return the current instance of <code>ParamValueType<WebFragmentType<T>></code> 
    */
   public WebFragmentType<T> removeAllContextParam()
   {
      childNode.removeChildren("context-param");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentType ElementName: javaee:filterType ElementType : filter
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>filter</code> element will be created and returned.
    * Otherwise, the first existing <code>filter</code> element will be returned.
    * @return the instance defined for the element <code>filter</code> 
    */
   public FilterType<WebFragmentType<T>> getOrCreateFilter()
   {
      List<Node> nodeList = childNode.get("filter");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new FilterTypeImpl<WebFragmentType<T>>(this, "filter", childNode, nodeList.get(0));
      }
      return createFilter();
   }

   /**
    * Creates a new <code>filter</code> element 
    * @return the new created instance of <code>FilterType<WebFragmentType<T>></code> 
    */
   public FilterType<WebFragmentType<T>> createFilter()
   {
      return new FilterTypeImpl<WebFragmentType<T>>(this, "filter", childNode);
   }

   /**
    * Returns all <code>filter</code> elements
    * @return list of <code>filter</code> 
    */
   public List<FilterType<WebFragmentType<T>>> getAllFilter()
   {
      List<FilterType<WebFragmentType<T>>> list = new ArrayList<FilterType<WebFragmentType<T>>>();
      List<Node> nodeList = childNode.get("filter");
      for(Node node: nodeList)
      {
         FilterType<WebFragmentType<T>>  type = new FilterTypeImpl<WebFragmentType<T>>(this, "filter", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>filter</code> elements 
    * @return the current instance of <code>FilterType<WebFragmentType<T>></code> 
    */
   public WebFragmentType<T> removeAllFilter()
   {
      childNode.removeChildren("filter");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentType ElementName: javaee:filter-mappingType ElementType : filter-mapping
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>filter-mapping</code> element will be created and returned.
    * Otherwise, the first existing <code>filter-mapping</code> element will be returned.
    * @return the instance defined for the element <code>filter-mapping</code> 
    */
   public FilterMappingType<WebFragmentType<T>> getOrCreateFilterMapping()
   {
      List<Node> nodeList = childNode.get("filter-mapping");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new FilterMappingTypeImpl<WebFragmentType<T>>(this, "filter-mapping", childNode, nodeList.get(0));
      }
      return createFilterMapping();
   }

   /**
    * Creates a new <code>filter-mapping</code> element 
    * @return the new created instance of <code>FilterMappingType<WebFragmentType<T>></code> 
    */
   public FilterMappingType<WebFragmentType<T>> createFilterMapping()
   {
      return new FilterMappingTypeImpl<WebFragmentType<T>>(this, "filter-mapping", childNode);
   }

   /**
    * Returns all <code>filter-mapping</code> elements
    * @return list of <code>filter-mapping</code> 
    */
   public List<FilterMappingType<WebFragmentType<T>>> getAllFilterMapping()
   {
      List<FilterMappingType<WebFragmentType<T>>> list = new ArrayList<FilterMappingType<WebFragmentType<T>>>();
      List<Node> nodeList = childNode.get("filter-mapping");
      for(Node node: nodeList)
      {
         FilterMappingType<WebFragmentType<T>>  type = new FilterMappingTypeImpl<WebFragmentType<T>>(this, "filter-mapping", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>filter-mapping</code> elements 
    * @return the current instance of <code>FilterMappingType<WebFragmentType<T>></code> 
    */
   public WebFragmentType<T> removeAllFilterMapping()
   {
      childNode.removeChildren("filter-mapping");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentType ElementName: javaee:listenerType ElementType : listener
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>listener</code> element will be created and returned.
    * Otherwise, the first existing <code>listener</code> element will be returned.
    * @return the instance defined for the element <code>listener</code> 
    */
   public ListenerType<WebFragmentType<T>> getOrCreateListener()
   {
      List<Node> nodeList = childNode.get("listener");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ListenerTypeImpl<WebFragmentType<T>>(this, "listener", childNode, nodeList.get(0));
      }
      return createListener();
   }

   /**
    * Creates a new <code>listener</code> element 
    * @return the new created instance of <code>ListenerType<WebFragmentType<T>></code> 
    */
   public ListenerType<WebFragmentType<T>> createListener()
   {
      return new ListenerTypeImpl<WebFragmentType<T>>(this, "listener", childNode);
   }

   /**
    * Returns all <code>listener</code> elements
    * @return list of <code>listener</code> 
    */
   public List<ListenerType<WebFragmentType<T>>> getAllListener()
   {
      List<ListenerType<WebFragmentType<T>>> list = new ArrayList<ListenerType<WebFragmentType<T>>>();
      List<Node> nodeList = childNode.get("listener");
      for(Node node: nodeList)
      {
         ListenerType<WebFragmentType<T>>  type = new ListenerTypeImpl<WebFragmentType<T>>(this, "listener", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>listener</code> elements 
    * @return the current instance of <code>ListenerType<WebFragmentType<T>></code> 
    */
   public WebFragmentType<T> removeAllListener()
   {
      childNode.removeChildren("listener");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentType ElementName: javaee:servletType ElementType : servlet
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>servlet</code> element will be created and returned.
    * Otherwise, the first existing <code>servlet</code> element will be returned.
    * @return the instance defined for the element <code>servlet</code> 
    */
   public ServletType<WebFragmentType<T>> getOrCreateServlet()
   {
      List<Node> nodeList = childNode.get("servlet");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ServletTypeImpl<WebFragmentType<T>>(this, "servlet", childNode, nodeList.get(0));
      }
      return createServlet();
   }

   /**
    * Creates a new <code>servlet</code> element 
    * @return the new created instance of <code>ServletType<WebFragmentType<T>></code> 
    */
   public ServletType<WebFragmentType<T>> createServlet()
   {
      return new ServletTypeImpl<WebFragmentType<T>>(this, "servlet", childNode);
   }

   /**
    * Returns all <code>servlet</code> elements
    * @return list of <code>servlet</code> 
    */
   public List<ServletType<WebFragmentType<T>>> getAllServlet()
   {
      List<ServletType<WebFragmentType<T>>> list = new ArrayList<ServletType<WebFragmentType<T>>>();
      List<Node> nodeList = childNode.get("servlet");
      for(Node node: nodeList)
      {
         ServletType<WebFragmentType<T>>  type = new ServletTypeImpl<WebFragmentType<T>>(this, "servlet", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>servlet</code> elements 
    * @return the current instance of <code>ServletType<WebFragmentType<T>></code> 
    */
   public WebFragmentType<T> removeAllServlet()
   {
      childNode.removeChildren("servlet");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentType ElementName: javaee:servlet-mappingType ElementType : servlet-mapping
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>servlet-mapping</code> element will be created and returned.
    * Otherwise, the first existing <code>servlet-mapping</code> element will be returned.
    * @return the instance defined for the element <code>servlet-mapping</code> 
    */
   public ServletMappingType<WebFragmentType<T>> getOrCreateServletMapping()
   {
      List<Node> nodeList = childNode.get("servlet-mapping");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ServletMappingTypeImpl<WebFragmentType<T>>(this, "servlet-mapping", childNode, nodeList.get(0));
      }
      return createServletMapping();
   }

   /**
    * Creates a new <code>servlet-mapping</code> element 
    * @return the new created instance of <code>ServletMappingType<WebFragmentType<T>></code> 
    */
   public ServletMappingType<WebFragmentType<T>> createServletMapping()
   {
      return new ServletMappingTypeImpl<WebFragmentType<T>>(this, "servlet-mapping", childNode);
   }

   /**
    * Returns all <code>servlet-mapping</code> elements
    * @return list of <code>servlet-mapping</code> 
    */
   public List<ServletMappingType<WebFragmentType<T>>> getAllServletMapping()
   {
      List<ServletMappingType<WebFragmentType<T>>> list = new ArrayList<ServletMappingType<WebFragmentType<T>>>();
      List<Node> nodeList = childNode.get("servlet-mapping");
      for(Node node: nodeList)
      {
         ServletMappingType<WebFragmentType<T>>  type = new ServletMappingTypeImpl<WebFragmentType<T>>(this, "servlet-mapping", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>servlet-mapping</code> elements 
    * @return the current instance of <code>ServletMappingType<WebFragmentType<T>></code> 
    */
   public WebFragmentType<T> removeAllServletMapping()
   {
      childNode.removeChildren("servlet-mapping");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentType ElementName: javaee:session-configType ElementType : session-config
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>session-config</code> element will be created and returned.
    * Otherwise, the first existing <code>session-config</code> element will be returned.
    * @return the instance defined for the element <code>session-config</code> 
    */
   public SessionConfigType<WebFragmentType<T>> getOrCreateSessionConfig()
   {
      List<Node> nodeList = childNode.get("session-config");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new SessionConfigTypeImpl<WebFragmentType<T>>(this, "session-config", childNode, nodeList.get(0));
      }
      return createSessionConfig();
   }

   /**
    * Creates a new <code>session-config</code> element 
    * @return the new created instance of <code>SessionConfigType<WebFragmentType<T>></code> 
    */
   public SessionConfigType<WebFragmentType<T>> createSessionConfig()
   {
      return new SessionConfigTypeImpl<WebFragmentType<T>>(this, "session-config", childNode);
   }

   /**
    * Returns all <code>session-config</code> elements
    * @return list of <code>session-config</code> 
    */
   public List<SessionConfigType<WebFragmentType<T>>> getAllSessionConfig()
   {
      List<SessionConfigType<WebFragmentType<T>>> list = new ArrayList<SessionConfigType<WebFragmentType<T>>>();
      List<Node> nodeList = childNode.get("session-config");
      for(Node node: nodeList)
      {
         SessionConfigType<WebFragmentType<T>>  type = new SessionConfigTypeImpl<WebFragmentType<T>>(this, "session-config", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>session-config</code> elements 
    * @return the current instance of <code>SessionConfigType<WebFragmentType<T>></code> 
    */
   public WebFragmentType<T> removeAllSessionConfig()
   {
      childNode.removeChildren("session-config");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentType ElementName: javaee:mime-mappingType ElementType : mime-mapping
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>mime-mapping</code> element will be created and returned.
    * Otherwise, the first existing <code>mime-mapping</code> element will be returned.
    * @return the instance defined for the element <code>mime-mapping</code> 
    */
   public MimeMappingType<WebFragmentType<T>> getOrCreateMimeMapping()
   {
      List<Node> nodeList = childNode.get("mime-mapping");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new MimeMappingTypeImpl<WebFragmentType<T>>(this, "mime-mapping", childNode, nodeList.get(0));
      }
      return createMimeMapping();
   }

   /**
    * Creates a new <code>mime-mapping</code> element 
    * @return the new created instance of <code>MimeMappingType<WebFragmentType<T>></code> 
    */
   public MimeMappingType<WebFragmentType<T>> createMimeMapping()
   {
      return new MimeMappingTypeImpl<WebFragmentType<T>>(this, "mime-mapping", childNode);
   }

   /**
    * Returns all <code>mime-mapping</code> elements
    * @return list of <code>mime-mapping</code> 
    */
   public List<MimeMappingType<WebFragmentType<T>>> getAllMimeMapping()
   {
      List<MimeMappingType<WebFragmentType<T>>> list = new ArrayList<MimeMappingType<WebFragmentType<T>>>();
      List<Node> nodeList = childNode.get("mime-mapping");
      for(Node node: nodeList)
      {
         MimeMappingType<WebFragmentType<T>>  type = new MimeMappingTypeImpl<WebFragmentType<T>>(this, "mime-mapping", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>mime-mapping</code> elements 
    * @return the current instance of <code>MimeMappingType<WebFragmentType<T>></code> 
    */
   public WebFragmentType<T> removeAllMimeMapping()
   {
      childNode.removeChildren("mime-mapping");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentType ElementName: javaee:welcome-file-listType ElementType : welcome-file-list
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>welcome-file-list</code> element will be created and returned.
    * Otherwise, the first existing <code>welcome-file-list</code> element will be returned.
    * @return the instance defined for the element <code>welcome-file-list</code> 
    */
   public WelcomeFileListType<WebFragmentType<T>> getOrCreateWelcomeFileList()
   {
      List<Node> nodeList = childNode.get("welcome-file-list");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new WelcomeFileListTypeImpl<WebFragmentType<T>>(this, "welcome-file-list", childNode, nodeList.get(0));
      }
      return createWelcomeFileList();
   }

   /**
    * Creates a new <code>welcome-file-list</code> element 
    * @return the new created instance of <code>WelcomeFileListType<WebFragmentType<T>></code> 
    */
   public WelcomeFileListType<WebFragmentType<T>> createWelcomeFileList()
   {
      return new WelcomeFileListTypeImpl<WebFragmentType<T>>(this, "welcome-file-list", childNode);
   }

   /**
    * Returns all <code>welcome-file-list</code> elements
    * @return list of <code>welcome-file-list</code> 
    */
   public List<WelcomeFileListType<WebFragmentType<T>>> getAllWelcomeFileList()
   {
      List<WelcomeFileListType<WebFragmentType<T>>> list = new ArrayList<WelcomeFileListType<WebFragmentType<T>>>();
      List<Node> nodeList = childNode.get("welcome-file-list");
      for(Node node: nodeList)
      {
         WelcomeFileListType<WebFragmentType<T>>  type = new WelcomeFileListTypeImpl<WebFragmentType<T>>(this, "welcome-file-list", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>welcome-file-list</code> elements 
    * @return the current instance of <code>WelcomeFileListType<WebFragmentType<T>></code> 
    */
   public WebFragmentType<T> removeAllWelcomeFileList()
   {
      childNode.removeChildren("welcome-file-list");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentType ElementName: javaee:error-pageType ElementType : error-page
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>error-page</code> element will be created and returned.
    * Otherwise, the first existing <code>error-page</code> element will be returned.
    * @return the instance defined for the element <code>error-page</code> 
    */
   public ErrorPageType<WebFragmentType<T>> getOrCreateErrorPage()
   {
      List<Node> nodeList = childNode.get("error-page");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ErrorPageTypeImpl<WebFragmentType<T>>(this, "error-page", childNode, nodeList.get(0));
      }
      return createErrorPage();
   }

   /**
    * Creates a new <code>error-page</code> element 
    * @return the new created instance of <code>ErrorPageType<WebFragmentType<T>></code> 
    */
   public ErrorPageType<WebFragmentType<T>> createErrorPage()
   {
      return new ErrorPageTypeImpl<WebFragmentType<T>>(this, "error-page", childNode);
   }

   /**
    * Returns all <code>error-page</code> elements
    * @return list of <code>error-page</code> 
    */
   public List<ErrorPageType<WebFragmentType<T>>> getAllErrorPage()
   {
      List<ErrorPageType<WebFragmentType<T>>> list = new ArrayList<ErrorPageType<WebFragmentType<T>>>();
      List<Node> nodeList = childNode.get("error-page");
      for(Node node: nodeList)
      {
         ErrorPageType<WebFragmentType<T>>  type = new ErrorPageTypeImpl<WebFragmentType<T>>(this, "error-page", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>error-page</code> elements 
    * @return the current instance of <code>ErrorPageType<WebFragmentType<T>></code> 
    */
   public WebFragmentType<T> removeAllErrorPage()
   {
      childNode.removeChildren("error-page");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentType ElementName: javaee:jsp-configType ElementType : jsp-config
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>jsp-config</code> element will be created and returned.
    * Otherwise, the first existing <code>jsp-config</code> element will be returned.
    * @return the instance defined for the element <code>jsp-config</code> 
    */
   public JspConfigType<WebFragmentType<T>> getOrCreateJspConfig()
   {
      List<Node> nodeList = childNode.get("jsp-config");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new JspConfigTypeImpl<WebFragmentType<T>>(this, "jsp-config", childNode, nodeList.get(0));
      }
      return createJspConfig();
   }

   /**
    * Creates a new <code>jsp-config</code> element 
    * @return the new created instance of <code>JspConfigType<WebFragmentType<T>></code> 
    */
   public JspConfigType<WebFragmentType<T>> createJspConfig()
   {
      return new JspConfigTypeImpl<WebFragmentType<T>>(this, "jsp-config", childNode);
   }

   /**
    * Returns all <code>jsp-config</code> elements
    * @return list of <code>jsp-config</code> 
    */
   public List<JspConfigType<WebFragmentType<T>>> getAllJspConfig()
   {
      List<JspConfigType<WebFragmentType<T>>> list = new ArrayList<JspConfigType<WebFragmentType<T>>>();
      List<Node> nodeList = childNode.get("jsp-config");
      for(Node node: nodeList)
      {
         JspConfigType<WebFragmentType<T>>  type = new JspConfigTypeImpl<WebFragmentType<T>>(this, "jsp-config", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>jsp-config</code> elements 
    * @return the current instance of <code>JspConfigType<WebFragmentType<T>></code> 
    */
   public WebFragmentType<T> removeAllJspConfig()
   {
      childNode.removeChildren("jsp-config");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentType ElementName: javaee:security-constraintType ElementType : security-constraint
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>security-constraint</code> element will be created and returned.
    * Otherwise, the first existing <code>security-constraint</code> element will be returned.
    * @return the instance defined for the element <code>security-constraint</code> 
    */
   public SecurityConstraintType<WebFragmentType<T>> getOrCreateSecurityConstraint()
   {
      List<Node> nodeList = childNode.get("security-constraint");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new SecurityConstraintTypeImpl<WebFragmentType<T>>(this, "security-constraint", childNode, nodeList.get(0));
      }
      return createSecurityConstraint();
   }

   /**
    * Creates a new <code>security-constraint</code> element 
    * @return the new created instance of <code>SecurityConstraintType<WebFragmentType<T>></code> 
    */
   public SecurityConstraintType<WebFragmentType<T>> createSecurityConstraint()
   {
      return new SecurityConstraintTypeImpl<WebFragmentType<T>>(this, "security-constraint", childNode);
   }

   /**
    * Returns all <code>security-constraint</code> elements
    * @return list of <code>security-constraint</code> 
    */
   public List<SecurityConstraintType<WebFragmentType<T>>> getAllSecurityConstraint()
   {
      List<SecurityConstraintType<WebFragmentType<T>>> list = new ArrayList<SecurityConstraintType<WebFragmentType<T>>>();
      List<Node> nodeList = childNode.get("security-constraint");
      for(Node node: nodeList)
      {
         SecurityConstraintType<WebFragmentType<T>>  type = new SecurityConstraintTypeImpl<WebFragmentType<T>>(this, "security-constraint", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>security-constraint</code> elements 
    * @return the current instance of <code>SecurityConstraintType<WebFragmentType<T>></code> 
    */
   public WebFragmentType<T> removeAllSecurityConstraint()
   {
      childNode.removeChildren("security-constraint");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentType ElementName: javaee:login-configType ElementType : login-config
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>login-config</code> element will be created and returned.
    * Otherwise, the first existing <code>login-config</code> element will be returned.
    * @return the instance defined for the element <code>login-config</code> 
    */
   public LoginConfigType<WebFragmentType<T>> getOrCreateLoginConfig()
   {
      List<Node> nodeList = childNode.get("login-config");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new LoginConfigTypeImpl<WebFragmentType<T>>(this, "login-config", childNode, nodeList.get(0));
      }
      return createLoginConfig();
   }

   /**
    * Creates a new <code>login-config</code> element 
    * @return the new created instance of <code>LoginConfigType<WebFragmentType<T>></code> 
    */
   public LoginConfigType<WebFragmentType<T>> createLoginConfig()
   {
      return new LoginConfigTypeImpl<WebFragmentType<T>>(this, "login-config", childNode);
   }

   /**
    * Returns all <code>login-config</code> elements
    * @return list of <code>login-config</code> 
    */
   public List<LoginConfigType<WebFragmentType<T>>> getAllLoginConfig()
   {
      List<LoginConfigType<WebFragmentType<T>>> list = new ArrayList<LoginConfigType<WebFragmentType<T>>>();
      List<Node> nodeList = childNode.get("login-config");
      for(Node node: nodeList)
      {
         LoginConfigType<WebFragmentType<T>>  type = new LoginConfigTypeImpl<WebFragmentType<T>>(this, "login-config", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>login-config</code> elements 
    * @return the current instance of <code>LoginConfigType<WebFragmentType<T>></code> 
    */
   public WebFragmentType<T> removeAllLoginConfig()
   {
      childNode.removeChildren("login-config");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentType ElementName: javaee:security-roleType ElementType : security-role
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>security-role</code> element will be created and returned.
    * Otherwise, the first existing <code>security-role</code> element will be returned.
    * @return the instance defined for the element <code>security-role</code> 
    */
   public SecurityRoleType<WebFragmentType<T>> getOrCreateSecurityRole()
   {
      List<Node> nodeList = childNode.get("security-role");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new SecurityRoleTypeImpl<WebFragmentType<T>>(this, "security-role", childNode, nodeList.get(0));
      }
      return createSecurityRole();
   }

   /**
    * Creates a new <code>security-role</code> element 
    * @return the new created instance of <code>SecurityRoleType<WebFragmentType<T>></code> 
    */
   public SecurityRoleType<WebFragmentType<T>> createSecurityRole()
   {
      return new SecurityRoleTypeImpl<WebFragmentType<T>>(this, "security-role", childNode);
   }

   /**
    * Returns all <code>security-role</code> elements
    * @return list of <code>security-role</code> 
    */
   public List<SecurityRoleType<WebFragmentType<T>>> getAllSecurityRole()
   {
      List<SecurityRoleType<WebFragmentType<T>>> list = new ArrayList<SecurityRoleType<WebFragmentType<T>>>();
      List<Node> nodeList = childNode.get("security-role");
      for(Node node: nodeList)
      {
         SecurityRoleType<WebFragmentType<T>>  type = new SecurityRoleTypeImpl<WebFragmentType<T>>(this, "security-role", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>security-role</code> elements 
    * @return the current instance of <code>SecurityRoleType<WebFragmentType<T>></code> 
    */
   public WebFragmentType<T> removeAllSecurityRole()
   {
      childNode.removeChildren("security-role");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentType ElementName: javaee:message-destinationType ElementType : message-destination
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>message-destination</code> element will be created and returned.
    * Otherwise, the first existing <code>message-destination</code> element will be returned.
    * @return the instance defined for the element <code>message-destination</code> 
    */
   public MessageDestinationType<WebFragmentType<T>> getOrCreateMessageDestination()
   {
      List<Node> nodeList = childNode.get("message-destination");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new MessageDestinationTypeImpl<WebFragmentType<T>>(this, "message-destination", childNode, nodeList.get(0));
      }
      return createMessageDestination();
   }

   /**
    * Creates a new <code>message-destination</code> element 
    * @return the new created instance of <code>MessageDestinationType<WebFragmentType<T>></code> 
    */
   public MessageDestinationType<WebFragmentType<T>> createMessageDestination()
   {
      return new MessageDestinationTypeImpl<WebFragmentType<T>>(this, "message-destination", childNode);
   }

   /**
    * Returns all <code>message-destination</code> elements
    * @return list of <code>message-destination</code> 
    */
   public List<MessageDestinationType<WebFragmentType<T>>> getAllMessageDestination()
   {
      List<MessageDestinationType<WebFragmentType<T>>> list = new ArrayList<MessageDestinationType<WebFragmentType<T>>>();
      List<Node> nodeList = childNode.get("message-destination");
      for(Node node: nodeList)
      {
         MessageDestinationType<WebFragmentType<T>>  type = new MessageDestinationTypeImpl<WebFragmentType<T>>(this, "message-destination", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>message-destination</code> elements 
    * @return the current instance of <code>MessageDestinationType<WebFragmentType<T>></code> 
    */
   public WebFragmentType<T> removeAllMessageDestination()
   {
      childNode.removeChildren("message-destination");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentType ElementName: javaee:locale-encoding-mapping-listType ElementType : locale-encoding-mapping-list
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>locale-encoding-mapping-list</code> element will be created and returned.
    * Otherwise, the first existing <code>locale-encoding-mapping-list</code> element will be returned.
    * @return the instance defined for the element <code>locale-encoding-mapping-list</code> 
    */
   public LocaleEncodingMappingListType<WebFragmentType<T>> getOrCreateLocaleEncodingMappingList()
   {
      List<Node> nodeList = childNode.get("locale-encoding-mapping-list");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new LocaleEncodingMappingListTypeImpl<WebFragmentType<T>>(this, "locale-encoding-mapping-list", childNode, nodeList.get(0));
      }
      return createLocaleEncodingMappingList();
   }

   /**
    * Creates a new <code>locale-encoding-mapping-list</code> element 
    * @return the new created instance of <code>LocaleEncodingMappingListType<WebFragmentType<T>></code> 
    */
   public LocaleEncodingMappingListType<WebFragmentType<T>> createLocaleEncodingMappingList()
   {
      return new LocaleEncodingMappingListTypeImpl<WebFragmentType<T>>(this, "locale-encoding-mapping-list", childNode);
   }

   /**
    * Returns all <code>locale-encoding-mapping-list</code> elements
    * @return list of <code>locale-encoding-mapping-list</code> 
    */
   public List<LocaleEncodingMappingListType<WebFragmentType<T>>> getAllLocaleEncodingMappingList()
   {
      List<LocaleEncodingMappingListType<WebFragmentType<T>>> list = new ArrayList<LocaleEncodingMappingListType<WebFragmentType<T>>>();
      List<Node> nodeList = childNode.get("locale-encoding-mapping-list");
      for(Node node: nodeList)
      {
         LocaleEncodingMappingListType<WebFragmentType<T>>  type = new LocaleEncodingMappingListTypeImpl<WebFragmentType<T>>(this, "locale-encoding-mapping-list", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>locale-encoding-mapping-list</code> elements 
    * @return the current instance of <code>LocaleEncodingMappingListType<WebFragmentType<T>></code> 
    */
   public WebFragmentType<T> removeAllLocaleEncodingMappingList()
   {
      childNode.removeChildren("locale-encoding-mapping-list");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>WebFragmentType<T></code> 
    */
   public WebFragmentType<T> description(String ... values)
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
    * @return the current instance of <code>WebFragmentType<T></code> 
    */
   public WebFragmentType<T> removeAllDescription()
   {
      childNode.removeChildren("description");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentType ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>WebFragmentType<T></code> 
    */
   public WebFragmentType<T> displayName(String ... values)
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
    * @return the current instance of <code>WebFragmentType<T></code> 
    */
   public WebFragmentType<T> removeAllDisplayName()
   {
      childNode.removeChildren("display-name");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentType ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<WebFragmentType<T>> getOrCreateIcon()
   {
      List<Node> nodeList = childNode.get("icon");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new IconTypeImpl<WebFragmentType<T>>(this, "icon", childNode, nodeList.get(0));
      }
      return createIcon();
   }

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<WebFragmentType<T>></code> 
    */
   public IconType<WebFragmentType<T>> createIcon()
   {
      return new IconTypeImpl<WebFragmentType<T>>(this, "icon", childNode);
   }

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<WebFragmentType<T>>> getAllIcon()
   {
      List<IconType<WebFragmentType<T>>> list = new ArrayList<IconType<WebFragmentType<T>>>();
      List<Node> nodeList = childNode.get("icon");
      for(Node node: nodeList)
      {
         IconType<WebFragmentType<T>>  type = new IconTypeImpl<WebFragmentType<T>>(this, "icon", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<WebFragmentType<T>></code> 
    */
   public WebFragmentType<T> removeAllIcon()
   {
      childNode.removeChildren("icon");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentType ElementName: javaee:env-entryType ElementType : env-entry
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>env-entry</code> element will be created and returned.
    * Otherwise, the first existing <code>env-entry</code> element will be returned.
    * @return the instance defined for the element <code>env-entry</code> 
    */
   public EnvEntryType<WebFragmentType<T>> getOrCreateEnvEntry()
   {
      List<Node> nodeList = childNode.get("env-entry");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new EnvEntryTypeImpl<WebFragmentType<T>>(this, "env-entry", childNode, nodeList.get(0));
      }
      return createEnvEntry();
   }

   /**
    * Creates a new <code>env-entry</code> element 
    * @return the new created instance of <code>EnvEntryType<WebFragmentType<T>></code> 
    */
   public EnvEntryType<WebFragmentType<T>> createEnvEntry()
   {
      return new EnvEntryTypeImpl<WebFragmentType<T>>(this, "env-entry", childNode);
   }

   /**
    * Returns all <code>env-entry</code> elements
    * @return list of <code>env-entry</code> 
    */
   public List<EnvEntryType<WebFragmentType<T>>> getAllEnvEntry()
   {
      List<EnvEntryType<WebFragmentType<T>>> list = new ArrayList<EnvEntryType<WebFragmentType<T>>>();
      List<Node> nodeList = childNode.get("env-entry");
      for(Node node: nodeList)
      {
         EnvEntryType<WebFragmentType<T>>  type = new EnvEntryTypeImpl<WebFragmentType<T>>(this, "env-entry", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>env-entry</code> elements 
    * @return the current instance of <code>EnvEntryType<WebFragmentType<T>></code> 
    */
   public WebFragmentType<T> removeAllEnvEntry()
   {
      childNode.removeChildren("env-entry");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentType ElementName: javaee:ejb-refType ElementType : ejb-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>ejb-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>ejb-ref</code> element will be returned.
    * @return the instance defined for the element <code>ejb-ref</code> 
    */
   public EjbRefType<WebFragmentType<T>> getOrCreateEjbRef()
   {
      List<Node> nodeList = childNode.get("ejb-ref");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new EjbRefTypeImpl<WebFragmentType<T>>(this, "ejb-ref", childNode, nodeList.get(0));
      }
      return createEjbRef();
   }

   /**
    * Creates a new <code>ejb-ref</code> element 
    * @return the new created instance of <code>EjbRefType<WebFragmentType<T>></code> 
    */
   public EjbRefType<WebFragmentType<T>> createEjbRef()
   {
      return new EjbRefTypeImpl<WebFragmentType<T>>(this, "ejb-ref", childNode);
   }

   /**
    * Returns all <code>ejb-ref</code> elements
    * @return list of <code>ejb-ref</code> 
    */
   public List<EjbRefType<WebFragmentType<T>>> getAllEjbRef()
   {
      List<EjbRefType<WebFragmentType<T>>> list = new ArrayList<EjbRefType<WebFragmentType<T>>>();
      List<Node> nodeList = childNode.get("ejb-ref");
      for(Node node: nodeList)
      {
         EjbRefType<WebFragmentType<T>>  type = new EjbRefTypeImpl<WebFragmentType<T>>(this, "ejb-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>ejb-ref</code> elements 
    * @return the current instance of <code>EjbRefType<WebFragmentType<T>></code> 
    */
   public WebFragmentType<T> removeAllEjbRef()
   {
      childNode.removeChildren("ejb-ref");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentType ElementName: javaee:ejb-local-refType ElementType : ejb-local-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>ejb-local-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>ejb-local-ref</code> element will be returned.
    * @return the instance defined for the element <code>ejb-local-ref</code> 
    */
   public EjbLocalRefType<WebFragmentType<T>> getOrCreateEjbLocalRef()
   {
      List<Node> nodeList = childNode.get("ejb-local-ref");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new EjbLocalRefTypeImpl<WebFragmentType<T>>(this, "ejb-local-ref", childNode, nodeList.get(0));
      }
      return createEjbLocalRef();
   }

   /**
    * Creates a new <code>ejb-local-ref</code> element 
    * @return the new created instance of <code>EjbLocalRefType<WebFragmentType<T>></code> 
    */
   public EjbLocalRefType<WebFragmentType<T>> createEjbLocalRef()
   {
      return new EjbLocalRefTypeImpl<WebFragmentType<T>>(this, "ejb-local-ref", childNode);
   }

   /**
    * Returns all <code>ejb-local-ref</code> elements
    * @return list of <code>ejb-local-ref</code> 
    */
   public List<EjbLocalRefType<WebFragmentType<T>>> getAllEjbLocalRef()
   {
      List<EjbLocalRefType<WebFragmentType<T>>> list = new ArrayList<EjbLocalRefType<WebFragmentType<T>>>();
      List<Node> nodeList = childNode.get("ejb-local-ref");
      for(Node node: nodeList)
      {
         EjbLocalRefType<WebFragmentType<T>>  type = new EjbLocalRefTypeImpl<WebFragmentType<T>>(this, "ejb-local-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>ejb-local-ref</code> elements 
    * @return the current instance of <code>EjbLocalRefType<WebFragmentType<T>></code> 
    */
   public WebFragmentType<T> removeAllEjbLocalRef()
   {
      childNode.removeChildren("ejb-local-ref");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentType ElementName: javaee:resource-refType ElementType : resource-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>resource-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>resource-ref</code> element will be returned.
    * @return the instance defined for the element <code>resource-ref</code> 
    */
   public ResourceRefType<WebFragmentType<T>> getOrCreateResourceRef()
   {
      List<Node> nodeList = childNode.get("resource-ref");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ResourceRefTypeImpl<WebFragmentType<T>>(this, "resource-ref", childNode, nodeList.get(0));
      }
      return createResourceRef();
   }

   /**
    * Creates a new <code>resource-ref</code> element 
    * @return the new created instance of <code>ResourceRefType<WebFragmentType<T>></code> 
    */
   public ResourceRefType<WebFragmentType<T>> createResourceRef()
   {
      return new ResourceRefTypeImpl<WebFragmentType<T>>(this, "resource-ref", childNode);
   }

   /**
    * Returns all <code>resource-ref</code> elements
    * @return list of <code>resource-ref</code> 
    */
   public List<ResourceRefType<WebFragmentType<T>>> getAllResourceRef()
   {
      List<ResourceRefType<WebFragmentType<T>>> list = new ArrayList<ResourceRefType<WebFragmentType<T>>>();
      List<Node> nodeList = childNode.get("resource-ref");
      for(Node node: nodeList)
      {
         ResourceRefType<WebFragmentType<T>>  type = new ResourceRefTypeImpl<WebFragmentType<T>>(this, "resource-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>resource-ref</code> elements 
    * @return the current instance of <code>ResourceRefType<WebFragmentType<T>></code> 
    */
   public WebFragmentType<T> removeAllResourceRef()
   {
      childNode.removeChildren("resource-ref");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentType ElementName: javaee:resource-env-refType ElementType : resource-env-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>resource-env-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>resource-env-ref</code> element will be returned.
    * @return the instance defined for the element <code>resource-env-ref</code> 
    */
   public ResourceEnvRefType<WebFragmentType<T>> getOrCreateResourceEnvRef()
   {
      List<Node> nodeList = childNode.get("resource-env-ref");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ResourceEnvRefTypeImpl<WebFragmentType<T>>(this, "resource-env-ref", childNode, nodeList.get(0));
      }
      return createResourceEnvRef();
   }

   /**
    * Creates a new <code>resource-env-ref</code> element 
    * @return the new created instance of <code>ResourceEnvRefType<WebFragmentType<T>></code> 
    */
   public ResourceEnvRefType<WebFragmentType<T>> createResourceEnvRef()
   {
      return new ResourceEnvRefTypeImpl<WebFragmentType<T>>(this, "resource-env-ref", childNode);
   }

   /**
    * Returns all <code>resource-env-ref</code> elements
    * @return list of <code>resource-env-ref</code> 
    */
   public List<ResourceEnvRefType<WebFragmentType<T>>> getAllResourceEnvRef()
   {
      List<ResourceEnvRefType<WebFragmentType<T>>> list = new ArrayList<ResourceEnvRefType<WebFragmentType<T>>>();
      List<Node> nodeList = childNode.get("resource-env-ref");
      for(Node node: nodeList)
      {
         ResourceEnvRefType<WebFragmentType<T>>  type = new ResourceEnvRefTypeImpl<WebFragmentType<T>>(this, "resource-env-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>resource-env-ref</code> elements 
    * @return the current instance of <code>ResourceEnvRefType<WebFragmentType<T>></code> 
    */
   public WebFragmentType<T> removeAllResourceEnvRef()
   {
      childNode.removeChildren("resource-env-ref");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentType ElementName: javaee:message-destination-refType ElementType : message-destination-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>message-destination-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>message-destination-ref</code> element will be returned.
    * @return the instance defined for the element <code>message-destination-ref</code> 
    */
   public MessageDestinationRefType<WebFragmentType<T>> getOrCreateMessageDestinationRef()
   {
      List<Node> nodeList = childNode.get("message-destination-ref");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new MessageDestinationRefTypeImpl<WebFragmentType<T>>(this, "message-destination-ref", childNode, nodeList.get(0));
      }
      return createMessageDestinationRef();
   }

   /**
    * Creates a new <code>message-destination-ref</code> element 
    * @return the new created instance of <code>MessageDestinationRefType<WebFragmentType<T>></code> 
    */
   public MessageDestinationRefType<WebFragmentType<T>> createMessageDestinationRef()
   {
      return new MessageDestinationRefTypeImpl<WebFragmentType<T>>(this, "message-destination-ref", childNode);
   }

   /**
    * Returns all <code>message-destination-ref</code> elements
    * @return list of <code>message-destination-ref</code> 
    */
   public List<MessageDestinationRefType<WebFragmentType<T>>> getAllMessageDestinationRef()
   {
      List<MessageDestinationRefType<WebFragmentType<T>>> list = new ArrayList<MessageDestinationRefType<WebFragmentType<T>>>();
      List<Node> nodeList = childNode.get("message-destination-ref");
      for(Node node: nodeList)
      {
         MessageDestinationRefType<WebFragmentType<T>>  type = new MessageDestinationRefTypeImpl<WebFragmentType<T>>(this, "message-destination-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>message-destination-ref</code> elements 
    * @return the current instance of <code>MessageDestinationRefType<WebFragmentType<T>></code> 
    */
   public WebFragmentType<T> removeAllMessageDestinationRef()
   {
      childNode.removeChildren("message-destination-ref");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentType ElementName: javaee:persistence-context-refType ElementType : persistence-context-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>persistence-context-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>persistence-context-ref</code> element will be returned.
    * @return the instance defined for the element <code>persistence-context-ref</code> 
    */
   public PersistenceContextRefType<WebFragmentType<T>> getOrCreatePersistenceContextRef()
   {
      List<Node> nodeList = childNode.get("persistence-context-ref");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new PersistenceContextRefTypeImpl<WebFragmentType<T>>(this, "persistence-context-ref", childNode, nodeList.get(0));
      }
      return createPersistenceContextRef();
   }

   /**
    * Creates a new <code>persistence-context-ref</code> element 
    * @return the new created instance of <code>PersistenceContextRefType<WebFragmentType<T>></code> 
    */
   public PersistenceContextRefType<WebFragmentType<T>> createPersistenceContextRef()
   {
      return new PersistenceContextRefTypeImpl<WebFragmentType<T>>(this, "persistence-context-ref", childNode);
   }

   /**
    * Returns all <code>persistence-context-ref</code> elements
    * @return list of <code>persistence-context-ref</code> 
    */
   public List<PersistenceContextRefType<WebFragmentType<T>>> getAllPersistenceContextRef()
   {
      List<PersistenceContextRefType<WebFragmentType<T>>> list = new ArrayList<PersistenceContextRefType<WebFragmentType<T>>>();
      List<Node> nodeList = childNode.get("persistence-context-ref");
      for(Node node: nodeList)
      {
         PersistenceContextRefType<WebFragmentType<T>>  type = new PersistenceContextRefTypeImpl<WebFragmentType<T>>(this, "persistence-context-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>persistence-context-ref</code> elements 
    * @return the current instance of <code>PersistenceContextRefType<WebFragmentType<T>></code> 
    */
   public WebFragmentType<T> removeAllPersistenceContextRef()
   {
      childNode.removeChildren("persistence-context-ref");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentType ElementName: javaee:persistence-unit-refType ElementType : persistence-unit-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>persistence-unit-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>persistence-unit-ref</code> element will be returned.
    * @return the instance defined for the element <code>persistence-unit-ref</code> 
    */
   public PersistenceUnitRefType<WebFragmentType<T>> getOrCreatePersistenceUnitRef()
   {
      List<Node> nodeList = childNode.get("persistence-unit-ref");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new PersistenceUnitRefTypeImpl<WebFragmentType<T>>(this, "persistence-unit-ref", childNode, nodeList.get(0));
      }
      return createPersistenceUnitRef();
   }

   /**
    * Creates a new <code>persistence-unit-ref</code> element 
    * @return the new created instance of <code>PersistenceUnitRefType<WebFragmentType<T>></code> 
    */
   public PersistenceUnitRefType<WebFragmentType<T>> createPersistenceUnitRef()
   {
      return new PersistenceUnitRefTypeImpl<WebFragmentType<T>>(this, "persistence-unit-ref", childNode);
   }

   /**
    * Returns all <code>persistence-unit-ref</code> elements
    * @return list of <code>persistence-unit-ref</code> 
    */
   public List<PersistenceUnitRefType<WebFragmentType<T>>> getAllPersistenceUnitRef()
   {
      List<PersistenceUnitRefType<WebFragmentType<T>>> list = new ArrayList<PersistenceUnitRefType<WebFragmentType<T>>>();
      List<Node> nodeList = childNode.get("persistence-unit-ref");
      for(Node node: nodeList)
      {
         PersistenceUnitRefType<WebFragmentType<T>>  type = new PersistenceUnitRefTypeImpl<WebFragmentType<T>>(this, "persistence-unit-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>persistence-unit-ref</code> elements 
    * @return the current instance of <code>PersistenceUnitRefType<WebFragmentType<T>></code> 
    */
   public WebFragmentType<T> removeAllPersistenceUnitRef()
   {
      childNode.removeChildren("persistence-unit-ref");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentType ElementName: javaee:lifecycle-callbackType ElementType : post-construct
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>post-construct</code> element will be created and returned.
    * Otherwise, the first existing <code>post-construct</code> element will be returned.
    * @return the instance defined for the element <code>post-construct</code> 
    */
   public LifecycleCallbackType<WebFragmentType<T>> getOrCreatePostConstruct()
   {
      List<Node> nodeList = childNode.get("post-construct");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new LifecycleCallbackTypeImpl<WebFragmentType<T>>(this, "post-construct", childNode, nodeList.get(0));
      }
      return createPostConstruct();
   }

   /**
    * Creates a new <code>post-construct</code> element 
    * @return the new created instance of <code>LifecycleCallbackType<WebFragmentType<T>></code> 
    */
   public LifecycleCallbackType<WebFragmentType<T>> createPostConstruct()
   {
      return new LifecycleCallbackTypeImpl<WebFragmentType<T>>(this, "post-construct", childNode);
   }

   /**
    * Returns all <code>post-construct</code> elements
    * @return list of <code>post-construct</code> 
    */
   public List<LifecycleCallbackType<WebFragmentType<T>>> getAllPostConstruct()
   {
      List<LifecycleCallbackType<WebFragmentType<T>>> list = new ArrayList<LifecycleCallbackType<WebFragmentType<T>>>();
      List<Node> nodeList = childNode.get("post-construct");
      for(Node node: nodeList)
      {
         LifecycleCallbackType<WebFragmentType<T>>  type = new LifecycleCallbackTypeImpl<WebFragmentType<T>>(this, "post-construct", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>post-construct</code> elements 
    * @return the current instance of <code>LifecycleCallbackType<WebFragmentType<T>></code> 
    */
   public WebFragmentType<T> removeAllPostConstruct()
   {
      childNode.removeChildren("post-construct");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentType ElementName: javaee:lifecycle-callbackType ElementType : pre-destroy
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>pre-destroy</code> element will be created and returned.
    * Otherwise, the first existing <code>pre-destroy</code> element will be returned.
    * @return the instance defined for the element <code>pre-destroy</code> 
    */
   public LifecycleCallbackType<WebFragmentType<T>> getOrCreatePreDestroy()
   {
      List<Node> nodeList = childNode.get("pre-destroy");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new LifecycleCallbackTypeImpl<WebFragmentType<T>>(this, "pre-destroy", childNode, nodeList.get(0));
      }
      return createPreDestroy();
   }

   /**
    * Creates a new <code>pre-destroy</code> element 
    * @return the new created instance of <code>LifecycleCallbackType<WebFragmentType<T>></code> 
    */
   public LifecycleCallbackType<WebFragmentType<T>> createPreDestroy()
   {
      return new LifecycleCallbackTypeImpl<WebFragmentType<T>>(this, "pre-destroy", childNode);
   }

   /**
    * Returns all <code>pre-destroy</code> elements
    * @return list of <code>pre-destroy</code> 
    */
   public List<LifecycleCallbackType<WebFragmentType<T>>> getAllPreDestroy()
   {
      List<LifecycleCallbackType<WebFragmentType<T>>> list = new ArrayList<LifecycleCallbackType<WebFragmentType<T>>>();
      List<Node> nodeList = childNode.get("pre-destroy");
      for(Node node: nodeList)
      {
         LifecycleCallbackType<WebFragmentType<T>>  type = new LifecycleCallbackTypeImpl<WebFragmentType<T>>(this, "pre-destroy", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>pre-destroy</code> elements 
    * @return the current instance of <code>LifecycleCallbackType<WebFragmentType<T>></code> 
    */
   public WebFragmentType<T> removeAllPreDestroy()
   {
      childNode.removeChildren("pre-destroy");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentType ElementName: javaee:data-sourceType ElementType : data-source
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>data-source</code> element will be created and returned.
    * Otherwise, the first existing <code>data-source</code> element will be returned.
    * @return the instance defined for the element <code>data-source</code> 
    */
   public DataSourceType<WebFragmentType<T>> getOrCreateDataSource()
   {
      List<Node> nodeList = childNode.get("data-source");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new DataSourceTypeImpl<WebFragmentType<T>>(this, "data-source", childNode, nodeList.get(0));
      }
      return createDataSource();
   }

   /**
    * Creates a new <code>data-source</code> element 
    * @return the new created instance of <code>DataSourceType<WebFragmentType<T>></code> 
    */
   public DataSourceType<WebFragmentType<T>> createDataSource()
   {
      return new DataSourceTypeImpl<WebFragmentType<T>>(this, "data-source", childNode);
   }

   /**
    * Returns all <code>data-source</code> elements
    * @return list of <code>data-source</code> 
    */
   public List<DataSourceType<WebFragmentType<T>>> getAllDataSource()
   {
      List<DataSourceType<WebFragmentType<T>>> list = new ArrayList<DataSourceType<WebFragmentType<T>>>();
      List<Node> nodeList = childNode.get("data-source");
      for(Node node: nodeList)
      {
         DataSourceType<WebFragmentType<T>>  type = new DataSourceTypeImpl<WebFragmentType<T>>(this, "data-source", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>data-source</code> elements 
    * @return the current instance of <code>DataSourceType<WebFragmentType<T>></code> 
    */
   public WebFragmentType<T> removeAllDataSource()
   {
      childNode.removeChildren("data-source");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentType ElementName: javaee:jms-connection-factoryType ElementType : jms-connection-factory
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>jms-connection-factory</code> element will be created and returned.
    * Otherwise, the first existing <code>jms-connection-factory</code> element will be returned.
    * @return the instance defined for the element <code>jms-connection-factory</code> 
    */
   public JmsConnectionFactoryType<WebFragmentType<T>> getOrCreateJmsConnectionFactory()
   {
      List<Node> nodeList = childNode.get("jms-connection-factory");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new JmsConnectionFactoryTypeImpl<WebFragmentType<T>>(this, "jms-connection-factory", childNode, nodeList.get(0));
      }
      return createJmsConnectionFactory();
   }

   /**
    * Creates a new <code>jms-connection-factory</code> element 
    * @return the new created instance of <code>JmsConnectionFactoryType<WebFragmentType<T>></code> 
    */
   public JmsConnectionFactoryType<WebFragmentType<T>> createJmsConnectionFactory()
   {
      return new JmsConnectionFactoryTypeImpl<WebFragmentType<T>>(this, "jms-connection-factory", childNode);
   }

   /**
    * Returns all <code>jms-connection-factory</code> elements
    * @return list of <code>jms-connection-factory</code> 
    */
   public List<JmsConnectionFactoryType<WebFragmentType<T>>> getAllJmsConnectionFactory()
   {
      List<JmsConnectionFactoryType<WebFragmentType<T>>> list = new ArrayList<JmsConnectionFactoryType<WebFragmentType<T>>>();
      List<Node> nodeList = childNode.get("jms-connection-factory");
      for(Node node: nodeList)
      {
         JmsConnectionFactoryType<WebFragmentType<T>>  type = new JmsConnectionFactoryTypeImpl<WebFragmentType<T>>(this, "jms-connection-factory", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>jms-connection-factory</code> elements 
    * @return the current instance of <code>JmsConnectionFactoryType<WebFragmentType<T>></code> 
    */
   public WebFragmentType<T> removeAllJmsConnectionFactory()
   {
      childNode.removeChildren("jms-connection-factory");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentType ElementName: javaee:jms-destinationType ElementType : jms-destination
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>jms-destination</code> element will be created and returned.
    * Otherwise, the first existing <code>jms-destination</code> element will be returned.
    * @return the instance defined for the element <code>jms-destination</code> 
    */
   public JmsDestinationType<WebFragmentType<T>> getOrCreateJmsDestination()
   {
      List<Node> nodeList = childNode.get("jms-destination");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new JmsDestinationTypeImpl<WebFragmentType<T>>(this, "jms-destination", childNode, nodeList.get(0));
      }
      return createJmsDestination();
   }

   /**
    * Creates a new <code>jms-destination</code> element 
    * @return the new created instance of <code>JmsDestinationType<WebFragmentType<T>></code> 
    */
   public JmsDestinationType<WebFragmentType<T>> createJmsDestination()
   {
      return new JmsDestinationTypeImpl<WebFragmentType<T>>(this, "jms-destination", childNode);
   }

   /**
    * Returns all <code>jms-destination</code> elements
    * @return list of <code>jms-destination</code> 
    */
   public List<JmsDestinationType<WebFragmentType<T>>> getAllJmsDestination()
   {
      List<JmsDestinationType<WebFragmentType<T>>> list = new ArrayList<JmsDestinationType<WebFragmentType<T>>>();
      List<Node> nodeList = childNode.get("jms-destination");
      for(Node node: nodeList)
      {
         JmsDestinationType<WebFragmentType<T>>  type = new JmsDestinationTypeImpl<WebFragmentType<T>>(this, "jms-destination", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>jms-destination</code> elements 
    * @return the current instance of <code>JmsDestinationType<WebFragmentType<T>></code> 
    */
   public WebFragmentType<T> removeAllJmsDestination()
   {
      childNode.removeChildren("jms-destination");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentType ElementName: javaee:mail-sessionType ElementType : mail-session
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>mail-session</code> element will be created and returned.
    * Otherwise, the first existing <code>mail-session</code> element will be returned.
    * @return the instance defined for the element <code>mail-session</code> 
    */
   public MailSessionType<WebFragmentType<T>> getOrCreateMailSession()
   {
      List<Node> nodeList = childNode.get("mail-session");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new MailSessionTypeImpl<WebFragmentType<T>>(this, "mail-session", childNode, nodeList.get(0));
      }
      return createMailSession();
   }

   /**
    * Creates a new <code>mail-session</code> element 
    * @return the new created instance of <code>MailSessionType<WebFragmentType<T>></code> 
    */
   public MailSessionType<WebFragmentType<T>> createMailSession()
   {
      return new MailSessionTypeImpl<WebFragmentType<T>>(this, "mail-session", childNode);
   }

   /**
    * Returns all <code>mail-session</code> elements
    * @return list of <code>mail-session</code> 
    */
   public List<MailSessionType<WebFragmentType<T>>> getAllMailSession()
   {
      List<MailSessionType<WebFragmentType<T>>> list = new ArrayList<MailSessionType<WebFragmentType<T>>>();
      List<Node> nodeList = childNode.get("mail-session");
      for(Node node: nodeList)
      {
         MailSessionType<WebFragmentType<T>>  type = new MailSessionTypeImpl<WebFragmentType<T>>(this, "mail-session", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>mail-session</code> elements 
    * @return the current instance of <code>MailSessionType<WebFragmentType<T>></code> 
    */
   public WebFragmentType<T> removeAllMailSession()
   {
      childNode.removeChildren("mail-session");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentType ElementName: javaee:connection-factory-resourceType ElementType : connection-factory
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>connection-factory</code> element will be created and returned.
    * Otherwise, the first existing <code>connection-factory</code> element will be returned.
    * @return the instance defined for the element <code>connection-factory</code> 
    */
   public ConnectionFactoryResourceType<WebFragmentType<T>> getOrCreateConnectionFactory()
   {
      List<Node> nodeList = childNode.get("connection-factory");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ConnectionFactoryResourceTypeImpl<WebFragmentType<T>>(this, "connection-factory", childNode, nodeList.get(0));
      }
      return createConnectionFactory();
   }

   /**
    * Creates a new <code>connection-factory</code> element 
    * @return the new created instance of <code>ConnectionFactoryResourceType<WebFragmentType<T>></code> 
    */
   public ConnectionFactoryResourceType<WebFragmentType<T>> createConnectionFactory()
   {
      return new ConnectionFactoryResourceTypeImpl<WebFragmentType<T>>(this, "connection-factory", childNode);
   }

   /**
    * Returns all <code>connection-factory</code> elements
    * @return list of <code>connection-factory</code> 
    */
   public List<ConnectionFactoryResourceType<WebFragmentType<T>>> getAllConnectionFactory()
   {
      List<ConnectionFactoryResourceType<WebFragmentType<T>>> list = new ArrayList<ConnectionFactoryResourceType<WebFragmentType<T>>>();
      List<Node> nodeList = childNode.get("connection-factory");
      for(Node node: nodeList)
      {
         ConnectionFactoryResourceType<WebFragmentType<T>>  type = new ConnectionFactoryResourceTypeImpl<WebFragmentType<T>>(this, "connection-factory", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>connection-factory</code> elements 
    * @return the current instance of <code>ConnectionFactoryResourceType<WebFragmentType<T>></code> 
    */
   public WebFragmentType<T> removeAllConnectionFactory()
   {
      childNode.removeChildren("connection-factory");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentType ElementName: javaee:administered-objectType ElementType : administered-object
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>administered-object</code> element will be created and returned.
    * Otherwise, the first existing <code>administered-object</code> element will be returned.
    * @return the instance defined for the element <code>administered-object</code> 
    */
   public AdministeredObjectType<WebFragmentType<T>> getOrCreateAdministeredObject()
   {
      List<Node> nodeList = childNode.get("administered-object");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new AdministeredObjectTypeImpl<WebFragmentType<T>>(this, "administered-object", childNode, nodeList.get(0));
      }
      return createAdministeredObject();
   }

   /**
    * Creates a new <code>administered-object</code> element 
    * @return the new created instance of <code>AdministeredObjectType<WebFragmentType<T>></code> 
    */
   public AdministeredObjectType<WebFragmentType<T>> createAdministeredObject()
   {
      return new AdministeredObjectTypeImpl<WebFragmentType<T>>(this, "administered-object", childNode);
   }

   /**
    * Returns all <code>administered-object</code> elements
    * @return list of <code>administered-object</code> 
    */
   public List<AdministeredObjectType<WebFragmentType<T>>> getAllAdministeredObject()
   {
      List<AdministeredObjectType<WebFragmentType<T>>> list = new ArrayList<AdministeredObjectType<WebFragmentType<T>>>();
      List<Node> nodeList = childNode.get("administered-object");
      for(Node node: nodeList)
      {
         AdministeredObjectType<WebFragmentType<T>>  type = new AdministeredObjectTypeImpl<WebFragmentType<T>>(this, "administered-object", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>administered-object</code> elements 
    * @return the current instance of <code>AdministeredObjectType<WebFragmentType<T>></code> 
    */
   public WebFragmentType<T> removeAllAdministeredObject()
   {
      childNode.removeChildren("administered-object");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentType ElementName: javaee:service-refType ElementType : service-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>service-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>service-ref</code> element will be returned.
    * @return the instance defined for the element <code>service-ref</code> 
    */
   public ServiceRefType<WebFragmentType<T>> getOrCreateServiceRef()
   {
      List<Node> nodeList = childNode.get("service-ref");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ServiceRefTypeImpl<WebFragmentType<T>>(this, "service-ref", childNode, nodeList.get(0));
      }
      return createServiceRef();
   }

   /**
    * Creates a new <code>service-ref</code> element 
    * @return the new created instance of <code>ServiceRefType<WebFragmentType<T>></code> 
    */
   public ServiceRefType<WebFragmentType<T>> createServiceRef()
   {
      return new ServiceRefTypeImpl<WebFragmentType<T>>(this, "service-ref", childNode);
   }

   /**
    * Returns all <code>service-ref</code> elements
    * @return list of <code>service-ref</code> 
    */
   public List<ServiceRefType<WebFragmentType<T>>> getAllServiceRef()
   {
      List<ServiceRefType<WebFragmentType<T>>> list = new ArrayList<ServiceRefType<WebFragmentType<T>>>();
      List<Node> nodeList = childNode.get("service-ref");
      for(Node node: nodeList)
      {
         ServiceRefType<WebFragmentType<T>>  type = new ServiceRefTypeImpl<WebFragmentType<T>>(this, "service-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>service-ref</code> elements 
    * @return the current instance of <code>ServiceRefType<WebFragmentType<T>></code> 
    */
   public WebFragmentType<T> removeAllServiceRef()
   {
      childNode.removeChildren("service-ref");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentType ElementName: javaee:web-app-versionType ElementType : version
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of <code>WebFragmentType<T></code> 
    */
   public WebFragmentType<T> version(WebAppVersionType version)
   {
      childNode.attribute("version", version);
      return this;
   }

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of <code>WebFragmentType<T></code> 
    */
   public WebFragmentType<T> version(String version)
   {
      childNode.attribute("version", version);
      return this;
   }

   /**
    * Returns the <code>version</code> attribute
    * @return the value defined for the attribute <code>version</code> 
    */
   public WebAppVersionType getVersion()
   {
      return WebAppVersionType.getFromStringValue(childNode.getAttribute("version"));
   }

   /**
    * Returns the <code>version</code> attribute
    * @return the value found for the element <code>version</code> 
    */
   public String  getVersionAsString()
   {
      return childNode.getAttribute("version");
   }

   /**
    * Removes the <code>version</code> attribute 
    * @return the current instance of <code>WebFragmentType<T></code> 
    */
   public WebFragmentType<T> removeVersion()
   {
      childNode.removeAttribute("version");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>WebFragmentType<T></code> 
    */
   public WebFragmentType<T> id(String id)
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
    * @return the current instance of <code>WebFragmentType<T></code> 
    */
   public WebFragmentType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentType ElementName: xsd:boolean ElementType : metadata-complete
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>metadata-complete</code> attribute
    * @param metadataComplete the value for the attribute <code>metadata-complete</code> 
    * @return the current instance of <code>WebFragmentType<T></code> 
    */
   public WebFragmentType<T> metadataComplete(Boolean metadataComplete)
   {
      childNode.attribute("metadata-complete", metadataComplete);
      return this;
   }

   /**
    * Returns the <code>metadata-complete</code> attribute
    * @return the value defined for the attribute <code>metadata-complete</code> 
    */
   public Boolean isMetadataComplete()
   {
      return Strings.isTrue(childNode.getAttribute("metadata-complete"));
   }

   /**
    * Removes the <code>metadata-complete</code> attribute 
    * @return the current instance of <code>WebFragmentType<T></code> 
    */
   public WebFragmentType<T> removeMetadataComplete()
   {
      childNode.removeAttribute("metadata-complete");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentType ElementName: xsd:token ElementType : name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>name</code> elements, 
    * a new <code>name</code> element 
    * @param values list of <code>name</code> objects 
    * @return the current instance of <code>WebFragmentType<T></code> 
    */
   public WebFragmentType<T> name(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("name").text(name);
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
      List<Node> nodes = childNode.get("name");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>name</code> element 
    * @return the current instance of <code>WebFragmentType<T></code> 
    */
   public WebFragmentType<T> removeAllName()
   {
      childNode.removeChildren("name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFragmentType ElementName: javaee:orderingType ElementType : ordering
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>ordering</code> element will be created and returned.
    * Otherwise, the first existing <code>ordering</code> element will be returned.
    * @return the instance defined for the element <code>ordering</code> 
    */
   public OrderingType<WebFragmentType<T>> getOrCreateOrdering()
   {
      List<Node> nodeList = childNode.get("ordering");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new OrderingTypeImpl<WebFragmentType<T>>(this, "ordering", childNode, nodeList.get(0));
      }
      return createOrdering();
   }

   /**
    * Creates a new <code>ordering</code> element 
    * @return the new created instance of <code>OrderingType<WebFragmentType<T>></code> 
    */
   public OrderingType<WebFragmentType<T>> createOrdering()
   {
      return new OrderingTypeImpl<WebFragmentType<T>>(this, "ordering", childNode);
   }

   /**
    * Returns all <code>ordering</code> elements
    * @return list of <code>ordering</code> 
    */
   public List<OrderingType<WebFragmentType<T>>> getAllOrdering()
   {
      List<OrderingType<WebFragmentType<T>>> list = new ArrayList<OrderingType<WebFragmentType<T>>>();
      List<Node> nodeList = childNode.get("ordering");
      for(Node node: nodeList)
      {
         OrderingType<WebFragmentType<T>>  type = new OrderingTypeImpl<WebFragmentType<T>>(this, "ordering", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>ordering</code> elements 
    * @return the current instance of <code>OrderingType<WebFragmentType<T>></code> 
    */
   public WebFragmentType<T> removeAllOrdering()
   {
      childNode.removeChildren("ordering");
      return this;
   }
}
