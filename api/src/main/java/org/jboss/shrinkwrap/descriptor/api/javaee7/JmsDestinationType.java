package org.jboss.shrinkwrap.descriptor.api.javaee7; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> jms-destinationType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface JmsDestinationType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JmsDestinationType ElementName: xsd:string ElementType : description
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>description</code> element
    * @param description the value for the element <code>description</code> 
    * @return the current instance of <code>JmsDestinationType<T></code> 
    */
   public JmsDestinationType<T> description(String description);

   /**
    * Returns the <code>description</code> element
    * @return the node defined for the element <code>description</code> 
    */
   public String getDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>JmsDestinationType<T></code> 
    */
   public JmsDestinationType<T> removeDescription();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JmsDestinationType ElementName: xsd:token ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> element
    * @param name the value for the element <code>name</code> 
    * @return the current instance of <code>JmsDestinationType<T></code> 
    */
   public JmsDestinationType<T> name(String name);

   /**
    * Returns the <code>name</code> element
    * @return the node defined for the element <code>name</code> 
    */
   public String getName();

   /**
    * Removes the <code>name</code> element 
    * @return the current instance of <code>JmsDestinationType<T></code> 
    */
   public JmsDestinationType<T> removeName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JmsDestinationType ElementName: xsd:token ElementType : interface-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>interface-name</code> element
    * @param interfaceName the value for the element <code>interface-name</code> 
    * @return the current instance of <code>JmsDestinationType<T></code> 
    */
   public JmsDestinationType<T> interfaceName(String interfaceName);

   /**
    * Returns the <code>interface-name</code> element
    * @return the node defined for the element <code>interface-name</code> 
    */
   public String getInterfaceName();

   /**
    * Removes the <code>interface-name</code> element 
    * @return the current instance of <code>JmsDestinationType<T></code> 
    */
   public JmsDestinationType<T> removeInterfaceName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JmsDestinationType ElementName: xsd:token ElementType : class-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>class-name</code> element
    * @param className the value for the element <code>class-name</code> 
    * @return the current instance of <code>JmsDestinationType<T></code> 
    */
   public JmsDestinationType<T> className(String className);

   /**
    * Returns the <code>class-name</code> element
    * @return the node defined for the element <code>class-name</code> 
    */
   public String getClassName();

   /**
    * Removes the <code>class-name</code> element 
    * @return the current instance of <code>JmsDestinationType<T></code> 
    */
   public JmsDestinationType<T> removeClassName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JmsDestinationType ElementName: xsd:token ElementType : resource-adapter
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>resource-adapter</code> element
    * @param resourceAdapter the value for the element <code>resource-adapter</code> 
    * @return the current instance of <code>JmsDestinationType<T></code> 
    */
   public JmsDestinationType<T> resourceAdapter(String resourceAdapter);

   /**
    * Returns the <code>resource-adapter</code> element
    * @return the node defined for the element <code>resource-adapter</code> 
    */
   public String getResourceAdapter();

   /**
    * Removes the <code>resource-adapter</code> element 
    * @return the current instance of <code>JmsDestinationType<T></code> 
    */
   public JmsDestinationType<T> removeResourceAdapter();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JmsDestinationType ElementName: xsd:token ElementType : destination-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>destination-name</code> element
    * @param destinationName the value for the element <code>destination-name</code> 
    * @return the current instance of <code>JmsDestinationType<T></code> 
    */
   public JmsDestinationType<T> destinationName(String destinationName);

   /**
    * Returns the <code>destination-name</code> element
    * @return the node defined for the element <code>destination-name</code> 
    */
   public String getDestinationName();

   /**
    * Removes the <code>destination-name</code> element 
    * @return the current instance of <code>JmsDestinationType<T></code> 
    */
   public JmsDestinationType<T> removeDestinationName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JmsDestinationType ElementName: javaee:propertyType ElementType : property
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>property</code> element will be created and returned.
    * Otherwise, the first existing <code>property</code> element will be returned.
    * @return the instance defined for the element <code>property</code> 
    */
   public PropertyType<JmsDestinationType<T>> getOrCreateProperty();

   /**
    * Creates a new <code>property</code> element 
    * @return the new created instance of <code>PropertyType<JmsDestinationType<T>></code> 
    */
   public PropertyType<JmsDestinationType<T>> createProperty();

   /**
    * Returns all <code>property</code> elements
    * @return list of <code>property</code> 
    */
   public List<PropertyType<JmsDestinationType<T>>> getAllProperty();

   /**
    * Removes all <code>property</code> elements 
    * @return the current instance of <code>PropertyType<JmsDestinationType<T>></code> 
    */
   public JmsDestinationType<T> removeAllProperty();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JmsDestinationType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>JmsDestinationType<T></code> 
    */
   public JmsDestinationType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>JmsDestinationType<T></code> 
    */
   public JmsDestinationType<T> removeId();
}
