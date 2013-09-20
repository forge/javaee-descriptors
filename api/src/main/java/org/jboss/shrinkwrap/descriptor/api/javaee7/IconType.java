package org.jboss.shrinkwrap.descriptor.api.javaee7;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee.IconCommonType;

/**
 * This interface defines the contract for the <code> iconType </code> xsd type
 * 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface IconType<T> extends Child<T>, IconCommonType<T, IconType<T>>
{
}
