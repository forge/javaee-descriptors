package org.jboss.shrinkwrap.descriptor.api.facesconfig21; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.facesconfig21.FacesConfigMapEntriesType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig21.FacesConfigNullValueType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig21.FacesConfigListEntriesType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig21.FacesConfigMapEntriesType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig21.FacesConfigNullValueType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig21.FacesConfigListEntriesType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
/**
 * This interface defines the contract for the <code> faces-config-managed-propertyType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface FacesConfigManagedPropertyType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigManagedPropertyType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>FacesConfigManagedPropertyType<T></code> 
    */
   public FacesConfigManagedPropertyType<T> description(String ... values);

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>FacesConfigManagedPropertyType<T></code> 
    */
   public FacesConfigManagedPropertyType<T> removeAllDescription();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigManagedPropertyType ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>FacesConfigManagedPropertyType<T></code> 
    */
   public FacesConfigManagedPropertyType<T> displayName(String ... values);

   /**
    * Returns all <code>display-name</code> elements
    * @return list of <code>display-name</code> 
    */
   public List<String> getAllDisplayName();

   /**
    * Removes the <code>display-name</code> element 
    * @return the current instance of <code>FacesConfigManagedPropertyType<T></code> 
    */
   public FacesConfigManagedPropertyType<T> removeAllDisplayName();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigManagedPropertyType ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<FacesConfigManagedPropertyType<T>> getOrCreateIcon();

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<FacesConfigManagedPropertyType<T>></code> 
    */
   public IconType<FacesConfigManagedPropertyType<T>> createIcon();

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<FacesConfigManagedPropertyType<T>>> getAllIcon();

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<FacesConfigManagedPropertyType<T>></code> 
    */
   public FacesConfigManagedPropertyType<T> removeAllIcon();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigManagedPropertyType ElementName: xsd:token ElementType : property-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>property-name</code> element
    * @param propertyName the value for the element <code>property-name</code> 
    * @return the current instance of <code>FacesConfigManagedPropertyType<T></code> 
    */
   public FacesConfigManagedPropertyType<T> propertyName(String propertyName);

   /**
    * Returns the <code>property-name</code> element
    * @return the node defined for the element <code>property-name</code> 
    */
   public String getPropertyName();

   /**
    * Removes the <code>property-name</code> element 
    * @return the current instance of <code>FacesConfigManagedPropertyType<T></code> 
    */
   public FacesConfigManagedPropertyType<T> removePropertyName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigManagedPropertyType ElementName: xsd:token ElementType : property-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>property-class</code> element
    * @param propertyClass the value for the element <code>property-class</code> 
    * @return the current instance of <code>FacesConfigManagedPropertyType<T></code> 
    */
   public FacesConfigManagedPropertyType<T> propertyClass(String propertyClass);

   /**
    * Returns the <code>property-class</code> element
    * @return the node defined for the element <code>property-class</code> 
    */
   public String getPropertyClass();

   /**
    * Removes the <code>property-class</code> element 
    * @return the current instance of <code>FacesConfigManagedPropertyType<T></code> 
    */
   public FacesConfigManagedPropertyType<T> removePropertyClass();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigManagedPropertyType ElementName: javaee:faces-config-map-entriesType ElementType : map-entries
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>map-entries</code> element with the given value will be created.
    * Otherwise, the existing <code>map-entries</code> element will be returned.
    * @return  a new or existing instance of <code>FacesConfigMapEntriesType<FacesConfigManagedPropertyType<T>></code> 
    */
   public FacesConfigMapEntriesType<FacesConfigManagedPropertyType<T>> getOrCreateMapEntries();

   /**
    * Removes the <code>map-entries</code> element 
    * @return the current instance of <code>FacesConfigManagedPropertyType<T></code> 
    */
   public FacesConfigManagedPropertyType<T> removeMapEntries();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigManagedPropertyType ElementName: javaee:faces-config-null-valueType ElementType : null-value
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>null-value</code> element 
    * @return the current instance of <code>FacesConfigManagedPropertyType<T></code> 
    */
   public FacesConfigManagedPropertyType<T> nullValue();

   /**
    * Removes the <code>null-value</code> element 
    * @return the current instance of <code>FacesConfigManagedPropertyType<T></code> 
    */
   public Boolean isNullValue();

   /**
    * Removes the <code>null-value</code> element 
    * @return the current instance of <code>FacesConfigManagedPropertyType<T></code> 
    */
   public FacesConfigManagedPropertyType<T> removeNullValue();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigManagedPropertyType ElementName: xsd:string ElementType : value
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>value</code> element
    * @param value the value for the element <code>value</code> 
    * @return the current instance of <code>FacesConfigManagedPropertyType<T></code> 
    */
   public FacesConfigManagedPropertyType<T> value(String value);

   /**
    * Returns the <code>value</code> element
    * @return the node defined for the element <code>value</code> 
    */
   public String getValue();

   /**
    * Removes the <code>value</code> element 
    * @return the current instance of <code>FacesConfigManagedPropertyType<T></code> 
    */
   public FacesConfigManagedPropertyType<T> removeValue();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigManagedPropertyType ElementName: javaee:faces-config-list-entriesType ElementType : list-entries
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>list-entries</code> element with the given value will be created.
    * Otherwise, the existing <code>list-entries</code> element will be returned.
    * @return  a new or existing instance of <code>FacesConfigListEntriesType<FacesConfigManagedPropertyType<T>></code> 
    */
   public FacesConfigListEntriesType<FacesConfigManagedPropertyType<T>> getOrCreateListEntries();

   /**
    * Removes the <code>list-entries</code> element 
    * @return the current instance of <code>FacesConfigManagedPropertyType<T></code> 
    */
   public FacesConfigManagedPropertyType<T> removeListEntries();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigManagedPropertyType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>FacesConfigManagedPropertyType<T></code> 
    */
   public FacesConfigManagedPropertyType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>FacesConfigManagedPropertyType<T></code> 
    */
   public FacesConfigManagedPropertyType<T> removeId();
}
