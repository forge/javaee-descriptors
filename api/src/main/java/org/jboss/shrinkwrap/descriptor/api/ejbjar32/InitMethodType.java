package org.jboss.shrinkwrap.descriptor.api.ejbjar32; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar32.NamedMethodType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar32.NamedMethodType;
/**
 * This interface defines the contract for the <code> init-methodType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface InitMethodType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: InitMethodType ElementName: javaee:named-methodType ElementType : create-method
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>create-method</code> element with the given value will be created.
    * Otherwise, the existing <code>create-method</code> element will be returned.
    * @return  a new or existing instance of <code>NamedMethodType<InitMethodType<T>></code> 
    */
   public NamedMethodType<InitMethodType<T>> getOrCreateCreateMethod();

   /**
    * Removes the <code>create-method</code> element 
    * @return the current instance of <code>InitMethodType<T></code> 
    */
   public InitMethodType<T> removeCreateMethod();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: InitMethodType ElementName: javaee:named-methodType ElementType : bean-method
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>bean-method</code> element with the given value will be created.
    * Otherwise, the existing <code>bean-method</code> element will be returned.
    * @return  a new or existing instance of <code>NamedMethodType<InitMethodType<T>></code> 
    */
   public NamedMethodType<InitMethodType<T>> getOrCreateBeanMethod();

   /**
    * Removes the <code>bean-method</code> element 
    * @return the current instance of <code>InitMethodType<T></code> 
    */
   public InitMethodType<T> removeBeanMethod();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: InitMethodType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>InitMethodType<T></code> 
    */
   public InitMethodType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>InitMethodType<T></code> 
    */
   public InitMethodType<T> removeId();
}
