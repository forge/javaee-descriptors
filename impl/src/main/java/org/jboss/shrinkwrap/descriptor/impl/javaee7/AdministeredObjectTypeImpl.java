package org.jboss.shrinkwrap.descriptor.impl.javaee7; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee7.AdministeredObjectType;
import org.jboss.shrinkwrap.descriptor.api.javaee7.PropertyType;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> administered-objectType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class AdministeredObjectTypeImpl<T> implements Child<T>, AdministeredObjectType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public AdministeredObjectTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public AdministeredObjectTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: AdministeredObjectType ElementName: xsd:string ElementType : description
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>description</code> element
    * @param description the value for the element <code>description</code> 
    * @return the current instance of <code>AdministeredObjectType<T></code> 
    */
   public AdministeredObjectType<T> description(String description)
   {
      childNode.getOrCreate("description").text(description);
      return this;
   }

   /**
    * Returns the <code>description</code> element
    * @return the node defined for the element <code>description</code> 
    */
   public String getDescription()
   {
      return childNode.getTextValueForPatternName("description");
   }

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>AdministeredObjectType<T></code> 
    */
   public AdministeredObjectType<T> removeDescription()
   {
      childNode.removeChildren("description");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: AdministeredObjectType ElementName: xsd:token ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> element
    * @param name the value for the element <code>name</code> 
    * @return the current instance of <code>AdministeredObjectType<T></code> 
    */
   public AdministeredObjectType<T> name(String name)
   {
      childNode.getOrCreate("name").text(name);
      return this;
   }

   /**
    * Returns the <code>name</code> element
    * @return the node defined for the element <code>name</code> 
    */
   public String getName()
   {
      return childNode.getTextValueForPatternName("name");
   }

   /**
    * Removes the <code>name</code> element 
    * @return the current instance of <code>AdministeredObjectType<T></code> 
    */
   public AdministeredObjectType<T> removeName()
   {
      childNode.removeChildren("name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: AdministeredObjectType ElementName: xsd:token ElementType : interface-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>interface-name</code> element
    * @param interfaceName the value for the element <code>interface-name</code> 
    * @return the current instance of <code>AdministeredObjectType<T></code> 
    */
   public AdministeredObjectType<T> interfaceName(String interfaceName)
   {
      childNode.getOrCreate("interface-name").text(interfaceName);
      return this;
   }

   /**
    * Returns the <code>interface-name</code> element
    * @return the node defined for the element <code>interface-name</code> 
    */
   public String getInterfaceName()
   {
      return childNode.getTextValueForPatternName("interface-name");
   }

   /**
    * Removes the <code>interface-name</code> element 
    * @return the current instance of <code>AdministeredObjectType<T></code> 
    */
   public AdministeredObjectType<T> removeInterfaceName()
   {
      childNode.removeChildren("interface-name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: AdministeredObjectType ElementName: xsd:token ElementType : class-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>class-name</code> element
    * @param className the value for the element <code>class-name</code> 
    * @return the current instance of <code>AdministeredObjectType<T></code> 
    */
   public AdministeredObjectType<T> className(String className)
   {
      childNode.getOrCreate("class-name").text(className);
      return this;
   }

   /**
    * Returns the <code>class-name</code> element
    * @return the node defined for the element <code>class-name</code> 
    */
   public String getClassName()
   {
      return childNode.getTextValueForPatternName("class-name");
   }

   /**
    * Removes the <code>class-name</code> element 
    * @return the current instance of <code>AdministeredObjectType<T></code> 
    */
   public AdministeredObjectType<T> removeClassName()
   {
      childNode.removeChildren("class-name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: AdministeredObjectType ElementName: xsd:token ElementType : resource-adapter
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>resource-adapter</code> element
    * @param resourceAdapter the value for the element <code>resource-adapter</code> 
    * @return the current instance of <code>AdministeredObjectType<T></code> 
    */
   public AdministeredObjectType<T> resourceAdapter(String resourceAdapter)
   {
      childNode.getOrCreate("resource-adapter").text(resourceAdapter);
      return this;
   }

   /**
    * Returns the <code>resource-adapter</code> element
    * @return the node defined for the element <code>resource-adapter</code> 
    */
   public String getResourceAdapter()
   {
      return childNode.getTextValueForPatternName("resource-adapter");
   }

   /**
    * Removes the <code>resource-adapter</code> element 
    * @return the current instance of <code>AdministeredObjectType<T></code> 
    */
   public AdministeredObjectType<T> removeResourceAdapter()
   {
      childNode.removeChildren("resource-adapter");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: AdministeredObjectType ElementName: javaee:propertyType ElementType : property
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>property</code> element will be created and returned.
    * Otherwise, the first existing <code>property</code> element will be returned.
    * @return the instance defined for the element <code>property</code> 
    */
   public PropertyType<AdministeredObjectType<T>> getOrCreateProperty()
   {
      List<Node> nodeList = childNode.get("property");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new PropertyTypeImpl<AdministeredObjectType<T>>(this, "property", childNode, nodeList.get(0));
      }
      return createProperty();
   }

   /**
    * Creates a new <code>property</code> element 
    * @return the new created instance of <code>PropertyType<AdministeredObjectType<T>></code> 
    */
   public PropertyType<AdministeredObjectType<T>> createProperty()
   {
      return new PropertyTypeImpl<AdministeredObjectType<T>>(this, "property", childNode);
   }

   /**
    * Returns all <code>property</code> elements
    * @return list of <code>property</code> 
    */
   public List<PropertyType<AdministeredObjectType<T>>> getAllProperty()
   {
      List<PropertyType<AdministeredObjectType<T>>> list = new ArrayList<PropertyType<AdministeredObjectType<T>>>();
      List<Node> nodeList = childNode.get("property");
      for(Node node: nodeList)
      {
         PropertyType<AdministeredObjectType<T>>  type = new PropertyTypeImpl<AdministeredObjectType<T>>(this, "property", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>property</code> elements 
    * @return the current instance of <code>PropertyType<AdministeredObjectType<T>></code> 
    */
   public AdministeredObjectType<T> removeAllProperty()
   {
      childNode.removeChildren("property");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: AdministeredObjectType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>AdministeredObjectType<T></code> 
    */
   public AdministeredObjectType<T> id(String id)
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
    * @return the current instance of <code>AdministeredObjectType<T></code> 
    */
   public AdministeredObjectType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
