package org.jboss.shrinkwrap.descriptor.api.webapp25; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.webapp25.LocaleEncodingMappingType;
/**
 * This interface defines the contract for the <code> locale-encoding-mapping-listType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface LocaleEncodingMappingListType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: LocaleEncodingMappingListType ElementName: javaee:locale-encoding-mappingType ElementType : locale-encoding-mapping
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>locale-encoding-mapping</code> element will be created and returned.
    * Otherwise, the first existing <code>locale-encoding-mapping</code> element will be returned.
    * @return the instance defined for the element <code>locale-encoding-mapping</code> 
    */
   public LocaleEncodingMappingType<LocaleEncodingMappingListType<T>> getOrCreateLocaleEncodingMapping();

   /**
    * Creates a new <code>locale-encoding-mapping</code> element 
    * @return the new created instance of <code>LocaleEncodingMappingType<LocaleEncodingMappingListType<T>></code> 
    */
   public LocaleEncodingMappingType<LocaleEncodingMappingListType<T>> createLocaleEncodingMapping();

   /**
    * Returns all <code>locale-encoding-mapping</code> elements
    * @return list of <code>locale-encoding-mapping</code> 
    */
   public List<LocaleEncodingMappingType<LocaleEncodingMappingListType<T>>> getAllLocaleEncodingMapping();

   /**
    * Removes all <code>locale-encoding-mapping</code> elements 
    * @return the current instance of <code>LocaleEncodingMappingType<LocaleEncodingMappingListType<T>></code> 
    */
   public LocaleEncodingMappingListType<T> removeAllLocaleEncodingMapping();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: LocaleEncodingMappingListType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>LocaleEncodingMappingListType<T></code> 
    */
   public LocaleEncodingMappingListType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>LocaleEncodingMappingListType<T></code> 
    */
   public LocaleEncodingMappingListType<T> removeId();
}
