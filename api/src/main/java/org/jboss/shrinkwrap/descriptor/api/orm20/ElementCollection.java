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
import org.jboss.shrinkwrap.descriptor.api.orm20.Column;
import org.jboss.shrinkwrap.descriptor.api.orm20.TemporalType;
import org.jboss.shrinkwrap.descriptor.api.orm20.EnumType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EmptyType;
import org.jboss.shrinkwrap.descriptor.api.orm20.AttributeOverride;
import org.jboss.shrinkwrap.descriptor.api.orm20.AssociationOverride;
import org.jboss.shrinkwrap.descriptor.api.orm20.CollectionTable;
import org.jboss.shrinkwrap.descriptor.api.orm20.FetchType;
import org.jboss.shrinkwrap.descriptor.api.orm20.AccessType;
/**
 * This interface defines the contract for the <code> element-collection </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface ElementCollection<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ElementCollection ElementName: xsd:string ElementType : order-by
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>order-by</code> element
    * @param orderBy the value for the element <code>order-by</code> 
    * @return the current instance of <code>ElementCollection<T></code> 
    */
   public ElementCollection<T> orderBy(String orderBy);

   /**
    * Returns the <code>order-by</code> element
    * @return the node defined for the element <code>order-by</code> 
    */
   public String getOrderBy();

   /**
    * Removes the <code>order-by</code> element 
    * @return the current instance of <code>ElementCollection<T></code> 
    */
   public ElementCollection<T> removeOrderBy();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ElementCollection ElementName: orm:order-column ElementType : order-column
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>order-column</code> element with the given value will be created.
    * Otherwise, the existing <code>order-column</code> element will be returned.
    * @return  a new or existing instance of <code>OrderColumn<ElementCollection<T>></code> 
    */
   public OrderColumn<ElementCollection<T>> getOrCreateOrderColumn();

   /**
    * Removes the <code>order-column</code> element 
    * @return the current instance of <code>ElementCollection<T></code> 
    */
   public ElementCollection<T> removeOrderColumn();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ElementCollection ElementName: orm:map-key ElementType : map-key
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>map-key</code> element with the given value will be created.
    * Otherwise, the existing <code>map-key</code> element will be returned.
    * @return  a new or existing instance of <code>MapKey<ElementCollection<T>></code> 
    */
   public MapKey<ElementCollection<T>> getOrCreateMapKey();

   /**
    * Removes the <code>map-key</code> element 
    * @return the current instance of <code>ElementCollection<T></code> 
    */
   public ElementCollection<T> removeMapKey();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ElementCollection ElementName: orm:map-key-class ElementType : map-key-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>map-key-class</code> element with the given value will be created.
    * Otherwise, the existing <code>map-key-class</code> element will be returned.
    * @return  a new or existing instance of <code>MapKeyClass<ElementCollection<T>></code> 
    */
   public MapKeyClass<ElementCollection<T>> getOrCreateMapKeyClass();

   /**
    * Removes the <code>map-key-class</code> element 
    * @return the current instance of <code>ElementCollection<T></code> 
    */
   public ElementCollection<T> removeMapKeyClass();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ElementCollection ElementName: orm:temporal-type ElementType : map-key-temporal
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>map-key-temporal</code> element
    * @param mapKeyTemporal the value for the element <code>map-key-temporal</code> 
    * @return the current instance of <code>ElementCollection<T></code> 
    */
   public ElementCollection<T> mapKeyTemporal(TemporalType mapKeyTemporal);
   /**
    * Sets the <code>map-key-temporal</code> element
    * @param mapKeyTemporal the value for the element <code>map-key-temporal</code> 
    * @return the current instance of <code>ElementCollection<T></code> 
    */
   public ElementCollection<T> mapKeyTemporal(String mapKeyTemporal);

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
    * @return the current instance of <code>ElementCollection<T></code> 
    */
   public ElementCollection<T> removeMapKeyTemporal();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ElementCollection ElementName: orm:enum-type ElementType : map-key-enumerated
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>map-key-enumerated</code> element
    * @param mapKeyEnumerated the value for the element <code>map-key-enumerated</code> 
    * @return the current instance of <code>ElementCollection<T></code> 
    */
   public ElementCollection<T> mapKeyEnumerated(EnumType mapKeyEnumerated);
   /**
    * Sets the <code>map-key-enumerated</code> element
    * @param mapKeyEnumerated the value for the element <code>map-key-enumerated</code> 
    * @return the current instance of <code>ElementCollection<T></code> 
    */
   public ElementCollection<T> mapKeyEnumerated(String mapKeyEnumerated);

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
    * @return the current instance of <code>ElementCollection<T></code> 
    */
   public ElementCollection<T> removeMapKeyEnumerated();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ElementCollection ElementName: orm:attribute-override ElementType : map-key-attribute-override
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>map-key-attribute-override</code> element will be created and returned.
    * Otherwise, the first existing <code>map-key-attribute-override</code> element will be returned.
    * @return the instance defined for the element <code>map-key-attribute-override</code> 
    */
   public AttributeOverride<ElementCollection<T>> getOrCreateMapKeyAttributeOverride();

   /**
    * Creates a new <code>map-key-attribute-override</code> element 
    * @return the new created instance of <code>AttributeOverride<ElementCollection<T>></code> 
    */
   public AttributeOverride<ElementCollection<T>> createMapKeyAttributeOverride();

   /**
    * Returns all <code>map-key-attribute-override</code> elements
    * @return list of <code>map-key-attribute-override</code> 
    */
   public List<AttributeOverride<ElementCollection<T>>> getAllMapKeyAttributeOverride();

   /**
    * Removes all <code>map-key-attribute-override</code> elements 
    * @return the current instance of <code>AttributeOverride<ElementCollection<T>></code> 
    */
   public ElementCollection<T> removeAllMapKeyAttributeOverride();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ElementCollection ElementName: orm:map-key-column ElementType : map-key-column
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>map-key-column</code> element with the given value will be created.
    * Otherwise, the existing <code>map-key-column</code> element will be returned.
    * @return  a new or existing instance of <code>MapKeyColumn<ElementCollection<T>></code> 
    */
   public MapKeyColumn<ElementCollection<T>> getOrCreateMapKeyColumn();

   /**
    * Removes the <code>map-key-column</code> element 
    * @return the current instance of <code>ElementCollection<T></code> 
    */
   public ElementCollection<T> removeMapKeyColumn();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ElementCollection ElementName: orm:map-key-join-column ElementType : map-key-join-column
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>map-key-join-column</code> element will be created and returned.
    * Otherwise, the first existing <code>map-key-join-column</code> element will be returned.
    * @return the instance defined for the element <code>map-key-join-column</code> 
    */
   public MapKeyJoinColumn<ElementCollection<T>> getOrCreateMapKeyJoinColumn();

   /**
    * Creates a new <code>map-key-join-column</code> element 
    * @return the new created instance of <code>MapKeyJoinColumn<ElementCollection<T>></code> 
    */
   public MapKeyJoinColumn<ElementCollection<T>> createMapKeyJoinColumn();

   /**
    * Returns all <code>map-key-join-column</code> elements
    * @return list of <code>map-key-join-column</code> 
    */
   public List<MapKeyJoinColumn<ElementCollection<T>>> getAllMapKeyJoinColumn();

   /**
    * Removes all <code>map-key-join-column</code> elements 
    * @return the current instance of <code>MapKeyJoinColumn<ElementCollection<T>></code> 
    */
   public ElementCollection<T> removeAllMapKeyJoinColumn();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ElementCollection ElementName: orm:column ElementType : column
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>column</code> element with the given value will be created.
    * Otherwise, the existing <code>column</code> element will be returned.
    * @return  a new or existing instance of <code>Column<ElementCollection<T>></code> 
    */
   public Column<ElementCollection<T>> getOrCreateColumn();

   /**
    * Removes the <code>column</code> element 
    * @return the current instance of <code>ElementCollection<T></code> 
    */
   public ElementCollection<T> removeColumn();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ElementCollection ElementName: orm:temporal-type ElementType : temporal
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>temporal</code> element
    * @param temporal the value for the element <code>temporal</code> 
    * @return the current instance of <code>ElementCollection<T></code> 
    */
   public ElementCollection<T> temporal(TemporalType temporal);
   /**
    * Sets the <code>temporal</code> element
    * @param temporal the value for the element <code>temporal</code> 
    * @return the current instance of <code>ElementCollection<T></code> 
    */
   public ElementCollection<T> temporal(String temporal);

   /**
    * Returns the <code>temporal</code> element
    * @return the value found for the element <code>temporal</code> 
    */
   public TemporalType getTemporal();

   /**
    * Returns the <code>temporal</code> element
    * @return the value found for the element <code>temporal</code> 
    */
   public String  getTemporalAsString();

   /**
    * Removes the <code>temporal</code> attribute 
    * @return the current instance of <code>ElementCollection<T></code> 
    */
   public ElementCollection<T> removeTemporal();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ElementCollection ElementName: orm:enum-type ElementType : enumerated
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>enumerated</code> element
    * @param enumerated the value for the element <code>enumerated</code> 
    * @return the current instance of <code>ElementCollection<T></code> 
    */
   public ElementCollection<T> enumerated(EnumType enumerated);
   /**
    * Sets the <code>enumerated</code> element
    * @param enumerated the value for the element <code>enumerated</code> 
    * @return the current instance of <code>ElementCollection<T></code> 
    */
   public ElementCollection<T> enumerated(String enumerated);

   /**
    * Returns the <code>enumerated</code> element
    * @return the value found for the element <code>enumerated</code> 
    */
   public EnumType getEnumerated();

   /**
    * Returns the <code>enumerated</code> element
    * @return the value found for the element <code>enumerated</code> 
    */
   public String  getEnumeratedAsString();

   /**
    * Removes the <code>enumerated</code> attribute 
    * @return the current instance of <code>ElementCollection<T></code> 
    */
   public ElementCollection<T> removeEnumerated();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ElementCollection ElementName: javaee:emptyType ElementType : lob
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>lob</code> element 
    * @return the current instance of <code>ElementCollection<T></code> 
    */
   public ElementCollection<T> lob();

   /**
    * Removes the <code>lob</code> element 
    * @return the current instance of <code>ElementCollection<T></code> 
    */
   public Boolean isLob();

   /**
    * Removes the <code>lob</code> element 
    * @return the current instance of <code>ElementCollection<T></code> 
    */
   public ElementCollection<T> removeLob();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ElementCollection ElementName: orm:attribute-override ElementType : attribute-override
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>attribute-override</code> element will be created and returned.
    * Otherwise, the first existing <code>attribute-override</code> element will be returned.
    * @return the instance defined for the element <code>attribute-override</code> 
    */
   public AttributeOverride<ElementCollection<T>> getOrCreateAttributeOverride();

   /**
    * Creates a new <code>attribute-override</code> element 
    * @return the new created instance of <code>AttributeOverride<ElementCollection<T>></code> 
    */
   public AttributeOverride<ElementCollection<T>> createAttributeOverride();

   /**
    * Returns all <code>attribute-override</code> elements
    * @return list of <code>attribute-override</code> 
    */
   public List<AttributeOverride<ElementCollection<T>>> getAllAttributeOverride();

   /**
    * Removes all <code>attribute-override</code> elements 
    * @return the current instance of <code>AttributeOverride<ElementCollection<T>></code> 
    */
   public ElementCollection<T> removeAllAttributeOverride();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ElementCollection ElementName: orm:association-override ElementType : association-override
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>association-override</code> element will be created and returned.
    * Otherwise, the first existing <code>association-override</code> element will be returned.
    * @return the instance defined for the element <code>association-override</code> 
    */
   public AssociationOverride<ElementCollection<T>> getOrCreateAssociationOverride();

   /**
    * Creates a new <code>association-override</code> element 
    * @return the new created instance of <code>AssociationOverride<ElementCollection<T>></code> 
    */
   public AssociationOverride<ElementCollection<T>> createAssociationOverride();

   /**
    * Returns all <code>association-override</code> elements
    * @return list of <code>association-override</code> 
    */
   public List<AssociationOverride<ElementCollection<T>>> getAllAssociationOverride();

   /**
    * Removes all <code>association-override</code> elements 
    * @return the current instance of <code>AssociationOverride<ElementCollection<T>></code> 
    */
   public ElementCollection<T> removeAllAssociationOverride();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ElementCollection ElementName: orm:collection-table ElementType : collection-table
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>collection-table</code> element with the given value will be created.
    * Otherwise, the existing <code>collection-table</code> element will be returned.
    * @return  a new or existing instance of <code>CollectionTable<ElementCollection<T>></code> 
    */
   public CollectionTable<ElementCollection<T>> getOrCreateCollectionTable();

   /**
    * Removes the <code>collection-table</code> element 
    * @return the current instance of <code>ElementCollection<T></code> 
    */
   public ElementCollection<T> removeCollectionTable();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ElementCollection ElementName: xsd:string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>ElementCollection<T></code> 
    */
   public ElementCollection<T> name(String name);

   /**
    * Returns the <code>name</code> attribute
    * @return the value defined for the attribute <code>name</code> 
    */
   public String getName();

   /**
    * Removes the <code>name</code> attribute 
    * @return the current instance of <code>ElementCollection<T></code> 
    */
   public ElementCollection<T> removeName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ElementCollection ElementName: xsd:string ElementType : target-class
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>target-class</code> attribute
    * @param targetClass the value for the attribute <code>target-class</code> 
    * @return the current instance of <code>ElementCollection<T></code> 
    */
   public ElementCollection<T> targetClass(String targetClass);

   /**
    * Returns the <code>target-class</code> attribute
    * @return the value defined for the attribute <code>target-class</code> 
    */
   public String getTargetClass();

   /**
    * Removes the <code>target-class</code> attribute 
    * @return the current instance of <code>ElementCollection<T></code> 
    */
   public ElementCollection<T> removeTargetClass();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ElementCollection ElementName: orm:fetch-type ElementType : fetch
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>fetch</code> attribute
    * @param fetch the value for the attribute <code>fetch</code> 
    * @return the current instance of <code>ElementCollection<T></code> 
    */
   public ElementCollection<T> fetch(FetchType fetch);

   /**
    * Sets the <code>fetch</code> attribute
    * @param fetch the value for the attribute <code>fetch</code> 
    * @return the current instance of <code>ElementCollection<T></code> 
    */
   public ElementCollection<T> fetch(String fetch);

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
    * @return the current instance of <code>ElementCollection<T></code> 
    */
   public ElementCollection<T> removeFetch();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ElementCollection ElementName: orm:access-type ElementType : access
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>access</code> attribute
    * @param access the value for the attribute <code>access</code> 
    * @return the current instance of <code>ElementCollection<T></code> 
    */
   public ElementCollection<T> access(AccessType access);

   /**
    * Sets the <code>access</code> attribute
    * @param access the value for the attribute <code>access</code> 
    * @return the current instance of <code>ElementCollection<T></code> 
    */
   public ElementCollection<T> access(String access);

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
    * @return the current instance of <code>ElementCollection<T></code> 
    */
   public ElementCollection<T> removeAccess();
}
