package org.jboss.shrinkwrap.descriptor.api.facelettaglibrary20; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.facelettaglibrary20.FaceletTaglibTagValidatorExtensionType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
/**
 * This interface defines the contract for the <code> facelet-taglib-tag-validatorType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface FaceletTaglibTagValidatorType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibTagValidatorType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>FaceletTaglibTagValidatorType<T></code> 
    */
   public FaceletTaglibTagValidatorType<T> description(String ... values);

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>FaceletTaglibTagValidatorType<T></code> 
    */
   public FaceletTaglibTagValidatorType<T> removeAllDescription();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibTagValidatorType ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>FaceletTaglibTagValidatorType<T></code> 
    */
   public FaceletTaglibTagValidatorType<T> displayName(String ... values);

   /**
    * Returns all <code>display-name</code> elements
    * @return list of <code>display-name</code> 
    */
   public List<String> getAllDisplayName();

   /**
    * Removes the <code>display-name</code> element 
    * @return the current instance of <code>FaceletTaglibTagValidatorType<T></code> 
    */
   public FaceletTaglibTagValidatorType<T> removeAllDisplayName();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibTagValidatorType ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<FaceletTaglibTagValidatorType<T>> getOrCreateIcon();

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<FaceletTaglibTagValidatorType<T>></code> 
    */
   public IconType<FaceletTaglibTagValidatorType<T>> createIcon();

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<FaceletTaglibTagValidatorType<T>>> getAllIcon();

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<FaceletTaglibTagValidatorType<T>></code> 
    */
   public FaceletTaglibTagValidatorType<T> removeAllIcon();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibTagValidatorType ElementName: xsd:token ElementType : validator-id
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>validator-id</code> element
    * @param validatorId the value for the element <code>validator-id</code> 
    * @return the current instance of <code>FaceletTaglibTagValidatorType<T></code> 
    */
   public FaceletTaglibTagValidatorType<T> validatorId(String validatorId);

   /**
    * Returns the <code>validator-id</code> element
    * @return the node defined for the element <code>validator-id</code> 
    */
   public String getValidatorId();

   /**
    * Removes the <code>validator-id</code> element 
    * @return the current instance of <code>FaceletTaglibTagValidatorType<T></code> 
    */
   public FaceletTaglibTagValidatorType<T> removeValidatorId();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibTagValidatorType ElementName: xsd:token ElementType : handler-class
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>handler-class</code> element
    * @param handlerClass the value for the element <code>handler-class</code> 
    * @return the current instance of <code>FaceletTaglibTagValidatorType<T></code> 
    */
   public FaceletTaglibTagValidatorType<T> handlerClass(String handlerClass);

   /**
    * Returns the <code>handler-class</code> element
    * @return the node defined for the element <code>handler-class</code> 
    */
   public String getHandlerClass();

   /**
    * Removes the <code>handler-class</code> element 
    * @return the current instance of <code>FaceletTaglibTagValidatorType<T></code> 
    */
   public FaceletTaglibTagValidatorType<T> removeHandlerClass();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibTagValidatorType ElementName: javaee:facelet-taglib-tag-validator-extensionType ElementType : validator-extension
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>validator-extension</code> element 
    * @return the current instance of <code>FaceletTaglibTagValidatorType<T></code> 
    */
   public FaceletTaglibTagValidatorType<T> validatorExtension();

   /**
    * Removes the <code>validator-extension</code> element 
    * @return the current instance of <code>FaceletTaglibTagValidatorType<T></code> 
    */
   public Boolean isValidatorExtension();

   /**
    * Removes the <code>validator-extension</code> element 
    * @return the current instance of <code>FaceletTaglibTagValidatorType<T></code> 
    */
   public FaceletTaglibTagValidatorType<T> removeValidatorExtension();
}
