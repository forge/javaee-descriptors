package org.jboss.shrinkwrap.descriptor.api.webapp25;

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.webcommon.UserDataConstraintCommonType;

/**
 * This interface defines the contract for the <code> user-data-constraintType </code> xsd type
 * 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface UserDataConstraintType<T> extends Child<T>, UserDataConstraintCommonType<UserDataConstraintType<T>>
{

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: UserDataConstraintType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded isGeneric: true isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, a new <code>description</code>
    * element
    * 
    * @param values list of <code>description</code> objects
    * @return the current instance of <code>UserDataConstraintType<T></code>
    */
   @Override
   public UserDataConstraintType<T> description(String... values);

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
    * @return the current instance of <code>UserDataConstraintType<T></code>
    */
   @Override
   public UserDataConstraintType<T> removeAllDescription();

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: UserDataConstraintType ElementName: javaee:transport-guaranteeType ElementType : transport-guarantee
   // MaxOccurs: - isGeneric: true isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>transport-guarantee</code> element
    * 
    * @param transportGuarantee the value for the element <code>transport-guarantee</code>
    * @return the current instance of <code>UserDataConstraintType<T></code>
    */
   public UserDataConstraintType<T> transportGuarantee(TransportGuaranteeType transportGuarantee);

   /**
    * Sets the <code>transport-guarantee</code> element
    * 
    * @param transportGuarantee the value for the element <code>transport-guarantee</code>
    * @return the current instance of <code>UserDataConstraintType<T></code>
    */
   @Override
   public UserDataConstraintType<T> transportGuarantee(String transportGuarantee);

   /**
    * Returns the <code>transport-guarantee</code> element
    * 
    * @return the value found for the element <code>transport-guarantee</code>
    */
   public TransportGuaranteeType getTransportGuarantee();

   /**
    * Returns the <code>transport-guarantee</code> element
    * 
    * @return the value found for the element <code>transport-guarantee</code>
    */
   @Override
   public String getTransportGuaranteeAsString();

   /**
    * Removes the <code>transport-guarantee</code> attribute
    * 
    * @return the current instance of <code>UserDataConstraintType<T></code>
    */
   @Override
   public UserDataConstraintType<T> removeTransportGuarantee();

   // --------------------------------------------------------------------------------------------------------||
   // ClassName: UserDataConstraintType ElementName: xsd:ID ElementType : id
   // MaxOccurs: - isGeneric: true isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * 
    * @param id the value for the attribute <code>id</code>
    * @return the current instance of <code>UserDataConstraintType<T></code>
    */
   @Override
   public UserDataConstraintType<T> id(String id);

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
    * @return the current instance of <code>UserDataConstraintType<T></code>
    */
   @Override
   public UserDataConstraintType<T> removeId();
}
