package org.jboss.shrinkwrap.descriptor.api.webcommon30; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.ParamValueType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;
/**
 * This interface defines the contract for the <code> filterType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface FilterType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FilterType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>FilterType<T></code> 
    */
   public FilterType<T> description(String ... values);

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>FilterType<T></code> 
    */
   public FilterType<T> removeAllDescription();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FilterType ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>FilterType<T></code> 
    */
   public FilterType<T> displayName(String ... values);

   /**
    * Returns all <code>display-name</code> elements
    * @return list of <code>display-name</code> 
    */
   public List<String> getAllDisplayName();

   /**
    * Removes the <code>display-name</code> element 
    * @return the current instance of <code>FilterType<T></code> 
    */
   public FilterType<T> removeAllDisplayName();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FilterType ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<FilterType<T>> getOrCreateIcon();

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<FilterType<T>></code> 
    */
   public IconType<FilterType<T>> createIcon();

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<FilterType<T>>> getAllIcon();

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<FilterType<T>></code> 
    */
   public FilterType<T> removeAllIcon();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FilterType ElementName: javaee:nonEmptyStringType ElementType : filter-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>filter-name</code> element
    * @param filterName the value for the element <code>filter-name</code> 
    * @return the current instance of <code>FilterType<T></code> 
    */
   public FilterType<T> filterName(String filterName);

   /**
    * Returns the <code>filter-name</code> element
    * @return the node defined for the element <code>filter-name</code> 
    */
   public String getFilterName();

   /**
    * Removes the <code>filter-name</code> element 
    * @return the current instance of <code>FilterType<T></code> 
    */
   public FilterType<T> removeFilterName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FilterType ElementName: xsd:token ElementType : filter-class
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>filter-class</code> element
    * @param filterClass the value for the element <code>filter-class</code> 
    * @return the current instance of <code>FilterType<T></code> 
    */
   public FilterType<T> filterClass(String filterClass);

   /**
    * Returns the <code>filter-class</code> element
    * @return the node defined for the element <code>filter-class</code> 
    */
   public String getFilterClass();

   /**
    * Removes the <code>filter-class</code> element 
    * @return the current instance of <code>FilterType<T></code> 
    */
   public FilterType<T> removeFilterClass();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FilterType ElementName: javaee:xsdBooleanType ElementType : async-supported
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>async-supported</code> element
    * @param asyncSupported the value for the element <code>async-supported</code> 
    * @return the current instance of <code>FilterType<T></code> 
    */
   public FilterType<T> asyncSupported(Boolean asyncSupported);

   /**
    * Returns the <code>async-supported</code> element
    * @return the node defined for the element <code>async-supported</code> 
    */
   public Boolean isAsyncSupported();

   /**
    * Removes the <code>async-supported</code> element 
    * @return the current instance of <code>FilterType<T></code> 
    */
   public FilterType<T> removeAsyncSupported();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FilterType ElementName: javaee:param-valueType ElementType : init-param
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>init-param</code> element will be created and returned.
    * Otherwise, the first existing <code>init-param</code> element will be returned.
    * @return the instance defined for the element <code>init-param</code> 
    */
   public ParamValueType<FilterType<T>> getOrCreateInitParam();

   /**
    * Creates a new <code>init-param</code> element 
    * @return the new created instance of <code>ParamValueType<FilterType<T>></code> 
    */
   public ParamValueType<FilterType<T>> createInitParam();

   /**
    * Returns all <code>init-param</code> elements
    * @return list of <code>init-param</code> 
    */
   public List<ParamValueType<FilterType<T>>> getAllInitParam();

   /**
    * Removes all <code>init-param</code> elements 
    * @return the current instance of <code>ParamValueType<FilterType<T>></code> 
    */
   public FilterType<T> removeAllInitParam();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FilterType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>FilterType<T></code> 
    */
   public FilterType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>FilterType<T></code> 
    */
   public FilterType<T> removeId();
}
