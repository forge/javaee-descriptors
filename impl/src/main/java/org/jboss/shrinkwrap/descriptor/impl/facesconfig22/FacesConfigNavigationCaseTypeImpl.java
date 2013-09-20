package org.jboss.shrinkwrap.descriptor.impl.facesconfig22; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigNavigationCaseType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigRedirectType;
import org.jboss.shrinkwrap.descriptor.impl.facesconfig22.FacesConfigRedirectTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee7.IconType;
import org.jboss.shrinkwrap.descriptor.impl.javaee7.IconTypeImpl;

/**
 * This class implements the <code> faces-config-navigation-caseType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class FacesConfigNavigationCaseTypeImpl<T> implements Child<T>, FacesConfigNavigationCaseType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public FacesConfigNavigationCaseTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public FacesConfigNavigationCaseTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigNavigationCaseType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>FacesConfigNavigationCaseType<T></code> 
    */
   public FacesConfigNavigationCaseType<T> description(String ... values)
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
    * @return the current instance of <code>FacesConfigNavigationCaseType<T></code> 
    */
   public FacesConfigNavigationCaseType<T> removeAllDescription()
   {
      childNode.removeChildren("description");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigNavigationCaseType ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>FacesConfigNavigationCaseType<T></code> 
    */
   public FacesConfigNavigationCaseType<T> displayName(String ... values)
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
    * @return the current instance of <code>FacesConfigNavigationCaseType<T></code> 
    */
   public FacesConfigNavigationCaseType<T> removeAllDisplayName()
   {
      childNode.removeChildren("display-name");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigNavigationCaseType ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<FacesConfigNavigationCaseType<T>> getOrCreateIcon()
   {
      List<Node> nodeList = childNode.get("icon");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new IconTypeImpl<FacesConfigNavigationCaseType<T>>(this, "icon", childNode, nodeList.get(0));
      }
      return createIcon();
   }

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<FacesConfigNavigationCaseType<T>></code> 
    */
   public IconType<FacesConfigNavigationCaseType<T>> createIcon()
   {
      return new IconTypeImpl<FacesConfigNavigationCaseType<T>>(this, "icon", childNode);
   }

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<FacesConfigNavigationCaseType<T>>> getAllIcon()
   {
      List<IconType<FacesConfigNavigationCaseType<T>>> list = new ArrayList<IconType<FacesConfigNavigationCaseType<T>>>();
      List<Node> nodeList = childNode.get("icon");
      for(Node node: nodeList)
      {
         IconType<FacesConfigNavigationCaseType<T>>  type = new IconTypeImpl<FacesConfigNavigationCaseType<T>>(this, "icon", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<FacesConfigNavigationCaseType<T>></code> 
    */
   public FacesConfigNavigationCaseType<T> removeAllIcon()
   {
      childNode.removeChildren("icon");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigNavigationCaseType ElementName: javaee:faces-config-el-expressionType ElementType : from-action
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>from-action</code> element
    * @param fromAction the value for the element <code>from-action</code> 
    * @return the current instance of <code>FacesConfigNavigationCaseType<T></code> 
    */
   public FacesConfigNavigationCaseType<T> fromAction(String fromAction)
   {
      childNode.getOrCreate("from-action").text(fromAction);
      return this;
   }

   /**
    * Returns the <code>from-action</code> element
    * @return the node defined for the element <code>from-action</code> 
    */
   public String getFromAction()
   {
      return childNode.getTextValueForPatternName("from-action");
   }

   /**
    * Removes the <code>from-action</code> element 
    * @return the current instance of <code>FacesConfigNavigationCaseType<T></code> 
    */
   public FacesConfigNavigationCaseType<T> removeFromAction()
   {
      childNode.removeChildren("from-action");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigNavigationCaseType ElementName: xsd:token ElementType : from-outcome
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>from-outcome</code> element
    * @param fromOutcome the value for the element <code>from-outcome</code> 
    * @return the current instance of <code>FacesConfigNavigationCaseType<T></code> 
    */
   public FacesConfigNavigationCaseType<T> fromOutcome(String fromOutcome)
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
    * @return the current instance of <code>FacesConfigNavigationCaseType<T></code> 
    */
   public FacesConfigNavigationCaseType<T> removeFromOutcome()
   {
      childNode.removeChildren("from-outcome");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigNavigationCaseType ElementName: javaee:faces-config-el-expressionType ElementType : if
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>if</code> element
    * @param _if the value for the element <code>if</code> 
    * @return the current instance of <code>FacesConfigNavigationCaseType<T></code> 
    */
   public FacesConfigNavigationCaseType<T> _if(String _if)
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
    * @return the current instance of <code>FacesConfigNavigationCaseType<T></code> 
    */
   public FacesConfigNavigationCaseType<T> removeIf()
   {
      childNode.removeChildren("if");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigNavigationCaseType ElementName: javaee:faces-config-el-expressionType ElementType : to-view-id
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>to-view-id</code> element
    * @param toViewId the value for the element <code>to-view-id</code> 
    * @return the current instance of <code>FacesConfigNavigationCaseType<T></code> 
    */
   public FacesConfigNavigationCaseType<T> toViewId(String toViewId)
   {
      childNode.getOrCreate("to-view-id").text(toViewId);
      return this;
   }

   /**
    * Returns the <code>to-view-id</code> element
    * @return the node defined for the element <code>to-view-id</code> 
    */
   public String getToViewId()
   {
      return childNode.getTextValueForPatternName("to-view-id");
   }

   /**
    * Removes the <code>to-view-id</code> element 
    * @return the current instance of <code>FacesConfigNavigationCaseType<T></code> 
    */
   public FacesConfigNavigationCaseType<T> removeToViewId()
   {
      childNode.removeChildren("to-view-id");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigNavigationCaseType ElementName: xsd:token ElementType : to-flow-document-id
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>to-flow-document-id</code> element
    * @param toFlowDocumentId the value for the element <code>to-flow-document-id</code> 
    * @return the current instance of <code>FacesConfigNavigationCaseType<T></code> 
    */
   public FacesConfigNavigationCaseType<T> toFlowDocumentId(String toFlowDocumentId)
   {
      childNode.getOrCreate("to-flow-document-id").text(toFlowDocumentId);
      return this;
   }

   /**
    * Returns the <code>to-flow-document-id</code> element
    * @return the node defined for the element <code>to-flow-document-id</code> 
    */
   public String getToFlowDocumentId()
   {
      return childNode.getTextValueForPatternName("to-flow-document-id");
   }

   /**
    * Removes the <code>to-flow-document-id</code> element 
    * @return the current instance of <code>FacesConfigNavigationCaseType<T></code> 
    */
   public FacesConfigNavigationCaseType<T> removeToFlowDocumentId()
   {
      childNode.removeChildren("to-flow-document-id");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigNavigationCaseType ElementName: javaee:faces-config-redirectType ElementType : redirect
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>redirect</code> element with the given value will be created.
    * Otherwise, the existing <code>redirect</code> element will be returned.
    * @return  a new or existing instance of <code>FacesConfigRedirectType<FacesConfigNavigationCaseType<T>></code> 
    */
   public FacesConfigRedirectType<FacesConfigNavigationCaseType<T>> getOrCreateRedirect()
   {
      Node node = childNode.getOrCreate("redirect");
      FacesConfigRedirectType<FacesConfigNavigationCaseType<T>> redirect = new FacesConfigRedirectTypeImpl<FacesConfigNavigationCaseType<T>>(this, "redirect", childNode, node);
      return redirect;
   }

   /**
    * Removes the <code>redirect</code> element 
    * @return the current instance of <code>FacesConfigNavigationCaseType<T></code> 
    */
   public FacesConfigNavigationCaseType<T> removeRedirect()
   {
      childNode.removeChildren("redirect");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigNavigationCaseType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>FacesConfigNavigationCaseType<T></code> 
    */
   public FacesConfigNavigationCaseType<T> id(String id)
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
    * @return the current instance of <code>FacesConfigNavigationCaseType<T></code> 
    */
   public FacesConfigNavigationCaseType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
