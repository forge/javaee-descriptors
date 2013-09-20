package org.jboss.shrinkwrap.descriptor.api.facesuicomponent20; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.facesuicomponent20.UicomponentAttributeType;
import org.jboss.shrinkwrap.descriptor.api.Descriptor;
import org.jboss.shrinkwrap.descriptor.api.DescriptorNamespace;

/** 
 * <p> 
 * This deployment descriptor provides the functionalities as described in the  specification
 * <p> 
 * Example:
 * <p> 
 * <code> 
 *     WebFacesUIComponentDescriptor descriptor = Descriptors.create(WebFacesUIComponentDescriptor.class);
 * </code> 
 *
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface WebFacesUIComponentDescriptor extends Descriptor, DescriptorNamespace<WebFacesUIComponentDescriptor>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFacesUIComponentDescriptor ElementName: javaee:uicomponent-attributeType ElementType : attribute
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>attribute</code> element will be created and returned.
    * Otherwise, the first existing <code>attribute</code> element will be returned.
    * @return the instance defined for the element <code>attribute</code> 
    */
   public UicomponentAttributeType<WebFacesUIComponentDescriptor> getOrCreateAttribute();

   /**
    * Creates a new <code>attribute</code> element 
    * @return the new created instance of <code>UicomponentAttributeType<WebFacesUIComponentDescriptor></code> 
    */
   public UicomponentAttributeType<WebFacesUIComponentDescriptor> createAttribute();

   /**
    * Returns all <code>attribute</code> elements
    * @return list of <code>attribute</code> 
    */
   public List<UicomponentAttributeType<WebFacesUIComponentDescriptor>> getAllAttribute();

   /**
    * Removes all <code>attribute</code> elements 
    * @return the current instance of <code>UicomponentAttributeType<WebFacesUIComponentDescriptor></code> 
    */
   public WebFacesUIComponentDescriptor removeAllAttribute();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFacesUIComponentDescriptor ElementName: xsd:string ElementType : name
   // MaxOccurs: -  isGeneric: false   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>WebFacesUIComponentDescriptor</code> 
    */
   public WebFacesUIComponentDescriptor name(String name);

   /**
    * Returns the <code>name</code> attribute
    * @return the value defined for the attribute <code>name</code> 
    */
   public String getName();

   /**
    * Removes the <code>name</code> attribute 
    * @return the current instance of <code>WebFacesUIComponentDescriptor</code> 
    */
   public WebFacesUIComponentDescriptor removeName();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFacesUIComponentDescriptor ElementName: xsd:string ElementType : displayName
   // MaxOccurs: -  isGeneric: false   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>displayName</code> attribute
    * @param displayName the value for the attribute <code>displayName</code> 
    * @return the current instance of <code>WebFacesUIComponentDescriptor</code> 
    */
   public WebFacesUIComponentDescriptor displayName(String displayName);

   /**
    * Returns the <code>displayName</code> attribute
    * @return the value defined for the attribute <code>displayName</code> 
    */
   public String getDisplayName();

   /**
    * Removes the <code>displayName</code> attribute 
    * @return the current instance of <code>WebFacesUIComponentDescriptor</code> 
    */
   public WebFacesUIComponentDescriptor removeDisplayName();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFacesUIComponentDescriptor ElementName: xsd:string ElementType : shortDescription
   // MaxOccurs: -  isGeneric: false   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>shortDescription</code> attribute
    * @param shortDescription the value for the attribute <code>shortDescription</code> 
    * @return the current instance of <code>WebFacesUIComponentDescriptor</code> 
    */
   public WebFacesUIComponentDescriptor shortDescription(String shortDescription);

   /**
    * Returns the <code>shortDescription</code> attribute
    * @return the value defined for the attribute <code>shortDescription</code> 
    */
   public String getShortDescription();

   /**
    * Removes the <code>shortDescription</code> attribute 
    * @return the current instance of <code>WebFacesUIComponentDescriptor</code> 
    */
   public WebFacesUIComponentDescriptor removeShortDescription();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFacesUIComponentDescriptor ElementName: xsd:string ElementType : default
   // MaxOccurs: -  isGeneric: false   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>default</code> attribute
    * @param _default the value for the attribute <code>default</code> 
    * @return the current instance of <code>WebFacesUIComponentDescriptor</code> 
    */
   public WebFacesUIComponentDescriptor _default(String _default);

   /**
    * Returns the <code>default</code> attribute
    * @return the value defined for the attribute <code>default</code> 
    */
   public String get_Default();

   /**
    * Removes the <code>default</code> attribute 
    * @return the current instance of <code>WebFacesUIComponentDescriptor</code> 
    */
   public WebFacesUIComponentDescriptor remove_Default();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFacesUIComponentDescriptor ElementName: xsd:string ElementType : method-signature
   // MaxOccurs: -  isGeneric: false   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>method-signature</code> attribute
    * @param methodSignature the value for the attribute <code>method-signature</code> 
    * @return the current instance of <code>WebFacesUIComponentDescriptor</code> 
    */
   public WebFacesUIComponentDescriptor methodSignature(String methodSignature);

   /**
    * Returns the <code>method-signature</code> attribute
    * @return the value defined for the attribute <code>method-signature</code> 
    */
   public String getMethodSignature();

   /**
    * Removes the <code>method-signature</code> attribute 
    * @return the current instance of <code>WebFacesUIComponentDescriptor</code> 
    */
   public WebFacesUIComponentDescriptor removeMethodSignature();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFacesUIComponentDescriptor ElementName: xsd:string ElementType : applyTo
   // MaxOccurs: -  isGeneric: false   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>applyTo</code> attribute
    * @param applyTo the value for the attribute <code>applyTo</code> 
    * @return the current instance of <code>WebFacesUIComponentDescriptor</code> 
    */
   public WebFacesUIComponentDescriptor applyTo(String applyTo);

   /**
    * Returns the <code>applyTo</code> attribute
    * @return the value defined for the attribute <code>applyTo</code> 
    */
   public String getApplyTo();

   /**
    * Removes the <code>applyTo</code> attribute 
    * @return the current instance of <code>WebFacesUIComponentDescriptor</code> 
    */
   public WebFacesUIComponentDescriptor removeApplyTo();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFacesUIComponentDescriptor ElementName: xsd:boolean ElementType : required
   // MaxOccurs: -  isGeneric: false   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>required</code> attribute
    * @param required the value for the attribute <code>required</code> 
    * @return the current instance of <code>WebFacesUIComponentDescriptor</code> 
    */
   public WebFacesUIComponentDescriptor required(Boolean required);

   /**
    * Returns the <code>required</code> attribute
    * @return the value defined for the attribute <code>required</code> 
    */
public Boolean isRequired();

   /**
    * Removes the <code>required</code> attribute 
    * @return the current instance of <code>WebFacesUIComponentDescriptor</code> 
    */
   public WebFacesUIComponentDescriptor removeRequired();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFacesUIComponentDescriptor ElementName: xsd:boolean ElementType : preferred
   // MaxOccurs: -  isGeneric: false   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>preferred</code> attribute
    * @param preferred the value for the attribute <code>preferred</code> 
    * @return the current instance of <code>WebFacesUIComponentDescriptor</code> 
    */
   public WebFacesUIComponentDescriptor preferred(Boolean preferred);

   /**
    * Returns the <code>preferred</code> attribute
    * @return the value defined for the attribute <code>preferred</code> 
    */
public Boolean isPreferred();

   /**
    * Removes the <code>preferred</code> attribute 
    * @return the current instance of <code>WebFacesUIComponentDescriptor</code> 
    */
   public WebFacesUIComponentDescriptor removePreferred();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFacesUIComponentDescriptor ElementName: xsd:boolean ElementType : expert
   // MaxOccurs: -  isGeneric: false   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>expert</code> attribute
    * @param expert the value for the attribute <code>expert</code> 
    * @return the current instance of <code>WebFacesUIComponentDescriptor</code> 
    */
   public WebFacesUIComponentDescriptor expert(Boolean expert);

   /**
    * Returns the <code>expert</code> attribute
    * @return the value defined for the attribute <code>expert</code> 
    */
public Boolean isExpert();

   /**
    * Removes the <code>expert</code> attribute 
    * @return the current instance of <code>WebFacesUIComponentDescriptor</code> 
    */
   public WebFacesUIComponentDescriptor removeExpert();
}
