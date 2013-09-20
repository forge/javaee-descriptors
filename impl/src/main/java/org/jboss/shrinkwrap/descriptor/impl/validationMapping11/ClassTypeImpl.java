package org.jboss.shrinkwrap.descriptor.impl.validationMapping11; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.validationMapping11.ClassType;
import org.jboss.shrinkwrap.descriptor.api.validationMapping11.ConstraintType;
import org.jboss.shrinkwrap.descriptor.api.validationMapping11.GroupSequenceType;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> classType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class ClassTypeImpl<T> implements Child<T>, ClassType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public ClassTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public ClassTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ClassType ElementName: map:groupSequenceType ElementType : group-sequence
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>group-sequence</code> element with the given value will be created.
    * Otherwise, the existing <code>group-sequence</code> element will be returned.
    * @return  a new or existing instance of <code>GroupSequenceType<ClassType<T>></code> 
    */
   public GroupSequenceType<ClassType<T>> getOrCreateGroupSequence()
   {
      Node node = childNode.getOrCreate("group-sequence");
      GroupSequenceType<ClassType<T>> groupSequence = new GroupSequenceTypeImpl<ClassType<T>>(this, "group-sequence", childNode, node);
      return groupSequence;
   }

   /**
    * Removes the <code>group-sequence</code> element 
    * @return the current instance of <code>ClassType<T></code> 
    */
   public ClassType<T> removeGroupSequence()
   {
      childNode.removeChildren("group-sequence");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ClassType ElementName: map:constraintType ElementType : constraint
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>constraint</code> element will be created and returned.
    * Otherwise, the first existing <code>constraint</code> element will be returned.
    * @return the instance defined for the element <code>constraint</code> 
    */
   public ConstraintType<ClassType<T>> getOrCreateConstraint()
   {
      List<Node> nodeList = childNode.get("constraint");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ConstraintTypeImpl<ClassType<T>>(this, "constraint", childNode, nodeList.get(0));
      }
      return createConstraint();
   }

   /**
    * Creates a new <code>constraint</code> element 
    * @return the new created instance of <code>ConstraintType<ClassType<T>></code> 
    */
   public ConstraintType<ClassType<T>> createConstraint()
   {
      return new ConstraintTypeImpl<ClassType<T>>(this, "constraint", childNode);
   }

   /**
    * Returns all <code>constraint</code> elements
    * @return list of <code>constraint</code> 
    */
   public List<ConstraintType<ClassType<T>>> getAllConstraint()
   {
      List<ConstraintType<ClassType<T>>> list = new ArrayList<ConstraintType<ClassType<T>>>();
      List<Node> nodeList = childNode.get("constraint");
      for(Node node: nodeList)
      {
         ConstraintType<ClassType<T>>  type = new ConstraintTypeImpl<ClassType<T>>(this, "constraint", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>constraint</code> elements 
    * @return the current instance of <code>ConstraintType<ClassType<T>></code> 
    */
   public ClassType<T> removeAllConstraint()
   {
      childNode.removeChildren("constraint");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ClassType ElementName: xsd:boolean ElementType : ignore-annotations
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>ignore-annotations</code> attribute
    * @param ignoreAnnotations the value for the attribute <code>ignore-annotations</code> 
    * @return the current instance of <code>ClassType<T></code> 
    */
   public ClassType<T> ignoreAnnotations(Boolean ignoreAnnotations)
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
    * @return the current instance of <code>ClassType<T></code> 
    */
   public ClassType<T> removeIgnoreAnnotations()
   {
      childNode.removeAttribute("ignore-annotations");
      return this;
   }
}
