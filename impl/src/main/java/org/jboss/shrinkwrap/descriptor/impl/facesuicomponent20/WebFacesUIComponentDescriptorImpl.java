package org.jboss.shrinkwrap.descriptor.impl.facesuicomponent20; 

import org.jboss.shrinkwrap.descriptor.api.facesuicomponent20.WebFacesUIComponentDescriptor;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.facesuicomponent20.UicomponentAttributeType;
import org.jboss.shrinkwrap.descriptor.impl.facesuicomponent20.UicomponentAttributeTypeImpl;
import java.util.Map.Entry;

import org.jboss.shrinkwrap.descriptor.api.DescriptorNamespace;

import org.jboss.shrinkwrap.descriptor.spi.node.NodeDescriptorImplBase;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/** 
 * <p> 
 * This deployment descriptor provides the functionalities as described in the  specification
 * <p> 
 * Example:
 * <p> 
 * <code> 
 *     WebFacesUIComponentDescriptor descriptor = Descriptors.create(WebFacesUIComponentDescriptor.class);
 * </code> 
 *
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class WebFacesUIComponentDescriptorImpl extends NodeDescriptorImplBase implements DescriptorNamespace<WebFacesUIComponentDescriptor>, WebFacesUIComponentDescriptor
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private Node model;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public WebFacesUIComponentDescriptorImpl(String descriptorName)
   {
       this(descriptorName, new Node("attribute"));
   }

   public WebFacesUIComponentDescriptorImpl(String descriptorName, Node node)
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
    * @return the current instance of <code>WebFacesUIComponentDescriptor</code> 
    */
   public WebFacesUIComponentDescriptor addDefaultNamespaces()
   {
      addNamespace("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
      addNamespace("xsi:schemaLocation", "http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-facesuicomponent_2_0.xsd");
      addNamespace("xmlns", "http://java.sun.com/xml/ns/javaee");
     return this;
   }

   /**
    * Adds a new namespace 
    * @return the current instance of <code>WebFacesUIComponentDescriptor</code> 
    */
   public WebFacesUIComponentDescriptor addNamespace(String name, String value)
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
    * @return the current instance of <code>WebFacesUIComponentDescriptor</code> 
    */
   public WebFacesUIComponentDescriptor removeAllNamespaces()
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
   // ClassName: WebFacesUIComponentDescriptor ElementName: javaee:uicomponent-attributeType ElementType : attribute
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>attribute</code> element will be created and returned.
    * Otherwise, the first existing <code>attribute</code> element will be returned.
    * @return the instance defined for the element <code>attribute</code> 
    */
   public UicomponentAttributeType<WebFacesUIComponentDescriptor> getOrCreateAttribute()
   {
      List<Node> nodeList = model.get("attribute");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new UicomponentAttributeTypeImpl<WebFacesUIComponentDescriptor>(this, "attribute", model, nodeList.get(0));
      }
      return createAttribute();
   }

   /**
    * Creates a new <code>attribute</code> element 
    * @return the new created instance of <code>UicomponentAttributeType<WebFacesUIComponentDescriptor></code> 
    */
   public UicomponentAttributeType<WebFacesUIComponentDescriptor> createAttribute()
   {
      return new UicomponentAttributeTypeImpl<WebFacesUIComponentDescriptor>(this, "attribute", model);
   }

   /**
    * Returns all <code>attribute</code> elements
    * @return list of <code>attribute</code> 
    */
   public List<UicomponentAttributeType<WebFacesUIComponentDescriptor>> getAllAttribute()
   {
      List<UicomponentAttributeType<WebFacesUIComponentDescriptor>> list = new ArrayList<UicomponentAttributeType<WebFacesUIComponentDescriptor>>();
      List<Node> nodeList = model.get("attribute");
      for(Node node: nodeList)
      {
         UicomponentAttributeType<WebFacesUIComponentDescriptor>  type = new UicomponentAttributeTypeImpl<WebFacesUIComponentDescriptor>(this, "attribute", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>attribute</code> elements 
    * @return the current instance of <code>UicomponentAttributeType<WebFacesUIComponentDescriptor></code> 
    */
   public WebFacesUIComponentDescriptor removeAllAttribute()
   {
      model.removeChildren("attribute");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFacesUIComponentDescriptor ElementName: xsd:string ElementType : name
   // MaxOccurs: -  isGeneric: false   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>WebFacesUIComponentDescriptor</code> 
    */
   public WebFacesUIComponentDescriptor name(String name)
   {
      model.attribute("name", name);
      return this;
   }

   /**
    * Returns the <code>name</code> attribute
    * @return the value defined for the attribute <code>name</code> 
    */
      public String getName()
   {
      return model.getAttribute("name");
   }

   /**
    * Removes the <code>name</code> attribute 
    * @return the current instance of <code>WebFacesUIComponentDescriptor</code> 
    */
   public WebFacesUIComponentDescriptor removeName()
   {
      model.removeAttribute("name");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFacesUIComponentDescriptor ElementName: xsd:string ElementType : displayName
   // MaxOccurs: -  isGeneric: false   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>displayName</code> attribute
    * @param displayName the value for the attribute <code>displayName</code> 
    * @return the current instance of <code>WebFacesUIComponentDescriptor</code> 
    */
   public WebFacesUIComponentDescriptor displayName(String displayName)
   {
      model.attribute("displayName", displayName);
      return this;
   }

   /**
    * Returns the <code>displayName</code> attribute
    * @return the value defined for the attribute <code>displayName</code> 
    */
      public String getDisplayName()
   {
      return model.getAttribute("displayName");
   }

   /**
    * Removes the <code>displayName</code> attribute 
    * @return the current instance of <code>WebFacesUIComponentDescriptor</code> 
    */
   public WebFacesUIComponentDescriptor removeDisplayName()
   {
      model.removeAttribute("displayName");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFacesUIComponentDescriptor ElementName: xsd:string ElementType : shortDescription
   // MaxOccurs: -  isGeneric: false   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>shortDescription</code> attribute
    * @param shortDescription the value for the attribute <code>shortDescription</code> 
    * @return the current instance of <code>WebFacesUIComponentDescriptor</code> 
    */
   public WebFacesUIComponentDescriptor shortDescription(String shortDescription)
   {
      model.attribute("shortDescription", shortDescription);
      return this;
   }

   /**
    * Returns the <code>shortDescription</code> attribute
    * @return the value defined for the attribute <code>shortDescription</code> 
    */
      public String getShortDescription()
   {
      return model.getAttribute("shortDescription");
   }

   /**
    * Removes the <code>shortDescription</code> attribute 
    * @return the current instance of <code>WebFacesUIComponentDescriptor</code> 
    */
   public WebFacesUIComponentDescriptor removeShortDescription()
   {
      model.removeAttribute("shortDescription");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFacesUIComponentDescriptor ElementName: xsd:string ElementType : default
   // MaxOccurs: -  isGeneric: false   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>default</code> attribute
    * @param _default the value for the attribute <code>default</code> 
    * @return the current instance of <code>WebFacesUIComponentDescriptor</code> 
    */
   public WebFacesUIComponentDescriptor _default(String _default)
   {
      model.attribute("default", _default);
      return this;
   }

   /**
    * Returns the <code>default</code> attribute
    * @return the value defined for the attribute <code>default</code> 
    */
      public String get_Default()
   {
      return model.getAttribute("default");
   }

   /**
    * Removes the <code>default</code> attribute 
    * @return the current instance of <code>WebFacesUIComponentDescriptor</code> 
    */
   public WebFacesUIComponentDescriptor remove_Default()
   {
      model.removeAttribute("default");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFacesUIComponentDescriptor ElementName: xsd:string ElementType : method-signature
   // MaxOccurs: -  isGeneric: false   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>method-signature</code> attribute
    * @param methodSignature the value for the attribute <code>method-signature</code> 
    * @return the current instance of <code>WebFacesUIComponentDescriptor</code> 
    */
   public WebFacesUIComponentDescriptor methodSignature(String methodSignature)
   {
      model.attribute("method-signature", methodSignature);
      return this;
   }

   /**
    * Returns the <code>method-signature</code> attribute
    * @return the value defined for the attribute <code>method-signature</code> 
    */
      public String getMethodSignature()
   {
      return model.getAttribute("method-signature");
   }

   /**
    * Removes the <code>method-signature</code> attribute 
    * @return the current instance of <code>WebFacesUIComponentDescriptor</code> 
    */
   public WebFacesUIComponentDescriptor removeMethodSignature()
   {
      model.removeAttribute("method-signature");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFacesUIComponentDescriptor ElementName: xsd:string ElementType : applyTo
   // MaxOccurs: -  isGeneric: false   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>applyTo</code> attribute
    * @param applyTo the value for the attribute <code>applyTo</code> 
    * @return the current instance of <code>WebFacesUIComponentDescriptor</code> 
    */
   public WebFacesUIComponentDescriptor applyTo(String applyTo)
   {
      model.attribute("applyTo", applyTo);
      return this;
   }

   /**
    * Returns the <code>applyTo</code> attribute
    * @return the value defined for the attribute <code>applyTo</code> 
    */
      public String getApplyTo()
   {
      return model.getAttribute("applyTo");
   }

   /**
    * Removes the <code>applyTo</code> attribute 
    * @return the current instance of <code>WebFacesUIComponentDescriptor</code> 
    */
   public WebFacesUIComponentDescriptor removeApplyTo()
   {
      model.removeAttribute("applyTo");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFacesUIComponentDescriptor ElementName: xsd:boolean ElementType : required
   // MaxOccurs: -  isGeneric: false   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>required</code> attribute
    * @param required the value for the attribute <code>required</code> 
    * @return the current instance of <code>WebFacesUIComponentDescriptor</code> 
    */
   public WebFacesUIComponentDescriptor required(Boolean required)
   {
      model.attribute("required", required);
      return this;
   }

   /**
    * Returns the <code>required</code> attribute
    * @return the value defined for the attribute <code>required</code> 
    */
   public Boolean isRequired()
   {
      return Strings.isTrue(model.getAttribute("required"));
   }

   /**
    * Removes the <code>required</code> attribute 
    * @return the current instance of <code>WebFacesUIComponentDescriptor</code> 
    */
   public WebFacesUIComponentDescriptor removeRequired()
   {
      model.removeAttribute("required");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFacesUIComponentDescriptor ElementName: xsd:boolean ElementType : preferred
   // MaxOccurs: -  isGeneric: false   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>preferred</code> attribute
    * @param preferred the value for the attribute <code>preferred</code> 
    * @return the current instance of <code>WebFacesUIComponentDescriptor</code> 
    */
   public WebFacesUIComponentDescriptor preferred(Boolean preferred)
   {
      model.attribute("preferred", preferred);
      return this;
   }

   /**
    * Returns the <code>preferred</code> attribute
    * @return the value defined for the attribute <code>preferred</code> 
    */
   public Boolean isPreferred()
   {
      return Strings.isTrue(model.getAttribute("preferred"));
   }

   /**
    * Removes the <code>preferred</code> attribute 
    * @return the current instance of <code>WebFacesUIComponentDescriptor</code> 
    */
   public WebFacesUIComponentDescriptor removePreferred()
   {
      model.removeAttribute("preferred");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFacesUIComponentDescriptor ElementName: xsd:boolean ElementType : expert
   // MaxOccurs: -  isGeneric: false   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>expert</code> attribute
    * @param expert the value for the attribute <code>expert</code> 
    * @return the current instance of <code>WebFacesUIComponentDescriptor</code> 
    */
   public WebFacesUIComponentDescriptor expert(Boolean expert)
   {
      model.attribute("expert", expert);
      return this;
   }

   /**
    * Returns the <code>expert</code> attribute
    * @return the value defined for the attribute <code>expert</code> 
    */
   public Boolean isExpert()
   {
      return Strings.isTrue(model.getAttribute("expert"));
   }

   /**
    * Removes the <code>expert</code> attribute 
    * @return the current instance of <code>WebFacesUIComponentDescriptor</code> 
    */
   public WebFacesUIComponentDescriptor removeExpert()
   {
      model.removeAttribute("expert");
      return this;
   }

}
