package org.jboss.shrinkwrap.descriptor.api.facesconfig21; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.facesconfig21.FacesConfigAttributeType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig21.FacesConfigPropertyType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig21.FacesConfigConverterExtensionType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig21.FacesConfigAttributeType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig21.FacesConfigPropertyType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig21.FacesConfigConverterExtensionType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
/**
 * This interface defines the contract for the <code> faces-config-converterType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface FacesConfigConverterType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigConverterType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>FacesConfigConverterType<T></code> 
    */
   public FacesConfigConverterType<T> description(String ... values);

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>FacesConfigConverterType<T></code> 
    */
   public FacesConfigConverterType<T> removeAllDescription();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigConverterType ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>FacesConfigConverterType<T></code> 
    */
   public FacesConfigConverterType<T> displayName(String ... values);

   /**
    * Returns all <code>display-name</code> elements
    * @return list of <code>display-name</code> 
    */
   public List<String> getAllDisplayName();

   /**
    * Removes the <code>display-name</code> element 
    * @return the current instance of <code>FacesConfigConverterType<T></code> 
    */
   public FacesConfigConverterType<T> removeAllDisplayName();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigConverterType ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<FacesConfigConverterType<T>> getOrCreateIcon();

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<FacesConfigConverterType<T>></code> 
    */
   public IconType<FacesConfigConverterType<T>> createIcon();

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<FacesConfigConverterType<T>>> getAllIcon();

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<FacesConfigConverterType<T>></code> 
    */
   public FacesConfigConverterType<T> removeAllIcon();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigConverterType ElementName: xsd:token ElementType : converter-id
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>converter-id</code> element
    * @param converterId the value for the element <code>converter-id</code> 
    * @return the current instance of <code>FacesConfigConverterType<T></code> 
    */
   public FacesConfigConverterType<T> converterId(String converterId);

   /**
    * Returns the <code>converter-id</code> element
    * @return the node defined for the element <code>converter-id</code> 
    */
   public String getConverterId();

   /**
    * Removes the <code>converter-id</code> element 
    * @return the current instance of <code>FacesConfigConverterType<T></code> 
    */
   public FacesConfigConverterType<T> removeConverterId();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigConverterType ElementName: xsd:token ElementType : converter-for-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>converter-for-class</code> element
    * @param converterForClass the value for the element <code>converter-for-class</code> 
    * @return the current instance of <code>FacesConfigConverterType<T></code> 
    */
   public FacesConfigConverterType<T> converterForClass(String converterForClass);

   /**
    * Returns the <code>converter-for-class</code> element
    * @return the node defined for the element <code>converter-for-class</code> 
    */
   public String getConverterForClass();

   /**
    * Removes the <code>converter-for-class</code> element 
    * @return the current instance of <code>FacesConfigConverterType<T></code> 
    */
   public FacesConfigConverterType<T> removeConverterForClass();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigConverterType ElementName: xsd:token ElementType : converter-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>converter-class</code> element
    * @param converterClass the value for the element <code>converter-class</code> 
    * @return the current instance of <code>FacesConfigConverterType<T></code> 
    */
   public FacesConfigConverterType<T> converterClass(String converterClass);

   /**
    * Returns the <code>converter-class</code> element
    * @return the node defined for the element <code>converter-class</code> 
    */
   public String getConverterClass();

   /**
    * Removes the <code>converter-class</code> element 
    * @return the current instance of <code>FacesConfigConverterType<T></code> 
    */
   public FacesConfigConverterType<T> removeConverterClass();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigConverterType ElementName: javaee:faces-config-attributeType ElementType : attribute
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>attribute</code> element will be created and returned.
    * Otherwise, the first existing <code>attribute</code> element will be returned.
    * @return the instance defined for the element <code>attribute</code> 
    */
   public FacesConfigAttributeType<FacesConfigConverterType<T>> getOrCreateAttribute();

   /**
    * Creates a new <code>attribute</code> element 
    * @return the new created instance of <code>FacesConfigAttributeType<FacesConfigConverterType<T>></code> 
    */
   public FacesConfigAttributeType<FacesConfigConverterType<T>> createAttribute();

   /**
    * Returns all <code>attribute</code> elements
    * @return list of <code>attribute</code> 
    */
   public List<FacesConfigAttributeType<FacesConfigConverterType<T>>> getAllAttribute();

   /**
    * Removes all <code>attribute</code> elements 
    * @return the current instance of <code>FacesConfigAttributeType<FacesConfigConverterType<T>></code> 
    */
   public FacesConfigConverterType<T> removeAllAttribute();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigConverterType ElementName: javaee:faces-config-propertyType ElementType : property
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>property</code> element will be created and returned.
    * Otherwise, the first existing <code>property</code> element will be returned.
    * @return the instance defined for the element <code>property</code> 
    */
   public FacesConfigPropertyType<FacesConfigConverterType<T>> getOrCreateProperty();

   /**
    * Creates a new <code>property</code> element 
    * @return the new created instance of <code>FacesConfigPropertyType<FacesConfigConverterType<T>></code> 
    */
   public FacesConfigPropertyType<FacesConfigConverterType<T>> createProperty();

   /**
    * Returns all <code>property</code> elements
    * @return list of <code>property</code> 
    */
   public List<FacesConfigPropertyType<FacesConfigConverterType<T>>> getAllProperty();

   /**
    * Removes all <code>property</code> elements 
    * @return the current instance of <code>FacesConfigPropertyType<FacesConfigConverterType<T>></code> 
    */
   public FacesConfigConverterType<T> removeAllProperty();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigConverterType ElementName: javaee:faces-config-converter-extensionType ElementType : converter-extension
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>converter-extension</code> element 
    * @return the current instance of <code>FacesConfigConverterType<T></code> 
    */
   public FacesConfigConverterType<T> converterExtension();

   /**
    * Removes the <code>converter-extension</code> element 
    * @return the current instance of <code>FacesConfigConverterType<T></code> 
    */
   public Boolean isConverterExtension();

   /**
    * Removes the <code>converter-extension</code> element 
    * @return the current instance of <code>FacesConfigConverterType<T></code> 
    */
   public FacesConfigConverterType<T> removeConverterExtension();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigConverterType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>FacesConfigConverterType<T></code> 
    */
   public FacesConfigConverterType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>FacesConfigConverterType<T></code> 
    */
   public FacesConfigConverterType<T> removeId();
}
