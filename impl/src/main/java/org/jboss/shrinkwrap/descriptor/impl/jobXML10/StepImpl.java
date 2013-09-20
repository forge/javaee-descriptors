package org.jboss.shrinkwrap.descriptor.impl.jobXML10; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.Batchlet;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.Chunk;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.End;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.Fail;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.Listeners;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.Next;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.Partition;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.Properties;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.Step;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.Stop;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> Step </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class StepImpl<T> implements Child<T>, Step<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public StepImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public StepImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Step ElementName: jsl:End ElementType : end
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>end</code> element will be created and returned.
    * Otherwise, the first existing <code>end</code> element will be returned.
    * @return the instance defined for the element <code>end</code> 
    */
   public End<Step<T>> getOrCreateEnd()
   {
      List<Node> nodeList = childNode.get("end");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new EndImpl<Step<T>>(this, "end", childNode, nodeList.get(0));
      }
      return createEnd();
   }

   /**
    * Creates a new <code>end</code> element 
    * @return the new created instance of <code>End<Step<T>></code> 
    */
   public End<Step<T>> createEnd()
   {
      return new EndImpl<Step<T>>(this, "end", childNode);
   }

   /**
    * Returns all <code>end</code> elements
    * @return list of <code>end</code> 
    */
   public List<End<Step<T>>> getAllEnd()
   {
      List<End<Step<T>>> list = new ArrayList<End<Step<T>>>();
      List<Node> nodeList = childNode.get("end");
      for(Node node: nodeList)
      {
         End<Step<T>>  type = new EndImpl<Step<T>>(this, "end", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>end</code> elements 
    * @return the current instance of <code>End<Step<T>></code> 
    */
   public Step<T> removeAllEnd()
   {
      childNode.removeChildren("end");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Step ElementName: jsl:Fail ElementType : fail
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>fail</code> element will be created and returned.
    * Otherwise, the first existing <code>fail</code> element will be returned.
    * @return the instance defined for the element <code>fail</code> 
    */
   public Fail<Step<T>> getOrCreateFail()
   {
      List<Node> nodeList = childNode.get("fail");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new FailImpl<Step<T>>(this, "fail", childNode, nodeList.get(0));
      }
      return createFail();
   }

   /**
    * Creates a new <code>fail</code> element 
    * @return the new created instance of <code>Fail<Step<T>></code> 
    */
   public Fail<Step<T>> createFail()
   {
      return new FailImpl<Step<T>>(this, "fail", childNode);
   }

   /**
    * Returns all <code>fail</code> elements
    * @return list of <code>fail</code> 
    */
   public List<Fail<Step<T>>> getAllFail()
   {
      List<Fail<Step<T>>> list = new ArrayList<Fail<Step<T>>>();
      List<Node> nodeList = childNode.get("fail");
      for(Node node: nodeList)
      {
         Fail<Step<T>>  type = new FailImpl<Step<T>>(this, "fail", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>fail</code> elements 
    * @return the current instance of <code>Fail<Step<T>></code> 
    */
   public Step<T> removeAllFail()
   {
      childNode.removeChildren("fail");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Step ElementName: jsl:Next ElementType : next
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>next</code> element will be created and returned.
    * Otherwise, the first existing <code>next</code> element will be returned.
    * @return the instance defined for the element <code>next</code> 
    */
   public Next<Step<T>> getOrCreateNext()
   {
      List<Node> nodeList = childNode.get("next");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new NextImpl<Step<T>>(this, "next", childNode, nodeList.get(0));
      }
      return createNext();
   }

   /**
    * Creates a new <code>next</code> element 
    * @return the new created instance of <code>Next<Step<T>></code> 
    */
   public Next<Step<T>> createNext()
   {
      return new NextImpl<Step<T>>(this, "next", childNode);
   }

   /**
    * Returns all <code>next</code> elements
    * @return list of <code>next</code> 
    */
   public List<Next<Step<T>>> getAllNext()
   {
      List<Next<Step<T>>> list = new ArrayList<Next<Step<T>>>();
      List<Node> nodeList = childNode.get("next");
      for(Node node: nodeList)
      {
         Next<Step<T>>  type = new NextImpl<Step<T>>(this, "next", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>next</code> elements 
    * @return the current instance of <code>Next<Step<T>></code> 
    */
   public Step<T> removeAllNext()
   {
      childNode.removeChildren("next");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Step ElementName: jsl:Stop ElementType : stop
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>stop</code> element will be created and returned.
    * Otherwise, the first existing <code>stop</code> element will be returned.
    * @return the instance defined for the element <code>stop</code> 
    */
   public Stop<Step<T>> getOrCreateStop()
   {
      List<Node> nodeList = childNode.get("stop");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new StopImpl<Step<T>>(this, "stop", childNode, nodeList.get(0));
      }
      return createStop();
   }

   /**
    * Creates a new <code>stop</code> element 
    * @return the new created instance of <code>Stop<Step<T>></code> 
    */
   public Stop<Step<T>> createStop()
   {
      return new StopImpl<Step<T>>(this, "stop", childNode);
   }

   /**
    * Returns all <code>stop</code> elements
    * @return list of <code>stop</code> 
    */
   public List<Stop<Step<T>>> getAllStop()
   {
      List<Stop<Step<T>>> list = new ArrayList<Stop<Step<T>>>();
      List<Node> nodeList = childNode.get("stop");
      for(Node node: nodeList)
      {
         Stop<Step<T>>  type = new StopImpl<Step<T>>(this, "stop", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>stop</code> elements 
    * @return the current instance of <code>Stop<Step<T>></code> 
    */
   public Step<T> removeAllStop()
   {
      childNode.removeChildren("stop");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Step ElementName: jsl:Properties ElementType : properties
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>properties</code> element with the given value will be created.
    * Otherwise, the existing <code>properties</code> element will be returned.
    * @return  a new or existing instance of <code>Properties<Step<T>></code> 
    */
   public Properties<Step<T>> getOrCreateProperties()
   {
      Node node = childNode.getOrCreate("properties");
      Properties<Step<T>> properties = new PropertiesImpl<Step<T>>(this, "properties", childNode, node);
      return properties;
   }

   /**
    * Removes the <code>properties</code> element 
    * @return the current instance of <code>Step<T></code> 
    */
   public Step<T> removeProperties()
   {
      childNode.removeChildren("properties");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Step ElementName: jsl:Listeners ElementType : listeners
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>listeners</code> element with the given value will be created.
    * Otherwise, the existing <code>listeners</code> element will be returned.
    * @return  a new or existing instance of <code>Listeners<Step<T>></code> 
    */
   public Listeners<Step<T>> getOrCreateListeners()
   {
      Node node = childNode.getOrCreate("listeners");
      Listeners<Step<T>> listeners = new ListenersImpl<Step<T>>(this, "listeners", childNode, node);
      return listeners;
   }

   /**
    * Removes the <code>listeners</code> element 
    * @return the current instance of <code>Step<T></code> 
    */
   public Step<T> removeListeners()
   {
      childNode.removeChildren("listeners");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Step ElementName: jsl:Batchlet ElementType : batchlet
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>batchlet</code> element with the given value will be created.
    * Otherwise, the existing <code>batchlet</code> element will be returned.
    * @return  a new or existing instance of <code>Batchlet<Step<T>></code> 
    */
   public Batchlet<Step<T>> getOrCreateBatchlet()
   {
      Node node = childNode.getOrCreate("batchlet");
      Batchlet<Step<T>> batchlet = new BatchletImpl<Step<T>>(this, "batchlet", childNode, node);
      return batchlet;
   }

   /**
    * Removes the <code>batchlet</code> element 
    * @return the current instance of <code>Step<T></code> 
    */
   public Step<T> removeBatchlet()
   {
      childNode.removeChildren("batchlet");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Step ElementName: jsl:Chunk ElementType : chunk
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>chunk</code> element with the given value will be created.
    * Otherwise, the existing <code>chunk</code> element will be returned.
    * @return  a new or existing instance of <code>Chunk<Step<T>></code> 
    */
   public Chunk<Step<T>> getOrCreateChunk()
   {
      Node node = childNode.getOrCreate("chunk");
      Chunk<Step<T>> chunk = new ChunkImpl<Step<T>>(this, "chunk", childNode, node);
      return chunk;
   }

   /**
    * Removes the <code>chunk</code> element 
    * @return the current instance of <code>Step<T></code> 
    */
   public Step<T> removeChunk()
   {
      childNode.removeChildren("chunk");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Step ElementName: jsl:Partition ElementType : partition
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>partition</code> element with the given value will be created.
    * Otherwise, the existing <code>partition</code> element will be returned.
    * @return  a new or existing instance of <code>Partition<Step<T>></code> 
    */
   public Partition<Step<T>> getOrCreatePartition()
   {
      Node node = childNode.getOrCreate("partition");
      Partition<Step<T>> partition = new PartitionImpl<Step<T>>(this, "partition", childNode, node);
      return partition;
   }

   /**
    * Removes the <code>partition</code> element 
    * @return the current instance of <code>Step<T></code> 
    */
   public Step<T> removePartition()
   {
      childNode.removeChildren("partition");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Step ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>Step<T></code> 
    */
   public Step<T> id(String id)
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
    * @return the current instance of <code>Step<T></code> 
    */
   public Step<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Step ElementName: xsd:string ElementType : start-limit
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>start-limit</code> attribute
    * @param startLimit the value for the attribute <code>start-limit</code> 
    * @return the current instance of <code>Step<T></code> 
    */
   public Step<T> startLimit(String startLimit)
   {
      childNode.attribute("start-limit", startLimit);
      return this;
   }

   /**
    * Returns the <code>start-limit</code> attribute
    * @return the value defined for the attribute <code>start-limit</code> 
    */
      public String getStartLimit()
   {
      return childNode.getAttribute("start-limit");
   }

   /**
    * Removes the <code>start-limit</code> attribute 
    * @return the current instance of <code>Step<T></code> 
    */
   public Step<T> removeStartLimit()
   {
      childNode.removeAttribute("start-limit");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Step ElementName: xsd:string ElementType : allow-start-if-complete
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>allow-start-if-complete</code> attribute
    * @param allowStartIfComplete the value for the attribute <code>allow-start-if-complete</code> 
    * @return the current instance of <code>Step<T></code> 
    */
   public Step<T> allowStartIfComplete(String allowStartIfComplete)
   {
      childNode.attribute("allow-start-if-complete", allowStartIfComplete);
      return this;
   }

   /**
    * Returns the <code>allow-start-if-complete</code> attribute
    * @return the value defined for the attribute <code>allow-start-if-complete</code> 
    */
      public String getAllowStartIfComplete()
   {
      return childNode.getAttribute("allow-start-if-complete");
   }

   /**
    * Removes the <code>allow-start-if-complete</code> attribute 
    * @return the current instance of <code>Step<T></code> 
    */
   public Step<T> removeAllowStartIfComplete()
   {
      childNode.removeAttribute("allow-start-if-complete");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Step ElementName: xsd:string ElementType : next
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>next</code> attribute
    * @param next the value for the attribute <code>next</code> 
    * @return the current instance of <code>Step<T></code> 
    */
   public Step<T> next(String next)
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
    * @return the current instance of <code>Step<T></code> 
    */
   public Step<T> removeNext()
   {
      childNode.removeAttribute("next");
      return this;
   }
}
