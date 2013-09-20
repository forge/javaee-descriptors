package org.jboss.shrinkwrap.descriptor.impl.validationMapping11; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.validationMapping11.ConstraintType;
import org.jboss.shrinkwrap.descriptor.api.validationMapping11.ElementType;
import org.jboss.shrinkwrap.descriptor.api.validationMapping11.GroupsType;
import org.jboss.shrinkwrap.descriptor.api.validationMapping11.PayloadType;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> constraintType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class ConstraintTypeImpl<T> implements Child<T>, ConstraintType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public ConstraintTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public ConstraintTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConstraintType ElementName: xsd:string ElementType : message
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>message</code> element
    * @param message the value for the element <code>message</code> 
    * @return the current instance of <code>ConstraintType<T></code> 
    */
   public ConstraintType<T> message(String message)
   {
      childNode.getOrCreate("message").text(message);
      return this;
   }

   /**
    * Returns the <code>message</code> element
    * @return the node defined for the element <code>message</code> 
    */
   public String getMessage()
   {
      return childNode.getTextValueForPatternName("message");
   }

   /**
    * Removes the <code>message</code> element 
    * @return the current instance of <code>ConstraintType<T></code> 
    */
   public ConstraintType<T> removeMessage()
   {
      childNode.removeChildren("message");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConstraintType ElementName: map:groupsType ElementType : groups
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>groups</code> element with the given value will be created.
    * Otherwise, the existing <code>groups</code> element will be returned.
    * @return  a new or existing instance of <code>GroupsType<ConstraintType<T>></code> 
    */
   public GroupsType<ConstraintType<T>> getOrCreateGroups()
   {
      Node node = childNode.getOrCreate("groups");
      GroupsType<ConstraintType<T>> groups = new GroupsTypeImpl<ConstraintType<T>>(this, "groups", childNode, node);
      return groups;
   }

   /**
    * Removes the <code>groups</code> element 
    * @return the current instance of <code>ConstraintType<T></code> 
    */
   public ConstraintType<T> removeGroups()
   {
      childNode.removeChildren("groups");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConstraintType ElementName: map:payloadType ElementType : payload
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>payload</code> element with the given value will be created.
    * Otherwise, the existing <code>payload</code> element will be returned.
    * @return  a new or existing instance of <code>PayloadType<ConstraintType<T>></code> 
    */
   public PayloadType<ConstraintType<T>> getOrCreatePayload()
   {
      Node node = childNode.getOrCreate("payload");
      PayloadType<ConstraintType<T>> payload = new PayloadTypeImpl<ConstraintType<T>>(this, "payload", childNode, node);
      return payload;
   }

   /**
    * Removes the <code>payload</code> element 
    * @return the current instance of <code>ConstraintType<T></code> 
    */
   public ConstraintType<T> removePayload()
   {
      childNode.removeChildren("payload");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConstraintType ElementName: map:elementType ElementType : element
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>element</code> element will be created and returned.
    * Otherwise, the first existing <code>element</code> element will be returned.
    * @return the instance defined for the element <code>element</code> 
    */
   public ElementType<ConstraintType<T>> getOrCreateElement()
   {
      List<Node> nodeList = childNode.get("element");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ElementTypeImpl<ConstraintType<T>>(this, "element", childNode, nodeList.get(0));
      }
      return createElement();
   }

   /**
    * Creates a new <code>element</code> element 
    * @return the new created instance of <code>ElementType<ConstraintType<T>></code> 
    */
   public ElementType<ConstraintType<T>> createElement()
   {
      return new ElementTypeImpl<ConstraintType<T>>(this, "element", childNode);
   }

   /**
    * Returns all <code>element</code> elements
    * @return list of <code>element</code> 
    */
   public List<ElementType<ConstraintType<T>>> getAllElement()
   {
      List<ElementType<ConstraintType<T>>> list = new ArrayList<ElementType<ConstraintType<T>>>();
      List<Node> nodeList = childNode.get("element");
      for(Node node: nodeList)
      {
         ElementType<ConstraintType<T>>  type = new ElementTypeImpl<ConstraintType<T>>(this, "element", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>element</code> elements 
    * @return the current instance of <code>ElementType<ConstraintType<T>></code> 
    */
   public ConstraintType<T> removeAllElement()
   {
      childNode.removeChildren("element");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConstraintType ElementName: xsd:string ElementType : annotation
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>annotation</code> attribute
    * @param annotation the value for the attribute <code>annotation</code> 
    * @return the current instance of <code>ConstraintType<T></code> 
    */
   public ConstraintType<T> annotation(String annotation)
   {
      childNode.attribute("annotation", annotation);
      return this;
   }

   /**
    * Returns the <code>annotation</code> attribute
    * @return the value defined for the attribute <code>annotation</code> 
    */
      public String getAnnotation()
   {
      return childNode.getAttribute("annotation");
   }

   /**
    * Removes the <code>annotation</code> attribute 
    * @return the current instance of <code>ConstraintType<T></code> 
    */
   public ConstraintType<T> removeAnnotation()
   {
      childNode.removeAttribute("annotation");
      return this;
   }
}
