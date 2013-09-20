package org.jboss.shrinkwrap.descriptor.api.jsptaglibrary21; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> tld-deferred-valueType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface TldDeferredValueType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TldDeferredValueType ElementName: xsd:token ElementType : type
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>type</code> element
    * @param type the value for the element <code>type</code> 
    * @return the current instance of <code>TldDeferredValueType<T></code> 
    */
   public TldDeferredValueType<T> type(String type);

   /**
    * Returns the <code>type</code> element
    * @return the node defined for the element <code>type</code> 
    */
   public String getType();

   /**
    * Removes the <code>type</code> element 
    * @return the current instance of <code>TldDeferredValueType<T></code> 
    */
   public TldDeferredValueType<T> removeType();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TldDeferredValueType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>TldDeferredValueType<T></code> 
    */
   public TldDeferredValueType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>TldDeferredValueType<T></code> 
    */
   public TldDeferredValueType<T> removeId();
}
