package org.jboss.shrinkwrap.descriptor.impl.batchXML10; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.batchXML10.BatchArtifactRef;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> BatchArtifactRef </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class BatchArtifactRefImpl<T> implements Child<T>, BatchArtifactRef<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public BatchArtifactRefImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public BatchArtifactRefImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: BatchArtifactRef ElementName: xsd:string ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>BatchArtifactRef<T></code> 
    */
   public BatchArtifactRef<T> id(String id)
   {
      childNode.attribute("id", id);
      return this;
   }

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
      public String getId()
   {
      return childNode.getAttribute("id");
   }

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>BatchArtifactRef<T></code> 
    */
   public BatchArtifactRef<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: BatchArtifactRef ElementName: xsd:string ElementType : class
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>class</code> attribute
    * @param clazz the value for the attribute <code>class</code> 
    * @return the current instance of <code>BatchArtifactRef<T></code> 
    */
   public BatchArtifactRef<T> clazz(String clazz)
   {
      childNode.attribute("class", clazz);
      return this;
   }

   /**
    * Returns the <code>class</code> attribute
    * @return the value defined for the attribute <code>class</code> 
    */
      public String getClazz()
   {
      return childNode.getAttribute("class");
   }

   /**
    * Removes the <code>class</code> attribute 
    * @return the current instance of <code>BatchArtifactRef<T></code> 
    */
   public BatchArtifactRef<T> removeClazzAttr()
   {
      childNode.removeAttribute("class");
      return this;
   }
}
