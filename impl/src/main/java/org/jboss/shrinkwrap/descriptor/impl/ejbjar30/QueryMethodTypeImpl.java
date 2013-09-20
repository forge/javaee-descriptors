package org.jboss.shrinkwrap.descriptor.impl.ejbjar30; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.MethodParamsType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.QueryMethodType;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> query-methodType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class QueryMethodTypeImpl<T> implements Child<T>, QueryMethodType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public QueryMethodTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public QueryMethodTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: QueryMethodType ElementName: javaee:string ElementType : method-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>method-name</code> element
    * @param methodName the value for the element <code>method-name</code> 
    * @return the current instance of <code>QueryMethodType<T></code> 
    */
   public QueryMethodType<T> methodName(String methodName)
   {
      childNode.getOrCreate("method-name").text(methodName);
      return this;
   }

   /**
    * Returns the <code>method-name</code> element
    * @return the node defined for the element <code>method-name</code> 
    */
   public String getMethodName()
   {
      return childNode.getTextValueForPatternName("method-name");
   }

   /**
    * Removes the <code>method-name</code> element 
    * @return the current instance of <code>QueryMethodType<T></code> 
    */
   public QueryMethodType<T> removeMethodName()
   {
      childNode.removeChildren("method-name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: QueryMethodType ElementName: javaee:method-paramsType ElementType : method-params
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>method-params</code> element with the given value will be created.
    * Otherwise, the existing <code>method-params</code> element will be returned.
    * @return  a new or existing instance of <code>MethodParamsType<QueryMethodType<T>></code> 
    */
   public MethodParamsType<QueryMethodType<T>> getOrCreateMethodParams()
   {
      Node node = childNode.getOrCreate("method-params");
      MethodParamsType<QueryMethodType<T>> methodParams = new MethodParamsTypeImpl<QueryMethodType<T>>(this, "method-params", childNode, node);
      return methodParams;
   }

   /**
    * Removes the <code>method-params</code> element 
    * @return the current instance of <code>QueryMethodType<T></code> 
    */
   public QueryMethodType<T> removeMethodParams()
   {
      childNode.removeChildren("method-params");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: QueryMethodType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>QueryMethodType<T></code> 
    */
   public QueryMethodType<T> id(String id)
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
    * @return the current instance of <code>QueryMethodType<T></code> 
    */
   public QueryMethodType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
