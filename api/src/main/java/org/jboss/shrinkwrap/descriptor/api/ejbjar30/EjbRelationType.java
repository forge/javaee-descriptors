package org.jboss.shrinkwrap.descriptor.api.ejbjar30; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> ejb-relationType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface EjbRelationType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbRelationType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>EjbRelationType<T></code> 
    */
   public EjbRelationType<T> description(String ... values);

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>EjbRelationType<T></code> 
    */
   public EjbRelationType<T> removeAllDescription();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbRelationType ElementName: xsd:token ElementType : ejb-relation-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>ejb-relation-name</code> element
    * @param ejbRelationName the value for the element <code>ejb-relation-name</code> 
    * @return the current instance of <code>EjbRelationType<T></code> 
    */
   public EjbRelationType<T> ejbRelationName(String ejbRelationName);

   /**
    * Returns the <code>ejb-relation-name</code> element
    * @return the node defined for the element <code>ejb-relation-name</code> 
    */
   public String getEjbRelationName();

   /**
    * Removes the <code>ejb-relation-name</code> element 
    * @return the current instance of <code>EjbRelationType<T></code> 
    */
   public EjbRelationType<T> removeEjbRelationName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbRelationType ElementName: javaee:ejb-relationship-roleType ElementType : ejb-relationship-role
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>ejb-relationship-role</code> element will be created and returned.
    * Otherwise, the first existing <code>ejb-relationship-role</code> element will be returned.
    * @return the instance defined for the element <code>ejb-relationship-role</code> 
    */
   public EjbRelationshipRoleType<EjbRelationType<T>> getOrCreateEjbRelationshipRole();

   /**
    * Creates a new <code>ejb-relationship-role</code> element 
    * @return the new created instance of <code>EjbRelationshipRoleType<EjbRelationType<T>></code> 
    */
   public EjbRelationshipRoleType<EjbRelationType<T>> createEjbRelationshipRole();

   /**
    * Returns all <code>ejb-relationship-role</code> elements
    * @return list of <code>ejb-relationship-role</code> 
    */
   public List<EjbRelationshipRoleType<EjbRelationType<T>>> getAllEjbRelationshipRole();

   /**
    * Removes all <code>ejb-relationship-role</code> elements 
    * @return the current instance of <code>EjbRelationshipRoleType<EjbRelationType<T>></code> 
    */
   public EjbRelationType<T> removeAllEjbRelationshipRole();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbRelationType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>EjbRelationType<T></code> 
    */
   public EjbRelationType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>EjbRelationType<T></code> 
    */
   public EjbRelationType<T> removeId();
}
