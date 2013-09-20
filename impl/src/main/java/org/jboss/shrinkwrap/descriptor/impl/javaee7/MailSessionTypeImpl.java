package org.jboss.shrinkwrap.descriptor.impl.javaee7; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.javaee7.MailSessionType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.javaee7.PropertyType;
import org.jboss.shrinkwrap.descriptor.impl.javaee7.PropertyTypeImpl;

/**
 * This class implements the <code> mail-sessionType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class MailSessionTypeImpl<T> implements Child<T>, MailSessionType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public MailSessionTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public MailSessionTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MailSessionType ElementName: xsd:string ElementType : description
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>description</code> element
    * @param description the value for the element <code>description</code> 
    * @return the current instance of <code>MailSessionType<T></code> 
    */
   public MailSessionType<T> description(String description)
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
    * @return the current instance of <code>MailSessionType<T></code> 
    */
   public MailSessionType<T> removeDescription()
   {
      childNode.removeChildren("description");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MailSessionType ElementName: xsd:token ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> element
    * @param name the value for the element <code>name</code> 
    * @return the current instance of <code>MailSessionType<T></code> 
    */
   public MailSessionType<T> name(String name)
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
    * @return the current instance of <code>MailSessionType<T></code> 
    */
   public MailSessionType<T> removeName()
   {
      childNode.removeChildren("name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MailSessionType ElementName: xsd:token ElementType : store-protocol
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>store-protocol</code> element
    * @param storeProtocol the value for the element <code>store-protocol</code> 
    * @return the current instance of <code>MailSessionType<T></code> 
    */
   public MailSessionType<T> storeProtocol(String storeProtocol)
   {
      childNode.getOrCreate("store-protocol").text(storeProtocol);
      return this;
   }

   /**
    * Returns the <code>store-protocol</code> element
    * @return the node defined for the element <code>store-protocol</code> 
    */
   public String getStoreProtocol()
   {
      return childNode.getTextValueForPatternName("store-protocol");
   }

   /**
    * Removes the <code>store-protocol</code> element 
    * @return the current instance of <code>MailSessionType<T></code> 
    */
   public MailSessionType<T> removeStoreProtocol()
   {
      childNode.removeChildren("store-protocol");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MailSessionType ElementName: xsd:token ElementType : store-protocol-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>store-protocol-class</code> element
    * @param storeProtocolClass the value for the element <code>store-protocol-class</code> 
    * @return the current instance of <code>MailSessionType<T></code> 
    */
   public MailSessionType<T> storeProtocolClass(String storeProtocolClass)
   {
      childNode.getOrCreate("store-protocol-class").text(storeProtocolClass);
      return this;
   }

   /**
    * Returns the <code>store-protocol-class</code> element
    * @return the node defined for the element <code>store-protocol-class</code> 
    */
   public String getStoreProtocolClass()
   {
      return childNode.getTextValueForPatternName("store-protocol-class");
   }

   /**
    * Removes the <code>store-protocol-class</code> element 
    * @return the current instance of <code>MailSessionType<T></code> 
    */
   public MailSessionType<T> removeStoreProtocolClass()
   {
      childNode.removeChildren("store-protocol-class");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MailSessionType ElementName: xsd:token ElementType : transport-protocol
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>transport-protocol</code> element
    * @param transportProtocol the value for the element <code>transport-protocol</code> 
    * @return the current instance of <code>MailSessionType<T></code> 
    */
   public MailSessionType<T> transportProtocol(String transportProtocol)
   {
      childNode.getOrCreate("transport-protocol").text(transportProtocol);
      return this;
   }

   /**
    * Returns the <code>transport-protocol</code> element
    * @return the node defined for the element <code>transport-protocol</code> 
    */
   public String getTransportProtocol()
   {
      return childNode.getTextValueForPatternName("transport-protocol");
   }

   /**
    * Removes the <code>transport-protocol</code> element 
    * @return the current instance of <code>MailSessionType<T></code> 
    */
   public MailSessionType<T> removeTransportProtocol()
   {
      childNode.removeChildren("transport-protocol");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MailSessionType ElementName: xsd:token ElementType : transport-protocol-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>transport-protocol-class</code> element
    * @param transportProtocolClass the value for the element <code>transport-protocol-class</code> 
    * @return the current instance of <code>MailSessionType<T></code> 
    */
   public MailSessionType<T> transportProtocolClass(String transportProtocolClass)
   {
      childNode.getOrCreate("transport-protocol-class").text(transportProtocolClass);
      return this;
   }

   /**
    * Returns the <code>transport-protocol-class</code> element
    * @return the node defined for the element <code>transport-protocol-class</code> 
    */
   public String getTransportProtocolClass()
   {
      return childNode.getTextValueForPatternName("transport-protocol-class");
   }

   /**
    * Removes the <code>transport-protocol-class</code> element 
    * @return the current instance of <code>MailSessionType<T></code> 
    */
   public MailSessionType<T> removeTransportProtocolClass()
   {
      childNode.removeChildren("transport-protocol-class");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MailSessionType ElementName: xsd:token ElementType : host
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>host</code> element
    * @param host the value for the element <code>host</code> 
    * @return the current instance of <code>MailSessionType<T></code> 
    */
   public MailSessionType<T> host(String host)
   {
      childNode.getOrCreate("host").text(host);
      return this;
   }

   /**
    * Returns the <code>host</code> element
    * @return the node defined for the element <code>host</code> 
    */
   public String getHost()
   {
      return childNode.getTextValueForPatternName("host");
   }

   /**
    * Removes the <code>host</code> element 
    * @return the current instance of <code>MailSessionType<T></code> 
    */
   public MailSessionType<T> removeHost()
   {
      childNode.removeChildren("host");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MailSessionType ElementName: xsd:token ElementType : user
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>user</code> element
    * @param user the value for the element <code>user</code> 
    * @return the current instance of <code>MailSessionType<T></code> 
    */
   public MailSessionType<T> user(String user)
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
    * @return the current instance of <code>MailSessionType<T></code> 
    */
   public MailSessionType<T> removeUser()
   {
      childNode.removeChildren("user");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MailSessionType ElementName: xsd:token ElementType : password
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>password</code> element
    * @param password the value for the element <code>password</code> 
    * @return the current instance of <code>MailSessionType<T></code> 
    */
   public MailSessionType<T> password(String password)
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
    * @return the current instance of <code>MailSessionType<T></code> 
    */
   public MailSessionType<T> removePassword()
   {
      childNode.removeChildren("password");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MailSessionType ElementName: xsd:token ElementType : from
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>from</code> element
    * @param from the value for the element <code>from</code> 
    * @return the current instance of <code>MailSessionType<T></code> 
    */
   public MailSessionType<T> from(String from)
   {
      childNode.getOrCreate("from").text(from);
      return this;
   }

   /**
    * Returns the <code>from</code> element
    * @return the node defined for the element <code>from</code> 
    */
   public String getFrom()
   {
      return childNode.getTextValueForPatternName("from");
   }

   /**
    * Removes the <code>from</code> element 
    * @return the current instance of <code>MailSessionType<T></code> 
    */
   public MailSessionType<T> removeFrom()
   {
      childNode.removeChildren("from");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MailSessionType ElementName: javaee:propertyType ElementType : property
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>property</code> element will be created and returned.
    * Otherwise, the first existing <code>property</code> element will be returned.
    * @return the instance defined for the element <code>property</code> 
    */
   public PropertyType<MailSessionType<T>> getOrCreateProperty()
   {
      List<Node> nodeList = childNode.get("property");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new PropertyTypeImpl<MailSessionType<T>>(this, "property", childNode, nodeList.get(0));
      }
      return createProperty();
   }

   /**
    * Creates a new <code>property</code> element 
    * @return the new created instance of <code>PropertyType<MailSessionType<T>></code> 
    */
   public PropertyType<MailSessionType<T>> createProperty()
   {
      return new PropertyTypeImpl<MailSessionType<T>>(this, "property", childNode);
   }

   /**
    * Returns all <code>property</code> elements
    * @return list of <code>property</code> 
    */
   public List<PropertyType<MailSessionType<T>>> getAllProperty()
   {
      List<PropertyType<MailSessionType<T>>> list = new ArrayList<PropertyType<MailSessionType<T>>>();
      List<Node> nodeList = childNode.get("property");
      for(Node node: nodeList)
      {
         PropertyType<MailSessionType<T>>  type = new PropertyTypeImpl<MailSessionType<T>>(this, "property", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>property</code> elements 
    * @return the current instance of <code>PropertyType<MailSessionType<T>></code> 
    */
   public MailSessionType<T> removeAllProperty()
   {
      childNode.removeChildren("property");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: MailSessionType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>MailSessionType<T></code> 
    */
   public MailSessionType<T> id(String id)
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
    * @return the current instance of <code>MailSessionType<T></code> 
    */
   public MailSessionType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
