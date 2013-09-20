package org.jboss.shrinkwrap.descriptor.impl.facesconfig21; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.facesconfig21.FacesConfigApplicationResourceBundleType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.IconTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.IconTypeImpl;

/**
 * This class implements the <code> faces-config-application-resource-bundleType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class FacesConfigApplicationResourceBundleTypeImpl<T> implements Child<T>, FacesConfigApplicationResourceBundleType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public FacesConfigApplicationResourceBundleTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public FacesConfigApplicationResourceBundleTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigApplicationResourceBundleType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>FacesConfigApplicationResourceBundleType<T></code> 
    */
   public FacesConfigApplicationResourceBundleType<T> description(String ... values)
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
    * @return the current instance of <code>FacesConfigApplicationResourceBundleType<T></code> 
    */
   public FacesConfigApplicationResourceBundleType<T> removeAllDescription()
   {
      childNode.removeChildren("description");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigApplicationResourceBundleType ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>FacesConfigApplicationResourceBundleType<T></code> 
    */
   public FacesConfigApplicationResourceBundleType<T> displayName(String ... values)
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
    * @return the current instance of <code>FacesConfigApplicationResourceBundleType<T></code> 
    */
   public FacesConfigApplicationResourceBundleType<T> removeAllDisplayName()
   {
      childNode.removeChildren("display-name");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigApplicationResourceBundleType ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<FacesConfigApplicationResourceBundleType<T>> getOrCreateIcon()
   {
      List<Node> nodeList = childNode.get("icon");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new IconTypeImpl<FacesConfigApplicationResourceBundleType<T>>(this, "icon", childNode, nodeList.get(0));
      }
      return createIcon();
   }

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<FacesConfigApplicationResourceBundleType<T>></code> 
    */
   public IconType<FacesConfigApplicationResourceBundleType<T>> createIcon()
   {
      return new IconTypeImpl<FacesConfigApplicationResourceBundleType<T>>(this, "icon", childNode);
   }

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<FacesConfigApplicationResourceBundleType<T>>> getAllIcon()
   {
      List<IconType<FacesConfigApplicationResourceBundleType<T>>> list = new ArrayList<IconType<FacesConfigApplicationResourceBundleType<T>>>();
      List<Node> nodeList = childNode.get("icon");
      for(Node node: nodeList)
      {
         IconType<FacesConfigApplicationResourceBundleType<T>>  type = new IconTypeImpl<FacesConfigApplicationResourceBundleType<T>>(this, "icon", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<FacesConfigApplicationResourceBundleType<T>></code> 
    */
   public FacesConfigApplicationResourceBundleType<T> removeAllIcon()
   {
      childNode.removeChildren("icon");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigApplicationResourceBundleType ElementName: xsd:token ElementType : base-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>base-name</code> element
    * @param baseName the value for the element <code>base-name</code> 
    * @return the current instance of <code>FacesConfigApplicationResourceBundleType<T></code> 
    */
   public FacesConfigApplicationResourceBundleType<T> baseName(String baseName)
   {
      childNode.getOrCreate("base-name").text(baseName);
      return this;
   }

   /**
    * Returns the <code>base-name</code> element
    * @return the node defined for the element <code>base-name</code> 
    */
   public String getBaseName()
   {
      return childNode.getTextValueForPatternName("base-name");
   }

   /**
    * Removes the <code>base-name</code> element 
    * @return the current instance of <code>FacesConfigApplicationResourceBundleType<T></code> 
    */
   public FacesConfigApplicationResourceBundleType<T> removeBaseName()
   {
      childNode.removeChildren("base-name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigApplicationResourceBundleType ElementName: xsd:token ElementType : var
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>var</code> element
    * @param var the value for the element <code>var</code> 
    * @return the current instance of <code>FacesConfigApplicationResourceBundleType<T></code> 
    */
   public FacesConfigApplicationResourceBundleType<T> var(String var)
   {
      childNode.getOrCreate("var").text(var);
      return this;
   }

   /**
    * Returns the <code>var</code> element
    * @return the node defined for the element <code>var</code> 
    */
   public String getVar()
   {
      return childNode.getTextValueForPatternName("var");
   }

   /**
    * Removes the <code>var</code> element 
    * @return the current instance of <code>FacesConfigApplicationResourceBundleType<T></code> 
    */
   public FacesConfigApplicationResourceBundleType<T> removeVar()
   {
      childNode.removeChildren("var");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigApplicationResourceBundleType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>FacesConfigApplicationResourceBundleType<T></code> 
    */
   public FacesConfigApplicationResourceBundleType<T> id(String id)
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
    * @return the current instance of <code>FacesConfigApplicationResourceBundleType<T></code> 
    */
   public FacesConfigApplicationResourceBundleType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
