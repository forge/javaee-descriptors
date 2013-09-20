package org.jboss.shrinkwrap.descriptor.api.j2ee14; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> env-entryType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface EnvEntryType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EnvEntryType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>EnvEntryType<T></code> 
    */
   public EnvEntryType<T> description(String ... values);

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>EnvEntryType<T></code> 
    */
   public EnvEntryType<T> removeAllDescription();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EnvEntryType ElementName: xsd:token ElementType : env-entry-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>env-entry-name</code> element
    * @param envEntryName the value for the element <code>env-entry-name</code> 
    * @return the current instance of <code>EnvEntryType<T></code> 
    */
   public EnvEntryType<T> envEntryName(String envEntryName);

   /**
    * Returns the <code>env-entry-name</code> element
    * @return the node defined for the element <code>env-entry-name</code> 
    */
   public String getEnvEntryName();

   /**
    * Removes the <code>env-entry-name</code> element 
    * @return the current instance of <code>EnvEntryType<T></code> 
    */
   public EnvEntryType<T> removeEnvEntryName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EnvEntryType ElementName: j2ee:env-entry-type-valuesType ElementType : env-entry-type
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>env-entry-type</code> element
    * @param envEntryType the value for the element <code>env-entry-type</code> 
    * @return the current instance of <code>EnvEntryType<T></code> 
    */
   public EnvEntryType<T> envEntryType(EnvEntryTypeValuesType envEntryType);
   /**
    * Sets the <code>env-entry-type</code> element
    * @param envEntryType the value for the element <code>env-entry-type</code> 
    * @return the current instance of <code>EnvEntryType<T></code> 
    */
   public EnvEntryType<T> envEntryType(String envEntryType);

   /**
    * Returns the <code>env-entry-type</code> element
    * @return the value found for the element <code>env-entry-type</code> 
    */
   public EnvEntryTypeValuesType getEnvEntryType();

   /**
    * Returns the <code>env-entry-type</code> element
    * @return the value found for the element <code>env-entry-type</code> 
    */
   public String  getEnvEntryTypeAsString();

   /**
    * Removes the <code>env-entry-type</code> attribute 
    * @return the current instance of <code>EnvEntryType<T></code> 
    */
   public EnvEntryType<T> removeEnvEntryType();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EnvEntryType ElementName: xsd:string ElementType : env-entry-value
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>env-entry-value</code> element
    * @param envEntryValue the value for the element <code>env-entry-value</code> 
    * @return the current instance of <code>EnvEntryType<T></code> 
    */
   public EnvEntryType<T> envEntryValue(String envEntryValue);

   /**
    * Returns the <code>env-entry-value</code> element
    * @return the node defined for the element <code>env-entry-value</code> 
    */
   public String getEnvEntryValue();

   /**
    * Removes the <code>env-entry-value</code> element 
    * @return the current instance of <code>EnvEntryType<T></code> 
    */
   public EnvEntryType<T> removeEnvEntryValue();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EnvEntryType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>EnvEntryType<T></code> 
    */
   public EnvEntryType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>EnvEntryType<T></code> 
    */
   public EnvEntryType<T> removeId();
}
