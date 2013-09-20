package org.jboss.shrinkwrap.descriptor.api.connector17; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.connector17.LicenseType;
import org.jboss.shrinkwrap.descriptor.api.connector17.ResourceadapterType;
import org.jboss.shrinkwrap.descriptor.api.javaee7.IconType;
/**
 * This interface defines the contract for the <code> connectorType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface ConnectorType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectorType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>ConnectorType<T></code> 
    */
   public ConnectorType<T> description(String ... values);

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>ConnectorType<T></code> 
    */
   public ConnectorType<T> removeAllDescription();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectorType ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>ConnectorType<T></code> 
    */
   public ConnectorType<T> displayName(String ... values);

   /**
    * Returns all <code>display-name</code> elements
    * @return list of <code>display-name</code> 
    */
   public List<String> getAllDisplayName();

   /**
    * Removes the <code>display-name</code> element 
    * @return the current instance of <code>ConnectorType<T></code> 
    */
   public ConnectorType<T> removeAllDisplayName();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectorType ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<ConnectorType<T>> getOrCreateIcon();

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<ConnectorType<T>></code> 
    */
   public IconType<ConnectorType<T>> createIcon();

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<ConnectorType<T>>> getAllIcon();

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<ConnectorType<T>></code> 
    */
   public ConnectorType<T> removeAllIcon();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectorType ElementName: xsd:token ElementType : module-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>module-name</code> element
    * @param moduleName the value for the element <code>module-name</code> 
    * @return the current instance of <code>ConnectorType<T></code> 
    */
   public ConnectorType<T> moduleName(String moduleName);

   /**
    * Returns the <code>module-name</code> element
    * @return the node defined for the element <code>module-name</code> 
    */
   public String getModuleName();

   /**
    * Removes the <code>module-name</code> element 
    * @return the current instance of <code>ConnectorType<T></code> 
    */
   public ConnectorType<T> removeModuleName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectorType ElementName: xsd:string ElementType : vendor-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>vendor-name</code> element
    * @param vendorName the value for the element <code>vendor-name</code> 
    * @return the current instance of <code>ConnectorType<T></code> 
    */
   public ConnectorType<T> vendorName(String vendorName);

   /**
    * Returns the <code>vendor-name</code> element
    * @return the node defined for the element <code>vendor-name</code> 
    */
   public String getVendorName();

   /**
    * Removes the <code>vendor-name</code> element 
    * @return the current instance of <code>ConnectorType<T></code> 
    */
   public ConnectorType<T> removeVendorName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectorType ElementName: xsd:string ElementType : eis-type
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>eis-type</code> element
    * @param eisType the value for the element <code>eis-type</code> 
    * @return the current instance of <code>ConnectorType<T></code> 
    */
   public ConnectorType<T> eisType(String eisType);

   /**
    * Returns the <code>eis-type</code> element
    * @return the node defined for the element <code>eis-type</code> 
    */
   public String getEisType();

   /**
    * Removes the <code>eis-type</code> element 
    * @return the current instance of <code>ConnectorType<T></code> 
    */
   public ConnectorType<T> removeEisType();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectorType ElementName: xsd:string ElementType : resourceadapter-version
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>resourceadapter-version</code> element
    * @param resourceadapterVersion the value for the element <code>resourceadapter-version</code> 
    * @return the current instance of <code>ConnectorType<T></code> 
    */
   public ConnectorType<T> resourceadapterVersion(String resourceadapterVersion);

   /**
    * Returns the <code>resourceadapter-version</code> element
    * @return the node defined for the element <code>resourceadapter-version</code> 
    */
   public String getResourceadapterVersion();

   /**
    * Removes the <code>resourceadapter-version</code> element 
    * @return the current instance of <code>ConnectorType<T></code> 
    */
   public ConnectorType<T> removeResourceadapterVersion();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectorType ElementName: javaee:licenseType ElementType : license
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>license</code> element with the given value will be created.
    * Otherwise, the existing <code>license</code> element will be returned.
    * @return  a new or existing instance of <code>LicenseType<ConnectorType<T>></code> 
    */
   public LicenseType<ConnectorType<T>> getOrCreateLicense();

   /**
    * Removes the <code>license</code> element 
    * @return the current instance of <code>ConnectorType<T></code> 
    */
   public ConnectorType<T> removeLicense();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectorType ElementName: javaee:resourceadapterType ElementType : resourceadapter
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>resourceadapter</code> element with the given value will be created.
    * Otherwise, the existing <code>resourceadapter</code> element will be returned.
    * @return  a new or existing instance of <code>ResourceadapterType<ConnectorType<T>></code> 
    */
   public ResourceadapterType<ConnectorType<T>> getOrCreateResourceadapter();

   /**
    * Removes the <code>resourceadapter</code> element 
    * @return the current instance of <code>ConnectorType<T></code> 
    */
   public ConnectorType<T> removeResourceadapter();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectorType ElementName: xsd:token ElementType : required-work-context
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>required-work-context</code> elements, 
    * a new <code>required-work-context</code> element 
    * @param values list of <code>required-work-context</code> objects 
    * @return the current instance of <code>ConnectorType<T></code> 
    */
   public ConnectorType<T> requiredWorkContext(String ... values);

   /**
    * Returns all <code>required-work-context</code> elements
    * @return list of <code>required-work-context</code> 
    */
   public List<String> getAllRequiredWorkContext();

   /**
    * Removes the <code>required-work-context</code> element 
    * @return the current instance of <code>ConnectorType<T></code> 
    */
   public ConnectorType<T> removeAllRequiredWorkContext();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectorType ElementName: xsd:token ElementType : version
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   public static final String VERSION = "1.7";

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of <code>ConnectorType<T></code> 
    */
   public ConnectorType<T> version(String version);

   /**
    * Returns the <code>version</code> attribute
    * @return the value defined for the attribute <code>version</code> 
    */
   public String getVersion();

   /**
    * Removes the <code>version</code> attribute 
    * @return the current instance of <code>ConnectorType<T></code> 
    */
   public ConnectorType<T> removeVersion();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectorType ElementName: xsd:boolean ElementType : metadata-complete
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>metadata-complete</code> attribute
    * @param metadataComplete the value for the attribute <code>metadata-complete</code> 
    * @return the current instance of <code>ConnectorType<T></code> 
    */
   public ConnectorType<T> metadataComplete(Boolean metadataComplete);

   /**
    * Returns the <code>metadata-complete</code> attribute
    * @return the value defined for the attribute <code>metadata-complete</code> 
    */
public Boolean isMetadataComplete();

   /**
    * Removes the <code>metadata-complete</code> attribute 
    * @return the current instance of <code>ConnectorType<T></code> 
    */
   public ConnectorType<T> removeMetadataComplete();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectorType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>ConnectorType<T></code> 
    */
   public ConnectorType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>ConnectorType<T></code> 
    */
   public ConnectorType<T> removeId();
}
