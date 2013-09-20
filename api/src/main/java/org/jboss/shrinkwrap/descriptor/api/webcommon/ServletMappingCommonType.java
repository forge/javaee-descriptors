/**
 * Copyright 2013 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.jboss.shrinkwrap.descriptor.api.webcommon;

import java.util.List;

/**
 * 
 * @author <a href="ggastald@redhat.com">George Gastaldi</a>
 */
public interface ServletMappingCommonType<ORIGIN extends ServletMappingCommonType<ORIGIN>>
{

   /**
    * Sets the <code>servlet-name</code> element
    * 
    * @param servletName the value for the element <code>servlet-name</code>
    * @return the current instance of <code>ServletMappingType<T></code>
    */
   public abstract ORIGIN servletName(String servletName);

   /**
    * Returns the <code>servlet-name</code> element
    * 
    * @return the node defined for the element <code>servlet-name</code>
    */
   public abstract String getServletName();

   /**
    * Removes the <code>servlet-name</code> element
    * 
    * @return the current instance of <code>ServletMappingType<T></code>
    */
   public abstract ORIGIN removeServletName();

   /**
    * Creates for all String objects representing <code>url-pattern</code> elements, a new <code>url-pattern</code>
    * element
    * 
    * @param values list of <code>url-pattern</code> objects
    * @return the current instance of <code>ServletMappingType<T></code>
    */
   public abstract ORIGIN urlPattern(String... values);

   /**
    * Returns all <code>url-pattern</code> elements
    * 
    * @return list of <code>url-pattern</code>
    */
   public abstract List<String> getAllUrlPattern();

   /**
    * Removes the <code>url-pattern</code> element
    * 
    * @return the current instance of <code>ServletMappingType<T></code>
    */
   public abstract ORIGIN removeAllUrlPattern();

   /**
    * Sets the <code>id</code> attribute
    * 
    * @param id the value for the attribute <code>id</code>
    * @return the current instance of <code>ServletMappingType<T></code>
    */
   public abstract ORIGIN id(String id);

   /**
    * Returns the <code>id</code> attribute
    * 
    * @return the value defined for the attribute <code>id</code>
    */
   public abstract String getId();

   /**
    * Removes the <code>id</code> attribute
    * 
    * @return the current instance of <code>ServletMappingType<T></code>
    */
   public abstract ORIGIN removeId();

}