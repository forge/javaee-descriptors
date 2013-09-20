package org.jboss.shrinkwrap.descriptor.api.facesconfig22; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigRendererType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigClientBehaviorRendererType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigRenderKitExtensionType;
import org.jboss.shrinkwrap.descriptor.api.javaee7.IconType;
/**
 * This interface defines the contract for the <code> faces-config-render-kitType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface FacesConfigRenderKitType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigRenderKitType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>FacesConfigRenderKitType<T></code> 
    */
   public FacesConfigRenderKitType<T> description(String ... values);

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>FacesConfigRenderKitType<T></code> 
    */
   public FacesConfigRenderKitType<T> removeAllDescription();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigRenderKitType ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>FacesConfigRenderKitType<T></code> 
    */
   public FacesConfigRenderKitType<T> displayName(String ... values);

   /**
    * Returns all <code>display-name</code> elements
    * @return list of <code>display-name</code> 
    */
   public List<String> getAllDisplayName();

   /**
    * Removes the <code>display-name</code> element 
    * @return the current instance of <code>FacesConfigRenderKitType<T></code> 
    */
   public FacesConfigRenderKitType<T> removeAllDisplayName();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigRenderKitType ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<FacesConfigRenderKitType<T>> getOrCreateIcon();

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<FacesConfigRenderKitType<T>></code> 
    */
   public IconType<FacesConfigRenderKitType<T>> createIcon();

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<FacesConfigRenderKitType<T>>> getAllIcon();

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<FacesConfigRenderKitType<T>></code> 
    */
   public FacesConfigRenderKitType<T> removeAllIcon();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigRenderKitType ElementName: xsd:token ElementType : render-kit-id
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>render-kit-id</code> element
    * @param renderKitId the value for the element <code>render-kit-id</code> 
    * @return the current instance of <code>FacesConfigRenderKitType<T></code> 
    */
   public FacesConfigRenderKitType<T> renderKitId(String renderKitId);

   /**
    * Returns the <code>render-kit-id</code> element
    * @return the node defined for the element <code>render-kit-id</code> 
    */
   public String getRenderKitId();

   /**
    * Removes the <code>render-kit-id</code> element 
    * @return the current instance of <code>FacesConfigRenderKitType<T></code> 
    */
   public FacesConfigRenderKitType<T> removeRenderKitId();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigRenderKitType ElementName: xsd:token ElementType : render-kit-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>render-kit-class</code> element
    * @param renderKitClass the value for the element <code>render-kit-class</code> 
    * @return the current instance of <code>FacesConfigRenderKitType<T></code> 
    */
   public FacesConfigRenderKitType<T> renderKitClass(String renderKitClass);

   /**
    * Returns the <code>render-kit-class</code> element
    * @return the node defined for the element <code>render-kit-class</code> 
    */
   public String getRenderKitClass();

   /**
    * Removes the <code>render-kit-class</code> element 
    * @return the current instance of <code>FacesConfigRenderKitType<T></code> 
    */
   public FacesConfigRenderKitType<T> removeRenderKitClass();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigRenderKitType ElementName: javaee:faces-config-rendererType ElementType : renderer
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>renderer</code> element will be created and returned.
    * Otherwise, the first existing <code>renderer</code> element will be returned.
    * @return the instance defined for the element <code>renderer</code> 
    */
   public FacesConfigRendererType<FacesConfigRenderKitType<T>> getOrCreateRenderer();

   /**
    * Creates a new <code>renderer</code> element 
    * @return the new created instance of <code>FacesConfigRendererType<FacesConfigRenderKitType<T>></code> 
    */
   public FacesConfigRendererType<FacesConfigRenderKitType<T>> createRenderer();

   /**
    * Returns all <code>renderer</code> elements
    * @return list of <code>renderer</code> 
    */
   public List<FacesConfigRendererType<FacesConfigRenderKitType<T>>> getAllRenderer();

   /**
    * Removes all <code>renderer</code> elements 
    * @return the current instance of <code>FacesConfigRendererType<FacesConfigRenderKitType<T>></code> 
    */
   public FacesConfigRenderKitType<T> removeAllRenderer();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigRenderKitType ElementName: javaee:faces-config-client-behavior-rendererType ElementType : client-behavior-renderer
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>client-behavior-renderer</code> element will be created and returned.
    * Otherwise, the first existing <code>client-behavior-renderer</code> element will be returned.
    * @return the instance defined for the element <code>client-behavior-renderer</code> 
    */
   public FacesConfigClientBehaviorRendererType<FacesConfigRenderKitType<T>> getOrCreateClientBehaviorRenderer();

   /**
    * Creates a new <code>client-behavior-renderer</code> element 
    * @return the new created instance of <code>FacesConfigClientBehaviorRendererType<FacesConfigRenderKitType<T>></code> 
    */
   public FacesConfigClientBehaviorRendererType<FacesConfigRenderKitType<T>> createClientBehaviorRenderer();

   /**
    * Returns all <code>client-behavior-renderer</code> elements
    * @return list of <code>client-behavior-renderer</code> 
    */
   public List<FacesConfigClientBehaviorRendererType<FacesConfigRenderKitType<T>>> getAllClientBehaviorRenderer();

   /**
    * Removes all <code>client-behavior-renderer</code> elements 
    * @return the current instance of <code>FacesConfigClientBehaviorRendererType<FacesConfigRenderKitType<T>></code> 
    */
   public FacesConfigRenderKitType<T> removeAllClientBehaviorRenderer();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigRenderKitType ElementName: javaee:faces-config-render-kit-extensionType ElementType : render-kit-extension
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>render-kit-extension</code> element 
    * @return the current instance of <code>FacesConfigRenderKitType<T></code> 
    */
   public FacesConfigRenderKitType<T> renderKitExtension();

   /**
    * Removes the <code>render-kit-extension</code> element 
    * @return the current instance of <code>FacesConfigRenderKitType<T></code> 
    */
   public Boolean isRenderKitExtension();

   /**
    * Removes the <code>render-kit-extension</code> element 
    * @return the current instance of <code>FacesConfigRenderKitType<T></code> 
    */
   public FacesConfigRenderKitType<T> removeRenderKitExtension();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigRenderKitType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>FacesConfigRenderKitType<T></code> 
    */
   public FacesConfigRenderKitType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>FacesConfigRenderKitType<T></code> 
    */
   public FacesConfigRenderKitType<T> removeId();
}
