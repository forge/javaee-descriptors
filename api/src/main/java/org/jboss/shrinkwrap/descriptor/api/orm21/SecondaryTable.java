package org.jboss.shrinkwrap.descriptor.api.orm21; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.orm21.PrimaryKeyJoinColumn;
import org.jboss.shrinkwrap.descriptor.api.orm21.ForeignKey;
import org.jboss.shrinkwrap.descriptor.api.orm21.UniqueConstraint;
import org.jboss.shrinkwrap.descriptor.api.orm21.Index;
/**
 * This interface defines the contract for the <code> secondary-table </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface SecondaryTable<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SecondaryTable ElementName: orm:primary-key-join-column ElementType : primary-key-join-column
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>primary-key-join-column</code> element will be created and returned.
    * Otherwise, the first existing <code>primary-key-join-column</code> element will be returned.
    * @return the instance defined for the element <code>primary-key-join-column</code> 
    */
   public PrimaryKeyJoinColumn<SecondaryTable<T>> getOrCreatePrimaryKeyJoinColumn();

   /**
    * Creates a new <code>primary-key-join-column</code> element 
    * @return the new created instance of <code>PrimaryKeyJoinColumn<SecondaryTable<T>></code> 
    */
   public PrimaryKeyJoinColumn<SecondaryTable<T>> createPrimaryKeyJoinColumn();

   /**
    * Returns all <code>primary-key-join-column</code> elements
    * @return list of <code>primary-key-join-column</code> 
    */
   public List<PrimaryKeyJoinColumn<SecondaryTable<T>>> getAllPrimaryKeyJoinColumn();

   /**
    * Removes all <code>primary-key-join-column</code> elements 
    * @return the current instance of <code>PrimaryKeyJoinColumn<SecondaryTable<T>></code> 
    */
   public SecondaryTable<T> removeAllPrimaryKeyJoinColumn();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SecondaryTable ElementName: orm:foreign-key ElementType : primary-key-foreign-key
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>primary-key-foreign-key</code> element with the given value will be created.
    * Otherwise, the existing <code>primary-key-foreign-key</code> element will be returned.
    * @return  a new or existing instance of <code>ForeignKey<SecondaryTable<T>></code> 
    */
   public ForeignKey<SecondaryTable<T>> getOrCreatePrimaryKeyForeignKey();

   /**
    * Removes the <code>primary-key-foreign-key</code> element 
    * @return the current instance of <code>SecondaryTable<T></code> 
    */
   public SecondaryTable<T> removePrimaryKeyForeignKey();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SecondaryTable ElementName: orm:unique-constraint ElementType : unique-constraint
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>unique-constraint</code> element will be created and returned.
    * Otherwise, the first existing <code>unique-constraint</code> element will be returned.
    * @return the instance defined for the element <code>unique-constraint</code> 
    */
   public UniqueConstraint<SecondaryTable<T>> getOrCreateUniqueConstraint();

   /**
    * Creates a new <code>unique-constraint</code> element 
    * @return the new created instance of <code>UniqueConstraint<SecondaryTable<T>></code> 
    */
   public UniqueConstraint<SecondaryTable<T>> createUniqueConstraint();

   /**
    * Returns all <code>unique-constraint</code> elements
    * @return list of <code>unique-constraint</code> 
    */
   public List<UniqueConstraint<SecondaryTable<T>>> getAllUniqueConstraint();

   /**
    * Removes all <code>unique-constraint</code> elements 
    * @return the current instance of <code>UniqueConstraint<SecondaryTable<T>></code> 
    */
   public SecondaryTable<T> removeAllUniqueConstraint();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SecondaryTable ElementName: orm:index ElementType : index
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>index</code> element will be created and returned.
    * Otherwise, the first existing <code>index</code> element will be returned.
    * @return the instance defined for the element <code>index</code> 
    */
   public Index<SecondaryTable<T>> getOrCreateIndex();

   /**
    * Creates a new <code>index</code> element 
    * @return the new created instance of <code>Index<SecondaryTable<T>></code> 
    */
   public Index<SecondaryTable<T>> createIndex();

   /**
    * Returns all <code>index</code> elements
    * @return list of <code>index</code> 
    */
   public List<Index<SecondaryTable<T>>> getAllIndex();

   /**
    * Removes all <code>index</code> elements 
    * @return the current instance of <code>Index<SecondaryTable<T>></code> 
    */
   public SecondaryTable<T> removeAllIndex();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SecondaryTable ElementName: xsd:string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>SecondaryTable<T></code> 
    */
   public SecondaryTable<T> name(String name);

   /**
    * Returns the <code>name</code> attribute
    * @return the value defined for the attribute <code>name</code> 
    */
   public String getName();

   /**
    * Removes the <code>name</code> attribute 
    * @return the current instance of <code>SecondaryTable<T></code> 
    */
   public SecondaryTable<T> removeName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SecondaryTable ElementName: xsd:string ElementType : catalog
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>catalog</code> attribute
    * @param catalog the value for the attribute <code>catalog</code> 
    * @return the current instance of <code>SecondaryTable<T></code> 
    */
   public SecondaryTable<T> catalog(String catalog);

   /**
    * Returns the <code>catalog</code> attribute
    * @return the value defined for the attribute <code>catalog</code> 
    */
   public String getCatalog();

   /**
    * Removes the <code>catalog</code> attribute 
    * @return the current instance of <code>SecondaryTable<T></code> 
    */
   public SecondaryTable<T> removeCatalog();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SecondaryTable ElementName: xsd:string ElementType : schema
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>schema</code> attribute
    * @param schema the value for the attribute <code>schema</code> 
    * @return the current instance of <code>SecondaryTable<T></code> 
    */
   public SecondaryTable<T> schema(String schema);

   /**
    * Returns the <code>schema</code> attribute
    * @return the value defined for the attribute <code>schema</code> 
    */
   public String getSchema();

   /**
    * Removes the <code>schema</code> attribute 
    * @return the current instance of <code>SecondaryTable<T></code> 
    */
   public SecondaryTable<T> removeSchema();
}
