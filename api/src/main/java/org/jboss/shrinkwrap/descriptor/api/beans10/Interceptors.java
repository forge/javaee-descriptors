package org.jboss.shrinkwrap.descriptor.api.beans10; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> interceptors </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface Interceptors<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Interceptors ElementName: xsd:string ElementType : class
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>class</code> elements, 
    * a new <code>class</code> element 
    * @param values list of <code>class</code> objects 
    * @return the current instance of <code>Interceptors<T></code> 
    */
   public Interceptors<T> clazz(String ... values);

   /**
    * Returns all <code>class</code> elements
    * @return list of <code>class</code> 
    */
   public List<String> getAllClazz();

   /**
    * Removes the <code>class</code> element 
    * @return the current instance of <code>Interceptors<T></code> 
    */
   public Interceptors<T> removeAllClazz();
}
