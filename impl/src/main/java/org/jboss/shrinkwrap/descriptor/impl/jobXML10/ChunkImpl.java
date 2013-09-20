package org.jboss.shrinkwrap.descriptor.impl.jobXML10; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.CheckpointAlgorithm;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.Chunk;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.ExceptionClassFilter;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.ItemProcessor;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.ItemReader;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.ItemWriter;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> Chunk </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class ChunkImpl<T> implements Child<T>, Chunk<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public ChunkImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public ChunkImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Chunk ElementName: jsl:ItemReader ElementType : reader
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>reader</code> element with the given value will be created.
    * Otherwise, the existing <code>reader</code> element will be returned.
    * @return  a new or existing instance of <code>ItemReader<Chunk<T>></code> 
    */
   public ItemReader<Chunk<T>> getOrCreateReader()
   {
      Node node = childNode.getOrCreate("reader");
      ItemReader<Chunk<T>> reader = new ItemReaderImpl<Chunk<T>>(this, "reader", childNode, node);
      return reader;
   }

   /**
    * Removes the <code>reader</code> element 
    * @return the current instance of <code>Chunk<T></code> 
    */
   public Chunk<T> removeReader()
   {
      childNode.removeChildren("reader");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Chunk ElementName: jsl:ItemProcessor ElementType : processor
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>processor</code> element with the given value will be created.
    * Otherwise, the existing <code>processor</code> element will be returned.
    * @return  a new or existing instance of <code>ItemProcessor<Chunk<T>></code> 
    */
   public ItemProcessor<Chunk<T>> getOrCreateProcessor()
   {
      Node node = childNode.getOrCreate("processor");
      ItemProcessor<Chunk<T>> processor = new ItemProcessorImpl<Chunk<T>>(this, "processor", childNode, node);
      return processor;
   }

   /**
    * Removes the <code>processor</code> element 
    * @return the current instance of <code>Chunk<T></code> 
    */
   public Chunk<T> removeProcessor()
   {
      childNode.removeChildren("processor");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Chunk ElementName: jsl:ItemWriter ElementType : writer
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>writer</code> element with the given value will be created.
    * Otherwise, the existing <code>writer</code> element will be returned.
    * @return  a new or existing instance of <code>ItemWriter<Chunk<T>></code> 
    */
   public ItemWriter<Chunk<T>> getOrCreateWriter()
   {
      Node node = childNode.getOrCreate("writer");
      ItemWriter<Chunk<T>> writer = new ItemWriterImpl<Chunk<T>>(this, "writer", childNode, node);
      return writer;
   }

   /**
    * Removes the <code>writer</code> element 
    * @return the current instance of <code>Chunk<T></code> 
    */
   public Chunk<T> removeWriter()
   {
      childNode.removeChildren("writer");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Chunk ElementName: jsl:CheckpointAlgorithm ElementType : checkpoint-algorithm
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>checkpoint-algorithm</code> element with the given value will be created.
    * Otherwise, the existing <code>checkpoint-algorithm</code> element will be returned.
    * @return  a new or existing instance of <code>CheckpointAlgorithm<Chunk<T>></code> 
    */
   public CheckpointAlgorithm<Chunk<T>> getOrCreateCheckpointAlgorithm()
   {
      Node node = childNode.getOrCreate("checkpoint-algorithm");
      CheckpointAlgorithm<Chunk<T>> checkpointAlgorithm = new CheckpointAlgorithmImpl<Chunk<T>>(this, "checkpoint-algorithm", childNode, node);
      return checkpointAlgorithm;
   }

   /**
    * Removes the <code>checkpoint-algorithm</code> element 
    * @return the current instance of <code>Chunk<T></code> 
    */
   public Chunk<T> removeCheckpointAlgorithm()
   {
      childNode.removeChildren("checkpoint-algorithm");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Chunk ElementName: jsl:ExceptionClassFilter ElementType : skippable-exception-classes
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>skippable-exception-classes</code> element with the given value will be created.
    * Otherwise, the existing <code>skippable-exception-classes</code> element will be returned.
    * @return  a new or existing instance of <code>ExceptionClassFilter<Chunk<T>></code> 
    */
   public ExceptionClassFilter<Chunk<T>> getOrCreateSkippableExceptionClasses()
   {
      Node node = childNode.getOrCreate("skippable-exception-classes");
      ExceptionClassFilter<Chunk<T>> skippableExceptionClasses = new ExceptionClassFilterImpl<Chunk<T>>(this, "skippable-exception-classes", childNode, node);
      return skippableExceptionClasses;
   }

   /**
    * Removes the <code>skippable-exception-classes</code> element 
    * @return the current instance of <code>Chunk<T></code> 
    */
   public Chunk<T> removeSkippableExceptionClasses()
   {
      childNode.removeChildren("skippable-exception-classes");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Chunk ElementName: jsl:ExceptionClassFilter ElementType : retryable-exception-classes
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>retryable-exception-classes</code> element with the given value will be created.
    * Otherwise, the existing <code>retryable-exception-classes</code> element will be returned.
    * @return  a new or existing instance of <code>ExceptionClassFilter<Chunk<T>></code> 
    */
   public ExceptionClassFilter<Chunk<T>> getOrCreateRetryableExceptionClasses()
   {
      Node node = childNode.getOrCreate("retryable-exception-classes");
      ExceptionClassFilter<Chunk<T>> retryableExceptionClasses = new ExceptionClassFilterImpl<Chunk<T>>(this, "retryable-exception-classes", childNode, node);
      return retryableExceptionClasses;
   }

   /**
    * Removes the <code>retryable-exception-classes</code> element 
    * @return the current instance of <code>Chunk<T></code> 
    */
   public Chunk<T> removeRetryableExceptionClasses()
   {
      childNode.removeChildren("retryable-exception-classes");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Chunk ElementName: jsl:ExceptionClassFilter ElementType : no-rollback-exception-classes
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>no-rollback-exception-classes</code> element with the given value will be created.
    * Otherwise, the existing <code>no-rollback-exception-classes</code> element will be returned.
    * @return  a new or existing instance of <code>ExceptionClassFilter<Chunk<T>></code> 
    */
   public ExceptionClassFilter<Chunk<T>> getOrCreateNoRollbackExceptionClasses()
   {
      Node node = childNode.getOrCreate("no-rollback-exception-classes");
      ExceptionClassFilter<Chunk<T>> noRollbackExceptionClasses = new ExceptionClassFilterImpl<Chunk<T>>(this, "no-rollback-exception-classes", childNode, node);
      return noRollbackExceptionClasses;
   }

   /**
    * Removes the <code>no-rollback-exception-classes</code> element 
    * @return the current instance of <code>Chunk<T></code> 
    */
   public Chunk<T> removeNoRollbackExceptionClasses()
   {
      childNode.removeChildren("no-rollback-exception-classes");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Chunk ElementName: xsd:string ElementType : checkpoint-policy
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>checkpoint-policy</code> attribute
    * @param checkpointPolicy the value for the attribute <code>checkpoint-policy</code> 
    * @return the current instance of <code>Chunk<T></code> 
    */
   public Chunk<T> checkpointPolicy(String checkpointPolicy)
   {
      childNode.attribute("checkpoint-policy", checkpointPolicy);
      return this;
   }

   /**
    * Returns the <code>checkpoint-policy</code> attribute
    * @return the value defined for the attribute <code>checkpoint-policy</code> 
    */
      public String getCheckpointPolicy()
   {
      return childNode.getAttribute("checkpoint-policy");
   }

   /**
    * Removes the <code>checkpoint-policy</code> attribute 
    * @return the current instance of <code>Chunk<T></code> 
    */
   public Chunk<T> removeCheckpointPolicy()
   {
      childNode.removeAttribute("checkpoint-policy");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Chunk ElementName: xsd:string ElementType : item-count
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>item-count</code> attribute
    * @param itemCount the value for the attribute <code>item-count</code> 
    * @return the current instance of <code>Chunk<T></code> 
    */
   public Chunk<T> itemCount(String itemCount)
   {
      childNode.attribute("item-count", itemCount);
      return this;
   }

   /**
    * Returns the <code>item-count</code> attribute
    * @return the value defined for the attribute <code>item-count</code> 
    */
      public String getItemCount()
   {
      return childNode.getAttribute("item-count");
   }

   /**
    * Removes the <code>item-count</code> attribute 
    * @return the current instance of <code>Chunk<T></code> 
    */
   public Chunk<T> removeItemCount()
   {
      childNode.removeAttribute("item-count");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Chunk ElementName: xsd:string ElementType : time-limit
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>time-limit</code> attribute
    * @param timeLimit the value for the attribute <code>time-limit</code> 
    * @return the current instance of <code>Chunk<T></code> 
    */
   public Chunk<T> timeLimit(String timeLimit)
   {
      childNode.attribute("time-limit", timeLimit);
      return this;
   }

   /**
    * Returns the <code>time-limit</code> attribute
    * @return the value defined for the attribute <code>time-limit</code> 
    */
      public String getTimeLimit()
   {
      return childNode.getAttribute("time-limit");
   }

   /**
    * Removes the <code>time-limit</code> attribute 
    * @return the current instance of <code>Chunk<T></code> 
    */
   public Chunk<T> removeTimeLimit()
   {
      childNode.removeAttribute("time-limit");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Chunk ElementName: xsd:string ElementType : skip-limit
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>skip-limit</code> attribute
    * @param skipLimit the value for the attribute <code>skip-limit</code> 
    * @return the current instance of <code>Chunk<T></code> 
    */
   public Chunk<T> skipLimit(String skipLimit)
   {
      childNode.attribute("skip-limit", skipLimit);
      return this;
   }

   /**
    * Returns the <code>skip-limit</code> attribute
    * @return the value defined for the attribute <code>skip-limit</code> 
    */
      public String getSkipLimit()
   {
      return childNode.getAttribute("skip-limit");
   }

   /**
    * Removes the <code>skip-limit</code> attribute 
    * @return the current instance of <code>Chunk<T></code> 
    */
   public Chunk<T> removeSkipLimit()
   {
      childNode.removeAttribute("skip-limit");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Chunk ElementName: xsd:string ElementType : retry-limit
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>retry-limit</code> attribute
    * @param retryLimit the value for the attribute <code>retry-limit</code> 
    * @return the current instance of <code>Chunk<T></code> 
    */
   public Chunk<T> retryLimit(String retryLimit)
   {
      childNode.attribute("retry-limit", retryLimit);
      return this;
   }

   /**
    * Returns the <code>retry-limit</code> attribute
    * @return the value defined for the attribute <code>retry-limit</code> 
    */
      public String getRetryLimit()
   {
      return childNode.getAttribute("retry-limit");
   }

   /**
    * Removes the <code>retry-limit</code> attribute 
    * @return the current instance of <code>Chunk<T></code> 
    */
   public Chunk<T> removeRetryLimit()
   {
      childNode.removeAttribute("retry-limit");
      return this;
   }
}
