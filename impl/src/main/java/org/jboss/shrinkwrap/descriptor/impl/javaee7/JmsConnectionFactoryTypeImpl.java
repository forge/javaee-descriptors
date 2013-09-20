package org.jboss.shrinkwrap.descriptor.impl.javaee7; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee7.JmsConnectionFactoryType;
import org.jboss.shrinkwrap.descriptor.api.javaee7.PropertyType;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> jms-connection-factoryType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class JmsConnectionFactoryTypeImpl<T> implements Child<T>, JmsConnectionFactoryType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public JmsConnectionFactoryTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public JmsConnectionFactoryTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JmsConnectionFactoryType ElementName: xsd:string ElementType : description
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>description</code> element
    * @param description the value for the element <code>description</code> 
    * @return the current instance of <code>JmsConnectionFactoryType<T></code> 
    */
   public JmsConnectionFactoryType<T> description(String description)
   {
      childNode.getOrCreate("description").text(description);
      return this;
   }

   /**
    * Returns the <code>description</code> element
    * @return the node defined for the element <code>description</code> 
    */
   public String getDescription()
   {
      return childNode.getTextValueForPatternName("description");
   }

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>JmsConnectionFactoryType<T></code> 
    */
   public JmsConnectionFactoryType<T> removeDescription()
   {
      childNode.removeChildren("description");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JmsConnectionFactoryType ElementName: xsd:token ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> element
    * @param name the value for the element <code>name</code> 
    * @return the current instance of <code>JmsConnectionFactoryType<T></code> 
    */
   public JmsConnectionFactoryType<T> name(String name)
   {
      childNode.getOrCreate("name").text(name);
      return this;
   }

   /**
    * Returns the <code>name</code> element
    * @return the node defined for the element <code>name</code> 
    */
   public String getName()
   {
      return childNode.getTextValueForPatternName("name");
   }

   /**
    * Removes the <code>name</code> element 
    * @return the current instance of <code>JmsConnectionFactoryType<T></code> 
    */
   public JmsConnectionFactoryType<T> removeName()
   {
      childNode.removeChildren("name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JmsConnectionFactoryType ElementName: xsd:token ElementType : interface-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>interface-name</code> element
    * @param interfaceName the value for the element <code>interface-name</code> 
    * @return the current instance of <code>JmsConnectionFactoryType<T></code> 
    */
   public JmsConnectionFactoryType<T> interfaceName(String interfaceName)
   {
      childNode.getOrCreate("interface-name").text(interfaceName);
      return this;
   }

   /**
    * Returns the <code>interface-name</code> element
    * @return the node defined for the element <code>interface-name</code> 
    */
   public String getInterfaceName()
   {
      return childNode.getTextValueForPatternName("interface-name");
   }

   /**
    * Removes the <code>interface-name</code> element 
    * @return the current instance of <code>JmsConnectionFactoryType<T></code> 
    */
   public JmsConnectionFactoryType<T> removeInterfaceName()
   {
      childNode.removeChildren("interface-name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JmsConnectionFactoryType ElementName: xsd:token ElementType : class-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>class-name</code> element
    * @param className the value for the element <code>class-name</code> 
    * @return the current instance of <code>JmsConnectionFactoryType<T></code> 
    */
   public JmsConnectionFactoryType<T> className(String className)
   {
      childNode.getOrCreate("class-name").text(className);
      return this;
   }

   /**
    * Returns the <code>class-name</code> element
    * @return the node defined for the element <code>class-name</code> 
    */
   public String getClassName()
   {
      return childNode.getTextValueForPatternName("class-name");
   }

   /**
    * Removes the <code>class-name</code> element 
    * @return the current instance of <code>JmsConnectionFactoryType<T></code> 
    */
   public JmsConnectionFactoryType<T> removeClassName()
   {
      childNode.removeChildren("class-name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JmsConnectionFactoryType ElementName: xsd:token ElementType : resource-adapter
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>resource-adapter</code> element
    * @param resourceAdapter the value for the element <code>resource-adapter</code> 
    * @return the current instance of <code>JmsConnectionFactoryType<T></code> 
    */
   public JmsConnectionFactoryType<T> resourceAdapter(String resourceAdapter)
   {
      childNode.getOrCreate("resource-adapter").text(resourceAdapter);
      return this;
   }

   /**
    * Returns the <code>resource-adapter</code> element
    * @return the node defined for the element <code>resource-adapter</code> 
    */
   public String getResourceAdapter()
   {
      return childNode.getTextValueForPatternName("resource-adapter");
   }

   /**
    * Removes the <code>resource-adapter</code> element 
    * @return the current instance of <code>JmsConnectionFactoryType<T></code> 
    */
   public JmsConnectionFactoryType<T> removeResourceAdapter()
   {
      childNode.removeChildren("resource-adapter");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JmsConnectionFactoryType ElementName: xsd:token ElementType : user
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>user</code> element
    * @param user the value for the element <code>user</code> 
    * @return the current instance of <code>JmsConnectionFactoryType<T></code> 
    */
   public JmsConnectionFactoryType<T> user(String user)
   {
      childNode.getOrCreate("user").text(user);
      return this;
   }

   /**
    * Returns the <code>user</code> element
    * @return the node defined for the element <code>user</code> 
    */
   public String getUser()
   {
      return childNode.getTextValueForPatternName("user");
   }

   /**
    * Removes the <code>user</code> element 
    * @return the current instance of <code>JmsConnectionFactoryType<T></code> 
    */
   public JmsConnectionFactoryType<T> removeUser()
   {
      childNode.removeChildren("user");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JmsConnectionFactoryType ElementName: xsd:token ElementType : password
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>password</code> element
    * @param password the value for the element <code>password</code> 
    * @return the current instance of <code>JmsConnectionFactoryType<T></code> 
    */
   public JmsConnectionFactoryType<T> password(String password)
   {
      childNode.getOrCreate("password").text(password);
      return this;
   }

   /**
    * Returns the <code>password</code> element
    * @return the node defined for the element <code>password</code> 
    */
   public String getPassword()
   {
      return childNode.getTextValueForPatternName("password");
   }

   /**
    * Removes the <code>password</code> element 
    * @return the current instance of <code>JmsConnectionFactoryType<T></code> 
    */
   public JmsConnectionFactoryType<T> removePassword()
   {
      childNode.removeChildren("password");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JmsConnectionFactoryType ElementName: xsd:token ElementType : client-id
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>client-id</code> element
    * @param clientId the value for the element <code>client-id</code> 
    * @return the current instance of <code>JmsConnectionFactoryType<T></code> 
    */
   public JmsConnectionFactoryType<T> clientId(String clientId)
   {
      childNode.getOrCreate("client-id").text(clientId);
      return this;
   }

   /**
    * Returns the <code>client-id</code> element
    * @return the node defined for the element <code>client-id</code> 
    */
   public String getClientId()
   {
      return childNode.getTextValueForPatternName("client-id");
   }

   /**
    * Removes the <code>client-id</code> element 
    * @return the current instance of <code>JmsConnectionFactoryType<T></code> 
    */
   public JmsConnectionFactoryType<T> removeClientId()
   {
      childNode.removeChildren("client-id");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JmsConnectionFactoryType ElementName: javaee:propertyType ElementType : property
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>property</code> element will be created and returned.
    * Otherwise, the first existing <code>property</code> element will be returned.
    * @return the instance defined for the element <code>property</code> 
    */
   public PropertyType<JmsConnectionFactoryType<T>> getOrCreateProperty()
   {
      List<Node> nodeList = childNode.get("property");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new PropertyTypeImpl<JmsConnectionFactoryType<T>>(this, "property", childNode, nodeList.get(0));
      }
      return createProperty();
   }

   /**
    * Creates a new <code>property</code> element 
    * @return the new created instance of <code>PropertyType<JmsConnectionFactoryType<T>></code> 
    */
   public PropertyType<JmsConnectionFactoryType<T>> createProperty()
   {
      return new PropertyTypeImpl<JmsConnectionFactoryType<T>>(this, "property", childNode);
   }

   /**
    * Returns all <code>property</code> elements
    * @return list of <code>property</code> 
    */
   public List<PropertyType<JmsConnectionFactoryType<T>>> getAllProperty()
   {
      List<PropertyType<JmsConnectionFactoryType<T>>> list = new ArrayList<PropertyType<JmsConnectionFactoryType<T>>>();
      List<Node> nodeList = childNode.get("property");
      for(Node node: nodeList)
      {
         PropertyType<JmsConnectionFactoryType<T>>  type = new PropertyTypeImpl<JmsConnectionFactoryType<T>>(this, "property", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>property</code> elements 
    * @return the current instance of <code>PropertyType<JmsConnectionFactoryType<T>></code> 
    */
   public JmsConnectionFactoryType<T> removeAllProperty()
   {
      childNode.removeChildren("property");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JmsConnectionFactoryType ElementName: xsd:boolean ElementType : transactional
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>transactional</code> element
    * @param transactional the value for the element <code>transactional</code> 
    * @return the current instance of <code>JmsConnectionFactoryType<T></code> 
    */
   public JmsConnectionFactoryType<T> transactional(Boolean transactional)
   {
      childNode.getOrCreate("transactional").text(transactional);
      return this;
   }

   /**
    * Returns the <code>transactional</code> element
    * @return the node defined for the element <code>transactional</code> 
    */
   public Boolean isTransactional()
   {
      return Strings.isTrue(childNode.getTextValueForPatternName("transactional"));
   }

   /**
    * Removes the <code>transactional</code> element 
    * @return the current instance of <code>JmsConnectionFactoryType<T></code> 
    */
   public JmsConnectionFactoryType<T> removeTransactional()
   {
      childNode.removeChildren("transactional");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JmsConnectionFactoryType ElementName: xsd:integer ElementType : max-pool-size
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>max-pool-size</code> element
    * @param maxPoolSize the value for the element <code>max-pool-size</code> 
    * @return the current instance of <code>JmsConnectionFactoryType<T></code> 
    */
   public JmsConnectionFactoryType<T> maxPoolSize(Integer maxPoolSize)
   {
      childNode.getOrCreate("max-pool-size").text(maxPoolSize);
      return this;
   }

   /**
    * Returns the <code>max-pool-size</code> element
    * @return the node defined for the element <code>max-pool-size</code> 
    */
   public Integer getMaxPoolSize()
   {
      if (childNode.getTextValueForPatternName("max-pool-size") != null && !childNode.getTextValueForPatternName("max-pool-size").equals("null")) {
         return Integer.valueOf(childNode.getTextValueForPatternName("max-pool-size"));
      }
      return null;
   }

   /**
    * Removes the <code>max-pool-size</code> element 
    * @return the current instance of <code>JmsConnectionFactoryType<T></code> 
    */
   public JmsConnectionFactoryType<T> removeMaxPoolSize()
   {
      childNode.removeChildren("max-pool-size");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JmsConnectionFactoryType ElementName: xsd:integer ElementType : min-pool-size
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>min-pool-size</code> element
    * @param minPoolSize the value for the element <code>min-pool-size</code> 
    * @return the current instance of <code>JmsConnectionFactoryType<T></code> 
    */
   public JmsConnectionFactoryType<T> minPoolSize(Integer minPoolSize)
   {
      childNode.getOrCreate("min-pool-size").text(minPoolSize);
      return this;
   }

   /**
    * Returns the <code>min-pool-size</code> element
    * @return the node defined for the element <code>min-pool-size</code> 
    */
   public Integer getMinPoolSize()
   {
      if (childNode.getTextValueForPatternName("min-pool-size") != null && !childNode.getTextValueForPatternName("min-pool-size").equals("null")) {
         return Integer.valueOf(childNode.getTextValueForPatternName("min-pool-size"));
      }
      return null;
   }

   /**
    * Removes the <code>min-pool-size</code> element 
    * @return the current instance of <code>JmsConnectionFactoryType<T></code> 
    */
   public JmsConnectionFactoryType<T> removeMinPoolSize()
   {
      childNode.removeChildren("min-pool-size");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JmsConnectionFactoryType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>JmsConnectionFactoryType<T></code> 
    */
   public JmsConnectionFactoryType<T> id(String id)
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
    * @return the current instance of <code>JmsConnectionFactoryType<T></code> 
    */
   public JmsConnectionFactoryType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
