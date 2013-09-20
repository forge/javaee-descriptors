package org.jboss.shrinkwrap.descriptor.api.orm10; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> many-to-one </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface ManyToOne<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ManyToOne ElementName: orm:join-column ElementType : join-column
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>join-column</code> element will be created and returned.
    * Otherwise, the first existing <code>join-column</code> element will be returned.
    * @return the instance defined for the element <code>join-column</code> 
    */
   public JoinColumn<ManyToOne<T>> getOrCreateJoinColumn();

   /**
    * Creates a new <code>join-column</code> element 
    * @return the new created instance of <code>JoinColumn<ManyToOne<T>></code> 
    */
   public JoinColumn<ManyToOne<T>> createJoinColumn();

   /**
    * Returns all <code>join-column</code> elements
    * @return list of <code>join-column</code> 
    */
   public List<JoinColumn<ManyToOne<T>>> getAllJoinColumn();

   /**
    * Removes all <code>join-column</code> elements 
    * @return the current instance of <code>JoinColumn<ManyToOne<T>></code> 
    */
   public ManyToOne<T> removeAllJoinColumn();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ManyToOne ElementName: orm:join-table ElementType : join-table
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>join-table</code> element with the given value will be created.
    * Otherwise, the existing <code>join-table</code> element will be returned.
    * @return  a new or existing instance of <code>JoinTable<ManyToOne<T>></code> 
    */
   public JoinTable<ManyToOne<T>> getOrCreateJoinTable();

   /**
    * Removes the <code>join-table</code> element 
    * @return the current instance of <code>ManyToOne<T></code> 
    */
   public ManyToOne<T> removeJoinTable();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ManyToOne ElementName: orm:cascade-type ElementType : cascade
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>cascade</code> element with the given value will be created.
    * Otherwise, the existing <code>cascade</code> element will be returned.
    * @return  a new or existing instance of <code>CascadeType<ManyToOne<T>></code> 
    */
   public CascadeType<ManyToOne<T>> getOrCreateCascade();

   /**
    * Removes the <code>cascade</code> element 
    * @return the current instance of <code>ManyToOne<T></code> 
    */
   public ManyToOne<T> removeCascade();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ManyToOne ElementName: xsd:string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>ManyToOne<T></code> 
    */
   public ManyToOne<T> name(String name);

   /**
    * Returns the <code>name</code> attribute
    * @return the value defined for the attribute <code>name</code> 
    */
   public String getName();

   /**
    * Removes the <code>name</code> attribute 
    * @return the current instance of <code>ManyToOne<T></code> 
    */
   public ManyToOne<T> removeName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ManyToOne ElementName: xsd:string ElementType : target-entity
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>target-entity</code> attribute
    * @param targetEntity the value for the attribute <code>target-entity</code> 
    * @return the current instance of <code>ManyToOne<T></code> 
    */
   public ManyToOne<T> targetEntity(String targetEntity);

   /**
    * Returns the <code>target-entity</code> attribute
    * @return the value defined for the attribute <code>target-entity</code> 
    */
   public String getTargetEntity();

   /**
    * Removes the <code>target-entity</code> attribute 
    * @return the current instance of <code>ManyToOne<T></code> 
    */
   public ManyToOne<T> removeTargetEntity();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ManyToOne ElementName: orm:fetch-type ElementType : fetch
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>fetch</code> attribute
    * @param fetch the value for the attribute <code>fetch</code> 
    * @return the current instance of <code>ManyToOne<T></code> 
    */
   public ManyToOne<T> fetch(FetchType fetch);

   /**
    * Sets the <code>fetch</code> attribute
    * @param fetch the value for the attribute <code>fetch</code> 
    * @return the current instance of <code>ManyToOne<T></code> 
    */
   public ManyToOne<T> fetch(String fetch);

   /**
    * Returns the <code>fetch</code> attribute
    * @return the value defined for the attribute <code>fetch</code> 
    */
public FetchType getFetch();

   /**
    * Returns the <code>fetch</code> attribute
    * @return the value found for the element <code>fetch</code> 
    */
   public String  getFetchAsString();

   /**
    * Removes the <code>fetch</code> attribute 
    * @return the current instance of <code>ManyToOne<T></code> 
    */
   public ManyToOne<T> removeFetch();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ManyToOne ElementName: xsd:boolean ElementType : optional
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>optional</code> attribute
    * @param optional the value for the attribute <code>optional</code> 
    * @return the current instance of <code>ManyToOne<T></code> 
    */
   public ManyToOne<T> optional(Boolean optional);

   /**
    * Returns the <code>optional</code> attribute
    * @return the value defined for the attribute <code>optional</code> 
    */
public Boolean isOptional();

   /**
    * Removes the <code>optional</code> attribute 
    * @return the current instance of <code>ManyToOne<T></code> 
    */
   public ManyToOne<T> removeOptional();
}
