package org.jboss.shrinkwrap.descriptor.impl.validationMapping11; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.validationMapping11.GetterType;
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
 * This class implements the <code> getterType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class GetterTypeImpl<T> implements Child<T>, GetterType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public GetterTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public GetterTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: GetterType ElementName: xsd:string ElementType : valid
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>valid</code> element
    * @param valid the value for the element <code>valid</code> 
    * @return the current instance of <code>GetterType<T></code> 
    */
   public GetterType<T> valid(String valid)
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
    * @return the current instance of <code>GetterType<T></code> 
    */
   public GetterType<T> removeValid()
   {
      childNode.removeChildren("valid");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: GetterType ElementName: map:groupConversionType ElementType : convert-group
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>convert-group</code> element will be created and returned.
    * Otherwise, the first existing <code>convert-group</code> element will be returned.
    * @return the instance defined for the element <code>convert-group</code> 
    */
   public GroupConversionType<GetterType<T>> getOrCreateConvertGroup()
   {
      List<Node> nodeList = childNode.get("convert-group");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new GroupConversionTypeImpl<GetterType<T>>(this, "convert-group", childNode, nodeList.get(0));
      }
      return createConvertGroup();
   }

   /**
    * Creates a new <code>convert-group</code> element 
    * @return the new created instance of <code>GroupConversionType<GetterType<T>></code> 
    */
   public GroupConversionType<GetterType<T>> createConvertGroup()
   {
      return new GroupConversionTypeImpl<GetterType<T>>(this, "convert-group", childNode);
   }

   /**
    * Returns all <code>convert-group</code> elements
    * @return list of <code>convert-group</code> 
    */
   public List<GroupConversionType<GetterType<T>>> getAllConvertGroup()
   {
      List<GroupConversionType<GetterType<T>>> list = new ArrayList<GroupConversionType<GetterType<T>>>();
      List<Node> nodeList = childNode.get("convert-group");
      for(Node node: nodeList)
      {
         GroupConversionType<GetterType<T>>  type = new GroupConversionTypeImpl<GetterType<T>>(this, "convert-group", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>convert-group</code> elements 
    * @return the current instance of <code>GroupConversionType<GetterType<T>></code> 
    */
   public GetterType<T> removeAllConvertGroup()
   {
      childNode.removeChildren("convert-group");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: GetterType ElementName: map:constraintType ElementType : constraint
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>constraint</code> element will be created and returned.
    * Otherwise, the first existing <code>constraint</code> element will be returned.
    * @return the instance defined for the element <code>constraint</code> 
    */
   public ConstraintType<GetterType<T>> getOrCreateConstraint()
   {
      List<Node> nodeList = childNode.get("constraint");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ConstraintTypeImpl<GetterType<T>>(this, "constraint", childNode, nodeList.get(0));
      }
      return createConstraint();
   }

   /**
    * Creates a new <code>constraint</code> element 
    * @return the new created instance of <code>ConstraintType<GetterType<T>></code> 
    */
   public ConstraintType<GetterType<T>> createConstraint()
   {
      return new ConstraintTypeImpl<GetterType<T>>(this, "constraint", childNode);
   }

   /**
    * Returns all <code>constraint</code> elements
    * @return list of <code>constraint</code> 
    */
   public List<ConstraintType<GetterType<T>>> getAllConstraint()
   {
      List<ConstraintType<GetterType<T>>> list = new ArrayList<ConstraintType<GetterType<T>>>();
      List<Node> nodeList = childNode.get("constraint");
      for(Node node: nodeList)
      {
         ConstraintType<GetterType<T>>  type = new ConstraintTypeImpl<GetterType<T>>(this, "constraint", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>constraint</code> elements 
    * @return the current instance of <code>ConstraintType<GetterType<T>></code> 
    */
   public GetterType<T> removeAllConstraint()
   {
      childNode.removeChildren("constraint");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: GetterType ElementName: xsd:string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>GetterType<T></code> 
    */
   public GetterType<T> name(String name)
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
    * @return the current instance of <code>GetterType<T></code> 
    */
   public GetterType<T> removeName()
   {
      childNode.removeAttribute("name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: GetterType ElementName: xsd:boolean ElementType : ignore-annotations
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>ignore-annotations</code> attribute
    * @param ignoreAnnotations the value for the attribute <code>ignore-annotations</code> 
    * @return the current instance of <code>GetterType<T></code> 
    */
   public GetterType<T> ignoreAnnotations(Boolean ignoreAnnotations)
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
    * @return the current instance of <code>GetterType<T></code> 
    */
   public GetterType<T> removeIgnoreAnnotations()
   {
      childNode.removeAttribute("ignore-annotations");
      return this;
   }
}
