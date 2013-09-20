package org.jboss.shrinkwrap.descriptor.api.javaee7;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee.SecurityRoleRefCommonType;

/**
 * This interface defines the contract for the <code> security-role-refType </code> xsd type
 * 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface SecurityRoleRefType<T> extends Child<T>, SecurityRoleRefCommonType<T, SecurityRoleRefType<T>>
{

}
