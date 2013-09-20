package org.jboss.shrinkwrap.descriptor.api.beans11; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.beans11.IfClassAvailable;
import org.jboss.shrinkwrap.descriptor.api.beans11.IfClassNotAvailable;
import org.jboss.shrinkwrap.descriptor.api.beans11.IfSystemProperty;
/**
 * This interface defines the contract for the <code> exclude </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface Exclude<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Exclude ElementName: javaee:if-class-available ElementType : if-class-available
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>if-class-available</code> element will be created and returned.
    * Otherwise, the first existing <code>if-class-available</code> element will be returned.
    * @return the instance defined for the element <code>if-class-available</code> 
    */
   public IfClassAvailable<Exclude<T>> getOrCreateIfClassAvailable();

   /**
    * Creates a new <code>if-class-available</code> element 
    * @return the new created instance of <code>IfClassAvailable<Exclude<T>></code> 
    */
   public IfClassAvailable<Exclude<T>> createIfClassAvailable();

   /**
    * Returns all <code>if-class-available</code> elements
    * @return list of <code>if-class-available</code> 
    */
   public List<IfClassAvailable<Exclude<T>>> getAllIfClassAvailable();

   /**
    * Removes all <code>if-class-available</code> elements 
    * @return the current instance of <code>IfClassAvailable<Exclude<T>></code> 
    */
   public Exclude<T> removeAllIfClassAvailable();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Exclude ElementName: javaee:if-class-not-available ElementType : if-class-not-available
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>if-class-not-available</code> element will be created and returned.
    * Otherwise, the first existing <code>if-class-not-available</code> element will be returned.
    * @return the instance defined for the element <code>if-class-not-available</code> 
    */
   public IfClassNotAvailable<Exclude<T>> getOrCreateIfClassNotAvailable();

   /**
    * Creates a new <code>if-class-not-available</code> element 
    * @return the new created instance of <code>IfClassNotAvailable<Exclude<T>></code> 
    */
   public IfClassNotAvailable<Exclude<T>> createIfClassNotAvailable();

   /**
    * Returns all <code>if-class-not-available</code> elements
    * @return list of <code>if-class-not-available</code> 
    */
   public List<IfClassNotAvailable<Exclude<T>>> getAllIfClassNotAvailable();

   /**
    * Removes all <code>if-class-not-available</code> elements 
    * @return the current instance of <code>IfClassNotAvailable<Exclude<T>></code> 
    */
   public Exclude<T> removeAllIfClassNotAvailable();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Exclude ElementName: javaee:if-system-property ElementType : if-system-property
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>if-system-property</code> element will be created and returned.
    * Otherwise, the first existing <code>if-system-property</code> element will be returned.
    * @return the instance defined for the element <code>if-system-property</code> 
    */
   public IfSystemProperty<Exclude<T>> getOrCreateIfSystemProperty();

   /**
    * Creates a new <code>if-system-property</code> element 
    * @return the new created instance of <code>IfSystemProperty<Exclude<T>></code> 
    */
   public IfSystemProperty<Exclude<T>> createIfSystemProperty();

   /**
    * Returns all <code>if-system-property</code> elements
    * @return list of <code>if-system-property</code> 
    */
   public List<IfSystemProperty<Exclude<T>>> getAllIfSystemProperty();

   /**
    * Removes all <code>if-system-property</code> elements 
    * @return the current instance of <code>IfSystemProperty<Exclude<T>></code> 
    */
   public Exclude<T> removeAllIfSystemProperty();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Exclude ElementName: xsd:string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>Exclude<T></code> 
    */
   public Exclude<T> name(String name);

   /**
    * Returns the <code>name</code> attribute
    * @return the value defined for the attribute <code>name</code> 
    */
   public String getName();

   /**
    * Removes the <code>name</code> attribute 
    * @return the current instance of <code>Exclude<T></code> 
    */
   public Exclude<T> removeName();
}
