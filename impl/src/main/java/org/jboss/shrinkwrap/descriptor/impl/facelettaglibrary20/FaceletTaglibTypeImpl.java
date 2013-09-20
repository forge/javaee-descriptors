package org.jboss.shrinkwrap.descriptor.impl.facelettaglibrary20; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.facelettaglibrary20.FaceletTaglibFunctionType;
import org.jboss.shrinkwrap.descriptor.api.facelettaglibrary20.FaceletTaglibTagType;
import org.jboss.shrinkwrap.descriptor.api.facelettaglibrary20.FaceletTaglibType;
import org.jboss.shrinkwrap.descriptor.api.facelettaglibrary20.FaceletTaglibVersionType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.IconTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> facelet-taglibType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class FaceletTaglibTypeImpl<T> implements Child<T>, FaceletTaglibType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public FaceletTaglibTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public FaceletTaglibTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>FaceletTaglibType<T></code> 
    */
   public FaceletTaglibType<T> description(String ... values)
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
    * @return the current instance of <code>FaceletTaglibType<T></code> 
    */
   public FaceletTaglibType<T> removeAllDescription()
   {
      childNode.removeChildren("description");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibType ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>FaceletTaglibType<T></code> 
    */
   public FaceletTaglibType<T> displayName(String ... values)
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
    * @return the current instance of <code>FaceletTaglibType<T></code> 
    */
   public FaceletTaglibType<T> removeAllDisplayName()
   {
      childNode.removeChildren("display-name");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibType ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<FaceletTaglibType<T>> getOrCreateIcon()
   {
      List<Node> nodeList = childNode.get("icon");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new IconTypeImpl<FaceletTaglibType<T>>(this, "icon", childNode, nodeList.get(0));
      }
      return createIcon();
   }

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<FaceletTaglibType<T>></code> 
    */
   public IconType<FaceletTaglibType<T>> createIcon()
   {
      return new IconTypeImpl<FaceletTaglibType<T>>(this, "icon", childNode);
   }

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<FaceletTaglibType<T>>> getAllIcon()
   {
      List<IconType<FaceletTaglibType<T>>> list = new ArrayList<IconType<FaceletTaglibType<T>>>();
      List<Node> nodeList = childNode.get("icon");
      for(Node node: nodeList)
      {
         IconType<FaceletTaglibType<T>>  type = new IconTypeImpl<FaceletTaglibType<T>>(this, "icon", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<FaceletTaglibType<T>></code> 
    */
   public FaceletTaglibType<T> removeAllIcon()
   {
      childNode.removeChildren("icon");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibType ElementName: xsd:token ElementType : library-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>library-class</code> element
    * @param libraryClass the value for the element <code>library-class</code> 
    * @return the current instance of <code>FaceletTaglibType<T></code> 
    */
   public FaceletTaglibType<T> libraryClass(String libraryClass)
   {
      childNode.getOrCreate("library-class").text(libraryClass);
      return this;
   }

   /**
    * Returns the <code>library-class</code> element
    * @return the node defined for the element <code>library-class</code> 
    */
   public String getLibraryClass()
   {
      return childNode.getTextValueForPatternName("library-class");
   }

   /**
    * Removes the <code>library-class</code> element 
    * @return the current instance of <code>FaceletTaglibType<T></code> 
    */
   public FaceletTaglibType<T> removeLibraryClass()
   {
      childNode.removeChildren("library-class");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibType ElementName: xsd:token ElementType : namespace
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>namespace</code> element
    * @param namespace the value for the element <code>namespace</code> 
    * @return the current instance of <code>FaceletTaglibType<T></code> 
    */
   public FaceletTaglibType<T> namespace(String namespace)
   {
      childNode.getOrCreate("namespace").text(namespace);
      return this;
   }

   /**
    * Returns the <code>namespace</code> element
    * @return the node defined for the element <code>namespace</code> 
    */
   public String getNamespace()
   {
      return childNode.getTextValueForPatternName("namespace");
   }

   /**
    * Removes the <code>namespace</code> element 
    * @return the current instance of <code>FaceletTaglibType<T></code> 
    */
   public FaceletTaglibType<T> removeNamespace()
   {
      childNode.removeChildren("namespace");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibType ElementName: xsd:token ElementType : composite-library-name
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>composite-library-name</code> element
    * @param compositeLibraryName the value for the element <code>composite-library-name</code> 
    * @return the current instance of <code>FaceletTaglibType<T></code> 
    */
   public FaceletTaglibType<T> compositeLibraryName(String compositeLibraryName)
   {
      childNode.getOrCreate("composite-library-name").text(compositeLibraryName);
      return this;
   }

   /**
    * Returns the <code>composite-library-name</code> element
    * @return the node defined for the element <code>composite-library-name</code> 
    */
   public String getCompositeLibraryName()
   {
      return childNode.getTextValueForPatternName("composite-library-name");
   }

   /**
    * Removes the <code>composite-library-name</code> element 
    * @return the current instance of <code>FaceletTaglibType<T></code> 
    */
   public FaceletTaglibType<T> removeCompositeLibraryName()
   {
      childNode.removeChildren("composite-library-name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibType ElementName: javaee:facelet-taglib-tagType ElementType : tag
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>tag</code> element will be created and returned.
    * Otherwise, the first existing <code>tag</code> element will be returned.
    * @return the instance defined for the element <code>tag</code> 
    */
   public FaceletTaglibTagType<FaceletTaglibType<T>> getOrCreateTag()
   {
      List<Node> nodeList = childNode.get("tag");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new FaceletTaglibTagTypeImpl<FaceletTaglibType<T>>(this, "tag", childNode, nodeList.get(0));
      }
      return createTag();
   }

   /**
    * Creates a new <code>tag</code> element 
    * @return the new created instance of <code>FaceletTaglibTagType<FaceletTaglibType<T>></code> 
    */
   public FaceletTaglibTagType<FaceletTaglibType<T>> createTag()
   {
      return new FaceletTaglibTagTypeImpl<FaceletTaglibType<T>>(this, "tag", childNode);
   }

   /**
    * Returns all <code>tag</code> elements
    * @return list of <code>tag</code> 
    */
   public List<FaceletTaglibTagType<FaceletTaglibType<T>>> getAllTag()
   {
      List<FaceletTaglibTagType<FaceletTaglibType<T>>> list = new ArrayList<FaceletTaglibTagType<FaceletTaglibType<T>>>();
      List<Node> nodeList = childNode.get("tag");
      for(Node node: nodeList)
      {
         FaceletTaglibTagType<FaceletTaglibType<T>>  type = new FaceletTaglibTagTypeImpl<FaceletTaglibType<T>>(this, "tag", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>tag</code> elements 
    * @return the current instance of <code>FaceletTaglibTagType<FaceletTaglibType<T>></code> 
    */
   public FaceletTaglibType<T> removeAllTag()
   {
      childNode.removeChildren("tag");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibType ElementName: javaee:facelet-taglib-functionType ElementType : function
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>function</code> element will be created and returned.
    * Otherwise, the first existing <code>function</code> element will be returned.
    * @return the instance defined for the element <code>function</code> 
    */
   public FaceletTaglibFunctionType<FaceletTaglibType<T>> getOrCreateFunction()
   {
      List<Node> nodeList = childNode.get("function");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new FaceletTaglibFunctionTypeImpl<FaceletTaglibType<T>>(this, "function", childNode, nodeList.get(0));
      }
      return createFunction();
   }

   /**
    * Creates a new <code>function</code> element 
    * @return the new created instance of <code>FaceletTaglibFunctionType<FaceletTaglibType<T>></code> 
    */
   public FaceletTaglibFunctionType<FaceletTaglibType<T>> createFunction()
   {
      return new FaceletTaglibFunctionTypeImpl<FaceletTaglibType<T>>(this, "function", childNode);
   }

   /**
    * Returns all <code>function</code> elements
    * @return list of <code>function</code> 
    */
   public List<FaceletTaglibFunctionType<FaceletTaglibType<T>>> getAllFunction()
   {
      List<FaceletTaglibFunctionType<FaceletTaglibType<T>>> list = new ArrayList<FaceletTaglibFunctionType<FaceletTaglibType<T>>>();
      List<Node> nodeList = childNode.get("function");
      for(Node node: nodeList)
      {
         FaceletTaglibFunctionType<FaceletTaglibType<T>>  type = new FaceletTaglibFunctionTypeImpl<FaceletTaglibType<T>>(this, "function", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>function</code> elements 
    * @return the current instance of <code>FaceletTaglibFunctionType<FaceletTaglibType<T>></code> 
    */
   public FaceletTaglibType<T> removeAllFunction()
   {
      childNode.removeChildren("function");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibType ElementName: javaee:facelet-taglib-extensionType ElementType : taglib-extension
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>taglib-extension</code> element 
    * @return the current instance of <code>FaceletTaglibType<T></code> 
    */
   public FaceletTaglibType<T> taglibExtension()
   {
      childNode.getOrCreate("taglib-extension");
      return this;
   }

   /**
    * Removes the <code>taglib-extension</code> element 
    * @return the current instance of <code>FaceletTaglibType<T></code> 
    */
   public Boolean isTaglibExtension()
   {
      return childNode.getSingle("taglib-extension") != null;
   }

   /**
    * Removes the <code>taglib-extension</code> element 
    * @return the current instance of <code>FaceletTaglibType<T></code> 
    */
   public FaceletTaglibType<T> removeTaglibExtension()
   {
      childNode.removeChild("taglib-extension");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>FaceletTaglibType<T></code> 
    */
   public FaceletTaglibType<T> id(String id)
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
    * @return the current instance of <code>FaceletTaglibType<T></code> 
    */
   public FaceletTaglibType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibType ElementName: javaee:facelet-taglib-versionType ElementType : version
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of <code>FaceletTaglibType<T></code> 
    */
   public FaceletTaglibType<T> version(FaceletTaglibVersionType version)
   {
      childNode.attribute("version", version);
      return this;
   }

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of <code>FaceletTaglibType<T></code> 
    */
   public FaceletTaglibType<T> version(String version)
   {
      childNode.attribute("version", version);
      return this;
   }

   /**
    * Returns the <code>version</code> attribute
    * @return the value defined for the attribute <code>version</code> 
    */
   public FaceletTaglibVersionType getVersion()
   {
      return FaceletTaglibVersionType.getFromStringValue(childNode.getAttribute("version"));
   }

   /**
    * Returns the <code>version</code> attribute
    * @return the value found for the element <code>version</code> 
    */
   public String  getVersionAsString()
   {
      return childNode.getAttribute("version");
   }

   /**
    * Removes the <code>version</code> attribute 
    * @return the current instance of <code>FaceletTaglibType<T></code> 
    */
   public FaceletTaglibType<T> removeVersion()
   {
      childNode.removeAttribute("version");
      return this;
   }
}
