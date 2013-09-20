package org.jboss.shrinkwrap.descriptor.api.ejbjar30; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Descriptor;
import org.jboss.shrinkwrap.descriptor.api.DescriptorNamespace;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;

/** 
 * <p> 
 * This deployment descriptor provides the functionalities as described in the  specification
 * <p> 
 * Example:
 * <p> 
 * <code> 
 *     EjbJarDescriptor descriptor = Descriptors.create(EjbJarDescriptor.class);
 * </code> 
 *
 *
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface EjbJarDescriptor extends Descriptor, DescriptorNamespace<EjbJarDescriptor>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbJarDescriptor ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>EjbJarDescriptor</code> 
    */
   public EjbJarDescriptor description(String ... values);

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>EjbJarDescriptor</code> 
    */
   public EjbJarDescriptor removeAllDescription();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbJarDescriptor ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>EjbJarDescriptor</code> 
    */
   public EjbJarDescriptor displayName(String ... values);

   /**
    * Returns all <code>display-name</code> elements
    * @return list of <code>display-name</code> 
    */
   public List<String> getAllDisplayName();

   /**
    * Removes the <code>display-name</code> element 
    * @return the current instance of <code>EjbJarDescriptor</code> 
    */
   public EjbJarDescriptor removeAllDisplayName();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbJarDescriptor ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<EjbJarDescriptor> getOrCreateIcon();

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<EjbJarDescriptor></code> 
    */
   public IconType<EjbJarDescriptor> createIcon();

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<EjbJarDescriptor>> getAllIcon();

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<EjbJarDescriptor></code> 
    */
   public EjbJarDescriptor removeAllIcon();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbJarDescriptor ElementName: javaee:enterprise-beansType ElementType : enterprise-beans
   // MaxOccurs: -  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>enterprise-beans</code> element with the given value will be created.
    * Otherwise, the existing <code>enterprise-beans</code> element will be returned.
    * @return  a new or existing instance of <code>EnterpriseBeansType<EjbJarDescriptor></code> 
    */
   public EnterpriseBeansType<EjbJarDescriptor> getOrCreateEnterpriseBeans();

   /**
    * Removes the <code>enterprise-beans</code> element 
    * @return the current instance of <code>EjbJarDescriptor</code> 
    */
   public EjbJarDescriptor removeEnterpriseBeans();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbJarDescriptor ElementName: javaee:interceptorsType ElementType : interceptors
   // MaxOccurs: -  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>interceptors</code> element with the given value will be created.
    * Otherwise, the existing <code>interceptors</code> element will be returned.
    * @return  a new or existing instance of <code>InterceptorsType<EjbJarDescriptor></code> 
    */
   public InterceptorsType<EjbJarDescriptor> getOrCreateInterceptors();

   /**
    * Removes the <code>interceptors</code> element 
    * @return the current instance of <code>EjbJarDescriptor</code> 
    */
   public EjbJarDescriptor removeInterceptors();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbJarDescriptor ElementName: javaee:relationshipsType ElementType : relationships
   // MaxOccurs: -  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>relationships</code> element with the given value will be created.
    * Otherwise, the existing <code>relationships</code> element will be returned.
    * @return  a new or existing instance of <code>RelationshipsType<EjbJarDescriptor></code> 
    */
   public RelationshipsType<EjbJarDescriptor> getOrCreateRelationships();

   /**
    * Removes the <code>relationships</code> element 
    * @return the current instance of <code>EjbJarDescriptor</code> 
    */
   public EjbJarDescriptor removeRelationships();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbJarDescriptor ElementName: javaee:assembly-descriptorType ElementType : assembly-descriptor
   // MaxOccurs: -  isGeneric: false   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>assembly-descriptor</code> element with the given value will be created.
    * Otherwise, the existing <code>assembly-descriptor</code> element will be returned.
    * @return  a new or existing instance of <code>AssemblyDescriptorType<EjbJarDescriptor></code> 
    */
   public AssemblyDescriptorType<EjbJarDescriptor> getOrCreateAssemblyDescriptor();

   /**
    * Removes the <code>assembly-descriptor</code> element 
    * @return the current instance of <code>EjbJarDescriptor</code> 
    */
   public EjbJarDescriptor removeAssemblyDescriptor();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbJarDescriptor ElementName: xsd:token ElementType : ejb-client-jar
   // MaxOccurs: -  isGeneric: false   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>ejb-client-jar</code> element
    * @param ejbClientJar the value for the element <code>ejb-client-jar</code> 
    * @return the current instance of <code>EjbJarDescriptor</code> 
    */
   public EjbJarDescriptor ejbClientJar(String ejbClientJar);

   /**
    * Returns the <code>ejb-client-jar</code> element
    * @return the node defined for the element <code>ejb-client-jar</code> 
    */
   public String getEjbClientJar();

   /**
    * Removes the <code>ejb-client-jar</code> element 
    * @return the current instance of <code>EjbJarDescriptor</code> 
    */
   public EjbJarDescriptor removeEjbClientJar();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbJarDescriptor ElementName: xsd:token ElementType : version
   // MaxOccurs: -  isGeneric: false   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   public static final String VERSION = "3.0";

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of <code>EjbJarDescriptor</code> 
    */
   public EjbJarDescriptor version(String version);

   /**
    * Returns the <code>version</code> attribute
    * @return the value defined for the attribute <code>version</code> 
    */
   public String getVersion();

   /**
    * Removes the <code>version</code> attribute 
    * @return the current instance of <code>EjbJarDescriptor</code> 
    */
   public EjbJarDescriptor removeVersion();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbJarDescriptor ElementName: xsd:boolean ElementType : metadata-complete
   // MaxOccurs: -  isGeneric: false   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>metadata-complete</code> attribute
    * @param metadataComplete the value for the attribute <code>metadata-complete</code> 
    * @return the current instance of <code>EjbJarDescriptor</code> 
    */
   public EjbJarDescriptor metadataComplete(Boolean metadataComplete);

   /**
    * Returns the <code>metadata-complete</code> attribute
    * @return the value defined for the attribute <code>metadata-complete</code> 
    */
public Boolean isMetadataComplete();

   /**
    * Removes the <code>metadata-complete</code> attribute 
    * @return the current instance of <code>EjbJarDescriptor</code> 
    */
   public EjbJarDescriptor removeMetadataComplete();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbJarDescriptor ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: false   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>EjbJarDescriptor</code> 
    */
   public EjbJarDescriptor id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>EjbJarDescriptor</code> 
    */
   public EjbJarDescriptor removeId();
}
