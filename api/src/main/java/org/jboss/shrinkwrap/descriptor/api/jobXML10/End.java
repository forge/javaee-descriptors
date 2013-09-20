package org.jboss.shrinkwrap.descriptor.api.jobXML10; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> End </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface End<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: End ElementName: xsd:string ElementType : on
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>on</code> attribute
    * @param on the value for the attribute <code>on</code> 
    * @return the current instance of <code>End<T></code> 
    */
   public End<T> on(String on);

   /**
    * Returns the <code>on</code> attribute
    * @return the value defined for the attribute <code>on</code> 
    */
   public String getOn();

   /**
    * Removes the <code>on</code> attribute 
    * @return the current instance of <code>End<T></code> 
    */
   public End<T> removeOn();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: End ElementName: xsd:string ElementType : exit-status
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>exit-status</code> attribute
    * @param exitStatus the value for the attribute <code>exit-status</code> 
    * @return the current instance of <code>End<T></code> 
    */
   public End<T> exitStatus(String exitStatus);

   /**
    * Returns the <code>exit-status</code> attribute
    * @return the value defined for the attribute <code>exit-status</code> 
    */
   public String getExitStatus();

   /**
    * Removes the <code>exit-status</code> attribute 
    * @return the current instance of <code>End<T></code> 
    */
   public End<T> removeExitStatus();
}
