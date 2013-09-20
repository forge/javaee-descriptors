package org.jboss.shrinkwrap.descriptor.impl.jobXML10; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.Flow;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.Decision;
import org.jboss.shrinkwrap.descriptor.impl.jobXML10.DecisionImpl;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.Flow;
import org.jboss.shrinkwrap.descriptor.impl.jobXML10.FlowImpl;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.Split;
import org.jboss.shrinkwrap.descriptor.impl.jobXML10.SplitImpl;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.Step;
import org.jboss.shrinkwrap.descriptor.impl.jobXML10.StepImpl;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.End;
import org.jboss.shrinkwrap.descriptor.impl.jobXML10.EndImpl;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.Fail;
import org.jboss.shrinkwrap.descriptor.impl.jobXML10.FailImpl;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.Next;
import org.jboss.shrinkwrap.descriptor.impl.jobXML10.NextImpl;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.Stop;
import org.jboss.shrinkwrap.descriptor.impl.jobXML10.StopImpl;

/**
 * This class implements the <code> Flow </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class FlowImpl<T> implements Child<T>, Flow<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public FlowImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public FlowImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Flow ElementName: jsl:End ElementType : end
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>end</code> element will be created and returned.
    * Otherwise, the first existing <code>end</code> element will be returned.
    * @return the instance defined for the element <code>end</code> 
    */
   public End<Flow<T>> getOrCreateEnd()
   {
      List<Node> nodeList = childNode.get("end");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new EndImpl<Flow<T>>(this, "end", childNode, nodeList.get(0));
      }
      return createEnd();
   }

   /**
    * Creates a new <code>end</code> element 
    * @return the new created instance of <code>End<Flow<T>></code> 
    */
   public End<Flow<T>> createEnd()
   {
      return new EndImpl<Flow<T>>(this, "end", childNode);
   }

   /**
    * Returns all <code>end</code> elements
    * @return list of <code>end</code> 
    */
   public List<End<Flow<T>>> getAllEnd()
   {
      List<End<Flow<T>>> list = new ArrayList<End<Flow<T>>>();
      List<Node> nodeList = childNode.get("end");
      for(Node node: nodeList)
      {
         End<Flow<T>>  type = new EndImpl<Flow<T>>(this, "end", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>end</code> elements 
    * @return the current instance of <code>End<Flow<T>></code> 
    */
   public Flow<T> removeAllEnd()
   {
      childNode.removeChildren("end");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Flow ElementName: jsl:Fail ElementType : fail
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>fail</code> element will be created and returned.
    * Otherwise, the first existing <code>fail</code> element will be returned.
    * @return the instance defined for the element <code>fail</code> 
    */
   public Fail<Flow<T>> getOrCreateFail()
   {
      List<Node> nodeList = childNode.get("fail");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new FailImpl<Flow<T>>(this, "fail", childNode, nodeList.get(0));
      }
      return createFail();
   }

   /**
    * Creates a new <code>fail</code> element 
    * @return the new created instance of <code>Fail<Flow<T>></code> 
    */
   public Fail<Flow<T>> createFail()
   {
      return new FailImpl<Flow<T>>(this, "fail", childNode);
   }

   /**
    * Returns all <code>fail</code> elements
    * @return list of <code>fail</code> 
    */
   public List<Fail<Flow<T>>> getAllFail()
   {
      List<Fail<Flow<T>>> list = new ArrayList<Fail<Flow<T>>>();
      List<Node> nodeList = childNode.get("fail");
      for(Node node: nodeList)
      {
         Fail<Flow<T>>  type = new FailImpl<Flow<T>>(this, "fail", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>fail</code> elements 
    * @return the current instance of <code>Fail<Flow<T>></code> 
    */
   public Flow<T> removeAllFail()
   {
      childNode.removeChildren("fail");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Flow ElementName: jsl:Next ElementType : next
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>next</code> element will be created and returned.
    * Otherwise, the first existing <code>next</code> element will be returned.
    * @return the instance defined for the element <code>next</code> 
    */
   public Next<Flow<T>> getOrCreateNext()
   {
      List<Node> nodeList = childNode.get("next");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new NextImpl<Flow<T>>(this, "next", childNode, nodeList.get(0));
      }
      return createNext();
   }

   /**
    * Creates a new <code>next</code> element 
    * @return the new created instance of <code>Next<Flow<T>></code> 
    */
   public Next<Flow<T>> createNext()
   {
      return new NextImpl<Flow<T>>(this, "next", childNode);
   }

   /**
    * Returns all <code>next</code> elements
    * @return list of <code>next</code> 
    */
   public List<Next<Flow<T>>> getAllNext()
   {
      List<Next<Flow<T>>> list = new ArrayList<Next<Flow<T>>>();
      List<Node> nodeList = childNode.get("next");
      for(Node node: nodeList)
      {
         Next<Flow<T>>  type = new NextImpl<Flow<T>>(this, "next", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>next</code> elements 
    * @return the current instance of <code>Next<Flow<T>></code> 
    */
   public Flow<T> removeAllNext()
   {
      childNode.removeChildren("next");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Flow ElementName: jsl:Stop ElementType : stop
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>stop</code> element will be created and returned.
    * Otherwise, the first existing <code>stop</code> element will be returned.
    * @return the instance defined for the element <code>stop</code> 
    */
   public Stop<Flow<T>> getOrCreateStop()
   {
      List<Node> nodeList = childNode.get("stop");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new StopImpl<Flow<T>>(this, "stop", childNode, nodeList.get(0));
      }
      return createStop();
   }

   /**
    * Creates a new <code>stop</code> element 
    * @return the new created instance of <code>Stop<Flow<T>></code> 
    */
   public Stop<Flow<T>> createStop()
   {
      return new StopImpl<Flow<T>>(this, "stop", childNode);
   }

   /**
    * Returns all <code>stop</code> elements
    * @return list of <code>stop</code> 
    */
   public List<Stop<Flow<T>>> getAllStop()
   {
      List<Stop<Flow<T>>> list = new ArrayList<Stop<Flow<T>>>();
      List<Node> nodeList = childNode.get("stop");
      for(Node node: nodeList)
      {
         Stop<Flow<T>>  type = new StopImpl<Flow<T>>(this, "stop", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>stop</code> elements 
    * @return the current instance of <code>Stop<Flow<T>></code> 
    */
   public Flow<T> removeAllStop()
   {
      childNode.removeChildren("stop");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Flow ElementName: jsl:Decision ElementType : decision
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>decision</code> element will be created and returned.
    * Otherwise, the first existing <code>decision</code> element will be returned.
    * @return the instance defined for the element <code>decision</code> 
    */
   public Decision<Flow<T>> getOrCreateDecision()
   {
      List<Node> nodeList = childNode.get("decision");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new DecisionImpl<Flow<T>>(this, "decision", childNode, nodeList.get(0));
      }
      return createDecision();
   }

   /**
    * Creates a new <code>decision</code> element 
    * @return the new created instance of <code>Decision<Flow<T>></code> 
    */
   public Decision<Flow<T>> createDecision()
   {
      return new DecisionImpl<Flow<T>>(this, "decision", childNode);
   }

   /**
    * Returns all <code>decision</code> elements
    * @return list of <code>decision</code> 
    */
   public List<Decision<Flow<T>>> getAllDecision()
   {
      List<Decision<Flow<T>>> list = new ArrayList<Decision<Flow<T>>>();
      List<Node> nodeList = childNode.get("decision");
      for(Node node: nodeList)
      {
         Decision<Flow<T>>  type = new DecisionImpl<Flow<T>>(this, "decision", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>decision</code> elements 
    * @return the current instance of <code>Decision<Flow<T>></code> 
    */
   public Flow<T> removeAllDecision()
   {
      childNode.removeChildren("decision");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Flow ElementName: jsl:Flow ElementType : flow
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>flow</code> element will be created and returned.
    * Otherwise, the first existing <code>flow</code> element will be returned.
    * @return the instance defined for the element <code>flow</code> 
    */
   public Flow<Flow<T>> getOrCreateFlow()
   {
      List<Node> nodeList = childNode.get("flow");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new FlowImpl<Flow<T>>(this, "flow", childNode, nodeList.get(0));
      }
      return createFlow();
   }

   /**
    * Creates a new <code>flow</code> element 
    * @return the new created instance of <code>Flow<Flow<T>></code> 
    */
   public Flow<Flow<T>> createFlow()
   {
      return new FlowImpl<Flow<T>>(this, "flow", childNode);
   }

   /**
    * Returns all <code>flow</code> elements
    * @return list of <code>flow</code> 
    */
   public List<Flow<Flow<T>>> getAllFlow()
   {
      List<Flow<Flow<T>>> list = new ArrayList<Flow<Flow<T>>>();
      List<Node> nodeList = childNode.get("flow");
      for(Node node: nodeList)
      {
         Flow<Flow<T>>  type = new FlowImpl<Flow<T>>(this, "flow", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>flow</code> elements 
    * @return the current instance of <code>Flow<Flow<T>></code> 
    */
   public Flow<T> removeAllFlow()
   {
      childNode.removeChildren("flow");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Flow ElementName: jsl:Split ElementType : split
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>split</code> element will be created and returned.
    * Otherwise, the first existing <code>split</code> element will be returned.
    * @return the instance defined for the element <code>split</code> 
    */
   public Split<Flow<T>> getOrCreateSplit()
   {
      List<Node> nodeList = childNode.get("split");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new SplitImpl<Flow<T>>(this, "split", childNode, nodeList.get(0));
      }
      return createSplit();
   }

   /**
    * Creates a new <code>split</code> element 
    * @return the new created instance of <code>Split<Flow<T>></code> 
    */
   public Split<Flow<T>> createSplit()
   {
      return new SplitImpl<Flow<T>>(this, "split", childNode);
   }

   /**
    * Returns all <code>split</code> elements
    * @return list of <code>split</code> 
    */
   public List<Split<Flow<T>>> getAllSplit()
   {
      List<Split<Flow<T>>> list = new ArrayList<Split<Flow<T>>>();
      List<Node> nodeList = childNode.get("split");
      for(Node node: nodeList)
      {
         Split<Flow<T>>  type = new SplitImpl<Flow<T>>(this, "split", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>split</code> elements 
    * @return the current instance of <code>Split<Flow<T>></code> 
    */
   public Flow<T> removeAllSplit()
   {
      childNode.removeChildren("split");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Flow ElementName: jsl:Step ElementType : step
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>step</code> element will be created and returned.
    * Otherwise, the first existing <code>step</code> element will be returned.
    * @return the instance defined for the element <code>step</code> 
    */
   public Step<Flow<T>> getOrCreateStep()
   {
      List<Node> nodeList = childNode.get("step");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new StepImpl<Flow<T>>(this, "step", childNode, nodeList.get(0));
      }
      return createStep();
   }

   /**
    * Creates a new <code>step</code> element 
    * @return the new created instance of <code>Step<Flow<T>></code> 
    */
   public Step<Flow<T>> createStep()
   {
      return new StepImpl<Flow<T>>(this, "step", childNode);
   }

   /**
    * Returns all <code>step</code> elements
    * @return list of <code>step</code> 
    */
   public List<Step<Flow<T>>> getAllStep()
   {
      List<Step<Flow<T>>> list = new ArrayList<Step<Flow<T>>>();
      List<Node> nodeList = childNode.get("step");
      for(Node node: nodeList)
      {
         Step<Flow<T>>  type = new StepImpl<Flow<T>>(this, "step", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>step</code> elements 
    * @return the current instance of <code>Step<Flow<T>></code> 
    */
   public Flow<T> removeAllStep()
   {
      childNode.removeChildren("step");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Flow ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>Flow<T></code> 
    */
   public Flow<T> id(String id)
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
    * @return the current instance of <code>Flow<T></code> 
    */
   public Flow<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Flow ElementName: xsd:string ElementType : next
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>next</code> attribute
    * @param next the value for the attribute <code>next</code> 
    * @return the current instance of <code>Flow<T></code> 
    */
   public Flow<T> next(String next)
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
    * @return the current instance of <code>Flow<T></code> 
    */
   public Flow<T> removeNext()
   {
      childNode.removeAttribute("next");
      return this;
   }
}
