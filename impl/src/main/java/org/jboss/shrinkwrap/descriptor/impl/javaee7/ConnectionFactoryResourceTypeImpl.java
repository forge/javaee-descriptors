package org.jboss.shrinkwrap.descriptor.impl.javaee7; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee7.ConnectionFactoryResourceType;
import org.jboss.shrinkwrap.descriptor.api.javaee7.PropertyType;
import org.jboss.shrinkwrap.descriptor.api.javaee7.TransactionSupportType;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> connection-factory-resourceType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class ConnectionFactoryResourceTypeImpl<T> implements Child<T>, ConnectionFactoryResourceType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public ConnectionFactoryResourceTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public ConnectionFactoryResourceTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectionFactoryResourceType ElementName: xsd:string ElementType : description
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>description</code> element
    * @param description the value for the element <code>description</code> 
    * @return the current instance of <code>ConnectionFactoryResourceType<T></code> 
    */
   public ConnectionFactoryResourceType<T> description(String description)
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
    * @return the current instance of <code>ConnectionFactoryResourceType<T></code> 
    */
   public ConnectionFactoryResourceType<T> removeDescription()
   {
      childNode.removeChildren("description");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectionFactoryResourceType ElementName: xsd:token ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> element
    * @param name the value for the element <code>name</code> 
    * @return the current instance of <code>ConnectionFactoryResourceType<T></code> 
    */
   public ConnectionFactoryResourceType<T> name(String name)
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
    * @return the current instance of <code>ConnectionFactoryResourceType<T></code> 
    */
   public ConnectionFactoryResourceType<T> removeName()
   {
      childNode.removeChildren("name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectionFactoryResourceType ElementName: xsd:token ElementType : interface-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>interface-name</code> element
    * @param interfaceName the value for the element <code>interface-name</code> 
    * @return the current instance of <code>ConnectionFactoryResourceType<T></code> 
    */
   public ConnectionFactoryResourceType<T> interfaceName(String interfaceName)
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
    * @return the current instance of <code>ConnectionFactoryResourceType<T></code> 
    */
   public ConnectionFactoryResourceType<T> removeInterfaceName()
   {
      childNode.removeChildren("interface-name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectionFactoryResourceType ElementName: xsd:token ElementType : resource-adapter
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>resource-adapter</code> element
    * @param resourceAdapter the value for the element <code>resource-adapter</code> 
    * @return the current instance of <code>ConnectionFactoryResourceType<T></code> 
    */
   public ConnectionFactoryResourceType<T> resourceAdapter(String resourceAdapter)
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
    * @return the current instance of <code>ConnectionFactoryResourceType<T></code> 
    */
   public ConnectionFactoryResourceType<T> removeResourceAdapter()
   {
      childNode.removeChildren("resource-adapter");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectionFactoryResourceType ElementName: xsd:integer ElementType : max-pool-size
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>max-pool-size</code> element
    * @param maxPoolSize the value for the element <code>max-pool-size</code> 
    * @return the current instance of <code>ConnectionFactoryResourceType<T></code> 
    */
   public ConnectionFactoryResourceType<T> maxPoolSize(Integer maxPoolSize)
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
    * @return the current instance of <code>ConnectionFactoryResourceType<T></code> 
    */
   public ConnectionFactoryResourceType<T> removeMaxPoolSize()
   {
      childNode.removeChildren("max-pool-size");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectionFactoryResourceType ElementName: xsd:integer ElementType : min-pool-size
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>min-pool-size</code> element
    * @param minPoolSize the value for the element <code>min-pool-size</code> 
    * @return the current instance of <code>ConnectionFactoryResourceType<T></code> 
    */
   public ConnectionFactoryResourceType<T> minPoolSize(Integer minPoolSize)
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
    * @return the current instance of <code>ConnectionFactoryResourceType<T></code> 
    */
   public ConnectionFactoryResourceType<T> removeMinPoolSize()
   {
      childNode.removeChildren("min-pool-size");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectionFactoryResourceType ElementName: javaee:transaction-supportType ElementType : transaction-support
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>transaction-support</code> element
    * @param transactionSupport the value for the element <code>transaction-support</code> 
    * @return the current instance of <code>ConnectionFactoryResourceType<T></code> 
    */
   public ConnectionFactoryResourceType<T> transactionSupport(TransactionSupportType transactionSupport)
   {
      childNode.getOrCreate("transaction-support").text(transactionSupport);
      return this;
   }
   /**
    * Sets the <code>transaction-support</code> element
    * @param transactionSupport the value for the element <code>transaction-support</code> 
    * @return the current instance of <code>ConnectionFactoryResourceType<T></code> 
    */
   public ConnectionFactoryResourceType<T> transactionSupport(String transactionSupport)
   {
      childNode.getOrCreate("transaction-support").text(transactionSupport);
      return this;
   }

   /**
    * Returns the <code>transaction-support</code> element
    * @return the value found for the element <code>transaction-support</code> 
    */
   public TransactionSupportType getTransactionSupport()
   {
      return TransactionSupportType.getFromStringValue(childNode.getTextValueForPatternName("transaction-support"));
   }

   /**
    * Returns the <code>transaction-support</code> element
    * @return the value found for the element <code>transaction-support</code> 
    */
   public String  getTransactionSupportAsString()
   {
      return childNode.getTextValueForPatternName("transaction-support");
   }

   /**
    * Removes the <code>transaction-support</code> attribute 
    * @return the current instance of <code>ConnectionFactoryResourceType<T></code> 
    */
   public ConnectionFactoryResourceType<T> removeTransactionSupport()
   {
      childNode.removeAttribute("transaction-support");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectionFactoryResourceType ElementName: javaee:propertyType ElementType : property
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>property</code> element will be created and returned.
    * Otherwise, the first existing <code>property</code> element will be returned.
    * @return the instance defined for the element <code>property</code> 
    */
   public PropertyType<ConnectionFactoryResourceType<T>> getOrCreateProperty()
   {
      List<Node> nodeList = childNode.get("property");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new PropertyTypeImpl<ConnectionFactoryResourceType<T>>(this, "property", childNode, nodeList.get(0));
      }
      return createProperty();
   }

   /**
    * Creates a new <code>property</code> element 
    * @return the new created instance of <code>PropertyType<ConnectionFactoryResourceType<T>></code> 
    */
   public PropertyType<ConnectionFactoryResourceType<T>> createProperty()
   {
      return new PropertyTypeImpl<ConnectionFactoryResourceType<T>>(this, "property", childNode);
   }

   /**
    * Returns all <code>property</code> elements
    * @return list of <code>property</code> 
    */
   public List<PropertyType<ConnectionFactoryResourceType<T>>> getAllProperty()
   {
      List<PropertyType<ConnectionFactoryResourceType<T>>> list = new ArrayList<PropertyType<ConnectionFactoryResourceType<T>>>();
      List<Node> nodeList = childNode.get("property");
      for(Node node: nodeList)
      {
         PropertyType<ConnectionFactoryResourceType<T>>  type = new PropertyTypeImpl<ConnectionFactoryResourceType<T>>(this, "property", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>property</code> elements 
    * @return the current instance of <code>PropertyType<ConnectionFactoryResourceType<T>></code> 
    */
   public ConnectionFactoryResourceType<T> removeAllProperty()
   {
      childNode.removeChildren("property");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ConnectionFactoryResourceType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>ConnectionFactoryResourceType<T></code> 
    */
   public ConnectionFactoryResourceType<T> id(String id)
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
    * @return the current instance of <code>ConnectionFactoryResourceType<T></code> 
    */
   public ConnectionFactoryResourceType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
