package org.jboss.shrinkwrap.descriptor.api.connector10; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.connector10.Icon;
import org.jboss.shrinkwrap.descriptor.api.connector10.License;
import org.jboss.shrinkwrap.descriptor.api.connector10.Resourceadapter;
import org.jboss.shrinkwrap.descriptor.api.Descriptor;
import org.jboss.shrinkwrap.descriptor.api.DescriptorNamespace;

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
public interface ConnectorDescriptor extends Descriptor, DescriptorNamespace<ConnectorDescriptor>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectorDescriptor ElementName: xsd:string ElementType : spec-version
   // MaxOccurs: -  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>spec-version</code> element
    * @param specVersion the value for the element <code>spec-version</code> 
    * @return the current instance of <code>ConnectorDescriptor</code> 
    */
   public ConnectorDescriptor specVersion(String specVersion);

   /**
    * Returns the <code>spec-version</code> element
    * @return the node defined for the element <code>spec-version</code> 
    */
   public String getSpecVersion();

   /**
    * Removes the <code>spec-version</code> element 
    * @return the current instance of <code>ConnectorDescriptor</code> 
    */
   public ConnectorDescriptor removeSpecVersion();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectorDescriptor ElementName: j2ee:icon ElementType : icon
   // MaxOccurs: -  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element with the given value will be created.
    * Otherwise, the existing <code>icon</code> element will be returned.
    * @return  a new or existing instance of <code>Icon<ConnectorDescriptor></code> 
    */
   public Icon<ConnectorDescriptor> getOrCreateIcon();

   /**
    * Removes the <code>icon</code> element 
    * @return the current instance of <code>ConnectorDescriptor</code> 
    */
   public ConnectorDescriptor removeIcon();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectorDescriptor ElementName: xsd:string ElementType : display-name
   // MaxOccurs: -  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>display-name</code> element
    * @param displayName the value for the element <code>display-name</code> 
    * @return the current instance of <code>ConnectorDescriptor</code> 
    */
   public ConnectorDescriptor displayName(String displayName);

   /**
    * Returns the <code>display-name</code> element
    * @return the node defined for the element <code>display-name</code> 
    */
   public String getDisplayName();

   /**
    * Removes the <code>display-name</code> element 
    * @return the current instance of <code>ConnectorDescriptor</code> 
    */
   public ConnectorDescriptor removeDisplayName();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectorDescriptor ElementName: xsd:string ElementType : vendor-name
   // MaxOccurs: -  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>vendor-name</code> element
    * @param vendorName the value for the element <code>vendor-name</code> 
    * @return the current instance of <code>ConnectorDescriptor</code> 
    */
   public ConnectorDescriptor vendorName(String vendorName);

   /**
    * Returns the <code>vendor-name</code> element
    * @return the node defined for the element <code>vendor-name</code> 
    */
   public String getVendorName();

   /**
    * Removes the <code>vendor-name</code> element 
    * @return the current instance of <code>ConnectorDescriptor</code> 
    */
   public ConnectorDescriptor removeVendorName();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectorDescriptor ElementName: xsd:string ElementType : description
   // MaxOccurs: -  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>description</code> element
    * @param description the value for the element <code>description</code> 
    * @return the current instance of <code>ConnectorDescriptor</code> 
    */
   public ConnectorDescriptor description(String description);

   /**
    * Returns the <code>description</code> element
    * @return the node defined for the element <code>description</code> 
    */
   public String getDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>ConnectorDescriptor</code> 
    */
   public ConnectorDescriptor removeDescription();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectorDescriptor ElementName: xsd:string ElementType : eis-type
   // MaxOccurs: -  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>eis-type</code> element
    * @param eisType the value for the element <code>eis-type</code> 
    * @return the current instance of <code>ConnectorDescriptor</code> 
    */
   public ConnectorDescriptor eisType(String eisType);

   /**
    * Returns the <code>eis-type</code> element
    * @return the node defined for the element <code>eis-type</code> 
    */
   public String getEisType();

   /**
    * Removes the <code>eis-type</code> element 
    * @return the current instance of <code>ConnectorDescriptor</code> 
    */
   public ConnectorDescriptor removeEisType();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectorDescriptor ElementName: j2ee:license ElementType : license
   // MaxOccurs: -  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>license</code> element with the given value will be created.
    * Otherwise, the existing <code>license</code> element will be returned.
    * @return  a new or existing instance of <code>License<ConnectorDescriptor></code> 
    */
   public License<ConnectorDescriptor> getOrCreateLicense();

   /**
    * Removes the <code>license</code> element 
    * @return the current instance of <code>ConnectorDescriptor</code> 
    */
   public ConnectorDescriptor removeLicense();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectorDescriptor ElementName: j2ee:resourceadapter ElementType : resourceadapter
   // MaxOccurs: -  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>resourceadapter</code> element with the given value will be created.
    * Otherwise, the existing <code>resourceadapter</code> element will be returned.
    * @return  a new or existing instance of <code>Resourceadapter<ConnectorDescriptor></code> 
    */
   public Resourceadapter<ConnectorDescriptor> getOrCreateResourceadapter();

   /**
    * Removes the <code>resourceadapter</code> element 
    * @return the current instance of <code>ConnectorDescriptor</code> 
    */
   public ConnectorDescriptor removeResourceadapter();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectorDescriptor ElementName: xsd:string ElementType : version
   // MaxOccurs: -  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>version</code> element
    * @param version the value for the element <code>version</code> 
    * @return the current instance of <code>ConnectorDescriptor</code> 
    */
   public ConnectorDescriptor version(String version);

   /**
    * Returns the <code>version</code> element
    * @return the node defined for the element <code>version</code> 
    */
   public String getVersion();

   /**
    * Removes the <code>version</code> element 
    * @return the current instance of <code>ConnectorDescriptor</code> 
    */
   public ConnectorDescriptor removeVersion();
}
