package org.jboss.shrinkwrap.descriptor.impl.webcommon30; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
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
import org.jboss.shrinkwrap.descriptor.api.webcommon30.AbsoluteOrderingType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.ErrorPageType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.FilterMappingType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.FilterType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.LocaleEncodingMappingListType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.LoginConfigType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.MimeMappingType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.SecurityConstraintType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.ServletMappingType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.ServletType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.SessionConfigType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.WebAppType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.WebAppVersionType;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.WelcomeFileListType;
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
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> web-appType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class WebAppTypeImpl<T> implements Child<T>, WebAppType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public WebAppTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public WebAppTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppType ElementName: javaee:emptyType ElementType : distributable
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>distributable</code> element 
    * @return the current instance of <code>WebAppType<T></code> 
    */
   public WebAppType<T> distributable()
   {
      childNode.getOrCreate("distributable");
      return this;
   }

   /**
    * Removes the <code>distributable</code> element 
    * @return the current instance of <code>WebAppType<T></code> 
    */
   public Boolean isDistributable()
   {
      return childNode.getSingle("distributable") != null;
   }

   /**
    * Removes the <code>distributable</code> element 
    * @return the current instance of <code>WebAppType<T></code> 
    */
   public WebAppType<T> removeDistributable()
   {
      childNode.removeChild("distributable");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppType ElementName: javaee:param-valueType ElementType : context-param
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>context-param</code> element will be created and returned.
    * Otherwise, the first existing <code>context-param</code> element will be returned.
    * @return the instance defined for the element <code>context-param</code> 
    */
   public ParamValueType<WebAppType<T>> getOrCreateContextParam()
   {
      List<Node> nodeList = childNode.get("context-param");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ParamValueTypeImpl<WebAppType<T>>(this, "context-param", childNode, nodeList.get(0));
      }
      return createContextParam();
   }

   /**
    * Creates a new <code>context-param</code> element 
    * @return the new created instance of <code>ParamValueType<WebAppType<T>></code> 
    */
   public ParamValueType<WebAppType<T>> createContextParam()
   {
      return new ParamValueTypeImpl<WebAppType<T>>(this, "context-param", childNode);
   }

   /**
    * Returns all <code>context-param</code> elements
    * @return list of <code>context-param</code> 
    */
   public List<ParamValueType<WebAppType<T>>> getAllContextParam()
   {
      List<ParamValueType<WebAppType<T>>> list = new ArrayList<ParamValueType<WebAppType<T>>>();
      List<Node> nodeList = childNode.get("context-param");
      for(Node node: nodeList)
      {
         ParamValueType<WebAppType<T>>  type = new ParamValueTypeImpl<WebAppType<T>>(this, "context-param", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>context-param</code> elements 
    * @return the current instance of <code>ParamValueType<WebAppType<T>></code> 
    */
   public WebAppType<T> removeAllContextParam()
   {
      childNode.removeChildren("context-param");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppType ElementName: javaee:filterType ElementType : filter
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>filter</code> element will be created and returned.
    * Otherwise, the first existing <code>filter</code> element will be returned.
    * @return the instance defined for the element <code>filter</code> 
    */
   public FilterType<WebAppType<T>> getOrCreateFilter()
   {
      List<Node> nodeList = childNode.get("filter");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new FilterTypeImpl<WebAppType<T>>(this, "filter", childNode, nodeList.get(0));
      }
      return createFilter();
   }

   /**
    * Creates a new <code>filter</code> element 
    * @return the new created instance of <code>FilterType<WebAppType<T>></code> 
    */
   public FilterType<WebAppType<T>> createFilter()
   {
      return new FilterTypeImpl<WebAppType<T>>(this, "filter", childNode);
   }

   /**
    * Returns all <code>filter</code> elements
    * @return list of <code>filter</code> 
    */
   public List<FilterType<WebAppType<T>>> getAllFilter()
   {
      List<FilterType<WebAppType<T>>> list = new ArrayList<FilterType<WebAppType<T>>>();
      List<Node> nodeList = childNode.get("filter");
      for(Node node: nodeList)
      {
         FilterType<WebAppType<T>>  type = new FilterTypeImpl<WebAppType<T>>(this, "filter", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>filter</code> elements 
    * @return the current instance of <code>FilterType<WebAppType<T>></code> 
    */
   public WebAppType<T> removeAllFilter()
   {
      childNode.removeChildren("filter");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppType ElementName: javaee:filter-mappingType ElementType : filter-mapping
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>filter-mapping</code> element will be created and returned.
    * Otherwise, the first existing <code>filter-mapping</code> element will be returned.
    * @return the instance defined for the element <code>filter-mapping</code> 
    */
   public FilterMappingType<WebAppType<T>> getOrCreateFilterMapping()
   {
      List<Node> nodeList = childNode.get("filter-mapping");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new FilterMappingTypeImpl<WebAppType<T>>(this, "filter-mapping", childNode, nodeList.get(0));
      }
      return createFilterMapping();
   }

   /**
    * Creates a new <code>filter-mapping</code> element 
    * @return the new created instance of <code>FilterMappingType<WebAppType<T>></code> 
    */
   public FilterMappingType<WebAppType<T>> createFilterMapping()
   {
      return new FilterMappingTypeImpl<WebAppType<T>>(this, "filter-mapping", childNode);
   }

   /**
    * Returns all <code>filter-mapping</code> elements
    * @return list of <code>filter-mapping</code> 
    */
   public List<FilterMappingType<WebAppType<T>>> getAllFilterMapping()
   {
      List<FilterMappingType<WebAppType<T>>> list = new ArrayList<FilterMappingType<WebAppType<T>>>();
      List<Node> nodeList = childNode.get("filter-mapping");
      for(Node node: nodeList)
      {
         FilterMappingType<WebAppType<T>>  type = new FilterMappingTypeImpl<WebAppType<T>>(this, "filter-mapping", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>filter-mapping</code> elements 
    * @return the current instance of <code>FilterMappingType<WebAppType<T>></code> 
    */
   public WebAppType<T> removeAllFilterMapping()
   {
      childNode.removeChildren("filter-mapping");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppType ElementName: javaee:listenerType ElementType : listener
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>listener</code> element will be created and returned.
    * Otherwise, the first existing <code>listener</code> element will be returned.
    * @return the instance defined for the element <code>listener</code> 
    */
   public ListenerType<WebAppType<T>> getOrCreateListener()
   {
      List<Node> nodeList = childNode.get("listener");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ListenerTypeImpl<WebAppType<T>>(this, "listener", childNode, nodeList.get(0));
      }
      return createListener();
   }

   /**
    * Creates a new <code>listener</code> element 
    * @return the new created instance of <code>ListenerType<WebAppType<T>></code> 
    */
   public ListenerType<WebAppType<T>> createListener()
   {
      return new ListenerTypeImpl<WebAppType<T>>(this, "listener", childNode);
   }

   /**
    * Returns all <code>listener</code> elements
    * @return list of <code>listener</code> 
    */
   public List<ListenerType<WebAppType<T>>> getAllListener()
   {
      List<ListenerType<WebAppType<T>>> list = new ArrayList<ListenerType<WebAppType<T>>>();
      List<Node> nodeList = childNode.get("listener");
      for(Node node: nodeList)
      {
         ListenerType<WebAppType<T>>  type = new ListenerTypeImpl<WebAppType<T>>(this, "listener", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>listener</code> elements 
    * @return the current instance of <code>ListenerType<WebAppType<T>></code> 
    */
   public WebAppType<T> removeAllListener()
   {
      childNode.removeChildren("listener");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppType ElementName: javaee:servletType ElementType : servlet
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>servlet</code> element will be created and returned.
    * Otherwise, the first existing <code>servlet</code> element will be returned.
    * @return the instance defined for the element <code>servlet</code> 
    */
   public ServletType<WebAppType<T>> getOrCreateServlet()
   {
      List<Node> nodeList = childNode.get("servlet");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ServletTypeImpl<WebAppType<T>>(this, "servlet", childNode, nodeList.get(0));
      }
      return createServlet();
   }

   /**
    * Creates a new <code>servlet</code> element 
    * @return the new created instance of <code>ServletType<WebAppType<T>></code> 
    */
   public ServletType<WebAppType<T>> createServlet()
   {
      return new ServletTypeImpl<WebAppType<T>>(this, "servlet", childNode);
   }

   /**
    * Returns all <code>servlet</code> elements
    * @return list of <code>servlet</code> 
    */
   public List<ServletType<WebAppType<T>>> getAllServlet()
   {
      List<ServletType<WebAppType<T>>> list = new ArrayList<ServletType<WebAppType<T>>>();
      List<Node> nodeList = childNode.get("servlet");
      for(Node node: nodeList)
      {
         ServletType<WebAppType<T>>  type = new ServletTypeImpl<WebAppType<T>>(this, "servlet", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>servlet</code> elements 
    * @return the current instance of <code>ServletType<WebAppType<T>></code> 
    */
   public WebAppType<T> removeAllServlet()
   {
      childNode.removeChildren("servlet");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppType ElementName: javaee:servlet-mappingType ElementType : servlet-mapping
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>servlet-mapping</code> element will be created and returned.
    * Otherwise, the first existing <code>servlet-mapping</code> element will be returned.
    * @return the instance defined for the element <code>servlet-mapping</code> 
    */
   public ServletMappingType<WebAppType<T>> getOrCreateServletMapping()
   {
      List<Node> nodeList = childNode.get("servlet-mapping");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ServletMappingTypeImpl<WebAppType<T>>(this, "servlet-mapping", childNode, nodeList.get(0));
      }
      return createServletMapping();
   }

   /**
    * Creates a new <code>servlet-mapping</code> element 
    * @return the new created instance of <code>ServletMappingType<WebAppType<T>></code> 
    */
   public ServletMappingType<WebAppType<T>> createServletMapping()
   {
      return new ServletMappingTypeImpl<WebAppType<T>>(this, "servlet-mapping", childNode);
   }

   /**
    * Returns all <code>servlet-mapping</code> elements
    * @return list of <code>servlet-mapping</code> 
    */
   public List<ServletMappingType<WebAppType<T>>> getAllServletMapping()
   {
      List<ServletMappingType<WebAppType<T>>> list = new ArrayList<ServletMappingType<WebAppType<T>>>();
      List<Node> nodeList = childNode.get("servlet-mapping");
      for(Node node: nodeList)
      {
         ServletMappingType<WebAppType<T>>  type = new ServletMappingTypeImpl<WebAppType<T>>(this, "servlet-mapping", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>servlet-mapping</code> elements 
    * @return the current instance of <code>ServletMappingType<WebAppType<T>></code> 
    */
   public WebAppType<T> removeAllServletMapping()
   {
      childNode.removeChildren("servlet-mapping");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppType ElementName: javaee:session-configType ElementType : session-config
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>session-config</code> element will be created and returned.
    * Otherwise, the first existing <code>session-config</code> element will be returned.
    * @return the instance defined for the element <code>session-config</code> 
    */
   public SessionConfigType<WebAppType<T>> getOrCreateSessionConfig()
   {
      List<Node> nodeList = childNode.get("session-config");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new SessionConfigTypeImpl<WebAppType<T>>(this, "session-config", childNode, nodeList.get(0));
      }
      return createSessionConfig();
   }

   /**
    * Creates a new <code>session-config</code> element 
    * @return the new created instance of <code>SessionConfigType<WebAppType<T>></code> 
    */
   public SessionConfigType<WebAppType<T>> createSessionConfig()
   {
      return new SessionConfigTypeImpl<WebAppType<T>>(this, "session-config", childNode);
   }

   /**
    * Returns all <code>session-config</code> elements
    * @return list of <code>session-config</code> 
    */
   public List<SessionConfigType<WebAppType<T>>> getAllSessionConfig()
   {
      List<SessionConfigType<WebAppType<T>>> list = new ArrayList<SessionConfigType<WebAppType<T>>>();
      List<Node> nodeList = childNode.get("session-config");
      for(Node node: nodeList)
      {
         SessionConfigType<WebAppType<T>>  type = new SessionConfigTypeImpl<WebAppType<T>>(this, "session-config", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>session-config</code> elements 
    * @return the current instance of <code>SessionConfigType<WebAppType<T>></code> 
    */
   public WebAppType<T> removeAllSessionConfig()
   {
      childNode.removeChildren("session-config");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppType ElementName: javaee:mime-mappingType ElementType : mime-mapping
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>mime-mapping</code> element will be created and returned.
    * Otherwise, the first existing <code>mime-mapping</code> element will be returned.
    * @return the instance defined for the element <code>mime-mapping</code> 
    */
   public MimeMappingType<WebAppType<T>> getOrCreateMimeMapping()
   {
      List<Node> nodeList = childNode.get("mime-mapping");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new MimeMappingTypeImpl<WebAppType<T>>(this, "mime-mapping", childNode, nodeList.get(0));
      }
      return createMimeMapping();
   }

   /**
    * Creates a new <code>mime-mapping</code> element 
    * @return the new created instance of <code>MimeMappingType<WebAppType<T>></code> 
    */
   public MimeMappingType<WebAppType<T>> createMimeMapping()
   {
      return new MimeMappingTypeImpl<WebAppType<T>>(this, "mime-mapping", childNode);
   }

   /**
    * Returns all <code>mime-mapping</code> elements
    * @return list of <code>mime-mapping</code> 
    */
   public List<MimeMappingType<WebAppType<T>>> getAllMimeMapping()
   {
      List<MimeMappingType<WebAppType<T>>> list = new ArrayList<MimeMappingType<WebAppType<T>>>();
      List<Node> nodeList = childNode.get("mime-mapping");
      for(Node node: nodeList)
      {
         MimeMappingType<WebAppType<T>>  type = new MimeMappingTypeImpl<WebAppType<T>>(this, "mime-mapping", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>mime-mapping</code> elements 
    * @return the current instance of <code>MimeMappingType<WebAppType<T>></code> 
    */
   public WebAppType<T> removeAllMimeMapping()
   {
      childNode.removeChildren("mime-mapping");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppType ElementName: javaee:welcome-file-listType ElementType : welcome-file-list
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>welcome-file-list</code> element will be created and returned.
    * Otherwise, the first existing <code>welcome-file-list</code> element will be returned.
    * @return the instance defined for the element <code>welcome-file-list</code> 
    */
   public WelcomeFileListType<WebAppType<T>> getOrCreateWelcomeFileList()
   {
      List<Node> nodeList = childNode.get("welcome-file-list");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new WelcomeFileListTypeImpl<WebAppType<T>>(this, "welcome-file-list", childNode, nodeList.get(0));
      }
      return createWelcomeFileList();
   }

   /**
    * Creates a new <code>welcome-file-list</code> element 
    * @return the new created instance of <code>WelcomeFileListType<WebAppType<T>></code> 
    */
   public WelcomeFileListType<WebAppType<T>> createWelcomeFileList()
   {
      return new WelcomeFileListTypeImpl<WebAppType<T>>(this, "welcome-file-list", childNode);
   }

   /**
    * Returns all <code>welcome-file-list</code> elements
    * @return list of <code>welcome-file-list</code> 
    */
   public List<WelcomeFileListType<WebAppType<T>>> getAllWelcomeFileList()
   {
      List<WelcomeFileListType<WebAppType<T>>> list = new ArrayList<WelcomeFileListType<WebAppType<T>>>();
      List<Node> nodeList = childNode.get("welcome-file-list");
      for(Node node: nodeList)
      {
         WelcomeFileListType<WebAppType<T>>  type = new WelcomeFileListTypeImpl<WebAppType<T>>(this, "welcome-file-list", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>welcome-file-list</code> elements 
    * @return the current instance of <code>WelcomeFileListType<WebAppType<T>></code> 
    */
   public WebAppType<T> removeAllWelcomeFileList()
   {
      childNode.removeChildren("welcome-file-list");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppType ElementName: javaee:error-pageType ElementType : error-page
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>error-page</code> element will be created and returned.
    * Otherwise, the first existing <code>error-page</code> element will be returned.
    * @return the instance defined for the element <code>error-page</code> 
    */
   public ErrorPageType<WebAppType<T>> getOrCreateErrorPage()
   {
      List<Node> nodeList = childNode.get("error-page");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ErrorPageTypeImpl<WebAppType<T>>(this, "error-page", childNode, nodeList.get(0));
      }
      return createErrorPage();
   }

   /**
    * Creates a new <code>error-page</code> element 
    * @return the new created instance of <code>ErrorPageType<WebAppType<T>></code> 
    */
   public ErrorPageType<WebAppType<T>> createErrorPage()
   {
      return new ErrorPageTypeImpl<WebAppType<T>>(this, "error-page", childNode);
   }

   /**
    * Returns all <code>error-page</code> elements
    * @return list of <code>error-page</code> 
    */
   public List<ErrorPageType<WebAppType<T>>> getAllErrorPage()
   {
      List<ErrorPageType<WebAppType<T>>> list = new ArrayList<ErrorPageType<WebAppType<T>>>();
      List<Node> nodeList = childNode.get("error-page");
      for(Node node: nodeList)
      {
         ErrorPageType<WebAppType<T>>  type = new ErrorPageTypeImpl<WebAppType<T>>(this, "error-page", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>error-page</code> elements 
    * @return the current instance of <code>ErrorPageType<WebAppType<T>></code> 
    */
   public WebAppType<T> removeAllErrorPage()
   {
      childNode.removeChildren("error-page");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppType ElementName: javaee:jsp-configType ElementType : jsp-config
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>jsp-config</code> element will be created and returned.
    * Otherwise, the first existing <code>jsp-config</code> element will be returned.
    * @return the instance defined for the element <code>jsp-config</code> 
    */
   public JspConfigType<WebAppType<T>> getOrCreateJspConfig()
   {
      List<Node> nodeList = childNode.get("jsp-config");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new JspConfigTypeImpl<WebAppType<T>>(this, "jsp-config", childNode, nodeList.get(0));
      }
      return createJspConfig();
   }

   /**
    * Creates a new <code>jsp-config</code> element 
    * @return the new created instance of <code>JspConfigType<WebAppType<T>></code> 
    */
   public JspConfigType<WebAppType<T>> createJspConfig()
   {
      return new JspConfigTypeImpl<WebAppType<T>>(this, "jsp-config", childNode);
   }

   /**
    * Returns all <code>jsp-config</code> elements
    * @return list of <code>jsp-config</code> 
    */
   public List<JspConfigType<WebAppType<T>>> getAllJspConfig()
   {
      List<JspConfigType<WebAppType<T>>> list = new ArrayList<JspConfigType<WebAppType<T>>>();
      List<Node> nodeList = childNode.get("jsp-config");
      for(Node node: nodeList)
      {
         JspConfigType<WebAppType<T>>  type = new JspConfigTypeImpl<WebAppType<T>>(this, "jsp-config", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>jsp-config</code> elements 
    * @return the current instance of <code>JspConfigType<WebAppType<T>></code> 
    */
   public WebAppType<T> removeAllJspConfig()
   {
      childNode.removeChildren("jsp-config");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppType ElementName: javaee:security-constraintType ElementType : security-constraint
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>security-constraint</code> element will be created and returned.
    * Otherwise, the first existing <code>security-constraint</code> element will be returned.
    * @return the instance defined for the element <code>security-constraint</code> 
    */
   public SecurityConstraintType<WebAppType<T>> getOrCreateSecurityConstraint()
   {
      List<Node> nodeList = childNode.get("security-constraint");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new SecurityConstraintTypeImpl<WebAppType<T>>(this, "security-constraint", childNode, nodeList.get(0));
      }
      return createSecurityConstraint();
   }

   /**
    * Creates a new <code>security-constraint</code> element 
    * @return the new created instance of <code>SecurityConstraintType<WebAppType<T>></code> 
    */
   public SecurityConstraintType<WebAppType<T>> createSecurityConstraint()
   {
      return new SecurityConstraintTypeImpl<WebAppType<T>>(this, "security-constraint", childNode);
   }

   /**
    * Returns all <code>security-constraint</code> elements
    * @return list of <code>security-constraint</code> 
    */
   public List<SecurityConstraintType<WebAppType<T>>> getAllSecurityConstraint()
   {
      List<SecurityConstraintType<WebAppType<T>>> list = new ArrayList<SecurityConstraintType<WebAppType<T>>>();
      List<Node> nodeList = childNode.get("security-constraint");
      for(Node node: nodeList)
      {
         SecurityConstraintType<WebAppType<T>>  type = new SecurityConstraintTypeImpl<WebAppType<T>>(this, "security-constraint", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>security-constraint</code> elements 
    * @return the current instance of <code>SecurityConstraintType<WebAppType<T>></code> 
    */
   public WebAppType<T> removeAllSecurityConstraint()
   {
      childNode.removeChildren("security-constraint");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppType ElementName: javaee:login-configType ElementType : login-config
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>login-config</code> element will be created and returned.
    * Otherwise, the first existing <code>login-config</code> element will be returned.
    * @return the instance defined for the element <code>login-config</code> 
    */
   public LoginConfigType<WebAppType<T>> getOrCreateLoginConfig()
   {
      List<Node> nodeList = childNode.get("login-config");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new LoginConfigTypeImpl<WebAppType<T>>(this, "login-config", childNode, nodeList.get(0));
      }
      return createLoginConfig();
   }

   /**
    * Creates a new <code>login-config</code> element 
    * @return the new created instance of <code>LoginConfigType<WebAppType<T>></code> 
    */
   public LoginConfigType<WebAppType<T>> createLoginConfig()
   {
      return new LoginConfigTypeImpl<WebAppType<T>>(this, "login-config", childNode);
   }

   /**
    * Returns all <code>login-config</code> elements
    * @return list of <code>login-config</code> 
    */
   public List<LoginConfigType<WebAppType<T>>> getAllLoginConfig()
   {
      List<LoginConfigType<WebAppType<T>>> list = new ArrayList<LoginConfigType<WebAppType<T>>>();
      List<Node> nodeList = childNode.get("login-config");
      for(Node node: nodeList)
      {
         LoginConfigType<WebAppType<T>>  type = new LoginConfigTypeImpl<WebAppType<T>>(this, "login-config", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>login-config</code> elements 
    * @return the current instance of <code>LoginConfigType<WebAppType<T>></code> 
    */
   public WebAppType<T> removeAllLoginConfig()
   {
      childNode.removeChildren("login-config");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppType ElementName: javaee:security-roleType ElementType : security-role
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>security-role</code> element will be created and returned.
    * Otherwise, the first existing <code>security-role</code> element will be returned.
    * @return the instance defined for the element <code>security-role</code> 
    */
   public SecurityRoleType<WebAppType<T>> getOrCreateSecurityRole()
   {
      List<Node> nodeList = childNode.get("security-role");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new SecurityRoleTypeImpl<WebAppType<T>>(this, "security-role", childNode, nodeList.get(0));
      }
      return createSecurityRole();
   }

   /**
    * Creates a new <code>security-role</code> element 
    * @return the new created instance of <code>SecurityRoleType<WebAppType<T>></code> 
    */
   public SecurityRoleType<WebAppType<T>> createSecurityRole()
   {
      return new SecurityRoleTypeImpl<WebAppType<T>>(this, "security-role", childNode);
   }

   /**
    * Returns all <code>security-role</code> elements
    * @return list of <code>security-role</code> 
    */
   public List<SecurityRoleType<WebAppType<T>>> getAllSecurityRole()
   {
      List<SecurityRoleType<WebAppType<T>>> list = new ArrayList<SecurityRoleType<WebAppType<T>>>();
      List<Node> nodeList = childNode.get("security-role");
      for(Node node: nodeList)
      {
         SecurityRoleType<WebAppType<T>>  type = new SecurityRoleTypeImpl<WebAppType<T>>(this, "security-role", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>security-role</code> elements 
    * @return the current instance of <code>SecurityRoleType<WebAppType<T>></code> 
    */
   public WebAppType<T> removeAllSecurityRole()
   {
      childNode.removeChildren("security-role");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppType ElementName: javaee:message-destinationType ElementType : message-destination
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>message-destination</code> element will be created and returned.
    * Otherwise, the first existing <code>message-destination</code> element will be returned.
    * @return the instance defined for the element <code>message-destination</code> 
    */
   public MessageDestinationType<WebAppType<T>> getOrCreateMessageDestination()
   {
      List<Node> nodeList = childNode.get("message-destination");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new MessageDestinationTypeImpl<WebAppType<T>>(this, "message-destination", childNode, nodeList.get(0));
      }
      return createMessageDestination();
   }

   /**
    * Creates a new <code>message-destination</code> element 
    * @return the new created instance of <code>MessageDestinationType<WebAppType<T>></code> 
    */
   public MessageDestinationType<WebAppType<T>> createMessageDestination()
   {
      return new MessageDestinationTypeImpl<WebAppType<T>>(this, "message-destination", childNode);
   }

   /**
    * Returns all <code>message-destination</code> elements
    * @return list of <code>message-destination</code> 
    */
   public List<MessageDestinationType<WebAppType<T>>> getAllMessageDestination()
   {
      List<MessageDestinationType<WebAppType<T>>> list = new ArrayList<MessageDestinationType<WebAppType<T>>>();
      List<Node> nodeList = childNode.get("message-destination");
      for(Node node: nodeList)
      {
         MessageDestinationType<WebAppType<T>>  type = new MessageDestinationTypeImpl<WebAppType<T>>(this, "message-destination", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>message-destination</code> elements 
    * @return the current instance of <code>MessageDestinationType<WebAppType<T>></code> 
    */
   public WebAppType<T> removeAllMessageDestination()
   {
      childNode.removeChildren("message-destination");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppType ElementName: javaee:locale-encoding-mapping-listType ElementType : locale-encoding-mapping-list
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>locale-encoding-mapping-list</code> element will be created and returned.
    * Otherwise, the first existing <code>locale-encoding-mapping-list</code> element will be returned.
    * @return the instance defined for the element <code>locale-encoding-mapping-list</code> 
    */
   public LocaleEncodingMappingListType<WebAppType<T>> getOrCreateLocaleEncodingMappingList()
   {
      List<Node> nodeList = childNode.get("locale-encoding-mapping-list");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new LocaleEncodingMappingListTypeImpl<WebAppType<T>>(this, "locale-encoding-mapping-list", childNode, nodeList.get(0));
      }
      return createLocaleEncodingMappingList();
   }

   /**
    * Creates a new <code>locale-encoding-mapping-list</code> element 
    * @return the new created instance of <code>LocaleEncodingMappingListType<WebAppType<T>></code> 
    */
   public LocaleEncodingMappingListType<WebAppType<T>> createLocaleEncodingMappingList()
   {
      return new LocaleEncodingMappingListTypeImpl<WebAppType<T>>(this, "locale-encoding-mapping-list", childNode);
   }

   /**
    * Returns all <code>locale-encoding-mapping-list</code> elements
    * @return list of <code>locale-encoding-mapping-list</code> 
    */
   public List<LocaleEncodingMappingListType<WebAppType<T>>> getAllLocaleEncodingMappingList()
   {
      List<LocaleEncodingMappingListType<WebAppType<T>>> list = new ArrayList<LocaleEncodingMappingListType<WebAppType<T>>>();
      List<Node> nodeList = childNode.get("locale-encoding-mapping-list");
      for(Node node: nodeList)
      {
         LocaleEncodingMappingListType<WebAppType<T>>  type = new LocaleEncodingMappingListTypeImpl<WebAppType<T>>(this, "locale-encoding-mapping-list", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>locale-encoding-mapping-list</code> elements 
    * @return the current instance of <code>LocaleEncodingMappingListType<WebAppType<T>></code> 
    */
   public WebAppType<T> removeAllLocaleEncodingMappingList()
   {
      childNode.removeChildren("locale-encoding-mapping-list");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>WebAppType<T></code> 
    */
   public WebAppType<T> description(String ... values)
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
    * @return the current instance of <code>WebAppType<T></code> 
    */
   public WebAppType<T> removeAllDescription()
   {
      childNode.removeChildren("description");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppType ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>WebAppType<T></code> 
    */
   public WebAppType<T> displayName(String ... values)
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
    * @return the current instance of <code>WebAppType<T></code> 
    */
   public WebAppType<T> removeAllDisplayName()
   {
      childNode.removeChildren("display-name");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppType ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<WebAppType<T>> getOrCreateIcon()
   {
      List<Node> nodeList = childNode.get("icon");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new IconTypeImpl<WebAppType<T>>(this, "icon", childNode, nodeList.get(0));
      }
      return createIcon();
   }

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<WebAppType<T>></code> 
    */
   public IconType<WebAppType<T>> createIcon()
   {
      return new IconTypeImpl<WebAppType<T>>(this, "icon", childNode);
   }

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<WebAppType<T>>> getAllIcon()
   {
      List<IconType<WebAppType<T>>> list = new ArrayList<IconType<WebAppType<T>>>();
      List<Node> nodeList = childNode.get("icon");
      for(Node node: nodeList)
      {
         IconType<WebAppType<T>>  type = new IconTypeImpl<WebAppType<T>>(this, "icon", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<WebAppType<T>></code> 
    */
   public WebAppType<T> removeAllIcon()
   {
      childNode.removeChildren("icon");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppType ElementName: javaee:env-entryType ElementType : env-entry
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>env-entry</code> element will be created and returned.
    * Otherwise, the first existing <code>env-entry</code> element will be returned.
    * @return the instance defined for the element <code>env-entry</code> 
    */
   public EnvEntryType<WebAppType<T>> getOrCreateEnvEntry()
   {
      List<Node> nodeList = childNode.get("env-entry");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new EnvEntryTypeImpl<WebAppType<T>>(this, "env-entry", childNode, nodeList.get(0));
      }
      return createEnvEntry();
   }

   /**
    * Creates a new <code>env-entry</code> element 
    * @return the new created instance of <code>EnvEntryType<WebAppType<T>></code> 
    */
   public EnvEntryType<WebAppType<T>> createEnvEntry()
   {
      return new EnvEntryTypeImpl<WebAppType<T>>(this, "env-entry", childNode);
   }

   /**
    * Returns all <code>env-entry</code> elements
    * @return list of <code>env-entry</code> 
    */
   public List<EnvEntryType<WebAppType<T>>> getAllEnvEntry()
   {
      List<EnvEntryType<WebAppType<T>>> list = new ArrayList<EnvEntryType<WebAppType<T>>>();
      List<Node> nodeList = childNode.get("env-entry");
      for(Node node: nodeList)
      {
         EnvEntryType<WebAppType<T>>  type = new EnvEntryTypeImpl<WebAppType<T>>(this, "env-entry", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>env-entry</code> elements 
    * @return the current instance of <code>EnvEntryType<WebAppType<T>></code> 
    */
   public WebAppType<T> removeAllEnvEntry()
   {
      childNode.removeChildren("env-entry");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppType ElementName: javaee:ejb-refType ElementType : ejb-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>ejb-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>ejb-ref</code> element will be returned.
    * @return the instance defined for the element <code>ejb-ref</code> 
    */
   public EjbRefType<WebAppType<T>> getOrCreateEjbRef()
   {
      List<Node> nodeList = childNode.get("ejb-ref");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new EjbRefTypeImpl<WebAppType<T>>(this, "ejb-ref", childNode, nodeList.get(0));
      }
      return createEjbRef();
   }

   /**
    * Creates a new <code>ejb-ref</code> element 
    * @return the new created instance of <code>EjbRefType<WebAppType<T>></code> 
    */
   public EjbRefType<WebAppType<T>> createEjbRef()
   {
      return new EjbRefTypeImpl<WebAppType<T>>(this, "ejb-ref", childNode);
   }

   /**
    * Returns all <code>ejb-ref</code> elements
    * @return list of <code>ejb-ref</code> 
    */
   public List<EjbRefType<WebAppType<T>>> getAllEjbRef()
   {
      List<EjbRefType<WebAppType<T>>> list = new ArrayList<EjbRefType<WebAppType<T>>>();
      List<Node> nodeList = childNode.get("ejb-ref");
      for(Node node: nodeList)
      {
         EjbRefType<WebAppType<T>>  type = new EjbRefTypeImpl<WebAppType<T>>(this, "ejb-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>ejb-ref</code> elements 
    * @return the current instance of <code>EjbRefType<WebAppType<T>></code> 
    */
   public WebAppType<T> removeAllEjbRef()
   {
      childNode.removeChildren("ejb-ref");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppType ElementName: javaee:ejb-local-refType ElementType : ejb-local-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>ejb-local-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>ejb-local-ref</code> element will be returned.
    * @return the instance defined for the element <code>ejb-local-ref</code> 
    */
   public EjbLocalRefType<WebAppType<T>> getOrCreateEjbLocalRef()
   {
      List<Node> nodeList = childNode.get("ejb-local-ref");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new EjbLocalRefTypeImpl<WebAppType<T>>(this, "ejb-local-ref", childNode, nodeList.get(0));
      }
      return createEjbLocalRef();
   }

   /**
    * Creates a new <code>ejb-local-ref</code> element 
    * @return the new created instance of <code>EjbLocalRefType<WebAppType<T>></code> 
    */
   public EjbLocalRefType<WebAppType<T>> createEjbLocalRef()
   {
      return new EjbLocalRefTypeImpl<WebAppType<T>>(this, "ejb-local-ref", childNode);
   }

   /**
    * Returns all <code>ejb-local-ref</code> elements
    * @return list of <code>ejb-local-ref</code> 
    */
   public List<EjbLocalRefType<WebAppType<T>>> getAllEjbLocalRef()
   {
      List<EjbLocalRefType<WebAppType<T>>> list = new ArrayList<EjbLocalRefType<WebAppType<T>>>();
      List<Node> nodeList = childNode.get("ejb-local-ref");
      for(Node node: nodeList)
      {
         EjbLocalRefType<WebAppType<T>>  type = new EjbLocalRefTypeImpl<WebAppType<T>>(this, "ejb-local-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>ejb-local-ref</code> elements 
    * @return the current instance of <code>EjbLocalRefType<WebAppType<T>></code> 
    */
   public WebAppType<T> removeAllEjbLocalRef()
   {
      childNode.removeChildren("ejb-local-ref");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppType ElementName: javaee:resource-refType ElementType : resource-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>resource-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>resource-ref</code> element will be returned.
    * @return the instance defined for the element <code>resource-ref</code> 
    */
   public ResourceRefType<WebAppType<T>> getOrCreateResourceRef()
   {
      List<Node> nodeList = childNode.get("resource-ref");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ResourceRefTypeImpl<WebAppType<T>>(this, "resource-ref", childNode, nodeList.get(0));
      }
      return createResourceRef();
   }

   /**
    * Creates a new <code>resource-ref</code> element 
    * @return the new created instance of <code>ResourceRefType<WebAppType<T>></code> 
    */
   public ResourceRefType<WebAppType<T>> createResourceRef()
   {
      return new ResourceRefTypeImpl<WebAppType<T>>(this, "resource-ref", childNode);
   }

   /**
    * Returns all <code>resource-ref</code> elements
    * @return list of <code>resource-ref</code> 
    */
   public List<ResourceRefType<WebAppType<T>>> getAllResourceRef()
   {
      List<ResourceRefType<WebAppType<T>>> list = new ArrayList<ResourceRefType<WebAppType<T>>>();
      List<Node> nodeList = childNode.get("resource-ref");
      for(Node node: nodeList)
      {
         ResourceRefType<WebAppType<T>>  type = new ResourceRefTypeImpl<WebAppType<T>>(this, "resource-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>resource-ref</code> elements 
    * @return the current instance of <code>ResourceRefType<WebAppType<T>></code> 
    */
   public WebAppType<T> removeAllResourceRef()
   {
      childNode.removeChildren("resource-ref");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppType ElementName: javaee:resource-env-refType ElementType : resource-env-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>resource-env-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>resource-env-ref</code> element will be returned.
    * @return the instance defined for the element <code>resource-env-ref</code> 
    */
   public ResourceEnvRefType<WebAppType<T>> getOrCreateResourceEnvRef()
   {
      List<Node> nodeList = childNode.get("resource-env-ref");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ResourceEnvRefTypeImpl<WebAppType<T>>(this, "resource-env-ref", childNode, nodeList.get(0));
      }
      return createResourceEnvRef();
   }

   /**
    * Creates a new <code>resource-env-ref</code> element 
    * @return the new created instance of <code>ResourceEnvRefType<WebAppType<T>></code> 
    */
   public ResourceEnvRefType<WebAppType<T>> createResourceEnvRef()
   {
      return new ResourceEnvRefTypeImpl<WebAppType<T>>(this, "resource-env-ref", childNode);
   }

   /**
    * Returns all <code>resource-env-ref</code> elements
    * @return list of <code>resource-env-ref</code> 
    */
   public List<ResourceEnvRefType<WebAppType<T>>> getAllResourceEnvRef()
   {
      List<ResourceEnvRefType<WebAppType<T>>> list = new ArrayList<ResourceEnvRefType<WebAppType<T>>>();
      List<Node> nodeList = childNode.get("resource-env-ref");
      for(Node node: nodeList)
      {
         ResourceEnvRefType<WebAppType<T>>  type = new ResourceEnvRefTypeImpl<WebAppType<T>>(this, "resource-env-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>resource-env-ref</code> elements 
    * @return the current instance of <code>ResourceEnvRefType<WebAppType<T>></code> 
    */
   public WebAppType<T> removeAllResourceEnvRef()
   {
      childNode.removeChildren("resource-env-ref");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppType ElementName: javaee:message-destination-refType ElementType : message-destination-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>message-destination-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>message-destination-ref</code> element will be returned.
    * @return the instance defined for the element <code>message-destination-ref</code> 
    */
   public MessageDestinationRefType<WebAppType<T>> getOrCreateMessageDestinationRef()
   {
      List<Node> nodeList = childNode.get("message-destination-ref");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new MessageDestinationRefTypeImpl<WebAppType<T>>(this, "message-destination-ref", childNode, nodeList.get(0));
      }
      return createMessageDestinationRef();
   }

   /**
    * Creates a new <code>message-destination-ref</code> element 
    * @return the new created instance of <code>MessageDestinationRefType<WebAppType<T>></code> 
    */
   public MessageDestinationRefType<WebAppType<T>> createMessageDestinationRef()
   {
      return new MessageDestinationRefTypeImpl<WebAppType<T>>(this, "message-destination-ref", childNode);
   }

   /**
    * Returns all <code>message-destination-ref</code> elements
    * @return list of <code>message-destination-ref</code> 
    */
   public List<MessageDestinationRefType<WebAppType<T>>> getAllMessageDestinationRef()
   {
      List<MessageDestinationRefType<WebAppType<T>>> list = new ArrayList<MessageDestinationRefType<WebAppType<T>>>();
      List<Node> nodeList = childNode.get("message-destination-ref");
      for(Node node: nodeList)
      {
         MessageDestinationRefType<WebAppType<T>>  type = new MessageDestinationRefTypeImpl<WebAppType<T>>(this, "message-destination-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>message-destination-ref</code> elements 
    * @return the current instance of <code>MessageDestinationRefType<WebAppType<T>></code> 
    */
   public WebAppType<T> removeAllMessageDestinationRef()
   {
      childNode.removeChildren("message-destination-ref");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppType ElementName: javaee:persistence-context-refType ElementType : persistence-context-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>persistence-context-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>persistence-context-ref</code> element will be returned.
    * @return the instance defined for the element <code>persistence-context-ref</code> 
    */
   public PersistenceContextRefType<WebAppType<T>> getOrCreatePersistenceContextRef()
   {
      List<Node> nodeList = childNode.get("persistence-context-ref");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new PersistenceContextRefTypeImpl<WebAppType<T>>(this, "persistence-context-ref", childNode, nodeList.get(0));
      }
      return createPersistenceContextRef();
   }

   /**
    * Creates a new <code>persistence-context-ref</code> element 
    * @return the new created instance of <code>PersistenceContextRefType<WebAppType<T>></code> 
    */
   public PersistenceContextRefType<WebAppType<T>> createPersistenceContextRef()
   {
      return new PersistenceContextRefTypeImpl<WebAppType<T>>(this, "persistence-context-ref", childNode);
   }

   /**
    * Returns all <code>persistence-context-ref</code> elements
    * @return list of <code>persistence-context-ref</code> 
    */
   public List<PersistenceContextRefType<WebAppType<T>>> getAllPersistenceContextRef()
   {
      List<PersistenceContextRefType<WebAppType<T>>> list = new ArrayList<PersistenceContextRefType<WebAppType<T>>>();
      List<Node> nodeList = childNode.get("persistence-context-ref");
      for(Node node: nodeList)
      {
         PersistenceContextRefType<WebAppType<T>>  type = new PersistenceContextRefTypeImpl<WebAppType<T>>(this, "persistence-context-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>persistence-context-ref</code> elements 
    * @return the current instance of <code>PersistenceContextRefType<WebAppType<T>></code> 
    */
   public WebAppType<T> removeAllPersistenceContextRef()
   {
      childNode.removeChildren("persistence-context-ref");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppType ElementName: javaee:persistence-unit-refType ElementType : persistence-unit-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>persistence-unit-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>persistence-unit-ref</code> element will be returned.
    * @return the instance defined for the element <code>persistence-unit-ref</code> 
    */
   public PersistenceUnitRefType<WebAppType<T>> getOrCreatePersistenceUnitRef()
   {
      List<Node> nodeList = childNode.get("persistence-unit-ref");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new PersistenceUnitRefTypeImpl<WebAppType<T>>(this, "persistence-unit-ref", childNode, nodeList.get(0));
      }
      return createPersistenceUnitRef();
   }

   /**
    * Creates a new <code>persistence-unit-ref</code> element 
    * @return the new created instance of <code>PersistenceUnitRefType<WebAppType<T>></code> 
    */
   public PersistenceUnitRefType<WebAppType<T>> createPersistenceUnitRef()
   {
      return new PersistenceUnitRefTypeImpl<WebAppType<T>>(this, "persistence-unit-ref", childNode);
   }

   /**
    * Returns all <code>persistence-unit-ref</code> elements
    * @return list of <code>persistence-unit-ref</code> 
    */
   public List<PersistenceUnitRefType<WebAppType<T>>> getAllPersistenceUnitRef()
   {
      List<PersistenceUnitRefType<WebAppType<T>>> list = new ArrayList<PersistenceUnitRefType<WebAppType<T>>>();
      List<Node> nodeList = childNode.get("persistence-unit-ref");
      for(Node node: nodeList)
      {
         PersistenceUnitRefType<WebAppType<T>>  type = new PersistenceUnitRefTypeImpl<WebAppType<T>>(this, "persistence-unit-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>persistence-unit-ref</code> elements 
    * @return the current instance of <code>PersistenceUnitRefType<WebAppType<T>></code> 
    */
   public WebAppType<T> removeAllPersistenceUnitRef()
   {
      childNode.removeChildren("persistence-unit-ref");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppType ElementName: javaee:lifecycle-callbackType ElementType : post-construct
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>post-construct</code> element will be created and returned.
    * Otherwise, the first existing <code>post-construct</code> element will be returned.
    * @return the instance defined for the element <code>post-construct</code> 
    */
   public LifecycleCallbackType<WebAppType<T>> getOrCreatePostConstruct()
   {
      List<Node> nodeList = childNode.get("post-construct");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new LifecycleCallbackTypeImpl<WebAppType<T>>(this, "post-construct", childNode, nodeList.get(0));
      }
      return createPostConstruct();
   }

   /**
    * Creates a new <code>post-construct</code> element 
    * @return the new created instance of <code>LifecycleCallbackType<WebAppType<T>></code> 
    */
   public LifecycleCallbackType<WebAppType<T>> createPostConstruct()
   {
      return new LifecycleCallbackTypeImpl<WebAppType<T>>(this, "post-construct", childNode);
   }

   /**
    * Returns all <code>post-construct</code> elements
    * @return list of <code>post-construct</code> 
    */
   public List<LifecycleCallbackType<WebAppType<T>>> getAllPostConstruct()
   {
      List<LifecycleCallbackType<WebAppType<T>>> list = new ArrayList<LifecycleCallbackType<WebAppType<T>>>();
      List<Node> nodeList = childNode.get("post-construct");
      for(Node node: nodeList)
      {
         LifecycleCallbackType<WebAppType<T>>  type = new LifecycleCallbackTypeImpl<WebAppType<T>>(this, "post-construct", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>post-construct</code> elements 
    * @return the current instance of <code>LifecycleCallbackType<WebAppType<T>></code> 
    */
   public WebAppType<T> removeAllPostConstruct()
   {
      childNode.removeChildren("post-construct");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppType ElementName: javaee:lifecycle-callbackType ElementType : pre-destroy
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>pre-destroy</code> element will be created and returned.
    * Otherwise, the first existing <code>pre-destroy</code> element will be returned.
    * @return the instance defined for the element <code>pre-destroy</code> 
    */
   public LifecycleCallbackType<WebAppType<T>> getOrCreatePreDestroy()
   {
      List<Node> nodeList = childNode.get("pre-destroy");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new LifecycleCallbackTypeImpl<WebAppType<T>>(this, "pre-destroy", childNode, nodeList.get(0));
      }
      return createPreDestroy();
   }

   /**
    * Creates a new <code>pre-destroy</code> element 
    * @return the new created instance of <code>LifecycleCallbackType<WebAppType<T>></code> 
    */
   public LifecycleCallbackType<WebAppType<T>> createPreDestroy()
   {
      return new LifecycleCallbackTypeImpl<WebAppType<T>>(this, "pre-destroy", childNode);
   }

   /**
    * Returns all <code>pre-destroy</code> elements
    * @return list of <code>pre-destroy</code> 
    */
   public List<LifecycleCallbackType<WebAppType<T>>> getAllPreDestroy()
   {
      List<LifecycleCallbackType<WebAppType<T>>> list = new ArrayList<LifecycleCallbackType<WebAppType<T>>>();
      List<Node> nodeList = childNode.get("pre-destroy");
      for(Node node: nodeList)
      {
         LifecycleCallbackType<WebAppType<T>>  type = new LifecycleCallbackTypeImpl<WebAppType<T>>(this, "pre-destroy", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>pre-destroy</code> elements 
    * @return the current instance of <code>LifecycleCallbackType<WebAppType<T>></code> 
    */
   public WebAppType<T> removeAllPreDestroy()
   {
      childNode.removeChildren("pre-destroy");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppType ElementName: javaee:data-sourceType ElementType : data-source
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>data-source</code> element will be created and returned.
    * Otherwise, the first existing <code>data-source</code> element will be returned.
    * @return the instance defined for the element <code>data-source</code> 
    */
   public DataSourceType<WebAppType<T>> getOrCreateDataSource()
   {
      List<Node> nodeList = childNode.get("data-source");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new DataSourceTypeImpl<WebAppType<T>>(this, "data-source", childNode, nodeList.get(0));
      }
      return createDataSource();
   }

   /**
    * Creates a new <code>data-source</code> element 
    * @return the new created instance of <code>DataSourceType<WebAppType<T>></code> 
    */
   public DataSourceType<WebAppType<T>> createDataSource()
   {
      return new DataSourceTypeImpl<WebAppType<T>>(this, "data-source", childNode);
   }

   /**
    * Returns all <code>data-source</code> elements
    * @return list of <code>data-source</code> 
    */
   public List<DataSourceType<WebAppType<T>>> getAllDataSource()
   {
      List<DataSourceType<WebAppType<T>>> list = new ArrayList<DataSourceType<WebAppType<T>>>();
      List<Node> nodeList = childNode.get("data-source");
      for(Node node: nodeList)
      {
         DataSourceType<WebAppType<T>>  type = new DataSourceTypeImpl<WebAppType<T>>(this, "data-source", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>data-source</code> elements 
    * @return the current instance of <code>DataSourceType<WebAppType<T>></code> 
    */
   public WebAppType<T> removeAllDataSource()
   {
      childNode.removeChildren("data-source");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppType ElementName: javaee:service-refType ElementType : service-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>service-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>service-ref</code> element will be returned.
    * @return the instance defined for the element <code>service-ref</code> 
    */
   public ServiceRefType<WebAppType<T>> getOrCreateServiceRef()
   {
      List<Node> nodeList = childNode.get("service-ref");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ServiceRefTypeImpl<WebAppType<T>>(this, "service-ref", childNode, nodeList.get(0));
      }
      return createServiceRef();
   }

   /**
    * Creates a new <code>service-ref</code> element 
    * @return the new created instance of <code>ServiceRefType<WebAppType<T>></code> 
    */
   public ServiceRefType<WebAppType<T>> createServiceRef()
   {
      return new ServiceRefTypeImpl<WebAppType<T>>(this, "service-ref", childNode);
   }

   /**
    * Returns all <code>service-ref</code> elements
    * @return list of <code>service-ref</code> 
    */
   public List<ServiceRefType<WebAppType<T>>> getAllServiceRef()
   {
      List<ServiceRefType<WebAppType<T>>> list = new ArrayList<ServiceRefType<WebAppType<T>>>();
      List<Node> nodeList = childNode.get("service-ref");
      for(Node node: nodeList)
      {
         ServiceRefType<WebAppType<T>>  type = new ServiceRefTypeImpl<WebAppType<T>>(this, "service-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>service-ref</code> elements 
    * @return the current instance of <code>ServiceRefType<WebAppType<T>></code> 
    */
   public WebAppType<T> removeAllServiceRef()
   {
      childNode.removeChildren("service-ref");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppType ElementName: javaee:web-app-versionType ElementType : version
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of <code>WebAppType<T></code> 
    */
   public WebAppType<T> version(WebAppVersionType version)
   {
      childNode.attribute("version", version);
      return this;
   }

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of <code>WebAppType<T></code> 
    */
   public WebAppType<T> version(String version)
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
    * @return the current instance of <code>WebAppType<T></code> 
    */
   public WebAppType<T> removeVersion()
   {
      childNode.removeAttribute("version");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>WebAppType<T></code> 
    */
   public WebAppType<T> id(String id)
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
    * @return the current instance of <code>WebAppType<T></code> 
    */
   public WebAppType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppType ElementName: xsd:boolean ElementType : metadata-complete
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>metadata-complete</code> attribute
    * @param metadataComplete the value for the attribute <code>metadata-complete</code> 
    * @return the current instance of <code>WebAppType<T></code> 
    */
   public WebAppType<T> metadataComplete(Boolean metadataComplete)
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
    * @return the current instance of <code>WebAppType<T></code> 
    */
   public WebAppType<T> removeMetadataComplete()
   {
      childNode.removeAttribute("metadata-complete");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppType ElementName: xsd:token ElementType : module-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>module-name</code> elements, 
    * a new <code>module-name</code> element 
    * @param values list of <code>module-name</code> objects 
    * @return the current instance of <code>WebAppType<T></code> 
    */
   public WebAppType<T> moduleName(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("module-name").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>module-name</code> elements
    * @return list of <code>module-name</code> 
    */
public List<String> getAllModuleName()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("module-name");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>module-name</code> element 
    * @return the current instance of <code>WebAppType<T></code> 
    */
   public WebAppType<T> removeAllModuleName()
   {
      childNode.removeChildren("module-name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppType ElementName: javaee:absoluteOrderingType ElementType : absolute-ordering
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>absolute-ordering</code> element will be created and returned.
    * Otherwise, the first existing <code>absolute-ordering</code> element will be returned.
    * @return the instance defined for the element <code>absolute-ordering</code> 
    */
   public AbsoluteOrderingType<WebAppType<T>> getOrCreateAbsoluteOrdering()
   {
      List<Node> nodeList = childNode.get("absolute-ordering");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new AbsoluteOrderingTypeImpl<WebAppType<T>>(this, "absolute-ordering", childNode, nodeList.get(0));
      }
      return createAbsoluteOrdering();
   }

   /**
    * Creates a new <code>absolute-ordering</code> element 
    * @return the new created instance of <code>AbsoluteOrderingType<WebAppType<T>></code> 
    */
   public AbsoluteOrderingType<WebAppType<T>> createAbsoluteOrdering()
   {
      return new AbsoluteOrderingTypeImpl<WebAppType<T>>(this, "absolute-ordering", childNode);
   }

   /**
    * Returns all <code>absolute-ordering</code> elements
    * @return list of <code>absolute-ordering</code> 
    */
   public List<AbsoluteOrderingType<WebAppType<T>>> getAllAbsoluteOrdering()
   {
      List<AbsoluteOrderingType<WebAppType<T>>> list = new ArrayList<AbsoluteOrderingType<WebAppType<T>>>();
      List<Node> nodeList = childNode.get("absolute-ordering");
      for(Node node: nodeList)
      {
         AbsoluteOrderingType<WebAppType<T>>  type = new AbsoluteOrderingTypeImpl<WebAppType<T>>(this, "absolute-ordering", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>absolute-ordering</code> elements 
    * @return the current instance of <code>AbsoluteOrderingType<WebAppType<T>></code> 
    */
   public WebAppType<T> removeAllAbsoluteOrdering()
   {
      childNode.removeChildren("absolute-ordering");
      return this;
   }
}
