package org.jboss.shrinkwrap.descriptor.api.jobXML10; 

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> Batchlet </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface Batchlet<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Batchlet ElementName: jsl:Properties ElementType : properties
   // MaxOccurs: -1  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>properties</code> element with the given value will be created.
    * Otherwise, the existing <code>properties</code> element will be returned.
    * @return  a new or existing instance of <code>Properties<Batchlet<T>></code> 
    */
   public Properties<Batchlet<T>> getOrCreateProperties();

   /**
    * Removes the <code>properties</code> element 
    * @return the current instance of <code>Batchlet<T></code> 
    */
   public Batchlet<T> removeProperties();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Batchlet ElementName: xsd:string ElementType : ref
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>ref</code> attribute
    * @param ref the value for the attribute <code>ref</code> 
    * @return the current instance of <code>Batchlet<T></code> 
    */
   public Batchlet<T> ref(String ref);

   /**
    * Returns the <code>ref</code> attribute
    * @return the value defined for the attribute <code>ref</code> 
    */
   public String getRef();

   /**
    * Removes the <code>ref</code> attribute 
    * @return the current instance of <code>Batchlet<T></code> 
    */
   public Batchlet<T> removeRef();
}
