package org.jboss.shrinkwrap.descriptor.impl.validationMapping11; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.validationMapping11.FieldType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.validationMapping11.GroupConversionType;
import org.jboss.shrinkwrap.descriptor.impl.validationMapping11.GroupConversionTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.validationMapping11.ConstraintType;
import org.jboss.shrinkwrap.descriptor.impl.validationMapping11.ConstraintTypeImpl;

/**
 * This class implements the <code> fieldType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class FieldTypeImpl<T> implements Child<T>, FieldType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public FieldTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public FieldTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FieldType ElementName: xsd:string ElementType : valid
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>valid</code> element
    * @param valid the value for the element <code>valid</code> 
    * @return the current instance of <code>FieldType<T></code> 
    */
   public FieldType<T> valid(String valid)
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
    * @return the current instance of <code>FieldType<T></code> 
    */
   public FieldType<T> removeValid()
   {
      childNode.removeChildren("valid");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FieldType ElementName: map:groupConversionType ElementType : convert-group
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>convert-group</code> element will be created and returned.
    * Otherwise, the first existing <code>convert-group</code> element will be returned.
    * @return the instance defined for the element <code>convert-group</code> 
    */
   public GroupConversionType<FieldType<T>> getOrCreateConvertGroup()
   {
      List<Node> nodeList = childNode.get("convert-group");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new GroupConversionTypeImpl<FieldType<T>>(this, "convert-group", childNode, nodeList.get(0));
      }
      return createConvertGroup();
   }

   /**
    * Creates a new <code>convert-group</code> element 
    * @return the new created instance of <code>GroupConversionType<FieldType<T>></code> 
    */
   public GroupConversionType<FieldType<T>> createConvertGroup()
   {
      return new GroupConversionTypeImpl<FieldType<T>>(this, "convert-group", childNode);
   }

   /**
    * Returns all <code>convert-group</code> elements
    * @return list of <code>convert-group</code> 
    */
   public List<GroupConversionType<FieldType<T>>> getAllConvertGroup()
   {
      List<GroupConversionType<FieldType<T>>> list = new ArrayList<GroupConversionType<FieldType<T>>>();
      List<Node> nodeList = childNode.get("convert-group");
      for(Node node: nodeList)
      {
         GroupConversionType<FieldType<T>>  type = new GroupConversionTypeImpl<FieldType<T>>(this, "convert-group", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>convert-group</code> elements 
    * @return the current instance of <code>GroupConversionType<FieldType<T>></code> 
    */
   public FieldType<T> removeAllConvertGroup()
   {
      childNode.removeChildren("convert-group");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FieldType ElementName: map:constraintType ElementType : constraint
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>constraint</code> element will be created and returned.
    * Otherwise, the first existing <code>constraint</code> element will be returned.
    * @return the instance defined for the element <code>constraint</code> 
    */
   public ConstraintType<FieldType<T>> getOrCreateConstraint()
   {
      List<Node> nodeList = childNode.get("constraint");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ConstraintTypeImpl<FieldType<T>>(this, "constraint", childNode, nodeList.get(0));
      }
      return createConstraint();
   }

   /**
    * Creates a new <code>constraint</code> element 
    * @return the new created instance of <code>ConstraintType<FieldType<T>></code> 
    */
   public ConstraintType<FieldType<T>> createConstraint()
   {
      return new ConstraintTypeImpl<FieldType<T>>(this, "constraint", childNode);
   }

   /**
    * Returns all <code>constraint</code> elements
    * @return list of <code>constraint</code> 
    */
   public List<ConstraintType<FieldType<T>>> getAllConstraint()
   {
      List<ConstraintType<FieldType<T>>> list = new ArrayList<ConstraintType<FieldType<T>>>();
      List<Node> nodeList = childNode.get("constraint");
      for(Node node: nodeList)
      {
         ConstraintType<FieldType<T>>  type = new ConstraintTypeImpl<FieldType<T>>(this, "constraint", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>constraint</code> elements 
    * @return the current instance of <code>ConstraintType<FieldType<T>></code> 
    */
   public FieldType<T> removeAllConstraint()
   {
      childNode.removeChildren("constraint");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FieldType ElementName: xsd:string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>FieldType<T></code> 
    */
   public FieldType<T> name(String name)
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
    * @return the current instance of <code>FieldType<T></code> 
    */
   public FieldType<T> removeName()
   {
      childNode.removeAttribute("name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FieldType ElementName: xsd:boolean ElementType : ignore-annotations
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>ignore-annotations</code> attribute
    * @param ignoreAnnotations the value for the attribute <code>ignore-annotations</code> 
    * @return the current instance of <code>FieldType<T></code> 
    */
   public FieldType<T> ignoreAnnotations(Boolean ignoreAnnotations)
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
    * @return the current instance of <code>FieldType<T></code> 
    */
   public FieldType<T> removeIgnoreAnnotations()
   {
      childNode.removeAttribute("ignore-annotations");
      return this;
   }
}
