package org.jboss.shrinkwrap.descriptor.impl.orm20; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.orm20.NamedQuery;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.orm20.LockModeType;
import org.jboss.shrinkwrap.descriptor.api.orm20.QueryHint;
import org.jboss.shrinkwrap.descriptor.impl.orm20.QueryHintImpl;

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
   // ClassName: NamedQuery ElementName: xsd:string ElementType : description
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>description</code> element
    * @param description the value for the element <code>description</code> 
    * @return the current instance of <code>NamedQuery<T></code> 
    */
   public NamedQuery<T> description(String description)
   {
      childNode.getOrCreate("description").text(description);
      return this;
   }

   /**
    * Returns the <code>description</code> element
    * @return the node defined for the element <code>description</code> 
    */
   public String getDescription()
   {
      return childNode.getTextValueForPatternName("description");
   }

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>NamedQuery<T></code> 
    */
   public NamedQuery<T> removeDescription()
   {
      childNode.removeChildren("description");
      return this;
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
   // ClassName: NamedQuery ElementName: orm:lock-mode-type ElementType : lock-mode
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>lock-mode</code> element
    * @param lockMode the value for the element <code>lock-mode</code> 
    * @return the current instance of <code>NamedQuery<T></code> 
    */
   public NamedQuery<T> lockMode(LockModeType lockMode)
   {
      childNode.getOrCreate("lock-mode").text(lockMode);
      return this;
   }
   /**
    * Sets the <code>lock-mode</code> element
    * @param lockMode the value for the element <code>lock-mode</code> 
    * @return the current instance of <code>NamedQuery<T></code> 
    */
   public NamedQuery<T> lockMode(String lockMode)
   {
      childNode.getOrCreate("lock-mode").text(lockMode);
      return this;
   }

   /**
    * Returns the <code>lock-mode</code> element
    * @return the value found for the element <code>lock-mode</code> 
    */
   public LockModeType getLockMode()
   {
      return LockModeType.getFromStringValue(childNode.getTextValueForPatternName("lock-mode"));
   }

   /**
    * Returns the <code>lock-mode</code> element
    * @return the value found for the element <code>lock-mode</code> 
    */
   public String  getLockModeAsString()
   {
      return childNode.getTextValueForPatternName("lock-mode");
   }

   /**
    * Removes the <code>lock-mode</code> attribute 
    * @return the current instance of <code>NamedQuery<T></code> 
    */
   public NamedQuery<T> removeLockMode()
   {
      childNode.removeAttribute("lock-mode");
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
