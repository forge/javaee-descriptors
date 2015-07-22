/**
 * Copyright 2013 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.jboss.shrinkwrap.descriptor.api.webapp;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Descriptor;
import org.jboss.shrinkwrap.descriptor.api.javaee.ParamValueCommonType;
import org.jboss.shrinkwrap.descriptor.api.javaee.SecurityRoleCommonType;
import org.jboss.shrinkwrap.descriptor.api.webcommon.ErrorPageCommonType;
import org.jboss.shrinkwrap.descriptor.api.webcommon.LoginConfigCommonType;
import org.jboss.shrinkwrap.descriptor.api.webcommon.SecurityConstraintCommonType;
import org.jboss.shrinkwrap.descriptor.api.webcommon.ServletCommonType;
import org.jboss.shrinkwrap.descriptor.api.webcommon.ServletMappingCommonType;

/**
 * 
 * @author <a href="ggastald@redhat.com">George Gastaldi</a>
 */
public interface WebAppCommonDescriptor<T extends WebAppCommonDescriptor<T, PARAM, SERVLET_TYPE, SERVLET_MAPPING_TYPE, ERROR_PAGE_TYPE, SECURITY_CONSTRAINT_TYPE, LOGIN_CONFIG_TYPE, SECURITY_ROLE_TYPE>, PARAM extends ParamValueCommonType<PARAM>, SERVLET_TYPE extends ServletCommonType<SERVLET_TYPE>, SERVLET_MAPPING_TYPE extends ServletMappingCommonType<SERVLET_MAPPING_TYPE>, ERROR_PAGE_TYPE extends ErrorPageCommonType<T, ERROR_PAGE_TYPE>, SECURITY_CONSTRAINT_TYPE extends SecurityConstraintCommonType, LOGIN_CONFIG_TYPE extends LoginConfigCommonType, SECURITY_ROLE_TYPE extends SecurityRoleCommonType<T, SECURITY_ROLE_TYPE>>
         extends Descriptor
{
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppDescriptor ElementName: javaee:emptyType ElementType : distributable
   // MaxOccurs: -unbounded isGeneric: false isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>distributable</code> element
    * 
    * @return the current instance of <code>WebAppDescriptor</code>
    */
   public T distributable();

   /**
    * Removes the <code>distributable</code> element
    * 
    * @return the current instance of <code>WebAppDescriptor</code>
    */
   public Boolean isDistributable();

   /**
    * Removes the <code>distributable</code> element
    * 
    * @return the current instance of <code>WebAppDescriptor</code>
    */
   public T removeDistributable();

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppDescriptor ElementName: javaee:param-valueType ElementType : context-param
   // MaxOccurs: -unbounded isGeneric: false isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>context-param</code> element will be created and returned. Otherwise, the
    * first existing <code>context-param</code> element will be returned.
    * 
    * @return the instance defined for the element <code>context-param</code>
    */
   public PARAM getOrCreateContextParam();

   /**
    * Creates a new <code>context-param</code> element
    * 
    * @return the new created instance of <code>ParamValueType<WebAppDescriptor></code>
    */
   public PARAM createContextParam();

   /**
    * Returns all <code>context-param</code> elements
    * 
    * @return list of <code>context-param</code>
    */
   public List<PARAM> getAllContextParam();

   /**
    * Removes all <code>context-param</code> elements
    * 
    * @return the current instance of <code>ParamValueType<WebAppDescriptor></code>
    */
   public T removeAllContextParam();

   /**
    * If not already created, a new <code>servlet</code> element will be created and returned. Otherwise, the first
    * existing <code>servlet</code> element will be returned.
    * 
    * @return the instance defined for the element <code>servlet</code>
    */
   public SERVLET_TYPE getOrCreateServlet();

   /**
    * Creates a new <code>servlet</code> element
    * 
    * @return the new created instance of <code>ServletType<WebAppDescriptor></code>
    */
   public SERVLET_TYPE createServlet();

   /**
    * Returns all <code>servlet</code> elements
    * 
    * @return list of <code>servlet</code>
    */
   public List<SERVLET_TYPE> getAllServlet();

   /**
    * Removes all <code>servlet</code> elements
    * 
    * @return the current instance of <code>ServletType<WebAppDescriptor></code>
    */
   public T removeAllServlet();

   /**
    * If not already created, a new <code>servlet-mapping</code> element will be created and returned. Otherwise, the
    * first existing <code>servlet-mapping</code> element will be returned.
    * 
    * @return the instance defined for the element <code>servlet-mapping</code>
    */
   public SERVLET_MAPPING_TYPE getOrCreateServletMapping();

   /**
    * Creates a new <code>servlet-mapping</code> element
    * 
    * @return the new created instance of <code>ServletMappingType<WebAppDescriptor></code>
    */
   public SERVLET_MAPPING_TYPE createServletMapping();

   /**
    * Returns all <code>servlet-mapping</code> elements
    * 
    * @return list of <code>servlet-mapping</code>
    */
   public List<SERVLET_MAPPING_TYPE> getAllServletMapping();

   /**
    * Removes all <code>servlet-mapping</code> elements
    * 
    * @return the current instance of <code>ServletMappingType<WebAppDescriptor></code>
    */
   public T removeAllServletMapping();

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppDescriptor ElementName: javaee:error-pageType ElementType : error-page
   // MaxOccurs: -unbounded isGeneric: false isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>error-page</code> element will be created and returned. Otherwise, the first
    * existing <code>error-page</code> element will be returned.
    * 
    * @return the instance defined for the element <code>error-page</code>
    */
   public ERROR_PAGE_TYPE getOrCreateErrorPage();

   /**
    * Creates a new <code>error-page</code> element
    * 
    * @return the new created instance of <code>ErrorPageType<WebAppDescriptor></code>
    */
   public ERROR_PAGE_TYPE createErrorPage();

   /**
    * Returns all <code>error-page</code> elements
    * 
    * @return list of <code>error-page</code>
    */
   public List<ERROR_PAGE_TYPE> getAllErrorPage();

   /**
    * Removes all <code>error-page</code> elements
    * 
    * @return the current instance of <code>ErrorPageType<WebAppDescriptor></code>
    */
   public T removeAllErrorPage();

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppDescriptor ElementName: javaee:security-constraintType ElementType : security-constraint
   // MaxOccurs: -unbounded isGeneric: false isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>security-constraint</code> element will be created and returned. Otherwise,
    * the first existing <code>security-constraint</code> element will be returned.
    * 
    * @return the instance defined for the element <code>security-constraint</code>
    */
   public SECURITY_CONSTRAINT_TYPE getOrCreateSecurityConstraint();

   /**
    * Creates a new <code>security-constraint</code> element
    * 
    * @return the new created instance of <code>SecurityConstraintType<WebAppDescriptor></code>
    */
   public SECURITY_CONSTRAINT_TYPE createSecurityConstraint();

   /**
    * Returns all <code>security-constraint</code> elements
    * 
    * @return list of <code>security-constraint</code>
    */
   public List<SECURITY_CONSTRAINT_TYPE> getAllSecurityConstraint();

   /**
    * Removes all <code>security-constraint</code> elements
    * 
    * @return the current instance of <code>SecurityConstraintType<WebAppDescriptor></code>
    */
   public T removeAllSecurityConstraint();

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppDescriptor ElementName: javaee:login-configType ElementType : login-config
   // MaxOccurs: -unbounded isGeneric: false isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>login-config</code> element will be created and returned. Otherwise, the first
    * existing <code>login-config</code> element will be returned.
    * 
    * @return the instance defined for the element <code>login-config</code>
    */
   public LOGIN_CONFIG_TYPE getOrCreateLoginConfig();

   /**
    * Creates a new <code>login-config</code> element
    * 
    * @return the new created instance of <code>LoginConfigType<WebAppDescriptor></code>
    */
   public LOGIN_CONFIG_TYPE createLoginConfig();

   /**
    * Returns all <code>login-config</code> elements
    * 
    * @return list of <code>login-config</code>
    */
   public List<LOGIN_CONFIG_TYPE> getAllLoginConfig();

   /**
    * Removes all <code>login-config</code> elements
    * 
    * @return the current instance of <code>LoginConfigType<WebAppDescriptor></code>
    */
   public T removeAllLoginConfig();

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: WebAppDescriptor ElementName: javaee:security-roleType ElementType : security-role
   // MaxOccurs: -unbounded isGeneric: false isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>security-role</code> element will be created and returned. Otherwise, the
    * first existing <code>security-role</code> element will be returned.
    * 
    * @return the instance defined for the element <code>security-role</code>
    */
   public SECURITY_ROLE_TYPE getOrCreateSecurityRole();

   /**
    * Creates a new <code>security-role</code> element
    * 
    * @return the new created instance of <code>SecurityRoleType<WebAppDescriptor></code>
    */
   public SECURITY_ROLE_TYPE createSecurityRole();

   /**
    * Returns all <code>security-role</code> elements
    * 
    * @return list of <code>security-role</code>
    */
   public List<SECURITY_ROLE_TYPE> getAllSecurityRole();

   /**
    * Removes all <code>security-role</code> elements
    * 
    * @return the current instance of <code>SecurityRoleType<WebAppDescriptor></code>
    */
   public T removeAllSecurityRole();
}
