package org.jboss.shrinkwrap.descriptor.api.ejbjar32; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar32.NamedMethodType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar32.ConcurrentLockTypeType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar32.AccessTimeoutType;
/**
 * This interface defines the contract for the <code> concurrent-methodType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface ConcurrentMethodType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConcurrentMethodType ElementName: javaee:named-methodType ElementType : method
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>method</code> element with the given value will be created.
    * Otherwise, the existing <code>method</code> element will be returned.
    * @return  a new or existing instance of <code>NamedMethodType<ConcurrentMethodType<T>></code> 
    */
   public NamedMethodType<ConcurrentMethodType<T>> getOrCreateMethod();

   /**
    * Removes the <code>method</code> element 
    * @return the current instance of <code>ConcurrentMethodType<T></code> 
    */
   public ConcurrentMethodType<T> removeMethod();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConcurrentMethodType ElementName: javaee:concurrent-lock-typeType ElementType : lock
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>lock</code> element
    * @param lock the value for the element <code>lock</code> 
    * @return the current instance of <code>ConcurrentMethodType<T></code> 
    */
   public ConcurrentMethodType<T> lock(ConcurrentLockTypeType lock);
   /**
    * Sets the <code>lock</code> element
    * @param lock the value for the element <code>lock</code> 
    * @return the current instance of <code>ConcurrentMethodType<T></code> 
    */
   public ConcurrentMethodType<T> lock(String lock);

   /**
    * Returns the <code>lock</code> element
    * @return the value found for the element <code>lock</code> 
    */
   public ConcurrentLockTypeType getLock();

   /**
    * Returns the <code>lock</code> element
    * @return the value found for the element <code>lock</code> 
    */
   public String  getLockAsString();

   /**
    * Removes the <code>lock</code> attribute 
    * @return the current instance of <code>ConcurrentMethodType<T></code> 
    */
   public ConcurrentMethodType<T> removeLock();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConcurrentMethodType ElementName: javaee:access-timeoutType ElementType : access-timeout
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>access-timeout</code> element with the given value will be created.
    * Otherwise, the existing <code>access-timeout</code> element will be returned.
    * @return  a new or existing instance of <code>AccessTimeoutType<ConcurrentMethodType<T>></code> 
    */
   public AccessTimeoutType<ConcurrentMethodType<T>> getOrCreateAccessTimeout();

   /**
    * Removes the <code>access-timeout</code> element 
    * @return the current instance of <code>ConcurrentMethodType<T></code> 
    */
   public ConcurrentMethodType<T> removeAccessTimeout();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConcurrentMethodType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>ConcurrentMethodType<T></code> 
    */
   public ConcurrentMethodType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>ConcurrentMethodType<T></code> 
    */
   public ConcurrentMethodType<T> removeId();
}
