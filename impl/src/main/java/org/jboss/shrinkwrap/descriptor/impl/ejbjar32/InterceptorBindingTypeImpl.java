package org.jboss.shrinkwrap.descriptor.impl.ejbjar32; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.ejbjar32.InterceptorBindingType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.ejbjar32.InterceptorOrderType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar32.InterceptorOrderTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.ejbjar32.NamedMethodType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar32.NamedMethodTypeImpl;

/**
 * This class implements the <code> interceptor-bindingType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class InterceptorBindingTypeImpl<T> implements Child<T>, InterceptorBindingType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public InterceptorBindingTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public InterceptorBindingTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: InterceptorBindingType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>InterceptorBindingType<T></code> 
    */
   public InterceptorBindingType<T> description(String ... values)
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
    * @return the current instance of <code>InterceptorBindingType<T></code> 
    */
   public InterceptorBindingType<T> removeAllDescription()
   {
      childNode.removeChildren("description");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: InterceptorBindingType ElementName: xsd:token ElementType : ejb-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>ejb-name</code> element
    * @param ejbName the value for the element <code>ejb-name</code> 
    * @return the current instance of <code>InterceptorBindingType<T></code> 
    */
   public InterceptorBindingType<T> ejbName(String ejbName)
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
    * @return the current instance of <code>InterceptorBindingType<T></code> 
    */
   public InterceptorBindingType<T> removeEjbName()
   {
      childNode.removeChildren("ejb-name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: InterceptorBindingType ElementName: xsd:token ElementType : interceptor-class
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>interceptor-class</code> elements, 
    * a new <code>interceptor-class</code> element 
    * @param values list of <code>interceptor-class</code> objects 
    * @return the current instance of <code>InterceptorBindingType<T></code> 
    */
   public InterceptorBindingType<T> interceptorClass(String ... values)
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
    * @return the current instance of <code>InterceptorBindingType<T></code> 
    */
   public InterceptorBindingType<T> removeAllInterceptorClass()
   {
      childNode.removeChildren("interceptor-class");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: InterceptorBindingType ElementName: javaee:interceptor-orderType ElementType : interceptor-order
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>interceptor-order</code> element with the given value will be created.
    * Otherwise, the existing <code>interceptor-order</code> element will be returned.
    * @return  a new or existing instance of <code>InterceptorOrderType<InterceptorBindingType<T>></code> 
    */
   public InterceptorOrderType<InterceptorBindingType<T>> getOrCreateInterceptorOrder()
   {
      Node node = childNode.getOrCreate("interceptor-order");
      InterceptorOrderType<InterceptorBindingType<T>> interceptorOrder = new InterceptorOrderTypeImpl<InterceptorBindingType<T>>(this, "interceptor-order", childNode, node);
      return interceptorOrder;
   }

   /**
    * Removes the <code>interceptor-order</code> element 
    * @return the current instance of <code>InterceptorBindingType<T></code> 
    */
   public InterceptorBindingType<T> removeInterceptorOrder()
   {
      childNode.removeChildren("interceptor-order");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: InterceptorBindingType ElementName: javaee:xsdBooleanType ElementType : exclude-default-interceptors
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>exclude-default-interceptors</code> element
    * @param excludeDefaultInterceptors the value for the element <code>exclude-default-interceptors</code> 
    * @return the current instance of <code>InterceptorBindingType<T></code> 
    */
   public InterceptorBindingType<T> excludeDefaultInterceptors(Boolean excludeDefaultInterceptors)
   {
      childNode.getOrCreate("exclude-default-interceptors").text(excludeDefaultInterceptors);
      return this;
   }

   /**
    * Returns the <code>exclude-default-interceptors</code> element
    * @return the node defined for the element <code>exclude-default-interceptors</code> 
    */
   public Boolean isExcludeDefaultInterceptors()
   {
      return Strings.isTrue(childNode.getTextValueForPatternName("exclude-default-interceptors"));
   }

   /**
    * Removes the <code>exclude-default-interceptors</code> element 
    * @return the current instance of <code>InterceptorBindingType<T></code> 
    */
   public InterceptorBindingType<T> removeExcludeDefaultInterceptors()
   {
      childNode.removeChildren("exclude-default-interceptors");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: InterceptorBindingType ElementName: javaee:xsdBooleanType ElementType : exclude-class-interceptors
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>exclude-class-interceptors</code> element
    * @param excludeClassInterceptors the value for the element <code>exclude-class-interceptors</code> 
    * @return the current instance of <code>InterceptorBindingType<T></code> 
    */
   public InterceptorBindingType<T> excludeClassInterceptors(Boolean excludeClassInterceptors)
   {
      childNode.getOrCreate("exclude-class-interceptors").text(excludeClassInterceptors);
      return this;
   }

   /**
    * Returns the <code>exclude-class-interceptors</code> element
    * @return the node defined for the element <code>exclude-class-interceptors</code> 
    */
   public Boolean isExcludeClassInterceptors()
   {
      return Strings.isTrue(childNode.getTextValueForPatternName("exclude-class-interceptors"));
   }

   /**
    * Removes the <code>exclude-class-interceptors</code> element 
    * @return the current instance of <code>InterceptorBindingType<T></code> 
    */
   public InterceptorBindingType<T> removeExcludeClassInterceptors()
   {
      childNode.removeChildren("exclude-class-interceptors");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: InterceptorBindingType ElementName: javaee:named-methodType ElementType : method
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>method</code> element with the given value will be created.
    * Otherwise, the existing <code>method</code> element will be returned.
    * @return  a new or existing instance of <code>NamedMethodType<InterceptorBindingType<T>></code> 
    */
   public NamedMethodType<InterceptorBindingType<T>> getOrCreateMethod()
   {
      Node node = childNode.getOrCreate("method");
      NamedMethodType<InterceptorBindingType<T>> method = new NamedMethodTypeImpl<InterceptorBindingType<T>>(this, "method", childNode, node);
      return method;
   }

   /**
    * Removes the <code>method</code> element 
    * @return the current instance of <code>InterceptorBindingType<T></code> 
    */
   public InterceptorBindingType<T> removeMethod()
   {
      childNode.removeChildren("method");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: InterceptorBindingType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>InterceptorBindingType<T></code> 
    */
   public InterceptorBindingType<T> id(String id)
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
    * @return the current instance of <code>InterceptorBindingType<T></code> 
    */
   public InterceptorBindingType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
