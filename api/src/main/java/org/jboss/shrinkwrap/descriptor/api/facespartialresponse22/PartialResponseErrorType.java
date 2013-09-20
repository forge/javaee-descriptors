package org.jboss.shrinkwrap.descriptor.api.facespartialresponse22; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> partial-response-errorType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface PartialResponseErrorType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PartialResponseErrorType ElementName: xsd:string ElementType : error-name
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>error-name</code> element
    * @param errorName the value for the element <code>error-name</code> 
    * @return the current instance of <code>PartialResponseErrorType<T></code> 
    */
   public PartialResponseErrorType<T> errorName(String errorName);

   /**
    * Returns the <code>error-name</code> element
    * @return the node defined for the element <code>error-name</code> 
    */
   public String getErrorName();

   /**
    * Removes the <code>error-name</code> element 
    * @return the current instance of <code>PartialResponseErrorType<T></code> 
    */
   public PartialResponseErrorType<T> removeErrorName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PartialResponseErrorType ElementName: xsd:string ElementType : error-message
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>error-message</code> element
    * @param errorMessage the value for the element <code>error-message</code> 
    * @return the current instance of <code>PartialResponseErrorType<T></code> 
    */
   public PartialResponseErrorType<T> errorMessage(String errorMessage);

   /**
    * Returns the <code>error-message</code> element
    * @return the node defined for the element <code>error-message</code> 
    */
   public String getErrorMessage();

   /**
    * Removes the <code>error-message</code> element 
    * @return the current instance of <code>PartialResponseErrorType<T></code> 
    */
   public PartialResponseErrorType<T> removeErrorMessage();
}
