package org.jboss.shrinkwrap.descriptor.impl.orm20; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.orm20.PostRemove;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> post-remove </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class PostRemoveImpl<T> implements Child<T>, PostRemove<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public PostRemoveImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public PostRemoveImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PostRemove ElementName: xsd:string ElementType : description
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>description</code> element
    * @param description the value for the element <code>description</code> 
    * @return the current instance of <code>PostRemove<T></code> 
    */
   public PostRemove<T> description(String description)
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
    * @return the current instance of <code>PostRemove<T></code> 
    */
   public PostRemove<T> removeDescription()
   {
      childNode.removeChildren("description");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PostRemove ElementName: xsd:string ElementType : method-name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>method-name</code> attribute
    * @param methodName the value for the attribute <code>method-name</code> 
    * @return the current instance of <code>PostRemove<T></code> 
    */
   public PostRemove<T> methodName(String methodName)
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
    * @return the current instance of <code>PostRemove<T></code> 
    */
   public PostRemove<T> removeMethodName()
   {
      childNode.removeAttribute("method-name");
      return this;
   }
}
