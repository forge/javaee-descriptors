package org.jboss.shrinkwrap.descriptor.api.jobXML10; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> ExceptionClassFilter </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface ExceptionClassFilter<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ExceptionClassFilter ElementName: jsl:include ElementType : include
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>include</code> element will be created and returned.
    * Otherwise, the first existing <code>include</code> element will be returned.
    * @return the instance defined for the element <code>include</code> 
    */
   public Include<ExceptionClassFilter<T>> getOrCreateInclude();

   /**
    * Creates a new <code>include</code> element 
    * @return the new created instance of <code>Include<ExceptionClassFilter<T>></code> 
    */
   public Include<ExceptionClassFilter<T>> createInclude();

   /**
    * Returns all <code>include</code> elements
    * @return list of <code>include</code> 
    */
   public List<Include<ExceptionClassFilter<T>>> getAllInclude();

   /**
    * Removes all <code>include</code> elements 
    * @return the current instance of <code>Include<ExceptionClassFilter<T>></code> 
    */
   public ExceptionClassFilter<T> removeAllInclude();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: ExceptionClassFilter ElementName: jsl:exclude ElementType : exclude
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>exclude</code> element will be created and returned.
    * Otherwise, the first existing <code>exclude</code> element will be returned.
    * @return the instance defined for the element <code>exclude</code> 
    */
   public Exclude<ExceptionClassFilter<T>> getOrCreateExclude();

   /**
    * Creates a new <code>exclude</code> element 
    * @return the new created instance of <code>Exclude<ExceptionClassFilter<T>></code> 
    */
   public Exclude<ExceptionClassFilter<T>> createExclude();

   /**
    * Returns all <code>exclude</code> elements
    * @return list of <code>exclude</code> 
    */
   public List<Exclude<ExceptionClassFilter<T>>> getAllExclude();

   /**
    * Removes all <code>exclude</code> elements 
    * @return the current instance of <code>Exclude<ExceptionClassFilter<T>></code> 
    */
   public ExceptionClassFilter<T> removeAllExclude();
}
