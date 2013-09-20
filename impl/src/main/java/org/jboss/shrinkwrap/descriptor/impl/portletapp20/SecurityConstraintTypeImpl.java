package org.jboss.shrinkwrap.descriptor.impl.portletapp20; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.portletapp20.SecurityConstraintType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.portletapp20.PortletCollectionType;
import org.jboss.shrinkwrap.descriptor.impl.portletapp20.PortletCollectionTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.portletapp20.UserDataConstraintType;
import org.jboss.shrinkwrap.descriptor.impl.portletapp20.UserDataConstraintTypeImpl;

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
   // ClassName: SecurityConstraintType ElementName: string ElementType : display-name
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
   // ClassName: SecurityConstraintType ElementName: portlet:portlet-collectionType ElementType : portlet-collection
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>portlet-collection</code> element with the given value will be created.
    * Otherwise, the existing <code>portlet-collection</code> element will be returned.
    * @return  a new or existing instance of <code>PortletCollectionType<SecurityConstraintType<T>></code> 
    */
   public PortletCollectionType<SecurityConstraintType<T>> getOrCreatePortletCollection()
   {
      Node node = childNode.getOrCreate("portlet-collection");
      PortletCollectionType<SecurityConstraintType<T>> portletCollection = new PortletCollectionTypeImpl<SecurityConstraintType<T>>(this, "portlet-collection", childNode, node);
      return portletCollection;
   }

   /**
    * Removes the <code>portlet-collection</code> element 
    * @return the current instance of <code>SecurityConstraintType<T></code> 
    */
   public SecurityConstraintType<T> removePortletCollection()
   {
      childNode.removeChildren("portlet-collection");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SecurityConstraintType ElementName: portlet:user-data-constraintType ElementType : user-data-constraint
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
   // ClassName: SecurityConstraintType ElementName: string ElementType : id
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
