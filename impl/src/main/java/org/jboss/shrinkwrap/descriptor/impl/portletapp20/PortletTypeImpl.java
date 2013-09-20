package org.jboss.shrinkwrap.descriptor.impl.portletapp20; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.portletapp20.ContainerRuntimeOptionType;
import org.jboss.shrinkwrap.descriptor.api.portletapp20.EventDefinitionReferenceType;
import org.jboss.shrinkwrap.descriptor.api.portletapp20.InitParamType;
import org.jboss.shrinkwrap.descriptor.api.portletapp20.PortletInfoType;
import org.jboss.shrinkwrap.descriptor.api.portletapp20.PortletPreferencesType;
import org.jboss.shrinkwrap.descriptor.api.portletapp20.PortletType;
import org.jboss.shrinkwrap.descriptor.api.portletapp20.SecurityRoleRefType;
import org.jboss.shrinkwrap.descriptor.api.portletapp20.SupportsType;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> portletType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class PortletTypeImpl<T> implements Child<T>, PortletType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public PortletTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public PortletTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletType ElementName: string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>PortletType<T></code> 
    */
   public PortletType<T> description(String ... values)
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
    * @return the current instance of <code>PortletType<T></code> 
    */
   public PortletType<T> removeAllDescription()
   {
      childNode.removeChildren("description");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletType ElementName: string ElementType : portlet-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>portlet-name</code> element
    * @param portletName the value for the element <code>portlet-name</code> 
    * @return the current instance of <code>PortletType<T></code> 
    */
   public PortletType<T> portletName(String portletName)
   {
      childNode.getOrCreate("portlet-name").text(portletName);
      return this;
   }

   /**
    * Returns the <code>portlet-name</code> element
    * @return the node defined for the element <code>portlet-name</code> 
    */
   public String getPortletName()
   {
      return childNode.getTextValueForPatternName("portlet-name");
   }

   /**
    * Removes the <code>portlet-name</code> element 
    * @return the current instance of <code>PortletType<T></code> 
    */
   public PortletType<T> removePortletName()
   {
      childNode.removeChildren("portlet-name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletType ElementName: string ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>PortletType<T></code> 
    */
   public PortletType<T> displayName(String ... values)
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
    * @return the current instance of <code>PortletType<T></code> 
    */
   public PortletType<T> removeAllDisplayName()
   {
      childNode.removeChildren("display-name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletType ElementName: string ElementType : portlet-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>portlet-class</code> element
    * @param portletClass the value for the element <code>portlet-class</code> 
    * @return the current instance of <code>PortletType<T></code> 
    */
   public PortletType<T> portletClass(String portletClass)
   {
      childNode.getOrCreate("portlet-class").text(portletClass);
      return this;
   }

   /**
    * Returns the <code>portlet-class</code> element
    * @return the node defined for the element <code>portlet-class</code> 
    */
   public String getPortletClass()
   {
      return childNode.getTextValueForPatternName("portlet-class");
   }

   /**
    * Removes the <code>portlet-class</code> element 
    * @return the current instance of <code>PortletType<T></code> 
    */
   public PortletType<T> removePortletClass()
   {
      childNode.removeChildren("portlet-class");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletType ElementName: portlet:init-paramType ElementType : init-param
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>init-param</code> element will be created and returned.
    * Otherwise, the first existing <code>init-param</code> element will be returned.
    * @return the instance defined for the element <code>init-param</code> 
    */
   public InitParamType<PortletType<T>> getOrCreateInitParam()
   {
      List<Node> nodeList = childNode.get("init-param");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new InitParamTypeImpl<PortletType<T>>(this, "init-param", childNode, nodeList.get(0));
      }
      return createInitParam();
   }

   /**
    * Creates a new <code>init-param</code> element 
    * @return the new created instance of <code>InitParamType<PortletType<T>></code> 
    */
   public InitParamType<PortletType<T>> createInitParam()
   {
      return new InitParamTypeImpl<PortletType<T>>(this, "init-param", childNode);
   }

   /**
    * Returns all <code>init-param</code> elements
    * @return list of <code>init-param</code> 
    */
   public List<InitParamType<PortletType<T>>> getAllInitParam()
   {
      List<InitParamType<PortletType<T>>> list = new ArrayList<InitParamType<PortletType<T>>>();
      List<Node> nodeList = childNode.get("init-param");
      for(Node node: nodeList)
      {
         InitParamType<PortletType<T>>  type = new InitParamTypeImpl<PortletType<T>>(this, "init-param", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>init-param</code> elements 
    * @return the current instance of <code>InitParamType<PortletType<T>></code> 
    */
   public PortletType<T> removeAllInitParam()
   {
      childNode.removeChildren("init-param");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletType ElementName: xsd:int ElementType : expiration-cache
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>expiration-cache</code> element
    * @param expirationCache the value for the element <code>expiration-cache</code> 
    * @return the current instance of <code>PortletType<T></code> 
    */
   public PortletType<T> expirationCache(Integer expirationCache)
   {
      childNode.getOrCreate("expiration-cache").text(expirationCache);
      return this;
   }

   /**
    * Returns the <code>expiration-cache</code> element
    * @return the node defined for the element <code>expiration-cache</code> 
    */
   public Integer getExpirationCache()
   {
      if (childNode.getTextValueForPatternName("expiration-cache") != null && !childNode.getTextValueForPatternName("expiration-cache").equals("null")) {
         return Integer.valueOf(childNode.getTextValueForPatternName("expiration-cache"));
      }
      return null;
   }

   /**
    * Removes the <code>expiration-cache</code> element 
    * @return the current instance of <code>PortletType<T></code> 
    */
   public PortletType<T> removeExpirationCache()
   {
      childNode.removeChildren("expiration-cache");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletType ElementName: string ElementType : cache-scope
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>cache-scope</code> element
    * @param cacheScope the value for the element <code>cache-scope</code> 
    * @return the current instance of <code>PortletType<T></code> 
    */
   public PortletType<T> cacheScope(String cacheScope)
   {
      childNode.getOrCreate("cache-scope").text(cacheScope);
      return this;
   }

   /**
    * Returns the <code>cache-scope</code> element
    * @return the node defined for the element <code>cache-scope</code> 
    */
   public String getCacheScope()
   {
      return childNode.getTextValueForPatternName("cache-scope");
   }

   /**
    * Removes the <code>cache-scope</code> element 
    * @return the current instance of <code>PortletType<T></code> 
    */
   public PortletType<T> removeCacheScope()
   {
      childNode.removeChildren("cache-scope");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletType ElementName: portlet:supportsType ElementType : supports
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>supports</code> element will be created and returned.
    * Otherwise, the first existing <code>supports</code> element will be returned.
    * @return the instance defined for the element <code>supports</code> 
    */
   public SupportsType<PortletType<T>> getOrCreateSupports()
   {
      List<Node> nodeList = childNode.get("supports");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new SupportsTypeImpl<PortletType<T>>(this, "supports", childNode, nodeList.get(0));
      }
      return createSupports();
   }

   /**
    * Creates a new <code>supports</code> element 
    * @return the new created instance of <code>SupportsType<PortletType<T>></code> 
    */
   public SupportsType<PortletType<T>> createSupports()
   {
      return new SupportsTypeImpl<PortletType<T>>(this, "supports", childNode);
   }

   /**
    * Returns all <code>supports</code> elements
    * @return list of <code>supports</code> 
    */
   public List<SupportsType<PortletType<T>>> getAllSupports()
   {
      List<SupportsType<PortletType<T>>> list = new ArrayList<SupportsType<PortletType<T>>>();
      List<Node> nodeList = childNode.get("supports");
      for(Node node: nodeList)
      {
         SupportsType<PortletType<T>>  type = new SupportsTypeImpl<PortletType<T>>(this, "supports", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>supports</code> elements 
    * @return the current instance of <code>SupportsType<PortletType<T>></code> 
    */
   public PortletType<T> removeAllSupports()
   {
      childNode.removeChildren("supports");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletType ElementName: string ElementType : supported-locale
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>supported-locale</code> elements, 
    * a new <code>supported-locale</code> element 
    * @param values list of <code>supported-locale</code> objects 
    * @return the current instance of <code>PortletType<T></code> 
    */
   public PortletType<T> supportedLocale(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("supported-locale").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>supported-locale</code> elements
    * @return list of <code>supported-locale</code> 
    */
public List<String> getAllSupportedLocale()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("supported-locale");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>supported-locale</code> element 
    * @return the current instance of <code>PortletType<T></code> 
    */
   public PortletType<T> removeAllSupportedLocale()
   {
      childNode.removeChildren("supported-locale");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletType ElementName: string ElementType : resource-bundle
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>resource-bundle</code> element
    * @param resourceBundle the value for the element <code>resource-bundle</code> 
    * @return the current instance of <code>PortletType<T></code> 
    */
   public PortletType<T> resourceBundle(String resourceBundle)
   {
      childNode.getOrCreate("resource-bundle").text(resourceBundle);
      return this;
   }

   /**
    * Returns the <code>resource-bundle</code> element
    * @return the node defined for the element <code>resource-bundle</code> 
    */
   public String getResourceBundle()
   {
      return childNode.getTextValueForPatternName("resource-bundle");
   }

   /**
    * Removes the <code>resource-bundle</code> element 
    * @return the current instance of <code>PortletType<T></code> 
    */
   public PortletType<T> removeResourceBundle()
   {
      childNode.removeChildren("resource-bundle");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletType ElementName: portlet:portlet-infoType ElementType : portlet-info
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>portlet-info</code> element with the given value will be created.
    * Otherwise, the existing <code>portlet-info</code> element will be returned.
    * @return  a new or existing instance of <code>PortletInfoType<PortletType<T>></code> 
    */
   public PortletInfoType<PortletType<T>> getOrCreatePortletInfo()
   {
      Node node = childNode.getOrCreate("portlet-info");
      PortletInfoType<PortletType<T>> portletInfo = new PortletInfoTypeImpl<PortletType<T>>(this, "portlet-info", childNode, node);
      return portletInfo;
   }

   /**
    * Removes the <code>portlet-info</code> element 
    * @return the current instance of <code>PortletType<T></code> 
    */
   public PortletType<T> removePortletInfo()
   {
      childNode.removeChildren("portlet-info");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletType ElementName: portlet:portlet-preferencesType ElementType : portlet-preferences
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>portlet-preferences</code> element with the given value will be created.
    * Otherwise, the existing <code>portlet-preferences</code> element will be returned.
    * @return  a new or existing instance of <code>PortletPreferencesType<PortletType<T>></code> 
    */
   public PortletPreferencesType<PortletType<T>> getOrCreatePortletPreferences()
   {
      Node node = childNode.getOrCreate("portlet-preferences");
      PortletPreferencesType<PortletType<T>> portletPreferences = new PortletPreferencesTypeImpl<PortletType<T>>(this, "portlet-preferences", childNode, node);
      return portletPreferences;
   }

   /**
    * Removes the <code>portlet-preferences</code> element 
    * @return the current instance of <code>PortletType<T></code> 
    */
   public PortletType<T> removePortletPreferences()
   {
      childNode.removeChildren("portlet-preferences");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletType ElementName: portlet:security-role-refType ElementType : security-role-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>security-role-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>security-role-ref</code> element will be returned.
    * @return the instance defined for the element <code>security-role-ref</code> 
    */
   public SecurityRoleRefType<PortletType<T>> getOrCreateSecurityRoleRef()
   {
      List<Node> nodeList = childNode.get("security-role-ref");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new SecurityRoleRefTypeImpl<PortletType<T>>(this, "security-role-ref", childNode, nodeList.get(0));
      }
      return createSecurityRoleRef();
   }

   /**
    * Creates a new <code>security-role-ref</code> element 
    * @return the new created instance of <code>SecurityRoleRefType<PortletType<T>></code> 
    */
   public SecurityRoleRefType<PortletType<T>> createSecurityRoleRef()
   {
      return new SecurityRoleRefTypeImpl<PortletType<T>>(this, "security-role-ref", childNode);
   }

   /**
    * Returns all <code>security-role-ref</code> elements
    * @return list of <code>security-role-ref</code> 
    */
   public List<SecurityRoleRefType<PortletType<T>>> getAllSecurityRoleRef()
   {
      List<SecurityRoleRefType<PortletType<T>>> list = new ArrayList<SecurityRoleRefType<PortletType<T>>>();
      List<Node> nodeList = childNode.get("security-role-ref");
      for(Node node: nodeList)
      {
         SecurityRoleRefType<PortletType<T>>  type = new SecurityRoleRefTypeImpl<PortletType<T>>(this, "security-role-ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>security-role-ref</code> elements 
    * @return the current instance of <code>SecurityRoleRefType<PortletType<T>></code> 
    */
   public PortletType<T> removeAllSecurityRoleRef()
   {
      childNode.removeChildren("security-role-ref");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletType ElementName: portlet:event-definition-referenceType ElementType : supported-processing-event
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>supported-processing-event</code> element will be created and returned.
    * Otherwise, the first existing <code>supported-processing-event</code> element will be returned.
    * @return the instance defined for the element <code>supported-processing-event</code> 
    */
   public EventDefinitionReferenceType<PortletType<T>> getOrCreateSupportedProcessingEvent()
   {
      List<Node> nodeList = childNode.get("supported-processing-event");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new EventDefinitionReferenceTypeImpl<PortletType<T>>(this, "supported-processing-event", childNode, nodeList.get(0));
      }
      return createSupportedProcessingEvent();
   }

   /**
    * Creates a new <code>supported-processing-event</code> element 
    * @return the new created instance of <code>EventDefinitionReferenceType<PortletType<T>></code> 
    */
   public EventDefinitionReferenceType<PortletType<T>> createSupportedProcessingEvent()
   {
      return new EventDefinitionReferenceTypeImpl<PortletType<T>>(this, "supported-processing-event", childNode);
   }

   /**
    * Returns all <code>supported-processing-event</code> elements
    * @return list of <code>supported-processing-event</code> 
    */
   public List<EventDefinitionReferenceType<PortletType<T>>> getAllSupportedProcessingEvent()
   {
      List<EventDefinitionReferenceType<PortletType<T>>> list = new ArrayList<EventDefinitionReferenceType<PortletType<T>>>();
      List<Node> nodeList = childNode.get("supported-processing-event");
      for(Node node: nodeList)
      {
         EventDefinitionReferenceType<PortletType<T>>  type = new EventDefinitionReferenceTypeImpl<PortletType<T>>(this, "supported-processing-event", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>supported-processing-event</code> elements 
    * @return the current instance of <code>EventDefinitionReferenceType<PortletType<T>></code> 
    */
   public PortletType<T> removeAllSupportedProcessingEvent()
   {
      childNode.removeChildren("supported-processing-event");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletType ElementName: portlet:event-definition-referenceType ElementType : supported-publishing-event
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>supported-publishing-event</code> element will be created and returned.
    * Otherwise, the first existing <code>supported-publishing-event</code> element will be returned.
    * @return the instance defined for the element <code>supported-publishing-event</code> 
    */
   public EventDefinitionReferenceType<PortletType<T>> getOrCreateSupportedPublishingEvent()
   {
      List<Node> nodeList = childNode.get("supported-publishing-event");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new EventDefinitionReferenceTypeImpl<PortletType<T>>(this, "supported-publishing-event", childNode, nodeList.get(0));
      }
      return createSupportedPublishingEvent();
   }

   /**
    * Creates a new <code>supported-publishing-event</code> element 
    * @return the new created instance of <code>EventDefinitionReferenceType<PortletType<T>></code> 
    */
   public EventDefinitionReferenceType<PortletType<T>> createSupportedPublishingEvent()
   {
      return new EventDefinitionReferenceTypeImpl<PortletType<T>>(this, "supported-publishing-event", childNode);
   }

   /**
    * Returns all <code>supported-publishing-event</code> elements
    * @return list of <code>supported-publishing-event</code> 
    */
   public List<EventDefinitionReferenceType<PortletType<T>>> getAllSupportedPublishingEvent()
   {
      List<EventDefinitionReferenceType<PortletType<T>>> list = new ArrayList<EventDefinitionReferenceType<PortletType<T>>>();
      List<Node> nodeList = childNode.get("supported-publishing-event");
      for(Node node: nodeList)
      {
         EventDefinitionReferenceType<PortletType<T>>  type = new EventDefinitionReferenceTypeImpl<PortletType<T>>(this, "supported-publishing-event", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>supported-publishing-event</code> elements 
    * @return the current instance of <code>EventDefinitionReferenceType<PortletType<T>></code> 
    */
   public PortletType<T> removeAllSupportedPublishingEvent()
   {
      childNode.removeChildren("supported-publishing-event");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletType ElementName: string ElementType : supported-public-render-parameter
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>supported-public-render-parameter</code> elements, 
    * a new <code>supported-public-render-parameter</code> element 
    * @param values list of <code>supported-public-render-parameter</code> objects 
    * @return the current instance of <code>PortletType<T></code> 
    */
   public PortletType<T> supportedPublicRenderParameter(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("supported-public-render-parameter").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>supported-public-render-parameter</code> elements
    * @return list of <code>supported-public-render-parameter</code> 
    */
public List<String> getAllSupportedPublicRenderParameter()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("supported-public-render-parameter");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>supported-public-render-parameter</code> element 
    * @return the current instance of <code>PortletType<T></code> 
    */
   public PortletType<T> removeAllSupportedPublicRenderParameter()
   {
      childNode.removeChildren("supported-public-render-parameter");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletType ElementName: portlet:container-runtime-optionType ElementType : container-runtime-option
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>container-runtime-option</code> element will be created and returned.
    * Otherwise, the first existing <code>container-runtime-option</code> element will be returned.
    * @return the instance defined for the element <code>container-runtime-option</code> 
    */
   public ContainerRuntimeOptionType<PortletType<T>> getOrCreateContainerRuntimeOption()
   {
      List<Node> nodeList = childNode.get("container-runtime-option");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ContainerRuntimeOptionTypeImpl<PortletType<T>>(this, "container-runtime-option", childNode, nodeList.get(0));
      }
      return createContainerRuntimeOption();
   }

   /**
    * Creates a new <code>container-runtime-option</code> element 
    * @return the new created instance of <code>ContainerRuntimeOptionType<PortletType<T>></code> 
    */
   public ContainerRuntimeOptionType<PortletType<T>> createContainerRuntimeOption()
   {
      return new ContainerRuntimeOptionTypeImpl<PortletType<T>>(this, "container-runtime-option", childNode);
   }

   /**
    * Returns all <code>container-runtime-option</code> elements
    * @return list of <code>container-runtime-option</code> 
    */
   public List<ContainerRuntimeOptionType<PortletType<T>>> getAllContainerRuntimeOption()
   {
      List<ContainerRuntimeOptionType<PortletType<T>>> list = new ArrayList<ContainerRuntimeOptionType<PortletType<T>>>();
      List<Node> nodeList = childNode.get("container-runtime-option");
      for(Node node: nodeList)
      {
         ContainerRuntimeOptionType<PortletType<T>>  type = new ContainerRuntimeOptionTypeImpl<PortletType<T>>(this, "container-runtime-option", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>container-runtime-option</code> elements 
    * @return the current instance of <code>ContainerRuntimeOptionType<PortletType<T>></code> 
    */
   public PortletType<T> removeAllContainerRuntimeOption()
   {
      childNode.removeChildren("container-runtime-option");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortletType ElementName: string ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>PortletType<T></code> 
    */
   public PortletType<T> id(String id)
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
    * @return the current instance of <code>PortletType<T></code> 
    */
   public PortletType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
