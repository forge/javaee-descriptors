package org.jboss.shrinkwrap.descriptor.api.jsptaglibrary21; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.ListenerType;
/**
 * This interface defines the contract for the <code> tldTaglibType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface TldTaglibType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TldTaglibType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>TldTaglibType<T></code> 
    */
   public TldTaglibType<T> description(String ... values);

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>TldTaglibType<T></code> 
    */
   public TldTaglibType<T> removeAllDescription();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TldTaglibType ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>TldTaglibType<T></code> 
    */
   public TldTaglibType<T> displayName(String ... values);

   /**
    * Returns all <code>display-name</code> elements
    * @return list of <code>display-name</code> 
    */
   public List<String> getAllDisplayName();

   /**
    * Removes the <code>display-name</code> element 
    * @return the current instance of <code>TldTaglibType<T></code> 
    */
   public TldTaglibType<T> removeAllDisplayName();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TldTaglibType ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<TldTaglibType<T>> getOrCreateIcon();

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<TldTaglibType<T>></code> 
    */
   public IconType<TldTaglibType<T>> createIcon();

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<TldTaglibType<T>>> getAllIcon();

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<TldTaglibType<T>></code> 
    */
   public TldTaglibType<T> removeAllIcon();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TldTaglibType ElementName: xsd:token ElementType : tlib-version
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>tlib-version</code> element
    * @param tlibVersion the value for the element <code>tlib-version</code> 
    * @return the current instance of <code>TldTaglibType<T></code> 
    */
   public TldTaglibType<T> tlibVersion(String tlibVersion);

   /**
    * Returns the <code>tlib-version</code> element
    * @return the node defined for the element <code>tlib-version</code> 
    */
   public String getTlibVersion();

   /**
    * Removes the <code>tlib-version</code> element 
    * @return the current instance of <code>TldTaglibType<T></code> 
    */
   public TldTaglibType<T> removeTlibVersion();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TldTaglibType ElementName: javaee:xsdNMTOKENType ElementType : short-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>short-name</code> element
    * @param shortName the value for the element <code>short-name</code> 
    * @return the current instance of <code>TldTaglibType<T></code> 
    */
   public TldTaglibType<T> shortName(String shortName);

   /**
    * Returns the <code>short-name</code> element
    * @return the node defined for the element <code>short-name</code> 
    */
   public String getShortName();

   /**
    * Removes the <code>short-name</code> element 
    * @return the current instance of <code>TldTaglibType<T></code> 
    */
   public TldTaglibType<T> removeShortName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TldTaglibType ElementName: xsd:anyURI ElementType : uri
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>uri</code> element
    * @param uri the value for the element <code>uri</code> 
    * @return the current instance of <code>TldTaglibType<T></code> 
    */
   public TldTaglibType<T> uri(String uri);

   /**
    * Returns the <code>uri</code> element
    * @return the node defined for the element <code>uri</code> 
    */
   public String getUri();

   /**
    * Removes the <code>uri</code> element 
    * @return the current instance of <code>TldTaglibType<T></code> 
    */
   public TldTaglibType<T> removeUri();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TldTaglibType ElementName: javaee:validatorType ElementType : validator
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>validator</code> element with the given value will be created.
    * Otherwise, the existing <code>validator</code> element will be returned.
    * @return  a new or existing instance of <code>ValidatorType<TldTaglibType<T>></code> 
    */
   public ValidatorType<TldTaglibType<T>> getOrCreateValidator();

   /**
    * Removes the <code>validator</code> element 
    * @return the current instance of <code>TldTaglibType<T></code> 
    */
   public TldTaglibType<T> removeValidator();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TldTaglibType ElementName: javaee:listenerType ElementType : listener
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>listener</code> element will be created and returned.
    * Otherwise, the first existing <code>listener</code> element will be returned.
    * @return the instance defined for the element <code>listener</code> 
    */
   public ListenerType<TldTaglibType<T>> getOrCreateListener();

   /**
    * Creates a new <code>listener</code> element 
    * @return the new created instance of <code>ListenerType<TldTaglibType<T>></code> 
    */
   public ListenerType<TldTaglibType<T>> createListener();

   /**
    * Returns all <code>listener</code> elements
    * @return list of <code>listener</code> 
    */
   public List<ListenerType<TldTaglibType<T>>> getAllListener();

   /**
    * Removes all <code>listener</code> elements 
    * @return the current instance of <code>ListenerType<TldTaglibType<T>></code> 
    */
   public TldTaglibType<T> removeAllListener();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TldTaglibType ElementName: javaee:tagType ElementType : tag
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>tag</code> element will be created and returned.
    * Otherwise, the first existing <code>tag</code> element will be returned.
    * @return the instance defined for the element <code>tag</code> 
    */
   public TagType<TldTaglibType<T>> getOrCreateTag();

   /**
    * Creates a new <code>tag</code> element 
    * @return the new created instance of <code>TagType<TldTaglibType<T>></code> 
    */
   public TagType<TldTaglibType<T>> createTag();

   /**
    * Returns all <code>tag</code> elements
    * @return list of <code>tag</code> 
    */
   public List<TagType<TldTaglibType<T>>> getAllTag();

   /**
    * Removes all <code>tag</code> elements 
    * @return the current instance of <code>TagType<TldTaglibType<T>></code> 
    */
   public TldTaglibType<T> removeAllTag();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TldTaglibType ElementName: javaee:tagFileType ElementType : tag-file
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>tag-file</code> element will be created and returned.
    * Otherwise, the first existing <code>tag-file</code> element will be returned.
    * @return the instance defined for the element <code>tag-file</code> 
    */
   public TagFileType<TldTaglibType<T>> getOrCreateTagFile();

   /**
    * Creates a new <code>tag-file</code> element 
    * @return the new created instance of <code>TagFileType<TldTaglibType<T>></code> 
    */
   public TagFileType<TldTaglibType<T>> createTagFile();

   /**
    * Returns all <code>tag-file</code> elements
    * @return list of <code>tag-file</code> 
    */
   public List<TagFileType<TldTaglibType<T>>> getAllTagFile();

   /**
    * Removes all <code>tag-file</code> elements 
    * @return the current instance of <code>TagFileType<TldTaglibType<T>></code> 
    */
   public TldTaglibType<T> removeAllTagFile();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TldTaglibType ElementName: javaee:functionType ElementType : function
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>function</code> element will be created and returned.
    * Otherwise, the first existing <code>function</code> element will be returned.
    * @return the instance defined for the element <code>function</code> 
    */
   public FunctionType<TldTaglibType<T>> getOrCreateFunction();

   /**
    * Creates a new <code>function</code> element 
    * @return the new created instance of <code>FunctionType<TldTaglibType<T>></code> 
    */
   public FunctionType<TldTaglibType<T>> createFunction();

   /**
    * Returns all <code>function</code> elements
    * @return list of <code>function</code> 
    */
   public List<FunctionType<TldTaglibType<T>>> getAllFunction();

   /**
    * Removes all <code>function</code> elements 
    * @return the current instance of <code>FunctionType<TldTaglibType<T>></code> 
    */
   public TldTaglibType<T> removeAllFunction();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TldTaglibType ElementName: javaee:tld-extensionType ElementType : taglib-extension
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>taglib-extension</code> element will be created and returned.
    * Otherwise, the first existing <code>taglib-extension</code> element will be returned.
    * @return the instance defined for the element <code>taglib-extension</code> 
    */
   public TldExtensionType<TldTaglibType<T>> getOrCreateTaglibExtension();

   /**
    * Creates a new <code>taglib-extension</code> element 
    * @return the new created instance of <code>TldExtensionType<TldTaglibType<T>></code> 
    */
   public TldExtensionType<TldTaglibType<T>> createTaglibExtension();

   /**
    * Returns all <code>taglib-extension</code> elements
    * @return list of <code>taglib-extension</code> 
    */
   public List<TldExtensionType<TldTaglibType<T>>> getAllTaglibExtension();

   /**
    * Removes all <code>taglib-extension</code> elements 
    * @return the current instance of <code>TldExtensionType<TldTaglibType<T>></code> 
    */
   public TldTaglibType<T> removeAllTaglibExtension();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TldTaglibType ElementName: xsd:token ElementType : version
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   public static final String VERSION = "2.1";

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of <code>TldTaglibType<T></code> 
    */
   public TldTaglibType<T> version(String version);

   /**
    * Returns the <code>version</code> attribute
    * @return the value defined for the attribute <code>version</code> 
    */
   public String getVersion();

   /**
    * Removes the <code>version</code> attribute 
    * @return the current instance of <code>TldTaglibType<T></code> 
    */
   public TldTaglibType<T> removeVersion();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TldTaglibType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>TldTaglibType<T></code> 
    */
   public TldTaglibType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>TldTaglibType<T></code> 
    */
   public TldTaglibType<T> removeId();
}
