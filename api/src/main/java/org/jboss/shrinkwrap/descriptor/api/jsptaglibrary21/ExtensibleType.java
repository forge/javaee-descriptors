package org.jboss.shrinkwrap.descriptor.api.jsptaglibrary21; 

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> extensibleType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface ExtensibleType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ExtensibleType ElementName: javaee:extensibleType ElementType : extensibleType
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>extensibleType</code> element with the given value will be created.
    * Otherwise, the existing <code>extensibleType</code> element will be returned.
    * @return  a new or existing instance of <code>ExtensibleType<ExtensibleType<T>></code> 
    */
   public ExtensibleType<ExtensibleType<T>> getOrCreateExtensibleType();

   /**
    * Removes the <code>extensibleType</code> element 
    * @return the current instance of <code>ExtensibleType<T></code> 
    */
   public ExtensibleType<T> removeExtensibleType();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ExtensibleType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>ExtensibleType<T></code> 
    */
   public ExtensibleType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>ExtensibleType<T></code> 
    */
   public ExtensibleType<T> removeId();
}
