package org.jboss.shrinkwrap.descriptor.api.orm10; 

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> many-to-many </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface ManyToMany<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ManyToMany ElementName: xsd:string ElementType : order-by
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>order-by</code> element
    * @param orderBy the value for the element <code>order-by</code> 
    * @return the current instance of <code>ManyToMany<T></code> 
    */
   public ManyToMany<T> orderBy(String orderBy);

   /**
    * Returns the <code>order-by</code> element
    * @return the node defined for the element <code>order-by</code> 
    */
   public String getOrderBy();

   /**
    * Removes the <code>order-by</code> element 
    * @return the current instance of <code>ManyToMany<T></code> 
    */
   public ManyToMany<T> removeOrderBy();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ManyToMany ElementName: orm:map-key ElementType : map-key
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>map-key</code> element with the given value will be created.
    * Otherwise, the existing <code>map-key</code> element will be returned.
    * @return  a new or existing instance of <code>MapKey<ManyToMany<T>></code> 
    */
   public MapKey<ManyToMany<T>> getOrCreateMapKey();

   /**
    * Removes the <code>map-key</code> element 
    * @return the current instance of <code>ManyToMany<T></code> 
    */
   public ManyToMany<T> removeMapKey();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ManyToMany ElementName: orm:join-table ElementType : join-table
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>join-table</code> element with the given value will be created.
    * Otherwise, the existing <code>join-table</code> element will be returned.
    * @return  a new or existing instance of <code>JoinTable<ManyToMany<T>></code> 
    */
   public JoinTable<ManyToMany<T>> getOrCreateJoinTable();

   /**
    * Removes the <code>join-table</code> element 
    * @return the current instance of <code>ManyToMany<T></code> 
    */
   public ManyToMany<T> removeJoinTable();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ManyToMany ElementName: orm:cascade-type ElementType : cascade
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>cascade</code> element with the given value will be created.
    * Otherwise, the existing <code>cascade</code> element will be returned.
    * @return  a new or existing instance of <code>CascadeType<ManyToMany<T>></code> 
    */
   public CascadeType<ManyToMany<T>> getOrCreateCascade();

   /**
    * Removes the <code>cascade</code> element 
    * @return the current instance of <code>ManyToMany<T></code> 
    */
   public ManyToMany<T> removeCascade();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ManyToMany ElementName: xsd:string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>ManyToMany<T></code> 
    */
   public ManyToMany<T> name(String name);

   /**
    * Returns the <code>name</code> attribute
    * @return the value defined for the attribute <code>name</code> 
    */
   public String getName();

   /**
    * Removes the <code>name</code> attribute 
    * @return the current instance of <code>ManyToMany<T></code> 
    */
   public ManyToMany<T> removeName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ManyToMany ElementName: xsd:string ElementType : target-entity
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>target-entity</code> attribute
    * @param targetEntity the value for the attribute <code>target-entity</code> 
    * @return the current instance of <code>ManyToMany<T></code> 
    */
   public ManyToMany<T> targetEntity(String targetEntity);

   /**
    * Returns the <code>target-entity</code> attribute
    * @return the value defined for the attribute <code>target-entity</code> 
    */
   public String getTargetEntity();

   /**
    * Removes the <code>target-entity</code> attribute 
    * @return the current instance of <code>ManyToMany<T></code> 
    */
   public ManyToMany<T> removeTargetEntity();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ManyToMany ElementName: orm:fetch-type ElementType : fetch
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>fetch</code> attribute
    * @param fetch the value for the attribute <code>fetch</code> 
    * @return the current instance of <code>ManyToMany<T></code> 
    */
   public ManyToMany<T> fetch(FetchType fetch);

   /**
    * Sets the <code>fetch</code> attribute
    * @param fetch the value for the attribute <code>fetch</code> 
    * @return the current instance of <code>ManyToMany<T></code> 
    */
   public ManyToMany<T> fetch(String fetch);

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
    * @return the current instance of <code>ManyToMany<T></code> 
    */
   public ManyToMany<T> removeFetch();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ManyToMany ElementName: xsd:string ElementType : mapped-by
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>mapped-by</code> attribute
    * @param mappedBy the value for the attribute <code>mapped-by</code> 
    * @return the current instance of <code>ManyToMany<T></code> 
    */
   public ManyToMany<T> mappedBy(String mappedBy);

   /**
    * Returns the <code>mapped-by</code> attribute
    * @return the value defined for the attribute <code>mapped-by</code> 
    */
   public String getMappedBy();

   /**
    * Removes the <code>mapped-by</code> attribute 
    * @return the current instance of <code>ManyToMany<T></code> 
    */
   public ManyToMany<T> removeMappedBy();
}
