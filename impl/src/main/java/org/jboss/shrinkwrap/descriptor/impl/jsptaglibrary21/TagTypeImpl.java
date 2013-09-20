package org.jboss.shrinkwrap.descriptor.impl.jsptaglibrary21; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.jsptaglibrary21.TagType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.jsptaglibrary21.BodyContentType;
import org.jboss.shrinkwrap.descriptor.api.jsptaglibrary21.VariableType;
import org.jboss.shrinkwrap.descriptor.impl.jsptaglibrary21.VariableTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.jsptaglibrary21.TldAttributeType;
import org.jboss.shrinkwrap.descriptor.impl.jsptaglibrary21.TldAttributeTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee5.GenericBooleanType;
import org.jboss.shrinkwrap.descriptor.api.jsptaglibrary21.TldExtensionType;
import org.jboss.shrinkwrap.descriptor.impl.jsptaglibrary21.TldExtensionTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.IconTypeImpl;

/**
 * This class implements the <code> tagType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class TagTypeImpl<T> implements Child<T>, TagType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public TagTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public TagTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TagType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>TagType<T></code> 
    */
   public TagType<T> description(String ... values)
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
    * @return the current instance of <code>TagType<T></code> 
    */
   public TagType<T> removeAllDescription()
   {
      childNode.removeChildren("description");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TagType ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>TagType<T></code> 
    */
   public TagType<T> displayName(String ... values)
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
    * @return the current instance of <code>TagType<T></code> 
    */
   public TagType<T> removeAllDisplayName()
   {
      childNode.removeChildren("display-name");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TagType ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<TagType<T>> getOrCreateIcon()
   {
      List<Node> nodeList = childNode.get("icon");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new IconTypeImpl<TagType<T>>(this, "icon", childNode, nodeList.get(0));
      }
      return createIcon();
   }

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<TagType<T>></code> 
    */
   public IconType<TagType<T>> createIcon()
   {
      return new IconTypeImpl<TagType<T>>(this, "icon", childNode);
   }

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<TagType<T>>> getAllIcon()
   {
      List<IconType<TagType<T>>> list = new ArrayList<IconType<TagType<T>>>();
      List<Node> nodeList = childNode.get("icon");
      for(Node node: nodeList)
      {
         IconType<TagType<T>>  type = new IconTypeImpl<TagType<T>>(this, "icon", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<TagType<T>></code> 
    */
   public TagType<T> removeAllIcon()
   {
      childNode.removeChildren("icon");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TagType ElementName: javaee:xsdNMTOKENType ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> element
    * @param name the value for the element <code>name</code> 
    * @return the current instance of <code>TagType<T></code> 
    */
   public TagType<T> name(String name)
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
    * @return the current instance of <code>TagType<T></code> 
    */
   public TagType<T> removeName()
   {
      childNode.removeChildren("name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TagType ElementName: xsd:token ElementType : tag-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>tag-class</code> element
    * @param tagClass the value for the element <code>tag-class</code> 
    * @return the current instance of <code>TagType<T></code> 
    */
   public TagType<T> tagClass(String tagClass)
   {
      childNode.getOrCreate("tag-class").text(tagClass);
      return this;
   }

   /**
    * Returns the <code>tag-class</code> element
    * @return the node defined for the element <code>tag-class</code> 
    */
   public String getTagClass()
   {
      return childNode.getTextValueForPatternName("tag-class");
   }

   /**
    * Removes the <code>tag-class</code> element 
    * @return the current instance of <code>TagType<T></code> 
    */
   public TagType<T> removeTagClass()
   {
      childNode.removeChildren("tag-class");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TagType ElementName: xsd:token ElementType : tei-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>tei-class</code> element
    * @param teiClass the value for the element <code>tei-class</code> 
    * @return the current instance of <code>TagType<T></code> 
    */
   public TagType<T> teiClass(String teiClass)
   {
      childNode.getOrCreate("tei-class").text(teiClass);
      return this;
   }

   /**
    * Returns the <code>tei-class</code> element
    * @return the node defined for the element <code>tei-class</code> 
    */
   public String getTeiClass()
   {
      return childNode.getTextValueForPatternName("tei-class");
   }

   /**
    * Removes the <code>tei-class</code> element 
    * @return the current instance of <code>TagType<T></code> 
    */
   public TagType<T> removeTeiClass()
   {
      childNode.removeChildren("tei-class");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TagType ElementName: javaee:body-contentType ElementType : body-content
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>body-content</code> element
    * @param bodyContent the value for the element <code>body-content</code> 
    * @return the current instance of <code>TagType<T></code> 
    */
   public TagType<T> bodyContent(BodyContentType bodyContent)
   {
      childNode.getOrCreate("body-content").text(bodyContent);
      return this;
   }
   /**
    * Sets the <code>body-content</code> element
    * @param bodyContent the value for the element <code>body-content</code> 
    * @return the current instance of <code>TagType<T></code> 
    */
   public TagType<T> bodyContent(String bodyContent)
   {
      childNode.getOrCreate("body-content").text(bodyContent);
      return this;
   }

   /**
    * Returns the <code>body-content</code> element
    * @return the value found for the element <code>body-content</code> 
    */
   public BodyContentType getBodyContent()
   {
      return BodyContentType.getFromStringValue(childNode.getTextValueForPatternName("body-content"));
   }

   /**
    * Returns the <code>body-content</code> element
    * @return the value found for the element <code>body-content</code> 
    */
   public String  getBodyContentAsString()
   {
      return childNode.getTextValueForPatternName("body-content");
   }

   /**
    * Removes the <code>body-content</code> attribute 
    * @return the current instance of <code>TagType<T></code> 
    */
   public TagType<T> removeBodyContent()
   {
      childNode.removeAttribute("body-content");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TagType ElementName: javaee:variableType ElementType : variable
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>variable</code> element will be created and returned.
    * Otherwise, the first existing <code>variable</code> element will be returned.
    * @return the instance defined for the element <code>variable</code> 
    */
   public VariableType<TagType<T>> getOrCreateVariable()
   {
      List<Node> nodeList = childNode.get("variable");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new VariableTypeImpl<TagType<T>>(this, "variable", childNode, nodeList.get(0));
      }
      return createVariable();
   }

   /**
    * Creates a new <code>variable</code> element 
    * @return the new created instance of <code>VariableType<TagType<T>></code> 
    */
   public VariableType<TagType<T>> createVariable()
   {
      return new VariableTypeImpl<TagType<T>>(this, "variable", childNode);
   }

   /**
    * Returns all <code>variable</code> elements
    * @return list of <code>variable</code> 
    */
   public List<VariableType<TagType<T>>> getAllVariable()
   {
      List<VariableType<TagType<T>>> list = new ArrayList<VariableType<TagType<T>>>();
      List<Node> nodeList = childNode.get("variable");
      for(Node node: nodeList)
      {
         VariableType<TagType<T>>  type = new VariableTypeImpl<TagType<T>>(this, "variable", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>variable</code> elements 
    * @return the current instance of <code>VariableType<TagType<T>></code> 
    */
   public TagType<T> removeAllVariable()
   {
      childNode.removeChildren("variable");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TagType ElementName: javaee:tld-attributeType ElementType : attribute
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>attribute</code> element will be created and returned.
    * Otherwise, the first existing <code>attribute</code> element will be returned.
    * @return the instance defined for the element <code>attribute</code> 
    */
   public TldAttributeType<TagType<T>> getOrCreateAttribute()
   {
      List<Node> nodeList = childNode.get("attribute");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new TldAttributeTypeImpl<TagType<T>>(this, "attribute", childNode, nodeList.get(0));
      }
      return createAttribute();
   }

   /**
    * Creates a new <code>attribute</code> element 
    * @return the new created instance of <code>TldAttributeType<TagType<T>></code> 
    */
   public TldAttributeType<TagType<T>> createAttribute()
   {
      return new TldAttributeTypeImpl<TagType<T>>(this, "attribute", childNode);
   }

   /**
    * Returns all <code>attribute</code> elements
    * @return list of <code>attribute</code> 
    */
   public List<TldAttributeType<TagType<T>>> getAllAttribute()
   {
      List<TldAttributeType<TagType<T>>> list = new ArrayList<TldAttributeType<TagType<T>>>();
      List<Node> nodeList = childNode.get("attribute");
      for(Node node: nodeList)
      {
         TldAttributeType<TagType<T>>  type = new TldAttributeTypeImpl<TagType<T>>(this, "attribute", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>attribute</code> elements 
    * @return the current instance of <code>TldAttributeType<TagType<T>></code> 
    */
   public TagType<T> removeAllAttribute()
   {
      childNode.removeChildren("attribute");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TagType ElementName: javaee:generic-booleanType ElementType : dynamic-attributes
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>dynamic-attributes</code> element
    * @param dynamicAttributes the value for the element <code>dynamic-attributes</code> 
    * @return the current instance of <code>TagType<T></code> 
    */
   public TagType<T> dynamicAttributes(GenericBooleanType dynamicAttributes)
   {
      childNode.getOrCreate("dynamic-attributes").text(dynamicAttributes);
      return this;
   }
   /**
    * Sets the <code>dynamic-attributes</code> element
    * @param dynamicAttributes the value for the element <code>dynamic-attributes</code> 
    * @return the current instance of <code>TagType<T></code> 
    */
   public TagType<T> dynamicAttributes(String dynamicAttributes)
   {
      childNode.getOrCreate("dynamic-attributes").text(dynamicAttributes);
      return this;
   }

   /**
    * Returns the <code>dynamic-attributes</code> element
    * @return the value found for the element <code>dynamic-attributes</code> 
    */
   public GenericBooleanType getDynamicAttributes()
   {
      return GenericBooleanType.getFromStringValue(childNode.getTextValueForPatternName("dynamic-attributes"));
   }

   /**
    * Returns the <code>dynamic-attributes</code> element
    * @return the value found for the element <code>dynamic-attributes</code> 
    */
   public String  getDynamicAttributesAsString()
   {
      return childNode.getTextValueForPatternName("dynamic-attributes");
   }

   /**
    * Removes the <code>dynamic-attributes</code> attribute 
    * @return the current instance of <code>TagType<T></code> 
    */
   public TagType<T> removeDynamicAttributes()
   {
      childNode.removeAttribute("dynamic-attributes");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TagType ElementName: xsd:string ElementType : example
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>example</code> element
    * @param example the value for the element <code>example</code> 
    * @return the current instance of <code>TagType<T></code> 
    */
   public TagType<T> example(String example)
   {
      childNode.getOrCreate("example").text(example);
      return this;
   }

   /**
    * Returns the <code>example</code> element
    * @return the node defined for the element <code>example</code> 
    */
   public String getExample()
   {
      return childNode.getTextValueForPatternName("example");
   }

   /**
    * Removes the <code>example</code> element 
    * @return the current instance of <code>TagType<T></code> 
    */
   public TagType<T> removeExample()
   {
      childNode.removeChildren("example");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TagType ElementName: javaee:tld-extensionType ElementType : tag-extension
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>tag-extension</code> element will be created and returned.
    * Otherwise, the first existing <code>tag-extension</code> element will be returned.
    * @return the instance defined for the element <code>tag-extension</code> 
    */
   public TldExtensionType<TagType<T>> getOrCreateTagExtension()
   {
      List<Node> nodeList = childNode.get("tag-extension");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new TldExtensionTypeImpl<TagType<T>>(this, "tag-extension", childNode, nodeList.get(0));
      }
      return createTagExtension();
   }

   /**
    * Creates a new <code>tag-extension</code> element 
    * @return the new created instance of <code>TldExtensionType<TagType<T>></code> 
    */
   public TldExtensionType<TagType<T>> createTagExtension()
   {
      return new TldExtensionTypeImpl<TagType<T>>(this, "tag-extension", childNode);
   }

   /**
    * Returns all <code>tag-extension</code> elements
    * @return list of <code>tag-extension</code> 
    */
   public List<TldExtensionType<TagType<T>>> getAllTagExtension()
   {
      List<TldExtensionType<TagType<T>>> list = new ArrayList<TldExtensionType<TagType<T>>>();
      List<Node> nodeList = childNode.get("tag-extension");
      for(Node node: nodeList)
      {
         TldExtensionType<TagType<T>>  type = new TldExtensionTypeImpl<TagType<T>>(this, "tag-extension", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>tag-extension</code> elements 
    * @return the current instance of <code>TldExtensionType<TagType<T>></code> 
    */
   public TagType<T> removeAllTagExtension()
   {
      childNode.removeChildren("tag-extension");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TagType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>TagType<T></code> 
    */
   public TagType<T> id(String id)
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
    * @return the current instance of <code>TagType<T></code> 
    */
   public TagType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
