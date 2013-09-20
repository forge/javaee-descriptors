package org.jboss.shrinkwrap.descriptor.impl.connector10; 

import org.jboss.shrinkwrap.descriptor.api.connector10.ConnectorDescriptor;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.connector10.Icon;
import org.jboss.shrinkwrap.descriptor.impl.connector10.IconImpl;
import org.jboss.shrinkwrap.descriptor.api.connector10.License;
import org.jboss.shrinkwrap.descriptor.impl.connector10.LicenseImpl;
import org.jboss.shrinkwrap.descriptor.api.connector10.Resourceadapter;
import org.jboss.shrinkwrap.descriptor.impl.connector10.ResourceadapterImpl;
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
   // ClassName: ConnectorDescriptor ElementName: xsd:string ElementType : spec-version
   // MaxOccurs: -  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>spec-version</code> element
    * @param specVersion the value for the element <code>spec-version</code> 
    * @return the current instance of <code>ConnectorDescriptor</code> 
    */
   public ConnectorDescriptor specVersion(String specVersion)
   {
      model.getOrCreate("spec-version").text(specVersion);
      return this;
   }

   /**
    * Returns the <code>spec-version</code> element
    * @return the node defined for the element <code>spec-version</code> 
    */
   public String getSpecVersion()
   {
      return model.getTextValueForPatternName("spec-version");
   }

   /**
    * Removes the <code>spec-version</code> element 
    * @return the current instance of <code>ConnectorDescriptor</code> 
    */
   public ConnectorDescriptor removeSpecVersion()
   {
      model.removeChildren("spec-version");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectorDescriptor ElementName: j2ee:icon ElementType : icon
   // MaxOccurs: -  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element with the given value will be created.
    * Otherwise, the existing <code>icon</code> element will be returned.
    * @return  a new or existing instance of <code>Icon<ConnectorDescriptor></code> 
    */
   public Icon<ConnectorDescriptor> getOrCreateIcon()
   {
      Node node = model.getOrCreate("icon");
      Icon<ConnectorDescriptor> icon = new IconImpl<ConnectorDescriptor>(this, "icon", model, node);
      return icon;
   }

   /**
    * Removes the <code>icon</code> element 
    * @return the current instance of <code>ConnectorDescriptor</code> 
    */
   public ConnectorDescriptor removeIcon()
   {
      model.removeChildren("icon");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectorDescriptor ElementName: xsd:string ElementType : display-name
   // MaxOccurs: -  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>display-name</code> element
    * @param displayName the value for the element <code>display-name</code> 
    * @return the current instance of <code>ConnectorDescriptor</code> 
    */
   public ConnectorDescriptor displayName(String displayName)
   {
      model.getOrCreate("display-name").text(displayName);
      return this;
   }

   /**
    * Returns the <code>display-name</code> element
    * @return the node defined for the element <code>display-name</code> 
    */
   public String getDisplayName()
   {
      return model.getTextValueForPatternName("display-name");
   }

   /**
    * Removes the <code>display-name</code> element 
    * @return the current instance of <code>ConnectorDescriptor</code> 
    */
   public ConnectorDescriptor removeDisplayName()
   {
      model.removeChildren("display-name");
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
   // ClassName: ConnectorDescriptor ElementName: xsd:string ElementType : description
   // MaxOccurs: -  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>description</code> element
    * @param description the value for the element <code>description</code> 
    * @return the current instance of <code>ConnectorDescriptor</code> 
    */
   public ConnectorDescriptor description(String description)
   {
      model.getOrCreate("description").text(description);
      return this;
   }

   /**
    * Returns the <code>description</code> element
    * @return the node defined for the element <code>description</code> 
    */
   public String getDescription()
   {
      return model.getTextValueForPatternName("description");
   }

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>ConnectorDescriptor</code> 
    */
   public ConnectorDescriptor removeDescription()
   {
      model.removeChildren("description");
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
   // ClassName: ConnectorDescriptor ElementName: j2ee:license ElementType : license
   // MaxOccurs: -  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>license</code> element with the given value will be created.
    * Otherwise, the existing <code>license</code> element will be returned.
    * @return  a new or existing instance of <code>License<ConnectorDescriptor></code> 
    */
   public License<ConnectorDescriptor> getOrCreateLicense()
   {
      Node node = model.getOrCreate("license");
      License<ConnectorDescriptor> license = new LicenseImpl<ConnectorDescriptor>(this, "license", model, node);
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
   // ClassName: ConnectorDescriptor ElementName: j2ee:resourceadapter ElementType : resourceadapter
   // MaxOccurs: -  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>resourceadapter</code> element with the given value will be created.
    * Otherwise, the existing <code>resourceadapter</code> element will be returned.
    * @return  a new or existing instance of <code>Resourceadapter<ConnectorDescriptor></code> 
    */
   public Resourceadapter<ConnectorDescriptor> getOrCreateResourceadapter()
   {
      Node node = model.getOrCreate("resourceadapter");
      Resourceadapter<ConnectorDescriptor> resourceadapter = new ResourceadapterImpl<ConnectorDescriptor>(this, "resourceadapter", model, node);
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
   // ClassName: ConnectorDescriptor ElementName: xsd:string ElementType : version
   // MaxOccurs: -  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>version</code> element
    * @param version the value for the element <code>version</code> 
    * @return the current instance of <code>ConnectorDescriptor</code> 
    */
   public ConnectorDescriptor version(String version)
   {
      model.getOrCreate("version").text(version);
      return this;
   }

   /**
    * Returns the <code>version</code> element
    * @return the node defined for the element <code>version</code> 
    */
   public String getVersion()
   {
      return model.getTextValueForPatternName("version");
   }

   /**
    * Removes the <code>version</code> element 
    * @return the current instance of <code>ConnectorDescriptor</code> 
    */
   public ConnectorDescriptor removeVersion()
   {
      model.removeChildren("version");
      return this;
   }

}
