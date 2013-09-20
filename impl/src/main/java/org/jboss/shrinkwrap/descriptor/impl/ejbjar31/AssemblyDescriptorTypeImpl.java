package org.jboss.shrinkwrap.descriptor.impl.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.AssemblyDescriptorType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.javaee6.SecurityRoleType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.SecurityRoleTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.MethodPermissionType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar31.MethodPermissionTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.ContainerTransactionType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar31.ContainerTransactionTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.InterceptorBindingType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar31.InterceptorBindingTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee6.MessageDestinationType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.MessageDestinationTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.ExcludeListType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar31.ExcludeListTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.ApplicationExceptionType;
import org.jboss.shrinkwrap.descriptor.impl.ejbjar31.ApplicationExceptionTypeImpl;

/**
 * This class implements the <code> assembly-descriptorType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class AssemblyDescriptorTypeImpl<T> implements Child<T>, AssemblyDescriptorType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public AssemblyDescriptorTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public AssemblyDescriptorTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: AssemblyDescriptorType ElementName: javaee:security-roleType ElementType : security-role
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>security-role</code> element will be created and returned.
    * Otherwise, the first existing <code>security-role</code> element will be returned.
    * @return the instance defined for the element <code>security-role</code> 
    */
   public SecurityRoleType<AssemblyDescriptorType<T>> getOrCreateSecurityRole()
   {
      List<Node> nodeList = childNode.get("security-role");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new SecurityRoleTypeImpl<AssemblyDescriptorType<T>>(this, "security-role", childNode, nodeList.get(0));
      }
      return createSecurityRole();
   }

   /**
    * Creates a new <code>security-role</code> element 
    * @return the new created instance of <code>SecurityRoleType<AssemblyDescriptorType<T>></code> 
    */
   public SecurityRoleType<AssemblyDescriptorType<T>> createSecurityRole()
   {
      return new SecurityRoleTypeImpl<AssemblyDescriptorType<T>>(this, "security-role", childNode);
   }

   /**
    * Returns all <code>security-role</code> elements
    * @return list of <code>security-role</code> 
    */
   public List<SecurityRoleType<AssemblyDescriptorType<T>>> getAllSecurityRole()
   {
      List<SecurityRoleType<AssemblyDescriptorType<T>>> list = new ArrayList<SecurityRoleType<AssemblyDescriptorType<T>>>();
      List<Node> nodeList = childNode.get("security-role");
      for(Node node: nodeList)
      {
         SecurityRoleType<AssemblyDescriptorType<T>>  type = new SecurityRoleTypeImpl<AssemblyDescriptorType<T>>(this, "security-role", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>security-role</code> elements 
    * @return the current instance of <code>SecurityRoleType<AssemblyDescriptorType<T>></code> 
    */
   public AssemblyDescriptorType<T> removeAllSecurityRole()
   {
      childNode.removeChildren("security-role");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: AssemblyDescriptorType ElementName: javaee:method-permissionType ElementType : method-permission
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>method-permission</code> element will be created and returned.
    * Otherwise, the first existing <code>method-permission</code> element will be returned.
    * @return the instance defined for the element <code>method-permission</code> 
    */
   public MethodPermissionType<AssemblyDescriptorType<T>> getOrCreateMethodPermission()
   {
      List<Node> nodeList = childNode.get("method-permission");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new MethodPermissionTypeImpl<AssemblyDescriptorType<T>>(this, "method-permission", childNode, nodeList.get(0));
      }
      return createMethodPermission();
   }

   /**
    * Creates a new <code>method-permission</code> element 
    * @return the new created instance of <code>MethodPermissionType<AssemblyDescriptorType<T>></code> 
    */
   public MethodPermissionType<AssemblyDescriptorType<T>> createMethodPermission()
   {
      return new MethodPermissionTypeImpl<AssemblyDescriptorType<T>>(this, "method-permission", childNode);
   }

   /**
    * Returns all <code>method-permission</code> elements
    * @return list of <code>method-permission</code> 
    */
   public List<MethodPermissionType<AssemblyDescriptorType<T>>> getAllMethodPermission()
   {
      List<MethodPermissionType<AssemblyDescriptorType<T>>> list = new ArrayList<MethodPermissionType<AssemblyDescriptorType<T>>>();
      List<Node> nodeList = childNode.get("method-permission");
      for(Node node: nodeList)
      {
         MethodPermissionType<AssemblyDescriptorType<T>>  type = new MethodPermissionTypeImpl<AssemblyDescriptorType<T>>(this, "method-permission", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>method-permission</code> elements 
    * @return the current instance of <code>MethodPermissionType<AssemblyDescriptorType<T>></code> 
    */
   public AssemblyDescriptorType<T> removeAllMethodPermission()
   {
      childNode.removeChildren("method-permission");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: AssemblyDescriptorType ElementName: javaee:container-transactionType ElementType : container-transaction
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>container-transaction</code> element will be created and returned.
    * Otherwise, the first existing <code>container-transaction</code> element will be returned.
    * @return the instance defined for the element <code>container-transaction</code> 
    */
   public ContainerTransactionType<AssemblyDescriptorType<T>> getOrCreateContainerTransaction()
   {
      List<Node> nodeList = childNode.get("container-transaction");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ContainerTransactionTypeImpl<AssemblyDescriptorType<T>>(this, "container-transaction", childNode, nodeList.get(0));
      }
      return createContainerTransaction();
   }

   /**
    * Creates a new <code>container-transaction</code> element 
    * @return the new created instance of <code>ContainerTransactionType<AssemblyDescriptorType<T>></code> 
    */
   public ContainerTransactionType<AssemblyDescriptorType<T>> createContainerTransaction()
   {
      return new ContainerTransactionTypeImpl<AssemblyDescriptorType<T>>(this, "container-transaction", childNode);
   }

   /**
    * Returns all <code>container-transaction</code> elements
    * @return list of <code>container-transaction</code> 
    */
   public List<ContainerTransactionType<AssemblyDescriptorType<T>>> getAllContainerTransaction()
   {
      List<ContainerTransactionType<AssemblyDescriptorType<T>>> list = new ArrayList<ContainerTransactionType<AssemblyDescriptorType<T>>>();
      List<Node> nodeList = childNode.get("container-transaction");
      for(Node node: nodeList)
      {
         ContainerTransactionType<AssemblyDescriptorType<T>>  type = new ContainerTransactionTypeImpl<AssemblyDescriptorType<T>>(this, "container-transaction", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>container-transaction</code> elements 
    * @return the current instance of <code>ContainerTransactionType<AssemblyDescriptorType<T>></code> 
    */
   public AssemblyDescriptorType<T> removeAllContainerTransaction()
   {
      childNode.removeChildren("container-transaction");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: AssemblyDescriptorType ElementName: javaee:interceptor-bindingType ElementType : interceptor-binding
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>interceptor-binding</code> element will be created and returned.
    * Otherwise, the first existing <code>interceptor-binding</code> element will be returned.
    * @return the instance defined for the element <code>interceptor-binding</code> 
    */
   public InterceptorBindingType<AssemblyDescriptorType<T>> getOrCreateInterceptorBinding()
   {
      List<Node> nodeList = childNode.get("interceptor-binding");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new InterceptorBindingTypeImpl<AssemblyDescriptorType<T>>(this, "interceptor-binding", childNode, nodeList.get(0));
      }
      return createInterceptorBinding();
   }

   /**
    * Creates a new <code>interceptor-binding</code> element 
    * @return the new created instance of <code>InterceptorBindingType<AssemblyDescriptorType<T>></code> 
    */
   public InterceptorBindingType<AssemblyDescriptorType<T>> createInterceptorBinding()
   {
      return new InterceptorBindingTypeImpl<AssemblyDescriptorType<T>>(this, "interceptor-binding", childNode);
   }

   /**
    * Returns all <code>interceptor-binding</code> elements
    * @return list of <code>interceptor-binding</code> 
    */
   public List<InterceptorBindingType<AssemblyDescriptorType<T>>> getAllInterceptorBinding()
   {
      List<InterceptorBindingType<AssemblyDescriptorType<T>>> list = new ArrayList<InterceptorBindingType<AssemblyDescriptorType<T>>>();
      List<Node> nodeList = childNode.get("interceptor-binding");
      for(Node node: nodeList)
      {
         InterceptorBindingType<AssemblyDescriptorType<T>>  type = new InterceptorBindingTypeImpl<AssemblyDescriptorType<T>>(this, "interceptor-binding", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>interceptor-binding</code> elements 
    * @return the current instance of <code>InterceptorBindingType<AssemblyDescriptorType<T>></code> 
    */
   public AssemblyDescriptorType<T> removeAllInterceptorBinding()
   {
      childNode.removeChildren("interceptor-binding");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: AssemblyDescriptorType ElementName: javaee:message-destinationType ElementType : message-destination
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>message-destination</code> element will be created and returned.
    * Otherwise, the first existing <code>message-destination</code> element will be returned.
    * @return the instance defined for the element <code>message-destination</code> 
    */
   public MessageDestinationType<AssemblyDescriptorType<T>> getOrCreateMessageDestination()
   {
      List<Node> nodeList = childNode.get("message-destination");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new MessageDestinationTypeImpl<AssemblyDescriptorType<T>>(this, "message-destination", childNode, nodeList.get(0));
      }
      return createMessageDestination();
   }

   /**
    * Creates a new <code>message-destination</code> element 
    * @return the new created instance of <code>MessageDestinationType<AssemblyDescriptorType<T>></code> 
    */
   public MessageDestinationType<AssemblyDescriptorType<T>> createMessageDestination()
   {
      return new MessageDestinationTypeImpl<AssemblyDescriptorType<T>>(this, "message-destination", childNode);
   }

   /**
    * Returns all <code>message-destination</code> elements
    * @return list of <code>message-destination</code> 
    */
   public List<MessageDestinationType<AssemblyDescriptorType<T>>> getAllMessageDestination()
   {
      List<MessageDestinationType<AssemblyDescriptorType<T>>> list = new ArrayList<MessageDestinationType<AssemblyDescriptorType<T>>>();
      List<Node> nodeList = childNode.get("message-destination");
      for(Node node: nodeList)
      {
         MessageDestinationType<AssemblyDescriptorType<T>>  type = new MessageDestinationTypeImpl<AssemblyDescriptorType<T>>(this, "message-destination", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>message-destination</code> elements 
    * @return the current instance of <code>MessageDestinationType<AssemblyDescriptorType<T>></code> 
    */
   public AssemblyDescriptorType<T> removeAllMessageDestination()
   {
      childNode.removeChildren("message-destination");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: AssemblyDescriptorType ElementName: javaee:exclude-listType ElementType : exclude-list
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>exclude-list</code> element with the given value will be created.
    * Otherwise, the existing <code>exclude-list</code> element will be returned.
    * @return  a new or existing instance of <code>ExcludeListType<AssemblyDescriptorType<T>></code> 
    */
   public ExcludeListType<AssemblyDescriptorType<T>> getOrCreateExcludeList()
   {
      Node node = childNode.getOrCreate("exclude-list");
      ExcludeListType<AssemblyDescriptorType<T>> excludeList = new ExcludeListTypeImpl<AssemblyDescriptorType<T>>(this, "exclude-list", childNode, node);
      return excludeList;
   }

   /**
    * Removes the <code>exclude-list</code> element 
    * @return the current instance of <code>AssemblyDescriptorType<T></code> 
    */
   public AssemblyDescriptorType<T> removeExcludeList()
   {
      childNode.removeChildren("exclude-list");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: AssemblyDescriptorType ElementName: javaee:application-exceptionType ElementType : application-exception
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>application-exception</code> element will be created and returned.
    * Otherwise, the first existing <code>application-exception</code> element will be returned.
    * @return the instance defined for the element <code>application-exception</code> 
    */
   public ApplicationExceptionType<AssemblyDescriptorType<T>> getOrCreateApplicationException()
   {
      List<Node> nodeList = childNode.get("application-exception");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new ApplicationExceptionTypeImpl<AssemblyDescriptorType<T>>(this, "application-exception", childNode, nodeList.get(0));
      }
      return createApplicationException();
   }

   /**
    * Creates a new <code>application-exception</code> element 
    * @return the new created instance of <code>ApplicationExceptionType<AssemblyDescriptorType<T>></code> 
    */
   public ApplicationExceptionType<AssemblyDescriptorType<T>> createApplicationException()
   {
      return new ApplicationExceptionTypeImpl<AssemblyDescriptorType<T>>(this, "application-exception", childNode);
   }

   /**
    * Returns all <code>application-exception</code> elements
    * @return list of <code>application-exception</code> 
    */
   public List<ApplicationExceptionType<AssemblyDescriptorType<T>>> getAllApplicationException()
   {
      List<ApplicationExceptionType<AssemblyDescriptorType<T>>> list = new ArrayList<ApplicationExceptionType<AssemblyDescriptorType<T>>>();
      List<Node> nodeList = childNode.get("application-exception");
      for(Node node: nodeList)
      {
         ApplicationExceptionType<AssemblyDescriptorType<T>>  type = new ApplicationExceptionTypeImpl<AssemblyDescriptorType<T>>(this, "application-exception", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>application-exception</code> elements 
    * @return the current instance of <code>ApplicationExceptionType<AssemblyDescriptorType<T>></code> 
    */
   public AssemblyDescriptorType<T> removeAllApplicationException()
   {
      childNode.removeChildren("application-exception");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: AssemblyDescriptorType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>AssemblyDescriptorType<T></code> 
    */
   public AssemblyDescriptorType<T> id(String id)
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
    * @return the current instance of <code>AssemblyDescriptorType<T></code> 
    */
   public AssemblyDescriptorType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
