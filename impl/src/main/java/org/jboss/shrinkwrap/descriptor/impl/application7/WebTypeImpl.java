package org.jboss.shrinkwrap.descriptor.impl.application7; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.application7.WebType;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> webType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class WebTypeImpl<T> implements Child<T>, WebType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public WebTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public WebTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebType ElementName: xsd:token ElementType : web-uri
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>web-uri</code> element
    * @param webUri the value for the element <code>web-uri</code> 
    * @return the current instance of <code>WebType<T></code> 
    */
   public WebType<T> webUri(String webUri)
   {
      childNode.getOrCreate("web-uri").text(webUri);
      return this;
   }

   /**
    * Returns the <code>web-uri</code> element
    * @return the node defined for the element <code>web-uri</code> 
    */
   public String getWebUri()
   {
      return childNode.getTextValueForPatternName("web-uri");
   }

   /**
    * Removes the <code>web-uri</code> element 
    * @return the current instance of <code>WebType<T></code> 
    */
   public WebType<T> removeWebUri()
   {
      childNode.removeChildren("web-uri");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebType ElementName: xsd:token ElementType : context-root
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>context-root</code> element
    * @param contextRoot the value for the element <code>context-root</code> 
    * @return the current instance of <code>WebType<T></code> 
    */
   public WebType<T> contextRoot(String contextRoot)
   {
      childNode.getOrCreate("context-root").text(contextRoot);
      return this;
   }

   /**
    * Returns the <code>context-root</code> element
    * @return the node defined for the element <code>context-root</code> 
    */
   public String getContextRoot()
   {
      return childNode.getTextValueForPatternName("context-root");
   }

   /**
    * Removes the <code>context-root</code> element 
    * @return the current instance of <code>WebType<T></code> 
    */
   public WebType<T> removeContextRoot()
   {
      childNode.removeChildren("context-root");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>WebType<T></code> 
    */
   public WebType<T> id(String id)
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
    * @return the current instance of <code>WebType<T></code> 
    */
   public WebType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
