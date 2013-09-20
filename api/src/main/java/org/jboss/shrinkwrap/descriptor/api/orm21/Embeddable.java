package org.jboss.shrinkwrap.descriptor.api.orm21; 

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> embeddable </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface Embeddable<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Embeddable ElementName: xsd:string ElementType : description
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>description</code> element
    * @param description the value for the element <code>description</code> 
    * @return the current instance of <code>Embeddable<T></code> 
    */
   public Embeddable<T> description(String description);

   /**
    * Returns the <code>description</code> element
    * @return the node defined for the element <code>description</code> 
    */
   public String getDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>Embeddable<T></code> 
    */
   public Embeddable<T> removeDescription();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Embeddable ElementName: orm:embeddable-attributes ElementType : attributes
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>attributes</code> element with the given value will be created.
    * Otherwise, the existing <code>attributes</code> element will be returned.
    * @return  a new or existing instance of <code>EmbeddableAttributes<Embeddable<T>></code> 
    */
   public EmbeddableAttributes<Embeddable<T>> getOrCreateAttributes();

   /**
    * Removes the <code>attributes</code> element 
    * @return the current instance of <code>Embeddable<T></code> 
    */
   public Embeddable<T> removeAttributes();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Embeddable ElementName: xsd:string ElementType : class
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>class</code> attribute
    * @param clazz the value for the attribute <code>class</code> 
    * @return the current instance of <code>Embeddable<T></code> 
    */
   public Embeddable<T> clazz(String clazz);

   /**
    * Returns the <code>class</code> attribute
    * @return the value defined for the attribute <code>class</code> 
    */
   public String getClazz();

   /**
    * Removes the <code>class</code> attribute 
    * @return the current instance of <code>Embeddable<T></code> 
    */
   public Embeddable<T> removeClazzAttr();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Embeddable ElementName: orm:access-type ElementType : access
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>access</code> attribute
    * @param access the value for the attribute <code>access</code> 
    * @return the current instance of <code>Embeddable<T></code> 
    */
   public Embeddable<T> access(AccessType access);

   /**
    * Sets the <code>access</code> attribute
    * @param access the value for the attribute <code>access</code> 
    * @return the current instance of <code>Embeddable<T></code> 
    */
   public Embeddable<T> access(String access);

   /**
    * Returns the <code>access</code> attribute
    * @return the value defined for the attribute <code>access</code> 
    */
public AccessType getAccess();

   /**
    * Returns the <code>access</code> attribute
    * @return the value found for the element <code>access</code> 
    */
   public String  getAccessAsString();

   /**
    * Removes the <code>access</code> attribute 
    * @return the current instance of <code>Embeddable<T></code> 
    */
   public Embeddable<T> removeAccess();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Embeddable ElementName: xsd:boolean ElementType : metadata-complete
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>metadata-complete</code> attribute
    * @param metadataComplete the value for the attribute <code>metadata-complete</code> 
    * @return the current instance of <code>Embeddable<T></code> 
    */
   public Embeddable<T> metadataComplete(Boolean metadataComplete);

   /**
    * Returns the <code>metadata-complete</code> attribute
    * @return the value defined for the attribute <code>metadata-complete</code> 
    */
public Boolean isMetadataComplete();

   /**
    * Removes the <code>metadata-complete</code> attribute 
    * @return the current instance of <code>Embeddable<T></code> 
    */
   public Embeddable<T> removeMetadataComplete();
}
