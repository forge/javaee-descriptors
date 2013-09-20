package org.jboss.shrinkwrap.descriptor.api.webapp25; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> session-configType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface SessionConfigType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionConfigType ElementName: xsd:integer ElementType : session-timeout
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>session-timeout</code> element
    * @param sessionTimeout the value for the element <code>session-timeout</code> 
    * @return the current instance of <code>SessionConfigType<T></code> 
    */
   public SessionConfigType<T> sessionTimeout(Integer sessionTimeout);

   /**
    * Returns the <code>session-timeout</code> element
    * @return the node defined for the element <code>session-timeout</code> 
    */
   public Integer getSessionTimeout();

   /**
    * Removes the <code>session-timeout</code> element 
    * @return the current instance of <code>SessionConfigType<T></code> 
    */
   public SessionConfigType<T> removeSessionTimeout();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SessionConfigType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>SessionConfigType<T></code> 
    */
   public SessionConfigType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>SessionConfigType<T></code> 
    */
   public SessionConfigType<T> removeId();
}
