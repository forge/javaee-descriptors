package org.jboss.shrinkwrap.descriptor.api.javaee5; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee.ParamValueCommonType;
/**
 * This interface defines the contract for the <code> param-valueType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface ParamValueType<T> extends Child<T>, ParamValueCommonType<T, ParamValueType<T>>
{
}
