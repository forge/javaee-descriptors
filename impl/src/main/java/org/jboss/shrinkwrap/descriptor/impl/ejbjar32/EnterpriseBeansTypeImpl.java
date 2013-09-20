package org.jboss.shrinkwrap.descriptor.impl.ejbjar32; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar32.EnterpriseBeansType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar32.EntityBeanType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar32.MessageDrivenBeanType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar32.SessionBeanType;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> enterprise-beansType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class EnterpriseBeansTypeImpl<T> implements Child<T>, EnterpriseBeansType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public EnterpriseBeansTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public EnterpriseBeansTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EnterpriseBeansType ElementName: javaee:session-beanType ElementType : session
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>session</code> element will be created and returned.
    * Otherwise, the first existing <code>session</code> element will be returned.
    * @return the instance defined for the element <code>session</code> 
    */
   public SessionBeanType<EnterpriseBeansType<T>> getOrCreateSession()
   {
      List<Node> nodeList = childNode.get("session");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new SessionBeanTypeImpl<EnterpriseBeansType<T>>(this, "session", childNode, nodeList.get(0));
      }
      return createSession();
   }

   /**
    * Creates a new <code>session</code> element 
    * @return the new created instance of <code>SessionBeanType<EnterpriseBeansType<T>></code> 
    */
   public SessionBeanType<EnterpriseBeansType<T>> createSession()
   {
      return new SessionBeanTypeImpl<EnterpriseBeansType<T>>(this, "session", childNode);
   }

   /**
    * Returns all <code>session</code> elements
    * @return list of <code>session</code> 
    */
   public List<SessionBeanType<EnterpriseBeansType<T>>> getAllSession()
   {
      List<SessionBeanType<EnterpriseBeansType<T>>> list = new ArrayList<SessionBeanType<EnterpriseBeansType<T>>>();
      List<Node> nodeList = childNode.get("session");
      for(Node node: nodeList)
      {
         SessionBeanType<EnterpriseBeansType<T>>  type = new SessionBeanTypeImpl<EnterpriseBeansType<T>>(this, "session", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>session</code> elements 
    * @return the current instance of <code>SessionBeanType<EnterpriseBeansType<T>></code> 
    */
   public EnterpriseBeansType<T> removeAllSession()
   {
      childNode.removeChildren("session");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EnterpriseBeansType ElementName: javaee:entity-beanType ElementType : entity
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>entity</code> element will be created and returned.
    * Otherwise, the first existing <code>entity</code> element will be returned.
    * @return the instance defined for the element <code>entity</code> 
    */
   public EntityBeanType<EnterpriseBeansType<T>> getOrCreateEntity()
   {
      List<Node> nodeList = childNode.get("entity");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new EntityBeanTypeImpl<EnterpriseBeansType<T>>(this, "entity", childNode, nodeList.get(0));
      }
      return createEntity();
   }

   /**
    * Creates a new <code>entity</code> element 
    * @return the new created instance of <code>EntityBeanType<EnterpriseBeansType<T>></code> 
    */
   public EntityBeanType<EnterpriseBeansType<T>> createEntity()
   {
      return new EntityBeanTypeImpl<EnterpriseBeansType<T>>(this, "entity", childNode);
   }

   /**
    * Returns all <code>entity</code> elements
    * @return list of <code>entity</code> 
    */
   public List<EntityBeanType<EnterpriseBeansType<T>>> getAllEntity()
   {
      List<EntityBeanType<EnterpriseBeansType<T>>> list = new ArrayList<EntityBeanType<EnterpriseBeansType<T>>>();
      List<Node> nodeList = childNode.get("entity");
      for(Node node: nodeList)
      {
         EntityBeanType<EnterpriseBeansType<T>>  type = new EntityBeanTypeImpl<EnterpriseBeansType<T>>(this, "entity", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>entity</code> elements 
    * @return the current instance of <code>EntityBeanType<EnterpriseBeansType<T>></code> 
    */
   public EnterpriseBeansType<T> removeAllEntity()
   {
      childNode.removeChildren("entity");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EnterpriseBeansType ElementName: javaee:message-driven-beanType ElementType : message-driven
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>message-driven</code> element will be created and returned.
    * Otherwise, the first existing <code>message-driven</code> element will be returned.
    * @return the instance defined for the element <code>message-driven</code> 
    */
   public MessageDrivenBeanType<EnterpriseBeansType<T>> getOrCreateMessageDriven()
   {
      List<Node> nodeList = childNode.get("message-driven");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new MessageDrivenBeanTypeImpl<EnterpriseBeansType<T>>(this, "message-driven", childNode, nodeList.get(0));
      }
      return createMessageDriven();
   }

   /**
    * Creates a new <code>message-driven</code> element 
    * @return the new created instance of <code>MessageDrivenBeanType<EnterpriseBeansType<T>></code> 
    */
   public MessageDrivenBeanType<EnterpriseBeansType<T>> createMessageDriven()
   {
      return new MessageDrivenBeanTypeImpl<EnterpriseBeansType<T>>(this, "message-driven", childNode);
   }

   /**
    * Returns all <code>message-driven</code> elements
    * @return list of <code>message-driven</code> 
    */
   public List<MessageDrivenBeanType<EnterpriseBeansType<T>>> getAllMessageDriven()
   {
      List<MessageDrivenBeanType<EnterpriseBeansType<T>>> list = new ArrayList<MessageDrivenBeanType<EnterpriseBeansType<T>>>();
      List<Node> nodeList = childNode.get("message-driven");
      for(Node node: nodeList)
      {
         MessageDrivenBeanType<EnterpriseBeansType<T>>  type = new MessageDrivenBeanTypeImpl<EnterpriseBeansType<T>>(this, "message-driven", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>message-driven</code> elements 
    * @return the current instance of <code>MessageDrivenBeanType<EnterpriseBeansType<T>></code> 
    */
   public EnterpriseBeansType<T> removeAllMessageDriven()
   {
      childNode.removeChildren("message-driven");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EnterpriseBeansType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>EnterpriseBeansType<T></code> 
    */
   public EnterpriseBeansType<T> id(String id)
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
    * @return the current instance of <code>EnterpriseBeansType<T></code> 
    */
   public EnterpriseBeansType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
