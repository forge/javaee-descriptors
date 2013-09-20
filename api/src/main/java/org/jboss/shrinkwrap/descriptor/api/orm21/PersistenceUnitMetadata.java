package org.jboss.shrinkwrap.descriptor.api.orm21; 

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> persistence-unit-metadata </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface PersistenceUnitMetadata<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PersistenceUnitMetadata ElementName: xsd:string ElementType : description
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>description</code> element
    * @param description the value for the element <code>description</code> 
    * @return the current instance of <code>PersistenceUnitMetadata<T></code> 
    */
   public PersistenceUnitMetadata<T> description(String description);

   /**
    * Returns the <code>description</code> element
    * @return the node defined for the element <code>description</code> 
    */
   public String getDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>PersistenceUnitMetadata<T></code> 
    */
   public PersistenceUnitMetadata<T> removeDescription();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PersistenceUnitMetadata ElementName: javaee:emptyType ElementType : xml-mapping-metadata-complete
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>xml-mapping-metadata-complete</code> element 
    * @return the current instance of <code>PersistenceUnitMetadata<T></code> 
    */
   public PersistenceUnitMetadata<T> xmlMappingMetadataComplete();

   /**
    * Removes the <code>xml-mapping-metadata-complete</code> element 
    * @return the current instance of <code>PersistenceUnitMetadata<T></code> 
    */
   public Boolean isXmlMappingMetadataComplete();

   /**
    * Removes the <code>xml-mapping-metadata-complete</code> element 
    * @return the current instance of <code>PersistenceUnitMetadata<T></code> 
    */
   public PersistenceUnitMetadata<T> removeXmlMappingMetadataComplete();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PersistenceUnitMetadata ElementName: orm:persistence-unit-defaults ElementType : persistence-unit-defaults
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>persistence-unit-defaults</code> element with the given value will be created.
    * Otherwise, the existing <code>persistence-unit-defaults</code> element will be returned.
    * @return  a new or existing instance of <code>PersistenceUnitDefaults<PersistenceUnitMetadata<T>></code> 
    */
   public PersistenceUnitDefaults<PersistenceUnitMetadata<T>> getOrCreatePersistenceUnitDefaults();

   /**
    * Removes the <code>persistence-unit-defaults</code> element 
    * @return the current instance of <code>PersistenceUnitMetadata<T></code> 
    */
   public PersistenceUnitMetadata<T> removePersistenceUnitDefaults();
}
