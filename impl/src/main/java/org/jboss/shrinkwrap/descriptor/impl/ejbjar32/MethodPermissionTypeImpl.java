package org.jboss.shrinkwrap.descriptor.impl.ejbjar32; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar32.MethodPermissionType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar32.MethodType;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> method-permissionType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class MethodPermissionTypeImpl<T> implements Child<T>, MethodPermissionType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public MethodPermissionTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public MethodPermissionTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MethodPermissionType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>MethodPermissionType<T></code> 
    */
   public MethodPermissionType<T> description(String ... values)
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
    * @return the current instance of <code>MethodPermissionType<T></code> 
    */
   public MethodPermissionType<T> removeAllDescription()
   {
      childNode.removeChildren("description");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MethodPermissionType ElementName: xsd:token ElementType : role-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>role-name</code> elements, 
    * a new <code>role-name</code> element 
    * @param values list of <code>role-name</code> objects 
    * @return the current instance of <code>MethodPermissionType<T></code> 
    */
   public MethodPermissionType<T> roleName(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("role-name").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>role-name</code> elements
    * @return list of <code>role-name</code> 
    */
public List<String> getAllRoleName()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("role-name");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>role-name</code> element 
    * @return the current instance of <code>MethodPermissionType<T></code> 
    */
   public MethodPermissionType<T> removeAllRoleName()
   {
      childNode.removeChildren("role-name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MethodPermissionType ElementName: javaee:emptyType ElementType : unchecked
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>unchecked</code> element 
    * @return the current instance of <code>MethodPermissionType<T></code> 
    */
   public MethodPermissionType<T> unchecked()
   {
      childNode.getOrCreate("unchecked");
      return this;
   }

   /**
    * Removes the <code>unchecked</code> element 
    * @return the current instance of <code>MethodPermissionType<T></code> 
    */
   public Boolean isUnchecked()
   {
      return childNode.getSingle("unchecked") != null;
   }

   /**
    * Removes the <code>unchecked</code> element 
    * @return the current instance of <code>MethodPermissionType<T></code> 
    */
   public MethodPermissionType<T> removeUnchecked()
   {
      childNode.removeChild("unchecked");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MethodPermissionType ElementName: javaee:methodType ElementType : method
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>method</code> element will be created and returned.
    * Otherwise, the first existing <code>method</code> element will be returned.
    * @return the instance defined for the element <code>method</code> 
    */
   public MethodType<MethodPermissionType<T>> getOrCreateMethod()
   {
      List<Node> nodeList = childNode.get("method");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new MethodTypeImpl<MethodPermissionType<T>>(this, "method", childNode, nodeList.get(0));
      }
      return createMethod();
   }

   /**
    * Creates a new <code>method</code> element 
    * @return the new created instance of <code>MethodType<MethodPermissionType<T>></code> 
    */
   public MethodType<MethodPermissionType<T>> createMethod()
   {
      return new MethodTypeImpl<MethodPermissionType<T>>(this, "method", childNode);
   }

   /**
    * Returns all <code>method</code> elements
    * @return list of <code>method</code> 
    */
   public List<MethodType<MethodPermissionType<T>>> getAllMethod()
   {
      List<MethodType<MethodPermissionType<T>>> list = new ArrayList<MethodType<MethodPermissionType<T>>>();
      List<Node> nodeList = childNode.get("method");
      for(Node node: nodeList)
      {
         MethodType<MethodPermissionType<T>>  type = new MethodTypeImpl<MethodPermissionType<T>>(this, "method", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>method</code> elements 
    * @return the current instance of <code>MethodType<MethodPermissionType<T>></code> 
    */
   public MethodPermissionType<T> removeAllMethod()
   {
      childNode.removeChildren("method");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MethodPermissionType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>MethodPermissionType<T></code> 
    */
   public MethodPermissionType<T> id(String id)
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
    * @return the current instance of <code>MethodPermissionType<T></code> 
    */
   public MethodPermissionType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
