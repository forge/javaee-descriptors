package org.jboss.shrinkwrap.descriptor.impl.validationMapping11; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.validationMapping11.ConstraintType;
import org.jboss.shrinkwrap.descriptor.api.validationMapping11.GroupConversionType;
import org.jboss.shrinkwrap.descriptor.api.validationMapping11.ReturnValueType;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> returnValueType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class ReturnValueTypeImpl<T> implements Child<T>, ReturnValueType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public ReturnValueTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public ReturnValueTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ReturnValueType ElementName: xsd:string ElementType : valid
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>valid</code> element
    * @param valid the value for the element <code>valid</code> 
    * @return the current instance of <code>ReturnValueType<T></code> 
    */
   public ReturnValueType<T> valid(String valid)
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
    * @return the current instance of <code>ReturnValueType<T></code> 
    */
   public ReturnValueType<T> removeValid()
   {
      childNode.removeChildren("valid");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ReturnValueType ElementName: map:groupConversionType ElementType : convert-group
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>convert-group</code> element will be created and returned.
    * Otherwise, the first existing <code>convert-group</code> element will be returned.
    * @return the instance defined for the element <code>convert-group</code> 
    */
   public GroupConversionType<ReturnValueType<T>> getOrCreateConvertGroup()
   {
      List<Node> nodeList = childNode.get("convert-group");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new GroupConversionTypeImpl<ReturnValueType<T>>(this, "convert-group", childNode, nodeList.get(0));
      }
      return createConvertGroup();
   }

   /**
    * Creates a new <code>convert-group</code> element 
    * @return the new created instance of <code>GroupConversionType<ReturnValueType<T>></code> 
    */
   public GroupConversionType<ReturnValueType<T>> createConvertGroup()
   {
      return new GroupConversionTypeImpl<ReturnValueType<T>>(this, "convert-group", childNode);
   }

   /**
    * Returns all <code>convert-group</code> elements
    * @return list of <code>convert-group</code> 
    */
   public List<GroupConversionType<ReturnValueType<T>>> getAllConvertGroup()
   {
      List<GroupConversionType<ReturnValueType<T>>> list = new ArrayList<GroupConversionType<ReturnValueType<T>>>();
      List<Node> nodeList = childNode.get("convert-group");
      for(Node node: nodeList)
      {
         GroupConversionType<ReturnValueType<T>>  type = new GroupConversionTypeImpl<ReturnValueType<T>>(this, "convert-group", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>convert-group</code> elements 
    * @return the current instance of <code>GroupConversionType<ReturnValueType<T>></code> 
    */
   public ReturnValueType<T> removeAllConvertGroup()
   {
      childNode.removeChildren("convert-group");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ReturnValueType ElementName: map:constraintType ElementType : constraint
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>constraint</code> element will be created and returned.
    * Otherwise, the first existing <code>constraint</code> element will be returned.
    * @return the instance defined for the element <code>constraint</code> 
    */
   public ConstraintType<ReturnValueType<T>> getOrCreateConstraint()
   {
      List<Node> nodeList = childNode.get("constraint");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ConstraintTypeImpl<ReturnValueType<T>>(this, "constraint", childNode, nodeList.get(0));
      }
      return createConstraint();
   }

   /**
    * Creates a new <code>constraint</code> element 
    * @return the new created instance of <code>ConstraintType<ReturnValueType<T>></code> 
    */
   public ConstraintType<ReturnValueType<T>> createConstraint()
   {
      return new ConstraintTypeImpl<ReturnValueType<T>>(this, "constraint", childNode);
   }

   /**
    * Returns all <code>constraint</code> elements
    * @return list of <code>constraint</code> 
    */
   public List<ConstraintType<ReturnValueType<T>>> getAllConstraint()
   {
      List<ConstraintType<ReturnValueType<T>>> list = new ArrayList<ConstraintType<ReturnValueType<T>>>();
      List<Node> nodeList = childNode.get("constraint");
      for(Node node: nodeList)
      {
         ConstraintType<ReturnValueType<T>>  type = new ConstraintTypeImpl<ReturnValueType<T>>(this, "constraint", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>constraint</code> elements 
    * @return the current instance of <code>ConstraintType<ReturnValueType<T>></code> 
    */
   public ReturnValueType<T> removeAllConstraint()
   {
      childNode.removeChildren("constraint");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ReturnValueType ElementName: xsd:boolean ElementType : ignore-annotations
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>ignore-annotations</code> attribute
    * @param ignoreAnnotations the value for the attribute <code>ignore-annotations</code> 
    * @return the current instance of <code>ReturnValueType<T></code> 
    */
   public ReturnValueType<T> ignoreAnnotations(Boolean ignoreAnnotations)
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
    * @return the current instance of <code>ReturnValueType<T></code> 
    */
   public ReturnValueType<T> removeIgnoreAnnotations()
   {
      childNode.removeAttribute("ignore-annotations");
      return this;
   }
}
