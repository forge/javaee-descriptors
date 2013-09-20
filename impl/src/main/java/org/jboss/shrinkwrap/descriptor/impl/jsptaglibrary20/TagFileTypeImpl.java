package org.jboss.shrinkwrap.descriptor.impl.jsptaglibrary20; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.jsptaglibrary20.TagFileType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.jsptaglibrary20.TldExtensionType;
import org.jboss.shrinkwrap.descriptor.impl.jsptaglibrary20.TldExtensionTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.j2ee14.IconType;
import org.jboss.shrinkwrap.descriptor.impl.j2ee14.IconTypeImpl;

/**
 * This class implements the <code> tagFileType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class TagFileTypeImpl<T> implements Child<T>, TagFileType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public TagFileTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public TagFileTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TagFileType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>TagFileType<T></code> 
    */
   public TagFileType<T> description(String ... values)
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
    * @return the current instance of <code>TagFileType<T></code> 
    */
   public TagFileType<T> removeAllDescription()
   {
      childNode.removeChildren("description");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TagFileType ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>TagFileType<T></code> 
    */
   public TagFileType<T> displayName(String ... values)
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
    * @return the current instance of <code>TagFileType<T></code> 
    */
   public TagFileType<T> removeAllDisplayName()
   {
      childNode.removeChildren("display-name");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TagFileType ElementName: j2ee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<TagFileType<T>> getOrCreateIcon()
   {
      List<Node> nodeList = childNode.get("icon");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new IconTypeImpl<TagFileType<T>>(this, "icon", childNode, nodeList.get(0));
      }
      return createIcon();
   }

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<TagFileType<T>></code> 
    */
   public IconType<TagFileType<T>> createIcon()
   {
      return new IconTypeImpl<TagFileType<T>>(this, "icon", childNode);
   }

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<TagFileType<T>>> getAllIcon()
   {
      List<IconType<TagFileType<T>>> list = new ArrayList<IconType<TagFileType<T>>>();
      List<Node> nodeList = childNode.get("icon");
      for(Node node: nodeList)
      {
         IconType<TagFileType<T>>  type = new IconTypeImpl<TagFileType<T>>(this, "icon", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<TagFileType<T>></code> 
    */
   public TagFileType<T> removeAllIcon()
   {
      childNode.removeChildren("icon");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TagFileType ElementName: j2ee:xsdNMTOKENType ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> element
    * @param name the value for the element <code>name</code> 
    * @return the current instance of <code>TagFileType<T></code> 
    */
   public TagFileType<T> name(String name)
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
    * @return the current instance of <code>TagFileType<T></code> 
    */
   public TagFileType<T> removeName()
   {
      childNode.removeChildren("name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TagFileType ElementName: xsd:token ElementType : path
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>path</code> element
    * @param path the value for the element <code>path</code> 
    * @return the current instance of <code>TagFileType<T></code> 
    */
   public TagFileType<T> path(String path)
   {
      childNode.getOrCreate("path").text(path);
      return this;
   }

   /**
    * Returns the <code>path</code> element
    * @return the node defined for the element <code>path</code> 
    */
   public String getPath()
   {
      return childNode.getTextValueForPatternName("path");
   }

   /**
    * Removes the <code>path</code> element 
    * @return the current instance of <code>TagFileType<T></code> 
    */
   public TagFileType<T> removePath()
   {
      childNode.removeChildren("path");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TagFileType ElementName: xsd:string ElementType : example
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>example</code> element
    * @param example the value for the element <code>example</code> 
    * @return the current instance of <code>TagFileType<T></code> 
    */
   public TagFileType<T> example(String example)
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
    * @return the current instance of <code>TagFileType<T></code> 
    */
   public TagFileType<T> removeExample()
   {
      childNode.removeChildren("example");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TagFileType ElementName: j2ee:tld-extensionType ElementType : tag-extension
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>tag-extension</code> element will be created and returned.
    * Otherwise, the first existing <code>tag-extension</code> element will be returned.
    * @return the instance defined for the element <code>tag-extension</code> 
    */
   public TldExtensionType<TagFileType<T>> getOrCreateTagExtension()
   {
      List<Node> nodeList = childNode.get("tag-extension");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new TldExtensionTypeImpl<TagFileType<T>>(this, "tag-extension", childNode, nodeList.get(0));
      }
      return createTagExtension();
   }

   /**
    * Creates a new <code>tag-extension</code> element 
    * @return the new created instance of <code>TldExtensionType<TagFileType<T>></code> 
    */
   public TldExtensionType<TagFileType<T>> createTagExtension()
   {
      return new TldExtensionTypeImpl<TagFileType<T>>(this, "tag-extension", childNode);
   }

   /**
    * Returns all <code>tag-extension</code> elements
    * @return list of <code>tag-extension</code> 
    */
   public List<TldExtensionType<TagFileType<T>>> getAllTagExtension()
   {
      List<TldExtensionType<TagFileType<T>>> list = new ArrayList<TldExtensionType<TagFileType<T>>>();
      List<Node> nodeList = childNode.get("tag-extension");
      for(Node node: nodeList)
      {
         TldExtensionType<TagFileType<T>>  type = new TldExtensionTypeImpl<TagFileType<T>>(this, "tag-extension", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>tag-extension</code> elements 
    * @return the current instance of <code>TldExtensionType<TagFileType<T>></code> 
    */
   public TagFileType<T> removeAllTagExtension()
   {
      childNode.removeChildren("tag-extension");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TagFileType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>TagFileType<T></code> 
    */
   public TagFileType<T> id(String id)
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
    * @return the current instance of <code>TagFileType<T></code> 
    */
   public TagFileType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
