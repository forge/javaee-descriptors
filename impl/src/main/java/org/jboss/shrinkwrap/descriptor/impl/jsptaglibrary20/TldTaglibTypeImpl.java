package org.jboss.shrinkwrap.descriptor.impl.jsptaglibrary20; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.j2ee14.IconType;
import org.jboss.shrinkwrap.descriptor.api.j2ee14.ListenerType;
import org.jboss.shrinkwrap.descriptor.api.jsptaglibrary20.FunctionType;
import org.jboss.shrinkwrap.descriptor.api.jsptaglibrary20.TagFileType;
import org.jboss.shrinkwrap.descriptor.api.jsptaglibrary20.TagType;
import org.jboss.shrinkwrap.descriptor.api.jsptaglibrary20.TldExtensionType;
import org.jboss.shrinkwrap.descriptor.api.jsptaglibrary20.TldTaglibType;
import org.jboss.shrinkwrap.descriptor.api.jsptaglibrary20.ValidatorType;
import org.jboss.shrinkwrap.descriptor.impl.j2ee14.IconTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.j2ee14.ListenerTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> tldTaglibType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class TldTaglibTypeImpl<T> implements Child<T>, TldTaglibType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public TldTaglibTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public TldTaglibTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TldTaglibType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>TldTaglibType<T></code> 
    */
   public TldTaglibType<T> description(String ... values)
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
    * @return the current instance of <code>TldTaglibType<T></code> 
    */
   public TldTaglibType<T> removeAllDescription()
   {
      childNode.removeChildren("description");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TldTaglibType ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>TldTaglibType<T></code> 
    */
   public TldTaglibType<T> displayName(String ... values)
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
    * @return the current instance of <code>TldTaglibType<T></code> 
    */
   public TldTaglibType<T> removeAllDisplayName()
   {
      childNode.removeChildren("display-name");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TldTaglibType ElementName: j2ee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<TldTaglibType<T>> getOrCreateIcon()
   {
      List<Node> nodeList = childNode.get("icon");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new IconTypeImpl<TldTaglibType<T>>(this, "icon", childNode, nodeList.get(0));
      }
      return createIcon();
   }

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<TldTaglibType<T>></code> 
    */
   public IconType<TldTaglibType<T>> createIcon()
   {
      return new IconTypeImpl<TldTaglibType<T>>(this, "icon", childNode);
   }

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<TldTaglibType<T>>> getAllIcon()
   {
      List<IconType<TldTaglibType<T>>> list = new ArrayList<IconType<TldTaglibType<T>>>();
      List<Node> nodeList = childNode.get("icon");
      for(Node node: nodeList)
      {
         IconType<TldTaglibType<T>>  type = new IconTypeImpl<TldTaglibType<T>>(this, "icon", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<TldTaglibType<T>></code> 
    */
   public TldTaglibType<T> removeAllIcon()
   {
      childNode.removeChildren("icon");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TldTaglibType ElementName: xsd:decimal ElementType : tlib-version
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>tlib-version</code> element
    * @param tlibVersion the value for the element <code>tlib-version</code> 
    * @return the current instance of <code>TldTaglibType<T></code> 
    */
   public TldTaglibType<T> tlibVersion(String tlibVersion)
   {
      childNode.getOrCreate("tlib-version").text(tlibVersion);
      return this;
   }

   /**
    * Returns the <code>tlib-version</code> element
    * @return the node defined for the element <code>tlib-version</code> 
    */
   public String getTlibVersion()
   {
      return childNode.getTextValueForPatternName("tlib-version");
   }

   /**
    * Removes the <code>tlib-version</code> element 
    * @return the current instance of <code>TldTaglibType<T></code> 
    */
   public TldTaglibType<T> removeTlibVersion()
   {
      childNode.removeChildren("tlib-version");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TldTaglibType ElementName: j2ee:xsdNMTOKENType ElementType : short-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>short-name</code> element
    * @param shortName the value for the element <code>short-name</code> 
    * @return the current instance of <code>TldTaglibType<T></code> 
    */
   public TldTaglibType<T> shortName(String shortName)
   {
      childNode.getOrCreate("short-name").text(shortName);
      return this;
   }

   /**
    * Returns the <code>short-name</code> element
    * @return the node defined for the element <code>short-name</code> 
    */
   public String getShortName()
   {
      return childNode.getTextValueForPatternName("short-name");
   }

   /**
    * Removes the <code>short-name</code> element 
    * @return the current instance of <code>TldTaglibType<T></code> 
    */
   public TldTaglibType<T> removeShortName()
   {
      childNode.removeChildren("short-name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TldTaglibType ElementName: xsd:anyURI ElementType : uri
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>uri</code> element
    * @param uri the value for the element <code>uri</code> 
    * @return the current instance of <code>TldTaglibType<T></code> 
    */
   public TldTaglibType<T> uri(String uri)
   {
      childNode.getOrCreate("uri").text(uri);
      return this;
   }

   /**
    * Returns the <code>uri</code> element
    * @return the node defined for the element <code>uri</code> 
    */
   public String getUri()
   {
      return childNode.getTextValueForPatternName("uri");
   }

   /**
    * Removes the <code>uri</code> element 
    * @return the current instance of <code>TldTaglibType<T></code> 
    */
   public TldTaglibType<T> removeUri()
   {
      childNode.removeChildren("uri");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TldTaglibType ElementName: j2ee:validatorType ElementType : validator
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>validator</code> element with the given value will be created.
    * Otherwise, the existing <code>validator</code> element will be returned.
    * @return  a new or existing instance of <code>ValidatorType<TldTaglibType<T>></code> 
    */
   public ValidatorType<TldTaglibType<T>> getOrCreateValidator()
   {
      Node node = childNode.getOrCreate("validator");
      ValidatorType<TldTaglibType<T>> validator = new ValidatorTypeImpl<TldTaglibType<T>>(this, "validator", childNode, node);
      return validator;
   }

   /**
    * Removes the <code>validator</code> element 
    * @return the current instance of <code>TldTaglibType<T></code> 
    */
   public TldTaglibType<T> removeValidator()
   {
      childNode.removeChildren("validator");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TldTaglibType ElementName: j2ee:listenerType ElementType : listener
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>listener</code> element will be created and returned.
    * Otherwise, the first existing <code>listener</code> element will be returned.
    * @return the instance defined for the element <code>listener</code> 
    */
   public ListenerType<TldTaglibType<T>> getOrCreateListener()
   {
      List<Node> nodeList = childNode.get("listener");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ListenerTypeImpl<TldTaglibType<T>>(this, "listener", childNode, nodeList.get(0));
      }
      return createListener();
   }

   /**
    * Creates a new <code>listener</code> element 
    * @return the new created instance of <code>ListenerType<TldTaglibType<T>></code> 
    */
   public ListenerType<TldTaglibType<T>> createListener()
   {
      return new ListenerTypeImpl<TldTaglibType<T>>(this, "listener", childNode);
   }

   /**
    * Returns all <code>listener</code> elements
    * @return list of <code>listener</code> 
    */
   public List<ListenerType<TldTaglibType<T>>> getAllListener()
   {
      List<ListenerType<TldTaglibType<T>>> list = new ArrayList<ListenerType<TldTaglibType<T>>>();
      List<Node> nodeList = childNode.get("listener");
      for(Node node: nodeList)
      {
         ListenerType<TldTaglibType<T>>  type = new ListenerTypeImpl<TldTaglibType<T>>(this, "listener", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>listener</code> elements 
    * @return the current instance of <code>ListenerType<TldTaglibType<T>></code> 
    */
   public TldTaglibType<T> removeAllListener()
   {
      childNode.removeChildren("listener");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TldTaglibType ElementName: j2ee:tagType ElementType : tag
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>tag</code> element will be created and returned.
    * Otherwise, the first existing <code>tag</code> element will be returned.
    * @return the instance defined for the element <code>tag</code> 
    */
   public TagType<TldTaglibType<T>> getOrCreateTag()
   {
      List<Node> nodeList = childNode.get("tag");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new TagTypeImpl<TldTaglibType<T>>(this, "tag", childNode, nodeList.get(0));
      }
      return createTag();
   }

   /**
    * Creates a new <code>tag</code> element 
    * @return the new created instance of <code>TagType<TldTaglibType<T>></code> 
    */
   public TagType<TldTaglibType<T>> createTag()
   {
      return new TagTypeImpl<TldTaglibType<T>>(this, "tag", childNode);
   }

   /**
    * Returns all <code>tag</code> elements
    * @return list of <code>tag</code> 
    */
   public List<TagType<TldTaglibType<T>>> getAllTag()
   {
      List<TagType<TldTaglibType<T>>> list = new ArrayList<TagType<TldTaglibType<T>>>();
      List<Node> nodeList = childNode.get("tag");
      for(Node node: nodeList)
      {
         TagType<TldTaglibType<T>>  type = new TagTypeImpl<TldTaglibType<T>>(this, "tag", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>tag</code> elements 
    * @return the current instance of <code>TagType<TldTaglibType<T>></code> 
    */
   public TldTaglibType<T> removeAllTag()
   {
      childNode.removeChildren("tag");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TldTaglibType ElementName: j2ee:tagFileType ElementType : tag-file
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>tag-file</code> element will be created and returned.
    * Otherwise, the first existing <code>tag-file</code> element will be returned.
    * @return the instance defined for the element <code>tag-file</code> 
    */
   public TagFileType<TldTaglibType<T>> getOrCreateTagFile()
   {
      List<Node> nodeList = childNode.get("tag-file");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new TagFileTypeImpl<TldTaglibType<T>>(this, "tag-file", childNode, nodeList.get(0));
      }
      return createTagFile();
   }

   /**
    * Creates a new <code>tag-file</code> element 
    * @return the new created instance of <code>TagFileType<TldTaglibType<T>></code> 
    */
   public TagFileType<TldTaglibType<T>> createTagFile()
   {
      return new TagFileTypeImpl<TldTaglibType<T>>(this, "tag-file", childNode);
   }

   /**
    * Returns all <code>tag-file</code> elements
    * @return list of <code>tag-file</code> 
    */
   public List<TagFileType<TldTaglibType<T>>> getAllTagFile()
   {
      List<TagFileType<TldTaglibType<T>>> list = new ArrayList<TagFileType<TldTaglibType<T>>>();
      List<Node> nodeList = childNode.get("tag-file");
      for(Node node: nodeList)
      {
         TagFileType<TldTaglibType<T>>  type = new TagFileTypeImpl<TldTaglibType<T>>(this, "tag-file", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>tag-file</code> elements 
    * @return the current instance of <code>TagFileType<TldTaglibType<T>></code> 
    */
   public TldTaglibType<T> removeAllTagFile()
   {
      childNode.removeChildren("tag-file");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TldTaglibType ElementName: j2ee:functionType ElementType : function
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>function</code> element will be created and returned.
    * Otherwise, the first existing <code>function</code> element will be returned.
    * @return the instance defined for the element <code>function</code> 
    */
   public FunctionType<TldTaglibType<T>> getOrCreateFunction()
   {
      List<Node> nodeList = childNode.get("function");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new FunctionTypeImpl<TldTaglibType<T>>(this, "function", childNode, nodeList.get(0));
      }
      return createFunction();
   }

   /**
    * Creates a new <code>function</code> element 
    * @return the new created instance of <code>FunctionType<TldTaglibType<T>></code> 
    */
   public FunctionType<TldTaglibType<T>> createFunction()
   {
      return new FunctionTypeImpl<TldTaglibType<T>>(this, "function", childNode);
   }

   /**
    * Returns all <code>function</code> elements
    * @return list of <code>function</code> 
    */
   public List<FunctionType<TldTaglibType<T>>> getAllFunction()
   {
      List<FunctionType<TldTaglibType<T>>> list = new ArrayList<FunctionType<TldTaglibType<T>>>();
      List<Node> nodeList = childNode.get("function");
      for(Node node: nodeList)
      {
         FunctionType<TldTaglibType<T>>  type = new FunctionTypeImpl<TldTaglibType<T>>(this, "function", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>function</code> elements 
    * @return the current instance of <code>FunctionType<TldTaglibType<T>></code> 
    */
   public TldTaglibType<T> removeAllFunction()
   {
      childNode.removeChildren("function");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TldTaglibType ElementName: j2ee:tld-extensionType ElementType : taglib-extension
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>taglib-extension</code> element will be created and returned.
    * Otherwise, the first existing <code>taglib-extension</code> element will be returned.
    * @return the instance defined for the element <code>taglib-extension</code> 
    */
   public TldExtensionType<TldTaglibType<T>> getOrCreateTaglibExtension()
   {
      List<Node> nodeList = childNode.get("taglib-extension");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new TldExtensionTypeImpl<TldTaglibType<T>>(this, "taglib-extension", childNode, nodeList.get(0));
      }
      return createTaglibExtension();
   }

   /**
    * Creates a new <code>taglib-extension</code> element 
    * @return the new created instance of <code>TldExtensionType<TldTaglibType<T>></code> 
    */
   public TldExtensionType<TldTaglibType<T>> createTaglibExtension()
   {
      return new TldExtensionTypeImpl<TldTaglibType<T>>(this, "taglib-extension", childNode);
   }

   /**
    * Returns all <code>taglib-extension</code> elements
    * @return list of <code>taglib-extension</code> 
    */
   public List<TldExtensionType<TldTaglibType<T>>> getAllTaglibExtension()
   {
      List<TldExtensionType<TldTaglibType<T>>> list = new ArrayList<TldExtensionType<TldTaglibType<T>>>();
      List<Node> nodeList = childNode.get("taglib-extension");
      for(Node node: nodeList)
      {
         TldExtensionType<TldTaglibType<T>>  type = new TldExtensionTypeImpl<TldTaglibType<T>>(this, "taglib-extension", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>taglib-extension</code> elements 
    * @return the current instance of <code>TldExtensionType<TldTaglibType<T>></code> 
    */
   public TldTaglibType<T> removeAllTaglibExtension()
   {
      childNode.removeChildren("taglib-extension");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TldTaglibType ElementName: xsd:decimal ElementType : version
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of <code>TldTaglibType<T></code> 
    */
   public TldTaglibType<T> version(String version)
   {
      childNode.attribute("version", version);
      return this;
   }

   /**
    * Returns the <code>version</code> attribute
    * @return the value defined for the attribute <code>version</code> 
    */
      public String getVersion()
   {
      return childNode.getAttribute("version");
   }

   /**
    * Removes the <code>version</code> attribute 
    * @return the current instance of <code>TldTaglibType<T></code> 
    */
   public TldTaglibType<T> removeVersion()
   {
      childNode.removeAttribute("version");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TldTaglibType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>TldTaglibType<T></code> 
    */
   public TldTaglibType<T> id(String id)
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
    * @return the current instance of <code>TldTaglibType<T></code> 
    */
   public TldTaglibType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
