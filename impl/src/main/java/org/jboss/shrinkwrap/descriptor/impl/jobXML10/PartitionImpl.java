package org.jboss.shrinkwrap.descriptor.impl.jobXML10; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.Partition;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.PartitionMapper;
import org.jboss.shrinkwrap.descriptor.impl.jobXML10.PartitionMapperImpl;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.PartitionPlan;
import org.jboss.shrinkwrap.descriptor.impl.jobXML10.PartitionPlanImpl;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.Collector;
import org.jboss.shrinkwrap.descriptor.impl.jobXML10.CollectorImpl;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.Analyzer;
import org.jboss.shrinkwrap.descriptor.impl.jobXML10.AnalyzerImpl;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.PartitionReducer;
import org.jboss.shrinkwrap.descriptor.impl.jobXML10.PartitionReducerImpl;

/**
 * This class implements the <code> Partition </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class PartitionImpl<T> implements Child<T>, Partition<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public PartitionImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public PartitionImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Partition ElementName: jsl:PartitionMapper ElementType : mapper
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>mapper</code> element with the given value will be created.
    * Otherwise, the existing <code>mapper</code> element will be returned.
    * @return  a new or existing instance of <code>PartitionMapper<Partition<T>></code> 
    */
   public PartitionMapper<Partition<T>> getOrCreateMapper()
   {
      Node node = childNode.getOrCreate("mapper");
      PartitionMapper<Partition<T>> mapper = new PartitionMapperImpl<Partition<T>>(this, "mapper", childNode, node);
      return mapper;
   }

   /**
    * Removes the <code>mapper</code> element 
    * @return the current instance of <code>Partition<T></code> 
    */
   public Partition<T> removeMapper()
   {
      childNode.removeChildren("mapper");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Partition ElementName: jsl:PartitionPlan ElementType : plan
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>plan</code> element with the given value will be created.
    * Otherwise, the existing <code>plan</code> element will be returned.
    * @return  a new or existing instance of <code>PartitionPlan<Partition<T>></code> 
    */
   public PartitionPlan<Partition<T>> getOrCreatePlan()
   {
      Node node = childNode.getOrCreate("plan");
      PartitionPlan<Partition<T>> plan = new PartitionPlanImpl<Partition<T>>(this, "plan", childNode, node);
      return plan;
   }

   /**
    * Removes the <code>plan</code> element 
    * @return the current instance of <code>Partition<T></code> 
    */
   public Partition<T> removePlan()
   {
      childNode.removeChildren("plan");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Partition ElementName: jsl:Collector ElementType : collector
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>collector</code> element with the given value will be created.
    * Otherwise, the existing <code>collector</code> element will be returned.
    * @return  a new or existing instance of <code>Collector<Partition<T>></code> 
    */
   public Collector<Partition<T>> getOrCreateCollector()
   {
      Node node = childNode.getOrCreate("collector");
      Collector<Partition<T>> collector = new CollectorImpl<Partition<T>>(this, "collector", childNode, node);
      return collector;
   }

   /**
    * Removes the <code>collector</code> element 
    * @return the current instance of <code>Partition<T></code> 
    */
   public Partition<T> removeCollector()
   {
      childNode.removeChildren("collector");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Partition ElementName: jsl:Analyzer ElementType : analyzer
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>analyzer</code> element with the given value will be created.
    * Otherwise, the existing <code>analyzer</code> element will be returned.
    * @return  a new or existing instance of <code>Analyzer<Partition<T>></code> 
    */
   public Analyzer<Partition<T>> getOrCreateAnalyzer()
   {
      Node node = childNode.getOrCreate("analyzer");
      Analyzer<Partition<T>> analyzer = new AnalyzerImpl<Partition<T>>(this, "analyzer", childNode, node);
      return analyzer;
   }

   /**
    * Removes the <code>analyzer</code> element 
    * @return the current instance of <code>Partition<T></code> 
    */
   public Partition<T> removeAnalyzer()
   {
      childNode.removeChildren("analyzer");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Partition ElementName: jsl:PartitionReducer ElementType : reducer
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>reducer</code> element with the given value will be created.
    * Otherwise, the existing <code>reducer</code> element will be returned.
    * @return  a new or existing instance of <code>PartitionReducer<Partition<T>></code> 
    */
   public PartitionReducer<Partition<T>> getOrCreateReducer()
   {
      Node node = childNode.getOrCreate("reducer");
      PartitionReducer<Partition<T>> reducer = new PartitionReducerImpl<Partition<T>>(this, "reducer", childNode, node);
      return reducer;
   }

   /**
    * Removes the <code>reducer</code> element 
    * @return the current instance of <code>Partition<T></code> 
    */
   public Partition<T> removeReducer()
   {
      childNode.removeChildren("reducer");
      return this;
   }
}
