package org.jboss.shrinkwrap.descriptor.api.webcommon30; 

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
   // ClassName: FilterMappingType ElementName: javaee:nonEmptyStringType ElementType : filter-name
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
   // ClassName: FilterMappingType ElementName: xsd:string ElementType : url-pattern
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>url-pattern</code> elements, 
    * a new <code>url-pattern</code> element 
    * @param values list of <code>url-pattern</code> objects 
    * @return the current instance of <code>FilterMappingType<T></code> 
    */
   public FilterMappingType<T> urlPattern(String ... values);

   /**
    * Returns all <code>url-pattern</code> elements
    * @return list of <code>url-pattern</code> 
    */
   public List<String> getAllUrlPattern();

   /**
    * Removes the <code>url-pattern</code> element 
    * @return the current instance of <code>FilterMappingType<T></code> 
    */
   public FilterMappingType<T> removeAllUrlPattern();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FilterMappingType ElementName: javaee:nonEmptyStringType ElementType : servlet-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>servlet-name</code> elements, 
    * a new <code>servlet-name</code> element 
    * @param values list of <code>servlet-name</code> objects 
    * @return the current instance of <code>FilterMappingType<T></code> 
    */
   public FilterMappingType<T> servletName(String ... values);

   /**
    * Returns all <code>servlet-name</code> elements
    * @return list of <code>servlet-name</code> 
    */
   public List<String> getAllServletName();

   /**
    * Removes the <code>servlet-name</code> element 
    * @return the current instance of <code>FilterMappingType<T></code> 
    */
   public FilterMappingType<T> removeAllServletName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FilterMappingType ElementName: javaee:dispatcherType ElementType : dispatcher
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all javaee:dispatcherType objects representing <code>dispatcher</code> elements, 
    * a new <code>dispatcher</code> element 
    * @param values list of <code>dispatcher</code> objects 
    * @return the current instance of <code>FilterMappingType<T></code> 
    */
   public FilterMappingType<T> dispatcher(DispatcherType ... values);

   /**
    * Creates for all String objects representing <code>dispatcher</code> elements, 
    * a new <code>dispatcher</code> element 
    * @param values list of <code>dispatcher</code> objects 
    * @return the current instance of <code>FilterMappingType<T></code> 
    */
   public FilterMappingType<T> dispatcher(String ... values);

   /**
    * Returns all <code>dispatcher</code> elements
    * @return list of <code>dispatcher</code> 
    */
   public List<String> getAllDispatcher();

   /**
    * Removes the <code>dispatcher</code> element 
    * @return the current instance of <code>FilterMappingType<T></code> 
    */
   public FilterMappingType<T> removeAllDispatcher();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FilterMappingType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>FilterMappingType<T></code> 
    */
   public FilterMappingType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>FilterMappingType<T></code> 
    */
   public FilterMappingType<T> removeId();
}
