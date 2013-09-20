package org.jboss.shrinkwrap.descriptor.api.jsptaglibrary21; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.jsptaglibrary21.ValidatorType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.ListenerType;
import org.jboss.shrinkwrap.descriptor.api.jsptaglibrary21.TagType;
import org.jboss.shrinkwrap.descriptor.api.jsptaglibrary21.TagFileType;
import org.jboss.shrinkwrap.descriptor.api.jsptaglibrary21.FunctionType;
import org.jboss.shrinkwrap.descriptor.api.jsptaglibrary21.TldExtensionType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
import org.jboss.shrinkwrap.descriptor.api.Descriptor;
import org.jboss.shrinkwrap.descriptor.api.DescriptorNamespace;

/** 
 * <p> 
 * This deployment descriptor provides the functionalities as described in the  specification
 * <p> 
 * Example:
 * <p> 
 * <code> 
 *     WebJsptaglibraryDescriptor descriptor = Descriptors.create(WebJsptaglibraryDescriptor.class);
 * </code> 
 *
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface WebJsptaglibraryDescriptor extends Descriptor, DescriptorNamespace<WebJsptaglibraryDescriptor>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebJsptaglibraryDescriptor ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>WebJsptaglibraryDescriptor</code> 
    */
   public WebJsptaglibraryDescriptor description(String ... values);

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>WebJsptaglibraryDescriptor</code> 
    */
   public WebJsptaglibraryDescriptor removeAllDescription();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebJsptaglibraryDescriptor ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>WebJsptaglibraryDescriptor</code> 
    */
   public WebJsptaglibraryDescriptor displayName(String ... values);

   /**
    * Returns all <code>display-name</code> elements
    * @return list of <code>display-name</code> 
    */
   public List<String> getAllDisplayName();

   /**
    * Removes the <code>display-name</code> element 
    * @return the current instance of <code>WebJsptaglibraryDescriptor</code> 
    */
   public WebJsptaglibraryDescriptor removeAllDisplayName();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebJsptaglibraryDescriptor ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<WebJsptaglibraryDescriptor> getOrCreateIcon();

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<WebJsptaglibraryDescriptor></code> 
    */
   public IconType<WebJsptaglibraryDescriptor> createIcon();

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<WebJsptaglibraryDescriptor>> getAllIcon();

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<WebJsptaglibraryDescriptor></code> 
    */
   public WebJsptaglibraryDescriptor removeAllIcon();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebJsptaglibraryDescriptor ElementName: xsd:token ElementType : tlib-version
   // MaxOccurs: -  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>tlib-version</code> element
    * @param tlibVersion the value for the element <code>tlib-version</code> 
    * @return the current instance of <code>WebJsptaglibraryDescriptor</code> 
    */
   public WebJsptaglibraryDescriptor tlibVersion(String tlibVersion);

   /**
    * Returns the <code>tlib-version</code> element
    * @return the node defined for the element <code>tlib-version</code> 
    */
   public String getTlibVersion();

   /**
    * Removes the <code>tlib-version</code> element 
    * @return the current instance of <code>WebJsptaglibraryDescriptor</code> 
    */
   public WebJsptaglibraryDescriptor removeTlibVersion();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebJsptaglibraryDescriptor ElementName: javaee:xsdNMTOKENType ElementType : short-name
   // MaxOccurs: -  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>short-name</code> element
    * @param shortName the value for the element <code>short-name</code> 
    * @return the current instance of <code>WebJsptaglibraryDescriptor</code> 
    */
   public WebJsptaglibraryDescriptor shortName(String shortName);

   /**
    * Returns the <code>short-name</code> element
    * @return the node defined for the element <code>short-name</code> 
    */
   public String getShortName();

   /**
    * Removes the <code>short-name</code> element 
    * @return the current instance of <code>WebJsptaglibraryDescriptor</code> 
    */
   public WebJsptaglibraryDescriptor removeShortName();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebJsptaglibraryDescriptor ElementName: xsd:anyURI ElementType : uri
   // MaxOccurs: -  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>uri</code> element
    * @param uri the value for the element <code>uri</code> 
    * @return the current instance of <code>WebJsptaglibraryDescriptor</code> 
    */
   public WebJsptaglibraryDescriptor uri(String uri);

   /**
    * Returns the <code>uri</code> element
    * @return the node defined for the element <code>uri</code> 
    */
   public String getUri();

   /**
    * Removes the <code>uri</code> element 
    * @return the current instance of <code>WebJsptaglibraryDescriptor</code> 
    */
   public WebJsptaglibraryDescriptor removeUri();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebJsptaglibraryDescriptor ElementName: javaee:validatorType ElementType : validator
   // MaxOccurs: -  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>validator</code> element with the given value will be created.
    * Otherwise, the existing <code>validator</code> element will be returned.
    * @return  a new or existing instance of <code>ValidatorType<WebJsptaglibraryDescriptor></code> 
    */
   public ValidatorType<WebJsptaglibraryDescriptor> getOrCreateValidator();

   /**
    * Removes the <code>validator</code> element 
    * @return the current instance of <code>WebJsptaglibraryDescriptor</code> 
    */
   public WebJsptaglibraryDescriptor removeValidator();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebJsptaglibraryDescriptor ElementName: javaee:listenerType ElementType : listener
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>listener</code> element will be created and returned.
    * Otherwise, the first existing <code>listener</code> element will be returned.
    * @return the instance defined for the element <code>listener</code> 
    */
   public ListenerType<WebJsptaglibraryDescriptor> getOrCreateListener();

   /**
    * Creates a new <code>listener</code> element 
    * @return the new created instance of <code>ListenerType<WebJsptaglibraryDescriptor></code> 
    */
   public ListenerType<WebJsptaglibraryDescriptor> createListener();

   /**
    * Returns all <code>listener</code> elements
    * @return list of <code>listener</code> 
    */
   public List<ListenerType<WebJsptaglibraryDescriptor>> getAllListener();

   /**
    * Removes all <code>listener</code> elements 
    * @return the current instance of <code>ListenerType<WebJsptaglibraryDescriptor></code> 
    */
   public WebJsptaglibraryDescriptor removeAllListener();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebJsptaglibraryDescriptor ElementName: javaee:tagType ElementType : tag
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>tag</code> element will be created and returned.
    * Otherwise, the first existing <code>tag</code> element will be returned.
    * @return the instance defined for the element <code>tag</code> 
    */
   public TagType<WebJsptaglibraryDescriptor> getOrCreateTag();

   /**
    * Creates a new <code>tag</code> element 
    * @return the new created instance of <code>TagType<WebJsptaglibraryDescriptor></code> 
    */
   public TagType<WebJsptaglibraryDescriptor> createTag();

   /**
    * Returns all <code>tag</code> elements
    * @return list of <code>tag</code> 
    */
   public List<TagType<WebJsptaglibraryDescriptor>> getAllTag();

   /**
    * Removes all <code>tag</code> elements 
    * @return the current instance of <code>TagType<WebJsptaglibraryDescriptor></code> 
    */
   public WebJsptaglibraryDescriptor removeAllTag();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebJsptaglibraryDescriptor ElementName: javaee:tagFileType ElementType : tag-file
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>tag-file</code> element will be created and returned.
    * Otherwise, the first existing <code>tag-file</code> element will be returned.
    * @return the instance defined for the element <code>tag-file</code> 
    */
   public TagFileType<WebJsptaglibraryDescriptor> getOrCreateTagFile();

   /**
    * Creates a new <code>tag-file</code> element 
    * @return the new created instance of <code>TagFileType<WebJsptaglibraryDescriptor></code> 
    */
   public TagFileType<WebJsptaglibraryDescriptor> createTagFile();

   /**
    * Returns all <code>tag-file</code> elements
    * @return list of <code>tag-file</code> 
    */
   public List<TagFileType<WebJsptaglibraryDescriptor>> getAllTagFile();

   /**
    * Removes all <code>tag-file</code> elements 
    * @return the current instance of <code>TagFileType<WebJsptaglibraryDescriptor></code> 
    */
   public WebJsptaglibraryDescriptor removeAllTagFile();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebJsptaglibraryDescriptor ElementName: javaee:functionType ElementType : function
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>function</code> element will be created and returned.
    * Otherwise, the first existing <code>function</code> element will be returned.
    * @return the instance defined for the element <code>function</code> 
    */
   public FunctionType<WebJsptaglibraryDescriptor> getOrCreateFunction();

   /**
    * Creates a new <code>function</code> element 
    * @return the new created instance of <code>FunctionType<WebJsptaglibraryDescriptor></code> 
    */
   public FunctionType<WebJsptaglibraryDescriptor> createFunction();

   /**
    * Returns all <code>function</code> elements
    * @return list of <code>function</code> 
    */
   public List<FunctionType<WebJsptaglibraryDescriptor>> getAllFunction();

   /**
    * Removes all <code>function</code> elements 
    * @return the current instance of <code>FunctionType<WebJsptaglibraryDescriptor></code> 
    */
   public WebJsptaglibraryDescriptor removeAllFunction();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebJsptaglibraryDescriptor ElementName: javaee:tld-extensionType ElementType : taglib-extension
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>taglib-extension</code> element will be created and returned.
    * Otherwise, the first existing <code>taglib-extension</code> element will be returned.
    * @return the instance defined for the element <code>taglib-extension</code> 
    */
   public TldExtensionType<WebJsptaglibraryDescriptor> getOrCreateTaglibExtension();

   /**
    * Creates a new <code>taglib-extension</code> element 
    * @return the new created instance of <code>TldExtensionType<WebJsptaglibraryDescriptor></code> 
    */
   public TldExtensionType<WebJsptaglibraryDescriptor> createTaglibExtension();

   /**
    * Returns all <code>taglib-extension</code> elements
    * @return list of <code>taglib-extension</code> 
    */
   public List<TldExtensionType<WebJsptaglibraryDescriptor>> getAllTaglibExtension();

   /**
    * Removes all <code>taglib-extension</code> elements 
    * @return the current instance of <code>TldExtensionType<WebJsptaglibraryDescriptor></code> 
    */
   public WebJsptaglibraryDescriptor removeAllTaglibExtension();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebJsptaglibraryDescriptor ElementName: xsd:token ElementType : version
   // MaxOccurs: -  isGeneric: false   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   public static final String VERSION = "2.1";

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of <code>WebJsptaglibraryDescriptor</code> 
    */
   public WebJsptaglibraryDescriptor version(String version);

   /**
    * Returns the <code>version</code> attribute
    * @return the value defined for the attribute <code>version</code> 
    */
   public String getVersion();

   /**
    * Removes the <code>version</code> attribute 
    * @return the current instance of <code>WebJsptaglibraryDescriptor</code> 
    */
   public WebJsptaglibraryDescriptor removeVersion();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebJsptaglibraryDescriptor ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: false   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>WebJsptaglibraryDescriptor</code> 
    */
   public WebJsptaglibraryDescriptor id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>WebJsptaglibraryDescriptor</code> 
    */
   public WebJsptaglibraryDescriptor removeId();
}
