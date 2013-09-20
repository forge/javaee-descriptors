package org.jboss.shrinkwrap.descriptor.api.facesconfig21; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
/**
 * This interface defines the contract for the <code> faces-config-validatorType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface FacesConfigValidatorType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigValidatorType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>FacesConfigValidatorType<T></code> 
    */
   public FacesConfigValidatorType<T> description(String ... values);

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>FacesConfigValidatorType<T></code> 
    */
   public FacesConfigValidatorType<T> removeAllDescription();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigValidatorType ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>FacesConfigValidatorType<T></code> 
    */
   public FacesConfigValidatorType<T> displayName(String ... values);

   /**
    * Returns all <code>display-name</code> elements
    * @return list of <code>display-name</code> 
    */
   public List<String> getAllDisplayName();

   /**
    * Removes the <code>display-name</code> element 
    * @return the current instance of <code>FacesConfigValidatorType<T></code> 
    */
   public FacesConfigValidatorType<T> removeAllDisplayName();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigValidatorType ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<FacesConfigValidatorType<T>> getOrCreateIcon();

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<FacesConfigValidatorType<T>></code> 
    */
   public IconType<FacesConfigValidatorType<T>> createIcon();

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<FacesConfigValidatorType<T>>> getAllIcon();

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<FacesConfigValidatorType<T>></code> 
    */
   public FacesConfigValidatorType<T> removeAllIcon();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigValidatorType ElementName: xsd:token ElementType : validator-id
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>validator-id</code> element
    * @param validatorId the value for the element <code>validator-id</code> 
    * @return the current instance of <code>FacesConfigValidatorType<T></code> 
    */
   public FacesConfigValidatorType<T> validatorId(String validatorId);

   /**
    * Returns the <code>validator-id</code> element
    * @return the node defined for the element <code>validator-id</code> 
    */
   public String getValidatorId();

   /**
    * Removes the <code>validator-id</code> element 
    * @return the current instance of <code>FacesConfigValidatorType<T></code> 
    */
   public FacesConfigValidatorType<T> removeValidatorId();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigValidatorType ElementName: xsd:token ElementType : validator-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>validator-class</code> element
    * @param validatorClass the value for the element <code>validator-class</code> 
    * @return the current instance of <code>FacesConfigValidatorType<T></code> 
    */
   public FacesConfigValidatorType<T> validatorClass(String validatorClass);

   /**
    * Returns the <code>validator-class</code> element
    * @return the node defined for the element <code>validator-class</code> 
    */
   public String getValidatorClass();

   /**
    * Removes the <code>validator-class</code> element 
    * @return the current instance of <code>FacesConfigValidatorType<T></code> 
    */
   public FacesConfigValidatorType<T> removeValidatorClass();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigValidatorType ElementName: javaee:faces-config-attributeType ElementType : attribute
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>attribute</code> element will be created and returned.
    * Otherwise, the first existing <code>attribute</code> element will be returned.
    * @return the instance defined for the element <code>attribute</code> 
    */
   public FacesConfigAttributeType<FacesConfigValidatorType<T>> getOrCreateAttribute();

   /**
    * Creates a new <code>attribute</code> element 
    * @return the new created instance of <code>FacesConfigAttributeType<FacesConfigValidatorType<T>></code> 
    */
   public FacesConfigAttributeType<FacesConfigValidatorType<T>> createAttribute();

   /**
    * Returns all <code>attribute</code> elements
    * @return list of <code>attribute</code> 
    */
   public List<FacesConfigAttributeType<FacesConfigValidatorType<T>>> getAllAttribute();

   /**
    * Removes all <code>attribute</code> elements 
    * @return the current instance of <code>FacesConfigAttributeType<FacesConfigValidatorType<T>></code> 
    */
   public FacesConfigValidatorType<T> removeAllAttribute();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigValidatorType ElementName: javaee:faces-config-propertyType ElementType : property
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>property</code> element will be created and returned.
    * Otherwise, the first existing <code>property</code> element will be returned.
    * @return the instance defined for the element <code>property</code> 
    */
   public FacesConfigPropertyType<FacesConfigValidatorType<T>> getOrCreateProperty();

   /**
    * Creates a new <code>property</code> element 
    * @return the new created instance of <code>FacesConfigPropertyType<FacesConfigValidatorType<T>></code> 
    */
   public FacesConfigPropertyType<FacesConfigValidatorType<T>> createProperty();

   /**
    * Returns all <code>property</code> elements
    * @return list of <code>property</code> 
    */
   public List<FacesConfigPropertyType<FacesConfigValidatorType<T>>> getAllProperty();

   /**
    * Removes all <code>property</code> elements 
    * @return the current instance of <code>FacesConfigPropertyType<FacesConfigValidatorType<T>></code> 
    */
   public FacesConfigValidatorType<T> removeAllProperty();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigValidatorType ElementName: javaee:faces-config-validator-extensionType ElementType : validator-extension
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>validator-extension</code> element 
    * @return the current instance of <code>FacesConfigValidatorType<T></code> 
    */
   public FacesConfigValidatorType<T> validatorExtension();

   /**
    * Removes the <code>validator-extension</code> element 
    * @return the current instance of <code>FacesConfigValidatorType<T></code> 
    */
   public Boolean isValidatorExtension();

   /**
    * Removes the <code>validator-extension</code> element 
    * @return the current instance of <code>FacesConfigValidatorType<T></code> 
    */
   public FacesConfigValidatorType<T> removeValidatorExtension();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigValidatorType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>FacesConfigValidatorType<T></code> 
    */
   public FacesConfigValidatorType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>FacesConfigValidatorType<T></code> 
    */
   public FacesConfigValidatorType<T> removeId();
}
