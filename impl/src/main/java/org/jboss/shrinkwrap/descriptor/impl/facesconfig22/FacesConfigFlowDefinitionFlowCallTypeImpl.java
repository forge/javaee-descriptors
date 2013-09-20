package org.jboss.shrinkwrap.descriptor.impl.facesconfig22; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigFlowDefinitionFlowCallFlowReferenceType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigFlowDefinitionFlowCallOutboundParameterType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigFlowDefinitionFlowCallType;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> faces-config-flow-definition-flow-callType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class FacesConfigFlowDefinitionFlowCallTypeImpl<T> implements Child<T>, FacesConfigFlowDefinitionFlowCallType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public FacesConfigFlowDefinitionFlowCallTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public FacesConfigFlowDefinitionFlowCallTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFlowDefinitionFlowCallType ElementName: javaee:faces-config-flow-definition-flow-call-flow-referenceType ElementType : flow-reference
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>flow-reference</code> element with the given value will be created.
    * Otherwise, the existing <code>flow-reference</code> element will be returned.
    * @return  a new or existing instance of <code>FacesConfigFlowDefinitionFlowCallFlowReferenceType<FacesConfigFlowDefinitionFlowCallType<T>></code> 
    */
   public FacesConfigFlowDefinitionFlowCallFlowReferenceType<FacesConfigFlowDefinitionFlowCallType<T>> getOrCreateFlowReference()
   {
      Node node = childNode.getOrCreate("flow-reference");
      FacesConfigFlowDefinitionFlowCallFlowReferenceType<FacesConfigFlowDefinitionFlowCallType<T>> flowReference = new FacesConfigFlowDefinitionFlowCallFlowReferenceTypeImpl<FacesConfigFlowDefinitionFlowCallType<T>>(this, "flow-reference", childNode, node);
      return flowReference;
   }

   /**
    * Removes the <code>flow-reference</code> element 
    * @return the current instance of <code>FacesConfigFlowDefinitionFlowCallType<T></code> 
    */
   public FacesConfigFlowDefinitionFlowCallType<T> removeFlowReference()
   {
      childNode.removeChildren("flow-reference");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFlowDefinitionFlowCallType ElementName: javaee:faces-config-flow-definition-flow-call-outbound-parameterType ElementType : outbound-parameter
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>outbound-parameter</code> element will be created and returned.
    * Otherwise, the first existing <code>outbound-parameter</code> element will be returned.
    * @return the instance defined for the element <code>outbound-parameter</code> 
    */
   public FacesConfigFlowDefinitionFlowCallOutboundParameterType<FacesConfigFlowDefinitionFlowCallType<T>> getOrCreateOutboundParameter()
   {
      List<Node> nodeList = childNode.get("outbound-parameter");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new FacesConfigFlowDefinitionFlowCallOutboundParameterTypeImpl<FacesConfigFlowDefinitionFlowCallType<T>>(this, "outbound-parameter", childNode, nodeList.get(0));
      }
      return createOutboundParameter();
   }

   /**
    * Creates a new <code>outbound-parameter</code> element 
    * @return the new created instance of <code>FacesConfigFlowDefinitionFlowCallOutboundParameterType<FacesConfigFlowDefinitionFlowCallType<T>></code> 
    */
   public FacesConfigFlowDefinitionFlowCallOutboundParameterType<FacesConfigFlowDefinitionFlowCallType<T>> createOutboundParameter()
   {
      return new FacesConfigFlowDefinitionFlowCallOutboundParameterTypeImpl<FacesConfigFlowDefinitionFlowCallType<T>>(this, "outbound-parameter", childNode);
   }

   /**
    * Returns all <code>outbound-parameter</code> elements
    * @return list of <code>outbound-parameter</code> 
    */
   public List<FacesConfigFlowDefinitionFlowCallOutboundParameterType<FacesConfigFlowDefinitionFlowCallType<T>>> getAllOutboundParameter()
   {
      List<FacesConfigFlowDefinitionFlowCallOutboundParameterType<FacesConfigFlowDefinitionFlowCallType<T>>> list = new ArrayList<FacesConfigFlowDefinitionFlowCallOutboundParameterType<FacesConfigFlowDefinitionFlowCallType<T>>>();
      List<Node> nodeList = childNode.get("outbound-parameter");
      for(Node node: nodeList)
      {
         FacesConfigFlowDefinitionFlowCallOutboundParameterType<FacesConfigFlowDefinitionFlowCallType<T>>  type = new FacesConfigFlowDefinitionFlowCallOutboundParameterTypeImpl<FacesConfigFlowDefinitionFlowCallType<T>>(this, "outbound-parameter", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>outbound-parameter</code> elements 
    * @return the current instance of <code>FacesConfigFlowDefinitionFlowCallOutboundParameterType<FacesConfigFlowDefinitionFlowCallType<T>></code> 
    */
   public FacesConfigFlowDefinitionFlowCallType<T> removeAllOutboundParameter()
   {
      childNode.removeChildren("outbound-parameter");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFlowDefinitionFlowCallType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>FacesConfigFlowDefinitionFlowCallType<T></code> 
    */
   public FacesConfigFlowDefinitionFlowCallType<T> id(String id)
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
    * @return the current instance of <code>FacesConfigFlowDefinitionFlowCallType<T></code> 
    */
   public FacesConfigFlowDefinitionFlowCallType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
