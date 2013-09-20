package org.jboss.shrinkwrap.descriptor.api.portletapp20; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.portletapp20.PortletCollectionType;
import org.jboss.shrinkwrap.descriptor.api.portletapp20.UserDataConstraintType;
/**
 * This interface defines the contract for the <code> security-constraintType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface SecurityConstraintType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SecurityConstraintType ElementName: string ElementType : display-name
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
   // ClassName: SecurityConstraintType ElementName: portlet:portlet-collectionType ElementType : portlet-collection
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>portlet-collection</code> element with the given value will be created.
    * Otherwise, the existing <code>portlet-collection</code> element will be returned.
    * @return  a new or existing instance of <code>PortletCollectionType<SecurityConstraintType<T>></code> 
    */
   public PortletCollectionType<SecurityConstraintType<T>> getOrCreatePortletCollection();

   /**
    * Removes the <code>portlet-collection</code> element 
    * @return the current instance of <code>SecurityConstraintType<T></code> 
    */
   public SecurityConstraintType<T> removePortletCollection();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SecurityConstraintType ElementName: portlet:user-data-constraintType ElementType : user-data-constraint
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
   // ClassName: SecurityConstraintType ElementName: string ElementType : id
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
