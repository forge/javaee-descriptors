package org.jboss.shrinkwrap.descriptor.api.portletapp20; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> filter-mappingType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface FilterMappingType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FilterMappingType ElementName: portlet:string ElementType : filter-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>filter-name</code> element
    * @param filterName the value for the element <code>filter-name</code> 
    * @return the current instance of <code>FilterMappingType<T></code> 
    */
   public FilterMappingType<T> filterName(String filterName);

   /**
    * Returns the <code>filter-name</code> element
    * @return the node defined for the element <code>filter-name</code> 
    */
   public String getFilterName();

   /**
    * Removes the <code>filter-name</code> element 
    * @return the current instance of <code>FilterMappingType<T></code> 
    */
   public FilterMappingType<T> removeFilterName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FilterMappingType ElementName: string ElementType : portlet-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>portlet-name</code> elements, 
    * a new <code>portlet-name</code> element 
    * @param values list of <code>portlet-name</code> objects 
    * @return the current instance of <code>FilterMappingType<T></code> 
    */
   public FilterMappingType<T> portletName(String ... values);

   /**
    * Returns all <code>portlet-name</code> elements
    * @return list of <code>portlet-name</code> 
    */
   public List<String> getAllPortletName();

   /**
    * Removes the <code>portlet-name</code> element 
    * @return the current instance of <code>FilterMappingType<T></code> 
    */
   public FilterMappingType<T> removeAllPortletName();
}
