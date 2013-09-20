package org.jboss.shrinkwrap.descriptor.impl.jsptaglibrary21; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.jsptaglibrary21.ExtensibleType;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> extensibleType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class ExtensibleTypeImpl<T> implements Child<T>, ExtensibleType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public ExtensibleTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public ExtensibleTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ExtensibleType ElementName: javaee:extensibleType ElementType : extensibleType
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>extensibleType</code> element with the given value will be created.
    * Otherwise, the existing <code>extensibleType</code> element will be returned.
    * @return  a new or existing instance of <code>ExtensibleType<ExtensibleType<T>></code> 
    */
   public ExtensibleType<ExtensibleType<T>> getOrCreateExtensibleType()
   {
      Node node = childNode.getOrCreate("extensibleType");
      ExtensibleType<ExtensibleType<T>> extensibleType = new ExtensibleTypeImpl<ExtensibleType<T>>(this, "extensibleType", childNode, node);
      return extensibleType;
   }

   /**
    * Removes the <code>extensibleType</code> element 
    * @return the current instance of <code>ExtensibleType<T></code> 
    */
   public ExtensibleType<T> removeExtensibleType()
   {
      childNode.removeChildren("extensibleType");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ExtensibleType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>ExtensibleType<T></code> 
    */
   public ExtensibleType<T> id(String id)
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
    * @return the current instance of <code>ExtensibleType<T></code> 
    */
   public ExtensibleType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
