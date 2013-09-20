package org.jboss.shrinkwrap.descriptor.api.orm20; 

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> persistence-unit-defaults </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface PersistenceUnitDefaults<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PersistenceUnitDefaults ElementName: xsd:string ElementType : description
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>description</code> element
    * @param description the value for the element <code>description</code> 
    * @return the current instance of <code>PersistenceUnitDefaults<T></code> 
    */
   public PersistenceUnitDefaults<T> description(String description);

   /**
    * Returns the <code>description</code> element
    * @return the node defined for the element <code>description</code> 
    */
   public String getDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>PersistenceUnitDefaults<T></code> 
    */
   public PersistenceUnitDefaults<T> removeDescription();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PersistenceUnitDefaults ElementName: xsd:string ElementType : schema
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>schema</code> element
    * @param schema the value for the element <code>schema</code> 
    * @return the current instance of <code>PersistenceUnitDefaults<T></code> 
    */
   public PersistenceUnitDefaults<T> schema(String schema);

   /**
    * Returns the <code>schema</code> element
    * @return the node defined for the element <code>schema</code> 
    */
   public String getSchema();

   /**
    * Removes the <code>schema</code> element 
    * @return the current instance of <code>PersistenceUnitDefaults<T></code> 
    */
   public PersistenceUnitDefaults<T> removeSchema();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PersistenceUnitDefaults ElementName: xsd:string ElementType : catalog
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>catalog</code> element
    * @param catalog the value for the element <code>catalog</code> 
    * @return the current instance of <code>PersistenceUnitDefaults<T></code> 
    */
   public PersistenceUnitDefaults<T> catalog(String catalog);

   /**
    * Returns the <code>catalog</code> element
    * @return the node defined for the element <code>catalog</code> 
    */
   public String getCatalog();

   /**
    * Removes the <code>catalog</code> element 
    * @return the current instance of <code>PersistenceUnitDefaults<T></code> 
    */
   public PersistenceUnitDefaults<T> removeCatalog();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PersistenceUnitDefaults ElementName: javaee:emptyType ElementType : delimited-identifiers
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>delimited-identifiers</code> element 
    * @return the current instance of <code>PersistenceUnitDefaults<T></code> 
    */
   public PersistenceUnitDefaults<T> delimitedIdentifiers();

   /**
    * Removes the <code>delimited-identifiers</code> element 
    * @return the current instance of <code>PersistenceUnitDefaults<T></code> 
    */
   public Boolean isDelimitedIdentifiers();

   /**
    * Removes the <code>delimited-identifiers</code> element 
    * @return the current instance of <code>PersistenceUnitDefaults<T></code> 
    */
   public PersistenceUnitDefaults<T> removeDelimitedIdentifiers();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PersistenceUnitDefaults ElementName: orm:access-type ElementType : access
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>access</code> element
    * @param access the value for the element <code>access</code> 
    * @return the current instance of <code>PersistenceUnitDefaults<T></code> 
    */
   public PersistenceUnitDefaults<T> access(AccessType access);
   /**
    * Sets the <code>access</code> element
    * @param access the value for the element <code>access</code> 
    * @return the current instance of <code>PersistenceUnitDefaults<T></code> 
    */
   public PersistenceUnitDefaults<T> access(String access);

   /**
    * Returns the <code>access</code> element
    * @return the value found for the element <code>access</code> 
    */
   public AccessType getAccess();

   /**
    * Returns the <code>access</code> element
    * @return the value found for the element <code>access</code> 
    */
   public String  getAccessAsString();

   /**
    * Removes the <code>access</code> attribute 
    * @return the current instance of <code>PersistenceUnitDefaults<T></code> 
    */
   public PersistenceUnitDefaults<T> removeAccess();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PersistenceUnitDefaults ElementName: javaee:emptyType ElementType : cascade-persist
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>cascade-persist</code> element 
    * @return the current instance of <code>PersistenceUnitDefaults<T></code> 
    */
   public PersistenceUnitDefaults<T> cascadePersist();

   /**
    * Removes the <code>cascade-persist</code> element 
    * @return the current instance of <code>PersistenceUnitDefaults<T></code> 
    */
   public Boolean isCascadePersist();

   /**
    * Removes the <code>cascade-persist</code> element 
    * @return the current instance of <code>PersistenceUnitDefaults<T></code> 
    */
   public PersistenceUnitDefaults<T> removeCascadePersist();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PersistenceUnitDefaults ElementName: orm:entity-listeners ElementType : entity-listeners
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>entity-listeners</code> element with the given value will be created.
    * Otherwise, the existing <code>entity-listeners</code> element will be returned.
    * @return  a new or existing instance of <code>EntityListeners<PersistenceUnitDefaults<T>></code> 
    */
   public EntityListeners<PersistenceUnitDefaults<T>> getOrCreateEntityListeners();

   /**
    * Removes the <code>entity-listeners</code> element 
    * @return the current instance of <code>PersistenceUnitDefaults<T></code> 
    */
   public PersistenceUnitDefaults<T> removeEntityListeners();
}
