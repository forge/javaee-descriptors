package org.jboss.shrinkwrap.descriptor.api.ejbjar32; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> enterprise-beansType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface EnterpriseBeansType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EnterpriseBeansType ElementName: javaee:session-beanType ElementType : session
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>session</code> element will be created and returned.
    * Otherwise, the first existing <code>session</code> element will be returned.
    * @return the instance defined for the element <code>session</code> 
    */
   public SessionBeanType<EnterpriseBeansType<T>> getOrCreateSession();

   /**
    * Creates a new <code>session</code> element 
    * @return the new created instance of <code>SessionBeanType<EnterpriseBeansType<T>></code> 
    */
   public SessionBeanType<EnterpriseBeansType<T>> createSession();

   /**
    * Returns all <code>session</code> elements
    * @return list of <code>session</code> 
    */
   public List<SessionBeanType<EnterpriseBeansType<T>>> getAllSession();

   /**
    * Removes all <code>session</code> elements 
    * @return the current instance of <code>SessionBeanType<EnterpriseBeansType<T>></code> 
    */
   public EnterpriseBeansType<T> removeAllSession();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EnterpriseBeansType ElementName: javaee:entity-beanType ElementType : entity
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>entity</code> element will be created and returned.
    * Otherwise, the first existing <code>entity</code> element will be returned.
    * @return the instance defined for the element <code>entity</code> 
    */
   public EntityBeanType<EnterpriseBeansType<T>> getOrCreateEntity();

   /**
    * Creates a new <code>entity</code> element 
    * @return the new created instance of <code>EntityBeanType<EnterpriseBeansType<T>></code> 
    */
   public EntityBeanType<EnterpriseBeansType<T>> createEntity();

   /**
    * Returns all <code>entity</code> elements
    * @return list of <code>entity</code> 
    */
   public List<EntityBeanType<EnterpriseBeansType<T>>> getAllEntity();

   /**
    * Removes all <code>entity</code> elements 
    * @return the current instance of <code>EntityBeanType<EnterpriseBeansType<T>></code> 
    */
   public EnterpriseBeansType<T> removeAllEntity();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EnterpriseBeansType ElementName: javaee:message-driven-beanType ElementType : message-driven
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>message-driven</code> element will be created and returned.
    * Otherwise, the first existing <code>message-driven</code> element will be returned.
    * @return the instance defined for the element <code>message-driven</code> 
    */
   public MessageDrivenBeanType<EnterpriseBeansType<T>> getOrCreateMessageDriven();

   /**
    * Creates a new <code>message-driven</code> element 
    * @return the new created instance of <code>MessageDrivenBeanType<EnterpriseBeansType<T>></code> 
    */
   public MessageDrivenBeanType<EnterpriseBeansType<T>> createMessageDriven();

   /**
    * Returns all <code>message-driven</code> elements
    * @return list of <code>message-driven</code> 
    */
   public List<MessageDrivenBeanType<EnterpriseBeansType<T>>> getAllMessageDriven();

   /**
    * Removes all <code>message-driven</code> elements 
    * @return the current instance of <code>MessageDrivenBeanType<EnterpriseBeansType<T>></code> 
    */
   public EnterpriseBeansType<T> removeAllMessageDriven();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EnterpriseBeansType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>EnterpriseBeansType<T></code> 
    */
   public EnterpriseBeansType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>EnterpriseBeansType<T></code> 
    */
   public EnterpriseBeansType<T> removeId();
}
