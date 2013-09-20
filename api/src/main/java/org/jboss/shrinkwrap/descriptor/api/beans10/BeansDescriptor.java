package org.jboss.shrinkwrap.descriptor.api.beans10; 

import org.jboss.shrinkwrap.descriptor.api.Descriptor;
import org.jboss.shrinkwrap.descriptor.api.DescriptorNamespace;

/** 
 * <p> 
 * This deployment descriptor provides the functionalities as described in the  specification
 * <p> 
 * Example:
 * <p> 
 * <code> 
 *     BeansDescriptor descriptor = Descriptors.create(BeansDescriptor.class);
 * </code> 
 *
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface BeansDescriptor extends Descriptor, DescriptorNamespace<BeansDescriptor>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: BeansDescriptor ElementName: javaee:interceptors ElementType : interceptors
   // MaxOccurs: -  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>interceptors</code> element with the given value will be created.
    * Otherwise, the existing <code>interceptors</code> element will be returned.
    * @return  a new or existing instance of <code>Interceptors<BeansDescriptor></code> 
    */
   public Interceptors<BeansDescriptor> getOrCreateInterceptors();

   /**
    * Removes the <code>interceptors</code> element 
    * @return the current instance of <code>BeansDescriptor</code> 
    */
   public BeansDescriptor removeInterceptors();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: BeansDescriptor ElementName: javaee:decorators ElementType : decorators
   // MaxOccurs: -  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>decorators</code> element with the given value will be created.
    * Otherwise, the existing <code>decorators</code> element will be returned.
    * @return  a new or existing instance of <code>Decorators<BeansDescriptor></code> 
    */
   public Decorators<BeansDescriptor> getOrCreateDecorators();

   /**
    * Removes the <code>decorators</code> element 
    * @return the current instance of <code>BeansDescriptor</code> 
    */
   public BeansDescriptor removeDecorators();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: BeansDescriptor ElementName: javaee:alternatives ElementType : alternatives
   // MaxOccurs: -  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>alternatives</code> element with the given value will be created.
    * Otherwise, the existing <code>alternatives</code> element will be returned.
    * @return  a new or existing instance of <code>Alternatives<BeansDescriptor></code> 
    */
   public Alternatives<BeansDescriptor> getOrCreateAlternatives();

   /**
    * Removes the <code>alternatives</code> element 
    * @return the current instance of <code>BeansDescriptor</code> 
    */
   public BeansDescriptor removeAlternatives();
}
