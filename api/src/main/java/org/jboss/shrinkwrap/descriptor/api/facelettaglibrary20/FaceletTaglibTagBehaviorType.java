package org.jboss.shrinkwrap.descriptor.api.facelettaglibrary20; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
/**
 * This interface defines the contract for the <code> facelet-taglib-tag-behaviorType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface FaceletTaglibTagBehaviorType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibTagBehaviorType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>FaceletTaglibTagBehaviorType<T></code> 
    */
   public FaceletTaglibTagBehaviorType<T> description(String ... values);

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>FaceletTaglibTagBehaviorType<T></code> 
    */
   public FaceletTaglibTagBehaviorType<T> removeAllDescription();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibTagBehaviorType ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>FaceletTaglibTagBehaviorType<T></code> 
    */
   public FaceletTaglibTagBehaviorType<T> displayName(String ... values);

   /**
    * Returns all <code>display-name</code> elements
    * @return list of <code>display-name</code> 
    */
   public List<String> getAllDisplayName();

   /**
    * Removes the <code>display-name</code> element 
    * @return the current instance of <code>FaceletTaglibTagBehaviorType<T></code> 
    */
   public FaceletTaglibTagBehaviorType<T> removeAllDisplayName();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibTagBehaviorType ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<FaceletTaglibTagBehaviorType<T>> getOrCreateIcon();

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<FaceletTaglibTagBehaviorType<T>></code> 
    */
   public IconType<FaceletTaglibTagBehaviorType<T>> createIcon();

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<FaceletTaglibTagBehaviorType<T>>> getAllIcon();

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<FaceletTaglibTagBehaviorType<T>></code> 
    */
   public FaceletTaglibTagBehaviorType<T> removeAllIcon();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibTagBehaviorType ElementName: xsd:token ElementType : behavior-id
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>behavior-id</code> element
    * @param behaviorId the value for the element <code>behavior-id</code> 
    * @return the current instance of <code>FaceletTaglibTagBehaviorType<T></code> 
    */
   public FaceletTaglibTagBehaviorType<T> behaviorId(String behaviorId);

   /**
    * Returns the <code>behavior-id</code> element
    * @return the node defined for the element <code>behavior-id</code> 
    */
   public String getBehaviorId();

   /**
    * Removes the <code>behavior-id</code> element 
    * @return the current instance of <code>FaceletTaglibTagBehaviorType<T></code> 
    */
   public FaceletTaglibTagBehaviorType<T> removeBehaviorId();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibTagBehaviorType ElementName: xsd:token ElementType : handler-class
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>handler-class</code> element
    * @param handlerClass the value for the element <code>handler-class</code> 
    * @return the current instance of <code>FaceletTaglibTagBehaviorType<T></code> 
    */
   public FaceletTaglibTagBehaviorType<T> handlerClass(String handlerClass);

   /**
    * Returns the <code>handler-class</code> element
    * @return the node defined for the element <code>handler-class</code> 
    */
   public String getHandlerClass();

   /**
    * Removes the <code>handler-class</code> element 
    * @return the current instance of <code>FaceletTaglibTagBehaviorType<T></code> 
    */
   public FaceletTaglibTagBehaviorType<T> removeHandlerClass();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibTagBehaviorType ElementName: javaee:facelet-taglib-tag-behavior-extensionType ElementType : behavior-extension
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>behavior-extension</code> element 
    * @return the current instance of <code>FaceletTaglibTagBehaviorType<T></code> 
    */
   public FaceletTaglibTagBehaviorType<T> behaviorExtension();

   /**
    * Removes the <code>behavior-extension</code> element 
    * @return the current instance of <code>FaceletTaglibTagBehaviorType<T></code> 
    */
   public Boolean isBehaviorExtension();

   /**
    * Removes the <code>behavior-extension</code> element 
    * @return the current instance of <code>FaceletTaglibTagBehaviorType<T></code> 
    */
   public FaceletTaglibTagBehaviorType<T> removeBehaviorExtension();
}
