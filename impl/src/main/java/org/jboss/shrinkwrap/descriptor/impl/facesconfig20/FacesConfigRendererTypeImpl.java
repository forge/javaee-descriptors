package org.jboss.shrinkwrap.descriptor.impl.facesconfig20; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.facesconfig20.FacesConfigRendererType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.facesconfig20.FacesConfigFacetType;
import org.jboss.shrinkwrap.descriptor.impl.facesconfig20.FacesConfigFacetTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.facesconfig20.FacesConfigAttributeType;
import org.jboss.shrinkwrap.descriptor.impl.facesconfig20.FacesConfigAttributeTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.facesconfig20.FacesConfigRendererExtensionType;
import org.jboss.shrinkwrap.descriptor.impl.facesconfig20.FacesConfigRendererExtensionTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.IconTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.facesconfig20.FacesConfigFacetType;
import org.jboss.shrinkwrap.descriptor.impl.facesconfig20.FacesConfigFacetTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.facesconfig20.FacesConfigAttributeType;
import org.jboss.shrinkwrap.descriptor.impl.facesconfig20.FacesConfigAttributeTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.facesconfig20.FacesConfigRendererExtensionType;
import org.jboss.shrinkwrap.descriptor.impl.facesconfig20.FacesConfigRendererExtensionTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.IconTypeImpl;

/**
 * This class implements the <code> faces-config-rendererType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class FacesConfigRendererTypeImpl<T> implements Child<T>, FacesConfigRendererType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public FacesConfigRendererTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public FacesConfigRendererTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigRendererType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>FacesConfigRendererType<T></code> 
    */
   public FacesConfigRendererType<T> description(String ... values)
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
    * @return the current instance of <code>FacesConfigRendererType<T></code> 
    */
   public FacesConfigRendererType<T> removeAllDescription()
   {
      childNode.removeChildren("description");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigRendererType ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>FacesConfigRendererType<T></code> 
    */
   public FacesConfigRendererType<T> displayName(String ... values)
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
    * @return the current instance of <code>FacesConfigRendererType<T></code> 
    */
   public FacesConfigRendererType<T> removeAllDisplayName()
   {
      childNode.removeChildren("display-name");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigRendererType ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<FacesConfigRendererType<T>> getOrCreateIcon()
   {
      List<Node> nodeList = childNode.get("icon");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new IconTypeImpl<FacesConfigRendererType<T>>(this, "icon", childNode, nodeList.get(0));
      }
      return createIcon();
   }

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<FacesConfigRendererType<T>></code> 
    */
   public IconType<FacesConfigRendererType<T>> createIcon()
   {
      return new IconTypeImpl<FacesConfigRendererType<T>>(this, "icon", childNode);
   }

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<FacesConfigRendererType<T>>> getAllIcon()
   {
      List<IconType<FacesConfigRendererType<T>>> list = new ArrayList<IconType<FacesConfigRendererType<T>>>();
      List<Node> nodeList = childNode.get("icon");
      for(Node node: nodeList)
      {
         IconType<FacesConfigRendererType<T>>  type = new IconTypeImpl<FacesConfigRendererType<T>>(this, "icon", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<FacesConfigRendererType<T>></code> 
    */
   public FacesConfigRendererType<T> removeAllIcon()
   {
      childNode.removeChildren("icon");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigRendererType ElementName: xsd:token ElementType : component-family
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>component-family</code> element
    * @param componentFamily the value for the element <code>component-family</code> 
    * @return the current instance of <code>FacesConfigRendererType<T></code> 
    */
   public FacesConfigRendererType<T> componentFamily(String componentFamily)
   {
      childNode.getOrCreate("component-family").text(componentFamily);
      return this;
   }

   /**
    * Returns the <code>component-family</code> element
    * @return the node defined for the element <code>component-family</code> 
    */
   public String getComponentFamily()
   {
      return childNode.getTextValueForPatternName("component-family");
   }

   /**
    * Removes the <code>component-family</code> element 
    * @return the current instance of <code>FacesConfigRendererType<T></code> 
    */
   public FacesConfigRendererType<T> removeComponentFamily()
   {
      childNode.removeChildren("component-family");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigRendererType ElementName: xsd:token ElementType : renderer-type
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>renderer-type</code> element
    * @param rendererType the value for the element <code>renderer-type</code> 
    * @return the current instance of <code>FacesConfigRendererType<T></code> 
    */
   public FacesConfigRendererType<T> rendererType(String rendererType)
   {
      childNode.getOrCreate("renderer-type").text(rendererType);
      return this;
   }

   /**
    * Returns the <code>renderer-type</code> element
    * @return the node defined for the element <code>renderer-type</code> 
    */
   public String getRendererType()
   {
      return childNode.getTextValueForPatternName("renderer-type");
   }

   /**
    * Removes the <code>renderer-type</code> element 
    * @return the current instance of <code>FacesConfigRendererType<T></code> 
    */
   public FacesConfigRendererType<T> removeRendererType()
   {
      childNode.removeChildren("renderer-type");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigRendererType ElementName: xsd:token ElementType : renderer-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>renderer-class</code> element
    * @param rendererClass the value for the element <code>renderer-class</code> 
    * @return the current instance of <code>FacesConfigRendererType<T></code> 
    */
   public FacesConfigRendererType<T> rendererClass(String rendererClass)
   {
      childNode.getOrCreate("renderer-class").text(rendererClass);
      return this;
   }

   /**
    * Returns the <code>renderer-class</code> element
    * @return the node defined for the element <code>renderer-class</code> 
    */
   public String getRendererClass()
   {
      return childNode.getTextValueForPatternName("renderer-class");
   }

   /**
    * Removes the <code>renderer-class</code> element 
    * @return the current instance of <code>FacesConfigRendererType<T></code> 
    */
   public FacesConfigRendererType<T> removeRendererClass()
   {
      childNode.removeChildren("renderer-class");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigRendererType ElementName: javaee:faces-config-facetType ElementType : facet
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>facet</code> element will be created and returned.
    * Otherwise, the first existing <code>facet</code> element will be returned.
    * @return the instance defined for the element <code>facet</code> 
    */
   public FacesConfigFacetType<FacesConfigRendererType<T>> getOrCreateFacet()
   {
      List<Node> nodeList = childNode.get("facet");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new FacesConfigFacetTypeImpl<FacesConfigRendererType<T>>(this, "facet", childNode, nodeList.get(0));
      }
      return createFacet();
   }

   /**
    * Creates a new <code>facet</code> element 
    * @return the new created instance of <code>FacesConfigFacetType<FacesConfigRendererType<T>></code> 
    */
   public FacesConfigFacetType<FacesConfigRendererType<T>> createFacet()
   {
      return new FacesConfigFacetTypeImpl<FacesConfigRendererType<T>>(this, "facet", childNode);
   }

   /**
    * Returns all <code>facet</code> elements
    * @return list of <code>facet</code> 
    */
   public List<FacesConfigFacetType<FacesConfigRendererType<T>>> getAllFacet()
   {
      List<FacesConfigFacetType<FacesConfigRendererType<T>>> list = new ArrayList<FacesConfigFacetType<FacesConfigRendererType<T>>>();
      List<Node> nodeList = childNode.get("facet");
      for(Node node: nodeList)
      {
         FacesConfigFacetType<FacesConfigRendererType<T>>  type = new FacesConfigFacetTypeImpl<FacesConfigRendererType<T>>(this, "facet", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>facet</code> elements 
    * @return the current instance of <code>FacesConfigFacetType<FacesConfigRendererType<T>></code> 
    */
   public FacesConfigRendererType<T> removeAllFacet()
   {
      childNode.removeChildren("facet");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigRendererType ElementName: javaee:faces-config-attributeType ElementType : attribute
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>attribute</code> element will be created and returned.
    * Otherwise, the first existing <code>attribute</code> element will be returned.
    * @return the instance defined for the element <code>attribute</code> 
    */
   public FacesConfigAttributeType<FacesConfigRendererType<T>> getOrCreateAttribute()
   {
      List<Node> nodeList = childNode.get("attribute");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new FacesConfigAttributeTypeImpl<FacesConfigRendererType<T>>(this, "attribute", childNode, nodeList.get(0));
      }
      return createAttribute();
   }

   /**
    * Creates a new <code>attribute</code> element 
    * @return the new created instance of <code>FacesConfigAttributeType<FacesConfigRendererType<T>></code> 
    */
   public FacesConfigAttributeType<FacesConfigRendererType<T>> createAttribute()
   {
      return new FacesConfigAttributeTypeImpl<FacesConfigRendererType<T>>(this, "attribute", childNode);
   }

   /**
    * Returns all <code>attribute</code> elements
    * @return list of <code>attribute</code> 
    */
   public List<FacesConfigAttributeType<FacesConfigRendererType<T>>> getAllAttribute()
   {
      List<FacesConfigAttributeType<FacesConfigRendererType<T>>> list = new ArrayList<FacesConfigAttributeType<FacesConfigRendererType<T>>>();
      List<Node> nodeList = childNode.get("attribute");
      for(Node node: nodeList)
      {
         FacesConfigAttributeType<FacesConfigRendererType<T>>  type = new FacesConfigAttributeTypeImpl<FacesConfigRendererType<T>>(this, "attribute", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>attribute</code> elements 
    * @return the current instance of <code>FacesConfigAttributeType<FacesConfigRendererType<T>></code> 
    */
   public FacesConfigRendererType<T> removeAllAttribute()
   {
      childNode.removeChildren("attribute");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigRendererType ElementName: javaee:faces-config-renderer-extensionType ElementType : renderer-extension
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>renderer-extension</code> element 
    * @return the current instance of <code>FacesConfigRendererType<T></code> 
    */
   public FacesConfigRendererType<T> rendererExtension()
   {
      childNode.getOrCreate("renderer-extension");
      return this;
   }

   /**
    * Removes the <code>renderer-extension</code> element 
    * @return the current instance of <code>FacesConfigRendererType<T></code> 
    */
   public Boolean isRendererExtension()
   {
      return childNode.getSingle("renderer-extension") != null;
   }

   /**
    * Removes the <code>renderer-extension</code> element 
    * @return the current instance of <code>FacesConfigRendererType<T></code> 
    */
   public FacesConfigRendererType<T> removeRendererExtension()
   {
      childNode.removeChild("renderer-extension");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigRendererType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>FacesConfigRendererType<T></code> 
    */
   public FacesConfigRendererType<T> id(String id)
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
    * @return the current instance of <code>FacesConfigRendererType<T></code> 
    */
   public FacesConfigRendererType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
