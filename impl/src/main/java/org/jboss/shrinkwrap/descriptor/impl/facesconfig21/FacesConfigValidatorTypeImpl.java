package org.jboss.shrinkwrap.descriptor.impl.facesconfig21; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.facesconfig21.FacesConfigAttributeType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig21.FacesConfigPropertyType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig21.FacesConfigValidatorType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.IconTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> faces-config-validatorType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class FacesConfigValidatorTypeImpl<T> implements Child<T>, FacesConfigValidatorType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public FacesConfigValidatorTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public FacesConfigValidatorTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigValidatorType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>FacesConfigValidatorType<T></code> 
    */
   public FacesConfigValidatorType<T> description(String ... values)
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
    * @return the current instance of <code>FacesConfigValidatorType<T></code> 
    */
   public FacesConfigValidatorType<T> removeAllDescription()
   {
      childNode.removeChildren("description");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigValidatorType ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>FacesConfigValidatorType<T></code> 
    */
   public FacesConfigValidatorType<T> displayName(String ... values)
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
    * @return the current instance of <code>FacesConfigValidatorType<T></code> 
    */
   public FacesConfigValidatorType<T> removeAllDisplayName()
   {
      childNode.removeChildren("display-name");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigValidatorType ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<FacesConfigValidatorType<T>> getOrCreateIcon()
   {
      List<Node> nodeList = childNode.get("icon");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new IconTypeImpl<FacesConfigValidatorType<T>>(this, "icon", childNode, nodeList.get(0));
      }
      return createIcon();
   }

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<FacesConfigValidatorType<T>></code> 
    */
   public IconType<FacesConfigValidatorType<T>> createIcon()
   {
      return new IconTypeImpl<FacesConfigValidatorType<T>>(this, "icon", childNode);
   }

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<FacesConfigValidatorType<T>>> getAllIcon()
   {
      List<IconType<FacesConfigValidatorType<T>>> list = new ArrayList<IconType<FacesConfigValidatorType<T>>>();
      List<Node> nodeList = childNode.get("icon");
      for(Node node: nodeList)
      {
         IconType<FacesConfigValidatorType<T>>  type = new IconTypeImpl<FacesConfigValidatorType<T>>(this, "icon", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<FacesConfigValidatorType<T>></code> 
    */
   public FacesConfigValidatorType<T> removeAllIcon()
   {
      childNode.removeChildren("icon");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigValidatorType ElementName: xsd:token ElementType : validator-id
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>validator-id</code> element
    * @param validatorId the value for the element <code>validator-id</code> 
    * @return the current instance of <code>FacesConfigValidatorType<T></code> 
    */
   public FacesConfigValidatorType<T> validatorId(String validatorId)
   {
      childNode.getOrCreate("validator-id").text(validatorId);
      return this;
   }

   /**
    * Returns the <code>validator-id</code> element
    * @return the node defined for the element <code>validator-id</code> 
    */
   public String getValidatorId()
   {
      return childNode.getTextValueForPatternName("validator-id");
   }

   /**
    * Removes the <code>validator-id</code> element 
    * @return the current instance of <code>FacesConfigValidatorType<T></code> 
    */
   public FacesConfigValidatorType<T> removeValidatorId()
   {
      childNode.removeChildren("validator-id");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigValidatorType ElementName: xsd:token ElementType : validator-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>validator-class</code> element
    * @param validatorClass the value for the element <code>validator-class</code> 
    * @return the current instance of <code>FacesConfigValidatorType<T></code> 
    */
   public FacesConfigValidatorType<T> validatorClass(String validatorClass)
   {
      childNode.getOrCreate("validator-class").text(validatorClass);
      return this;
   }

   /**
    * Returns the <code>validator-class</code> element
    * @return the node defined for the element <code>validator-class</code> 
    */
   public String getValidatorClass()
   {
      return childNode.getTextValueForPatternName("validator-class");
   }

   /**
    * Removes the <code>validator-class</code> element 
    * @return the current instance of <code>FacesConfigValidatorType<T></code> 
    */
   public FacesConfigValidatorType<T> removeValidatorClass()
   {
      childNode.removeChildren("validator-class");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigValidatorType ElementName: javaee:faces-config-attributeType ElementType : attribute
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>attribute</code> element will be created and returned.
    * Otherwise, the first existing <code>attribute</code> element will be returned.
    * @return the instance defined for the element <code>attribute</code> 
    */
   public FacesConfigAttributeType<FacesConfigValidatorType<T>> getOrCreateAttribute()
   {
      List<Node> nodeList = childNode.get("attribute");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new FacesConfigAttributeTypeImpl<FacesConfigValidatorType<T>>(this, "attribute", childNode, nodeList.get(0));
      }
      return createAttribute();
   }

   /**
    * Creates a new <code>attribute</code> element 
    * @return the new created instance of <code>FacesConfigAttributeType<FacesConfigValidatorType<T>></code> 
    */
   public FacesConfigAttributeType<FacesConfigValidatorType<T>> createAttribute()
   {
      return new FacesConfigAttributeTypeImpl<FacesConfigValidatorType<T>>(this, "attribute", childNode);
   }

   /**
    * Returns all <code>attribute</code> elements
    * @return list of <code>attribute</code> 
    */
   public List<FacesConfigAttributeType<FacesConfigValidatorType<T>>> getAllAttribute()
   {
      List<FacesConfigAttributeType<FacesConfigValidatorType<T>>> list = new ArrayList<FacesConfigAttributeType<FacesConfigValidatorType<T>>>();
      List<Node> nodeList = childNode.get("attribute");
      for(Node node: nodeList)
      {
         FacesConfigAttributeType<FacesConfigValidatorType<T>>  type = new FacesConfigAttributeTypeImpl<FacesConfigValidatorType<T>>(this, "attribute", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>attribute</code> elements 
    * @return the current instance of <code>FacesConfigAttributeType<FacesConfigValidatorType<T>></code> 
    */
   public FacesConfigValidatorType<T> removeAllAttribute()
   {
      childNode.removeChildren("attribute");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigValidatorType ElementName: javaee:faces-config-propertyType ElementType : property
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>property</code> element will be created and returned.
    * Otherwise, the first existing <code>property</code> element will be returned.
    * @return the instance defined for the element <code>property</code> 
    */
   public FacesConfigPropertyType<FacesConfigValidatorType<T>> getOrCreateProperty()
   {
      List<Node> nodeList = childNode.get("property");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new FacesConfigPropertyTypeImpl<FacesConfigValidatorType<T>>(this, "property", childNode, nodeList.get(0));
      }
      return createProperty();
   }

   /**
    * Creates a new <code>property</code> element 
    * @return the new created instance of <code>FacesConfigPropertyType<FacesConfigValidatorType<T>></code> 
    */
   public FacesConfigPropertyType<FacesConfigValidatorType<T>> createProperty()
   {
      return new FacesConfigPropertyTypeImpl<FacesConfigValidatorType<T>>(this, "property", childNode);
   }

   /**
    * Returns all <code>property</code> elements
    * @return list of <code>property</code> 
    */
   public List<FacesConfigPropertyType<FacesConfigValidatorType<T>>> getAllProperty()
   {
      List<FacesConfigPropertyType<FacesConfigValidatorType<T>>> list = new ArrayList<FacesConfigPropertyType<FacesConfigValidatorType<T>>>();
      List<Node> nodeList = childNode.get("property");
      for(Node node: nodeList)
      {
         FacesConfigPropertyType<FacesConfigValidatorType<T>>  type = new FacesConfigPropertyTypeImpl<FacesConfigValidatorType<T>>(this, "property", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>property</code> elements 
    * @return the current instance of <code>FacesConfigPropertyType<FacesConfigValidatorType<T>></code> 
    */
   public FacesConfigValidatorType<T> removeAllProperty()
   {
      childNode.removeChildren("property");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigValidatorType ElementName: javaee:faces-config-validator-extensionType ElementType : validator-extension
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>validator-extension</code> element 
    * @return the current instance of <code>FacesConfigValidatorType<T></code> 
    */
   public FacesConfigValidatorType<T> validatorExtension()
   {
      childNode.getOrCreate("validator-extension");
      return this;
   }

   /**
    * Removes the <code>validator-extension</code> element 
    * @return the current instance of <code>FacesConfigValidatorType<T></code> 
    */
   public Boolean isValidatorExtension()
   {
      return childNode.getSingle("validator-extension") != null;
   }

   /**
    * Removes the <code>validator-extension</code> element 
    * @return the current instance of <code>FacesConfigValidatorType<T></code> 
    */
   public FacesConfigValidatorType<T> removeValidatorExtension()
   {
      childNode.removeChild("validator-extension");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigValidatorType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>FacesConfigValidatorType<T></code> 
    */
   public FacesConfigValidatorType<T> id(String id)
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
    * @return the current instance of <code>FacesConfigValidatorType<T></code> 
    */
   public FacesConfigValidatorType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
