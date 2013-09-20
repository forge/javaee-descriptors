package org.jboss.shrinkwrap.descriptor.api.webcommon30; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> web-resource-collectionType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface WebResourceCollectionType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebResourceCollectionType ElementName: xsd:token ElementType : web-resource-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>web-resource-name</code> element
    * @param webResourceName the value for the element <code>web-resource-name</code> 
    * @return the current instance of <code>WebResourceCollectionType<T></code> 
    */
   public WebResourceCollectionType<T> webResourceName(String webResourceName);

   /**
    * Returns the <code>web-resource-name</code> element
    * @return the node defined for the element <code>web-resource-name</code> 
    */
   public String getWebResourceName();

   /**
    * Removes the <code>web-resource-name</code> element 
    * @return the current instance of <code>WebResourceCollectionType<T></code> 
    */
   public WebResourceCollectionType<T> removeWebResourceName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebResourceCollectionType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>WebResourceCollectionType<T></code> 
    */
   public WebResourceCollectionType<T> description(String ... values);

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>WebResourceCollectionType<T></code> 
    */
   public WebResourceCollectionType<T> removeAllDescription();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebResourceCollectionType ElementName: xsd:string ElementType : url-pattern
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>url-pattern</code> elements, 
    * a new <code>url-pattern</code> element 
    * @param values list of <code>url-pattern</code> objects 
    * @return the current instance of <code>WebResourceCollectionType<T></code> 
    */
   public WebResourceCollectionType<T> urlPattern(String ... values);

   /**
    * Returns all <code>url-pattern</code> elements
    * @return list of <code>url-pattern</code> 
    */
   public List<String> getAllUrlPattern();

   /**
    * Removes the <code>url-pattern</code> element 
    * @return the current instance of <code>WebResourceCollectionType<T></code> 
    */
   public WebResourceCollectionType<T> removeAllUrlPattern();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebResourceCollectionType ElementName: xsd:token ElementType : http-method
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>http-method</code> elements, 
    * a new <code>http-method</code> element 
    * @param values list of <code>http-method</code> objects 
    * @return the current instance of <code>WebResourceCollectionType<T></code> 
    */
   public WebResourceCollectionType<T> httpMethod(String ... values);

   /**
    * Returns all <code>http-method</code> elements
    * @return list of <code>http-method</code> 
    */
   public List<String> getAllHttpMethod();

   /**
    * Removes the <code>http-method</code> element 
    * @return the current instance of <code>WebResourceCollectionType<T></code> 
    */
   public WebResourceCollectionType<T> removeAllHttpMethod();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebResourceCollectionType ElementName: xsd:token ElementType : http-method-omission
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>http-method-omission</code> elements, 
    * a new <code>http-method-omission</code> element 
    * @param values list of <code>http-method-omission</code> objects 
    * @return the current instance of <code>WebResourceCollectionType<T></code> 
    */
   public WebResourceCollectionType<T> httpMethodOmission(String ... values);

   /**
    * Returns all <code>http-method-omission</code> elements
    * @return list of <code>http-method-omission</code> 
    */
   public List<String> getAllHttpMethodOmission();

   /**
    * Removes the <code>http-method-omission</code> element 
    * @return the current instance of <code>WebResourceCollectionType<T></code> 
    */
   public WebResourceCollectionType<T> removeAllHttpMethodOmission();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebResourceCollectionType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>WebResourceCollectionType<T></code> 
    */
   public WebResourceCollectionType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>WebResourceCollectionType<T></code> 
    */
   public WebResourceCollectionType<T> removeId();
}
