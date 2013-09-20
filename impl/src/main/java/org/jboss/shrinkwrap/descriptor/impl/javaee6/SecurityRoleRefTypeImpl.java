package org.jboss.shrinkwrap.descriptor.impl.javaee6; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.SecurityRoleRefType;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> security-role-refType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class SecurityRoleRefTypeImpl<T> implements Child<T>, SecurityRoleRefType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public SecurityRoleRefTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public SecurityRoleRefTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SecurityRoleRefType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>SecurityRoleRefType<T></code> 
    */
   public SecurityRoleRefType<T> description(String ... values)
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
    * @return the current instance of <code>SecurityRoleRefType<T></code> 
    */
   public SecurityRoleRefType<T> removeAllDescription()
   {
      childNode.removeChildren("description");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SecurityRoleRefType ElementName: xsd:token ElementType : role-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>role-name</code> element
    * @param roleName the value for the element <code>role-name</code> 
    * @return the current instance of <code>SecurityRoleRefType<T></code> 
    */
   public SecurityRoleRefType<T> roleName(String roleName)
   {
      childNode.getOrCreate("role-name").text(roleName);
      return this;
   }

   /**
    * Returns the <code>role-name</code> element
    * @return the node defined for the element <code>role-name</code> 
    */
   public String getRoleName()
   {
      return childNode.getTextValueForPatternName("role-name");
   }

   /**
    * Removes the <code>role-name</code> element 
    * @return the current instance of <code>SecurityRoleRefType<T></code> 
    */
   public SecurityRoleRefType<T> removeRoleName()
   {
      childNode.removeChildren("role-name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SecurityRoleRefType ElementName: xsd:token ElementType : role-link
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>role-link</code> element
    * @param roleLink the value for the element <code>role-link</code> 
    * @return the current instance of <code>SecurityRoleRefType<T></code> 
    */
   public SecurityRoleRefType<T> roleLink(String roleLink)
   {
      childNode.getOrCreate("role-link").text(roleLink);
      return this;
   }

   /**
    * Returns the <code>role-link</code> element
    * @return the node defined for the element <code>role-link</code> 
    */
   public String getRoleLink()
   {
      return childNode.getTextValueForPatternName("role-link");
   }

   /**
    * Removes the <code>role-link</code> element 
    * @return the current instance of <code>SecurityRoleRefType<T></code> 
    */
   public SecurityRoleRefType<T> removeRoleLink()
   {
      childNode.removeChildren("role-link");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SecurityRoleRefType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>SecurityRoleRefType<T></code> 
    */
   public SecurityRoleRefType<T> id(String id)
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
    * @return the current instance of <code>SecurityRoleRefType<T></code> 
    */
   public SecurityRoleRefType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
