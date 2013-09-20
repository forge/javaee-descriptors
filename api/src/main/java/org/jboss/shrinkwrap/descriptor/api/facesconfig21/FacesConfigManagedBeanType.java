package org.jboss.shrinkwrap.descriptor.api.facesconfig21; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.facesconfig21.FacesConfigManagedPropertyType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig21.FacesConfigMapEntriesType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig21.FacesConfigListEntriesType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig21.FacesConfigManagedBeanExtensionType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig21.FacesConfigManagedPropertyType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig21.FacesConfigMapEntriesType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig21.FacesConfigListEntriesType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig21.FacesConfigManagedBeanExtensionType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
/**
 * This interface defines the contract for the <code> faces-config-managed-beanType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface FacesConfigManagedBeanType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigManagedBeanType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>FacesConfigManagedBeanType<T></code> 
    */
   public FacesConfigManagedBeanType<T> description(String ... values);

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>FacesConfigManagedBeanType<T></code> 
    */
   public FacesConfigManagedBeanType<T> removeAllDescription();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigManagedBeanType ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>FacesConfigManagedBeanType<T></code> 
    */
   public FacesConfigManagedBeanType<T> displayName(String ... values);

   /**
    * Returns all <code>display-name</code> elements
    * @return list of <code>display-name</code> 
    */
   public List<String> getAllDisplayName();

   /**
    * Removes the <code>display-name</code> element 
    * @return the current instance of <code>FacesConfigManagedBeanType<T></code> 
    */
   public FacesConfigManagedBeanType<T> removeAllDisplayName();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigManagedBeanType ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<FacesConfigManagedBeanType<T>> getOrCreateIcon();

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<FacesConfigManagedBeanType<T>></code> 
    */
   public IconType<FacesConfigManagedBeanType<T>> createIcon();

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<FacesConfigManagedBeanType<T>>> getAllIcon();

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<FacesConfigManagedBeanType<T>></code> 
    */
   public FacesConfigManagedBeanType<T> removeAllIcon();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigManagedBeanType ElementName: xsd:token ElementType : managed-bean-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>managed-bean-name</code> element
    * @param managedBeanName the value for the element <code>managed-bean-name</code> 
    * @return the current instance of <code>FacesConfigManagedBeanType<T></code> 
    */
   public FacesConfigManagedBeanType<T> managedBeanName(String managedBeanName);

   /**
    * Returns the <code>managed-bean-name</code> element
    * @return the node defined for the element <code>managed-bean-name</code> 
    */
   public String getManagedBeanName();

   /**
    * Removes the <code>managed-bean-name</code> element 
    * @return the current instance of <code>FacesConfigManagedBeanType<T></code> 
    */
   public FacesConfigManagedBeanType<T> removeManagedBeanName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigManagedBeanType ElementName: xsd:token ElementType : managed-bean-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>managed-bean-class</code> element
    * @param managedBeanClass the value for the element <code>managed-bean-class</code> 
    * @return the current instance of <code>FacesConfigManagedBeanType<T></code> 
    */
   public FacesConfigManagedBeanType<T> managedBeanClass(String managedBeanClass);

   /**
    * Returns the <code>managed-bean-class</code> element
    * @return the node defined for the element <code>managed-bean-class</code> 
    */
   public String getManagedBeanClass();

   /**
    * Removes the <code>managed-bean-class</code> element 
    * @return the current instance of <code>FacesConfigManagedBeanType<T></code> 
    */
   public FacesConfigManagedBeanType<T> removeManagedBeanClass();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigManagedBeanType ElementName: javaee:string ElementType : managed-bean-scope
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>managed-bean-scope</code> element
    * @param managedBeanScope the value for the element <code>managed-bean-scope</code> 
    * @return the current instance of <code>FacesConfigManagedBeanType<T></code> 
    */
   public FacesConfigManagedBeanType<T> managedBeanScope(String managedBeanScope);

   /**
    * Returns the <code>managed-bean-scope</code> element
    * @return the node defined for the element <code>managed-bean-scope</code> 
    */
   public String getManagedBeanScope();

   /**
    * Removes the <code>managed-bean-scope</code> element 
    * @return the current instance of <code>FacesConfigManagedBeanType<T></code> 
    */
   public FacesConfigManagedBeanType<T> removeManagedBeanScope();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigManagedBeanType ElementName: javaee:faces-config-managed-propertyType ElementType : managed-property
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>managed-property</code> element will be created and returned.
    * Otherwise, the first existing <code>managed-property</code> element will be returned.
    * @return the instance defined for the element <code>managed-property</code> 
    */
   public FacesConfigManagedPropertyType<FacesConfigManagedBeanType<T>> getOrCreateManagedProperty();

   /**
    * Creates a new <code>managed-property</code> element 
    * @return the new created instance of <code>FacesConfigManagedPropertyType<FacesConfigManagedBeanType<T>></code> 
    */
   public FacesConfigManagedPropertyType<FacesConfigManagedBeanType<T>> createManagedProperty();

   /**
    * Returns all <code>managed-property</code> elements
    * @return list of <code>managed-property</code> 
    */
   public List<FacesConfigManagedPropertyType<FacesConfigManagedBeanType<T>>> getAllManagedProperty();

   /**
    * Removes all <code>managed-property</code> elements 
    * @return the current instance of <code>FacesConfigManagedPropertyType<FacesConfigManagedBeanType<T>></code> 
    */
   public FacesConfigManagedBeanType<T> removeAllManagedProperty();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigManagedBeanType ElementName: javaee:faces-config-map-entriesType ElementType : map-entries
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>map-entries</code> element with the given value will be created.
    * Otherwise, the existing <code>map-entries</code> element will be returned.
    * @return  a new or existing instance of <code>FacesConfigMapEntriesType<FacesConfigManagedBeanType<T>></code> 
    */
   public FacesConfigMapEntriesType<FacesConfigManagedBeanType<T>> getOrCreateMapEntries();

   /**
    * Removes the <code>map-entries</code> element 
    * @return the current instance of <code>FacesConfigManagedBeanType<T></code> 
    */
   public FacesConfigManagedBeanType<T> removeMapEntries();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigManagedBeanType ElementName: javaee:faces-config-list-entriesType ElementType : list-entries
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>list-entries</code> element with the given value will be created.
    * Otherwise, the existing <code>list-entries</code> element will be returned.
    * @return  a new or existing instance of <code>FacesConfigListEntriesType<FacesConfigManagedBeanType<T>></code> 
    */
   public FacesConfigListEntriesType<FacesConfigManagedBeanType<T>> getOrCreateListEntries();

   /**
    * Removes the <code>list-entries</code> element 
    * @return the current instance of <code>FacesConfigManagedBeanType<T></code> 
    */
   public FacesConfigManagedBeanType<T> removeListEntries();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigManagedBeanType ElementName: javaee:faces-config-managed-bean-extensionType ElementType : managed-bean-extension
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>managed-bean-extension</code> element 
    * @return the current instance of <code>FacesConfigManagedBeanType<T></code> 
    */
   public FacesConfigManagedBeanType<T> managedBeanExtension();

   /**
    * Removes the <code>managed-bean-extension</code> element 
    * @return the current instance of <code>FacesConfigManagedBeanType<T></code> 
    */
   public Boolean isManagedBeanExtension();

   /**
    * Removes the <code>managed-bean-extension</code> element 
    * @return the current instance of <code>FacesConfigManagedBeanType<T></code> 
    */
   public FacesConfigManagedBeanType<T> removeManagedBeanExtension();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigManagedBeanType ElementName: xsd:boolean ElementType : eager
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>eager</code> attribute
    * @param eager the value for the attribute <code>eager</code> 
    * @return the current instance of <code>FacesConfigManagedBeanType<T></code> 
    */
   public FacesConfigManagedBeanType<T> eager(Boolean eager);

   /**
    * Returns the <code>eager</code> attribute
    * @return the value defined for the attribute <code>eager</code> 
    */
public Boolean isEager();

   /**
    * Removes the <code>eager</code> attribute 
    * @return the current instance of <code>FacesConfigManagedBeanType<T></code> 
    */
   public FacesConfigManagedBeanType<T> removeEager();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigManagedBeanType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>FacesConfigManagedBeanType<T></code> 
    */
   public FacesConfigManagedBeanType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>FacesConfigManagedBeanType<T></code> 
    */
   public FacesConfigManagedBeanType<T> removeId();
}
