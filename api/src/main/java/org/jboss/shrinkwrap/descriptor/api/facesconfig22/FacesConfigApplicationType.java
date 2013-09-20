package org.jboss.shrinkwrap.descriptor.api.facesconfig22; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> faces-config-applicationType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface FacesConfigApplicationType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigApplicationType ElementName: xsd:token ElementType : action-listener
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>action-listener</code> elements, 
    * a new <code>action-listener</code> element 
    * @param values list of <code>action-listener</code> objects 
    * @return the current instance of <code>FacesConfigApplicationType<T></code> 
    */
   public FacesConfigApplicationType<T> actionListener(String ... values);

   /**
    * Returns all <code>action-listener</code> elements
    * @return list of <code>action-listener</code> 
    */
   public List<String> getAllActionListener();

   /**
    * Removes the <code>action-listener</code> element 
    * @return the current instance of <code>FacesConfigApplicationType<T></code> 
    */
   public FacesConfigApplicationType<T> removeAllActionListener();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigApplicationType ElementName: xsd:token ElementType : default-render-kit-id
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>default-render-kit-id</code> elements, 
    * a new <code>default-render-kit-id</code> element 
    * @param values list of <code>default-render-kit-id</code> objects 
    * @return the current instance of <code>FacesConfigApplicationType<T></code> 
    */
   public FacesConfigApplicationType<T> defaultRenderKitId(String ... values);

   /**
    * Returns all <code>default-render-kit-id</code> elements
    * @return list of <code>default-render-kit-id</code> 
    */
   public List<String> getAllDefaultRenderKitId();

   /**
    * Removes the <code>default-render-kit-id</code> element 
    * @return the current instance of <code>FacesConfigApplicationType<T></code> 
    */
   public FacesConfigApplicationType<T> removeAllDefaultRenderKitId();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigApplicationType ElementName: xsd:token ElementType : message-bundle
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>message-bundle</code> elements, 
    * a new <code>message-bundle</code> element 
    * @param values list of <code>message-bundle</code> objects 
    * @return the current instance of <code>FacesConfigApplicationType<T></code> 
    */
   public FacesConfigApplicationType<T> messageBundle(String ... values);

   /**
    * Returns all <code>message-bundle</code> elements
    * @return list of <code>message-bundle</code> 
    */
   public List<String> getAllMessageBundle();

   /**
    * Removes the <code>message-bundle</code> element 
    * @return the current instance of <code>FacesConfigApplicationType<T></code> 
    */
   public FacesConfigApplicationType<T> removeAllMessageBundle();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigApplicationType ElementName: xsd:token ElementType : navigation-handler
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>navigation-handler</code> elements, 
    * a new <code>navigation-handler</code> element 
    * @param values list of <code>navigation-handler</code> objects 
    * @return the current instance of <code>FacesConfigApplicationType<T></code> 
    */
   public FacesConfigApplicationType<T> navigationHandler(String ... values);

   /**
    * Returns all <code>navigation-handler</code> elements
    * @return list of <code>navigation-handler</code> 
    */
   public List<String> getAllNavigationHandler();

   /**
    * Removes the <code>navigation-handler</code> element 
    * @return the current instance of <code>FacesConfigApplicationType<T></code> 
    */
   public FacesConfigApplicationType<T> removeAllNavigationHandler();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigApplicationType ElementName: xsd:token ElementType : view-handler
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>view-handler</code> elements, 
    * a new <code>view-handler</code> element 
    * @param values list of <code>view-handler</code> objects 
    * @return the current instance of <code>FacesConfigApplicationType<T></code> 
    */
   public FacesConfigApplicationType<T> viewHandler(String ... values);

   /**
    * Returns all <code>view-handler</code> elements
    * @return list of <code>view-handler</code> 
    */
   public List<String> getAllViewHandler();

   /**
    * Removes the <code>view-handler</code> element 
    * @return the current instance of <code>FacesConfigApplicationType<T></code> 
    */
   public FacesConfigApplicationType<T> removeAllViewHandler();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigApplicationType ElementName: xsd:token ElementType : state-manager
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>state-manager</code> elements, 
    * a new <code>state-manager</code> element 
    * @param values list of <code>state-manager</code> objects 
    * @return the current instance of <code>FacesConfigApplicationType<T></code> 
    */
   public FacesConfigApplicationType<T> stateManager(String ... values);

   /**
    * Returns all <code>state-manager</code> elements
    * @return list of <code>state-manager</code> 
    */
   public List<String> getAllStateManager();

   /**
    * Removes the <code>state-manager</code> element 
    * @return the current instance of <code>FacesConfigApplicationType<T></code> 
    */
   public FacesConfigApplicationType<T> removeAllStateManager();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigApplicationType ElementName: xsd:token ElementType : el-resolver
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>el-resolver</code> elements, 
    * a new <code>el-resolver</code> element 
    * @param values list of <code>el-resolver</code> objects 
    * @return the current instance of <code>FacesConfigApplicationType<T></code> 
    */
   public FacesConfigApplicationType<T> elResolver(String ... values);

   /**
    * Returns all <code>el-resolver</code> elements
    * @return list of <code>el-resolver</code> 
    */
   public List<String> getAllElResolver();

   /**
    * Removes the <code>el-resolver</code> element 
    * @return the current instance of <code>FacesConfigApplicationType<T></code> 
    */
   public FacesConfigApplicationType<T> removeAllElResolver();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigApplicationType ElementName: xsd:token ElementType : property-resolver
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>property-resolver</code> elements, 
    * a new <code>property-resolver</code> element 
    * @param values list of <code>property-resolver</code> objects 
    * @return the current instance of <code>FacesConfigApplicationType<T></code> 
    */
   public FacesConfigApplicationType<T> propertyResolver(String ... values);

   /**
    * Returns all <code>property-resolver</code> elements
    * @return list of <code>property-resolver</code> 
    */
   public List<String> getAllPropertyResolver();

   /**
    * Removes the <code>property-resolver</code> element 
    * @return the current instance of <code>FacesConfigApplicationType<T></code> 
    */
   public FacesConfigApplicationType<T> removeAllPropertyResolver();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigApplicationType ElementName: xsd:token ElementType : variable-resolver
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>variable-resolver</code> elements, 
    * a new <code>variable-resolver</code> element 
    * @param values list of <code>variable-resolver</code> objects 
    * @return the current instance of <code>FacesConfigApplicationType<T></code> 
    */
   public FacesConfigApplicationType<T> variableResolver(String ... values);

   /**
    * Returns all <code>variable-resolver</code> elements
    * @return list of <code>variable-resolver</code> 
    */
   public List<String> getAllVariableResolver();

   /**
    * Removes the <code>variable-resolver</code> element 
    * @return the current instance of <code>FacesConfigApplicationType<T></code> 
    */
   public FacesConfigApplicationType<T> removeAllVariableResolver();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigApplicationType ElementName: xsd:token ElementType : resource-handler
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>resource-handler</code> elements, 
    * a new <code>resource-handler</code> element 
    * @param values list of <code>resource-handler</code> objects 
    * @return the current instance of <code>FacesConfigApplicationType<T></code> 
    */
   public FacesConfigApplicationType<T> resourceHandler(String ... values);

   /**
    * Returns all <code>resource-handler</code> elements
    * @return list of <code>resource-handler</code> 
    */
   public List<String> getAllResourceHandler();

   /**
    * Removes the <code>resource-handler</code> element 
    * @return the current instance of <code>FacesConfigApplicationType<T></code> 
    */
   public FacesConfigApplicationType<T> removeAllResourceHandler();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigApplicationType ElementName: javaee:faces-config-application-resource-library-contractsType ElementType : resource-library-contracts
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>resource-library-contracts</code> element will be created and returned.
    * Otherwise, the first existing <code>resource-library-contracts</code> element will be returned.
    * @return the instance defined for the element <code>resource-library-contracts</code> 
    */
   public FacesConfigApplicationResourceLibraryContractsType<FacesConfigApplicationType<T>> getOrCreateResourceLibraryContracts();

   /**
    * Creates a new <code>resource-library-contracts</code> element 
    * @return the new created instance of <code>FacesConfigApplicationResourceLibraryContractsType<FacesConfigApplicationType<T>></code> 
    */
   public FacesConfigApplicationResourceLibraryContractsType<FacesConfigApplicationType<T>> createResourceLibraryContracts();

   /**
    * Returns all <code>resource-library-contracts</code> elements
    * @return list of <code>resource-library-contracts</code> 
    */
   public List<FacesConfigApplicationResourceLibraryContractsType<FacesConfigApplicationType<T>>> getAllResourceLibraryContracts();

   /**
    * Removes all <code>resource-library-contracts</code> elements 
    * @return the current instance of <code>FacesConfigApplicationResourceLibraryContractsType<FacesConfigApplicationType<T>></code> 
    */
   public FacesConfigApplicationType<T> removeAllResourceLibraryContracts();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigApplicationType ElementName: javaee:faces-config-system-event-listenerType ElementType : system-event-listener
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>system-event-listener</code> element will be created and returned.
    * Otherwise, the first existing <code>system-event-listener</code> element will be returned.
    * @return the instance defined for the element <code>system-event-listener</code> 
    */
   public FacesConfigSystemEventListenerType<FacesConfigApplicationType<T>> getOrCreateSystemEventListener();

   /**
    * Creates a new <code>system-event-listener</code> element 
    * @return the new created instance of <code>FacesConfigSystemEventListenerType<FacesConfigApplicationType<T>></code> 
    */
   public FacesConfigSystemEventListenerType<FacesConfigApplicationType<T>> createSystemEventListener();

   /**
    * Returns all <code>system-event-listener</code> elements
    * @return list of <code>system-event-listener</code> 
    */
   public List<FacesConfigSystemEventListenerType<FacesConfigApplicationType<T>>> getAllSystemEventListener();

   /**
    * Removes all <code>system-event-listener</code> elements 
    * @return the current instance of <code>FacesConfigSystemEventListenerType<FacesConfigApplicationType<T>></code> 
    */
   public FacesConfigApplicationType<T> removeAllSystemEventListener();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigApplicationType ElementName: javaee:faces-config-locale-configType ElementType : locale-config
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>locale-config</code> element will be created and returned.
    * Otherwise, the first existing <code>locale-config</code> element will be returned.
    * @return the instance defined for the element <code>locale-config</code> 
    */
   public FacesConfigLocaleConfigType<FacesConfigApplicationType<T>> getOrCreateLocaleConfig();

   /**
    * Creates a new <code>locale-config</code> element 
    * @return the new created instance of <code>FacesConfigLocaleConfigType<FacesConfigApplicationType<T>></code> 
    */
   public FacesConfigLocaleConfigType<FacesConfigApplicationType<T>> createLocaleConfig();

   /**
    * Returns all <code>locale-config</code> elements
    * @return list of <code>locale-config</code> 
    */
   public List<FacesConfigLocaleConfigType<FacesConfigApplicationType<T>>> getAllLocaleConfig();

   /**
    * Removes all <code>locale-config</code> elements 
    * @return the current instance of <code>FacesConfigLocaleConfigType<FacesConfigApplicationType<T>></code> 
    */
   public FacesConfigApplicationType<T> removeAllLocaleConfig();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigApplicationType ElementName: javaee:faces-config-application-resource-bundleType ElementType : resource-bundle
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>resource-bundle</code> element will be created and returned.
    * Otherwise, the first existing <code>resource-bundle</code> element will be returned.
    * @return the instance defined for the element <code>resource-bundle</code> 
    */
   public FacesConfigApplicationResourceBundleType<FacesConfigApplicationType<T>> getOrCreateResourceBundle();

   /**
    * Creates a new <code>resource-bundle</code> element 
    * @return the new created instance of <code>FacesConfigApplicationResourceBundleType<FacesConfigApplicationType<T>></code> 
    */
   public FacesConfigApplicationResourceBundleType<FacesConfigApplicationType<T>> createResourceBundle();

   /**
    * Returns all <code>resource-bundle</code> elements
    * @return list of <code>resource-bundle</code> 
    */
   public List<FacesConfigApplicationResourceBundleType<FacesConfigApplicationType<T>>> getAllResourceBundle();

   /**
    * Removes all <code>resource-bundle</code> elements 
    * @return the current instance of <code>FacesConfigApplicationResourceBundleType<FacesConfigApplicationType<T>></code> 
    */
   public FacesConfigApplicationType<T> removeAllResourceBundle();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigApplicationType ElementName: javaee:faces-config-application-extensionType ElementType : application-extension
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>application-extension</code> element 
    * @return the current instance of <code>FacesConfigApplicationType<T></code> 
    */
   public FacesConfigApplicationType<T> applicationExtension();

   /**
    * Removes the <code>application-extension</code> element 
    * @return the current instance of <code>FacesConfigApplicationType<T></code> 
    */
   public Boolean isApplicationExtension();

   /**
    * Removes the <code>application-extension</code> element 
    * @return the current instance of <code>FacesConfigApplicationType<T></code> 
    */
   public FacesConfigApplicationType<T> removeApplicationExtension();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigApplicationType ElementName: javaee:faces-config-default-validatorsType ElementType : default-validators
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>default-validators</code> element will be created and returned.
    * Otherwise, the first existing <code>default-validators</code> element will be returned.
    * @return the instance defined for the element <code>default-validators</code> 
    */
   public FacesConfigDefaultValidatorsType<FacesConfigApplicationType<T>> getOrCreateDefaultValidators();

   /**
    * Creates a new <code>default-validators</code> element 
    * @return the new created instance of <code>FacesConfigDefaultValidatorsType<FacesConfigApplicationType<T>></code> 
    */
   public FacesConfigDefaultValidatorsType<FacesConfigApplicationType<T>> createDefaultValidators();

   /**
    * Returns all <code>default-validators</code> elements
    * @return list of <code>default-validators</code> 
    */
   public List<FacesConfigDefaultValidatorsType<FacesConfigApplicationType<T>>> getAllDefaultValidators();

   /**
    * Removes all <code>default-validators</code> elements 
    * @return the current instance of <code>FacesConfigDefaultValidatorsType<FacesConfigApplicationType<T>></code> 
    */
   public FacesConfigApplicationType<T> removeAllDefaultValidators();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigApplicationType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>FacesConfigApplicationType<T></code> 
    */
   public FacesConfigApplicationType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>FacesConfigApplicationType<T></code> 
    */
   public FacesConfigApplicationType<T> removeId();
}
