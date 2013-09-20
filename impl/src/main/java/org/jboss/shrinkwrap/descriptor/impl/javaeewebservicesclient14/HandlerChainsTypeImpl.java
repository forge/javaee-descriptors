package org.jboss.shrinkwrap.descriptor.impl.javaeewebservicesclient14; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient14.HandlerChainsType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient14.HandlerChainType;
import org.jboss.shrinkwrap.descriptor.impl.javaeewebservicesclient14.HandlerChainTypeImpl;

/**
 * This class implements the <code> handler-chainsType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class HandlerChainsTypeImpl<T> implements Child<T>, HandlerChainsType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public HandlerChainsTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public HandlerChainsTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: HandlerChainsType ElementName: javaee:handler-chainType ElementType : handler-chain
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>handler-chain</code> element will be created and returned.
    * Otherwise, the first existing <code>handler-chain</code> element will be returned.
    * @return the instance defined for the element <code>handler-chain</code> 
    */
   public HandlerChainType<HandlerChainsType<T>> getOrCreateHandlerChain()
   {
      List<Node> nodeList = childNode.get("handler-chain");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new HandlerChainTypeImpl<HandlerChainsType<T>>(this, "handler-chain", childNode, nodeList.get(0));
      }
      return createHandlerChain();
   }

   /**
    * Creates a new <code>handler-chain</code> element 
    * @return the new created instance of <code>HandlerChainType<HandlerChainsType<T>></code> 
    */
   public HandlerChainType<HandlerChainsType<T>> createHandlerChain()
   {
      return new HandlerChainTypeImpl<HandlerChainsType<T>>(this, "handler-chain", childNode);
   }

   /**
    * Returns all <code>handler-chain</code> elements
    * @return list of <code>handler-chain</code> 
    */
   public List<HandlerChainType<HandlerChainsType<T>>> getAllHandlerChain()
   {
      List<HandlerChainType<HandlerChainsType<T>>> list = new ArrayList<HandlerChainType<HandlerChainsType<T>>>();
      List<Node> nodeList = childNode.get("handler-chain");
      for(Node node: nodeList)
      {
         HandlerChainType<HandlerChainsType<T>>  type = new HandlerChainTypeImpl<HandlerChainsType<T>>(this, "handler-chain", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>handler-chain</code> elements 
    * @return the current instance of <code>HandlerChainType<HandlerChainsType<T>></code> 
    */
   public HandlerChainsType<T> removeAllHandlerChain()
   {
      childNode.removeChildren("handler-chain");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: HandlerChainsType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>HandlerChainsType<T></code> 
    */
   public HandlerChainsType<T> id(String id)
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
    * @return the current instance of <code>HandlerChainsType<T></code> 
    */
   public HandlerChainsType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
