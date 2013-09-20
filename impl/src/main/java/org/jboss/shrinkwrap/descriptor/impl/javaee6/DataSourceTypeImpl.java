package org.jboss.shrinkwrap.descriptor.impl.javaee6; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.javaee6.DataSourceType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.javaee6.PropertyType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.PropertyTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IsolationLevelType;

/**
 * This class implements the <code> data-sourceType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class DataSourceTypeImpl<T> implements Child<T>, DataSourceType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public DataSourceTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public DataSourceTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DataSourceType ElementName: xsd:string ElementType : description
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>description</code> element
    * @param description the value for the element <code>description</code> 
    * @return the current instance of <code>DataSourceType<T></code> 
    */
   public DataSourceType<T> description(String description)
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
    * @return the current instance of <code>DataSourceType<T></code> 
    */
   public DataSourceType<T> removeDescription()
   {
      childNode.removeChildren("description");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DataSourceType ElementName: xsd:token ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> element
    * @param name the value for the element <code>name</code> 
    * @return the current instance of <code>DataSourceType<T></code> 
    */
   public DataSourceType<T> name(String name)
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
    * @return the current instance of <code>DataSourceType<T></code> 
    */
   public DataSourceType<T> removeName()
   {
      childNode.removeChildren("name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DataSourceType ElementName: xsd:token ElementType : class-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>class-name</code> element
    * @param className the value for the element <code>class-name</code> 
    * @return the current instance of <code>DataSourceType<T></code> 
    */
   public DataSourceType<T> className(String className)
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
    * @return the current instance of <code>DataSourceType<T></code> 
    */
   public DataSourceType<T> removeClassName()
   {
      childNode.removeChildren("class-name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DataSourceType ElementName: xsd:token ElementType : server-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>server-name</code> element
    * @param serverName the value for the element <code>server-name</code> 
    * @return the current instance of <code>DataSourceType<T></code> 
    */
   public DataSourceType<T> serverName(String serverName)
   {
      childNode.getOrCreate("server-name").text(serverName);
      return this;
   }

   /**
    * Returns the <code>server-name</code> element
    * @return the node defined for the element <code>server-name</code> 
    */
   public String getServerName()
   {
      return childNode.getTextValueForPatternName("server-name");
   }

   /**
    * Removes the <code>server-name</code> element 
    * @return the current instance of <code>DataSourceType<T></code> 
    */
   public DataSourceType<T> removeServerName()
   {
      childNode.removeChildren("server-name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DataSourceType ElementName: xsd:integer ElementType : port-number
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>port-number</code> element
    * @param portNumber the value for the element <code>port-number</code> 
    * @return the current instance of <code>DataSourceType<T></code> 
    */
   public DataSourceType<T> portNumber(Integer portNumber)
   {
      childNode.getOrCreate("port-number").text(portNumber);
      return this;
   }

   /**
    * Returns the <code>port-number</code> element
    * @return the node defined for the element <code>port-number</code> 
    */
   public Integer getPortNumber()
   {
      if (childNode.getTextValueForPatternName("port-number") != null && !childNode.getTextValueForPatternName("port-number").equals("null")) {
         return Integer.valueOf(childNode.getTextValueForPatternName("port-number"));
      }
      return null;
   }

   /**
    * Removes the <code>port-number</code> element 
    * @return the current instance of <code>DataSourceType<T></code> 
    */
   public DataSourceType<T> removePortNumber()
   {
      childNode.removeChildren("port-number");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DataSourceType ElementName: xsd:token ElementType : database-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>database-name</code> element
    * @param databaseName the value for the element <code>database-name</code> 
    * @return the current instance of <code>DataSourceType<T></code> 
    */
   public DataSourceType<T> databaseName(String databaseName)
   {
      childNode.getOrCreate("database-name").text(databaseName);
      return this;
   }

   /**
    * Returns the <code>database-name</code> element
    * @return the node defined for the element <code>database-name</code> 
    */
   public String getDatabaseName()
   {
      return childNode.getTextValueForPatternName("database-name");
   }

   /**
    * Removes the <code>database-name</code> element 
    * @return the current instance of <code>DataSourceType<T></code> 
    */
   public DataSourceType<T> removeDatabaseName()
   {
      childNode.removeChildren("database-name");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DataSourceType ElementName: xsd:token ElementType : url
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>url</code> element
    * @param url the value for the element <code>url</code> 
    * @return the current instance of <code>DataSourceType<T></code> 
    */
   public DataSourceType<T> url(String url)
   {
      childNode.getOrCreate("url").text(url);
      return this;
   }

   /**
    * Returns the <code>url</code> element
    * @return the node defined for the element <code>url</code> 
    */
   public String getUrl()
   {
      return childNode.getTextValueForPatternName("url");
   }

   /**
    * Removes the <code>url</code> element 
    * @return the current instance of <code>DataSourceType<T></code> 
    */
   public DataSourceType<T> removeUrl()
   {
      childNode.removeChildren("url");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DataSourceType ElementName: xsd:token ElementType : user
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>user</code> element
    * @param user the value for the element <code>user</code> 
    * @return the current instance of <code>DataSourceType<T></code> 
    */
   public DataSourceType<T> user(String user)
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
    * @return the current instance of <code>DataSourceType<T></code> 
    */
   public DataSourceType<T> removeUser()
   {
      childNode.removeChildren("user");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DataSourceType ElementName: xsd:token ElementType : password
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>password</code> element
    * @param password the value for the element <code>password</code> 
    * @return the current instance of <code>DataSourceType<T></code> 
    */
   public DataSourceType<T> password(String password)
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
    * @return the current instance of <code>DataSourceType<T></code> 
    */
   public DataSourceType<T> removePassword()
   {
      childNode.removeChildren("password");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DataSourceType ElementName: javaee:propertyType ElementType : property
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>property</code> element will be created and returned.
    * Otherwise, the first existing <code>property</code> element will be returned.
    * @return the instance defined for the element <code>property</code> 
    */
   public PropertyType<DataSourceType<T>> getOrCreateProperty()
   {
      List<Node> nodeList = childNode.get("property");
      if (nodeList != null &&  nodeList.size() > 0)
      {
         return new PropertyTypeImpl<DataSourceType<T>>(this, "property", childNode, nodeList.get(0));
      }
      return createProperty();
   }

   /**
    * Creates a new <code>property</code> element 
    * @return the new created instance of <code>PropertyType<DataSourceType<T>></code> 
    */
   public PropertyType<DataSourceType<T>> createProperty()
   {
      return new PropertyTypeImpl<DataSourceType<T>>(this, "property", childNode);
   }

   /**
    * Returns all <code>property</code> elements
    * @return list of <code>property</code> 
    */
   public List<PropertyType<DataSourceType<T>>> getAllProperty()
   {
      List<PropertyType<DataSourceType<T>>> list = new ArrayList<PropertyType<DataSourceType<T>>>();
      List<Node> nodeList = childNode.get("property");
      for(Node node: nodeList)
      {
         PropertyType<DataSourceType<T>>  type = new PropertyTypeImpl<DataSourceType<T>>(this, "property", childNode, node);
         list.add(type);
      }
      return list;
   }

   /**
    * Removes all <code>property</code> elements 
    * @return the current instance of <code>PropertyType<DataSourceType<T>></code> 
    */
   public DataSourceType<T> removeAllProperty()
   {
      childNode.removeChildren("property");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DataSourceType ElementName: xsd:integer ElementType : login-timeout
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>login-timeout</code> element
    * @param loginTimeout the value for the element <code>login-timeout</code> 
    * @return the current instance of <code>DataSourceType<T></code> 
    */
   public DataSourceType<T> loginTimeout(Integer loginTimeout)
   {
      childNode.getOrCreate("login-timeout").text(loginTimeout);
      return this;
   }

   /**
    * Returns the <code>login-timeout</code> element
    * @return the node defined for the element <code>login-timeout</code> 
    */
   public Integer getLoginTimeout()
   {
      if (childNode.getTextValueForPatternName("login-timeout") != null && !childNode.getTextValueForPatternName("login-timeout").equals("null")) {
         return Integer.valueOf(childNode.getTextValueForPatternName("login-timeout"));
      }
      return null;
   }

   /**
    * Removes the <code>login-timeout</code> element 
    * @return the current instance of <code>DataSourceType<T></code> 
    */
   public DataSourceType<T> removeLoginTimeout()
   {
      childNode.removeChildren("login-timeout");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DataSourceType ElementName: xsd:boolean ElementType : transactional
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>transactional</code> element
    * @param transactional the value for the element <code>transactional</code> 
    * @return the current instance of <code>DataSourceType<T></code> 
    */
   public DataSourceType<T> transactional(Boolean transactional)
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
    * @return the current instance of <code>DataSourceType<T></code> 
    */
   public DataSourceType<T> removeTransactional()
   {
      childNode.removeChildren("transactional");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DataSourceType ElementName: javaee:isolation-levelType ElementType : isolation-level
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>isolation-level</code> element
    * @param isolationLevel the value for the element <code>isolation-level</code> 
    * @return the current instance of <code>DataSourceType<T></code> 
    */
   public DataSourceType<T> isolationLevel(IsolationLevelType isolationLevel)
   {
      childNode.getOrCreate("isolation-level").text(isolationLevel);
      return this;
   }
   /**
    * Sets the <code>isolation-level</code> element
    * @param isolationLevel the value for the element <code>isolation-level</code> 
    * @return the current instance of <code>DataSourceType<T></code> 
    */
   public DataSourceType<T> isolationLevel(String isolationLevel)
   {
      childNode.getOrCreate("isolation-level").text(isolationLevel);
      return this;
   }

   /**
    * Returns the <code>isolation-level</code> element
    * @return the value found for the element <code>isolation-level</code> 
    */
   public IsolationLevelType getIsolationLevel()
   {
      return IsolationLevelType.getFromStringValue(childNode.getTextValueForPatternName("isolation-level"));
   }

   /**
    * Returns the <code>isolation-level</code> element
    * @return the value found for the element <code>isolation-level</code> 
    */
   public String  getIsolationLevelAsString()
   {
      return childNode.getTextValueForPatternName("isolation-level");
   }

   /**
    * Removes the <code>isolation-level</code> attribute 
    * @return the current instance of <code>DataSourceType<T></code> 
    */
   public DataSourceType<T> removeIsolationLevel()
   {
      childNode.removeAttribute("isolation-level");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DataSourceType ElementName: xsd:integer ElementType : initial-pool-size
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>initial-pool-size</code> element
    * @param initialPoolSize the value for the element <code>initial-pool-size</code> 
    * @return the current instance of <code>DataSourceType<T></code> 
    */
   public DataSourceType<T> initialPoolSize(Integer initialPoolSize)
   {
      childNode.getOrCreate("initial-pool-size").text(initialPoolSize);
      return this;
   }

   /**
    * Returns the <code>initial-pool-size</code> element
    * @return the node defined for the element <code>initial-pool-size</code> 
    */
   public Integer getInitialPoolSize()
   {
      if (childNode.getTextValueForPatternName("initial-pool-size") != null && !childNode.getTextValueForPatternName("initial-pool-size").equals("null")) {
         return Integer.valueOf(childNode.getTextValueForPatternName("initial-pool-size"));
      }
      return null;
   }

   /**
    * Removes the <code>initial-pool-size</code> element 
    * @return the current instance of <code>DataSourceType<T></code> 
    */
   public DataSourceType<T> removeInitialPoolSize()
   {
      childNode.removeChildren("initial-pool-size");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DataSourceType ElementName: xsd:integer ElementType : max-pool-size
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>max-pool-size</code> element
    * @param maxPoolSize the value for the element <code>max-pool-size</code> 
    * @return the current instance of <code>DataSourceType<T></code> 
    */
   public DataSourceType<T> maxPoolSize(Integer maxPoolSize)
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
    * @return the current instance of <code>DataSourceType<T></code> 
    */
   public DataSourceType<T> removeMaxPoolSize()
   {
      childNode.removeChildren("max-pool-size");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DataSourceType ElementName: xsd:integer ElementType : min-pool-size
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>min-pool-size</code> element
    * @param minPoolSize the value for the element <code>min-pool-size</code> 
    * @return the current instance of <code>DataSourceType<T></code> 
    */
   public DataSourceType<T> minPoolSize(Integer minPoolSize)
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
    * @return the current instance of <code>DataSourceType<T></code> 
    */
   public DataSourceType<T> removeMinPoolSize()
   {
      childNode.removeChildren("min-pool-size");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DataSourceType ElementName: xsd:integer ElementType : max-idle-time
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>max-idle-time</code> element
    * @param maxIdleTime the value for the element <code>max-idle-time</code> 
    * @return the current instance of <code>DataSourceType<T></code> 
    */
   public DataSourceType<T> maxIdleTime(Integer maxIdleTime)
   {
      childNode.getOrCreate("max-idle-time").text(maxIdleTime);
      return this;
   }

   /**
    * Returns the <code>max-idle-time</code> element
    * @return the node defined for the element <code>max-idle-time</code> 
    */
   public Integer getMaxIdleTime()
   {
      if (childNode.getTextValueForPatternName("max-idle-time") != null && !childNode.getTextValueForPatternName("max-idle-time").equals("null")) {
         return Integer.valueOf(childNode.getTextValueForPatternName("max-idle-time"));
      }
      return null;
   }

   /**
    * Removes the <code>max-idle-time</code> element 
    * @return the current instance of <code>DataSourceType<T></code> 
    */
   public DataSourceType<T> removeMaxIdleTime()
   {
      childNode.removeChildren("max-idle-time");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DataSourceType ElementName: xsd:integer ElementType : max-statements
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>max-statements</code> element
    * @param maxStatements the value for the element <code>max-statements</code> 
    * @return the current instance of <code>DataSourceType<T></code> 
    */
   public DataSourceType<T> maxStatements(Integer maxStatements)
   {
      childNode.getOrCreate("max-statements").text(maxStatements);
      return this;
   }

   /**
    * Returns the <code>max-statements</code> element
    * @return the node defined for the element <code>max-statements</code> 
    */
   public Integer getMaxStatements()
   {
      if (childNode.getTextValueForPatternName("max-statements") != null && !childNode.getTextValueForPatternName("max-statements").equals("null")) {
         return Integer.valueOf(childNode.getTextValueForPatternName("max-statements"));
      }
      return null;
   }

   /**
    * Removes the <code>max-statements</code> element 
    * @return the current instance of <code>DataSourceType<T></code> 
    */
   public DataSourceType<T> removeMaxStatements()
   {
      childNode.removeChildren("max-statements");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DataSourceType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>DataSourceType<T></code> 
    */
   public DataSourceType<T> id(String id)
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
    * @return the current instance of <code>DataSourceType<T></code> 
    */
   public DataSourceType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
