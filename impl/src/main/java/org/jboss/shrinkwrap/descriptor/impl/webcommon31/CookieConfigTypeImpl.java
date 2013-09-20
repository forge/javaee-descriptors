package org.jboss.shrinkwrap.descriptor.impl.webcommon31; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.webcommon31.CookieConfigType;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> cookie-configType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class CookieConfigTypeImpl<T> implements Child<T>, CookieConfigType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public CookieConfigTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public CookieConfigTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: CookieConfigType ElementName: javaee:nonEmptyStringType ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> element
    * @param name the value for the element <code>name</code> 
    * @return the current instance of <code>CookieConfigType<T></code> 
    */
   public CookieConfigType<T> name(String name)
   {
      childNode.getOrCreate("name").text(name);
      return this;
   }

   /**
    * Returns the <code>name</code> element
    * @return the node defined for the element <code>name</code> 
    */
   public String getName()
   {
      return childNode.getTextValueForPatternName("name");
   }

   /**
    * Removes the <code>name</code> element 
    * @return the current instance of <code>CookieConfigType<T></code> 
    */
   public CookieConfigType<T> removeName()
   {
      childNode.removeChildren("name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: CookieConfigType ElementName: javaee:nonEmptyStringType ElementType : domain
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>domain</code> element
    * @param domain the value for the element <code>domain</code> 
    * @return the current instance of <code>CookieConfigType<T></code> 
    */
   public CookieConfigType<T> domain(String domain)
   {
      childNode.getOrCreate("domain").text(domain);
      return this;
   }

   /**
    * Returns the <code>domain</code> element
    * @return the node defined for the element <code>domain</code> 
    */
   public String getDomain()
   {
      return childNode.getTextValueForPatternName("domain");
   }

   /**
    * Removes the <code>domain</code> element 
    * @return the current instance of <code>CookieConfigType<T></code> 
    */
   public CookieConfigType<T> removeDomain()
   {
      childNode.removeChildren("domain");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: CookieConfigType ElementName: javaee:nonEmptyStringType ElementType : path
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>path</code> element
    * @param path the value for the element <code>path</code> 
    * @return the current instance of <code>CookieConfigType<T></code> 
    */
   public CookieConfigType<T> path(String path)
   {
      childNode.getOrCreate("path").text(path);
      return this;
   }

   /**
    * Returns the <code>path</code> element
    * @return the node defined for the element <code>path</code> 
    */
   public String getPath()
   {
      return childNode.getTextValueForPatternName("path");
   }

   /**
    * Removes the <code>path</code> element 
    * @return the current instance of <code>CookieConfigType<T></code> 
    */
   public CookieConfigType<T> removePath()
   {
      childNode.removeChildren("path");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: CookieConfigType ElementName: javaee:nonEmptyStringType ElementType : comment
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>comment</code> element
    * @param comment the value for the element <code>comment</code> 
    * @return the current instance of <code>CookieConfigType<T></code> 
    */
   public CookieConfigType<T> comment(String comment)
   {
      childNode.getOrCreate("comment").text(comment);
      return this;
   }

   /**
    * Returns the <code>comment</code> element
    * @return the node defined for the element <code>comment</code> 
    */
   public String getComment()
   {
      return childNode.getTextValueForPatternName("comment");
   }

   /**
    * Removes the <code>comment</code> element 
    * @return the current instance of <code>CookieConfigType<T></code> 
    */
   public CookieConfigType<T> removeComment()
   {
      childNode.removeChildren("comment");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: CookieConfigType ElementName: javaee:xsdBooleanType ElementType : http-only
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>http-only</code> element
    * @param httpOnly the value for the element <code>http-only</code> 
    * @return the current instance of <code>CookieConfigType<T></code> 
    */
   public CookieConfigType<T> httpOnly(Boolean httpOnly)
   {
      childNode.getOrCreate("http-only").text(httpOnly);
      return this;
   }

   /**
    * Returns the <code>http-only</code> element
    * @return the node defined for the element <code>http-only</code> 
    */
   public Boolean isHttpOnly()
   {
      return Strings.isTrue(childNode.getTextValueForPatternName("http-only"));
   }

   /**
    * Removes the <code>http-only</code> element 
    * @return the current instance of <code>CookieConfigType<T></code> 
    */
   public CookieConfigType<T> removeHttpOnly()
   {
      childNode.removeChildren("http-only");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: CookieConfigType ElementName: javaee:xsdBooleanType ElementType : secure
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>secure</code> element
    * @param secure the value for the element <code>secure</code> 
    * @return the current instance of <code>CookieConfigType<T></code> 
    */
   public CookieConfigType<T> secure(Boolean secure)
   {
      childNode.getOrCreate("secure").text(secure);
      return this;
   }

   /**
    * Returns the <code>secure</code> element
    * @return the node defined for the element <code>secure</code> 
    */
   public Boolean isSecure()
   {
      return Strings.isTrue(childNode.getTextValueForPatternName("secure"));
   }

   /**
    * Removes the <code>secure</code> element 
    * @return the current instance of <code>CookieConfigType<T></code> 
    */
   public CookieConfigType<T> removeSecure()
   {
      childNode.removeChildren("secure");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: CookieConfigType ElementName: xsd:integer ElementType : max-age
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>max-age</code> element
    * @param maxAge the value for the element <code>max-age</code> 
    * @return the current instance of <code>CookieConfigType<T></code> 
    */
   public CookieConfigType<T> maxAge(Integer maxAge)
   {
      childNode.getOrCreate("max-age").text(maxAge);
      return this;
   }

   /**
    * Returns the <code>max-age</code> element
    * @return the node defined for the element <code>max-age</code> 
    */
   public Integer getMaxAge()
   {
      if (childNode.getTextValueForPatternName("max-age") != null && !childNode.getTextValueForPatternName("max-age").equals("null")) {
         return Integer.valueOf(childNode.getTextValueForPatternName("max-age"));
      }
      return null;
   }

   /**
    * Removes the <code>max-age</code> element 
    * @return the current instance of <code>CookieConfigType<T></code> 
    */
   public CookieConfigType<T> removeMaxAge()
   {
      childNode.removeChildren("max-age");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: CookieConfigType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>CookieConfigType<T></code> 
    */
   public CookieConfigType<T> id(String id)
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
    * @return the current instance of <code>CookieConfigType<T></code> 
    */
   public CookieConfigType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
