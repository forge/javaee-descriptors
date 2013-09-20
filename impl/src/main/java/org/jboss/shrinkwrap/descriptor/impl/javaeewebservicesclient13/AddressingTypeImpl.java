package org.jboss.shrinkwrap.descriptor.impl.javaeewebservicesclient13; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient13.AddressingResponsesType;
import org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient13.AddressingType;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> addressingType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class AddressingTypeImpl<T> implements Child<T>, AddressingType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public AddressingTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public AddressingTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: AddressingType ElementName: javaee:xsdBooleanType ElementType : enabled
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>enabled</code> element
    * @param enabled the value for the element <code>enabled</code> 
    * @return the current instance of <code>AddressingType<T></code> 
    */
   public AddressingType<T> enabled(Boolean enabled)
   {
      childNode.getOrCreate("enabled").text(enabled);
      return this;
   }

   /**
    * Returns the <code>enabled</code> element
    * @return the node defined for the element <code>enabled</code> 
    */
   public Boolean isEnabled()
   {
      return Strings.isTrue(childNode.getTextValueForPatternName("enabled"));
   }

   /**
    * Removes the <code>enabled</code> element 
    * @return the current instance of <code>AddressingType<T></code> 
    */
   public AddressingType<T> removeEnabled()
   {
      childNode.removeChildren("enabled");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: AddressingType ElementName: javaee:xsdBooleanType ElementType : required
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>required</code> element
    * @param required the value for the element <code>required</code> 
    * @return the current instance of <code>AddressingType<T></code> 
    */
   public AddressingType<T> required(Boolean required)
   {
      childNode.getOrCreate("required").text(required);
      return this;
   }

   /**
    * Returns the <code>required</code> element
    * @return the node defined for the element <code>required</code> 
    */
   public Boolean isRequired()
   {
      return Strings.isTrue(childNode.getTextValueForPatternName("required"));
   }

   /**
    * Removes the <code>required</code> element 
    * @return the current instance of <code>AddressingType<T></code> 
    */
   public AddressingType<T> removeRequired()
   {
      childNode.removeChildren("required");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: AddressingType ElementName: javaee:addressing-responsesType ElementType : responses
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>responses</code> element
    * @param responses the value for the element <code>responses</code> 
    * @return the current instance of <code>AddressingType<T></code> 
    */
   public AddressingType<T> responses(AddressingResponsesType responses)
   {
      childNode.getOrCreate("responses").text(responses);
      return this;
   }
   /**
    * Sets the <code>responses</code> element
    * @param responses the value for the element <code>responses</code> 
    * @return the current instance of <code>AddressingType<T></code> 
    */
   public AddressingType<T> responses(String responses)
   {
      childNode.getOrCreate("responses").text(responses);
      return this;
   }

   /**
    * Returns the <code>responses</code> element
    * @return the value found for the element <code>responses</code> 
    */
   public AddressingResponsesType getResponses()
   {
      return AddressingResponsesType.getFromStringValue(childNode.getTextValueForPatternName("responses"));
   }

   /**
    * Returns the <code>responses</code> element
    * @return the value found for the element <code>responses</code> 
    */
   public String  getResponsesAsString()
   {
      return childNode.getTextValueForPatternName("responses");
   }

   /**
    * Removes the <code>responses</code> attribute 
    * @return the current instance of <code>AddressingType<T></code> 
    */
   public AddressingType<T> removeResponses()
   {
      childNode.removeAttribute("responses");
      return this;
   }
}
