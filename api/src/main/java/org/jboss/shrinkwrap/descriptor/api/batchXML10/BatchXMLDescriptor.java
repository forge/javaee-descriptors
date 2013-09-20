package org.jboss.shrinkwrap.descriptor.api.batchXML10; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Descriptor;
import org.jboss.shrinkwrap.descriptor.api.DescriptorNamespace;

/** 
 * <p> 
 * This deployment descriptor provides the functionalities as described in the  specification
 * <p> 
 * Example:
 * <p> 
 * <code> 
 *     BatchXMLDescriptor descriptor = Descriptors.create(BatchXMLDescriptor.class);
 * </code> 
 *
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface BatchXMLDescriptor extends Descriptor, DescriptorNamespace<BatchXMLDescriptor>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: BatchXMLDescriptor ElementName: jbatch:BatchArtifactRef ElementType : ref
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>ref</code> element will be created and returned.
    * Otherwise, the first existing <code>ref</code> element will be returned.
    * @return the instance defined for the element <code>ref</code> 
    */
   public BatchArtifactRef<BatchXMLDescriptor> getOrCreateRef();

   /**
    * Creates a new <code>ref</code> element 
    * @return the new created instance of <code>BatchArtifactRef<BatchXMLDescriptor></code> 
    */
   public BatchArtifactRef<BatchXMLDescriptor> createRef();

   /**
    * Returns all <code>ref</code> elements
    * @return list of <code>ref</code> 
    */
   public List<BatchArtifactRef<BatchXMLDescriptor>> getAllRef();

   /**
    * Removes all <code>ref</code> elements 
    * @return the current instance of <code>BatchArtifactRef<BatchXMLDescriptor></code> 
    */
   public BatchXMLDescriptor removeAllRef();
}
