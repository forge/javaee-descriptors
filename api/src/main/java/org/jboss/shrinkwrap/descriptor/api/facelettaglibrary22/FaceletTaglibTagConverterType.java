package org.jboss.shrinkwrap.descriptor.api.facelettaglibrary22; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.facelettaglibrary22.FaceletTaglibTagConverterExtensionType;
import org.jboss.shrinkwrap.descriptor.api.javaee7.IconType;
/**
 * This interface defines the contract for the <code> facelet-taglib-tag-converterType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface FaceletTaglibTagConverterType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibTagConverterType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>FaceletTaglibTagConverterType<T></code> 
    */
   public FaceletTaglibTagConverterType<T> description(String ... values);

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>FaceletTaglibTagConverterType<T></code> 
    */
   public FaceletTaglibTagConverterType<T> removeAllDescription();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibTagConverterType ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>FaceletTaglibTagConverterType<T></code> 
    */
   public FaceletTaglibTagConverterType<T> displayName(String ... values);

   /**
    * Returns all <code>display-name</code> elements
    * @return list of <code>display-name</code> 
    */
   public List<String> getAllDisplayName();

   /**
    * Removes the <code>display-name</code> element 
    * @return the current instance of <code>FaceletTaglibTagConverterType<T></code> 
    */
   public FaceletTaglibTagConverterType<T> removeAllDisplayName();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibTagConverterType ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<FaceletTaglibTagConverterType<T>> getOrCreateIcon();

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<FaceletTaglibTagConverterType<T>></code> 
    */
   public IconType<FaceletTaglibTagConverterType<T>> createIcon();

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<FaceletTaglibTagConverterType<T>>> getAllIcon();

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<FaceletTaglibTagConverterType<T>></code> 
    */
   public FaceletTaglibTagConverterType<T> removeAllIcon();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibTagConverterType ElementName: xsd:token ElementType : converter-id
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>converter-id</code> element
    * @param converterId the value for the element <code>converter-id</code> 
    * @return the current instance of <code>FaceletTaglibTagConverterType<T></code> 
    */
   public FaceletTaglibTagConverterType<T> converterId(String converterId);

   /**
    * Returns the <code>converter-id</code> element
    * @return the node defined for the element <code>converter-id</code> 
    */
   public String getConverterId();

   /**
    * Removes the <code>converter-id</code> element 
    * @return the current instance of <code>FaceletTaglibTagConverterType<T></code> 
    */
   public FaceletTaglibTagConverterType<T> removeConverterId();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibTagConverterType ElementName: xsd:token ElementType : handler-class
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>handler-class</code> element
    * @param handlerClass the value for the element <code>handler-class</code> 
    * @return the current instance of <code>FaceletTaglibTagConverterType<T></code> 
    */
   public FaceletTaglibTagConverterType<T> handlerClass(String handlerClass);

   /**
    * Returns the <code>handler-class</code> element
    * @return the node defined for the element <code>handler-class</code> 
    */
   public String getHandlerClass();

   /**
    * Removes the <code>handler-class</code> element 
    * @return the current instance of <code>FaceletTaglibTagConverterType<T></code> 
    */
   public FaceletTaglibTagConverterType<T> removeHandlerClass();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibTagConverterType ElementName: javaee:facelet-taglib-tag-converter-extensionType ElementType : converter-extension
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>converter-extension</code> element 
    * @return the current instance of <code>FaceletTaglibTagConverterType<T></code> 
    */
   public FaceletTaglibTagConverterType<T> converterExtension();

   /**
    * Removes the <code>converter-extension</code> element 
    * @return the current instance of <code>FaceletTaglibTagConverterType<T></code> 
    */
   public Boolean isConverterExtension();

   /**
    * Removes the <code>converter-extension</code> element 
    * @return the current instance of <code>FaceletTaglibTagConverterType<T></code> 
    */
   public FaceletTaglibTagConverterType<T> removeConverterExtension();
}
