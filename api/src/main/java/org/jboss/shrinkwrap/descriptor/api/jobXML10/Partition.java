package org.jboss.shrinkwrap.descriptor.api.jobXML10; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.PartitionMapper;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.PartitionPlan;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.Collector;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.Analyzer;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.PartitionReducer;
/**
 * This interface defines the contract for the <code> Partition </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface Partition<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Partition ElementName: jsl:PartitionMapper ElementType : mapper
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>mapper</code> element with the given value will be created.
    * Otherwise, the existing <code>mapper</code> element will be returned.
    * @return  a new or existing instance of <code>PartitionMapper<Partition<T>></code> 
    */
   public PartitionMapper<Partition<T>> getOrCreateMapper();

   /**
    * Removes the <code>mapper</code> element 
    * @return the current instance of <code>Partition<T></code> 
    */
   public Partition<T> removeMapper();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Partition ElementName: jsl:PartitionPlan ElementType : plan
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>plan</code> element with the given value will be created.
    * Otherwise, the existing <code>plan</code> element will be returned.
    * @return  a new or existing instance of <code>PartitionPlan<Partition<T>></code> 
    */
   public PartitionPlan<Partition<T>> getOrCreatePlan();

   /**
    * Removes the <code>plan</code> element 
    * @return the current instance of <code>Partition<T></code> 
    */
   public Partition<T> removePlan();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Partition ElementName: jsl:Collector ElementType : collector
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>collector</code> element with the given value will be created.
    * Otherwise, the existing <code>collector</code> element will be returned.
    * @return  a new or existing instance of <code>Collector<Partition<T>></code> 
    */
   public Collector<Partition<T>> getOrCreateCollector();

   /**
    * Removes the <code>collector</code> element 
    * @return the current instance of <code>Partition<T></code> 
    */
   public Partition<T> removeCollector();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Partition ElementName: jsl:Analyzer ElementType : analyzer
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>analyzer</code> element with the given value will be created.
    * Otherwise, the existing <code>analyzer</code> element will be returned.
    * @return  a new or existing instance of <code>Analyzer<Partition<T>></code> 
    */
   public Analyzer<Partition<T>> getOrCreateAnalyzer();

   /**
    * Removes the <code>analyzer</code> element 
    * @return the current instance of <code>Partition<T></code> 
    */
   public Partition<T> removeAnalyzer();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Partition ElementName: jsl:PartitionReducer ElementType : reducer
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>reducer</code> element with the given value will be created.
    * Otherwise, the existing <code>reducer</code> element will be returned.
    * @return  a new or existing instance of <code>PartitionReducer<Partition<T>></code> 
    */
   public PartitionReducer<Partition<T>> getOrCreateReducer();

   /**
    * Removes the <code>reducer</code> element 
    * @return the current instance of <code>Partition<T></code> 
    */
   public Partition<T> removeReducer();
}
