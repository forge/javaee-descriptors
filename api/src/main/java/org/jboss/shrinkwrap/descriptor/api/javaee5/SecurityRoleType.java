package org.jboss.shrinkwrap.descriptor.api.javaee5; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> security-roleType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface SecurityRoleType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SecurityRoleType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>SecurityRoleType<T></code> 
    */
   public SecurityRoleType<T> description(String ... values);

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>SecurityRoleType<T></code> 
    */
   public SecurityRoleType<T> removeAllDescription();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SecurityRoleType ElementName: xsd:token ElementType : role-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>role-name</code> element
    * @param roleName the value for the element <code>role-name</code> 
    * @return the current instance of <code>SecurityRoleType<T></code> 
    */
   public SecurityRoleType<T> roleName(String roleName);

   /**
    * Returns the <code>role-name</code> element
    * @return the node defined for the element <code>role-name</code> 
    */
   public String getRoleName();

   /**
    * Removes the <code>role-name</code> element 
    * @return the current instance of <code>SecurityRoleType<T></code> 
    */
   public SecurityRoleType<T> removeRoleName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SecurityRoleType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>SecurityRoleType<T></code> 
    */
   public SecurityRoleType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>SecurityRoleType<T></code> 
    */
   public SecurityRoleType<T> removeId();
}
