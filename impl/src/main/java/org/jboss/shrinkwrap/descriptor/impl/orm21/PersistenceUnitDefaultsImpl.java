package org.jboss.shrinkwrap.descriptor.impl.orm21; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.orm21.PersistenceUnitDefaults;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.javaee7.EmptyType;
import org.jboss.shrinkwrap.descriptor.impl.javaee7.EmptyTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.orm21.AccessType;
import org.jboss.shrinkwrap.descriptor.api.javaee7.EmptyType;
import org.jboss.shrinkwrap.descriptor.impl.javaee7.EmptyTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.orm21.EntityListeners;
import org.jboss.shrinkwrap.descriptor.impl.orm21.EntityListenersImpl;

/**
 * This class implements the <code> persistence-unit-defaults </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class PersistenceUnitDefaultsImpl<T> implements Child<T>, PersistenceUnitDefaults<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public PersistenceUnitDefaultsImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public PersistenceUnitDefaultsImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PersistenceUnitDefaults ElementName: xsd:string ElementType : description
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>description</code> element
    * @param description the value for the element <code>description</code> 
    * @return the current instance of <code>PersistenceUnitDefaults<T></code> 
    */
   public PersistenceUnitDefaults<T> description(String description)
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
    * @return the current instance of <code>PersistenceUnitDefaults<T></code> 
    */
   public PersistenceUnitDefaults<T> removeDescription()
   {
      childNode.removeChildren("description");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PersistenceUnitDefaults ElementName: xsd:string ElementType : schema
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>schema</code> element
    * @param schema the value for the element <code>schema</code> 
    * @return the current instance of <code>PersistenceUnitDefaults<T></code> 
    */
   public PersistenceUnitDefaults<T> schema(String schema)
   {
      childNode.getOrCreate("schema").text(schema);
      return this;
   }

   /**
    * Returns the <code>schema</code> element
    * @return the node defined for the element <code>schema</code> 
    */
   public String getSchema()
   {
      return childNode.getTextValueForPatternName("schema");
   }

   /**
    * Removes the <code>schema</code> element 
    * @return the current instance of <code>PersistenceUnitDefaults<T></code> 
    */
   public PersistenceUnitDefaults<T> removeSchema()
   {
      childNode.removeChildren("schema");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PersistenceUnitDefaults ElementName: xsd:string ElementType : catalog
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>catalog</code> element
    * @param catalog the value for the element <code>catalog</code> 
    * @return the current instance of <code>PersistenceUnitDefaults<T></code> 
    */
   public PersistenceUnitDefaults<T> catalog(String catalog)
   {
      childNode.getOrCreate("catalog").text(catalog);
      return this;
   }

   /**
    * Returns the <code>catalog</code> element
    * @return the node defined for the element <code>catalog</code> 
    */
   public String getCatalog()
   {
      return childNode.getTextValueForPatternName("catalog");
   }

   /**
    * Removes the <code>catalog</code> element 
    * @return the current instance of <code>PersistenceUnitDefaults<T></code> 
    */
   public PersistenceUnitDefaults<T> removeCatalog()
   {
      childNode.removeChildren("catalog");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PersistenceUnitDefaults ElementName: javaee:emptyType ElementType : delimited-identifiers
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>delimited-identifiers</code> element 
    * @return the current instance of <code>PersistenceUnitDefaults<T></code> 
    */
   public PersistenceUnitDefaults<T> delimitedIdentifiers()
   {
      childNode.getOrCreate("delimited-identifiers");
      return this;
   }

   /**
    * Removes the <code>delimited-identifiers</code> element 
    * @return the current instance of <code>PersistenceUnitDefaults<T></code> 
    */
   public Boolean isDelimitedIdentifiers()
   {
      return childNode.getSingle("delimited-identifiers") != null;
   }

   /**
    * Removes the <code>delimited-identifiers</code> element 
    * @return the current instance of <code>PersistenceUnitDefaults<T></code> 
    */
   public PersistenceUnitDefaults<T> removeDelimitedIdentifiers()
   {
      childNode.removeChild("delimited-identifiers");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PersistenceUnitDefaults ElementName: orm:access-type ElementType : access
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>access</code> element
    * @param access the value for the element <code>access</code> 
    * @return the current instance of <code>PersistenceUnitDefaults<T></code> 
    */
   public PersistenceUnitDefaults<T> access(AccessType access)
   {
      childNode.getOrCreate("access").text(access);
      return this;
   }
   /**
    * Sets the <code>access</code> element
    * @param access the value for the element <code>access</code> 
    * @return the current instance of <code>PersistenceUnitDefaults<T></code> 
    */
   public PersistenceUnitDefaults<T> access(String access)
   {
      childNode.getOrCreate("access").text(access);
      return this;
   }

   /**
    * Returns the <code>access</code> element
    * @return the value found for the element <code>access</code> 
    */
   public AccessType getAccess()
   {
      return AccessType.getFromStringValue(childNode.getTextValueForPatternName("access"));
   }

   /**
    * Returns the <code>access</code> element
    * @return the value found for the element <code>access</code> 
    */
   public String  getAccessAsString()
   {
      return childNode.getTextValueForPatternName("access");
   }

   /**
    * Removes the <code>access</code> attribute 
    * @return the current instance of <code>PersistenceUnitDefaults<T></code> 
    */
   public PersistenceUnitDefaults<T> removeAccess()
   {
      childNode.removeAttribute("access");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PersistenceUnitDefaults ElementName: javaee:emptyType ElementType : cascade-persist
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>cascade-persist</code> element 
    * @return the current instance of <code>PersistenceUnitDefaults<T></code> 
    */
   public PersistenceUnitDefaults<T> cascadePersist()
   {
      childNode.getOrCreate("cascade-persist");
      return this;
   }

   /**
    * Removes the <code>cascade-persist</code> element 
    * @return the current instance of <code>PersistenceUnitDefaults<T></code> 
    */
   public Boolean isCascadePersist()
   {
      return childNode.getSingle("cascade-persist") != null;
   }

   /**
    * Removes the <code>cascade-persist</code> element 
    * @return the current instance of <code>PersistenceUnitDefaults<T></code> 
    */
   public PersistenceUnitDefaults<T> removeCascadePersist()
   {
      childNode.removeChild("cascade-persist");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PersistenceUnitDefaults ElementName: orm:entity-listeners ElementType : entity-listeners
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>entity-listeners</code> element with the given value will be created.
    * Otherwise, the existing <code>entity-listeners</code> element will be returned.
    * @return  a new or existing instance of <code>EntityListeners<PersistenceUnitDefaults<T>></code> 
    */
   public EntityListeners<PersistenceUnitDefaults<T>> getOrCreateEntityListeners()
   {
      Node node = childNode.getOrCreate("entity-listeners");
      EntityListeners<PersistenceUnitDefaults<T>> entityListeners = new EntityListenersImpl<PersistenceUnitDefaults<T>>(this, "entity-listeners", childNode, node);
      return entityListeners;
   }

   /**
    * Removes the <code>entity-listeners</code> element 
    * @return the current instance of <code>PersistenceUnitDefaults<T></code> 
    */
   public PersistenceUnitDefaults<T> removeEntityListeners()
   {
      childNode.removeChildren("entity-listeners");
      return this;
   }
}
