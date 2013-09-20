/**
 * Copyright 2013 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.jboss.shrinkwrap.descriptor.api.javaee;

/**
 * 
 * @author <a href="ggastald@redhat.com">George Gastaldi</a>
 */
public interface IconCommonType<T, ORIGIN extends IconCommonType<T, ORIGIN>>
{

   /**
    * Sets the <code>small-icon</code> element
    * @param smallIcon the value for the element <code>small-icon</code> 
    * @return the current instance of <code>IconType<T></code> 
    */
   public abstract ORIGIN smallIcon(String smallIcon);

   /**
    * Returns the <code>small-icon</code> element
    * @return the node defined for the element <code>small-icon</code> 
    */
   public abstract String getSmallIcon();

   /**
    * Removes the <code>small-icon</code> element 
    * @return the current instance of <code>IconType<T></code> 
    */
   public abstract ORIGIN removeSmallIcon();

   /**
    * Sets the <code>large-icon</code> element
    * @param largeIcon the value for the element <code>large-icon</code> 
    * @return the current instance of <code>IconType<T></code> 
    */
   public abstract ORIGIN largeIcon(String largeIcon);

   /**
    * Returns the <code>large-icon</code> element
    * @return the node defined for the element <code>large-icon</code> 
    */
   public abstract String getLargeIcon();

   /**
    * Removes the <cIconType<T>ode>large-icon</code> element 
    * @return the current instance of <code>IconType<T></code> 
    */
   public abstract ORIGIN removeLargeIcon();

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>IconType<T></code> 
    */
   public abstract ORIGIN id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public abstract String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>IconType<T></code> 
    */
   public abstract ORIGIN removeId();

}