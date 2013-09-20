package org.jboss.shrinkwrap.descriptor.api.facesconfig22; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee7.IconType;
/**
 * This interface defines the contract for the <code> faces-config-componentType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface FacesConfigComponentType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigComponentType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>FacesConfigComponentType<T></code> 
    */
   public FacesConfigComponentType<T> description(String ... values);

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>FacesConfigComponentType<T></code> 
    */
   public FacesConfigComponentType<T> removeAllDescription();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigComponentType ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>FacesConfigComponentType<T></code> 
    */
   public FacesConfigComponentType<T> displayName(String ... values);

   /**
    * Returns all <code>display-name</code> elements
    * @return list of <code>display-name</code> 
    */
   public List<String> getAllDisplayName();

   /**
    * Removes the <code>display-name</code> element 
    * @return the current instance of <code>FacesConfigComponentType<T></code> 
    */
   public FacesConfigComponentType<T> removeAllDisplayName();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigComponentType ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<FacesConfigComponentType<T>> getOrCreateIcon();

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<FacesConfigComponentType<T>></code> 
    */
   public IconType<FacesConfigComponentType<T>> createIcon();

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<FacesConfigComponentType<T>>> getAllIcon();

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<FacesConfigComponentType<T>></code> 
    */
   public FacesConfigComponentType<T> removeAllIcon();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigComponentType ElementName: xsd:token ElementType : component-type
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>component-type</code> element
    * @param componentType the value for the element <code>component-type</code> 
    * @return the current instance of <code>FacesConfigComponentType<T></code> 
    */
   public FacesConfigComponentType<T> componentType(String componentType);

   /**
    * Returns the <code>component-type</code> element
    * @return the node defined for the element <code>component-type</code> 
    */
   public String getComponentType();

   /**
    * Removes the <code>component-type</code> element 
    * @return the current instance of <code>FacesConfigComponentType<T></code> 
    */
   public FacesConfigComponentType<T> removeComponentType();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigComponentType ElementName: xsd:token ElementType : component-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>component-class</code> element
    * @param componentClass the value for the element <code>component-class</code> 
    * @return the current instance of <code>FacesConfigComponentType<T></code> 
    */
   public FacesConfigComponentType<T> componentClass(String componentClass);

   /**
    * Returns the <code>component-class</code> element
    * @return the node defined for the element <code>component-class</code> 
    */
   public String getComponentClass();

   /**
    * Removes the <code>component-class</code> element 
    * @return the current instance of <code>FacesConfigComponentType<T></code> 
    */
   public FacesConfigComponentType<T> removeComponentClass();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigComponentType ElementName: javaee:faces-config-facetType ElementType : facet
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>facet</code> element will be created and returned.
    * Otherwise, the first existing <code>facet</code> element will be returned.
    * @return the instance defined for the element <code>facet</code> 
    */
   public FacesConfigFacetType<FacesConfigComponentType<T>> getOrCreateFacet();

   /**
    * Creates a new <code>facet</code> element 
    * @return the new created instance of <code>FacesConfigFacetType<FacesConfigComponentType<T>></code> 
    */
   public FacesConfigFacetType<FacesConfigComponentType<T>> createFacet();

   /**
    * Returns all <code>facet</code> elements
    * @return list of <code>facet</code> 
    */
   public List<FacesConfigFacetType<FacesConfigComponentType<T>>> getAllFacet();

   /**
    * Removes all <code>facet</code> elements 
    * @return the current instance of <code>FacesConfigFacetType<FacesConfigComponentType<T>></code> 
    */
   public FacesConfigComponentType<T> removeAllFacet();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigComponentType ElementName: javaee:faces-config-attributeType ElementType : attribute
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>attribute</code> element will be created and returned.
    * Otherwise, the first existing <code>attribute</code> element will be returned.
    * @return the instance defined for the element <code>attribute</code> 
    */
   public FacesConfigAttributeType<FacesConfigComponentType<T>> getOrCreateAttribute();

   /**
    * Creates a new <code>attribute</code> element 
    * @return the new created instance of <code>FacesConfigAttributeType<FacesConfigComponentType<T>></code> 
    */
   public FacesConfigAttributeType<FacesConfigComponentType<T>> createAttribute();

   /**
    * Returns all <code>attribute</code> elements
    * @return list of <code>attribute</code> 
    */
   public List<FacesConfigAttributeType<FacesConfigComponentType<T>>> getAllAttribute();

   /**
    * Removes all <code>attribute</code> elements 
    * @return the current instance of <code>FacesConfigAttributeType<FacesConfigComponentType<T>></code> 
    */
   public FacesConfigComponentType<T> removeAllAttribute();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigComponentType ElementName: javaee:faces-config-propertyType ElementType : property
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>property</code> element will be created and returned.
    * Otherwise, the first existing <code>property</code> element will be returned.
    * @return the instance defined for the element <code>property</code> 
    */
   public FacesConfigPropertyType<FacesConfigComponentType<T>> getOrCreateProperty();

   /**
    * Creates a new <code>property</code> element 
    * @return the new created instance of <code>FacesConfigPropertyType<FacesConfigComponentType<T>></code> 
    */
   public FacesConfigPropertyType<FacesConfigComponentType<T>> createProperty();

   /**
    * Returns all <code>property</code> elements
    * @return list of <code>property</code> 
    */
   public List<FacesConfigPropertyType<FacesConfigComponentType<T>>> getAllProperty();

   /**
    * Removes all <code>property</code> elements 
    * @return the current instance of <code>FacesConfigPropertyType<FacesConfigComponentType<T>></code> 
    */
   public FacesConfigComponentType<T> removeAllProperty();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigComponentType ElementName: javaee:faces-config-component-extensionType ElementType : component-extension
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>component-extension</code> element 
    * @return the current instance of <code>FacesConfigComponentType<T></code> 
    */
   public FacesConfigComponentType<T> componentExtension();

   /**
    * Removes the <code>component-extension</code> element 
    * @return the current instance of <code>FacesConfigComponentType<T></code> 
    */
   public Boolean isComponentExtension();

   /**
    * Removes the <code>component-extension</code> element 
    * @return the current instance of <code>FacesConfigComponentType<T></code> 
    */
   public FacesConfigComponentType<T> removeComponentExtension();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigComponentType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>FacesConfigComponentType<T></code> 
    */
   public FacesConfigComponentType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>FacesConfigComponentType<T></code> 
    */
   public FacesConfigComponentType<T> removeId();
}
