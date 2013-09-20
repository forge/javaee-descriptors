package org.jboss.shrinkwrap.descriptor.api.portletapp20; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.portletapp20.InitParamType;
/**
 * This interface defines the contract for the <code> filterType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface FilterType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FilterType ElementName: string ElementType : description
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
   // ClassName: FilterType ElementName: string ElementType : display-name
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
   // ClassName: FilterType ElementName: portlet:string ElementType : filter-name
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
   // ClassName: FilterType ElementName: string ElementType : filter-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
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
   // ClassName: FilterType ElementName: string ElementType : lifecycle
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>lifecycle</code> elements, 
    * a new <code>lifecycle</code> element 
    * @param values list of <code>lifecycle</code> objects 
    * @return the current instance of <code>FilterType<T></code> 
    */
   public FilterType<T> lifecycle(String ... values);

   /**
    * Returns all <code>lifecycle</code> elements
    * @return list of <code>lifecycle</code> 
    */
   public List<String> getAllLifecycle();

   /**
    * Removes the <code>lifecycle</code> element 
    * @return the current instance of <code>FilterType<T></code> 
    */
   public FilterType<T> removeAllLifecycle();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FilterType ElementName: portlet:init-paramType ElementType : init-param
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>init-param</code> element will be created and returned.
    * Otherwise, the first existing <code>init-param</code> element will be returned.
    * @return the instance defined for the element <code>init-param</code> 
    */
   public InitParamType<FilterType<T>> getOrCreateInitParam();

   /**
    * Creates a new <code>init-param</code> element 
    * @return the new created instance of <code>InitParamType<FilterType<T>></code> 
    */
   public InitParamType<FilterType<T>> createInitParam();

   /**
    * Returns all <code>init-param</code> elements
    * @return list of <code>init-param</code> 
    */
   public List<InitParamType<FilterType<T>>> getAllInitParam();

   /**
    * Removes all <code>init-param</code> elements 
    * @return the current instance of <code>InitParamType<FilterType<T>></code> 
    */
   public FilterType<T> removeAllInitParam();
}
