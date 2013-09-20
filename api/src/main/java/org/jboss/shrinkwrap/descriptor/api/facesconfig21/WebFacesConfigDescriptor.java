package org.jboss.shrinkwrap.descriptor.api.facesconfig21; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.facesconfig21.FacesConfigApplicationType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig21.FacesConfigOrderingType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig21.FacesConfigAbsoluteOrderingType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig21.FacesConfigFactoryType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig21.FacesConfigComponentType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig21.FacesConfigConverterType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig21.FacesConfigManagedBeanType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig21.FacesConfigNavigationRuleType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig21.FacesConfigReferencedBeanType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig21.FacesConfigRenderKitType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig21.FacesConfigLifecycleType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig21.FacesConfigValidatorType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig21.FacesConfigBehaviorType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig21.FacesConfigExtensionType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig20.FacesConfigVersionType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig21.FacesConfigApplicationType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig21.FacesConfigOrderingType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig21.FacesConfigAbsoluteOrderingType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig21.FacesConfigFactoryType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig21.FacesConfigComponentType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig21.FacesConfigConverterType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig21.FacesConfigManagedBeanType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig21.FacesConfigNavigationRuleType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig21.FacesConfigReferencedBeanType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig21.FacesConfigRenderKitType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig21.FacesConfigLifecycleType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig21.FacesConfigValidatorType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig21.FacesConfigBehaviorType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig21.FacesConfigExtensionType;
import org.jboss.shrinkwrap.descriptor.api.facesconfig20.FacesConfigVersionType;
import org.jboss.shrinkwrap.descriptor.api.Descriptor;
import org.jboss.shrinkwrap.descriptor.api.DescriptorNamespace;

/** 
 * <p> 
 * This deployment descriptor provides the functionalities as described in the  specification
 * <p> 
 * Example:
 * <p> 
 * <code> 
 *     WebFacesConfigDescriptor descriptor = Descriptors.create(WebFacesConfigDescriptor.class);
 * </code> 
 *
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface WebFacesConfigDescriptor extends Descriptor, DescriptorNamespace<WebFacesConfigDescriptor>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFacesConfigDescriptor ElementName: javaee:faces-config-applicationType ElementType : application
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>application</code> element will be created and returned.
    * Otherwise, the first existing <code>application</code> element will be returned.
    * @return the instance defined for the element <code>application</code> 
    */
   public FacesConfigApplicationType<WebFacesConfigDescriptor> getOrCreateApplication();

   /**
    * Creates a new <code>application</code> element 
    * @return the new created instance of <code>FacesConfigApplicationType<WebFacesConfigDescriptor></code> 
    */
   public FacesConfigApplicationType<WebFacesConfigDescriptor> createApplication();

   /**
    * Returns all <code>application</code> elements
    * @return list of <code>application</code> 
    */
   public List<FacesConfigApplicationType<WebFacesConfigDescriptor>> getAllApplication();

   /**
    * Removes all <code>application</code> elements 
    * @return the current instance of <code>FacesConfigApplicationType<WebFacesConfigDescriptor></code> 
    */
   public WebFacesConfigDescriptor removeAllApplication();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFacesConfigDescriptor ElementName: javaee:faces-config-orderingType ElementType : ordering
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>ordering</code> element will be created and returned.
    * Otherwise, the first existing <code>ordering</code> element will be returned.
    * @return the instance defined for the element <code>ordering</code> 
    */
   public FacesConfigOrderingType<WebFacesConfigDescriptor> getOrCreateOrdering();

   /**
    * Creates a new <code>ordering</code> element 
    * @return the new created instance of <code>FacesConfigOrderingType<WebFacesConfigDescriptor></code> 
    */
   public FacesConfigOrderingType<WebFacesConfigDescriptor> createOrdering();

   /**
    * Returns all <code>ordering</code> elements
    * @return list of <code>ordering</code> 
    */
   public List<FacesConfigOrderingType<WebFacesConfigDescriptor>> getAllOrdering();

   /**
    * Removes all <code>ordering</code> elements 
    * @return the current instance of <code>FacesConfigOrderingType<WebFacesConfigDescriptor></code> 
    */
   public WebFacesConfigDescriptor removeAllOrdering();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFacesConfigDescriptor ElementName: javaee:faces-config-absoluteOrderingType ElementType : absolute-ordering
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>absolute-ordering</code> element will be created and returned.
    * Otherwise, the first existing <code>absolute-ordering</code> element will be returned.
    * @return the instance defined for the element <code>absolute-ordering</code> 
    */
   public FacesConfigAbsoluteOrderingType<WebFacesConfigDescriptor> getOrCreateAbsoluteOrdering();

   /**
    * Creates a new <code>absolute-ordering</code> element 
    * @return the new created instance of <code>FacesConfigAbsoluteOrderingType<WebFacesConfigDescriptor></code> 
    */
   public FacesConfigAbsoluteOrderingType<WebFacesConfigDescriptor> createAbsoluteOrdering();

   /**
    * Returns all <code>absolute-ordering</code> elements
    * @return list of <code>absolute-ordering</code> 
    */
   public List<FacesConfigAbsoluteOrderingType<WebFacesConfigDescriptor>> getAllAbsoluteOrdering();

   /**
    * Removes all <code>absolute-ordering</code> elements 
    * @return the current instance of <code>FacesConfigAbsoluteOrderingType<WebFacesConfigDescriptor></code> 
    */
   public WebFacesConfigDescriptor removeAllAbsoluteOrdering();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFacesConfigDescriptor ElementName: javaee:faces-config-factoryType ElementType : factory
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>factory</code> element will be created and returned.
    * Otherwise, the first existing <code>factory</code> element will be returned.
    * @return the instance defined for the element <code>factory</code> 
    */
   public FacesConfigFactoryType<WebFacesConfigDescriptor> getOrCreateFactory();

   /**
    * Creates a new <code>factory</code> element 
    * @return the new created instance of <code>FacesConfigFactoryType<WebFacesConfigDescriptor></code> 
    */
   public FacesConfigFactoryType<WebFacesConfigDescriptor> createFactory();

   /**
    * Returns all <code>factory</code> elements
    * @return list of <code>factory</code> 
    */
   public List<FacesConfigFactoryType<WebFacesConfigDescriptor>> getAllFactory();

   /**
    * Removes all <code>factory</code> elements 
    * @return the current instance of <code>FacesConfigFactoryType<WebFacesConfigDescriptor></code> 
    */
   public WebFacesConfigDescriptor removeAllFactory();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFacesConfigDescriptor ElementName: javaee:faces-config-componentType ElementType : component
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>component</code> element will be created and returned.
    * Otherwise, the first existing <code>component</code> element will be returned.
    * @return the instance defined for the element <code>component</code> 
    */
   public FacesConfigComponentType<WebFacesConfigDescriptor> getOrCreateComponent();

   /**
    * Creates a new <code>component</code> element 
    * @return the new created instance of <code>FacesConfigComponentType<WebFacesConfigDescriptor></code> 
    */
   public FacesConfigComponentType<WebFacesConfigDescriptor> createComponent();

   /**
    * Returns all <code>component</code> elements
    * @return list of <code>component</code> 
    */
   public List<FacesConfigComponentType<WebFacesConfigDescriptor>> getAllComponent();

   /**
    * Removes all <code>component</code> elements 
    * @return the current instance of <code>FacesConfigComponentType<WebFacesConfigDescriptor></code> 
    */
   public WebFacesConfigDescriptor removeAllComponent();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFacesConfigDescriptor ElementName: javaee:faces-config-converterType ElementType : converter
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>converter</code> element will be created and returned.
    * Otherwise, the first existing <code>converter</code> element will be returned.
    * @return the instance defined for the element <code>converter</code> 
    */
   public FacesConfigConverterType<WebFacesConfigDescriptor> getOrCreateConverter();

   /**
    * Creates a new <code>converter</code> element 
    * @return the new created instance of <code>FacesConfigConverterType<WebFacesConfigDescriptor></code> 
    */
   public FacesConfigConverterType<WebFacesConfigDescriptor> createConverter();

   /**
    * Returns all <code>converter</code> elements
    * @return list of <code>converter</code> 
    */
   public List<FacesConfigConverterType<WebFacesConfigDescriptor>> getAllConverter();

   /**
    * Removes all <code>converter</code> elements 
    * @return the current instance of <code>FacesConfigConverterType<WebFacesConfigDescriptor></code> 
    */
   public WebFacesConfigDescriptor removeAllConverter();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFacesConfigDescriptor ElementName: javaee:faces-config-managed-beanType ElementType : managed-bean
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>managed-bean</code> element will be created and returned.
    * Otherwise, the first existing <code>managed-bean</code> element will be returned.
    * @return the instance defined for the element <code>managed-bean</code> 
    */
   public FacesConfigManagedBeanType<WebFacesConfigDescriptor> getOrCreateManagedBean();

   /**
    * Creates a new <code>managed-bean</code> element 
    * @return the new created instance of <code>FacesConfigManagedBeanType<WebFacesConfigDescriptor></code> 
    */
   public FacesConfigManagedBeanType<WebFacesConfigDescriptor> createManagedBean();

   /**
    * Returns all <code>managed-bean</code> elements
    * @return list of <code>managed-bean</code> 
    */
   public List<FacesConfigManagedBeanType<WebFacesConfigDescriptor>> getAllManagedBean();

   /**
    * Removes all <code>managed-bean</code> elements 
    * @return the current instance of <code>FacesConfigManagedBeanType<WebFacesConfigDescriptor></code> 
    */
   public WebFacesConfigDescriptor removeAllManagedBean();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFacesConfigDescriptor ElementName: xsd:token ElementType : name
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>name</code> elements, 
    * a new <code>name</code> element 
    * @param values list of <code>name</code> objects 
    * @return the current instance of <code>WebFacesConfigDescriptor</code> 
    */
   public WebFacesConfigDescriptor name(String ... values);

   /**
    * Returns all <code>name</code> elements
    * @return list of <code>name</code> 
    */
   public List<String> getAllName();

   /**
    * Removes the <code>name</code> element 
    * @return the current instance of <code>WebFacesConfigDescriptor</code> 
    */
   public WebFacesConfigDescriptor removeAllName();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFacesConfigDescriptor ElementName: javaee:faces-config-navigation-ruleType ElementType : navigation-rule
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>navigation-rule</code> element will be created and returned.
    * Otherwise, the first existing <code>navigation-rule</code> element will be returned.
    * @return the instance defined for the element <code>navigation-rule</code> 
    */
   public FacesConfigNavigationRuleType<WebFacesConfigDescriptor> getOrCreateNavigationRule();

   /**
    * Creates a new <code>navigation-rule</code> element 
    * @return the new created instance of <code>FacesConfigNavigationRuleType<WebFacesConfigDescriptor></code> 
    */
   public FacesConfigNavigationRuleType<WebFacesConfigDescriptor> createNavigationRule();

   /**
    * Returns all <code>navigation-rule</code> elements
    * @return list of <code>navigation-rule</code> 
    */
   public List<FacesConfigNavigationRuleType<WebFacesConfigDescriptor>> getAllNavigationRule();

   /**
    * Removes all <code>navigation-rule</code> elements 
    * @return the current instance of <code>FacesConfigNavigationRuleType<WebFacesConfigDescriptor></code> 
    */
   public WebFacesConfigDescriptor removeAllNavigationRule();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFacesConfigDescriptor ElementName: javaee:faces-config-referenced-beanType ElementType : referenced-bean
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>referenced-bean</code> element will be created and returned.
    * Otherwise, the first existing <code>referenced-bean</code> element will be returned.
    * @return the instance defined for the element <code>referenced-bean</code> 
    */
   public FacesConfigReferencedBeanType<WebFacesConfigDescriptor> getOrCreateReferencedBean();

   /**
    * Creates a new <code>referenced-bean</code> element 
    * @return the new created instance of <code>FacesConfigReferencedBeanType<WebFacesConfigDescriptor></code> 
    */
   public FacesConfigReferencedBeanType<WebFacesConfigDescriptor> createReferencedBean();

   /**
    * Returns all <code>referenced-bean</code> elements
    * @return list of <code>referenced-bean</code> 
    */
   public List<FacesConfigReferencedBeanType<WebFacesConfigDescriptor>> getAllReferencedBean();

   /**
    * Removes all <code>referenced-bean</code> elements 
    * @return the current instance of <code>FacesConfigReferencedBeanType<WebFacesConfigDescriptor></code> 
    */
   public WebFacesConfigDescriptor removeAllReferencedBean();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFacesConfigDescriptor ElementName: javaee:faces-config-render-kitType ElementType : render-kit
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>render-kit</code> element will be created and returned.
    * Otherwise, the first existing <code>render-kit</code> element will be returned.
    * @return the instance defined for the element <code>render-kit</code> 
    */
   public FacesConfigRenderKitType<WebFacesConfigDescriptor> getOrCreateRenderKit();

   /**
    * Creates a new <code>render-kit</code> element 
    * @return the new created instance of <code>FacesConfigRenderKitType<WebFacesConfigDescriptor></code> 
    */
   public FacesConfigRenderKitType<WebFacesConfigDescriptor> createRenderKit();

   /**
    * Returns all <code>render-kit</code> elements
    * @return list of <code>render-kit</code> 
    */
   public List<FacesConfigRenderKitType<WebFacesConfigDescriptor>> getAllRenderKit();

   /**
    * Removes all <code>render-kit</code> elements 
    * @return the current instance of <code>FacesConfigRenderKitType<WebFacesConfigDescriptor></code> 
    */
   public WebFacesConfigDescriptor removeAllRenderKit();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFacesConfigDescriptor ElementName: javaee:faces-config-lifecycleType ElementType : lifecycle
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>lifecycle</code> element will be created and returned.
    * Otherwise, the first existing <code>lifecycle</code> element will be returned.
    * @return the instance defined for the element <code>lifecycle</code> 
    */
   public FacesConfigLifecycleType<WebFacesConfigDescriptor> getOrCreateLifecycle();

   /**
    * Creates a new <code>lifecycle</code> element 
    * @return the new created instance of <code>FacesConfigLifecycleType<WebFacesConfigDescriptor></code> 
    */
   public FacesConfigLifecycleType<WebFacesConfigDescriptor> createLifecycle();

   /**
    * Returns all <code>lifecycle</code> elements
    * @return list of <code>lifecycle</code> 
    */
   public List<FacesConfigLifecycleType<WebFacesConfigDescriptor>> getAllLifecycle();

   /**
    * Removes all <code>lifecycle</code> elements 
    * @return the current instance of <code>FacesConfigLifecycleType<WebFacesConfigDescriptor></code> 
    */
   public WebFacesConfigDescriptor removeAllLifecycle();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFacesConfigDescriptor ElementName: javaee:faces-config-validatorType ElementType : validator
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>validator</code> element will be created and returned.
    * Otherwise, the first existing <code>validator</code> element will be returned.
    * @return the instance defined for the element <code>validator</code> 
    */
   public FacesConfigValidatorType<WebFacesConfigDescriptor> getOrCreateValidator();

   /**
    * Creates a new <code>validator</code> element 
    * @return the new created instance of <code>FacesConfigValidatorType<WebFacesConfigDescriptor></code> 
    */
   public FacesConfigValidatorType<WebFacesConfigDescriptor> createValidator();

   /**
    * Returns all <code>validator</code> elements
    * @return list of <code>validator</code> 
    */
   public List<FacesConfigValidatorType<WebFacesConfigDescriptor>> getAllValidator();

   /**
    * Removes all <code>validator</code> elements 
    * @return the current instance of <code>FacesConfigValidatorType<WebFacesConfigDescriptor></code> 
    */
   public WebFacesConfigDescriptor removeAllValidator();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFacesConfigDescriptor ElementName: javaee:faces-config-behaviorType ElementType : behavior
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>behavior</code> element will be created and returned.
    * Otherwise, the first existing <code>behavior</code> element will be returned.
    * @return the instance defined for the element <code>behavior</code> 
    */
   public FacesConfigBehaviorType<WebFacesConfigDescriptor> getOrCreateBehavior();

   /**
    * Creates a new <code>behavior</code> element 
    * @return the new created instance of <code>FacesConfigBehaviorType<WebFacesConfigDescriptor></code> 
    */
   public FacesConfigBehaviorType<WebFacesConfigDescriptor> createBehavior();

   /**
    * Returns all <code>behavior</code> elements
    * @return list of <code>behavior</code> 
    */
   public List<FacesConfigBehaviorType<WebFacesConfigDescriptor>> getAllBehavior();

   /**
    * Removes all <code>behavior</code> elements 
    * @return the current instance of <code>FacesConfigBehaviorType<WebFacesConfigDescriptor></code> 
    */
   public WebFacesConfigDescriptor removeAllBehavior();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFacesConfigDescriptor ElementName: javaee:faces-config-extensionType ElementType : faces-config-extension
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>faces-config-extension</code> element 
    * @return the current instance of <code>WebFacesConfigDescriptor</code> 
    */
   public WebFacesConfigDescriptor facesConfigExtension();

   /**
    * Removes the <code>faces-config-extension</code> element 
    * @return the current instance of <code>WebFacesConfigDescriptor</code> 
    */
   public Boolean isFacesConfigExtension();

   /**
    * Removes the <code>faces-config-extension</code> element 
    * @return the current instance of <code>WebFacesConfigDescriptor</code> 
    */
   public WebFacesConfigDescriptor removeFacesConfigExtension();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFacesConfigDescriptor ElementName: xsd:boolean ElementType : metadata-complete
   // MaxOccurs: -  isGeneric: false   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>metadata-complete</code> attribute
    * @param metadataComplete the value for the attribute <code>metadata-complete</code> 
    * @return the current instance of <code>WebFacesConfigDescriptor</code> 
    */
   public WebFacesConfigDescriptor metadataComplete(Boolean metadataComplete);

   /**
    * Returns the <code>metadata-complete</code> attribute
    * @return the value defined for the attribute <code>metadata-complete</code> 
    */
public Boolean isMetadataComplete();

   /**
    * Removes the <code>metadata-complete</code> attribute 
    * @return the current instance of <code>WebFacesConfigDescriptor</code> 
    */
   public WebFacesConfigDescriptor removeMetadataComplete();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFacesConfigDescriptor ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: false   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>WebFacesConfigDescriptor</code> 
    */
   public WebFacesConfigDescriptor id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>WebFacesConfigDescriptor</code> 
    */
   public WebFacesConfigDescriptor removeId();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFacesConfigDescriptor ElementName: javaee:faces-config-versionType ElementType : version
   // MaxOccurs: -  isGeneric: false   isAttribute: true isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of <code>WebFacesConfigDescriptor</code> 
    */
   public WebFacesConfigDescriptor version(FacesConfigVersionType version);

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of <code>WebFacesConfigDescriptor</code> 
    */
   public WebFacesConfigDescriptor version(String version);

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
    * @return the current instance of <code>WebFacesConfigDescriptor</code> 
    */
   public WebFacesConfigDescriptor removeVersion();
}
