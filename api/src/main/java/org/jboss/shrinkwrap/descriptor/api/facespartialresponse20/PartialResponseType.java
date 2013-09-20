package org.jboss.shrinkwrap.descriptor.api.facespartialresponse20; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.facespartialresponse20.PartialResponseChangesType;
import org.jboss.shrinkwrap.descriptor.api.facespartialresponse20.PartialResponseRedirectType;
import org.jboss.shrinkwrap.descriptor.api.facespartialresponse20.PartialResponseErrorType;
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
}
