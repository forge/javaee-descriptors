package org.jboss.shrinkwrap.descriptor.api.connector16; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> required-config-propertyType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface RequiredConfigPropertyType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: RequiredConfigPropertyType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>RequiredConfigPropertyType<T></code> 
    */
   public RequiredConfigPropertyType<T> description(String ... values);

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>RequiredConfigPropertyType<T></code> 
    */
   public RequiredConfigPropertyType<T> removeAllDescription();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: RequiredConfigPropertyType ElementName: javaee:xsdStringType ElementType : config-property-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>config-property-name</code> element
    * @param configPropertyName the value for the element <code>config-property-name</code> 
    * @return the current instance of <code>RequiredConfigPropertyType<T></code> 
    */
   public RequiredConfigPropertyType<T> configPropertyName(String configPropertyName);

   /**
    * Returns the <code>config-property-name</code> element
    * @return the node defined for the element <code>config-property-name</code> 
    */
   public String getConfigPropertyName();

   /**
    * Removes the <code>config-property-name</code> element 
    * @return the current instance of <code>RequiredConfigPropertyType<T></code> 
    */
   public RequiredConfigPropertyType<T> removeConfigPropertyName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: RequiredConfigPropertyType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>RequiredConfigPropertyType<T></code> 
    */
   public RequiredConfigPropertyType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>RequiredConfigPropertyType<T></code> 
    */
   public RequiredConfigPropertyType<T> removeId();
}
