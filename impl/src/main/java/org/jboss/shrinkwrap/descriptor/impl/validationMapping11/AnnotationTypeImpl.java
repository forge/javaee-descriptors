package org.jboss.shrinkwrap.descriptor.impl.validationMapping11; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.validationMapping11.AnnotationType;
import org.jboss.shrinkwrap.descriptor.api.validationMapping11.ElementType;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> annotationType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class AnnotationTypeImpl<T> implements Child<T>, AnnotationType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public AnnotationTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public AnnotationTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: AnnotationType ElementName: map:elementType ElementType : element
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>element</code> element will be created and returned.
    * Otherwise, the first existing <code>element</code> element will be returned.
    * @return the instance defined for the element <code>element</code> 
    */
   public ElementType<AnnotationType<T>> getOrCreateElement()
   {
      List<Node> nodeList = childNode.get("element");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ElementTypeImpl<AnnotationType<T>>(this, "element", childNode, nodeList.get(0));
      }
      return createElement();
   }

   /**
    * Creates a new <code>element</code> element 
    * @return the new created instance of <code>ElementType<AnnotationType<T>></code> 
    */
   public ElementType<AnnotationType<T>> createElement()
   {
      return new ElementTypeImpl<AnnotationType<T>>(this, "element", childNode);
   }

   /**
    * Returns all <code>element</code> elements
    * @return list of <code>element</code> 
    */
   public List<ElementType<AnnotationType<T>>> getAllElement()
   {
      List<ElementType<AnnotationType<T>>> list = new ArrayList<ElementType<AnnotationType<T>>>();
      List<Node> nodeList = childNode.get("element");
      for(Node node: nodeList)
      {
         ElementType<AnnotationType<T>>  type = new ElementTypeImpl<AnnotationType<T>>(this, "element", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>element</code> elements 
    * @return the current instance of <code>ElementType<AnnotationType<T>></code> 
    */
   public AnnotationType<T> removeAllElement()
   {
      childNode.removeChildren("element");
      return this;
   }
}
