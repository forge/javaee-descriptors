package org.jboss.shrinkwrap.descriptor.impl.jsptaglibrary20; 

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

import org.jboss.shrinkwrap.descriptor.api.DescriptorNamespace;
import org.jboss.shrinkwrap.descriptor.api.j2ee14.IconType;
import org.jboss.shrinkwrap.descriptor.api.j2ee14.ListenerType;
import org.jboss.shrinkwrap.descriptor.api.jsptaglibrary20.FunctionType;
import org.jboss.shrinkwrap.descriptor.api.jsptaglibrary20.TagFileType;
import org.jboss.shrinkwrap.descriptor.api.jsptaglibrary20.TagType;
import org.jboss.shrinkwrap.descriptor.api.jsptaglibrary20.TldExtensionType;
import org.jboss.shrinkwrap.descriptor.api.jsptaglibrary20.ValidatorType;
import org.jboss.shrinkwrap.descriptor.api.jsptaglibrary20.WebJsptaglibraryDescriptor;
import org.jboss.shrinkwrap.descriptor.impl.j2ee14.IconTypeImpl;
import org.jboss.shrinkwrap.descriptor.impl.j2ee14.ListenerTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.spi.node.NodeDescriptorImplBase;

/** 
 * <p> 
 * This deployment descriptor provides the functionalities as described in the  specification
 * <p> 
 * Example:
 * <p> 
 * <code> 
 *     WebJsptaglibraryDescriptor descriptor = Descriptors.create(WebJsptaglibraryDescriptor.class);
 * </code> 
 *
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class WebJsptaglibraryDescriptorImpl extends NodeDescriptorImplBase implements DescriptorNamespace<WebJsptaglibraryDescriptor>, WebJsptaglibraryDescriptor
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private Node model;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public WebJsptaglibraryDescriptorImpl(String descriptorName)
   {
       this(descriptorName, new Node("taglib"));
   }

   public WebJsptaglibraryDescriptorImpl(String descriptorName, Node node)
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
    * @return the current instance of <code>WebJsptaglibraryDescriptor</code> 
    */
   public WebJsptaglibraryDescriptor addDefaultNamespaces()
   {
      addNamespace("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
      addNamespace("xsi:schemaLocation", "http://java.sun.com/xml/ns/j2ee http://java.sun.com/xml/ns/j2ee/web-jsptaglibrary_2_0.xsd");
      addNamespace("xmlns", "http://java.sun.com/xml/ns/j2ee");
     return this;
   }

   /**
    * Adds a new namespace 
    * @return the current instance of <code>WebJsptaglibraryDescriptor</code> 
    */
   public WebJsptaglibraryDescriptor addNamespace(String name, String value)
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
    * @return the current instance of <code>WebJsptaglibraryDescriptor</code> 
    */
   public WebJsptaglibraryDescriptor removeAllNamespaces()
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
   // ClassName: WebJsptaglibraryDescriptor ElementName: xsd:decimal ElementType : tlib-version
   // MaxOccurs: -  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>tlib-version</code> element
    * @param tlibVersion the value for the element <code>tlib-version</code> 
    * @return the current instance of <code>WebJsptaglibraryDescriptor</code> 
    */
   public WebJsptaglibraryDescriptor tlibVersion(String tlibVersion)
   {
      model.getOrCreate("tlib-version").text(tlibVersion);
      return this;
   }

   /**
    * Returns the <code>tlib-version</code> element
    * @return the node defined for the element <code>tlib-version</code> 
    */
   public String getTlibVersion()
   {
      return model.getTextValueForPatternName("tlib-version");
   }

   /**
    * Removes the <code>tlib-version</code> element 
    * @return the current instance of <code>WebJsptaglibraryDescriptor</code> 
    */
   public WebJsptaglibraryDescriptor removeTlibVersion()
   {
      model.removeChildren("tlib-version");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebJsptaglibraryDescriptor ElementName: j2ee:xsdNMTOKENType ElementType : short-name
   // MaxOccurs: -  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>short-name</code> element
    * @param shortName the value for the element <code>short-name</code> 
    * @return the current instance of <code>WebJsptaglibraryDescriptor</code> 
    */
   public WebJsptaglibraryDescriptor shortName(String shortName)
   {
      model.getOrCreate("short-name").text(shortName);
      return this;
   }

   /**
    * Returns the <code>short-name</code> element
    * @return the node defined for the element <code>short-name</code> 
    */
   public String getShortName()
   {
      return model.getTextValueForPatternName("short-name");
   }

   /**
    * Removes the <code>short-name</code> element 
    * @return the current instance of <code>WebJsptaglibraryDescriptor</code> 
    */
   public WebJsptaglibraryDescriptor removeShortName()
   {
      model.removeChildren("short-name");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebJsptaglibraryDescriptor ElementName: xsd:anyURI ElementType : uri
   // MaxOccurs: -  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>uri</code> element
    * @param uri the value for the element <code>uri</code> 
    * @return the current instance of <code>WebJsptaglibraryDescriptor</code> 
    */
   public WebJsptaglibraryDescriptor uri(String uri)
   {
      model.getOrCreate("uri").text(uri);
      return this;
   }

   /**
    * Returns the <code>uri</code> element
    * @return the node defined for the element <code>uri</code> 
    */
   public String getUri()
   {
      return model.getTextValueForPatternName("uri");
   }

   /**
    * Removes the <code>uri</code> element 
    * @return the current instance of <code>WebJsptaglibraryDescriptor</code> 
    */
   public WebJsptaglibraryDescriptor removeUri()
   {
      model.removeChildren("uri");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebJsptaglibraryDescriptor ElementName: j2ee:validatorType ElementType : validator
   // MaxOccurs: -  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>validator</code> element with the given value will be created.
    * Otherwise, the existing <code>validator</code> element will be returned.
    * @return  a new or existing instance of <code>ValidatorType<WebJsptaglibraryDescriptor></code> 
    */
   public ValidatorType<WebJsptaglibraryDescriptor> getOrCreateValidator()
   {
      Node node = model.getOrCreate("validator");
      ValidatorType<WebJsptaglibraryDescriptor> validator = new ValidatorTypeImpl<WebJsptaglibraryDescriptor>(this, "validator", model, node);
      return validator;
   }

   /**
    * Removes the <code>validator</code> element 
    * @return the current instance of <code>WebJsptaglibraryDescriptor</code> 
    */
   public WebJsptaglibraryDescriptor removeValidator()
   {
      model.removeChildren("validator");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebJsptaglibraryDescriptor ElementName: j2ee:listenerType ElementType : listener
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>listener</code> element will be created and returned.
    * Otherwise, the first existing <code>listener</code> element will be returned.
    * @return the instance defined for the element <code>listener</code> 
    */
   public ListenerType<WebJsptaglibraryDescriptor> getOrCreateListener()
   {
      List<Node> nodeList = model.get("listener");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ListenerTypeImpl<WebJsptaglibraryDescriptor>(this, "listener", model, nodeList.get(0));
      }
      return createListener();
   }

   /**
    * Creates a new <code>listener</code> element 
    * @return the new created instance of <code>ListenerType<WebJsptaglibraryDescriptor></code> 
    */
   public ListenerType<WebJsptaglibraryDescriptor> createListener()
   {
      return new ListenerTypeImpl<WebJsptaglibraryDescriptor>(this, "listener", model);
   }

   /**
    * Returns all <code>listener</code> elements
    * @return list of <code>listener</code> 
    */
   public List<ListenerType<WebJsptaglibraryDescriptor>> getAllListener()
   {
      List<ListenerType<WebJsptaglibraryDescriptor>> list = new ArrayList<ListenerType<WebJsptaglibraryDescriptor>>();
      List<Node> nodeList = model.get("listener");
      for(Node node: nodeList)
      {
         ListenerType<WebJsptaglibraryDescriptor>  type = new ListenerTypeImpl<WebJsptaglibraryDescriptor>(this, "listener", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>listener</code> elements 
    * @return the current instance of <code>ListenerType<WebJsptaglibraryDescriptor></code> 
    */
   public WebJsptaglibraryDescriptor removeAllListener()
   {
      model.removeChildren("listener");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebJsptaglibraryDescriptor ElementName: j2ee:tagType ElementType : tag
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>tag</code> element will be created and returned.
    * Otherwise, the first existing <code>tag</code> element will be returned.
    * @return the instance defined for the element <code>tag</code> 
    */
   public TagType<WebJsptaglibraryDescriptor> getOrCreateTag()
   {
      List<Node> nodeList = model.get("tag");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new TagTypeImpl<WebJsptaglibraryDescriptor>(this, "tag", model, nodeList.get(0));
      }
      return createTag();
   }

   /**
    * Creates a new <code>tag</code> element 
    * @return the new created instance of <code>TagType<WebJsptaglibraryDescriptor></code> 
    */
   public TagType<WebJsptaglibraryDescriptor> createTag()
   {
      return new TagTypeImpl<WebJsptaglibraryDescriptor>(this, "tag", model);
   }

   /**
    * Returns all <code>tag</code> elements
    * @return list of <code>tag</code> 
    */
   public List<TagType<WebJsptaglibraryDescriptor>> getAllTag()
   {
      List<TagType<WebJsptaglibraryDescriptor>> list = new ArrayList<TagType<WebJsptaglibraryDescriptor>>();
      List<Node> nodeList = model.get("tag");
      for(Node node: nodeList)
      {
         TagType<WebJsptaglibraryDescriptor>  type = new TagTypeImpl<WebJsptaglibraryDescriptor>(this, "tag", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>tag</code> elements 
    * @return the current instance of <code>TagType<WebJsptaglibraryDescriptor></code> 
    */
   public WebJsptaglibraryDescriptor removeAllTag()
   {
      model.removeChildren("tag");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebJsptaglibraryDescriptor ElementName: j2ee:tagFileType ElementType : tag-file
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>tag-file</code> element will be created and returned.
    * Otherwise, the first existing <code>tag-file</code> element will be returned.
    * @return the instance defined for the element <code>tag-file</code> 
    */
   public TagFileType<WebJsptaglibraryDescriptor> getOrCreateTagFile()
   {
      List<Node> nodeList = model.get("tag-file");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new TagFileTypeImpl<WebJsptaglibraryDescriptor>(this, "tag-file", model, nodeList.get(0));
      }
      return createTagFile();
   }

   /**
    * Creates a new <code>tag-file</code> element 
    * @return the new created instance of <code>TagFileType<WebJsptaglibraryDescriptor></code> 
    */
   public TagFileType<WebJsptaglibraryDescriptor> createTagFile()
   {
      return new TagFileTypeImpl<WebJsptaglibraryDescriptor>(this, "tag-file", model);
   }

   /**
    * Returns all <code>tag-file</code> elements
    * @return list of <code>tag-file</code> 
    */
   public List<TagFileType<WebJsptaglibraryDescriptor>> getAllTagFile()
   {
      List<TagFileType<WebJsptaglibraryDescriptor>> list = new ArrayList<TagFileType<WebJsptaglibraryDescriptor>>();
      List<Node> nodeList = model.get("tag-file");
      for(Node node: nodeList)
      {
         TagFileType<WebJsptaglibraryDescriptor>  type = new TagFileTypeImpl<WebJsptaglibraryDescriptor>(this, "tag-file", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>tag-file</code> elements 
    * @return the current instance of <code>TagFileType<WebJsptaglibraryDescriptor></code> 
    */
   public WebJsptaglibraryDescriptor removeAllTagFile()
   {
      model.removeChildren("tag-file");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebJsptaglibraryDescriptor ElementName: j2ee:functionType ElementType : function
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>function</code> element will be created and returned.
    * Otherwise, the first existing <code>function</code> element will be returned.
    * @return the instance defined for the element <code>function</code> 
    */
   public FunctionType<WebJsptaglibraryDescriptor> getOrCreateFunction()
   {
      List<Node> nodeList = model.get("function");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new FunctionTypeImpl<WebJsptaglibraryDescriptor>(this, "function", model, nodeList.get(0));
      }
      return createFunction();
   }

   /**
    * Creates a new <code>function</code> element 
    * @return the new created instance of <code>FunctionType<WebJsptaglibraryDescriptor></code> 
    */
   public FunctionType<WebJsptaglibraryDescriptor> createFunction()
   {
      return new FunctionTypeImpl<WebJsptaglibraryDescriptor>(this, "function", model);
   }

   /**
    * Returns all <code>function</code> elements
    * @return list of <code>function</code> 
    */
   public List<FunctionType<WebJsptaglibraryDescriptor>> getAllFunction()
   {
      List<FunctionType<WebJsptaglibraryDescriptor>> list = new ArrayList<FunctionType<WebJsptaglibraryDescriptor>>();
      List<Node> nodeList = model.get("function");
      for(Node node: nodeList)
      {
         FunctionType<WebJsptaglibraryDescriptor>  type = new FunctionTypeImpl<WebJsptaglibraryDescriptor>(this, "function", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>function</code> elements 
    * @return the current instance of <code>FunctionType<WebJsptaglibraryDescriptor></code> 
    */
   public WebJsptaglibraryDescriptor removeAllFunction()
   {
      model.removeChildren("function");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebJsptaglibraryDescriptor ElementName: j2ee:tld-extensionType ElementType : taglib-extension
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>taglib-extension</code> element will be created and returned.
    * Otherwise, the first existing <code>taglib-extension</code> element will be returned.
    * @return the instance defined for the element <code>taglib-extension</code> 
    */
   public TldExtensionType<WebJsptaglibraryDescriptor> getOrCreateTaglibExtension()
   {
      List<Node> nodeList = model.get("taglib-extension");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new TldExtensionTypeImpl<WebJsptaglibraryDescriptor>(this, "taglib-extension", model, nodeList.get(0));
      }
      return createTaglibExtension();
   }

   /**
    * Creates a new <code>taglib-extension</code> element 
    * @return the new created instance of <code>TldExtensionType<WebJsptaglibraryDescriptor></code> 
    */
   public TldExtensionType<WebJsptaglibraryDescriptor> createTaglibExtension()
   {
      return new TldExtensionTypeImpl<WebJsptaglibraryDescriptor>(this, "taglib-extension", model);
   }

   /**
    * Returns all <code>taglib-extension</code> elements
    * @return list of <code>taglib-extension</code> 
    */
   public List<TldExtensionType<WebJsptaglibraryDescriptor>> getAllTaglibExtension()
   {
      List<TldExtensionType<WebJsptaglibraryDescriptor>> list = new ArrayList<TldExtensionType<WebJsptaglibraryDescriptor>>();
      List<Node> nodeList = model.get("taglib-extension");
      for(Node node: nodeList)
      {
         TldExtensionType<WebJsptaglibraryDescriptor>  type = new TldExtensionTypeImpl<WebJsptaglibraryDescriptor>(this, "taglib-extension", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>taglib-extension</code> elements 
    * @return the current instance of <code>TldExtensionType<WebJsptaglibraryDescriptor></code> 
    */
   public WebJsptaglibraryDescriptor removeAllTaglibExtension()
   {
      model.removeChildren("taglib-extension");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebJsptaglibraryDescriptor ElementName: xsd:decimal ElementType : version
   // MaxOccurs: -  isGeneric: false   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of <code>WebJsptaglibraryDescriptor</code> 
    */
   public WebJsptaglibraryDescriptor version(String version)
   {
      model.attribute("version", version);
      return this;
   }

   /**
    * Returns the <code>version</code> attribute
    * @return the value defined for the attribute <code>version</code> 
    */
      public String getVersion()
   {
      return model.getAttribute("version");
   }

   /**
    * Removes the <code>version</code> attribute 
    * @return the current instance of <code>WebJsptaglibraryDescriptor</code> 
    */
   public WebJsptaglibraryDescriptor removeVersion()
   {
      model.removeAttribute("version");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebJsptaglibraryDescriptor ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: false   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>WebJsptaglibraryDescriptor</code> 
    */
   public WebJsptaglibraryDescriptor id(String id)
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
    * @return the current instance of <code>WebJsptaglibraryDescriptor</code> 
    */
   public WebJsptaglibraryDescriptor removeId()
   {
      model.removeAttribute("id");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebJsptaglibraryDescriptor ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>WebJsptaglibraryDescriptor</code> 
    */
   public WebJsptaglibraryDescriptor description(String ... values)
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
    * @return the current instance of <code>WebJsptaglibraryDescriptor</code> 
    */
   public WebJsptaglibraryDescriptor removeAllDescription()
   {
      model.removeChildren("description");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebJsptaglibraryDescriptor ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>WebJsptaglibraryDescriptor</code> 
    */
   public WebJsptaglibraryDescriptor displayName(String ... values)
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
    * @return the current instance of <code>WebJsptaglibraryDescriptor</code> 
    */
   public WebJsptaglibraryDescriptor removeAllDisplayName()
   {
      model.removeChildren("display-name");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebJsptaglibraryDescriptor ElementName: j2ee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<WebJsptaglibraryDescriptor> getOrCreateIcon()
   {
      List<Node> nodeList = model.get("icon");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new IconTypeImpl<WebJsptaglibraryDescriptor>(this, "icon", model, nodeList.get(0));
      }
      return createIcon();
   }

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<WebJsptaglibraryDescriptor></code> 
    */
   public IconType<WebJsptaglibraryDescriptor> createIcon()
   {
      return new IconTypeImpl<WebJsptaglibraryDescriptor>(this, "icon", model);
   }

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<WebJsptaglibraryDescriptor>> getAllIcon()
   {
      List<IconType<WebJsptaglibraryDescriptor>> list = new ArrayList<IconType<WebJsptaglibraryDescriptor>>();
      List<Node> nodeList = model.get("icon");
      for(Node node: nodeList)
      {
         IconType<WebJsptaglibraryDescriptor>  type = new IconTypeImpl<WebJsptaglibraryDescriptor>(this, "icon", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<WebJsptaglibraryDescriptor></code> 
    */
   public WebJsptaglibraryDescriptor removeAllIcon()
   {
      model.removeChildren("icon");
      return this;
   }

}
