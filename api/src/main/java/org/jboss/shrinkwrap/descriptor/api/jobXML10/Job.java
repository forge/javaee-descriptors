package org.jboss.shrinkwrap.descriptor.api.jobXML10; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.Properties;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.Listeners;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.Decision;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.Flow;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.Split;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.Step;
/**
 * This interface defines the contract for the <code> Job </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface Job<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Job ElementName: jsl:Properties ElementType : properties
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>properties</code> element with the given value will be created.
    * Otherwise, the existing <code>properties</code> element will be returned.
    * @return  a new or existing instance of <code>Properties<Job<T>></code> 
    */
   public Properties<Job<T>> getOrCreateProperties();

   /**
    * Removes the <code>properties</code> element 
    * @return the current instance of <code>Job<T></code> 
    */
   public Job<T> removeProperties();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Job ElementName: jsl:Listeners ElementType : listeners
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>listeners</code> element with the given value will be created.
    * Otherwise, the existing <code>listeners</code> element will be returned.
    * @return  a new or existing instance of <code>Listeners<Job<T>></code> 
    */
   public Listeners<Job<T>> getOrCreateListeners();

   /**
    * Removes the <code>listeners</code> element 
    * @return the current instance of <code>Job<T></code> 
    */
   public Job<T> removeListeners();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Job ElementName: jsl:Decision ElementType : decision
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>decision</code> element will be created and returned.
    * Otherwise, the first existing <code>decision</code> element will be returned.
    * @return the instance defined for the element <code>decision</code> 
    */
   public Decision<Job<T>> getOrCreateDecision();

   /**
    * Creates a new <code>decision</code> element 
    * @return the new created instance of <code>Decision<Job<T>></code> 
    */
   public Decision<Job<T>> createDecision();

   /**
    * Returns all <code>decision</code> elements
    * @return list of <code>decision</code> 
    */
   public List<Decision<Job<T>>> getAllDecision();

   /**
    * Removes all <code>decision</code> elements 
    * @return the current instance of <code>Decision<Job<T>></code> 
    */
   public Job<T> removeAllDecision();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Job ElementName: jsl:Flow ElementType : flow
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>flow</code> element will be created and returned.
    * Otherwise, the first existing <code>flow</code> element will be returned.
    * @return the instance defined for the element <code>flow</code> 
    */
   public Flow<Job<T>> getOrCreateFlow();

   /**
    * Creates a new <code>flow</code> element 
    * @return the new created instance of <code>Flow<Job<T>></code> 
    */
   public Flow<Job<T>> createFlow();

   /**
    * Returns all <code>flow</code> elements
    * @return list of <code>flow</code> 
    */
   public List<Flow<Job<T>>> getAllFlow();

   /**
    * Removes all <code>flow</code> elements 
    * @return the current instance of <code>Flow<Job<T>></code> 
    */
   public Job<T> removeAllFlow();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Job ElementName: jsl:Split ElementType : split
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>split</code> element will be created and returned.
    * Otherwise, the first existing <code>split</code> element will be returned.
    * @return the instance defined for the element <code>split</code> 
    */
   public Split<Job<T>> getOrCreateSplit();

   /**
    * Creates a new <code>split</code> element 
    * @return the new created instance of <code>Split<Job<T>></code> 
    */
   public Split<Job<T>> createSplit();

   /**
    * Returns all <code>split</code> elements
    * @return list of <code>split</code> 
    */
   public List<Split<Job<T>>> getAllSplit();

   /**
    * Removes all <code>split</code> elements 
    * @return the current instance of <code>Split<Job<T>></code> 
    */
   public Job<T> removeAllSplit();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Job ElementName: jsl:Step ElementType : step
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>step</code> element will be created and returned.
    * Otherwise, the first existing <code>step</code> element will be returned.
    * @return the instance defined for the element <code>step</code> 
    */
   public Step<Job<T>> getOrCreateStep();

   /**
    * Creates a new <code>step</code> element 
    * @return the new created instance of <code>Step<Job<T>></code> 
    */
   public Step<Job<T>> createStep();

   /**
    * Returns all <code>step</code> elements
    * @return list of <code>step</code> 
    */
   public List<Step<Job<T>>> getAllStep();

   /**
    * Removes all <code>step</code> elements 
    * @return the current instance of <code>Step<Job<T>></code> 
    */
   public Job<T> removeAllStep();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Job ElementName: xsd:string ElementType : version
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   public static final String VERSION = "1.0";

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of <code>Job<T></code> 
    */
   public Job<T> version(String version);

   /**
    * Returns the <code>version</code> attribute
    * @return the value defined for the attribute <code>version</code> 
    */
   public String getVersion();

   /**
    * Removes the <code>version</code> attribute 
    * @return the current instance of <code>Job<T></code> 
    */
   public Job<T> removeVersion();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Job ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>Job<T></code> 
    */
   public Job<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>Job<T></code> 
    */
   public Job<T> removeId();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Job ElementName: xsd:string ElementType : restartable
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>restartable</code> attribute
    * @param restartable the value for the attribute <code>restartable</code> 
    * @return the current instance of <code>Job<T></code> 
    */
   public Job<T> restartable(String restartable);

   /**
    * Returns the <code>restartable</code> attribute
    * @return the value defined for the attribute <code>restartable</code> 
    */
   public String getRestartable();

   /**
    * Removes the <code>restartable</code> attribute 
    * @return the current instance of <code>Job<T></code> 
    */
   public Job<T> removeRestartable();
}
