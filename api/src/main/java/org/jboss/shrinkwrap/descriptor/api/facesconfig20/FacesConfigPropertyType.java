package org.jboss.shrinkwrap.descriptor.api.facesconfig20; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
/**
 * This interface defines the contract for the <code> faces-config-propertyType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface FacesConfigPropertyType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigPropertyType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>FacesConfigPropertyType<T></code> 
    */
   public FacesConfigPropertyType<T> description(String ... values);

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>FacesConfigPropertyType<T></code> 
    */
   public FacesConfigPropertyType<T> removeAllDescription();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigPropertyType ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>FacesConfigPropertyType<T></code> 
    */
   public FacesConfigPropertyType<T> displayName(String ... values);

   /**
    * Returns all <code>display-name</code> elements
    * @return list of <code>display-name</code> 
    */
   public List<String> getAllDisplayName();

   /**
    * Removes the <code>display-name</code> element 
    * @return the current instance of <code>FacesConfigPropertyType<T></code> 
    */
   public FacesConfigPropertyType<T> removeAllDisplayName();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigPropertyType ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<FacesConfigPropertyType<T>> getOrCreateIcon();

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<FacesConfigPropertyType<T>></code> 
    */
   public IconType<FacesConfigPropertyType<T>> createIcon();

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<FacesConfigPropertyType<T>>> getAllIcon();

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<FacesConfigPropertyType<T>></code> 
    */
   public FacesConfigPropertyType<T> removeAllIcon();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigPropertyType ElementName: xsd:token ElementType : property-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>property-name</code> element
    * @param propertyName the value for the element <code>property-name</code> 
    * @return the current instance of <code>FacesConfigPropertyType<T></code> 
    */
   public FacesConfigPropertyType<T> propertyName(String propertyName);

   /**
    * Returns the <code>property-name</code> element
    * @return the node defined for the element <code>property-name</code> 
    */
   public String getPropertyName();

   /**
    * Removes the <code>property-name</code> element 
    * @return the current instance of <code>FacesConfigPropertyType<T></code> 
    */
   public FacesConfigPropertyType<T> removePropertyName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigPropertyType ElementName: xsd:token ElementType : property-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>property-class</code> element
    * @param propertyClass the value for the element <code>property-class</code> 
    * @return the current instance of <code>FacesConfigPropertyType<T></code> 
    */
   public FacesConfigPropertyType<T> propertyClass(String propertyClass);

   /**
    * Returns the <code>property-class</code> element
    * @return the node defined for the element <code>property-class</code> 
    */
   public String getPropertyClass();

   /**
    * Removes the <code>property-class</code> element 
    * @return the current instance of <code>FacesConfigPropertyType<T></code> 
    */
   public FacesConfigPropertyType<T> removePropertyClass();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigPropertyType ElementName: javaee:string ElementType : default-value
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>default-value</code> element
    * @param defaultValue the value for the element <code>default-value</code> 
    * @return the current instance of <code>FacesConfigPropertyType<T></code> 
    */
   public FacesConfigPropertyType<T> defaultValue(String defaultValue);

   /**
    * Returns the <code>default-value</code> element
    * @return the node defined for the element <code>default-value</code> 
    */
   public String getDefaultValue();

   /**
    * Removes the <code>default-value</code> element 
    * @return the current instance of <code>FacesConfigPropertyType<T></code> 
    */
   public FacesConfigPropertyType<T> removeDefaultValue();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigPropertyType ElementName: javaee:string ElementType : suggested-value
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>suggested-value</code> element
    * @param suggestedValue the value for the element <code>suggested-value</code> 
    * @return the current instance of <code>FacesConfigPropertyType<T></code> 
    */
   public FacesConfigPropertyType<T> suggestedValue(String suggestedValue);

   /**
    * Returns the <code>suggested-value</code> element
    * @return the node defined for the element <code>suggested-value</code> 
    */
   public String getSuggestedValue();

   /**
    * Removes the <code>suggested-value</code> element 
    * @return the current instance of <code>FacesConfigPropertyType<T></code> 
    */
   public FacesConfigPropertyType<T> removeSuggestedValue();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigPropertyType ElementName: javaee:faces-config-property-extensionType ElementType : property-extension
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>property-extension</code> element 
    * @return the current instance of <code>FacesConfigPropertyType<T></code> 
    */
   public FacesConfigPropertyType<T> propertyExtension();

   /**
    * Removes the <code>property-extension</code> element 
    * @return the current instance of <code>FacesConfigPropertyType<T></code> 
    */
   public Boolean isPropertyExtension();

   /**
    * Removes the <code>property-extension</code> element 
    * @return the current instance of <code>FacesConfigPropertyType<T></code> 
    */
   public FacesConfigPropertyType<T> removePropertyExtension();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigPropertyType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>FacesConfigPropertyType<T></code> 
    */
   public FacesConfigPropertyType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>FacesConfigPropertyType<T></code> 
    */
   public FacesConfigPropertyType<T> removeId();
}
