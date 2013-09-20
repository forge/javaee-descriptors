package org.jboss.shrinkwrap.descriptor.impl.jsptaglibrary21; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee5.ParamValueType;
import org.jboss.shrinkwrap.descriptor.api.jsptaglibrary21.ValidatorType;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.ParamValueTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> validatorType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class ValidatorTypeImpl<T> implements Child<T>, ValidatorType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public ValidatorTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public ValidatorTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ValidatorType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>ValidatorType<T></code> 
    */
   public ValidatorType<T> description(String ... values)
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
    * @return the current instance of <code>ValidatorType<T></code> 
    */
   public ValidatorType<T> removeAllDescription()
   {
      childNode.removeChildren("description");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ValidatorType ElementName: xsd:token ElementType : validator-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>validator-class</code> element
    * @param validatorClass the value for the element <code>validator-class</code> 
    * @return the current instance of <code>ValidatorType<T></code> 
    */
   public ValidatorType<T> validatorClass(String validatorClass)
   {
      childNode.getOrCreate("validator-class").text(validatorClass);
      return this;
   }

   /**
    * Returns the <code>validator-class</code> element
    * @return the node defined for the element <code>validator-class</code> 
    */
   public String getValidatorClass()
   {
      return childNode.getTextValueForPatternName("validator-class");
   }

   /**
    * Removes the <code>validator-class</code> element 
    * @return the current instance of <code>ValidatorType<T></code> 
    */
   public ValidatorType<T> removeValidatorClass()
   {
      childNode.removeChildren("validator-class");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ValidatorType ElementName: javaee:param-valueType ElementType : init-param
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>init-param</code> element will be created and returned.
    * Otherwise, the first existing <code>init-param</code> element will be returned.
    * @return the instance defined for the element <code>init-param</code> 
    */
   public ParamValueType<ValidatorType<T>> getOrCreateInitParam()
   {
      List<Node> nodeList = childNode.get("init-param");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ParamValueTypeImpl<ValidatorType<T>>(this, "init-param", childNode, nodeList.get(0));
      }
      return createInitParam();
   }

   /**
    * Creates a new <code>init-param</code> element 
    * @return the new created instance of <code>ParamValueType<ValidatorType<T>></code> 
    */
   public ParamValueType<ValidatorType<T>> createInitParam()
   {
      return new ParamValueTypeImpl<ValidatorType<T>>(this, "init-param", childNode);
   }

   /**
    * Returns all <code>init-param</code> elements
    * @return list of <code>init-param</code> 
    */
   public List<ParamValueType<ValidatorType<T>>> getAllInitParam()
   {
      List<ParamValueType<ValidatorType<T>>> list = new ArrayList<ParamValueType<ValidatorType<T>>>();
      List<Node> nodeList = childNode.get("init-param");
      for(Node node: nodeList)
      {
         ParamValueType<ValidatorType<T>>  type = new ParamValueTypeImpl<ValidatorType<T>>(this, "init-param", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>init-param</code> elements 
    * @return the current instance of <code>ParamValueType<ValidatorType<T>></code> 
    */
   public ValidatorType<T> removeAllInitParam()
   {
      childNode.removeChildren("init-param");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ValidatorType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>ValidatorType<T></code> 
    */
   public ValidatorType<T> id(String id)
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
    * @return the current instance of <code>ValidatorType<T></code> 
    */
   public ValidatorType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
