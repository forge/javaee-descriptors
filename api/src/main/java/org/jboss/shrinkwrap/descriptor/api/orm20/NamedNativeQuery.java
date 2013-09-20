package org.jboss.shrinkwrap.descriptor.api.orm20; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> named-native-query </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface NamedNativeQuery<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: NamedNativeQuery ElementName: xsd:string ElementType : description
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>description</code> element
    * @param description the value for the element <code>description</code> 
    * @return the current instance of <code>NamedNativeQuery<T></code> 
    */
   public NamedNativeQuery<T> description(String description);

   /**
    * Returns the <code>description</code> element
    * @return the node defined for the element <code>description</code> 
    */
   public String getDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>NamedNativeQuery<T></code> 
    */
   public NamedNativeQuery<T> removeDescription();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: NamedNativeQuery ElementName: xsd:string ElementType : query
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>query</code> element
    * @param query the value for the element <code>query</code> 
    * @return the current instance of <code>NamedNativeQuery<T></code> 
    */
   public NamedNativeQuery<T> query(String query);

   /**
    * Returns the <code>query</code> element
    * @return the node defined for the element <code>query</code> 
    */
   public String getQuery();

   /**
    * Removes the <code>query</code> element 
    * @return the current instance of <code>NamedNativeQuery<T></code> 
    */
   public NamedNativeQuery<T> removeQuery();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: NamedNativeQuery ElementName: orm:query-hint ElementType : hint
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>hint</code> element will be created and returned.
    * Otherwise, the first existing <code>hint</code> element will be returned.
    * @return the instance defined for the element <code>hint</code> 
    */
   public QueryHint<NamedNativeQuery<T>> getOrCreateHint();

   /**
    * Creates a new <code>hint</code> element 
    * @return the new created instance of <code>QueryHint<NamedNativeQuery<T>></code> 
    */
   public QueryHint<NamedNativeQuery<T>> createHint();

   /**
    * Returns all <code>hint</code> elements
    * @return list of <code>hint</code> 
    */
   public List<QueryHint<NamedNativeQuery<T>>> getAllHint();

   /**
    * Removes all <code>hint</code> elements 
    * @return the current instance of <code>QueryHint<NamedNativeQuery<T>></code> 
    */
   public NamedNativeQuery<T> removeAllHint();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: NamedNativeQuery ElementName: xsd:string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>NamedNativeQuery<T></code> 
    */
   public NamedNativeQuery<T> name(String name);

   /**
    * Returns the <code>name</code> attribute
    * @return the value defined for the attribute <code>name</code> 
    */
   public String getName();

   /**
    * Removes the <code>name</code> attribute 
    * @return the current instance of <code>NamedNativeQuery<T></code> 
    */
   public NamedNativeQuery<T> removeName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: NamedNativeQuery ElementName: xsd:string ElementType : result-class
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>result-class</code> attribute
    * @param resultClass the value for the attribute <code>result-class</code> 
    * @return the current instance of <code>NamedNativeQuery<T></code> 
    */
   public NamedNativeQuery<T> resultClass(String resultClass);

   /**
    * Returns the <code>result-class</code> attribute
    * @return the value defined for the attribute <code>result-class</code> 
    */
   public String getResultClass();

   /**
    * Removes the <code>result-class</code> attribute 
    * @return the current instance of <code>NamedNativeQuery<T></code> 
    */
   public NamedNativeQuery<T> removeResultClass();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: NamedNativeQuery ElementName: xsd:string ElementType : result-set-mapping
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>result-set-mapping</code> attribute
    * @param resultSetMapping the value for the attribute <code>result-set-mapping</code> 
    * @return the current instance of <code>NamedNativeQuery<T></code> 
    */
   public NamedNativeQuery<T> resultSetMapping(String resultSetMapping);

   /**
    * Returns the <code>result-set-mapping</code> attribute
    * @return the value defined for the attribute <code>result-set-mapping</code> 
    */
   public String getResultSetMapping();

   /**
    * Removes the <code>result-set-mapping</code> attribute 
    * @return the current instance of <code>NamedNativeQuery<T></code> 
    */
   public NamedNativeQuery<T> removeResultSetMapping();
}
