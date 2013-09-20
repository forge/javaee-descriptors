package org.jboss.shrinkwrap.descriptor.api.facesconfig20; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
/**
 * This interface defines the contract for the <code> faces-config-application-resource-bundleType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface FacesConfigApplicationResourceBundleType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigApplicationResourceBundleType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>FacesConfigApplicationResourceBundleType<T></code> 
    */
   public FacesConfigApplicationResourceBundleType<T> description(String ... values);

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>FacesConfigApplicationResourceBundleType<T></code> 
    */
   public FacesConfigApplicationResourceBundleType<T> removeAllDescription();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigApplicationResourceBundleType ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>FacesConfigApplicationResourceBundleType<T></code> 
    */
   public FacesConfigApplicationResourceBundleType<T> displayName(String ... values);

   /**
    * Returns all <code>display-name</code> elements
    * @return list of <code>display-name</code> 
    */
   public List<String> getAllDisplayName();

   /**
    * Removes the <code>display-name</code> element 
    * @return the current instance of <code>FacesConfigApplicationResourceBundleType<T></code> 
    */
   public FacesConfigApplicationResourceBundleType<T> removeAllDisplayName();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigApplicationResourceBundleType ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<FacesConfigApplicationResourceBundleType<T>> getOrCreateIcon();

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<FacesConfigApplicationResourceBundleType<T>></code> 
    */
   public IconType<FacesConfigApplicationResourceBundleType<T>> createIcon();

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<FacesConfigApplicationResourceBundleType<T>>> getAllIcon();

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<FacesConfigApplicationResourceBundleType<T>></code> 
    */
   public FacesConfigApplicationResourceBundleType<T> removeAllIcon();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigApplicationResourceBundleType ElementName: xsd:token ElementType : base-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>base-name</code> element
    * @param baseName the value for the element <code>base-name</code> 
    * @return the current instance of <code>FacesConfigApplicationResourceBundleType<T></code> 
    */
   public FacesConfigApplicationResourceBundleType<T> baseName(String baseName);

   /**
    * Returns the <code>base-name</code> element
    * @return the node defined for the element <code>base-name</code> 
    */
   public String getBaseName();

   /**
    * Removes the <code>base-name</code> element 
    * @return the current instance of <code>FacesConfigApplicationResourceBundleType<T></code> 
    */
   public FacesConfigApplicationResourceBundleType<T> removeBaseName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigApplicationResourceBundleType ElementName: xsd:token ElementType : var
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>var</code> element
    * @param var the value for the element <code>var</code> 
    * @return the current instance of <code>FacesConfigApplicationResourceBundleType<T></code> 
    */
   public FacesConfigApplicationResourceBundleType<T> var(String var);

   /**
    * Returns the <code>var</code> element
    * @return the node defined for the element <code>var</code> 
    */
   public String getVar();

   /**
    * Removes the <code>var</code> element 
    * @return the current instance of <code>FacesConfigApplicationResourceBundleType<T></code> 
    */
   public FacesConfigApplicationResourceBundleType<T> removeVar();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigApplicationResourceBundleType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>FacesConfigApplicationResourceBundleType<T></code> 
    */
   public FacesConfigApplicationResourceBundleType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>FacesConfigApplicationResourceBundleType<T></code> 
    */
   public FacesConfigApplicationResourceBundleType<T> removeId();
}
