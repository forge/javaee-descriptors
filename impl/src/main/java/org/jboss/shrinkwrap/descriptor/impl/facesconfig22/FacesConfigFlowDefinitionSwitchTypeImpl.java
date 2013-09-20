package org.jboss.shrinkwrap.descriptor.impl.facesconfig22; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigFlowDefinitionSwitchType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigFlowDefinitionSwitchCaseType;
import org.jboss.shrinkwrap.descriptor.impl.facesconfig22.FacesConfigFlowDefinitionSwitchCaseTypeImpl;

/**
 * This class implements the <code> faces-config-flow-definition-switchType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class FacesConfigFlowDefinitionSwitchTypeImpl<T> implements Child<T>, FacesConfigFlowDefinitionSwitchType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public FacesConfigFlowDefinitionSwitchTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public FacesConfigFlowDefinitionSwitchTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFlowDefinitionSwitchType ElementName: javaee:faces-config-flow-definition-switch-caseType ElementType : case
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>case</code> element will be created and returned.
    * Otherwise, the first existing <code>case</code> element will be returned.
    * @return the instance defined for the element <code>case</code> 
    */
   public FacesConfigFlowDefinitionSwitchCaseType<FacesConfigFlowDefinitionSwitchType<T>> getOrCreateCase()
   {
      List<Node> nodeList = childNode.get("case");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new FacesConfigFlowDefinitionSwitchCaseTypeImpl<FacesConfigFlowDefinitionSwitchType<T>>(this, "case", childNode, nodeList.get(0));
      }
      return createCase();
   }

   /**
    * Creates a new <code>case</code> element 
    * @return the new created instance of <code>FacesConfigFlowDefinitionSwitchCaseType<FacesConfigFlowDefinitionSwitchType<T>></code> 
    */
   public FacesConfigFlowDefinitionSwitchCaseType<FacesConfigFlowDefinitionSwitchType<T>> createCase()
   {
      return new FacesConfigFlowDefinitionSwitchCaseTypeImpl<FacesConfigFlowDefinitionSwitchType<T>>(this, "case", childNode);
   }

   /**
    * Returns all <code>case</code> elements
    * @return list of <code>case</code> 
    */
   public List<FacesConfigFlowDefinitionSwitchCaseType<FacesConfigFlowDefinitionSwitchType<T>>> getAllCase()
   {
      List<FacesConfigFlowDefinitionSwitchCaseType<FacesConfigFlowDefinitionSwitchType<T>>> list = new ArrayList<FacesConfigFlowDefinitionSwitchCaseType<FacesConfigFlowDefinitionSwitchType<T>>>();
      List<Node> nodeList = childNode.get("case");
      for(Node node: nodeList)
      {
         FacesConfigFlowDefinitionSwitchCaseType<FacesConfigFlowDefinitionSwitchType<T>>  type = new FacesConfigFlowDefinitionSwitchCaseTypeImpl<FacesConfigFlowDefinitionSwitchType<T>>(this, "case", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>case</code> elements 
    * @return the current instance of <code>FacesConfigFlowDefinitionSwitchCaseType<FacesConfigFlowDefinitionSwitchType<T>></code> 
    */
   public FacesConfigFlowDefinitionSwitchType<T> removeAllCase()
   {
      childNode.removeChildren("case");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFlowDefinitionSwitchType ElementName: xsd:token ElementType : default-outcome
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>default-outcome</code> element
    * @param defaultOutcome the value for the element <code>default-outcome</code> 
    * @return the current instance of <code>FacesConfigFlowDefinitionSwitchType<T></code> 
    */
   public FacesConfigFlowDefinitionSwitchType<T> defaultOutcome(String defaultOutcome)
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
    * @return the current instance of <code>FacesConfigFlowDefinitionSwitchType<T></code> 
    */
   public FacesConfigFlowDefinitionSwitchType<T> removeDefaultOutcome()
   {
      childNode.removeChildren("default-outcome");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFlowDefinitionSwitchType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>FacesConfigFlowDefinitionSwitchType<T></code> 
    */
   public FacesConfigFlowDefinitionSwitchType<T> id(String id)
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
    * @return the current instance of <code>FacesConfigFlowDefinitionSwitchType<T></code> 
    */
   public FacesConfigFlowDefinitionSwitchType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
