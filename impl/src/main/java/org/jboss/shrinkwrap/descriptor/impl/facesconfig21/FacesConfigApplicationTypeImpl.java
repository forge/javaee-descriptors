package org.jboss.shrinkwrap.descriptor.impl.facesconfig21; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.facesconfig21.FacesConfigApplicationType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.facesconfig21.FacesConfigSystemEventListenerType;
import org.jboss.shrinkwrap.descriptor.impl.facesconfig21.FacesConfigSystemEventListenerTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.facesconfig21.FacesConfigLocaleConfigType;
import org.jboss.shrinkwrap.descriptor.impl.facesconfig21.FacesConfigLocaleConfigTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.facesconfig21.FacesConfigApplicationResourceBundleType;
import org.jboss.shrinkwrap.descriptor.impl.facesconfig21.FacesConfigApplicationResourceBundleTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.facesconfig21.FacesConfigApplicationExtensionType;
import org.jboss.shrinkwrap.descriptor.impl.facesconfig21.FacesConfigApplicationExtensionTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.facesconfig21.FacesConfigDefaultValidatorsType;
import org.jboss.shrinkwrap.descriptor.impl.facesconfig21.FacesConfigDefaultValidatorsTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.facesconfig21.FacesConfigSystemEventListenerType;
import org.jboss.shrinkwrap.descriptor.impl.facesconfig21.FacesConfigSystemEventListenerTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.facesconfig21.FacesConfigLocaleConfigType;
import org.jboss.shrinkwrap.descriptor.impl.facesconfig21.FacesConfigLocaleConfigTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.facesconfig21.FacesConfigApplicationResourceBundleType;
import org.jboss.shrinkwrap.descriptor.impl.facesconfig21.FacesConfigApplicationResourceBundleTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.facesconfig21.FacesConfigApplicationExtensionType;
import org.jboss.shrinkwrap.descriptor.impl.facesconfig21.FacesConfigApplicationExtensionTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.facesconfig21.FacesConfigDefaultValidatorsType;
import org.jboss.shrinkwrap.descriptor.impl.facesconfig21.FacesConfigDefaultValidatorsTypeImpl;

/**
 * This class implements the <code> faces-config-applicationType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class FacesConfigApplicationTypeImpl<T> implements Child<T>, FacesConfigApplicationType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public FacesConfigApplicationTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public FacesConfigApplicationTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigApplicationType ElementName: xsd:token ElementType : action-listener
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>action-listener</code> elements, 
    * a new <code>action-listener</code> element 
    * @param values list of <code>action-listener</code> objects 
    * @return the current instance of <code>FacesConfigApplicationType<T></code> 
    */
   public FacesConfigApplicationType<T> actionListener(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("action-listener").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>action-listener</code> elements
    * @return list of <code>action-listener</code> 
    */
public List<String> getAllActionListener()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("action-listener");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>action-listener</code> element 
    * @return the current instance of <code>FacesConfigApplicationType<T></code> 
    */
   public FacesConfigApplicationType<T> removeAllActionListener()
   {
      childNode.removeChildren("action-listener");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigApplicationType ElementName: xsd:token ElementType : default-render-kit-id
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>default-render-kit-id</code> elements, 
    * a new <code>default-render-kit-id</code> element 
    * @param values list of <code>default-render-kit-id</code> objects 
    * @return the current instance of <code>FacesConfigApplicationType<T></code> 
    */
   public FacesConfigApplicationType<T> defaultRenderKitId(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("default-render-kit-id").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>default-render-kit-id</code> elements
    * @return list of <code>default-render-kit-id</code> 
    */
public List<String> getAllDefaultRenderKitId()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("default-render-kit-id");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>default-render-kit-id</code> element 
    * @return the current instance of <code>FacesConfigApplicationType<T></code> 
    */
   public FacesConfigApplicationType<T> removeAllDefaultRenderKitId()
   {
      childNode.removeChildren("default-render-kit-id");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigApplicationType ElementName: xsd:token ElementType : message-bundle
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>message-bundle</code> elements, 
    * a new <code>message-bundle</code> element 
    * @param values list of <code>message-bundle</code> objects 
    * @return the current instance of <code>FacesConfigApplicationType<T></code> 
    */
   public FacesConfigApplicationType<T> messageBundle(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("message-bundle").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>message-bundle</code> elements
    * @return list of <code>message-bundle</code> 
    */
public List<String> getAllMessageBundle()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("message-bundle");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>message-bundle</code> element 
    * @return the current instance of <code>FacesConfigApplicationType<T></code> 
    */
   public FacesConfigApplicationType<T> removeAllMessageBundle()
   {
      childNode.removeChildren("message-bundle");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigApplicationType ElementName: xsd:token ElementType : navigation-handler
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>navigation-handler</code> elements, 
    * a new <code>navigation-handler</code> element 
    * @param values list of <code>navigation-handler</code> objects 
    * @return the current instance of <code>FacesConfigApplicationType<T></code> 
    */
   public FacesConfigApplicationType<T> navigationHandler(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("navigation-handler").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>navigation-handler</code> elements
    * @return list of <code>navigation-handler</code> 
    */
public List<String> getAllNavigationHandler()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("navigation-handler");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>navigation-handler</code> element 
    * @return the current instance of <code>FacesConfigApplicationType<T></code> 
    */
   public FacesConfigApplicationType<T> removeAllNavigationHandler()
   {
      childNode.removeChildren("navigation-handler");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigApplicationType ElementName: xsd:token ElementType : view-handler
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>view-handler</code> elements, 
    * a new <code>view-handler</code> element 
    * @param values list of <code>view-handler</code> objects 
    * @return the current instance of <code>FacesConfigApplicationType<T></code> 
    */
   public FacesConfigApplicationType<T> viewHandler(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("view-handler").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>view-handler</code> elements
    * @return list of <code>view-handler</code> 
    */
public List<String> getAllViewHandler()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("view-handler");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>view-handler</code> element 
    * @return the current instance of <code>FacesConfigApplicationType<T></code> 
    */
   public FacesConfigApplicationType<T> removeAllViewHandler()
   {
      childNode.removeChildren("view-handler");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigApplicationType ElementName: xsd:token ElementType : state-manager
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>state-manager</code> elements, 
    * a new <code>state-manager</code> element 
    * @param values list of <code>state-manager</code> objects 
    * @return the current instance of <code>FacesConfigApplicationType<T></code> 
    */
   public FacesConfigApplicationType<T> stateManager(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("state-manager").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>state-manager</code> elements
    * @return list of <code>state-manager</code> 
    */
public List<String> getAllStateManager()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("state-manager");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>state-manager</code> element 
    * @return the current instance of <code>FacesConfigApplicationType<T></code> 
    */
   public FacesConfigApplicationType<T> removeAllStateManager()
   {
      childNode.removeChildren("state-manager");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigApplicationType ElementName: xsd:token ElementType : el-resolver
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>el-resolver</code> elements, 
    * a new <code>el-resolver</code> element 
    * @param values list of <code>el-resolver</code> objects 
    * @return the current instance of <code>FacesConfigApplicationType<T></code> 
    */
   public FacesConfigApplicationType<T> elResolver(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("el-resolver").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>el-resolver</code> elements
    * @return list of <code>el-resolver</code> 
    */
public List<String> getAllElResolver()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("el-resolver");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>el-resolver</code> element 
    * @return the current instance of <code>FacesConfigApplicationType<T></code> 
    */
   public FacesConfigApplicationType<T> removeAllElResolver()
   {
      childNode.removeChildren("el-resolver");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigApplicationType ElementName: xsd:token ElementType : property-resolver
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>property-resolver</code> elements, 
    * a new <code>property-resolver</code> element 
    * @param values list of <code>property-resolver</code> objects 
    * @return the current instance of <code>FacesConfigApplicationType<T></code> 
    */
   public FacesConfigApplicationType<T> propertyResolver(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("property-resolver").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>property-resolver</code> elements
    * @return list of <code>property-resolver</code> 
    */
public List<String> getAllPropertyResolver()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("property-resolver");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>property-resolver</code> element 
    * @return the current instance of <code>FacesConfigApplicationType<T></code> 
    */
   public FacesConfigApplicationType<T> removeAllPropertyResolver()
   {
      childNode.removeChildren("property-resolver");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigApplicationType ElementName: xsd:token ElementType : variable-resolver
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>variable-resolver</code> elements, 
    * a new <code>variable-resolver</code> element 
    * @param values list of <code>variable-resolver</code> objects 
    * @return the current instance of <code>FacesConfigApplicationType<T></code> 
    */
   public FacesConfigApplicationType<T> variableResolver(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("variable-resolver").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>variable-resolver</code> elements
    * @return list of <code>variable-resolver</code> 
    */
public List<String> getAllVariableResolver()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("variable-resolver");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>variable-resolver</code> element 
    * @return the current instance of <code>FacesConfigApplicationType<T></code> 
    */
   public FacesConfigApplicationType<T> removeAllVariableResolver()
   {
      childNode.removeChildren("variable-resolver");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigApplicationType ElementName: xsd:token ElementType : resource-handler
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>resource-handler</code> elements, 
    * a new <code>resource-handler</code> element 
    * @param values list of <code>resource-handler</code> objects 
    * @return the current instance of <code>FacesConfigApplicationType<T></code> 
    */
   public FacesConfigApplicationType<T> resourceHandler(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("resource-handler").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>resource-handler</code> elements
    * @return list of <code>resource-handler</code> 
    */
public List<String> getAllResourceHandler()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("resource-handler");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>resource-handler</code> element 
    * @return the current instance of <code>FacesConfigApplicationType<T></code> 
    */
   public FacesConfigApplicationType<T> removeAllResourceHandler()
   {
      childNode.removeChildren("resource-handler");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigApplicationType ElementName: javaee:faces-config-system-event-listenerType ElementType : system-event-listener
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>system-event-listener</code> element will be created and returned.
    * Otherwise, the first existing <code>system-event-listener</code> element will be returned.
    * @return the instance defined for the element <code>system-event-listener</code> 
    */
   public FacesConfigSystemEventListenerType<FacesConfigApplicationType<T>> getOrCreateSystemEventListener()
   {
      List<Node> nodeList = childNode.get("system-event-listener");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new FacesConfigSystemEventListenerTypeImpl<FacesConfigApplicationType<T>>(this, "system-event-listener", childNode, nodeList.get(0));
      }
      return createSystemEventListener();
   }

   /**
    * Creates a new <code>system-event-listener</code> element 
    * @return the new created instance of <code>FacesConfigSystemEventListenerType<FacesConfigApplicationType<T>></code> 
    */
   public FacesConfigSystemEventListenerType<FacesConfigApplicationType<T>> createSystemEventListener()
   {
      return new FacesConfigSystemEventListenerTypeImpl<FacesConfigApplicationType<T>>(this, "system-event-listener", childNode);
   }

   /**
    * Returns all <code>system-event-listener</code> elements
    * @return list of <code>system-event-listener</code> 
    */
   public List<FacesConfigSystemEventListenerType<FacesConfigApplicationType<T>>> getAllSystemEventListener()
   {
      List<FacesConfigSystemEventListenerType<FacesConfigApplicationType<T>>> list = new ArrayList<FacesConfigSystemEventListenerType<FacesConfigApplicationType<T>>>();
      List<Node> nodeList = childNode.get("system-event-listener");
      for(Node node: nodeList)
      {
         FacesConfigSystemEventListenerType<FacesConfigApplicationType<T>>  type = new FacesConfigSystemEventListenerTypeImpl<FacesConfigApplicationType<T>>(this, "system-event-listener", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>system-event-listener</code> elements 
    * @return the current instance of <code>FacesConfigSystemEventListenerType<FacesConfigApplicationType<T>></code> 
    */
   public FacesConfigApplicationType<T> removeAllSystemEventListener()
   {
      childNode.removeChildren("system-event-listener");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigApplicationType ElementName: javaee:faces-config-locale-configType ElementType : locale-config
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>locale-config</code> element will be created and returned.
    * Otherwise, the first existing <code>locale-config</code> element will be returned.
    * @return the instance defined for the element <code>locale-config</code> 
    */
   public FacesConfigLocaleConfigType<FacesConfigApplicationType<T>> getOrCreateLocaleConfig()
   {
      List<Node> nodeList = childNode.get("locale-config");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new FacesConfigLocaleConfigTypeImpl<FacesConfigApplicationType<T>>(this, "locale-config", childNode, nodeList.get(0));
      }
      return createLocaleConfig();
   }

   /**
    * Creates a new <code>locale-config</code> element 
    * @return the new created instance of <code>FacesConfigLocaleConfigType<FacesConfigApplicationType<T>></code> 
    */
   public FacesConfigLocaleConfigType<FacesConfigApplicationType<T>> createLocaleConfig()
   {
      return new FacesConfigLocaleConfigTypeImpl<FacesConfigApplicationType<T>>(this, "locale-config", childNode);
   }

   /**
    * Returns all <code>locale-config</code> elements
    * @return list of <code>locale-config</code> 
    */
   public List<FacesConfigLocaleConfigType<FacesConfigApplicationType<T>>> getAllLocaleConfig()
   {
      List<FacesConfigLocaleConfigType<FacesConfigApplicationType<T>>> list = new ArrayList<FacesConfigLocaleConfigType<FacesConfigApplicationType<T>>>();
      List<Node> nodeList = childNode.get("locale-config");
      for(Node node: nodeList)
      {
         FacesConfigLocaleConfigType<FacesConfigApplicationType<T>>  type = new FacesConfigLocaleConfigTypeImpl<FacesConfigApplicationType<T>>(this, "locale-config", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>locale-config</code> elements 
    * @return the current instance of <code>FacesConfigLocaleConfigType<FacesConfigApplicationType<T>></code> 
    */
   public FacesConfigApplicationType<T> removeAllLocaleConfig()
   {
      childNode.removeChildren("locale-config");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigApplicationType ElementName: javaee:faces-config-application-resource-bundleType ElementType : resource-bundle
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>resource-bundle</code> element will be created and returned.
    * Otherwise, the first existing <code>resource-bundle</code> element will be returned.
    * @return the instance defined for the element <code>resource-bundle</code> 
    */
   public FacesConfigApplicationResourceBundleType<FacesConfigApplicationType<T>> getOrCreateResourceBundle()
   {
      List<Node> nodeList = childNode.get("resource-bundle");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new FacesConfigApplicationResourceBundleTypeImpl<FacesConfigApplicationType<T>>(this, "resource-bundle", childNode, nodeList.get(0));
      }
      return createResourceBundle();
   }

   /**
    * Creates a new <code>resource-bundle</code> element 
    * @return the new created instance of <code>FacesConfigApplicationResourceBundleType<FacesConfigApplicationType<T>></code> 
    */
   public FacesConfigApplicationResourceBundleType<FacesConfigApplicationType<T>> createResourceBundle()
   {
      return new FacesConfigApplicationResourceBundleTypeImpl<FacesConfigApplicationType<T>>(this, "resource-bundle", childNode);
   }

   /**
    * Returns all <code>resource-bundle</code> elements
    * @return list of <code>resource-bundle</code> 
    */
   public List<FacesConfigApplicationResourceBundleType<FacesConfigApplicationType<T>>> getAllResourceBundle()
   {
      List<FacesConfigApplicationResourceBundleType<FacesConfigApplicationType<T>>> list = new ArrayList<FacesConfigApplicationResourceBundleType<FacesConfigApplicationType<T>>>();
      List<Node> nodeList = childNode.get("resource-bundle");
      for(Node node: nodeList)
      {
         FacesConfigApplicationResourceBundleType<FacesConfigApplicationType<T>>  type = new FacesConfigApplicationResourceBundleTypeImpl<FacesConfigApplicationType<T>>(this, "resource-bundle", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>resource-bundle</code> elements 
    * @return the current instance of <code>FacesConfigApplicationResourceBundleType<FacesConfigApplicationType<T>></code> 
    */
   public FacesConfigApplicationType<T> removeAllResourceBundle()
   {
      childNode.removeChildren("resource-bundle");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigApplicationType ElementName: javaee:faces-config-application-extensionType ElementType : application-extension
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>application-extension</code> element 
    * @return the current instance of <code>FacesConfigApplicationType<T></code> 
    */
   public FacesConfigApplicationType<T> applicationExtension()
   {
      childNode.getOrCreate("application-extension");
      return this;
   }

   /**
    * Removes the <code>application-extension</code> element 
    * @return the current instance of <code>FacesConfigApplicationType<T></code> 
    */
   public Boolean isApplicationExtension()
   {
      return childNode.getSingle("application-extension") != null;
   }

   /**
    * Removes the <code>application-extension</code> element 
    * @return the current instance of <code>FacesConfigApplicationType<T></code> 
    */
   public FacesConfigApplicationType<T> removeApplicationExtension()
   {
      childNode.removeChild("application-extension");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigApplicationType ElementName: javaee:faces-config-default-validatorsType ElementType : default-validators
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>default-validators</code> element will be created and returned.
    * Otherwise, the first existing <code>default-validators</code> element will be returned.
    * @return the instance defined for the element <code>default-validators</code> 
    */
   public FacesConfigDefaultValidatorsType<FacesConfigApplicationType<T>> getOrCreateDefaultValidators()
   {
      List<Node> nodeList = childNode.get("default-validators");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new FacesConfigDefaultValidatorsTypeImpl<FacesConfigApplicationType<T>>(this, "default-validators", childNode, nodeList.get(0));
      }
      return createDefaultValidators();
   }

   /**
    * Creates a new <code>default-validators</code> element 
    * @return the new created instance of <code>FacesConfigDefaultValidatorsType<FacesConfigApplicationType<T>></code> 
    */
   public FacesConfigDefaultValidatorsType<FacesConfigApplicationType<T>> createDefaultValidators()
   {
      return new FacesConfigDefaultValidatorsTypeImpl<FacesConfigApplicationType<T>>(this, "default-validators", childNode);
   }

   /**
    * Returns all <code>default-validators</code> elements
    * @return list of <code>default-validators</code> 
    */
   public List<FacesConfigDefaultValidatorsType<FacesConfigApplicationType<T>>> getAllDefaultValidators()
   {
      List<FacesConfigDefaultValidatorsType<FacesConfigApplicationType<T>>> list = new ArrayList<FacesConfigDefaultValidatorsType<FacesConfigApplicationType<T>>>();
      List<Node> nodeList = childNode.get("default-validators");
      for(Node node: nodeList)
      {
         FacesConfigDefaultValidatorsType<FacesConfigApplicationType<T>>  type = new FacesConfigDefaultValidatorsTypeImpl<FacesConfigApplicationType<T>>(this, "default-validators", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>default-validators</code> elements 
    * @return the current instance of <code>FacesConfigDefaultValidatorsType<FacesConfigApplicationType<T>></code> 
    */
   public FacesConfigApplicationType<T> removeAllDefaultValidators()
   {
      childNode.removeChildren("default-validators");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigApplicationType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>FacesConfigApplicationType<T></code> 
    */
   public FacesConfigApplicationType<T> id(String id)
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
    * @return the current instance of <code>FacesConfigApplicationType<T></code> 
    */
   public FacesConfigApplicationType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
