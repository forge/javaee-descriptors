package org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient13; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.InjectionTargetType;
/**
 * This interface defines the contract for the <code> service-refType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface ServiceRefType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ServiceRefType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>ServiceRefType<T></code> 
    */
   public ServiceRefType<T> description(String ... values);

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>ServiceRefType<T></code> 
    */
   public ServiceRefType<T> removeAllDescription();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ServiceRefType ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>ServiceRefType<T></code> 
    */
   public ServiceRefType<T> displayName(String ... values);

   /**
    * Returns all <code>display-name</code> elements
    * @return list of <code>display-name</code> 
    */
   public List<String> getAllDisplayName();

   /**
    * Removes the <code>display-name</code> element 
    * @return the current instance of <code>ServiceRefType<T></code> 
    */
   public ServiceRefType<T> removeAllDisplayName();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ServiceRefType ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<ServiceRefType<T>> getOrCreateIcon();

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<ServiceRefType<T>></code> 
    */
   public IconType<ServiceRefType<T>> createIcon();

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<ServiceRefType<T>>> getAllIcon();

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<ServiceRefType<T>></code> 
    */
   public ServiceRefType<T> removeAllIcon();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ServiceRefType ElementName: xsd:string ElementType : lookup-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>lookup-name</code> element
    * @param lookupName the value for the element <code>lookup-name</code> 
    * @return the current instance of <code>ServiceRefType<T></code> 
    */
   public ServiceRefType<T> lookupName(String lookupName);

   /**
    * Returns the <code>lookup-name</code> element
    * @return the node defined for the element <code>lookup-name</code> 
    */
   public String getLookupName();

   /**
    * Removes the <code>lookup-name</code> element 
    * @return the current instance of <code>ServiceRefType<T></code> 
    */
   public ServiceRefType<T> removeLookupName();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ServiceRefType ElementName: xsd:string ElementType : mapped-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>mapped-name</code> element
    * @param mappedName the value for the element <code>mapped-name</code> 
    * @return the current instance of <code>ServiceRefType<T></code> 
    */
   public ServiceRefType<T> mappedName(String mappedName);

   /**
    * Returns the <code>mapped-name</code> element
    * @return the node defined for the element <code>mapped-name</code> 
    */
   public String getMappedName();

   /**
    * Removes the <code>mapped-name</code> element 
    * @return the current instance of <code>ServiceRefType<T></code> 
    */
   public ServiceRefType<T> removeMappedName();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ServiceRefType ElementName: javaee:injection-targetType ElementType : injection-target
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>injection-target</code> element will be created and returned.
    * Otherwise, the first existing <code>injection-target</code> element will be returned.
    * @return the instance defined for the element <code>injection-target</code> 
    */
   public InjectionTargetType<ServiceRefType<T>> getOrCreateInjectionTarget();

   /**
    * Creates a new <code>injection-target</code> element 
    * @return the new created instance of <code>InjectionTargetType<ServiceRefType<T>></code> 
    */
   public InjectionTargetType<ServiceRefType<T>> createInjectionTarget();

   /**
    * Returns all <code>injection-target</code> elements
    * @return list of <code>injection-target</code> 
    */
   public List<InjectionTargetType<ServiceRefType<T>>> getAllInjectionTarget();

   /**
    * Removes all <code>injection-target</code> elements 
    * @return the current instance of <code>InjectionTargetType<ServiceRefType<T>></code> 
    */
   public ServiceRefType<T> removeAllInjectionTarget();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ServiceRefType ElementName: xsd:token ElementType : service-ref-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>service-ref-name</code> element
    * @param serviceRefName the value for the element <code>service-ref-name</code> 
    * @return the current instance of <code>ServiceRefType<T></code> 
    */
   public ServiceRefType<T> serviceRefName(String serviceRefName);

   /**
    * Returns the <code>service-ref-name</code> element
    * @return the node defined for the element <code>service-ref-name</code> 
    */
   public String getServiceRefName();

   /**
    * Removes the <code>service-ref-name</code> element 
    * @return the current instance of <code>ServiceRefType<T></code> 
    */
   public ServiceRefType<T> removeServiceRefName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ServiceRefType ElementName: xsd:token ElementType : service-interface
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>service-interface</code> element
    * @param serviceInterface the value for the element <code>service-interface</code> 
    * @return the current instance of <code>ServiceRefType<T></code> 
    */
   public ServiceRefType<T> serviceInterface(String serviceInterface);

   /**
    * Returns the <code>service-interface</code> element
    * @return the node defined for the element <code>service-interface</code> 
    */
   public String getServiceInterface();

   /**
    * Removes the <code>service-interface</code> element 
    * @return the current instance of <code>ServiceRefType<T></code> 
    */
   public ServiceRefType<T> removeServiceInterface();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ServiceRefType ElementName: xsd:token ElementType : service-ref-type
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>service-ref-type</code> element
    * @param serviceRefType the value for the element <code>service-ref-type</code> 
    * @return the current instance of <code>ServiceRefType<T></code> 
    */
   public ServiceRefType<T> serviceRefType(String serviceRefType);

   /**
    * Returns the <code>service-ref-type</code> element
    * @return the node defined for the element <code>service-ref-type</code> 
    */
   public String getServiceRefType();

   /**
    * Removes the <code>service-ref-type</code> element 
    * @return the current instance of <code>ServiceRefType<T></code> 
    */
   public ServiceRefType<T> removeServiceRefType();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ServiceRefType ElementName: xsd:anyURI ElementType : wsdl-file
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>wsdl-file</code> element
    * @param wsdlFile the value for the element <code>wsdl-file</code> 
    * @return the current instance of <code>ServiceRefType<T></code> 
    */
   public ServiceRefType<T> wsdlFile(String wsdlFile);

   /**
    * Returns the <code>wsdl-file</code> element
    * @return the node defined for the element <code>wsdl-file</code> 
    */
   public String getWsdlFile();

   /**
    * Removes the <code>wsdl-file</code> element 
    * @return the current instance of <code>ServiceRefType<T></code> 
    */
   public ServiceRefType<T> removeWsdlFile();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ServiceRefType ElementName: xsd:token ElementType : jaxrpc-mapping-file
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>jaxrpc-mapping-file</code> element
    * @param jaxrpcMappingFile the value for the element <code>jaxrpc-mapping-file</code> 
    * @return the current instance of <code>ServiceRefType<T></code> 
    */
   public ServiceRefType<T> jaxrpcMappingFile(String jaxrpcMappingFile);

   /**
    * Returns the <code>jaxrpc-mapping-file</code> element
    * @return the node defined for the element <code>jaxrpc-mapping-file</code> 
    */
   public String getJaxrpcMappingFile();

   /**
    * Removes the <code>jaxrpc-mapping-file</code> element 
    * @return the current instance of <code>ServiceRefType<T></code> 
    */
   public ServiceRefType<T> removeJaxrpcMappingFile();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ServiceRefType ElementName: xsd:QName ElementType : service-qname
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>service-qname</code> element
    * @param serviceQname the value for the element <code>service-qname</code> 
    * @return the current instance of <code>ServiceRefType<T></code> 
    */
   public ServiceRefType<T> serviceQname(String serviceQname);

   /**
    * Returns the <code>service-qname</code> element
    * @return the node defined for the element <code>service-qname</code> 
    */
   public String getServiceQname();

   /**
    * Removes the <code>service-qname</code> element 
    * @return the current instance of <code>ServiceRefType<T></code> 
    */
   public ServiceRefType<T> removeServiceQname();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ServiceRefType ElementName: javaee:port-component-refType ElementType : port-component-ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>port-component-ref</code> element will be created and returned.
    * Otherwise, the first existing <code>port-component-ref</code> element will be returned.
    * @return the instance defined for the element <code>port-component-ref</code> 
    */
   public PortComponentRefType<ServiceRefType<T>> getOrCreatePortComponentRef();

   /**
    * Creates a new <code>port-component-ref</code> element 
    * @return the new created instance of <code>PortComponentRefType<ServiceRefType<T>></code> 
    */
   public PortComponentRefType<ServiceRefType<T>> createPortComponentRef();

   /**
    * Returns all <code>port-component-ref</code> elements
    * @return list of <code>port-component-ref</code> 
    */
   public List<PortComponentRefType<ServiceRefType<T>>> getAllPortComponentRef();

   /**
    * Removes all <code>port-component-ref</code> elements 
    * @return the current instance of <code>PortComponentRefType<ServiceRefType<T>></code> 
    */
   public ServiceRefType<T> removeAllPortComponentRef();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ServiceRefType ElementName: javaee:handlerType ElementType : handler
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>handler</code> element will be created and returned.
    * Otherwise, the first existing <code>handler</code> element will be returned.
    * @return the instance defined for the element <code>handler</code> 
    */
   public HandlerType<ServiceRefType<T>> getOrCreateHandler();

   /**
    * Creates a new <code>handler</code> element 
    * @return the new created instance of <code>HandlerType<ServiceRefType<T>></code> 
    */
   public HandlerType<ServiceRefType<T>> createHandler();

   /**
    * Returns all <code>handler</code> elements
    * @return list of <code>handler</code> 
    */
   public List<HandlerType<ServiceRefType<T>>> getAllHandler();

   /**
    * Removes all <code>handler</code> elements 
    * @return the current instance of <code>HandlerType<ServiceRefType<T>></code> 
    */
   public ServiceRefType<T> removeAllHandler();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ServiceRefType ElementName: javaee:handler-chainsType ElementType : handler-chains
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>handler-chains</code> element with the given value will be created.
    * Otherwise, the existing <code>handler-chains</code> element will be returned.
    * @return  a new or existing instance of <code>HandlerChainsType<ServiceRefType<T>></code> 
    */
   public HandlerChainsType<ServiceRefType<T>> getOrCreateHandlerChains();

   /**
    * Removes the <code>handler-chains</code> element 
    * @return the current instance of <code>ServiceRefType<T></code> 
    */
   public ServiceRefType<T> removeHandlerChains();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ServiceRefType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>ServiceRefType<T></code> 
    */
   public ServiceRefType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>ServiceRefType<T></code> 
    */
   public ServiceRefType<T> removeId();
}
