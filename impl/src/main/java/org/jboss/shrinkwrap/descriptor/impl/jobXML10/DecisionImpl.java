package org.jboss.shrinkwrap.descriptor.impl.jobXML10; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.Decision;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.End;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.Fail;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.Next;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.Properties;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.Stop;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> Decision </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class DecisionImpl<T> implements Child<T>, Decision<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public DecisionImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public DecisionImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Decision ElementName: jsl:End ElementType : end
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>end</code> element will be created and returned.
    * Otherwise, the first existing <code>end</code> element will be returned.
    * @return the instance defined for the element <code>end</code> 
    */
   public End<Decision<T>> getOrCreateEnd()
   {
      List<Node> nodeList = childNode.get("end");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new EndImpl<Decision<T>>(this, "end", childNode, nodeList.get(0));
      }
      return createEnd();
   }

   /**
    * Creates a new <code>end</code> element 
    * @return the new created instance of <code>End<Decision<T>></code> 
    */
   public End<Decision<T>> createEnd()
   {
      return new EndImpl<Decision<T>>(this, "end", childNode);
   }

   /**
    * Returns all <code>end</code> elements
    * @return list of <code>end</code> 
    */
   public List<End<Decision<T>>> getAllEnd()
   {
      List<End<Decision<T>>> list = new ArrayList<End<Decision<T>>>();
      List<Node> nodeList = childNode.get("end");
      for(Node node: nodeList)
      {
         End<Decision<T>>  type = new EndImpl<Decision<T>>(this, "end", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>end</code> elements 
    * @return the current instance of <code>End<Decision<T>></code> 
    */
   public Decision<T> removeAllEnd()
   {
      childNode.removeChildren("end");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Decision ElementName: jsl:Fail ElementType : fail
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>fail</code> element will be created and returned.
    * Otherwise, the first existing <code>fail</code> element will be returned.
    * @return the instance defined for the element <code>fail</code> 
    */
   public Fail<Decision<T>> getOrCreateFail()
   {
      List<Node> nodeList = childNode.get("fail");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new FailImpl<Decision<T>>(this, "fail", childNode, nodeList.get(0));
      }
      return createFail();
   }

   /**
    * Creates a new <code>fail</code> element 
    * @return the new created instance of <code>Fail<Decision<T>></code> 
    */
   public Fail<Decision<T>> createFail()
   {
      return new FailImpl<Decision<T>>(this, "fail", childNode);
   }

   /**
    * Returns all <code>fail</code> elements
    * @return list of <code>fail</code> 
    */
   public List<Fail<Decision<T>>> getAllFail()
   {
      List<Fail<Decision<T>>> list = new ArrayList<Fail<Decision<T>>>();
      List<Node> nodeList = childNode.get("fail");
      for(Node node: nodeList)
      {
         Fail<Decision<T>>  type = new FailImpl<Decision<T>>(this, "fail", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>fail</code> elements 
    * @return the current instance of <code>Fail<Decision<T>></code> 
    */
   public Decision<T> removeAllFail()
   {
      childNode.removeChildren("fail");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Decision ElementName: jsl:Next ElementType : next
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>next</code> element will be created and returned.
    * Otherwise, the first existing <code>next</code> element will be returned.
    * @return the instance defined for the element <code>next</code> 
    */
   public Next<Decision<T>> getOrCreateNext()
   {
      List<Node> nodeList = childNode.get("next");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new NextImpl<Decision<T>>(this, "next", childNode, nodeList.get(0));
      }
      return createNext();
   }

   /**
    * Creates a new <code>next</code> element 
    * @return the new created instance of <code>Next<Decision<T>></code> 
    */
   public Next<Decision<T>> createNext()
   {
      return new NextImpl<Decision<T>>(this, "next", childNode);
   }

   /**
    * Returns all <code>next</code> elements
    * @return list of <code>next</code> 
    */
   public List<Next<Decision<T>>> getAllNext()
   {
      List<Next<Decision<T>>> list = new ArrayList<Next<Decision<T>>>();
      List<Node> nodeList = childNode.get("next");
      for(Node node: nodeList)
      {
         Next<Decision<T>>  type = new NextImpl<Decision<T>>(this, "next", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>next</code> elements 
    * @return the current instance of <code>Next<Decision<T>></code> 
    */
   public Decision<T> removeAllNext()
   {
      childNode.removeChildren("next");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Decision ElementName: jsl:Stop ElementType : stop
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>stop</code> element will be created and returned.
    * Otherwise, the first existing <code>stop</code> element will be returned.
    * @return the instance defined for the element <code>stop</code> 
    */
   public Stop<Decision<T>> getOrCreateStop()
   {
      List<Node> nodeList = childNode.get("stop");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new StopImpl<Decision<T>>(this, "stop", childNode, nodeList.get(0));
      }
      return createStop();
   }

   /**
    * Creates a new <code>stop</code> element 
    * @return the new created instance of <code>Stop<Decision<T>></code> 
    */
   public Stop<Decision<T>> createStop()
   {
      return new StopImpl<Decision<T>>(this, "stop", childNode);
   }

   /**
    * Returns all <code>stop</code> elements
    * @return list of <code>stop</code> 
    */
   public List<Stop<Decision<T>>> getAllStop()
   {
      List<Stop<Decision<T>>> list = new ArrayList<Stop<Decision<T>>>();
      List<Node> nodeList = childNode.get("stop");
      for(Node node: nodeList)
      {
         Stop<Decision<T>>  type = new StopImpl<Decision<T>>(this, "stop", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>stop</code> elements 
    * @return the current instance of <code>Stop<Decision<T>></code> 
    */
   public Decision<T> removeAllStop()
   {
      childNode.removeChildren("stop");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Decision ElementName: jsl:Properties ElementType : properties
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>properties</code> element with the given value will be created.
    * Otherwise, the existing <code>properties</code> element will be returned.
    * @return  a new or existing instance of <code>Properties<Decision<T>></code> 
    */
   public Properties<Decision<T>> getOrCreateProperties()
   {
      Node node = childNode.getOrCreate("properties");
      Properties<Decision<T>> properties = new PropertiesImpl<Decision<T>>(this, "properties", childNode, node);
      return properties;
   }

   /**
    * Removes the <code>properties</code> element 
    * @return the current instance of <code>Decision<T></code> 
    */
   public Decision<T> removeProperties()
   {
      childNode.removeChildren("properties");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Decision ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>Decision<T></code> 
    */
   public Decision<T> id(String id)
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
    * @return the current instance of <code>Decision<T></code> 
    */
   public Decision<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Decision ElementName: xsd:string ElementType : ref
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>ref</code> attribute
    * @param ref the value for the attribute <code>ref</code> 
    * @return the current instance of <code>Decision<T></code> 
    */
   public Decision<T> ref(String ref)
   {
      childNode.attribute("ref", ref);
      return this;
   }

   /**
    * Returns the <code>ref</code> attribute
    * @return the value defined for the attribute <code>ref</code> 
    */
      public String getRef()
   {
      return childNode.getAttribute("ref");
   }

   /**
    * Removes the <code>ref</code> attribute 
    * @return the current instance of <code>Decision<T></code> 
    */
   public Decision<T> removeRef()
   {
      childNode.removeAttribute("ref");
      return this;
   }
}
