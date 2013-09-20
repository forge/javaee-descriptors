package org.jboss.shrinkwrap.descriptor.impl.webcommon30; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.ErrorPageType;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> error-pageType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class ErrorPageTypeImpl<T> implements Child<T>, ErrorPageType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public ErrorPageTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public ErrorPageTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ErrorPageType ElementName: javaee:xsdPositiveIntegerType ElementType : error-code
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>error-code</code> element
    * @param errorCode the value for the element <code>error-code</code> 
    * @return the current instance of <code>ErrorPageType<T></code> 
    */
   public ErrorPageType<T> errorCode(String errorCode)
   {
      childNode.getOrCreate("error-code").text(errorCode);
      return this;
   }

   /**
    * Returns the <code>error-code</code> element
    * @return the node defined for the element <code>error-code</code> 
    */
   public String getErrorCode()
   {
      return childNode.getTextValueForPatternName("error-code");
   }

   /**
    * Removes the <code>error-code</code> element 
    * @return the current instance of <code>ErrorPageType<T></code> 
    */
   public ErrorPageType<T> removeErrorCode()
   {
      childNode.removeChildren("error-code");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ErrorPageType ElementName: xsd:token ElementType : exception-type
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>exception-type</code> element
    * @param exceptionType the value for the element <code>exception-type</code> 
    * @return the current instance of <code>ErrorPageType<T></code> 
    */
   public ErrorPageType<T> exceptionType(String exceptionType)
   {
      childNode.getOrCreate("exception-type").text(exceptionType);
      return this;
   }

   /**
    * Returns the <code>exception-type</code> element
    * @return the node defined for the element <code>exception-type</code> 
    */
   public String getExceptionType()
   {
      return childNode.getTextValueForPatternName("exception-type");
   }

   /**
    * Removes the <code>exception-type</code> element 
    * @return the current instance of <code>ErrorPageType<T></code> 
    */
   public ErrorPageType<T> removeExceptionType()
   {
      childNode.removeChildren("exception-type");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ErrorPageType ElementName: javaee:string ElementType : location
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>location</code> element
    * @param location the value for the element <code>location</code> 
    * @return the current instance of <code>ErrorPageType<T></code> 
    */
   public ErrorPageType<T> location(String location)
   {
      childNode.getOrCreate("location").text(location);
      return this;
   }

   /**
    * Returns the <code>location</code> element
    * @return the node defined for the element <code>location</code> 
    */
   public String getLocation()
   {
      return childNode.getTextValueForPatternName("location");
   }

   /**
    * Removes the <code>location</code> element 
    * @return the current instance of <code>ErrorPageType<T></code> 
    */
   public ErrorPageType<T> removeLocation()
   {
      childNode.removeChildren("location");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ErrorPageType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>ErrorPageType<T></code> 
    */
   public ErrorPageType<T> id(String id)
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
    * @return the current instance of <code>ErrorPageType<T></code> 
    */
   public ErrorPageType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
