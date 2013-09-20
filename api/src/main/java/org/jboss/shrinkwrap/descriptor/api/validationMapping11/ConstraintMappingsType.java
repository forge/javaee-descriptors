package org.jboss.shrinkwrap.descriptor.api.validationMapping11; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> constraint-mappingsType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface ConstraintMappingsType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConstraintMappingsType ElementName: xsd:string ElementType : default-package
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>default-package</code> element
    * @param defaultPackage the value for the element <code>default-package</code> 
    * @return the current instance of <code>ConstraintMappingsType<T></code> 
    */
   public ConstraintMappingsType<T> defaultPackage(String defaultPackage);

   /**
    * Returns the <code>default-package</code> element
    * @return the node defined for the element <code>default-package</code> 
    */
   public String getDefaultPackage();

   /**
    * Removes the <code>default-package</code> element 
    * @return the current instance of <code>ConstraintMappingsType<T></code> 
    */
   public ConstraintMappingsType<T> removeDefaultPackage();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConstraintMappingsType ElementName: map:beanType ElementType : bean
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>bean</code> element will be created and returned.
    * Otherwise, the first existing <code>bean</code> element will be returned.
    * @return the instance defined for the element <code>bean</code> 
    */
   public BeanType<ConstraintMappingsType<T>> getOrCreateBean();

   /**
    * Creates a new <code>bean</code> element 
    * @return the new created instance of <code>BeanType<ConstraintMappingsType<T>></code> 
    */
   public BeanType<ConstraintMappingsType<T>> createBean();

   /**
    * Returns all <code>bean</code> elements
    * @return list of <code>bean</code> 
    */
   public List<BeanType<ConstraintMappingsType<T>>> getAllBean();

   /**
    * Removes all <code>bean</code> elements 
    * @return the current instance of <code>BeanType<ConstraintMappingsType<T>></code> 
    */
   public ConstraintMappingsType<T> removeAllBean();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConstraintMappingsType ElementName: map:constraint-definitionType ElementType : constraint-definition
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>constraint-definition</code> element will be created and returned.
    * Otherwise, the first existing <code>constraint-definition</code> element will be returned.
    * @return the instance defined for the element <code>constraint-definition</code> 
    */
   public ConstraintDefinitionType<ConstraintMappingsType<T>> getOrCreateConstraintDefinition();

   /**
    * Creates a new <code>constraint-definition</code> element 
    * @return the new created instance of <code>ConstraintDefinitionType<ConstraintMappingsType<T>></code> 
    */
   public ConstraintDefinitionType<ConstraintMappingsType<T>> createConstraintDefinition();

   /**
    * Returns all <code>constraint-definition</code> elements
    * @return list of <code>constraint-definition</code> 
    */
   public List<ConstraintDefinitionType<ConstraintMappingsType<T>>> getAllConstraintDefinition();

   /**
    * Removes all <code>constraint-definition</code> elements 
    * @return the current instance of <code>ConstraintDefinitionType<ConstraintMappingsType<T>></code> 
    */
   public ConstraintMappingsType<T> removeAllConstraintDefinition();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConstraintMappingsType ElementName: xsd:token ElementType : version
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   public static final String VERSION = "1.1";

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of <code>ConstraintMappingsType<T></code> 
    */
   public ConstraintMappingsType<T> version(String version);

   /**
    * Returns the <code>version</code> attribute
    * @return the value defined for the attribute <code>version</code> 
    */
   public String getVersion();

   /**
    * Removes the <code>version</code> attribute 
    * @return the current instance of <code>ConstraintMappingsType<T></code> 
    */
   public ConstraintMappingsType<T> removeVersion();
}
