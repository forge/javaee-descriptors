package org.jboss.shrinkwrap.descriptor.impl.ejbjar30; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.MethodParamsType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;

/**
 * This class implements the <code> method-paramsType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class MethodParamsTypeImpl<T> implements Child<T>, MethodParamsType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public MethodParamsTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public MethodParamsTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MethodParamsType ElementName: xsd:token ElementType : method-param
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>method-param</code> elements, 
    * a new <code>method-param</code> element 
    * @param values list of <code>method-param</code> objects 
    * @return the current instance of <code>MethodParamsType<T></code> 
    */
   public MethodParamsType<T> methodParam(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("method-param").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>method-param</code> elements
    * @return list of <code>method-param</code> 
    */
public List<String> getAllMethodParam()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("method-param");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>method-param</code> element 
    * @return the current instance of <code>MethodParamsType<T></code> 
    */
   public MethodParamsType<T> removeAllMethodParam()
   {
      childNode.removeChildren("method-param");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MethodParamsType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>MethodParamsType<T></code> 
    */
   public MethodParamsType<T> id(String id)
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
    * @return the current instance of <code>MethodParamsType<T></code> 
    */
   public MethodParamsType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
