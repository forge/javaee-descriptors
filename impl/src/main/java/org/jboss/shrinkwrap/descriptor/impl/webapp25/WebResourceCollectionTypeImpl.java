package org.jboss.shrinkwrap.descriptor.impl.webapp25; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.webapp25.WebResourceCollectionType;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> web-resource-collectionType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class WebResourceCollectionTypeImpl<T> implements Child<T>, WebResourceCollectionType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public WebResourceCollectionTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public WebResourceCollectionTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebResourceCollectionType ElementName: xsd:token ElementType : web-resource-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>web-resource-name</code> element
    * @param webResourceName the value for the element <code>web-resource-name</code> 
    * @return the current instance of <code>WebResourceCollectionType<T></code> 
    */
   public WebResourceCollectionType<T> webResourceName(String webResourceName)
   {
      childNode.getOrCreate("web-resource-name").text(webResourceName);
      return this;
   }

   /**
    * Returns the <code>web-resource-name</code> element
    * @return the node defined for the element <code>web-resource-name</code> 
    */
   public String getWebResourceName()
   {
      return childNode.getTextValueForPatternName("web-resource-name");
   }

   /**
    * Removes the <code>web-resource-name</code> element 
    * @return the current instance of <code>WebResourceCollectionType<T></code> 
    */
   public WebResourceCollectionType<T> removeWebResourceName()
   {
      childNode.removeChildren("web-resource-name");
      return this;
   }

 
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
   public WebResourceCollectionType<T> description(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("description").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
public List<String> getAllDescription()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("description");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>WebResourceCollectionType<T></code> 
    */
   public WebResourceCollectionType<T> removeAllDescription()
   {
      childNode.removeChildren("description");
      return this;
   }

 
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
   public WebResourceCollectionType<T> urlPattern(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("url-pattern").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>url-pattern</code> elements
    * @return list of <code>url-pattern</code> 
    */
public List<String> getAllUrlPattern()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("url-pattern");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>url-pattern</code> element 
    * @return the current instance of <code>WebResourceCollectionType<T></code> 
    */
   public WebResourceCollectionType<T> removeAllUrlPattern()
   {
      childNode.removeChildren("url-pattern");
      return this;
   }

 
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
   public WebResourceCollectionType<T> httpMethod(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("http-method").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>http-method</code> elements
    * @return list of <code>http-method</code> 
    */
public List<String> getAllHttpMethod()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("http-method");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>http-method</code> element 
    * @return the current instance of <code>WebResourceCollectionType<T></code> 
    */
   public WebResourceCollectionType<T> removeAllHttpMethod()
   {
      childNode.removeChildren("http-method");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebResourceCollectionType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>WebResourceCollectionType<T></code> 
    */
   public WebResourceCollectionType<T> id(String id)
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
    * @return the current instance of <code>WebResourceCollectionType<T></code> 
    */
   public WebResourceCollectionType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
