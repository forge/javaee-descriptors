package org.jboss.shrinkwrap.descriptor.api.facesconfig22; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigFlowDefinitionViewType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigFlowDefinitionSwitchType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigFlowDefinitionFlowReturnType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigNavigationRuleType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigFlowDefinitionFlowCallType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigFlowDefinitionFacesMethodCallType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigFlowDefinitionInboundParameterType;
import org.jboss.shrinkwrap.descriptor.api.javaee7.IconType;
/**
 * This interface defines the contract for the <code> faces-config-flow-definitionType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface FacesConfigFlowDefinitionType<T> extends Child<T>
{
 
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
   public FacesConfigFlowDefinitionType<T> description(String ... values);

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>FacesConfigFlowDefinitionType<T></code> 
    */
   public FacesConfigFlowDefinitionType<T> removeAllDescription();
 
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
   public FacesConfigFlowDefinitionType<T> displayName(String ... values);

   /**
    * Returns all <code>display-name</code> elements
    * @return list of <code>display-name</code> 
    */
   public List<String> getAllDisplayName();

   /**
    * Removes the <code>display-name</code> element 
    * @return the current instance of <code>FacesConfigFlowDefinitionType<T></code> 
    */
   public FacesConfigFlowDefinitionType<T> removeAllDisplayName();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFlowDefinitionType ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<FacesConfigFlowDefinitionType<T>> getOrCreateIcon();

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<FacesConfigFlowDefinitionType<T>></code> 
    */
   public IconType<FacesConfigFlowDefinitionType<T>> createIcon();

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<FacesConfigFlowDefinitionType<T>>> getAllIcon();

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<FacesConfigFlowDefinitionType<T>></code> 
    */
   public FacesConfigFlowDefinitionType<T> removeAllIcon();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFlowDefinitionType ElementName: xsd:token ElementType : start-node
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>start-node</code> element
    * @param startNode the value for the element <code>start-node</code> 
    * @return the current instance of <code>FacesConfigFlowDefinitionType<T></code> 
    */
   public FacesConfigFlowDefinitionType<T> startNode(String startNode);

   /**
    * Returns the <code>start-node</code> element
    * @return the node defined for the element <code>start-node</code> 
    */
   public String getStartNode();

   /**
    * Removes the <code>start-node</code> element 
    * @return the current instance of <code>FacesConfigFlowDefinitionType<T></code> 
    */
   public FacesConfigFlowDefinitionType<T> removeStartNode();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFlowDefinitionType ElementName: javaee:faces-config-flow-definition-viewType ElementType : view
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>view</code> element will be created and returned.
    * Otherwise, the first existing <code>view</code> element will be returned.
    * @return the instance defined for the element <code>view</code> 
    */
   public FacesConfigFlowDefinitionViewType<FacesConfigFlowDefinitionType<T>> getOrCreateView();

   /**
    * Creates a new <code>view</code> element 
    * @return the new created instance of <code>FacesConfigFlowDefinitionViewType<FacesConfigFlowDefinitionType<T>></code> 
    */
   public FacesConfigFlowDefinitionViewType<FacesConfigFlowDefinitionType<T>> createView();

   /**
    * Returns all <code>view</code> elements
    * @return list of <code>view</code> 
    */
   public List<FacesConfigFlowDefinitionViewType<FacesConfigFlowDefinitionType<T>>> getAllView();

   /**
    * Removes all <code>view</code> elements 
    * @return the current instance of <code>FacesConfigFlowDefinitionViewType<FacesConfigFlowDefinitionType<T>></code> 
    */
   public FacesConfigFlowDefinitionType<T> removeAllView();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFlowDefinitionType ElementName: javaee:faces-config-flow-definition-switchType ElementType : switch
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>switch</code> element will be created and returned.
    * Otherwise, the first existing <code>switch</code> element will be returned.
    * @return the instance defined for the element <code>switch</code> 
    */
   public FacesConfigFlowDefinitionSwitchType<FacesConfigFlowDefinitionType<T>> getOrCreateSwitch();

   /**
    * Creates a new <code>switch</code> element 
    * @return the new created instance of <code>FacesConfigFlowDefinitionSwitchType<FacesConfigFlowDefinitionType<T>></code> 
    */
   public FacesConfigFlowDefinitionSwitchType<FacesConfigFlowDefinitionType<T>> createSwitch();

   /**
    * Returns all <code>switch</code> elements
    * @return list of <code>switch</code> 
    */
   public List<FacesConfigFlowDefinitionSwitchType<FacesConfigFlowDefinitionType<T>>> getAllSwitch();

   /**
    * Removes all <code>switch</code> elements 
    * @return the current instance of <code>FacesConfigFlowDefinitionSwitchType<FacesConfigFlowDefinitionType<T>></code> 
    */
   public FacesConfigFlowDefinitionType<T> removeAllSwitch();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFlowDefinitionType ElementName: javaee:faces-config-flow-definition-flow-returnType ElementType : flow-return
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>flow-return</code> element will be created and returned.
    * Otherwise, the first existing <code>flow-return</code> element will be returned.
    * @return the instance defined for the element <code>flow-return</code> 
    */
   public FacesConfigFlowDefinitionFlowReturnType<FacesConfigFlowDefinitionType<T>> getOrCreateFlowReturn();

   /**
    * Creates a new <code>flow-return</code> element 
    * @return the new created instance of <code>FacesConfigFlowDefinitionFlowReturnType<FacesConfigFlowDefinitionType<T>></code> 
    */
   public FacesConfigFlowDefinitionFlowReturnType<FacesConfigFlowDefinitionType<T>> createFlowReturn();

   /**
    * Returns all <code>flow-return</code> elements
    * @return list of <code>flow-return</code> 
    */
   public List<FacesConfigFlowDefinitionFlowReturnType<FacesConfigFlowDefinitionType<T>>> getAllFlowReturn();

   /**
    * Removes all <code>flow-return</code> elements 
    * @return the current instance of <code>FacesConfigFlowDefinitionFlowReturnType<FacesConfigFlowDefinitionType<T>></code> 
    */
   public FacesConfigFlowDefinitionType<T> removeAllFlowReturn();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFlowDefinitionType ElementName: javaee:faces-config-navigation-ruleType ElementType : navigation-rule
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>navigation-rule</code> element will be created and returned.
    * Otherwise, the first existing <code>navigation-rule</code> element will be returned.
    * @return the instance defined for the element <code>navigation-rule</code> 
    */
   public FacesConfigNavigationRuleType<FacesConfigFlowDefinitionType<T>> getOrCreateNavigationRule();

   /**
    * Creates a new <code>navigation-rule</code> element 
    * @return the new created instance of <code>FacesConfigNavigationRuleType<FacesConfigFlowDefinitionType<T>></code> 
    */
   public FacesConfigNavigationRuleType<FacesConfigFlowDefinitionType<T>> createNavigationRule();

   /**
    * Returns all <code>navigation-rule</code> elements
    * @return list of <code>navigation-rule</code> 
    */
   public List<FacesConfigNavigationRuleType<FacesConfigFlowDefinitionType<T>>> getAllNavigationRule();

   /**
    * Removes all <code>navigation-rule</code> elements 
    * @return the current instance of <code>FacesConfigNavigationRuleType<FacesConfigFlowDefinitionType<T>></code> 
    */
   public FacesConfigFlowDefinitionType<T> removeAllNavigationRule();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFlowDefinitionType ElementName: javaee:faces-config-flow-definition-flow-callType ElementType : flow-call
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>flow-call</code> element will be created and returned.
    * Otherwise, the first existing <code>flow-call</code> element will be returned.
    * @return the instance defined for the element <code>flow-call</code> 
    */
   public FacesConfigFlowDefinitionFlowCallType<FacesConfigFlowDefinitionType<T>> getOrCreateFlowCall();

   /**
    * Creates a new <code>flow-call</code> element 
    * @return the new created instance of <code>FacesConfigFlowDefinitionFlowCallType<FacesConfigFlowDefinitionType<T>></code> 
    */
   public FacesConfigFlowDefinitionFlowCallType<FacesConfigFlowDefinitionType<T>> createFlowCall();

   /**
    * Returns all <code>flow-call</code> elements
    * @return list of <code>flow-call</code> 
    */
   public List<FacesConfigFlowDefinitionFlowCallType<FacesConfigFlowDefinitionType<T>>> getAllFlowCall();

   /**
    * Removes all <code>flow-call</code> elements 
    * @return the current instance of <code>FacesConfigFlowDefinitionFlowCallType<FacesConfigFlowDefinitionType<T>></code> 
    */
   public FacesConfigFlowDefinitionType<T> removeAllFlowCall();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFlowDefinitionType ElementName: javaee:faces-config-flow-definition-faces-method-callType ElementType : method-call
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>method-call</code> element will be created and returned.
    * Otherwise, the first existing <code>method-call</code> element will be returned.
    * @return the instance defined for the element <code>method-call</code> 
    */
   public FacesConfigFlowDefinitionFacesMethodCallType<FacesConfigFlowDefinitionType<T>> getOrCreateMethodCall();

   /**
    * Creates a new <code>method-call</code> element 
    * @return the new created instance of <code>FacesConfigFlowDefinitionFacesMethodCallType<FacesConfigFlowDefinitionType<T>></code> 
    */
   public FacesConfigFlowDefinitionFacesMethodCallType<FacesConfigFlowDefinitionType<T>> createMethodCall();

   /**
    * Returns all <code>method-call</code> elements
    * @return list of <code>method-call</code> 
    */
   public List<FacesConfigFlowDefinitionFacesMethodCallType<FacesConfigFlowDefinitionType<T>>> getAllMethodCall();

   /**
    * Removes all <code>method-call</code> elements 
    * @return the current instance of <code>FacesConfigFlowDefinitionFacesMethodCallType<FacesConfigFlowDefinitionType<T>></code> 
    */
   public FacesConfigFlowDefinitionType<T> removeAllMethodCall();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFlowDefinitionType ElementName: javaee:faces-config-el-expressionType ElementType : initializer
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>initializer</code> element
    * @param initializer the value for the element <code>initializer</code> 
    * @return the current instance of <code>FacesConfigFlowDefinitionType<T></code> 
    */
   public FacesConfigFlowDefinitionType<T> initializer(String initializer);

   /**
    * Returns the <code>initializer</code> element
    * @return the node defined for the element <code>initializer</code> 
    */
   public String getInitializer();

   /**
    * Removes the <code>initializer</code> element 
    * @return the current instance of <code>FacesConfigFlowDefinitionType<T></code> 
    */
   public FacesConfigFlowDefinitionType<T> removeInitializer();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFlowDefinitionType ElementName: javaee:faces-config-el-expressionType ElementType : finalizer
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>finalizer</code> element
    * @param finalizer the value for the element <code>finalizer</code> 
    * @return the current instance of <code>FacesConfigFlowDefinitionType<T></code> 
    */
   public FacesConfigFlowDefinitionType<T> finalizer(String finalizer);

   /**
    * Returns the <code>finalizer</code> element
    * @return the node defined for the element <code>finalizer</code> 
    */
   public String getFinalizer();

   /**
    * Removes the <code>finalizer</code> element 
    * @return the current instance of <code>FacesConfigFlowDefinitionType<T></code> 
    */
   public FacesConfigFlowDefinitionType<T> removeFinalizer();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFlowDefinitionType ElementName: javaee:faces-config-flow-definition-inbound-parameterType ElementType : inbound-parameter
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>inbound-parameter</code> element will be created and returned.
    * Otherwise, the first existing <code>inbound-parameter</code> element will be returned.
    * @return the instance defined for the element <code>inbound-parameter</code> 
    */
   public FacesConfigFlowDefinitionInboundParameterType<FacesConfigFlowDefinitionType<T>> getOrCreateInboundParameter();

   /**
    * Creates a new <code>inbound-parameter</code> element 
    * @return the new created instance of <code>FacesConfigFlowDefinitionInboundParameterType<FacesConfigFlowDefinitionType<T>></code> 
    */
   public FacesConfigFlowDefinitionInboundParameterType<FacesConfigFlowDefinitionType<T>> createInboundParameter();

   /**
    * Returns all <code>inbound-parameter</code> elements
    * @return list of <code>inbound-parameter</code> 
    */
   public List<FacesConfigFlowDefinitionInboundParameterType<FacesConfigFlowDefinitionType<T>>> getAllInboundParameter();

   /**
    * Removes all <code>inbound-parameter</code> elements 
    * @return the current instance of <code>FacesConfigFlowDefinitionInboundParameterType<FacesConfigFlowDefinitionType<T>></code> 
    */
   public FacesConfigFlowDefinitionType<T> removeAllInboundParameter();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFlowDefinitionType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>FacesConfigFlowDefinitionType<T></code> 
    */
   public FacesConfigFlowDefinitionType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>FacesConfigFlowDefinitionType<T></code> 
    */
   public FacesConfigFlowDefinitionType<T> removeId();
}
