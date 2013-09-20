package org.jboss.shrinkwrap.descriptor.api.facesconfig20; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.facesconfig20.FacesConfigAttributeType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig20.FacesConfigPropertyType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig20.FacesConfigBehaviorExtensionType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig20.FacesConfigAttributeType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig20.FacesConfigPropertyType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig20.FacesConfigBehaviorExtensionType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
/**
 * This interface defines the contract for the <code> faces-config-behaviorType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface FacesConfigBehaviorType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigBehaviorType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>FacesConfigBehaviorType<T></code> 
    */
   public FacesConfigBehaviorType<T> description(String ... values);

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>FacesConfigBehaviorType<T></code> 
    */
   public FacesConfigBehaviorType<T> removeAllDescription();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigBehaviorType ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>FacesConfigBehaviorType<T></code> 
    */
   public FacesConfigBehaviorType<T> displayName(String ... values);

   /**
    * Returns all <code>display-name</code> elements
    * @return list of <code>display-name</code> 
    */
   public List<String> getAllDisplayName();

   /**
    * Removes the <code>display-name</code> element 
    * @return the current instance of <code>FacesConfigBehaviorType<T></code> 
    */
   public FacesConfigBehaviorType<T> removeAllDisplayName();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigBehaviorType ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<FacesConfigBehaviorType<T>> getOrCreateIcon();

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<FacesConfigBehaviorType<T>></code> 
    */
   public IconType<FacesConfigBehaviorType<T>> createIcon();

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<FacesConfigBehaviorType<T>>> getAllIcon();

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<FacesConfigBehaviorType<T>></code> 
    */
   public FacesConfigBehaviorType<T> removeAllIcon();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigBehaviorType ElementName: xsd:token ElementType : behavior-id
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>behavior-id</code> element
    * @param behaviorId the value for the element <code>behavior-id</code> 
    * @return the current instance of <code>FacesConfigBehaviorType<T></code> 
    */
   public FacesConfigBehaviorType<T> behaviorId(String behaviorId);

   /**
    * Returns the <code>behavior-id</code> element
    * @return the node defined for the element <code>behavior-id</code> 
    */
   public String getBehaviorId();

   /**
    * Removes the <code>behavior-id</code> element 
    * @return the current instance of <code>FacesConfigBehaviorType<T></code> 
    */
   public FacesConfigBehaviorType<T> removeBehaviorId();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigBehaviorType ElementName: xsd:token ElementType : behavior-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>behavior-class</code> element
    * @param behaviorClass the value for the element <code>behavior-class</code> 
    * @return the current instance of <code>FacesConfigBehaviorType<T></code> 
    */
   public FacesConfigBehaviorType<T> behaviorClass(String behaviorClass);

   /**
    * Returns the <code>behavior-class</code> element
    * @return the node defined for the element <code>behavior-class</code> 
    */
   public String getBehaviorClass();

   /**
    * Removes the <code>behavior-class</code> element 
    * @return the current instance of <code>FacesConfigBehaviorType<T></code> 
    */
   public FacesConfigBehaviorType<T> removeBehaviorClass();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigBehaviorType ElementName: javaee:faces-config-attributeType ElementType : attribute
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>attribute</code> element will be created and returned.
    * Otherwise, the first existing <code>attribute</code> element will be returned.
    * @return the instance defined for the element <code>attribute</code> 
    */
   public FacesConfigAttributeType<FacesConfigBehaviorType<T>> getOrCreateAttribute();

   /**
    * Creates a new <code>attribute</code> element 
    * @return the new created instance of <code>FacesConfigAttributeType<FacesConfigBehaviorType<T>></code> 
    */
   public FacesConfigAttributeType<FacesConfigBehaviorType<T>> createAttribute();

   /**
    * Returns all <code>attribute</code> elements
    * @return list of <code>attribute</code> 
    */
   public List<FacesConfigAttributeType<FacesConfigBehaviorType<T>>> getAllAttribute();

   /**
    * Removes all <code>attribute</code> elements 
    * @return the current instance of <code>FacesConfigAttributeType<FacesConfigBehaviorType<T>></code> 
    */
   public FacesConfigBehaviorType<T> removeAllAttribute();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigBehaviorType ElementName: javaee:faces-config-propertyType ElementType : property
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>property</code> element will be created and returned.
    * Otherwise, the first existing <code>property</code> element will be returned.
    * @return the instance defined for the element <code>property</code> 
    */
   public FacesConfigPropertyType<FacesConfigBehaviorType<T>> getOrCreateProperty();

   /**
    * Creates a new <code>property</code> element 
    * @return the new created instance of <code>FacesConfigPropertyType<FacesConfigBehaviorType<T>></code> 
    */
   public FacesConfigPropertyType<FacesConfigBehaviorType<T>> createProperty();

   /**
    * Returns all <code>property</code> elements
    * @return list of <code>property</code> 
    */
   public List<FacesConfigPropertyType<FacesConfigBehaviorType<T>>> getAllProperty();

   /**
    * Removes all <code>property</code> elements 
    * @return the current instance of <code>FacesConfigPropertyType<FacesConfigBehaviorType<T>></code> 
    */
   public FacesConfigBehaviorType<T> removeAllProperty();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigBehaviorType ElementName: javaee:faces-config-behavior-extensionType ElementType : behavior-extension
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>behavior-extension</code> element 
    * @return the current instance of <code>FacesConfigBehaviorType<T></code> 
    */
   public FacesConfigBehaviorType<T> behaviorExtension();

   /**
    * Removes the <code>behavior-extension</code> element 
    * @return the current instance of <code>FacesConfigBehaviorType<T></code> 
    */
   public Boolean isBehaviorExtension();

   /**
    * Removes the <code>behavior-extension</code> element 
    * @return the current instance of <code>FacesConfigBehaviorType<T></code> 
    */
   public FacesConfigBehaviorType<T> removeBehaviorExtension();
}
