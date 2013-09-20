package org.jboss.shrinkwrap.descriptor.impl.ejbjar32; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar32.InterceptorOrderType;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> interceptor-orderType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class InterceptorOrderTypeImpl<T> implements Child<T>, InterceptorOrderType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public InterceptorOrderTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public InterceptorOrderTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: InterceptorOrderType ElementName: xsd:token ElementType : interceptor-class
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>interceptor-class</code> elements, 
    * a new <code>interceptor-class</code> element 
    * @param values list of <code>interceptor-class</code> objects 
    * @return the current instance of <code>InterceptorOrderType<T></code> 
    */
   public InterceptorOrderType<T> interceptorClass(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("interceptor-class").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>interceptor-class</code> elements
    * @return list of <code>interceptor-class</code> 
    */
public List<String> getAllInterceptorClass()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("interceptor-class");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>interceptor-class</code> element 
    * @return the current instance of <code>InterceptorOrderType<T></code> 
    */
   public InterceptorOrderType<T> removeAllInterceptorClass()
   {
      childNode.removeChildren("interceptor-class");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: InterceptorOrderType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>InterceptorOrderType<T></code> 
    */
   public InterceptorOrderType<T> id(String id)
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
    * @return the current instance of <code>InterceptorOrderType<T></code> 
    */
   public InterceptorOrderType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
