package org.jboss.shrinkwrap.descriptor.api.facespartialresponse22; 

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> partial-responseType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface PartialResponseType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PartialResponseType ElementName: javaee:partial-response-changesType ElementType : changes
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>changes</code> element with the given value will be created.
    * Otherwise, the existing <code>changes</code> element will be returned.
    * @return  a new or existing instance of <code>PartialResponseChangesType<PartialResponseType<T>></code> 
    */
   public PartialResponseChangesType<PartialResponseType<T>> getOrCreateChanges();

   /**
    * Removes the <code>changes</code> element 
    * @return the current instance of <code>PartialResponseType<T></code> 
    */
   public PartialResponseType<T> removeChanges();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PartialResponseType ElementName: javaee:partial-response-redirectType ElementType : redirect
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>redirect</code> element with the given value will be created.
    * Otherwise, the existing <code>redirect</code> element will be returned.
    * @return  a new or existing instance of <code>PartialResponseRedirectType<PartialResponseType<T>></code> 
    */
   public PartialResponseRedirectType<PartialResponseType<T>> getOrCreateRedirect();

   /**
    * Removes the <code>redirect</code> element 
    * @return the current instance of <code>PartialResponseType<T></code> 
    */
   public PartialResponseType<T> removeRedirect();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PartialResponseType ElementName: javaee:partial-response-errorType ElementType : error
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>error</code> element with the given value will be created.
    * Otherwise, the existing <code>error</code> element will be returned.
    * @return  a new or existing instance of <code>PartialResponseErrorType<PartialResponseType<T>></code> 
    */
   public PartialResponseErrorType<PartialResponseType<T>> getOrCreateError();

   /**
    * Removes the <code>error</code> element 
    * @return the current instance of <code>PartialResponseType<T></code> 
    */
   public PartialResponseType<T> removeError();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PartialResponseType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>PartialResponseType<T></code> 
    */
   public PartialResponseType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>PartialResponseType<T></code> 
    */
   public PartialResponseType<T> removeId();
}
