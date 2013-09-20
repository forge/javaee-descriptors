package org.jboss.shrinkwrap.descriptor.api.facesconfig20; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
/**
 * This interface defines the contract for the <code> faces-config-referenced-beanType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface FacesConfigReferencedBeanType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigReferencedBeanType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>FacesConfigReferencedBeanType<T></code> 
    */
   public FacesConfigReferencedBeanType<T> description(String ... values);

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>FacesConfigReferencedBeanType<T></code> 
    */
   public FacesConfigReferencedBeanType<T> removeAllDescription();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigReferencedBeanType ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>FacesConfigReferencedBeanType<T></code> 
    */
   public FacesConfigReferencedBeanType<T> displayName(String ... values);

   /**
    * Returns all <code>display-name</code> elements
    * @return list of <code>display-name</code> 
    */
   public List<String> getAllDisplayName();

   /**
    * Removes the <code>display-name</code> element 
    * @return the current instance of <code>FacesConfigReferencedBeanType<T></code> 
    */
   public FacesConfigReferencedBeanType<T> removeAllDisplayName();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigReferencedBeanType ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<FacesConfigReferencedBeanType<T>> getOrCreateIcon();

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<FacesConfigReferencedBeanType<T>></code> 
    */
   public IconType<FacesConfigReferencedBeanType<T>> createIcon();

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<FacesConfigReferencedBeanType<T>>> getAllIcon();

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<FacesConfigReferencedBeanType<T>></code> 
    */
   public FacesConfigReferencedBeanType<T> removeAllIcon();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigReferencedBeanType ElementName: xsd:token ElementType : referenced-bean-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>referenced-bean-name</code> element
    * @param referencedBeanName the value for the element <code>referenced-bean-name</code> 
    * @return the current instance of <code>FacesConfigReferencedBeanType<T></code> 
    */
   public FacesConfigReferencedBeanType<T> referencedBeanName(String referencedBeanName);

   /**
    * Returns the <code>referenced-bean-name</code> element
    * @return the node defined for the element <code>referenced-bean-name</code> 
    */
   public String getReferencedBeanName();

   /**
    * Removes the <code>referenced-bean-name</code> element 
    * @return the current instance of <code>FacesConfigReferencedBeanType<T></code> 
    */
   public FacesConfigReferencedBeanType<T> removeReferencedBeanName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigReferencedBeanType ElementName: xsd:token ElementType : referenced-bean-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>referenced-bean-class</code> element
    * @param referencedBeanClass the value for the element <code>referenced-bean-class</code> 
    * @return the current instance of <code>FacesConfigReferencedBeanType<T></code> 
    */
   public FacesConfigReferencedBeanType<T> referencedBeanClass(String referencedBeanClass);

   /**
    * Returns the <code>referenced-bean-class</code> element
    * @return the node defined for the element <code>referenced-bean-class</code> 
    */
   public String getReferencedBeanClass();

   /**
    * Removes the <code>referenced-bean-class</code> element 
    * @return the current instance of <code>FacesConfigReferencedBeanType<T></code> 
    */
   public FacesConfigReferencedBeanType<T> removeReferencedBeanClass();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigReferencedBeanType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>FacesConfigReferencedBeanType<T></code> 
    */
   public FacesConfigReferencedBeanType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>FacesConfigReferencedBeanType<T></code> 
    */
   public FacesConfigReferencedBeanType<T> removeId();
}
