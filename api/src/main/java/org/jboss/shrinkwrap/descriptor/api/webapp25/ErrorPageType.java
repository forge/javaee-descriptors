package org.jboss.shrinkwrap.descriptor.api.webapp25; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.webcommon.ErrorPageCommonType;
/**
 * This interface defines the contract for the <code> error-pageType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface ErrorPageType<T> extends Child<T>, ErrorPageCommonType<T, ErrorPageType<T>>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ErrorPageType ElementName: javaee:xsdPositiveIntegerType ElementType : error-code
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>error-code</code> element
    * @param errorCode the value for the element <code>error-code</code> 
    * @return the current instance of <code>ErrorPageType<T></code> 
    */
   public ErrorPageType<T> errorCode(String errorCode);

   /**
    * Returns the <code>error-code</code> element
    * @return the node defined for the element <code>error-code</code> 
    */
   public String getErrorCode();

   /**
    * Removes the <code>error-code</code> element 
    * @return the current instance of <code>ErrorPageType<T></code> 
    */
   public ErrorPageType<T> removeErrorCode();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ErrorPageType ElementName: xsd:token ElementType : exception-type
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>exception-type</code> element
    * @param exceptionType the value for the element <code>exception-type</code> 
    * @return the current instance of <code>ErrorPageType<T></code> 
    */
   public ErrorPageType<T> exceptionType(String exceptionType);

   /**
    * Returns the <code>exception-type</code> element
    * @return the node defined for the element <code>exception-type</code> 
    */
   public String getExceptionType();

   /**
    * Removes the <code>exception-type</code> element 
    * @return the current instance of <code>ErrorPageType<T></code> 
    */
   public ErrorPageType<T> removeExceptionType();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ErrorPageType ElementName: javaee:string ElementType : location
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>location</code> element
    * @param location the value for the element <code>location</code> 
    * @return the current instance of <code>ErrorPageType<T></code> 
    */
   public ErrorPageType<T> location(String location);

   /**
    * Returns the <code>location</code> element
    * @return the node defined for the element <code>location</code> 
    */
   public String getLocation();

   /**
    * Removes the <code>location</code> element 
    * @return the current instance of <code>ErrorPageType<T></code> 
    */
   public ErrorPageType<T> removeLocation();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ErrorPageType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>ErrorPageType<T></code> 
    */
   public ErrorPageType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>ErrorPageType<T></code> 
    */
   public ErrorPageType<T> removeId();
}
