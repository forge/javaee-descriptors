package org.jboss.shrinkwrap.descriptor.api.facesconfig21; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.facesconfig20.FacesConfigVersionType;
/**
 * This interface defines the contract for the <code> faces-configType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface FacesConfigType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigType ElementName: javaee:faces-config-applicationType ElementType : application
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>application</code> element will be created and returned.
    * Otherwise, the first existing <code>application</code> element will be returned.
    * @return the instance defined for the element <code>application</code> 
    */
   public FacesConfigApplicationType<FacesConfigType<T>> getOrCreateApplication();

   /**
    * Creates a new <code>application</code> element 
    * @return the new created instance of <code>FacesConfigApplicationType<FacesConfigType<T>></code> 
    */
   public FacesConfigApplicationType<FacesConfigType<T>> createApplication();

   /**
    * Returns all <code>application</code> elements
    * @return list of <code>application</code> 
    */
   public List<FacesConfigApplicationType<FacesConfigType<T>>> getAllApplication();

   /**
    * Removes all <code>application</code> elements 
    * @return the current instance of <code>FacesConfigApplicationType<FacesConfigType<T>></code> 
    */
   public FacesConfigType<T> removeAllApplication();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigType ElementName: javaee:faces-config-orderingType ElementType : ordering
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>ordering</code> element will be created and returned.
    * Otherwise, the first existing <code>ordering</code> element will be returned.
    * @return the instance defined for the element <code>ordering</code> 
    */
   public FacesConfigOrderingType<FacesConfigType<T>> getOrCreateOrdering();

   /**
    * Creates a new <code>ordering</code> element 
    * @return the new created instance of <code>FacesConfigOrderingType<FacesConfigType<T>></code> 
    */
   public FacesConfigOrderingType<FacesConfigType<T>> createOrdering();

   /**
    * Returns all <code>ordering</code> elements
    * @return list of <code>ordering</code> 
    */
   public List<FacesConfigOrderingType<FacesConfigType<T>>> getAllOrdering();

   /**
    * Removes all <code>ordering</code> elements 
    * @return the current instance of <code>FacesConfigOrderingType<FacesConfigType<T>></code> 
    */
   public FacesConfigType<T> removeAllOrdering();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigType ElementName: javaee:faces-config-absoluteOrderingType ElementType : absolute-ordering
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>absolute-ordering</code> element will be created and returned.
    * Otherwise, the first existing <code>absolute-ordering</code> element will be returned.
    * @return the instance defined for the element <code>absolute-ordering</code> 
    */
   public FacesConfigAbsoluteOrderingType<FacesConfigType<T>> getOrCreateAbsoluteOrdering();

   /**
    * Creates a new <code>absolute-ordering</code> element 
    * @return the new created instance of <code>FacesConfigAbsoluteOrderingType<FacesConfigType<T>></code> 
    */
   public FacesConfigAbsoluteOrderingType<FacesConfigType<T>> createAbsoluteOrdering();

   /**
    * Returns all <code>absolute-ordering</code> elements
    * @return list of <code>absolute-ordering</code> 
    */
   public List<FacesConfigAbsoluteOrderingType<FacesConfigType<T>>> getAllAbsoluteOrdering();

   /**
    * Removes all <code>absolute-ordering</code> elements 
    * @return the current instance of <code>FacesConfigAbsoluteOrderingType<FacesConfigType<T>></code> 
    */
   public FacesConfigType<T> removeAllAbsoluteOrdering();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigType ElementName: javaee:faces-config-factoryType ElementType : factory
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>factory</code> element will be created and returned.
    * Otherwise, the first existing <code>factory</code> element will be returned.
    * @return the instance defined for the element <code>factory</code> 
    */
   public FacesConfigFactoryType<FacesConfigType<T>> getOrCreateFactory();

   /**
    * Creates a new <code>factory</code> element 
    * @return the new created instance of <code>FacesConfigFactoryType<FacesConfigType<T>></code> 
    */
   public FacesConfigFactoryType<FacesConfigType<T>> createFactory();

   /**
    * Returns all <code>factory</code> elements
    * @return list of <code>factory</code> 
    */
   public List<FacesConfigFactoryType<FacesConfigType<T>>> getAllFactory();

   /**
    * Removes all <code>factory</code> elements 
    * @return the current instance of <code>FacesConfigFactoryType<FacesConfigType<T>></code> 
    */
   public FacesConfigType<T> removeAllFactory();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigType ElementName: javaee:faces-config-componentType ElementType : component
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>component</code> element will be created and returned.
    * Otherwise, the first existing <code>component</code> element will be returned.
    * @return the instance defined for the element <code>component</code> 
    */
   public FacesConfigComponentType<FacesConfigType<T>> getOrCreateComponent();

   /**
    * Creates a new <code>component</code> element 
    * @return the new created instance of <code>FacesConfigComponentType<FacesConfigType<T>></code> 
    */
   public FacesConfigComponentType<FacesConfigType<T>> createComponent();

   /**
    * Returns all <code>component</code> elements
    * @return list of <code>component</code> 
    */
   public List<FacesConfigComponentType<FacesConfigType<T>>> getAllComponent();

   /**
    * Removes all <code>component</code> elements 
    * @return the current instance of <code>FacesConfigComponentType<FacesConfigType<T>></code> 
    */
   public FacesConfigType<T> removeAllComponent();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigType ElementName: javaee:faces-config-converterType ElementType : converter
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>converter</code> element will be created and returned.
    * Otherwise, the first existing <code>converter</code> element will be returned.
    * @return the instance defined for the element <code>converter</code> 
    */
   public FacesConfigConverterType<FacesConfigType<T>> getOrCreateConverter();

   /**
    * Creates a new <code>converter</code> element 
    * @return the new created instance of <code>FacesConfigConverterType<FacesConfigType<T>></code> 
    */
   public FacesConfigConverterType<FacesConfigType<T>> createConverter();

   /**
    * Returns all <code>converter</code> elements
    * @return list of <code>converter</code> 
    */
   public List<FacesConfigConverterType<FacesConfigType<T>>> getAllConverter();

   /**
    * Removes all <code>converter</code> elements 
    * @return the current instance of <code>FacesConfigConverterType<FacesConfigType<T>></code> 
    */
   public FacesConfigType<T> removeAllConverter();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigType ElementName: javaee:faces-config-managed-beanType ElementType : managed-bean
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>managed-bean</code> element will be created and returned.
    * Otherwise, the first existing <code>managed-bean</code> element will be returned.
    * @return the instance defined for the element <code>managed-bean</code> 
    */
   public FacesConfigManagedBeanType<FacesConfigType<T>> getOrCreateManagedBean();

   /**
    * Creates a new <code>managed-bean</code> element 
    * @return the new created instance of <code>FacesConfigManagedBeanType<FacesConfigType<T>></code> 
    */
   public FacesConfigManagedBeanType<FacesConfigType<T>> createManagedBean();

   /**
    * Returns all <code>managed-bean</code> elements
    * @return list of <code>managed-bean</code> 
    */
   public List<FacesConfigManagedBeanType<FacesConfigType<T>>> getAllManagedBean();

   /**
    * Removes all <code>managed-bean</code> elements 
    * @return the current instance of <code>FacesConfigManagedBeanType<FacesConfigType<T>></code> 
    */
   public FacesConfigType<T> removeAllManagedBean();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigType ElementName: xsd:token ElementType : name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>name</code> elements, 
    * a new <code>name</code> element 
    * @param values list of <code>name</code> objects 
    * @return the current instance of <code>FacesConfigType<T></code> 
    */
   public FacesConfigType<T> name(String ... values);

   /**
    * Returns all <code>name</code> elements
    * @return list of <code>name</code> 
    */
   public List<String> getAllName();

   /**
    * Removes the <code>name</code> element 
    * @return the current instance of <code>FacesConfigType<T></code> 
    */
   public FacesConfigType<T> removeAllName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigType ElementName: javaee:faces-config-navigation-ruleType ElementType : navigation-rule
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>navigation-rule</code> element will be created and returned.
    * Otherwise, the first existing <code>navigation-rule</code> element will be returned.
    * @return the instance defined for the element <code>navigation-rule</code> 
    */
   public FacesConfigNavigationRuleType<FacesConfigType<T>> getOrCreateNavigationRule();

   /**
    * Creates a new <code>navigation-rule</code> element 
    * @return the new created instance of <code>FacesConfigNavigationRuleType<FacesConfigType<T>></code> 
    */
   public FacesConfigNavigationRuleType<FacesConfigType<T>> createNavigationRule();

   /**
    * Returns all <code>navigation-rule</code> elements
    * @return list of <code>navigation-rule</code> 
    */
   public List<FacesConfigNavigationRuleType<FacesConfigType<T>>> getAllNavigationRule();

   /**
    * Removes all <code>navigation-rule</code> elements 
    * @return the current instance of <code>FacesConfigNavigationRuleType<FacesConfigType<T>></code> 
    */
   public FacesConfigType<T> removeAllNavigationRule();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigType ElementName: javaee:faces-config-referenced-beanType ElementType : referenced-bean
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>referenced-bean</code> element will be created and returned.
    * Otherwise, the first existing <code>referenced-bean</code> element will be returned.
    * @return the instance defined for the element <code>referenced-bean</code> 
    */
   public FacesConfigReferencedBeanType<FacesConfigType<T>> getOrCreateReferencedBean();

   /**
    * Creates a new <code>referenced-bean</code> element 
    * @return the new created instance of <code>FacesConfigReferencedBeanType<FacesConfigType<T>></code> 
    */
   public FacesConfigReferencedBeanType<FacesConfigType<T>> createReferencedBean();

   /**
    * Returns all <code>referenced-bean</code> elements
    * @return list of <code>referenced-bean</code> 
    */
   public List<FacesConfigReferencedBeanType<FacesConfigType<T>>> getAllReferencedBean();

   /**
    * Removes all <code>referenced-bean</code> elements 
    * @return the current instance of <code>FacesConfigReferencedBeanType<FacesConfigType<T>></code> 
    */
   public FacesConfigType<T> removeAllReferencedBean();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigType ElementName: javaee:faces-config-render-kitType ElementType : render-kit
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>render-kit</code> element will be created and returned.
    * Otherwise, the first existing <code>render-kit</code> element will be returned.
    * @return the instance defined for the element <code>render-kit</code> 
    */
   public FacesConfigRenderKitType<FacesConfigType<T>> getOrCreateRenderKit();

   /**
    * Creates a new <code>render-kit</code> element 
    * @return the new created instance of <code>FacesConfigRenderKitType<FacesConfigType<T>></code> 
    */
   public FacesConfigRenderKitType<FacesConfigType<T>> createRenderKit();

   /**
    * Returns all <code>render-kit</code> elements
    * @return list of <code>render-kit</code> 
    */
   public List<FacesConfigRenderKitType<FacesConfigType<T>>> getAllRenderKit();

   /**
    * Removes all <code>render-kit</code> elements 
    * @return the current instance of <code>FacesConfigRenderKitType<FacesConfigType<T>></code> 
    */
   public FacesConfigType<T> removeAllRenderKit();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigType ElementName: javaee:faces-config-lifecycleType ElementType : lifecycle
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>lifecycle</code> element will be created and returned.
    * Otherwise, the first existing <code>lifecycle</code> element will be returned.
    * @return the instance defined for the element <code>lifecycle</code> 
    */
   public FacesConfigLifecycleType<FacesConfigType<T>> getOrCreateLifecycle();

   /**
    * Creates a new <code>lifecycle</code> element 
    * @return the new created instance of <code>FacesConfigLifecycleType<FacesConfigType<T>></code> 
    */
   public FacesConfigLifecycleType<FacesConfigType<T>> createLifecycle();

   /**
    * Returns all <code>lifecycle</code> elements
    * @return list of <code>lifecycle</code> 
    */
   public List<FacesConfigLifecycleType<FacesConfigType<T>>> getAllLifecycle();

   /**
    * Removes all <code>lifecycle</code> elements 
    * @return the current instance of <code>FacesConfigLifecycleType<FacesConfigType<T>></code> 
    */
   public FacesConfigType<T> removeAllLifecycle();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigType ElementName: javaee:faces-config-validatorType ElementType : validator
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>validator</code> element will be created and returned.
    * Otherwise, the first existing <code>validator</code> element will be returned.
    * @return the instance defined for the element <code>validator</code> 
    */
   public FacesConfigValidatorType<FacesConfigType<T>> getOrCreateValidator();

   /**
    * Creates a new <code>validator</code> element 
    * @return the new created instance of <code>FacesConfigValidatorType<FacesConfigType<T>></code> 
    */
   public FacesConfigValidatorType<FacesConfigType<T>> createValidator();

   /**
    * Returns all <code>validator</code> elements
    * @return list of <code>validator</code> 
    */
   public List<FacesConfigValidatorType<FacesConfigType<T>>> getAllValidator();

   /**
    * Removes all <code>validator</code> elements 
    * @return the current instance of <code>FacesConfigValidatorType<FacesConfigType<T>></code> 
    */
   public FacesConfigType<T> removeAllValidator();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigType ElementName: javaee:faces-config-behaviorType ElementType : behavior
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>behavior</code> element will be created and returned.
    * Otherwise, the first existing <code>behavior</code> element will be returned.
    * @return the instance defined for the element <code>behavior</code> 
    */
   public FacesConfigBehaviorType<FacesConfigType<T>> getOrCreateBehavior();

   /**
    * Creates a new <code>behavior</code> element 
    * @return the new created instance of <code>FacesConfigBehaviorType<FacesConfigType<T>></code> 
    */
   public FacesConfigBehaviorType<FacesConfigType<T>> createBehavior();

   /**
    * Returns all <code>behavior</code> elements
    * @return list of <code>behavior</code> 
    */
   public List<FacesConfigBehaviorType<FacesConfigType<T>>> getAllBehavior();

   /**
    * Removes all <code>behavior</code> elements 
    * @return the current instance of <code>FacesConfigBehaviorType<FacesConfigType<T>></code> 
    */
   public FacesConfigType<T> removeAllBehavior();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigType ElementName: javaee:faces-config-extensionType ElementType : faces-config-extension
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>faces-config-extension</code> element 
    * @return the current instance of <code>FacesConfigType<T></code> 
    */
   public FacesConfigType<T> facesConfigExtension();

   /**
    * Removes the <code>faces-config-extension</code> element 
    * @return the current instance of <code>FacesConfigType<T></code> 
    */
   public Boolean isFacesConfigExtension();

   /**
    * Removes the <code>faces-config-extension</code> element 
    * @return the current instance of <code>FacesConfigType<T></code> 
    */
   public FacesConfigType<T> removeFacesConfigExtension();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigType ElementName: xsd:boolean ElementType : metadata-complete
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>metadata-complete</code> attribute
    * @param metadataComplete the value for the attribute <code>metadata-complete</code> 
    * @return the current instance of <code>FacesConfigType<T></code> 
    */
   public FacesConfigType<T> metadataComplete(Boolean metadataComplete);

   /**
    * Returns the <code>metadata-complete</code> attribute
    * @return the value defined for the attribute <code>metadata-complete</code> 
    */
public Boolean isMetadataComplete();

   /**
    * Removes the <code>metadata-complete</code> attribute 
    * @return the current instance of <code>FacesConfigType<T></code> 
    */
   public FacesConfigType<T> removeMetadataComplete();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>FacesConfigType<T></code> 
    */
   public FacesConfigType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>FacesConfigType<T></code> 
    */
   public FacesConfigType<T> removeId();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigType ElementName: javaee:faces-config-versionType ElementType : version
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of <code>FacesConfigType<T></code> 
    */
   public FacesConfigType<T> version(FacesConfigVersionType version);

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of <code>FacesConfigType<T></code> 
    */
   public FacesConfigType<T> version(String version);

   /**
    * Returns the <code>version</code> attribute
    * @return the value defined for the attribute <code>version</code> 
    */
public FacesConfigVersionType getVersion();

   /**
    * Returns the <code>version</code> attribute
    * @return the value found for the element <code>version</code> 
    */
   public String  getVersionAsString();

   /**
    * Removes the <code>version</code> attribute 
    * @return the current instance of <code>FacesConfigType<T></code> 
    */
   public FacesConfigType<T> removeVersion();
}
