package org.jboss.shrinkwrap.descriptor.api.j2ee14; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> param-valueType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface ParamValueType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ParamValueType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>ParamValueType<T></code> 
    */
   public ParamValueType<T> description(String ... values);

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>ParamValueType<T></code> 
    */
   public ParamValueType<T> removeAllDescription();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ParamValueType ElementName: xsd:token ElementType : param-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>param-name</code> element
    * @param paramName the value for the element <code>param-name</code> 
    * @return the current instance of <code>ParamValueType<T></code> 
    */
   public ParamValueType<T> paramName(String paramName);

   /**
    * Returns the <code>param-name</code> element
    * @return the node defined for the element <code>param-name</code> 
    */
   public String getParamName();

   /**
    * Removes the <code>param-name</code> element 
    * @return the current instance of <code>ParamValueType<T></code> 
    */
   public ParamValueType<T> removeParamName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ParamValueType ElementName: xsd:string ElementType : param-value
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>param-value</code> element
    * @param paramValue the value for the element <code>param-value</code> 
    * @return the current instance of <code>ParamValueType<T></code> 
    */
   public ParamValueType<T> paramValue(String paramValue);

   /**
    * Returns the <code>param-value</code> element
    * @return the node defined for the element <code>param-value</code> 
    */
   public String getParamValue();

   /**
    * Removes the <code>param-value</code> element 
    * @return the current instance of <code>ParamValueType<T></code> 
    */
   public ParamValueType<T> removeParamValue();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ParamValueType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>ParamValueType<T></code> 
    */
   public ParamValueType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>ParamValueType<T></code> 
    */
   public ParamValueType<T> removeId();
}
