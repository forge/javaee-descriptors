package org.jboss.shrinkwrap.descriptor.impl.beans11; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.beans11.Alternatives;
import org.jboss.shrinkwrap.descriptor.api.beans11.Beans;
import org.jboss.shrinkwrap.descriptor.api.beans11.Decorators;
import org.jboss.shrinkwrap.descriptor.api.beans11.Interceptors;
import org.jboss.shrinkwrap.descriptor.api.beans11.Scan;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> beans </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class BeansImpl<T> implements Child<T>, Beans<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public BeansImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public BeansImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Beans ElementName: javaee:interceptors ElementType : interceptors
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>interceptors</code> element will be created and returned.
    * Otherwise, the first existing <code>interceptors</code> element will be returned.
    * @return the instance defined for the element <code>interceptors</code> 
    */
   public Interceptors<Beans<T>> getOrCreateInterceptors()
   {
      List<Node> nodeList = childNode.get("interceptors");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new InterceptorsImpl<Beans<T>>(this, "interceptors", childNode, nodeList.get(0));
      }
      return createInterceptors();
   }

   /**
    * Creates a new <code>interceptors</code> element 
    * @return the new created instance of <code>Interceptors<Beans<T>></code> 
    */
   public Interceptors<Beans<T>> createInterceptors()
   {
      return new InterceptorsImpl<Beans<T>>(this, "interceptors", childNode);
   }

   /**
    * Returns all <code>interceptors</code> elements
    * @return list of <code>interceptors</code> 
    */
   public List<Interceptors<Beans<T>>> getAllInterceptors()
   {
      List<Interceptors<Beans<T>>> list = new ArrayList<Interceptors<Beans<T>>>();
      List<Node> nodeList = childNode.get("interceptors");
      for(Node node: nodeList)
      {
         Interceptors<Beans<T>>  type = new InterceptorsImpl<Beans<T>>(this, "interceptors", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>interceptors</code> elements 
    * @return the current instance of <code>Interceptors<Beans<T>></code> 
    */
   public Beans<T> removeAllInterceptors()
   {
      childNode.removeChildren("interceptors");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Beans ElementName: javaee:decorators ElementType : decorators
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>decorators</code> element will be created and returned.
    * Otherwise, the first existing <code>decorators</code> element will be returned.
    * @return the instance defined for the element <code>decorators</code> 
    */
   public Decorators<Beans<T>> getOrCreateDecorators()
   {
      List<Node> nodeList = childNode.get("decorators");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new DecoratorsImpl<Beans<T>>(this, "decorators", childNode, nodeList.get(0));
      }
      return createDecorators();
   }

   /**
    * Creates a new <code>decorators</code> element 
    * @return the new created instance of <code>Decorators<Beans<T>></code> 
    */
   public Decorators<Beans<T>> createDecorators()
   {
      return new DecoratorsImpl<Beans<T>>(this, "decorators", childNode);
   }

   /**
    * Returns all <code>decorators</code> elements
    * @return list of <code>decorators</code> 
    */
   public List<Decorators<Beans<T>>> getAllDecorators()
   {
      List<Decorators<Beans<T>>> list = new ArrayList<Decorators<Beans<T>>>();
      List<Node> nodeList = childNode.get("decorators");
      for(Node node: nodeList)
      {
         Decorators<Beans<T>>  type = new DecoratorsImpl<Beans<T>>(this, "decorators", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>decorators</code> elements 
    * @return the current instance of <code>Decorators<Beans<T>></code> 
    */
   public Beans<T> removeAllDecorators()
   {
      childNode.removeChildren("decorators");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Beans ElementName: javaee:alternatives ElementType : alternatives
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>alternatives</code> element will be created and returned.
    * Otherwise, the first existing <code>alternatives</code> element will be returned.
    * @return the instance defined for the element <code>alternatives</code> 
    */
   public Alternatives<Beans<T>> getOrCreateAlternatives()
   {
      List<Node> nodeList = childNode.get("alternatives");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new AlternativesImpl<Beans<T>>(this, "alternatives", childNode, nodeList.get(0));
      }
      return createAlternatives();
   }

   /**
    * Creates a new <code>alternatives</code> element 
    * @return the new created instance of <code>Alternatives<Beans<T>></code> 
    */
   public Alternatives<Beans<T>> createAlternatives()
   {
      return new AlternativesImpl<Beans<T>>(this, "alternatives", childNode);
   }

   /**
    * Returns all <code>alternatives</code> elements
    * @return list of <code>alternatives</code> 
    */
   public List<Alternatives<Beans<T>>> getAllAlternatives()
   {
      List<Alternatives<Beans<T>>> list = new ArrayList<Alternatives<Beans<T>>>();
      List<Node> nodeList = childNode.get("alternatives");
      for(Node node: nodeList)
      {
         Alternatives<Beans<T>>  type = new AlternativesImpl<Beans<T>>(this, "alternatives", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>alternatives</code> elements 
    * @return the current instance of <code>Alternatives<Beans<T>></code> 
    */
   public Beans<T> removeAllAlternatives()
   {
      childNode.removeChildren("alternatives");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Beans ElementName: javaee:scan ElementType : scan
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>scan</code> element will be created and returned.
    * Otherwise, the first existing <code>scan</code> element will be returned.
    * @return the instance defined for the element <code>scan</code> 
    */
   public Scan<Beans<T>> getOrCreateScan()
   {
      List<Node> nodeList = childNode.get("scan");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ScanImpl<Beans<T>>(this, "scan", childNode, nodeList.get(0));
      }
      return createScan();
   }

   /**
    * Creates a new <code>scan</code> element 
    * @return the new created instance of <code>Scan<Beans<T>></code> 
    */
   public Scan<Beans<T>> createScan()
   {
      return new ScanImpl<Beans<T>>(this, "scan", childNode);
   }

   /**
    * Returns all <code>scan</code> elements
    * @return list of <code>scan</code> 
    */
   public List<Scan<Beans<T>>> getAllScan()
   {
      List<Scan<Beans<T>>> list = new ArrayList<Scan<Beans<T>>>();
      List<Node> nodeList = childNode.get("scan");
      for(Node node: nodeList)
      {
         Scan<Beans<T>>  type = new ScanImpl<Beans<T>>(this, "scan", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>scan</code> elements 
    * @return the current instance of <code>Scan<Beans<T>></code> 
    */
   public Beans<T> removeAllScan()
   {
      childNode.removeChildren("scan");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Beans ElementName: xsd:string ElementType : version
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of <code>Beans<T></code> 
    */
   public Beans<T> version(String version)
   {
      childNode.attribute("version", version);
      return this;
   }

   /**
    * Returns the <code>version</code> attribute
    * @return the value defined for the attribute <code>version</code> 
    */
      public String getVersion()
   {
      return childNode.getAttribute("version");
   }

   /**
    * Removes the <code>version</code> attribute 
    * @return the current instance of <code>Beans<T></code> 
    */
   public Beans<T> removeVersion()
   {
      childNode.removeAttribute("version");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Beans ElementName: xsd:string ElementType : bean-discovery-mode
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>bean-discovery-mode</code> attribute
    * @param beanDiscoveryMode the value for the attribute <code>bean-discovery-mode</code> 
    * @return the current instance of <code>Beans<T></code> 
    */
   public Beans<T> beanDiscoveryMode(String beanDiscoveryMode)
   {
      childNode.attribute("bean-discovery-mode", beanDiscoveryMode);
      return this;
   }

   /**
    * Returns the <code>bean-discovery-mode</code> attribute
    * @return the value defined for the attribute <code>bean-discovery-mode</code> 
    */
      public String getBeanDiscoveryMode()
   {
      return childNode.getAttribute("bean-discovery-mode");
   }

   /**
    * Removes the <code>bean-discovery-mode</code> attribute 
    * @return the current instance of <code>Beans<T></code> 
    */
   public Beans<T> removeBeanDiscoveryMode()
   {
      childNode.removeAttribute("bean-discovery-mode");
      return this;
   }
}
