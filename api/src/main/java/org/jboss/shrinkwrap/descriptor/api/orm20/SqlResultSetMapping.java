package org.jboss.shrinkwrap.descriptor.api.orm20; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.orm20.EntityResult;
import org.jboss.shrinkwrap.descriptor.api.orm20.ColumnResult;
/**
 * This interface defines the contract for the <code> sql-result-set-mapping </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface SqlResultSetMapping<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SqlResultSetMapping ElementName: xsd:string ElementType : description
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>description</code> element
    * @param description the value for the element <code>description</code> 
    * @return the current instance of <code>SqlResultSetMapping<T></code> 
    */
   public SqlResultSetMapping<T> description(String description);

   /**
    * Returns the <code>description</code> element
    * @return the node defined for the element <code>description</code> 
    */
   public String getDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>SqlResultSetMapping<T></code> 
    */
   public SqlResultSetMapping<T> removeDescription();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SqlResultSetMapping ElementName: orm:entity-result ElementType : entity-result
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>entity-result</code> element will be created and returned.
    * Otherwise, the first existing <code>entity-result</code> element will be returned.
    * @return the instance defined for the element <code>entity-result</code> 
    */
   public EntityResult<SqlResultSetMapping<T>> getOrCreateEntityResult();

   /**
    * Creates a new <code>entity-result</code> element 
    * @return the new created instance of <code>EntityResult<SqlResultSetMapping<T>></code> 
    */
   public EntityResult<SqlResultSetMapping<T>> createEntityResult();

   /**
    * Returns all <code>entity-result</code> elements
    * @return list of <code>entity-result</code> 
    */
   public List<EntityResult<SqlResultSetMapping<T>>> getAllEntityResult();

   /**
    * Removes all <code>entity-result</code> elements 
    * @return the current instance of <code>EntityResult<SqlResultSetMapping<T>></code> 
    */
   public SqlResultSetMapping<T> removeAllEntityResult();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SqlResultSetMapping ElementName: orm:column-result ElementType : column-result
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>column-result</code> element will be created and returned.
    * Otherwise, the first existing <code>column-result</code> element will be returned.
    * @return the instance defined for the element <code>column-result</code> 
    */
   public ColumnResult<SqlResultSetMapping<T>> getOrCreateColumnResult();

   /**
    * Creates a new <code>column-result</code> element 
    * @return the new created instance of <code>ColumnResult<SqlResultSetMapping<T>></code> 
    */
   public ColumnResult<SqlResultSetMapping<T>> createColumnResult();

   /**
    * Returns all <code>column-result</code> elements
    * @return list of <code>column-result</code> 
    */
   public List<ColumnResult<SqlResultSetMapping<T>>> getAllColumnResult();

   /**
    * Removes all <code>column-result</code> elements 
    * @return the current instance of <code>ColumnResult<SqlResultSetMapping<T>></code> 
    */
   public SqlResultSetMapping<T> removeAllColumnResult();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SqlResultSetMapping ElementName: xsd:string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>SqlResultSetMapping<T></code> 
    */
   public SqlResultSetMapping<T> name(String name);

   /**
    * Returns the <code>name</code> attribute
    * @return the value defined for the attribute <code>name</code> 
    */
   public String getName();

   /**
    * Removes the <code>name</code> attribute 
    * @return the current instance of <code>SqlResultSetMapping<T></code> 
    */
   public SqlResultSetMapping<T> removeName();
}
