package org.jboss.shrinkwrap.descriptor.impl.validationMapping11; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.validationMapping11.ConstructorType;
import org.jboss.shrinkwrap.descriptor.api.validationMapping11.CrossParameterType;
import org.jboss.shrinkwrap.descriptor.api.validationMapping11.ParameterType;
import org.jboss.shrinkwrap.descriptor.api.validationMapping11.ReturnValueType;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> constructorType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class ConstructorTypeImpl<T> implements Child<T>, ConstructorType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public ConstructorTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public ConstructorTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConstructorType ElementName: map:parameterType ElementType : parameter
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>parameter</code> element will be created and returned.
    * Otherwise, the first existing <code>parameter</code> element will be returned.
    * @return the instance defined for the element <code>parameter</code> 
    */
   public ParameterType<ConstructorType<T>> getOrCreateParameter()
   {
      List<Node> nodeList = childNode.get("parameter");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ParameterTypeImpl<ConstructorType<T>>(this, "parameter", childNode, nodeList.get(0));
      }
      return createParameter();
   }

   /**
    * Creates a new <code>parameter</code> element 
    * @return the new created instance of <code>ParameterType<ConstructorType<T>></code> 
    */
   public ParameterType<ConstructorType<T>> createParameter()
   {
      return new ParameterTypeImpl<ConstructorType<T>>(this, "parameter", childNode);
   }

   /**
    * Returns all <code>parameter</code> elements
    * @return list of <code>parameter</code> 
    */
   public List<ParameterType<ConstructorType<T>>> getAllParameter()
   {
      List<ParameterType<ConstructorType<T>>> list = new ArrayList<ParameterType<ConstructorType<T>>>();
      List<Node> nodeList = childNode.get("parameter");
      for(Node node: nodeList)
      {
         ParameterType<ConstructorType<T>>  type = new ParameterTypeImpl<ConstructorType<T>>(this, "parameter", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>parameter</code> elements 
    * @return the current instance of <code>ParameterType<ConstructorType<T>></code> 
    */
   public ConstructorType<T> removeAllParameter()
   {
      childNode.removeChildren("parameter");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConstructorType ElementName: map:crossParameterType ElementType : cross-parameter
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>cross-parameter</code> element with the given value will be created.
    * Otherwise, the existing <code>cross-parameter</code> element will be returned.
    * @return  a new or existing instance of <code>CrossParameterType<ConstructorType<T>></code> 
    */
   public CrossParameterType<ConstructorType<T>> getOrCreateCrossParameter()
   {
      Node node = childNode.getOrCreate("cross-parameter");
      CrossParameterType<ConstructorType<T>> crossParameter = new CrossParameterTypeImpl<ConstructorType<T>>(this, "cross-parameter", childNode, node);
      return crossParameter;
   }

   /**
    * Removes the <code>cross-parameter</code> element 
    * @return the current instance of <code>ConstructorType<T></code> 
    */
   public ConstructorType<T> removeCrossParameter()
   {
      childNode.removeChildren("cross-parameter");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConstructorType ElementName: map:returnValueType ElementType : return-value
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>return-value</code> element with the given value will be created.
    * Otherwise, the existing <code>return-value</code> element will be returned.
    * @return  a new or existing instance of <code>ReturnValueType<ConstructorType<T>></code> 
    */
   public ReturnValueType<ConstructorType<T>> getOrCreateReturnValue()
   {
      Node node = childNode.getOrCreate("return-value");
      ReturnValueType<ConstructorType<T>> returnValue = new ReturnValueTypeImpl<ConstructorType<T>>(this, "return-value", childNode, node);
      return returnValue;
   }

   /**
    * Removes the <code>return-value</code> element 
    * @return the current instance of <code>ConstructorType<T></code> 
    */
   public ConstructorType<T> removeReturnValue()
   {
      childNode.removeChildren("return-value");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConstructorType ElementName: xsd:boolean ElementType : ignore-annotations
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>ignore-annotations</code> attribute
    * @param ignoreAnnotations the value for the attribute <code>ignore-annotations</code> 
    * @return the current instance of <code>ConstructorType<T></code> 
    */
   public ConstructorType<T> ignoreAnnotations(Boolean ignoreAnnotations)
   {
      childNode.attribute("ignore-annotations", ignoreAnnotations);
      return this;
   }

   /**
    * Returns the <code>ignore-annotations</code> attribute
    * @return the value defined for the attribute <code>ignore-annotations</code> 
    */
   public Boolean isIgnoreAnnotations()
   {
      return Strings.isTrue(childNode.getAttribute("ignore-annotations"));
   }

   /**
    * Removes the <code>ignore-annotations</code> attribute 
    * @return the current instance of <code>ConstructorType<T></code> 
    */
   public ConstructorType<T> removeIgnoreAnnotations()
   {
      childNode.removeAttribute("ignore-annotations");
      return this;
   }
}
