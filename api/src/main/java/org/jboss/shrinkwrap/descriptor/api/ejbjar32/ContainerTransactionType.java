package org.jboss.shrinkwrap.descriptor.api.ejbjar32; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar32.MethodType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar32.TransAttributeType;
/**
 * This interface defines the contract for the <code> container-transactionType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface ContainerTransactionType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ContainerTransactionType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>ContainerTransactionType<T></code> 
    */
   public ContainerTransactionType<T> description(String ... values);

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>ContainerTransactionType<T></code> 
    */
   public ContainerTransactionType<T> removeAllDescription();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ContainerTransactionType ElementName: javaee:methodType ElementType : method
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>method</code> element will be created and returned.
    * Otherwise, the first existing <code>method</code> element will be returned.
    * @return the instance defined for the element <code>method</code> 
    */
   public MethodType<ContainerTransactionType<T>> getOrCreateMethod();

   /**
    * Creates a new <code>method</code> element 
    * @return the new created instance of <code>MethodType<ContainerTransactionType<T>></code> 
    */
   public MethodType<ContainerTransactionType<T>> createMethod();

   /**
    * Returns all <code>method</code> elements
    * @return list of <code>method</code> 
    */
   public List<MethodType<ContainerTransactionType<T>>> getAllMethod();

   /**
    * Removes all <code>method</code> elements 
    * @return the current instance of <code>MethodType<ContainerTransactionType<T>></code> 
    */
   public ContainerTransactionType<T> removeAllMethod();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ContainerTransactionType ElementName: javaee:trans-attributeType ElementType : trans-attribute
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>trans-attribute</code> element
    * @param transAttribute the value for the element <code>trans-attribute</code> 
    * @return the current instance of <code>ContainerTransactionType<T></code> 
    */
   public ContainerTransactionType<T> transAttribute(TransAttributeType transAttribute);
   /**
    * Sets the <code>trans-attribute</code> element
    * @param transAttribute the value for the element <code>trans-attribute</code> 
    * @return the current instance of <code>ContainerTransactionType<T></code> 
    */
   public ContainerTransactionType<T> transAttribute(String transAttribute);

   /**
    * Returns the <code>trans-attribute</code> element
    * @return the value found for the element <code>trans-attribute</code> 
    */
   public TransAttributeType getTransAttribute();

   /**
    * Returns the <code>trans-attribute</code> element
    * @return the value found for the element <code>trans-attribute</code> 
    */
   public String  getTransAttributeAsString();

   /**
    * Removes the <code>trans-attribute</code> attribute 
    * @return the current instance of <code>ContainerTransactionType<T></code> 
    */
   public ContainerTransactionType<T> removeTransAttribute();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ContainerTransactionType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>ContainerTransactionType<T></code> 
    */
   public ContainerTransactionType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>ContainerTransactionType<T></code> 
    */
   public ContainerTransactionType<T> removeId();
}
