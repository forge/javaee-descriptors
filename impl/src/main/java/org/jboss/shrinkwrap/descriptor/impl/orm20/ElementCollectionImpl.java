package org.jboss.shrinkwrap.descriptor.impl.orm20; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.orm20.ElementCollection;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.orm20.OrderColumn;
import org.jboss.shrinkwrap.descriptor.impl.orm20.OrderColumnImpl;
import org.jboss.shrinkwrap.descriptor.api.orm20.MapKey;
import org.jboss.shrinkwrap.descriptor.impl.orm20.MapKeyImpl;
import org.jboss.shrinkwrap.descriptor.api.orm20.MapKeyClass;
import org.jboss.shrinkwrap.descriptor.impl.orm20.MapKeyClassImpl;
import org.jboss.shrinkwrap.descriptor.api.orm20.TemporalType;
import org.jboss.shrinkwrap.descriptor.api.orm20.EnumType;
import org.jboss.shrinkwrap.descriptor.api.orm20.AttributeOverride;
import org.jboss.shrinkwrap.descriptor.impl.orm20.AttributeOverrideImpl;
import org.jboss.shrinkwrap.descriptor.api.orm20.MapKeyColumn;
import org.jboss.shrinkwrap.descriptor.impl.orm20.MapKeyColumnImpl;
import org.jboss.shrinkwrap.descriptor.api.orm20.MapKeyJoinColumn;
import org.jboss.shrinkwrap.descriptor.impl.orm20.MapKeyJoinColumnImpl;
import org.jboss.shrinkwrap.descriptor.api.orm20.Column;
import org.jboss.shrinkwrap.descriptor.impl.orm20.ColumnImpl;
import org.jboss.shrinkwrap.descriptor.api.orm20.TemporalType;
import org.jboss.shrinkwrap.descriptor.api.orm20.EnumType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EmptyType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.EmptyTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.orm20.AttributeOverride;
import org.jboss.shrinkwrap.descriptor.impl.orm20.AttributeOverrideImpl;
import org.jboss.shrinkwrap.descriptor.api.orm20.AssociationOverride;
import org.jboss.shrinkwrap.descriptor.impl.orm20.AssociationOverrideImpl;
import org.jboss.shrinkwrap.descriptor.api.orm20.CollectionTable;
import org.jboss.shrinkwrap.descriptor.impl.orm20.CollectionTableImpl;
import org.jboss.shrinkwrap.descriptor.api.orm20.FetchType;
import org.jboss.shrinkwrap.descriptor.api.orm20.AccessType;

/**
 * This class implements the <code> element-collection </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class ElementCollectionImpl<T> implements Child<T>, ElementCollection<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public ElementCollectionImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public ElementCollectionImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ElementCollection ElementName: xsd:string ElementType : order-by
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>order-by</code> element
    * @param orderBy the value for the element <code>order-by</code> 
    * @return the current instance of <code>ElementCollection<T></code> 
    */
   public ElementCollection<T> orderBy(String orderBy)
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
    * @return the current instance of <code>ElementCollection<T></code> 
    */
   public ElementCollection<T> removeOrderBy()
   {
      childNode.removeChildren("order-by");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ElementCollection ElementName: orm:order-column ElementType : order-column
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>order-column</code> element with the given value will be created.
    * Otherwise, the existing <code>order-column</code> element will be returned.
    * @return  a new or existing instance of <code>OrderColumn<ElementCollection<T>></code> 
    */
   public OrderColumn<ElementCollection<T>> getOrCreateOrderColumn()
   {
      Node node = childNode.getOrCreate("order-column");
      OrderColumn<ElementCollection<T>> orderColumn = new OrderColumnImpl<ElementCollection<T>>(this, "order-column", childNode, node);
      return orderColumn;
   }

   /**
    * Removes the <code>order-column</code> element 
    * @return the current instance of <code>ElementCollection<T></code> 
    */
   public ElementCollection<T> removeOrderColumn()
   {
      childNode.removeChildren("order-column");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ElementCollection ElementName: orm:map-key ElementType : map-key
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>map-key</code> element with the given value will be created.
    * Otherwise, the existing <code>map-key</code> element will be returned.
    * @return  a new or existing instance of <code>MapKey<ElementCollection<T>></code> 
    */
   public MapKey<ElementCollection<T>> getOrCreateMapKey()
   {
      Node node = childNode.getOrCreate("map-key");
      MapKey<ElementCollection<T>> mapKey = new MapKeyImpl<ElementCollection<T>>(this, "map-key", childNode, node);
      return mapKey;
   }

   /**
    * Removes the <code>map-key</code> element 
    * @return the current instance of <code>ElementCollection<T></code> 
    */
   public ElementCollection<T> removeMapKey()
   {
      childNode.removeChildren("map-key");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ElementCollection ElementName: orm:map-key-class ElementType : map-key-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>map-key-class</code> element with the given value will be created.
    * Otherwise, the existing <code>map-key-class</code> element will be returned.
    * @return  a new or existing instance of <code>MapKeyClass<ElementCollection<T>></code> 
    */
   public MapKeyClass<ElementCollection<T>> getOrCreateMapKeyClass()
   {
      Node node = childNode.getOrCreate("map-key-class");
      MapKeyClass<ElementCollection<T>> mapKeyClass = new MapKeyClassImpl<ElementCollection<T>>(this, "map-key-class", childNode, node);
      return mapKeyClass;
   }

   /**
    * Removes the <code>map-key-class</code> element 
    * @return the current instance of <code>ElementCollection<T></code> 
    */
   public ElementCollection<T> removeMapKeyClass()
   {
      childNode.removeChildren("map-key-class");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ElementCollection ElementName: orm:temporal-type ElementType : map-key-temporal
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>map-key-temporal</code> element
    * @param mapKeyTemporal the value for the element <code>map-key-temporal</code> 
    * @return the current instance of <code>ElementCollection<T></code> 
    */
   public ElementCollection<T> mapKeyTemporal(TemporalType mapKeyTemporal)
   {
      childNode.getOrCreate("map-key-temporal").text(mapKeyTemporal);
      return this;
   }
   /**
    * Sets the <code>map-key-temporal</code> element
    * @param mapKeyTemporal the value for the element <code>map-key-temporal</code> 
    * @return the current instance of <code>ElementCollection<T></code> 
    */
   public ElementCollection<T> mapKeyTemporal(String mapKeyTemporal)
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
    * @return the current instance of <code>ElementCollection<T></code> 
    */
   public ElementCollection<T> removeMapKeyTemporal()
   {
      childNode.removeAttribute("map-key-temporal");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ElementCollection ElementName: orm:enum-type ElementType : map-key-enumerated
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>map-key-enumerated</code> element
    * @param mapKeyEnumerated the value for the element <code>map-key-enumerated</code> 
    * @return the current instance of <code>ElementCollection<T></code> 
    */
   public ElementCollection<T> mapKeyEnumerated(EnumType mapKeyEnumerated)
   {
      childNode.getOrCreate("map-key-enumerated").text(mapKeyEnumerated);
      return this;
   }
   /**
    * Sets the <code>map-key-enumerated</code> element
    * @param mapKeyEnumerated the value for the element <code>map-key-enumerated</code> 
    * @return the current instance of <code>ElementCollection<T></code> 
    */
   public ElementCollection<T> mapKeyEnumerated(String mapKeyEnumerated)
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
    * @return the current instance of <code>ElementCollection<T></code> 
    */
   public ElementCollection<T> removeMapKeyEnumerated()
   {
      childNode.removeAttribute("map-key-enumerated");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ElementCollection ElementName: orm:attribute-override ElementType : map-key-attribute-override
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>map-key-attribute-override</code> element will be created and returned.
    * Otherwise, the first existing <code>map-key-attribute-override</code> element will be returned.
    * @return the instance defined for the element <code>map-key-attribute-override</code> 
    */
   public AttributeOverride<ElementCollection<T>> getOrCreateMapKeyAttributeOverride()
   {
      List<Node> nodeList = childNode.get("map-key-attribute-override");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new AttributeOverrideImpl<ElementCollection<T>>(this, "map-key-attribute-override", childNode, nodeList.get(0));
      }
      return createMapKeyAttributeOverride();
   }

   /**
    * Creates a new <code>map-key-attribute-override</code> element 
    * @return the new created instance of <code>AttributeOverride<ElementCollection<T>></code> 
    */
   public AttributeOverride<ElementCollection<T>> createMapKeyAttributeOverride()
   {
      return new AttributeOverrideImpl<ElementCollection<T>>(this, "map-key-attribute-override", childNode);
   }

   /**
    * Returns all <code>map-key-attribute-override</code> elements
    * @return list of <code>map-key-attribute-override</code> 
    */
   public List<AttributeOverride<ElementCollection<T>>> getAllMapKeyAttributeOverride()
   {
      List<AttributeOverride<ElementCollection<T>>> list = new ArrayList<AttributeOverride<ElementCollection<T>>>();
      List<Node> nodeList = childNode.get("map-key-attribute-override");
      for(Node node: nodeList)
      {
         AttributeOverride<ElementCollection<T>>  type = new AttributeOverrideImpl<ElementCollection<T>>(this, "map-key-attribute-override", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>map-key-attribute-override</code> elements 
    * @return the current instance of <code>AttributeOverride<ElementCollection<T>></code> 
    */
   public ElementCollection<T> removeAllMapKeyAttributeOverride()
   {
      childNode.removeChildren("map-key-attribute-override");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ElementCollection ElementName: orm:map-key-column ElementType : map-key-column
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>map-key-column</code> element with the given value will be created.
    * Otherwise, the existing <code>map-key-column</code> element will be returned.
    * @return  a new or existing instance of <code>MapKeyColumn<ElementCollection<T>></code> 
    */
   public MapKeyColumn<ElementCollection<T>> getOrCreateMapKeyColumn()
   {
      Node node = childNode.getOrCreate("map-key-column");
      MapKeyColumn<ElementCollection<T>> mapKeyColumn = new MapKeyColumnImpl<ElementCollection<T>>(this, "map-key-column", childNode, node);
      return mapKeyColumn;
   }

   /**
    * Removes the <code>map-key-column</code> element 
    * @return the current instance of <code>ElementCollection<T></code> 
    */
   public ElementCollection<T> removeMapKeyColumn()
   {
      childNode.removeChildren("map-key-column");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ElementCollection ElementName: orm:map-key-join-column ElementType : map-key-join-column
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>map-key-join-column</code> element will be created and returned.
    * Otherwise, the first existing <code>map-key-join-column</code> element will be returned.
    * @return the instance defined for the element <code>map-key-join-column</code> 
    */
   public MapKeyJoinColumn<ElementCollection<T>> getOrCreateMapKeyJoinColumn()
   {
      List<Node> nodeList = childNode.get("map-key-join-column");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new MapKeyJoinColumnImpl<ElementCollection<T>>(this, "map-key-join-column", childNode, nodeList.get(0));
      }
      return createMapKeyJoinColumn();
   }

   /**
    * Creates a new <code>map-key-join-column</code> element 
    * @return the new created instance of <code>MapKeyJoinColumn<ElementCollection<T>></code> 
    */
   public MapKeyJoinColumn<ElementCollection<T>> createMapKeyJoinColumn()
   {
      return new MapKeyJoinColumnImpl<ElementCollection<T>>(this, "map-key-join-column", childNode);
   }

   /**
    * Returns all <code>map-key-join-column</code> elements
    * @return list of <code>map-key-join-column</code> 
    */
   public List<MapKeyJoinColumn<ElementCollection<T>>> getAllMapKeyJoinColumn()
   {
      List<MapKeyJoinColumn<ElementCollection<T>>> list = new ArrayList<MapKeyJoinColumn<ElementCollection<T>>>();
      List<Node> nodeList = childNode.get("map-key-join-column");
      for(Node node: nodeList)
      {
         MapKeyJoinColumn<ElementCollection<T>>  type = new MapKeyJoinColumnImpl<ElementCollection<T>>(this, "map-key-join-column", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>map-key-join-column</code> elements 
    * @return the current instance of <code>MapKeyJoinColumn<ElementCollection<T>></code> 
    */
   public ElementCollection<T> removeAllMapKeyJoinColumn()
   {
      childNode.removeChildren("map-key-join-column");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ElementCollection ElementName: orm:column ElementType : column
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>column</code> element with the given value will be created.
    * Otherwise, the existing <code>column</code> element will be returned.
    * @return  a new or existing instance of <code>Column<ElementCollection<T>></code> 
    */
   public Column<ElementCollection<T>> getOrCreateColumn()
   {
      Node node = childNode.getOrCreate("column");
      Column<ElementCollection<T>> column = new ColumnImpl<ElementCollection<T>>(this, "column", childNode, node);
      return column;
   }

   /**
    * Removes the <code>column</code> element 
    * @return the current instance of <code>ElementCollection<T></code> 
    */
   public ElementCollection<T> removeColumn()
   {
      childNode.removeChildren("column");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ElementCollection ElementName: orm:temporal-type ElementType : temporal
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>temporal</code> element
    * @param temporal the value for the element <code>temporal</code> 
    * @return the current instance of <code>ElementCollection<T></code> 
    */
   public ElementCollection<T> temporal(TemporalType temporal)
   {
      childNode.getOrCreate("temporal").text(temporal);
      return this;
   }
   /**
    * Sets the <code>temporal</code> element
    * @param temporal the value for the element <code>temporal</code> 
    * @return the current instance of <code>ElementCollection<T></code> 
    */
   public ElementCollection<T> temporal(String temporal)
   {
      childNode.getOrCreate("temporal").text(temporal);
      return this;
   }

   /**
    * Returns the <code>temporal</code> element
    * @return the value found for the element <code>temporal</code> 
    */
   public TemporalType getTemporal()
   {
      return TemporalType.getFromStringValue(childNode.getTextValueForPatternName("temporal"));
   }

   /**
    * Returns the <code>temporal</code> element
    * @return the value found for the element <code>temporal</code> 
    */
   public String  getTemporalAsString()
   {
      return childNode.getTextValueForPatternName("temporal");
   }

   /**
    * Removes the <code>temporal</code> attribute 
    * @return the current instance of <code>ElementCollection<T></code> 
    */
   public ElementCollection<T> removeTemporal()
   {
      childNode.removeAttribute("temporal");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ElementCollection ElementName: orm:enum-type ElementType : enumerated
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>enumerated</code> element
    * @param enumerated the value for the element <code>enumerated</code> 
    * @return the current instance of <code>ElementCollection<T></code> 
    */
   public ElementCollection<T> enumerated(EnumType enumerated)
   {
      childNode.getOrCreate("enumerated").text(enumerated);
      return this;
   }
   /**
    * Sets the <code>enumerated</code> element
    * @param enumerated the value for the element <code>enumerated</code> 
    * @return the current instance of <code>ElementCollection<T></code> 
    */
   public ElementCollection<T> enumerated(String enumerated)
   {
      childNode.getOrCreate("enumerated").text(enumerated);
      return this;
   }

   /**
    * Returns the <code>enumerated</code> element
    * @return the value found for the element <code>enumerated</code> 
    */
   public EnumType getEnumerated()
   {
      return EnumType.getFromStringValue(childNode.getTextValueForPatternName("enumerated"));
   }

   /**
    * Returns the <code>enumerated</code> element
    * @return the value found for the element <code>enumerated</code> 
    */
   public String  getEnumeratedAsString()
   {
      return childNode.getTextValueForPatternName("enumerated");
   }

   /**
    * Removes the <code>enumerated</code> attribute 
    * @return the current instance of <code>ElementCollection<T></code> 
    */
   public ElementCollection<T> removeEnumerated()
   {
      childNode.removeAttribute("enumerated");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ElementCollection ElementName: javaee:emptyType ElementType : lob
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>lob</code> element 
    * @return the current instance of <code>ElementCollection<T></code> 
    */
   public ElementCollection<T> lob()
   {
      childNode.getOrCreate("lob");
      return this;
   }

   /**
    * Removes the <code>lob</code> element 
    * @return the current instance of <code>ElementCollection<T></code> 
    */
   public Boolean isLob()
   {
      return childNode.getSingle("lob") != null;
   }

   /**
    * Removes the <code>lob</code> element 
    * @return the current instance of <code>ElementCollection<T></code> 
    */
   public ElementCollection<T> removeLob()
   {
      childNode.removeChild("lob");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ElementCollection ElementName: orm:attribute-override ElementType : attribute-override
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>attribute-override</code> element will be created and returned.
    * Otherwise, the first existing <code>attribute-override</code> element will be returned.
    * @return the instance defined for the element <code>attribute-override</code> 
    */
   public AttributeOverride<ElementCollection<T>> getOrCreateAttributeOverride()
   {
      List<Node> nodeList = childNode.get("attribute-override");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new AttributeOverrideImpl<ElementCollection<T>>(this, "attribute-override", childNode, nodeList.get(0));
      }
      return createAttributeOverride();
   }

   /**
    * Creates a new <code>attribute-override</code> element 
    * @return the new created instance of <code>AttributeOverride<ElementCollection<T>></code> 
    */
   public AttributeOverride<ElementCollection<T>> createAttributeOverride()
   {
      return new AttributeOverrideImpl<ElementCollection<T>>(this, "attribute-override", childNode);
   }

   /**
    * Returns all <code>attribute-override</code> elements
    * @return list of <code>attribute-override</code> 
    */
   public List<AttributeOverride<ElementCollection<T>>> getAllAttributeOverride()
   {
      List<AttributeOverride<ElementCollection<T>>> list = new ArrayList<AttributeOverride<ElementCollection<T>>>();
      List<Node> nodeList = childNode.get("attribute-override");
      for(Node node: nodeList)
      {
         AttributeOverride<ElementCollection<T>>  type = new AttributeOverrideImpl<ElementCollection<T>>(this, "attribute-override", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>attribute-override</code> elements 
    * @return the current instance of <code>AttributeOverride<ElementCollection<T>></code> 
    */
   public ElementCollection<T> removeAllAttributeOverride()
   {
      childNode.removeChildren("attribute-override");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ElementCollection ElementName: orm:association-override ElementType : association-override
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>association-override</code> element will be created and returned.
    * Otherwise, the first existing <code>association-override</code> element will be returned.
    * @return the instance defined for the element <code>association-override</code> 
    */
   public AssociationOverride<ElementCollection<T>> getOrCreateAssociationOverride()
   {
      List<Node> nodeList = childNode.get("association-override");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new AssociationOverrideImpl<ElementCollection<T>>(this, "association-override", childNode, nodeList.get(0));
      }
      return createAssociationOverride();
   }

   /**
    * Creates a new <code>association-override</code> element 
    * @return the new created instance of <code>AssociationOverride<ElementCollection<T>></code> 
    */
   public AssociationOverride<ElementCollection<T>> createAssociationOverride()
   {
      return new AssociationOverrideImpl<ElementCollection<T>>(this, "association-override", childNode);
   }

   /**
    * Returns all <code>association-override</code> elements
    * @return list of <code>association-override</code> 
    */
   public List<AssociationOverride<ElementCollection<T>>> getAllAssociationOverride()
   {
      List<AssociationOverride<ElementCollection<T>>> list = new ArrayList<AssociationOverride<ElementCollection<T>>>();
      List<Node> nodeList = childNode.get("association-override");
      for(Node node: nodeList)
      {
         AssociationOverride<ElementCollection<T>>  type = new AssociationOverrideImpl<ElementCollection<T>>(this, "association-override", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>association-override</code> elements 
    * @return the current instance of <code>AssociationOverride<ElementCollection<T>></code> 
    */
   public ElementCollection<T> removeAllAssociationOverride()
   {
      childNode.removeChildren("association-override");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ElementCollection ElementName: orm:collection-table ElementType : collection-table
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>collection-table</code> element with the given value will be created.
    * Otherwise, the existing <code>collection-table</code> element will be returned.
    * @return  a new or existing instance of <code>CollectionTable<ElementCollection<T>></code> 
    */
   public CollectionTable<ElementCollection<T>> getOrCreateCollectionTable()
   {
      Node node = childNode.getOrCreate("collection-table");
      CollectionTable<ElementCollection<T>> collectionTable = new CollectionTableImpl<ElementCollection<T>>(this, "collection-table", childNode, node);
      return collectionTable;
   }

   /**
    * Removes the <code>collection-table</code> element 
    * @return the current instance of <code>ElementCollection<T></code> 
    */
   public ElementCollection<T> removeCollectionTable()
   {
      childNode.removeChildren("collection-table");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ElementCollection ElementName: xsd:string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>ElementCollection<T></code> 
    */
   public ElementCollection<T> name(String name)
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
    * @return the current instance of <code>ElementCollection<T></code> 
    */
   public ElementCollection<T> removeName()
   {
      childNode.removeAttribute("name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ElementCollection ElementName: xsd:string ElementType : target-class
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>target-class</code> attribute
    * @param targetClass the value for the attribute <code>target-class</code> 
    * @return the current instance of <code>ElementCollection<T></code> 
    */
   public ElementCollection<T> targetClass(String targetClass)
   {
      childNode.attribute("target-class", targetClass);
      return this;
   }

   /**
    * Returns the <code>target-class</code> attribute
    * @return the value defined for the attribute <code>target-class</code> 
    */
      public String getTargetClass()
   {
      return childNode.getAttribute("target-class");
   }

   /**
    * Removes the <code>target-class</code> attribute 
    * @return the current instance of <code>ElementCollection<T></code> 
    */
   public ElementCollection<T> removeTargetClass()
   {
      childNode.removeAttribute("target-class");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ElementCollection ElementName: orm:fetch-type ElementType : fetch
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>fetch</code> attribute
    * @param fetch the value for the attribute <code>fetch</code> 
    * @return the current instance of <code>ElementCollection<T></code> 
    */
   public ElementCollection<T> fetch(FetchType fetch)
   {
      childNode.attribute("fetch", fetch);
      return this;
   }

   /**
    * Sets the <code>fetch</code> attribute
    * @param fetch the value for the attribute <code>fetch</code> 
    * @return the current instance of <code>ElementCollection<T></code> 
    */
   public ElementCollection<T> fetch(String fetch)
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
    * @return the current instance of <code>ElementCollection<T></code> 
    */
   public ElementCollection<T> removeFetch()
   {
      childNode.removeAttribute("fetch");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ElementCollection ElementName: orm:access-type ElementType : access
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>access</code> attribute
    * @param access the value for the attribute <code>access</code> 
    * @return the current instance of <code>ElementCollection<T></code> 
    */
   public ElementCollection<T> access(AccessType access)
   {
      childNode.attribute("access", access);
      return this;
   }

   /**
    * Sets the <code>access</code> attribute
    * @param access the value for the attribute <code>access</code> 
    * @return the current instance of <code>ElementCollection<T></code> 
    */
   public ElementCollection<T> access(String access)
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
    * @return the current instance of <code>ElementCollection<T></code> 
    */
   public ElementCollection<T> removeAccess()
   {
      childNode.removeAttribute("access");
      return this;
   }
}
