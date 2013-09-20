package org.jboss.shrinkwrap.descriptor.api.jsptaglibrary20; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.j2ee14.GenericBooleanType;
import org.jboss.shrinkwrap.descriptor.api.j2ee14.IconType;
/**
 * This interface defines the contract for the <code> tagType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface TagType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TagType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>TagType<T></code> 
    */
   public TagType<T> description(String ... values);

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>TagType<T></code> 
    */
   public TagType<T> removeAllDescription();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TagType ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>TagType<T></code> 
    */
   public TagType<T> displayName(String ... values);

   /**
    * Returns all <code>display-name</code> elements
    * @return list of <code>display-name</code> 
    */
   public List<String> getAllDisplayName();

   /**
    * Removes the <code>display-name</code> element 
    * @return the current instance of <code>TagType<T></code> 
    */
   public TagType<T> removeAllDisplayName();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TagType ElementName: j2ee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<TagType<T>> getOrCreateIcon();

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<TagType<T>></code> 
    */
   public IconType<TagType<T>> createIcon();

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<TagType<T>>> getAllIcon();

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<TagType<T>></code> 
    */
   public TagType<T> removeAllIcon();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TagType ElementName: j2ee:xsdNMTOKENType ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> element
    * @param name the value for the element <code>name</code> 
    * @return the current instance of <code>TagType<T></code> 
    */
   public TagType<T> name(String name);

   /**
    * Returns the <code>name</code> element
    * @return the node defined for the element <code>name</code> 
    */
   public String getName();

   /**
    * Removes the <code>name</code> element 
    * @return the current instance of <code>TagType<T></code> 
    */
   public TagType<T> removeName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TagType ElementName: xsd:token ElementType : tag-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>tag-class</code> element
    * @param tagClass the value for the element <code>tag-class</code> 
    * @return the current instance of <code>TagType<T></code> 
    */
   public TagType<T> tagClass(String tagClass);

   /**
    * Returns the <code>tag-class</code> element
    * @return the node defined for the element <code>tag-class</code> 
    */
   public String getTagClass();

   /**
    * Removes the <code>tag-class</code> element 
    * @return the current instance of <code>TagType<T></code> 
    */
   public TagType<T> removeTagClass();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TagType ElementName: xsd:token ElementType : tei-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>tei-class</code> element
    * @param teiClass the value for the element <code>tei-class</code> 
    * @return the current instance of <code>TagType<T></code> 
    */
   public TagType<T> teiClass(String teiClass);

   /**
    * Returns the <code>tei-class</code> element
    * @return the node defined for the element <code>tei-class</code> 
    */
   public String getTeiClass();

   /**
    * Removes the <code>tei-class</code> element 
    * @return the current instance of <code>TagType<T></code> 
    */
   public TagType<T> removeTeiClass();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TagType ElementName: j2ee:body-contentType ElementType : body-content
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>body-content</code> element
    * @param bodyContent the value for the element <code>body-content</code> 
    * @return the current instance of <code>TagType<T></code> 
    */
   public TagType<T> bodyContent(BodyContentType bodyContent);
   /**
    * Sets the <code>body-content</code> element
    * @param bodyContent the value for the element <code>body-content</code> 
    * @return the current instance of <code>TagType<T></code> 
    */
   public TagType<T> bodyContent(String bodyContent);

   /**
    * Returns the <code>body-content</code> element
    * @return the value found for the element <code>body-content</code> 
    */
   public BodyContentType getBodyContent();

   /**
    * Returns the <code>body-content</code> element
    * @return the value found for the element <code>body-content</code> 
    */
   public String  getBodyContentAsString();

   /**
    * Removes the <code>body-content</code> attribute 
    * @return the current instance of <code>TagType<T></code> 
    */
   public TagType<T> removeBodyContent();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TagType ElementName: j2ee:variableType ElementType : variable
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>variable</code> element will be created and returned.
    * Otherwise, the first existing <code>variable</code> element will be returned.
    * @return the instance defined for the element <code>variable</code> 
    */
   public VariableType<TagType<T>> getOrCreateVariable();

   /**
    * Creates a new <code>variable</code> element 
    * @return the new created instance of <code>VariableType<TagType<T>></code> 
    */
   public VariableType<TagType<T>> createVariable();

   /**
    * Returns all <code>variable</code> elements
    * @return list of <code>variable</code> 
    */
   public List<VariableType<TagType<T>>> getAllVariable();

   /**
    * Removes all <code>variable</code> elements 
    * @return the current instance of <code>VariableType<TagType<T>></code> 
    */
   public TagType<T> removeAllVariable();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TagType ElementName: j2ee:tld-attributeType ElementType : attribute
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>attribute</code> element will be created and returned.
    * Otherwise, the first existing <code>attribute</code> element will be returned.
    * @return the instance defined for the element <code>attribute</code> 
    */
   public TldAttributeType<TagType<T>> getOrCreateAttribute();

   /**
    * Creates a new <code>attribute</code> element 
    * @return the new created instance of <code>TldAttributeType<TagType<T>></code> 
    */
   public TldAttributeType<TagType<T>> createAttribute();

   /**
    * Returns all <code>attribute</code> elements
    * @return list of <code>attribute</code> 
    */
   public List<TldAttributeType<TagType<T>>> getAllAttribute();

   /**
    * Removes all <code>attribute</code> elements 
    * @return the current instance of <code>TldAttributeType<TagType<T>></code> 
    */
   public TagType<T> removeAllAttribute();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TagType ElementName: j2ee:generic-booleanType ElementType : dynamic-attributes
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>dynamic-attributes</code> element
    * @param dynamicAttributes the value for the element <code>dynamic-attributes</code> 
    * @return the current instance of <code>TagType<T></code> 
    */
   public TagType<T> dynamicAttributes(GenericBooleanType dynamicAttributes);
   /**
    * Sets the <code>dynamic-attributes</code> element
    * @param dynamicAttributes the value for the element <code>dynamic-attributes</code> 
    * @return the current instance of <code>TagType<T></code> 
    */
   public TagType<T> dynamicAttributes(String dynamicAttributes);

   /**
    * Returns the <code>dynamic-attributes</code> element
    * @return the value found for the element <code>dynamic-attributes</code> 
    */
   public GenericBooleanType getDynamicAttributes();

   /**
    * Returns the <code>dynamic-attributes</code> element
    * @return the value found for the element <code>dynamic-attributes</code> 
    */
   public String  getDynamicAttributesAsString();

   /**
    * Removes the <code>dynamic-attributes</code> attribute 
    * @return the current instance of <code>TagType<T></code> 
    */
   public TagType<T> removeDynamicAttributes();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TagType ElementName: xsd:string ElementType : example
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>example</code> element
    * @param example the value for the element <code>example</code> 
    * @return the current instance of <code>TagType<T></code> 
    */
   public TagType<T> example(String example);

   /**
    * Returns the <code>example</code> element
    * @return the node defined for the element <code>example</code> 
    */
   public String getExample();

   /**
    * Removes the <code>example</code> element 
    * @return the current instance of <code>TagType<T></code> 
    */
   public TagType<T> removeExample();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TagType ElementName: j2ee:tld-extensionType ElementType : tag-extension
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>tag-extension</code> element will be created and returned.
    * Otherwise, the first existing <code>tag-extension</code> element will be returned.
    * @return the instance defined for the element <code>tag-extension</code> 
    */
   public TldExtensionType<TagType<T>> getOrCreateTagExtension();

   /**
    * Creates a new <code>tag-extension</code> element 
    * @return the new created instance of <code>TldExtensionType<TagType<T>></code> 
    */
   public TldExtensionType<TagType<T>> createTagExtension();

   /**
    * Returns all <code>tag-extension</code> elements
    * @return list of <code>tag-extension</code> 
    */
   public List<TldExtensionType<TagType<T>>> getAllTagExtension();

   /**
    * Removes all <code>tag-extension</code> elements 
    * @return the current instance of <code>TldExtensionType<TagType<T>></code> 
    */
   public TagType<T> removeAllTagExtension();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TagType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>TagType<T></code> 
    */
   public TagType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>TagType<T></code> 
    */
   public TagType<T> removeId();
}
