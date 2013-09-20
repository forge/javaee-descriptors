package org.jboss.shrinkwrap.descriptor.api.jobXML10; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.Flow;
/**
 * This interface defines the contract for the <code> Split </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface Split<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Split ElementName: jsl:Flow ElementType : flow
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>flow</code> element will be created and returned.
    * Otherwise, the first existing <code>flow</code> element will be returned.
    * @return the instance defined for the element <code>flow</code> 
    */
   public Flow<Split<T>> getOrCreateFlow();

   /**
    * Creates a new <code>flow</code> element 
    * @return the new created instance of <code>Flow<Split<T>></code> 
    */
   public Flow<Split<T>> createFlow();

   /**
    * Returns all <code>flow</code> elements
    * @return list of <code>flow</code> 
    */
   public List<Flow<Split<T>>> getAllFlow();

   /**
    * Removes all <code>flow</code> elements 
    * @return the current instance of <code>Flow<Split<T>></code> 
    */
   public Split<T> removeAllFlow();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Split ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>Split<T></code> 
    */
   public Split<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>Split<T></code> 
    */
   public Split<T> removeId();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Split ElementName: xsd:string ElementType : next
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>next</code> attribute
    * @param next the value for the attribute <code>next</code> 
    * @return the current instance of <code>Split<T></code> 
    */
   public Split<T> next(String next);

   /**
    * Returns the <code>next</code> attribute
    * @return the value defined for the attribute <code>next</code> 
    */
   public String getNext();

   /**
    * Removes the <code>next</code> attribute 
    * @return the current instance of <code>Split<T></code> 
    */
   public Split<T> removeNext();
}
