package org.jboss.shrinkwrap.descriptor.impl.facespartialresponse22; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.facespartialresponse22.PartialResponseInsertType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.facespartialresponse22.Before;
import org.jboss.shrinkwrap.descriptor.impl.facespartialresponse22.BeforeImpl;
import org.jboss.shrinkwrap.descriptor.api.facespartialresponse22.After;
import org.jboss.shrinkwrap.descriptor.impl.facespartialresponse22.AfterImpl;

/**
 * This class implements the <code> partial-response-insertType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class PartialResponseInsertTypeImpl<T> implements Child<T>, PartialResponseInsertType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public PartialResponseInsertTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public PartialResponseInsertTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PartialResponseInsertType ElementName: javaee:before ElementType : before
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>before</code> element with the given value will be created.
    * Otherwise, the existing <code>before</code> element will be returned.
    * @return  a new or existing instance of <code>Before<PartialResponseInsertType<T>></code> 
    */
   public Before<PartialResponseInsertType<T>> getOrCreateBefore()
   {
      Node node = childNode.getOrCreate("before");
      Before<PartialResponseInsertType<T>> before = new BeforeImpl<PartialResponseInsertType<T>>(this, "before", childNode, node);
      return before;
   }

   /**
    * Removes the <code>before</code> element 
    * @return the current instance of <code>PartialResponseInsertType<T></code> 
    */
   public PartialResponseInsertType<T> removeBefore()
   {
      childNode.removeChildren("before");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: PartialResponseInsertType ElementName: javaee:after ElementType : after
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>after</code> element with the given value will be created.
    * Otherwise, the existing <code>after</code> element will be returned.
    * @return  a new or existing instance of <code>After<PartialResponseInsertType<T>></code> 
    */
   public After<PartialResponseInsertType<T>> getOrCreateAfter()
   {
      Node node = childNode.getOrCreate("after");
      After<PartialResponseInsertType<T>> after = new AfterImpl<PartialResponseInsertType<T>>(this, "after", childNode, node);
      return after;
   }

   /**
    * Removes the <code>after</code> element 
    * @return the current instance of <code>PartialResponseInsertType<T></code> 
    */
   public PartialResponseInsertType<T> removeAfter()
   {
      childNode.removeChildren("after");
      return this;
   }
}
