package org.jboss.shrinkwrap.descriptor.api.jsp22; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IconType;
/**
 * This interface defines the contract for the <code> jsp-property-groupType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface JspPropertyGroupType<T> extends Child<T>
{
 
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
   public JspPropertyGroupType<T> description(String ... values);

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>JspPropertyGroupType<T></code> 
    */
   public JspPropertyGroupType<T> removeAllDescription();
 
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
   public JspPropertyGroupType<T> displayName(String ... values);

   /**
    * Returns all <code>display-name</code> elements
    * @return list of <code>display-name</code> 
    */
   public List<String> getAllDisplayName();

   /**
    * Removes the <code>display-name</code> element 
    * @return the current instance of <code>JspPropertyGroupType<T></code> 
    */
   public JspPropertyGroupType<T> removeAllDisplayName();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JspPropertyGroupType ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned.
    * Otherwise, the first existing <code>icon</code> element will be returned.
    * @return the instance defined for the element <code>icon</code> 
    */
   public IconType<JspPropertyGroupType<T>> getOrCreateIcon();

   /**
    * Creates a new <code>icon</code> element 
    * @return the new created instance of <code>IconType<JspPropertyGroupType<T>></code> 
    */
   public IconType<JspPropertyGroupType<T>> createIcon();

   /**
    * Returns all <code>icon</code> elements
    * @return list of <code>icon</code> 
    */
   public List<IconType<JspPropertyGroupType<T>>> getAllIcon();

   /**
    * Removes all <code>icon</code> elements 
    * @return the current instance of <code>IconType<JspPropertyGroupType<T>></code> 
    */
   public JspPropertyGroupType<T> removeAllIcon();
 
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
   public JspPropertyGroupType<T> urlPattern(String ... values);

   /**
    * Returns all <code>url-pattern</code> elements
    * @return list of <code>url-pattern</code> 
    */
   public List<String> getAllUrlPattern();

   /**
    * Removes the <code>url-pattern</code> element 
    * @return the current instance of <code>JspPropertyGroupType<T></code> 
    */
   public JspPropertyGroupType<T> removeAllUrlPattern();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JspPropertyGroupType ElementName: javaee:xsdBooleanType ElementType : el-ignored
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>el-ignored</code> element
    * @param elIgnored the value for the element <code>el-ignored</code> 
    * @return the current instance of <code>JspPropertyGroupType<T></code> 
    */
   public JspPropertyGroupType<T> elIgnored(Boolean elIgnored);

   /**
    * Returns the <code>el-ignored</code> element
    * @return the node defined for the element <code>el-ignored</code> 
    */
   public Boolean isElIgnored();

   /**
    * Removes the <code>el-ignored</code> element 
    * @return the current instance of <code>JspPropertyGroupType<T></code> 
    */
   public JspPropertyGroupType<T> removeElIgnored();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JspPropertyGroupType ElementName: xsd:token ElementType : page-encoding
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>page-encoding</code> element
    * @param pageEncoding the value for the element <code>page-encoding</code> 
    * @return the current instance of <code>JspPropertyGroupType<T></code> 
    */
   public JspPropertyGroupType<T> pageEncoding(String pageEncoding);

   /**
    * Returns the <code>page-encoding</code> element
    * @return the node defined for the element <code>page-encoding</code> 
    */
   public String getPageEncoding();

   /**
    * Removes the <code>page-encoding</code> element 
    * @return the current instance of <code>JspPropertyGroupType<T></code> 
    */
   public JspPropertyGroupType<T> removePageEncoding();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JspPropertyGroupType ElementName: javaee:xsdBooleanType ElementType : scripting-invalid
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>scripting-invalid</code> element
    * @param scriptingInvalid the value for the element <code>scripting-invalid</code> 
    * @return the current instance of <code>JspPropertyGroupType<T></code> 
    */
   public JspPropertyGroupType<T> scriptingInvalid(Boolean scriptingInvalid);

   /**
    * Returns the <code>scripting-invalid</code> element
    * @return the node defined for the element <code>scripting-invalid</code> 
    */
   public Boolean isScriptingInvalid();

   /**
    * Removes the <code>scripting-invalid</code> element 
    * @return the current instance of <code>JspPropertyGroupType<T></code> 
    */
   public JspPropertyGroupType<T> removeScriptingInvalid();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JspPropertyGroupType ElementName: javaee:xsdBooleanType ElementType : is-xml
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>is-xml</code> element
    * @param isXml the value for the element <code>is-xml</code> 
    * @return the current instance of <code>JspPropertyGroupType<T></code> 
    */
   public JspPropertyGroupType<T> isXml(Boolean isXml);

   /**
    * Returns the <code>is-xml</code> element
    * @return the node defined for the element <code>is-xml</code> 
    */
   public Boolean isIsXml();

   /**
    * Removes the <code>is-xml</code> element 
    * @return the current instance of <code>JspPropertyGroupType<T></code> 
    */
   public JspPropertyGroupType<T> removeIsXml();

 
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
   public JspPropertyGroupType<T> includePrelude(String ... values);

   /**
    * Returns all <code>include-prelude</code> elements
    * @return list of <code>include-prelude</code> 
    */
   public List<String> getAllIncludePrelude();

   /**
    * Removes the <code>include-prelude</code> element 
    * @return the current instance of <code>JspPropertyGroupType<T></code> 
    */
   public JspPropertyGroupType<T> removeAllIncludePrelude();

 
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
   public JspPropertyGroupType<T> includeCoda(String ... values);

   /**
    * Returns all <code>include-coda</code> elements
    * @return list of <code>include-coda</code> 
    */
   public List<String> getAllIncludeCoda();

   /**
    * Removes the <code>include-coda</code> element 
    * @return the current instance of <code>JspPropertyGroupType<T></code> 
    */
   public JspPropertyGroupType<T> removeAllIncludeCoda();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JspPropertyGroupType ElementName: javaee:xsdBooleanType ElementType : deferred-syntax-allowed-as-literal
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>deferred-syntax-allowed-as-literal</code> element
    * @param deferredSyntaxAllowedAsLiteral the value for the element <code>deferred-syntax-allowed-as-literal</code> 
    * @return the current instance of <code>JspPropertyGroupType<T></code> 
    */
   public JspPropertyGroupType<T> deferredSyntaxAllowedAsLiteral(Boolean deferredSyntaxAllowedAsLiteral);

   /**
    * Returns the <code>deferred-syntax-allowed-as-literal</code> element
    * @return the node defined for the element <code>deferred-syntax-allowed-as-literal</code> 
    */
   public Boolean isDeferredSyntaxAllowedAsLiteral();

   /**
    * Removes the <code>deferred-syntax-allowed-as-literal</code> element 
    * @return the current instance of <code>JspPropertyGroupType<T></code> 
    */
   public JspPropertyGroupType<T> removeDeferredSyntaxAllowedAsLiteral();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JspPropertyGroupType ElementName: javaee:xsdBooleanType ElementType : trim-directive-whitespaces
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>trim-directive-whitespaces</code> element
    * @param trimDirectiveWhitespaces the value for the element <code>trim-directive-whitespaces</code> 
    * @return the current instance of <code>JspPropertyGroupType<T></code> 
    */
   public JspPropertyGroupType<T> trimDirectiveWhitespaces(Boolean trimDirectiveWhitespaces);

   /**
    * Returns the <code>trim-directive-whitespaces</code> element
    * @return the node defined for the element <code>trim-directive-whitespaces</code> 
    */
   public Boolean isTrimDirectiveWhitespaces();

   /**
    * Removes the <code>trim-directive-whitespaces</code> element 
    * @return the current instance of <code>JspPropertyGroupType<T></code> 
    */
   public JspPropertyGroupType<T> removeTrimDirectiveWhitespaces();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JspPropertyGroupType ElementName: xsd:token ElementType : default-content-type
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>default-content-type</code> element
    * @param defaultContentType the value for the element <code>default-content-type</code> 
    * @return the current instance of <code>JspPropertyGroupType<T></code> 
    */
   public JspPropertyGroupType<T> defaultContentType(String defaultContentType);

   /**
    * Returns the <code>default-content-type</code> element
    * @return the node defined for the element <code>default-content-type</code> 
    */
   public String getDefaultContentType();

   /**
    * Removes the <code>default-content-type</code> element 
    * @return the current instance of <code>JspPropertyGroupType<T></code> 
    */
   public JspPropertyGroupType<T> removeDefaultContentType();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JspPropertyGroupType ElementName: xsd:token ElementType : buffer
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>buffer</code> element
    * @param buffer the value for the element <code>buffer</code> 
    * @return the current instance of <code>JspPropertyGroupType<T></code> 
    */
   public JspPropertyGroupType<T> buffer(String buffer);

   /**
    * Returns the <code>buffer</code> element
    * @return the node defined for the element <code>buffer</code> 
    */
   public String getBuffer();

   /**
    * Removes the <code>buffer</code> element 
    * @return the current instance of <code>JspPropertyGroupType<T></code> 
    */
   public JspPropertyGroupType<T> removeBuffer();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JspPropertyGroupType ElementName: javaee:xsdBooleanType ElementType : error-on-undeclared-namespace
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>error-on-undeclared-namespace</code> element
    * @param errorOnUndeclaredNamespace the value for the element <code>error-on-undeclared-namespace</code> 
    * @return the current instance of <code>JspPropertyGroupType<T></code> 
    */
   public JspPropertyGroupType<T> errorOnUndeclaredNamespace(Boolean errorOnUndeclaredNamespace);

   /**
    * Returns the <code>error-on-undeclared-namespace</code> element
    * @return the node defined for the element <code>error-on-undeclared-namespace</code> 
    */
   public Boolean isErrorOnUndeclaredNamespace();

   /**
    * Removes the <code>error-on-undeclared-namespace</code> element 
    * @return the current instance of <code>JspPropertyGroupType<T></code> 
    */
   public JspPropertyGroupType<T> removeErrorOnUndeclaredNamespace();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JspPropertyGroupType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>JspPropertyGroupType<T></code> 
    */
   public JspPropertyGroupType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>JspPropertyGroupType<T></code> 
    */
   public JspPropertyGroupType<T> removeId();
}
