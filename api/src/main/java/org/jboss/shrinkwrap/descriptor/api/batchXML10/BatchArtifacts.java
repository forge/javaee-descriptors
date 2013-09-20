package org.jboss.shrinkwrap.descriptor.api.batchXML10; 

import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> BatchArtifacts </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface BatchArtifacts<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: BatchArtifacts ElementName: jbatch:BatchArtifactRef ElementType : ref
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>ref</code> element will be created and returned.
    * Otherwise, the first existing <code>ref</code> element will be returned.
    * @return the instance defined for the element <code>ref</code> 
    */
   public BatchArtifactRef<BatchArtifacts<T>> getOrCreateRef();

   /**
    * Creates a new <code>ref</code> element 
    * @return the new created instance of <code>BatchArtifactRef<BatchArtifacts<T>></code> 
    */
   public BatchArtifactRef<BatchArtifacts<T>> createRef();

   /**
    * Returns all <code>ref</code> elements
    * @return list of <code>ref</code> 
    */
   public List<BatchArtifactRef<BatchArtifacts<T>>> getAllRef();

   /**
    * Removes all <code>ref</code> elements 
    * @return the current instance of <code>BatchArtifactRef<BatchArtifacts<T>></code> 
    */
   public BatchArtifacts<T> removeAllRef();
}
