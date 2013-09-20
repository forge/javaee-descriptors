package org.jboss.shrinkwrap.descriptor.api.ejbjar31; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.MultiplicityType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EmptyType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.RelationshipRoleSourceType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.CmrFieldType;
/**
 * This interface defines the contract for the <code> ejb-relationship-roleType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface EjbRelationshipRoleType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbRelationshipRoleType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>EjbRelationshipRoleType<T></code> 
    */
   public EjbRelationshipRoleType<T> description(String ... values);

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>EjbRelationshipRoleType<T></code> 
    */
   public EjbRelationshipRoleType<T> removeAllDescription();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbRelationshipRoleType ElementName: xsd:token ElementType : ejb-relationship-role-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>ejb-relationship-role-name</code> element
    * @param ejbRelationshipRoleName the value for the element <code>ejb-relationship-role-name</code> 
    * @return the current instance of <code>EjbRelationshipRoleType<T></code> 
    */
   public EjbRelationshipRoleType<T> ejbRelationshipRoleName(String ejbRelationshipRoleName);

   /**
    * Returns the <code>ejb-relationship-role-name</code> element
    * @return the node defined for the element <code>ejb-relationship-role-name</code> 
    */
   public String getEjbRelationshipRoleName();

   /**
    * Removes the <code>ejb-relationship-role-name</code> element 
    * @return the current instance of <code>EjbRelationshipRoleType<T></code> 
    */
   public EjbRelationshipRoleType<T> removeEjbRelationshipRoleName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbRelationshipRoleType ElementName: javaee:multiplicityType ElementType : multiplicity
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>multiplicity</code> element
    * @param multiplicity the value for the element <code>multiplicity</code> 
    * @return the current instance of <code>EjbRelationshipRoleType<T></code> 
    */
   public EjbRelationshipRoleType<T> multiplicity(MultiplicityType multiplicity);
   /**
    * Sets the <code>multiplicity</code> element
    * @param multiplicity the value for the element <code>multiplicity</code> 
    * @return the current instance of <code>EjbRelationshipRoleType<T></code> 
    */
   public EjbRelationshipRoleType<T> multiplicity(String multiplicity);

   /**
    * Returns the <code>multiplicity</code> element
    * @return the value found for the element <code>multiplicity</code> 
    */
   public MultiplicityType getMultiplicity();

   /**
    * Returns the <code>multiplicity</code> element
    * @return the value found for the element <code>multiplicity</code> 
    */
   public String  getMultiplicityAsString();

   /**
    * Removes the <code>multiplicity</code> attribute 
    * @return the current instance of <code>EjbRelationshipRoleType<T></code> 
    */
   public EjbRelationshipRoleType<T> removeMultiplicity();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbRelationshipRoleType ElementName: javaee:emptyType ElementType : cascade-delete
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>cascade-delete</code> element 
    * @return the current instance of <code>EjbRelationshipRoleType<T></code> 
    */
   public EjbRelationshipRoleType<T> cascadeDelete();

   /**
    * Removes the <code>cascade-delete</code> element 
    * @return the current instance of <code>EjbRelationshipRoleType<T></code> 
    */
   public Boolean isCascadeDelete();

   /**
    * Removes the <code>cascade-delete</code> element 
    * @return the current instance of <code>EjbRelationshipRoleType<T></code> 
    */
   public EjbRelationshipRoleType<T> removeCascadeDelete();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbRelationshipRoleType ElementName: javaee:relationship-role-sourceType ElementType : relationship-role-source
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>relationship-role-source</code> element with the given value will be created.
    * Otherwise, the existing <code>relationship-role-source</code> element will be returned.
    * @return  a new or existing instance of <code>RelationshipRoleSourceType<EjbRelationshipRoleType<T>></code> 
    */
   public RelationshipRoleSourceType<EjbRelationshipRoleType<T>> getOrCreateRelationshipRoleSource();

   /**
    * Removes the <code>relationship-role-source</code> element 
    * @return the current instance of <code>EjbRelationshipRoleType<T></code> 
    */
   public EjbRelationshipRoleType<T> removeRelationshipRoleSource();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbRelationshipRoleType ElementName: javaee:cmr-fieldType ElementType : cmr-field
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>cmr-field</code> element with the given value will be created.
    * Otherwise, the existing <code>cmr-field</code> element will be returned.
    * @return  a new or existing instance of <code>CmrFieldType<EjbRelationshipRoleType<T>></code> 
    */
   public CmrFieldType<EjbRelationshipRoleType<T>> getOrCreateCmrField();

   /**
    * Removes the <code>cmr-field</code> element 
    * @return the current instance of <code>EjbRelationshipRoleType<T></code> 
    */
   public EjbRelationshipRoleType<T> removeCmrField();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EjbRelationshipRoleType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>EjbRelationshipRoleType<T></code> 
    */
   public EjbRelationshipRoleType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>EjbRelationshipRoleType<T></code> 
    */
   public EjbRelationshipRoleType<T> removeId();
}
