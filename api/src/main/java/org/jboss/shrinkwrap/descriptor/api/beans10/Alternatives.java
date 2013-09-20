package org.jboss.shrinkwrap.descriptor.api.beans10; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> alternatives </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface Alternatives<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Alternatives ElementName: xsd:string ElementType : class
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>class</code> elements, 
    * a new <code>class</code> element 
    * @param values list of <code>class</code> objects 
    * @return the current instance of <code>Alternatives<T></code> 
    */
   public Alternatives<T> clazz(String ... values);

   /**
    * Returns all <code>class</code> elements
    * @return list of <code>class</code> 
    */
   public List<String> getAllClazz();

   /**
    * Removes the <code>class</code> element 
    * @return the current instance of <code>Alternatives<T></code> 
    */
   public Alternatives<T> removeAllClazz();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Alternatives ElementName: xsd:string ElementType : stereotype
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>stereotype</code> elements, 
    * a new <code>stereotype</code> element 
    * @param values list of <code>stereotype</code> objects 
    * @return the current instance of <code>Alternatives<T></code> 
    */
   public Alternatives<T> stereotype(String ... values);

   /**
    * Returns all <code>stereotype</code> elements
    * @return list of <code>stereotype</code> 
    */
   public List<String> getAllStereotype();

   /**
    * Removes the <code>stereotype</code> element 
    * @return the current instance of <code>Alternatives<T></code> 
    */
   public Alternatives<T> removeAllStereotype();
}
