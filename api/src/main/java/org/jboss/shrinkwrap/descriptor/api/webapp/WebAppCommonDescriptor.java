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
import org.jboss.shrinkwrap.descriptor.api.webcommon.ServletCommonType;
import org.jboss.shrinkwrap.descriptor.api.webcommon.ServletMappingCommonType;

/**
 * 
 * @author <a href="ggastald@redhat.com">George Gastaldi</a>
 */
public interface WebAppCommonDescriptor<T extends WebAppCommonDescriptor<T, PARAM, SERVLET_TYPE, SERVLET_MAPPING_TYPE>, PARAM extends ParamValueCommonType<PARAM>, SERVLET_TYPE extends ServletCommonType<SERVLET_TYPE>, SERVLET_MAPPING_TYPE extends ServletMappingCommonType<SERVLET_MAPPING_TYPE>>
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



}
