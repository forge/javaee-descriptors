package org.jboss.shrinkwrap.descriptor.impl.jobXML10; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.Listeners;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.Listener;
import org.jboss.shrinkwrap.descriptor.impl.jobXML10.ListenerImpl;

/**
 * This class implements the <code> Listeners </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class ListenersImpl<T> implements Child<T>, Listeners<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public ListenersImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public ListenersImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Listeners ElementName: jsl:Listener ElementType : listener
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>listener</code> element will be created and returned.
    * Otherwise, the first existing <code>listener</code> element will be returned.
    * @return the instance defined for the element <code>listener</code> 
    */
   public Listener<Listeners<T>> getOrCreateListener()
   {
      List<Node> nodeList = childNode.get("listener");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ListenerImpl<Listeners<T>>(this, "listener", childNode, nodeList.get(0));
      }
      return createListener();
   }

   /**
    * Creates a new <code>listener</code> element 
    * @return the new created instance of <code>Listener<Listeners<T>></code> 
    */
   public Listener<Listeners<T>> createListener()
   {
      return new ListenerImpl<Listeners<T>>(this, "listener", childNode);
   }

   /**
    * Returns all <code>listener</code> elements
    * @return list of <code>listener</code> 
    */
   public List<Listener<Listeners<T>>> getAllListener()
   {
      List<Listener<Listeners<T>>> list = new ArrayList<Listener<Listeners<T>>>();
      List<Node> nodeList = childNode.get("listener");
      for(Node node: nodeList)
      {
         Listener<Listeners<T>>  type = new ListenerImpl<Listeners<T>>(this, "listener", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>listener</code> elements 
    * @return the current instance of <code>Listener<Listeners<T>></code> 
    */
   public Listeners<T> removeAllListener()
   {
      childNode.removeChildren("listener");
      return this;
   }
}
