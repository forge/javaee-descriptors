package org.jboss.shrinkwrap.descriptor.api.facespartialresponse20; 

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> partial-response-updateType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface PartialResponseUpdateType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PartialResponseUpdateType ElementName: text ElementType : partial-response-updateType
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the body text for the element <code>partial-response-updateType</code> 
    * @param partialResponseUpdateType the value for the body text <code>partial-response-updateType</code> 
    * @return the current instance of <code>PartialResponseUpdateType<T></code> 
    */
   public PartialResponseUpdateType<T> text(String value);

   /**
    * Returns the body text of the element <code>partial-response-updateType</code> 
    * @return the value defined for the text <code>partial-response-updateType</code> 
    */
   public String getText();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PartialResponseUpdateType ElementName: xsd:string ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>PartialResponseUpdateType<T></code> 
    */
   public PartialResponseUpdateType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>PartialResponseUpdateType<T></code> 
    */
   public PartialResponseUpdateType<T> removeId();
}
