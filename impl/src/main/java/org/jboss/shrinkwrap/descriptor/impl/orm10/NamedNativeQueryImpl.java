package org.jboss.shrinkwrap.descriptor.impl.orm10; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.orm10.NamedNativeQuery;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.orm10.QueryHint;
import org.jboss.shrinkwrap.descriptor.impl.orm10.QueryHintImpl;

/**
 * This class implements the <code> named-native-query </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class NamedNativeQueryImpl<T> implements Child<T>, NamedNativeQuery<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public NamedNativeQueryImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public NamedNativeQueryImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: NamedNativeQuery ElementName: xsd:string ElementType : query
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>query</code> element
    * @param query the value for the element <code>query</code> 
    * @return the current instance of <code>NamedNativeQuery<T></code> 
    */
   public NamedNativeQuery<T> query(String query)
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
    * @return the current instance of <code>NamedNativeQuery<T></code> 
    */
   public NamedNativeQuery<T> removeQuery()
   {
      childNode.removeChildren("query");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: NamedNativeQuery ElementName: orm:query-hint ElementType : hint
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>hint</code> element will be created and returned.
    * Otherwise, the first existing <code>hint</code> element will be returned.
    * @return the instance defined for the element <code>hint</code> 
    */
   public QueryHint<NamedNativeQuery<T>> getOrCreateHint()
   {
      List<Node> nodeList = childNode.get("hint");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new QueryHintImpl<NamedNativeQuery<T>>(this, "hint", childNode, nodeList.get(0));
      }
      return createHint();
   }

   /**
    * Creates a new <code>hint</code> element 
    * @return the new created instance of <code>QueryHint<NamedNativeQuery<T>></code> 
    */
   public QueryHint<NamedNativeQuery<T>> createHint()
   {
      return new QueryHintImpl<NamedNativeQuery<T>>(this, "hint", childNode);
   }

   /**
    * Returns all <code>hint</code> elements
    * @return list of <code>hint</code> 
    */
   public List<QueryHint<NamedNativeQuery<T>>> getAllHint()
   {
      List<QueryHint<NamedNativeQuery<T>>> list = new ArrayList<QueryHint<NamedNativeQuery<T>>>();
      List<Node> nodeList = childNode.get("hint");
      for(Node node: nodeList)
      {
         QueryHint<NamedNativeQuery<T>>  type = new QueryHintImpl<NamedNativeQuery<T>>(this, "hint", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>hint</code> elements 
    * @return the current instance of <code>QueryHint<NamedNativeQuery<T>></code> 
    */
   public NamedNativeQuery<T> removeAllHint()
   {
      childNode.removeChildren("hint");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: NamedNativeQuery ElementName: xsd:string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>NamedNativeQuery<T></code> 
    */
   public NamedNativeQuery<T> name(String name)
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
    * @return the current instance of <code>NamedNativeQuery<T></code> 
    */
   public NamedNativeQuery<T> removeName()
   {
      childNode.removeAttribute("name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: NamedNativeQuery ElementName: xsd:string ElementType : result-class
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>result-class</code> attribute
    * @param resultClass the value for the attribute <code>result-class</code> 
    * @return the current instance of <code>NamedNativeQuery<T></code> 
    */
   public NamedNativeQuery<T> resultClass(String resultClass)
   {
      childNode.attribute("result-class", resultClass);
      return this;
   }

   /**
    * Returns the <code>result-class</code> attribute
    * @return the value defined for the attribute <code>result-class</code> 
    */
      public String getResultClass()
   {
      return childNode.getAttribute("result-class");
   }

   /**
    * Removes the <code>result-class</code> attribute 
    * @return the current instance of <code>NamedNativeQuery<T></code> 
    */
   public NamedNativeQuery<T> removeResultClass()
   {
      childNode.removeAttribute("result-class");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: NamedNativeQuery ElementName: xsd:string ElementType : result-set-mapping
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>result-set-mapping</code> attribute
    * @param resultSetMapping the value for the attribute <code>result-set-mapping</code> 
    * @return the current instance of <code>NamedNativeQuery<T></code> 
    */
   public NamedNativeQuery<T> resultSetMapping(String resultSetMapping)
   {
      childNode.attribute("result-set-mapping", resultSetMapping);
      return this;
   }

   /**
    * Returns the <code>result-set-mapping</code> attribute
    * @return the value defined for the attribute <code>result-set-mapping</code> 
    */
      public String getResultSetMapping()
   {
      return childNode.getAttribute("result-set-mapping");
   }

   /**
    * Removes the <code>result-set-mapping</code> attribute 
    * @return the current instance of <code>NamedNativeQuery<T></code> 
    */
   public NamedNativeQuery<T> removeResultSetMapping()
   {
      childNode.removeAttribute("result-set-mapping");
      return this;
   }
}
