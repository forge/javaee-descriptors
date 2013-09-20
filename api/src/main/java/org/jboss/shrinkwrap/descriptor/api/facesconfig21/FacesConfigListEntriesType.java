package org.jboss.shrinkwrap.descriptor.api.facesconfig21; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.facesconfig21.FacesConfigNullValueType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig21.FacesConfigNullValueType;
/**
 * This interface defines the contract for the <code> faces-config-list-entriesType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface FacesConfigListEntriesType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigListEntriesType ElementName: javaee:fully-qualified-classType ElementType : value-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>value-class</code> element
    * @param valueClass the value for the element <code>value-class</code> 
    * @return the current instance of <code>FacesConfigListEntriesType<T></code> 
    */
   public FacesConfigListEntriesType<T> valueClass(String valueClass);

   /**
    * Returns the <code>value-class</code> element
    * @return the node defined for the element <code>value-class</code> 
    */
   public String getValueClass();

   /**
    * Removes the <code>value-class</code> element 
    * @return the current instance of <code>FacesConfigListEntriesType<T></code> 
    */
   public FacesConfigListEntriesType<T> removeValueClass();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigListEntriesType ElementName: javaee:faces-config-null-valueType ElementType : null-value
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>null-value</code> element 
    * @return the current instance of <code>FacesConfigListEntriesType<T></code> 
    */
   public FacesConfigListEntriesType<T> nullValue();

   /**
    * Removes the <code>null-value</code> element 
    * @return the current instance of <code>FacesConfigListEntriesType<T></code> 
    */
   public Boolean isNullValue();

   /**
    * Removes the <code>null-value</code> element 
    * @return the current instance of <code>FacesConfigListEntriesType<T></code> 
    */
   public FacesConfigListEntriesType<T> removeNullValue();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigListEntriesType ElementName: xsd:string ElementType : value
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>value</code> elements, 
    * a new <code>value</code> element 
    * @param values list of <code>value</code> objects 
    * @return the current instance of <code>FacesConfigListEntriesType<T></code> 
    */
   public FacesConfigListEntriesType<T> value(String ... values);

   /**
    * Returns all <code>value</code> elements
    * @return list of <code>value</code> 
    */
   public List<String> getAllValue();

   /**
    * Removes the <code>value</code> element 
    * @return the current instance of <code>FacesConfigListEntriesType<T></code> 
    */
   public FacesConfigListEntriesType<T> removeAllValue();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigListEntriesType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>FacesConfigListEntriesType<T></code> 
    */
   public FacesConfigListEntriesType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>FacesConfigListEntriesType<T></code> 
    */
   public FacesConfigListEntriesType<T> removeId();
}
