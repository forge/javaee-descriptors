package org.jboss.shrinkwrap.descriptor.api.beans11; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.beans11.Interceptors;
import org.jboss.shrinkwrap.descriptor.api.beans11.Decorators;
import org.jboss.shrinkwrap.descriptor.api.beans11.Alternatives;
import org.jboss.shrinkwrap.descriptor.api.beans11.Scan;
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
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>interceptors</code> element will be created and returned.
    * Otherwise, the first existing <code>interceptors</code> element will be returned.
    * @return the instance defined for the element <code>interceptors</code> 
    */
   public Interceptors<BeansDescriptor> getOrCreateInterceptors();

   /**
    * Creates a new <code>interceptors</code> element 
    * @return the new created instance of <code>Interceptors<BeansDescriptor></code> 
    */
   public Interceptors<BeansDescriptor> createInterceptors();

   /**
    * Returns all <code>interceptors</code> elements
    * @return list of <code>interceptors</code> 
    */
   public List<Interceptors<BeansDescriptor>> getAllInterceptors();

   /**
    * Removes all <code>interceptors</code> elements 
    * @return the current instance of <code>Interceptors<BeansDescriptor></code> 
    */
   public BeansDescriptor removeAllInterceptors();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: BeansDescriptor ElementName: javaee:decorators ElementType : decorators
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>decorators</code> element will be created and returned.
    * Otherwise, the first existing <code>decorators</code> element will be returned.
    * @return the instance defined for the element <code>decorators</code> 
    */
   public Decorators<BeansDescriptor> getOrCreateDecorators();

   /**
    * Creates a new <code>decorators</code> element 
    * @return the new created instance of <code>Decorators<BeansDescriptor></code> 
    */
   public Decorators<BeansDescriptor> createDecorators();

   /**
    * Returns all <code>decorators</code> elements
    * @return list of <code>decorators</code> 
    */
   public List<Decorators<BeansDescriptor>> getAllDecorators();

   /**
    * Removes all <code>decorators</code> elements 
    * @return the current instance of <code>Decorators<BeansDescriptor></code> 
    */
   public BeansDescriptor removeAllDecorators();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: BeansDescriptor ElementName: javaee:alternatives ElementType : alternatives
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>alternatives</code> element will be created and returned.
    * Otherwise, the first existing <code>alternatives</code> element will be returned.
    * @return the instance defined for the element <code>alternatives</code> 
    */
   public Alternatives<BeansDescriptor> getOrCreateAlternatives();

   /**
    * Creates a new <code>alternatives</code> element 
    * @return the new created instance of <code>Alternatives<BeansDescriptor></code> 
    */
   public Alternatives<BeansDescriptor> createAlternatives();

   /**
    * Returns all <code>alternatives</code> elements
    * @return list of <code>alternatives</code> 
    */
   public List<Alternatives<BeansDescriptor>> getAllAlternatives();

   /**
    * Removes all <code>alternatives</code> elements 
    * @return the current instance of <code>Alternatives<BeansDescriptor></code> 
    */
   public BeansDescriptor removeAllAlternatives();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: BeansDescriptor ElementName: javaee:scan ElementType : scan
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>scan</code> element will be created and returned.
    * Otherwise, the first existing <code>scan</code> element will be returned.
    * @return the instance defined for the element <code>scan</code> 
    */
   public Scan<BeansDescriptor> getOrCreateScan();

   /**
    * Creates a new <code>scan</code> element 
    * @return the new created instance of <code>Scan<BeansDescriptor></code> 
    */
   public Scan<BeansDescriptor> createScan();

   /**
    * Returns all <code>scan</code> elements
    * @return list of <code>scan</code> 
    */
   public List<Scan<BeansDescriptor>> getAllScan();

   /**
    * Removes all <code>scan</code> elements 
    * @return the current instance of <code>Scan<BeansDescriptor></code> 
    */
   public BeansDescriptor removeAllScan();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: BeansDescriptor ElementName: xsd:string ElementType : version
   // MaxOccurs: -  isGeneric: false   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of <code>BeansDescriptor</code> 
    */
   public BeansDescriptor version(String version);

   /**
    * Returns the <code>version</code> attribute
    * @return the value defined for the attribute <code>version</code> 
    */
   public String getVersion();

   /**
    * Removes the <code>version</code> attribute 
    * @return the current instance of <code>BeansDescriptor</code> 
    */
   public BeansDescriptor removeVersion();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: BeansDescriptor ElementName: xsd:string ElementType : bean-discovery-mode
   // MaxOccurs: -  isGeneric: false   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>bean-discovery-mode</code> attribute
    * @param beanDiscoveryMode the value for the attribute <code>bean-discovery-mode</code> 
    * @return the current instance of <code>BeansDescriptor</code> 
    */
   public BeansDescriptor beanDiscoveryMode(String beanDiscoveryMode);

   /**
    * Returns the <code>bean-discovery-mode</code> attribute
    * @return the value defined for the attribute <code>bean-discovery-mode</code> 
    */
   public String getBeanDiscoveryMode();

   /**
    * Removes the <code>bean-discovery-mode</code> attribute 
    * @return the current instance of <code>BeansDescriptor</code> 
    */
   public BeansDescriptor removeBeanDiscoveryMode();
}
