package org.jboss.shrinkwrap.descriptor.api.facesconfig22; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> faces-config-locale-configType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface FacesConfigLocaleConfigType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigLocaleConfigType ElementName: xsd:string ElementType : default-locale
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>default-locale</code> element
    * @param defaultLocale the value for the element <code>default-locale</code> 
    * @return the current instance of <code>FacesConfigLocaleConfigType<T></code> 
    */
   public FacesConfigLocaleConfigType<T> defaultLocale(String defaultLocale);

   /**
    * Returns the <code>default-locale</code> element
    * @return the node defined for the element <code>default-locale</code> 
    */
   public String getDefaultLocale();

   /**
    * Removes the <code>default-locale</code> element 
    * @return the current instance of <code>FacesConfigLocaleConfigType<T></code> 
    */
   public FacesConfigLocaleConfigType<T> removeDefaultLocale();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigLocaleConfigType ElementName: javaee:faces-config-localeType ElementType : supported-locale
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>supported-locale</code> elements, 
    * a new <code>supported-locale</code> element 
    * @param values list of <code>supported-locale</code> objects 
    * @return the current instance of <code>FacesConfigLocaleConfigType<T></code> 
    */
   public FacesConfigLocaleConfigType<T> supportedLocale(String ... values);

   /**
    * Returns all <code>supported-locale</code> elements
    * @return list of <code>supported-locale</code> 
    */
   public List<String> getAllSupportedLocale();

   /**
    * Removes the <code>supported-locale</code> element 
    * @return the current instance of <code>FacesConfigLocaleConfigType<T></code> 
    */
   public FacesConfigLocaleConfigType<T> removeAllSupportedLocale();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigLocaleConfigType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>FacesConfigLocaleConfigType<T></code> 
    */
   public FacesConfigLocaleConfigType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>FacesConfigLocaleConfigType<T></code> 
    */
   public FacesConfigLocaleConfigType<T> removeId();
}
