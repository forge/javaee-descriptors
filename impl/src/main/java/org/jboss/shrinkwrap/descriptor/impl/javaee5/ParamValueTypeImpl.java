package org.jboss.shrinkwrap.descriptor.impl.javaee5; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee5.ParamValueType;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> param-valueType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class ParamValueTypeImpl<T> implements Child<T>, ParamValueType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public ParamValueTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public ParamValueTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ParamValueType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>ParamValueType<T></code> 
    */
   public ParamValueType<T> description(String ... values)
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
    * @return the current instance of <code>ParamValueType<T></code> 
    */
   public ParamValueType<T> removeAllDescription()
   {
      childNode.removeChildren("description");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ParamValueType ElementName: xsd:token ElementType : param-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>param-name</code> element
    * @param paramName the value for the element <code>param-name</code> 
    * @return the current instance of <code>ParamValueType<T></code> 
    */
   public ParamValueType<T> paramName(String paramName)
   {
      childNode.getOrCreate("param-name").text(paramName);
      return this;
   }

   /**
    * Returns the <code>param-name</code> element
    * @return the node defined for the element <code>param-name</code> 
    */
   public String getParamName()
   {
      return childNode.getTextValueForPatternName("param-name");
   }

   /**
    * Removes the <code>param-name</code> element 
    * @return the current instance of <code>ParamValueType<T></code> 
    */
   public ParamValueType<T> removeParamName()
   {
      childNode.removeChildren("param-name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ParamValueType ElementName: xsd:string ElementType : param-value
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>param-value</code> element
    * @param paramValue the value for the element <code>param-value</code> 
    * @return the current instance of <code>ParamValueType<T></code> 
    */
   public ParamValueType<T> paramValue(String paramValue)
   {
      childNode.getOrCreate("param-value").text(paramValue);
      return this;
   }

   /**
    * Returns the <code>param-value</code> element
    * @return the node defined for the element <code>param-value</code> 
    */
   public String getParamValue()
   {
      return childNode.getTextValueForPatternName("param-value");
   }

   /**
    * Removes the <code>param-value</code> element 
    * @return the current instance of <code>ParamValueType<T></code> 
    */
   public ParamValueType<T> removeParamValue()
   {
      childNode.removeChildren("param-value");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ParamValueType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>ParamValueType<T></code> 
    */
   public ParamValueType<T> id(String id)
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
    * @return the current instance of <code>ParamValueType<T></code> 
    */
   public ParamValueType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
