package org.jboss.shrinkwrap.descriptor.impl.ejbjar30; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.ActivationConfigPropertyType;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> activation-config-propertyType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class ActivationConfigPropertyTypeImpl<T> implements Child<T>, ActivationConfigPropertyType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public ActivationConfigPropertyTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public ActivationConfigPropertyTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ActivationConfigPropertyType ElementName: xsd:string ElementType : activation-config-property-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>activation-config-property-name</code> element
    * @param activationConfigPropertyName the value for the element <code>activation-config-property-name</code> 
    * @return the current instance of <code>ActivationConfigPropertyType<T></code> 
    */
   public ActivationConfigPropertyType<T> activationConfigPropertyName(String activationConfigPropertyName)
   {
      childNode.getOrCreate("activation-config-property-name").text(activationConfigPropertyName);
      return this;
   }

   /**
    * Returns the <code>activation-config-property-name</code> element
    * @return the node defined for the element <code>activation-config-property-name</code> 
    */
   public String getActivationConfigPropertyName()
   {
      return childNode.getTextValueForPatternName("activation-config-property-name");
   }

   /**
    * Removes the <code>activation-config-property-name</code> element 
    * @return the current instance of <code>ActivationConfigPropertyType<T></code> 
    */
   public ActivationConfigPropertyType<T> removeActivationConfigPropertyName()
   {
      childNode.removeChildren("activation-config-property-name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ActivationConfigPropertyType ElementName: xsd:string ElementType : activation-config-property-value
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>activation-config-property-value</code> element
    * @param activationConfigPropertyValue the value for the element <code>activation-config-property-value</code> 
    * @return the current instance of <code>ActivationConfigPropertyType<T></code> 
    */
   public ActivationConfigPropertyType<T> activationConfigPropertyValue(String activationConfigPropertyValue)
   {
      childNode.getOrCreate("activation-config-property-value").text(activationConfigPropertyValue);
      return this;
   }

   /**
    * Returns the <code>activation-config-property-value</code> element
    * @return the node defined for the element <code>activation-config-property-value</code> 
    */
   public String getActivationConfigPropertyValue()
   {
      return childNode.getTextValueForPatternName("activation-config-property-value");
   }

   /**
    * Removes the <code>activation-config-property-value</code> element 
    * @return the current instance of <code>ActivationConfigPropertyType<T></code> 
    */
   public ActivationConfigPropertyType<T> removeActivationConfigPropertyValue()
   {
      childNode.removeChildren("activation-config-property-value");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ActivationConfigPropertyType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>ActivationConfigPropertyType<T></code> 
    */
   public ActivationConfigPropertyType<T> id(String id)
   {
      childNode.attribute("id", id);
      return this;
   }

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
      public String getId()
   {
      return childNode.getAttribute("id");
   }

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>ActivationConfigPropertyType<T></code> 
    */
   public ActivationConfigPropertyType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
