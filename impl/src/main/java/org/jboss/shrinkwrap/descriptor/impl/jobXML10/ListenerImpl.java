package org.jboss.shrinkwrap.descriptor.impl.jobXML10; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.Listener;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.Properties;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> Listener </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class ListenerImpl<T> implements Child<T>, Listener<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public ListenerImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public ListenerImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Listener ElementName: jsl:Properties ElementType : properties
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>properties</code> element with the given value will be created.
    * Otherwise, the existing <code>properties</code> element will be returned.
    * @return  a new or existing instance of <code>Properties<Listener<T>></code> 
    */
   public Properties<Listener<T>> getOrCreateProperties()
   {
      Node node = childNode.getOrCreate("properties");
      Properties<Listener<T>> properties = new PropertiesImpl<Listener<T>>(this, "properties", childNode, node);
      return properties;
   }

   /**
    * Removes the <code>properties</code> element 
    * @return the current instance of <code>Listener<T></code> 
    */
   public Listener<T> removeProperties()
   {
      childNode.removeChildren("properties");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Listener ElementName: xsd:string ElementType : ref
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>ref</code> attribute
    * @param ref the value for the attribute <code>ref</code> 
    * @return the current instance of <code>Listener<T></code> 
    */
   public Listener<T> ref(String ref)
   {
      childNode.attribute("ref", ref);
      return this;
   }

   /**
    * Returns the <code>ref</code> attribute
    * @return the value defined for the attribute <code>ref</code> 
    */
      public String getRef()
   {
      return childNode.getAttribute("ref");
   }

   /**
    * Removes the <code>ref</code> attribute 
    * @return the current instance of <code>Listener<T></code> 
    */
   public Listener<T> removeRef()
   {
      childNode.removeAttribute("ref");
      return this;
   }
}
