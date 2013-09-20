package org.jboss.shrinkwrap.descriptor.impl.orm20; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.orm20.AccessType;
import org.jboss.shrinkwrap.descriptor.api.orm20.AttributeOverride;
import org.jboss.shrinkwrap.descriptor.api.orm20.CascadeType;
import org.jboss.shrinkwrap.descriptor.api.orm20.EnumType;
import org.jboss.shrinkwrap.descriptor.api.orm20.FetchType;
import org.jboss.shrinkwrap.descriptor.api.orm20.JoinTable;
import org.jboss.shrinkwrap.descriptor.api.orm20.ManyToMany;
import org.jboss.shrinkwrap.descriptor.api.orm20.MapKey;
import org.jboss.shrinkwrap.descriptor.api.orm20.MapKeyClass;
import org.jboss.shrinkwrap.descriptor.api.orm20.MapKeyColumn;
import org.jboss.shrinkwrap.descriptor.api.orm20.MapKeyJoinColumn;
import org.jboss.shrinkwrap.descriptor.api.orm20.OrderColumn;
import org.jboss.shrinkwrap.descriptor.api.orm20.TemporalType;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> many-to-many </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class ManyToManyImpl<T> implements Child<T>, ManyToMany<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public ManyToManyImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public ManyToManyImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ManyToMany ElementName: xsd:string ElementType : order-by
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>order-by</code> element
    * @param orderBy the value for the element <code>order-by</code> 
    * @return the current instance of <code>ManyToMany<T></code> 
    */
   public ManyToMany<T> orderBy(String orderBy)
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
    * @return the current instance of <code>ManyToMany<T></code> 
    */
   public ManyToMany<T> removeOrderBy()
   {
      childNode.removeChildren("order-by");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ManyToMany ElementName: orm:order-column ElementType : order-column
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>order-column</code> element with the given value will be created.
    * Otherwise, the existing <code>order-column</code> element will be returned.
    * @return  a new or existing instance of <code>OrderColumn<ManyToMany<T>></code> 
    */
   public OrderColumn<ManyToMany<T>> getOrCreateOrderColumn()
   {
      Node node = childNode.getOrCreate("order-column");
      OrderColumn<ManyToMany<T>> orderColumn = new OrderColumnImpl<ManyToMany<T>>(this, "order-column", childNode, node);
      return orderColumn;
   }

   /**
    * Removes the <code>order-column</code> element 
    * @return the current instance of <code>ManyToMany<T></code> 
    */
   public ManyToMany<T> removeOrderColumn()
   {
      childNode.removeChildren("order-column");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ManyToMany ElementName: orm:map-key ElementType : map-key
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>map-key</code> element with the given value will be created.
    * Otherwise, the existing <code>map-key</code> element will be returned.
    * @return  a new or existing instance of <code>MapKey<ManyToMany<T>></code> 
    */
   public MapKey<ManyToMany<T>> getOrCreateMapKey()
   {
      Node node = childNode.getOrCreate("map-key");
      MapKey<ManyToMany<T>> mapKey = new MapKeyImpl<ManyToMany<T>>(this, "map-key", childNode, node);
      return mapKey;
   }

   /**
    * Removes the <code>map-key</code> element 
    * @return the current instance of <code>ManyToMany<T></code> 
    */
   public ManyToMany<T> removeMapKey()
   {
      childNode.removeChildren("map-key");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ManyToMany ElementName: orm:map-key-class ElementType : map-key-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>map-key-class</code> element with the given value will be created.
    * Otherwise, the existing <code>map-key-class</code> element will be returned.
    * @return  a new or existing instance of <code>MapKeyClass<ManyToMany<T>></code> 
    */
   public MapKeyClass<ManyToMany<T>> getOrCreateMapKeyClass()
   {
      Node node = childNode.getOrCreate("map-key-class");
      MapKeyClass<ManyToMany<T>> mapKeyClass = new MapKeyClassImpl<ManyToMany<T>>(this, "map-key-class", childNode, node);
      return mapKeyClass;
   }

   /**
    * Removes the <code>map-key-class</code> element 
    * @return the current instance of <code>ManyToMany<T></code> 
    */
   public ManyToMany<T> removeMapKeyClass()
   {
      childNode.removeChildren("map-key-class");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ManyToMany ElementName: orm:temporal-type ElementType : map-key-temporal
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>map-key-temporal</code> element
    * @param mapKeyTemporal the value for the element <code>map-key-temporal</code> 
    * @return the current instance of <code>ManyToMany<T></code> 
    */
   public ManyToMany<T> mapKeyTemporal(TemporalType mapKeyTemporal)
   {
      childNode.getOrCreate("map-key-temporal").text(mapKeyTemporal);
      return this;
   }
   /**
    * Sets the <code>map-key-temporal</code> element
    * @param mapKeyTemporal the value for the element <code>map-key-temporal</code> 
    * @return the current instance of <code>ManyToMany<T></code> 
    */
   public ManyToMany<T> mapKeyTemporal(String mapKeyTemporal)
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
    * @return the current instance of <code>ManyToMany<T></code> 
    */
   public ManyToMany<T> removeMapKeyTemporal()
   {
      childNode.removeAttribute("map-key-temporal");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ManyToMany ElementName: orm:enum-type ElementType : map-key-enumerated
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>map-key-enumerated</code> element
    * @param mapKeyEnumerated the value for the element <code>map-key-enumerated</code> 
    * @return the current instance of <code>ManyToMany<T></code> 
    */
   public ManyToMany<T> mapKeyEnumerated(EnumType mapKeyEnumerated)
   {
      childNode.getOrCreate("map-key-enumerated").text(mapKeyEnumerated);
      return this;
   }
   /**
    * Sets the <code>map-key-enumerated</code> element
    * @param mapKeyEnumerated the value for the element <code>map-key-enumerated</code> 
    * @return the current instance of <code>ManyToMany<T></code> 
    */
   public ManyToMany<T> mapKeyEnumerated(String mapKeyEnumerated)
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
    * @return the current instance of <code>ManyToMany<T></code> 
    */
   public ManyToMany<T> removeMapKeyEnumerated()
   {
      childNode.removeAttribute("map-key-enumerated");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ManyToMany ElementName: orm:attribute-override ElementType : map-key-attribute-override
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>map-key-attribute-override</code> element will be created and returned.
    * Otherwise, the first existing <code>map-key-attribute-override</code> element will be returned.
    * @return the instance defined for the element <code>map-key-attribute-override</code> 
    */
   public AttributeOverride<ManyToMany<T>> getOrCreateMapKeyAttributeOverride()
   {
      List<Node> nodeList = childNode.get("map-key-attribute-override");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new AttributeOverrideImpl<ManyToMany<T>>(this, "map-key-attribute-override", childNode, nodeList.get(0));
      }
      return createMapKeyAttributeOverride();
   }

   /**
    * Creates a new <code>map-key-attribute-override</code> element 
    * @return the new created instance of <code>AttributeOverride<ManyToMany<T>></code> 
    */
   public AttributeOverride<ManyToMany<T>> createMapKeyAttributeOverride()
   {
      return new AttributeOverrideImpl<ManyToMany<T>>(this, "map-key-attribute-override", childNode);
   }

   /**
    * Returns all <code>map-key-attribute-override</code> elements
    * @return list of <code>map-key-attribute-override</code> 
    */
   public List<AttributeOverride<ManyToMany<T>>> getAllMapKeyAttributeOverride()
   {
      List<AttributeOverride<ManyToMany<T>>> list = new ArrayList<AttributeOverride<ManyToMany<T>>>();
      List<Node> nodeList = childNode.get("map-key-attribute-override");
      for(Node node: nodeList)
      {
         AttributeOverride<ManyToMany<T>>  type = new AttributeOverrideImpl<ManyToMany<T>>(this, "map-key-attribute-override", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>map-key-attribute-override</code> elements 
    * @return the current instance of <code>AttributeOverride<ManyToMany<T>></code> 
    */
   public ManyToMany<T> removeAllMapKeyAttributeOverride()
   {
      childNode.removeChildren("map-key-attribute-override");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ManyToMany ElementName: orm:map-key-column ElementType : map-key-column
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>map-key-column</code> element with the given value will be created.
    * Otherwise, the existing <code>map-key-column</code> element will be returned.
    * @return  a new or existing instance of <code>MapKeyColumn<ManyToMany<T>></code> 
    */
   public MapKeyColumn<ManyToMany<T>> getOrCreateMapKeyColumn()
   {
      Node node = childNode.getOrCreate("map-key-column");
      MapKeyColumn<ManyToMany<T>> mapKeyColumn = new MapKeyColumnImpl<ManyToMany<T>>(this, "map-key-column", childNode, node);
      return mapKeyColumn;
   }

   /**
    * Removes the <code>map-key-column</code> element 
    * @return the current instance of <code>ManyToMany<T></code> 
    */
   public ManyToMany<T> removeMapKeyColumn()
   {
      childNode.removeChildren("map-key-column");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ManyToMany ElementName: orm:map-key-join-column ElementType : map-key-join-column
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>map-key-join-column</code> element will be created and returned.
    * Otherwise, the first existing <code>map-key-join-column</code> element will be returned.
    * @return the instance defined for the element <code>map-key-join-column</code> 
    */
   public MapKeyJoinColumn<ManyToMany<T>> getOrCreateMapKeyJoinColumn()
   {
      List<Node> nodeList = childNode.get("map-key-join-column");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new MapKeyJoinColumnImpl<ManyToMany<T>>(this, "map-key-join-column", childNode, nodeList.get(0));
      }
      return createMapKeyJoinColumn();
   }

   /**
    * Creates a new <code>map-key-join-column</code> element 
    * @return the new created instance of <code>MapKeyJoinColumn<ManyToMany<T>></code> 
    */
   public MapKeyJoinColumn<ManyToMany<T>> createMapKeyJoinColumn()
   {
      return new MapKeyJoinColumnImpl<ManyToMany<T>>(this, "map-key-join-column", childNode);
   }

   /**
    * Returns all <code>map-key-join-column</code> elements
    * @return list of <code>map-key-join-column</code> 
    */
   public List<MapKeyJoinColumn<ManyToMany<T>>> getAllMapKeyJoinColumn()
   {
      List<MapKeyJoinColumn<ManyToMany<T>>> list = new ArrayList<MapKeyJoinColumn<ManyToMany<T>>>();
      List<Node> nodeList = childNode.get("map-key-join-column");
      for(Node node: nodeList)
      {
         MapKeyJoinColumn<ManyToMany<T>>  type = new MapKeyJoinColumnImpl<ManyToMany<T>>(this, "map-key-join-column", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>map-key-join-column</code> elements 
    * @return the current instance of <code>MapKeyJoinColumn<ManyToMany<T>></code> 
    */
   public ManyToMany<T> removeAllMapKeyJoinColumn()
   {
      childNode.removeChildren("map-key-join-column");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ManyToMany ElementName: orm:join-table ElementType : join-table
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>join-table</code> element with the given value will be created.
    * Otherwise, the existing <code>join-table</code> element will be returned.
    * @return  a new or existing instance of <code>JoinTable<ManyToMany<T>></code> 
    */
   public JoinTable<ManyToMany<T>> getOrCreateJoinTable()
   {
      Node node = childNode.getOrCreate("join-table");
      JoinTable<ManyToMany<T>> joinTable = new JoinTableImpl<ManyToMany<T>>(this, "join-table", childNode, node);
      return joinTable;
   }

   /**
    * Removes the <code>join-table</code> element 
    * @return the current instance of <code>ManyToMany<T></code> 
    */
   public ManyToMany<T> removeJoinTable()
   {
      childNode.removeChildren("join-table");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ManyToMany ElementName: orm:cascade-type ElementType : cascade
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>cascade</code> element with the given value will be created.
    * Otherwise, the existing <code>cascade</code> element will be returned.
    * @return  a new or existing instance of <code>CascadeType<ManyToMany<T>></code> 
    */
   public CascadeType<ManyToMany<T>> getOrCreateCascade()
   {
      Node node = childNode.getOrCreate("cascade");
      CascadeType<ManyToMany<T>> cascade = new CascadeTypeImpl<ManyToMany<T>>(this, "cascade", childNode, node);
      return cascade;
   }

   /**
    * Removes the <code>cascade</code> element 
    * @return the current instance of <code>ManyToMany<T></code> 
    */
   public ManyToMany<T> removeCascade()
   {
      childNode.removeChildren("cascade");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ManyToMany ElementName: xsd:string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>ManyToMany<T></code> 
    */
   public ManyToMany<T> name(String name)
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
    * @return the current instance of <code>ManyToMany<T></code> 
    */
   public ManyToMany<T> removeName()
   {
      childNode.removeAttribute("name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ManyToMany ElementName: xsd:string ElementType : target-entity
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>target-entity</code> attribute
    * @param targetEntity the value for the attribute <code>target-entity</code> 
    * @return the current instance of <code>ManyToMany<T></code> 
    */
   public ManyToMany<T> targetEntity(String targetEntity)
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
    * @return the current instance of <code>ManyToMany<T></code> 
    */
   public ManyToMany<T> removeTargetEntity()
   {
      childNode.removeAttribute("target-entity");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ManyToMany ElementName: orm:fetch-type ElementType : fetch
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>fetch</code> attribute
    * @param fetch the value for the attribute <code>fetch</code> 
    * @return the current instance of <code>ManyToMany<T></code> 
    */
   public ManyToMany<T> fetch(FetchType fetch)
   {
      childNode.attribute("fetch", fetch);
      return this;
   }

   /**
    * Sets the <code>fetch</code> attribute
    * @param fetch the value for the attribute <code>fetch</code> 
    * @return the current instance of <code>ManyToMany<T></code> 
    */
   public ManyToMany<T> fetch(String fetch)
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
    * @return the current instance of <code>ManyToMany<T></code> 
    */
   public ManyToMany<T> removeFetch()
   {
      childNode.removeAttribute("fetch");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ManyToMany ElementName: orm:access-type ElementType : access
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>access</code> attribute
    * @param access the value for the attribute <code>access</code> 
    * @return the current instance of <code>ManyToMany<T></code> 
    */
   public ManyToMany<T> access(AccessType access)
   {
      childNode.attribute("access", access);
      return this;
   }

   /**
    * Sets the <code>access</code> attribute
    * @param access the value for the attribute <code>access</code> 
    * @return the current instance of <code>ManyToMany<T></code> 
    */
   public ManyToMany<T> access(String access)
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
    * @return the current instance of <code>ManyToMany<T></code> 
    */
   public ManyToMany<T> removeAccess()
   {
      childNode.removeAttribute("access");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ManyToMany ElementName: xsd:string ElementType : mapped-by
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>mapped-by</code> attribute
    * @param mappedBy the value for the attribute <code>mapped-by</code> 
    * @return the current instance of <code>ManyToMany<T></code> 
    */
   public ManyToMany<T> mappedBy(String mappedBy)
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
    * @return the current instance of <code>ManyToMany<T></code> 
    */
   public ManyToMany<T> removeMappedBy()
   {
      childNode.removeAttribute("mapped-by");
      return this;
   }
}
