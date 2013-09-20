package org.jboss.shrinkwrap.descriptor.impl.jobXML10; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.Decision;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.Flow;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.Job;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.Listeners;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.Properties;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.Split;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.Step;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> Job </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class JobImpl<T> implements Child<T>, Job<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public JobImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public JobImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Job ElementName: jsl:Properties ElementType : properties
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>properties</code> element with the given value will be created.
    * Otherwise, the existing <code>properties</code> element will be returned.
    * @return  a new or existing instance of <code>Properties<Job<T>></code> 
    */
   public Properties<Job<T>> getOrCreateProperties()
   {
      Node node = childNode.getOrCreate("properties");
      Properties<Job<T>> properties = new PropertiesImpl<Job<T>>(this, "properties", childNode, node);
      return properties;
   }

   /**
    * Removes the <code>properties</code> element 
    * @return the current instance of <code>Job<T></code> 
    */
   public Job<T> removeProperties()
   {
      childNode.removeChildren("properties");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Job ElementName: jsl:Listeners ElementType : listeners
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>listeners</code> element with the given value will be created.
    * Otherwise, the existing <code>listeners</code> element will be returned.
    * @return  a new or existing instance of <code>Listeners<Job<T>></code> 
    */
   public Listeners<Job<T>> getOrCreateListeners()
   {
      Node node = childNode.getOrCreate("listeners");
      Listeners<Job<T>> listeners = new ListenersImpl<Job<T>>(this, "listeners", childNode, node);
      return listeners;
   }

   /**
    * Removes the <code>listeners</code> element 
    * @return the current instance of <code>Job<T></code> 
    */
   public Job<T> removeListeners()
   {
      childNode.removeChildren("listeners");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Job ElementName: jsl:Decision ElementType : decision
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>decision</code> element will be created and returned.
    * Otherwise, the first existing <code>decision</code> element will be returned.
    * @return the instance defined for the element <code>decision</code> 
    */
   public Decision<Job<T>> getOrCreateDecision()
   {
      List<Node> nodeList = childNode.get("decision");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new DecisionImpl<Job<T>>(this, "decision", childNode, nodeList.get(0));
      }
      return createDecision();
   }

   /**
    * Creates a new <code>decision</code> element 
    * @return the new created instance of <code>Decision<Job<T>></code> 
    */
   public Decision<Job<T>> createDecision()
   {
      return new DecisionImpl<Job<T>>(this, "decision", childNode);
   }

   /**
    * Returns all <code>decision</code> elements
    * @return list of <code>decision</code> 
    */
   public List<Decision<Job<T>>> getAllDecision()
   {
      List<Decision<Job<T>>> list = new ArrayList<Decision<Job<T>>>();
      List<Node> nodeList = childNode.get("decision");
      for(Node node: nodeList)
      {
         Decision<Job<T>>  type = new DecisionImpl<Job<T>>(this, "decision", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>decision</code> elements 
    * @return the current instance of <code>Decision<Job<T>></code> 
    */
   public Job<T> removeAllDecision()
   {
      childNode.removeChildren("decision");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Job ElementName: jsl:Flow ElementType : flow
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>flow</code> element will be created and returned.
    * Otherwise, the first existing <code>flow</code> element will be returned.
    * @return the instance defined for the element <code>flow</code> 
    */
   public Flow<Job<T>> getOrCreateFlow()
   {
      List<Node> nodeList = childNode.get("flow");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new FlowImpl<Job<T>>(this, "flow", childNode, nodeList.get(0));
      }
      return createFlow();
   }

   /**
    * Creates a new <code>flow</code> element 
    * @return the new created instance of <code>Flow<Job<T>></code> 
    */
   public Flow<Job<T>> createFlow()
   {
      return new FlowImpl<Job<T>>(this, "flow", childNode);
   }

   /**
    * Returns all <code>flow</code> elements
    * @return list of <code>flow</code> 
    */
   public List<Flow<Job<T>>> getAllFlow()
   {
      List<Flow<Job<T>>> list = new ArrayList<Flow<Job<T>>>();
      List<Node> nodeList = childNode.get("flow");
      for(Node node: nodeList)
      {
         Flow<Job<T>>  type = new FlowImpl<Job<T>>(this, "flow", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>flow</code> elements 
    * @return the current instance of <code>Flow<Job<T>></code> 
    */
   public Job<T> removeAllFlow()
   {
      childNode.removeChildren("flow");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Job ElementName: jsl:Split ElementType : split
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>split</code> element will be created and returned.
    * Otherwise, the first existing <code>split</code> element will be returned.
    * @return the instance defined for the element <code>split</code> 
    */
   public Split<Job<T>> getOrCreateSplit()
   {
      List<Node> nodeList = childNode.get("split");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new SplitImpl<Job<T>>(this, "split", childNode, nodeList.get(0));
      }
      return createSplit();
   }

   /**
    * Creates a new <code>split</code> element 
    * @return the new created instance of <code>Split<Job<T>></code> 
    */
   public Split<Job<T>> createSplit()
   {
      return new SplitImpl<Job<T>>(this, "split", childNode);
   }

   /**
    * Returns all <code>split</code> elements
    * @return list of <code>split</code> 
    */
   public List<Split<Job<T>>> getAllSplit()
   {
      List<Split<Job<T>>> list = new ArrayList<Split<Job<T>>>();
      List<Node> nodeList = childNode.get("split");
      for(Node node: nodeList)
      {
         Split<Job<T>>  type = new SplitImpl<Job<T>>(this, "split", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>split</code> elements 
    * @return the current instance of <code>Split<Job<T>></code> 
    */
   public Job<T> removeAllSplit()
   {
      childNode.removeChildren("split");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Job ElementName: jsl:Step ElementType : step
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>step</code> element will be created and returned.
    * Otherwise, the first existing <code>step</code> element will be returned.
    * @return the instance defined for the element <code>step</code> 
    */
   public Step<Job<T>> getOrCreateStep()
   {
      List<Node> nodeList = childNode.get("step");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new StepImpl<Job<T>>(this, "step", childNode, nodeList.get(0));
      }
      return createStep();
   }

   /**
    * Creates a new <code>step</code> element 
    * @return the new created instance of <code>Step<Job<T>></code> 
    */
   public Step<Job<T>> createStep()
   {
      return new StepImpl<Job<T>>(this, "step", childNode);
   }

   /**
    * Returns all <code>step</code> elements
    * @return list of <code>step</code> 
    */
   public List<Step<Job<T>>> getAllStep()
   {
      List<Step<Job<T>>> list = new ArrayList<Step<Job<T>>>();
      List<Node> nodeList = childNode.get("step");
      for(Node node: nodeList)
      {
         Step<Job<T>>  type = new StepImpl<Job<T>>(this, "step", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>step</code> elements 
    * @return the current instance of <code>Step<Job<T>></code> 
    */
   public Job<T> removeAllStep()
   {
      childNode.removeChildren("step");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Job ElementName: xsd:string ElementType : version
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of <code>Job<T></code> 
    */
   public Job<T> version(String version)
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
    * @return the current instance of <code>Job<T></code> 
    */
   public Job<T> removeVersion()
   {
      childNode.removeAttribute("version");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Job ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>Job<T></code> 
    */
   public Job<T> id(String id)
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
    * @return the current instance of <code>Job<T></code> 
    */
   public Job<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Job ElementName: xsd:string ElementType : restartable
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>restartable</code> attribute
    * @param restartable the value for the attribute <code>restartable</code> 
    * @return the current instance of <code>Job<T></code> 
    */
   public Job<T> restartable(String restartable)
   {
      childNode.attribute("restartable", restartable);
      return this;
   }

   /**
    * Returns the <code>restartable</code> attribute
    * @return the value defined for the attribute <code>restartable</code> 
    */
      public String getRestartable()
   {
      return childNode.getAttribute("restartable");
   }

   /**
    * Removes the <code>restartable</code> attribute 
    * @return the current instance of <code>Job<T></code> 
    */
   public Job<T> removeRestartable()
   {
      childNode.removeAttribute("restartable");
      return this;
   }
}
