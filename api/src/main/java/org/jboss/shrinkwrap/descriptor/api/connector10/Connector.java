package org.jboss.shrinkwrap.descriptor.api.connector10; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.connector10.Icon;
import org.jboss.shrinkwrap.descriptor.api.connector10.License;
import org.jboss.shrinkwrap.descriptor.api.connector10.Resourceadapter;
/**
 * This interface defines the contract for the <code> connector </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface Connector<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Connector ElementName: xsd:string ElementType : spec-version
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>spec-version</code> element
    * @param specVersion the value for the element <code>spec-version</code> 
    * @return the current instance of <code>Connector<T></code> 
    */
   public Connector<T> specVersion(String specVersion);

   /**
    * Returns the <code>spec-version</code> element
    * @return the node defined for the element <code>spec-version</code> 
    */
   public String getSpecVersion();

   /**
    * Removes the <code>spec-version</code> element 
    * @return the current instance of <code>Connector<T></code> 
    */
   public Connector<T> removeSpecVersion();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Connector ElementName: j2ee:icon ElementType : icon
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element with the given value will be created.
    * Otherwise, the existing <code>icon</code> element will be returned.
    * @return  a new or existing instance of <code>Icon<Connector<T>></code> 
    */
   public Icon<Connector<T>> getOrCreateIcon();

   /**
    * Removes the <code>icon</code> element 
    * @return the current instance of <code>Connector<T></code> 
    */
   public Connector<T> removeIcon();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Connector ElementName: xsd:string ElementType : display-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>display-name</code> element
    * @param displayName the value for the element <code>display-name</code> 
    * @return the current instance of <code>Connector<T></code> 
    */
   public Connector<T> displayName(String displayName);

   /**
    * Returns the <code>display-name</code> element
    * @return the node defined for the element <code>display-name</code> 
    */
   public String getDisplayName();

   /**
    * Removes the <code>display-name</code> element 
    * @return the current instance of <code>Connector<T></code> 
    */
   public Connector<T> removeDisplayName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Connector ElementName: xsd:string ElementType : vendor-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>vendor-name</code> element
    * @param vendorName the value for the element <code>vendor-name</code> 
    * @return the current instance of <code>Connector<T></code> 
    */
   public Connector<T> vendorName(String vendorName);

   /**
    * Returns the <code>vendor-name</code> element
    * @return the node defined for the element <code>vendor-name</code> 
    */
   public String getVendorName();

   /**
    * Removes the <code>vendor-name</code> element 
    * @return the current instance of <code>Connector<T></code> 
    */
   public Connector<T> removeVendorName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Connector ElementName: xsd:string ElementType : description
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>description</code> element
    * @param description the value for the element <code>description</code> 
    * @return the current instance of <code>Connector<T></code> 
    */
   public Connector<T> description(String description);

   /**
    * Returns the <code>description</code> element
    * @return the node defined for the element <code>description</code> 
    */
   public String getDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>Connector<T></code> 
    */
   public Connector<T> removeDescription();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Connector ElementName: xsd:string ElementType : eis-type
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>eis-type</code> element
    * @param eisType the value for the element <code>eis-type</code> 
    * @return the current instance of <code>Connector<T></code> 
    */
   public Connector<T> eisType(String eisType);

   /**
    * Returns the <code>eis-type</code> element
    * @return the node defined for the element <code>eis-type</code> 
    */
   public String getEisType();

   /**
    * Removes the <code>eis-type</code> element 
    * @return the current instance of <code>Connector<T></code> 
    */
   public Connector<T> removeEisType();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Connector ElementName: j2ee:license ElementType : license
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>license</code> element with the given value will be created.
    * Otherwise, the existing <code>license</code> element will be returned.
    * @return  a new or existing instance of <code>License<Connector<T>></code> 
    */
   public License<Connector<T>> getOrCreateLicense();

   /**
    * Removes the <code>license</code> element 
    * @return the current instance of <code>Connector<T></code> 
    */
   public Connector<T> removeLicense();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Connector ElementName: j2ee:resourceadapter ElementType : resourceadapter
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>resourceadapter</code> element with the given value will be created.
    * Otherwise, the existing <code>resourceadapter</code> element will be returned.
    * @return  a new or existing instance of <code>Resourceadapter<Connector<T>></code> 
    */
   public Resourceadapter<Connector<T>> getOrCreateResourceadapter();

   /**
    * Removes the <code>resourceadapter</code> element 
    * @return the current instance of <code>Connector<T></code> 
    */
   public Connector<T> removeResourceadapter();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Connector ElementName: xsd:string ElementType : version
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>version</code> element
    * @param version the value for the element <code>version</code> 
    * @return the current instance of <code>Connector<T></code> 
    */
   public Connector<T> version(String version);

   /**
    * Returns the <code>version</code> element
    * @return the node defined for the element <code>version</code> 
    */
   public String getVersion();

   /**
    * Removes the <code>version</code> element 
    * @return the current instance of <code>Connector<T></code> 
    */
   public Connector<T> removeVersion();
}
