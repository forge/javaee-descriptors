package org.jboss.shrinkwrap.descriptor.impl.orm21; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.orm21.AccessType;
import org.jboss.shrinkwrap.descriptor.api.orm21.CascadeType;
import org.jboss.shrinkwrap.descriptor.api.orm21.FetchType;
import org.jboss.shrinkwrap.descriptor.api.orm21.ForeignKey;
import org.jboss.shrinkwrap.descriptor.api.orm21.JoinColumn;
import org.jboss.shrinkwrap.descriptor.api.orm21.JoinTable;
import org.jboss.shrinkwrap.descriptor.api.orm21.ManyToOne;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> many-to-one </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class ManyToOneImpl<T> implements Child<T>, ManyToOne<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public ManyToOneImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public ManyToOneImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ManyToOne ElementName: orm:join-column ElementType : join-column
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>join-column</code> element will be created and returned.
    * Otherwise, the first existing <code>join-column</code> element will be returned.
    * @return the instance defined for the element <code>join-column</code> 
    */
   public JoinColumn<ManyToOne<T>> getOrCreateJoinColumn()
   {
      List<Node> nodeList = childNode.get("join-column");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new JoinColumnImpl<ManyToOne<T>>(this, "join-column", childNode, nodeList.get(0));
      }
      return createJoinColumn();
   }

   /**
    * Creates a new <code>join-column</code> element 
    * @return the new created instance of <code>JoinColumn<ManyToOne<T>></code> 
    */
   public JoinColumn<ManyToOne<T>> createJoinColumn()
   {
      return new JoinColumnImpl<ManyToOne<T>>(this, "join-column", childNode);
   }

   /**
    * Returns all <code>join-column</code> elements
    * @return list of <code>join-column</code> 
    */
   public List<JoinColumn<ManyToOne<T>>> getAllJoinColumn()
   {
      List<JoinColumn<ManyToOne<T>>> list = new ArrayList<JoinColumn<ManyToOne<T>>>();
      List<Node> nodeList = childNode.get("join-column");
      for(Node node: nodeList)
      {
         JoinColumn<ManyToOne<T>>  type = new JoinColumnImpl<ManyToOne<T>>(this, "join-column", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>join-column</code> elements 
    * @return the current instance of <code>JoinColumn<ManyToOne<T>></code> 
    */
   public ManyToOne<T> removeAllJoinColumn()
   {
      childNode.removeChildren("join-column");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ManyToOne ElementName: orm:foreign-key ElementType : foreign-key
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>foreign-key</code> element with the given value will be created.
    * Otherwise, the existing <code>foreign-key</code> element will be returned.
    * @return  a new or existing instance of <code>ForeignKey<ManyToOne<T>></code> 
    */
   public ForeignKey<ManyToOne<T>> getOrCreateForeignKey()
   {
      Node node = childNode.getOrCreate("foreign-key");
      ForeignKey<ManyToOne<T>> foreignKey = new ForeignKeyImpl<ManyToOne<T>>(this, "foreign-key", childNode, node);
      return foreignKey;
   }

   /**
    * Removes the <code>foreign-key</code> element 
    * @return the current instance of <code>ManyToOne<T></code> 
    */
   public ManyToOne<T> removeForeignKey()
   {
      childNode.removeChildren("foreign-key");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ManyToOne ElementName: orm:join-table ElementType : join-table
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>join-table</code> element with the given value will be created.
    * Otherwise, the existing <code>join-table</code> element will be returned.
    * @return  a new or existing instance of <code>JoinTable<ManyToOne<T>></code> 
    */
   public JoinTable<ManyToOne<T>> getOrCreateJoinTable()
   {
      Node node = childNode.getOrCreate("join-table");
      JoinTable<ManyToOne<T>> joinTable = new JoinTableImpl<ManyToOne<T>>(this, "join-table", childNode, node);
      return joinTable;
   }

   /**
    * Removes the <code>join-table</code> element 
    * @return the current instance of <code>ManyToOne<T></code> 
    */
   public ManyToOne<T> removeJoinTable()
   {
      childNode.removeChildren("join-table");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ManyToOne ElementName: orm:cascade-type ElementType : cascade
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>cascade</code> element with the given value will be created.
    * Otherwise, the existing <code>cascade</code> element will be returned.
    * @return  a new or existing instance of <code>CascadeType<ManyToOne<T>></code> 
    */
   public CascadeType<ManyToOne<T>> getOrCreateCascade()
   {
      Node node = childNode.getOrCreate("cascade");
      CascadeType<ManyToOne<T>> cascade = new CascadeTypeImpl<ManyToOne<T>>(this, "cascade", childNode, node);
      return cascade;
   }

   /**
    * Removes the <code>cascade</code> element 
    * @return the current instance of <code>ManyToOne<T></code> 
    */
   public ManyToOne<T> removeCascade()
   {
      childNode.removeChildren("cascade");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ManyToOne ElementName: xsd:string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>ManyToOne<T></code> 
    */
   public ManyToOne<T> name(String name)
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
    * @return the current instance of <code>ManyToOne<T></code> 
    */
   public ManyToOne<T> removeName()
   {
      childNode.removeAttribute("name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ManyToOne ElementName: xsd:string ElementType : target-entity
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>target-entity</code> attribute
    * @param targetEntity the value for the attribute <code>target-entity</code> 
    * @return the current instance of <code>ManyToOne<T></code> 
    */
   public ManyToOne<T> targetEntity(String targetEntity)
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
    * @return the current instance of <code>ManyToOne<T></code> 
    */
   public ManyToOne<T> removeTargetEntity()
   {
      childNode.removeAttribute("target-entity");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ManyToOne ElementName: orm:fetch-type ElementType : fetch
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>fetch</code> attribute
    * @param fetch the value for the attribute <code>fetch</code> 
    * @return the current instance of <code>ManyToOne<T></code> 
    */
   public ManyToOne<T> fetch(FetchType fetch)
   {
      childNode.attribute("fetch", fetch);
      return this;
   }

   /**
    * Sets the <code>fetch</code> attribute
    * @param fetch the value for the attribute <code>fetch</code> 
    * @return the current instance of <code>ManyToOne<T></code> 
    */
   public ManyToOne<T> fetch(String fetch)
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
    * @return the current instance of <code>ManyToOne<T></code> 
    */
   public ManyToOne<T> removeFetch()
   {
      childNode.removeAttribute("fetch");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ManyToOne ElementName: xsd:boolean ElementType : optional
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>optional</code> attribute
    * @param optional the value for the attribute <code>optional</code> 
    * @return the current instance of <code>ManyToOne<T></code> 
    */
   public ManyToOne<T> optional(Boolean optional)
   {
      childNode.attribute("optional", optional);
      return this;
   }

   /**
    * Returns the <code>optional</code> attribute
    * @return the value defined for the attribute <code>optional</code> 
    */
   public Boolean isOptional()
   {
      return Strings.isTrue(childNode.getAttribute("optional"));
   }

   /**
    * Removes the <code>optional</code> attribute 
    * @return the current instance of <code>ManyToOne<T></code> 
    */
   public ManyToOne<T> removeOptional()
   {
      childNode.removeAttribute("optional");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ManyToOne ElementName: orm:access-type ElementType : access
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>access</code> attribute
    * @param access the value for the attribute <code>access</code> 
    * @return the current instance of <code>ManyToOne<T></code> 
    */
   public ManyToOne<T> access(AccessType access)
   {
      childNode.attribute("access", access);
      return this;
   }

   /**
    * Sets the <code>access</code> attribute
    * @param access the value for the attribute <code>access</code> 
    * @return the current instance of <code>ManyToOne<T></code> 
    */
   public ManyToOne<T> access(String access)
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
    * @return the current instance of <code>ManyToOne<T></code> 
    */
   public ManyToOne<T> removeAccess()
   {
      childNode.removeAttribute("access");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ManyToOne ElementName: xsd:string ElementType : maps-id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>maps-id</code> attribute
    * @param mapsId the value for the attribute <code>maps-id</code> 
    * @return the current instance of <code>ManyToOne<T></code> 
    */
   public ManyToOne<T> mapsId(String mapsId)
   {
      childNode.attribute("maps-id", mapsId);
      return this;
   }

   /**
    * Returns the <code>maps-id</code> attribute
    * @return the value defined for the attribute <code>maps-id</code> 
    */
      public String getMapsId()
   {
      return childNode.getAttribute("maps-id");
   }

   /**
    * Removes the <code>maps-id</code> attribute 
    * @return the current instance of <code>ManyToOne<T></code> 
    */
   public ManyToOne<T> removeMapsId()
   {
      childNode.removeAttribute("maps-id");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ManyToOne ElementName: xsd:boolean ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>ManyToOne<T></code> 
    */
   public ManyToOne<T> id(Boolean id)
   {
      childNode.attribute("id", id);
      return this;
   }

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public Boolean isId()
   {
      return Strings.isTrue(childNode.getAttribute("id"));
   }

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>ManyToOne<T></code> 
    */
   public ManyToOne<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
