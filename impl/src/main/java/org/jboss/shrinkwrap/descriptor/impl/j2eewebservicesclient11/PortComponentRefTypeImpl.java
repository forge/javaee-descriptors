package org.jboss.shrinkwrap.descriptor.impl.j2eewebservicesclient11; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.j2eewebservicesclient11.PortComponentRefType;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> port-component-refType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class PortComponentRefTypeImpl<T> implements Child<T>, PortComponentRefType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public PortComponentRefTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public PortComponentRefTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortComponentRefType ElementName: xsd:token ElementType : service-endpoint-interface
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>service-endpoint-interface</code> element
    * @param serviceEndpointInterface the value for the element <code>service-endpoint-interface</code> 
    * @return the current instance of <code>PortComponentRefType<T></code> 
    */
   public PortComponentRefType<T> serviceEndpointInterface(String serviceEndpointInterface)
   {
      childNode.getOrCreate("service-endpoint-interface").text(serviceEndpointInterface);
      return this;
   }

   /**
    * Returns the <code>service-endpoint-interface</code> element
    * @return the node defined for the element <code>service-endpoint-interface</code> 
    */
   public String getServiceEndpointInterface()
   {
      return childNode.getTextValueForPatternName("service-endpoint-interface");
   }

   /**
    * Removes the <code>service-endpoint-interface</code> element 
    * @return the current instance of <code>PortComponentRefType<T></code> 
    */
   public PortComponentRefType<T> removeServiceEndpointInterface()
   {
      childNode.removeChildren("service-endpoint-interface");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortComponentRefType ElementName: xsd:token ElementType : port-component-link
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>port-component-link</code> element
    * @param portComponentLink the value for the element <code>port-component-link</code> 
    * @return the current instance of <code>PortComponentRefType<T></code> 
    */
   public PortComponentRefType<T> portComponentLink(String portComponentLink)
   {
      childNode.getOrCreate("port-component-link").text(portComponentLink);
      return this;
   }

   /**
    * Returns the <code>port-component-link</code> element
    * @return the node defined for the element <code>port-component-link</code> 
    */
   public String getPortComponentLink()
   {
      return childNode.getTextValueForPatternName("port-component-link");
   }

   /**
    * Removes the <code>port-component-link</code> element 
    * @return the current instance of <code>PortComponentRefType<T></code> 
    */
   public PortComponentRefType<T> removePortComponentLink()
   {
      childNode.removeChildren("port-component-link");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PortComponentRefType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>PortComponentRefType<T></code> 
    */
   public PortComponentRefType<T> id(String id)
   {
      childNode.attribute("id", id);
      return this;
   }

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
      public String getId()
   {
      return childNode.getAttribute("id");
   }

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>PortComponentRefType<T></code> 
    */
   public PortComponentRefType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
