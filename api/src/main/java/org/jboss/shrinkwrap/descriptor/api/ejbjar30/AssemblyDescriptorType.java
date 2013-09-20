package org.jboss.shrinkwrap.descriptor.api.ejbjar30; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee5.MessageDestinationType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.SecurityRoleType;
/**
 * This interface defines the contract for the <code> assembly-descriptorType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface AssemblyDescriptorType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: AssemblyDescriptorType ElementName: javaee:security-roleType ElementType : security-role
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>security-role</code> element will be created and returned.
    * Otherwise, the first existing <code>security-role</code> element will be returned.
    * @return the instance defined for the element <code>security-role</code> 
    */
   public SecurityRoleType<AssemblyDescriptorType<T>> getOrCreateSecurityRole();

   /**
    * Creates a new <code>security-role</code> element 
    * @return the new created instance of <code>SecurityRoleType<AssemblyDescriptorType<T>></code> 
    */
   public SecurityRoleType<AssemblyDescriptorType<T>> createSecurityRole();

   /**
    * Returns all <code>security-role</code> elements
    * @return list of <code>security-role</code> 
    */
   public List<SecurityRoleType<AssemblyDescriptorType<T>>> getAllSecurityRole();

   /**
    * Removes all <code>security-role</code> elements 
    * @return the current instance of <code>SecurityRoleType<AssemblyDescriptorType<T>></code> 
    */
   public AssemblyDescriptorType<T> removeAllSecurityRole();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: AssemblyDescriptorType ElementName: javaee:method-permissionType ElementType : method-permission
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>method-permission</code> element will be created and returned.
    * Otherwise, the first existing <code>method-permission</code> element will be returned.
    * @return the instance defined for the element <code>method-permission</code> 
    */
   public MethodPermissionType<AssemblyDescriptorType<T>> getOrCreateMethodPermission();

   /**
    * Creates a new <code>method-permission</code> element 
    * @return the new created instance of <code>MethodPermissionType<AssemblyDescriptorType<T>></code> 
    */
   public MethodPermissionType<AssemblyDescriptorType<T>> createMethodPermission();

   /**
    * Returns all <code>method-permission</code> elements
    * @return list of <code>method-permission</code> 
    */
   public List<MethodPermissionType<AssemblyDescriptorType<T>>> getAllMethodPermission();

   /**
    * Removes all <code>method-permission</code> elements 
    * @return the current instance of <code>MethodPermissionType<AssemblyDescriptorType<T>></code> 
    */
   public AssemblyDescriptorType<T> removeAllMethodPermission();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: AssemblyDescriptorType ElementName: javaee:container-transactionType ElementType : container-transaction
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>container-transaction</code> element will be created and returned.
    * Otherwise, the first existing <code>container-transaction</code> element will be returned.
    * @return the instance defined for the element <code>container-transaction</code> 
    */
   public ContainerTransactionType<AssemblyDescriptorType<T>> getOrCreateContainerTransaction();

   /**
    * Creates a new <code>container-transaction</code> element 
    * @return the new created instance of <code>ContainerTransactionType<AssemblyDescriptorType<T>></code> 
    */
   public ContainerTransactionType<AssemblyDescriptorType<T>> createContainerTransaction();

   /**
    * Returns all <code>container-transaction</code> elements
    * @return list of <code>container-transaction</code> 
    */
   public List<ContainerTransactionType<AssemblyDescriptorType<T>>> getAllContainerTransaction();

   /**
    * Removes all <code>container-transaction</code> elements 
    * @return the current instance of <code>ContainerTransactionType<AssemblyDescriptorType<T>></code> 
    */
   public AssemblyDescriptorType<T> removeAllContainerTransaction();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: AssemblyDescriptorType ElementName: javaee:interceptor-bindingType ElementType : interceptor-binding
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>interceptor-binding</code> element will be created and returned.
    * Otherwise, the first existing <code>interceptor-binding</code> element will be returned.
    * @return the instance defined for the element <code>interceptor-binding</code> 
    */
   public InterceptorBindingType<AssemblyDescriptorType<T>> getOrCreateInterceptorBinding();

   /**
    * Creates a new <code>interceptor-binding</code> element 
    * @return the new created instance of <code>InterceptorBindingType<AssemblyDescriptorType<T>></code> 
    */
   public InterceptorBindingType<AssemblyDescriptorType<T>> createInterceptorBinding();

   /**
    * Returns all <code>interceptor-binding</code> elements
    * @return list of <code>interceptor-binding</code> 
    */
   public List<InterceptorBindingType<AssemblyDescriptorType<T>>> getAllInterceptorBinding();

   /**
    * Removes all <code>interceptor-binding</code> elements 
    * @return the current instance of <code>InterceptorBindingType<AssemblyDescriptorType<T>></code> 
    */
   public AssemblyDescriptorType<T> removeAllInterceptorBinding();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: AssemblyDescriptorType ElementName: javaee:message-destinationType ElementType : message-destination
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>message-destination</code> element will be created and returned.
    * Otherwise, the first existing <code>message-destination</code> element will be returned.
    * @return the instance defined for the element <code>message-destination</code> 
    */
   public MessageDestinationType<AssemblyDescriptorType<T>> getOrCreateMessageDestination();

   /**
    * Creates a new <code>message-destination</code> element 
    * @return the new created instance of <code>MessageDestinationType<AssemblyDescriptorType<T>></code> 
    */
   public MessageDestinationType<AssemblyDescriptorType<T>> createMessageDestination();

   /**
    * Returns all <code>message-destination</code> elements
    * @return list of <code>message-destination</code> 
    */
   public List<MessageDestinationType<AssemblyDescriptorType<T>>> getAllMessageDestination();

   /**
    * Removes all <code>message-destination</code> elements 
    * @return the current instance of <code>MessageDestinationType<AssemblyDescriptorType<T>></code> 
    */
   public AssemblyDescriptorType<T> removeAllMessageDestination();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: AssemblyDescriptorType ElementName: javaee:exclude-listType ElementType : exclude-list
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>exclude-list</code> element with the given value will be created.
    * Otherwise, the existing <code>exclude-list</code> element will be returned.
    * @return  a new or existing instance of <code>ExcludeListType<AssemblyDescriptorType<T>></code> 
    */
   public ExcludeListType<AssemblyDescriptorType<T>> getOrCreateExcludeList();

   /**
    * Removes the <code>exclude-list</code> element 
    * @return the current instance of <code>AssemblyDescriptorType<T></code> 
    */
   public AssemblyDescriptorType<T> removeExcludeList();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: AssemblyDescriptorType ElementName: javaee:application-exceptionType ElementType : application-exception
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>application-exception</code> element will be created and returned.
    * Otherwise, the first existing <code>application-exception</code> element will be returned.
    * @return the instance defined for the element <code>application-exception</code> 
    */
   public ApplicationExceptionType<AssemblyDescriptorType<T>> getOrCreateApplicationException();

   /**
    * Creates a new <code>application-exception</code> element 
    * @return the new created instance of <code>ApplicationExceptionType<AssemblyDescriptorType<T>></code> 
    */
   public ApplicationExceptionType<AssemblyDescriptorType<T>> createApplicationException();

   /**
    * Returns all <code>application-exception</code> elements
    * @return list of <code>application-exception</code> 
    */
   public List<ApplicationExceptionType<AssemblyDescriptorType<T>>> getAllApplicationException();

   /**
    * Removes all <code>application-exception</code> elements 
    * @return the current instance of <code>ApplicationExceptionType<AssemblyDescriptorType<T>></code> 
    */
   public AssemblyDescriptorType<T> removeAllApplicationException();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: AssemblyDescriptorType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>AssemblyDescriptorType<T></code> 
    */
   public AssemblyDescriptorType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>AssemblyDescriptorType<T></code> 
    */
   public AssemblyDescriptorType<T> removeId();
}
