package org.jboss.shrinkwrap.descriptor.api.webcommon30; 

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> locale-encoding-mappingType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface LocaleEncodingMappingType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: LocaleEncodingMappingType ElementName: xsd:string ElementType : locale
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>locale</code> element
    * @param locale the value for the element <code>locale</code> 
    * @return the current instance of <code>LocaleEncodingMappingType<T></code> 
    */
   public LocaleEncodingMappingType<T> locale(String locale);

   /**
    * Returns the <code>locale</code> element
    * @return the node defined for the element <code>locale</code> 
    */
   public String getLocale();

   /**
    * Removes the <code>locale</code> element 
    * @return the current instance of <code>LocaleEncodingMappingType<T></code> 
    */
   public LocaleEncodingMappingType<T> removeLocale();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: LocaleEncodingMappingType ElementName: xsd:string ElementType : encoding
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>encoding</code> element
    * @param encoding the value for the element <code>encoding</code> 
    * @return the current instance of <code>LocaleEncodingMappingType<T></code> 
    */
   public LocaleEncodingMappingType<T> encoding(String encoding);

   /**
    * Returns the <code>encoding</code> element
    * @return the node defined for the element <code>encoding</code> 
    */
   public String getEncoding();

   /**
    * Removes the <code>encoding</code> element 
    * @return the current instance of <code>LocaleEncodingMappingType<T></code> 
    */
   public LocaleEncodingMappingType<T> removeEncoding();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: LocaleEncodingMappingType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>LocaleEncodingMappingType<T></code> 
    */
   public LocaleEncodingMappingType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>LocaleEncodingMappingType<T></code> 
    */
   public LocaleEncodingMappingType<T> removeId();
}
