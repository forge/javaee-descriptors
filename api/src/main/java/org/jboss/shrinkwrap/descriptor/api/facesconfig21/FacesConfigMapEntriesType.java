package org.jboss.shrinkwrap.descriptor.api.facesconfig21; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> faces-config-map-entriesType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface FacesConfigMapEntriesType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigMapEntriesType ElementName: xsd:token ElementType : key-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>key-class</code> element
    * @param keyClass the value for the element <code>key-class</code> 
    * @return the current instance of <code>FacesConfigMapEntriesType<T></code> 
    */
   public FacesConfigMapEntriesType<T> keyClass(String keyClass);

   /**
    * Returns the <code>key-class</code> element
    * @return the node defined for the element <code>key-class</code> 
    */
   public String getKeyClass();

   /**
    * Removes the <code>key-class</code> element 
    * @return the current instance of <code>FacesConfigMapEntriesType<T></code> 
    */
   public FacesConfigMapEntriesType<T> removeKeyClass();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigMapEntriesType ElementName: javaee:fully-qualified-classType ElementType : value-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>value-class</code> element
    * @param valueClass the value for the element <code>value-class</code> 
    * @return the current instance of <code>FacesConfigMapEntriesType<T></code> 
    */
   public FacesConfigMapEntriesType<T> valueClass(String valueClass);

   /**
    * Returns the <code>value-class</code> element
    * @return the node defined for the element <code>value-class</code> 
    */
   public String getValueClass();

   /**
    * Removes the <code>value-class</code> element 
    * @return the current instance of <code>FacesConfigMapEntriesType<T></code> 
    */
   public FacesConfigMapEntriesType<T> removeValueClass();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigMapEntriesType ElementName: javaee:faces-config-map-entryType ElementType : map-entry
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>map-entry</code> element will be created and returned.
    * Otherwise, the first existing <code>map-entry</code> element will be returned.
    * @return the instance defined for the element <code>map-entry</code> 
    */
   public FacesConfigMapEntryType<FacesConfigMapEntriesType<T>> getOrCreateMapEntry();

   /**
    * Creates a new <code>map-entry</code> element 
    * @return the new created instance of <code>FacesConfigMapEntryType<FacesConfigMapEntriesType<T>></code> 
    */
   public FacesConfigMapEntryType<FacesConfigMapEntriesType<T>> createMapEntry();

   /**
    * Returns all <code>map-entry</code> elements
    * @return list of <code>map-entry</code> 
    */
   public List<FacesConfigMapEntryType<FacesConfigMapEntriesType<T>>> getAllMapEntry();

   /**
    * Removes all <code>map-entry</code> elements 
    * @return the current instance of <code>FacesConfigMapEntryType<FacesConfigMapEntriesType<T>></code> 
    */
   public FacesConfigMapEntriesType<T> removeAllMapEntry();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigMapEntriesType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>FacesConfigMapEntriesType<T></code> 
    */
   public FacesConfigMapEntriesType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>FacesConfigMapEntriesType<T></code> 
    */
   public FacesConfigMapEntriesType<T> removeId();
}
