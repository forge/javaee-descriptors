package org.jboss.shrinkwrap.descriptor.impl.javaeewebservicesclient12; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient12.ServiceRefHandlerChainType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient12.ServiceRefHandlerType;
import org.jboss.shrinkwrap.descriptor.impl.javaeewebservicesclient12.ServiceRefHandlerTypeImpl;

/**
 * This class implements the <code> service-ref_handler-chainType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class ServiceRefHandlerChainTypeImpl<T> implements Child<T>, ServiceRefHandlerChainType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public ServiceRefHandlerChainTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public ServiceRefHandlerChainTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ServiceRefHandlerChainType ElementName: xsd:token ElementType : service-name-pattern
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>service-name-pattern</code> element
    * @param serviceNamePattern the value for the element <code>service-name-pattern</code> 
    * @return the current instance of <code>ServiceRefHandlerChainType<T></code> 
    */
   public ServiceRefHandlerChainType<T> serviceNamePattern(String serviceNamePattern)
   {
      childNode.getOrCreate("service-name-pattern").text(serviceNamePattern);
      return this;
   }

   /**
    * Returns the <code>service-name-pattern</code> element
    * @return the node defined for the element <code>service-name-pattern</code> 
    */
   public String getServiceNamePattern()
   {
      return childNode.getTextValueForPatternName("service-name-pattern");
   }

   /**
    * Removes the <code>service-name-pattern</code> element 
    * @return the current instance of <code>ServiceRefHandlerChainType<T></code> 
    */
   public ServiceRefHandlerChainType<T> removeServiceNamePattern()
   {
      childNode.removeChildren("service-name-pattern");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ServiceRefHandlerChainType ElementName: xsd:token ElementType : port-name-pattern
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>port-name-pattern</code> element
    * @param portNamePattern the value for the element <code>port-name-pattern</code> 
    * @return the current instance of <code>ServiceRefHandlerChainType<T></code> 
    */
   public ServiceRefHandlerChainType<T> portNamePattern(String portNamePattern)
   {
      childNode.getOrCreate("port-name-pattern").text(portNamePattern);
      return this;
   }

   /**
    * Returns the <code>port-name-pattern</code> element
    * @return the node defined for the element <code>port-name-pattern</code> 
    */
   public String getPortNamePattern()
   {
      return childNode.getTextValueForPatternName("port-name-pattern");
   }

   /**
    * Removes the <code>port-name-pattern</code> element 
    * @return the current instance of <code>ServiceRefHandlerChainType<T></code> 
    */
   public ServiceRefHandlerChainType<T> removePortNamePattern()
   {
      childNode.removeChildren("port-name-pattern");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ServiceRefHandlerChainType ElementName: xsd:string ElementType : protocol-bindings
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>protocol-bindings</code> element
    * @param protocolBindings the value for the element <code>protocol-bindings</code> 
    * @return the current instance of <code>ServiceRefHandlerChainType<T></code> 
    */
   public ServiceRefHandlerChainType<T> protocolBindings(String protocolBindings)
   {
      childNode.getOrCreate("protocol-bindings").text(protocolBindings);
      return this;
   }

   /**
    * Returns the <code>protocol-bindings</code> element
    * @return the node defined for the element <code>protocol-bindings</code> 
    */
   public String getProtocolBindings()
   {
      return childNode.getTextValueForPatternName("protocol-bindings");
   }

   /**
    * Removes the <code>protocol-bindings</code> element 
    * @return the current instance of <code>ServiceRefHandlerChainType<T></code> 
    */
   public ServiceRefHandlerChainType<T> removeProtocolBindings()
   {
      childNode.removeChildren("protocol-bindings");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ServiceRefHandlerChainType ElementName: javaee:service-ref_handlerType ElementType : handler
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>handler</code> element will be created and returned.
    * Otherwise, the first existing <code>handler</code> element will be returned.
    * @return the instance defined for the element <code>handler</code> 
    */
   public ServiceRefHandlerType<ServiceRefHandlerChainType<T>> getOrCreateHandler()
   {
      List<Node> nodeList = childNode.get("handler");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ServiceRefHandlerTypeImpl<ServiceRefHandlerChainType<T>>(this, "handler", childNode, nodeList.get(0));
      }
      return createHandler();
   }

   /**
    * Creates a new <code>handler</code> element 
    * @return the new created instance of <code>ServiceRefHandlerType<ServiceRefHandlerChainType<T>></code> 
    */
   public ServiceRefHandlerType<ServiceRefHandlerChainType<T>> createHandler()
   {
      return new ServiceRefHandlerTypeImpl<ServiceRefHandlerChainType<T>>(this, "handler", childNode);
   }

   /**
    * Returns all <code>handler</code> elements
    * @return list of <code>handler</code> 
    */
   public List<ServiceRefHandlerType<ServiceRefHandlerChainType<T>>> getAllHandler()
   {
      List<ServiceRefHandlerType<ServiceRefHandlerChainType<T>>> list = new ArrayList<ServiceRefHandlerType<ServiceRefHandlerChainType<T>>>();
      List<Node> nodeList = childNode.get("handler");
      for(Node node: nodeList)
      {
         ServiceRefHandlerType<ServiceRefHandlerChainType<T>>  type = new ServiceRefHandlerTypeImpl<ServiceRefHandlerChainType<T>>(this, "handler", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>handler</code> elements 
    * @return the current instance of <code>ServiceRefHandlerType<ServiceRefHandlerChainType<T>></code> 
    */
   public ServiceRefHandlerChainType<T> removeAllHandler()
   {
      childNode.removeChildren("handler");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ServiceRefHandlerChainType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>ServiceRefHandlerChainType<T></code> 
    */
   public ServiceRefHandlerChainType<T> id(String id)
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
    * @return the current instance of <code>ServiceRefHandlerChainType<T></code> 
    */
   public ServiceRefHandlerChainType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
