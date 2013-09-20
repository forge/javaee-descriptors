package org.jboss.shrinkwrap.descriptor.impl.orm20; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.orm20.PersistenceUnitMetadata;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.javaee6.EmptyType;
import org.jboss.shrinkwrap.descriptor.impl.javaee6.EmptyTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.orm20.PersistenceUnitDefaults;
import org.jboss.shrinkwrap.descriptor.impl.orm20.PersistenceUnitDefaultsImpl;

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
   // ClassName: PersistenceUnitMetadata ElementName: xsd:string ElementType : description
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>description</code> element
    * @param description the value for the element <code>description</code> 
    * @return the current instance of <code>PersistenceUnitMetadata<T></code> 
    */
   public PersistenceUnitMetadata<T> description(String description)
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
    * @return the current instance of <code>PersistenceUnitMetadata<T></code> 
    */
   public PersistenceUnitMetadata<T> removeDescription()
   {
      childNode.removeChildren("description");
      return this;
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
