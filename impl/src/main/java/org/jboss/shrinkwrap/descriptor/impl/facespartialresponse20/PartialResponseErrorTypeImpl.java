package org.jboss.shrinkwrap.descriptor.impl.facespartialresponse20; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.facespartialresponse20.PartialResponseErrorType;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> partial-response-errorType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class PartialResponseErrorTypeImpl<T> implements Child<T>, PartialResponseErrorType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public PartialResponseErrorTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public PartialResponseErrorTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PartialResponseErrorType ElementName: xsd:string ElementType : error-name
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>error-name</code> element
    * @param errorName the value for the element <code>error-name</code> 
    * @return the current instance of <code>PartialResponseErrorType<T></code> 
    */
   public PartialResponseErrorType<T> errorName(String errorName)
   {
      childNode.getOrCreate("error-name").text(errorName);
      return this;
   }

   /**
    * Returns the <code>error-name</code> element
    * @return the node defined for the element <code>error-name</code> 
    */
   public String getErrorName()
   {
      return childNode.getTextValueForPatternName("error-name");
   }

   /**
    * Removes the <code>error-name</code> element 
    * @return the current instance of <code>PartialResponseErrorType<T></code> 
    */
   public PartialResponseErrorType<T> removeErrorName()
   {
      childNode.removeChildren("error-name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PartialResponseErrorType ElementName: xsd:string ElementType : error-message
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>error-message</code> element
    * @param errorMessage the value for the element <code>error-message</code> 
    * @return the current instance of <code>PartialResponseErrorType<T></code> 
    */
   public PartialResponseErrorType<T> errorMessage(String errorMessage)
   {
      childNode.getOrCreate("error-message").text(errorMessage);
      return this;
   }

   /**
    * Returns the <code>error-message</code> element
    * @return the node defined for the element <code>error-message</code> 
    */
   public String getErrorMessage()
   {
      return childNode.getTextValueForPatternName("error-message");
   }

   /**
    * Removes the <code>error-message</code> element 
    * @return the current instance of <code>PartialResponseErrorType<T></code> 
    */
   public PartialResponseErrorType<T> removeErrorMessage()
   {
      childNode.removeChildren("error-message");
      return this;
   }
}
