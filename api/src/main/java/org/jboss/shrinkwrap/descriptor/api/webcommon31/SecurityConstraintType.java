package org.jboss.shrinkwrap.descriptor.api.webcommon31; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> security-constraintType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface SecurityConstraintType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SecurityConstraintType ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>SecurityConstraintType<T></code> 
    */
   public SecurityConstraintType<T> displayName(String ... values);

   /**
    * Returns all <code>display-name</code> elements
    * @return list of <code>display-name</code> 
    */
   public List<String> getAllDisplayName();

   /**
    * Removes the <code>display-name</code> element 
    * @return the current instance of <code>SecurityConstraintType<T></code> 
    */
   public SecurityConstraintType<T> removeAllDisplayName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SecurityConstraintType ElementName: javaee:web-resource-collectionType ElementType : web-resource-collection
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>web-resource-collection</code> element will be created and returned.
    * Otherwise, the first existing <code>web-resource-collection</code> element will be returned.
    * @return the instance defined for the element <code>web-resource-collection</code> 
    */
   public WebResourceCollectionType<SecurityConstraintType<T>> getOrCreateWebResourceCollection();

   /**
    * Creates a new <code>web-resource-collection</code> element 
    * @return the new created instance of <code>WebResourceCollectionType<SecurityConstraintType<T>></code> 
    */
   public WebResourceCollectionType<SecurityConstraintType<T>> createWebResourceCollection();

   /**
    * Returns all <code>web-resource-collection</code> elements
    * @return list of <code>web-resource-collection</code> 
    */
   public List<WebResourceCollectionType<SecurityConstraintType<T>>> getAllWebResourceCollection();

   /**
    * Removes all <code>web-resource-collection</code> elements 
    * @return the current instance of <code>WebResourceCollectionType<SecurityConstraintType<T>></code> 
    */
   public SecurityConstraintType<T> removeAllWebResourceCollection();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SecurityConstraintType ElementName: javaee:auth-constraintType ElementType : auth-constraint
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>auth-constraint</code> element with the given value will be created.
    * Otherwise, the existing <code>auth-constraint</code> element will be returned.
    * @return  a new or existing instance of <code>AuthConstraintType<SecurityConstraintType<T>></code> 
    */
   public AuthConstraintType<SecurityConstraintType<T>> getOrCreateAuthConstraint();

   /**
    * Removes the <code>auth-constraint</code> element 
    * @return the current instance of <code>SecurityConstraintType<T></code> 
    */
   public SecurityConstraintType<T> removeAuthConstraint();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SecurityConstraintType ElementName: javaee:user-data-constraintType ElementType : user-data-constraint
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>user-data-constraint</code> element with the given value will be created.
    * Otherwise, the existing <code>user-data-constraint</code> element will be returned.
    * @return  a new or existing instance of <code>UserDataConstraintType<SecurityConstraintType<T>></code> 
    */
   public UserDataConstraintType<SecurityConstraintType<T>> getOrCreateUserDataConstraint();

   /**
    * Removes the <code>user-data-constraint</code> element 
    * @return the current instance of <code>SecurityConstraintType<T></code> 
    */
   public SecurityConstraintType<T> removeUserDataConstraint();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SecurityConstraintType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>SecurityConstraintType<T></code> 
    */
   public SecurityConstraintType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>SecurityConstraintType<T></code> 
    */
   public SecurityConstraintType<T> removeId();
}
