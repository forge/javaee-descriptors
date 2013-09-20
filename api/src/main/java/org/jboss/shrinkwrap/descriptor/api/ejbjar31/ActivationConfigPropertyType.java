package org.jboss.shrinkwrap.descriptor.api.ejbjar31; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> activation-config-propertyType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface ActivationConfigPropertyType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ActivationConfigPropertyType ElementName: xsd:string ElementType : activation-config-property-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>activation-config-property-name</code> element
    * @param activationConfigPropertyName the value for the element <code>activation-config-property-name</code> 
    * @return the current instance of <code>ActivationConfigPropertyType<T></code> 
    */
   public ActivationConfigPropertyType<T> activationConfigPropertyName(String activationConfigPropertyName);

   /**
    * Returns the <code>activation-config-property-name</code> element
    * @return the node defined for the element <code>activation-config-property-name</code> 
    */
   public String getActivationConfigPropertyName();

   /**
    * Removes the <code>activation-config-property-name</code> element 
    * @return the current instance of <code>ActivationConfigPropertyType<T></code> 
    */
   public ActivationConfigPropertyType<T> removeActivationConfigPropertyName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ActivationConfigPropertyType ElementName: xsd:string ElementType : activation-config-property-value
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>activation-config-property-value</code> element
    * @param activationConfigPropertyValue the value for the element <code>activation-config-property-value</code> 
    * @return the current instance of <code>ActivationConfigPropertyType<T></code> 
    */
   public ActivationConfigPropertyType<T> activationConfigPropertyValue(String activationConfigPropertyValue);

   /**
    * Returns the <code>activation-config-property-value</code> element
    * @return the node defined for the element <code>activation-config-property-value</code> 
    */
   public String getActivationConfigPropertyValue();

   /**
    * Removes the <code>activation-config-property-value</code> element 
    * @return the current instance of <code>ActivationConfigPropertyType<T></code> 
    */
   public ActivationConfigPropertyType<T> removeActivationConfigPropertyValue();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ActivationConfigPropertyType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>ActivationConfigPropertyType<T></code> 
    */
   public ActivationConfigPropertyType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>ActivationConfigPropertyType<T></code> 
    */
   public ActivationConfigPropertyType<T> removeId();
}
