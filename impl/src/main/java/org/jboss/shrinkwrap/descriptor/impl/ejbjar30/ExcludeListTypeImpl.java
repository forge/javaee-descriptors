package org.jboss.shrinkwrap.descriptor.impl.ejbjar30; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.ExcludeListType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.MethodType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar30.MethodTypeImpl;

/**
 * This class implements the <code> exclude-listType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class ExcludeListTypeImpl<T> implements Child<T>, ExcludeListType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public ExcludeListTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public ExcludeListTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ExcludeListType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>ExcludeListType<T></code> 
    */
   public ExcludeListType<T> description(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("description").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
public List<String> getAllDescription()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("description");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>ExcludeListType<T></code> 
    */
   public ExcludeListType<T> removeAllDescription()
   {
      childNode.removeChildren("description");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ExcludeListType ElementName: javaee:methodType ElementType : method
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>method</code> element will be created and returned.
    * Otherwise, the first existing <code>method</code> element will be returned.
    * @return the instance defined for the element <code>method</code> 
    */
   public MethodType<ExcludeListType<T>> getOrCreateMethod()
   {
      List<Node> nodeList = childNode.get("method");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new MethodTypeImpl<ExcludeListType<T>>(this, "method", childNode, nodeList.get(0));
      }
      return createMethod();
   }

   /**
    * Creates a new <code>method</code> element 
    * @return the new created instance of <code>MethodType<ExcludeListType<T>></code> 
    */
   public MethodType<ExcludeListType<T>> createMethod()
   {
      return new MethodTypeImpl<ExcludeListType<T>>(this, "method", childNode);
   }

   /**
    * Returns all <code>method</code> elements
    * @return list of <code>method</code> 
    */
   public List<MethodType<ExcludeListType<T>>> getAllMethod()
   {
      List<MethodType<ExcludeListType<T>>> list = new ArrayList<MethodType<ExcludeListType<T>>>();
      List<Node> nodeList = childNode.get("method");
      for(Node node: nodeList)
      {
         MethodType<ExcludeListType<T>>  type = new MethodTypeImpl<ExcludeListType<T>>(this, "method", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>method</code> elements 
    * @return the current instance of <code>MethodType<ExcludeListType<T>></code> 
    */
   public ExcludeListType<T> removeAllMethod()
   {
      childNode.removeChildren("method");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ExcludeListType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>ExcludeListType<T></code> 
    */
   public ExcludeListType<T> id(String id)
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
    * @return the current instance of <code>ExcludeListType<T></code> 
    */
   public ExcludeListType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
