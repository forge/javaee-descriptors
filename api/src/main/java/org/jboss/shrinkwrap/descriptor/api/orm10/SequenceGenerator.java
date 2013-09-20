package org.jboss.shrinkwrap.descriptor.api.orm10; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> sequence-generator </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface SequenceGenerator<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SequenceGenerator ElementName: xsd:string ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> attribute
    * @param name the value for the attribute <code>name</code> 
    * @return the current instance of <code>SequenceGenerator<T></code> 
    */
   public SequenceGenerator<T> name(String name);

   /**
    * Returns the <code>name</code> attribute
    * @return the value defined for the attribute <code>name</code> 
    */
   public String getName();

   /**
    * Removes the <code>name</code> attribute 
    * @return the current instance of <code>SequenceGenerator<T></code> 
    */
   public SequenceGenerator<T> removeName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SequenceGenerator ElementName: xsd:string ElementType : sequence-name
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>sequence-name</code> attribute
    * @param sequenceName the value for the attribute <code>sequence-name</code> 
    * @return the current instance of <code>SequenceGenerator<T></code> 
    */
   public SequenceGenerator<T> sequenceName(String sequenceName);

   /**
    * Returns the <code>sequence-name</code> attribute
    * @return the value defined for the attribute <code>sequence-name</code> 
    */
   public String getSequenceName();

   /**
    * Removes the <code>sequence-name</code> attribute 
    * @return the current instance of <code>SequenceGenerator<T></code> 
    */
   public SequenceGenerator<T> removeSequenceName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SequenceGenerator ElementName: xsd:int ElementType : initial-value
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>initial-value</code> attribute
    * @param initialValue the value for the attribute <code>initial-value</code> 
    * @return the current instance of <code>SequenceGenerator<T></code> 
    */
   public SequenceGenerator<T> initialValue(Integer initialValue);

   /**
    * Returns the <code>initial-value</code> attribute
    * @return the value defined for the attribute <code>initial-value</code> 
    */
public Integer getInitialValue();

   /**
    * Removes the <code>initial-value</code> attribute 
    * @return the current instance of <code>SequenceGenerator<T></code> 
    */
   public SequenceGenerator<T> removeInitialValue();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: SequenceGenerator ElementName: xsd:int ElementType : allocation-size
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>allocation-size</code> attribute
    * @param allocationSize the value for the attribute <code>allocation-size</code> 
    * @return the current instance of <code>SequenceGenerator<T></code> 
    */
   public SequenceGenerator<T> allocationSize(Integer allocationSize);

   /**
    * Returns the <code>allocation-size</code> attribute
    * @return the value defined for the attribute <code>allocation-size</code> 
    */
public Integer getAllocationSize();

   /**
    * Removes the <code>allocation-size</code> attribute 
    * @return the current instance of <code>SequenceGenerator<T></code> 
    */
   public SequenceGenerator<T> removeAllocationSize();
}
