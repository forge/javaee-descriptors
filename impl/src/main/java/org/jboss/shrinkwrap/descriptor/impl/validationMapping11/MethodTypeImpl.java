package org.jboss.shrinkwrap.descriptor.impl.validationMapping11; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.validationMapping11.MethodType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.validationMapping11.ParameterType;
import org.jboss.shrinkwrap.descriptor.impl.validationMapping11.ParameterTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.validationMapping11.CrossParameterType;
import org.jboss.shrinkwrap.descriptor.impl.validationMapping11.CrossParameterTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.validationMapping11.ReturnValueType;
import org.jboss.shrinkwrap.descriptor.impl.validationMapping11.ReturnValueTypeImpl;

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
   // ClassName: MethodType ElementName: map:parameterType ElementType : parameter
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>parameter</code> element will be created and returned.
    * Otherwise, the first existing <code>parameter</code> element will be returned.
    * @return the instance defined for the element <code>parameter</code> 
    */
   public ParameterType<MethodType<T>> getOrCreateParameter()
   {
      List<Node> nodeList = childNode.get("parameter");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ParameterTypeImpl<MethodType<T>>(this, "parameter", childNode, nodeList.get(0));
      }
      return createParameter();
   }

   /**
    * Creates a new <code>parameter</code> element 
    * @return the new created instance of <code>ParameterType<MethodType<T>></code> 
    */
   public ParameterType<MethodType<T>> createParameter()
   {
      return new ParameterTypeImpl<MethodType<T>>(this, "parameter", childNode);
   }

   /**
    * Returns all <code>parameter</code> elements
    * @return list of <code>parameter</code> 
    */
   public List<ParameterType<MethodType<T>>> getAllParameter()
   {
      List<ParameterType<MethodType<T>>> list = new ArrayList<ParameterType<MethodType<T>>>();
      List<Node> nodeList = childNode.get("parameter");
      for(Node node: nodeList)
      {
         ParameterType<MethodType<T>>  type = new ParameterTypeImpl<MethodType<T>>(this, "parameter", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>parameter</code> elements 
    * @return the current instance of <code>ParameterType<MethodType<T>></code> 
    */
   public MethodType<T> removeAllParameter()
   {
      childNode.removeChildren("parameter");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MethodType ElementName: map:crossParameterType ElementType : cross-parameter
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>cross-parameter</code> element with the given value will be created.
    * Otherwise, the existing <code>cross-parameter</code> element will be returned.
    * @return  a new or existing instance of <code>CrossParameterType<MethodType<T>></code> 
    */
   public CrossParameterType<MethodType<T>> getOrCreateCrossParameter()
   {
      Node node = childNode.getOrCreate("cross-parameter");
      CrossParameterType<MethodType<T>> crossParameter = new CrossParameterTypeImpl<MethodType<T>>(this, "cross-parameter", childNode, node);
      return crossParameter;
   }

   /**
    * Removes the <code>cross-parameter</code> element 
    * @return the current instance of <code>MethodType<T></code> 
    */
   public MethodType<T> removeCrossParameter()
   {
      childNode.removeChildren("cross-parameter");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MethodType ElementName: map:returnValueType ElementType : return-value
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>return-value</code> element with the given value will be created.
    * Otherwise, the existing <code>return-value</code> element will be returned.
    * @return  a new or existing instance of <code>ReturnValueType<MethodType<T>></code> 
    */
   public ReturnValueType<MethodType<T>> getOrCreateReturnValue()
   {
      Node node = childNode.getOrCreate("return-value");
      ReturnValueType<MethodType<T>> returnValue = new ReturnValueTypeImpl<MethodType<T>>(this, "return-value", childNode, node);
      return returnValue;
   }

   /**
    * Removes the <code>return-value</code> element 
    * @return the current instance of <code>MethodType<T></code> 
    */
   public MethodType<T> removeReturnValue()
   {
      childNode.removeChildren("return-value");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MethodType ElementName: xsd:string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>MethodType<T></code> 
    */
   public MethodType<T> name(String name)
   {
      childNode.attribute("name", name);
      return this;
   }

   /**
    * Returns the <code>name</code> attribute
    * @return the value defined for the attribute <code>name</code> 
    */
      public String getName()
   {
      return childNode.getAttribute("name");
   }

   /**
    * Removes the <code>name</code> attribute 
    * @return the current instance of <code>MethodType<T></code> 
    */
   public MethodType<T> removeName()
   {
      childNode.removeAttribute("name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MethodType ElementName: xsd:boolean ElementType : ignore-annotations
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>ignore-annotations</code> attribute
    * @param ignoreAnnotations the value for the attribute <code>ignore-annotations</code> 
    * @return the current instance of <code>MethodType<T></code> 
    */
   public MethodType<T> ignoreAnnotations(Boolean ignoreAnnotations)
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
    * @return the current instance of <code>MethodType<T></code> 
    */
   public MethodType<T> removeIgnoreAnnotations()
   {
      childNode.removeAttribute("ignore-annotations");
      return this;
   }
}
