package org.jboss.shrinkwrap.descriptor.api.facesconfig22; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigNullValueType;
/**
 * This interface defines the contract for the <code> faces-config-map-entryType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface FacesConfigMapEntryType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigMapEntryType ElementName: xsd:token ElementType : key
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>key</code> element
    * @param key the value for the element <code>key</code> 
    * @return the current instance of <code>FacesConfigMapEntryType<T></code> 
    */
   public FacesConfigMapEntryType<T> key(String key);

   /**
    * Returns the <code>key</code> element
    * @return the node defined for the element <code>key</code> 
    */
   public String getKey();

   /**
    * Removes the <code>key</code> element 
    * @return the current instance of <code>FacesConfigMapEntryType<T></code> 
    */
   public FacesConfigMapEntryType<T> removeKey();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigMapEntryType ElementName: javaee:faces-config-null-valueType ElementType : null-value
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>null-value</code> element 
    * @return the current instance of <code>FacesConfigMapEntryType<T></code> 
    */
   public FacesConfigMapEntryType<T> nullValue();

   /**
    * Removes the <code>null-value</code> element 
    * @return the current instance of <code>FacesConfigMapEntryType<T></code> 
    */
   public Boolean isNullValue();

   /**
    * Removes the <code>null-value</code> element 
    * @return the current instance of <code>FacesConfigMapEntryType<T></code> 
    */
   public FacesConfigMapEntryType<T> removeNullValue();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigMapEntryType ElementName: javaee:faces-config-el-expressionType ElementType : value
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>value</code> element
    * @param value the value for the element <code>value</code> 
    * @return the current instance of <code>FacesConfigMapEntryType<T></code> 
    */
   public FacesConfigMapEntryType<T> value(String value);

   /**
    * Returns the <code>value</code> element
    * @return the node defined for the element <code>value</code> 
    */
   public String getValue();

   /**
    * Removes the <code>value</code> element 
    * @return the current instance of <code>FacesConfigMapEntryType<T></code> 
    */
   public FacesConfigMapEntryType<T> removeValue();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigMapEntryType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>FacesConfigMapEntryType<T></code> 
    */
   public FacesConfigMapEntryType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>FacesConfigMapEntryType<T></code> 
    */
   public FacesConfigMapEntryType<T> removeId();
}
