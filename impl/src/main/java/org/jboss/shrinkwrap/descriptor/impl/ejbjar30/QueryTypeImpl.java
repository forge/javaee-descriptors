package org.jboss.shrinkwrap.descriptor.impl.ejbjar30; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.QueryType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.QueryMethodType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar30.QueryMethodTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.ResultTypeMappingType;

/**
 * This class implements the <code> queryType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class QueryTypeImpl<T> implements Child<T>, QueryType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public QueryTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public QueryTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: QueryType ElementName: xsd:string ElementType : description
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>description</code> element
    * @param description the value for the element <code>description</code> 
    * @return the current instance of <code>QueryType<T></code> 
    */
   public QueryType<T> description(String description)
   {
      childNode.getOrCreate("description").text(description);
      return this;
   }

   /**
    * Returns the <code>description</code> element
    * @return the node defined for the element <code>description</code> 
    */
   public String getDescription()
   {
      return childNode.getTextValueForPatternName("description");
   }

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>QueryType<T></code> 
    */
   public QueryType<T> removeDescription()
   {
      childNode.removeChildren("description");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: QueryType ElementName: javaee:query-methodType ElementType : query-method
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>query-method</code> element with the given value will be created.
    * Otherwise, the existing <code>query-method</code> element will be returned.
    * @return  a new or existing instance of <code>QueryMethodType<QueryType<T>></code> 
    */
   public QueryMethodType<QueryType<T>> getOrCreateQueryMethod()
   {
      Node node = childNode.getOrCreate("query-method");
      QueryMethodType<QueryType<T>> queryMethod = new QueryMethodTypeImpl<QueryType<T>>(this, "query-method", childNode, node);
      return queryMethod;
   }

   /**
    * Removes the <code>query-method</code> element 
    * @return the current instance of <code>QueryType<T></code> 
    */
   public QueryType<T> removeQueryMethod()
   {
      childNode.removeChildren("query-method");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: QueryType ElementName: javaee:result-type-mappingType ElementType : result-type-mapping
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>result-type-mapping</code> element
    * @param resultTypeMapping the value for the element <code>result-type-mapping</code> 
    * @return the current instance of <code>QueryType<T></code> 
    */
   public QueryType<T> resultTypeMapping(ResultTypeMappingType resultTypeMapping)
   {
      childNode.getOrCreate("result-type-mapping").text(resultTypeMapping);
      return this;
   }
   /**
    * Sets the <code>result-type-mapping</code> element
    * @param resultTypeMapping the value for the element <code>result-type-mapping</code> 
    * @return the current instance of <code>QueryType<T></code> 
    */
   public QueryType<T> resultTypeMapping(String resultTypeMapping)
   {
      childNode.getOrCreate("result-type-mapping").text(resultTypeMapping);
      return this;
   }

   /**
    * Returns the <code>result-type-mapping</code> element
    * @return the value found for the element <code>result-type-mapping</code> 
    */
   public ResultTypeMappingType getResultTypeMapping()
   {
      return ResultTypeMappingType.getFromStringValue(childNode.getTextValueForPatternName("result-type-mapping"));
   }

   /**
    * Returns the <code>result-type-mapping</code> element
    * @return the value found for the element <code>result-type-mapping</code> 
    */
   public String  getResultTypeMappingAsString()
   {
      return childNode.getTextValueForPatternName("result-type-mapping");
   }

   /**
    * Removes the <code>result-type-mapping</code> attribute 
    * @return the current instance of <code>QueryType<T></code> 
    */
   public QueryType<T> removeResultTypeMapping()
   {
      childNode.removeAttribute("result-type-mapping");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: QueryType ElementName: xsd:string ElementType : ejb-ql
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>ejb-ql</code> element
    * @param ejbQl the value for the element <code>ejb-ql</code> 
    * @return the current instance of <code>QueryType<T></code> 
    */
   public QueryType<T> ejbQl(String ejbQl)
   {
      childNode.getOrCreate("ejb-ql").text(ejbQl);
      return this;
   }

   /**
    * Returns the <code>ejb-ql</code> element
    * @return the node defined for the element <code>ejb-ql</code> 
    */
   public String getEjbQl()
   {
      return childNode.getTextValueForPatternName("ejb-ql");
   }

   /**
    * Removes the <code>ejb-ql</code> element 
    * @return the current instance of <code>QueryType<T></code> 
    */
   public QueryType<T> removeEjbQl()
   {
      childNode.removeChildren("ejb-ql");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: QueryType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>QueryType<T></code> 
    */
   public QueryType<T> id(String id)
   {
      childNode.attribute("id", id);
      return this;
   }

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
      public String getId()
   {
      return childNode.getAttribute("id");
   }

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>QueryType<T></code> 
    */
   public QueryType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
