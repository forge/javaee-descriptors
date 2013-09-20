package org.jboss.shrinkwrap.descriptor.api.orm21; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.orm21.OrderColumn;
import org.jboss.shrinkwrap.descriptor.api.orm21.MapKey;
import org.jboss.shrinkwrap.descriptor.api.orm21.MapKeyClass;
import org.jboss.shrinkwrap.descriptor.api.orm21.TemporalType;
import org.jboss.shrinkwrap.descriptor.api.orm21.EnumType;
import org.jboss.shrinkwrap.descriptor.api.orm21.AttributeOverride;
import org.jboss.shrinkwrap.descriptor.api.orm21.Convert;
import org.jboss.shrinkwrap.descriptor.api.orm21.MapKeyColumn;
import org.jboss.shrinkwrap.descriptor.api.orm21.MapKeyJoinColumn;
import org.jboss.shrinkwrap.descriptor.api.orm21.ForeignKey;
import org.jboss.shrinkwrap.descriptor.api.orm21.JoinTable;
import org.jboss.shrinkwrap.descriptor.api.orm21.JoinColumn;
import org.jboss.shrinkwrap.descriptor.api.orm21.ForeignKey;
import org.jboss.shrinkwrap.descriptor.api.orm21.CascadeType;
import org.jboss.shrinkwrap.descriptor.api.orm21.FetchType;
import org.jboss.shrinkwrap.descriptor.api.orm21.AccessType;
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
   // ClassName: OneToMany ElementName: orm:order-column ElementType : order-column
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>order-column</code> element with the given value will be created.
    * Otherwise, the existing <code>order-column</code> element will be returned.
    * @return  a new or existing instance of <code>OrderColumn<OneToMany<T>></code> 
    */
   public OrderColumn<OneToMany<T>> getOrCreateOrderColumn();

   /**
    * Removes the <code>order-column</code> element 
    * @return the current instance of <code>OneToMany<T></code> 
    */
   public OneToMany<T> removeOrderColumn();

 
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
   // ClassName: OneToMany ElementName: orm:map-key-class ElementType : map-key-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>map-key-class</code> element with the given value will be created.
    * Otherwise, the existing <code>map-key-class</code> element will be returned.
    * @return  a new or existing instance of <code>MapKeyClass<OneToMany<T>></code> 
    */
   public MapKeyClass<OneToMany<T>> getOrCreateMapKeyClass();

   /**
    * Removes the <code>map-key-class</code> element 
    * @return the current instance of <code>OneToMany<T></code> 
    */
   public OneToMany<T> removeMapKeyClass();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OneToMany ElementName: orm:temporal-type ElementType : map-key-temporal
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>map-key-temporal</code> element
    * @param mapKeyTemporal the value for the element <code>map-key-temporal</code> 
    * @return the current instance of <code>OneToMany<T></code> 
    */
   public OneToMany<T> mapKeyTemporal(TemporalType mapKeyTemporal);
   /**
    * Sets the <code>map-key-temporal</code> element
    * @param mapKeyTemporal the value for the element <code>map-key-temporal</code> 
    * @return the current instance of <code>OneToMany<T></code> 
    */
   public OneToMany<T> mapKeyTemporal(String mapKeyTemporal);

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
    * @return the current instance of <code>OneToMany<T></code> 
    */
   public OneToMany<T> removeMapKeyTemporal();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OneToMany ElementName: orm:enum-type ElementType : map-key-enumerated
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>map-key-enumerated</code> element
    * @param mapKeyEnumerated the value for the element <code>map-key-enumerated</code> 
    * @return the current instance of <code>OneToMany<T></code> 
    */
   public OneToMany<T> mapKeyEnumerated(EnumType mapKeyEnumerated);
   /**
    * Sets the <code>map-key-enumerated</code> element
    * @param mapKeyEnumerated the value for the element <code>map-key-enumerated</code> 
    * @return the current instance of <code>OneToMany<T></code> 
    */
   public OneToMany<T> mapKeyEnumerated(String mapKeyEnumerated);

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
    * @return the current instance of <code>OneToMany<T></code> 
    */
   public OneToMany<T> removeMapKeyEnumerated();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OneToMany ElementName: orm:attribute-override ElementType : map-key-attribute-override
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>map-key-attribute-override</code> element will be created and returned.
    * Otherwise, the first existing <code>map-key-attribute-override</code> element will be returned.
    * @return the instance defined for the element <code>map-key-attribute-override</code> 
    */
   public AttributeOverride<OneToMany<T>> getOrCreateMapKeyAttributeOverride();

   /**
    * Creates a new <code>map-key-attribute-override</code> element 
    * @return the new created instance of <code>AttributeOverride<OneToMany<T>></code> 
    */
   public AttributeOverride<OneToMany<T>> createMapKeyAttributeOverride();

   /**
    * Returns all <code>map-key-attribute-override</code> elements
    * @return list of <code>map-key-attribute-override</code> 
    */
   public List<AttributeOverride<OneToMany<T>>> getAllMapKeyAttributeOverride();

   /**
    * Removes all <code>map-key-attribute-override</code> elements 
    * @return the current instance of <code>AttributeOverride<OneToMany<T>></code> 
    */
   public OneToMany<T> removeAllMapKeyAttributeOverride();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OneToMany ElementName: orm:convert ElementType : map-key-convert
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>map-key-convert</code> element will be created and returned.
    * Otherwise, the first existing <code>map-key-convert</code> element will be returned.
    * @return the instance defined for the element <code>map-key-convert</code> 
    */
   public Convert<OneToMany<T>> getOrCreateMapKeyConvert();

   /**
    * Creates a new <code>map-key-convert</code> element 
    * @return the new created instance of <code>Convert<OneToMany<T>></code> 
    */
   public Convert<OneToMany<T>> createMapKeyConvert();

   /**
    * Returns all <code>map-key-convert</code> elements
    * @return list of <code>map-key-convert</code> 
    */
   public List<Convert<OneToMany<T>>> getAllMapKeyConvert();

   /**
    * Removes all <code>map-key-convert</code> elements 
    * @return the current instance of <code>Convert<OneToMany<T>></code> 
    */
   public OneToMany<T> removeAllMapKeyConvert();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OneToMany ElementName: orm:map-key-column ElementType : map-key-column
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>map-key-column</code> element with the given value will be created.
    * Otherwise, the existing <code>map-key-column</code> element will be returned.
    * @return  a new or existing instance of <code>MapKeyColumn<OneToMany<T>></code> 
    */
   public MapKeyColumn<OneToMany<T>> getOrCreateMapKeyColumn();

   /**
    * Removes the <code>map-key-column</code> element 
    * @return the current instance of <code>OneToMany<T></code> 
    */
   public OneToMany<T> removeMapKeyColumn();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OneToMany ElementName: orm:map-key-join-column ElementType : map-key-join-column
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>map-key-join-column</code> element will be created and returned.
    * Otherwise, the first existing <code>map-key-join-column</code> element will be returned.
    * @return the instance defined for the element <code>map-key-join-column</code> 
    */
   public MapKeyJoinColumn<OneToMany<T>> getOrCreateMapKeyJoinColumn();

   /**
    * Creates a new <code>map-key-join-column</code> element 
    * @return the new created instance of <code>MapKeyJoinColumn<OneToMany<T>></code> 
    */
   public MapKeyJoinColumn<OneToMany<T>> createMapKeyJoinColumn();

   /**
    * Returns all <code>map-key-join-column</code> elements
    * @return list of <code>map-key-join-column</code> 
    */
   public List<MapKeyJoinColumn<OneToMany<T>>> getAllMapKeyJoinColumn();

   /**
    * Removes all <code>map-key-join-column</code> elements 
    * @return the current instance of <code>MapKeyJoinColumn<OneToMany<T>></code> 
    */
   public OneToMany<T> removeAllMapKeyJoinColumn();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OneToMany ElementName: orm:foreign-key ElementType : map-key-foreign-key
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>map-key-foreign-key</code> element with the given value will be created.
    * Otherwise, the existing <code>map-key-foreign-key</code> element will be returned.
    * @return  a new or existing instance of <code>ForeignKey<OneToMany<T>></code> 
    */
   public ForeignKey<OneToMany<T>> getOrCreateMapKeyForeignKey();

   /**
    * Removes the <code>map-key-foreign-key</code> element 
    * @return the current instance of <code>OneToMany<T></code> 
    */
   public OneToMany<T> removeMapKeyForeignKey();

 
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
   // ClassName: OneToMany ElementName: orm:foreign-key ElementType : foreign-key
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>foreign-key</code> element with the given value will be created.
    * Otherwise, the existing <code>foreign-key</code> element will be returned.
    * @return  a new or existing instance of <code>ForeignKey<OneToMany<T>></code> 
    */
   public ForeignKey<OneToMany<T>> getOrCreateForeignKey();

   /**
    * Removes the <code>foreign-key</code> element 
    * @return the current instance of <code>OneToMany<T></code> 
    */
   public OneToMany<T> removeForeignKey();

 
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
   // ClassName: OneToMany ElementName: orm:access-type ElementType : access
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>access</code> attribute
    * @param access the value for the attribute <code>access</code> 
    * @return the current instance of <code>OneToMany<T></code> 
    */
   public OneToMany<T> access(AccessType access);

   /**
    * Sets the <code>access</code> attribute
    * @param access the value for the attribute <code>access</code> 
    * @return the current instance of <code>OneToMany<T></code> 
    */
   public OneToMany<T> access(String access);

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
    * @return the current instance of <code>OneToMany<T></code> 
    */
   public OneToMany<T> removeAccess();

 
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

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OneToMany ElementName: xsd:boolean ElementType : orphan-removal
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>orphan-removal</code> attribute
    * @param orphanRemoval the value for the attribute <code>orphan-removal</code> 
    * @return the current instance of <code>OneToMany<T></code> 
    */
   public OneToMany<T> orphanRemoval(Boolean orphanRemoval);

   /**
    * Returns the <code>orphan-removal</code> attribute
    * @return the value defined for the attribute <code>orphan-removal</code> 
    */
public Boolean isOrphanRemoval();

   /**
    * Removes the <code>orphan-removal</code> attribute 
    * @return the current instance of <code>OneToMany<T></code> 
    */
   public OneToMany<T> removeOrphanRemoval();
}
