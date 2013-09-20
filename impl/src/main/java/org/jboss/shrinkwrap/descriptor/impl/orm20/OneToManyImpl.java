package org.jboss.shrinkwrap.descriptor.impl.orm20; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.orm20.AccessType;
import org.jboss.shrinkwrap.descriptor.api.orm20.AttributeOverride;
import org.jboss.shrinkwrap.descriptor.api.orm20.CascadeType;
import org.jboss.shrinkwrap.descriptor.api.orm20.EnumType;
import org.jboss.shrinkwrap.descriptor.api.orm20.FetchType;
import org.jboss.shrinkwrap.descriptor.api.orm20.JoinColumn;
import org.jboss.shrinkwrap.descriptor.api.orm20.JoinTable;
import org.jboss.shrinkwrap.descriptor.api.orm20.MapKey;
import org.jboss.shrinkwrap.descriptor.api.orm20.MapKeyClass;
import org.jboss.shrinkwrap.descriptor.api.orm20.MapKeyColumn;
import org.jboss.shrinkwrap.descriptor.api.orm20.MapKeyJoinColumn;
import org.jboss.shrinkwrap.descriptor.api.orm20.OneToMany;
import org.jboss.shrinkwrap.descriptor.api.orm20.OrderColumn;
import org.jboss.shrinkwrap.descriptor.api.orm20.TemporalType;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> one-to-many </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class OneToManyImpl<T> implements Child<T>, OneToMany<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public OneToManyImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public OneToManyImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OneToMany ElementName: xsd:string ElementType : order-by
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>order-by</code> element
    * @param orderBy the value for the element <code>order-by</code> 
    * @return the current instance of <code>OneToMany<T></code> 
    */
   public OneToMany<T> orderBy(String orderBy)
   {
      childNode.getOrCreate("order-by").text(orderBy);
      return this;
   }

   /**
    * Returns the <code>order-by</code> element
    * @return the node defined for the element <code>order-by</code> 
    */
   public String getOrderBy()
   {
      return childNode.getTextValueForPatternName("order-by");
   }

   /**
    * Removes the <code>order-by</code> element 
    * @return the current instance of <code>OneToMany<T></code> 
    */
   public OneToMany<T> removeOrderBy()
   {
      childNode.removeChildren("order-by");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OneToMany ElementName: orm:order-column ElementType : order-column
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>order-column</code> element with the given value will be created.
    * Otherwise, the existing <code>order-column</code> element will be returned.
    * @return  a new or existing instance of <code>OrderColumn<OneToMany<T>></code> 
    */
   public OrderColumn<OneToMany<T>> getOrCreateOrderColumn()
   {
      Node node = childNode.getOrCreate("order-column");
      OrderColumn<OneToMany<T>> orderColumn = new OrderColumnImpl<OneToMany<T>>(this, "order-column", childNode, node);
      return orderColumn;
   }

   /**
    * Removes the <code>order-column</code> element 
    * @return the current instance of <code>OneToMany<T></code> 
    */
   public OneToMany<T> removeOrderColumn()
   {
      childNode.removeChildren("order-column");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OneToMany ElementName: orm:map-key ElementType : map-key
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>map-key</code> element with the given value will be created.
    * Otherwise, the existing <code>map-key</code> element will be returned.
    * @return  a new or existing instance of <code>MapKey<OneToMany<T>></code> 
    */
   public MapKey<OneToMany<T>> getOrCreateMapKey()
   {
      Node node = childNode.getOrCreate("map-key");
      MapKey<OneToMany<T>> mapKey = new MapKeyImpl<OneToMany<T>>(this, "map-key", childNode, node);
      return mapKey;
   }

   /**
    * Removes the <code>map-key</code> element 
    * @return the current instance of <code>OneToMany<T></code> 
    */
   public OneToMany<T> removeMapKey()
   {
      childNode.removeChildren("map-key");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OneToMany ElementName: orm:map-key-class ElementType : map-key-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>map-key-class</code> element with the given value will be created.
    * Otherwise, the existing <code>map-key-class</code> element will be returned.
    * @return  a new or existing instance of <code>MapKeyClass<OneToMany<T>></code> 
    */
   public MapKeyClass<OneToMany<T>> getOrCreateMapKeyClass()
   {
      Node node = childNode.getOrCreate("map-key-class");
      MapKeyClass<OneToMany<T>> mapKeyClass = new MapKeyClassImpl<OneToMany<T>>(this, "map-key-class", childNode, node);
      return mapKeyClass;
   }

   /**
    * Removes the <code>map-key-class</code> element 
    * @return the current instance of <code>OneToMany<T></code> 
    */
   public OneToMany<T> removeMapKeyClass()
   {
      childNode.removeChildren("map-key-class");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OneToMany ElementName: orm:temporal-type ElementType : map-key-temporal
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>map-key-temporal</code> element
    * @param mapKeyTemporal the value for the element <code>map-key-temporal</code> 
    * @return the current instance of <code>OneToMany<T></code> 
    */
   public OneToMany<T> mapKeyTemporal(TemporalType mapKeyTemporal)
   {
      childNode.getOrCreate("map-key-temporal").text(mapKeyTemporal);
      return this;
   }
   /**
    * Sets the <code>map-key-temporal</code> element
    * @param mapKeyTemporal the value for the element <code>map-key-temporal</code> 
    * @return the current instance of <code>OneToMany<T></code> 
    */
   public OneToMany<T> mapKeyTemporal(String mapKeyTemporal)
   {
      childNode.getOrCreate("map-key-temporal").text(mapKeyTemporal);
      return this;
   }

   /**
    * Returns the <code>map-key-temporal</code> element
    * @return the value found for the element <code>map-key-temporal</code> 
    */
   public TemporalType getMapKeyTemporal()
   {
      return TemporalType.getFromStringValue(childNode.getTextValueForPatternName("map-key-temporal"));
   }

   /**
    * Returns the <code>map-key-temporal</code> element
    * @return the value found for the element <code>map-key-temporal</code> 
    */
   public String  getMapKeyTemporalAsString()
   {
      return childNode.getTextValueForPatternName("map-key-temporal");
   }

   /**
    * Removes the <code>map-key-temporal</code> attribute 
    * @return the current instance of <code>OneToMany<T></code> 
    */
   public OneToMany<T> removeMapKeyTemporal()
   {
      childNode.removeAttribute("map-key-temporal");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OneToMany ElementName: orm:enum-type ElementType : map-key-enumerated
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>map-key-enumerated</code> element
    * @param mapKeyEnumerated the value for the element <code>map-key-enumerated</code> 
    * @return the current instance of <code>OneToMany<T></code> 
    */
   public OneToMany<T> mapKeyEnumerated(EnumType mapKeyEnumerated)
   {
      childNode.getOrCreate("map-key-enumerated").text(mapKeyEnumerated);
      return this;
   }
   /**
    * Sets the <code>map-key-enumerated</code> element
    * @param mapKeyEnumerated the value for the element <code>map-key-enumerated</code> 
    * @return the current instance of <code>OneToMany<T></code> 
    */
   public OneToMany<T> mapKeyEnumerated(String mapKeyEnumerated)
   {
      childNode.getOrCreate("map-key-enumerated").text(mapKeyEnumerated);
      return this;
   }

   /**
    * Returns the <code>map-key-enumerated</code> element
    * @return the value found for the element <code>map-key-enumerated</code> 
    */
   public EnumType getMapKeyEnumerated()
   {
      return EnumType.getFromStringValue(childNode.getTextValueForPatternName("map-key-enumerated"));
   }

   /**
    * Returns the <code>map-key-enumerated</code> element
    * @return the value found for the element <code>map-key-enumerated</code> 
    */
   public String  getMapKeyEnumeratedAsString()
   {
      return childNode.getTextValueForPatternName("map-key-enumerated");
   }

   /**
    * Removes the <code>map-key-enumerated</code> attribute 
    * @return the current instance of <code>OneToMany<T></code> 
    */
   public OneToMany<T> removeMapKeyEnumerated()
   {
      childNode.removeAttribute("map-key-enumerated");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OneToMany ElementName: orm:attribute-override ElementType : map-key-attribute-override
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>map-key-attribute-override</code> element will be created and returned.
    * Otherwise, the first existing <code>map-key-attribute-override</code> element will be returned.
    * @return the instance defined for the element <code>map-key-attribute-override</code> 
    */
   public AttributeOverride<OneToMany<T>> getOrCreateMapKeyAttributeOverride()
   {
      List<Node> nodeList = childNode.get("map-key-attribute-override");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new AttributeOverrideImpl<OneToMany<T>>(this, "map-key-attribute-override", childNode, nodeList.get(0));
      }
      return createMapKeyAttributeOverride();
   }

   /**
    * Creates a new <code>map-key-attribute-override</code> element 
    * @return the new created instance of <code>AttributeOverride<OneToMany<T>></code> 
    */
   public AttributeOverride<OneToMany<T>> createMapKeyAttributeOverride()
   {
      return new AttributeOverrideImpl<OneToMany<T>>(this, "map-key-attribute-override", childNode);
   }

   /**
    * Returns all <code>map-key-attribute-override</code> elements
    * @return list of <code>map-key-attribute-override</code> 
    */
   public List<AttributeOverride<OneToMany<T>>> getAllMapKeyAttributeOverride()
   {
      List<AttributeOverride<OneToMany<T>>> list = new ArrayList<AttributeOverride<OneToMany<T>>>();
      List<Node> nodeList = childNode.get("map-key-attribute-override");
      for(Node node: nodeList)
      {
         AttributeOverride<OneToMany<T>>  type = new AttributeOverrideImpl<OneToMany<T>>(this, "map-key-attribute-override", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>map-key-attribute-override</code> elements 
    * @return the current instance of <code>AttributeOverride<OneToMany<T>></code> 
    */
   public OneToMany<T> removeAllMapKeyAttributeOverride()
   {
      childNode.removeChildren("map-key-attribute-override");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OneToMany ElementName: orm:map-key-column ElementType : map-key-column
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>map-key-column</code> element with the given value will be created.
    * Otherwise, the existing <code>map-key-column</code> element will be returned.
    * @return  a new or existing instance of <code>MapKeyColumn<OneToMany<T>></code> 
    */
   public MapKeyColumn<OneToMany<T>> getOrCreateMapKeyColumn()
   {
      Node node = childNode.getOrCreate("map-key-column");
      MapKeyColumn<OneToMany<T>> mapKeyColumn = new MapKeyColumnImpl<OneToMany<T>>(this, "map-key-column", childNode, node);
      return mapKeyColumn;
   }

   /**
    * Removes the <code>map-key-column</code> element 
    * @return the current instance of <code>OneToMany<T></code> 
    */
   public OneToMany<T> removeMapKeyColumn()
   {
      childNode.removeChildren("map-key-column");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OneToMany ElementName: orm:map-key-join-column ElementType : map-key-join-column
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>map-key-join-column</code> element will be created and returned.
    * Otherwise, the first existing <code>map-key-join-column</code> element will be returned.
    * @return the instance defined for the element <code>map-key-join-column</code> 
    */
   public MapKeyJoinColumn<OneToMany<T>> getOrCreateMapKeyJoinColumn()
   {
      List<Node> nodeList = childNode.get("map-key-join-column");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new MapKeyJoinColumnImpl<OneToMany<T>>(this, "map-key-join-column", childNode, nodeList.get(0));
      }
      return createMapKeyJoinColumn();
   }

   /**
    * Creates a new <code>map-key-join-column</code> element 
    * @return the new created instance of <code>MapKeyJoinColumn<OneToMany<T>></code> 
    */
   public MapKeyJoinColumn<OneToMany<T>> createMapKeyJoinColumn()
   {
      return new MapKeyJoinColumnImpl<OneToMany<T>>(this, "map-key-join-column", childNode);
   }

   /**
    * Returns all <code>map-key-join-column</code> elements
    * @return list of <code>map-key-join-column</code> 
    */
   public List<MapKeyJoinColumn<OneToMany<T>>> getAllMapKeyJoinColumn()
   {
      List<MapKeyJoinColumn<OneToMany<T>>> list = new ArrayList<MapKeyJoinColumn<OneToMany<T>>>();
      List<Node> nodeList = childNode.get("map-key-join-column");
      for(Node node: nodeList)
      {
         MapKeyJoinColumn<OneToMany<T>>  type = new MapKeyJoinColumnImpl<OneToMany<T>>(this, "map-key-join-column", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>map-key-join-column</code> elements 
    * @return the current instance of <code>MapKeyJoinColumn<OneToMany<T>></code> 
    */
   public OneToMany<T> removeAllMapKeyJoinColumn()
   {
      childNode.removeChildren("map-key-join-column");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OneToMany ElementName: orm:join-table ElementType : join-table
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>join-table</code> element with the given value will be created.
    * Otherwise, the existing <code>join-table</code> element will be returned.
    * @return  a new or existing instance of <code>JoinTable<OneToMany<T>></code> 
    */
   public JoinTable<OneToMany<T>> getOrCreateJoinTable()
   {
      Node node = childNode.getOrCreate("join-table");
      JoinTable<OneToMany<T>> joinTable = new JoinTableImpl<OneToMany<T>>(this, "join-table", childNode, node);
      return joinTable;
   }

   /**
    * Removes the <code>join-table</code> element 
    * @return the current instance of <code>OneToMany<T></code> 
    */
   public OneToMany<T> removeJoinTable()
   {
      childNode.removeChildren("join-table");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OneToMany ElementName: orm:join-column ElementType : join-column
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>join-column</code> element will be created and returned.
    * Otherwise, the first existing <code>join-column</code> element will be returned.
    * @return the instance defined for the element <code>join-column</code> 
    */
   public JoinColumn<OneToMany<T>> getOrCreateJoinColumn()
   {
      List<Node> nodeList = childNode.get("join-column");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new JoinColumnImpl<OneToMany<T>>(this, "join-column", childNode, nodeList.get(0));
      }
      return createJoinColumn();
   }

   /**
    * Creates a new <code>join-column</code> element 
    * @return the new created instance of <code>JoinColumn<OneToMany<T>></code> 
    */
   public JoinColumn<OneToMany<T>> createJoinColumn()
   {
      return new JoinColumnImpl<OneToMany<T>>(this, "join-column", childNode);
   }

   /**
    * Returns all <code>join-column</code> elements
    * @return list of <code>join-column</code> 
    */
   public List<JoinColumn<OneToMany<T>>> getAllJoinColumn()
   {
      List<JoinColumn<OneToMany<T>>> list = new ArrayList<JoinColumn<OneToMany<T>>>();
      List<Node> nodeList = childNode.get("join-column");
      for(Node node: nodeList)
      {
         JoinColumn<OneToMany<T>>  type = new JoinColumnImpl<OneToMany<T>>(this, "join-column", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>join-column</code> elements 
    * @return the current instance of <code>JoinColumn<OneToMany<T>></code> 
    */
   public OneToMany<T> removeAllJoinColumn()
   {
      childNode.removeChildren("join-column");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OneToMany ElementName: orm:cascade-type ElementType : cascade
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>cascade</code> element with the given value will be created.
    * Otherwise, the existing <code>cascade</code> element will be returned.
    * @return  a new or existing instance of <code>CascadeType<OneToMany<T>></code> 
    */
   public CascadeType<OneToMany<T>> getOrCreateCascade()
   {
      Node node = childNode.getOrCreate("cascade");
      CascadeType<OneToMany<T>> cascade = new CascadeTypeImpl<OneToMany<T>>(this, "cascade", childNode, node);
      return cascade;
   }

   /**
    * Removes the <code>cascade</code> element 
    * @return the current instance of <code>OneToMany<T></code> 
    */
   public OneToMany<T> removeCascade()
   {
      childNode.removeChildren("cascade");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OneToMany ElementName: xsd:string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>OneToMany<T></code> 
    */
   public OneToMany<T> name(String name)
   {
      childNode.attribute("name", name);
      return this;
   }

   /**
    * Returns the <code>name</code> attribute
    * @return the value defined for the attribute <code>name</code> 
    */
      public String getName()
   {
      return childNode.getAttribute("name");
   }

   /**
    * Removes the <code>name</code> attribute 
    * @return the current instance of <code>OneToMany<T></code> 
    */
   public OneToMany<T> removeName()
   {
      childNode.removeAttribute("name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OneToMany ElementName: xsd:string ElementType : target-entity
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>target-entity</code> attribute
    * @param targetEntity the value for the attribute <code>target-entity</code> 
    * @return the current instance of <code>OneToMany<T></code> 
    */
   public OneToMany<T> targetEntity(String targetEntity)
   {
      childNode.attribute("target-entity", targetEntity);
      return this;
   }

   /**
    * Returns the <code>target-entity</code> attribute
    * @return the value defined for the attribute <code>target-entity</code> 
    */
      public String getTargetEntity()
   {
      return childNode.getAttribute("target-entity");
   }

   /**
    * Removes the <code>target-entity</code> attribute 
    * @return the current instance of <code>OneToMany<T></code> 
    */
   public OneToMany<T> removeTargetEntity()
   {
      childNode.removeAttribute("target-entity");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OneToMany ElementName: orm:fetch-type ElementType : fetch
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>fetch</code> attribute
    * @param fetch the value for the attribute <code>fetch</code> 
    * @return the current instance of <code>OneToMany<T></code> 
    */
   public OneToMany<T> fetch(FetchType fetch)
   {
      childNode.attribute("fetch", fetch);
      return this;
   }

   /**
    * Sets the <code>fetch</code> attribute
    * @param fetch the value for the attribute <code>fetch</code> 
    * @return the current instance of <code>OneToMany<T></code> 
    */
   public OneToMany<T> fetch(String fetch)
   {
      childNode.attribute("fetch", fetch);
      return this;
   }

   /**
    * Returns the <code>fetch</code> attribute
    * @return the value defined for the attribute <code>fetch</code> 
    */
   public FetchType getFetch()
   {
      return FetchType.getFromStringValue(childNode.getAttribute("fetch"));
   }

   /**
    * Returns the <code>fetch</code> attribute
    * @return the value found for the element <code>fetch</code> 
    */
   public String  getFetchAsString()
   {
      return childNode.getAttribute("fetch");
   }

   /**
    * Removes the <code>fetch</code> attribute 
    * @return the current instance of <code>OneToMany<T></code> 
    */
   public OneToMany<T> removeFetch()
   {
      childNode.removeAttribute("fetch");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OneToMany ElementName: orm:access-type ElementType : access
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>access</code> attribute
    * @param access the value for the attribute <code>access</code> 
    * @return the current instance of <code>OneToMany<T></code> 
    */
   public OneToMany<T> access(AccessType access)
   {
      childNode.attribute("access", access);
      return this;
   }

   /**
    * Sets the <code>access</code> attribute
    * @param access the value for the attribute <code>access</code> 
    * @return the current instance of <code>OneToMany<T></code> 
    */
   public OneToMany<T> access(String access)
   {
      childNode.attribute("access", access);
      return this;
   }

   /**
    * Returns the <code>access</code> attribute
    * @return the value defined for the attribute <code>access</code> 
    */
   public AccessType getAccess()
   {
      return AccessType.getFromStringValue(childNode.getAttribute("access"));
   }

   /**
    * Returns the <code>access</code> attribute
    * @return the value found for the element <code>access</code> 
    */
   public String  getAccessAsString()
   {
      return childNode.getAttribute("access");
   }

   /**
    * Removes the <code>access</code> attribute 
    * @return the current instance of <code>OneToMany<T></code> 
    */
   public OneToMany<T> removeAccess()
   {
      childNode.removeAttribute("access");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OneToMany ElementName: xsd:string ElementType : mapped-by
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>mapped-by</code> attribute
    * @param mappedBy the value for the attribute <code>mapped-by</code> 
    * @return the current instance of <code>OneToMany<T></code> 
    */
   public OneToMany<T> mappedBy(String mappedBy)
   {
      childNode.attribute("mapped-by", mappedBy);
      return this;
   }

   /**
    * Returns the <code>mapped-by</code> attribute
    * @return the value defined for the attribute <code>mapped-by</code> 
    */
      public String getMappedBy()
   {
      return childNode.getAttribute("mapped-by");
   }

   /**
    * Removes the <code>mapped-by</code> attribute 
    * @return the current instance of <code>OneToMany<T></code> 
    */
   public OneToMany<T> removeMappedBy()
   {
      childNode.removeAttribute("mapped-by");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OneToMany ElementName: xsd:boolean ElementType : orphan-removal
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>orphan-removal</code> attribute
    * @param orphanRemoval the value for the attribute <code>orphan-removal</code> 
    * @return the current instance of <code>OneToMany<T></code> 
    */
   public OneToMany<T> orphanRemoval(Boolean orphanRemoval)
   {
      childNode.attribute("orphan-removal", orphanRemoval);
      return this;
   }

   /**
    * Returns the <code>orphan-removal</code> attribute
    * @return the value defined for the attribute <code>orphan-removal</code> 
    */
   public Boolean isOrphanRemoval()
   {
      return Strings.isTrue(childNode.getAttribute("orphan-removal"));
   }

   /**
    * Removes the <code>orphan-removal</code> attribute 
    * @return the current instance of <code>OneToMany<T></code> 
    */
   public OneToMany<T> removeOrphanRemoval()
   {
      childNode.removeAttribute("orphan-removal");
      return this;
   }
}
