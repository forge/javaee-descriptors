package org.jboss.shrinkwrap.descriptor.api.jobXML10; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.ItemReader;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.ItemProcessor;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.ItemWriter;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.CheckpointAlgorithm;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.ExceptionClassFilter;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.ExceptionClassFilter;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.ExceptionClassFilter;
/**
 * This interface defines the contract for the <code> Chunk </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface Chunk<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Chunk ElementName: jsl:ItemReader ElementType : reader
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>reader</code> element with the given value will be created.
    * Otherwise, the existing <code>reader</code> element will be returned.
    * @return  a new or existing instance of <code>ItemReader<Chunk<T>></code> 
    */
   public ItemReader<Chunk<T>> getOrCreateReader();

   /**
    * Removes the <code>reader</code> element 
    * @return the current instance of <code>Chunk<T></code> 
    */
   public Chunk<T> removeReader();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Chunk ElementName: jsl:ItemProcessor ElementType : processor
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>processor</code> element with the given value will be created.
    * Otherwise, the existing <code>processor</code> element will be returned.
    * @return  a new or existing instance of <code>ItemProcessor<Chunk<T>></code> 
    */
   public ItemProcessor<Chunk<T>> getOrCreateProcessor();

   /**
    * Removes the <code>processor</code> element 
    * @return the current instance of <code>Chunk<T></code> 
    */
   public Chunk<T> removeProcessor();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Chunk ElementName: jsl:ItemWriter ElementType : writer
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>writer</code> element with the given value will be created.
    * Otherwise, the existing <code>writer</code> element will be returned.
    * @return  a new or existing instance of <code>ItemWriter<Chunk<T>></code> 
    */
   public ItemWriter<Chunk<T>> getOrCreateWriter();

   /**
    * Removes the <code>writer</code> element 
    * @return the current instance of <code>Chunk<T></code> 
    */
   public Chunk<T> removeWriter();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Chunk ElementName: jsl:CheckpointAlgorithm ElementType : checkpoint-algorithm
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>checkpoint-algorithm</code> element with the given value will be created.
    * Otherwise, the existing <code>checkpoint-algorithm</code> element will be returned.
    * @return  a new or existing instance of <code>CheckpointAlgorithm<Chunk<T>></code> 
    */
   public CheckpointAlgorithm<Chunk<T>> getOrCreateCheckpointAlgorithm();

   /**
    * Removes the <code>checkpoint-algorithm</code> element 
    * @return the current instance of <code>Chunk<T></code> 
    */
   public Chunk<T> removeCheckpointAlgorithm();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Chunk ElementName: jsl:ExceptionClassFilter ElementType : skippable-exception-classes
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>skippable-exception-classes</code> element with the given value will be created.
    * Otherwise, the existing <code>skippable-exception-classes</code> element will be returned.
    * @return  a new or existing instance of <code>ExceptionClassFilter<Chunk<T>></code> 
    */
   public ExceptionClassFilter<Chunk<T>> getOrCreateSkippableExceptionClasses();

   /**
    * Removes the <code>skippable-exception-classes</code> element 
    * @return the current instance of <code>Chunk<T></code> 
    */
   public Chunk<T> removeSkippableExceptionClasses();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Chunk ElementName: jsl:ExceptionClassFilter ElementType : retryable-exception-classes
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>retryable-exception-classes</code> element with the given value will be created.
    * Otherwise, the existing <code>retryable-exception-classes</code> element will be returned.
    * @return  a new or existing instance of <code>ExceptionClassFilter<Chunk<T>></code> 
    */
   public ExceptionClassFilter<Chunk<T>> getOrCreateRetryableExceptionClasses();

   /**
    * Removes the <code>retryable-exception-classes</code> element 
    * @return the current instance of <code>Chunk<T></code> 
    */
   public Chunk<T> removeRetryableExceptionClasses();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Chunk ElementName: jsl:ExceptionClassFilter ElementType : no-rollback-exception-classes
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>no-rollback-exception-classes</code> element with the given value will be created.
    * Otherwise, the existing <code>no-rollback-exception-classes</code> element will be returned.
    * @return  a new or existing instance of <code>ExceptionClassFilter<Chunk<T>></code> 
    */
   public ExceptionClassFilter<Chunk<T>> getOrCreateNoRollbackExceptionClasses();

   /**
    * Removes the <code>no-rollback-exception-classes</code> element 
    * @return the current instance of <code>Chunk<T></code> 
    */
   public Chunk<T> removeNoRollbackExceptionClasses();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Chunk ElementName: xsd:string ElementType : checkpoint-policy
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>checkpoint-policy</code> attribute
    * @param checkpointPolicy the value for the attribute <code>checkpoint-policy</code> 
    * @return the current instance of <code>Chunk<T></code> 
    */
   public Chunk<T> checkpointPolicy(String checkpointPolicy);

   /**
    * Returns the <code>checkpoint-policy</code> attribute
    * @return the value defined for the attribute <code>checkpoint-policy</code> 
    */
   public String getCheckpointPolicy();

   /**
    * Removes the <code>checkpoint-policy</code> attribute 
    * @return the current instance of <code>Chunk<T></code> 
    */
   public Chunk<T> removeCheckpointPolicy();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Chunk ElementName: xsd:string ElementType : item-count
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>item-count</code> attribute
    * @param itemCount the value for the attribute <code>item-count</code> 
    * @return the current instance of <code>Chunk<T></code> 
    */
   public Chunk<T> itemCount(String itemCount);

   /**
    * Returns the <code>item-count</code> attribute
    * @return the value defined for the attribute <code>item-count</code> 
    */
   public String getItemCount();

   /**
    * Removes the <code>item-count</code> attribute 
    * @return the current instance of <code>Chunk<T></code> 
    */
   public Chunk<T> removeItemCount();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Chunk ElementName: xsd:string ElementType : time-limit
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>time-limit</code> attribute
    * @param timeLimit the value for the attribute <code>time-limit</code> 
    * @return the current instance of <code>Chunk<T></code> 
    */
   public Chunk<T> timeLimit(String timeLimit);

   /**
    * Returns the <code>time-limit</code> attribute
    * @return the value defined for the attribute <code>time-limit</code> 
    */
   public String getTimeLimit();

   /**
    * Removes the <code>time-limit</code> attribute 
    * @return the current instance of <code>Chunk<T></code> 
    */
   public Chunk<T> removeTimeLimit();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Chunk ElementName: xsd:string ElementType : skip-limit
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>skip-limit</code> attribute
    * @param skipLimit the value for the attribute <code>skip-limit</code> 
    * @return the current instance of <code>Chunk<T></code> 
    */
   public Chunk<T> skipLimit(String skipLimit);

   /**
    * Returns the <code>skip-limit</code> attribute
    * @return the value defined for the attribute <code>skip-limit</code> 
    */
   public String getSkipLimit();

   /**
    * Removes the <code>skip-limit</code> attribute 
    * @return the current instance of <code>Chunk<T></code> 
    */
   public Chunk<T> removeSkipLimit();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Chunk ElementName: xsd:string ElementType : retry-limit
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>retry-limit</code> attribute
    * @param retryLimit the value for the attribute <code>retry-limit</code> 
    * @return the current instance of <code>Chunk<T></code> 
    */
   public Chunk<T> retryLimit(String retryLimit);

   /**
    * Returns the <code>retry-limit</code> attribute
    * @return the value defined for the attribute <code>retry-limit</code> 
    */
   public String getRetryLimit();

   /**
    * Removes the <code>retry-limit</code> attribute 
    * @return the current instance of <code>Chunk<T></code> 
    */
   public Chunk<T> removeRetryLimit();
}
