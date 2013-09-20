package org.jboss.shrinkwrap.descriptor.impl.facesconfig22; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigBehaviorType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigAttributeType;
import org.jboss.shrinkwrap.descriptor.impl.facesconfig22.FacesConfigAttributeTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigPropertyType;
import org.jboss.shrinkwrap.descriptor.impl.facesconfig22.FacesConfigPropertyTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigBehaviorExtensionType;
import org.jboss.shrinkwrap.descriptor.impl.facesconfig22.FacesConfigBehaviorExtensionTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee7.IconType;
import org.jboss.shrinkwrap.descriptor.impl.javaee7.IconTypeImpl;

/**
 * This class implements the <code> faces-config-behaviorType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class FacesConfigBehaviorTypeImpl<T> implements Child<T>, FacesConfigBehaviorType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public FacesConfigBehaviorTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public FacesConfigBehaviorTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigBehaviorType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>FacesConfigBehaviorType<T></code> 
    */
   public FacesConfigBehaviorType<T> description(String ... values)
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
    * @return the current instance of <code>FacesConfigBehaviorType<T></code> 
    */
   public FacesConfigBehaviorType<T> removeAllDescription()
   {
      childNode.removeChildren("description");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigBehaviorType ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>FacesConfigBehaviorType<T></code> 
    */
   public FacesConfigBehaviorType<T> displayName(String ... values)
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
    * @return the current instance of <code>FacesConfigBehaviorType<T></code> 
    */
   public FacesConfigBehaviorType<T> removeAllDisplayName()
   {
      childNode.removeChildren("display-name");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigBehaviorType ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<FacesConfigBehaviorType<T>> getOrCreateIcon()
   {
      List<Node> nodeList = childNode.get("icon");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new IconTypeImpl<FacesConfigBehaviorType<T>>(this, "icon", childNode, nodeList.get(0));
      }
      return createIcon();
   }

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<FacesConfigBehaviorType<T>></code> 
    */
   public IconType<FacesConfigBehaviorType<T>> createIcon()
   {
      return new IconTypeImpl<FacesConfigBehaviorType<T>>(this, "icon", childNode);
   }

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<FacesConfigBehaviorType<T>>> getAllIcon()
   {
      List<IconType<FacesConfigBehaviorType<T>>> list = new ArrayList<IconType<FacesConfigBehaviorType<T>>>();
      List<Node> nodeList = childNode.get("icon");
      for(Node node: nodeList)
      {
         IconType<FacesConfigBehaviorType<T>>  type = new IconTypeImpl<FacesConfigBehaviorType<T>>(this, "icon", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<FacesConfigBehaviorType<T>></code> 
    */
   public FacesConfigBehaviorType<T> removeAllIcon()
   {
      childNode.removeChildren("icon");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigBehaviorType ElementName: xsd:token ElementType : behavior-id
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>behavior-id</code> element
    * @param behaviorId the value for the element <code>behavior-id</code> 
    * @return the current instance of <code>FacesConfigBehaviorType<T></code> 
    */
   public FacesConfigBehaviorType<T> behaviorId(String behaviorId)
   {
      childNode.getOrCreate("behavior-id").text(behaviorId);
      return this;
   }

   /**
    * Returns the <code>behavior-id</code> element
    * @return the node defined for the element <code>behavior-id</code> 
    */
   public String getBehaviorId()
   {
      return childNode.getTextValueForPatternName("behavior-id");
   }

   /**
    * Removes the <code>behavior-id</code> element 
    * @return the current instance of <code>FacesConfigBehaviorType<T></code> 
    */
   public FacesConfigBehaviorType<T> removeBehaviorId()
   {
      childNode.removeChildren("behavior-id");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigBehaviorType ElementName: xsd:token ElementType : behavior-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>behavior-class</code> element
    * @param behaviorClass the value for the element <code>behavior-class</code> 
    * @return the current instance of <code>FacesConfigBehaviorType<T></code> 
    */
   public FacesConfigBehaviorType<T> behaviorClass(String behaviorClass)
   {
      childNode.getOrCreate("behavior-class").text(behaviorClass);
      return this;
   }

   /**
    * Returns the <code>behavior-class</code> element
    * @return the node defined for the element <code>behavior-class</code> 
    */
   public String getBehaviorClass()
   {
      return childNode.getTextValueForPatternName("behavior-class");
   }

   /**
    * Removes the <code>behavior-class</code> element 
    * @return the current instance of <code>FacesConfigBehaviorType<T></code> 
    */
   public FacesConfigBehaviorType<T> removeBehaviorClass()
   {
      childNode.removeChildren("behavior-class");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigBehaviorType ElementName: javaee:faces-config-attributeType ElementType : attribute
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>attribute</code> element will be created and returned.
    * Otherwise, the first existing <code>attribute</code> element will be returned.
    * @return the instance defined for the element <code>attribute</code> 
    */
   public FacesConfigAttributeType<FacesConfigBehaviorType<T>> getOrCreateAttribute()
   {
      List<Node> nodeList = childNode.get("attribute");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new FacesConfigAttributeTypeImpl<FacesConfigBehaviorType<T>>(this, "attribute", childNode, nodeList.get(0));
      }
      return createAttribute();
   }

   /**
    * Creates a new <code>attribute</code> element 
    * @return the new created instance of <code>FacesConfigAttributeType<FacesConfigBehaviorType<T>></code> 
    */
   public FacesConfigAttributeType<FacesConfigBehaviorType<T>> createAttribute()
   {
      return new FacesConfigAttributeTypeImpl<FacesConfigBehaviorType<T>>(this, "attribute", childNode);
   }

   /**
    * Returns all <code>attribute</code> elements
    * @return list of <code>attribute</code> 
    */
   public List<FacesConfigAttributeType<FacesConfigBehaviorType<T>>> getAllAttribute()
   {
      List<FacesConfigAttributeType<FacesConfigBehaviorType<T>>> list = new ArrayList<FacesConfigAttributeType<FacesConfigBehaviorType<T>>>();
      List<Node> nodeList = childNode.get("attribute");
      for(Node node: nodeList)
      {
         FacesConfigAttributeType<FacesConfigBehaviorType<T>>  type = new FacesConfigAttributeTypeImpl<FacesConfigBehaviorType<T>>(this, "attribute", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>attribute</code> elements 
    * @return the current instance of <code>FacesConfigAttributeType<FacesConfigBehaviorType<T>></code> 
    */
   public FacesConfigBehaviorType<T> removeAllAttribute()
   {
      childNode.removeChildren("attribute");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigBehaviorType ElementName: javaee:faces-config-propertyType ElementType : property
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>property</code> element will be created and returned.
    * Otherwise, the first existing <code>property</code> element will be returned.
    * @return the instance defined for the element <code>property</code> 
    */
   public FacesConfigPropertyType<FacesConfigBehaviorType<T>> getOrCreateProperty()
   {
      List<Node> nodeList = childNode.get("property");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new FacesConfigPropertyTypeImpl<FacesConfigBehaviorType<T>>(this, "property", childNode, nodeList.get(0));
      }
      return createProperty();
   }

   /**
    * Creates a new <code>property</code> element 
    * @return the new created instance of <code>FacesConfigPropertyType<FacesConfigBehaviorType<T>></code> 
    */
   public FacesConfigPropertyType<FacesConfigBehaviorType<T>> createProperty()
   {
      return new FacesConfigPropertyTypeImpl<FacesConfigBehaviorType<T>>(this, "property", childNode);
   }

   /**
    * Returns all <code>property</code> elements
    * @return list of <code>property</code> 
    */
   public List<FacesConfigPropertyType<FacesConfigBehaviorType<T>>> getAllProperty()
   {
      List<FacesConfigPropertyType<FacesConfigBehaviorType<T>>> list = new ArrayList<FacesConfigPropertyType<FacesConfigBehaviorType<T>>>();
      List<Node> nodeList = childNode.get("property");
      for(Node node: nodeList)
      {
         FacesConfigPropertyType<FacesConfigBehaviorType<T>>  type = new FacesConfigPropertyTypeImpl<FacesConfigBehaviorType<T>>(this, "property", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>property</code> elements 
    * @return the current instance of <code>FacesConfigPropertyType<FacesConfigBehaviorType<T>></code> 
    */
   public FacesConfigBehaviorType<T> removeAllProperty()
   {
      childNode.removeChildren("property");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigBehaviorType ElementName: javaee:faces-config-behavior-extensionType ElementType : behavior-extension
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>behavior-extension</code> element 
    * @return the current instance of <code>FacesConfigBehaviorType<T></code> 
    */
   public FacesConfigBehaviorType<T> behaviorExtension()
   {
      childNode.getOrCreate("behavior-extension");
      return this;
   }

   /**
    * Removes the <code>behavior-extension</code> element 
    * @return the current instance of <code>FacesConfigBehaviorType<T></code> 
    */
   public Boolean isBehaviorExtension()
   {
      return childNode.getSingle("behavior-extension") != null;
   }

   /**
    * Removes the <code>behavior-extension</code> element 
    * @return the current instance of <code>FacesConfigBehaviorType<T></code> 
    */
   public FacesConfigBehaviorType<T> removeBehaviorExtension()
   {
      childNode.removeChild("behavior-extension");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigBehaviorType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>FacesConfigBehaviorType<T></code> 
    */
   public FacesConfigBehaviorType<T> id(String id)
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
    * @return the current instance of <code>FacesConfigBehaviorType<T></code> 
    */
   public FacesConfigBehaviorType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
