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
public interface SecurityRoleRefCommonType<T, ORIGIN extends SecurityRoleRefCommonType<T, ORIGIN>>
{

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>SecurityRoleRefType<T></code> 
    */
   public abstract ORIGIN description(String... values);

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public abstract List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>SecurityRoleRefType<T></code> 
    */
   public abstract ORIGIN removeAllDescription();

   /**
    * Sets the <code>role-name</code> element
    * @param roleName the value for the element <code>role-name</code> 
    * @return the current instance of <code>SecurityRoleRefType<T></code> 
    */
   public abstract ORIGIN roleName(String roleName);

   /**
    * Returns the <code>role-name</code> element
    * @return the node defined for the element <code>role-name</code> 
    */
   public abstract String getRoleName();

   /**
    * Removes the <code>role-name</code> element 
    * @return the current instance of <code>SecurityRoleRefType<T></code> 
    */
   public abstract ORIGIN removeRoleName();

   /**
    * Sets the <code>role-link</code> element
    * @param roleLink the value for the element <code>role-link</code> 
    * @return the current instance of <code>SecurityRoleRefType<T></code> 
    */
   public abstract ORIGIN roleLink(String roleLink);

   /**
    * Returns the <code>role-link</code> element
    * @return the node defined for the element <code>role-link</code> 
    */
   public abstract String getRoleLink();

   /**
    * Removes the <code>role-link</code> element 
    * @return the current instance of <code>SecurityRoleRefType<T></code> 
    */
   public abstract ORIGIN removeRoleLink();

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>SecurityRoleRefType<T></code> 
    */
   public abstract ORIGIN id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public abstract String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>SecurityRoleRefType<T></code> 
    */
   public abstract ORIGIN removeId();

}