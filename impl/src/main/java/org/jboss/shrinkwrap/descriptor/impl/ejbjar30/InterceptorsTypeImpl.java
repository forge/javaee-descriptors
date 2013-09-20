package org.jboss.shrinkwrap.descriptor.impl.ejbjar30; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.InterceptorType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.InterceptorsType;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> interceptorsType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class InterceptorsTypeImpl<T> implements Child<T>, InterceptorsType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public InterceptorsTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public InterceptorsTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: InterceptorsType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>InterceptorsType<T></code> 
    */
   public InterceptorsType<T> description(String ... values)
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
    * @return the current instance of <code>InterceptorsType<T></code> 
    */
   public InterceptorsType<T> removeAllDescription()
   {
      childNode.removeChildren("description");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: InterceptorsType ElementName: javaee:interceptorType ElementType : interceptor
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>interceptor</code> element will be created and returned.
    * Otherwise, the first existing <code>interceptor</code> element will be returned.
    * @return the instance defined for the element <code>interceptor</code> 
    */
   public InterceptorType<InterceptorsType<T>> getOrCreateInterceptor()
   {
      List<Node> nodeList = childNode.get("interceptor");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new InterceptorTypeImpl<InterceptorsType<T>>(this, "interceptor", childNode, nodeList.get(0));
      }
      return createInterceptor();
   }

   /**
    * Creates a new <code>interceptor</code> element 
    * @return the new created instance of <code>InterceptorType<InterceptorsType<T>></code> 
    */
   public InterceptorType<InterceptorsType<T>> createInterceptor()
   {
      return new InterceptorTypeImpl<InterceptorsType<T>>(this, "interceptor", childNode);
   }

   /**
    * Returns all <code>interceptor</code> elements
    * @return list of <code>interceptor</code> 
    */
   public List<InterceptorType<InterceptorsType<T>>> getAllInterceptor()
   {
      List<InterceptorType<InterceptorsType<T>>> list = new ArrayList<InterceptorType<InterceptorsType<T>>>();
      List<Node> nodeList = childNode.get("interceptor");
      for(Node node: nodeList)
      {
         InterceptorType<InterceptorsType<T>>  type = new InterceptorTypeImpl<InterceptorsType<T>>(this, "interceptor", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>interceptor</code> elements 
    * @return the current instance of <code>InterceptorType<InterceptorsType<T>></code> 
    */
   public InterceptorsType<T> removeAllInterceptor()
   {
      childNode.removeChildren("interceptor");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: InterceptorsType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>InterceptorsType<T></code> 
    */
   public InterceptorsType<T> id(String id)
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
    * @return the current instance of <code>InterceptorsType<T></code> 
    */
   public InterceptorsType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
