package org.jboss.shrinkwrap.descriptor.impl.batchXML10; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.batchXML10.BatchArtifacts;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.batchXML10.BatchArtifactRef;
import org.jboss.shrinkwrap.descriptor.impl.batchXML10.BatchArtifactRefImpl;

/**
 * This class implements the <code> BatchArtifacts </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class BatchArtifactsImpl<T> implements Child<T>, BatchArtifacts<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public BatchArtifactsImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public BatchArtifactsImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: BatchArtifacts ElementName: jbatch:BatchArtifactRef ElementType : ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>ref</code> element will be created and returned.
    * Otherwise, the first existing <code>ref</code> element will be returned.
    * @return the instance defined for the element <code>ref</code> 
    */
   public BatchArtifactRef<BatchArtifacts<T>> getOrCreateRef()
   {
      List<Node> nodeList = childNode.get("ref");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new BatchArtifactRefImpl<BatchArtifacts<T>>(this, "ref", childNode, nodeList.get(0));
      }
      return createRef();
   }

   /**
    * Creates a new <code>ref</code> element 
    * @return the new created instance of <code>BatchArtifactRef<BatchArtifacts<T>></code> 
    */
   public BatchArtifactRef<BatchArtifacts<T>> createRef()
   {
      return new BatchArtifactRefImpl<BatchArtifacts<T>>(this, "ref", childNode);
   }

   /**
    * Returns all <code>ref</code> elements
    * @return list of <code>ref</code> 
    */
   public List<BatchArtifactRef<BatchArtifacts<T>>> getAllRef()
   {
      List<BatchArtifactRef<BatchArtifacts<T>>> list = new ArrayList<BatchArtifactRef<BatchArtifacts<T>>>();
      List<Node> nodeList = childNode.get("ref");
      for(Node node: nodeList)
      {
         BatchArtifactRef<BatchArtifacts<T>>  type = new BatchArtifactRefImpl<BatchArtifacts<T>>(this, "ref", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>ref</code> elements 
    * @return the current instance of <code>BatchArtifactRef<BatchArtifacts<T>></code> 
    */
   public BatchArtifacts<T> removeAllRef()
   {
      childNode.removeChildren("ref");
      return this;
   }
}
