package org.jboss.shrinkwrap.descriptor.impl.validationMapping11; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.validationMapping11.ConstraintType;
import org.jboss.shrinkwrap.descriptor.api.validationMapping11.GroupConversionType;
import org.jboss.shrinkwrap.descriptor.api.validationMapping11.ParameterType;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> parameterType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class ParameterTypeImpl<T> implements Child<T>, ParameterType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public ParameterTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public ParameterTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ParameterType ElementName: xsd:string ElementType : valid
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>valid</code> element
    * @param valid the value for the element <code>valid</code> 
    * @return the current instance of <code>ParameterType<T></code> 
    */
   public ParameterType<T> valid(String valid)
   {
      childNode.getOrCreate("valid").text(valid);
      return this;
   }

   /**
    * Returns the <code>valid</code> element
    * @return the node defined for the element <code>valid</code> 
    */
   public String getValid()
   {
      return childNode.getTextValueForPatternName("valid");
   }

   /**
    * Removes the <code>valid</code> element 
    * @return the current instance of <code>ParameterType<T></code> 
    */
   public ParameterType<T> removeValid()
   {
      childNode.removeChildren("valid");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ParameterType ElementName: map:groupConversionType ElementType : convert-group
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>convert-group</code> element will be created and returned.
    * Otherwise, the first existing <code>convert-group</code> element will be returned.
    * @return the instance defined for the element <code>convert-group</code> 
    */
   public GroupConversionType<ParameterType<T>> getOrCreateConvertGroup()
   {
      List<Node> nodeList = childNode.get("convert-group");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new GroupConversionTypeImpl<ParameterType<T>>(this, "convert-group", childNode, nodeList.get(0));
      }
      return createConvertGroup();
   }

   /**
    * Creates a new <code>convert-group</code> element 
    * @return the new created instance of <code>GroupConversionType<ParameterType<T>></code> 
    */
   public GroupConversionType<ParameterType<T>> createConvertGroup()
   {
      return new GroupConversionTypeImpl<ParameterType<T>>(this, "convert-group", childNode);
   }

   /**
    * Returns all <code>convert-group</code> elements
    * @return list of <code>convert-group</code> 
    */
   public List<GroupConversionType<ParameterType<T>>> getAllConvertGroup()
   {
      List<GroupConversionType<ParameterType<T>>> list = new ArrayList<GroupConversionType<ParameterType<T>>>();
      List<Node> nodeList = childNode.get("convert-group");
      for(Node node: nodeList)
      {
         GroupConversionType<ParameterType<T>>  type = new GroupConversionTypeImpl<ParameterType<T>>(this, "convert-group", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>convert-group</code> elements 
    * @return the current instance of <code>GroupConversionType<ParameterType<T>></code> 
    */
   public ParameterType<T> removeAllConvertGroup()
   {
      childNode.removeChildren("convert-group");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ParameterType ElementName: map:constraintType ElementType : constraint
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>constraint</code> element will be created and returned.
    * Otherwise, the first existing <code>constraint</code> element will be returned.
    * @return the instance defined for the element <code>constraint</code> 
    */
   public ConstraintType<ParameterType<T>> getOrCreateConstraint()
   {
      List<Node> nodeList = childNode.get("constraint");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ConstraintTypeImpl<ParameterType<T>>(this, "constraint", childNode, nodeList.get(0));
      }
      return createConstraint();
   }

   /**
    * Creates a new <code>constraint</code> element 
    * @return the new created instance of <code>ConstraintType<ParameterType<T>></code> 
    */
   public ConstraintType<ParameterType<T>> createConstraint()
   {
      return new ConstraintTypeImpl<ParameterType<T>>(this, "constraint", childNode);
   }

   /**
    * Returns all <code>constraint</code> elements
    * @return list of <code>constraint</code> 
    */
   public List<ConstraintType<ParameterType<T>>> getAllConstraint()
   {
      List<ConstraintType<ParameterType<T>>> list = new ArrayList<ConstraintType<ParameterType<T>>>();
      List<Node> nodeList = childNode.get("constraint");
      for(Node node: nodeList)
      {
         ConstraintType<ParameterType<T>>  type = new ConstraintTypeImpl<ParameterType<T>>(this, "constraint", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>constraint</code> elements 
    * @return the current instance of <code>ConstraintType<ParameterType<T>></code> 
    */
   public ParameterType<T> removeAllConstraint()
   {
      childNode.removeChildren("constraint");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ParameterType ElementName: xsd:string ElementType : type
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>type</code> attribute
    * @param type the value for the attribute <code>type</code> 
    * @return the current instance of <code>ParameterType<T></code> 
    */
   public ParameterType<T> type(String type)
   {
      childNode.attribute("type", type);
      return this;
   }

   /**
    * Returns the <code>type</code> attribute
    * @return the value defined for the attribute <code>type</code> 
    */
      public String getType()
   {
      return childNode.getAttribute("type");
   }

   /**
    * Removes the <code>type</code> attribute 
    * @return the current instance of <code>ParameterType<T></code> 
    */
   public ParameterType<T> removeType()
   {
      childNode.removeAttribute("type");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ParameterType ElementName: xsd:boolean ElementType : ignore-annotations
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>ignore-annotations</code> attribute
    * @param ignoreAnnotations the value for the attribute <code>ignore-annotations</code> 
    * @return the current instance of <code>ParameterType<T></code> 
    */
   public ParameterType<T> ignoreAnnotations(Boolean ignoreAnnotations)
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
    * @return the current instance of <code>ParameterType<T></code> 
    */
   public ParameterType<T> removeIgnoreAnnotations()
   {
      childNode.removeAttribute("ignore-annotations");
      return this;
   }
}
