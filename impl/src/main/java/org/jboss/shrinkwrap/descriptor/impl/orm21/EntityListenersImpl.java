package org.jboss.shrinkwrap.descriptor.impl.orm21; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.orm21.EntityListeners;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.orm21.EntityListener;
import org.jboss.shrinkwrap.descriptor.impl.orm21.EntityListenerImpl;

/**
 * This class implements the <code> entity-listeners </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class EntityListenersImpl<T> implements Child<T>, EntityListeners<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public EntityListenersImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public EntityListenersImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityListeners ElementName: orm:entity-listener ElementType : entity-listener
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>entity-listener</code> element will be created and returned.
    * Otherwise, the first existing <code>entity-listener</code> element will be returned.
    * @return the instance defined for the element <code>entity-listener</code> 
    */
   public EntityListener<EntityListeners<T>> getOrCreateEntityListener()
   {
      List<Node> nodeList = childNode.get("entity-listener");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new EntityListenerImpl<EntityListeners<T>>(this, "entity-listener", childNode, nodeList.get(0));
      }
      return createEntityListener();
   }

   /**
    * Creates a new <code>entity-listener</code> element 
    * @return the new created instance of <code>EntityListener<EntityListeners<T>></code> 
    */
   public EntityListener<EntityListeners<T>> createEntityListener()
   {
      return new EntityListenerImpl<EntityListeners<T>>(this, "entity-listener", childNode);
   }

   /**
    * Returns all <code>entity-listener</code> elements
    * @return list of <code>entity-listener</code> 
    */
   public List<EntityListener<EntityListeners<T>>> getAllEntityListener()
   {
      List<EntityListener<EntityListeners<T>>> list = new ArrayList<EntityListener<EntityListeners<T>>>();
      List<Node> nodeList = childNode.get("entity-listener");
      for(Node node: nodeList)
      {
         EntityListener<EntityListeners<T>>  type = new EntityListenerImpl<EntityListeners<T>>(this, "entity-listener", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>entity-listener</code> elements 
    * @return the current instance of <code>EntityListener<EntityListeners<T>></code> 
    */
   public EntityListeners<T> removeAllEntityListener()
   {
      childNode.removeChildren("entity-listener");
      return this;
   }
}
