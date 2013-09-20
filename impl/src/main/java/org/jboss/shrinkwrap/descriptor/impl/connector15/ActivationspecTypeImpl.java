package org.jboss.shrinkwrap.descriptor.impl.connector15; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.connector15.ActivationspecType;
import org.jboss.shrinkwrap.descriptor.api.connector15.RequiredConfigPropertyType;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> activationspecType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class ActivationspecTypeImpl<T> implements Child<T>, ActivationspecType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public ActivationspecTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public ActivationspecTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ActivationspecType ElementName: xsd:token ElementType : activationspec-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>activationspec-class</code> element
    * @param activationspecClass the value for the element <code>activationspec-class</code> 
    * @return the current instance of <code>ActivationspecType<T></code> 
    */
   public ActivationspecType<T> activationspecClass(String activationspecClass)
   {
      childNode.getOrCreate("activationspec-class").text(activationspecClass);
      return this;
   }

   /**
    * Returns the <code>activationspec-class</code> element
    * @return the node defined for the element <code>activationspec-class</code> 
    */
   public String getActivationspecClass()
   {
      return childNode.getTextValueForPatternName("activationspec-class");
   }

   /**
    * Removes the <code>activationspec-class</code> element 
    * @return the current instance of <code>ActivationspecType<T></code> 
    */
   public ActivationspecType<T> removeActivationspecClass()
   {
      childNode.removeChildren("activationspec-class");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ActivationspecType ElementName: j2ee:required-config-propertyType ElementType : required-config-property
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>required-config-property</code> element will be created and returned.
    * Otherwise, the first existing <code>required-config-property</code> element will be returned.
    * @return the instance defined for the element <code>required-config-property</code> 
    */
   public RequiredConfigPropertyType<ActivationspecType<T>> getOrCreateRequiredConfigProperty()
   {
      List<Node> nodeList = childNode.get("required-config-property");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new RequiredConfigPropertyTypeImpl<ActivationspecType<T>>(this, "required-config-property", childNode, nodeList.get(0));
      }
      return createRequiredConfigProperty();
   }

   /**
    * Creates a new <code>required-config-property</code> element 
    * @return the new created instance of <code>RequiredConfigPropertyType<ActivationspecType<T>></code> 
    */
   public RequiredConfigPropertyType<ActivationspecType<T>> createRequiredConfigProperty()
   {
      return new RequiredConfigPropertyTypeImpl<ActivationspecType<T>>(this, "required-config-property", childNode);
   }

   /**
    * Returns all <code>required-config-property</code> elements
    * @return list of <code>required-config-property</code> 
    */
   public List<RequiredConfigPropertyType<ActivationspecType<T>>> getAllRequiredConfigProperty()
   {
      List<RequiredConfigPropertyType<ActivationspecType<T>>> list = new ArrayList<RequiredConfigPropertyType<ActivationspecType<T>>>();
      List<Node> nodeList = childNode.get("required-config-property");
      for(Node node: nodeList)
      {
         RequiredConfigPropertyType<ActivationspecType<T>>  type = new RequiredConfigPropertyTypeImpl<ActivationspecType<T>>(this, "required-config-property", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>required-config-property</code> elements 
    * @return the current instance of <code>RequiredConfigPropertyType<ActivationspecType<T>></code> 
    */
   public ActivationspecType<T> removeAllRequiredConfigProperty()
   {
      childNode.removeChildren("required-config-property");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ActivationspecType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>ActivationspecType<T></code> 
    */
   public ActivationspecType<T> id(String id)
   {
      childNode.attribute("id", id);
      return this;
   }

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
      public String getId()
   {
      return childNode.getAttribute("id");
   }

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>ActivationspecType<T></code> 
    */
   public ActivationspecType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
