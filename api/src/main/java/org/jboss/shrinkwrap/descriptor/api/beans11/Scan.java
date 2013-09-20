package org.jboss.shrinkwrap.descriptor.api.beans11; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.beans11.Exclude;
/**
 * This interface defines the contract for the <code> scan </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface Scan<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Scan ElementName: javaee:exclude ElementType : exclude
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>exclude</code> element with the given value will be created.
    * Otherwise, the existing <code>exclude</code> element will be returned.
    * @return  a new or existing instance of <code>Exclude<Scan<T>></code> 
    */
   public Exclude<Scan<T>> getOrCreateExclude();

   /**
    * Removes the <code>exclude</code> element 
    * @return the current instance of <code>Scan<T></code> 
    */
   public Scan<T> removeExclude();
}
