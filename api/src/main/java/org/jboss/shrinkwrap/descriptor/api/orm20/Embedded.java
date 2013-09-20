package org.jboss.shrinkwrap.descriptor.api.orm20; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> embedded </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface Embedded<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Embedded ElementName: orm:attribute-override ElementType : attribute-override
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>attribute-override</code> element will be created and returned.
    * Otherwise, the first existing <code>attribute-override</code> element will be returned.
    * @return the instance defined for the element <code>attribute-override</code> 
    */
   public AttributeOverride<Embedded<T>> getOrCreateAttributeOverride();

   /**
    * Creates a new <code>attribute-override</code> element 
    * @return the new created instance of <code>AttributeOverride<Embedded<T>></code> 
    */
   public AttributeOverride<Embedded<T>> createAttributeOverride();

   /**
    * Returns all <code>attribute-override</code> elements
    * @return list of <code>attribute-override</code> 
    */
   public List<AttributeOverride<Embedded<T>>> getAllAttributeOverride();

   /**
    * Removes all <code>attribute-override</code> elements 
    * @return the current instance of <code>AttributeOverride<Embedded<T>></code> 
    */
   public Embedded<T> removeAllAttributeOverride();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Embedded ElementName: orm:association-override ElementType : association-override
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>association-override</code> element will be created and returned.
    * Otherwise, the first existing <code>association-override</code> element will be returned.
    * @return the instance defined for the element <code>association-override</code> 
    */
   public AssociationOverride<Embedded<T>> getOrCreateAssociationOverride();

   /**
    * Creates a new <code>association-override</code> element 
    * @return the new created instance of <code>AssociationOverride<Embedded<T>></code> 
    */
   public AssociationOverride<Embedded<T>> createAssociationOverride();

   /**
    * Returns all <code>association-override</code> elements
    * @return list of <code>association-override</code> 
    */
   public List<AssociationOverride<Embedded<T>>> getAllAssociationOverride();

   /**
    * Removes all <code>association-override</code> elements 
    * @return the current instance of <code>AssociationOverride<Embedded<T>></code> 
    */
   public Embedded<T> removeAllAssociationOverride();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Embedded ElementName: xsd:string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>Embedded<T></code> 
    */
   public Embedded<T> name(String name);

   /**
    * Returns the <code>name</code> attribute
    * @return the value defined for the attribute <code>name</code> 
    */
   public String getName();

   /**
    * Removes the <code>name</code> attribute 
    * @return the current instance of <code>Embedded<T></code> 
    */
   public Embedded<T> removeName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Embedded ElementName: orm:access-type ElementType : access
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>access</code> attribute
    * @param access the value for the attribute <code>access</code> 
    * @return the current instance of <code>Embedded<T></code> 
    */
   public Embedded<T> access(AccessType access);

   /**
    * Sets the <code>access</code> attribute
    * @param access the value for the attribute <code>access</code> 
    * @return the current instance of <code>Embedded<T></code> 
    */
   public Embedded<T> access(String access);

   /**
    * Returns the <code>access</code> attribute
    * @return the value defined for the attribute <code>access</code> 
    */
public AccessType getAccess();

   /**
    * Returns the <code>access</code> attribute
    * @return the value found for the element <code>access</code> 
    */
   public String  getAccessAsString();

   /**
    * Removes the <code>access</code> attribute 
    * @return the current instance of <code>Embedded<T></code> 
    */
   public Embedded<T> removeAccess();
}
