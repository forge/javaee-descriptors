package org.jboss.shrinkwrap.descriptor.api.j2eewebservicesclient11; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> port-component-refType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface PortComponentRefType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortComponentRefType ElementName: xsd:token ElementType : service-endpoint-interface
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>service-endpoint-interface</code> element
    * @param serviceEndpointInterface the value for the element <code>service-endpoint-interface</code> 
    * @return the current instance of <code>PortComponentRefType<T></code> 
    */
   public PortComponentRefType<T> serviceEndpointInterface(String serviceEndpointInterface);

   /**
    * Returns the <code>service-endpoint-interface</code> element
    * @return the node defined for the element <code>service-endpoint-interface</code> 
    */
   public String getServiceEndpointInterface();

   /**
    * Removes the <code>service-endpoint-interface</code> element 
    * @return the current instance of <code>PortComponentRefType<T></code> 
    */
   public PortComponentRefType<T> removeServiceEndpointInterface();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortComponentRefType ElementName: xsd:token ElementType : port-component-link
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>port-component-link</code> element
    * @param portComponentLink the value for the element <code>port-component-link</code> 
    * @return the current instance of <code>PortComponentRefType<T></code> 
    */
   public PortComponentRefType<T> portComponentLink(String portComponentLink);

   /**
    * Returns the <code>port-component-link</code> element
    * @return the node defined for the element <code>port-component-link</code> 
    */
   public String getPortComponentLink();

   /**
    * Removes the <code>port-component-link</code> element 
    * @return the current instance of <code>PortComponentRefType<T></code> 
    */
   public PortComponentRefType<T> removePortComponentLink();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortComponentRefType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>PortComponentRefType<T></code> 
    */
   public PortComponentRefType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>PortComponentRefType<T></code> 
    */
   public PortComponentRefType<T> removeId();
}
