package org.jboss.shrinkwrap.descriptor.impl.facesconfig21; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.facesconfig21.FacesConfigPropertyType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.IconTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> faces-config-propertyType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class FacesConfigPropertyTypeImpl<T> implements Child<T>, FacesConfigPropertyType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public FacesConfigPropertyTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public FacesConfigPropertyTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigPropertyType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>FacesConfigPropertyType<T></code> 
    */
   public FacesConfigPropertyType<T> description(String ... values)
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
    * @return the current instance of <code>FacesConfigPropertyType<T></code> 
    */
   public FacesConfigPropertyType<T> removeAllDescription()
   {
      childNode.removeChildren("description");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigPropertyType ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>FacesConfigPropertyType<T></code> 
    */
   public FacesConfigPropertyType<T> displayName(String ... values)
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
    * @return the current instance of <code>FacesConfigPropertyType<T></code> 
    */
   public FacesConfigPropertyType<T> removeAllDisplayName()
   {
      childNode.removeChildren("display-name");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigPropertyType ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<FacesConfigPropertyType<T>> getOrCreateIcon()
   {
      List<Node> nodeList = childNode.get("icon");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new IconTypeImpl<FacesConfigPropertyType<T>>(this, "icon", childNode, nodeList.get(0));
      }
      return createIcon();
   }

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<FacesConfigPropertyType<T>></code> 
    */
   public IconType<FacesConfigPropertyType<T>> createIcon()
   {
      return new IconTypeImpl<FacesConfigPropertyType<T>>(this, "icon", childNode);
   }

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<FacesConfigPropertyType<T>>> getAllIcon()
   {
      List<IconType<FacesConfigPropertyType<T>>> list = new ArrayList<IconType<FacesConfigPropertyType<T>>>();
      List<Node> nodeList = childNode.get("icon");
      for(Node node: nodeList)
      {
         IconType<FacesConfigPropertyType<T>>  type = new IconTypeImpl<FacesConfigPropertyType<T>>(this, "icon", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<FacesConfigPropertyType<T>></code> 
    */
   public FacesConfigPropertyType<T> removeAllIcon()
   {
      childNode.removeChildren("icon");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigPropertyType ElementName: xsd:token ElementType : property-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>property-name</code> element
    * @param propertyName the value for the element <code>property-name</code> 
    * @return the current instance of <code>FacesConfigPropertyType<T></code> 
    */
   public FacesConfigPropertyType<T> propertyName(String propertyName)
   {
      childNode.getOrCreate("property-name").text(propertyName);
      return this;
   }

   /**
    * Returns the <code>property-name</code> element
    * @return the node defined for the element <code>property-name</code> 
    */
   public String getPropertyName()
   {
      return childNode.getTextValueForPatternName("property-name");
   }

   /**
    * Removes the <code>property-name</code> element 
    * @return the current instance of <code>FacesConfigPropertyType<T></code> 
    */
   public FacesConfigPropertyType<T> removePropertyName()
   {
      childNode.removeChildren("property-name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigPropertyType ElementName: xsd:token ElementType : property-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>property-class</code> element
    * @param propertyClass the value for the element <code>property-class</code> 
    * @return the current instance of <code>FacesConfigPropertyType<T></code> 
    */
   public FacesConfigPropertyType<T> propertyClass(String propertyClass)
   {
      childNode.getOrCreate("property-class").text(propertyClass);
      return this;
   }

   /**
    * Returns the <code>property-class</code> element
    * @return the node defined for the element <code>property-class</code> 
    */
   public String getPropertyClass()
   {
      return childNode.getTextValueForPatternName("property-class");
   }

   /**
    * Removes the <code>property-class</code> element 
    * @return the current instance of <code>FacesConfigPropertyType<T></code> 
    */
   public FacesConfigPropertyType<T> removePropertyClass()
   {
      childNode.removeChildren("property-class");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigPropertyType ElementName: javaee:string ElementType : default-value
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>default-value</code> element
    * @param defaultValue the value for the element <code>default-value</code> 
    * @return the current instance of <code>FacesConfigPropertyType<T></code> 
    */
   public FacesConfigPropertyType<T> defaultValue(String defaultValue)
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
    * @return the current instance of <code>FacesConfigPropertyType<T></code> 
    */
   public FacesConfigPropertyType<T> removeDefaultValue()
   {
      childNode.removeChildren("default-value");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigPropertyType ElementName: javaee:string ElementType : suggested-value
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>suggested-value</code> element
    * @param suggestedValue the value for the element <code>suggested-value</code> 
    * @return the current instance of <code>FacesConfigPropertyType<T></code> 
    */
   public FacesConfigPropertyType<T> suggestedValue(String suggestedValue)
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
    * @return the current instance of <code>FacesConfigPropertyType<T></code> 
    */
   public FacesConfigPropertyType<T> removeSuggestedValue()
   {
      childNode.removeChildren("suggested-value");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigPropertyType ElementName: javaee:faces-config-property-extensionType ElementType : property-extension
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>property-extension</code> element 
    * @return the current instance of <code>FacesConfigPropertyType<T></code> 
    */
   public FacesConfigPropertyType<T> propertyExtension()
   {
      childNode.getOrCreate("property-extension");
      return this;
   }

   /**
    * Removes the <code>property-extension</code> element 
    * @return the current instance of <code>FacesConfigPropertyType<T></code> 
    */
   public Boolean isPropertyExtension()
   {
      return childNode.getSingle("property-extension") != null;
   }

   /**
    * Removes the <code>property-extension</code> element 
    * @return the current instance of <code>FacesConfigPropertyType<T></code> 
    */
   public FacesConfigPropertyType<T> removePropertyExtension()
   {
      childNode.removeChild("property-extension");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigPropertyType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>FacesConfigPropertyType<T></code> 
    */
   public FacesConfigPropertyType<T> id(String id)
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
    * @return the current instance of <code>FacesConfigPropertyType<T></code> 
    */
   public FacesConfigPropertyType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
