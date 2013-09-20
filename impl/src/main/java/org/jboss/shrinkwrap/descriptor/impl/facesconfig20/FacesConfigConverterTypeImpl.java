package org.jboss.shrinkwrap.descriptor.impl.facesconfig20; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.facesconfig20.FacesConfigAttributeType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig20.FacesConfigConverterType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig20.FacesConfigPropertyType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.IconTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> faces-config-converterType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class FacesConfigConverterTypeImpl<T> implements Child<T>, FacesConfigConverterType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public FacesConfigConverterTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public FacesConfigConverterTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigConverterType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>FacesConfigConverterType<T></code> 
    */
   public FacesConfigConverterType<T> description(String ... values)
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
    * @return the current instance of <code>FacesConfigConverterType<T></code> 
    */
   public FacesConfigConverterType<T> removeAllDescription()
   {
      childNode.removeChildren("description");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigConverterType ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>FacesConfigConverterType<T></code> 
    */
   public FacesConfigConverterType<T> displayName(String ... values)
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
    * @return the current instance of <code>FacesConfigConverterType<T></code> 
    */
   public FacesConfigConverterType<T> removeAllDisplayName()
   {
      childNode.removeChildren("display-name");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigConverterType ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<FacesConfigConverterType<T>> getOrCreateIcon()
   {
      List<Node> nodeList = childNode.get("icon");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new IconTypeImpl<FacesConfigConverterType<T>>(this, "icon", childNode, nodeList.get(0));
      }
      return createIcon();
   }

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<FacesConfigConverterType<T>></code> 
    */
   public IconType<FacesConfigConverterType<T>> createIcon()
   {
      return new IconTypeImpl<FacesConfigConverterType<T>>(this, "icon", childNode);
   }

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<FacesConfigConverterType<T>>> getAllIcon()
   {
      List<IconType<FacesConfigConverterType<T>>> list = new ArrayList<IconType<FacesConfigConverterType<T>>>();
      List<Node> nodeList = childNode.get("icon");
      for(Node node: nodeList)
      {
         IconType<FacesConfigConverterType<T>>  type = new IconTypeImpl<FacesConfigConverterType<T>>(this, "icon", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<FacesConfigConverterType<T>></code> 
    */
   public FacesConfigConverterType<T> removeAllIcon()
   {
      childNode.removeChildren("icon");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigConverterType ElementName: xsd:token ElementType : converter-id
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>converter-id</code> element
    * @param converterId the value for the element <code>converter-id</code> 
    * @return the current instance of <code>FacesConfigConverterType<T></code> 
    */
   public FacesConfigConverterType<T> converterId(String converterId)
   {
      childNode.getOrCreate("converter-id").text(converterId);
      return this;
   }

   /**
    * Returns the <code>converter-id</code> element
    * @return the node defined for the element <code>converter-id</code> 
    */
   public String getConverterId()
   {
      return childNode.getTextValueForPatternName("converter-id");
   }

   /**
    * Removes the <code>converter-id</code> element 
    * @return the current instance of <code>FacesConfigConverterType<T></code> 
    */
   public FacesConfigConverterType<T> removeConverterId()
   {
      childNode.removeChildren("converter-id");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigConverterType ElementName: xsd:token ElementType : converter-for-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>converter-for-class</code> element
    * @param converterForClass the value for the element <code>converter-for-class</code> 
    * @return the current instance of <code>FacesConfigConverterType<T></code> 
    */
   public FacesConfigConverterType<T> converterForClass(String converterForClass)
   {
      childNode.getOrCreate("converter-for-class").text(converterForClass);
      return this;
   }

   /**
    * Returns the <code>converter-for-class</code> element
    * @return the node defined for the element <code>converter-for-class</code> 
    */
   public String getConverterForClass()
   {
      return childNode.getTextValueForPatternName("converter-for-class");
   }

   /**
    * Removes the <code>converter-for-class</code> element 
    * @return the current instance of <code>FacesConfigConverterType<T></code> 
    */
   public FacesConfigConverterType<T> removeConverterForClass()
   {
      childNode.removeChildren("converter-for-class");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigConverterType ElementName: xsd:token ElementType : converter-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>converter-class</code> element
    * @param converterClass the value for the element <code>converter-class</code> 
    * @return the current instance of <code>FacesConfigConverterType<T></code> 
    */
   public FacesConfigConverterType<T> converterClass(String converterClass)
   {
      childNode.getOrCreate("converter-class").text(converterClass);
      return this;
   }

   /**
    * Returns the <code>converter-class</code> element
    * @return the node defined for the element <code>converter-class</code> 
    */
   public String getConverterClass()
   {
      return childNode.getTextValueForPatternName("converter-class");
   }

   /**
    * Removes the <code>converter-class</code> element 
    * @return the current instance of <code>FacesConfigConverterType<T></code> 
    */
   public FacesConfigConverterType<T> removeConverterClass()
   {
      childNode.removeChildren("converter-class");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigConverterType ElementName: javaee:faces-config-attributeType ElementType : attribute
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>attribute</code> element will be created and returned.
    * Otherwise, the first existing <code>attribute</code> element will be returned.
    * @return the instance defined for the element <code>attribute</code> 
    */
   public FacesConfigAttributeType<FacesConfigConverterType<T>> getOrCreateAttribute()
   {
      List<Node> nodeList = childNode.get("attribute");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new FacesConfigAttributeTypeImpl<FacesConfigConverterType<T>>(this, "attribute", childNode, nodeList.get(0));
      }
      return createAttribute();
   }

   /**
    * Creates a new <code>attribute</code> element 
    * @return the new created instance of <code>FacesConfigAttributeType<FacesConfigConverterType<T>></code> 
    */
   public FacesConfigAttributeType<FacesConfigConverterType<T>> createAttribute()
   {
      return new FacesConfigAttributeTypeImpl<FacesConfigConverterType<T>>(this, "attribute", childNode);
   }

   /**
    * Returns all <code>attribute</code> elements
    * @return list of <code>attribute</code> 
    */
   public List<FacesConfigAttributeType<FacesConfigConverterType<T>>> getAllAttribute()
   {
      List<FacesConfigAttributeType<FacesConfigConverterType<T>>> list = new ArrayList<FacesConfigAttributeType<FacesConfigConverterType<T>>>();
      List<Node> nodeList = childNode.get("attribute");
      for(Node node: nodeList)
      {
         FacesConfigAttributeType<FacesConfigConverterType<T>>  type = new FacesConfigAttributeTypeImpl<FacesConfigConverterType<T>>(this, "attribute", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>attribute</code> elements 
    * @return the current instance of <code>FacesConfigAttributeType<FacesConfigConverterType<T>></code> 
    */
   public FacesConfigConverterType<T> removeAllAttribute()
   {
      childNode.removeChildren("attribute");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigConverterType ElementName: javaee:faces-config-propertyType ElementType : property
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>property</code> element will be created and returned.
    * Otherwise, the first existing <code>property</code> element will be returned.
    * @return the instance defined for the element <code>property</code> 
    */
   public FacesConfigPropertyType<FacesConfigConverterType<T>> getOrCreateProperty()
   {
      List<Node> nodeList = childNode.get("property");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new FacesConfigPropertyTypeImpl<FacesConfigConverterType<T>>(this, "property", childNode, nodeList.get(0));
      }
      return createProperty();
   }

   /**
    * Creates a new <code>property</code> element 
    * @return the new created instance of <code>FacesConfigPropertyType<FacesConfigConverterType<T>></code> 
    */
   public FacesConfigPropertyType<FacesConfigConverterType<T>> createProperty()
   {
      return new FacesConfigPropertyTypeImpl<FacesConfigConverterType<T>>(this, "property", childNode);
   }

   /**
    * Returns all <code>property</code> elements
    * @return list of <code>property</code> 
    */
   public List<FacesConfigPropertyType<FacesConfigConverterType<T>>> getAllProperty()
   {
      List<FacesConfigPropertyType<FacesConfigConverterType<T>>> list = new ArrayList<FacesConfigPropertyType<FacesConfigConverterType<T>>>();
      List<Node> nodeList = childNode.get("property");
      for(Node node: nodeList)
      {
         FacesConfigPropertyType<FacesConfigConverterType<T>>  type = new FacesConfigPropertyTypeImpl<FacesConfigConverterType<T>>(this, "property", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>property</code> elements 
    * @return the current instance of <code>FacesConfigPropertyType<FacesConfigConverterType<T>></code> 
    */
   public FacesConfigConverterType<T> removeAllProperty()
   {
      childNode.removeChildren("property");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigConverterType ElementName: javaee:faces-config-converter-extensionType ElementType : converter-extension
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>converter-extension</code> element 
    * @return the current instance of <code>FacesConfigConverterType<T></code> 
    */
   public FacesConfigConverterType<T> converterExtension()
   {
      childNode.getOrCreate("converter-extension");
      return this;
   }

   /**
    * Removes the <code>converter-extension</code> element 
    * @return the current instance of <code>FacesConfigConverterType<T></code> 
    */
   public Boolean isConverterExtension()
   {
      return childNode.getSingle("converter-extension") != null;
   }

   /**
    * Removes the <code>converter-extension</code> element 
    * @return the current instance of <code>FacesConfigConverterType<T></code> 
    */
   public FacesConfigConverterType<T> removeConverterExtension()
   {
      childNode.removeChild("converter-extension");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigConverterType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>FacesConfigConverterType<T></code> 
    */
   public FacesConfigConverterType<T> id(String id)
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
    * @return the current instance of <code>FacesConfigConverterType<T></code> 
    */
   public FacesConfigConverterType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
