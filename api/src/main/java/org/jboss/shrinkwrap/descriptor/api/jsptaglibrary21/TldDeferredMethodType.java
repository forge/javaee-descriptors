package org.jboss.shrinkwrap.descriptor.api.jsptaglibrary21; 

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> tld-deferred-methodType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface TldDeferredMethodType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TldDeferredMethodType ElementName: xsd:token ElementType : method-signature
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>method-signature</code> element
    * @param methodSignature the value for the element <code>method-signature</code> 
    * @return the current instance of <code>TldDeferredMethodType<T></code> 
    */
   public TldDeferredMethodType<T> methodSignature(String methodSignature);

   /**
    * Returns the <code>method-signature</code> element
    * @return the node defined for the element <code>method-signature</code> 
    */
   public String getMethodSignature();

   /**
    * Removes the <code>method-signature</code> element 
    * @return the current instance of <code>TldDeferredMethodType<T></code> 
    */
   public TldDeferredMethodType<T> removeMethodSignature();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TldDeferredMethodType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>TldDeferredMethodType<T></code> 
    */
   public TldDeferredMethodType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>TldDeferredMethodType<T></code> 
    */
   public TldDeferredMethodType<T> removeId();
}
