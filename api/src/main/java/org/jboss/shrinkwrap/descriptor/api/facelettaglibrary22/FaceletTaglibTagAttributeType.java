package org.jboss.shrinkwrap.descriptor.api.facelettaglibrary22; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee7.GenericBooleanType;
import org.jboss.shrinkwrap.descriptor.api.javaee7.IconType;
/**
 * This interface defines the contract for the <code> facelet-taglib-tag-attributeType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface FaceletTaglibTagAttributeType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibTagAttributeType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>FaceletTaglibTagAttributeType<T></code> 
    */
   public FaceletTaglibTagAttributeType<T> description(String ... values);

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>FaceletTaglibTagAttributeType<T></code> 
    */
   public FaceletTaglibTagAttributeType<T> removeAllDescription();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibTagAttributeType ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>FaceletTaglibTagAttributeType<T></code> 
    */
   public FaceletTaglibTagAttributeType<T> displayName(String ... values);

   /**
    * Returns all <code>display-name</code> elements
    * @return list of <code>display-name</code> 
    */
   public List<String> getAllDisplayName();

   /**
    * Removes the <code>display-name</code> element 
    * @return the current instance of <code>FaceletTaglibTagAttributeType<T></code> 
    */
   public FaceletTaglibTagAttributeType<T> removeAllDisplayName();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibTagAttributeType ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<FaceletTaglibTagAttributeType<T>> getOrCreateIcon();

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<FaceletTaglibTagAttributeType<T>></code> 
    */
   public IconType<FaceletTaglibTagAttributeType<T>> createIcon();

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<FaceletTaglibTagAttributeType<T>>> getAllIcon();

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<FaceletTaglibTagAttributeType<T>></code> 
    */
   public FaceletTaglibTagAttributeType<T> removeAllIcon();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibTagAttributeType ElementName: xsd:NMTOKEN ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> element
    * @param name the value for the element <code>name</code> 
    * @return the current instance of <code>FaceletTaglibTagAttributeType<T></code> 
    */
   public FaceletTaglibTagAttributeType<T> name(String name);

   /**
    * Returns the <code>name</code> element
    * @return the node defined for the element <code>name</code> 
    */
   public String getName();

   /**
    * Removes the <code>name</code> element 
    * @return the current instance of <code>FaceletTaglibTagAttributeType<T></code> 
    */
   public FaceletTaglibTagAttributeType<T> removeName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibTagAttributeType ElementName: javaee:generic-booleanType ElementType : required
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>required</code> element
    * @param required the value for the element <code>required</code> 
    * @return the current instance of <code>FaceletTaglibTagAttributeType<T></code> 
    */
   public FaceletTaglibTagAttributeType<T> required(GenericBooleanType required);
   /**
    * Sets the <code>required</code> element
    * @param required the value for the element <code>required</code> 
    * @return the current instance of <code>FaceletTaglibTagAttributeType<T></code> 
    */
   public FaceletTaglibTagAttributeType<T> required(String required);

   /**
    * Returns the <code>required</code> element
    * @return the value found for the element <code>required</code> 
    */
   public GenericBooleanType getRequired();

   /**
    * Returns the <code>required</code> element
    * @return the value found for the element <code>required</code> 
    */
   public String  getRequiredAsString();

   /**
    * Removes the <code>required</code> attribute 
    * @return the current instance of <code>FaceletTaglibTagAttributeType<T></code> 
    */
   public FaceletTaglibTagAttributeType<T> removeRequired();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibTagAttributeType ElementName: xsd:token ElementType : type
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>type</code> element
    * @param type the value for the element <code>type</code> 
    * @return the current instance of <code>FaceletTaglibTagAttributeType<T></code> 
    */
   public FaceletTaglibTagAttributeType<T> type(String type);

   /**
    * Returns the <code>type</code> element
    * @return the node defined for the element <code>type</code> 
    */
   public String getType();

   /**
    * Removes the <code>type</code> element 
    * @return the current instance of <code>FaceletTaglibTagAttributeType<T></code> 
    */
   public FaceletTaglibTagAttributeType<T> removeType();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibTagAttributeType ElementName: xsd:token ElementType : method-signature
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>method-signature</code> element
    * @param methodSignature the value for the element <code>method-signature</code> 
    * @return the current instance of <code>FaceletTaglibTagAttributeType<T></code> 
    */
   public FaceletTaglibTagAttributeType<T> methodSignature(String methodSignature);

   /**
    * Returns the <code>method-signature</code> element
    * @return the node defined for the element <code>method-signature</code> 
    */
   public String getMethodSignature();

   /**
    * Removes the <code>method-signature</code> element 
    * @return the current instance of <code>FaceletTaglibTagAttributeType<T></code> 
    */
   public FaceletTaglibTagAttributeType<T> removeMethodSignature();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FaceletTaglibTagAttributeType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>FaceletTaglibTagAttributeType<T></code> 
    */
   public FaceletTaglibTagAttributeType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>FaceletTaglibTagAttributeType<T></code> 
    */
   public FaceletTaglibTagAttributeType<T> removeId();
}
