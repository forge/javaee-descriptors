package org.jboss.shrinkwrap.descriptor.api.orm10; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.orm10.FieldResult;
/**
 * This interface defines the contract for the <code> entity-result </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface EntityResult<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityResult ElementName: orm:field-result ElementType : field-result
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>field-result</code> element will be created and returned.
    * Otherwise, the first existing <code>field-result</code> element will be returned.
    * @return the instance defined for the element <code>field-result</code> 
    */
   public FieldResult<EntityResult<T>> getOrCreateFieldResult();

   /**
    * Creates a new <code>field-result</code> element 
    * @return the new created instance of <code>FieldResult<EntityResult<T>></code> 
    */
   public FieldResult<EntityResult<T>> createFieldResult();

   /**
    * Returns all <code>field-result</code> elements
    * @return list of <code>field-result</code> 
    */
   public List<FieldResult<EntityResult<T>>> getAllFieldResult();

   /**
    * Removes all <code>field-result</code> elements 
    * @return the current instance of <code>FieldResult<EntityResult<T>></code> 
    */
   public EntityResult<T> removeAllFieldResult();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityResult ElementName: xsd:string ElementType : entity-class
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>entity-class</code> attribute
    * @param entityClass the value for the attribute <code>entity-class</code> 
    * @return the current instance of <code>EntityResult<T></code> 
    */
   public EntityResult<T> entityClass(String entityClass);

   /**
    * Returns the <code>entity-class</code> attribute
    * @return the value defined for the attribute <code>entity-class</code> 
    */
   public String getEntityClass();

   /**
    * Removes the <code>entity-class</code> attribute 
    * @return the current instance of <code>EntityResult<T></code> 
    */
   public EntityResult<T> removeEntityClass();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: EntityResult ElementName: xsd:string ElementType : discriminator-column
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>discriminator-column</code> attribute
    * @param discriminatorColumn the value for the attribute <code>discriminator-column</code> 
    * @return the current instance of <code>EntityResult<T></code> 
    */
   public EntityResult<T> discriminatorColumn(String discriminatorColumn);

   /**
    * Returns the <code>discriminator-column</code> attribute
    * @return the value defined for the attribute <code>discriminator-column</code> 
    */
   public String getDiscriminatorColumn();

   /**
    * Removes the <code>discriminator-column</code> attribute 
    * @return the current instance of <code>EntityResult<T></code> 
    */
   public EntityResult<T> removeDiscriminatorColumn();
}
