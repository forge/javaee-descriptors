package org.jboss.shrinkwrap.descriptor.api.facesconfig22; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.facesconfig22.FacesConfigFactoryExtensionType;
/**
 * This interface defines the contract for the <code> faces-config-factoryType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface FacesConfigFactoryType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFactoryType ElementName: xsd:token ElementType : application-factory
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>application-factory</code> elements, 
    * a new <code>application-factory</code> element 
    * @param values list of <code>application-factory</code> objects 
    * @return the current instance of <code>FacesConfigFactoryType<T></code> 
    */
   public FacesConfigFactoryType<T> applicationFactory(String ... values);

   /**
    * Returns all <code>application-factory</code> elements
    * @return list of <code>application-factory</code> 
    */
   public List<String> getAllApplicationFactory();

   /**
    * Removes the <code>application-factory</code> element 
    * @return the current instance of <code>FacesConfigFactoryType<T></code> 
    */
   public FacesConfigFactoryType<T> removeAllApplicationFactory();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFactoryType ElementName: xsd:token ElementType : exception-handler-factory
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>exception-handler-factory</code> elements, 
    * a new <code>exception-handler-factory</code> element 
    * @param values list of <code>exception-handler-factory</code> objects 
    * @return the current instance of <code>FacesConfigFactoryType<T></code> 
    */
   public FacesConfigFactoryType<T> exceptionHandlerFactory(String ... values);

   /**
    * Returns all <code>exception-handler-factory</code> elements
    * @return list of <code>exception-handler-factory</code> 
    */
   public List<String> getAllExceptionHandlerFactory();

   /**
    * Removes the <code>exception-handler-factory</code> element 
    * @return the current instance of <code>FacesConfigFactoryType<T></code> 
    */
   public FacesConfigFactoryType<T> removeAllExceptionHandlerFactory();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFactoryType ElementName: xsd:token ElementType : external-context-factory
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>external-context-factory</code> elements, 
    * a new <code>external-context-factory</code> element 
    * @param values list of <code>external-context-factory</code> objects 
    * @return the current instance of <code>FacesConfigFactoryType<T></code> 
    */
   public FacesConfigFactoryType<T> externalContextFactory(String ... values);

   /**
    * Returns all <code>external-context-factory</code> elements
    * @return list of <code>external-context-factory</code> 
    */
   public List<String> getAllExternalContextFactory();

   /**
    * Removes the <code>external-context-factory</code> element 
    * @return the current instance of <code>FacesConfigFactoryType<T></code> 
    */
   public FacesConfigFactoryType<T> removeAllExternalContextFactory();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFactoryType ElementName: xsd:token ElementType : faces-context-factory
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>faces-context-factory</code> elements, 
    * a new <code>faces-context-factory</code> element 
    * @param values list of <code>faces-context-factory</code> objects 
    * @return the current instance of <code>FacesConfigFactoryType<T></code> 
    */
   public FacesConfigFactoryType<T> facesContextFactory(String ... values);

   /**
    * Returns all <code>faces-context-factory</code> elements
    * @return list of <code>faces-context-factory</code> 
    */
   public List<String> getAllFacesContextFactory();

   /**
    * Removes the <code>faces-context-factory</code> element 
    * @return the current instance of <code>FacesConfigFactoryType<T></code> 
    */
   public FacesConfigFactoryType<T> removeAllFacesContextFactory();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFactoryType ElementName: xsd:token ElementType : facelet-cache-factory
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>facelet-cache-factory</code> elements, 
    * a new <code>facelet-cache-factory</code> element 
    * @param values list of <code>facelet-cache-factory</code> objects 
    * @return the current instance of <code>FacesConfigFactoryType<T></code> 
    */
   public FacesConfigFactoryType<T> faceletCacheFactory(String ... values);

   /**
    * Returns all <code>facelet-cache-factory</code> elements
    * @return list of <code>facelet-cache-factory</code> 
    */
   public List<String> getAllFaceletCacheFactory();

   /**
    * Removes the <code>facelet-cache-factory</code> element 
    * @return the current instance of <code>FacesConfigFactoryType<T></code> 
    */
   public FacesConfigFactoryType<T> removeAllFaceletCacheFactory();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFactoryType ElementName: xsd:token ElementType : partial-view-context-factory
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>partial-view-context-factory</code> elements, 
    * a new <code>partial-view-context-factory</code> element 
    * @param values list of <code>partial-view-context-factory</code> objects 
    * @return the current instance of <code>FacesConfigFactoryType<T></code> 
    */
   public FacesConfigFactoryType<T> partialViewContextFactory(String ... values);

   /**
    * Returns all <code>partial-view-context-factory</code> elements
    * @return list of <code>partial-view-context-factory</code> 
    */
   public List<String> getAllPartialViewContextFactory();

   /**
    * Removes the <code>partial-view-context-factory</code> element 
    * @return the current instance of <code>FacesConfigFactoryType<T></code> 
    */
   public FacesConfigFactoryType<T> removeAllPartialViewContextFactory();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFactoryType ElementName: xsd:token ElementType : lifecycle-factory
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>lifecycle-factory</code> elements, 
    * a new <code>lifecycle-factory</code> element 
    * @param values list of <code>lifecycle-factory</code> objects 
    * @return the current instance of <code>FacesConfigFactoryType<T></code> 
    */
   public FacesConfigFactoryType<T> lifecycleFactory(String ... values);

   /**
    * Returns all <code>lifecycle-factory</code> elements
    * @return list of <code>lifecycle-factory</code> 
    */
   public List<String> getAllLifecycleFactory();

   /**
    * Removes the <code>lifecycle-factory</code> element 
    * @return the current instance of <code>FacesConfigFactoryType<T></code> 
    */
   public FacesConfigFactoryType<T> removeAllLifecycleFactory();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFactoryType ElementName: xsd:token ElementType : view-declaration-language-factory
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>view-declaration-language-factory</code> elements, 
    * a new <code>view-declaration-language-factory</code> element 
    * @param values list of <code>view-declaration-language-factory</code> objects 
    * @return the current instance of <code>FacesConfigFactoryType<T></code> 
    */
   public FacesConfigFactoryType<T> viewDeclarationLanguageFactory(String ... values);

   /**
    * Returns all <code>view-declaration-language-factory</code> elements
    * @return list of <code>view-declaration-language-factory</code> 
    */
   public List<String> getAllViewDeclarationLanguageFactory();

   /**
    * Removes the <code>view-declaration-language-factory</code> element 
    * @return the current instance of <code>FacesConfigFactoryType<T></code> 
    */
   public FacesConfigFactoryType<T> removeAllViewDeclarationLanguageFactory();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFactoryType ElementName: xsd:token ElementType : tag-handler-delegate-factory
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>tag-handler-delegate-factory</code> elements, 
    * a new <code>tag-handler-delegate-factory</code> element 
    * @param values list of <code>tag-handler-delegate-factory</code> objects 
    * @return the current instance of <code>FacesConfigFactoryType<T></code> 
    */
   public FacesConfigFactoryType<T> tagHandlerDelegateFactory(String ... values);

   /**
    * Returns all <code>tag-handler-delegate-factory</code> elements
    * @return list of <code>tag-handler-delegate-factory</code> 
    */
   public List<String> getAllTagHandlerDelegateFactory();

   /**
    * Removes the <code>tag-handler-delegate-factory</code> element 
    * @return the current instance of <code>FacesConfigFactoryType<T></code> 
    */
   public FacesConfigFactoryType<T> removeAllTagHandlerDelegateFactory();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFactoryType ElementName: xsd:token ElementType : render-kit-factory
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>render-kit-factory</code> elements, 
    * a new <code>render-kit-factory</code> element 
    * @param values list of <code>render-kit-factory</code> objects 
    * @return the current instance of <code>FacesConfigFactoryType<T></code> 
    */
   public FacesConfigFactoryType<T> renderKitFactory(String ... values);

   /**
    * Returns all <code>render-kit-factory</code> elements
    * @return list of <code>render-kit-factory</code> 
    */
   public List<String> getAllRenderKitFactory();

   /**
    * Removes the <code>render-kit-factory</code> element 
    * @return the current instance of <code>FacesConfigFactoryType<T></code> 
    */
   public FacesConfigFactoryType<T> removeAllRenderKitFactory();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFactoryType ElementName: xsd:token ElementType : visit-context-factory
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>visit-context-factory</code> elements, 
    * a new <code>visit-context-factory</code> element 
    * @param values list of <code>visit-context-factory</code> objects 
    * @return the current instance of <code>FacesConfigFactoryType<T></code> 
    */
   public FacesConfigFactoryType<T> visitContextFactory(String ... values);

   /**
    * Returns all <code>visit-context-factory</code> elements
    * @return list of <code>visit-context-factory</code> 
    */
   public List<String> getAllVisitContextFactory();

   /**
    * Removes the <code>visit-context-factory</code> element 
    * @return the current instance of <code>FacesConfigFactoryType<T></code> 
    */
   public FacesConfigFactoryType<T> removeAllVisitContextFactory();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFactoryType ElementName: xsd:token ElementType : flash-factory
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>flash-factory</code> elements, 
    * a new <code>flash-factory</code> element 
    * @param values list of <code>flash-factory</code> objects 
    * @return the current instance of <code>FacesConfigFactoryType<T></code> 
    */
   public FacesConfigFactoryType<T> flashFactory(String ... values);

   /**
    * Returns all <code>flash-factory</code> elements
    * @return list of <code>flash-factory</code> 
    */
   public List<String> getAllFlashFactory();

   /**
    * Removes the <code>flash-factory</code> element 
    * @return the current instance of <code>FacesConfigFactoryType<T></code> 
    */
   public FacesConfigFactoryType<T> removeAllFlashFactory();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFactoryType ElementName: xsd:token ElementType : flow-handler-factory
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>flow-handler-factory</code> elements, 
    * a new <code>flow-handler-factory</code> element 
    * @param values list of <code>flow-handler-factory</code> objects 
    * @return the current instance of <code>FacesConfigFactoryType<T></code> 
    */
   public FacesConfigFactoryType<T> flowHandlerFactory(String ... values);

   /**
    * Returns all <code>flow-handler-factory</code> elements
    * @return list of <code>flow-handler-factory</code> 
    */
   public List<String> getAllFlowHandlerFactory();

   /**
    * Removes the <code>flow-handler-factory</code> element 
    * @return the current instance of <code>FacesConfigFactoryType<T></code> 
    */
   public FacesConfigFactoryType<T> removeAllFlowHandlerFactory();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFactoryType ElementName: javaee:faces-config-factory-extensionType ElementType : factory-extension
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>factory-extension</code> element 
    * @return the current instance of <code>FacesConfigFactoryType<T></code> 
    */
   public FacesConfigFactoryType<T> factoryExtension();

   /**
    * Removes the <code>factory-extension</code> element 
    * @return the current instance of <code>FacesConfigFactoryType<T></code> 
    */
   public Boolean isFactoryExtension();

   /**
    * Removes the <code>factory-extension</code> element 
    * @return the current instance of <code>FacesConfigFactoryType<T></code> 
    */
   public FacesConfigFactoryType<T> removeFactoryExtension();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigFactoryType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>FacesConfigFactoryType<T></code> 
    */
   public FacesConfigFactoryType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>FacesConfigFactoryType<T></code> 
    */
   public FacesConfigFactoryType<T> removeId();
}
