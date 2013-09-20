package org.jboss.shrinkwrap.descriptor.impl.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.ApplicationExceptionType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;

/**
 * This class implements the <code> application-exceptionType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class ApplicationExceptionTypeImpl<T> implements Child<T>, ApplicationExceptionType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public ApplicationExceptionTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public ApplicationExceptionTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationExceptionType ElementName: xsd:token ElementType : exception-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>exception-class</code> element
    * @param exceptionClass the value for the element <code>exception-class</code> 
    * @return the current instance of <code>ApplicationExceptionType<T></code> 
    */
   public ApplicationExceptionType<T> exceptionClass(String exceptionClass)
   {
      childNode.getOrCreate("exception-class").text(exceptionClass);
      return this;
   }

   /**
    * Returns the <code>exception-class</code> element
    * @return the node defined for the element <code>exception-class</code> 
    */
   public String getExceptionClass()
   {
      return childNode.getTextValueForPatternName("exception-class");
   }

   /**
    * Removes the <code>exception-class</code> element 
    * @return the current instance of <code>ApplicationExceptionType<T></code> 
    */
   public ApplicationExceptionType<T> removeExceptionClass()
   {
      childNode.removeChildren("exception-class");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationExceptionType ElementName: javaee:xsdBooleanType ElementType : rollback
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>rollback</code> element
    * @param rollback the value for the element <code>rollback</code> 
    * @return the current instance of <code>ApplicationExceptionType<T></code> 
    */
   public ApplicationExceptionType<T> rollback(Boolean rollback)
   {
      childNode.getOrCreate("rollback").text(rollback);
      return this;
   }

   /**
    * Returns the <code>rollback</code> element
    * @return the node defined for the element <code>rollback</code> 
    */
   public Boolean isRollback()
   {
      return Strings.isTrue(childNode.getTextValueForPatternName("rollback"));
   }

   /**
    * Removes the <code>rollback</code> element 
    * @return the current instance of <code>ApplicationExceptionType<T></code> 
    */
   public ApplicationExceptionType<T> removeRollback()
   {
      childNode.removeChildren("rollback");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationExceptionType ElementName: javaee:xsdBooleanType ElementType : inherited
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>inherited</code> element
    * @param inherited the value for the element <code>inherited</code> 
    * @return the current instance of <code>ApplicationExceptionType<T></code> 
    */
   public ApplicationExceptionType<T> inherited(Boolean inherited)
   {
      childNode.getOrCreate("inherited").text(inherited);
      return this;
   }

   /**
    * Returns the <code>inherited</code> element
    * @return the node defined for the element <code>inherited</code> 
    */
   public Boolean isInherited()
   {
      return Strings.isTrue(childNode.getTextValueForPatternName("inherited"));
   }

   /**
    * Removes the <code>inherited</code> element 
    * @return the current instance of <code>ApplicationExceptionType<T></code> 
    */
   public ApplicationExceptionType<T> removeInherited()
   {
      childNode.removeChildren("inherited");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationExceptionType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>ApplicationExceptionType<T></code> 
    */
   public ApplicationExceptionType<T> id(String id)
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
    * @return the current instance of <code>ApplicationExceptionType<T></code> 
    */
   public ApplicationExceptionType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
