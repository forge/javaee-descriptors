package org.jboss.shrinkwrap.descriptor.impl.jsp23; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee7.IconType;
import org.jboss.shrinkwrap.descriptor.api.jsp23.JspPropertyGroupType;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.impl.javaee7.IconTypeImpl;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> jsp-property-groupType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class JspPropertyGroupTypeImpl<T> implements Child<T>, JspPropertyGroupType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public JspPropertyGroupTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public JspPropertyGroupTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JspPropertyGroupType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>JspPropertyGroupType<T></code> 
    */
   public JspPropertyGroupType<T> description(String ... values)
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
    * @return the current instance of <code>JspPropertyGroupType<T></code> 
    */
   public JspPropertyGroupType<T> removeAllDescription()
   {
      childNode.removeChildren("description");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JspPropertyGroupType ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>JspPropertyGroupType<T></code> 
    */
   public JspPropertyGroupType<T> displayName(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("display-name").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>display-name</code> elements
    * @return list of <code>display-name</code> 
    */
public List<String> getAllDisplayName()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("display-name");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>display-name</code> element 
    * @return the current instance of <code>JspPropertyGroupType<T></code> 
    */
   public JspPropertyGroupType<T> removeAllDisplayName()
   {
      childNode.removeChildren("display-name");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JspPropertyGroupType ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<JspPropertyGroupType<T>> getOrCreateIcon()
   {
      List<Node> nodeList = childNode.get("icon");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new IconTypeImpl<JspPropertyGroupType<T>>(this, "icon", childNode, nodeList.get(0));
      }
      return createIcon();
   }

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<JspPropertyGroupType<T>></code> 
    */
   public IconType<JspPropertyGroupType<T>> createIcon()
   {
      return new IconTypeImpl<JspPropertyGroupType<T>>(this, "icon", childNode);
   }

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<JspPropertyGroupType<T>>> getAllIcon()
   {
      List<IconType<JspPropertyGroupType<T>>> list = new ArrayList<IconType<JspPropertyGroupType<T>>>();
      List<Node> nodeList = childNode.get("icon");
      for(Node node: nodeList)
      {
         IconType<JspPropertyGroupType<T>>  type = new IconTypeImpl<JspPropertyGroupType<T>>(this, "icon", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<JspPropertyGroupType<T>></code> 
    */
   public JspPropertyGroupType<T> removeAllIcon()
   {
      childNode.removeChildren("icon");
      return this;
   }
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JspPropertyGroupType ElementName: xsd:string ElementType : url-pattern
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>url-pattern</code> elements, 
    * a new <code>url-pattern</code> element 
    * @param values list of <code>url-pattern</code> objects 
    * @return the current instance of <code>JspPropertyGroupType<T></code> 
    */
   public JspPropertyGroupType<T> urlPattern(String ... values)
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
    * @return the current instance of <code>JspPropertyGroupType<T></code> 
    */
   public JspPropertyGroupType<T> removeAllUrlPattern()
   {
      childNode.removeChildren("url-pattern");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JspPropertyGroupType ElementName: javaee:xsdBooleanType ElementType : el-ignored
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>el-ignored</code> element
    * @param elIgnored the value for the element <code>el-ignored</code> 
    * @return the current instance of <code>JspPropertyGroupType<T></code> 
    */
   public JspPropertyGroupType<T> elIgnored(Boolean elIgnored)
   {
      childNode.getOrCreate("el-ignored").text(elIgnored);
      return this;
   }

   /**
    * Returns the <code>el-ignored</code> element
    * @return the node defined for the element <code>el-ignored</code> 
    */
   public Boolean isElIgnored()
   {
      return Strings.isTrue(childNode.getTextValueForPatternName("el-ignored"));
   }

   /**
    * Removes the <code>el-ignored</code> element 
    * @return the current instance of <code>JspPropertyGroupType<T></code> 
    */
   public JspPropertyGroupType<T> removeElIgnored()
   {
      childNode.removeChildren("el-ignored");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JspPropertyGroupType ElementName: xsd:token ElementType : page-encoding
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>page-encoding</code> element
    * @param pageEncoding the value for the element <code>page-encoding</code> 
    * @return the current instance of <code>JspPropertyGroupType<T></code> 
    */
   public JspPropertyGroupType<T> pageEncoding(String pageEncoding)
   {
      childNode.getOrCreate("page-encoding").text(pageEncoding);
      return this;
   }

   /**
    * Returns the <code>page-encoding</code> element
    * @return the node defined for the element <code>page-encoding</code> 
    */
   public String getPageEncoding()
   {
      return childNode.getTextValueForPatternName("page-encoding");
   }

   /**
    * Removes the <code>page-encoding</code> element 
    * @return the current instance of <code>JspPropertyGroupType<T></code> 
    */
   public JspPropertyGroupType<T> removePageEncoding()
   {
      childNode.removeChildren("page-encoding");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JspPropertyGroupType ElementName: javaee:xsdBooleanType ElementType : scripting-invalid
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>scripting-invalid</code> element
    * @param scriptingInvalid the value for the element <code>scripting-invalid</code> 
    * @return the current instance of <code>JspPropertyGroupType<T></code> 
    */
   public JspPropertyGroupType<T> scriptingInvalid(Boolean scriptingInvalid)
   {
      childNode.getOrCreate("scripting-invalid").text(scriptingInvalid);
      return this;
   }

   /**
    * Returns the <code>scripting-invalid</code> element
    * @return the node defined for the element <code>scripting-invalid</code> 
    */
   public Boolean isScriptingInvalid()
   {
      return Strings.isTrue(childNode.getTextValueForPatternName("scripting-invalid"));
   }

   /**
    * Removes the <code>scripting-invalid</code> element 
    * @return the current instance of <code>JspPropertyGroupType<T></code> 
    */
   public JspPropertyGroupType<T> removeScriptingInvalid()
   {
      childNode.removeChildren("scripting-invalid");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JspPropertyGroupType ElementName: javaee:xsdBooleanType ElementType : is-xml
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>is-xml</code> element
    * @param isXml the value for the element <code>is-xml</code> 
    * @return the current instance of <code>JspPropertyGroupType<T></code> 
    */
   public JspPropertyGroupType<T> isXml(Boolean isXml)
   {
      childNode.getOrCreate("is-xml").text(isXml);
      return this;
   }

   /**
    * Returns the <code>is-xml</code> element
    * @return the node defined for the element <code>is-xml</code> 
    */
   public Boolean isIsXml()
   {
      return Strings.isTrue(childNode.getTextValueForPatternName("is-xml"));
   }

   /**
    * Removes the <code>is-xml</code> element 
    * @return the current instance of <code>JspPropertyGroupType<T></code> 
    */
   public JspPropertyGroupType<T> removeIsXml()
   {
      childNode.removeChildren("is-xml");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JspPropertyGroupType ElementName: xsd:token ElementType : include-prelude
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>include-prelude</code> elements, 
    * a new <code>include-prelude</code> element 
    * @param values list of <code>include-prelude</code> objects 
    * @return the current instance of <code>JspPropertyGroupType<T></code> 
    */
   public JspPropertyGroupType<T> includePrelude(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("include-prelude").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>include-prelude</code> elements
    * @return list of <code>include-prelude</code> 
    */
public List<String> getAllIncludePrelude()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("include-prelude");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>include-prelude</code> element 
    * @return the current instance of <code>JspPropertyGroupType<T></code> 
    */
   public JspPropertyGroupType<T> removeAllIncludePrelude()
   {
      childNode.removeChildren("include-prelude");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JspPropertyGroupType ElementName: xsd:token ElementType : include-coda
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>include-coda</code> elements, 
    * a new <code>include-coda</code> element 
    * @param values list of <code>include-coda</code> objects 
    * @return the current instance of <code>JspPropertyGroupType<T></code> 
    */
   public JspPropertyGroupType<T> includeCoda(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("include-coda").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>include-coda</code> elements
    * @return list of <code>include-coda</code> 
    */
public List<String> getAllIncludeCoda()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("include-coda");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>include-coda</code> element 
    * @return the current instance of <code>JspPropertyGroupType<T></code> 
    */
   public JspPropertyGroupType<T> removeAllIncludeCoda()
   {
      childNode.removeChildren("include-coda");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JspPropertyGroupType ElementName: javaee:xsdBooleanType ElementType : deferred-syntax-allowed-as-literal
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>deferred-syntax-allowed-as-literal</code> element
    * @param deferredSyntaxAllowedAsLiteral the value for the element <code>deferred-syntax-allowed-as-literal</code> 
    * @return the current instance of <code>JspPropertyGroupType<T></code> 
    */
   public JspPropertyGroupType<T> deferredSyntaxAllowedAsLiteral(Boolean deferredSyntaxAllowedAsLiteral)
   {
      childNode.getOrCreate("deferred-syntax-allowed-as-literal").text(deferredSyntaxAllowedAsLiteral);
      return this;
   }

   /**
    * Returns the <code>deferred-syntax-allowed-as-literal</code> element
    * @return the node defined for the element <code>deferred-syntax-allowed-as-literal</code> 
    */
   public Boolean isDeferredSyntaxAllowedAsLiteral()
   {
      return Strings.isTrue(childNode.getTextValueForPatternName("deferred-syntax-allowed-as-literal"));
   }

   /**
    * Removes the <code>deferred-syntax-allowed-as-literal</code> element 
    * @return the current instance of <code>JspPropertyGroupType<T></code> 
    */
   public JspPropertyGroupType<T> removeDeferredSyntaxAllowedAsLiteral()
   {
      childNode.removeChildren("deferred-syntax-allowed-as-literal");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JspPropertyGroupType ElementName: javaee:xsdBooleanType ElementType : trim-directive-whitespaces
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>trim-directive-whitespaces</code> element
    * @param trimDirectiveWhitespaces the value for the element <code>trim-directive-whitespaces</code> 
    * @return the current instance of <code>JspPropertyGroupType<T></code> 
    */
   public JspPropertyGroupType<T> trimDirectiveWhitespaces(Boolean trimDirectiveWhitespaces)
   {
      childNode.getOrCreate("trim-directive-whitespaces").text(trimDirectiveWhitespaces);
      return this;
   }

   /**
    * Returns the <code>trim-directive-whitespaces</code> element
    * @return the node defined for the element <code>trim-directive-whitespaces</code> 
    */
   public Boolean isTrimDirectiveWhitespaces()
   {
      return Strings.isTrue(childNode.getTextValueForPatternName("trim-directive-whitespaces"));
   }

   /**
    * Removes the <code>trim-directive-whitespaces</code> element 
    * @return the current instance of <code>JspPropertyGroupType<T></code> 
    */
   public JspPropertyGroupType<T> removeTrimDirectiveWhitespaces()
   {
      childNode.removeChildren("trim-directive-whitespaces");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JspPropertyGroupType ElementName: xsd:token ElementType : default-content-type
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>default-content-type</code> element
    * @param defaultContentType the value for the element <code>default-content-type</code> 
    * @return the current instance of <code>JspPropertyGroupType<T></code> 
    */
   public JspPropertyGroupType<T> defaultContentType(String defaultContentType)
   {
      childNode.getOrCreate("default-content-type").text(defaultContentType);
      return this;
   }

   /**
    * Returns the <code>default-content-type</code> element
    * @return the node defined for the element <code>default-content-type</code> 
    */
   public String getDefaultContentType()
   {
      return childNode.getTextValueForPatternName("default-content-type");
   }

   /**
    * Removes the <code>default-content-type</code> element 
    * @return the current instance of <code>JspPropertyGroupType<T></code> 
    */
   public JspPropertyGroupType<T> removeDefaultContentType()
   {
      childNode.removeChildren("default-content-type");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JspPropertyGroupType ElementName: xsd:token ElementType : buffer
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>buffer</code> element
    * @param buffer the value for the element <code>buffer</code> 
    * @return the current instance of <code>JspPropertyGroupType<T></code> 
    */
   public JspPropertyGroupType<T> buffer(String buffer)
   {
      childNode.getOrCreate("buffer").text(buffer);
      return this;
   }

   /**
    * Returns the <code>buffer</code> element
    * @return the node defined for the element <code>buffer</code> 
    */
   public String getBuffer()
   {
      return childNode.getTextValueForPatternName("buffer");
   }

   /**
    * Removes the <code>buffer</code> element 
    * @return the current instance of <code>JspPropertyGroupType<T></code> 
    */
   public JspPropertyGroupType<T> removeBuffer()
   {
      childNode.removeChildren("buffer");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JspPropertyGroupType ElementName: javaee:xsdBooleanType ElementType : error-on-undeclared-namespace
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>error-on-undeclared-namespace</code> element
    * @param errorOnUndeclaredNamespace the value for the element <code>error-on-undeclared-namespace</code> 
    * @return the current instance of <code>JspPropertyGroupType<T></code> 
    */
   public JspPropertyGroupType<T> errorOnUndeclaredNamespace(Boolean errorOnUndeclaredNamespace)
   {
      childNode.getOrCreate("error-on-undeclared-namespace").text(errorOnUndeclaredNamespace);
      return this;
   }

   /**
    * Returns the <code>error-on-undeclared-namespace</code> element
    * @return the node defined for the element <code>error-on-undeclared-namespace</code> 
    */
   public Boolean isErrorOnUndeclaredNamespace()
   {
      return Strings.isTrue(childNode.getTextValueForPatternName("error-on-undeclared-namespace"));
   }

   /**
    * Removes the <code>error-on-undeclared-namespace</code> element 
    * @return the current instance of <code>JspPropertyGroupType<T></code> 
    */
   public JspPropertyGroupType<T> removeErrorOnUndeclaredNamespace()
   {
      childNode.removeChildren("error-on-undeclared-namespace");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JspPropertyGroupType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>JspPropertyGroupType<T></code> 
    */
   public JspPropertyGroupType<T> id(String id)
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
    * @return the current instance of <code>JspPropertyGroupType<T></code> 
    */
   public JspPropertyGroupType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
