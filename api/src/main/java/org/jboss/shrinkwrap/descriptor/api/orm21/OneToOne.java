package org.jboss.shrinkwrap.descriptor.api.orm21; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> one-to-one </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface OneToOne<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OneToOne ElementName: orm:primary-key-join-column ElementType : primary-key-join-column
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>primary-key-join-column</code> element will be created and returned.
    * Otherwise, the first existing <code>primary-key-join-column</code> element will be returned.
    * @return the instance defined for the element <code>primary-key-join-column</code> 
    */
   public PrimaryKeyJoinColumn<OneToOne<T>> getOrCreatePrimaryKeyJoinColumn();

   /**
    * Creates a new <code>primary-key-join-column</code> element 
    * @return the new created instance of <code>PrimaryKeyJoinColumn<OneToOne<T>></code> 
    */
   public PrimaryKeyJoinColumn<OneToOne<T>> createPrimaryKeyJoinColumn();

   /**
    * Returns all <code>primary-key-join-column</code> elements
    * @return list of <code>primary-key-join-column</code> 
    */
   public List<PrimaryKeyJoinColumn<OneToOne<T>>> getAllPrimaryKeyJoinColumn();

   /**
    * Removes all <code>primary-key-join-column</code> elements 
    * @return the current instance of <code>PrimaryKeyJoinColumn<OneToOne<T>></code> 
    */
   public OneToOne<T> removeAllPrimaryKeyJoinColumn();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OneToOne ElementName: orm:foreign-key ElementType : primary-key-foreign-key
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>primary-key-foreign-key</code> element with the given value will be created.
    * Otherwise, the existing <code>primary-key-foreign-key</code> element will be returned.
    * @return  a new or existing instance of <code>ForeignKey<OneToOne<T>></code> 
    */
   public ForeignKey<OneToOne<T>> getOrCreatePrimaryKeyForeignKey();

   /**
    * Removes the <code>primary-key-foreign-key</code> element 
    * @return the current instance of <code>OneToOne<T></code> 
    */
   public OneToOne<T> removePrimaryKeyForeignKey();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OneToOne ElementName: orm:join-column ElementType : join-column
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>join-column</code> element will be created and returned.
    * Otherwise, the first existing <code>join-column</code> element will be returned.
    * @return the instance defined for the element <code>join-column</code> 
    */
   public JoinColumn<OneToOne<T>> getOrCreateJoinColumn();

   /**
    * Creates a new <code>join-column</code> element 
    * @return the new created instance of <code>JoinColumn<OneToOne<T>></code> 
    */
   public JoinColumn<OneToOne<T>> createJoinColumn();

   /**
    * Returns all <code>join-column</code> elements
    * @return list of <code>join-column</code> 
    */
   public List<JoinColumn<OneToOne<T>>> getAllJoinColumn();

   /**
    * Removes all <code>join-column</code> elements 
    * @return the current instance of <code>JoinColumn<OneToOne<T>></code> 
    */
   public OneToOne<T> removeAllJoinColumn();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OneToOne ElementName: orm:foreign-key ElementType : foreign-key
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>foreign-key</code> element with the given value will be created.
    * Otherwise, the existing <code>foreign-key</code> element will be returned.
    * @return  a new or existing instance of <code>ForeignKey<OneToOne<T>></code> 
    */
   public ForeignKey<OneToOne<T>> getOrCreateForeignKey();

   /**
    * Removes the <code>foreign-key</code> element 
    * @return the current instance of <code>OneToOne<T></code> 
    */
   public OneToOne<T> removeForeignKey();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OneToOne ElementName: orm:join-table ElementType : join-table
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>join-table</code> element with the given value will be created.
    * Otherwise, the existing <code>join-table</code> element will be returned.
    * @return  a new or existing instance of <code>JoinTable<OneToOne<T>></code> 
    */
   public JoinTable<OneToOne<T>> getOrCreateJoinTable();

   /**
    * Removes the <code>join-table</code> element 
    * @return the current instance of <code>OneToOne<T></code> 
    */
   public OneToOne<T> removeJoinTable();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OneToOne ElementName: orm:cascade-type ElementType : cascade
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>cascade</code> element with the given value will be created.
    * Otherwise, the existing <code>cascade</code> element will be returned.
    * @return  a new or existing instance of <code>CascadeType<OneToOne<T>></code> 
    */
   public CascadeType<OneToOne<T>> getOrCreateCascade();

   /**
    * Removes the <code>cascade</code> element 
    * @return the current instance of <code>OneToOne<T></code> 
    */
   public OneToOne<T> removeCascade();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OneToOne ElementName: xsd:string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>OneToOne<T></code> 
    */
   public OneToOne<T> name(String name);

   /**
    * Returns the <code>name</code> attribute
    * @return the value defined for the attribute <code>name</code> 
    */
   public String getName();

   /**
    * Removes the <code>name</code> attribute 
    * @return the current instance of <code>OneToOne<T></code> 
    */
   public OneToOne<T> removeName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OneToOne ElementName: xsd:string ElementType : target-entity
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>target-entity</code> attribute
    * @param targetEntity the value for the attribute <code>target-entity</code> 
    * @return the current instance of <code>OneToOne<T></code> 
    */
   public OneToOne<T> targetEntity(String targetEntity);

   /**
    * Returns the <code>target-entity</code> attribute
    * @return the value defined for the attribute <code>target-entity</code> 
    */
   public String getTargetEntity();

   /**
    * Removes the <code>target-entity</code> attribute 
    * @return the current instance of <code>OneToOne<T></code> 
    */
   public OneToOne<T> removeTargetEntity();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OneToOne ElementName: orm:fetch-type ElementType : fetch
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>fetch</code> attribute
    * @param fetch the value for the attribute <code>fetch</code> 
    * @return the current instance of <code>OneToOne<T></code> 
    */
   public OneToOne<T> fetch(FetchType fetch);

   /**
    * Sets the <code>fetch</code> attribute
    * @param fetch the value for the attribute <code>fetch</code> 
    * @return the current instance of <code>OneToOne<T></code> 
    */
   public OneToOne<T> fetch(String fetch);

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
    * @return the current instance of <code>OneToOne<T></code> 
    */
   public OneToOne<T> removeFetch();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OneToOne ElementName: xsd:boolean ElementType : optional
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>optional</code> attribute
    * @param optional the value for the attribute <code>optional</code> 
    * @return the current instance of <code>OneToOne<T></code> 
    */
   public OneToOne<T> optional(Boolean optional);

   /**
    * Returns the <code>optional</code> attribute
    * @return the value defined for the attribute <code>optional</code> 
    */
public Boolean isOptional();

   /**
    * Removes the <code>optional</code> attribute 
    * @return the current instance of <code>OneToOne<T></code> 
    */
   public OneToOne<T> removeOptional();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OneToOne ElementName: orm:access-type ElementType : access
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>access</code> attribute
    * @param access the value for the attribute <code>access</code> 
    * @return the current instance of <code>OneToOne<T></code> 
    */
   public OneToOne<T> access(AccessType access);

   /**
    * Sets the <code>access</code> attribute
    * @param access the value for the attribute <code>access</code> 
    * @return the current instance of <code>OneToOne<T></code> 
    */
   public OneToOne<T> access(String access);

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
    * @return the current instance of <code>OneToOne<T></code> 
    */
   public OneToOne<T> removeAccess();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OneToOne ElementName: xsd:string ElementType : mapped-by
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>mapped-by</code> attribute
    * @param mappedBy the value for the attribute <code>mapped-by</code> 
    * @return the current instance of <code>OneToOne<T></code> 
    */
   public OneToOne<T> mappedBy(String mappedBy);

   /**
    * Returns the <code>mapped-by</code> attribute
    * @return the value defined for the attribute <code>mapped-by</code> 
    */
   public String getMappedBy();

   /**
    * Removes the <code>mapped-by</code> attribute 
    * @return the current instance of <code>OneToOne<T></code> 
    */
   public OneToOne<T> removeMappedBy();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OneToOne ElementName: xsd:boolean ElementType : orphan-removal
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>orphan-removal</code> attribute
    * @param orphanRemoval the value for the attribute <code>orphan-removal</code> 
    * @return the current instance of <code>OneToOne<T></code> 
    */
   public OneToOne<T> orphanRemoval(Boolean orphanRemoval);

   /**
    * Returns the <code>orphan-removal</code> attribute
    * @return the value defined for the attribute <code>orphan-removal</code> 
    */
public Boolean isOrphanRemoval();

   /**
    * Removes the <code>orphan-removal</code> attribute 
    * @return the current instance of <code>OneToOne<T></code> 
    */
   public OneToOne<T> removeOrphanRemoval();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OneToOne ElementName: xsd:string ElementType : maps-id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>maps-id</code> attribute
    * @param mapsId the value for the attribute <code>maps-id</code> 
    * @return the current instance of <code>OneToOne<T></code> 
    */
   public OneToOne<T> mapsId(String mapsId);

   /**
    * Returns the <code>maps-id</code> attribute
    * @return the value defined for the attribute <code>maps-id</code> 
    */
   public String getMapsId();

   /**
    * Removes the <code>maps-id</code> attribute 
    * @return the current instance of <code>OneToOne<T></code> 
    */
   public OneToOne<T> removeMapsId();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OneToOne ElementName: xsd:boolean ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>OneToOne<T></code> 
    */
   public OneToOne<T> id(Boolean id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
public Boolean isId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>OneToOne<T></code> 
    */
   public OneToOne<T> removeId();
}
