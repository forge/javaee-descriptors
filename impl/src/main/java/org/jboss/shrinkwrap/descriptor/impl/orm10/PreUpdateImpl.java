package org.jboss.shrinkwrap.descriptor.impl.orm10; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.orm10.PreUpdate;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> pre-update </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class PreUpdateImpl<T> implements Child<T>, PreUpdate<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public PreUpdateImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public PreUpdateImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PreUpdate ElementName: xsd:string ElementType : method-name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>method-name</code> attribute
    * @param methodName the value for the attribute <code>method-name</code> 
    * @return the current instance of <code>PreUpdate<T></code> 
    */
   public PreUpdate<T> methodName(String methodName)
   {
      childNode.attribute("method-name", methodName);
      return this;
   }

   /**
    * Returns the <code>method-name</code> attribute
    * @return the value defined for the attribute <code>method-name</code> 
    */
      public String getMethodName()
   {
      return childNode.getAttribute("method-name");
   }

   /**
    * Removes the <code>method-name</code> attribute 
    * @return the current instance of <code>PreUpdate<T></code> 
    */
   public PreUpdate<T> removeMethodName()
   {
      childNode.removeAttribute("method-name");
      return this;
   }
}
