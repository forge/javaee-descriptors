package org.jboss.shrinkwrap.descriptor.impl.permissions7; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.permissions7.Permission;
import org.jboss.shrinkwrap.descriptor.api.permissions7.Permissions;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> permissions </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class PermissionsImpl<T> implements Child<T>, Permissions<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public PermissionsImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public PermissionsImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Permissions ElementName: permissions:permission ElementType : permission
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>permission</code> element will be created and returned.
    * Otherwise, the first existing <code>permission</code> element will be returned.
    * @return the instance defined for the element <code>permission</code> 
    */
   public Permission<Permissions<T>> getOrCreatePermission()
   {
      List<Node> nodeList = childNode.get("permission");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new PermissionImpl<Permissions<T>>(this, "permission", childNode, nodeList.get(0));
      }
      return createPermission();
   }

   /**
    * Creates a new <code>permission</code> element 
    * @return the new created instance of <code>Permission<Permissions<T>></code> 
    */
   public Permission<Permissions<T>> createPermission()
   {
      return new PermissionImpl<Permissions<T>>(this, "permission", childNode);
   }

   /**
    * Returns all <code>permission</code> elements
    * @return list of <code>permission</code> 
    */
   public List<Permission<Permissions<T>>> getAllPermission()
   {
      List<Permission<Permissions<T>>> list = new ArrayList<Permission<Permissions<T>>>();
      List<Node> nodeList = childNode.get("permission");
      for(Node node: nodeList)
      {
         Permission<Permissions<T>>  type = new PermissionImpl<Permissions<T>>(this, "permission", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>permission</code> elements 
    * @return the current instance of <code>Permission<Permissions<T>></code> 
    */
   public Permissions<T> removeAllPermission()
   {
      childNode.removeChildren("permission");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Permissions ElementName: xsd:token ElementType : version
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of <code>Permissions<T></code> 
    */
   public Permissions<T> version(String version)
   {
      childNode.attribute("version", version);
      return this;
   }

   /**
    * Returns the <code>version</code> attribute
    * @return the value defined for the attribute <code>version</code> 
    */
      public String getVersion()
   {
      return childNode.getAttribute("version");
   }

   /**
    * Removes the <code>version</code> attribute 
    * @return the current instance of <code>Permissions<T></code> 
    */
   public Permissions<T> removeVersion()
   {
      childNode.removeAttribute("version");
      return this;
   }
}
