package org.jboss.shrinkwrap.descriptor.impl.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.NamedMethodType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.MethodParamsType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar31.MethodParamsTypeImpl;

/**
 * This class implements the <code> named-methodType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class NamedMethodTypeImpl<T> implements Child<T>, NamedMethodType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public NamedMethodTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public NamedMethodTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: NamedMethodType ElementName: xsd:token ElementType : method-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>method-name</code> element
    * @param methodName the value for the element <code>method-name</code> 
    * @return the current instance of <code>NamedMethodType<T></code> 
    */
   public NamedMethodType<T> methodName(String methodName)
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
    * @return the current instance of <code>NamedMethodType<T></code> 
    */
   public NamedMethodType<T> removeMethodName()
   {
      childNode.removeChildren("method-name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: NamedMethodType ElementName: javaee:method-paramsType ElementType : method-params
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>method-params</code> element with the given value will be created.
    * Otherwise, the existing <code>method-params</code> element will be returned.
    * @return  a new or existing instance of <code>MethodParamsType<NamedMethodType<T>></code> 
    */
   public MethodParamsType<NamedMethodType<T>> getOrCreateMethodParams()
   {
      Node node = childNode.getOrCreate("method-params");
      MethodParamsType<NamedMethodType<T>> methodParams = new MethodParamsTypeImpl<NamedMethodType<T>>(this, "method-params", childNode, node);
      return methodParams;
   }

   /**
    * Removes the <code>method-params</code> element 
    * @return the current instance of <code>NamedMethodType<T></code> 
    */
   public NamedMethodType<T> removeMethodParams()
   {
      childNode.removeChildren("method-params");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: NamedMethodType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>NamedMethodType<T></code> 
    */
   public NamedMethodType<T> id(String id)
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
    * @return the current instance of <code>NamedMethodType<T></code> 
    */
   public NamedMethodType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
