package org.jboss.shrinkwrap.descriptor.impl.orm10; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.orm10.NamedQuery;
import org.jboss.shrinkwrap.descriptor.api.orm10.QueryHint;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> named-query </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class NamedQueryImpl<T> implements Child<T>, NamedQuery<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public NamedQueryImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public NamedQueryImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: NamedQuery ElementName: xsd:string ElementType : query
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>query</code> element
    * @param query the value for the element <code>query</code> 
    * @return the current instance of <code>NamedQuery<T></code> 
    */
   public NamedQuery<T> query(String query)
   {
      childNode.getOrCreate("query").text(query);
      return this;
   }

   /**
    * Returns the <code>query</code> element
    * @return the node defined for the element <code>query</code> 
    */
   public String getQuery()
   {
      return childNode.getTextValueForPatternName("query");
   }

   /**
    * Removes the <code>query</code> element 
    * @return the current instance of <code>NamedQuery<T></code> 
    */
   public NamedQuery<T> removeQuery()
   {
      childNode.removeChildren("query");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: NamedQuery ElementName: orm:query-hint ElementType : hint
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>hint</code> element will be created and returned.
    * Otherwise, the first existing <code>hint</code> element will be returned.
    * @return the instance defined for the element <code>hint</code> 
    */
   public QueryHint<NamedQuery<T>> getOrCreateHint()
   {
      List<Node> nodeList = childNode.get("hint");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new QueryHintImpl<NamedQuery<T>>(this, "hint", childNode, nodeList.get(0));
      }
      return createHint();
   }

   /**
    * Creates a new <code>hint</code> element 
    * @return the new created instance of <code>QueryHint<NamedQuery<T>></code> 
    */
   public QueryHint<NamedQuery<T>> createHint()
   {
      return new QueryHintImpl<NamedQuery<T>>(this, "hint", childNode);
   }

   /**
    * Returns all <code>hint</code> elements
    * @return list of <code>hint</code> 
    */
   public List<QueryHint<NamedQuery<T>>> getAllHint()
   {
      List<QueryHint<NamedQuery<T>>> list = new ArrayList<QueryHint<NamedQuery<T>>>();
      List<Node> nodeList = childNode.get("hint");
      for(Node node: nodeList)
      {
         QueryHint<NamedQuery<T>>  type = new QueryHintImpl<NamedQuery<T>>(this, "hint", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>hint</code> elements 
    * @return the current instance of <code>QueryHint<NamedQuery<T>></code> 
    */
   public NamedQuery<T> removeAllHint()
   {
      childNode.removeChildren("hint");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: NamedQuery ElementName: xsd:string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>NamedQuery<T></code> 
    */
   public NamedQuery<T> name(String name)
   {
      childNode.attribute("name", name);
      return this;
   }

   /**
    * Returns the <code>name</code> attribute
    * @return the value defined for the attribute <code>name</code> 
    */
      public String getName()
   {
      return childNode.getAttribute("name");
   }

   /**
    * Removes the <code>name</code> attribute 
    * @return the current instance of <code>NamedQuery<T></code> 
    */
   public NamedQuery<T> removeName()
   {
      childNode.removeAttribute("name");
      return this;
   }
}
