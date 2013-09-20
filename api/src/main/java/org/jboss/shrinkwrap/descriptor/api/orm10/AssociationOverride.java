package org.jboss.shrinkwrap.descriptor.api.orm10; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> association-override </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface AssociationOverride<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: AssociationOverride ElementName: orm:join-column ElementType : join-column
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>join-column</code> element will be created and returned.
    * Otherwise, the first existing <code>join-column</code> element will be returned.
    * @return the instance defined for the element <code>join-column</code> 
    */
   public JoinColumn<AssociationOverride<T>> getOrCreateJoinColumn();

   /**
    * Creates a new <code>join-column</code> element 
    * @return the new created instance of <code>JoinColumn<AssociationOverride<T>></code> 
    */
   public JoinColumn<AssociationOverride<T>> createJoinColumn();

   /**
    * Returns all <code>join-column</code> elements
    * @return list of <code>join-column</code> 
    */
   public List<JoinColumn<AssociationOverride<T>>> getAllJoinColumn();

   /**
    * Removes all <code>join-column</code> elements 
    * @return the current instance of <code>JoinColumn<AssociationOverride<T>></code> 
    */
   public AssociationOverride<T> removeAllJoinColumn();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: AssociationOverride ElementName: xsd:string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>AssociationOverride<T></code> 
    */
   public AssociationOverride<T> name(String name);

   /**
    * Returns the <code>name</code> attribute
    * @return the value defined for the attribute <code>name</code> 
    */
   public String getName();

   /**
    * Removes the <code>name</code> attribute 
    * @return the current instance of <code>AssociationOverride<T></code> 
    */
   public AssociationOverride<T> removeName();
}
