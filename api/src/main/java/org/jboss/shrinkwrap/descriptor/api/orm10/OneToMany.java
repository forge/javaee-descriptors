package org.jboss.shrinkwrap.descriptor.api.orm10; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> one-to-many </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface OneToMany<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OneToMany ElementName: xsd:string ElementType : order-by
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>order-by</code> element
    * @param orderBy the value for the element <code>order-by</code> 
    * @return the current instance of <code>OneToMany<T></code> 
    */
   public OneToMany<T> orderBy(String orderBy);

   /**
    * Returns the <code>order-by</code> element
    * @return the node defined for the element <code>order-by</code> 
    */
   public String getOrderBy();

   /**
    * Removes the <code>order-by</code> element 
    * @return the current instance of <code>OneToMany<T></code> 
    */
   public OneToMany<T> removeOrderBy();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OneToMany ElementName: orm:map-key ElementType : map-key
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>map-key</code> element with the given value will be created.
    * Otherwise, the existing <code>map-key</code> element will be returned.
    * @return  a new or existing instance of <code>MapKey<OneToMany<T>></code> 
    */
   public MapKey<OneToMany<T>> getOrCreateMapKey();

   /**
    * Removes the <code>map-key</code> element 
    * @return the current instance of <code>OneToMany<T></code> 
    */
   public OneToMany<T> removeMapKey();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OneToMany ElementName: orm:join-table ElementType : join-table
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>join-table</code> element with the given value will be created.
    * Otherwise, the existing <code>join-table</code> element will be returned.
    * @return  a new or existing instance of <code>JoinTable<OneToMany<T>></code> 
    */
   public JoinTable<OneToMany<T>> getOrCreateJoinTable();

   /**
    * Removes the <code>join-table</code> element 
    * @return the current instance of <code>OneToMany<T></code> 
    */
   public OneToMany<T> removeJoinTable();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OneToMany ElementName: orm:join-column ElementType : join-column
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>join-column</code> element will be created and returned.
    * Otherwise, the first existing <code>join-column</code> element will be returned.
    * @return the instance defined for the element <code>join-column</code> 
    */
   public JoinColumn<OneToMany<T>> getOrCreateJoinColumn();

   /**
    * Creates a new <code>join-column</code> element 
    * @return the new created instance of <code>JoinColumn<OneToMany<T>></code> 
    */
   public JoinColumn<OneToMany<T>> createJoinColumn();

   /**
    * Returns all <code>join-column</code> elements
    * @return list of <code>join-column</code> 
    */
   public List<JoinColumn<OneToMany<T>>> getAllJoinColumn();

   /**
    * Removes all <code>join-column</code> elements 
    * @return the current instance of <code>JoinColumn<OneToMany<T>></code> 
    */
   public OneToMany<T> removeAllJoinColumn();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OneToMany ElementName: orm:cascade-type ElementType : cascade
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>cascade</code> element with the given value will be created.
    * Otherwise, the existing <code>cascade</code> element will be returned.
    * @return  a new or existing instance of <code>CascadeType<OneToMany<T>></code> 
    */
   public CascadeType<OneToMany<T>> getOrCreateCascade();

   /**
    * Removes the <code>cascade</code> element 
    * @return the current instance of <code>OneToMany<T></code> 
    */
   public OneToMany<T> removeCascade();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OneToMany ElementName: xsd:string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>OneToMany<T></code> 
    */
   public OneToMany<T> name(String name);

   /**
    * Returns the <code>name</code> attribute
    * @return the value defined for the attribute <code>name</code> 
    */
   public String getName();

   /**
    * Removes the <code>name</code> attribute 
    * @return the current instance of <code>OneToMany<T></code> 
    */
   public OneToMany<T> removeName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OneToMany ElementName: xsd:string ElementType : target-entity
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>target-entity</code> attribute
    * @param targetEntity the value for the attribute <code>target-entity</code> 
    * @return the current instance of <code>OneToMany<T></code> 
    */
   public OneToMany<T> targetEntity(String targetEntity);

   /**
    * Returns the <code>target-entity</code> attribute
    * @return the value defined for the attribute <code>target-entity</code> 
    */
   public String getTargetEntity();

   /**
    * Removes the <code>target-entity</code> attribute 
    * @return the current instance of <code>OneToMany<T></code> 
    */
   public OneToMany<T> removeTargetEntity();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OneToMany ElementName: orm:fetch-type ElementType : fetch
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>fetch</code> attribute
    * @param fetch the value for the attribute <code>fetch</code> 
    * @return the current instance of <code>OneToMany<T></code> 
    */
   public OneToMany<T> fetch(FetchType fetch);

   /**
    * Sets the <code>fetch</code> attribute
    * @param fetch the value for the attribute <code>fetch</code> 
    * @return the current instance of <code>OneToMany<T></code> 
    */
   public OneToMany<T> fetch(String fetch);

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
    * @return the current instance of <code>OneToMany<T></code> 
    */
   public OneToMany<T> removeFetch();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OneToMany ElementName: xsd:string ElementType : mapped-by
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>mapped-by</code> attribute
    * @param mappedBy the value for the attribute <code>mapped-by</code> 
    * @return the current instance of <code>OneToMany<T></code> 
    */
   public OneToMany<T> mappedBy(String mappedBy);

   /**
    * Returns the <code>mapped-by</code> attribute
    * @return the value defined for the attribute <code>mapped-by</code> 
    */
   public String getMappedBy();

   /**
    * Removes the <code>mapped-by</code> attribute 
    * @return the current instance of <code>OneToMany<T></code> 
    */
   public OneToMany<T> removeMappedBy();
}
