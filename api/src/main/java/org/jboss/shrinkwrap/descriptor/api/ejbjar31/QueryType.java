package org.jboss.shrinkwrap.descriptor.api.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> queryType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface QueryType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: QueryType ElementName: xsd:string ElementType : description
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>description</code> element
    * @param description the value for the element <code>description</code> 
    * @return the current instance of <code>QueryType<T></code> 
    */
   public QueryType<T> description(String description);

   /**
    * Returns the <code>description</code> element
    * @return the node defined for the element <code>description</code> 
    */
   public String getDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>QueryType<T></code> 
    */
   public QueryType<T> removeDescription();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: QueryType ElementName: javaee:query-methodType ElementType : query-method
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>query-method</code> element with the given value will be created.
    * Otherwise, the existing <code>query-method</code> element will be returned.
    * @return  a new or existing instance of <code>QueryMethodType<QueryType<T>></code> 
    */
   public QueryMethodType<QueryType<T>> getOrCreateQueryMethod();

   /**
    * Removes the <code>query-method</code> element 
    * @return the current instance of <code>QueryType<T></code> 
    */
   public QueryType<T> removeQueryMethod();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: QueryType ElementName: javaee:result-type-mappingType ElementType : result-type-mapping
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>result-type-mapping</code> element
    * @param resultTypeMapping the value for the element <code>result-type-mapping</code> 
    * @return the current instance of <code>QueryType<T></code> 
    */
   public QueryType<T> resultTypeMapping(ResultTypeMappingType resultTypeMapping);
   /**
    * Sets the <code>result-type-mapping</code> element
    * @param resultTypeMapping the value for the element <code>result-type-mapping</code> 
    * @return the current instance of <code>QueryType<T></code> 
    */
   public QueryType<T> resultTypeMapping(String resultTypeMapping);

   /**
    * Returns the <code>result-type-mapping</code> element
    * @return the value found for the element <code>result-type-mapping</code> 
    */
   public ResultTypeMappingType getResultTypeMapping();

   /**
    * Returns the <code>result-type-mapping</code> element
    * @return the value found for the element <code>result-type-mapping</code> 
    */
   public String  getResultTypeMappingAsString();

   /**
    * Removes the <code>result-type-mapping</code> attribute 
    * @return the current instance of <code>QueryType<T></code> 
    */
   public QueryType<T> removeResultTypeMapping();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: QueryType ElementName: xsd:string ElementType : ejb-ql
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>ejb-ql</code> element
    * @param ejbQl the value for the element <code>ejb-ql</code> 
    * @return the current instance of <code>QueryType<T></code> 
    */
   public QueryType<T> ejbQl(String ejbQl);

   /**
    * Returns the <code>ejb-ql</code> element
    * @return the node defined for the element <code>ejb-ql</code> 
    */
   public String getEjbQl();

   /**
    * Removes the <code>ejb-ql</code> element 
    * @return the current instance of <code>QueryType<T></code> 
    */
   public QueryType<T> removeEjbQl();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: QueryType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>QueryType<T></code> 
    */
   public QueryType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>QueryType<T></code> 
    */
   public QueryType<T> removeId();
}
