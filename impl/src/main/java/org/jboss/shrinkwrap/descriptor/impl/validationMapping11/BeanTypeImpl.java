package org.jboss.shrinkwrap.descriptor.impl.validationMapping11; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.validationMapping11.BeanType;
import org.jboss.shrinkwrap.descriptor.api.validationMapping11.ClassType;
import org.jboss.shrinkwrap.descriptor.api.validationMapping11.ConstructorType;
import org.jboss.shrinkwrap.descriptor.api.validationMapping11.FieldType;
import org.jboss.shrinkwrap.descriptor.api.validationMapping11.GetterType;
import org.jboss.shrinkwrap.descriptor.api.validationMapping11.MethodType;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> beanType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class BeanTypeImpl<T> implements Child<T>, BeanType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public BeanTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public BeanTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: BeanType ElementName: map:classType ElementType : class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>class</code> element with the given value will be created.
    * Otherwise, the existing <code>class</code> element will be returned.
    * @return  a new or existing instance of <code>ClassType<BeanType<T>></code> 
    */
   public ClassType<BeanType<T>> getOrCreateClazz()
   {
      Node node = childNode.getOrCreate("class");
      ClassType<BeanType<T>> clazz = new ClassTypeImpl<BeanType<T>>(this, "class", childNode, node);
      return clazz;
   }

   /**
    * Removes the <code>class</code> element 
    * @return the current instance of <code>BeanType<T></code> 
    */
   public BeanType<T> removeClazz()
   {
      childNode.removeChildren("class");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: BeanType ElementName: map:fieldType ElementType : field
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>field</code> element will be created and returned.
    * Otherwise, the first existing <code>field</code> element will be returned.
    * @return the instance defined for the element <code>field</code> 
    */
   public FieldType<BeanType<T>> getOrCreateField()
   {
      List<Node> nodeList = childNode.get("field");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new FieldTypeImpl<BeanType<T>>(this, "field", childNode, nodeList.get(0));
      }
      return createField();
   }

   /**
    * Creates a new <code>field</code> element 
    * @return the new created instance of <code>FieldType<BeanType<T>></code> 
    */
   public FieldType<BeanType<T>> createField()
   {
      return new FieldTypeImpl<BeanType<T>>(this, "field", childNode);
   }

   /**
    * Returns all <code>field</code> elements
    * @return list of <code>field</code> 
    */
   public List<FieldType<BeanType<T>>> getAllField()
   {
      List<FieldType<BeanType<T>>> list = new ArrayList<FieldType<BeanType<T>>>();
      List<Node> nodeList = childNode.get("field");
      for(Node node: nodeList)
      {
         FieldType<BeanType<T>>  type = new FieldTypeImpl<BeanType<T>>(this, "field", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>field</code> elements 
    * @return the current instance of <code>FieldType<BeanType<T>></code> 
    */
   public BeanType<T> removeAllField()
   {
      childNode.removeChildren("field");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: BeanType ElementName: map:getterType ElementType : getter
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>getter</code> element will be created and returned.
    * Otherwise, the first existing <code>getter</code> element will be returned.
    * @return the instance defined for the element <code>getter</code> 
    */
   public GetterType<BeanType<T>> getOrCreateGetter()
   {
      List<Node> nodeList = childNode.get("getter");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new GetterTypeImpl<BeanType<T>>(this, "getter", childNode, nodeList.get(0));
      }
      return createGetter();
   }

   /**
    * Creates a new <code>getter</code> element 
    * @return the new created instance of <code>GetterType<BeanType<T>></code> 
    */
   public GetterType<BeanType<T>> createGetter()
   {
      return new GetterTypeImpl<BeanType<T>>(this, "getter", childNode);
   }

   /**
    * Returns all <code>getter</code> elements
    * @return list of <code>getter</code> 
    */
   public List<GetterType<BeanType<T>>> getAllGetter()
   {
      List<GetterType<BeanType<T>>> list = new ArrayList<GetterType<BeanType<T>>>();
      List<Node> nodeList = childNode.get("getter");
      for(Node node: nodeList)
      {
         GetterType<BeanType<T>>  type = new GetterTypeImpl<BeanType<T>>(this, "getter", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>getter</code> elements 
    * @return the current instance of <code>GetterType<BeanType<T>></code> 
    */
   public BeanType<T> removeAllGetter()
   {
      childNode.removeChildren("getter");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: BeanType ElementName: map:constructorType ElementType : constructor
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>constructor</code> element will be created and returned.
    * Otherwise, the first existing <code>constructor</code> element will be returned.
    * @return the instance defined for the element <code>constructor</code> 
    */
   public ConstructorType<BeanType<T>> getOrCreateConstructor()
   {
      List<Node> nodeList = childNode.get("constructor");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ConstructorTypeImpl<BeanType<T>>(this, "constructor", childNode, nodeList.get(0));
      }
      return createConstructor();
   }

   /**
    * Creates a new <code>constructor</code> element 
    * @return the new created instance of <code>ConstructorType<BeanType<T>></code> 
    */
   public ConstructorType<BeanType<T>> createConstructor()
   {
      return new ConstructorTypeImpl<BeanType<T>>(this, "constructor", childNode);
   }

   /**
    * Returns all <code>constructor</code> elements
    * @return list of <code>constructor</code> 
    */
   public List<ConstructorType<BeanType<T>>> getAllConstructor()
   {
      List<ConstructorType<BeanType<T>>> list = new ArrayList<ConstructorType<BeanType<T>>>();
      List<Node> nodeList = childNode.get("constructor");
      for(Node node: nodeList)
      {
         ConstructorType<BeanType<T>>  type = new ConstructorTypeImpl<BeanType<T>>(this, "constructor", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>constructor</code> elements 
    * @return the current instance of <code>ConstructorType<BeanType<T>></code> 
    */
   public BeanType<T> removeAllConstructor()
   {
      childNode.removeChildren("constructor");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: BeanType ElementName: map:methodType ElementType : method
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>method</code> element will be created and returned.
    * Otherwise, the first existing <code>method</code> element will be returned.
    * @return the instance defined for the element <code>method</code> 
    */
   public MethodType<BeanType<T>> getOrCreateMethod()
   {
      List<Node> nodeList = childNode.get("method");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new MethodTypeImpl<BeanType<T>>(this, "method", childNode, nodeList.get(0));
      }
      return createMethod();
   }

   /**
    * Creates a new <code>method</code> element 
    * @return the new created instance of <code>MethodType<BeanType<T>></code> 
    */
   public MethodType<BeanType<T>> createMethod()
   {
      return new MethodTypeImpl<BeanType<T>>(this, "method", childNode);
   }

   /**
    * Returns all <code>method</code> elements
    * @return list of <code>method</code> 
    */
   public List<MethodType<BeanType<T>>> getAllMethod()
   {
      List<MethodType<BeanType<T>>> list = new ArrayList<MethodType<BeanType<T>>>();
      List<Node> nodeList = childNode.get("method");
      for(Node node: nodeList)
      {
         MethodType<BeanType<T>>  type = new MethodTypeImpl<BeanType<T>>(this, "method", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>method</code> elements 
    * @return the current instance of <code>MethodType<BeanType<T>></code> 
    */
   public BeanType<T> removeAllMethod()
   {
      childNode.removeChildren("method");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: BeanType ElementName: xsd:string ElementType : class
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>class</code> attribute
    * @param clazz the value for the attribute <code>class</code> 
    * @return the current instance of <code>BeanType<T></code> 
    */
   public BeanType<T> clazz(String clazz)
   {
      childNode.attribute("class", clazz);
      return this;
   }

   /**
    * Returns the <code>class</code> attribute
    * @return the value defined for the attribute <code>class</code> 
    */
      public String getClazz()
   {
      return childNode.getAttribute("class");
   }

   /**
    * Removes the <code>class</code> attribute 
    * @return the current instance of <code>BeanType<T></code> 
    */
   public BeanType<T> removeClazzAttr()
   {
      childNode.removeAttribute("class");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: BeanType ElementName: xsd:boolean ElementType : ignore-annotations
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>ignore-annotations</code> attribute
    * @param ignoreAnnotations the value for the attribute <code>ignore-annotations</code> 
    * @return the current instance of <code>BeanType<T></code> 
    */
   public BeanType<T> ignoreAnnotations(Boolean ignoreAnnotations)
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
    * @return the current instance of <code>BeanType<T></code> 
    */
   public BeanType<T> removeIgnoreAnnotations()
   {
      childNode.removeAttribute("ignore-annotations");
      return this;
   }
}
