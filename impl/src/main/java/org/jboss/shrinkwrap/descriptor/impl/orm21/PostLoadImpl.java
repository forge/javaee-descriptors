package org.jboss.shrinkwrap.descriptor.impl.orm21; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.orm21.PostLoad;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> post-load </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class PostLoadImpl<T> implements Child<T>, PostLoad<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public PostLoadImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public PostLoadImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PostLoad ElementName: xsd:string ElementType : description
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>description</code> element
    * @param description the value for the element <code>description</code> 
    * @return the current instance of <code>PostLoad<T></code> 
    */
   public PostLoad<T> description(String description)
   {
      childNode.getOrCreate("description").text(description);
      return this;
   }

   /**
    * Returns the <code>description</code> element
    * @return the node defined for the element <code>description</code> 
    */
   public String getDescription()
   {
      return childNode.getTextValueForPatternName("description");
   }

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>PostLoad<T></code> 
    */
   public PostLoad<T> removeDescription()
   {
      childNode.removeChildren("description");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PostLoad ElementName: xsd:string ElementType : method-name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>method-name</code> attribute
    * @param methodName the value for the attribute <code>method-name</code> 
    * @return the current instance of <code>PostLoad<T></code> 
    */
   public PostLoad<T> methodName(String methodName)
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
    * @return the current instance of <code>PostLoad<T></code> 
    */
   public PostLoad<T> removeMethodName()
   {
      childNode.removeAttribute("method-name");
      return this;
   }
}
