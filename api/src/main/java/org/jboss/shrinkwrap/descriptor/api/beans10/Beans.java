package org.jboss.shrinkwrap.descriptor.api.beans10; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.beans10.Interceptors;
import org.jboss.shrinkwrap.descriptor.api.beans10.Decorators;
import org.jboss.shrinkwrap.descriptor.api.beans10.Alternatives;
/**
 * This interface defines the contract for the <code> beans </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface Beans<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Beans ElementName: javaee:interceptors ElementType : interceptors
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>interceptors</code> element with the given value will be created.
    * Otherwise, the existing <code>interceptors</code> element will be returned.
    * @return  a new or existing instance of <code>Interceptors<Beans<T>></code> 
    */
   public Interceptors<Beans<T>> getOrCreateInterceptors();

   /**
    * Removes the <code>interceptors</code> element 
    * @return the current instance of <code>Beans<T></code> 
    */
   public Beans<T> removeInterceptors();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Beans ElementName: javaee:decorators ElementType : decorators
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>decorators</code> element with the given value will be created.
    * Otherwise, the existing <code>decorators</code> element will be returned.
    * @return  a new or existing instance of <code>Decorators<Beans<T>></code> 
    */
   public Decorators<Beans<T>> getOrCreateDecorators();

   /**
    * Removes the <code>decorators</code> element 
    * @return the current instance of <code>Beans<T></code> 
    */
   public Beans<T> removeDecorators();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Beans ElementName: javaee:alternatives ElementType : alternatives
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>alternatives</code> element with the given value will be created.
    * Otherwise, the existing <code>alternatives</code> element will be returned.
    * @return  a new or existing instance of <code>Alternatives<Beans<T>></code> 
    */
   public Alternatives<Beans<T>> getOrCreateAlternatives();

   /**
    * Removes the <code>alternatives</code> element 
    * @return the current instance of <code>Beans<T></code> 
    */
   public Beans<T> removeAlternatives();
}
