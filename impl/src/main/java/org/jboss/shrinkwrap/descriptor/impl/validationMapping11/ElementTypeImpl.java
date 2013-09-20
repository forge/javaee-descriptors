package org.jboss.shrinkwrap.descriptor.impl.validationMapping11; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.validationMapping11.ElementType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.validationMapping11.AnnotationType;
import org.jboss.shrinkwrap.descriptor.impl.validationMapping11.AnnotationTypeImpl;

/**
 * This class implements the <code> elementType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class ElementTypeImpl<T> implements Child<T>, ElementType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public ElementTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public ElementTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ElementType ElementName: text ElementType : elementType
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the body text for the element <code>elementType</code> 
    * @param elementType the value for the body text <code>elementType</code> 
    * @return the current instance of <code>ElementType<T></code> 
    */
   public ElementType<T> text(String value)
   {
      childNode.text(value);
      return this;
   }

   /**
    * Returns the body text of the element <code>elementType</code> 
    * @return the value defined for the text <code>elementType</code> 
    */
   public String getText()
   {
      return childNode.getText();
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ElementType ElementName: xsd:string ElementType : value
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>value</code> elements, 
    * a new <code>value</code> element 
    * @param values list of <code>value</code> objects 
    * @return the current instance of <code>ElementType<T></code> 
    */
   public ElementType<T> value(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("value").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>value</code> elements
    * @return list of <code>value</code> 
    */
public List<String> getAllValue()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("value");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>value</code> element 
    * @return the current instance of <code>ElementType<T></code> 
    */
   public ElementType<T> removeAllValue()
   {
      childNode.removeChildren("value");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ElementType ElementName: map:annotationType ElementType : annotation
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>annotation</code> element will be created and returned.
    * Otherwise, the first existing <code>annotation</code> element will be returned.
    * @return the instance defined for the element <code>annotation</code> 
    */
   public AnnotationType<ElementType<T>> getOrCreateAnnotation()
   {
      List<Node> nodeList = childNode.get("annotation");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new AnnotationTypeImpl<ElementType<T>>(this, "annotation", childNode, nodeList.get(0));
      }
      return createAnnotation();
   }

   /**
    * Creates a new <code>annotation</code> element 
    * @return the new created instance of <code>AnnotationType<ElementType<T>></code> 
    */
   public AnnotationType<ElementType<T>> createAnnotation()
   {
      return new AnnotationTypeImpl<ElementType<T>>(this, "annotation", childNode);
   }

   /**
    * Returns all <code>annotation</code> elements
    * @return list of <code>annotation</code> 
    */
   public List<AnnotationType<ElementType<T>>> getAllAnnotation()
   {
      List<AnnotationType<ElementType<T>>> list = new ArrayList<AnnotationType<ElementType<T>>>();
      List<Node> nodeList = childNode.get("annotation");
      for(Node node: nodeList)
      {
         AnnotationType<ElementType<T>>  type = new AnnotationTypeImpl<ElementType<T>>(this, "annotation", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>annotation</code> elements 
    * @return the current instance of <code>AnnotationType<ElementType<T>></code> 
    */
   public ElementType<T> removeAllAnnotation()
   {
      childNode.removeChildren("annotation");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ElementType ElementName: xsd:string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>ElementType<T></code> 
    */
   public ElementType<T> name(String name)
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
    * @return the current instance of <code>ElementType<T></code> 
    */
   public ElementType<T> removeName()
   {
      childNode.removeAttribute("name");
      return this;
   }
}
