package org.jboss.shrinkwrap.descriptor.impl.facesconfig20; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.facesconfig20.FacesConfigAttributeType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.IconTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> faces-config-attributeType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class FacesConfigAttributeTypeImpl<T> implements Child<T>, FacesConfigAttributeType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public FacesConfigAttributeTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public FacesConfigAttributeTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigAttributeType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>FacesConfigAttributeType<T></code> 
    */
   public FacesConfigAttributeType<T> description(String ... values)
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
    * @return the current instance of <code>FacesConfigAttributeType<T></code> 
    */
   public FacesConfigAttributeType<T> removeAllDescription()
   {
      childNode.removeChildren("description");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigAttributeType ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>FacesConfigAttributeType<T></code> 
    */
   public FacesConfigAttributeType<T> displayName(String ... values)
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
    * @return the current instance of <code>FacesConfigAttributeType<T></code> 
    */
   public FacesConfigAttributeType<T> removeAllDisplayName()
   {
      childNode.removeChildren("display-name");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigAttributeType ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<FacesConfigAttributeType<T>> getOrCreateIcon()
   {
      List<Node> nodeList = childNode.get("icon");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new IconTypeImpl<FacesConfigAttributeType<T>>(this, "icon", childNode, nodeList.get(0));
      }
      return createIcon();
   }

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<FacesConfigAttributeType<T>></code> 
    */
   public IconType<FacesConfigAttributeType<T>> createIcon()
   {
      return new IconTypeImpl<FacesConfigAttributeType<T>>(this, "icon", childNode);
   }

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<FacesConfigAttributeType<T>>> getAllIcon()
   {
      List<IconType<FacesConfigAttributeType<T>>> list = new ArrayList<IconType<FacesConfigAttributeType<T>>>();
      List<Node> nodeList = childNode.get("icon");
      for(Node node: nodeList)
      {
         IconType<FacesConfigAttributeType<T>>  type = new IconTypeImpl<FacesConfigAttributeType<T>>(this, "icon", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<FacesConfigAttributeType<T>></code> 
    */
   public FacesConfigAttributeType<T> removeAllIcon()
   {
      childNode.removeChildren("icon");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigAttributeType ElementName: xsd:token ElementType : attribute-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>attribute-name</code> element
    * @param attributeName the value for the element <code>attribute-name</code> 
    * @return the current instance of <code>FacesConfigAttributeType<T></code> 
    */
   public FacesConfigAttributeType<T> attributeName(String attributeName)
   {
      childNode.getOrCreate("attribute-name").text(attributeName);
      return this;
   }

   /**
    * Returns the <code>attribute-name</code> element
    * @return the node defined for the element <code>attribute-name</code> 
    */
   public String getAttributeName()
   {
      return childNode.getTextValueForPatternName("attribute-name");
   }

   /**
    * Removes the <code>attribute-name</code> element 
    * @return the current instance of <code>FacesConfigAttributeType<T></code> 
    */
   public FacesConfigAttributeType<T> removeAttributeName()
   {
      childNode.removeChildren("attribute-name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigAttributeType ElementName: xsd:token ElementType : attribute-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>attribute-class</code> element
    * @param attributeClass the value for the element <code>attribute-class</code> 
    * @return the current instance of <code>FacesConfigAttributeType<T></code> 
    */
   public FacesConfigAttributeType<T> attributeClass(String attributeClass)
   {
      childNode.getOrCreate("attribute-class").text(attributeClass);
      return this;
   }

   /**
    * Returns the <code>attribute-class</code> element
    * @return the node defined for the element <code>attribute-class</code> 
    */
   public String getAttributeClass()
   {
      return childNode.getTextValueForPatternName("attribute-class");
   }

   /**
    * Removes the <code>attribute-class</code> element 
    * @return the current instance of <code>FacesConfigAttributeType<T></code> 
    */
   public FacesConfigAttributeType<T> removeAttributeClass()
   {
      childNode.removeChildren("attribute-class");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigAttributeType ElementName: javaee:string ElementType : default-value
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>default-value</code> element
    * @param defaultValue the value for the element <code>default-value</code> 
    * @return the current instance of <code>FacesConfigAttributeType<T></code> 
    */
   public FacesConfigAttributeType<T> defaultValue(String defaultValue)
   {
      childNode.getOrCreate("default-value").text(defaultValue);
      return this;
   }

   /**
    * Returns the <code>default-value</code> element
    * @return the node defined for the element <code>default-value</code> 
    */
   public String getDefaultValue()
   {
      return childNode.getTextValueForPatternName("default-value");
   }

   /**
    * Removes the <code>default-value</code> element 
    * @return the current instance of <code>FacesConfigAttributeType<T></code> 
    */
   public FacesConfigAttributeType<T> removeDefaultValue()
   {
      childNode.removeChildren("default-value");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigAttributeType ElementName: javaee:string ElementType : suggested-value
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>suggested-value</code> element
    * @param suggestedValue the value for the element <code>suggested-value</code> 
    * @return the current instance of <code>FacesConfigAttributeType<T></code> 
    */
   public FacesConfigAttributeType<T> suggestedValue(String suggestedValue)
   {
      childNode.getOrCreate("suggested-value").text(suggestedValue);
      return this;
   }

   /**
    * Returns the <code>suggested-value</code> element
    * @return the node defined for the element <code>suggested-value</code> 
    */
   public String getSuggestedValue()
   {
      return childNode.getTextValueForPatternName("suggested-value");
   }

   /**
    * Removes the <code>suggested-value</code> element 
    * @return the current instance of <code>FacesConfigAttributeType<T></code> 
    */
   public FacesConfigAttributeType<T> removeSuggestedValue()
   {
      childNode.removeChildren("suggested-value");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigAttributeType ElementName: javaee:faces-config-attribute-extensionType ElementType : attribute-extension
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>attribute-extension</code> element 
    * @return the current instance of <code>FacesConfigAttributeType<T></code> 
    */
   public FacesConfigAttributeType<T> attributeExtension()
   {
      childNode.getOrCreate("attribute-extension");
      return this;
   }

   /**
    * Removes the <code>attribute-extension</code> element 
    * @return the current instance of <code>FacesConfigAttributeType<T></code> 
    */
   public Boolean isAttributeExtension()
   {
      return childNode.getSingle("attribute-extension") != null;
   }

   /**
    * Removes the <code>attribute-extension</code> element 
    * @return the current instance of <code>FacesConfigAttributeType<T></code> 
    */
   public FacesConfigAttributeType<T> removeAttributeExtension()
   {
      childNode.removeChild("attribute-extension");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigAttributeType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>FacesConfigAttributeType<T></code> 
    */
   public FacesConfigAttributeType<T> id(String id)
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
    * @return the current instance of <code>FacesConfigAttributeType<T></code> 
    */
   public FacesConfigAttributeType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
