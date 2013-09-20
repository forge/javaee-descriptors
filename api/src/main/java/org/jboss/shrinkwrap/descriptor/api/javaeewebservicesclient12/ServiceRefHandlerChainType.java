package org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient12; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient12.ServiceRefHandlerType;
/**
 * This interface defines the contract for the <code> service-ref_handler-chainType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface ServiceRefHandlerChainType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ServiceRefHandlerChainType ElementName: xsd:token ElementType : service-name-pattern
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>service-name-pattern</code> element
    * @param serviceNamePattern the value for the element <code>service-name-pattern</code> 
    * @return the current instance of <code>ServiceRefHandlerChainType<T></code> 
    */
   public ServiceRefHandlerChainType<T> serviceNamePattern(String serviceNamePattern);

   /**
    * Returns the <code>service-name-pattern</code> element
    * @return the node defined for the element <code>service-name-pattern</code> 
    */
   public String getServiceNamePattern();

   /**
    * Removes the <code>service-name-pattern</code> element 
    * @return the current instance of <code>ServiceRefHandlerChainType<T></code> 
    */
   public ServiceRefHandlerChainType<T> removeServiceNamePattern();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ServiceRefHandlerChainType ElementName: xsd:token ElementType : port-name-pattern
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>port-name-pattern</code> element
    * @param portNamePattern the value for the element <code>port-name-pattern</code> 
    * @return the current instance of <code>ServiceRefHandlerChainType<T></code> 
    */
   public ServiceRefHandlerChainType<T> portNamePattern(String portNamePattern);

   /**
    * Returns the <code>port-name-pattern</code> element
    * @return the node defined for the element <code>port-name-pattern</code> 
    */
   public String getPortNamePattern();

   /**
    * Removes the <code>port-name-pattern</code> element 
    * @return the current instance of <code>ServiceRefHandlerChainType<T></code> 
    */
   public ServiceRefHandlerChainType<T> removePortNamePattern();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ServiceRefHandlerChainType ElementName: xsd:string ElementType : protocol-bindings
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>protocol-bindings</code> element
    * @param protocolBindings the value for the element <code>protocol-bindings</code> 
    * @return the current instance of <code>ServiceRefHandlerChainType<T></code> 
    */
   public ServiceRefHandlerChainType<T> protocolBindings(String protocolBindings);

   /**
    * Returns the <code>protocol-bindings</code> element
    * @return the node defined for the element <code>protocol-bindings</code> 
    */
   public String getProtocolBindings();

   /**
    * Removes the <code>protocol-bindings</code> element 
    * @return the current instance of <code>ServiceRefHandlerChainType<T></code> 
    */
   public ServiceRefHandlerChainType<T> removeProtocolBindings();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ServiceRefHandlerChainType ElementName: javaee:service-ref_handlerType ElementType : handler
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>handler</code> element will be created and returned.
    * Otherwise, the first existing <code>handler</code> element will be returned.
    * @return the instance defined for the element <code>handler</code> 
    */
   public ServiceRefHandlerType<ServiceRefHandlerChainType<T>> getOrCreateHandler();

   /**
    * Creates a new <code>handler</code> element 
    * @return the new created instance of <code>ServiceRefHandlerType<ServiceRefHandlerChainType<T>></code> 
    */
   public ServiceRefHandlerType<ServiceRefHandlerChainType<T>> createHandler();

   /**
    * Returns all <code>handler</code> elements
    * @return list of <code>handler</code> 
    */
   public List<ServiceRefHandlerType<ServiceRefHandlerChainType<T>>> getAllHandler();

   /**
    * Removes all <code>handler</code> elements 
    * @return the current instance of <code>ServiceRefHandlerType<ServiceRefHandlerChainType<T>></code> 
    */
   public ServiceRefHandlerChainType<T> removeAllHandler();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ServiceRefHandlerChainType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>ServiceRefHandlerChainType<T></code> 
    */
   public ServiceRefHandlerChainType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>ServiceRefHandlerChainType<T></code> 
    */
   public ServiceRefHandlerChainType<T> removeId();
}
