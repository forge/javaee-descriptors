package org.jboss.shrinkwrap.descriptor.api.ejbjar31; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.CmrFieldTypeType;
/**
 * This interface defines the contract for the <code> cmr-fieldType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface CmrFieldType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: CmrFieldType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>CmrFieldType<T></code> 
    */
   public CmrFieldType<T> description(String ... values);

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>CmrFieldType<T></code> 
    */
   public CmrFieldType<T> removeAllDescription();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: CmrFieldType ElementName: xsd:token ElementType : cmr-field-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>cmr-field-name</code> element
    * @param cmrFieldName the value for the element <code>cmr-field-name</code> 
    * @return the current instance of <code>CmrFieldType<T></code> 
    */
   public CmrFieldType<T> cmrFieldName(String cmrFieldName);

   /**
    * Returns the <code>cmr-field-name</code> element
    * @return the node defined for the element <code>cmr-field-name</code> 
    */
   public String getCmrFieldName();

   /**
    * Removes the <code>cmr-field-name</code> element 
    * @return the current instance of <code>CmrFieldType<T></code> 
    */
   public CmrFieldType<T> removeCmrFieldName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: CmrFieldType ElementName: javaee:cmr-field-typeType ElementType : cmr-field-type
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>cmr-field-type</code> element
    * @param cmrFieldType the value for the element <code>cmr-field-type</code> 
    * @return the current instance of <code>CmrFieldType<T></code> 
    */
   public CmrFieldType<T> cmrFieldType(CmrFieldTypeType cmrFieldType);
   /**
    * Sets the <code>cmr-field-type</code> element
    * @param cmrFieldType the value for the element <code>cmr-field-type</code> 
    * @return the current instance of <code>CmrFieldType<T></code> 
    */
   public CmrFieldType<T> cmrFieldType(String cmrFieldType);

   /**
    * Returns the <code>cmr-field-type</code> element
    * @return the value found for the element <code>cmr-field-type</code> 
    */
   public CmrFieldTypeType getCmrFieldType();

   /**
    * Returns the <code>cmr-field-type</code> element
    * @return the value found for the element <code>cmr-field-type</code> 
    */
   public String  getCmrFieldTypeAsString();

   /**
    * Removes the <code>cmr-field-type</code> attribute 
    * @return the current instance of <code>CmrFieldType<T></code> 
    */
   public CmrFieldType<T> removeCmrFieldType();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: CmrFieldType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>CmrFieldType<T></code> 
    */
   public CmrFieldType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>CmrFieldType<T></code> 
    */
   public CmrFieldType<T> removeId();
}
