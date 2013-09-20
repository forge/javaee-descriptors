package org.jboss.shrinkwrap.descriptor.api.webcommon31; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> form-login-configType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface FormLoginConfigType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FormLoginConfigType ElementName: javaee:string ElementType : form-login-page
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>form-login-page</code> element
    * @param formLoginPage the value for the element <code>form-login-page</code> 
    * @return the current instance of <code>FormLoginConfigType<T></code> 
    */
   public FormLoginConfigType<T> formLoginPage(String formLoginPage);

   /**
    * Returns the <code>form-login-page</code> element
    * @return the node defined for the element <code>form-login-page</code> 
    */
   public String getFormLoginPage();

   /**
    * Removes the <code>form-login-page</code> element 
    * @return the current instance of <code>FormLoginConfigType<T></code> 
    */
   public FormLoginConfigType<T> removeFormLoginPage();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FormLoginConfigType ElementName: javaee:string ElementType : form-error-page
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>form-error-page</code> element
    * @param formErrorPage the value for the element <code>form-error-page</code> 
    * @return the current instance of <code>FormLoginConfigType<T></code> 
    */
   public FormLoginConfigType<T> formErrorPage(String formErrorPage);

   /**
    * Returns the <code>form-error-page</code> element
    * @return the node defined for the element <code>form-error-page</code> 
    */
   public String getFormErrorPage();

   /**
    * Removes the <code>form-error-page</code> element 
    * @return the current instance of <code>FormLoginConfigType<T></code> 
    */
   public FormLoginConfigType<T> removeFormErrorPage();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: FormLoginConfigType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>FormLoginConfigType<T></code> 
    */
   public FormLoginConfigType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>FormLoginConfigType<T></code> 
    */
   public FormLoginConfigType<T> removeId();
}
