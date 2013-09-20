package org.jboss.shrinkwrap.descriptor.api.persistence10; 

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
 *     PersistenceDescriptor descriptor = Descriptors.create(PersistenceDescriptor.class);
 * </code> 
 *
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface PersistenceDescriptor extends Descriptor, DescriptorNamespace<PersistenceDescriptor>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PersistenceDescriptor ElementName: persistence:persistence-unit ElementType : persistence-unit
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>persistence-unit</code> element will be created and returned.
    * Otherwise, the first existing <code>persistence-unit</code> element will be returned.
    * @return the instance defined for the element <code>persistence-unit</code> 
    */
   public PersistenceUnit<PersistenceDescriptor> getOrCreatePersistenceUnit();

   /**
    * Creates a new <code>persistence-unit</code> element 
    * @return the new created instance of <code>PersistenceUnit<PersistenceDescriptor></code> 
    */
   public PersistenceUnit<PersistenceDescriptor> createPersistenceUnit();

   /**
    * Returns all <code>persistence-unit</code> elements
    * @return list of <code>persistence-unit</code> 
    */
   public List<PersistenceUnit<PersistenceDescriptor>> getAllPersistenceUnit();

   /**
    * Removes all <code>persistence-unit</code> elements 
    * @return the current instance of <code>PersistenceUnit<PersistenceDescriptor></code> 
    */
   public PersistenceDescriptor removeAllPersistenceUnit();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PersistenceDescriptor ElementName: xsd:token ElementType : version
   // MaxOccurs: -  isGeneric: false   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   public static final String VERSION = "1.0";

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of <code>PersistenceDescriptor</code> 
    */
   public PersistenceDescriptor version(String version);

   /**
    * Returns the <code>version</code> attribute
    * @return the value defined for the attribute <code>version</code> 
    */
   public String getVersion();

   /**
    * Removes the <code>version</code> attribute 
    * @return the current instance of <code>PersistenceDescriptor</code> 
    */
   public PersistenceDescriptor removeVersion();
}
