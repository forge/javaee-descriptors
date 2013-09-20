package org.jboss.shrinkwrap.descriptor.api.orm21; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> collection-table </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface CollectionTable<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: CollectionTable ElementName: orm:join-column ElementType : join-column
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>join-column</code> element will be created and returned.
    * Otherwise, the first existing <code>join-column</code> element will be returned.
    * @return the instance defined for the element <code>join-column</code> 
    */
   public JoinColumn<CollectionTable<T>> getOrCreateJoinColumn();

   /**
    * Creates a new <code>join-column</code> element 
    * @return the new created instance of <code>JoinColumn<CollectionTable<T>></code> 
    */
   public JoinColumn<CollectionTable<T>> createJoinColumn();

   /**
    * Returns all <code>join-column</code> elements
    * @return list of <code>join-column</code> 
    */
   public List<JoinColumn<CollectionTable<T>>> getAllJoinColumn();

   /**
    * Removes all <code>join-column</code> elements 
    * @return the current instance of <code>JoinColumn<CollectionTable<T>></code> 
    */
   public CollectionTable<T> removeAllJoinColumn();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: CollectionTable ElementName: orm:foreign-key ElementType : foreign-key
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>foreign-key</code> element with the given value will be created.
    * Otherwise, the existing <code>foreign-key</code> element will be returned.
    * @return  a new or existing instance of <code>ForeignKey<CollectionTable<T>></code> 
    */
   public ForeignKey<CollectionTable<T>> getOrCreateForeignKey();

   /**
    * Removes the <code>foreign-key</code> element 
    * @return the current instance of <code>CollectionTable<T></code> 
    */
   public CollectionTable<T> removeForeignKey();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: CollectionTable ElementName: orm:unique-constraint ElementType : unique-constraint
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>unique-constraint</code> element will be created and returned.
    * Otherwise, the first existing <code>unique-constraint</code> element will be returned.
    * @return the instance defined for the element <code>unique-constraint</code> 
    */
   public UniqueConstraint<CollectionTable<T>> getOrCreateUniqueConstraint();

   /**
    * Creates a new <code>unique-constraint</code> element 
    * @return the new created instance of <code>UniqueConstraint<CollectionTable<T>></code> 
    */
   public UniqueConstraint<CollectionTable<T>> createUniqueConstraint();

   /**
    * Returns all <code>unique-constraint</code> elements
    * @return list of <code>unique-constraint</code> 
    */
   public List<UniqueConstraint<CollectionTable<T>>> getAllUniqueConstraint();

   /**
    * Removes all <code>unique-constraint</code> elements 
    * @return the current instance of <code>UniqueConstraint<CollectionTable<T>></code> 
    */
   public CollectionTable<T> removeAllUniqueConstraint();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: CollectionTable ElementName: orm:index ElementType : index
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>index</code> element will be created and returned.
    * Otherwise, the first existing <code>index</code> element will be returned.
    * @return the instance defined for the element <code>index</code> 
    */
   public Index<CollectionTable<T>> getOrCreateIndex();

   /**
    * Creates a new <code>index</code> element 
    * @return the new created instance of <code>Index<CollectionTable<T>></code> 
    */
   public Index<CollectionTable<T>> createIndex();

   /**
    * Returns all <code>index</code> elements
    * @return list of <code>index</code> 
    */
   public List<Index<CollectionTable<T>>> getAllIndex();

   /**
    * Removes all <code>index</code> elements 
    * @return the current instance of <code>Index<CollectionTable<T>></code> 
    */
   public CollectionTable<T> removeAllIndex();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: CollectionTable ElementName: xsd:string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>CollectionTable<T></code> 
    */
   public CollectionTable<T> name(String name);

   /**
    * Returns the <code>name</code> attribute
    * @return the value defined for the attribute <code>name</code> 
    */
   public String getName();

   /**
    * Removes the <code>name</code> attribute 
    * @return the current instance of <code>CollectionTable<T></code> 
    */
   public CollectionTable<T> removeName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: CollectionTable ElementName: xsd:string ElementType : catalog
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>catalog</code> attribute
    * @param catalog the value for the attribute <code>catalog</code> 
    * @return the current instance of <code>CollectionTable<T></code> 
    */
   public CollectionTable<T> catalog(String catalog);

   /**
    * Returns the <code>catalog</code> attribute
    * @return the value defined for the attribute <code>catalog</code> 
    */
   public String getCatalog();

   /**
    * Removes the <code>catalog</code> attribute 
    * @return the current instance of <code>CollectionTable<T></code> 
    */
   public CollectionTable<T> removeCatalog();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: CollectionTable ElementName: xsd:string ElementType : schema
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>schema</code> attribute
    * @param schema the value for the attribute <code>schema</code> 
    * @return the current instance of <code>CollectionTable<T></code> 
    */
   public CollectionTable<T> schema(String schema);

   /**
    * Returns the <code>schema</code> attribute
    * @return the value defined for the attribute <code>schema</code> 
    */
   public String getSchema();

   /**
    * Removes the <code>schema</code> attribute 
    * @return the current instance of <code>CollectionTable<T></code> 
    */
   public CollectionTable<T> removeSchema();
}
