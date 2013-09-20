package org.jboss.shrinkwrap.descriptor.api.ejbjar30; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> application-exceptionType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface ApplicationExceptionType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationExceptionType ElementName: xsd:token ElementType : exception-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>exception-class</code> element
    * @param exceptionClass the value for the element <code>exception-class</code> 
    * @return the current instance of <code>ApplicationExceptionType<T></code> 
    */
   public ApplicationExceptionType<T> exceptionClass(String exceptionClass);

   /**
    * Returns the <code>exception-class</code> element
    * @return the node defined for the element <code>exception-class</code> 
    */
   public String getExceptionClass();

   /**
    * Removes the <code>exception-class</code> element 
    * @return the current instance of <code>ApplicationExceptionType<T></code> 
    */
   public ApplicationExceptionType<T> removeExceptionClass();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationExceptionType ElementName: xsd:boolean ElementType : rollback
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>rollback</code> element
    * @param rollback the value for the element <code>rollback</code> 
    * @return the current instance of <code>ApplicationExceptionType<T></code> 
    */
   public ApplicationExceptionType<T> rollback(Boolean rollback);

   /**
    * Returns the <code>rollback</code> element
    * @return the node defined for the element <code>rollback</code> 
    */
   public Boolean isRollback();

   /**
    * Removes the <code>rollback</code> element 
    * @return the current instance of <code>ApplicationExceptionType<T></code> 
    */
   public ApplicationExceptionType<T> removeRollback();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ApplicationExceptionType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>ApplicationExceptionType<T></code> 
    */
   public ApplicationExceptionType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>ApplicationExceptionType<T></code> 
    */
   public ApplicationExceptionType<T> removeId();
}
