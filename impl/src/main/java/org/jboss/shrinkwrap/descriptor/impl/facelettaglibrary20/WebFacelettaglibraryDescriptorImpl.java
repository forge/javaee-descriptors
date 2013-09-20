package org.jboss.shrinkwrap.descriptor.impl.facelettaglibrary20; 

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

import org.jboss.shrinkwrap.descriptor.api.DescriptorNamespace;
import org.jboss.shrinkwrap.descriptor.api.facelettaglibrary20.FaceletTaglibFunctionType;
import org.jboss.shrinkwrap.descriptor.api.facelettaglibrary20.FaceletTaglibTagType;
import org.jboss.shrinkwrap.descriptor.api.facelettaglibrary20.FaceletTaglibVersionType;
import org.jboss.shrinkwrap.descriptor.api.facelettaglibrary20.WebFacelettaglibraryDescriptor;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.IconTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.spi.node.NodeDescriptorImplBase;

/** 
 * <p> 
 * This deployment descriptor provides the functionalities as described in the  specification
 * <p> 
 * Example:
 * <p> 
 * <code> 
 *     WebFacelettaglibraryDescriptor descriptor = Descriptors.create(WebFacelettaglibraryDescriptor.class);
 * </code> 
 *
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class WebFacelettaglibraryDescriptorImpl extends NodeDescriptorImplBase implements DescriptorNamespace<WebFacelettaglibraryDescriptor>, WebFacelettaglibraryDescriptor
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private Node model;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public WebFacelettaglibraryDescriptorImpl(String descriptorName)
   {
       this(descriptorName, new Node("facelet-taglib"));
   }

   public WebFacelettaglibraryDescriptorImpl(String descriptorName, Node node)
   {
      super(descriptorName);
      this.model = node;
      addDefaultNamespaces();
   }

   // -------------------------------------------------------------------------------------||
   // Methods 
   // -------------------------------------------------------------------------------------||

   public Node getRootNode()
   {
      return model;
   }



   // -------------------------------------------------------------------------------------||
   // Namespace 
   // -------------------------------------------------------------------------------------||


   /**
    * Adds the default namespaces as defined in the specification 
    * @return the current instance of <code>WebFacelettaglibraryDescriptor</code> 
    */
   public WebFacelettaglibraryDescriptor addDefaultNamespaces()
   {
      addNamespace("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
      addNamespace("xsi:schemaLocation", "http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-facelettaglibrary_2_0.xsd");
      addNamespace("xmlns", "http://java.sun.com/xml/ns/javaee");
     return this;
   }

   /**
    * Adds a new namespace 
    * @return the current instance of <code>WebFacelettaglibraryDescriptor</code> 
    */
   public WebFacelettaglibraryDescriptor addNamespace(String name, String value)
   {
      model.attribute(name, value);
      return this;
   }

   /**
    * Returns all defined namespaces. 
    * @return all defined namespaces 
    */
   public List<String> getNamespaces()
   {
      List<String> namespaceList = new ArrayList<String>();
      java.util.Map<String, String> attributes = model.getAttributes();
      for (Entry<String, String> e : attributes.entrySet())
      {
         final String name = e.getKey();
         final String value = e.getValue();
         if (value != null && value.startsWith("http://")) 
         {
            namespaceList.add(name + "=" + value);
         }
      }
      return namespaceList;
   }

   /**
    * Removes all existing namespaces. 
    * @return the current instance of <code>WebFacelettaglibraryDescriptor</code> 
    */
   public WebFacelettaglibraryDescriptor removeAllNamespaces()
   {
      List<String> nameSpaceKeys = new ArrayList<String>();
      java.util.Map<String, String> attributes = model.getAttributes();
      for (Entry<String, String> e : attributes.entrySet())
      {
         final String name = e.getKey();
         final String value = e.getValue();
         if (value != null && value.startsWith("http://")) 
         {
            nameSpaceKeys.add(name);
         }
      }
      for (String name: nameSpaceKeys)
      {
         model.removeAttribute(name);
      }
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFacelettaglibraryDescriptor ElementName: xsd:token ElementType : library-class
   // MaxOccurs: -  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>library-class</code> element
    * @param libraryClass the value for the element <code>library-class</code> 
    * @return the current instance of <code>WebFacelettaglibraryDescriptor</code> 
    */
   public WebFacelettaglibraryDescriptor libraryClass(String libraryClass)
   {
      model.getOrCreate("library-class").text(libraryClass);
      return this;
   }

   /**
    * Returns the <code>library-class</code> element
    * @return the node defined for the element <code>library-class</code> 
    */
   public String getLibraryClass()
   {
      return model.getTextValueForPatternName("library-class");
   }

   /**
    * Removes the <code>library-class</code> element 
    * @return the current instance of <code>WebFacelettaglibraryDescriptor</code> 
    */
   public WebFacelettaglibraryDescriptor removeLibraryClass()
   {
      model.removeChildren("library-class");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFacelettaglibraryDescriptor ElementName: xsd:token ElementType : namespace
   // MaxOccurs: -  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>namespace</code> element
    * @param namespace the value for the element <code>namespace</code> 
    * @return the current instance of <code>WebFacelettaglibraryDescriptor</code> 
    */
   public WebFacelettaglibraryDescriptor namespace(String namespace)
   {
      model.getOrCreate("namespace").text(namespace);
      return this;
   }

   /**
    * Returns the <code>namespace</code> element
    * @return the node defined for the element <code>namespace</code> 
    */
   public String getNamespace()
   {
      return model.getTextValueForPatternName("namespace");
   }

   /**
    * Removes the <code>namespace</code> element 
    * @return the current instance of <code>WebFacelettaglibraryDescriptor</code> 
    */
   public WebFacelettaglibraryDescriptor removeNamespace()
   {
      model.removeChildren("namespace");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFacelettaglibraryDescriptor ElementName: xsd:token ElementType : composite-library-name
   // MaxOccurs: -1  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>composite-library-name</code> element
    * @param compositeLibraryName the value for the element <code>composite-library-name</code> 
    * @return the current instance of <code>WebFacelettaglibraryDescriptor</code> 
    */
   public WebFacelettaglibraryDescriptor compositeLibraryName(String compositeLibraryName)
   {
      model.getOrCreate("composite-library-name").text(compositeLibraryName);
      return this;
   }

   /**
    * Returns the <code>composite-library-name</code> element
    * @return the node defined for the element <code>composite-library-name</code> 
    */
   public String getCompositeLibraryName()
   {
      return model.getTextValueForPatternName("composite-library-name");
   }

   /**
    * Removes the <code>composite-library-name</code> element 
    * @return the current instance of <code>WebFacelettaglibraryDescriptor</code> 
    */
   public WebFacelettaglibraryDescriptor removeCompositeLibraryName()
   {
      model.removeChildren("composite-library-name");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFacelettaglibraryDescriptor ElementName: javaee:facelet-taglib-tagType ElementType : tag
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>tag</code> element will be created and returned.
    * Otherwise, the first existing <code>tag</code> element will be returned.
    * @return the instance defined for the element <code>tag</code> 
    */
   public FaceletTaglibTagType<WebFacelettaglibraryDescriptor> getOrCreateTag()
   {
      List<Node> nodeList = model.get("tag");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new FaceletTaglibTagTypeImpl<WebFacelettaglibraryDescriptor>(this, "tag", model, nodeList.get(0));
      }
      return createTag();
   }

   /**
    * Creates a new <code>tag</code> element 
    * @return the new created instance of <code>FaceletTaglibTagType<WebFacelettaglibraryDescriptor></code> 
    */
   public FaceletTaglibTagType<WebFacelettaglibraryDescriptor> createTag()
   {
      return new FaceletTaglibTagTypeImpl<WebFacelettaglibraryDescriptor>(this, "tag", model);
   }

   /**
    * Returns all <code>tag</code> elements
    * @return list of <code>tag</code> 
    */
   public List<FaceletTaglibTagType<WebFacelettaglibraryDescriptor>> getAllTag()
   {
      List<FaceletTaglibTagType<WebFacelettaglibraryDescriptor>> list = new ArrayList<FaceletTaglibTagType<WebFacelettaglibraryDescriptor>>();
      List<Node> nodeList = model.get("tag");
      for(Node node: nodeList)
      {
         FaceletTaglibTagType<WebFacelettaglibraryDescriptor>  type = new FaceletTaglibTagTypeImpl<WebFacelettaglibraryDescriptor>(this, "tag", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>tag</code> elements 
    * @return the current instance of <code>FaceletTaglibTagType<WebFacelettaglibraryDescriptor></code> 
    */
   public WebFacelettaglibraryDescriptor removeAllTag()
   {
      model.removeChildren("tag");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFacelettaglibraryDescriptor ElementName: javaee:facelet-taglib-functionType ElementType : function
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>function</code> element will be created and returned.
    * Otherwise, the first existing <code>function</code> element will be returned.
    * @return the instance defined for the element <code>function</code> 
    */
   public FaceletTaglibFunctionType<WebFacelettaglibraryDescriptor> getOrCreateFunction()
   {
      List<Node> nodeList = model.get("function");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new FaceletTaglibFunctionTypeImpl<WebFacelettaglibraryDescriptor>(this, "function", model, nodeList.get(0));
      }
      return createFunction();
   }

   /**
    * Creates a new <code>function</code> element 
    * @return the new created instance of <code>FaceletTaglibFunctionType<WebFacelettaglibraryDescriptor></code> 
    */
   public FaceletTaglibFunctionType<WebFacelettaglibraryDescriptor> createFunction()
   {
      return new FaceletTaglibFunctionTypeImpl<WebFacelettaglibraryDescriptor>(this, "function", model);
   }

   /**
    * Returns all <code>function</code> elements
    * @return list of <code>function</code> 
    */
   public List<FaceletTaglibFunctionType<WebFacelettaglibraryDescriptor>> getAllFunction()
   {
      List<FaceletTaglibFunctionType<WebFacelettaglibraryDescriptor>> list = new ArrayList<FaceletTaglibFunctionType<WebFacelettaglibraryDescriptor>>();
      List<Node> nodeList = model.get("function");
      for(Node node: nodeList)
      {
         FaceletTaglibFunctionType<WebFacelettaglibraryDescriptor>  type = new FaceletTaglibFunctionTypeImpl<WebFacelettaglibraryDescriptor>(this, "function", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>function</code> elements 
    * @return the current instance of <code>FaceletTaglibFunctionType<WebFacelettaglibraryDescriptor></code> 
    */
   public WebFacelettaglibraryDescriptor removeAllFunction()
   {
      model.removeChildren("function");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFacelettaglibraryDescriptor ElementName: javaee:facelet-taglib-extensionType ElementType : taglib-extension
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>taglib-extension</code> element 
    * @return the current instance of <code>WebFacelettaglibraryDescriptor</code> 
    */
   public WebFacelettaglibraryDescriptor taglibExtension()
   {
      model.getOrCreate("taglib-extension");
      return this;
   }

   /**
    * Removes the <code>taglib-extension</code> element 
    * @return the current instance of <code>WebFacelettaglibraryDescriptor</code> 
    */
   public Boolean isTaglibExtension()
   {
      return model.getSingle("taglib-extension") != null;
   }

   /**
    * Removes the <code>taglib-extension</code> element 
    * @return the current instance of <code>WebFacelettaglibraryDescriptor</code> 
    */
   public WebFacelettaglibraryDescriptor removeTaglibExtension()
   {
      model.removeChild("taglib-extension");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFacelettaglibraryDescriptor ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: false   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>WebFacelettaglibraryDescriptor</code> 
    */
   public WebFacelettaglibraryDescriptor id(String id)
   {
      model.attribute("id", id);
      return this;
   }

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
      public String getId()
   {
      return model.getAttribute("id");
   }

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>WebFacelettaglibraryDescriptor</code> 
    */
   public WebFacelettaglibraryDescriptor removeId()
   {
      model.removeAttribute("id");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFacelettaglibraryDescriptor ElementName: javaee:facelet-taglib-versionType ElementType : version
   // MaxOccurs: -  isGeneric: false   isAttribute: true isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of <code>WebFacelettaglibraryDescriptor</code> 
    */
   public WebFacelettaglibraryDescriptor version(FaceletTaglibVersionType version)
   {
      model.attribute("version", version);
      return this;
   }

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of <code>WebFacelettaglibraryDescriptor</code> 
    */
   public WebFacelettaglibraryDescriptor version(String version)
   {
      model.attribute("version", version);
      return this;
   }

   /**
    * Returns the <code>version</code> attribute
    * @return the value defined for the attribute <code>version</code> 
    */
   public FaceletTaglibVersionType getVersion()
   {
      return FaceletTaglibVersionType.getFromStringValue(model.getAttribute("version"));
   }

   /**
    * Returns the <code>version</code> attribute
    * @return the value found for the element <code>version</code> 
    */
   public String  getVersionAsString()
   {
      return model.getAttribute("version");
   }

   /**
    * Removes the <code>version</code> attribute 
    * @return the current instance of <code>WebFacelettaglibraryDescriptor</code> 
    */
   public WebFacelettaglibraryDescriptor removeVersion()
   {
      model.removeAttribute("version");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFacelettaglibraryDescriptor ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>WebFacelettaglibraryDescriptor</code> 
    */
   public WebFacelettaglibraryDescriptor description(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            model.createChild("description").text(name);
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
      List<Node> nodes = model.get("description");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>WebFacelettaglibraryDescriptor</code> 
    */
   public WebFacelettaglibraryDescriptor removeAllDescription()
   {
      model.removeChildren("description");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFacelettaglibraryDescriptor ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>WebFacelettaglibraryDescriptor</code> 
    */
   public WebFacelettaglibraryDescriptor displayName(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            model.createChild("display-name").text(name);
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
      List<Node> nodes = model.get("display-name");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>display-name</code> element 
    * @return the current instance of <code>WebFacelettaglibraryDescriptor</code> 
    */
   public WebFacelettaglibraryDescriptor removeAllDisplayName()
   {
      model.removeChildren("display-name");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFacelettaglibraryDescriptor ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<WebFacelettaglibraryDescriptor> getOrCreateIcon()
   {
      List<Node> nodeList = model.get("icon");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new IconTypeImpl<WebFacelettaglibraryDescriptor>(this, "icon", model, nodeList.get(0));
      }
      return createIcon();
   }

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<WebFacelettaglibraryDescriptor></code> 
    */
   public IconType<WebFacelettaglibraryDescriptor> createIcon()
   {
      return new IconTypeImpl<WebFacelettaglibraryDescriptor>(this, "icon", model);
   }

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<WebFacelettaglibraryDescriptor>> getAllIcon()
   {
      List<IconType<WebFacelettaglibraryDescriptor>> list = new ArrayList<IconType<WebFacelettaglibraryDescriptor>>();
      List<Node> nodeList = model.get("icon");
      for(Node node: nodeList)
      {
         IconType<WebFacelettaglibraryDescriptor>  type = new IconTypeImpl<WebFacelettaglibraryDescriptor>(this, "icon", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<WebFacelettaglibraryDescriptor></code> 
    */
   public WebFacelettaglibraryDescriptor removeAllIcon()
   {
      model.removeChildren("icon");
      return this;
   }

}
