package org.jboss.shrinkwrap.descriptor.impl.facesconfig22; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigNavigationCaseType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigNavigationRuleType;
import org.jboss.shrinkwrap.descriptor.api.javaee7.IconType;
import org.jboss.shrinkwrap.descriptor.impl.javaee7.IconTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> faces-config-navigation-ruleType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class FacesConfigNavigationRuleTypeImpl<T> implements Child<T>, FacesConfigNavigationRuleType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public FacesConfigNavigationRuleTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public FacesConfigNavigationRuleTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigNavigationRuleType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>FacesConfigNavigationRuleType<T></code> 
    */
   public FacesConfigNavigationRuleType<T> description(String ... values)
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
    * @return the current instance of <code>FacesConfigNavigationRuleType<T></code> 
    */
   public FacesConfigNavigationRuleType<T> removeAllDescription()
   {
      childNode.removeChildren("description");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigNavigationRuleType ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>FacesConfigNavigationRuleType<T></code> 
    */
   public FacesConfigNavigationRuleType<T> displayName(String ... values)
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
    * @return the current instance of <code>FacesConfigNavigationRuleType<T></code> 
    */
   public FacesConfigNavigationRuleType<T> removeAllDisplayName()
   {
      childNode.removeChildren("display-name");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigNavigationRuleType ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<FacesConfigNavigationRuleType<T>> getOrCreateIcon()
   {
      List<Node> nodeList = childNode.get("icon");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new IconTypeImpl<FacesConfigNavigationRuleType<T>>(this, "icon", childNode, nodeList.get(0));
      }
      return createIcon();
   }

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<FacesConfigNavigationRuleType<T>></code> 
    */
   public IconType<FacesConfigNavigationRuleType<T>> createIcon()
   {
      return new IconTypeImpl<FacesConfigNavigationRuleType<T>>(this, "icon", childNode);
   }

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<FacesConfigNavigationRuleType<T>>> getAllIcon()
   {
      List<IconType<FacesConfigNavigationRuleType<T>>> list = new ArrayList<IconType<FacesConfigNavigationRuleType<T>>>();
      List<Node> nodeList = childNode.get("icon");
      for(Node node: nodeList)
      {
         IconType<FacesConfigNavigationRuleType<T>>  type = new IconTypeImpl<FacesConfigNavigationRuleType<T>>(this, "icon", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<FacesConfigNavigationRuleType<T>></code> 
    */
   public FacesConfigNavigationRuleType<T> removeAllIcon()
   {
      childNode.removeChildren("icon");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigNavigationRuleType ElementName: javaee:string ElementType : from-view-id
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>from-view-id</code> element
    * @param fromViewId the value for the element <code>from-view-id</code> 
    * @return the current instance of <code>FacesConfigNavigationRuleType<T></code> 
    */
   public FacesConfigNavigationRuleType<T> fromViewId(String fromViewId)
   {
      childNode.getOrCreate("from-view-id").text(fromViewId);
      return this;
   }

   /**
    * Returns the <code>from-view-id</code> element
    * @return the node defined for the element <code>from-view-id</code> 
    */
   public String getFromViewId()
   {
      return childNode.getTextValueForPatternName("from-view-id");
   }

   /**
    * Removes the <code>from-view-id</code> element 
    * @return the current instance of <code>FacesConfigNavigationRuleType<T></code> 
    */
   public FacesConfigNavigationRuleType<T> removeFromViewId()
   {
      childNode.removeChildren("from-view-id");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigNavigationRuleType ElementName: javaee:faces-config-navigation-caseType ElementType : navigation-case
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>navigation-case</code> element will be created and returned.
    * Otherwise, the first existing <code>navigation-case</code> element will be returned.
    * @return the instance defined for the element <code>navigation-case</code> 
    */
   public FacesConfigNavigationCaseType<FacesConfigNavigationRuleType<T>> getOrCreateNavigationCase()
   {
      List<Node> nodeList = childNode.get("navigation-case");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new FacesConfigNavigationCaseTypeImpl<FacesConfigNavigationRuleType<T>>(this, "navigation-case", childNode, nodeList.get(0));
      }
      return createNavigationCase();
   }

   /**
    * Creates a new <code>navigation-case</code> element 
    * @return the new created instance of <code>FacesConfigNavigationCaseType<FacesConfigNavigationRuleType<T>></code> 
    */
   public FacesConfigNavigationCaseType<FacesConfigNavigationRuleType<T>> createNavigationCase()
   {
      return new FacesConfigNavigationCaseTypeImpl<FacesConfigNavigationRuleType<T>>(this, "navigation-case", childNode);
   }

   /**
    * Returns all <code>navigation-case</code> elements
    * @return list of <code>navigation-case</code> 
    */
   public List<FacesConfigNavigationCaseType<FacesConfigNavigationRuleType<T>>> getAllNavigationCase()
   {
      List<FacesConfigNavigationCaseType<FacesConfigNavigationRuleType<T>>> list = new ArrayList<FacesConfigNavigationCaseType<FacesConfigNavigationRuleType<T>>>();
      List<Node> nodeList = childNode.get("navigation-case");
      for(Node node: nodeList)
      {
         FacesConfigNavigationCaseType<FacesConfigNavigationRuleType<T>>  type = new FacesConfigNavigationCaseTypeImpl<FacesConfigNavigationRuleType<T>>(this, "navigation-case", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>navigation-case</code> elements 
    * @return the current instance of <code>FacesConfigNavigationCaseType<FacesConfigNavigationRuleType<T>></code> 
    */
   public FacesConfigNavigationRuleType<T> removeAllNavigationCase()
   {
      childNode.removeChildren("navigation-case");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigNavigationRuleType ElementName: javaee:faces-config-navigation-rule-extensionType ElementType : navigation-rule-extension
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>navigation-rule-extension</code> element 
    * @return the current instance of <code>FacesConfigNavigationRuleType<T></code> 
    */
   public FacesConfigNavigationRuleType<T> navigationRuleExtension()
   {
      childNode.getOrCreate("navigation-rule-extension");
      return this;
   }

   /**
    * Removes the <code>navigation-rule-extension</code> element 
    * @return the current instance of <code>FacesConfigNavigationRuleType<T></code> 
    */
   public Boolean isNavigationRuleExtension()
   {
      return childNode.getSingle("navigation-rule-extension") != null;
   }

   /**
    * Removes the <code>navigation-rule-extension</code> element 
    * @return the current instance of <code>FacesConfigNavigationRuleType<T></code> 
    */
   public FacesConfigNavigationRuleType<T> removeNavigationRuleExtension()
   {
      childNode.removeChild("navigation-rule-extension");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigNavigationRuleType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>FacesConfigNavigationRuleType<T></code> 
    */
   public FacesConfigNavigationRuleType<T> id(String id)
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
    * @return the current instance of <code>FacesConfigNavigationRuleType<T></code> 
    */
   public FacesConfigNavigationRuleType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
