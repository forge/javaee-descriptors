/**
 * Copyright 2013 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.jboss.shrinkwrap.descriptor.api.webcommon;

/**
 * 
 * @author <a href="ggastald@redhat.com">George Gastaldi</a>
 */
public interface ServletCommonType<ORIGIN extends ServletCommonType<ORIGIN>>
{

   /**
    * Sets the <code>servlet-name</code> element
    * 
    * @param servletName the value for the element <code>servlet-name</code>
    * @return the current instance of <code>ServletType<T></code>
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
    * @return the current instance of <code>ServletType<T></code>
    */
   public abstract ORIGIN removeServletName();

   /**
    * Sets the <code>servlet-class</code> element
    * 
    * @param servletClass the value for the element <code>servlet-class</code>
    * @return the current instance of <code>ServletType<T></code>
    */
   public abstract ORIGIN servletClass(String servletClass);

   /**
    * Returns the <code>servlet-class</code> element
    * 
    * @return the node defined for the element <code>servlet-class</code>
    */
   public abstract String getServletClass();

   /**
    * Removes the <code>servlet-class</code> element
    * 
    * @return the current instance of <code>ServletType<T></code>
    */
   public abstract ORIGIN removeServletClass();

   /**
    * Sets the <code>load-on-startup</code> element
    * 
    * @param loadOnStartup the value for the element <code>load-on-startup</code>
    * @return the current instance of <code>ServletType<T></code>
    */
   public abstract ORIGIN loadOnStartup(Integer loadOnStartup);

   /**
    * Returns the <code>load-on-startup</code> element
    * 
    * @return the node defined for the element <code>load-on-startup</code>
    */
   public abstract Integer getLoadOnStartup();

   /**
    * Removes the <code>load-on-startup</code> element
    * 
    * @return the current instance of <code>ServletType<T></code>
    */
   public abstract ORIGIN removeLoadOnStartup();

}