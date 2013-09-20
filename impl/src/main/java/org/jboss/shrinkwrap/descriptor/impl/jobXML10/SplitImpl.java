package org.jboss.shrinkwrap.descriptor.impl.jobXML10; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.Flow;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.Split;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> Split </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class SplitImpl<T> implements Child<T>, Split<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public SplitImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public SplitImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Split ElementName: jsl:Flow ElementType : flow
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>flow</code> element will be created and returned.
    * Otherwise, the first existing <code>flow</code> element will be returned.
    * @return the instance defined for the element <code>flow</code> 
    */
   public Flow<Split<T>> getOrCreateFlow()
   {
      List<Node> nodeList = childNode.get("flow");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new FlowImpl<Split<T>>(this, "flow", childNode, nodeList.get(0));
      }
      return createFlow();
   }

   /**
    * Creates a new <code>flow</code> element 
    * @return the new created instance of <code>Flow<Split<T>></code> 
    */
   public Flow<Split<T>> createFlow()
   {
      return new FlowImpl<Split<T>>(this, "flow", childNode);
   }

   /**
    * Returns all <code>flow</code> elements
    * @return list of <code>flow</code> 
    */
   public List<Flow<Split<T>>> getAllFlow()
   {
      List<Flow<Split<T>>> list = new ArrayList<Flow<Split<T>>>();
      List<Node> nodeList = childNode.get("flow");
      for(Node node: nodeList)
      {
         Flow<Split<T>>  type = new FlowImpl<Split<T>>(this, "flow", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>flow</code> elements 
    * @return the current instance of <code>Flow<Split<T>></code> 
    */
   public Split<T> removeAllFlow()
   {
      childNode.removeChildren("flow");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Split ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>Split<T></code> 
    */
   public Split<T> id(String id)
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
    * @return the current instance of <code>Split<T></code> 
    */
   public Split<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Split ElementName: xsd:string ElementType : next
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>next</code> attribute
    * @param next the value for the attribute <code>next</code> 
    * @return the current instance of <code>Split<T></code> 
    */
   public Split<T> next(String next)
   {
      childNode.attribute("next", next);
      return this;
   }

   /**
    * Returns the <code>next</code> attribute
    * @return the value defined for the attribute <code>next</code> 
    */
      public String getNext()
   {
      return childNode.getAttribute("next");
   }

   /**
    * Removes the <code>next</code> attribute 
    * @return the current instance of <code>Split<T></code> 
    */
   public Split<T> removeNext()
   {
      childNode.removeAttribute("next");
      return this;
   }
}
