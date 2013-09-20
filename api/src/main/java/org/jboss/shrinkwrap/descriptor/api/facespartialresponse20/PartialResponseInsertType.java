package org.jboss.shrinkwrap.descriptor.api.facespartialresponse20; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.facespartialresponse20.Before;
import org.jboss.shrinkwrap.descriptor.api.facespartialresponse20.After;
/**
 * This interface defines the contract for the <code> partial-response-insertType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface PartialResponseInsertType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PartialResponseInsertType ElementName: javaee:before ElementType : before
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>before</code> element with the given value will be created.
    * Otherwise, the existing <code>before</code> element will be returned.
    * @return  a new or existing instance of <code>Before<PartialResponseInsertType<T>></code> 
    */
   public Before<PartialResponseInsertType<T>> getOrCreateBefore();

   /**
    * Removes the <code>before</code> element 
    * @return the current instance of <code>PartialResponseInsertType<T></code> 
    */
   public PartialResponseInsertType<T> removeBefore();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PartialResponseInsertType ElementName: javaee:after ElementType : after
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>after</code> element with the given value will be created.
    * Otherwise, the existing <code>after</code> element will be returned.
    * @return  a new or existing instance of <code>After<PartialResponseInsertType<T>></code> 
    */
   public After<PartialResponseInsertType<T>> getOrCreateAfter();

   /**
    * Removes the <code>after</code> element 
    * @return the current instance of <code>PartialResponseInsertType<T></code> 
    */
   public PartialResponseInsertType<T> removeAfter();
}
