package org.jboss.shrinkwrap.descriptor.api.jobXML10; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> Next </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface Next<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Next ElementName: xsd:string ElementType : on
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>on</code> attribute
    * @param on the value for the attribute <code>on</code> 
    * @return the current instance of <code>Next<T></code> 
    */
   public Next<T> on(String on);

   /**
    * Returns the <code>on</code> attribute
    * @return the value defined for the attribute <code>on</code> 
    */
   public String getOn();

   /**
    * Removes the <code>on</code> attribute 
    * @return the current instance of <code>Next<T></code> 
    */
   public Next<T> removeOn();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Next ElementName: xsd:string ElementType : to
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>to</code> attribute
    * @param to the value for the attribute <code>to</code> 
    * @return the current instance of <code>Next<T></code> 
    */
   public Next<T> to(String to);

   /**
    * Returns the <code>to</code> attribute
    * @return the value defined for the attribute <code>to</code> 
    */
   public String getTo();

   /**
    * Removes the <code>to</code> attribute 
    * @return the current instance of <code>Next<T></code> 
    */
   public Next<T> removeTo();
}
