package org.jboss.shrinkwrap.descriptor.api.orm10; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> named-query </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface NamedQuery<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: NamedQuery ElementName: xsd:string ElementType : query
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>query</code> element
    * @param query the value for the element <code>query</code> 
    * @return the current instance of <code>NamedQuery<T></code> 
    */
   public NamedQuery<T> query(String query);

   /**
    * Returns the <code>query</code> element
    * @return the node defined for the element <code>query</code> 
    */
   public String getQuery();

   /**
    * Removes the <code>query</code> element 
    * @return the current instance of <code>NamedQuery<T></code> 
    */
   public NamedQuery<T> removeQuery();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: NamedQuery ElementName: orm:query-hint ElementType : hint
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>hint</code> element will be created and returned.
    * Otherwise, the first existing <code>hint</code> element will be returned.
    * @return the instance defined for the element <code>hint</code> 
    */
   public QueryHint<NamedQuery<T>> getOrCreateHint();

   /**
    * Creates a new <code>hint</code> element 
    * @return the new created instance of <code>QueryHint<NamedQuery<T>></code> 
    */
   public QueryHint<NamedQuery<T>> createHint();

   /**
    * Returns all <code>hint</code> elements
    * @return list of <code>hint</code> 
    */
   public List<QueryHint<NamedQuery<T>>> getAllHint();

   /**
    * Removes all <code>hint</code> elements 
    * @return the current instance of <code>QueryHint<NamedQuery<T>></code> 
    */
   public NamedQuery<T> removeAllHint();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: NamedQuery ElementName: xsd:string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>NamedQuery<T></code> 
    */
   public NamedQuery<T> name(String name);

   /**
    * Returns the <code>name</code> attribute
    * @return the value defined for the attribute <code>name</code> 
    */
   public String getName();

   /**
    * Removes the <code>name</code> attribute 
    * @return the current instance of <code>NamedQuery<T></code> 
    */
   public NamedQuery<T> removeName();
}
