package org.jboss.shrinkwrap.descriptor.impl.connector10; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.connector10.Connector;
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

/**
 * This class implements the <code> connector </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class ConnectorImpl<T> implements Child<T>, Connector<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public ConnectorImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public ConnectorImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Connector ElementName: xsd:string ElementType : spec-version
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>spec-version</code> element
    * @param specVersion the value for the element <code>spec-version</code> 
    * @return the current instance of <code>Connector<T></code> 
    */
   public Connector<T> specVersion(String specVersion)
   {
      childNode.getOrCreate("spec-version").text(specVersion);
      return this;
   }

   /**
    * Returns the <code>spec-version</code> element
    * @return the node defined for the element <code>spec-version</code> 
    */
   public String getSpecVersion()
   {
      return childNode.getTextValueForPatternName("spec-version");
   }

   /**
    * Removes the <code>spec-version</code> element 
    * @return the current instance of <code>Connector<T></code> 
    */
   public Connector<T> removeSpecVersion()
   {
      childNode.removeChildren("spec-version");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Connector ElementName: j2ee:icon ElementType : icon
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element with the given value will be created.
    * Otherwise, the existing <code>icon</code> element will be returned.
    * @return  a new or existing instance of <code>Icon<Connector<T>></code> 
    */
   public Icon<Connector<T>> getOrCreateIcon()
   {
      Node node = childNode.getOrCreate("icon");
      Icon<Connector<T>> icon = new IconImpl<Connector<T>>(this, "icon", childNode, node);
      return icon;
   }

   /**
    * Removes the <code>icon</code> element 
    * @return the current instance of <code>Connector<T></code> 
    */
   public Connector<T> removeIcon()
   {
      childNode.removeChildren("icon");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Connector ElementName: xsd:string ElementType : display-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>display-name</code> element
    * @param displayName the value for the element <code>display-name</code> 
    * @return the current instance of <code>Connector<T></code> 
    */
   public Connector<T> displayName(String displayName)
   {
      childNode.getOrCreate("display-name").text(displayName);
      return this;
   }

   /**
    * Returns the <code>display-name</code> element
    * @return the node defined for the element <code>display-name</code> 
    */
   public String getDisplayName()
   {
      return childNode.getTextValueForPatternName("display-name");
   }

   /**
    * Removes the <code>display-name</code> element 
    * @return the current instance of <code>Connector<T></code> 
    */
   public Connector<T> removeDisplayName()
   {
      childNode.removeChildren("display-name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Connector ElementName: xsd:string ElementType : vendor-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>vendor-name</code> element
    * @param vendorName the value for the element <code>vendor-name</code> 
    * @return the current instance of <code>Connector<T></code> 
    */
   public Connector<T> vendorName(String vendorName)
   {
      childNode.getOrCreate("vendor-name").text(vendorName);
      return this;
   }

   /**
    * Returns the <code>vendor-name</code> element
    * @return the node defined for the element <code>vendor-name</code> 
    */
   public String getVendorName()
   {
      return childNode.getTextValueForPatternName("vendor-name");
   }

   /**
    * Removes the <code>vendor-name</code> element 
    * @return the current instance of <code>Connector<T></code> 
    */
   public Connector<T> removeVendorName()
   {
      childNode.removeChildren("vendor-name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Connector ElementName: xsd:string ElementType : description
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>description</code> element
    * @param description the value for the element <code>description</code> 
    * @return the current instance of <code>Connector<T></code> 
    */
   public Connector<T> description(String description)
   {
      childNode.getOrCreate("description").text(description);
      return this;
   }

   /**
    * Returns the <code>description</code> element
    * @return the node defined for the element <code>description</code> 
    */
   public String getDescription()
   {
      return childNode.getTextValueForPatternName("description");
   }

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>Connector<T></code> 
    */
   public Connector<T> removeDescription()
   {
      childNode.removeChildren("description");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Connector ElementName: xsd:string ElementType : eis-type
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>eis-type</code> element
    * @param eisType the value for the element <code>eis-type</code> 
    * @return the current instance of <code>Connector<T></code> 
    */
   public Connector<T> eisType(String eisType)
   {
      childNode.getOrCreate("eis-type").text(eisType);
      return this;
   }

   /**
    * Returns the <code>eis-type</code> element
    * @return the node defined for the element <code>eis-type</code> 
    */
   public String getEisType()
   {
      return childNode.getTextValueForPatternName("eis-type");
   }

   /**
    * Removes the <code>eis-type</code> element 
    * @return the current instance of <code>Connector<T></code> 
    */
   public Connector<T> removeEisType()
   {
      childNode.removeChildren("eis-type");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Connector ElementName: j2ee:license ElementType : license
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>license</code> element with the given value will be created.
    * Otherwise, the existing <code>license</code> element will be returned.
    * @return  a new or existing instance of <code>License<Connector<T>></code> 
    */
   public License<Connector<T>> getOrCreateLicense()
   {
      Node node = childNode.getOrCreate("license");
      License<Connector<T>> license = new LicenseImpl<Connector<T>>(this, "license", childNode, node);
      return license;
   }

   /**
    * Removes the <code>license</code> element 
    * @return the current instance of <code>Connector<T></code> 
    */
   public Connector<T> removeLicense()
   {
      childNode.removeChildren("license");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Connector ElementName: j2ee:resourceadapter ElementType : resourceadapter
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>resourceadapter</code> element with the given value will be created.
    * Otherwise, the existing <code>resourceadapter</code> element will be returned.
    * @return  a new or existing instance of <code>Resourceadapter<Connector<T>></code> 
    */
   public Resourceadapter<Connector<T>> getOrCreateResourceadapter()
   {
      Node node = childNode.getOrCreate("resourceadapter");
      Resourceadapter<Connector<T>> resourceadapter = new ResourceadapterImpl<Connector<T>>(this, "resourceadapter", childNode, node);
      return resourceadapter;
   }

   /**
    * Removes the <code>resourceadapter</code> element 
    * @return the current instance of <code>Connector<T></code> 
    */
   public Connector<T> removeResourceadapter()
   {
      childNode.removeChildren("resourceadapter");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Connector ElementName: xsd:string ElementType : version
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>version</code> element
    * @param version the value for the element <code>version</code> 
    * @return the current instance of <code>Connector<T></code> 
    */
   public Connector<T> version(String version)
   {
      childNode.getOrCreate("version").text(version);
      return this;
   }

   /**
    * Returns the <code>version</code> element
    * @return the node defined for the element <code>version</code> 
    */
   public String getVersion()
   {
      return childNode.getTextValueForPatternName("version");
   }

   /**
    * Removes the <code>version</code> element 
    * @return the current instance of <code>Connector<T></code> 
    */
   public Connector<T> removeVersion()
   {
      childNode.removeChildren("version");
      return this;
   }
}
