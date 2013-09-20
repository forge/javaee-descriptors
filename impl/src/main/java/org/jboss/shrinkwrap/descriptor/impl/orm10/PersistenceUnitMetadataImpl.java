package org.jboss.shrinkwrap.descriptor.impl.orm10; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.orm10.PersistenceUnitDefaults;
import org.jboss.shrinkwrap.descriptor.api.orm10.PersistenceUnitMetadata;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> persistence-unit-metadata </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class PersistenceUnitMetadataImpl<T> implements Child<T>, PersistenceUnitMetadata<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public PersistenceUnitMetadataImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public PersistenceUnitMetadataImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PersistenceUnitMetadata ElementName: javaee:emptyType ElementType : xml-mapping-metadata-complete
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>xml-mapping-metadata-complete</code> element 
    * @return the current instance of <code>PersistenceUnitMetadata<T></code> 
    */
   public PersistenceUnitMetadata<T> xmlMappingMetadataComplete()
   {
      childNode.getOrCreate("xml-mapping-metadata-complete");
      return this;
   }

   /**
    * Removes the <code>xml-mapping-metadata-complete</code> element 
    * @return the current instance of <code>PersistenceUnitMetadata<T></code> 
    */
   public Boolean isXmlMappingMetadataComplete()
   {
      return childNode.getSingle("xml-mapping-metadata-complete") != null;
   }

   /**
    * Removes the <code>xml-mapping-metadata-complete</code> element 
    * @return the current instance of <code>PersistenceUnitMetadata<T></code> 
    */
   public PersistenceUnitMetadata<T> removeXmlMappingMetadataComplete()
   {
      childNode.removeChild("xml-mapping-metadata-complete");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PersistenceUnitMetadata ElementName: orm:persistence-unit-defaults ElementType : persistence-unit-defaults
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>persistence-unit-defaults</code> element with the given value will be created.
    * Otherwise, the existing <code>persistence-unit-defaults</code> element will be returned.
    * @return  a new or existing instance of <code>PersistenceUnitDefaults<PersistenceUnitMetadata<T>></code> 
    */
   public PersistenceUnitDefaults<PersistenceUnitMetadata<T>> getOrCreatePersistenceUnitDefaults()
   {
      Node node = childNode.getOrCreate("persistence-unit-defaults");
      PersistenceUnitDefaults<PersistenceUnitMetadata<T>> persistenceUnitDefaults = new PersistenceUnitDefaultsImpl<PersistenceUnitMetadata<T>>(this, "persistence-unit-defaults", childNode, node);
      return persistenceUnitDefaults;
   }

   /**
    * Removes the <code>persistence-unit-defaults</code> element 
    * @return the current instance of <code>PersistenceUnitMetadata<T></code> 
    */
   public PersistenceUnitMetadata<T> removePersistenceUnitDefaults()
   {
      childNode.removeChildren("persistence-unit-defaults");
      return this;
   }
}
