package org.jboss.shrinkwrap.descriptor.impl.facesconfig22; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigFlowDefinitionSwitchCaseType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.javaee7.IconType;
import org.jboss.shrinkwrap.descriptor.impl.javaee7.IconTypeImpl;

/**
 * This class implements the <code> faces-config-flow-definition-switch-caseType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class FacesConfigFlowDefinitionSwitchCaseTypeImpl<T> implements Child<T>, FacesConfigFlowDefinitionSwitchCaseType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public FacesConfigFlowDefinitionSwitchCaseTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public FacesConfigFlowDefinitionSwitchCaseTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFlowDefinitionSwitchCaseType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>FacesConfigFlowDefinitionSwitchCaseType<T></code> 
    */
   public FacesConfigFlowDefinitionSwitchCaseType<T> description(String ... values)
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
    * @return the current instance of <code>FacesConfigFlowDefinitionSwitchCaseType<T></code> 
    */
   public FacesConfigFlowDefinitionSwitchCaseType<T> removeAllDescription()
   {
      childNode.removeChildren("description");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFlowDefinitionSwitchCaseType ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>FacesConfigFlowDefinitionSwitchCaseType<T></code> 
    */
   public FacesConfigFlowDefinitionSwitchCaseType<T> displayName(String ... values)
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
    * @return the current instance of <code>FacesConfigFlowDefinitionSwitchCaseType<T></code> 
    */
   public FacesConfigFlowDefinitionSwitchCaseType<T> removeAllDisplayName()
   {
      childNode.removeChildren("display-name");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFlowDefinitionSwitchCaseType ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<FacesConfigFlowDefinitionSwitchCaseType<T>> getOrCreateIcon()
   {
      List<Node> nodeList = childNode.get("icon");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new IconTypeImpl<FacesConfigFlowDefinitionSwitchCaseType<T>>(this, "icon", childNode, nodeList.get(0));
      }
      return createIcon();
   }

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<FacesConfigFlowDefinitionSwitchCaseType<T>></code> 
    */
   public IconType<FacesConfigFlowDefinitionSwitchCaseType<T>> createIcon()
   {
      return new IconTypeImpl<FacesConfigFlowDefinitionSwitchCaseType<T>>(this, "icon", childNode);
   }

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<FacesConfigFlowDefinitionSwitchCaseType<T>>> getAllIcon()
   {
      List<IconType<FacesConfigFlowDefinitionSwitchCaseType<T>>> list = new ArrayList<IconType<FacesConfigFlowDefinitionSwitchCaseType<T>>>();
      List<Node> nodeList = childNode.get("icon");
      for(Node node: nodeList)
      {
         IconType<FacesConfigFlowDefinitionSwitchCaseType<T>>  type = new IconTypeImpl<FacesConfigFlowDefinitionSwitchCaseType<T>>(this, "icon", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<FacesConfigFlowDefinitionSwitchCaseType<T>></code> 
    */
   public FacesConfigFlowDefinitionSwitchCaseType<T> removeAllIcon()
   {
      childNode.removeChildren("icon");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFlowDefinitionSwitchCaseType ElementName: javaee:faces-config-el-expressionType ElementType : if
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>if</code> element
    * @param _if the value for the element <code>if</code> 
    * @return the current instance of <code>FacesConfigFlowDefinitionSwitchCaseType<T></code> 
    */
   public FacesConfigFlowDefinitionSwitchCaseType<T> _if(String _if)
   {
      childNode.getOrCreate("if").text(_if);
      return this;
   }

   /**
    * Returns the <code>if</code> element
    * @return the node defined for the element <code>if</code> 
    */
   public String getIf()
   {
      return childNode.getTextValueForPatternName("if");
   }

   /**
    * Removes the <code>if</code> element 
    * @return the current instance of <code>FacesConfigFlowDefinitionSwitchCaseType<T></code> 
    */
   public FacesConfigFlowDefinitionSwitchCaseType<T> removeIf()
   {
      childNode.removeChildren("if");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFlowDefinitionSwitchCaseType ElementName: xsd:token ElementType : from-outcome
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>from-outcome</code> element
    * @param fromOutcome the value for the element <code>from-outcome</code> 
    * @return the current instance of <code>FacesConfigFlowDefinitionSwitchCaseType<T></code> 
    */
   public FacesConfigFlowDefinitionSwitchCaseType<T> fromOutcome(String fromOutcome)
   {
      childNode.getOrCreate("from-outcome").text(fromOutcome);
      return this;
   }

   /**
    * Returns the <code>from-outcome</code> element
    * @return the node defined for the element <code>from-outcome</code> 
    */
   public String getFromOutcome()
   {
      return childNode.getTextValueForPatternName("from-outcome");
   }

   /**
    * Removes the <code>from-outcome</code> element 
    * @return the current instance of <code>FacesConfigFlowDefinitionSwitchCaseType<T></code> 
    */
   public FacesConfigFlowDefinitionSwitchCaseType<T> removeFromOutcome()
   {
      childNode.removeChildren("from-outcome");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFlowDefinitionSwitchCaseType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>FacesConfigFlowDefinitionSwitchCaseType<T></code> 
    */
   public FacesConfigFlowDefinitionSwitchCaseType<T> id(String id)
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
    * @return the current instance of <code>FacesConfigFlowDefinitionSwitchCaseType<T></code> 
    */
   public FacesConfigFlowDefinitionSwitchCaseType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
