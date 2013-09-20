package org.jboss.shrinkwrap.descriptor.impl.connector17; 

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

import org.jboss.shrinkwrap.descriptor.api.DescriptorNamespace;
import org.jboss.shrinkwrap.descriptor.api.connector17.ConnectorDescriptor;
import org.jboss.shrinkwrap.descriptor.api.connector17.LicenseType;
import org.jboss.shrinkwrap.descriptor.api.connector17.ResourceadapterType;
import org.jboss.shrinkwrap.descriptor.api.javaee7.IconType;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.impl.javaee7.IconTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.spi.node.NodeDescriptorImplBase;

/** 
 * <p> 
 * This deployment descriptor provides the functionalities as described in the  specification
 * <p> 
 * Example:
 * <p> 
 * <code> 
 *     ConnectorDescriptor descriptor = Descriptors.create(ConnectorDescriptor.class);
 * </code> 
 *
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class ConnectorDescriptorImpl extends NodeDescriptorImplBase implements DescriptorNamespace<ConnectorDescriptor>, ConnectorDescriptor
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private Node model;

   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public ConnectorDescriptorImpl(String descriptorName)
   {
       this(descriptorName, new Node("connector"));
   }

   public ConnectorDescriptorImpl(String descriptorName, Node node)
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
    * @return the current instance of <code>ConnectorDescriptor</code> 
    */
   public ConnectorDescriptor addDefaultNamespaces()
   {
      addNamespace("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
      addNamespace("xsi:schemaLocation", "http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/connector_1_7.xsd");
      addNamespace("xmlns", "http://xmlns.jcp.org/xml/ns/javaee");
     return this;
   }

   /**
    * Adds a new namespace 
    * @return the current instance of <code>ConnectorDescriptor</code> 
    */
   public ConnectorDescriptor addNamespace(String name, String value)
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
    * @return the current instance of <code>ConnectorDescriptor</code> 
    */
   public ConnectorDescriptor removeAllNamespaces()
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
   // ClassName: ConnectorDescriptor ElementName: xsd:token ElementType : module-name
   // MaxOccurs: -  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>module-name</code> element
    * @param moduleName the value for the element <code>module-name</code> 
    * @return the current instance of <code>ConnectorDescriptor</code> 
    */
   public ConnectorDescriptor moduleName(String moduleName)
   {
      model.getOrCreate("module-name").text(moduleName);
      return this;
   }

   /**
    * Returns the <code>module-name</code> element
    * @return the node defined for the element <code>module-name</code> 
    */
   public String getModuleName()
   {
      return model.getTextValueForPatternName("module-name");
   }

   /**
    * Removes the <code>module-name</code> element 
    * @return the current instance of <code>ConnectorDescriptor</code> 
    */
   public ConnectorDescriptor removeModuleName()
   {
      model.removeChildren("module-name");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectorDescriptor ElementName: xsd:string ElementType : vendor-name
   // MaxOccurs: -  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>vendor-name</code> element
    * @param vendorName the value for the element <code>vendor-name</code> 
    * @return the current instance of <code>ConnectorDescriptor</code> 
    */
   public ConnectorDescriptor vendorName(String vendorName)
   {
      model.getOrCreate("vendor-name").text(vendorName);
      return this;
   }

   /**
    * Returns the <code>vendor-name</code> element
    * @return the node defined for the element <code>vendor-name</code> 
    */
   public String getVendorName()
   {
      return model.getTextValueForPatternName("vendor-name");
   }

   /**
    * Removes the <code>vendor-name</code> element 
    * @return the current instance of <code>ConnectorDescriptor</code> 
    */
   public ConnectorDescriptor removeVendorName()
   {
      model.removeChildren("vendor-name");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectorDescriptor ElementName: xsd:string ElementType : eis-type
   // MaxOccurs: -  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>eis-type</code> element
    * @param eisType the value for the element <code>eis-type</code> 
    * @return the current instance of <code>ConnectorDescriptor</code> 
    */
   public ConnectorDescriptor eisType(String eisType)
   {
      model.getOrCreate("eis-type").text(eisType);
      return this;
   }

   /**
    * Returns the <code>eis-type</code> element
    * @return the node defined for the element <code>eis-type</code> 
    */
   public String getEisType()
   {
      return model.getTextValueForPatternName("eis-type");
   }

   /**
    * Removes the <code>eis-type</code> element 
    * @return the current instance of <code>ConnectorDescriptor</code> 
    */
   public ConnectorDescriptor removeEisType()
   {
      model.removeChildren("eis-type");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectorDescriptor ElementName: xsd:string ElementType : resourceadapter-version
   // MaxOccurs: -  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>resourceadapter-version</code> element
    * @param resourceadapterVersion the value for the element <code>resourceadapter-version</code> 
    * @return the current instance of <code>ConnectorDescriptor</code> 
    */
   public ConnectorDescriptor resourceadapterVersion(String resourceadapterVersion)
   {
      model.getOrCreate("resourceadapter-version").text(resourceadapterVersion);
      return this;
   }

   /**
    * Returns the <code>resourceadapter-version</code> element
    * @return the node defined for the element <code>resourceadapter-version</code> 
    */
   public String getResourceadapterVersion()
   {
      return model.getTextValueForPatternName("resourceadapter-version");
   }

   /**
    * Removes the <code>resourceadapter-version</code> element 
    * @return the current instance of <code>ConnectorDescriptor</code> 
    */
   public ConnectorDescriptor removeResourceadapterVersion()
   {
      model.removeChildren("resourceadapter-version");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectorDescriptor ElementName: javaee:licenseType ElementType : license
   // MaxOccurs: -  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>license</code> element with the given value will be created.
    * Otherwise, the existing <code>license</code> element will be returned.
    * @return  a new or existing instance of <code>LicenseType<ConnectorDescriptor></code> 
    */
   public LicenseType<ConnectorDescriptor> getOrCreateLicense()
   {
      Node node = model.getOrCreate("license");
      LicenseType<ConnectorDescriptor> license = new LicenseTypeImpl<ConnectorDescriptor>(this, "license", model, node);
      return license;
   }

   /**
    * Removes the <code>license</code> element 
    * @return the current instance of <code>ConnectorDescriptor</code> 
    */
   public ConnectorDescriptor removeLicense()
   {
      model.removeChildren("license");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectorDescriptor ElementName: javaee:resourceadapterType ElementType : resourceadapter
   // MaxOccurs: -  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>resourceadapter</code> element with the given value will be created.
    * Otherwise, the existing <code>resourceadapter</code> element will be returned.
    * @return  a new or existing instance of <code>ResourceadapterType<ConnectorDescriptor></code> 
    */
   public ResourceadapterType<ConnectorDescriptor> getOrCreateResourceadapter()
   {
      Node node = model.getOrCreate("resourceadapter");
      ResourceadapterType<ConnectorDescriptor> resourceadapter = new ResourceadapterTypeImpl<ConnectorDescriptor>(this, "resourceadapter", model, node);
      return resourceadapter;
   }

   /**
    * Removes the <code>resourceadapter</code> element 
    * @return the current instance of <code>ConnectorDescriptor</code> 
    */
   public ConnectorDescriptor removeResourceadapter()
   {
      model.removeChildren("resourceadapter");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectorDescriptor ElementName: xsd:token ElementType : required-work-context
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>required-work-context</code> elements, 
    * a new <code>required-work-context</code> element 
    * @param values list of <code>required-work-context</code> objects 
    * @return the current instance of <code>ConnectorDescriptor</code> 
    */
   public ConnectorDescriptor requiredWorkContext(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            model.createChild("required-work-context").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>required-work-context</code> elements
    * @return list of <code>required-work-context</code> 
    */
public List<String> getAllRequiredWorkContext()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = model.get("required-work-context");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>required-work-context</code> element 
    * @return the current instance of <code>ConnectorDescriptor</code> 
    */
   public ConnectorDescriptor removeAllRequiredWorkContext()
   {
      model.removeChildren("required-work-context");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectorDescriptor ElementName: xsd:token ElementType : version
   // MaxOccurs: -  isGeneric: false   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of <code>ConnectorDescriptor</code> 
    */
   public ConnectorDescriptor version(String version)
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
    * @return the current instance of <code>ConnectorDescriptor</code> 
    */
   public ConnectorDescriptor removeVersion()
   {
      model.removeAttribute("version");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectorDescriptor ElementName: xsd:boolean ElementType : metadata-complete
   // MaxOccurs: -  isGeneric: false   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>metadata-complete</code> attribute
    * @param metadataComplete the value for the attribute <code>metadata-complete</code> 
    * @return the current instance of <code>ConnectorDescriptor</code> 
    */
   public ConnectorDescriptor metadataComplete(Boolean metadataComplete)
   {
      model.attribute("metadata-complete", metadataComplete);
      return this;
   }

   /**
    * Returns the <code>metadata-complete</code> attribute
    * @return the value defined for the attribute <code>metadata-complete</code> 
    */
   public Boolean isMetadataComplete()
   {
      return Strings.isTrue(model.getAttribute("metadata-complete"));
   }

   /**
    * Removes the <code>metadata-complete</code> attribute 
    * @return the current instance of <code>ConnectorDescriptor</code> 
    */
   public ConnectorDescriptor removeMetadataComplete()
   {
      model.removeAttribute("metadata-complete");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectorDescriptor ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: false   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>ConnectorDescriptor</code> 
    */
   public ConnectorDescriptor id(String id)
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
    * @return the current instance of <code>ConnectorDescriptor</code> 
    */
   public ConnectorDescriptor removeId()
   {
      model.removeAttribute("id");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectorDescriptor ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>ConnectorDescriptor</code> 
    */
   public ConnectorDescriptor description(String ... values)
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
    * @return the current instance of <code>ConnectorDescriptor</code> 
    */
   public ConnectorDescriptor removeAllDescription()
   {
      model.removeChildren("description");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectorDescriptor ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>ConnectorDescriptor</code> 
    */
   public ConnectorDescriptor displayName(String ... values)
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
    * @return the current instance of <code>ConnectorDescriptor</code> 
    */
   public ConnectorDescriptor removeAllDisplayName()
   {
      model.removeChildren("display-name");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectorDescriptor ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<ConnectorDescriptor> getOrCreateIcon()
   {
      List<Node> nodeList = model.get("icon");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new IconTypeImpl<ConnectorDescriptor>(this, "icon", model, nodeList.get(0));
      }
      return createIcon();
   }

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<ConnectorDescriptor></code> 
    */
   public IconType<ConnectorDescriptor> createIcon()
   {
      return new IconTypeImpl<ConnectorDescriptor>(this, "icon", model);
   }

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<ConnectorDescriptor>> getAllIcon()
   {
      List<IconType<ConnectorDescriptor>> list = new ArrayList<IconType<ConnectorDescriptor>>();
      List<Node> nodeList = model.get("icon");
      for(Node node: nodeList)
      {
         IconType<ConnectorDescriptor>  type = new IconTypeImpl<ConnectorDescriptor>(this, "icon", model, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<ConnectorDescriptor></code> 
    */
   public ConnectorDescriptor removeAllIcon()
   {
      model.removeChildren("icon");
      return this;
   }

}
