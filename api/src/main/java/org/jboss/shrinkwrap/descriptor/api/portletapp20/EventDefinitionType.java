package org.jboss.shrinkwrap.descriptor.api.portletapp20; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> event-definitionType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface EventDefinitionType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EventDefinitionType ElementName: string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>EventDefinitionType<T></code> 
    */
   public EventDefinitionType<T> description(String ... values);

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>EventDefinitionType<T></code> 
    */
   public EventDefinitionType<T> removeAllDescription();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EventDefinitionType ElementName: xsd:QName ElementType : qname
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>qname</code> element
    * @param qname the value for the element <code>qname</code> 
    * @return the current instance of <code>EventDefinitionType<T></code> 
    */
   public EventDefinitionType<T> qname(String qname);

   /**
    * Returns the <code>qname</code> element
    * @return the node defined for the element <code>qname</code> 
    */
   public String getQname();

   /**
    * Removes the <code>qname</code> element 
    * @return the current instance of <code>EventDefinitionType<T></code> 
    */
   public EventDefinitionType<T> removeQname();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EventDefinitionType ElementName: xsd:NCName ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> element
    * @param name the value for the element <code>name</code> 
    * @return the current instance of <code>EventDefinitionType<T></code> 
    */
   public EventDefinitionType<T> name(String name);

   /**
    * Returns the <code>name</code> element
    * @return the node defined for the element <code>name</code> 
    */
   public String getName();

   /**
    * Removes the <code>name</code> element 
    * @return the current instance of <code>EventDefinitionType<T></code> 
    */
   public EventDefinitionType<T> removeName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EventDefinitionType ElementName: xsd:QName ElementType : alias
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>alias</code> elements, 
    * a new <code>alias</code> element 
    * @param values list of <code>alias</code> objects 
    * @return the current instance of <code>EventDefinitionType<T></code> 
    */
   public EventDefinitionType<T> alias(String ... values);

   /**
    * Returns all <code>alias</code> elements
    * @return list of <code>alias</code> 
    */
   public List<String> getAllAlias();

   /**
    * Removes the <code>alias</code> element 
    * @return the current instance of <code>EventDefinitionType<T></code> 
    */
   public EventDefinitionType<T> removeAllAlias();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EventDefinitionType ElementName: string ElementType : value-type
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>value-type</code> element
    * @param valueType the value for the element <code>value-type</code> 
    * @return the current instance of <code>EventDefinitionType<T></code> 
    */
   public EventDefinitionType<T> valueType(String valueType);

   /**
    * Returns the <code>value-type</code> element
    * @return the node defined for the element <code>value-type</code> 
    */
   public String getValueType();

   /**
    * Removes the <code>value-type</code> element 
    * @return the current instance of <code>EventDefinitionType<T></code> 
    */
   public EventDefinitionType<T> removeValueType();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EventDefinitionType ElementName: string ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>EventDefinitionType<T></code> 
    */
   public EventDefinitionType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>EventDefinitionType<T></code> 
    */
   public EventDefinitionType<T> removeId();
}
