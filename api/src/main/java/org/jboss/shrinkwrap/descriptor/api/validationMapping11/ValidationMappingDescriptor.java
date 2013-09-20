package org.jboss.shrinkwrap.descriptor.api.validationMapping11; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.validationMapping11.BeanType;
import org.jboss.shrinkwrap.descriptor.api.validationMapping11.ConstraintDefinitionType;
import org.jboss.shrinkwrap.descriptor.api.Descriptor;
import org.jboss.shrinkwrap.descriptor.api.DescriptorNamespace;

/** 
 * <p> 
 * This deployment descriptor provides the functionalities as described in the  specification
 * <p> 
 * Example:
 * <p> 
 * <code> 
 *     ValidationMappingDescriptor descriptor = Descriptors.create(ValidationMappingDescriptor.class);
 * </code> 
 *
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface ValidationMappingDescriptor extends Descriptor, DescriptorNamespace<ValidationMappingDescriptor>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ValidationMappingDescriptor ElementName: xsd:string ElementType : default-package
   // MaxOccurs: -  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>default-package</code> element
    * @param defaultPackage the value for the element <code>default-package</code> 
    * @return the current instance of <code>ValidationMappingDescriptor</code> 
    */
   public ValidationMappingDescriptor defaultPackage(String defaultPackage);

   /**
    * Returns the <code>default-package</code> element
    * @return the node defined for the element <code>default-package</code> 
    */
   public String getDefaultPackage();

   /**
    * Removes the <code>default-package</code> element 
    * @return the current instance of <code>ValidationMappingDescriptor</code> 
    */
   public ValidationMappingDescriptor removeDefaultPackage();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ValidationMappingDescriptor ElementName: map:beanType ElementType : bean
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>bean</code> element will be created and returned.
    * Otherwise, the first existing <code>bean</code> element will be returned.
    * @return the instance defined for the element <code>bean</code> 
    */
   public BeanType<ValidationMappingDescriptor> getOrCreateBean();

   /**
    * Creates a new <code>bean</code> element 
    * @return the new created instance of <code>BeanType<ValidationMappingDescriptor></code> 
    */
   public BeanType<ValidationMappingDescriptor> createBean();

   /**
    * Returns all <code>bean</code> elements
    * @return list of <code>bean</code> 
    */
   public List<BeanType<ValidationMappingDescriptor>> getAllBean();

   /**
    * Removes all <code>bean</code> elements 
    * @return the current instance of <code>BeanType<ValidationMappingDescriptor></code> 
    */
   public ValidationMappingDescriptor removeAllBean();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ValidationMappingDescriptor ElementName: map:constraint-definitionType ElementType : constraint-definition
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>constraint-definition</code> element will be created and returned.
    * Otherwise, the first existing <code>constraint-definition</code> element will be returned.
    * @return the instance defined for the element <code>constraint-definition</code> 
    */
   public ConstraintDefinitionType<ValidationMappingDescriptor> getOrCreateConstraintDefinition();

   /**
    * Creates a new <code>constraint-definition</code> element 
    * @return the new created instance of <code>ConstraintDefinitionType<ValidationMappingDescriptor></code> 
    */
   public ConstraintDefinitionType<ValidationMappingDescriptor> createConstraintDefinition();

   /**
    * Returns all <code>constraint-definition</code> elements
    * @return list of <code>constraint-definition</code> 
    */
   public List<ConstraintDefinitionType<ValidationMappingDescriptor>> getAllConstraintDefinition();

   /**
    * Removes all <code>constraint-definition</code> elements 
    * @return the current instance of <code>ConstraintDefinitionType<ValidationMappingDescriptor></code> 
    */
   public ValidationMappingDescriptor removeAllConstraintDefinition();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ValidationMappingDescriptor ElementName: xsd:token ElementType : version
   // MaxOccurs: -  isGeneric: false   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   public static final String VERSION = "1.1";

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of <code>ValidationMappingDescriptor</code> 
    */
   public ValidationMappingDescriptor version(String version);

   /**
    * Returns the <code>version</code> attribute
    * @return the value defined for the attribute <code>version</code> 
    */
   public String getVersion();

   /**
    * Removes the <code>version</code> attribute 
    * @return the current instance of <code>ValidationMappingDescriptor</code> 
    */
   public ValidationMappingDescriptor removeVersion();
}
