package org.jboss.shrinkwrap.descriptor.impl.facesconfig21; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.facesconfig21.FacesConfigComponentType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.facesconfig21.FacesConfigFacetType;
import org.jboss.shrinkwrap.descriptor.impl.facesconfig21.FacesConfigFacetTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.facesconfig21.FacesConfigAttributeType;
import org.jboss.shrinkwrap.descriptor.impl.facesconfig21.FacesConfigAttributeTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.facesconfig21.FacesConfigPropertyType;
import org.jboss.shrinkwrap.descriptor.impl.facesconfig21.FacesConfigPropertyTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.facesconfig21.FacesConfigComponentExtensionType;
import org.jboss.shrinkwrap.descriptor.impl.facesconfig21.FacesConfigComponentExtensionTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.IconTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.facesconfig21.FacesConfigFacetType;
import org.jboss.shrinkwrap.descriptor.impl.facesconfig21.FacesConfigFacetTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.facesconfig21.FacesConfigAttributeType;
import org.jboss.shrinkwrap.descriptor.impl.facesconfig21.FacesConfigAttributeTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.facesconfig21.FacesConfigPropertyType;
import org.jboss.shrinkwrap.descriptor.impl.facesconfig21.FacesConfigPropertyTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.facesconfig21.FacesConfigComponentExtensionType;
import org.jboss.shrinkwrap.descriptor.impl.facesconfig21.FacesConfigComponentExtensionTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.IconTypeImpl;

/**
 * This class implements the <code> faces-config-componentType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class FacesConfigComponentTypeImpl<T> implements Child<T>, FacesConfigComponentType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public FacesConfigComponentTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public FacesConfigComponentTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigComponentType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>FacesConfigComponentType<T></code> 
    */
   public FacesConfigComponentType<T> description(String ... values)
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
    * @return the current instance of <code>FacesConfigComponentType<T></code> 
    */
   public FacesConfigComponentType<T> removeAllDescription()
   {
      childNode.removeChildren("description");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigComponentType ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>FacesConfigComponentType<T></code> 
    */
   public FacesConfigComponentType<T> displayName(String ... values)
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
    * @return the current instance of <code>FacesConfigComponentType<T></code> 
    */
   public FacesConfigComponentType<T> removeAllDisplayName()
   {
      childNode.removeChildren("display-name");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigComponentType ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<FacesConfigComponentType<T>> getOrCreateIcon()
   {
      List<Node> nodeList = childNode.get("icon");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new IconTypeImpl<FacesConfigComponentType<T>>(this, "icon", childNode, nodeList.get(0));
      }
      return createIcon();
   }

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<FacesConfigComponentType<T>></code> 
    */
   public IconType<FacesConfigComponentType<T>> createIcon()
   {
      return new IconTypeImpl<FacesConfigComponentType<T>>(this, "icon", childNode);
   }

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<FacesConfigComponentType<T>>> getAllIcon()
   {
      List<IconType<FacesConfigComponentType<T>>> list = new ArrayList<IconType<FacesConfigComponentType<T>>>();
      List<Node> nodeList = childNode.get("icon");
      for(Node node: nodeList)
      {
         IconType<FacesConfigComponentType<T>>  type = new IconTypeImpl<FacesConfigComponentType<T>>(this, "icon", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<FacesConfigComponentType<T>></code> 
    */
   public FacesConfigComponentType<T> removeAllIcon()
   {
      childNode.removeChildren("icon");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigComponentType ElementName: xsd:token ElementType : component-type
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>component-type</code> element
    * @param componentType the value for the element <code>component-type</code> 
    * @return the current instance of <code>FacesConfigComponentType<T></code> 
    */
   public FacesConfigComponentType<T> componentType(String componentType)
   {
      childNode.getOrCreate("component-type").text(componentType);
      return this;
   }

   /**
    * Returns the <code>component-type</code> element
    * @return the node defined for the element <code>component-type</code> 
    */
   public String getComponentType()
   {
      return childNode.getTextValueForPatternName("component-type");
   }

   /**
    * Removes the <code>component-type</code> element 
    * @return the current instance of <code>FacesConfigComponentType<T></code> 
    */
   public FacesConfigComponentType<T> removeComponentType()
   {
      childNode.removeChildren("component-type");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigComponentType ElementName: xsd:token ElementType : component-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>component-class</code> element
    * @param componentClass the value for the element <code>component-class</code> 
    * @return the current instance of <code>FacesConfigComponentType<T></code> 
    */
   public FacesConfigComponentType<T> componentClass(String componentClass)
   {
      childNode.getOrCreate("component-class").text(componentClass);
      return this;
   }

   /**
    * Returns the <code>component-class</code> element
    * @return the node defined for the element <code>component-class</code> 
    */
   public String getComponentClass()
   {
      return childNode.getTextValueForPatternName("component-class");
   }

   /**
    * Removes the <code>component-class</code> element 
    * @return the current instance of <code>FacesConfigComponentType<T></code> 
    */
   public FacesConfigComponentType<T> removeComponentClass()
   {
      childNode.removeChildren("component-class");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigComponentType ElementName: javaee:faces-config-facetType ElementType : facet
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>facet</code> element will be created and returned.
    * Otherwise, the first existing <code>facet</code> element will be returned.
    * @return the instance defined for the element <code>facet</code> 
    */
   public FacesConfigFacetType<FacesConfigComponentType<T>> getOrCreateFacet()
   {
      List<Node> nodeList = childNode.get("facet");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new FacesConfigFacetTypeImpl<FacesConfigComponentType<T>>(this, "facet", childNode, nodeList.get(0));
      }
      return createFacet();
   }

   /**
    * Creates a new <code>facet</code> element 
    * @return the new created instance of <code>FacesConfigFacetType<FacesConfigComponentType<T>></code> 
    */
   public FacesConfigFacetType<FacesConfigComponentType<T>> createFacet()
   {
      return new FacesConfigFacetTypeImpl<FacesConfigComponentType<T>>(this, "facet", childNode);
   }

   /**
    * Returns all <code>facet</code> elements
    * @return list of <code>facet</code> 
    */
   public List<FacesConfigFacetType<FacesConfigComponentType<T>>> getAllFacet()
   {
      List<FacesConfigFacetType<FacesConfigComponentType<T>>> list = new ArrayList<FacesConfigFacetType<FacesConfigComponentType<T>>>();
      List<Node> nodeList = childNode.get("facet");
      for(Node node: nodeList)
      {
         FacesConfigFacetType<FacesConfigComponentType<T>>  type = new FacesConfigFacetTypeImpl<FacesConfigComponentType<T>>(this, "facet", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>facet</code> elements 
    * @return the current instance of <code>FacesConfigFacetType<FacesConfigComponentType<T>></code> 
    */
   public FacesConfigComponentType<T> removeAllFacet()
   {
      childNode.removeChildren("facet");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigComponentType ElementName: javaee:faces-config-attributeType ElementType : attribute
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>attribute</code> element will be created and returned.
    * Otherwise, the first existing <code>attribute</code> element will be returned.
    * @return the instance defined for the element <code>attribute</code> 
    */
   public FacesConfigAttributeType<FacesConfigComponentType<T>> getOrCreateAttribute()
   {
      List<Node> nodeList = childNode.get("attribute");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new FacesConfigAttributeTypeImpl<FacesConfigComponentType<T>>(this, "attribute", childNode, nodeList.get(0));
      }
      return createAttribute();
   }

   /**
    * Creates a new <code>attribute</code> element 
    * @return the new created instance of <code>FacesConfigAttributeType<FacesConfigComponentType<T>></code> 
    */
   public FacesConfigAttributeType<FacesConfigComponentType<T>> createAttribute()
   {
      return new FacesConfigAttributeTypeImpl<FacesConfigComponentType<T>>(this, "attribute", childNode);
   }

   /**
    * Returns all <code>attribute</code> elements
    * @return list of <code>attribute</code> 
    */
   public List<FacesConfigAttributeType<FacesConfigComponentType<T>>> getAllAttribute()
   {
      List<FacesConfigAttributeType<FacesConfigComponentType<T>>> list = new ArrayList<FacesConfigAttributeType<FacesConfigComponentType<T>>>();
      List<Node> nodeList = childNode.get("attribute");
      for(Node node: nodeList)
      {
         FacesConfigAttributeType<FacesConfigComponentType<T>>  type = new FacesConfigAttributeTypeImpl<FacesConfigComponentType<T>>(this, "attribute", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>attribute</code> elements 
    * @return the current instance of <code>FacesConfigAttributeType<FacesConfigComponentType<T>></code> 
    */
   public FacesConfigComponentType<T> removeAllAttribute()
   {
      childNode.removeChildren("attribute");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigComponentType ElementName: javaee:faces-config-propertyType ElementType : property
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>property</code> element will be created and returned.
    * Otherwise, the first existing <code>property</code> element will be returned.
    * @return the instance defined for the element <code>property</code> 
    */
   public FacesConfigPropertyType<FacesConfigComponentType<T>> getOrCreateProperty()
   {
      List<Node> nodeList = childNode.get("property");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new FacesConfigPropertyTypeImpl<FacesConfigComponentType<T>>(this, "property", childNode, nodeList.get(0));
      }
      return createProperty();
   }

   /**
    * Creates a new <code>property</code> element 
    * @return the new created instance of <code>FacesConfigPropertyType<FacesConfigComponentType<T>></code> 
    */
   public FacesConfigPropertyType<FacesConfigComponentType<T>> createProperty()
   {
      return new FacesConfigPropertyTypeImpl<FacesConfigComponentType<T>>(this, "property", childNode);
   }

   /**
    * Returns all <code>property</code> elements
    * @return list of <code>property</code> 
    */
   public List<FacesConfigPropertyType<FacesConfigComponentType<T>>> getAllProperty()
   {
      List<FacesConfigPropertyType<FacesConfigComponentType<T>>> list = new ArrayList<FacesConfigPropertyType<FacesConfigComponentType<T>>>();
      List<Node> nodeList = childNode.get("property");
      for(Node node: nodeList)
      {
         FacesConfigPropertyType<FacesConfigComponentType<T>>  type = new FacesConfigPropertyTypeImpl<FacesConfigComponentType<T>>(this, "property", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>property</code> elements 
    * @return the current instance of <code>FacesConfigPropertyType<FacesConfigComponentType<T>></code> 
    */
   public FacesConfigComponentType<T> removeAllProperty()
   {
      childNode.removeChildren("property");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigComponentType ElementName: javaee:faces-config-component-extensionType ElementType : component-extension
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>component-extension</code> element 
    * @return the current instance of <code>FacesConfigComponentType<T></code> 
    */
   public FacesConfigComponentType<T> componentExtension()
   {
      childNode.getOrCreate("component-extension");
      return this;
   }

   /**
    * Removes the <code>component-extension</code> element 
    * @return the current instance of <code>FacesConfigComponentType<T></code> 
    */
   public Boolean isComponentExtension()
   {
      return childNode.getSingle("component-extension") != null;
   }

   /**
    * Removes the <code>component-extension</code> element 
    * @return the current instance of <code>FacesConfigComponentType<T></code> 
    */
   public FacesConfigComponentType<T> removeComponentExtension()
   {
      childNode.removeChild("component-extension");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigComponentType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>FacesConfigComponentType<T></code> 
    */
   public FacesConfigComponentType<T> id(String id)
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
    * @return the current instance of <code>FacesConfigComponentType<T></code> 
    */
   public FacesConfigComponentType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
