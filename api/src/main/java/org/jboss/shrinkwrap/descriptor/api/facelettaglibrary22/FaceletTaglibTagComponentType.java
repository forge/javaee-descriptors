package org.jboss.shrinkwrap.descriptor.api.facelettaglibrary22; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee7.IconType;
/**
 * This interface defines the contract for the <code> facelet-taglib-tag-componentType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface FaceletTaglibTagComponentType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibTagComponentType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>FaceletTaglibTagComponentType<T></code> 
    */
   public FaceletTaglibTagComponentType<T> description(String ... values);

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>FaceletTaglibTagComponentType<T></code> 
    */
   public FaceletTaglibTagComponentType<T> removeAllDescription();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibTagComponentType ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>FaceletTaglibTagComponentType<T></code> 
    */
   public FaceletTaglibTagComponentType<T> displayName(String ... values);

   /**
    * Returns all <code>display-name</code> elements
    * @return list of <code>display-name</code> 
    */
   public List<String> getAllDisplayName();

   /**
    * Removes the <code>display-name</code> element 
    * @return the current instance of <code>FaceletTaglibTagComponentType<T></code> 
    */
   public FaceletTaglibTagComponentType<T> removeAllDisplayName();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibTagComponentType ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<FaceletTaglibTagComponentType<T>> getOrCreateIcon();

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<FaceletTaglibTagComponentType<T>></code> 
    */
   public IconType<FaceletTaglibTagComponentType<T>> createIcon();

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<FaceletTaglibTagComponentType<T>>> getAllIcon();

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<FaceletTaglibTagComponentType<T>></code> 
    */
   public FaceletTaglibTagComponentType<T> removeAllIcon();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibTagComponentType ElementName: xsd:token ElementType : component-type
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>component-type</code> elements, 
    * a new <code>component-type</code> element 
    * @param values list of <code>component-type</code> objects 
    * @return the current instance of <code>FaceletTaglibTagComponentType<T></code> 
    */
   public FaceletTaglibTagComponentType<T> componentType(String ... values);

   /**
    * Returns all <code>component-type</code> elements
    * @return list of <code>component-type</code> 
    */
   public List<String> getAllComponentType();

   /**
    * Removes the <code>component-type</code> element 
    * @return the current instance of <code>FaceletTaglibTagComponentType<T></code> 
    */
   public FaceletTaglibTagComponentType<T> removeAllComponentType();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibTagComponentType ElementName: xsd:token ElementType : resource-id
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>resource-id</code> elements, 
    * a new <code>resource-id</code> element 
    * @param values list of <code>resource-id</code> objects 
    * @return the current instance of <code>FaceletTaglibTagComponentType<T></code> 
    */
   public FaceletTaglibTagComponentType<T> resourceId(String ... values);

   /**
    * Returns all <code>resource-id</code> elements
    * @return list of <code>resource-id</code> 
    */
   public List<String> getAllResourceId();

   /**
    * Removes the <code>resource-id</code> element 
    * @return the current instance of <code>FaceletTaglibTagComponentType<T></code> 
    */
   public FaceletTaglibTagComponentType<T> removeAllResourceId();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibTagComponentType ElementName: xsd:token ElementType : handler-class
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>handler-class</code> elements, 
    * a new <code>handler-class</code> element 
    * @param values list of <code>handler-class</code> objects 
    * @return the current instance of <code>FaceletTaglibTagComponentType<T></code> 
    */
   public FaceletTaglibTagComponentType<T> handlerClass(String ... values);

   /**
    * Returns all <code>handler-class</code> elements
    * @return list of <code>handler-class</code> 
    */
   public List<String> getAllHandlerClass();

   /**
    * Removes the <code>handler-class</code> element 
    * @return the current instance of <code>FaceletTaglibTagComponentType<T></code> 
    */
   public FaceletTaglibTagComponentType<T> removeAllHandlerClass();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibTagComponentType ElementName: xsd:token ElementType : renderer-type
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>renderer-type</code> element
    * @param rendererType the value for the element <code>renderer-type</code> 
    * @return the current instance of <code>FaceletTaglibTagComponentType<T></code> 
    */
   public FaceletTaglibTagComponentType<T> rendererType(String rendererType);

   /**
    * Returns the <code>renderer-type</code> element
    * @return the node defined for the element <code>renderer-type</code> 
    */
   public String getRendererType();

   /**
    * Removes the <code>renderer-type</code> element 
    * @return the current instance of <code>FaceletTaglibTagComponentType<T></code> 
    */
   public FaceletTaglibTagComponentType<T> removeRendererType();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibTagComponentType ElementName: javaee:facelet-taglib-tag-component-extensionType ElementType : component-extension
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>component-extension</code> element 
    * @return the current instance of <code>FaceletTaglibTagComponentType<T></code> 
    */
   public FaceletTaglibTagComponentType<T> componentExtension();

   /**
    * Removes the <code>component-extension</code> element 
    * @return the current instance of <code>FaceletTaglibTagComponentType<T></code> 
    */
   public Boolean isComponentExtension();

   /**
    * Removes the <code>component-extension</code> element 
    * @return the current instance of <code>FaceletTaglibTagComponentType<T></code> 
    */
   public FaceletTaglibTagComponentType<T> removeComponentExtension();
}
