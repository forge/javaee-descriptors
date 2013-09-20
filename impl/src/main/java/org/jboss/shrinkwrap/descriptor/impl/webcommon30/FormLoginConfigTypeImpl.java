package org.jboss.shrinkwrap.descriptor.impl.webcommon30; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.webcommon30.FormLoginConfigType;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> form-login-configType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class FormLoginConfigTypeImpl<T> implements Child<T>, FormLoginConfigType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public FormLoginConfigTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public FormLoginConfigTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FormLoginConfigType ElementName: javaee:string ElementType : form-login-page
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>form-login-page</code> element
    * @param formLoginPage the value for the element <code>form-login-page</code> 
    * @return the current instance of <code>FormLoginConfigType<T></code> 
    */
   public FormLoginConfigType<T> formLoginPage(String formLoginPage)
   {
      childNode.getOrCreate("form-login-page").text(formLoginPage);
      return this;
   }

   /**
    * Returns the <code>form-login-page</code> element
    * @return the node defined for the element <code>form-login-page</code> 
    */
   public String getFormLoginPage()
   {
      return childNode.getTextValueForPatternName("form-login-page");
   }

   /**
    * Removes the <code>form-login-page</code> element 
    * @return the current instance of <code>FormLoginConfigType<T></code> 
    */
   public FormLoginConfigType<T> removeFormLoginPage()
   {
      childNode.removeChildren("form-login-page");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FormLoginConfigType ElementName: javaee:string ElementType : form-error-page
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>form-error-page</code> element
    * @param formErrorPage the value for the element <code>form-error-page</code> 
    * @return the current instance of <code>FormLoginConfigType<T></code> 
    */
   public FormLoginConfigType<T> formErrorPage(String formErrorPage)
   {
      childNode.getOrCreate("form-error-page").text(formErrorPage);
      return this;
   }

   /**
    * Returns the <code>form-error-page</code> element
    * @return the node defined for the element <code>form-error-page</code> 
    */
   public String getFormErrorPage()
   {
      return childNode.getTextValueForPatternName("form-error-page");
   }

   /**
    * Removes the <code>form-error-page</code> element 
    * @return the current instance of <code>FormLoginConfigType<T></code> 
    */
   public FormLoginConfigType<T> removeFormErrorPage()
   {
      childNode.removeChildren("form-error-page");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FormLoginConfigType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>FormLoginConfigType<T></code> 
    */
   public FormLoginConfigType<T> id(String id)
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
    * @return the current instance of <code>FormLoginConfigType<T></code> 
    */
   public FormLoginConfigType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
