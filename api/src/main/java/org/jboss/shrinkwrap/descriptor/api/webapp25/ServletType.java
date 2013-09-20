package org.jboss.shrinkwrap.descriptor.api.webapp25;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee5.IconType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.ParamValueType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.RunAsType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.SecurityRoleRefType;
import org.jboss.shrinkwrap.descriptor.api.webcommon.ServletCommonType;

/**
 * This interface defines the contract for the <code> servletType </code> xsd type
 * 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface ServletType<T> extends Child<T>, ServletCommonType<ServletType<T>>
{

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ServletType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded isGeneric: true isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, a new <code>description</code>
    * element
    * 
    * @param values list of <code>description</code> objects
    * @return the current instance of <code>ServletType<T></code>
    */
   public ServletType<T> description(String... values);

   /**
    * Returns all <code>description</code> elements
    * 
    * @return list of <code>description</code>
    */
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element
    * 
    * @return the current instance of <code>ServletType<T></code>
    */
   public ServletType<T> removeAllDescription();

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ServletType ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded isGeneric: true isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, a new <code>display-name</code>
    * element
    * 
    * @param values list of <code>display-name</code> objects
    * @return the current instance of <code>ServletType<T></code>
    */
   public ServletType<T> displayName(String... values);

   /**
    * Returns all <code>display-name</code> elements
    * 
    * @return list of <code>display-name</code>
    */
   public List<String> getAllDisplayName();

   /**
    * Removes the <code>display-name</code> element
    * 
    * @return the current instance of <code>ServletType<T></code>
    */
   public ServletType<T> removeAllDisplayName();

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ServletType ElementName: javaee:iconType ElementType : icon
   // MaxOccurs: -unbounded isGeneric: true isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>icon</code> element will be created and returned. Otherwise, the first
    * existing <code>icon</code> element will be returned.
    * 
    * @return the instance defined for the element <code>icon</code>
    */
   public IconType<ServletType<T>> getOrCreateIcon();

   /**
    * Creates a new <code>icon</code> element
    * 
    * @return the new created instance of <code>IconType<ServletType<T>></code>
    */
   public IconType<ServletType<T>> createIcon();

   /**
    * Returns all <code>icon</code> elements
    * 
    * @return list of <code>icon</code>
    */
   public List<IconType<ServletType<T>>> getAllIcon();

   /**
    * Removes all <code>icon</code> elements
    * 
    * @return the current instance of <code>IconType<ServletType<T>></code>
    */
   public ServletType<T> removeAllIcon();

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ServletType ElementName: javaee:nonEmptyStringType ElementType : servlet-name
   // MaxOccurs: - isGeneric: true isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ServletType ElementName: xsd:token ElementType : servlet-class
   // MaxOccurs: - isGeneric: true isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ServletType ElementName: javaee:pathType ElementType : jsp-file
   // MaxOccurs: - isGeneric: true isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>jsp-file</code> element
    * 
    * @param jspFile the value for the element <code>jsp-file</code>
    * @return the current instance of <code>ServletType<T></code>
    */
   public ServletType<T> jspFile(String jspFile);

   /**
    * Returns the <code>jsp-file</code> element
    * 
    * @return the node defined for the element <code>jsp-file</code>
    */
   public String getJspFile();

   /**
    * Removes the <code>jsp-file</code> element
    * 
    * @return the current instance of <code>ServletType<T></code>
    */
   public ServletType<T> removeJspFile();

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ServletType ElementName: javaee:param-valueType ElementType : init-param
   // MaxOccurs: -unbounded isGeneric: true isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>init-param</code> element will be created and returned. Otherwise, the first
    * existing <code>init-param</code> element will be returned.
    * 
    * @return the instance defined for the element <code>init-param</code>
    */
   public ParamValueType<ServletType<T>> getOrCreateInitParam();

   /**
    * Creates a new <code>init-param</code> element
    * 
    * @return the new created instance of <code>ParamValueType<ServletType<T>></code>
    */
   public ParamValueType<ServletType<T>> createInitParam();

   /**
    * Returns all <code>init-param</code> elements
    * 
    * @return list of <code>init-param</code>
    */
   public List<ParamValueType<ServletType<T>>> getAllInitParam();

   /**
    * Removes all <code>init-param</code> elements
    * 
    * @return the current instance of <code>ParamValueType<ServletType<T>></code>
    */
   public ServletType<T> removeAllInitParam();

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ServletType ElementName: javaee:run-asType ElementType : run-as
   // MaxOccurs: - isGeneric: true isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>run-as</code> element with the given value will be created. Otherwise, the
    * existing <code>run-as</code> element will be returned.
    * 
    * @return a new or existing instance of <code>RunAsType<ServletType<T>></code>
    */
   public RunAsType<ServletType<T>> getOrCreateRunAs();

   /**
    * Removes the <code>run-as</code> element
    * 
    * @return the current instance of <code>ServletType<T></code>
    */
   public ServletType<T> removeRunAs();

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ServletType ElementName: javaee:security-role-refType ElementType : security-role-ref
   // MaxOccurs: -unbounded isGeneric: true isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>security-role-ref</code> element will be created and returned. Otherwise, the
    * first existing <code>security-role-ref</code> element will be returned.
    * 
    * @return the instance defined for the element <code>security-role-ref</code>
    */
   public SecurityRoleRefType<ServletType<T>> getOrCreateSecurityRoleRef();

   /**
    * Creates a new <code>security-role-ref</code> element
    * 
    * @return the new created instance of <code>SecurityRoleRefType<ServletType<T>></code>
    */
   public SecurityRoleRefType<ServletType<T>> createSecurityRoleRef();

   /**
    * Returns all <code>security-role-ref</code> elements
    * 
    * @return list of <code>security-role-ref</code>
    */
   public List<SecurityRoleRefType<ServletType<T>>> getAllSecurityRoleRef();

   /**
    * Removes all <code>security-role-ref</code> elements
    * 
    * @return the current instance of <code>SecurityRoleRefType<ServletType<T>></code>
    */
   public ServletType<T> removeAllSecurityRoleRef();

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ServletType ElementName: xsd:ID ElementType : id
   // MaxOccurs: - isGeneric: true isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * 
    * @param id the value for the attribute <code>id</code>
    * @return the current instance of <code>ServletType<T></code>
    */
   public ServletType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * 
    * @return the value defined for the attribute <code>id</code>
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute
    * 
    * @return the current instance of <code>ServletType<T></code>
    */
   public ServletType<T> removeId();
}