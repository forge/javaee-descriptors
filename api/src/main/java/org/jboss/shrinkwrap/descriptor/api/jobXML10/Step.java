package org.jboss.shrinkwrap.descriptor.api.jobXML10; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> Step </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface Step<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Step ElementName: jsl:End ElementType : end
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>end</code> element will be created and returned.
    * Otherwise, the first existing <code>end</code> element will be returned.
    * @return the instance defined for the element <code>end</code> 
    */
   public End<Step<T>> getOrCreateEnd();

   /**
    * Creates a new <code>end</code> element 
    * @return the new created instance of <code>End<Step<T>></code> 
    */
   public End<Step<T>> createEnd();

   /**
    * Returns all <code>end</code> elements
    * @return list of <code>end</code> 
    */
   public List<End<Step<T>>> getAllEnd();

   /**
    * Removes all <code>end</code> elements 
    * @return the current instance of <code>End<Step<T>></code> 
    */
   public Step<T> removeAllEnd();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Step ElementName: jsl:Fail ElementType : fail
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>fail</code> element will be created and returned.
    * Otherwise, the first existing <code>fail</code> element will be returned.
    * @return the instance defined for the element <code>fail</code> 
    */
   public Fail<Step<T>> getOrCreateFail();

   /**
    * Creates a new <code>fail</code> element 
    * @return the new created instance of <code>Fail<Step<T>></code> 
    */
   public Fail<Step<T>> createFail();

   /**
    * Returns all <code>fail</code> elements
    * @return list of <code>fail</code> 
    */
   public List<Fail<Step<T>>> getAllFail();

   /**
    * Removes all <code>fail</code> elements 
    * @return the current instance of <code>Fail<Step<T>></code> 
    */
   public Step<T> removeAllFail();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Step ElementName: jsl:Next ElementType : next
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>next</code> element will be created and returned.
    * Otherwise, the first existing <code>next</code> element will be returned.
    * @return the instance defined for the element <code>next</code> 
    */
   public Next<Step<T>> getOrCreateNext();

   /**
    * Creates a new <code>next</code> element 
    * @return the new created instance of <code>Next<Step<T>></code> 
    */
   public Next<Step<T>> createNext();

   /**
    * Returns all <code>next</code> elements
    * @return list of <code>next</code> 
    */
   public List<Next<Step<T>>> getAllNext();

   /**
    * Removes all <code>next</code> elements 
    * @return the current instance of <code>Next<Step<T>></code> 
    */
   public Step<T> removeAllNext();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Step ElementName: jsl:Stop ElementType : stop
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>stop</code> element will be created and returned.
    * Otherwise, the first existing <code>stop</code> element will be returned.
    * @return the instance defined for the element <code>stop</code> 
    */
   public Stop<Step<T>> getOrCreateStop();

   /**
    * Creates a new <code>stop</code> element 
    * @return the new created instance of <code>Stop<Step<T>></code> 
    */
   public Stop<Step<T>> createStop();

   /**
    * Returns all <code>stop</code> elements
    * @return list of <code>stop</code> 
    */
   public List<Stop<Step<T>>> getAllStop();

   /**
    * Removes all <code>stop</code> elements 
    * @return the current instance of <code>Stop<Step<T>></code> 
    */
   public Step<T> removeAllStop();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Step ElementName: jsl:Properties ElementType : properties
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>properties</code> element with the given value will be created.
    * Otherwise, the existing <code>properties</code> element will be returned.
    * @return  a new or existing instance of <code>Properties<Step<T>></code> 
    */
   public Properties<Step<T>> getOrCreateProperties();

   /**
    * Removes the <code>properties</code> element 
    * @return the current instance of <code>Step<T></code> 
    */
   public Step<T> removeProperties();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Step ElementName: jsl:Listeners ElementType : listeners
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>listeners</code> element with the given value will be created.
    * Otherwise, the existing <code>listeners</code> element will be returned.
    * @return  a new or existing instance of <code>Listeners<Step<T>></code> 
    */
   public Listeners<Step<T>> getOrCreateListeners();

   /**
    * Removes the <code>listeners</code> element 
    * @return the current instance of <code>Step<T></code> 
    */
   public Step<T> removeListeners();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Step ElementName: jsl:Batchlet ElementType : batchlet
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>batchlet</code> element with the given value will be created.
    * Otherwise, the existing <code>batchlet</code> element will be returned.
    * @return  a new or existing instance of <code>Batchlet<Step<T>></code> 
    */
   public Batchlet<Step<T>> getOrCreateBatchlet();

   /**
    * Removes the <code>batchlet</code> element 
    * @return the current instance of <code>Step<T></code> 
    */
   public Step<T> removeBatchlet();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Step ElementName: jsl:Chunk ElementType : chunk
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>chunk</code> element with the given value will be created.
    * Otherwise, the existing <code>chunk</code> element will be returned.
    * @return  a new or existing instance of <code>Chunk<Step<T>></code> 
    */
   public Chunk<Step<T>> getOrCreateChunk();

   /**
    * Removes the <code>chunk</code> element 
    * @return the current instance of <code>Step<T></code> 
    */
   public Step<T> removeChunk();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Step ElementName: jsl:Partition ElementType : partition
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>partition</code> element with the given value will be created.
    * Otherwise, the existing <code>partition</code> element will be returned.
    * @return  a new or existing instance of <code>Partition<Step<T>></code> 
    */
   public Partition<Step<T>> getOrCreatePartition();

   /**
    * Removes the <code>partition</code> element 
    * @return the current instance of <code>Step<T></code> 
    */
   public Step<T> removePartition();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Step ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>Step<T></code> 
    */
   public Step<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>Step<T></code> 
    */
   public Step<T> removeId();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Step ElementName: xsd:string ElementType : start-limit
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>start-limit</code> attribute
    * @param startLimit the value for the attribute <code>start-limit</code> 
    * @return the current instance of <code>Step<T></code> 
    */
   public Step<T> startLimit(String startLimit);

   /**
    * Returns the <code>start-limit</code> attribute
    * @return the value defined for the attribute <code>start-limit</code> 
    */
   public String getStartLimit();

   /**
    * Removes the <code>start-limit</code> attribute 
    * @return the current instance of <code>Step<T></code> 
    */
   public Step<T> removeStartLimit();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Step ElementName: xsd:string ElementType : allow-start-if-complete
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>allow-start-if-complete</code> attribute
    * @param allowStartIfComplete the value for the attribute <code>allow-start-if-complete</code> 
    * @return the current instance of <code>Step<T></code> 
    */
   public Step<T> allowStartIfComplete(String allowStartIfComplete);

   /**
    * Returns the <code>allow-start-if-complete</code> attribute
    * @return the value defined for the attribute <code>allow-start-if-complete</code> 
    */
   public String getAllowStartIfComplete();

   /**
    * Removes the <code>allow-start-if-complete</code> attribute 
    * @return the current instance of <code>Step<T></code> 
    */
   public Step<T> removeAllowStartIfComplete();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Step ElementName: xsd:string ElementType : next
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>next</code> attribute
    * @param next the value for the attribute <code>next</code> 
    * @return the current instance of <code>Step<T></code> 
    */
   public Step<T> next(String next);

   /**
    * Returns the <code>next</code> attribute
    * @return the value defined for the attribute <code>next</code> 
    */
   public String getNext();

   /**
    * Removes the <code>next</code> attribute 
    * @return the current instance of <code>Step<T></code> 
    */
   public Step<T> removeNext();
}
