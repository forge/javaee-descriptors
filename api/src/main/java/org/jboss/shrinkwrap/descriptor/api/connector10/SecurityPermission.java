package org.jboss.shrinkwrap.descriptor.api.connector10; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> security-permission </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface SecurityPermission<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SecurityPermission ElementName: xsd:string ElementType : security-permission-spec
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>security-permission-spec</code> element
    * @param securityPermissionSpec the value for the element <code>security-permission-spec</code> 
    * @return the current instance of <code>SecurityPermission<T></code> 
    */
   public SecurityPermission<T> securityPermissionSpec(String securityPermissionSpec);

   /**
    * Returns the <code>security-permission-spec</code> element
    * @return the node defined for the element <code>security-permission-spec</code> 
    */
   public String getSecurityPermissionSpec();

   /**
    * Removes the <code>security-permission-spec</code> element 
    * @return the current instance of <code>SecurityPermission<T></code> 
    */
   public SecurityPermission<T> removeSecurityPermissionSpec();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SecurityPermission ElementName: xsd:string ElementType : description
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>description</code> element
    * @param description the value for the element <code>description</code> 
    * @return the current instance of <code>SecurityPermission<T></code> 
    */
   public SecurityPermission<T> description(String description);

   /**
    * Returns the <code>description</code> element
    * @return the node defined for the element <code>description</code> 
    */
   public String getDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>SecurityPermission<T></code> 
    */
   public SecurityPermission<T> removeDescription();
}
