package org.jboss.shrinkwrap.descriptor.api.ejbjar32; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar32.EnterpriseBeansType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar32.InterceptorsType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar32.RelationshipsType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar32.AssemblyDescriptorType;
import org.jboss.shrinkwrap.descriptor.api.javaee7.IconType;
/**
 * This interface defines the contract for the <code> ejb-jarType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface EjbJarType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbJarType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>EjbJarType<T></code> 
    */
   public EjbJarType<T> description(String ... values);

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>EjbJarType<T></code> 
    */
   public EjbJarType<T> removeAllDescription();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbJarType ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>EjbJarType<T></code> 
    */
   public EjbJarType<T> displayName(String ... values);

   /**
    * Returns all <code>display-name</code> elements
    * @return list of <code>display-name</code> 
    */
   public List<String> getAllDisplayName();

   /**
    * Removes the <code>display-name</code> element 
    * @return the current instance of <code>EjbJarType<T></code> 
    */
   public EjbJarType<T> removeAllDisplayName();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbJarType ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<EjbJarType<T>> getOrCreateIcon();

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<EjbJarType<T>></code> 
    */
   public IconType<EjbJarType<T>> createIcon();

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<EjbJarType<T>>> getAllIcon();

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<EjbJarType<T>></code> 
    */
   public EjbJarType<T> removeAllIcon();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbJarType ElementName: xsd:token ElementType : module-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>module-name</code> element
    * @param moduleName the value for the element <code>module-name</code> 
    * @return the current instance of <code>EjbJarType<T></code> 
    */
   public EjbJarType<T> moduleName(String moduleName);

   /**
    * Returns the <code>module-name</code> element
    * @return the node defined for the element <code>module-name</code> 
    */
   public String getModuleName();

   /**
    * Removes the <code>module-name</code> element 
    * @return the current instance of <code>EjbJarType<T></code> 
    */
   public EjbJarType<T> removeModuleName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbJarType ElementName: javaee:enterprise-beansType ElementType : enterprise-beans
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>enterprise-beans</code> element with the given value will be created.
    * Otherwise, the existing <code>enterprise-beans</code> element will be returned.
    * @return  a new or existing instance of <code>EnterpriseBeansType<EjbJarType<T>></code> 
    */
   public EnterpriseBeansType<EjbJarType<T>> getOrCreateEnterpriseBeans();

   /**
    * Removes the <code>enterprise-beans</code> element 
    * @return the current instance of <code>EjbJarType<T></code> 
    */
   public EjbJarType<T> removeEnterpriseBeans();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbJarType ElementName: javaee:interceptorsType ElementType : interceptors
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>interceptors</code> element with the given value will be created.
    * Otherwise, the existing <code>interceptors</code> element will be returned.
    * @return  a new or existing instance of <code>InterceptorsType<EjbJarType<T>></code> 
    */
   public InterceptorsType<EjbJarType<T>> getOrCreateInterceptors();

   /**
    * Removes the <code>interceptors</code> element 
    * @return the current instance of <code>EjbJarType<T></code> 
    */
   public EjbJarType<T> removeInterceptors();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbJarType ElementName: javaee:relationshipsType ElementType : relationships
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>relationships</code> element with the given value will be created.
    * Otherwise, the existing <code>relationships</code> element will be returned.
    * @return  a new or existing instance of <code>RelationshipsType<EjbJarType<T>></code> 
    */
   public RelationshipsType<EjbJarType<T>> getOrCreateRelationships();

   /**
    * Removes the <code>relationships</code> element 
    * @return the current instance of <code>EjbJarType<T></code> 
    */
   public EjbJarType<T> removeRelationships();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbJarType ElementName: javaee:assembly-descriptorType ElementType : assembly-descriptor
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>assembly-descriptor</code> element with the given value will be created.
    * Otherwise, the existing <code>assembly-descriptor</code> element will be returned.
    * @return  a new or existing instance of <code>AssemblyDescriptorType<EjbJarType<T>></code> 
    */
   public AssemblyDescriptorType<EjbJarType<T>> getOrCreateAssemblyDescriptor();

   /**
    * Removes the <code>assembly-descriptor</code> element 
    * @return the current instance of <code>EjbJarType<T></code> 
    */
   public EjbJarType<T> removeAssemblyDescriptor();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbJarType ElementName: xsd:token ElementType : ejb-client-jar
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>ejb-client-jar</code> element
    * @param ejbClientJar the value for the element <code>ejb-client-jar</code> 
    * @return the current instance of <code>EjbJarType<T></code> 
    */
   public EjbJarType<T> ejbClientJar(String ejbClientJar);

   /**
    * Returns the <code>ejb-client-jar</code> element
    * @return the node defined for the element <code>ejb-client-jar</code> 
    */
   public String getEjbClientJar();

   /**
    * Removes the <code>ejb-client-jar</code> element 
    * @return the current instance of <code>EjbJarType<T></code> 
    */
   public EjbJarType<T> removeEjbClientJar();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbJarType ElementName: xsd:token ElementType : version
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   public static final String VERSION = "3.2";

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of <code>EjbJarType<T></code> 
    */
   public EjbJarType<T> version(String version);

   /**
    * Returns the <code>version</code> attribute
    * @return the value defined for the attribute <code>version</code> 
    */
   public String getVersion();

   /**
    * Removes the <code>version</code> attribute 
    * @return the current instance of <code>EjbJarType<T></code> 
    */
   public EjbJarType<T> removeVersion();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbJarType ElementName: xsd:boolean ElementType : metadata-complete
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>metadata-complete</code> attribute
    * @param metadataComplete the value for the attribute <code>metadata-complete</code> 
    * @return the current instance of <code>EjbJarType<T></code> 
    */
   public EjbJarType<T> metadataComplete(Boolean metadataComplete);

   /**
    * Returns the <code>metadata-complete</code> attribute
    * @return the value defined for the attribute <code>metadata-complete</code> 
    */
public Boolean isMetadataComplete();

   /**
    * Removes the <code>metadata-complete</code> attribute 
    * @return the current instance of <code>EjbJarType<T></code> 
    */
   public EjbJarType<T> removeMetadataComplete();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbJarType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>EjbJarType<T></code> 
    */
   public EjbJarType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>EjbJarType<T></code> 
    */
   public EjbJarType<T> removeId();
}
