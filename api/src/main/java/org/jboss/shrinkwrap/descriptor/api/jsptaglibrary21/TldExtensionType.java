package org.jboss.shrinkwrap.descriptor.api.jsptaglibrary21; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.jsptaglibrary21.ExtensibleType;
/**
 * This interface defines the contract for the <code> tld-extensionType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface TldExtensionType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TldExtensionType ElementName: javaee:extensibleType ElementType : extension-element
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>extension-element</code> element will be created and returned.
    * Otherwise, the first existing <code>extension-element</code> element will be returned.
    * @return the instance defined for the element <code>extension-element</code> 
    */
   public ExtensibleType<TldExtensionType<T>> getOrCreateExtensionElement();

   /**
    * Creates a new <code>extension-element</code> element 
    * @return the new created instance of <code>ExtensibleType<TldExtensionType<T>></code> 
    */
   public ExtensibleType<TldExtensionType<T>> createExtensionElement();

   /**
    * Returns all <code>extension-element</code> elements
    * @return list of <code>extension-element</code> 
    */
   public List<ExtensibleType<TldExtensionType<T>>> getAllExtensionElement();

   /**
    * Removes all <code>extension-element</code> elements 
    * @return the current instance of <code>ExtensibleType<TldExtensionType<T>></code> 
    */
   public TldExtensionType<T> removeAllExtensionElement();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TldExtensionType ElementName: xsd:anyURI ElementType : namespace
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>namespace</code> attribute
    * @param namespace the value for the attribute <code>namespace</code> 
    * @return the current instance of <code>TldExtensionType<T></code> 
    */
   public TldExtensionType<T> namespace(String namespace);

   /**
    * Returns the <code>namespace</code> attribute
    * @return the value defined for the attribute <code>namespace</code> 
    */
   public String getNamespace();

   /**
    * Removes the <code>namespace</code> attribute 
    * @return the current instance of <code>TldExtensionType<T></code> 
    */
   public TldExtensionType<T> removeNamespace();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TldExtensionType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>TldExtensionType<T></code> 
    */
   public TldExtensionType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>TldExtensionType<T></code> 
    */
   public TldExtensionType<T> removeId();
}
