package org.jboss.shrinkwrap.descriptor.impl.facesconfig22; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigManagedBeanType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigManagedPropertyType;
import org.jboss.shrinkwrap.descriptor.impl.facesconfig22.FacesConfigManagedPropertyTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigMapEntriesType;
import org.jboss.shrinkwrap.descriptor.impl.facesconfig22.FacesConfigMapEntriesTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigListEntriesType;
import org.jboss.shrinkwrap.descriptor.impl.facesconfig22.FacesConfigListEntriesTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigManagedBeanExtensionType;
import org.jboss.shrinkwrap.descriptor.impl.facesconfig22.FacesConfigManagedBeanExtensionTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee7.IconType;
import org.jboss.shrinkwrap.descriptor.impl.javaee7.IconTypeImpl;

/**
 * This class implements the <code> faces-config-managed-beanType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class FacesConfigManagedBeanTypeImpl<T> implements Child<T>, FacesConfigManagedBeanType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public FacesConfigManagedBeanTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public FacesConfigManagedBeanTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigManagedBeanType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>FacesConfigManagedBeanType<T></code> 
    */
   public FacesConfigManagedBeanType<T> description(String ... values)
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
    * @return the current instance of <code>FacesConfigManagedBeanType<T></code> 
    */
   public FacesConfigManagedBeanType<T> removeAllDescription()
   {
      childNode.removeChildren("description");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigManagedBeanType ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>FacesConfigManagedBeanType<T></code> 
    */
   public FacesConfigManagedBeanType<T> displayName(String ... values)
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
    * @return the current instance of <code>FacesConfigManagedBeanType<T></code> 
    */
   public FacesConfigManagedBeanType<T> removeAllDisplayName()
   {
      childNode.removeChildren("display-name");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigManagedBeanType ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<FacesConfigManagedBeanType<T>> getOrCreateIcon()
   {
      List<Node> nodeList = childNode.get("icon");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new IconTypeImpl<FacesConfigManagedBeanType<T>>(this, "icon", childNode, nodeList.get(0));
      }
      return createIcon();
   }

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<FacesConfigManagedBeanType<T>></code> 
    */
   public IconType<FacesConfigManagedBeanType<T>> createIcon()
   {
      return new IconTypeImpl<FacesConfigManagedBeanType<T>>(this, "icon", childNode);
   }

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<FacesConfigManagedBeanType<T>>> getAllIcon()
   {
      List<IconType<FacesConfigManagedBeanType<T>>> list = new ArrayList<IconType<FacesConfigManagedBeanType<T>>>();
      List<Node> nodeList = childNode.get("icon");
      for(Node node: nodeList)
      {
         IconType<FacesConfigManagedBeanType<T>>  type = new IconTypeImpl<FacesConfigManagedBeanType<T>>(this, "icon", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<FacesConfigManagedBeanType<T>></code> 
    */
   public FacesConfigManagedBeanType<T> removeAllIcon()
   {
      childNode.removeChildren("icon");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigManagedBeanType ElementName: xsd:token ElementType : managed-bean-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>managed-bean-name</code> element
    * @param managedBeanName the value for the element <code>managed-bean-name</code> 
    * @return the current instance of <code>FacesConfigManagedBeanType<T></code> 
    */
   public FacesConfigManagedBeanType<T> managedBeanName(String managedBeanName)
   {
      childNode.getOrCreate("managed-bean-name").text(managedBeanName);
      return this;
   }

   /**
    * Returns the <code>managed-bean-name</code> element
    * @return the node defined for the element <code>managed-bean-name</code> 
    */
   public String getManagedBeanName()
   {
      return childNode.getTextValueForPatternName("managed-bean-name");
   }

   /**
    * Removes the <code>managed-bean-name</code> element 
    * @return the current instance of <code>FacesConfigManagedBeanType<T></code> 
    */
   public FacesConfigManagedBeanType<T> removeManagedBeanName()
   {
      childNode.removeChildren("managed-bean-name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigManagedBeanType ElementName: xsd:token ElementType : managed-bean-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>managed-bean-class</code> element
    * @param managedBeanClass the value for the element <code>managed-bean-class</code> 
    * @return the current instance of <code>FacesConfigManagedBeanType<T></code> 
    */
   public FacesConfigManagedBeanType<T> managedBeanClass(String managedBeanClass)
   {
      childNode.getOrCreate("managed-bean-class").text(managedBeanClass);
      return this;
   }

   /**
    * Returns the <code>managed-bean-class</code> element
    * @return the node defined for the element <code>managed-bean-class</code> 
    */
   public String getManagedBeanClass()
   {
      return childNode.getTextValueForPatternName("managed-bean-class");
   }

   /**
    * Removes the <code>managed-bean-class</code> element 
    * @return the current instance of <code>FacesConfigManagedBeanType<T></code> 
    */
   public FacesConfigManagedBeanType<T> removeManagedBeanClass()
   {
      childNode.removeChildren("managed-bean-class");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigManagedBeanType ElementName: javaee:string ElementType : managed-bean-scope
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>managed-bean-scope</code> element
    * @param managedBeanScope the value for the element <code>managed-bean-scope</code> 
    * @return the current instance of <code>FacesConfigManagedBeanType<T></code> 
    */
   public FacesConfigManagedBeanType<T> managedBeanScope(String managedBeanScope)
   {
      childNode.getOrCreate("managed-bean-scope").text(managedBeanScope);
      return this;
   }

   /**
    * Returns the <code>managed-bean-scope</code> element
    * @return the node defined for the element <code>managed-bean-scope</code> 
    */
   public String getManagedBeanScope()
   {
      return childNode.getTextValueForPatternName("managed-bean-scope");
   }

   /**
    * Removes the <code>managed-bean-scope</code> element 
    * @return the current instance of <code>FacesConfigManagedBeanType<T></code> 
    */
   public FacesConfigManagedBeanType<T> removeManagedBeanScope()
   {
      childNode.removeChildren("managed-bean-scope");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigManagedBeanType ElementName: javaee:faces-config-managed-propertyType ElementType : managed-property
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>managed-property</code> element will be created and returned.
    * Otherwise, the first existing <code>managed-property</code> element will be returned.
    * @return the instance defined for the element <code>managed-property</code> 
    */
   public FacesConfigManagedPropertyType<FacesConfigManagedBeanType<T>> getOrCreateManagedProperty()
   {
      List<Node> nodeList = childNode.get("managed-property");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new FacesConfigManagedPropertyTypeImpl<FacesConfigManagedBeanType<T>>(this, "managed-property", childNode, nodeList.get(0));
      }
      return createManagedProperty();
   }

   /**
    * Creates a new <code>managed-property</code> element 
    * @return the new created instance of <code>FacesConfigManagedPropertyType<FacesConfigManagedBeanType<T>></code> 
    */
   public FacesConfigManagedPropertyType<FacesConfigManagedBeanType<T>> createManagedProperty()
   {
      return new FacesConfigManagedPropertyTypeImpl<FacesConfigManagedBeanType<T>>(this, "managed-property", childNode);
   }

   /**
    * Returns all <code>managed-property</code> elements
    * @return list of <code>managed-property</code> 
    */
   public List<FacesConfigManagedPropertyType<FacesConfigManagedBeanType<T>>> getAllManagedProperty()
   {
      List<FacesConfigManagedPropertyType<FacesConfigManagedBeanType<T>>> list = new ArrayList<FacesConfigManagedPropertyType<FacesConfigManagedBeanType<T>>>();
      List<Node> nodeList = childNode.get("managed-property");
      for(Node node: nodeList)
      {
         FacesConfigManagedPropertyType<FacesConfigManagedBeanType<T>>  type = new FacesConfigManagedPropertyTypeImpl<FacesConfigManagedBeanType<T>>(this, "managed-property", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>managed-property</code> elements 
    * @return the current instance of <code>FacesConfigManagedPropertyType<FacesConfigManagedBeanType<T>></code> 
    */
   public FacesConfigManagedBeanType<T> removeAllManagedProperty()
   {
      childNode.removeChildren("managed-property");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigManagedBeanType ElementName: javaee:faces-config-map-entriesType ElementType : map-entries
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>map-entries</code> element with the given value will be created.
    * Otherwise, the existing <code>map-entries</code> element will be returned.
    * @return  a new or existing instance of <code>FacesConfigMapEntriesType<FacesConfigManagedBeanType<T>></code> 
    */
   public FacesConfigMapEntriesType<FacesConfigManagedBeanType<T>> getOrCreateMapEntries()
   {
      Node node = childNode.getOrCreate("map-entries");
      FacesConfigMapEntriesType<FacesConfigManagedBeanType<T>> mapEntries = new FacesConfigMapEntriesTypeImpl<FacesConfigManagedBeanType<T>>(this, "map-entries", childNode, node);
      return mapEntries;
   }

   /**
    * Removes the <code>map-entries</code> element 
    * @return the current instance of <code>FacesConfigManagedBeanType<T></code> 
    */
   public FacesConfigManagedBeanType<T> removeMapEntries()
   {
      childNode.removeChildren("map-entries");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigManagedBeanType ElementName: javaee:faces-config-list-entriesType ElementType : list-entries
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>list-entries</code> element with the given value will be created.
    * Otherwise, the existing <code>list-entries</code> element will be returned.
    * @return  a new or existing instance of <code>FacesConfigListEntriesType<FacesConfigManagedBeanType<T>></code> 
    */
   public FacesConfigListEntriesType<FacesConfigManagedBeanType<T>> getOrCreateListEntries()
   {
      Node node = childNode.getOrCreate("list-entries");
      FacesConfigListEntriesType<FacesConfigManagedBeanType<T>> listEntries = new FacesConfigListEntriesTypeImpl<FacesConfigManagedBeanType<T>>(this, "list-entries", childNode, node);
      return listEntries;
   }

   /**
    * Removes the <code>list-entries</code> element 
    * @return the current instance of <code>FacesConfigManagedBeanType<T></code> 
    */
   public FacesConfigManagedBeanType<T> removeListEntries()
   {
      childNode.removeChildren("list-entries");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigManagedBeanType ElementName: javaee:faces-config-managed-bean-extensionType ElementType : managed-bean-extension
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>managed-bean-extension</code> element 
    * @return the current instance of <code>FacesConfigManagedBeanType<T></code> 
    */
   public FacesConfigManagedBeanType<T> managedBeanExtension()
   {
      childNode.getOrCreate("managed-bean-extension");
      return this;
   }

   /**
    * Removes the <code>managed-bean-extension</code> element 
    * @return the current instance of <code>FacesConfigManagedBeanType<T></code> 
    */
   public Boolean isManagedBeanExtension()
   {
      return childNode.getSingle("managed-bean-extension") != null;
   }

   /**
    * Removes the <code>managed-bean-extension</code> element 
    * @return the current instance of <code>FacesConfigManagedBeanType<T></code> 
    */
   public FacesConfigManagedBeanType<T> removeManagedBeanExtension()
   {
      childNode.removeChild("managed-bean-extension");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigManagedBeanType ElementName: xsd:boolean ElementType : eager
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>eager</code> attribute
    * @param eager the value for the attribute <code>eager</code> 
    * @return the current instance of <code>FacesConfigManagedBeanType<T></code> 
    */
   public FacesConfigManagedBeanType<T> eager(Boolean eager)
   {
      childNode.attribute("eager", eager);
      return this;
   }

   /**
    * Returns the <code>eager</code> attribute
    * @return the value defined for the attribute <code>eager</code> 
    */
   public Boolean isEager()
   {
      return Strings.isTrue(childNode.getAttribute("eager"));
   }

   /**
    * Removes the <code>eager</code> attribute 
    * @return the current instance of <code>FacesConfigManagedBeanType<T></code> 
    */
   public FacesConfigManagedBeanType<T> removeEager()
   {
      childNode.removeAttribute("eager");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigManagedBeanType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>FacesConfigManagedBeanType<T></code> 
    */
   public FacesConfigManagedBeanType<T> id(String id)
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
    * @return the current instance of <code>FacesConfigManagedBeanType<T></code> 
    */
   public FacesConfigManagedBeanType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
