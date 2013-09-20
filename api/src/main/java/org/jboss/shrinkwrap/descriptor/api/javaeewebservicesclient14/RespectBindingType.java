package org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient14; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> respect-bindingType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface RespectBindingType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: RespectBindingType ElementName: javaee:xsdBooleanType ElementType : enabled
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>enabled</code> element
    * @param enabled the value for the element <code>enabled</code> 
    * @return the current instance of <code>RespectBindingType<T></code> 
    */
   public RespectBindingType<T> enabled(Boolean enabled);

   /**
    * Returns the <code>enabled</code> element
    * @return the node defined for the element <code>enabled</code> 
    */
   public Boolean isEnabled();

   /**
    * Removes the <code>enabled</code> element 
    * @return the current instance of <code>RespectBindingType<T></code> 
    */
   public RespectBindingType<T> removeEnabled();
}
