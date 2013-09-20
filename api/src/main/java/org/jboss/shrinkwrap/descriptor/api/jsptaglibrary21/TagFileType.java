package org.jboss.shrinkwrap.descriptor.api.jsptaglibrary21; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.jsptaglibrary21.TldExtensionType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
/**
 * This interface defines the contract for the <code> tagFileType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface TagFileType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TagFileType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>TagFileType<T></code> 
    */
   public TagFileType<T> description(String ... values);

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>TagFileType<T></code> 
    */
   public TagFileType<T> removeAllDescription();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TagFileType ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>TagFileType<T></code> 
    */
   public TagFileType<T> displayName(String ... values);

   /**
    * Returns all <code>display-name</code> elements
    * @return list of <code>display-name</code> 
    */
   public List<String> getAllDisplayName();

   /**
    * Removes the <code>display-name</code> element 
    * @return the current instance of <code>TagFileType<T></code> 
    */
   public TagFileType<T> removeAllDisplayName();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TagFileType ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<TagFileType<T>> getOrCreateIcon();

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<TagFileType<T>></code> 
    */
   public IconType<TagFileType<T>> createIcon();

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<TagFileType<T>>> getAllIcon();

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<TagFileType<T>></code> 
    */
   public TagFileType<T> removeAllIcon();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TagFileType ElementName: javaee:xsdNMTOKENType ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> element
    * @param name the value for the element <code>name</code> 
    * @return the current instance of <code>TagFileType<T></code> 
    */
   public TagFileType<T> name(String name);

   /**
    * Returns the <code>name</code> element
    * @return the node defined for the element <code>name</code> 
    */
   public String getName();

   /**
    * Removes the <code>name</code> element 
    * @return the current instance of <code>TagFileType<T></code> 
    */
   public TagFileType<T> removeName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TagFileType ElementName: xsd:token ElementType : path
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>path</code> element
    * @param path the value for the element <code>path</code> 
    * @return the current instance of <code>TagFileType<T></code> 
    */
   public TagFileType<T> path(String path);

   /**
    * Returns the <code>path</code> element
    * @return the node defined for the element <code>path</code> 
    */
   public String getPath();

   /**
    * Removes the <code>path</code> element 
    * @return the current instance of <code>TagFileType<T></code> 
    */
   public TagFileType<T> removePath();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TagFileType ElementName: xsd:string ElementType : example
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>example</code> element
    * @param example the value for the element <code>example</code> 
    * @return the current instance of <code>TagFileType<T></code> 
    */
   public TagFileType<T> example(String example);

   /**
    * Returns the <code>example</code> element
    * @return the node defined for the element <code>example</code> 
    */
   public String getExample();

   /**
    * Removes the <code>example</code> element 
    * @return the current instance of <code>TagFileType<T></code> 
    */
   public TagFileType<T> removeExample();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TagFileType ElementName: javaee:tld-extensionType ElementType : tag-extension
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>tag-extension</code> element will be created and returned.
    * Otherwise, the first existing <code>tag-extension</code> element will be returned.
    * @return the instance defined for the element <code>tag-extension</code> 
    */
   public TldExtensionType<TagFileType<T>> getOrCreateTagExtension();

   /**
    * Creates a new <code>tag-extension</code> element 
    * @return the new created instance of <code>TldExtensionType<TagFileType<T>></code> 
    */
   public TldExtensionType<TagFileType<T>> createTagExtension();

   /**
    * Returns all <code>tag-extension</code> elements
    * @return list of <code>tag-extension</code> 
    */
   public List<TldExtensionType<TagFileType<T>>> getAllTagExtension();

   /**
    * Removes all <code>tag-extension</code> elements 
    * @return the current instance of <code>TldExtensionType<TagFileType<T>></code> 
    */
   public TagFileType<T> removeAllTagExtension();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TagFileType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>TagFileType<T></code> 
    */
   public TagFileType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>TagFileType<T></code> 
    */
   public TagFileType<T> removeId();
}
