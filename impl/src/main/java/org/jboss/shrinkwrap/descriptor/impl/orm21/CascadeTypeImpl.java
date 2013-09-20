package org.jboss.shrinkwrap.descriptor.impl.orm21; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.orm21.CascadeType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;
import org.jboss.shrinkwrap.descriptor.api.javaee7.EmptyType;
import org.jboss.shrinkwrap.descriptor.impl.javaee7.EmptyTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee7.EmptyType;
import org.jboss.shrinkwrap.descriptor.impl.javaee7.EmptyTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee7.EmptyType;
import org.jboss.shrinkwrap.descriptor.impl.javaee7.EmptyTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee7.EmptyType;
import org.jboss.shrinkwrap.descriptor.impl.javaee7.EmptyTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee7.EmptyType;
import org.jboss.shrinkwrap.descriptor.impl.javaee7.EmptyTypeImpl;
import org.jboss.shrinkwrap.descriptor.api.javaee7.EmptyType;
import org.jboss.shrinkwrap.descriptor.impl.javaee7.EmptyTypeImpl;

/**
 * This class implements the <code> cascade-type </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class CascadeTypeImpl<T> implements Child<T>, CascadeType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public CascadeTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public CascadeTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: CascadeType ElementName: javaee:emptyType ElementType : cascade-all
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>cascade-all</code> element 
    * @return the current instance of <code>CascadeType<T></code> 
    */
   public CascadeType<T> cascadeAll()
   {
      childNode.getOrCreate("cascade-all");
      return this;
   }

   /**
    * Removes the <code>cascade-all</code> element 
    * @return the current instance of <code>CascadeType<T></code> 
    */
   public Boolean isCascadeAll()
   {
      return childNode.getSingle("cascade-all") != null;
   }

   /**
    * Removes the <code>cascade-all</code> element 
    * @return the current instance of <code>CascadeType<T></code> 
    */
   public CascadeType<T> removeCascadeAll()
   {
      childNode.removeChild("cascade-all");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: CascadeType ElementName: javaee:emptyType ElementType : cascade-persist
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>cascade-persist</code> element 
    * @return the current instance of <code>CascadeType<T></code> 
    */
   public CascadeType<T> cascadePersist()
   {
      childNode.getOrCreate("cascade-persist");
      return this;
   }

   /**
    * Removes the <code>cascade-persist</code> element 
    * @return the current instance of <code>CascadeType<T></code> 
    */
   public Boolean isCascadePersist()
   {
      return childNode.getSingle("cascade-persist") != null;
   }

   /**
    * Removes the <code>cascade-persist</code> element 
    * @return the current instance of <code>CascadeType<T></code> 
    */
   public CascadeType<T> removeCascadePersist()
   {
      childNode.removeChild("cascade-persist");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: CascadeType ElementName: javaee:emptyType ElementType : cascade-merge
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>cascade-merge</code> element 
    * @return the current instance of <code>CascadeType<T></code> 
    */
   public CascadeType<T> cascadeMerge()
   {
      childNode.getOrCreate("cascade-merge");
      return this;
   }

   /**
    * Removes the <code>cascade-merge</code> element 
    * @return the current instance of <code>CascadeType<T></code> 
    */
   public Boolean isCascadeMerge()
   {
      return childNode.getSingle("cascade-merge") != null;
   }

   /**
    * Removes the <code>cascade-merge</code> element 
    * @return the current instance of <code>CascadeType<T></code> 
    */
   public CascadeType<T> removeCascadeMerge()
   {
      childNode.removeChild("cascade-merge");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: CascadeType ElementName: javaee:emptyType ElementType : cascade-remove
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>cascade-remove</code> element 
    * @return the current instance of <code>CascadeType<T></code> 
    */
   public CascadeType<T> cascadeRemove()
   {
      childNode.getOrCreate("cascade-remove");
      return this;
   }

   /**
    * Removes the <code>cascade-remove</code> element 
    * @return the current instance of <code>CascadeType<T></code> 
    */
   public Boolean isCascadeRemove()
   {
      return childNode.getSingle("cascade-remove") != null;
   }

   /**
    * Removes the <code>cascade-remove</code> element 
    * @return the current instance of <code>CascadeType<T></code> 
    */
   public CascadeType<T> removeCascadeRemove()
   {
      childNode.removeChild("cascade-remove");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: CascadeType ElementName: javaee:emptyType ElementType : cascade-refresh
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>cascade-refresh</code> element 
    * @return the current instance of <code>CascadeType<T></code> 
    */
   public CascadeType<T> cascadeRefresh()
   {
      childNode.getOrCreate("cascade-refresh");
      return this;
   }

   /**
    * Removes the <code>cascade-refresh</code> element 
    * @return the current instance of <code>CascadeType<T></code> 
    */
   public Boolean isCascadeRefresh()
   {
      return childNode.getSingle("cascade-refresh") != null;
   }

   /**
    * Removes the <code>cascade-refresh</code> element 
    * @return the current instance of <code>CascadeType<T></code> 
    */
   public CascadeType<T> removeCascadeRefresh()
   {
      childNode.removeChild("cascade-refresh");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: CascadeType ElementName: javaee:emptyType ElementType : cascade-detach
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>cascade-detach</code> element 
    * @return the current instance of <code>CascadeType<T></code> 
    */
   public CascadeType<T> cascadeDetach()
   {
      childNode.getOrCreate("cascade-detach");
      return this;
   }

   /**
    * Removes the <code>cascade-detach</code> element 
    * @return the current instance of <code>CascadeType<T></code> 
    */
   public Boolean isCascadeDetach()
   {
      return childNode.getSingle("cascade-detach") != null;
   }

   /**
    * Removes the <code>cascade-detach</code> element 
    * @return the current instance of <code>CascadeType<T></code> 
    */
   public CascadeType<T> removeCascadeDetach()
   {
      childNode.removeChild("cascade-detach");
      return this;
   }
}
