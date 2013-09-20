package org.jboss.shrinkwrap.descriptor.impl.webapp25; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.webapp25.AuthConstraintType;
import org.jboss.shrinkwrap.descriptor.api.webapp25.SecurityConstraintType;
import org.jboss.shrinkwrap.descriptor.api.webapp25.UserDataConstraintType;
import org.jboss.shrinkwrap.descriptor.api.webapp25.WebResourceCollectionType;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> security-constraintType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class SecurityConstraintTypeImpl<T> implements Child<T>, SecurityConstraintType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public SecurityConstraintTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public SecurityConstraintTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SecurityConstraintType ElementName: xsd:token ElementType : display-name
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>display-name</code> elements, 
    * a new <code>display-name</code> element 
    * @param values list of <code>display-name</code> objects 
    * @return the current instance of <code>SecurityConstraintType<T></code> 
    */
   public SecurityConstraintType<T> displayName(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("display-name").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>display-name</code> elements
    * @return list of <code>display-name</code> 
    */
public List<String> getAllDisplayName()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("display-name");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>display-name</code> element 
    * @return the current instance of <code>SecurityConstraintType<T></code> 
    */
   public SecurityConstraintType<T> removeAllDisplayName()
   {
      childNode.removeChildren("display-name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SecurityConstraintType ElementName: javaee:web-resource-collectionType ElementType : web-resource-collection
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>web-resource-collection</code> element will be created and returned.
    * Otherwise, the first existing <code>web-resource-collection</code> element will be returned.
    * @return the instance defined for the element <code>web-resource-collection</code> 
    */
   public WebResourceCollectionType<SecurityConstraintType<T>> getOrCreateWebResourceCollection()
   {
      List<Node> nodeList = childNode.get("web-resource-collection");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new WebResourceCollectionTypeImpl<SecurityConstraintType<T>>(this, "web-resource-collection", childNode, nodeList.get(0));
      }
      return createWebResourceCollection();
   }

   /**
    * Creates a new <code>web-resource-collection</code> element 
    * @return the new created instance of <code>WebResourceCollectionType<SecurityConstraintType<T>></code> 
    */
   public WebResourceCollectionType<SecurityConstraintType<T>> createWebResourceCollection()
   {
      return new WebResourceCollectionTypeImpl<SecurityConstraintType<T>>(this, "web-resource-collection", childNode);
   }

   /**
    * Returns all <code>web-resource-collection</code> elements
    * @return list of <code>web-resource-collection</code> 
    */
   public List<WebResourceCollectionType<SecurityConstraintType<T>>> getAllWebResourceCollection()
   {
      List<WebResourceCollectionType<SecurityConstraintType<T>>> list = new ArrayList<WebResourceCollectionType<SecurityConstraintType<T>>>();
      List<Node> nodeList = childNode.get("web-resource-collection");
      for(Node node: nodeList)
      {
         WebResourceCollectionType<SecurityConstraintType<T>>  type = new WebResourceCollectionTypeImpl<SecurityConstraintType<T>>(this, "web-resource-collection", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>web-resource-collection</code> elements 
    * @return the current instance of <code>WebResourceCollectionType<SecurityConstraintType<T>></code> 
    */
   public SecurityConstraintType<T> removeAllWebResourceCollection()
   {
      childNode.removeChildren("web-resource-collection");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SecurityConstraintType ElementName: javaee:auth-constraintType ElementType : auth-constraint
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>auth-constraint</code> element with the given value will be created.
    * Otherwise, the existing <code>auth-constraint</code> element will be returned.
    * @return  a new or existing instance of <code>AuthConstraintType<SecurityConstraintType<T>></code> 
    */
   public AuthConstraintType<SecurityConstraintType<T>> getOrCreateAuthConstraint()
   {
      Node node = childNode.getOrCreate("auth-constraint");
      AuthConstraintType<SecurityConstraintType<T>> authConstraint = new AuthConstraintTypeImpl<SecurityConstraintType<T>>(this, "auth-constraint", childNode, node);
      return authConstraint;
   }

   /**
    * Removes the <code>auth-constraint</code> element 
    * @return the current instance of <code>SecurityConstraintType<T></code> 
    */
   public SecurityConstraintType<T> removeAuthConstraint()
   {
      childNode.removeChildren("auth-constraint");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SecurityConstraintType ElementName: javaee:user-data-constraintType ElementType : user-data-constraint
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>user-data-constraint</code> element with the given value will be created.
    * Otherwise, the existing <code>user-data-constraint</code> element will be returned.
    * @return  a new or existing instance of <code>UserDataConstraintType<SecurityConstraintType<T>></code> 
    */
   public UserDataConstraintType<SecurityConstraintType<T>> getOrCreateUserDataConstraint()
   {
      Node node = childNode.getOrCreate("user-data-constraint");
      UserDataConstraintType<SecurityConstraintType<T>> userDataConstraint = new UserDataConstraintTypeImpl<SecurityConstraintType<T>>(this, "user-data-constraint", childNode, node);
      return userDataConstraint;
   }

   /**
    * Removes the <code>user-data-constraint</code> element 
    * @return the current instance of <code>SecurityConstraintType<T></code> 
    */
   public SecurityConstraintType<T> removeUserDataConstraint()
   {
      childNode.removeChildren("user-data-constraint");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SecurityConstraintType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>SecurityConstraintType<T></code> 
    */
   public SecurityConstraintType<T> id(String id)
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
    * @return the current instance of <code>SecurityConstraintType<T></code> 
    */
   public SecurityConstraintType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
