package org.jboss.shrinkwrap.descriptor.impl.ejbjar30; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.ContainerTransactionType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.MethodType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.TransAttributeType;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> container-transactionType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class ContainerTransactionTypeImpl<T> implements Child<T>, ContainerTransactionType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public ContainerTransactionTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public ContainerTransactionTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ContainerTransactionType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>ContainerTransactionType<T></code> 
    */
   public ContainerTransactionType<T> description(String ... values)
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
    * @return the current instance of <code>ContainerTransactionType<T></code> 
    */
   public ContainerTransactionType<T> removeAllDescription()
   {
      childNode.removeChildren("description");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ContainerTransactionType ElementName: javaee:methodType ElementType : method
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>method</code> element will be created and returned.
    * Otherwise, the first existing <code>method</code> element will be returned.
    * @return the instance defined for the element <code>method</code> 
    */
   public MethodType<ContainerTransactionType<T>> getOrCreateMethod()
   {
      List<Node> nodeList = childNode.get("method");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new MethodTypeImpl<ContainerTransactionType<T>>(this, "method", childNode, nodeList.get(0));
      }
      return createMethod();
   }

   /**
    * Creates a new <code>method</code> element 
    * @return the new created instance of <code>MethodType<ContainerTransactionType<T>></code> 
    */
   public MethodType<ContainerTransactionType<T>> createMethod()
   {
      return new MethodTypeImpl<ContainerTransactionType<T>>(this, "method", childNode);
   }

   /**
    * Returns all <code>method</code> elements
    * @return list of <code>method</code> 
    */
   public List<MethodType<ContainerTransactionType<T>>> getAllMethod()
   {
      List<MethodType<ContainerTransactionType<T>>> list = new ArrayList<MethodType<ContainerTransactionType<T>>>();
      List<Node> nodeList = childNode.get("method");
      for(Node node: nodeList)
      {
         MethodType<ContainerTransactionType<T>>  type = new MethodTypeImpl<ContainerTransactionType<T>>(this, "method", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>method</code> elements 
    * @return the current instance of <code>MethodType<ContainerTransactionType<T>></code> 
    */
   public ContainerTransactionType<T> removeAllMethod()
   {
      childNode.removeChildren("method");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ContainerTransactionType ElementName: javaee:trans-attributeType ElementType : trans-attribute
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>trans-attribute</code> element
    * @param transAttribute the value for the element <code>trans-attribute</code> 
    * @return the current instance of <code>ContainerTransactionType<T></code> 
    */
   public ContainerTransactionType<T> transAttribute(TransAttributeType transAttribute)
   {
      childNode.getOrCreate("trans-attribute").text(transAttribute);
      return this;
   }
   /**
    * Sets the <code>trans-attribute</code> element
    * @param transAttribute the value for the element <code>trans-attribute</code> 
    * @return the current instance of <code>ContainerTransactionType<T></code> 
    */
   public ContainerTransactionType<T> transAttribute(String transAttribute)
   {
      childNode.getOrCreate("trans-attribute").text(transAttribute);
      return this;
   }

   /**
    * Returns the <code>trans-attribute</code> element
    * @return the value found for the element <code>trans-attribute</code> 
    */
   public TransAttributeType getTransAttribute()
   {
      return TransAttributeType.getFromStringValue(childNode.getTextValueForPatternName("trans-attribute"));
   }

   /**
    * Returns the <code>trans-attribute</code> element
    * @return the value found for the element <code>trans-attribute</code> 
    */
   public String  getTransAttributeAsString()
   {
      return childNode.getTextValueForPatternName("trans-attribute");
   }

   /**
    * Removes the <code>trans-attribute</code> attribute 
    * @return the current instance of <code>ContainerTransactionType<T></code> 
    */
   public ContainerTransactionType<T> removeTransAttribute()
   {
      childNode.removeAttribute("trans-attribute");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ContainerTransactionType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>ContainerTransactionType<T></code> 
    */
   public ContainerTransactionType<T> id(String id)
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
    * @return the current instance of <code>ContainerTransactionType<T></code> 
    */
   public ContainerTransactionType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
