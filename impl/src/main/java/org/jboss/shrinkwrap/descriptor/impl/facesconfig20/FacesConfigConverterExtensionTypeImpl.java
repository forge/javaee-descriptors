package org.jboss.shrinkwrap.descriptor.impl.facesconfig20; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.facesconfig20.FacesConfigConverterExtensionType;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> faces-config-converter-extensionType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class FacesConfigConverterExtensionTypeImpl<T> implements Child<T>, FacesConfigConverterExtensionType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public FacesConfigConverterExtensionTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public FacesConfigConverterExtensionTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FacesConfigConverterExtensionType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>FacesConfigConverterExtensionType<T></code> 
    */
   public FacesConfigConverterExtensionType<T> id(String id)
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
    * @return the current instance of <code>FacesConfigConverterExtensionType<T></code> 
    */
   public FacesConfigConverterExtensionType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
