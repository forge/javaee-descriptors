package org.jboss.shrinkwrap.descriptor.impl.jsptaglibrary21; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.jsptaglibrary21.ExtensibleType;
import org.jboss.shrinkwrap.descriptor.api.jsptaglibrary21.TldExtensionType;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> tld-extensionType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class TldExtensionTypeImpl<T> implements Child<T>, TldExtensionType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public TldExtensionTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public TldExtensionTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TldExtensionType ElementName: javaee:extensibleType ElementType : extension-element
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>extension-element</code> element will be created and returned.
    * Otherwise, the first existing <code>extension-element</code> element will be returned.
    * @return the instance defined for the element <code>extension-element</code> 
    */
   public ExtensibleType<TldExtensionType<T>> getOrCreateExtensionElement()
   {
      List<Node> nodeList = childNode.get("extension-element");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ExtensibleTypeImpl<TldExtensionType<T>>(this, "extension-element", childNode, nodeList.get(0));
      }
      return createExtensionElement();
   }

   /**
    * Creates a new <code>extension-element</code> element 
    * @return the new created instance of <code>ExtensibleType<TldExtensionType<T>></code> 
    */
   public ExtensibleType<TldExtensionType<T>> createExtensionElement()
   {
      return new ExtensibleTypeImpl<TldExtensionType<T>>(this, "extension-element", childNode);
   }

   /**
    * Returns all <code>extension-element</code> elements
    * @return list of <code>extension-element</code> 
    */
   public List<ExtensibleType<TldExtensionType<T>>> getAllExtensionElement()
   {
      List<ExtensibleType<TldExtensionType<T>>> list = new ArrayList<ExtensibleType<TldExtensionType<T>>>();
      List<Node> nodeList = childNode.get("extension-element");
      for(Node node: nodeList)
      {
         ExtensibleType<TldExtensionType<T>>  type = new ExtensibleTypeImpl<TldExtensionType<T>>(this, "extension-element", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>extension-element</code> elements 
    * @return the current instance of <code>ExtensibleType<TldExtensionType<T>></code> 
    */
   public TldExtensionType<T> removeAllExtensionElement()
   {
      childNode.removeChildren("extension-element");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TldExtensionType ElementName: xsd:anyURI ElementType : namespace
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>namespace</code> attribute
    * @param namespace the value for the attribute <code>namespace</code> 
    * @return the current instance of <code>TldExtensionType<T></code> 
    */
   public TldExtensionType<T> namespace(String namespace)
   {
      childNode.attribute("namespace", namespace);
      return this;
   }

   /**
    * Returns the <code>namespace</code> attribute
    * @return the value defined for the attribute <code>namespace</code> 
    */
      public String getNamespace()
   {
      return childNode.getAttribute("namespace");
   }

   /**
    * Removes the <code>namespace</code> attribute 
    * @return the current instance of <code>TldExtensionType<T></code> 
    */
   public TldExtensionType<T> removeNamespace()
   {
      childNode.removeAttribute("namespace");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TldExtensionType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>TldExtensionType<T></code> 
    */
   public TldExtensionType<T> id(String id)
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
    * @return the current instance of <code>TldExtensionType<T></code> 
    */
   public TldExtensionType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
