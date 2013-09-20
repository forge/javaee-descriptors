package org.jboss.shrinkwrap.descriptor.api.permissions7; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.permissions7.Permission;
import org.jboss.shrinkwrap.descriptor.api.Descriptor;
import org.jboss.shrinkwrap.descriptor.api.DescriptorNamespace;

/** 
 * <p> 
 * This deployment descriptor provides the functionalities as described in the  specification
 * <p> 
 * Example:
 * <p> 
 * <code> 
 *     PermissionsDescriptor descriptor = Descriptors.create(PermissionsDescriptor.class);
 * </code> 
 *
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface PermissionsDescriptor extends Descriptor, DescriptorNamespace<PermissionsDescriptor>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PermissionsDescriptor ElementName: permissions:permission ElementType : permission
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>permission</code> element will be created and returned.
    * Otherwise, the first existing <code>permission</code> element will be returned.
    * @return the instance defined for the element <code>permission</code> 
    */
   public Permission<PermissionsDescriptor> getOrCreatePermission();

   /**
    * Creates a new <code>permission</code> element 
    * @return the new created instance of <code>Permission<PermissionsDescriptor></code> 
    */
   public Permission<PermissionsDescriptor> createPermission();

   /**
    * Returns all <code>permission</code> elements
    * @return list of <code>permission</code> 
    */
   public List<Permission<PermissionsDescriptor>> getAllPermission();

   /**
    * Removes all <code>permission</code> elements 
    * @return the current instance of <code>Permission<PermissionsDescriptor></code> 
    */
   public PermissionsDescriptor removeAllPermission();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PermissionsDescriptor ElementName: xsd:token ElementType : version
   // MaxOccurs: -  isGeneric: false   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   public static final String VERSION = "7";

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of <code>PermissionsDescriptor</code> 
    */
   public PermissionsDescriptor version(String version);

   /**
    * Returns the <code>version</code> attribute
    * @return the value defined for the attribute <code>version</code> 
    */
   public String getVersion();

   /**
    * Removes the <code>version</code> attribute 
    * @return the current instance of <code>PermissionsDescriptor</code> 
    */
   public PermissionsDescriptor removeVersion();
}
