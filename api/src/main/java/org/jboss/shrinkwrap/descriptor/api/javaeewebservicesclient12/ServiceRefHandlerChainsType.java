package org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient12; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> service-ref_handler-chainsType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface ServiceRefHandlerChainsType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ServiceRefHandlerChainsType ElementName: javaee:service-ref_handler-chainType ElementType : handler-chain
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>handler-chain</code> element will be created and returned.
    * Otherwise, the first existing <code>handler-chain</code> element will be returned.
    * @return the instance defined for the element <code>handler-chain</code> 
    */
   public ServiceRefHandlerChainType<ServiceRefHandlerChainsType<T>> getOrCreateHandlerChain();

   /**
    * Creates a new <code>handler-chain</code> element 
    * @return the new created instance of <code>ServiceRefHandlerChainType<ServiceRefHandlerChainsType<T>></code> 
    */
   public ServiceRefHandlerChainType<ServiceRefHandlerChainsType<T>> createHandlerChain();

   /**
    * Returns all <code>handler-chain</code> elements
    * @return list of <code>handler-chain</code> 
    */
   public List<ServiceRefHandlerChainType<ServiceRefHandlerChainsType<T>>> getAllHandlerChain();

   /**
    * Removes all <code>handler-chain</code> elements 
    * @return the current instance of <code>ServiceRefHandlerChainType<ServiceRefHandlerChainsType<T>></code> 
    */
   public ServiceRefHandlerChainsType<T> removeAllHandlerChain();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ServiceRefHandlerChainsType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>ServiceRefHandlerChainsType<T></code> 
    */
   public ServiceRefHandlerChainsType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>ServiceRefHandlerChainsType<T></code> 
    */
   public ServiceRefHandlerChainsType<T> removeId();
}
