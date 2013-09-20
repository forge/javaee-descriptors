package org.jboss.shrinkwrap.descriptor.api.jobXML10; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> Decision </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface Decision<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Decision ElementName: jsl:End ElementType : end
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>end</code> element will be created and returned.
    * Otherwise, the first existing <code>end</code> element will be returned.
    * @return the instance defined for the element <code>end</code> 
    */
   public End<Decision<T>> getOrCreateEnd();

   /**
    * Creates a new <code>end</code> element 
    * @return the new created instance of <code>End<Decision<T>></code> 
    */
   public End<Decision<T>> createEnd();

   /**
    * Returns all <code>end</code> elements
    * @return list of <code>end</code> 
    */
   public List<End<Decision<T>>> getAllEnd();

   /**
    * Removes all <code>end</code> elements 
    * @return the current instance of <code>End<Decision<T>></code> 
    */
   public Decision<T> removeAllEnd();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Decision ElementName: jsl:Fail ElementType : fail
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>fail</code> element will be created and returned.
    * Otherwise, the first existing <code>fail</code> element will be returned.
    * @return the instance defined for the element <code>fail</code> 
    */
   public Fail<Decision<T>> getOrCreateFail();

   /**
    * Creates a new <code>fail</code> element 
    * @return the new created instance of <code>Fail<Decision<T>></code> 
    */
   public Fail<Decision<T>> createFail();

   /**
    * Returns all <code>fail</code> elements
    * @return list of <code>fail</code> 
    */
   public List<Fail<Decision<T>>> getAllFail();

   /**
    * Removes all <code>fail</code> elements 
    * @return the current instance of <code>Fail<Decision<T>></code> 
    */
   public Decision<T> removeAllFail();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Decision ElementName: jsl:Next ElementType : next
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>next</code> element will be created and returned.
    * Otherwise, the first existing <code>next</code> element will be returned.
    * @return the instance defined for the element <code>next</code> 
    */
   public Next<Decision<T>> getOrCreateNext();

   /**
    * Creates a new <code>next</code> element 
    * @return the new created instance of <code>Next<Decision<T>></code> 
    */
   public Next<Decision<T>> createNext();

   /**
    * Returns all <code>next</code> elements
    * @return list of <code>next</code> 
    */
   public List<Next<Decision<T>>> getAllNext();

   /**
    * Removes all <code>next</code> elements 
    * @return the current instance of <code>Next<Decision<T>></code> 
    */
   public Decision<T> removeAllNext();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Decision ElementName: jsl:Stop ElementType : stop
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>stop</code> element will be created and returned.
    * Otherwise, the first existing <code>stop</code> element will be returned.
    * @return the instance defined for the element <code>stop</code> 
    */
   public Stop<Decision<T>> getOrCreateStop();

   /**
    * Creates a new <code>stop</code> element 
    * @return the new created instance of <code>Stop<Decision<T>></code> 
    */
   public Stop<Decision<T>> createStop();

   /**
    * Returns all <code>stop</code> elements
    * @return list of <code>stop</code> 
    */
   public List<Stop<Decision<T>>> getAllStop();

   /**
    * Removes all <code>stop</code> elements 
    * @return the current instance of <code>Stop<Decision<T>></code> 
    */
   public Decision<T> removeAllStop();
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Decision ElementName: jsl:Properties ElementType : properties
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>properties</code> element with the given value will be created.
    * Otherwise, the existing <code>properties</code> element will be returned.
    * @return  a new or existing instance of <code>Properties<Decision<T>></code> 
    */
   public Properties<Decision<T>> getOrCreateProperties();

   /**
    * Removes the <code>properties</code> element 
    * @return the current instance of <code>Decision<T></code> 
    */
   public Decision<T> removeProperties();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Decision ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>Decision<T></code> 
    */
   public Decision<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>Decision<T></code> 
    */
   public Decision<T> removeId();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Decision ElementName: xsd:string ElementType : ref
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>ref</code> attribute
    * @param ref the value for the attribute <code>ref</code> 
    * @return the current instance of <code>Decision<T></code> 
    */
   public Decision<T> ref(String ref);

   /**
    * Returns the <code>ref</code> attribute
    * @return the value defined for the attribute <code>ref</code> 
    */
   public String getRef();

   /**
    * Removes the <code>ref</code> attribute 
    * @return the current instance of <code>Decision<T></code> 
    */
   public Decision<T> removeRef();
}
