package org.jboss.shrinkwrap.descriptor.api.javaee6; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> resource-env-refType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface ResourceEnvRefType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ResourceEnvRefType ElementName: xsd:string ElementType : lookup-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>lookup-name</code> element
    * @param lookupName the value for the element <code>lookup-name</code> 
    * @return the current instance of <code>ResourceEnvRefType<T></code> 
    */
   public ResourceEnvRefType<T> lookupName(String lookupName);

   /**
    * Returns the <code>lookup-name</code> element
    * @return the node defined for the element <code>lookup-name</code> 
    */
   public String getLookupName();

   /**
    * Removes the <code>lookup-name</code> element 
    * @return the current instance of <code>ResourceEnvRefType<T></code> 
    */
   public ResourceEnvRefType<T> removeLookupName();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ResourceEnvRefType ElementName: xsd:string ElementType : mapped-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>mapped-name</code> element
    * @param mappedName the value for the element <code>mapped-name</code> 
    * @return the current instance of <code>ResourceEnvRefType<T></code> 
    */
   public ResourceEnvRefType<T> mappedName(String mappedName);

   /**
    * Returns the <code>mapped-name</code> element
    * @return the node defined for the element <code>mapped-name</code> 
    */
   public String getMappedName();

   /**
    * Removes the <code>mapped-name</code> element 
    * @return the current instance of <code>ResourceEnvRefType<T></code> 
    */
   public ResourceEnvRefType<T> removeMappedName();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ResourceEnvRefType ElementName: javaee:injection-targetType ElementType : injection-target
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>injection-target</code> element will be created and returned.
    * Otherwise, the first existing <code>injection-target</code> element will be returned.
    * @return the instance defined for the element <code>injection-target</code> 
    */
   public InjectionTargetType<ResourceEnvRefType<T>> getOrCreateInjectionTarget();

   /**
    * Creates a new <code>injection-target</code> element 
    * @return the new created instance of <code>InjectionTargetType<ResourceEnvRefType<T>></code> 
    */
   public InjectionTargetType<ResourceEnvRefType<T>> createInjectionTarget();

   /**
    * Returns all <code>injection-target</code> elements
    * @return list of <code>injection-target</code> 
    */
   public List<InjectionTargetType<ResourceEnvRefType<T>>> getAllInjectionTarget();

   /**
    * Removes all <code>injection-target</code> elements 
    * @return the current instance of <code>InjectionTargetType<ResourceEnvRefType<T>></code> 
    */
   public ResourceEnvRefType<T> removeAllInjectionTarget();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ResourceEnvRefType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>ResourceEnvRefType<T></code> 
    */
   public ResourceEnvRefType<T> description(String ... values);

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>ResourceEnvRefType<T></code> 
    */
   public ResourceEnvRefType<T> removeAllDescription();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ResourceEnvRefType ElementName: xsd:token ElementType : resource-env-ref-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>resource-env-ref-name</code> element
    * @param resourceEnvRefName the value for the element <code>resource-env-ref-name</code> 
    * @return the current instance of <code>ResourceEnvRefType<T></code> 
    */
   public ResourceEnvRefType<T> resourceEnvRefName(String resourceEnvRefName);

   /**
    * Returns the <code>resource-env-ref-name</code> element
    * @return the node defined for the element <code>resource-env-ref-name</code> 
    */
   public String getResourceEnvRefName();

   /**
    * Removes the <code>resource-env-ref-name</code> element 
    * @return the current instance of <code>ResourceEnvRefType<T></code> 
    */
   public ResourceEnvRefType<T> removeResourceEnvRefName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ResourceEnvRefType ElementName: xsd:token ElementType : resource-env-ref-type
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>resource-env-ref-type</code> element
    * @param resourceEnvRefType the value for the element <code>resource-env-ref-type</code> 
    * @return the current instance of <code>ResourceEnvRefType<T></code> 
    */
   public ResourceEnvRefType<T> resourceEnvRefType(String resourceEnvRefType);

   /**
    * Returns the <code>resource-env-ref-type</code> element
    * @return the node defined for the element <code>resource-env-ref-type</code> 
    */
   public String getResourceEnvRefType();

   /**
    * Removes the <code>resource-env-ref-type</code> element 
    * @return the current instance of <code>ResourceEnvRefType<T></code> 
    */
   public ResourceEnvRefType<T> removeResourceEnvRefType();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ResourceEnvRefType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>ResourceEnvRefType<T></code> 
    */
   public ResourceEnvRefType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>ResourceEnvRefType<T></code> 
    */
   public ResourceEnvRefType<T> removeId();
}
