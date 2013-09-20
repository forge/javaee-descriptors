package org.jboss.shrinkwrap.descriptor.impl.facesconfig22; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigFlowDefinitionFacesMethodCallType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigFlowDefinitionFlowCallParameterType;
import org.jboss.shrinkwrap.descriptor.impl.facesconfig22.FacesConfigFlowDefinitionFlowCallParameterTypeImpl;

/**
 * This class implements the <code> faces-config-flow-definition-faces-method-callType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class FacesConfigFlowDefinitionFacesMethodCallTypeImpl<T> implements Child<T>, FacesConfigFlowDefinitionFacesMethodCallType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public FacesConfigFlowDefinitionFacesMethodCallTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public FacesConfigFlowDefinitionFacesMethodCallTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFlowDefinitionFacesMethodCallType ElementName: javaee:faces-config-el-expressionType ElementType : method
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>method</code> element
    * @param method the value for the element <code>method</code> 
    * @return the current instance of <code>FacesConfigFlowDefinitionFacesMethodCallType<T></code> 
    */
   public FacesConfigFlowDefinitionFacesMethodCallType<T> method(String method)
   {
      childNode.getOrCreate("method").text(method);
      return this;
   }

   /**
    * Returns the <code>method</code> element
    * @return the node defined for the element <code>method</code> 
    */
   public String getMethod()
   {
      return childNode.getTextValueForPatternName("method");
   }

   /**
    * Removes the <code>method</code> element 
    * @return the current instance of <code>FacesConfigFlowDefinitionFacesMethodCallType<T></code> 
    */
   public FacesConfigFlowDefinitionFacesMethodCallType<T> removeMethod()
   {
      childNode.removeChildren("method");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFlowDefinitionFacesMethodCallType ElementName: xsd:token ElementType : default-outcome
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>default-outcome</code> element
    * @param defaultOutcome the value for the element <code>default-outcome</code> 
    * @return the current instance of <code>FacesConfigFlowDefinitionFacesMethodCallType<T></code> 
    */
   public FacesConfigFlowDefinitionFacesMethodCallType<T> defaultOutcome(String defaultOutcome)
   {
      childNode.getOrCreate("default-outcome").text(defaultOutcome);
      return this;
   }

   /**
    * Returns the <code>default-outcome</code> element
    * @return the node defined for the element <code>default-outcome</code> 
    */
   public String getDefaultOutcome()
   {
      return childNode.getTextValueForPatternName("default-outcome");
   }

   /**
    * Removes the <code>default-outcome</code> element 
    * @return the current instance of <code>FacesConfigFlowDefinitionFacesMethodCallType<T></code> 
    */
   public FacesConfigFlowDefinitionFacesMethodCallType<T> removeDefaultOutcome()
   {
      childNode.removeChildren("default-outcome");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFlowDefinitionFacesMethodCallType ElementName: javaee:faces-config-flow-definition-flow-call-parameterType ElementType : parameter
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>parameter</code> element will be created and returned.
    * Otherwise, the first existing <code>parameter</code> element will be returned.
    * @return the instance defined for the element <code>parameter</code> 
    */
   public FacesConfigFlowDefinitionFlowCallParameterType<FacesConfigFlowDefinitionFacesMethodCallType<T>> getOrCreateParameter()
   {
      List<Node> nodeList = childNode.get("parameter");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new FacesConfigFlowDefinitionFlowCallParameterTypeImpl<FacesConfigFlowDefinitionFacesMethodCallType<T>>(this, "parameter", childNode, nodeList.get(0));
      }
      return createParameter();
   }

   /**
    * Creates a new <code>parameter</code> element 
    * @return the new created instance of <code>FacesConfigFlowDefinitionFlowCallParameterType<FacesConfigFlowDefinitionFacesMethodCallType<T>></code> 
    */
   public FacesConfigFlowDefinitionFlowCallParameterType<FacesConfigFlowDefinitionFacesMethodCallType<T>> createParameter()
   {
      return new FacesConfigFlowDefinitionFlowCallParameterTypeImpl<FacesConfigFlowDefinitionFacesMethodCallType<T>>(this, "parameter", childNode);
   }

   /**
    * Returns all <code>parameter</code> elements
    * @return list of <code>parameter</code> 
    */
   public List<FacesConfigFlowDefinitionFlowCallParameterType<FacesConfigFlowDefinitionFacesMethodCallType<T>>> getAllParameter()
   {
      List<FacesConfigFlowDefinitionFlowCallParameterType<FacesConfigFlowDefinitionFacesMethodCallType<T>>> list = new ArrayList<FacesConfigFlowDefinitionFlowCallParameterType<FacesConfigFlowDefinitionFacesMethodCallType<T>>>();
      List<Node> nodeList = childNode.get("parameter");
      for(Node node: nodeList)
      {
         FacesConfigFlowDefinitionFlowCallParameterType<FacesConfigFlowDefinitionFacesMethodCallType<T>>  type = new FacesConfigFlowDefinitionFlowCallParameterTypeImpl<FacesConfigFlowDefinitionFacesMethodCallType<T>>(this, "parameter", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>parameter</code> elements 
    * @return the current instance of <code>FacesConfigFlowDefinitionFlowCallParameterType<FacesConfigFlowDefinitionFacesMethodCallType<T>></code> 
    */
   public FacesConfigFlowDefinitionFacesMethodCallType<T> removeAllParameter()
   {
      childNode.removeChildren("parameter");
      return this;
   }
}
