package org.jboss.shrinkwrap.descriptor.impl.javaeewebservicesclient12; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient12.ServiceRefHandlerChainsType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient12.ServiceRefHandlerChainType;
import org.jboss.shrinkwrap.descriptor.impl.javaeewebservicesclient12.ServiceRefHandlerChainTypeImpl;

/**
 * This class implements the <code> service-ref_handler-chainsType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class ServiceRefHandlerChainsTypeImpl<T> implements Child<T>, ServiceRefHandlerChainsType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public ServiceRefHandlerChainsTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public ServiceRefHandlerChainsTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ServiceRefHandlerChainsType ElementName: javaee:service-ref_handler-chainType ElementType : handler-chain
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>handler-chain</code> element will be created and returned.
    * Otherwise, the first existing <code>handler-chain</code> element will be returned.
    * @return the instance defined for the element <code>handler-chain</code> 
    */
   public ServiceRefHandlerChainType<ServiceRefHandlerChainsType<T>> getOrCreateHandlerChain()
   {
      List<Node> nodeList = childNode.get("handler-chain");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ServiceRefHandlerChainTypeImpl<ServiceRefHandlerChainsType<T>>(this, "handler-chain", childNode, nodeList.get(0));
      }
      return createHandlerChain();
   }

   /**
    * Creates a new <code>handler-chain</code> element 
    * @return the new created instance of <code>ServiceRefHandlerChainType<ServiceRefHandlerChainsType<T>></code> 
    */
   public ServiceRefHandlerChainType<ServiceRefHandlerChainsType<T>> createHandlerChain()
   {
      return new ServiceRefHandlerChainTypeImpl<ServiceRefHandlerChainsType<T>>(this, "handler-chain", childNode);
   }

   /**
    * Returns all <code>handler-chain</code> elements
    * @return list of <code>handler-chain</code> 
    */
   public List<ServiceRefHandlerChainType<ServiceRefHandlerChainsType<T>>> getAllHandlerChain()
   {
      List<ServiceRefHandlerChainType<ServiceRefHandlerChainsType<T>>> list = new ArrayList<ServiceRefHandlerChainType<ServiceRefHandlerChainsType<T>>>();
      List<Node> nodeList = childNode.get("handler-chain");
      for(Node node: nodeList)
      {
         ServiceRefHandlerChainType<ServiceRefHandlerChainsType<T>>  type = new ServiceRefHandlerChainTypeImpl<ServiceRefHandlerChainsType<T>>(this, "handler-chain", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>handler-chain</code> elements 
    * @return the current instance of <code>ServiceRefHandlerChainType<ServiceRefHandlerChainsType<T>></code> 
    */
   public ServiceRefHandlerChainsType<T> removeAllHandlerChain()
   {
      childNode.removeChildren("handler-chain");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ServiceRefHandlerChainsType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>ServiceRefHandlerChainsType<T></code> 
    */
   public ServiceRefHandlerChainsType<T> id(String id)
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
    * @return the current instance of <code>ServiceRefHandlerChainsType<T></code> 
    */
   public ServiceRefHandlerChainsType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
