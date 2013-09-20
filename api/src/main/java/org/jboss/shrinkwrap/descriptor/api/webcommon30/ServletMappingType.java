package org.jboss.shrinkwrap.descriptor.api.webcommon30; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> servlet-mappingType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface ServletMappingType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ServletMappingType ElementName: javaee:nonEmptyStringType ElementType : servlet-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>servlet-name</code> element
    * @param servletName the value for the element <code>servlet-name</code> 
    * @return the current instance of <code>ServletMappingType<T></code> 
    */
   public ServletMappingType<T> servletName(String servletName);

   /**
    * Returns the <code>servlet-name</code> element
    * @return the node defined for the element <code>servlet-name</code> 
    */
   public String getServletName();

   /**
    * Removes the <code>servlet-name</code> element 
    * @return the current instance of <code>ServletMappingType<T></code> 
    */
   public ServletMappingType<T> removeServletName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ServletMappingType ElementName: xsd:string ElementType : url-pattern
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>url-pattern</code> elements, 
    * a new <code>url-pattern</code> element 
    * @param values list of <code>url-pattern</code> objects 
    * @return the current instance of <code>ServletMappingType<T></code> 
    */
   public ServletMappingType<T> urlPattern(String ... values);

   /**
    * Returns all <code>url-pattern</code> elements
    * @return list of <code>url-pattern</code> 
    */
   public List<String> getAllUrlPattern();

   /**
    * Removes the <code>url-pattern</code> element 
    * @return the current instance of <code>ServletMappingType<T></code> 
    */
   public ServletMappingType<T> removeAllUrlPattern();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ServletMappingType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>ServletMappingType<T></code> 
    */
   public ServletMappingType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>ServletMappingType<T></code> 
    */
   public ServletMappingType<T> removeId();
}
