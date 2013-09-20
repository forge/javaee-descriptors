package org.jboss.shrinkwrap.descriptor.api.facelettaglibrary20; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.facelettaglibrary20.FaceletTaglibTagBehaviorType;
import org.jboss.shrinkwrap.descriptor.api.facelettaglibrary20.FaceletTaglibTagComponentType;
import org.jboss.shrinkwrap.descriptor.api.facelettaglibrary20.FaceletTaglibTagConverterType;
import org.jboss.shrinkwrap.descriptor.api.facelettaglibrary20.FaceletTaglibTagValidatorType;
import org.jboss.shrinkwrap.descriptor.api.facelettaglibrary20.FaceletTaglibTagAttributeType;
import org.jboss.shrinkwrap.descriptor.api.facelettaglibrary20.FaceletTaglibTagExtensionType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
/**
 * This interface defines the contract for the <code> facelet-taglib-tagType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface FaceletTaglibTagType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibTagType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>FaceletTaglibTagType<T></code> 
    */
   public FaceletTaglibTagType<T> description(String ... values);

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>FaceletTaglibTagType<T></code> 
    */
   public FaceletTaglibTagType<T> removeAllDescription();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibTagType ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>FaceletTaglibTagType<T></code> 
    */
   public FaceletTaglibTagType<T> displayName(String ... values);

   /**
    * Returns all <code>display-name</code> elements
    * @return list of <code>display-name</code> 
    */
   public List<String> getAllDisplayName();

   /**
    * Removes the <code>display-name</code> element 
    * @return the current instance of <code>FaceletTaglibTagType<T></code> 
    */
   public FaceletTaglibTagType<T> removeAllDisplayName();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibTagType ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<FaceletTaglibTagType<T>> getOrCreateIcon();

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<FaceletTaglibTagType<T>></code> 
    */
   public IconType<FaceletTaglibTagType<T>> createIcon();

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<FaceletTaglibTagType<T>>> getAllIcon();

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<FaceletTaglibTagType<T>></code> 
    */
   public FaceletTaglibTagType<T> removeAllIcon();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibTagType ElementName: xsd:NCName ElementType : tag-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>tag-name</code> element
    * @param tagName the value for the element <code>tag-name</code> 
    * @return the current instance of <code>FaceletTaglibTagType<T></code> 
    */
   public FaceletTaglibTagType<T> tagName(String tagName);

   /**
    * Returns the <code>tag-name</code> element
    * @return the node defined for the element <code>tag-name</code> 
    */
   public String getTagName();

   /**
    * Removes the <code>tag-name</code> element 
    * @return the current instance of <code>FaceletTaglibTagType<T></code> 
    */
   public FaceletTaglibTagType<T> removeTagName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibTagType ElementName: xsd:token ElementType : handler-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>handler-class</code> element
    * @param handlerClass the value for the element <code>handler-class</code> 
    * @return the current instance of <code>FaceletTaglibTagType<T></code> 
    */
   public FaceletTaglibTagType<T> handlerClass(String handlerClass);

   /**
    * Returns the <code>handler-class</code> element
    * @return the node defined for the element <code>handler-class</code> 
    */
   public String getHandlerClass();

   /**
    * Removes the <code>handler-class</code> element 
    * @return the current instance of <code>FaceletTaglibTagType<T></code> 
    */
   public FaceletTaglibTagType<T> removeHandlerClass();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibTagType ElementName: javaee:facelet-taglib-tag-behaviorType ElementType : behavior
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>behavior</code> element with the given value will be created.
    * Otherwise, the existing <code>behavior</code> element will be returned.
    * @return  a new or existing instance of <code>FaceletTaglibTagBehaviorType<FaceletTaglibTagType<T>></code> 
    */
   public FaceletTaglibTagBehaviorType<FaceletTaglibTagType<T>> getOrCreateBehavior();

   /**
    * Removes the <code>behavior</code> element 
    * @return the current instance of <code>FaceletTaglibTagType<T></code> 
    */
   public FaceletTaglibTagType<T> removeBehavior();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibTagType ElementName: javaee:facelet-taglib-tag-componentType ElementType : component
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>component</code> element with the given value will be created.
    * Otherwise, the existing <code>component</code> element will be returned.
    * @return  a new or existing instance of <code>FaceletTaglibTagComponentType<FaceletTaglibTagType<T>></code> 
    */
   public FaceletTaglibTagComponentType<FaceletTaglibTagType<T>> getOrCreateComponent();

   /**
    * Removes the <code>component</code> element 
    * @return the current instance of <code>FaceletTaglibTagType<T></code> 
    */
   public FaceletTaglibTagType<T> removeComponent();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibTagType ElementName: javaee:facelet-taglib-tag-converterType ElementType : converter
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>converter</code> element with the given value will be created.
    * Otherwise, the existing <code>converter</code> element will be returned.
    * @return  a new or existing instance of <code>FaceletTaglibTagConverterType<FaceletTaglibTagType<T>></code> 
    */
   public FaceletTaglibTagConverterType<FaceletTaglibTagType<T>> getOrCreateConverter();

   /**
    * Removes the <code>converter</code> element 
    * @return the current instance of <code>FaceletTaglibTagType<T></code> 
    */
   public FaceletTaglibTagType<T> removeConverter();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibTagType ElementName: javaee:facelet-taglib-tag-validatorType ElementType : validator
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>validator</code> element with the given value will be created.
    * Otherwise, the existing <code>validator</code> element will be returned.
    * @return  a new or existing instance of <code>FaceletTaglibTagValidatorType<FaceletTaglibTagType<T>></code> 
    */
   public FaceletTaglibTagValidatorType<FaceletTaglibTagType<T>> getOrCreateValidator();

   /**
    * Removes the <code>validator</code> element 
    * @return the current instance of <code>FaceletTaglibTagType<T></code> 
    */
   public FaceletTaglibTagType<T> removeValidator();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibTagType ElementName: xsd:token ElementType : source
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>source</code> element
    * @param source the value for the element <code>source</code> 
    * @return the current instance of <code>FaceletTaglibTagType<T></code> 
    */
   public FaceletTaglibTagType<T> source(String source);

   /**
    * Returns the <code>source</code> element
    * @return the node defined for the element <code>source</code> 
    */
   public String getSource();

   /**
    * Removes the <code>source</code> element 
    * @return the current instance of <code>FaceletTaglibTagType<T></code> 
    */
   public FaceletTaglibTagType<T> removeSource();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibTagType ElementName: javaee:facelet-taglib-tag-attributeType ElementType : attribute
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>attribute</code> element will be created and returned.
    * Otherwise, the first existing <code>attribute</code> element will be returned.
    * @return the instance defined for the element <code>attribute</code> 
    */
   public FaceletTaglibTagAttributeType<FaceletTaglibTagType<T>> getOrCreateAttribute();

   /**
    * Creates a new <code>attribute</code> element 
    * @return the new created instance of <code>FaceletTaglibTagAttributeType<FaceletTaglibTagType<T>></code> 
    */
   public FaceletTaglibTagAttributeType<FaceletTaglibTagType<T>> createAttribute();

   /**
    * Returns all <code>attribute</code> elements
    * @return list of <code>attribute</code> 
    */
   public List<FaceletTaglibTagAttributeType<FaceletTaglibTagType<T>>> getAllAttribute();

   /**
    * Removes all <code>attribute</code> elements 
    * @return the current instance of <code>FaceletTaglibTagAttributeType<FaceletTaglibTagType<T>></code> 
    */
   public FaceletTaglibTagType<T> removeAllAttribute();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibTagType ElementName: javaee:facelet-taglib-tag-extensionType ElementType : tag-extension
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>tag-extension</code> element 
    * @return the current instance of <code>FaceletTaglibTagType<T></code> 
    */
   public FaceletTaglibTagType<T> tagExtension();

   /**
    * Removes the <code>tag-extension</code> element 
    * @return the current instance of <code>FaceletTaglibTagType<T></code> 
    */
   public Boolean isTagExtension();

   /**
    * Removes the <code>tag-extension</code> element 
    * @return the current instance of <code>FaceletTaglibTagType<T></code> 
    */
   public FaceletTaglibTagType<T> removeTagExtension();
}
