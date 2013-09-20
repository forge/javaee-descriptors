package org.jboss.shrinkwrap.descriptor.impl.ejbjar30; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.ejbjar30.SecurityIdentityType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.javaee5.EmptyType;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.EmptyTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee5.RunAsType;
import org.jboss.shrinkwrap.descriptor.impl.javaee5.RunAsTypeImpl;

/**
 * This class implements the <code> security-identityType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class SecurityIdentityTypeImpl<T> implements Child<T>, SecurityIdentityType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public SecurityIdentityTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public SecurityIdentityTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
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
   public SecurityIdentityType<T> description(String ... values)
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
    * @return the current instance of <code>SecurityIdentityType<T></code> 
    */
   public SecurityIdentityType<T> removeAllDescription()
   {
      childNode.removeChildren("description");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SecurityIdentityType ElementName: javaee:emptyType ElementType : use-caller-identity
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>use-caller-identity</code> element 
    * @return the current instance of <code>SecurityIdentityType<T></code> 
    */
   public SecurityIdentityType<T> useCallerIdentity()
   {
      childNode.getOrCreate("use-caller-identity");
      return this;
   }

   /**
    * Removes the <code>use-caller-identity</code> element 
    * @return the current instance of <code>SecurityIdentityType<T></code> 
    */
   public Boolean isUseCallerIdentity()
   {
      return childNode.getSingle("use-caller-identity") != null;
   }

   /**
    * Removes the <code>use-caller-identity</code> element 
    * @return the current instance of <code>SecurityIdentityType<T></code> 
    */
   public SecurityIdentityType<T> removeUseCallerIdentity()
   {
      childNode.removeChild("use-caller-identity");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SecurityIdentityType ElementName: javaee:run-asType ElementType : run-as
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>run-as</code> element with the given value will be created.
    * Otherwise, the existing <code>run-as</code> element will be returned.
    * @return  a new or existing instance of <code>RunAsType<SecurityIdentityType<T>></code> 
    */
   public RunAsType<SecurityIdentityType<T>> getOrCreateRunAs()
   {
      Node node = childNode.getOrCreate("run-as");
      RunAsType<SecurityIdentityType<T>> runAs = new RunAsTypeImpl<SecurityIdentityType<T>>(this, "run-as", childNode, node);
      return runAs;
   }

   /**
    * Removes the <code>run-as</code> element 
    * @return the current instance of <code>SecurityIdentityType<T></code> 
    */
   public SecurityIdentityType<T> removeRunAs()
   {
      childNode.removeChildren("run-as");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SecurityIdentityType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>SecurityIdentityType<T></code> 
    */
   public SecurityIdentityType<T> id(String id)
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
    * @return the current instance of <code>SecurityIdentityType<T></code> 
    */
   public SecurityIdentityType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
