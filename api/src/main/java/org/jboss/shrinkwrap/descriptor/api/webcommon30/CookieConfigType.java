package org.jboss.shrinkwrap.descriptor.api.webcommon30; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> cookie-configType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface CookieConfigType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: CookieConfigType ElementName: javaee:nonEmptyStringType ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> element
    * @param name the value for the element <code>name</code> 
    * @return the current instance of <code>CookieConfigType<T></code> 
    */
   public CookieConfigType<T> name(String name);

   /**
    * Returns the <code>name</code> element
    * @return the node defined for the element <code>name</code> 
    */
   public String getName();

   /**
    * Removes the <code>name</code> element 
    * @return the current instance of <code>CookieConfigType<T></code> 
    */
   public CookieConfigType<T> removeName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: CookieConfigType ElementName: javaee:nonEmptyStringType ElementType : domain
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>domain</code> element
    * @param domain the value for the element <code>domain</code> 
    * @return the current instance of <code>CookieConfigType<T></code> 
    */
   public CookieConfigType<T> domain(String domain);

   /**
    * Returns the <code>domain</code> element
    * @return the node defined for the element <code>domain</code> 
    */
   public String getDomain();

   /**
    * Removes the <code>domain</code> element 
    * @return the current instance of <code>CookieConfigType<T></code> 
    */
   public CookieConfigType<T> removeDomain();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: CookieConfigType ElementName: javaee:nonEmptyStringType ElementType : path
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>path</code> element
    * @param path the value for the element <code>path</code> 
    * @return the current instance of <code>CookieConfigType<T></code> 
    */
   public CookieConfigType<T> path(String path);

   /**
    * Returns the <code>path</code> element
    * @return the node defined for the element <code>path</code> 
    */
   public String getPath();

   /**
    * Removes the <code>path</code> element 
    * @return the current instance of <code>CookieConfigType<T></code> 
    */
   public CookieConfigType<T> removePath();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: CookieConfigType ElementName: javaee:nonEmptyStringType ElementType : comment
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>comment</code> element
    * @param comment the value for the element <code>comment</code> 
    * @return the current instance of <code>CookieConfigType<T></code> 
    */
   public CookieConfigType<T> comment(String comment);

   /**
    * Returns the <code>comment</code> element
    * @return the node defined for the element <code>comment</code> 
    */
   public String getComment();

   /**
    * Removes the <code>comment</code> element 
    * @return the current instance of <code>CookieConfigType<T></code> 
    */
   public CookieConfigType<T> removeComment();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: CookieConfigType ElementName: javaee:xsdBooleanType ElementType : http-only
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>http-only</code> element
    * @param httpOnly the value for the element <code>http-only</code> 
    * @return the current instance of <code>CookieConfigType<T></code> 
    */
   public CookieConfigType<T> httpOnly(Boolean httpOnly);

   /**
    * Returns the <code>http-only</code> element
    * @return the node defined for the element <code>http-only</code> 
    */
   public Boolean isHttpOnly();

   /**
    * Removes the <code>http-only</code> element 
    * @return the current instance of <code>CookieConfigType<T></code> 
    */
   public CookieConfigType<T> removeHttpOnly();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: CookieConfigType ElementName: javaee:xsdBooleanType ElementType : secure
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>secure</code> element
    * @param secure the value for the element <code>secure</code> 
    * @return the current instance of <code>CookieConfigType<T></code> 
    */
   public CookieConfigType<T> secure(Boolean secure);

   /**
    * Returns the <code>secure</code> element
    * @return the node defined for the element <code>secure</code> 
    */
   public Boolean isSecure();

   /**
    * Removes the <code>secure</code> element 
    * @return the current instance of <code>CookieConfigType<T></code> 
    */
   public CookieConfigType<T> removeSecure();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: CookieConfigType ElementName: xsd:integer ElementType : max-age
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>max-age</code> element
    * @param maxAge the value for the element <code>max-age</code> 
    * @return the current instance of <code>CookieConfigType<T></code> 
    */
   public CookieConfigType<T> maxAge(Integer maxAge);

   /**
    * Returns the <code>max-age</code> element
    * @return the node defined for the element <code>max-age</code> 
    */
   public Integer getMaxAge();

   /**
    * Removes the <code>max-age</code> element 
    * @return the current instance of <code>CookieConfigType<T></code> 
    */
   public CookieConfigType<T> removeMaxAge();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: CookieConfigType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>CookieConfigType<T></code> 
    */
   public CookieConfigType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>CookieConfigType<T></code> 
    */
   public CookieConfigType<T> removeId();
}
