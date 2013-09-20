/**
 * Copyright 2013 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.jboss.shrinkwrap.descriptor.api.javaee;

import java.util.List;

/**
 * 
 * @author <a href="ggastald@redhat.com">George Gastaldi</a>
 */
public interface ParamValueCommonType<ORIGIN extends ParamValueCommonType<ORIGIN>>
{

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>ParamValueType<T></code> 
    */
   public abstract ORIGIN description(String... values);

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public abstract List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>ParamValueType<T></code> 
    */
   public abstract ORIGIN removeAllDescription();

   /**
    * Sets the <code>param-name</code> element
    * @param paramName the value for the element <code>param-name</code> 
    * @return the current instance of <code>ParamValueType<T></code> 
    */
   public abstract ORIGIN paramName(String paramName);

   /**
    * Returns the <code>param-name</code> element
    * @return the node defined for the element <code>param-name</code> 
    */
   public abstract String getParamName();

   /**
    * Removes the <code>param-name</code> element 
    * @return the current instance of <code>ParamValueType<T></code> 
    */
   public abstract ORIGIN removeParamName();

   /**
    * Sets the <code>param-value</code> element
    * @param paramValue the value for the element <code>param-value</code> 
    * @return the current instance of <code>ParamValueType<T></code> 
    */
   public abstract ORIGIN paramValue(String paramValue);

   /**
    * Returns the <code>param-value</code> element
    * @return the node defined for the element <code>param-value</code> 
    */
   public abstract String getParamValue();

   /**
    * Removes the <code>param-value</code> element 
    * @return the current instance of <code>ParamValueType<T></code> 
    */
   public abstract ORIGIN removeParamValue();

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>ParamValueType<T></code> 
    */
   public abstract ORIGIN id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public abstract String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>ParamValueType<T></code> 
    */
   public abstract ORIGIN removeId();

}