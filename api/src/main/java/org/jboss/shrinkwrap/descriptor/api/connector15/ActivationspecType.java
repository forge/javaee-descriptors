package org.jboss.shrinkwrap.descriptor.api.connector15; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.connector15.RequiredConfigPropertyType;
/**
 * This interface defines the contract for the <code> activationspecType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface ActivationspecType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ActivationspecType ElementName: xsd:token ElementType : activationspec-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>activationspec-class</code> element
    * @param activationspecClass the value for the element <code>activationspec-class</code> 
    * @return the current instance of <code>ActivationspecType<T></code> 
    */
   public ActivationspecType<T> activationspecClass(String activationspecClass);

   /**
    * Returns the <code>activationspec-class</code> element
    * @return the node defined for the element <code>activationspec-class</code> 
    */
   public String getActivationspecClass();

   /**
    * Removes the <code>activationspec-class</code> element 
    * @return the current instance of <code>ActivationspecType<T></code> 
    */
   public ActivationspecType<T> removeActivationspecClass();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ActivationspecType ElementName: j2ee:required-config-propertyType ElementType : required-config-property
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>required-config-property</code> element will be created and returned.
    * Otherwise, the first existing <code>required-config-property</code> element will be returned.
    * @return the instance defined for the element <code>required-config-property</code> 
    */
   public RequiredConfigPropertyType<ActivationspecType<T>> getOrCreateRequiredConfigProperty();

   /**
    * Creates a new <code>required-config-property</code> element 
    * @return the new created instance of <code>RequiredConfigPropertyType<ActivationspecType<T>></code> 
    */
   public RequiredConfigPropertyType<ActivationspecType<T>> createRequiredConfigProperty();

   /**
    * Returns all <code>required-config-property</code> elements
    * @return list of <code>required-config-property</code> 
    */
   public List<RequiredConfigPropertyType<ActivationspecType<T>>> getAllRequiredConfigProperty();

   /**
    * Removes all <code>required-config-property</code> elements 
    * @return the current instance of <code>RequiredConfigPropertyType<ActivationspecType<T>></code> 
    */
   public ActivationspecType<T> removeAllRequiredConfigProperty();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ActivationspecType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>ActivationspecType<T></code> 
    */
   public ActivationspecType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>ActivationspecType<T></code> 
    */
   public ActivationspecType<T> removeId();
}
