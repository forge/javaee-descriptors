package org.jboss.shrinkwrap.descriptor.api.ejbjar32; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee7.RunAsType;
/**
 * This interface defines the contract for the <code> security-identityType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface SecurityIdentityType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SecurityIdentityType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>SecurityIdentityType<T></code> 
    */
   public SecurityIdentityType<T> description(String ... values);

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>SecurityIdentityType<T></code> 
    */
   public SecurityIdentityType<T> removeAllDescription();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SecurityIdentityType ElementName: javaee:emptyType ElementType : use-caller-identity
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>use-caller-identity</code> element 
    * @return the current instance of <code>SecurityIdentityType<T></code> 
    */
   public SecurityIdentityType<T> useCallerIdentity();

   /**
    * Removes the <code>use-caller-identity</code> element 
    * @return the current instance of <code>SecurityIdentityType<T></code> 
    */
   public Boolean isUseCallerIdentity();

   /**
    * Removes the <code>use-caller-identity</code> element 
    * @return the current instance of <code>SecurityIdentityType<T></code> 
    */
   public SecurityIdentityType<T> removeUseCallerIdentity();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SecurityIdentityType ElementName: javaee:run-asType ElementType : run-as
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>run-as</code> element with the given value will be created.
    * Otherwise, the existing <code>run-as</code> element will be returned.
    * @return  a new or existing instance of <code>RunAsType<SecurityIdentityType<T>></code> 
    */
   public RunAsType<SecurityIdentityType<T>> getOrCreateRunAs();

   /**
    * Removes the <code>run-as</code> element 
    * @return the current instance of <code>SecurityIdentityType<T></code> 
    */
   public SecurityIdentityType<T> removeRunAs();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SecurityIdentityType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>SecurityIdentityType<T></code> 
    */
   public SecurityIdentityType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>SecurityIdentityType<T></code> 
    */
   public SecurityIdentityType<T> removeId();
}
