package org.jboss.shrinkwrap.descriptor.api.ejbjar30; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> method-permissionType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface MethodPermissionType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MethodPermissionType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>MethodPermissionType<T></code> 
    */
   public MethodPermissionType<T> description(String ... values);

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>MethodPermissionType<T></code> 
    */
   public MethodPermissionType<T> removeAllDescription();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MethodPermissionType ElementName: xsd:token ElementType : role-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>role-name</code> elements, 
    * a new <code>role-name</code> element 
    * @param values list of <code>role-name</code> objects 
    * @return the current instance of <code>MethodPermissionType<T></code> 
    */
   public MethodPermissionType<T> roleName(String ... values);

   /**
    * Returns all <code>role-name</code> elements
    * @return list of <code>role-name</code> 
    */
   public List<String> getAllRoleName();

   /**
    * Removes the <code>role-name</code> element 
    * @return the current instance of <code>MethodPermissionType<T></code> 
    */
   public MethodPermissionType<T> removeAllRoleName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MethodPermissionType ElementName: javaee:emptyType ElementType : unchecked
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>unchecked</code> element 
    * @return the current instance of <code>MethodPermissionType<T></code> 
    */
   public MethodPermissionType<T> unchecked();

   /**
    * Removes the <code>unchecked</code> element 
    * @return the current instance of <code>MethodPermissionType<T></code> 
    */
   public Boolean isUnchecked();

   /**
    * Removes the <code>unchecked</code> element 
    * @return the current instance of <code>MethodPermissionType<T></code> 
    */
   public MethodPermissionType<T> removeUnchecked();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MethodPermissionType ElementName: javaee:methodType ElementType : method
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>method</code> element will be created and returned.
    * Otherwise, the first existing <code>method</code> element will be returned.
    * @return the instance defined for the element <code>method</code> 
    */
   public MethodType<MethodPermissionType<T>> getOrCreateMethod();

   /**
    * Creates a new <code>method</code> element 
    * @return the new created instance of <code>MethodType<MethodPermissionType<T>></code> 
    */
   public MethodType<MethodPermissionType<T>> createMethod();

   /**
    * Returns all <code>method</code> elements
    * @return list of <code>method</code> 
    */
   public List<MethodType<MethodPermissionType<T>>> getAllMethod();

   /**
    * Removes all <code>method</code> elements 
    * @return the current instance of <code>MethodType<MethodPermissionType<T>></code> 
    */
   public MethodPermissionType<T> removeAllMethod();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MethodPermissionType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>MethodPermissionType<T></code> 
    */
   public MethodPermissionType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>MethodPermissionType<T></code> 
    */
   public MethodPermissionType<T> removeId();
}
