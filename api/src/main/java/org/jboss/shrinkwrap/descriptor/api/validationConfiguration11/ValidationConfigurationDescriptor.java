package org.jboss.shrinkwrap.descriptor.api.validationConfiguration11; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.validationConfiguration11.ExecutableValidationType;
import org.jboss.shrinkwrap.descriptor.api.validationConfiguration11.PropertyType;
import org.jboss.shrinkwrap.descriptor.api.Descriptor;
import org.jboss.shrinkwrap.descriptor.api.DescriptorNamespace;

/** 
 * <p> 
 * This deployment descriptor provides the functionalities as described in the  specification
 * <p> 
 * Example:
 * <p> 
 * <code> 
 *     ValidationConfigurationDescriptor descriptor = Descriptors.create(ValidationConfigurationDescriptor.class);
 * </code> 
 *
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface ValidationConfigurationDescriptor extends Descriptor, DescriptorNamespace<ValidationConfigurationDescriptor>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ValidationConfigurationDescriptor ElementName: xsd:string ElementType : default-provider
   // MaxOccurs: -  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>default-provider</code> element
    * @param defaultProvider the value for the element <code>default-provider</code> 
    * @return the current instance of <code>ValidationConfigurationDescriptor</code> 
    */
   public ValidationConfigurationDescriptor defaultProvider(String defaultProvider);

   /**
    * Returns the <code>default-provider</code> element
    * @return the node defined for the element <code>default-provider</code> 
    */
   public String getDefaultProvider();

   /**
    * Removes the <code>default-provider</code> element 
    * @return the current instance of <code>ValidationConfigurationDescriptor</code> 
    */
   public ValidationConfigurationDescriptor removeDefaultProvider();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ValidationConfigurationDescriptor ElementName: xsd:string ElementType : message-interpolator
   // MaxOccurs: -  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>message-interpolator</code> element
    * @param messageInterpolator the value for the element <code>message-interpolator</code> 
    * @return the current instance of <code>ValidationConfigurationDescriptor</code> 
    */
   public ValidationConfigurationDescriptor messageInterpolator(String messageInterpolator);

   /**
    * Returns the <code>message-interpolator</code> element
    * @return the node defined for the element <code>message-interpolator</code> 
    */
   public String getMessageInterpolator();

   /**
    * Removes the <code>message-interpolator</code> element 
    * @return the current instance of <code>ValidationConfigurationDescriptor</code> 
    */
   public ValidationConfigurationDescriptor removeMessageInterpolator();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ValidationConfigurationDescriptor ElementName: xsd:string ElementType : traversable-resolver
   // MaxOccurs: -  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>traversable-resolver</code> element
    * @param traversableResolver the value for the element <code>traversable-resolver</code> 
    * @return the current instance of <code>ValidationConfigurationDescriptor</code> 
    */
   public ValidationConfigurationDescriptor traversableResolver(String traversableResolver);

   /**
    * Returns the <code>traversable-resolver</code> element
    * @return the node defined for the element <code>traversable-resolver</code> 
    */
   public String getTraversableResolver();

   /**
    * Removes the <code>traversable-resolver</code> element 
    * @return the current instance of <code>ValidationConfigurationDescriptor</code> 
    */
   public ValidationConfigurationDescriptor removeTraversableResolver();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ValidationConfigurationDescriptor ElementName: xsd:string ElementType : constraint-validator-factory
   // MaxOccurs: -  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>constraint-validator-factory</code> element
    * @param constraintValidatorFactory the value for the element <code>constraint-validator-factory</code> 
    * @return the current instance of <code>ValidationConfigurationDescriptor</code> 
    */
   public ValidationConfigurationDescriptor constraintValidatorFactory(String constraintValidatorFactory);

   /**
    * Returns the <code>constraint-validator-factory</code> element
    * @return the node defined for the element <code>constraint-validator-factory</code> 
    */
   public String getConstraintValidatorFactory();

   /**
    * Removes the <code>constraint-validator-factory</code> element 
    * @return the current instance of <code>ValidationConfigurationDescriptor</code> 
    */
   public ValidationConfigurationDescriptor removeConstraintValidatorFactory();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ValidationConfigurationDescriptor ElementName: xsd:string ElementType : parameter-name-provider
   // MaxOccurs: -  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>parameter-name-provider</code> element
    * @param parameterNameProvider the value for the element <code>parameter-name-provider</code> 
    * @return the current instance of <code>ValidationConfigurationDescriptor</code> 
    */
   public ValidationConfigurationDescriptor parameterNameProvider(String parameterNameProvider);

   /**
    * Returns the <code>parameter-name-provider</code> element
    * @return the node defined for the element <code>parameter-name-provider</code> 
    */
   public String getParameterNameProvider();

   /**
    * Removes the <code>parameter-name-provider</code> element 
    * @return the current instance of <code>ValidationConfigurationDescriptor</code> 
    */
   public ValidationConfigurationDescriptor removeParameterNameProvider();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ValidationConfigurationDescriptor ElementName: config:executable-validationType ElementType : executable-validation
   // MaxOccurs: -  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>executable-validation</code> element with the given value will be created.
    * Otherwise, the existing <code>executable-validation</code> element will be returned.
    * @return  a new or existing instance of <code>ExecutableValidationType<ValidationConfigurationDescriptor></code> 
    */
   public ExecutableValidationType<ValidationConfigurationDescriptor> getOrCreateExecutableValidation();

   /**
    * Removes the <code>executable-validation</code> element 
    * @return the current instance of <code>ValidationConfigurationDescriptor</code> 
    */
   public ValidationConfigurationDescriptor removeExecutableValidation();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ValidationConfigurationDescriptor ElementName: xsd:string ElementType : constraint-mapping
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>constraint-mapping</code> elements, 
    * a new <code>constraint-mapping</code> element 
    * @param values list of <code>constraint-mapping</code> objects 
    * @return the current instance of <code>ValidationConfigurationDescriptor</code> 
    */
   public ValidationConfigurationDescriptor constraintMapping(String ... values);

   /**
    * Returns all <code>constraint-mapping</code> elements
    * @return list of <code>constraint-mapping</code> 
    */
   public List<String> getAllConstraintMapping();

   /**
    * Removes the <code>constraint-mapping</code> element 
    * @return the current instance of <code>ValidationConfigurationDescriptor</code> 
    */
   public ValidationConfigurationDescriptor removeAllConstraintMapping();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ValidationConfigurationDescriptor ElementName: config:propertyType ElementType : property
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>property</code> element will be created and returned.
    * Otherwise, the first existing <code>property</code> element will be returned.
    * @return the instance defined for the element <code>property</code> 
    */
   public PropertyType<ValidationConfigurationDescriptor> getOrCreateProperty();

   /**
    * Creates a new <code>property</code> element 
    * @return the new created instance of <code>PropertyType<ValidationConfigurationDescriptor></code> 
    */
   public PropertyType<ValidationConfigurationDescriptor> createProperty();

   /**
    * Returns all <code>property</code> elements
    * @return list of <code>property</code> 
    */
   public List<PropertyType<ValidationConfigurationDescriptor>> getAllProperty();

   /**
    * Removes all <code>property</code> elements 
    * @return the current instance of <code>PropertyType<ValidationConfigurationDescriptor></code> 
    */
   public ValidationConfigurationDescriptor removeAllProperty();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ValidationConfigurationDescriptor ElementName: xsd:token ElementType : version
   // MaxOccurs: -  isGeneric: false   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   public static final String VERSION = "1.1";

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of <code>ValidationConfigurationDescriptor</code> 
    */
   public ValidationConfigurationDescriptor version(String version);

   /**
    * Returns the <code>version</code> attribute
    * @return the value defined for the attribute <code>version</code> 
    */
   public String getVersion();

   /**
    * Removes the <code>version</code> attribute 
    * @return the current instance of <code>ValidationConfigurationDescriptor</code> 
    */
   public ValidationConfigurationDescriptor removeVersion();
}
