package org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient14; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient14.HandlerType;
/**
 * This interface defines the contract for the <code> handler-chainType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface HandlerChainType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: HandlerChainType ElementName: xsd:token ElementType : service-name-pattern
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>service-name-pattern</code> element
    * @param serviceNamePattern the value for the element <code>service-name-pattern</code> 
    * @return the current instance of <code>HandlerChainType<T></code> 
    */
   public HandlerChainType<T> serviceNamePattern(String serviceNamePattern);

   /**
    * Returns the <code>service-name-pattern</code> element
    * @return the node defined for the element <code>service-name-pattern</code> 
    */
   public String getServiceNamePattern();

   /**
    * Removes the <code>service-name-pattern</code> element 
    * @return the current instance of <code>HandlerChainType<T></code> 
    */
   public HandlerChainType<T> removeServiceNamePattern();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: HandlerChainType ElementName: xsd:token ElementType : port-name-pattern
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>port-name-pattern</code> element
    * @param portNamePattern the value for the element <code>port-name-pattern</code> 
    * @return the current instance of <code>HandlerChainType<T></code> 
    */
   public HandlerChainType<T> portNamePattern(String portNamePattern);

   /**
    * Returns the <code>port-name-pattern</code> element
    * @return the node defined for the element <code>port-name-pattern</code> 
    */
   public String getPortNamePattern();

   /**
    * Removes the <code>port-name-pattern</code> element 
    * @return the current instance of <code>HandlerChainType<T></code> 
    */
   public HandlerChainType<T> removePortNamePattern();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: HandlerChainType ElementName: xsd:string ElementType : protocol-bindings
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>protocol-bindings</code> element
    * @param protocolBindings the value for the element <code>protocol-bindings</code> 
    * @return the current instance of <code>HandlerChainType<T></code> 
    */
   public HandlerChainType<T> protocolBindings(String protocolBindings);

   /**
    * Returns the <code>protocol-bindings</code> element
    * @return the node defined for the element <code>protocol-bindings</code> 
    */
   public String getProtocolBindings();

   /**
    * Removes the <code>protocol-bindings</code> element 
    * @return the current instance of <code>HandlerChainType<T></code> 
    */
   public HandlerChainType<T> removeProtocolBindings();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: HandlerChainType ElementName: javaee:handlerType ElementType : handler
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>handler</code> element will be created and returned.
    * Otherwise, the first existing <code>handler</code> element will be returned.
    * @return the instance defined for the element <code>handler</code> 
    */
   public HandlerType<HandlerChainType<T>> getOrCreateHandler();

   /**
    * Creates a new <code>handler</code> element 
    * @return the new created instance of <code>HandlerType<HandlerChainType<T>></code> 
    */
   public HandlerType<HandlerChainType<T>> createHandler();

   /**
    * Returns all <code>handler</code> elements
    * @return list of <code>handler</code> 
    */
   public List<HandlerType<HandlerChainType<T>>> getAllHandler();

   /**
    * Removes all <code>handler</code> elements 
    * @return the current instance of <code>HandlerType<HandlerChainType<T>></code> 
    */
   public HandlerChainType<T> removeAllHandler();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: HandlerChainType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>HandlerChainType<T></code> 
    */
   public HandlerChainType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>HandlerChainType<T></code> 
    */
   public HandlerChainType<T> removeId();
}
