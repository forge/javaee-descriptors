package org.jboss.shrinkwrap.descriptor.impl.orm10; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.orm10.ColumnResult;
import org.jboss.shrinkwrap.descriptor.api.orm10.EntityResult;
import org.jboss.shrinkwrap.descriptor.api.orm10.SqlResultSetMapping;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> sql-result-set-mapping </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class SqlResultSetMappingImpl<T> implements Child<T>, SqlResultSetMapping<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public SqlResultSetMappingImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public SqlResultSetMappingImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SqlResultSetMapping ElementName: orm:entity-result ElementType : entity-result
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>entity-result</code> element will be created and returned.
    * Otherwise, the first existing <code>entity-result</code> element will be returned.
    * @return the instance defined for the element <code>entity-result</code> 
    */
   public EntityResult<SqlResultSetMapping<T>> getOrCreateEntityResult()
   {
      List<Node> nodeList = childNode.get("entity-result");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new EntityResultImpl<SqlResultSetMapping<T>>(this, "entity-result", childNode, nodeList.get(0));
      }
      return createEntityResult();
   }

   /**
    * Creates a new <code>entity-result</code> element 
    * @return the new created instance of <code>EntityResult<SqlResultSetMapping<T>></code> 
    */
   public EntityResult<SqlResultSetMapping<T>> createEntityResult()
   {
      return new EntityResultImpl<SqlResultSetMapping<T>>(this, "entity-result", childNode);
   }

   /**
    * Returns all <code>entity-result</code> elements
    * @return list of <code>entity-result</code> 
    */
   public List<EntityResult<SqlResultSetMapping<T>>> getAllEntityResult()
   {
      List<EntityResult<SqlResultSetMapping<T>>> list = new ArrayList<EntityResult<SqlResultSetMapping<T>>>();
      List<Node> nodeList = childNode.get("entity-result");
      for(Node node: nodeList)
      {
         EntityResult<SqlResultSetMapping<T>>  type = new EntityResultImpl<SqlResultSetMapping<T>>(this, "entity-result", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>entity-result</code> elements 
    * @return the current instance of <code>EntityResult<SqlResultSetMapping<T>></code> 
    */
   public SqlResultSetMapping<T> removeAllEntityResult()
   {
      childNode.removeChildren("entity-result");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SqlResultSetMapping ElementName: orm:column-result ElementType : column-result
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>column-result</code> element will be created and returned.
    * Otherwise, the first existing <code>column-result</code> element will be returned.
    * @return the instance defined for the element <code>column-result</code> 
    */
   public ColumnResult<SqlResultSetMapping<T>> getOrCreateColumnResult()
   {
      List<Node> nodeList = childNode.get("column-result");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ColumnResultImpl<SqlResultSetMapping<T>>(this, "column-result", childNode, nodeList.get(0));
      }
      return createColumnResult();
   }

   /**
    * Creates a new <code>column-result</code> element 
    * @return the new created instance of <code>ColumnResult<SqlResultSetMapping<T>></code> 
    */
   public ColumnResult<SqlResultSetMapping<T>> createColumnResult()
   {
      return new ColumnResultImpl<SqlResultSetMapping<T>>(this, "column-result", childNode);
   }

   /**
    * Returns all <code>column-result</code> elements
    * @return list of <code>column-result</code> 
    */
   public List<ColumnResult<SqlResultSetMapping<T>>> getAllColumnResult()
   {
      List<ColumnResult<SqlResultSetMapping<T>>> list = new ArrayList<ColumnResult<SqlResultSetMapping<T>>>();
      List<Node> nodeList = childNode.get("column-result");
      for(Node node: nodeList)
      {
         ColumnResult<SqlResultSetMapping<T>>  type = new ColumnResultImpl<SqlResultSetMapping<T>>(this, "column-result", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>column-result</code> elements 
    * @return the current instance of <code>ColumnResult<SqlResultSetMapping<T>></code> 
    */
   public SqlResultSetMapping<T> removeAllColumnResult()
   {
      childNode.removeChildren("column-result");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SqlResultSetMapping ElementName: xsd:string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>SqlResultSetMapping<T></code> 
    */
   public SqlResultSetMapping<T> name(String name)
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
    * @return the current instance of <code>SqlResultSetMapping<T></code> 
    */
   public SqlResultSetMapping<T> removeName()
   {
      childNode.removeAttribute("name");
      return this;
   }
}
