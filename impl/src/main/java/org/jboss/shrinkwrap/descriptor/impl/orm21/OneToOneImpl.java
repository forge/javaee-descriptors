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
import org.jboss.shrinkwrap.descriptor.api.orm21.OneToOne;
import org.jboss.shrinkwrap.descriptor.api.orm21.PrimaryKeyJoinColumn;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> one-to-one </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class OneToOneImpl<T> implements Child<T>, OneToOne<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public OneToOneImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public OneToOneImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OneToOne ElementName: orm:primary-key-join-column ElementType : primary-key-join-column
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>primary-key-join-column</code> element will be created and returned.
    * Otherwise, the first existing <code>primary-key-join-column</code> element will be returned.
    * @return the instance defined for the element <code>primary-key-join-column</code> 
    */
   public PrimaryKeyJoinColumn<OneToOne<T>> getOrCreatePrimaryKeyJoinColumn()
   {
      List<Node> nodeList = childNode.get("primary-key-join-column");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new PrimaryKeyJoinColumnImpl<OneToOne<T>>(this, "primary-key-join-column", childNode, nodeList.get(0));
      }
      return createPrimaryKeyJoinColumn();
   }

   /**
    * Creates a new <code>primary-key-join-column</code> element 
    * @return the new created instance of <code>PrimaryKeyJoinColumn<OneToOne<T>></code> 
    */
   public PrimaryKeyJoinColumn<OneToOne<T>> createPrimaryKeyJoinColumn()
   {
      return new PrimaryKeyJoinColumnImpl<OneToOne<T>>(this, "primary-key-join-column", childNode);
   }

   /**
    * Returns all <code>primary-key-join-column</code> elements
    * @return list of <code>primary-key-join-column</code> 
    */
   public List<PrimaryKeyJoinColumn<OneToOne<T>>> getAllPrimaryKeyJoinColumn()
   {
      List<PrimaryKeyJoinColumn<OneToOne<T>>> list = new ArrayList<PrimaryKeyJoinColumn<OneToOne<T>>>();
      List<Node> nodeList = childNode.get("primary-key-join-column");
      for(Node node: nodeList)
      {
         PrimaryKeyJoinColumn<OneToOne<T>>  type = new PrimaryKeyJoinColumnImpl<OneToOne<T>>(this, "primary-key-join-column", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>primary-key-join-column</code> elements 
    * @return the current instance of <code>PrimaryKeyJoinColumn<OneToOne<T>></code> 
    */
   public OneToOne<T> removeAllPrimaryKeyJoinColumn()
   {
      childNode.removeChildren("primary-key-join-column");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OneToOne ElementName: orm:foreign-key ElementType : primary-key-foreign-key
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>primary-key-foreign-key</code> element with the given value will be created.
    * Otherwise, the existing <code>primary-key-foreign-key</code> element will be returned.
    * @return  a new or existing instance of <code>ForeignKey<OneToOne<T>></code> 
    */
   public ForeignKey<OneToOne<T>> getOrCreatePrimaryKeyForeignKey()
   {
      Node node = childNode.getOrCreate("primary-key-foreign-key");
      ForeignKey<OneToOne<T>> primaryKeyForeignKey = new ForeignKeyImpl<OneToOne<T>>(this, "primary-key-foreign-key", childNode, node);
      return primaryKeyForeignKey;
   }

   /**
    * Removes the <code>primary-key-foreign-key</code> element 
    * @return the current instance of <code>OneToOne<T></code> 
    */
   public OneToOne<T> removePrimaryKeyForeignKey()
   {
      childNode.removeChildren("primary-key-foreign-key");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OneToOne ElementName: orm:join-column ElementType : join-column
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>join-column</code> element will be created and returned.
    * Otherwise, the first existing <code>join-column</code> element will be returned.
    * @return the instance defined for the element <code>join-column</code> 
    */
   public JoinColumn<OneToOne<T>> getOrCreateJoinColumn()
   {
      List<Node> nodeList = childNode.get("join-column");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new JoinColumnImpl<OneToOne<T>>(this, "join-column", childNode, nodeList.get(0));
      }
      return createJoinColumn();
   }

   /**
    * Creates a new <code>join-column</code> element 
    * @return the new created instance of <code>JoinColumn<OneToOne<T>></code> 
    */
   public JoinColumn<OneToOne<T>> createJoinColumn()
   {
      return new JoinColumnImpl<OneToOne<T>>(this, "join-column", childNode);
   }

   /**
    * Returns all <code>join-column</code> elements
    * @return list of <code>join-column</code> 
    */
   public List<JoinColumn<OneToOne<T>>> getAllJoinColumn()
   {
      List<JoinColumn<OneToOne<T>>> list = new ArrayList<JoinColumn<OneToOne<T>>>();
      List<Node> nodeList = childNode.get("join-column");
      for(Node node: nodeList)
      {
         JoinColumn<OneToOne<T>>  type = new JoinColumnImpl<OneToOne<T>>(this, "join-column", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>join-column</code> elements 
    * @return the current instance of <code>JoinColumn<OneToOne<T>></code> 
    */
   public OneToOne<T> removeAllJoinColumn()
   {
      childNode.removeChildren("join-column");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OneToOne ElementName: orm:foreign-key ElementType : foreign-key
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>foreign-key</code> element with the given value will be created.
    * Otherwise, the existing <code>foreign-key</code> element will be returned.
    * @return  a new or existing instance of <code>ForeignKey<OneToOne<T>></code> 
    */
   public ForeignKey<OneToOne<T>> getOrCreateForeignKey()
   {
      Node node = childNode.getOrCreate("foreign-key");
      ForeignKey<OneToOne<T>> foreignKey = new ForeignKeyImpl<OneToOne<T>>(this, "foreign-key", childNode, node);
      return foreignKey;
   }

   /**
    * Removes the <code>foreign-key</code> element 
    * @return the current instance of <code>OneToOne<T></code> 
    */
   public OneToOne<T> removeForeignKey()
   {
      childNode.removeChildren("foreign-key");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OneToOne ElementName: orm:join-table ElementType : join-table
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>join-table</code> element with the given value will be created.
    * Otherwise, the existing <code>join-table</code> element will be returned.
    * @return  a new or existing instance of <code>JoinTable<OneToOne<T>></code> 
    */
   public JoinTable<OneToOne<T>> getOrCreateJoinTable()
   {
      Node node = childNode.getOrCreate("join-table");
      JoinTable<OneToOne<T>> joinTable = new JoinTableImpl<OneToOne<T>>(this, "join-table", childNode, node);
      return joinTable;
   }

   /**
    * Removes the <code>join-table</code> element 
    * @return the current instance of <code>OneToOne<T></code> 
    */
   public OneToOne<T> removeJoinTable()
   {
      childNode.removeChildren("join-table");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OneToOne ElementName: orm:cascade-type ElementType : cascade
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>cascade</code> element with the given value will be created.
    * Otherwise, the existing <code>cascade</code> element will be returned.
    * @return  a new or existing instance of <code>CascadeType<OneToOne<T>></code> 
    */
   public CascadeType<OneToOne<T>> getOrCreateCascade()
   {
      Node node = childNode.getOrCreate("cascade");
      CascadeType<OneToOne<T>> cascade = new CascadeTypeImpl<OneToOne<T>>(this, "cascade", childNode, node);
      return cascade;
   }

   /**
    * Removes the <code>cascade</code> element 
    * @return the current instance of <code>OneToOne<T></code> 
    */
   public OneToOne<T> removeCascade()
   {
      childNode.removeChildren("cascade");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OneToOne ElementName: xsd:string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>OneToOne<T></code> 
    */
   public OneToOne<T> name(String name)
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
    * @return the current instance of <code>OneToOne<T></code> 
    */
   public OneToOne<T> removeName()
   {
      childNode.removeAttribute("name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OneToOne ElementName: xsd:string ElementType : target-entity
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>target-entity</code> attribute
    * @param targetEntity the value for the attribute <code>target-entity</code> 
    * @return the current instance of <code>OneToOne<T></code> 
    */
   public OneToOne<T> targetEntity(String targetEntity)
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
    * @return the current instance of <code>OneToOne<T></code> 
    */
   public OneToOne<T> removeTargetEntity()
   {
      childNode.removeAttribute("target-entity");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OneToOne ElementName: orm:fetch-type ElementType : fetch
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>fetch</code> attribute
    * @param fetch the value for the attribute <code>fetch</code> 
    * @return the current instance of <code>OneToOne<T></code> 
    */
   public OneToOne<T> fetch(FetchType fetch)
   {
      childNode.attribute("fetch", fetch);
      return this;
   }

   /**
    * Sets the <code>fetch</code> attribute
    * @param fetch the value for the attribute <code>fetch</code> 
    * @return the current instance of <code>OneToOne<T></code> 
    */
   public OneToOne<T> fetch(String fetch)
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
    * @return the current instance of <code>OneToOne<T></code> 
    */
   public OneToOne<T> removeFetch()
   {
      childNode.removeAttribute("fetch");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OneToOne ElementName: xsd:boolean ElementType : optional
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>optional</code> attribute
    * @param optional the value for the attribute <code>optional</code> 
    * @return the current instance of <code>OneToOne<T></code> 
    */
   public OneToOne<T> optional(Boolean optional)
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
    * @return the current instance of <code>OneToOne<T></code> 
    */
   public OneToOne<T> removeOptional()
   {
      childNode.removeAttribute("optional");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OneToOne ElementName: orm:access-type ElementType : access
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>access</code> attribute
    * @param access the value for the attribute <code>access</code> 
    * @return the current instance of <code>OneToOne<T></code> 
    */
   public OneToOne<T> access(AccessType access)
   {
      childNode.attribute("access", access);
      return this;
   }

   /**
    * Sets the <code>access</code> attribute
    * @param access the value for the attribute <code>access</code> 
    * @return the current instance of <code>OneToOne<T></code> 
    */
   public OneToOne<T> access(String access)
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
    * @return the current instance of <code>OneToOne<T></code> 
    */
   public OneToOne<T> removeAccess()
   {
      childNode.removeAttribute("access");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OneToOne ElementName: xsd:string ElementType : mapped-by
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>mapped-by</code> attribute
    * @param mappedBy the value for the attribute <code>mapped-by</code> 
    * @return the current instance of <code>OneToOne<T></code> 
    */
   public OneToOne<T> mappedBy(String mappedBy)
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
    * @return the current instance of <code>OneToOne<T></code> 
    */
   public OneToOne<T> removeMappedBy()
   {
      childNode.removeAttribute("mapped-by");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OneToOne ElementName: xsd:boolean ElementType : orphan-removal
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>orphan-removal</code> attribute
    * @param orphanRemoval the value for the attribute <code>orphan-removal</code> 
    * @return the current instance of <code>OneToOne<T></code> 
    */
   public OneToOne<T> orphanRemoval(Boolean orphanRemoval)
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
    * @return the current instance of <code>OneToOne<T></code> 
    */
   public OneToOne<T> removeOrphanRemoval()
   {
      childNode.removeAttribute("orphan-removal");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OneToOne ElementName: xsd:string ElementType : maps-id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>maps-id</code> attribute
    * @param mapsId the value for the attribute <code>maps-id</code> 
    * @return the current instance of <code>OneToOne<T></code> 
    */
   public OneToOne<T> mapsId(String mapsId)
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
    * @return the current instance of <code>OneToOne<T></code> 
    */
   public OneToOne<T> removeMapsId()
   {
      childNode.removeAttribute("maps-id");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: OneToOne ElementName: xsd:boolean ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>OneToOne<T></code> 
    */
   public OneToOne<T> id(Boolean id)
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
    * @return the current instance of <code>OneToOne<T></code> 
    */
   public OneToOne<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
