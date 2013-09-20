package org.jboss.shrinkwrap.descriptor.impl.connector10; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.connector10.SecurityPermission;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;

/**
 * This class implements the <code> security-permission </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class SecurityPermissionImpl<T> implements Child<T>, SecurityPermission<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public SecurityPermissionImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public SecurityPermissionImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SecurityPermission ElementName: xsd:string ElementType : security-permission-spec
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>security-permission-spec</code> element
    * @param securityPermissionSpec the value for the element <code>security-permission-spec</code> 
    * @return the current instance of <code>SecurityPermission<T></code> 
    */
   public SecurityPermission<T> securityPermissionSpec(String securityPermissionSpec)
   {
      childNode.getOrCreate("security-permission-spec").text(securityPermissionSpec);
      return this;
   }

   /**
    * Returns the <code>security-permission-spec</code> element
    * @return the node defined for the element <code>security-permission-spec</code> 
    */
   public String getSecurityPermissionSpec()
   {
      return childNode.getTextValueForPatternName("security-permission-spec");
   }

   /**
    * Removes the <code>security-permission-spec</code> element 
    * @return the current instance of <code>SecurityPermission<T></code> 
    */
   public SecurityPermission<T> removeSecurityPermissionSpec()
   {
      childNode.removeChildren("security-permission-spec");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SecurityPermission ElementName: xsd:string ElementType : description
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>description</code> element
    * @param description the value for the element <code>description</code> 
    * @return the current instance of <code>SecurityPermission<T></code> 
    */
   public SecurityPermission<T> description(String description)
   {
      childNode.getOrCreate("description").text(description);
      return this;
   }

   /**
    * Returns the <code>description</code> element
    * @return the node defined for the element <code>description</code> 
    */
   public String getDescription()
   {
      return childNode.getTextValueForPatternName("description");
   }

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>SecurityPermission<T></code> 
    */
   public SecurityPermission<T> removeDescription()
   {
      childNode.removeChildren("description");
      return this;
   }
}
