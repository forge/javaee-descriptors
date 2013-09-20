package org.jboss.shrinkwrap.descriptor.api.connector15; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.connector15.MessageadapterType;
/**
 * This interface defines the contract for the <code> inbound-resourceadapterType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface InboundResourceadapterType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: InboundResourceadapterType ElementName: j2ee:messageadapterType ElementType : messageadapter
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>messageadapter</code> element with the given value will be created.
    * Otherwise, the existing <code>messageadapter</code> element will be returned.
    * @return  a new or existing instance of <code>MessageadapterType<InboundResourceadapterType<T>></code> 
    */
   public MessageadapterType<InboundResourceadapterType<T>> getOrCreateMessageadapter();

   /**
    * Removes the <code>messageadapter</code> element 
    * @return the current instance of <code>InboundResourceadapterType<T></code> 
    */
   public InboundResourceadapterType<T> removeMessageadapter();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: InboundResourceadapterType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>InboundResourceadapterType<T></code> 
    */
   public InboundResourceadapterType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>InboundResourceadapterType<T></code> 
    */
   public InboundResourceadapterType<T> removeId();
}
