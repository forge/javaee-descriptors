package org.jboss.shrinkwrap.descriptor.api.connector16; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> licenseType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface LicenseType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: LicenseType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>LicenseType<T></code> 
    */
   public LicenseType<T> description(String ... values);

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>LicenseType<T></code> 
    */
   public LicenseType<T> removeAllDescription();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: LicenseType ElementName: javaee:xsdBooleanType ElementType : license-required
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>license-required</code> element
    * @param licenseRequired the value for the element <code>license-required</code> 
    * @return the current instance of <code>LicenseType<T></code> 
    */
   public LicenseType<T> licenseRequired(Boolean licenseRequired);

   /**
    * Returns the <code>license-required</code> element
    * @return the node defined for the element <code>license-required</code> 
    */
   public Boolean isLicenseRequired();

   /**
    * Removes the <code>license-required</code> element 
    * @return the current instance of <code>LicenseType<T></code> 
    */
   public LicenseType<T> removeLicenseRequired();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: LicenseType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>LicenseType<T></code> 
    */
   public LicenseType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>LicenseType<T></code> 
    */
   public LicenseType<T> removeId();
}
