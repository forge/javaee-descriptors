package org.jboss.shrinkwrap.descriptor.api.orm21; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.orm21.ParameterMode;
/**
 * This interface defines the contract for the <code> stored-procedure-parameter </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface StoredProcedureParameter<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: StoredProcedureParameter ElementName: xsd:string ElementType : description
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>description</code> element
    * @param description the value for the element <code>description</code> 
    * @return the current instance of <code>StoredProcedureParameter<T></code> 
    */
   public StoredProcedureParameter<T> description(String description);

   /**
    * Returns the <code>description</code> element
    * @return the node defined for the element <code>description</code> 
    */
   public String getDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>StoredProcedureParameter<T></code> 
    */
   public StoredProcedureParameter<T> removeDescription();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: StoredProcedureParameter ElementName: xsd:string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>StoredProcedureParameter<T></code> 
    */
   public StoredProcedureParameter<T> name(String name);

   /**
    * Returns the <code>name</code> attribute
    * @return the value defined for the attribute <code>name</code> 
    */
   public String getName();

   /**
    * Removes the <code>name</code> attribute 
    * @return the current instance of <code>StoredProcedureParameter<T></code> 
    */
   public StoredProcedureParameter<T> removeName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: StoredProcedureParameter ElementName: xsd:string ElementType : class
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>class</code> attribute
    * @param clazz the value for the attribute <code>class</code> 
    * @return the current instance of <code>StoredProcedureParameter<T></code> 
    */
   public StoredProcedureParameter<T> clazz(String clazz);

   /**
    * Returns the <code>class</code> attribute
    * @return the value defined for the attribute <code>class</code> 
    */
   public String getClazz();

   /**
    * Removes the <code>class</code> attribute 
    * @return the current instance of <code>StoredProcedureParameter<T></code> 
    */
   public StoredProcedureParameter<T> removeClazzAttr();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: StoredProcedureParameter ElementName: orm:parameter-mode ElementType : mode
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>mode</code> attribute
    * @param mode the value for the attribute <code>mode</code> 
    * @return the current instance of <code>StoredProcedureParameter<T></code> 
    */
   public StoredProcedureParameter<T> mode(ParameterMode mode);

   /**
    * Sets the <code>mode</code> attribute
    * @param mode the value for the attribute <code>mode</code> 
    * @return the current instance of <code>StoredProcedureParameter<T></code> 
    */
   public StoredProcedureParameter<T> mode(String mode);

   /**
    * Returns the <code>mode</code> attribute
    * @return the value defined for the attribute <code>mode</code> 
    */
public ParameterMode getMode();

   /**
    * Returns the <code>mode</code> attribute
    * @return the value found for the element <code>mode</code> 
    */
   public String  getModeAsString();

   /**
    * Removes the <code>mode</code> attribute 
    * @return the current instance of <code>StoredProcedureParameter<T></code> 
    */
   public StoredProcedureParameter<T> removeMode();
}
