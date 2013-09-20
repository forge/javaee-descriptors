package org.jboss.shrinkwrap.descriptor.api.orm10; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.orm10.JoinColumn;
import org.jboss.shrinkwrap.descriptor.api.orm10.JoinColumn;
import org.jboss.shrinkwrap.descriptor.api.orm10.UniqueConstraint;
/**
 * This interface defines the contract for the <code> join-table </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface JoinTable<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JoinTable ElementName: orm:join-column ElementType : join-column
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>join-column</code> element will be created and returned.
    * Otherwise, the first existing <code>join-column</code> element will be returned.
    * @return the instance defined for the element <code>join-column</code> 
    */
   public JoinColumn<JoinTable<T>> getOrCreateJoinColumn();

   /**
    * Creates a new <code>join-column</code> element 
    * @return the new created instance of <code>JoinColumn<JoinTable<T>></code> 
    */
   public JoinColumn<JoinTable<T>> createJoinColumn();

   /**
    * Returns all <code>join-column</code> elements
    * @return list of <code>join-column</code> 
    */
   public List<JoinColumn<JoinTable<T>>> getAllJoinColumn();

   /**
    * Removes all <code>join-column</code> elements 
    * @return the current instance of <code>JoinColumn<JoinTable<T>></code> 
    */
   public JoinTable<T> removeAllJoinColumn();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JoinTable ElementName: orm:join-column ElementType : inverse-join-column
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>inverse-join-column</code> element will be created and returned.
    * Otherwise, the first existing <code>inverse-join-column</code> element will be returned.
    * @return the instance defined for the element <code>inverse-join-column</code> 
    */
   public JoinColumn<JoinTable<T>> getOrCreateInverseJoinColumn();

   /**
    * Creates a new <code>inverse-join-column</code> element 
    * @return the new created instance of <code>JoinColumn<JoinTable<T>></code> 
    */
   public JoinColumn<JoinTable<T>> createInverseJoinColumn();

   /**
    * Returns all <code>inverse-join-column</code> elements
    * @return list of <code>inverse-join-column</code> 
    */
   public List<JoinColumn<JoinTable<T>>> getAllInverseJoinColumn();

   /**
    * Removes all <code>inverse-join-column</code> elements 
    * @return the current instance of <code>JoinColumn<JoinTable<T>></code> 
    */
   public JoinTable<T> removeAllInverseJoinColumn();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JoinTable ElementName: orm:unique-constraint ElementType : unique-constraint
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>unique-constraint</code> element will be created and returned.
    * Otherwise, the first existing <code>unique-constraint</code> element will be returned.
    * @return the instance defined for the element <code>unique-constraint</code> 
    */
   public UniqueConstraint<JoinTable<T>> getOrCreateUniqueConstraint();

   /**
    * Creates a new <code>unique-constraint</code> element 
    * @return the new created instance of <code>UniqueConstraint<JoinTable<T>></code> 
    */
   public UniqueConstraint<JoinTable<T>> createUniqueConstraint();

   /**
    * Returns all <code>unique-constraint</code> elements
    * @return list of <code>unique-constraint</code> 
    */
   public List<UniqueConstraint<JoinTable<T>>> getAllUniqueConstraint();

   /**
    * Removes all <code>unique-constraint</code> elements 
    * @return the current instance of <code>UniqueConstraint<JoinTable<T>></code> 
    */
   public JoinTable<T> removeAllUniqueConstraint();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JoinTable ElementName: xsd:string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>JoinTable<T></code> 
    */
   public JoinTable<T> name(String name);

   /**
    * Returns the <code>name</code> attribute
    * @return the value defined for the attribute <code>name</code> 
    */
   public String getName();

   /**
    * Removes the <code>name</code> attribute 
    * @return the current instance of <code>JoinTable<T></code> 
    */
   public JoinTable<T> removeName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JoinTable ElementName: xsd:string ElementType : catalog
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>catalog</code> attribute
    * @param catalog the value for the attribute <code>catalog</code> 
    * @return the current instance of <code>JoinTable<T></code> 
    */
   public JoinTable<T> catalog(String catalog);

   /**
    * Returns the <code>catalog</code> attribute
    * @return the value defined for the attribute <code>catalog</code> 
    */
   public String getCatalog();

   /**
    * Removes the <code>catalog</code> attribute 
    * @return the current instance of <code>JoinTable<T></code> 
    */
   public JoinTable<T> removeCatalog();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: JoinTable ElementName: xsd:string ElementType : schema
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>schema</code> attribute
    * @param schema the value for the attribute <code>schema</code> 
    * @return the current instance of <code>JoinTable<T></code> 
    */
   public JoinTable<T> schema(String schema);

   /**
    * Returns the <code>schema</code> attribute
    * @return the value defined for the attribute <code>schema</code> 
    */
   public String getSchema();

   /**
    * Removes the <code>schema</code> attribute 
    * @return the current instance of <code>JoinTable<T></code> 
    */
   public JoinTable<T> removeSchema();
}
