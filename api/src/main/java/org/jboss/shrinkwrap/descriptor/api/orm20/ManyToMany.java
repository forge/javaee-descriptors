package org.jboss.shrinkwrap.descriptor.api.orm20; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.orm20.OrderColumn;
import org.jboss.shrinkwrap.descriptor.api.orm20.MapKey;
import org.jboss.shrinkwrap.descriptor.api.orm20.MapKeyClass;
import org.jboss.shrinkwrap.descriptor.api.orm20.TemporalType;
import org.jboss.shrinkwrap.descriptor.api.orm20.EnumType;
import org.jboss.shrinkwrap.descriptor.api.orm20.AttributeOverride;
import org.jboss.shrinkwrap.descriptor.api.orm20.MapKeyColumn;
import org.jboss.shrinkwrap.descriptor.api.orm20.MapKeyJoinColumn;
import org.jboss.shrinkwrap.descriptor.api.orm20.JoinTable;
import org.jboss.shrinkwrap.descriptor.api.orm20.CascadeType;
import org.jboss.shrinkwrap.descriptor.api.orm20.FetchType;
import org.jboss.shrinkwrap.descriptor.api.orm20.AccessType;
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
   // ClassName: ManyToMany ElementName: orm:order-column ElementType : order-column
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>order-column</code> element with the given value will be created.
    * Otherwise, the existing <code>order-column</code> element will be returned.
    * @return  a new or existing instance of <code>OrderColumn<ManyToMany<T>></code> 
    */
   public OrderColumn<ManyToMany<T>> getOrCreateOrderColumn();

   /**
    * Removes the <code>order-column</code> element 
    * @return the current instance of <code>ManyToMany<T></code> 
    */
   public ManyToMany<T> removeOrderColumn();

 
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
   // ClassName: ManyToMany ElementName: orm:map-key-class ElementType : map-key-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>map-key-class</code> element with the given value will be created.
    * Otherwise, the existing <code>map-key-class</code> element will be returned.
    * @return  a new or existing instance of <code>MapKeyClass<ManyToMany<T>></code> 
    */
   public MapKeyClass<ManyToMany<T>> getOrCreateMapKeyClass();

   /**
    * Removes the <code>map-key-class</code> element 
    * @return the current instance of <code>ManyToMany<T></code> 
    */
   public ManyToMany<T> removeMapKeyClass();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ManyToMany ElementName: orm:temporal-type ElementType : map-key-temporal
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>map-key-temporal</code> element
    * @param mapKeyTemporal the value for the element <code>map-key-temporal</code> 
    * @return the current instance of <code>ManyToMany<T></code> 
    */
   public ManyToMany<T> mapKeyTemporal(TemporalType mapKeyTemporal);
   /**
    * Sets the <code>map-key-temporal</code> element
    * @param mapKeyTemporal the value for the element <code>map-key-temporal</code> 
    * @return the current instance of <code>ManyToMany<T></code> 
    */
   public ManyToMany<T> mapKeyTemporal(String mapKeyTemporal);

   /**
    * Returns the <code>map-key-temporal</code> element
    * @return the value found for the element <code>map-key-temporal</code> 
    */
   public TemporalType getMapKeyTemporal();

   /**
    * Returns the <code>map-key-temporal</code> element
    * @return the value found for the element <code>map-key-temporal</code> 
    */
   public String  getMapKeyTemporalAsString();

   /**
    * Removes the <code>map-key-temporal</code> attribute 
    * @return the current instance of <code>ManyToMany<T></code> 
    */
   public ManyToMany<T> removeMapKeyTemporal();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ManyToMany ElementName: orm:enum-type ElementType : map-key-enumerated
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>map-key-enumerated</code> element
    * @param mapKeyEnumerated the value for the element <code>map-key-enumerated</code> 
    * @return the current instance of <code>ManyToMany<T></code> 
    */
   public ManyToMany<T> mapKeyEnumerated(EnumType mapKeyEnumerated);
   /**
    * Sets the <code>map-key-enumerated</code> element
    * @param mapKeyEnumerated the value for the element <code>map-key-enumerated</code> 
    * @return the current instance of <code>ManyToMany<T></code> 
    */
   public ManyToMany<T> mapKeyEnumerated(String mapKeyEnumerated);

   /**
    * Returns the <code>map-key-enumerated</code> element
    * @return the value found for the element <code>map-key-enumerated</code> 
    */
   public EnumType getMapKeyEnumerated();

   /**
    * Returns the <code>map-key-enumerated</code> element
    * @return the value found for the element <code>map-key-enumerated</code> 
    */
   public String  getMapKeyEnumeratedAsString();

   /**
    * Removes the <code>map-key-enumerated</code> attribute 
    * @return the current instance of <code>ManyToMany<T></code> 
    */
   public ManyToMany<T> removeMapKeyEnumerated();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ManyToMany ElementName: orm:attribute-override ElementType : map-key-attribute-override
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>map-key-attribute-override</code> element will be created and returned.
    * Otherwise, the first existing <code>map-key-attribute-override</code> element will be returned.
    * @return the instance defined for the element <code>map-key-attribute-override</code> 
    */
   public AttributeOverride<ManyToMany<T>> getOrCreateMapKeyAttributeOverride();

   /**
    * Creates a new <code>map-key-attribute-override</code> element 
    * @return the new created instance of <code>AttributeOverride<ManyToMany<T>></code> 
    */
   public AttributeOverride<ManyToMany<T>> createMapKeyAttributeOverride();

   /**
    * Returns all <code>map-key-attribute-override</code> elements
    * @return list of <code>map-key-attribute-override</code> 
    */
   public List<AttributeOverride<ManyToMany<T>>> getAllMapKeyAttributeOverride();

   /**
    * Removes all <code>map-key-attribute-override</code> elements 
    * @return the current instance of <code>AttributeOverride<ManyToMany<T>></code> 
    */
   public ManyToMany<T> removeAllMapKeyAttributeOverride();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ManyToMany ElementName: orm:map-key-column ElementType : map-key-column
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>map-key-column</code> element with the given value will be created.
    * Otherwise, the existing <code>map-key-column</code> element will be returned.
    * @return  a new or existing instance of <code>MapKeyColumn<ManyToMany<T>></code> 
    */
   public MapKeyColumn<ManyToMany<T>> getOrCreateMapKeyColumn();

   /**
    * Removes the <code>map-key-column</code> element 
    * @return the current instance of <code>ManyToMany<T></code> 
    */
   public ManyToMany<T> removeMapKeyColumn();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ManyToMany ElementName: orm:map-key-join-column ElementType : map-key-join-column
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>map-key-join-column</code> element will be created and returned.
    * Otherwise, the first existing <code>map-key-join-column</code> element will be returned.
    * @return the instance defined for the element <code>map-key-join-column</code> 
    */
   public MapKeyJoinColumn<ManyToMany<T>> getOrCreateMapKeyJoinColumn();

   /**
    * Creates a new <code>map-key-join-column</code> element 
    * @return the new created instance of <code>MapKeyJoinColumn<ManyToMany<T>></code> 
    */
   public MapKeyJoinColumn<ManyToMany<T>> createMapKeyJoinColumn();

   /**
    * Returns all <code>map-key-join-column</code> elements
    * @return list of <code>map-key-join-column</code> 
    */
   public List<MapKeyJoinColumn<ManyToMany<T>>> getAllMapKeyJoinColumn();

   /**
    * Removes all <code>map-key-join-column</code> elements 
    * @return the current instance of <code>MapKeyJoinColumn<ManyToMany<T>></code> 
    */
   public ManyToMany<T> removeAllMapKeyJoinColumn();

 
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
   // ClassName: ManyToMany ElementName: orm:access-type ElementType : access
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>access</code> attribute
    * @param access the value for the attribute <code>access</code> 
    * @return the current instance of <code>ManyToMany<T></code> 
    */
   public ManyToMany<T> access(AccessType access);

   /**
    * Sets the <code>access</code> attribute
    * @param access the value for the attribute <code>access</code> 
    * @return the current instance of <code>ManyToMany<T></code> 
    */
   public ManyToMany<T> access(String access);

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
    * @return the current instance of <code>ManyToMany<T></code> 
    */
   public ManyToMany<T> removeAccess();

 
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
