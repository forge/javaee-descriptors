package org.jboss.shrinkwrap.descriptor.impl.facesconfig22; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigFlowDefinitionFacesMethodCallType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigFlowDefinitionFlowCallType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigFlowDefinitionFlowReturnType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigFlowDefinitionInboundParameterType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigFlowDefinitionSwitchType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigFlowDefinitionType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigFlowDefinitionViewType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigNavigationRuleType;
import org.jboss.shrinkwrap.descriptor.api.javaee7.IconType;
import org.jboss.shrinkwrap.descriptor.impl.javaee7.IconTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> faces-config-flow-definitionType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class FacesConfigFlowDefinitionTypeImpl<T> implements Child<T>, FacesConfigFlowDefinitionType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public FacesConfigFlowDefinitionTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public FacesConfigFlowDefinitionTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFlowDefinitionType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>FacesConfigFlowDefinitionType<T></code> 
    */
   public FacesConfigFlowDefinitionType<T> description(String ... values)
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
    * @return the current instance of <code>FacesConfigFlowDefinitionType<T></code> 
    */
   public FacesConfigFlowDefinitionType<T> removeAllDescription()
   {
      childNode.removeChildren("description");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFlowDefinitionType ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>FacesConfigFlowDefinitionType<T></code> 
    */
   public FacesConfigFlowDefinitionType<T> displayName(String ... values)
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
    * @return the current instance of <code>FacesConfigFlowDefinitionType<T></code> 
    */
   public FacesConfigFlowDefinitionType<T> removeAllDisplayName()
   {
      childNode.removeChildren("display-name");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFlowDefinitionType ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<FacesConfigFlowDefinitionType<T>> getOrCreateIcon()
   {
      List<Node> nodeList = childNode.get("icon");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new IconTypeImpl<FacesConfigFlowDefinitionType<T>>(this, "icon", childNode, nodeList.get(0));
      }
      return createIcon();
   }

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<FacesConfigFlowDefinitionType<T>></code> 
    */
   public IconType<FacesConfigFlowDefinitionType<T>> createIcon()
   {
      return new IconTypeImpl<FacesConfigFlowDefinitionType<T>>(this, "icon", childNode);
   }

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<FacesConfigFlowDefinitionType<T>>> getAllIcon()
   {
      List<IconType<FacesConfigFlowDefinitionType<T>>> list = new ArrayList<IconType<FacesConfigFlowDefinitionType<T>>>();
      List<Node> nodeList = childNode.get("icon");
      for(Node node: nodeList)
      {
         IconType<FacesConfigFlowDefinitionType<T>>  type = new IconTypeImpl<FacesConfigFlowDefinitionType<T>>(this, "icon", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<FacesConfigFlowDefinitionType<T>></code> 
    */
   public FacesConfigFlowDefinitionType<T> removeAllIcon()
   {
      childNode.removeChildren("icon");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFlowDefinitionType ElementName: xsd:token ElementType : start-node
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>start-node</code> element
    * @param startNode the value for the element <code>start-node</code> 
    * @return the current instance of <code>FacesConfigFlowDefinitionType<T></code> 
    */
   public FacesConfigFlowDefinitionType<T> startNode(String startNode)
   {
      childNode.getOrCreate("start-node").text(startNode);
      return this;
   }

   /**
    * Returns the <code>start-node</code> element
    * @return the node defined for the element <code>start-node</code> 
    */
   public String getStartNode()
   {
      return childNode.getTextValueForPatternName("start-node");
   }

   /**
    * Removes the <code>start-node</code> element 
    * @return the current instance of <code>FacesConfigFlowDefinitionType<T></code> 
    */
   public FacesConfigFlowDefinitionType<T> removeStartNode()
   {
      childNode.removeChildren("start-node");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFlowDefinitionType ElementName: javaee:faces-config-flow-definition-viewType ElementType : view
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>view</code> element will be created and returned.
    * Otherwise, the first existing <code>view</code> element will be returned.
    * @return the instance defined for the element <code>view</code> 
    */
   public FacesConfigFlowDefinitionViewType<FacesConfigFlowDefinitionType<T>> getOrCreateView()
   {
      List<Node> nodeList = childNode.get("view");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new FacesConfigFlowDefinitionViewTypeImpl<FacesConfigFlowDefinitionType<T>>(this, "view", childNode, nodeList.get(0));
      }
      return createView();
   }

   /**
    * Creates a new <code>view</code> element 
    * @return the new created instance of <code>FacesConfigFlowDefinitionViewType<FacesConfigFlowDefinitionType<T>></code> 
    */
   public FacesConfigFlowDefinitionViewType<FacesConfigFlowDefinitionType<T>> createView()
   {
      return new FacesConfigFlowDefinitionViewTypeImpl<FacesConfigFlowDefinitionType<T>>(this, "view", childNode);
   }

   /**
    * Returns all <code>view</code> elements
    * @return list of <code>view</code> 
    */
   public List<FacesConfigFlowDefinitionViewType<FacesConfigFlowDefinitionType<T>>> getAllView()
   {
      List<FacesConfigFlowDefinitionViewType<FacesConfigFlowDefinitionType<T>>> list = new ArrayList<FacesConfigFlowDefinitionViewType<FacesConfigFlowDefinitionType<T>>>();
      List<Node> nodeList = childNode.get("view");
      for(Node node: nodeList)
      {
         FacesConfigFlowDefinitionViewType<FacesConfigFlowDefinitionType<T>>  type = new FacesConfigFlowDefinitionViewTypeImpl<FacesConfigFlowDefinitionType<T>>(this, "view", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>view</code> elements 
    * @return the current instance of <code>FacesConfigFlowDefinitionViewType<FacesConfigFlowDefinitionType<T>></code> 
    */
   public FacesConfigFlowDefinitionType<T> removeAllView()
   {
      childNode.removeChildren("view");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFlowDefinitionType ElementName: javaee:faces-config-flow-definition-switchType ElementType : switch
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>switch</code> element will be created and returned.
    * Otherwise, the first existing <code>switch</code> element will be returned.
    * @return the instance defined for the element <code>switch</code> 
    */
   public FacesConfigFlowDefinitionSwitchType<FacesConfigFlowDefinitionType<T>> getOrCreateSwitch()
   {
      List<Node> nodeList = childNode.get("switch");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new FacesConfigFlowDefinitionSwitchTypeImpl<FacesConfigFlowDefinitionType<T>>(this, "switch", childNode, nodeList.get(0));
      }
      return createSwitch();
   }

   /**
    * Creates a new <code>switch</code> element 
    * @return the new created instance of <code>FacesConfigFlowDefinitionSwitchType<FacesConfigFlowDefinitionType<T>></code> 
    */
   public FacesConfigFlowDefinitionSwitchType<FacesConfigFlowDefinitionType<T>> createSwitch()
   {
      return new FacesConfigFlowDefinitionSwitchTypeImpl<FacesConfigFlowDefinitionType<T>>(this, "switch", childNode);
   }

   /**
    * Returns all <code>switch</code> elements
    * @return list of <code>switch</code> 
    */
   public List<FacesConfigFlowDefinitionSwitchType<FacesConfigFlowDefinitionType<T>>> getAllSwitch()
   {
      List<FacesConfigFlowDefinitionSwitchType<FacesConfigFlowDefinitionType<T>>> list = new ArrayList<FacesConfigFlowDefinitionSwitchType<FacesConfigFlowDefinitionType<T>>>();
      List<Node> nodeList = childNode.get("switch");
      for(Node node: nodeList)
      {
         FacesConfigFlowDefinitionSwitchType<FacesConfigFlowDefinitionType<T>>  type = new FacesConfigFlowDefinitionSwitchTypeImpl<FacesConfigFlowDefinitionType<T>>(this, "switch", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>switch</code> elements 
    * @return the current instance of <code>FacesConfigFlowDefinitionSwitchType<FacesConfigFlowDefinitionType<T>></code> 
    */
   public FacesConfigFlowDefinitionType<T> removeAllSwitch()
   {
      childNode.removeChildren("switch");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFlowDefinitionType ElementName: javaee:faces-config-flow-definition-flow-returnType ElementType : flow-return
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>flow-return</code> element will be created and returned.
    * Otherwise, the first existing <code>flow-return</code> element will be returned.
    * @return the instance defined for the element <code>flow-return</code> 
    */
   public FacesConfigFlowDefinitionFlowReturnType<FacesConfigFlowDefinitionType<T>> getOrCreateFlowReturn()
   {
      List<Node> nodeList = childNode.get("flow-return");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new FacesConfigFlowDefinitionFlowReturnTypeImpl<FacesConfigFlowDefinitionType<T>>(this, "flow-return", childNode, nodeList.get(0));
      }
      return createFlowReturn();
   }

   /**
    * Creates a new <code>flow-return</code> element 
    * @return the new created instance of <code>FacesConfigFlowDefinitionFlowReturnType<FacesConfigFlowDefinitionType<T>></code> 
    */
   public FacesConfigFlowDefinitionFlowReturnType<FacesConfigFlowDefinitionType<T>> createFlowReturn()
   {
      return new FacesConfigFlowDefinitionFlowReturnTypeImpl<FacesConfigFlowDefinitionType<T>>(this, "flow-return", childNode);
   }

   /**
    * Returns all <code>flow-return</code> elements
    * @return list of <code>flow-return</code> 
    */
   public List<FacesConfigFlowDefinitionFlowReturnType<FacesConfigFlowDefinitionType<T>>> getAllFlowReturn()
   {
      List<FacesConfigFlowDefinitionFlowReturnType<FacesConfigFlowDefinitionType<T>>> list = new ArrayList<FacesConfigFlowDefinitionFlowReturnType<FacesConfigFlowDefinitionType<T>>>();
      List<Node> nodeList = childNode.get("flow-return");
      for(Node node: nodeList)
      {
         FacesConfigFlowDefinitionFlowReturnType<FacesConfigFlowDefinitionType<T>>  type = new FacesConfigFlowDefinitionFlowReturnTypeImpl<FacesConfigFlowDefinitionType<T>>(this, "flow-return", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>flow-return</code> elements 
    * @return the current instance of <code>FacesConfigFlowDefinitionFlowReturnType<FacesConfigFlowDefinitionType<T>></code> 
    */
   public FacesConfigFlowDefinitionType<T> removeAllFlowReturn()
   {
      childNode.removeChildren("flow-return");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFlowDefinitionType ElementName: javaee:faces-config-navigation-ruleType ElementType : navigation-rule
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>navigation-rule</code> element will be created and returned.
    * Otherwise, the first existing <code>navigation-rule</code> element will be returned.
    * @return the instance defined for the element <code>navigation-rule</code> 
    */
   public FacesConfigNavigationRuleType<FacesConfigFlowDefinitionType<T>> getOrCreateNavigationRule()
   {
      List<Node> nodeList = childNode.get("navigation-rule");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new FacesConfigNavigationRuleTypeImpl<FacesConfigFlowDefinitionType<T>>(this, "navigation-rule", childNode, nodeList.get(0));
      }
      return createNavigationRule();
   }

   /**
    * Creates a new <code>navigation-rule</code> element 
    * @return the new created instance of <code>FacesConfigNavigationRuleType<FacesConfigFlowDefinitionType<T>></code> 
    */
   public FacesConfigNavigationRuleType<FacesConfigFlowDefinitionType<T>> createNavigationRule()
   {
      return new FacesConfigNavigationRuleTypeImpl<FacesConfigFlowDefinitionType<T>>(this, "navigation-rule", childNode);
   }

   /**
    * Returns all <code>navigation-rule</code> elements
    * @return list of <code>navigation-rule</code> 
    */
   public List<FacesConfigNavigationRuleType<FacesConfigFlowDefinitionType<T>>> getAllNavigationRule()
   {
      List<FacesConfigNavigationRuleType<FacesConfigFlowDefinitionType<T>>> list = new ArrayList<FacesConfigNavigationRuleType<FacesConfigFlowDefinitionType<T>>>();
      List<Node> nodeList = childNode.get("navigation-rule");
      for(Node node: nodeList)
      {
         FacesConfigNavigationRuleType<FacesConfigFlowDefinitionType<T>>  type = new FacesConfigNavigationRuleTypeImpl<FacesConfigFlowDefinitionType<T>>(this, "navigation-rule", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>navigation-rule</code> elements 
    * @return the current instance of <code>FacesConfigNavigationRuleType<FacesConfigFlowDefinitionType<T>></code> 
    */
   public FacesConfigFlowDefinitionType<T> removeAllNavigationRule()
   {
      childNode.removeChildren("navigation-rule");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFlowDefinitionType ElementName: javaee:faces-config-flow-definition-flow-callType ElementType : flow-call
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>flow-call</code> element will be created and returned.
    * Otherwise, the first existing <code>flow-call</code> element will be returned.
    * @return the instance defined for the element <code>flow-call</code> 
    */
   public FacesConfigFlowDefinitionFlowCallType<FacesConfigFlowDefinitionType<T>> getOrCreateFlowCall()
   {
      List<Node> nodeList = childNode.get("flow-call");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new FacesConfigFlowDefinitionFlowCallTypeImpl<FacesConfigFlowDefinitionType<T>>(this, "flow-call", childNode, nodeList.get(0));
      }
      return createFlowCall();
   }

   /**
    * Creates a new <code>flow-call</code> element 
    * @return the new created instance of <code>FacesConfigFlowDefinitionFlowCallType<FacesConfigFlowDefinitionType<T>></code> 
    */
   public FacesConfigFlowDefinitionFlowCallType<FacesConfigFlowDefinitionType<T>> createFlowCall()
   {
      return new FacesConfigFlowDefinitionFlowCallTypeImpl<FacesConfigFlowDefinitionType<T>>(this, "flow-call", childNode);
   }

   /**
    * Returns all <code>flow-call</code> elements
    * @return list of <code>flow-call</code> 
    */
   public List<FacesConfigFlowDefinitionFlowCallType<FacesConfigFlowDefinitionType<T>>> getAllFlowCall()
   {
      List<FacesConfigFlowDefinitionFlowCallType<FacesConfigFlowDefinitionType<T>>> list = new ArrayList<FacesConfigFlowDefinitionFlowCallType<FacesConfigFlowDefinitionType<T>>>();
      List<Node> nodeList = childNode.get("flow-call");
      for(Node node: nodeList)
      {
         FacesConfigFlowDefinitionFlowCallType<FacesConfigFlowDefinitionType<T>>  type = new FacesConfigFlowDefinitionFlowCallTypeImpl<FacesConfigFlowDefinitionType<T>>(this, "flow-call", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>flow-call</code> elements 
    * @return the current instance of <code>FacesConfigFlowDefinitionFlowCallType<FacesConfigFlowDefinitionType<T>></code> 
    */
   public FacesConfigFlowDefinitionType<T> removeAllFlowCall()
   {
      childNode.removeChildren("flow-call");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFlowDefinitionType ElementName: javaee:faces-config-flow-definition-faces-method-callType ElementType : method-call
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>method-call</code> element will be created and returned.
    * Otherwise, the first existing <code>method-call</code> element will be returned.
    * @return the instance defined for the element <code>method-call</code> 
    */
   public FacesConfigFlowDefinitionFacesMethodCallType<FacesConfigFlowDefinitionType<T>> getOrCreateMethodCall()
   {
      List<Node> nodeList = childNode.get("method-call");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new FacesConfigFlowDefinitionFacesMethodCallTypeImpl<FacesConfigFlowDefinitionType<T>>(this, "method-call", childNode, nodeList.get(0));
      }
      return createMethodCall();
   }

   /**
    * Creates a new <code>method-call</code> element 
    * @return the new created instance of <code>FacesConfigFlowDefinitionFacesMethodCallType<FacesConfigFlowDefinitionType<T>></code> 
    */
   public FacesConfigFlowDefinitionFacesMethodCallType<FacesConfigFlowDefinitionType<T>> createMethodCall()
   {
      return new FacesConfigFlowDefinitionFacesMethodCallTypeImpl<FacesConfigFlowDefinitionType<T>>(this, "method-call", childNode);
   }

   /**
    * Returns all <code>method-call</code> elements
    * @return list of <code>method-call</code> 
    */
   public List<FacesConfigFlowDefinitionFacesMethodCallType<FacesConfigFlowDefinitionType<T>>> getAllMethodCall()
   {
      List<FacesConfigFlowDefinitionFacesMethodCallType<FacesConfigFlowDefinitionType<T>>> list = new ArrayList<FacesConfigFlowDefinitionFacesMethodCallType<FacesConfigFlowDefinitionType<T>>>();
      List<Node> nodeList = childNode.get("method-call");
      for(Node node: nodeList)
      {
         FacesConfigFlowDefinitionFacesMethodCallType<FacesConfigFlowDefinitionType<T>>  type = new FacesConfigFlowDefinitionFacesMethodCallTypeImpl<FacesConfigFlowDefinitionType<T>>(this, "method-call", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>method-call</code> elements 
    * @return the current instance of <code>FacesConfigFlowDefinitionFacesMethodCallType<FacesConfigFlowDefinitionType<T>></code> 
    */
   public FacesConfigFlowDefinitionType<T> removeAllMethodCall()
   {
      childNode.removeChildren("method-call");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFlowDefinitionType ElementName: javaee:faces-config-el-expressionType ElementType : initializer
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>initializer</code> element
    * @param initializer the value for the element <code>initializer</code> 
    * @return the current instance of <code>FacesConfigFlowDefinitionType<T></code> 
    */
   public FacesConfigFlowDefinitionType<T> initializer(String initializer)
   {
      childNode.getOrCreate("initializer").text(initializer);
      return this;
   }

   /**
    * Returns the <code>initializer</code> element
    * @return the node defined for the element <code>initializer</code> 
    */
   public String getInitializer()
   {
      return childNode.getTextValueForPatternName("initializer");
   }

   /**
    * Removes the <code>initializer</code> element 
    * @return the current instance of <code>FacesConfigFlowDefinitionType<T></code> 
    */
   public FacesConfigFlowDefinitionType<T> removeInitializer()
   {
      childNode.removeChildren("initializer");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFlowDefinitionType ElementName: javaee:faces-config-el-expressionType ElementType : finalizer
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>finalizer</code> element
    * @param finalizer the value for the element <code>finalizer</code> 
    * @return the current instance of <code>FacesConfigFlowDefinitionType<T></code> 
    */
   public FacesConfigFlowDefinitionType<T> finalizer(String finalizer)
   {
      childNode.getOrCreate("finalizer").text(finalizer);
      return this;
   }

   /**
    * Returns the <code>finalizer</code> element
    * @return the node defined for the element <code>finalizer</code> 
    */
   public String getFinalizer()
   {
      return childNode.getTextValueForPatternName("finalizer");
   }

   /**
    * Removes the <code>finalizer</code> element 
    * @return the current instance of <code>FacesConfigFlowDefinitionType<T></code> 
    */
   public FacesConfigFlowDefinitionType<T> removeFinalizer()
   {
      childNode.removeChildren("finalizer");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFlowDefinitionType ElementName: javaee:faces-config-flow-definition-inbound-parameterType ElementType : inbound-parameter
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>inbound-parameter</code> element will be created and returned.
    * Otherwise, the first existing <code>inbound-parameter</code> element will be returned.
    * @return the instance defined for the element <code>inbound-parameter</code> 
    */
   public FacesConfigFlowDefinitionInboundParameterType<FacesConfigFlowDefinitionType<T>> getOrCreateInboundParameter()
   {
      List<Node> nodeList = childNode.get("inbound-parameter");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new FacesConfigFlowDefinitionInboundParameterTypeImpl<FacesConfigFlowDefinitionType<T>>(this, "inbound-parameter", childNode, nodeList.get(0));
      }
      return createInboundParameter();
   }

   /**
    * Creates a new <code>inbound-parameter</code> element 
    * @return the new created instance of <code>FacesConfigFlowDefinitionInboundParameterType<FacesConfigFlowDefinitionType<T>></code> 
    */
   public FacesConfigFlowDefinitionInboundParameterType<FacesConfigFlowDefinitionType<T>> createInboundParameter()
   {
      return new FacesConfigFlowDefinitionInboundParameterTypeImpl<FacesConfigFlowDefinitionType<T>>(this, "inbound-parameter", childNode);
   }

   /**
    * Returns all <code>inbound-parameter</code> elements
    * @return list of <code>inbound-parameter</code> 
    */
   public List<FacesConfigFlowDefinitionInboundParameterType<FacesConfigFlowDefinitionType<T>>> getAllInboundParameter()
   {
      List<FacesConfigFlowDefinitionInboundParameterType<FacesConfigFlowDefinitionType<T>>> list = new ArrayList<FacesConfigFlowDefinitionInboundParameterType<FacesConfigFlowDefinitionType<T>>>();
      List<Node> nodeList = childNode.get("inbound-parameter");
      for(Node node: nodeList)
      {
         FacesConfigFlowDefinitionInboundParameterType<FacesConfigFlowDefinitionType<T>>  type = new FacesConfigFlowDefinitionInboundParameterTypeImpl<FacesConfigFlowDefinitionType<T>>(this, "inbound-parameter", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>inbound-parameter</code> elements 
    * @return the current instance of <code>FacesConfigFlowDefinitionInboundParameterType<FacesConfigFlowDefinitionType<T>></code> 
    */
   public FacesConfigFlowDefinitionType<T> removeAllInboundParameter()
   {
      childNode.removeChildren("inbound-parameter");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFlowDefinitionType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>FacesConfigFlowDefinitionType<T></code> 
    */
   public FacesConfigFlowDefinitionType<T> id(String id)
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
    * @return the current instance of <code>FacesConfigFlowDefinitionType<T></code> 
    */
   public FacesConfigFlowDefinitionType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
