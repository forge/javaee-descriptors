package org.jboss.shrinkwrap.descriptor.api.facelettaglibrary20; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
/**
 * This interface defines the contract for the <code> facelet-taglibType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface FaceletTaglibType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>FaceletTaglibType<T></code> 
    */
   public FaceletTaglibType<T> description(String ... values);

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>FaceletTaglibType<T></code> 
    */
   public FaceletTaglibType<T> removeAllDescription();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibType ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>FaceletTaglibType<T></code> 
    */
   public FaceletTaglibType<T> displayName(String ... values);

   /**
    * Returns all <code>display-name</code> elements
    * @return list of <code>display-name</code> 
    */
   public List<String> getAllDisplayName();

   /**
    * Removes the <code>display-name</code> element 
    * @return the current instance of <code>FaceletTaglibType<T></code> 
    */
   public FaceletTaglibType<T> removeAllDisplayName();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibType ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<FaceletTaglibType<T>> getOrCreateIcon();

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<FaceletTaglibType<T>></code> 
    */
   public IconType<FaceletTaglibType<T>> createIcon();

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<FaceletTaglibType<T>>> getAllIcon();

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<FaceletTaglibType<T>></code> 
    */
   public FaceletTaglibType<T> removeAllIcon();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibType ElementName: xsd:token ElementType : library-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>library-class</code> element
    * @param libraryClass the value for the element <code>library-class</code> 
    * @return the current instance of <code>FaceletTaglibType<T></code> 
    */
   public FaceletTaglibType<T> libraryClass(String libraryClass);

   /**
    * Returns the <code>library-class</code> element
    * @return the node defined for the element <code>library-class</code> 
    */
   public String getLibraryClass();

   /**
    * Removes the <code>library-class</code> element 
    * @return the current instance of <code>FaceletTaglibType<T></code> 
    */
   public FaceletTaglibType<T> removeLibraryClass();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibType ElementName: xsd:token ElementType : namespace
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>namespace</code> element
    * @param namespace the value for the element <code>namespace</code> 
    * @return the current instance of <code>FaceletTaglibType<T></code> 
    */
   public FaceletTaglibType<T> namespace(String namespace);

   /**
    * Returns the <code>namespace</code> element
    * @return the node defined for the element <code>namespace</code> 
    */
   public String getNamespace();

   /**
    * Removes the <code>namespace</code> element 
    * @return the current instance of <code>FaceletTaglibType<T></code> 
    */
   public FaceletTaglibType<T> removeNamespace();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibType ElementName: xsd:token ElementType : composite-library-name
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>composite-library-name</code> element
    * @param compositeLibraryName the value for the element <code>composite-library-name</code> 
    * @return the current instance of <code>FaceletTaglibType<T></code> 
    */
   public FaceletTaglibType<T> compositeLibraryName(String compositeLibraryName);

   /**
    * Returns the <code>composite-library-name</code> element
    * @return the node defined for the element <code>composite-library-name</code> 
    */
   public String getCompositeLibraryName();

   /**
    * Removes the <code>composite-library-name</code> element 
    * @return the current instance of <code>FaceletTaglibType<T></code> 
    */
   public FaceletTaglibType<T> removeCompositeLibraryName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibType ElementName: javaee:facelet-taglib-tagType ElementType : tag
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>tag</code> element will be created and returned.
    * Otherwise, the first existing <code>tag</code> element will be returned.
    * @return the instance defined for the element <code>tag</code> 
    */
   public FaceletTaglibTagType<FaceletTaglibType<T>> getOrCreateTag();

   /**
    * Creates a new <code>tag</code> element 
    * @return the new created instance of <code>FaceletTaglibTagType<FaceletTaglibType<T>></code> 
    */
   public FaceletTaglibTagType<FaceletTaglibType<T>> createTag();

   /**
    * Returns all <code>tag</code> elements
    * @return list of <code>tag</code> 
    */
   public List<FaceletTaglibTagType<FaceletTaglibType<T>>> getAllTag();

   /**
    * Removes all <code>tag</code> elements 
    * @return the current instance of <code>FaceletTaglibTagType<FaceletTaglibType<T>></code> 
    */
   public FaceletTaglibType<T> removeAllTag();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibType ElementName: javaee:facelet-taglib-functionType ElementType : function
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>function</code> element will be created and returned.
    * Otherwise, the first existing <code>function</code> element will be returned.
    * @return the instance defined for the element <code>function</code> 
    */
   public FaceletTaglibFunctionType<FaceletTaglibType<T>> getOrCreateFunction();

   /**
    * Creates a new <code>function</code> element 
    * @return the new created instance of <code>FaceletTaglibFunctionType<FaceletTaglibType<T>></code> 
    */
   public FaceletTaglibFunctionType<FaceletTaglibType<T>> createFunction();

   /**
    * Returns all <code>function</code> elements
    * @return list of <code>function</code> 
    */
   public List<FaceletTaglibFunctionType<FaceletTaglibType<T>>> getAllFunction();

   /**
    * Removes all <code>function</code> elements 
    * @return the current instance of <code>FaceletTaglibFunctionType<FaceletTaglibType<T>></code> 
    */
   public FaceletTaglibType<T> removeAllFunction();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibType ElementName: javaee:facelet-taglib-extensionType ElementType : taglib-extension
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>taglib-extension</code> element 
    * @return the current instance of <code>FaceletTaglibType<T></code> 
    */
   public FaceletTaglibType<T> taglibExtension();

   /**
    * Removes the <code>taglib-extension</code> element 
    * @return the current instance of <code>FaceletTaglibType<T></code> 
    */
   public Boolean isTaglibExtension();

   /**
    * Removes the <code>taglib-extension</code> element 
    * @return the current instance of <code>FaceletTaglibType<T></code> 
    */
   public FaceletTaglibType<T> removeTaglibExtension();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>FaceletTaglibType<T></code> 
    */
   public FaceletTaglibType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>FaceletTaglibType<T></code> 
    */
   public FaceletTaglibType<T> removeId();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibType ElementName: javaee:facelet-taglib-versionType ElementType : version
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of <code>FaceletTaglibType<T></code> 
    */
   public FaceletTaglibType<T> version(FaceletTaglibVersionType version);

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of <code>FaceletTaglibType<T></code> 
    */
   public FaceletTaglibType<T> version(String version);

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
    * @return the current instance of <code>FaceletTaglibType<T></code> 
    */
   public FaceletTaglibType<T> removeVersion();
}
