package org.jboss.shrinkwrap.descriptor.api.persistence10; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> persistence </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface Persistence<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Persistence ElementName: persistence:persistence-unit ElementType : persistence-unit
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>persistence-unit</code> element will be created and returned.
    * Otherwise, the first existing <code>persistence-unit</code> element will be returned.
    * @return the instance defined for the element <code>persistence-unit</code> 
    */
   public PersistenceUnit<Persistence<T>> getOrCreatePersistenceUnit();

   /**
    * Creates a new <code>persistence-unit</code> element 
    * @return the new created instance of <code>PersistenceUnit<Persistence<T>></code> 
    */
   public PersistenceUnit<Persistence<T>> createPersistenceUnit();

   /**
    * Returns all <code>persistence-unit</code> elements
    * @return list of <code>persistence-unit</code> 
    */
   public List<PersistenceUnit<Persistence<T>>> getAllPersistenceUnit();

   /**
    * Removes all <code>persistence-unit</code> elements 
    * @return the current instance of <code>PersistenceUnit<Persistence<T>></code> 
    */
   public Persistence<T> removeAllPersistenceUnit();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Persistence ElementName: xsd:token ElementType : version
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   public static final String VERSION = "1.0";

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of <code>Persistence<T></code> 
    */
   public Persistence<T> version(String version);

   /**
    * Returns the <code>version</code> attribute
    * @return the value defined for the attribute <code>version</code> 
    */
   public String getVersion();

   /**
    * Removes the <code>version</code> attribute 
    * @return the current instance of <code>Persistence<T></code> 
    */
   public Persistence<T> removeVersion();
}
