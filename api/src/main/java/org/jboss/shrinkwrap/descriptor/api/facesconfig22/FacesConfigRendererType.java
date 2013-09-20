package org.jboss.shrinkwrap.descriptor.api.facesconfig22; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigFacetType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigAttributeType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigRendererExtensionType;
import org.jboss.shrinkwrap.descriptor.api.javaee7.IconType;
/**
 * This interface defines the contract for the <code> faces-config-rendererType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface FacesConfigRendererType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigRendererType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>FacesConfigRendererType<T></code> 
    */
   public FacesConfigRendererType<T> description(String ... values);

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>FacesConfigRendererType<T></code> 
    */
   public FacesConfigRendererType<T> removeAllDescription();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigRendererType ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>FacesConfigRendererType<T></code> 
    */
   public FacesConfigRendererType<T> displayName(String ... values);

   /**
    * Returns all <code>display-name</code> elements
    * @return list of <code>display-name</code> 
    */
   public List<String> getAllDisplayName();

   /**
    * Removes the <code>display-name</code> element 
    * @return the current instance of <code>FacesConfigRendererType<T></code> 
    */
   public FacesConfigRendererType<T> removeAllDisplayName();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigRendererType ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<FacesConfigRendererType<T>> getOrCreateIcon();

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<FacesConfigRendererType<T>></code> 
    */
   public IconType<FacesConfigRendererType<T>> createIcon();

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<FacesConfigRendererType<T>>> getAllIcon();

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<FacesConfigRendererType<T>></code> 
    */
   public FacesConfigRendererType<T> removeAllIcon();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigRendererType ElementName: xsd:token ElementType : component-family
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>component-family</code> element
    * @param componentFamily the value for the element <code>component-family</code> 
    * @return the current instance of <code>FacesConfigRendererType<T></code> 
    */
   public FacesConfigRendererType<T> componentFamily(String componentFamily);

   /**
    * Returns the <code>component-family</code> element
    * @return the node defined for the element <code>component-family</code> 
    */
   public String getComponentFamily();

   /**
    * Removes the <code>component-family</code> element 
    * @return the current instance of <code>FacesConfigRendererType<T></code> 
    */
   public FacesConfigRendererType<T> removeComponentFamily();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigRendererType ElementName: xsd:token ElementType : renderer-type
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>renderer-type</code> element
    * @param rendererType the value for the element <code>renderer-type</code> 
    * @return the current instance of <code>FacesConfigRendererType<T></code> 
    */
   public FacesConfigRendererType<T> rendererType(String rendererType);

   /**
    * Returns the <code>renderer-type</code> element
    * @return the node defined for the element <code>renderer-type</code> 
    */
   public String getRendererType();

   /**
    * Removes the <code>renderer-type</code> element 
    * @return the current instance of <code>FacesConfigRendererType<T></code> 
    */
   public FacesConfigRendererType<T> removeRendererType();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigRendererType ElementName: xsd:token ElementType : renderer-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>renderer-class</code> element
    * @param rendererClass the value for the element <code>renderer-class</code> 
    * @return the current instance of <code>FacesConfigRendererType<T></code> 
    */
   public FacesConfigRendererType<T> rendererClass(String rendererClass);

   /**
    * Returns the <code>renderer-class</code> element
    * @return the node defined for the element <code>renderer-class</code> 
    */
   public String getRendererClass();

   /**
    * Removes the <code>renderer-class</code> element 
    * @return the current instance of <code>FacesConfigRendererType<T></code> 
    */
   public FacesConfigRendererType<T> removeRendererClass();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigRendererType ElementName: javaee:faces-config-facetType ElementType : facet
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>facet</code> element will be created and returned.
    * Otherwise, the first existing <code>facet</code> element will be returned.
    * @return the instance defined for the element <code>facet</code> 
    */
   public FacesConfigFacetType<FacesConfigRendererType<T>> getOrCreateFacet();

   /**
    * Creates a new <code>facet</code> element 
    * @return the new created instance of <code>FacesConfigFacetType<FacesConfigRendererType<T>></code> 
    */
   public FacesConfigFacetType<FacesConfigRendererType<T>> createFacet();

   /**
    * Returns all <code>facet</code> elements
    * @return list of <code>facet</code> 
    */
   public List<FacesConfigFacetType<FacesConfigRendererType<T>>> getAllFacet();

   /**
    * Removes all <code>facet</code> elements 
    * @return the current instance of <code>FacesConfigFacetType<FacesConfigRendererType<T>></code> 
    */
   public FacesConfigRendererType<T> removeAllFacet();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigRendererType ElementName: javaee:faces-config-attributeType ElementType : attribute
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>attribute</code> element will be created and returned.
    * Otherwise, the first existing <code>attribute</code> element will be returned.
    * @return the instance defined for the element <code>attribute</code> 
    */
   public FacesConfigAttributeType<FacesConfigRendererType<T>> getOrCreateAttribute();

   /**
    * Creates a new <code>attribute</code> element 
    * @return the new created instance of <code>FacesConfigAttributeType<FacesConfigRendererType<T>></code> 
    */
   public FacesConfigAttributeType<FacesConfigRendererType<T>> createAttribute();

   /**
    * Returns all <code>attribute</code> elements
    * @return list of <code>attribute</code> 
    */
   public List<FacesConfigAttributeType<FacesConfigRendererType<T>>> getAllAttribute();

   /**
    * Removes all <code>attribute</code> elements 
    * @return the current instance of <code>FacesConfigAttributeType<FacesConfigRendererType<T>></code> 
    */
   public FacesConfigRendererType<T> removeAllAttribute();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigRendererType ElementName: javaee:faces-config-renderer-extensionType ElementType : renderer-extension
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>renderer-extension</code> element 
    * @return the current instance of <code>FacesConfigRendererType<T></code> 
    */
   public FacesConfigRendererType<T> rendererExtension();

   /**
    * Removes the <code>renderer-extension</code> element 
    * @return the current instance of <code>FacesConfigRendererType<T></code> 
    */
   public Boolean isRendererExtension();

   /**
    * Removes the <code>renderer-extension</code> element 
    * @return the current instance of <code>FacesConfigRendererType<T></code> 
    */
   public FacesConfigRendererType<T> removeRendererExtension();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigRendererType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>FacesConfigRendererType<T></code> 
    */
   public FacesConfigRendererType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>FacesConfigRendererType<T></code> 
    */
   public FacesConfigRendererType<T> removeId();
}
