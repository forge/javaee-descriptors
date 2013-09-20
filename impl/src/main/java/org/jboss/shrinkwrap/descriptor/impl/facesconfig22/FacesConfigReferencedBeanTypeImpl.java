package org.jboss.shrinkwrap.descriptor.impl.facesconfig22; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigReferencedBeanType;
import org.jboss.shrinkwrap.descriptor.api.javaee7.IconType;
import org.jboss.shrinkwrap.descriptor.impl.javaee7.IconTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> faces-config-referenced-beanType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class FacesConfigReferencedBeanTypeImpl<T> implements Child<T>, FacesConfigReferencedBeanType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public FacesConfigReferencedBeanTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public FacesConfigReferencedBeanTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigReferencedBeanType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>FacesConfigReferencedBeanType<T></code> 
    */
   public FacesConfigReferencedBeanType<T> description(String ... values)
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
    * @return the current instance of <code>FacesConfigReferencedBeanType<T></code> 
    */
   public FacesConfigReferencedBeanType<T> removeAllDescription()
   {
      childNode.removeChildren("description");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigReferencedBeanType ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>FacesConfigReferencedBeanType<T></code> 
    */
   public FacesConfigReferencedBeanType<T> displayName(String ... values)
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
    * @return the current instance of <code>FacesConfigReferencedBeanType<T></code> 
    */
   public FacesConfigReferencedBeanType<T> removeAllDisplayName()
   {
      childNode.removeChildren("display-name");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigReferencedBeanType ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<FacesConfigReferencedBeanType<T>> getOrCreateIcon()
   {
      List<Node> nodeList = childNode.get("icon");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new IconTypeImpl<FacesConfigReferencedBeanType<T>>(this, "icon", childNode, nodeList.get(0));
      }
      return createIcon();
   }

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<FacesConfigReferencedBeanType<T>></code> 
    */
   public IconType<FacesConfigReferencedBeanType<T>> createIcon()
   {
      return new IconTypeImpl<FacesConfigReferencedBeanType<T>>(this, "icon", childNode);
   }

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<FacesConfigReferencedBeanType<T>>> getAllIcon()
   {
      List<IconType<FacesConfigReferencedBeanType<T>>> list = new ArrayList<IconType<FacesConfigReferencedBeanType<T>>>();
      List<Node> nodeList = childNode.get("icon");
      for(Node node: nodeList)
      {
         IconType<FacesConfigReferencedBeanType<T>>  type = new IconTypeImpl<FacesConfigReferencedBeanType<T>>(this, "icon", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<FacesConfigReferencedBeanType<T>></code> 
    */
   public FacesConfigReferencedBeanType<T> removeAllIcon()
   {
      childNode.removeChildren("icon");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigReferencedBeanType ElementName: xsd:token ElementType : referenced-bean-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>referenced-bean-name</code> element
    * @param referencedBeanName the value for the element <code>referenced-bean-name</code> 
    * @return the current instance of <code>FacesConfigReferencedBeanType<T></code> 
    */
   public FacesConfigReferencedBeanType<T> referencedBeanName(String referencedBeanName)
   {
      childNode.getOrCreate("referenced-bean-name").text(referencedBeanName);
      return this;
   }

   /**
    * Returns the <code>referenced-bean-name</code> element
    * @return the node defined for the element <code>referenced-bean-name</code> 
    */
   public String getReferencedBeanName()
   {
      return childNode.getTextValueForPatternName("referenced-bean-name");
   }

   /**
    * Removes the <code>referenced-bean-name</code> element 
    * @return the current instance of <code>FacesConfigReferencedBeanType<T></code> 
    */
   public FacesConfigReferencedBeanType<T> removeReferencedBeanName()
   {
      childNode.removeChildren("referenced-bean-name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigReferencedBeanType ElementName: xsd:token ElementType : referenced-bean-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>referenced-bean-class</code> element
    * @param referencedBeanClass the value for the element <code>referenced-bean-class</code> 
    * @return the current instance of <code>FacesConfigReferencedBeanType<T></code> 
    */
   public FacesConfigReferencedBeanType<T> referencedBeanClass(String referencedBeanClass)
   {
      childNode.getOrCreate("referenced-bean-class").text(referencedBeanClass);
      return this;
   }

   /**
    * Returns the <code>referenced-bean-class</code> element
    * @return the node defined for the element <code>referenced-bean-class</code> 
    */
   public String getReferencedBeanClass()
   {
      return childNode.getTextValueForPatternName("referenced-bean-class");
   }

   /**
    * Removes the <code>referenced-bean-class</code> element 
    * @return the current instance of <code>FacesConfigReferencedBeanType<T></code> 
    */
   public FacesConfigReferencedBeanType<T> removeReferencedBeanClass()
   {
      childNode.removeChildren("referenced-bean-class");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigReferencedBeanType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>FacesConfigReferencedBeanType<T></code> 
    */
   public FacesConfigReferencedBeanType<T> id(String id)
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
    * @return the current instance of <code>FacesConfigReferencedBeanType<T></code> 
    */
   public FacesConfigReferencedBeanType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
