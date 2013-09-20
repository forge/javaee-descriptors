package org.jboss.shrinkwrap.descriptor.api.orm21; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.orm21.StoredProcedureParameter;
import org.jboss.shrinkwrap.descriptor.api.orm21.QueryHint;
/**
 * This interface defines the contract for the <code> named-stored-procedure-query </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface NamedStoredProcedureQuery<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: NamedStoredProcedureQuery ElementName: xsd:string ElementType : description
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>description</code> element
    * @param description the value for the element <code>description</code> 
    * @return the current instance of <code>NamedStoredProcedureQuery<T></code> 
    */
   public NamedStoredProcedureQuery<T> description(String description);

   /**
    * Returns the <code>description</code> element
    * @return the node defined for the element <code>description</code> 
    */
   public String getDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>NamedStoredProcedureQuery<T></code> 
    */
   public NamedStoredProcedureQuery<T> removeDescription();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: NamedStoredProcedureQuery ElementName: orm:stored-procedure-parameter ElementType : parameter
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>parameter</code> element will be created and returned.
    * Otherwise, the first existing <code>parameter</code> element will be returned.
    * @return the instance defined for the element <code>parameter</code> 
    */
   public StoredProcedureParameter<NamedStoredProcedureQuery<T>> getOrCreateParameter();

   /**
    * Creates a new <code>parameter</code> element 
    * @return the new created instance of <code>StoredProcedureParameter<NamedStoredProcedureQuery<T>></code> 
    */
   public StoredProcedureParameter<NamedStoredProcedureQuery<T>> createParameter();

   /**
    * Returns all <code>parameter</code> elements
    * @return list of <code>parameter</code> 
    */
   public List<StoredProcedureParameter<NamedStoredProcedureQuery<T>>> getAllParameter();

   /**
    * Removes all <code>parameter</code> elements 
    * @return the current instance of <code>StoredProcedureParameter<NamedStoredProcedureQuery<T>></code> 
    */
   public NamedStoredProcedureQuery<T> removeAllParameter();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: NamedStoredProcedureQuery ElementName: xsd:string ElementType : result-class
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>result-class</code> elements, 
    * a new <code>result-class</code> element 
    * @param values list of <code>result-class</code> objects 
    * @return the current instance of <code>NamedStoredProcedureQuery<T></code> 
    */
   public NamedStoredProcedureQuery<T> resultClass(String ... values);

   /**
    * Returns all <code>result-class</code> elements
    * @return list of <code>result-class</code> 
    */
   public List<String> getAllResultClass();

   /**
    * Removes the <code>result-class</code> element 
    * @return the current instance of <code>NamedStoredProcedureQuery<T></code> 
    */
   public NamedStoredProcedureQuery<T> removeAllResultClass();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: NamedStoredProcedureQuery ElementName: xsd:string ElementType : result-set-mapping
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>result-set-mapping</code> elements, 
    * a new <code>result-set-mapping</code> element 
    * @param values list of <code>result-set-mapping</code> objects 
    * @return the current instance of <code>NamedStoredProcedureQuery<T></code> 
    */
   public NamedStoredProcedureQuery<T> resultSetMapping(String ... values);

   /**
    * Returns all <code>result-set-mapping</code> elements
    * @return list of <code>result-set-mapping</code> 
    */
   public List<String> getAllResultSetMapping();

   /**
    * Removes the <code>result-set-mapping</code> element 
    * @return the current instance of <code>NamedStoredProcedureQuery<T></code> 
    */
   public NamedStoredProcedureQuery<T> removeAllResultSetMapping();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: NamedStoredProcedureQuery ElementName: orm:query-hint ElementType : hint
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>hint</code> element will be created and returned.
    * Otherwise, the first existing <code>hint</code> element will be returned.
    * @return the instance defined for the element <code>hint</code> 
    */
   public QueryHint<NamedStoredProcedureQuery<T>> getOrCreateHint();

   /**
    * Creates a new <code>hint</code> element 
    * @return the new created instance of <code>QueryHint<NamedStoredProcedureQuery<T>></code> 
    */
   public QueryHint<NamedStoredProcedureQuery<T>> createHint();

   /**
    * Returns all <code>hint</code> elements
    * @return list of <code>hint</code> 
    */
   public List<QueryHint<NamedStoredProcedureQuery<T>>> getAllHint();

   /**
    * Removes all <code>hint</code> elements 
    * @return the current instance of <code>QueryHint<NamedStoredProcedureQuery<T>></code> 
    */
   public NamedStoredProcedureQuery<T> removeAllHint();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: NamedStoredProcedureQuery ElementName: xsd:string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>NamedStoredProcedureQuery<T></code> 
    */
   public NamedStoredProcedureQuery<T> name(String name);

   /**
    * Returns the <code>name</code> attribute
    * @return the value defined for the attribute <code>name</code> 
    */
   public String getName();

   /**
    * Removes the <code>name</code> attribute 
    * @return the current instance of <code>NamedStoredProcedureQuery<T></code> 
    */
   public NamedStoredProcedureQuery<T> removeName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: NamedStoredProcedureQuery ElementName: xsd:string ElementType : procedure-name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>procedure-name</code> attribute
    * @param procedureName the value for the attribute <code>procedure-name</code> 
    * @return the current instance of <code>NamedStoredProcedureQuery<T></code> 
    */
   public NamedStoredProcedureQuery<T> procedureName(String procedureName);

   /**
    * Returns the <code>procedure-name</code> attribute
    * @return the value defined for the attribute <code>procedure-name</code> 
    */
   public String getProcedureName();

   /**
    * Removes the <code>procedure-name</code> attribute 
    * @return the current instance of <code>NamedStoredProcedureQuery<T></code> 
    */
   public NamedStoredProcedureQuery<T> removeProcedureName();
}
