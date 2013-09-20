/**
 * Copyright 2013 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Eclipse Public License version 1.0, available at
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.jboss.shrinkwrap.descriptor.api.webapp;

import org.jboss.shrinkwrap.descriptor.api.Descriptor;

/**
 * 
 * @author <a href="ggastald@redhat.com">George Gastaldi</a>
 */
public interface WebAppCommonDescriptor<T extends WebAppCommonDescriptor<T>> extends Descriptor
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
}
