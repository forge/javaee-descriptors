package org.jboss.shrinkwrap.descriptor.impl.orm21; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.orm21.ConstructorResult;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.orm21.ColumnResult;
import org.jboss.shrinkwrap.descriptor.impl.orm21.ColumnResultImpl;

/**
 * This class implements the <code> constructor-result </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class ConstructorResultImpl<T> implements Child<T>, ConstructorResult<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public ConstructorResultImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public ConstructorResultImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConstructorResult ElementName: orm:column-result ElementType : column
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>column</code> element will be created and returned.
    * Otherwise, the first existing <code>column</code> element will be returned.
    * @return the instance defined for the element <code>column</code> 
    */
   public ColumnResult<ConstructorResult<T>> getOrCreateColumn()
   {
      List<Node> nodeList = childNode.get("column");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ColumnResultImpl<ConstructorResult<T>>(this, "column", childNode, nodeList.get(0));
      }
      return createColumn();
   }

   /**
    * Creates a new <code>column</code> element 
    * @return the new created instance of <code>ColumnResult<ConstructorResult<T>></code> 
    */
   public ColumnResult<ConstructorResult<T>> createColumn()
   {
      return new ColumnResultImpl<ConstructorResult<T>>(this, "column", childNode);
   }

   /**
    * Returns all <code>column</code> elements
    * @return list of <code>column</code> 
    */
   public List<ColumnResult<ConstructorResult<T>>> getAllColumn()
   {
      List<ColumnResult<ConstructorResult<T>>> list = new ArrayList<ColumnResult<ConstructorResult<T>>>();
      List<Node> nodeList = childNode.get("column");
      for(Node node: nodeList)
      {
         ColumnResult<ConstructorResult<T>>  type = new ColumnResultImpl<ConstructorResult<T>>(this, "column", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>column</code> elements 
    * @return the current instance of <code>ColumnResult<ConstructorResult<T>></code> 
    */
   public ConstructorResult<T> removeAllColumn()
   {
      childNode.removeChildren("column");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConstructorResult ElementName: xsd:string ElementType : target-class
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>target-class</code> attribute
    * @param targetClass the value for the attribute <code>target-class</code> 
    * @return the current instance of <code>ConstructorResult<T></code> 
    */
   public ConstructorResult<T> targetClass(String targetClass)
   {
      childNode.attribute("target-class", targetClass);
      return this;
   }

   /**
    * Returns the <code>target-class</code> attribute
    * @return the value defined for the attribute <code>target-class</code> 
    */
      public String getTargetClass()
   {
      return childNode.getAttribute("target-class");
   }

   /**
    * Removes the <code>target-class</code> attribute 
    * @return the current instance of <code>ConstructorResult<T></code> 
    */
   public ConstructorResult<T> removeTargetClass()
   {
      childNode.removeAttribute("target-class");
      return this;
   }
}
