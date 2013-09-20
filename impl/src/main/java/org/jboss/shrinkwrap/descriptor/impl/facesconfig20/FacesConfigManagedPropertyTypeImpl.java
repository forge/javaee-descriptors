package org.jboss.shrinkwrap.descriptor.impl.facesconfig20; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.facesconfig20.FacesConfigListEntriesType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig20.FacesConfigManagedPropertyType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig20.FacesConfigMapEntriesType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.IconTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> faces-config-managed-propertyType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class FacesConfigManagedPropertyTypeImpl<T> implements Child<T>, FacesConfigManagedPropertyType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public FacesConfigManagedPropertyTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public FacesConfigManagedPropertyTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigManagedPropertyType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>FacesConfigManagedPropertyType<T></code> 
    */
   public FacesConfigManagedPropertyType<T> description(String ... values)
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
    * @return the current instance of <code>FacesConfigManagedPropertyType<T></code> 
    */
   public FacesConfigManagedPropertyType<T> removeAllDescription()
   {
      childNode.removeChildren("description");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigManagedPropertyType ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>FacesConfigManagedPropertyType<T></code> 
    */
   public FacesConfigManagedPropertyType<T> displayName(String ... values)
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
    * @return the current instance of <code>FacesConfigManagedPropertyType<T></code> 
    */
   public FacesConfigManagedPropertyType<T> removeAllDisplayName()
   {
      childNode.removeChildren("display-name");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigManagedPropertyType ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<FacesConfigManagedPropertyType<T>> getOrCreateIcon()
   {
      List<Node> nodeList = childNode.get("icon");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new IconTypeImpl<FacesConfigManagedPropertyType<T>>(this, "icon", childNode, nodeList.get(0));
      }
      return createIcon();
   }

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<FacesConfigManagedPropertyType<T>></code> 
    */
   public IconType<FacesConfigManagedPropertyType<T>> createIcon()
   {
      return new IconTypeImpl<FacesConfigManagedPropertyType<T>>(this, "icon", childNode);
   }

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<FacesConfigManagedPropertyType<T>>> getAllIcon()
   {
      List<IconType<FacesConfigManagedPropertyType<T>>> list = new ArrayList<IconType<FacesConfigManagedPropertyType<T>>>();
      List<Node> nodeList = childNode.get("icon");
      for(Node node: nodeList)
      {
         IconType<FacesConfigManagedPropertyType<T>>  type = new IconTypeImpl<FacesConfigManagedPropertyType<T>>(this, "icon", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<FacesConfigManagedPropertyType<T>></code> 
    */
   public FacesConfigManagedPropertyType<T> removeAllIcon()
   {
      childNode.removeChildren("icon");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigManagedPropertyType ElementName: xsd:token ElementType : property-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>property-name</code> element
    * @param propertyName the value for the element <code>property-name</code> 
    * @return the current instance of <code>FacesConfigManagedPropertyType<T></code> 
    */
   public FacesConfigManagedPropertyType<T> propertyName(String propertyName)
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
    * @return the current instance of <code>FacesConfigManagedPropertyType<T></code> 
    */
   public FacesConfigManagedPropertyType<T> removePropertyName()
   {
      childNode.removeChildren("property-name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigManagedPropertyType ElementName: xsd:token ElementType : property-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>property-class</code> element
    * @param propertyClass the value for the element <code>property-class</code> 
    * @return the current instance of <code>FacesConfigManagedPropertyType<T></code> 
    */
   public FacesConfigManagedPropertyType<T> propertyClass(String propertyClass)
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
    * @return the current instance of <code>FacesConfigManagedPropertyType<T></code> 
    */
   public FacesConfigManagedPropertyType<T> removePropertyClass()
   {
      childNode.removeChildren("property-class");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigManagedPropertyType ElementName: javaee:faces-config-map-entriesType ElementType : map-entries
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>map-entries</code> element with the given value will be created.
    * Otherwise, the existing <code>map-entries</code> element will be returned.
    * @return  a new or existing instance of <code>FacesConfigMapEntriesType<FacesConfigManagedPropertyType<T>></code> 
    */
   public FacesConfigMapEntriesType<FacesConfigManagedPropertyType<T>> getOrCreateMapEntries()
   {
      Node node = childNode.getOrCreate("map-entries");
      FacesConfigMapEntriesType<FacesConfigManagedPropertyType<T>> mapEntries = new FacesConfigMapEntriesTypeImpl<FacesConfigManagedPropertyType<T>>(this, "map-entries", childNode, node);
      return mapEntries;
   }

   /**
    * Removes the <code>map-entries</code> element 
    * @return the current instance of <code>FacesConfigManagedPropertyType<T></code> 
    */
   public FacesConfigManagedPropertyType<T> removeMapEntries()
   {
      childNode.removeChildren("map-entries");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigManagedPropertyType ElementName: javaee:faces-config-null-valueType ElementType : null-value
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>null-value</code> element 
    * @return the current instance of <code>FacesConfigManagedPropertyType<T></code> 
    */
   public FacesConfigManagedPropertyType<T> nullValue()
   {
      childNode.getOrCreate("null-value");
      return this;
   }

   /**
    * Removes the <code>null-value</code> element 
    * @return the current instance of <code>FacesConfigManagedPropertyType<T></code> 
    */
   public Boolean isNullValue()
   {
      return childNode.getSingle("null-value") != null;
   }

   /**
    * Removes the <code>null-value</code> element 
    * @return the current instance of <code>FacesConfigManagedPropertyType<T></code> 
    */
   public FacesConfigManagedPropertyType<T> removeNullValue()
   {
      childNode.removeChild("null-value");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigManagedPropertyType ElementName: xsd:string ElementType : value
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>value</code> element
    * @param value the value for the element <code>value</code> 
    * @return the current instance of <code>FacesConfigManagedPropertyType<T></code> 
    */
   public FacesConfigManagedPropertyType<T> value(String value)
   {
      childNode.getOrCreate("value").text(value);
      return this;
   }

   /**
    * Returns the <code>value</code> element
    * @return the node defined for the element <code>value</code> 
    */
   public String getValue()
   {
      return childNode.getTextValueForPatternName("value");
   }

   /**
    * Removes the <code>value</code> element 
    * @return the current instance of <code>FacesConfigManagedPropertyType<T></code> 
    */
   public FacesConfigManagedPropertyType<T> removeValue()
   {
      childNode.removeChildren("value");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigManagedPropertyType ElementName: javaee:faces-config-list-entriesType ElementType : list-entries
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>list-entries</code> element with the given value will be created.
    * Otherwise, the existing <code>list-entries</code> element will be returned.
    * @return  a new or existing instance of <code>FacesConfigListEntriesType<FacesConfigManagedPropertyType<T>></code> 
    */
   public FacesConfigListEntriesType<FacesConfigManagedPropertyType<T>> getOrCreateListEntries()
   {
      Node node = childNode.getOrCreate("list-entries");
      FacesConfigListEntriesType<FacesConfigManagedPropertyType<T>> listEntries = new FacesConfigListEntriesTypeImpl<FacesConfigManagedPropertyType<T>>(this, "list-entries", childNode, node);
      return listEntries;
   }

   /**
    * Removes the <code>list-entries</code> element 
    * @return the current instance of <code>FacesConfigManagedPropertyType<T></code> 
    */
   public FacesConfigManagedPropertyType<T> removeListEntries()
   {
      childNode.removeChildren("list-entries");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigManagedPropertyType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>FacesConfigManagedPropertyType<T></code> 
    */
   public FacesConfigManagedPropertyType<T> id(String id)
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
    * @return the current instance of <code>FacesConfigManagedPropertyType<T></code> 
    */
   public FacesConfigManagedPropertyType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
