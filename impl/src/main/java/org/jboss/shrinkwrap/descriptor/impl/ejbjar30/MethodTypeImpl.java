package org.jboss.shrinkwrap.descriptor.impl.ejbjar30; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.MethodType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.MethodIntfType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.MethodParamsType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar30.MethodParamsTypeImpl;

/**
 * This class implements the <code> methodType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class MethodTypeImpl<T> implements Child<T>, MethodType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public MethodTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public MethodTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MethodType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>MethodType<T></code> 
    */
   public MethodType<T> description(String ... values)
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
    * @return the current instance of <code>MethodType<T></code> 
    */
   public MethodType<T> removeAllDescription()
   {
      childNode.removeChildren("description");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MethodType ElementName: javaee:xsdNMTOKENType ElementType : ejb-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>ejb-name</code> element
    * @param ejbName the value for the element <code>ejb-name</code> 
    * @return the current instance of <code>MethodType<T></code> 
    */
   public MethodType<T> ejbName(String ejbName)
   {
      childNode.getOrCreate("ejb-name").text(ejbName);
      return this;
   }

   /**
    * Returns the <code>ejb-name</code> element
    * @return the node defined for the element <code>ejb-name</code> 
    */
   public String getEjbName()
   {
      return childNode.getTextValueForPatternName("ejb-name");
   }

   /**
    * Removes the <code>ejb-name</code> element 
    * @return the current instance of <code>MethodType<T></code> 
    */
   public MethodType<T> removeEjbName()
   {
      childNode.removeChildren("ejb-name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MethodType ElementName: javaee:method-intfType ElementType : method-intf
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>method-intf</code> element
    * @param methodIntf the value for the element <code>method-intf</code> 
    * @return the current instance of <code>MethodType<T></code> 
    */
   public MethodType<T> methodIntf(MethodIntfType methodIntf)
   {
      childNode.getOrCreate("method-intf").text(methodIntf);
      return this;
   }
   /**
    * Sets the <code>method-intf</code> element
    * @param methodIntf the value for the element <code>method-intf</code> 
    * @return the current instance of <code>MethodType<T></code> 
    */
   public MethodType<T> methodIntf(String methodIntf)
   {
      childNode.getOrCreate("method-intf").text(methodIntf);
      return this;
   }

   /**
    * Returns the <code>method-intf</code> element
    * @return the value found for the element <code>method-intf</code> 
    */
   public MethodIntfType getMethodIntf()
   {
      return MethodIntfType.getFromStringValue(childNode.getTextValueForPatternName("method-intf"));
   }

   /**
    * Returns the <code>method-intf</code> element
    * @return the value found for the element <code>method-intf</code> 
    */
   public String  getMethodIntfAsString()
   {
      return childNode.getTextValueForPatternName("method-intf");
   }

   /**
    * Removes the <code>method-intf</code> attribute 
    * @return the current instance of <code>MethodType<T></code> 
    */
   public MethodType<T> removeMethodIntf()
   {
      childNode.removeAttribute("method-intf");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MethodType ElementName: javaee:string ElementType : method-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>method-name</code> element
    * @param methodName the value for the element <code>method-name</code> 
    * @return the current instance of <code>MethodType<T></code> 
    */
   public MethodType<T> methodName(String methodName)
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
    * @return the current instance of <code>MethodType<T></code> 
    */
   public MethodType<T> removeMethodName()
   {
      childNode.removeChildren("method-name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MethodType ElementName: javaee:method-paramsType ElementType : method-params
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>method-params</code> element with the given value will be created.
    * Otherwise, the existing <code>method-params</code> element will be returned.
    * @return  a new or existing instance of <code>MethodParamsType<MethodType<T>></code> 
    */
   public MethodParamsType<MethodType<T>> getOrCreateMethodParams()
   {
      Node node = childNode.getOrCreate("method-params");
      MethodParamsType<MethodType<T>> methodParams = new MethodParamsTypeImpl<MethodType<T>>(this, "method-params", childNode, node);
      return methodParams;
   }

   /**
    * Removes the <code>method-params</code> element 
    * @return the current instance of <code>MethodType<T></code> 
    */
   public MethodType<T> removeMethodParams()
   {
      childNode.removeChildren("method-params");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MethodType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>MethodType<T></code> 
    */
   public MethodType<T> id(String id)
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
    * @return the current instance of <code>MethodType<T></code> 
    */
   public MethodType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
