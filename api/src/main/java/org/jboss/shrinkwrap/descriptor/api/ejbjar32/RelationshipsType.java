package org.jboss.shrinkwrap.descriptor.api.ejbjar32; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar32.EjbRelationType;
/**
 * This interface defines the contract for the <code> relationshipsType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface RelationshipsType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: RelationshipsType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>RelationshipsType<T></code> 
    */
   public RelationshipsType<T> description(String ... values);

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>RelationshipsType<T></code> 
    */
   public RelationshipsType<T> removeAllDescription();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: RelationshipsType ElementName: javaee:ejb-relationType ElementType : ejb-relation
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>ejb-relation</code> element will be created and returned.
    * Otherwise, the first existing <code>ejb-relation</code> element will be returned.
    * @return the instance defined for the element <code>ejb-relation</code> 
    */
   public EjbRelationType<RelationshipsType<T>> getOrCreateEjbRelation();

   /**
    * Creates a new <code>ejb-relation</code> element 
    * @return the new created instance of <code>EjbRelationType<RelationshipsType<T>></code> 
    */
   public EjbRelationType<RelationshipsType<T>> createEjbRelation();

   /**
    * Returns all <code>ejb-relation</code> elements
    * @return list of <code>ejb-relation</code> 
    */
   public List<EjbRelationType<RelationshipsType<T>>> getAllEjbRelation();

   /**
    * Removes all <code>ejb-relation</code> elements 
    * @return the current instance of <code>EjbRelationType<RelationshipsType<T>></code> 
    */
   public RelationshipsType<T> removeAllEjbRelation();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: RelationshipsType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>RelationshipsType<T></code> 
    */
   public RelationshipsType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>RelationshipsType<T></code> 
    */
   public RelationshipsType<T> removeId();
}
