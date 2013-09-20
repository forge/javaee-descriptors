package org.jboss.shrinkwrap.descriptor.api.portletapp20; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> user-attributeType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface UserAttributeType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: UserAttributeType ElementName: string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>UserAttributeType<T></code> 
    */
   public UserAttributeType<T> description(String ... values);

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>UserAttributeType<T></code> 
    */
   public UserAttributeType<T> removeAllDescription();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: UserAttributeType ElementName: string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> element
    * @param name the value for the element <code>name</code> 
    * @return the current instance of <code>UserAttributeType<T></code> 
    */
   public UserAttributeType<T> name(String name);

   /**
    * Returns the <code>name</code> element
    * @return the node defined for the element <code>name</code> 
    */
   public String getName();

   /**
    * Removes the <code>name</code> element 
    * @return the current instance of <code>UserAttributeType<T></code> 
    */
   public UserAttributeType<T> removeName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: UserAttributeType ElementName: string ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>UserAttributeType<T></code> 
    */
   public UserAttributeType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>UserAttributeType<T></code> 
    */
   public UserAttributeType<T> removeId();
}
