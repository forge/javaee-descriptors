package org.jboss.shrinkwrap.descriptor.api.portletapp20; 

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> event-definition-referenceType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface EventDefinitionReferenceType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EventDefinitionReferenceType ElementName: xsd:QName ElementType : qname
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>qname</code> element
    * @param qname the value for the element <code>qname</code> 
    * @return the current instance of <code>EventDefinitionReferenceType<T></code> 
    */
   public EventDefinitionReferenceType<T> qname(String qname);

   /**
    * Returns the <code>qname</code> element
    * @return the node defined for the element <code>qname</code> 
    */
   public String getQname();

   /**
    * Removes the <code>qname</code> element 
    * @return the current instance of <code>EventDefinitionReferenceType<T></code> 
    */
   public EventDefinitionReferenceType<T> removeQname();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EventDefinitionReferenceType ElementName: xsd:NCName ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> element
    * @param name the value for the element <code>name</code> 
    * @return the current instance of <code>EventDefinitionReferenceType<T></code> 
    */
   public EventDefinitionReferenceType<T> name(String name);

   /**
    * Returns the <code>name</code> element
    * @return the node defined for the element <code>name</code> 
    */
   public String getName();

   /**
    * Removes the <code>name</code> element 
    * @return the current instance of <code>EventDefinitionReferenceType<T></code> 
    */
   public EventDefinitionReferenceType<T> removeName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EventDefinitionReferenceType ElementName: string ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>EventDefinitionReferenceType<T></code> 
    */
   public EventDefinitionReferenceType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>EventDefinitionReferenceType<T></code> 
    */
   public EventDefinitionReferenceType<T> removeId();
}
