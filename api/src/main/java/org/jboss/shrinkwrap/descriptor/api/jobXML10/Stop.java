package org.jboss.shrinkwrap.descriptor.api.jobXML10; 

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> Stop </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface Stop<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Stop ElementName: xsd:string ElementType : on
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>on</code> attribute
    * @param on the value for the attribute <code>on</code> 
    * @return the current instance of <code>Stop<T></code> 
    */
   public Stop<T> on(String on);

   /**
    * Returns the <code>on</code> attribute
    * @return the value defined for the attribute <code>on</code> 
    */
   public String getOn();

   /**
    * Removes the <code>on</code> attribute 
    * @return the current instance of <code>Stop<T></code> 
    */
   public Stop<T> removeOn();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Stop ElementName: xsd:string ElementType : exit-status
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>exit-status</code> attribute
    * @param exitStatus the value for the attribute <code>exit-status</code> 
    * @return the current instance of <code>Stop<T></code> 
    */
   public Stop<T> exitStatus(String exitStatus);

   /**
    * Returns the <code>exit-status</code> attribute
    * @return the value defined for the attribute <code>exit-status</code> 
    */
   public String getExitStatus();

   /**
    * Removes the <code>exit-status</code> attribute 
    * @return the current instance of <code>Stop<T></code> 
    */
   public Stop<T> removeExitStatus();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Stop ElementName: xsd:string ElementType : restart
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>restart</code> attribute
    * @param restart the value for the attribute <code>restart</code> 
    * @return the current instance of <code>Stop<T></code> 
    */
   public Stop<T> restart(String restart);

   /**
    * Returns the <code>restart</code> attribute
    * @return the value defined for the attribute <code>restart</code> 
    */
   public String getRestart();

   /**
    * Removes the <code>restart</code> attribute 
    * @return the current instance of <code>Stop<T></code> 
    */
   public Stop<T> removeRestart();
}
