package org.jboss.shrinkwrap.descriptor.api.ejbjar31; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.ActivationConfigPropertyType;
/**
 * This interface defines the contract for the <code> activation-configType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface ActivationConfigType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ActivationConfigType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>ActivationConfigType<T></code> 
    */
   public ActivationConfigType<T> description(String ... values);

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>ActivationConfigType<T></code> 
    */
   public ActivationConfigType<T> removeAllDescription();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ActivationConfigType ElementName: javaee:activation-config-propertyType ElementType : activation-config-property
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>activation-config-property</code> element will be created and returned.
    * Otherwise, the first existing <code>activation-config-property</code> element will be returned.
    * @return the instance defined for the element <code>activation-config-property</code> 
    */
   public ActivationConfigPropertyType<ActivationConfigType<T>> getOrCreateActivationConfigProperty();

   /**
    * Creates a new <code>activation-config-property</code> element 
    * @return the new created instance of <code>ActivationConfigPropertyType<ActivationConfigType<T>></code> 
    */
   public ActivationConfigPropertyType<ActivationConfigType<T>> createActivationConfigProperty();

   /**
    * Returns all <code>activation-config-property</code> elements
    * @return list of <code>activation-config-property</code> 
    */
   public List<ActivationConfigPropertyType<ActivationConfigType<T>>> getAllActivationConfigProperty();

   /**
    * Removes all <code>activation-config-property</code> elements 
    * @return the current instance of <code>ActivationConfigPropertyType<ActivationConfigType<T>></code> 
    */
   public ActivationConfigType<T> removeAllActivationConfigProperty();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ActivationConfigType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>ActivationConfigType<T></code> 
    */
   public ActivationConfigType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>ActivationConfigType<T></code> 
    */
   public ActivationConfigType<T> removeId();
}
