package org.jboss.shrinkwrap.descriptor.api.javaee5; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee.SecurityRoleRefCommonType;
/**
 * This interface defines the contract for the <code> security-role-refType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface SecurityRoleRefType<T> extends Child<T>, SecurityRoleRefCommonType<T, SecurityRoleRefType<T>>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SecurityRoleRefType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SecurityRoleRefType ElementName: xsd:token ElementType : role-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SecurityRoleRefType ElementName: xsd:token ElementType : role-link
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SecurityRoleRefType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   
}
