package org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient13; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient13.AddressingResponsesType;
/**
 * This interface defines the contract for the <code> addressingType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface AddressingType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: AddressingType ElementName: javaee:xsdBooleanType ElementType : enabled
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>enabled</code> element
    * @param enabled the value for the element <code>enabled</code> 
    * @return the current instance of <code>AddressingType<T></code> 
    */
   public AddressingType<T> enabled(Boolean enabled);

   /**
    * Returns the <code>enabled</code> element
    * @return the node defined for the element <code>enabled</code> 
    */
   public Boolean isEnabled();

   /**
    * Removes the <code>enabled</code> element 
    * @return the current instance of <code>AddressingType<T></code> 
    */
   public AddressingType<T> removeEnabled();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: AddressingType ElementName: javaee:xsdBooleanType ElementType : required
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>required</code> element
    * @param required the value for the element <code>required</code> 
    * @return the current instance of <code>AddressingType<T></code> 
    */
   public AddressingType<T> required(Boolean required);

   /**
    * Returns the <code>required</code> element
    * @return the node defined for the element <code>required</code> 
    */
   public Boolean isRequired();

   /**
    * Removes the <code>required</code> element 
    * @return the current instance of <code>AddressingType<T></code> 
    */
   public AddressingType<T> removeRequired();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: AddressingType ElementName: javaee:addressing-responsesType ElementType : responses
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>responses</code> element
    * @param responses the value for the element <code>responses</code> 
    * @return the current instance of <code>AddressingType<T></code> 
    */
   public AddressingType<T> responses(AddressingResponsesType responses);
   /**
    * Sets the <code>responses</code> element
    * @param responses the value for the element <code>responses</code> 
    * @return the current instance of <code>AddressingType<T></code> 
    */
   public AddressingType<T> responses(String responses);

   /**
    * Returns the <code>responses</code> element
    * @return the value found for the element <code>responses</code> 
    */
   public AddressingResponsesType getResponses();

   /**
    * Returns the <code>responses</code> element
    * @return the value found for the element <code>responses</code> 
    */
   public String  getResponsesAsString();

   /**
    * Removes the <code>responses</code> attribute 
    * @return the current instance of <code>AddressingType<T></code> 
    */
   public AddressingType<T> removeResponses();
}
