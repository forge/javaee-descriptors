package org.jboss.shrinkwrap.descriptor.impl.jobXML10; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.ExceptionClassFilter;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.Exclude;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.Include;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> ExceptionClassFilter </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class ExceptionClassFilterImpl<T> implements Child<T>, ExceptionClassFilter<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public ExceptionClassFilterImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public ExceptionClassFilterImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ExceptionClassFilter ElementName: jsl:include ElementType : include
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>include</code> element will be created and returned.
    * Otherwise, the first existing <code>include</code> element will be returned.
    * @return the instance defined for the element <code>include</code> 
    */
   public Include<ExceptionClassFilter<T>> getOrCreateInclude()
   {
      List<Node> nodeList = childNode.get("include");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new IncludeImpl<ExceptionClassFilter<T>>(this, "include", childNode, nodeList.get(0));
      }
      return createInclude();
   }

   /**
    * Creates a new <code>include</code> element 
    * @return the new created instance of <code>Include<ExceptionClassFilter<T>></code> 
    */
   public Include<ExceptionClassFilter<T>> createInclude()
   {
      return new IncludeImpl<ExceptionClassFilter<T>>(this, "include", childNode);
   }

   /**
    * Returns all <code>include</code> elements
    * @return list of <code>include</code> 
    */
   public List<Include<ExceptionClassFilter<T>>> getAllInclude()
   {
      List<Include<ExceptionClassFilter<T>>> list = new ArrayList<Include<ExceptionClassFilter<T>>>();
      List<Node> nodeList = childNode.get("include");
      for(Node node: nodeList)
      {
         Include<ExceptionClassFilter<T>>  type = new IncludeImpl<ExceptionClassFilter<T>>(this, "include", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>include</code> elements 
    * @return the current instance of <code>Include<ExceptionClassFilter<T>></code> 
    */
   public ExceptionClassFilter<T> removeAllInclude()
   {
      childNode.removeChildren("include");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ExceptionClassFilter ElementName: jsl:exclude ElementType : exclude
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>exclude</code> element will be created and returned.
    * Otherwise, the first existing <code>exclude</code> element will be returned.
    * @return the instance defined for the element <code>exclude</code> 
    */
   public Exclude<ExceptionClassFilter<T>> getOrCreateExclude()
   {
      List<Node> nodeList = childNode.get("exclude");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ExcludeImpl<ExceptionClassFilter<T>>(this, "exclude", childNode, nodeList.get(0));
      }
      return createExclude();
   }

   /**
    * Creates a new <code>exclude</code> element 
    * @return the new created instance of <code>Exclude<ExceptionClassFilter<T>></code> 
    */
   public Exclude<ExceptionClassFilter<T>> createExclude()
   {
      return new ExcludeImpl<ExceptionClassFilter<T>>(this, "exclude", childNode);
   }

   /**
    * Returns all <code>exclude</code> elements
    * @return list of <code>exclude</code> 
    */
   public List<Exclude<ExceptionClassFilter<T>>> getAllExclude()
   {
      List<Exclude<ExceptionClassFilter<T>>> list = new ArrayList<Exclude<ExceptionClassFilter<T>>>();
      List<Node> nodeList = childNode.get("exclude");
      for(Node node: nodeList)
      {
         Exclude<ExceptionClassFilter<T>>  type = new ExcludeImpl<ExceptionClassFilter<T>>(this, "exclude", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>exclude</code> elements 
    * @return the current instance of <code>Exclude<ExceptionClassFilter<T>></code> 
    */
   public ExceptionClassFilter<T> removeAllExclude()
   {
      childNode.removeChildren("exclude");
      return this;
   }
}
