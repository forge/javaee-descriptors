package org.jboss.shrinkwrap.descriptor.api.jobXML10; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.Decision;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.Flow;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.Split;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.Step;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.End;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.Fail;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.Next;
import org.jboss.shrinkwrap.descriptor.api.jobXML10.Stop;
/**
 * This interface defines the contract for the <code> Flow </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface Flow<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Flow ElementName: jsl:End ElementType : end
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>end</code> element will be created and returned.
    * Otherwise, the first existing <code>end</code> element will be returned.
    * @return the instance defined for the element <code>end</code> 
    */
   public End<Flow<T>> getOrCreateEnd();

   /**
    * Creates a new <code>end</code> element 
    * @return the new created instance of <code>End<Flow<T>></code> 
    */
   public End<Flow<T>> createEnd();

   /**
    * Returns all <code>end</code> elements
    * @return list of <code>end</code> 
    */
   public List<End<Flow<T>>> getAllEnd();

   /**
    * Removes all <code>end</code> elements 
    * @return the current instance of <code>End<Flow<T>></code> 
    */
   public Flow<T> removeAllEnd();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Flow ElementName: jsl:Fail ElementType : fail
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>fail</code> element will be created and returned.
    * Otherwise, the first existing <code>fail</code> element will be returned.
    * @return the instance defined for the element <code>fail</code> 
    */
   public Fail<Flow<T>> getOrCreateFail();

   /**
    * Creates a new <code>fail</code> element 
    * @return the new created instance of <code>Fail<Flow<T>></code> 
    */
   public Fail<Flow<T>> createFail();

   /**
    * Returns all <code>fail</code> elements
    * @return list of <code>fail</code> 
    */
   public List<Fail<Flow<T>>> getAllFail();

   /**
    * Removes all <code>fail</code> elements 
    * @return the current instance of <code>Fail<Flow<T>></code> 
    */
   public Flow<T> removeAllFail();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Flow ElementName: jsl:Next ElementType : next
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>next</code> element will be created and returned.
    * Otherwise, the first existing <code>next</code> element will be returned.
    * @return the instance defined for the element <code>next</code> 
    */
   public Next<Flow<T>> getOrCreateNext();

   /**
    * Creates a new <code>next</code> element 
    * @return the new created instance of <code>Next<Flow<T>></code> 
    */
   public Next<Flow<T>> createNext();

   /**
    * Returns all <code>next</code> elements
    * @return list of <code>next</code> 
    */
   public List<Next<Flow<T>>> getAllNext();

   /**
    * Removes all <code>next</code> elements 
    * @return the current instance of <code>Next<Flow<T>></code> 
    */
   public Flow<T> removeAllNext();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Flow ElementName: jsl:Stop ElementType : stop
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>stop</code> element will be created and returned.
    * Otherwise, the first existing <code>stop</code> element will be returned.
    * @return the instance defined for the element <code>stop</code> 
    */
   public Stop<Flow<T>> getOrCreateStop();

   /**
    * Creates a new <code>stop</code> element 
    * @return the new created instance of <code>Stop<Flow<T>></code> 
    */
   public Stop<Flow<T>> createStop();

   /**
    * Returns all <code>stop</code> elements
    * @return list of <code>stop</code> 
    */
   public List<Stop<Flow<T>>> getAllStop();

   /**
    * Removes all <code>stop</code> elements 
    * @return the current instance of <code>Stop<Flow<T>></code> 
    */
   public Flow<T> removeAllStop();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Flow ElementName: jsl:Decision ElementType : decision
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>decision</code> element will be created and returned.
    * Otherwise, the first existing <code>decision</code> element will be returned.
    * @return the instance defined for the element <code>decision</code> 
    */
   public Decision<Flow<T>> getOrCreateDecision();

   /**
    * Creates a new <code>decision</code> element 
    * @return the new created instance of <code>Decision<Flow<T>></code> 
    */
   public Decision<Flow<T>> createDecision();

   /**
    * Returns all <code>decision</code> elements
    * @return list of <code>decision</code> 
    */
   public List<Decision<Flow<T>>> getAllDecision();

   /**
    * Removes all <code>decision</code> elements 
    * @return the current instance of <code>Decision<Flow<T>></code> 
    */
   public Flow<T> removeAllDecision();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Flow ElementName: jsl:Flow ElementType : flow
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>flow</code> element will be created and returned.
    * Otherwise, the first existing <code>flow</code> element will be returned.
    * @return the instance defined for the element <code>flow</code> 
    */
   public Flow<Flow<T>> getOrCreateFlow();

   /**
    * Creates a new <code>flow</code> element 
    * @return the new created instance of <code>Flow<Flow<T>></code> 
    */
   public Flow<Flow<T>> createFlow();

   /**
    * Returns all <code>flow</code> elements
    * @return list of <code>flow</code> 
    */
   public List<Flow<Flow<T>>> getAllFlow();

   /**
    * Removes all <code>flow</code> elements 
    * @return the current instance of <code>Flow<Flow<T>></code> 
    */
   public Flow<T> removeAllFlow();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Flow ElementName: jsl:Split ElementType : split
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>split</code> element will be created and returned.
    * Otherwise, the first existing <code>split</code> element will be returned.
    * @return the instance defined for the element <code>split</code> 
    */
   public Split<Flow<T>> getOrCreateSplit();

   /**
    * Creates a new <code>split</code> element 
    * @return the new created instance of <code>Split<Flow<T>></code> 
    */
   public Split<Flow<T>> createSplit();

   /**
    * Returns all <code>split</code> elements
    * @return list of <code>split</code> 
    */
   public List<Split<Flow<T>>> getAllSplit();

   /**
    * Removes all <code>split</code> elements 
    * @return the current instance of <code>Split<Flow<T>></code> 
    */
   public Flow<T> removeAllSplit();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Flow ElementName: jsl:Step ElementType : step
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>step</code> element will be created and returned.
    * Otherwise, the first existing <code>step</code> element will be returned.
    * @return the instance defined for the element <code>step</code> 
    */
   public Step<Flow<T>> getOrCreateStep();

   /**
    * Creates a new <code>step</code> element 
    * @return the new created instance of <code>Step<Flow<T>></code> 
    */
   public Step<Flow<T>> createStep();

   /**
    * Returns all <code>step</code> elements
    * @return list of <code>step</code> 
    */
   public List<Step<Flow<T>>> getAllStep();

   /**
    * Removes all <code>step</code> elements 
    * @return the current instance of <code>Step<Flow<T>></code> 
    */
   public Flow<T> removeAllStep();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Flow ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>Flow<T></code> 
    */
   public Flow<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>Flow<T></code> 
    */
   public Flow<T> removeId();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Flow ElementName: xsd:string ElementType : next
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>next</code> attribute
    * @param next the value for the attribute <code>next</code> 
    * @return the current instance of <code>Flow<T></code> 
    */
   public Flow<T> next(String next);

   /**
    * Returns the <code>next</code> attribute
    * @return the value defined for the attribute <code>next</code> 
    */
   public String getNext();

   /**
    * Removes the <code>next</code> attribute 
    * @return the current instance of <code>Flow<T></code> 
    */
   public Flow<T> removeNext();
}
