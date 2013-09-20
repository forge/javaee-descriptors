package org.jboss.shrinkwrap.descriptor.api.facelettaglibrary20; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.facelettaglibrary20.FaceletTaglibTagType;
import org.jboss.shrinkwrap.descriptor.api.facelettaglibrary20.FaceletTaglibFunctionType;
import org.jboss.shrinkwrap.descriptor.api.facelettaglibrary20.FaceletTaglibExtensionType;
import org.jboss.shrinkwrap.descriptor.api.facelettaglibrary20.FaceletTaglibVersionType;
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
 *     WebFacelettaglibraryDescriptor descriptor = Descriptors.create(WebFacelettaglibraryDescriptor.class);
 * </code> 
 *
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface WebFacelettaglibraryDescriptor extends Descriptor, DescriptorNamespace<WebFacelettaglibraryDescriptor>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFacelettaglibraryDescriptor ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>WebFacelettaglibraryDescriptor</code> 
    */
   public WebFacelettaglibraryDescriptor description(String ... values);

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>WebFacelettaglibraryDescriptor</code> 
    */
   public WebFacelettaglibraryDescriptor removeAllDescription();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFacelettaglibraryDescriptor ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>WebFacelettaglibraryDescriptor</code> 
    */
   public WebFacelettaglibraryDescriptor displayName(String ... values);

   /**
    * Returns all <code>display-name</code> elements
    * @return list of <code>display-name</code> 
    */
   public List<String> getAllDisplayName();

   /**
    * Removes the <code>display-name</code> element 
    * @return the current instance of <code>WebFacelettaglibraryDescriptor</code> 
    */
   public WebFacelettaglibraryDescriptor removeAllDisplayName();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFacelettaglibraryDescriptor ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<WebFacelettaglibraryDescriptor> getOrCreateIcon();

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<WebFacelettaglibraryDescriptor></code> 
    */
   public IconType<WebFacelettaglibraryDescriptor> createIcon();

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<WebFacelettaglibraryDescriptor>> getAllIcon();

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<WebFacelettaglibraryDescriptor></code> 
    */
   public WebFacelettaglibraryDescriptor removeAllIcon();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFacelettaglibraryDescriptor ElementName: xsd:token ElementType : library-class
   // MaxOccurs: -  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>library-class</code> element
    * @param libraryClass the value for the element <code>library-class</code> 
    * @return the current instance of <code>WebFacelettaglibraryDescriptor</code> 
    */
   public WebFacelettaglibraryDescriptor libraryClass(String libraryClass);

   /**
    * Returns the <code>library-class</code> element
    * @return the node defined for the element <code>library-class</code> 
    */
   public String getLibraryClass();

   /**
    * Removes the <code>library-class</code> element 
    * @return the current instance of <code>WebFacelettaglibraryDescriptor</code> 
    */
   public WebFacelettaglibraryDescriptor removeLibraryClass();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFacelettaglibraryDescriptor ElementName: xsd:token ElementType : namespace
   // MaxOccurs: -  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>namespace</code> element
    * @param namespace the value for the element <code>namespace</code> 
    * @return the current instance of <code>WebFacelettaglibraryDescriptor</code> 
    */
   public WebFacelettaglibraryDescriptor namespace(String namespace);

   /**
    * Returns the <code>namespace</code> element
    * @return the node defined for the element <code>namespace</code> 
    */
   public String getNamespace();

   /**
    * Removes the <code>namespace</code> element 
    * @return the current instance of <code>WebFacelettaglibraryDescriptor</code> 
    */
   public WebFacelettaglibraryDescriptor removeNamespace();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFacelettaglibraryDescriptor ElementName: xsd:token ElementType : composite-library-name
   // MaxOccurs: -1  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>composite-library-name</code> element
    * @param compositeLibraryName the value for the element <code>composite-library-name</code> 
    * @return the current instance of <code>WebFacelettaglibraryDescriptor</code> 
    */
   public WebFacelettaglibraryDescriptor compositeLibraryName(String compositeLibraryName);

   /**
    * Returns the <code>composite-library-name</code> element
    * @return the node defined for the element <code>composite-library-name</code> 
    */
   public String getCompositeLibraryName();

   /**
    * Removes the <code>composite-library-name</code> element 
    * @return the current instance of <code>WebFacelettaglibraryDescriptor</code> 
    */
   public WebFacelettaglibraryDescriptor removeCompositeLibraryName();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFacelettaglibraryDescriptor ElementName: javaee:facelet-taglib-tagType ElementType : tag
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>tag</code> element will be created and returned.
    * Otherwise, the first existing <code>tag</code> element will be returned.
    * @return the instance defined for the element <code>tag</code> 
    */
   public FaceletTaglibTagType<WebFacelettaglibraryDescriptor> getOrCreateTag();

   /**
    * Creates a new <code>tag</code> element 
    * @return the new created instance of <code>FaceletTaglibTagType<WebFacelettaglibraryDescriptor></code> 
    */
   public FaceletTaglibTagType<WebFacelettaglibraryDescriptor> createTag();

   /**
    * Returns all <code>tag</code> elements
    * @return list of <code>tag</code> 
    */
   public List<FaceletTaglibTagType<WebFacelettaglibraryDescriptor>> getAllTag();

   /**
    * Removes all <code>tag</code> elements 
    * @return the current instance of <code>FaceletTaglibTagType<WebFacelettaglibraryDescriptor></code> 
    */
   public WebFacelettaglibraryDescriptor removeAllTag();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFacelettaglibraryDescriptor ElementName: javaee:facelet-taglib-functionType ElementType : function
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>function</code> element will be created and returned.
    * Otherwise, the first existing <code>function</code> element will be returned.
    * @return the instance defined for the element <code>function</code> 
    */
   public FaceletTaglibFunctionType<WebFacelettaglibraryDescriptor> getOrCreateFunction();

   /**
    * Creates a new <code>function</code> element 
    * @return the new created instance of <code>FaceletTaglibFunctionType<WebFacelettaglibraryDescriptor></code> 
    */
   public FaceletTaglibFunctionType<WebFacelettaglibraryDescriptor> createFunction();

   /**
    * Returns all <code>function</code> elements
    * @return list of <code>function</code> 
    */
   public List<FaceletTaglibFunctionType<WebFacelettaglibraryDescriptor>> getAllFunction();

   /**
    * Removes all <code>function</code> elements 
    * @return the current instance of <code>FaceletTaglibFunctionType<WebFacelettaglibraryDescriptor></code> 
    */
   public WebFacelettaglibraryDescriptor removeAllFunction();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFacelettaglibraryDescriptor ElementName: javaee:facelet-taglib-extensionType ElementType : taglib-extension
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>taglib-extension</code> element 
    * @return the current instance of <code>WebFacelettaglibraryDescriptor</code> 
    */
   public WebFacelettaglibraryDescriptor taglibExtension();

   /**
    * Removes the <code>taglib-extension</code> element 
    * @return the current instance of <code>WebFacelettaglibraryDescriptor</code> 
    */
   public Boolean isTaglibExtension();

   /**
    * Removes the <code>taglib-extension</code> element 
    * @return the current instance of <code>WebFacelettaglibraryDescriptor</code> 
    */
   public WebFacelettaglibraryDescriptor removeTaglibExtension();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFacelettaglibraryDescriptor ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: false   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>WebFacelettaglibraryDescriptor</code> 
    */
   public WebFacelettaglibraryDescriptor id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>WebFacelettaglibraryDescriptor</code> 
    */
   public WebFacelettaglibraryDescriptor removeId();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFacelettaglibraryDescriptor ElementName: javaee:facelet-taglib-versionType ElementType : version
   // MaxOccurs: -  isGeneric: false   isAttribute: true isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of <code>WebFacelettaglibraryDescriptor</code> 
    */
   public WebFacelettaglibraryDescriptor version(FaceletTaglibVersionType version);

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of <code>WebFacelettaglibraryDescriptor</code> 
    */
   public WebFacelettaglibraryDescriptor version(String version);

   /**
    * Returns the <code>version</code> attribute
    * @return the value defined for the attribute <code>version</code> 
    */
public FaceletTaglibVersionType getVersion();

   /**
    * Returns the <code>version</code> attribute
    * @return the value found for the element <code>version</code> 
    */
   public String  getVersionAsString();

   /**
    * Removes the <code>version</code> attribute 
    * @return the current instance of <code>WebFacelettaglibraryDescriptor</code> 
    */
   public WebFacelettaglibraryDescriptor removeVersion();
}
