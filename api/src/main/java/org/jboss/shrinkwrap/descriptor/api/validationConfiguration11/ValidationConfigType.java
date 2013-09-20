package org.jboss.shrinkwrap.descriptor.api.validationConfiguration11; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.validationConfiguration11.ExecutableValidationType;
import org.jboss.shrinkwrap.descriptor.api.validationConfiguration11.PropertyType;
/**
 * This interface defines the contract for the <code> validation-configType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface ValidationConfigType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ValidationConfigType ElementName: xsd:string ElementType : default-provider
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>default-provider</code> element
    * @param defaultProvider the value for the element <code>default-provider</code> 
    * @return the current instance of <code>ValidationConfigType<T></code> 
    */
   public ValidationConfigType<T> defaultProvider(String defaultProvider);

   /**
    * Returns the <code>default-provider</code> element
    * @return the node defined for the element <code>default-provider</code> 
    */
   public String getDefaultProvider();

   /**
    * Removes the <code>default-provider</code> element 
    * @return the current instance of <code>ValidationConfigType<T></code> 
    */
   public ValidationConfigType<T> removeDefaultProvider();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ValidationConfigType ElementName: xsd:string ElementType : message-interpolator
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>message-interpolator</code> element
    * @param messageInterpolator the value for the element <code>message-interpolator</code> 
    * @return the current instance of <code>ValidationConfigType<T></code> 
    */
   public ValidationConfigType<T> messageInterpolator(String messageInterpolator);

   /**
    * Returns the <code>message-interpolator</code> element
    * @return the node defined for the element <code>message-interpolator</code> 
    */
   public String getMessageInterpolator();

   /**
    * Removes the <code>message-interpolator</code> element 
    * @return the current instance of <code>ValidationConfigType<T></code> 
    */
   public ValidationConfigType<T> removeMessageInterpolator();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ValidationConfigType ElementName: xsd:string ElementType : traversable-resolver
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>traversable-resolver</code> element
    * @param traversableResolver the value for the element <code>traversable-resolver</code> 
    * @return the current instance of <code>ValidationConfigType<T></code> 
    */
   public ValidationConfigType<T> traversableResolver(String traversableResolver);

   /**
    * Returns the <code>traversable-resolver</code> element
    * @return the node defined for the element <code>traversable-resolver</code> 
    */
   public String getTraversableResolver();

   /**
    * Removes the <code>traversable-resolver</code> element 
    * @return the current instance of <code>ValidationConfigType<T></code> 
    */
   public ValidationConfigType<T> removeTraversableResolver();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ValidationConfigType ElementName: xsd:string ElementType : constraint-validator-factory
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>constraint-validator-factory</code> element
    * @param constraintValidatorFactory the value for the element <code>constraint-validator-factory</code> 
    * @return the current instance of <code>ValidationConfigType<T></code> 
    */
   public ValidationConfigType<T> constraintValidatorFactory(String constraintValidatorFactory);

   /**
    * Returns the <code>constraint-validator-factory</code> element
    * @return the node defined for the element <code>constraint-validator-factory</code> 
    */
   public String getConstraintValidatorFactory();

   /**
    * Removes the <code>constraint-validator-factory</code> element 
    * @return the current instance of <code>ValidationConfigType<T></code> 
    */
   public ValidationConfigType<T> removeConstraintValidatorFactory();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ValidationConfigType ElementName: xsd:string ElementType : parameter-name-provider
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>parameter-name-provider</code> element
    * @param parameterNameProvider the value for the element <code>parameter-name-provider</code> 
    * @return the current instance of <code>ValidationConfigType<T></code> 
    */
   public ValidationConfigType<T> parameterNameProvider(String parameterNameProvider);

   /**
    * Returns the <code>parameter-name-provider</code> element
    * @return the node defined for the element <code>parameter-name-provider</code> 
    */
   public String getParameterNameProvider();

   /**
    * Removes the <code>parameter-name-provider</code> element 
    * @return the current instance of <code>ValidationConfigType<T></code> 
    */
   public ValidationConfigType<T> removeParameterNameProvider();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ValidationConfigType ElementName: config:executable-validationType ElementType : executable-validation
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>executable-validation</code> element with the given value will be created.
    * Otherwise, the existing <code>executable-validation</code> element will be returned.
    * @return  a new or existing instance of <code>ExecutableValidationType<ValidationConfigType<T>></code> 
    */
   public ExecutableValidationType<ValidationConfigType<T>> getOrCreateExecutableValidation();

   /**
    * Removes the <code>executable-validation</code> element 
    * @return the current instance of <code>ValidationConfigType<T></code> 
    */
   public ValidationConfigType<T> removeExecutableValidation();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ValidationConfigType ElementName: xsd:string ElementType : constraint-mapping
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>constraint-mapping</code> elements, 
    * a new <code>constraint-mapping</code> element 
    * @param values list of <code>constraint-mapping</code> objects 
    * @return the current instance of <code>ValidationConfigType<T></code> 
    */
   public ValidationConfigType<T> constraintMapping(String ... values);

   /**
    * Returns all <code>constraint-mapping</code> elements
    * @return list of <code>constraint-mapping</code> 
    */
   public List<String> getAllConstraintMapping();

   /**
    * Removes the <code>constraint-mapping</code> element 
    * @return the current instance of <code>ValidationConfigType<T></code> 
    */
   public ValidationConfigType<T> removeAllConstraintMapping();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ValidationConfigType ElementName: config:propertyType ElementType : property
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>property</code> element will be created and returned.
    * Otherwise, the first existing <code>property</code> element will be returned.
    * @return the instance defined for the element <code>property</code> 
    */
   public PropertyType<ValidationConfigType<T>> getOrCreateProperty();

   /**
    * Creates a new <code>property</code> element 
    * @return the new created instance of <code>PropertyType<ValidationConfigType<T>></code> 
    */
   public PropertyType<ValidationConfigType<T>> createProperty();

   /**
    * Returns all <code>property</code> elements
    * @return list of <code>property</code> 
    */
   public List<PropertyType<ValidationConfigType<T>>> getAllProperty();

   /**
    * Removes all <code>property</code> elements 
    * @return the current instance of <code>PropertyType<ValidationConfigType<T>></code> 
    */
   public ValidationConfigType<T> removeAllProperty();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ValidationConfigType ElementName: xsd:token ElementType : version
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   public static final String VERSION = "1.1";

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of <code>ValidationConfigType<T></code> 
    */
   public ValidationConfigType<T> version(String version);

   /**
    * Returns the <code>version</code> attribute
    * @return the value defined for the attribute <code>version</code> 
    */
   public String getVersion();

   /**
    * Removes the <code>version</code> attribute 
    * @return the current instance of <code>ValidationConfigType<T></code> 
    */
   public ValidationConfigType<T> removeVersion();
}
