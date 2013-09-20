package org.jboss.shrinkwrap.descriptor.api.javaee7; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee7.InjectionTargetType;
/**
 * This interface defines the contract for the <code> persistence-unit-refType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface PersistenceUnitRefType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PersistenceUnitRefType ElementName: xsd:string ElementType : mapped-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>mapped-name</code> element
    * @param mappedName the value for the element <code>mapped-name</code> 
    * @return the current instance of <code>PersistenceUnitRefType<T></code> 
    */
   public PersistenceUnitRefType<T> mappedName(String mappedName);

   /**
    * Returns the <code>mapped-name</code> element
    * @return the node defined for the element <code>mapped-name</code> 
    */
   public String getMappedName();

   /**
    * Removes the <code>mapped-name</code> element 
    * @return the current instance of <code>PersistenceUnitRefType<T></code> 
    */
   public PersistenceUnitRefType<T> removeMappedName();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PersistenceUnitRefType ElementName: javaee:injection-targetType ElementType : injection-target
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>injection-target</code> element will be created and returned.
    * Otherwise, the first existing <code>injection-target</code> element will be returned.
    * @return the instance defined for the element <code>injection-target</code> 
    */
   public InjectionTargetType<PersistenceUnitRefType<T>> getOrCreateInjectionTarget();

   /**
    * Creates a new <code>injection-target</code> element 
    * @return the new created instance of <code>InjectionTargetType<PersistenceUnitRefType<T>></code> 
    */
   public InjectionTargetType<PersistenceUnitRefType<T>> createInjectionTarget();

   /**
    * Returns all <code>injection-target</code> elements
    * @return list of <code>injection-target</code> 
    */
   public List<InjectionTargetType<PersistenceUnitRefType<T>>> getAllInjectionTarget();

   /**
    * Removes all <code>injection-target</code> elements 
    * @return the current instance of <code>InjectionTargetType<PersistenceUnitRefType<T>></code> 
    */
   public PersistenceUnitRefType<T> removeAllInjectionTarget();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PersistenceUnitRefType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>PersistenceUnitRefType<T></code> 
    */
   public PersistenceUnitRefType<T> description(String ... values);

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>PersistenceUnitRefType<T></code> 
    */
   public PersistenceUnitRefType<T> removeAllDescription();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PersistenceUnitRefType ElementName: xsd:token ElementType : persistence-unit-ref-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>persistence-unit-ref-name</code> element
    * @param persistenceUnitRefName the value for the element <code>persistence-unit-ref-name</code> 
    * @return the current instance of <code>PersistenceUnitRefType<T></code> 
    */
   public PersistenceUnitRefType<T> persistenceUnitRefName(String persistenceUnitRefName);

   /**
    * Returns the <code>persistence-unit-ref-name</code> element
    * @return the node defined for the element <code>persistence-unit-ref-name</code> 
    */
   public String getPersistenceUnitRefName();

   /**
    * Removes the <code>persistence-unit-ref-name</code> element 
    * @return the current instance of <code>PersistenceUnitRefType<T></code> 
    */
   public PersistenceUnitRefType<T> removePersistenceUnitRefName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PersistenceUnitRefType ElementName: xsd:token ElementType : persistence-unit-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>persistence-unit-name</code> element
    * @param persistenceUnitName the value for the element <code>persistence-unit-name</code> 
    * @return the current instance of <code>PersistenceUnitRefType<T></code> 
    */
   public PersistenceUnitRefType<T> persistenceUnitName(String persistenceUnitName);

   /**
    * Returns the <code>persistence-unit-name</code> element
    * @return the node defined for the element <code>persistence-unit-name</code> 
    */
   public String getPersistenceUnitName();

   /**
    * Removes the <code>persistence-unit-name</code> element 
    * @return the current instance of <code>PersistenceUnitRefType<T></code> 
    */
   public PersistenceUnitRefType<T> removePersistenceUnitName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PersistenceUnitRefType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>PersistenceUnitRefType<T></code> 
    */
   public PersistenceUnitRefType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>PersistenceUnitRefType<T></code> 
    */
   public PersistenceUnitRefType<T> removeId();
}
