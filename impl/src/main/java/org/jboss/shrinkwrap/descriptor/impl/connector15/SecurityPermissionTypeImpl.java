package org.jboss.shrinkwrap.descriptor.impl.connector15; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.connector15.SecurityPermissionType;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> security-permissionType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class SecurityPermissionTypeImpl<T> implements Child<T>, SecurityPermissionType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public SecurityPermissionTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public SecurityPermissionTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SecurityPermissionType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>SecurityPermissionType<T></code> 
    */
   public SecurityPermissionType<T> description(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("description").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
public List<String> getAllDescription()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("description");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>SecurityPermissionType<T></code> 
    */
   public SecurityPermissionType<T> removeAllDescription()
   {
      childNode.removeChildren("description");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SecurityPermissionType ElementName: xsd:string ElementType : security-permission-spec
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>security-permission-spec</code> element
    * @param securityPermissionSpec the value for the element <code>security-permission-spec</code> 
    * @return the current instance of <code>SecurityPermissionType<T></code> 
    */
   public SecurityPermissionType<T> securityPermissionSpec(String securityPermissionSpec)
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
    * @return the current instance of <code>SecurityPermissionType<T></code> 
    */
   public SecurityPermissionType<T> removeSecurityPermissionSpec()
   {
      childNode.removeChildren("security-permission-spec");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SecurityPermissionType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>SecurityPermissionType<T></code> 
    */
   public SecurityPermissionType<T> id(String id)
   {
      childNode.attribute("id", id);
      return this;
   }

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
      public String getId()
   {
      return childNode.getAttribute("id");
   }

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>SecurityPermissionType<T></code> 
    */
   public SecurityPermissionType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
