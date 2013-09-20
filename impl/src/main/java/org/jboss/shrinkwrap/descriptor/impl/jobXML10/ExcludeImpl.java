package org.jboss.shrinkwrap.descriptor.impl.jobXML10; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.Exclude;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> exclude </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class ExcludeImpl<T> implements Child<T>, Exclude<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public ExcludeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public ExcludeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Exclude ElementName: xsd:string ElementType : class
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>class</code> attribute
    * @param clazz the value for the attribute <code>class</code> 
    * @return the current instance of <code>Exclude<T></code> 
    */
   public Exclude<T> clazz(String clazz)
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
    * @return the current instance of <code>Exclude<T></code> 
    */
   public Exclude<T> removeClazzAttr()
   {
      childNode.removeAttribute("class");
      return this;
   }
}
