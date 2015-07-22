package org.jboss.shrinkwrap.descriptor.api.webcommon30;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.webcommon.AuthConstraintCommonType;

/**
 * This interface defines the contract for the <code> auth-constraintType </code> xsd type
 * 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface AuthConstraintType<T> extends Child<T>, AuthConstraintCommonType<AuthConstraintType<T>>
{

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: AuthConstraintType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded isGeneric: true isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, a new <code>description</code>
    * element
    * 
    * @param values list of <code>description</code> objects
    * @return the current instance of <code>AuthConstraintType<T></code>
    */
   @Override
   public AuthConstraintType<T> description(String... values);

   /**
    * Returns all <code>description</code> elements
    * 
    * @return list of <code>description</code>
    */
   @Override
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element
    * 
    * @return the current instance of <code>AuthConstraintType<T></code>
    */
   @Override
   public AuthConstraintType<T> removeAllDescription();

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: AuthConstraintType ElementName: xsd:token ElementType : role-name
   // MaxOccurs: -unbounded isGeneric: true isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>role-name</code> elements, a new <code>role-name</code> element
    * 
    * @param values list of <code>role-name</code> objects
    * @return the current instance of <code>AuthConstraintType<T></code>
    */
   @Override
   public AuthConstraintType<T> roleName(String... values);

   /**
    * Returns all <code>role-name</code> elements
    * 
    * @return list of <code>role-name</code>
    */
   @Override
   public List<String> getAllRoleName();

   /**
    * Removes the <code>role-name</code> element
    * 
    * @return the current instance of <code>AuthConstraintType<T></code>
    */
   @Override
   public AuthConstraintType<T> removeAllRoleName();

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: AuthConstraintType ElementName: xsd:ID ElementType : id
   // MaxOccurs: - isGeneric: true isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * 
    * @param id the value for the attribute <code>id</code>
    * @return the current instance of <code>AuthConstraintType<T></code>
    */
   @Override
   public AuthConstraintType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * 
    * @return the value defined for the attribute <code>id</code>
    */
   @Override
   public String getId();

   /**
    * Removes the <code>id</code> attribute
    * 
    * @return the current instance of <code>AuthConstraintType<T></code>
    */
   @Override
   public AuthConstraintType<T> removeId();
}
