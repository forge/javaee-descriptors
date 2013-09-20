package org.jboss.shrinkwrap.descriptor.impl.facelettaglibrary22; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.facelettaglibrary22.FaceletTaglibTagAttributeType;
import org.jboss.shrinkwrap.descriptor.api.facelettaglibrary22.FaceletTaglibTagBehaviorType;
import org.jboss.shrinkwrap.descriptor.api.facelettaglibrary22.FaceletTaglibTagComponentType;
import org.jboss.shrinkwrap.descriptor.api.facelettaglibrary22.FaceletTaglibTagConverterType;
import org.jboss.shrinkwrap.descriptor.api.facelettaglibrary22.FaceletTaglibTagType;
import org.jboss.shrinkwrap.descriptor.api.facelettaglibrary22.FaceletTaglibTagValidatorType;
import org.jboss.shrinkwrap.descriptor.api.javaee7.IconType;
import org.jboss.shrinkwrap.descriptor.impl.javaee7.IconTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> facelet-taglib-tagType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class FaceletTaglibTagTypeImpl<T> implements Child<T>, FaceletTaglibTagType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public FaceletTaglibTagTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public FaceletTaglibTagTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibTagType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>FaceletTaglibTagType<T></code> 
    */
   public FaceletTaglibTagType<T> description(String ... values)
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
    * @return the current instance of <code>FaceletTaglibTagType<T></code> 
    */
   public FaceletTaglibTagType<T> removeAllDescription()
   {
      childNode.removeChildren("description");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibTagType ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>FaceletTaglibTagType<T></code> 
    */
   public FaceletTaglibTagType<T> displayName(String ... values)
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
    * @return the current instance of <code>FaceletTaglibTagType<T></code> 
    */
   public FaceletTaglibTagType<T> removeAllDisplayName()
   {
      childNode.removeChildren("display-name");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibTagType ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<FaceletTaglibTagType<T>> getOrCreateIcon()
   {
      List<Node> nodeList = childNode.get("icon");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new IconTypeImpl<FaceletTaglibTagType<T>>(this, "icon", childNode, nodeList.get(0));
      }
      return createIcon();
   }

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<FaceletTaglibTagType<T>></code> 
    */
   public IconType<FaceletTaglibTagType<T>> createIcon()
   {
      return new IconTypeImpl<FaceletTaglibTagType<T>>(this, "icon", childNode);
   }

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<FaceletTaglibTagType<T>>> getAllIcon()
   {
      List<IconType<FaceletTaglibTagType<T>>> list = new ArrayList<IconType<FaceletTaglibTagType<T>>>();
      List<Node> nodeList = childNode.get("icon");
      for(Node node: nodeList)
      {
         IconType<FaceletTaglibTagType<T>>  type = new IconTypeImpl<FaceletTaglibTagType<T>>(this, "icon", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<FaceletTaglibTagType<T>></code> 
    */
   public FaceletTaglibTagType<T> removeAllIcon()
   {
      childNode.removeChildren("icon");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibTagType ElementName: xsd:NCName ElementType : tag-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>tag-name</code> element
    * @param tagName the value for the element <code>tag-name</code> 
    * @return the current instance of <code>FaceletTaglibTagType<T></code> 
    */
   public FaceletTaglibTagType<T> tagName(String tagName)
   {
      childNode.getOrCreate("tag-name").text(tagName);
      return this;
   }

   /**
    * Returns the <code>tag-name</code> element
    * @return the node defined for the element <code>tag-name</code> 
    */
   public String getTagName()
   {
      return childNode.getTextValueForPatternName("tag-name");
   }

   /**
    * Removes the <code>tag-name</code> element 
    * @return the current instance of <code>FaceletTaglibTagType<T></code> 
    */
   public FaceletTaglibTagType<T> removeTagName()
   {
      childNode.removeChildren("tag-name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibTagType ElementName: xsd:token ElementType : handler-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>handler-class</code> element
    * @param handlerClass the value for the element <code>handler-class</code> 
    * @return the current instance of <code>FaceletTaglibTagType<T></code> 
    */
   public FaceletTaglibTagType<T> handlerClass(String handlerClass)
   {
      childNode.getOrCreate("handler-class").text(handlerClass);
      return this;
   }

   /**
    * Returns the <code>handler-class</code> element
    * @return the node defined for the element <code>handler-class</code> 
    */
   public String getHandlerClass()
   {
      return childNode.getTextValueForPatternName("handler-class");
   }

   /**
    * Removes the <code>handler-class</code> element 
    * @return the current instance of <code>FaceletTaglibTagType<T></code> 
    */
   public FaceletTaglibTagType<T> removeHandlerClass()
   {
      childNode.removeChildren("handler-class");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibTagType ElementName: javaee:facelet-taglib-tag-behaviorType ElementType : behavior
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>behavior</code> element with the given value will be created.
    * Otherwise, the existing <code>behavior</code> element will be returned.
    * @return  a new or existing instance of <code>FaceletTaglibTagBehaviorType<FaceletTaglibTagType<T>></code> 
    */
   public FaceletTaglibTagBehaviorType<FaceletTaglibTagType<T>> getOrCreateBehavior()
   {
      Node node = childNode.getOrCreate("behavior");
      FaceletTaglibTagBehaviorType<FaceletTaglibTagType<T>> behavior = new FaceletTaglibTagBehaviorTypeImpl<FaceletTaglibTagType<T>>(this, "behavior", childNode, node);
      return behavior;
   }

   /**
    * Removes the <code>behavior</code> element 
    * @return the current instance of <code>FaceletTaglibTagType<T></code> 
    */
   public FaceletTaglibTagType<T> removeBehavior()
   {
      childNode.removeChildren("behavior");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibTagType ElementName: javaee:facelet-taglib-tag-componentType ElementType : component
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>component</code> element with the given value will be created.
    * Otherwise, the existing <code>component</code> element will be returned.
    * @return  a new or existing instance of <code>FaceletTaglibTagComponentType<FaceletTaglibTagType<T>></code> 
    */
   public FaceletTaglibTagComponentType<FaceletTaglibTagType<T>> getOrCreateComponent()
   {
      Node node = childNode.getOrCreate("component");
      FaceletTaglibTagComponentType<FaceletTaglibTagType<T>> component = new FaceletTaglibTagComponentTypeImpl<FaceletTaglibTagType<T>>(this, "component", childNode, node);
      return component;
   }

   /**
    * Removes the <code>component</code> element 
    * @return the current instance of <code>FaceletTaglibTagType<T></code> 
    */
   public FaceletTaglibTagType<T> removeComponent()
   {
      childNode.removeChildren("component");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibTagType ElementName: javaee:facelet-taglib-tag-converterType ElementType : converter
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>converter</code> element with the given value will be created.
    * Otherwise, the existing <code>converter</code> element will be returned.
    * @return  a new or existing instance of <code>FaceletTaglibTagConverterType<FaceletTaglibTagType<T>></code> 
    */
   public FaceletTaglibTagConverterType<FaceletTaglibTagType<T>> getOrCreateConverter()
   {
      Node node = childNode.getOrCreate("converter");
      FaceletTaglibTagConverterType<FaceletTaglibTagType<T>> converter = new FaceletTaglibTagConverterTypeImpl<FaceletTaglibTagType<T>>(this, "converter", childNode, node);
      return converter;
   }

   /**
    * Removes the <code>converter</code> element 
    * @return the current instance of <code>FaceletTaglibTagType<T></code> 
    */
   public FaceletTaglibTagType<T> removeConverter()
   {
      childNode.removeChildren("converter");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibTagType ElementName: javaee:facelet-taglib-tag-validatorType ElementType : validator
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>validator</code> element with the given value will be created.
    * Otherwise, the existing <code>validator</code> element will be returned.
    * @return  a new or existing instance of <code>FaceletTaglibTagValidatorType<FaceletTaglibTagType<T>></code> 
    */
   public FaceletTaglibTagValidatorType<FaceletTaglibTagType<T>> getOrCreateValidator()
   {
      Node node = childNode.getOrCreate("validator");
      FaceletTaglibTagValidatorType<FaceletTaglibTagType<T>> validator = new FaceletTaglibTagValidatorTypeImpl<FaceletTaglibTagType<T>>(this, "validator", childNode, node);
      return validator;
   }

   /**
    * Removes the <code>validator</code> element 
    * @return the current instance of <code>FaceletTaglibTagType<T></code> 
    */
   public FaceletTaglibTagType<T> removeValidator()
   {
      childNode.removeChildren("validator");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibTagType ElementName: xsd:token ElementType : source
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>source</code> element
    * @param source the value for the element <code>source</code> 
    * @return the current instance of <code>FaceletTaglibTagType<T></code> 
    */
   public FaceletTaglibTagType<T> source(String source)
   {
      childNode.getOrCreate("source").text(source);
      return this;
   }

   /**
    * Returns the <code>source</code> element
    * @return the node defined for the element <code>source</code> 
    */
   public String getSource()
   {
      return childNode.getTextValueForPatternName("source");
   }

   /**
    * Removes the <code>source</code> element 
    * @return the current instance of <code>FaceletTaglibTagType<T></code> 
    */
   public FaceletTaglibTagType<T> removeSource()
   {
      childNode.removeChildren("source");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibTagType ElementName: javaee:facelet-taglib-tag-attributeType ElementType : attribute
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>attribute</code> element will be created and returned.
    * Otherwise, the first existing <code>attribute</code> element will be returned.
    * @return the instance defined for the element <code>attribute</code> 
    */
   public FaceletTaglibTagAttributeType<FaceletTaglibTagType<T>> getOrCreateAttribute()
   {
      List<Node> nodeList = childNode.get("attribute");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new FaceletTaglibTagAttributeTypeImpl<FaceletTaglibTagType<T>>(this, "attribute", childNode, nodeList.get(0));
      }
      return createAttribute();
   }

   /**
    * Creates a new <code>attribute</code> element 
    * @return the new created instance of <code>FaceletTaglibTagAttributeType<FaceletTaglibTagType<T>></code> 
    */
   public FaceletTaglibTagAttributeType<FaceletTaglibTagType<T>> createAttribute()
   {
      return new FaceletTaglibTagAttributeTypeImpl<FaceletTaglibTagType<T>>(this, "attribute", childNode);
   }

   /**
    * Returns all <code>attribute</code> elements
    * @return list of <code>attribute</code> 
    */
   public List<FaceletTaglibTagAttributeType<FaceletTaglibTagType<T>>> getAllAttribute()
   {
      List<FaceletTaglibTagAttributeType<FaceletTaglibTagType<T>>> list = new ArrayList<FaceletTaglibTagAttributeType<FaceletTaglibTagType<T>>>();
      List<Node> nodeList = childNode.get("attribute");
      for(Node node: nodeList)
      {
         FaceletTaglibTagAttributeType<FaceletTaglibTagType<T>>  type = new FaceletTaglibTagAttributeTypeImpl<FaceletTaglibTagType<T>>(this, "attribute", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>attribute</code> elements 
    * @return the current instance of <code>FaceletTaglibTagAttributeType<FaceletTaglibTagType<T>></code> 
    */
   public FaceletTaglibTagType<T> removeAllAttribute()
   {
      childNode.removeChildren("attribute");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibTagType ElementName: javaee:facelet-taglib-tag-extensionType ElementType : tag-extension
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>tag-extension</code> element 
    * @return the current instance of <code>FaceletTaglibTagType<T></code> 
    */
   public FaceletTaglibTagType<T> tagExtension()
   {
      childNode.getOrCreate("tag-extension");
      return this;
   }

   /**
    * Removes the <code>tag-extension</code> element 
    * @return the current instance of <code>FaceletTaglibTagType<T></code> 
    */
   public Boolean isTagExtension()
   {
      return childNode.getSingle("tag-extension") != null;
   }

   /**
    * Removes the <code>tag-extension</code> element 
    * @return the current instance of <code>FaceletTaglibTagType<T></code> 
    */
   public FaceletTaglibTagType<T> removeTagExtension()
   {
      childNode.removeChild("tag-extension");
      return this;
   }
}
