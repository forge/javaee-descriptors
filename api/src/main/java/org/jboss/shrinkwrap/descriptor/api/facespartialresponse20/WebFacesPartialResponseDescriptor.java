package org.jboss.shrinkwrap.descriptor.api.facespartialresponse20; 

import org.jboss.shrinkwrap.descriptor.api.Descriptor;
import org.jboss.shrinkwrap.descriptor.api.DescriptorNamespace;

/** 
 * <p> 
 * This deployment descriptor provides the functionalities as described in the  specification
 * <p> 
 * Example:
 * <p> 
 * <code> 
 *     WebFacesPartialResponseDescriptor descriptor = Descriptors.create(WebFacesPartialResponseDescriptor.class);
 * </code> 
 *
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface WebFacesPartialResponseDescriptor extends Descriptor, DescriptorNamespace<WebFacesPartialResponseDescriptor>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFacesPartialResponseDescriptor ElementName: javaee:partial-response-changesType ElementType : changes
   // MaxOccurs: -1  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>changes</code> element with the given value will be created.
    * Otherwise, the existing <code>changes</code> element will be returned.
    * @return  a new or existing instance of <code>PartialResponseChangesType<WebFacesPartialResponseDescriptor></code> 
    */
   public PartialResponseChangesType<WebFacesPartialResponseDescriptor> getOrCreateChanges();

   /**
    * Removes the <code>changes</code> element 
    * @return the current instance of <code>WebFacesPartialResponseDescriptor</code> 
    */
   public WebFacesPartialResponseDescriptor removeChanges();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFacesPartialResponseDescriptor ElementName: javaee:partial-response-redirectType ElementType : redirect
   // MaxOccurs: -1  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>redirect</code> element with the given value will be created.
    * Otherwise, the existing <code>redirect</code> element will be returned.
    * @return  a new or existing instance of <code>PartialResponseRedirectType<WebFacesPartialResponseDescriptor></code> 
    */
   public PartialResponseRedirectType<WebFacesPartialResponseDescriptor> getOrCreateRedirect();

   /**
    * Removes the <code>redirect</code> element 
    * @return the current instance of <code>WebFacesPartialResponseDescriptor</code> 
    */
   public WebFacesPartialResponseDescriptor removeRedirect();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebFacesPartialResponseDescriptor ElementName: javaee:partial-response-errorType ElementType : error
   // MaxOccurs: -1  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>error</code> element with the given value will be created.
    * Otherwise, the existing <code>error</code> element will be returned.
    * @return  a new or existing instance of <code>PartialResponseErrorType<WebFacesPartialResponseDescriptor></code> 
    */
   public PartialResponseErrorType<WebFacesPartialResponseDescriptor> getOrCreateError();

   /**
    * Removes the <code>error</code> element 
    * @return the current instance of <code>WebFacesPartialResponseDescriptor</code> 
    */
   public WebFacesPartialResponseDescriptor removeError();
}
