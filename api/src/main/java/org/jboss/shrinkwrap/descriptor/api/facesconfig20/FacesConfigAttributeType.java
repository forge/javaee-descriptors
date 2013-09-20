package org.jboss.shrinkwrap.descriptor.api.facesconfig20; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
/**
 * This interface defines the contract for the <code> faces-config-attributeType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface FacesConfigAttributeType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigAttributeType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>FacesConfigAttributeType<T></code> 
    */
   public FacesConfigAttributeType<T> description(String ... values);

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>FacesConfigAttributeType<T></code> 
    */
   public FacesConfigAttributeType<T> removeAllDescription();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigAttributeType ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>FacesConfigAttributeType<T></code> 
    */
   public FacesConfigAttributeType<T> displayName(String ... values);

   /**
    * Returns all <code>display-name</code> elements
    * @return list of <code>display-name</code> 
    */
   public List<String> getAllDisplayName();

   /**
    * Removes the <code>display-name</code> element 
    * @return the current instance of <code>FacesConfigAttributeType<T></code> 
    */
   public FacesConfigAttributeType<T> removeAllDisplayName();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigAttributeType ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<FacesConfigAttributeType<T>> getOrCreateIcon();

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<FacesConfigAttributeType<T>></code> 
    */
   public IconType<FacesConfigAttributeType<T>> createIcon();

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<FacesConfigAttributeType<T>>> getAllIcon();

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<FacesConfigAttributeType<T>></code> 
    */
   public FacesConfigAttributeType<T> removeAllIcon();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigAttributeType ElementName: xsd:token ElementType : attribute-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>attribute-name</code> element
    * @param attributeName the value for the element <code>attribute-name</code> 
    * @return the current instance of <code>FacesConfigAttributeType<T></code> 
    */
   public FacesConfigAttributeType<T> attributeName(String attributeName);

   /**
    * Returns the <code>attribute-name</code> element
    * @return the node defined for the element <code>attribute-name</code> 
    */
   public String getAttributeName();

   /**
    * Removes the <code>attribute-name</code> element 
    * @return the current instance of <code>FacesConfigAttributeType<T></code> 
    */
   public FacesConfigAttributeType<T> removeAttributeName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigAttributeType ElementName: xsd:token ElementType : attribute-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>attribute-class</code> element
    * @param attributeClass the value for the element <code>attribute-class</code> 
    * @return the current instance of <code>FacesConfigAttributeType<T></code> 
    */
   public FacesConfigAttributeType<T> attributeClass(String attributeClass);

   /**
    * Returns the <code>attribute-class</code> element
    * @return the node defined for the element <code>attribute-class</code> 
    */
   public String getAttributeClass();

   /**
    * Removes the <code>attribute-class</code> element 
    * @return the current instance of <code>FacesConfigAttributeType<T></code> 
    */
   public FacesConfigAttributeType<T> removeAttributeClass();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigAttributeType ElementName: javaee:string ElementType : default-value
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>default-value</code> element
    * @param defaultValue the value for the element <code>default-value</code> 
    * @return the current instance of <code>FacesConfigAttributeType<T></code> 
    */
   public FacesConfigAttributeType<T> defaultValue(String defaultValue);

   /**
    * Returns the <code>default-value</code> element
    * @return the node defined for the element <code>default-value</code> 
    */
   public String getDefaultValue();

   /**
    * Removes the <code>default-value</code> element 
    * @return the current instance of <code>FacesConfigAttributeType<T></code> 
    */
   public FacesConfigAttributeType<T> removeDefaultValue();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigAttributeType ElementName: javaee:string ElementType : suggested-value
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>suggested-value</code> element
    * @param suggestedValue the value for the element <code>suggested-value</code> 
    * @return the current instance of <code>FacesConfigAttributeType<T></code> 
    */
   public FacesConfigAttributeType<T> suggestedValue(String suggestedValue);

   /**
    * Returns the <code>suggested-value</code> element
    * @return the node defined for the element <code>suggested-value</code> 
    */
   public String getSuggestedValue();

   /**
    * Removes the <code>suggested-value</code> element 
    * @return the current instance of <code>FacesConfigAttributeType<T></code> 
    */
   public FacesConfigAttributeType<T> removeSuggestedValue();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigAttributeType ElementName: javaee:faces-config-attribute-extensionType ElementType : attribute-extension
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>attribute-extension</code> element 
    * @return the current instance of <code>FacesConfigAttributeType<T></code> 
    */
   public FacesConfigAttributeType<T> attributeExtension();

   /**
    * Removes the <code>attribute-extension</code> element 
    * @return the current instance of <code>FacesConfigAttributeType<T></code> 
    */
   public Boolean isAttributeExtension();

   /**
    * Removes the <code>attribute-extension</code> element 
    * @return the current instance of <code>FacesConfigAttributeType<T></code> 
    */
   public FacesConfigAttributeType<T> removeAttributeExtension();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigAttributeType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>FacesConfigAttributeType<T></code> 
    */
   public FacesConfigAttributeType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>FacesConfigAttributeType<T></code> 
    */
   public FacesConfigAttributeType<T> removeId();
}
