package org.jboss.shrinkwrap.descriptor.api.javaee6; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee6.PropertyType;
import org.jboss.shrinkwrap.descriptor.api.javaee6.IsolationLevelType;
/**
 * This interface defines the contract for the <code> data-sourceType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface DataSourceType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DataSourceType ElementName: xsd:string ElementType : description
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>description</code> element
    * @param description the value for the element <code>description</code> 
    * @return the current instance of <code>DataSourceType<T></code> 
    */
   public DataSourceType<T> description(String description);

   /**
    * Returns the <code>description</code> element
    * @return the node defined for the element <code>description</code> 
    */
   public String getDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>DataSourceType<T></code> 
    */
   public DataSourceType<T> removeDescription();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DataSourceType ElementName: xsd:token ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> element
    * @param name the value for the element <code>name</code> 
    * @return the current instance of <code>DataSourceType<T></code> 
    */
   public DataSourceType<T> name(String name);

   /**
    * Returns the <code>name</code> element
    * @return the node defined for the element <code>name</code> 
    */
   public String getName();

   /**
    * Removes the <code>name</code> element 
    * @return the current instance of <code>DataSourceType<T></code> 
    */
   public DataSourceType<T> removeName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DataSourceType ElementName: xsd:token ElementType : class-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>class-name</code> element
    * @param className the value for the element <code>class-name</code> 
    * @return the current instance of <code>DataSourceType<T></code> 
    */
   public DataSourceType<T> className(String className);

   /**
    * Returns the <code>class-name</code> element
    * @return the node defined for the element <code>class-name</code> 
    */
   public String getClassName();

   /**
    * Removes the <code>class-name</code> element 
    * @return the current instance of <code>DataSourceType<T></code> 
    */
   public DataSourceType<T> removeClassName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DataSourceType ElementName: xsd:token ElementType : server-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>server-name</code> element
    * @param serverName the value for the element <code>server-name</code> 
    * @return the current instance of <code>DataSourceType<T></code> 
    */
   public DataSourceType<T> serverName(String serverName);

   /**
    * Returns the <code>server-name</code> element
    * @return the node defined for the element <code>server-name</code> 
    */
   public String getServerName();

   /**
    * Removes the <code>server-name</code> element 
    * @return the current instance of <code>DataSourceType<T></code> 
    */
   public DataSourceType<T> removeServerName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DataSourceType ElementName: xsd:integer ElementType : port-number
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>port-number</code> element
    * @param portNumber the value for the element <code>port-number</code> 
    * @return the current instance of <code>DataSourceType<T></code> 
    */
   public DataSourceType<T> portNumber(Integer portNumber);

   /**
    * Returns the <code>port-number</code> element
    * @return the node defined for the element <code>port-number</code> 
    */
   public Integer getPortNumber();

   /**
    * Removes the <code>port-number</code> element 
    * @return the current instance of <code>DataSourceType<T></code> 
    */
   public DataSourceType<T> removePortNumber();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DataSourceType ElementName: xsd:token ElementType : database-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>database-name</code> element
    * @param databaseName the value for the element <code>database-name</code> 
    * @return the current instance of <code>DataSourceType<T></code> 
    */
   public DataSourceType<T> databaseName(String databaseName);

   /**
    * Returns the <code>database-name</code> element
    * @return the node defined for the element <code>database-name</code> 
    */
   public String getDatabaseName();

   /**
    * Removes the <code>database-name</code> element 
    * @return the current instance of <code>DataSourceType<T></code> 
    */
   public DataSourceType<T> removeDatabaseName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DataSourceType ElementName: xsd:token ElementType : url
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>url</code> element
    * @param url the value for the element <code>url</code> 
    * @return the current instance of <code>DataSourceType<T></code> 
    */
   public DataSourceType<T> url(String url);

   /**
    * Returns the <code>url</code> element
    * @return the node defined for the element <code>url</code> 
    */
   public String getUrl();

   /**
    * Removes the <code>url</code> element 
    * @return the current instance of <code>DataSourceType<T></code> 
    */
   public DataSourceType<T> removeUrl();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DataSourceType ElementName: xsd:token ElementType : user
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>user</code> element
    * @param user the value for the element <code>user</code> 
    * @return the current instance of <code>DataSourceType<T></code> 
    */
   public DataSourceType<T> user(String user);

   /**
    * Returns the <code>user</code> element
    * @return the node defined for the element <code>user</code> 
    */
   public String getUser();

   /**
    * Removes the <code>user</code> element 
    * @return the current instance of <code>DataSourceType<T></code> 
    */
   public DataSourceType<T> removeUser();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DataSourceType ElementName: xsd:token ElementType : password
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>password</code> element
    * @param password the value for the element <code>password</code> 
    * @return the current instance of <code>DataSourceType<T></code> 
    */
   public DataSourceType<T> password(String password);

   /**
    * Returns the <code>password</code> element
    * @return the node defined for the element <code>password</code> 
    */
   public String getPassword();

   /**
    * Removes the <code>password</code> element 
    * @return the current instance of <code>DataSourceType<T></code> 
    */
   public DataSourceType<T> removePassword();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DataSourceType ElementName: javaee:propertyType ElementType : property
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>property</code> element will be created and returned.
    * Otherwise, the first existing <code>property</code> element will be returned.
    * @return the instance defined for the element <code>property</code> 
    */
   public PropertyType<DataSourceType<T>> getOrCreateProperty();

   /**
    * Creates a new <code>property</code> element 
    * @return the new created instance of <code>PropertyType<DataSourceType<T>></code> 
    */
   public PropertyType<DataSourceType<T>> createProperty();

   /**
    * Returns all <code>property</code> elements
    * @return list of <code>property</code> 
    */
   public List<PropertyType<DataSourceType<T>>> getAllProperty();

   /**
    * Removes all <code>property</code> elements 
    * @return the current instance of <code>PropertyType<DataSourceType<T>></code> 
    */
   public DataSourceType<T> removeAllProperty();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DataSourceType ElementName: xsd:integer ElementType : login-timeout
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>login-timeout</code> element
    * @param loginTimeout the value for the element <code>login-timeout</code> 
    * @return the current instance of <code>DataSourceType<T></code> 
    */
   public DataSourceType<T> loginTimeout(Integer loginTimeout);

   /**
    * Returns the <code>login-timeout</code> element
    * @return the node defined for the element <code>login-timeout</code> 
    */
   public Integer getLoginTimeout();

   /**
    * Removes the <code>login-timeout</code> element 
    * @return the current instance of <code>DataSourceType<T></code> 
    */
   public DataSourceType<T> removeLoginTimeout();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DataSourceType ElementName: xsd:boolean ElementType : transactional
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>transactional</code> element
    * @param transactional the value for the element <code>transactional</code> 
    * @return the current instance of <code>DataSourceType<T></code> 
    */
   public DataSourceType<T> transactional(Boolean transactional);

   /**
    * Returns the <code>transactional</code> element
    * @return the node defined for the element <code>transactional</code> 
    */
   public Boolean isTransactional();

   /**
    * Removes the <code>transactional</code> element 
    * @return the current instance of <code>DataSourceType<T></code> 
    */
   public DataSourceType<T> removeTransactional();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DataSourceType ElementName: javaee:isolation-levelType ElementType : isolation-level
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>isolation-level</code> element
    * @param isolationLevel the value for the element <code>isolation-level</code> 
    * @return the current instance of <code>DataSourceType<T></code> 
    */
   public DataSourceType<T> isolationLevel(IsolationLevelType isolationLevel);
   /**
    * Sets the <code>isolation-level</code> element
    * @param isolationLevel the value for the element <code>isolation-level</code> 
    * @return the current instance of <code>DataSourceType<T></code> 
    */
   public DataSourceType<T> isolationLevel(String isolationLevel);

   /**
    * Returns the <code>isolation-level</code> element
    * @return the value found for the element <code>isolation-level</code> 
    */
   public IsolationLevelType getIsolationLevel();

   /**
    * Returns the <code>isolation-level</code> element
    * @return the value found for the element <code>isolation-level</code> 
    */
   public String  getIsolationLevelAsString();

   /**
    * Removes the <code>isolation-level</code> attribute 
    * @return the current instance of <code>DataSourceType<T></code> 
    */
   public DataSourceType<T> removeIsolationLevel();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DataSourceType ElementName: xsd:integer ElementType : initial-pool-size
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>initial-pool-size</code> element
    * @param initialPoolSize the value for the element <code>initial-pool-size</code> 
    * @return the current instance of <code>DataSourceType<T></code> 
    */
   public DataSourceType<T> initialPoolSize(Integer initialPoolSize);

   /**
    * Returns the <code>initial-pool-size</code> element
    * @return the node defined for the element <code>initial-pool-size</code> 
    */
   public Integer getInitialPoolSize();

   /**
    * Removes the <code>initial-pool-size</code> element 
    * @return the current instance of <code>DataSourceType<T></code> 
    */
   public DataSourceType<T> removeInitialPoolSize();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DataSourceType ElementName: xsd:integer ElementType : max-pool-size
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>max-pool-size</code> element
    * @param maxPoolSize the value for the element <code>max-pool-size</code> 
    * @return the current instance of <code>DataSourceType<T></code> 
    */
   public DataSourceType<T> maxPoolSize(Integer maxPoolSize);

   /**
    * Returns the <code>max-pool-size</code> element
    * @return the node defined for the element <code>max-pool-size</code> 
    */
   public Integer getMaxPoolSize();

   /**
    * Removes the <code>max-pool-size</code> element 
    * @return the current instance of <code>DataSourceType<T></code> 
    */
   public DataSourceType<T> removeMaxPoolSize();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DataSourceType ElementName: xsd:integer ElementType : min-pool-size
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>min-pool-size</code> element
    * @param minPoolSize the value for the element <code>min-pool-size</code> 
    * @return the current instance of <code>DataSourceType<T></code> 
    */
   public DataSourceType<T> minPoolSize(Integer minPoolSize);

   /**
    * Returns the <code>min-pool-size</code> element
    * @return the node defined for the element <code>min-pool-size</code> 
    */
   public Integer getMinPoolSize();

   /**
    * Removes the <code>min-pool-size</code> element 
    * @return the current instance of <code>DataSourceType<T></code> 
    */
   public DataSourceType<T> removeMinPoolSize();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DataSourceType ElementName: xsd:integer ElementType : max-idle-time
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>max-idle-time</code> element
    * @param maxIdleTime the value for the element <code>max-idle-time</code> 
    * @return the current instance of <code>DataSourceType<T></code> 
    */
   public DataSourceType<T> maxIdleTime(Integer maxIdleTime);

   /**
    * Returns the <code>max-idle-time</code> element
    * @return the node defined for the element <code>max-idle-time</code> 
    */
   public Integer getMaxIdleTime();

   /**
    * Removes the <code>max-idle-time</code> element 
    * @return the current instance of <code>DataSourceType<T></code> 
    */
   public DataSourceType<T> removeMaxIdleTime();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DataSourceType ElementName: xsd:integer ElementType : max-statements
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>max-statements</code> element
    * @param maxStatements the value for the element <code>max-statements</code> 
    * @return the current instance of <code>DataSourceType<T></code> 
    */
   public DataSourceType<T> maxStatements(Integer maxStatements);

   /**
    * Returns the <code>max-statements</code> element
    * @return the node defined for the element <code>max-statements</code> 
    */
   public Integer getMaxStatements();

   /**
    * Removes the <code>max-statements</code> element 
    * @return the current instance of <code>DataSourceType<T></code> 
    */
   public DataSourceType<T> removeMaxStatements();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: DataSourceType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>DataSourceType<T></code> 
    */
   public DataSourceType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>DataSourceType<T></code> 
    */
   public DataSourceType<T> removeId();
}
