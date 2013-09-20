package org.jboss.shrinkwrap.descriptor.api.connector17; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Descriptor;
import org.jboss.shrinkwrap.descriptor.api.DescriptorNamespace;
import org.jboss.shrinkwrap.descriptor.api.javaee7.IconType;

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
   // ClassName: ConnectorDescriptor ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>ConnectorDescriptor</code> 
    */
   public ConnectorDescriptor description(String ... values);

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>ConnectorDescriptor</code> 
    */
   public ConnectorDescriptor removeAllDescription();
 
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
   public ConnectorDescriptor displayName(String ... values);

   /**
    * Returns all <code>display-name</code> elements
    * @return list of <code>display-name</code> 
    */
   public List<String> getAllDisplayName();

   /**
    * Removes the <code>display-name</code> element 
    * @return the current instance of <code>ConnectorDescriptor</code> 
    */
   public ConnectorDescriptor removeAllDisplayName();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectorDescriptor ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<ConnectorDescriptor> getOrCreateIcon();

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<ConnectorDescriptor></code> 
    */
   public IconType<ConnectorDescriptor> createIcon();

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<ConnectorDescriptor>> getAllIcon();

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<ConnectorDescriptor></code> 
    */
   public ConnectorDescriptor removeAllIcon();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectorDescriptor ElementName: xsd:token ElementType : module-name
   // MaxOccurs: -  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>module-name</code> element
    * @param moduleName the value for the element <code>module-name</code> 
    * @return the current instance of <code>ConnectorDescriptor</code> 
    */
   public ConnectorDescriptor moduleName(String moduleName);

   /**
    * Returns the <code>module-name</code> element
    * @return the node defined for the element <code>module-name</code> 
    */
   public String getModuleName();

   /**
    * Removes the <code>module-name</code> element 
    * @return the current instance of <code>ConnectorDescriptor</code> 
    */
   public ConnectorDescriptor removeModuleName();
 
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
   // ClassName: ConnectorDescriptor ElementName: xsd:string ElementType : resourceadapter-version
   // MaxOccurs: -  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>resourceadapter-version</code> element
    * @param resourceadapterVersion the value for the element <code>resourceadapter-version</code> 
    * @return the current instance of <code>ConnectorDescriptor</code> 
    */
   public ConnectorDescriptor resourceadapterVersion(String resourceadapterVersion);

   /**
    * Returns the <code>resourceadapter-version</code> element
    * @return the node defined for the element <code>resourceadapter-version</code> 
    */
   public String getResourceadapterVersion();

   /**
    * Removes the <code>resourceadapter-version</code> element 
    * @return the current instance of <code>ConnectorDescriptor</code> 
    */
   public ConnectorDescriptor removeResourceadapterVersion();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectorDescriptor ElementName: javaee:licenseType ElementType : license
   // MaxOccurs: -  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>license</code> element with the given value will be created.
    * Otherwise, the existing <code>license</code> element will be returned.
    * @return  a new or existing instance of <code>LicenseType<ConnectorDescriptor></code> 
    */
   public LicenseType<ConnectorDescriptor> getOrCreateLicense();

   /**
    * Removes the <code>license</code> element 
    * @return the current instance of <code>ConnectorDescriptor</code> 
    */
   public ConnectorDescriptor removeLicense();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectorDescriptor ElementName: javaee:resourceadapterType ElementType : resourceadapter
   // MaxOccurs: -  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>resourceadapter</code> element with the given value will be created.
    * Otherwise, the existing <code>resourceadapter</code> element will be returned.
    * @return  a new or existing instance of <code>ResourceadapterType<ConnectorDescriptor></code> 
    */
   public ResourceadapterType<ConnectorDescriptor> getOrCreateResourceadapter();

   /**
    * Removes the <code>resourceadapter</code> element 
    * @return the current instance of <code>ConnectorDescriptor</code> 
    */
   public ConnectorDescriptor removeResourceadapter();
 
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
   public ConnectorDescriptor requiredWorkContext(String ... values);

   /**
    * Returns all <code>required-work-context</code> elements
    * @return list of <code>required-work-context</code> 
    */
   public List<String> getAllRequiredWorkContext();

   /**
    * Removes the <code>required-work-context</code> element 
    * @return the current instance of <code>ConnectorDescriptor</code> 
    */
   public ConnectorDescriptor removeAllRequiredWorkContext();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectorDescriptor ElementName: xsd:token ElementType : version
   // MaxOccurs: -  isGeneric: false   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   public static final String VERSION = "1.7";

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of <code>ConnectorDescriptor</code> 
    */
   public ConnectorDescriptor version(String version);

   /**
    * Returns the <code>version</code> attribute
    * @return the value defined for the attribute <code>version</code> 
    */
   public String getVersion();

   /**
    * Removes the <code>version</code> attribute 
    * @return the current instance of <code>ConnectorDescriptor</code> 
    */
   public ConnectorDescriptor removeVersion();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectorDescriptor ElementName: xsd:boolean ElementType : metadata-complete
   // MaxOccurs: -  isGeneric: false   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>metadata-complete</code> attribute
    * @param metadataComplete the value for the attribute <code>metadata-complete</code> 
    * @return the current instance of <code>ConnectorDescriptor</code> 
    */
   public ConnectorDescriptor metadataComplete(Boolean metadataComplete);

   /**
    * Returns the <code>metadata-complete</code> attribute
    * @return the value defined for the attribute <code>metadata-complete</code> 
    */
public Boolean isMetadataComplete();

   /**
    * Removes the <code>metadata-complete</code> attribute 
    * @return the current instance of <code>ConnectorDescriptor</code> 
    */
   public ConnectorDescriptor removeMetadataComplete();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectorDescriptor ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: false   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>ConnectorDescriptor</code> 
    */
   public ConnectorDescriptor id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>ConnectorDescriptor</code> 
    */
   public ConnectorDescriptor removeId();
}
