package org.jboss.shrinkwrap.descriptor.api.ejbjar32; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar32.NamedMethodType;
/**
 * This interface defines the contract for the <code> remove-methodType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface RemoveMethodType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: RemoveMethodType ElementName: javaee:named-methodType ElementType : bean-method
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>bean-method</code> element with the given value will be created.
    * Otherwise, the existing <code>bean-method</code> element will be returned.
    * @return  a new or existing instance of <code>NamedMethodType<RemoveMethodType<T>></code> 
    */
   public NamedMethodType<RemoveMethodType<T>> getOrCreateBeanMethod();

   /**
    * Removes the <code>bean-method</code> element 
    * @return the current instance of <code>RemoveMethodType<T></code> 
    */
   public RemoveMethodType<T> removeBeanMethod();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: RemoveMethodType ElementName: javaee:xsdBooleanType ElementType : retain-if-exception
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>retain-if-exception</code> element
    * @param retainIfException the value for the element <code>retain-if-exception</code> 
    * @return the current instance of <code>RemoveMethodType<T></code> 
    */
   public RemoveMethodType<T> retainIfException(Boolean retainIfException);

   /**
    * Returns the <code>retain-if-exception</code> element
    * @return the node defined for the element <code>retain-if-exception</code> 
    */
   public Boolean isRetainIfException();

   /**
    * Removes the <code>retain-if-exception</code> element 
    * @return the current instance of <code>RemoveMethodType<T></code> 
    */
   public RemoveMethodType<T> removeRetainIfException();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: RemoveMethodType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>RemoveMethodType<T></code> 
    */
   public RemoveMethodType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>RemoveMethodType<T></code> 
    */
   public RemoveMethodType<T> removeId();
}
