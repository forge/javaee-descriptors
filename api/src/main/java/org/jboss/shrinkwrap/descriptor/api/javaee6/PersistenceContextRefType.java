package org.jboss.shrinkwrap.descriptor.api.javaee6; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.PersistenceContextTypeType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.PropertyType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.InjectionTargetType;
/**
 * This interface defines the contract for the <code> persistence-context-refType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface PersistenceContextRefType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PersistenceContextRefType ElementName: xsd:string ElementType : mapped-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>mapped-name</code> element
    * @param mappedName the value for the element <code>mapped-name</code> 
    * @return the current instance of <code>PersistenceContextRefType<T></code> 
    */
   public PersistenceContextRefType<T> mappedName(String mappedName);

   /**
    * Returns the <code>mapped-name</code> element
    * @return the node defined for the element <code>mapped-name</code> 
    */
   public String getMappedName();

   /**
    * Removes the <code>mapped-name</code> element 
    * @return the current instance of <code>PersistenceContextRefType<T></code> 
    */
   public PersistenceContextRefType<T> removeMappedName();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PersistenceContextRefType ElementName: javaee:injection-targetType ElementType : injection-target
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>injection-target</code> element will be created and returned.
    * Otherwise, the first existing <code>injection-target</code> element will be returned.
    * @return the instance defined for the element <code>injection-target</code> 
    */
   public InjectionTargetType<PersistenceContextRefType<T>> getOrCreateInjectionTarget();

   /**
    * Creates a new <code>injection-target</code> element 
    * @return the new created instance of <code>InjectionTargetType<PersistenceContextRefType<T>></code> 
    */
   public InjectionTargetType<PersistenceContextRefType<T>> createInjectionTarget();

   /**
    * Returns all <code>injection-target</code> elements
    * @return list of <code>injection-target</code> 
    */
   public List<InjectionTargetType<PersistenceContextRefType<T>>> getAllInjectionTarget();

   /**
    * Removes all <code>injection-target</code> elements 
    * @return the current instance of <code>InjectionTargetType<PersistenceContextRefType<T>></code> 
    */
   public PersistenceContextRefType<T> removeAllInjectionTarget();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PersistenceContextRefType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>PersistenceContextRefType<T></code> 
    */
   public PersistenceContextRefType<T> description(String ... values);

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>PersistenceContextRefType<T></code> 
    */
   public PersistenceContextRefType<T> removeAllDescription();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PersistenceContextRefType ElementName: xsd:token ElementType : persistence-context-ref-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>persistence-context-ref-name</code> element
    * @param persistenceContextRefName the value for the element <code>persistence-context-ref-name</code> 
    * @return the current instance of <code>PersistenceContextRefType<T></code> 
    */
   public PersistenceContextRefType<T> persistenceContextRefName(String persistenceContextRefName);

   /**
    * Returns the <code>persistence-context-ref-name</code> element
    * @return the node defined for the element <code>persistence-context-ref-name</code> 
    */
   public String getPersistenceContextRefName();

   /**
    * Removes the <code>persistence-context-ref-name</code> element 
    * @return the current instance of <code>PersistenceContextRefType<T></code> 
    */
   public PersistenceContextRefType<T> removePersistenceContextRefName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PersistenceContextRefType ElementName: xsd:token ElementType : persistence-unit-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>persistence-unit-name</code> element
    * @param persistenceUnitName the value for the element <code>persistence-unit-name</code> 
    * @return the current instance of <code>PersistenceContextRefType<T></code> 
    */
   public PersistenceContextRefType<T> persistenceUnitName(String persistenceUnitName);

   /**
    * Returns the <code>persistence-unit-name</code> element
    * @return the node defined for the element <code>persistence-unit-name</code> 
    */
   public String getPersistenceUnitName();

   /**
    * Removes the <code>persistence-unit-name</code> element 
    * @return the current instance of <code>PersistenceContextRefType<T></code> 
    */
   public PersistenceContextRefType<T> removePersistenceUnitName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PersistenceContextRefType ElementName: javaee:persistence-context-typeType ElementType : persistence-context-type
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>persistence-context-type</code> element
    * @param persistenceContextType the value for the element <code>persistence-context-type</code> 
    * @return the current instance of <code>PersistenceContextRefType<T></code> 
    */
   public PersistenceContextRefType<T> persistenceContextType(PersistenceContextTypeType persistenceContextType);
   /**
    * Sets the <code>persistence-context-type</code> element
    * @param persistenceContextType the value for the element <code>persistence-context-type</code> 
    * @return the current instance of <code>PersistenceContextRefType<T></code> 
    */
   public PersistenceContextRefType<T> persistenceContextType(String persistenceContextType);

   /**
    * Returns the <code>persistence-context-type</code> element
    * @return the value found for the element <code>persistence-context-type</code> 
    */
   public PersistenceContextTypeType getPersistenceContextType();

   /**
    * Returns the <code>persistence-context-type</code> element
    * @return the value found for the element <code>persistence-context-type</code> 
    */
   public String  getPersistenceContextTypeAsString();

   /**
    * Removes the <code>persistence-context-type</code> attribute 
    * @return the current instance of <code>PersistenceContextRefType<T></code> 
    */
   public PersistenceContextRefType<T> removePersistenceContextType();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PersistenceContextRefType ElementName: javaee:propertyType ElementType : persistence-property
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>persistence-property</code> element will be created and returned.
    * Otherwise, the first existing <code>persistence-property</code> element will be returned.
    * @return the instance defined for the element <code>persistence-property</code> 
    */
   public PropertyType<PersistenceContextRefType<T>> getOrCreatePersistenceProperty();

   /**
    * Creates a new <code>persistence-property</code> element 
    * @return the new created instance of <code>PropertyType<PersistenceContextRefType<T>></code> 
    */
   public PropertyType<PersistenceContextRefType<T>> createPersistenceProperty();

   /**
    * Returns all <code>persistence-property</code> elements
    * @return list of <code>persistence-property</code> 
    */
   public List<PropertyType<PersistenceContextRefType<T>>> getAllPersistenceProperty();

   /**
    * Removes all <code>persistence-property</code> elements 
    * @return the current instance of <code>PropertyType<PersistenceContextRefType<T>></code> 
    */
   public PersistenceContextRefType<T> removeAllPersistenceProperty();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PersistenceContextRefType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>PersistenceContextRefType<T></code> 
    */
   public PersistenceContextRefType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>PersistenceContextRefType<T></code> 
    */
   public PersistenceContextRefType<T> removeId();
}
