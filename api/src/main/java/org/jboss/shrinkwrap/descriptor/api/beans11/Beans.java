package org.jboss.shrinkwrap.descriptor.api.beans11; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.beans11.Interceptors;
import org.jboss.shrinkwrap.descriptor.api.beans11.Decorators;
import org.jboss.shrinkwrap.descriptor.api.beans11.Alternatives;
import org.jboss.shrinkwrap.descriptor.api.beans11.Scan;
/**
 * This interface defines the contract for the <code> beans </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface Beans<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Beans ElementName: javaee:interceptors ElementType : interceptors
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>interceptors</code> element will be created and returned.
    * Otherwise, the first existing <code>interceptors</code> element will be returned.
    * @return the instance defined for the element <code>interceptors</code> 
    */
   public Interceptors<Beans<T>> getOrCreateInterceptors();

   /**
    * Creates a new <code>interceptors</code> element 
    * @return the new created instance of <code>Interceptors<Beans<T>></code> 
    */
   public Interceptors<Beans<T>> createInterceptors();

   /**
    * Returns all <code>interceptors</code> elements
    * @return list of <code>interceptors</code> 
    */
   public List<Interceptors<Beans<T>>> getAllInterceptors();

   /**
    * Removes all <code>interceptors</code> elements 
    * @return the current instance of <code>Interceptors<Beans<T>></code> 
    */
   public Beans<T> removeAllInterceptors();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Beans ElementName: javaee:decorators ElementType : decorators
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>decorators</code> element will be created and returned.
    * Otherwise, the first existing <code>decorators</code> element will be returned.
    * @return the instance defined for the element <code>decorators</code> 
    */
   public Decorators<Beans<T>> getOrCreateDecorators();

   /**
    * Creates a new <code>decorators</code> element 
    * @return the new created instance of <code>Decorators<Beans<T>></code> 
    */
   public Decorators<Beans<T>> createDecorators();

   /**
    * Returns all <code>decorators</code> elements
    * @return list of <code>decorators</code> 
    */
   public List<Decorators<Beans<T>>> getAllDecorators();

   /**
    * Removes all <code>decorators</code> elements 
    * @return the current instance of <code>Decorators<Beans<T>></code> 
    */
   public Beans<T> removeAllDecorators();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Beans ElementName: javaee:alternatives ElementType : alternatives
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>alternatives</code> element will be created and returned.
    * Otherwise, the first existing <code>alternatives</code> element will be returned.
    * @return the instance defined for the element <code>alternatives</code> 
    */
   public Alternatives<Beans<T>> getOrCreateAlternatives();

   /**
    * Creates a new <code>alternatives</code> element 
    * @return the new created instance of <code>Alternatives<Beans<T>></code> 
    */
   public Alternatives<Beans<T>> createAlternatives();

   /**
    * Returns all <code>alternatives</code> elements
    * @return list of <code>alternatives</code> 
    */
   public List<Alternatives<Beans<T>>> getAllAlternatives();

   /**
    * Removes all <code>alternatives</code> elements 
    * @return the current instance of <code>Alternatives<Beans<T>></code> 
    */
   public Beans<T> removeAllAlternatives();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Beans ElementName: javaee:scan ElementType : scan
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>scan</code> element will be created and returned.
    * Otherwise, the first existing <code>scan</code> element will be returned.
    * @return the instance defined for the element <code>scan</code> 
    */
   public Scan<Beans<T>> getOrCreateScan();

   /**
    * Creates a new <code>scan</code> element 
    * @return the new created instance of <code>Scan<Beans<T>></code> 
    */
   public Scan<Beans<T>> createScan();

   /**
    * Returns all <code>scan</code> elements
    * @return list of <code>scan</code> 
    */
   public List<Scan<Beans<T>>> getAllScan();

   /**
    * Removes all <code>scan</code> elements 
    * @return the current instance of <code>Scan<Beans<T>></code> 
    */
   public Beans<T> removeAllScan();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Beans ElementName: xsd:string ElementType : version
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>version</code> attribute
    * @param version the value for the attribute <code>version</code> 
    * @return the current instance of <code>Beans<T></code> 
    */
   public Beans<T> version(String version);

   /**
    * Returns the <code>version</code> attribute
    * @return the value defined for the attribute <code>version</code> 
    */
   public String getVersion();

   /**
    * Removes the <code>version</code> attribute 
    * @return the current instance of <code>Beans<T></code> 
    */
   public Beans<T> removeVersion();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Beans ElementName: xsd:string ElementType : bean-discovery-mode
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>bean-discovery-mode</code> attribute
    * @param beanDiscoveryMode the value for the attribute <code>bean-discovery-mode</code> 
    * @return the current instance of <code>Beans<T></code> 
    */
   public Beans<T> beanDiscoveryMode(String beanDiscoveryMode);

   /**
    * Returns the <code>bean-discovery-mode</code> attribute
    * @return the value defined for the attribute <code>bean-discovery-mode</code> 
    */
   public String getBeanDiscoveryMode();

   /**
    * Removes the <code>bean-discovery-mode</code> attribute 
    * @return the current instance of <code>Beans<T></code> 
    */
   public Beans<T> removeBeanDiscoveryMode();
}
