package org.jboss.shrinkwrap.descriptor.api.orm10; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee5.EmptyType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.EmptyType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.EmptyType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.EmptyType;
import org.jboss.shrinkwrap.descriptor.api.javaee5.EmptyType;
/**
 * This interface defines the contract for the <code> cascade-type </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface CascadeType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: CascadeType ElementName: javaee:emptyType ElementType : cascade-all
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>cascade-all</code> element 
    * @return the current instance of <code>CascadeType<T></code> 
    */
   public CascadeType<T> cascadeAll();

   /**
    * Removes the <code>cascade-all</code> element 
    * @return the current instance of <code>CascadeType<T></code> 
    */
   public Boolean isCascadeAll();

   /**
    * Removes the <code>cascade-all</code> element 
    * @return the current instance of <code>CascadeType<T></code> 
    */
   public CascadeType<T> removeCascadeAll();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: CascadeType ElementName: javaee:emptyType ElementType : cascade-persist
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>cascade-persist</code> element 
    * @return the current instance of <code>CascadeType<T></code> 
    */
   public CascadeType<T> cascadePersist();

   /**
    * Removes the <code>cascade-persist</code> element 
    * @return the current instance of <code>CascadeType<T></code> 
    */
   public Boolean isCascadePersist();

   /**
    * Removes the <code>cascade-persist</code> element 
    * @return the current instance of <code>CascadeType<T></code> 
    */
   public CascadeType<T> removeCascadePersist();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: CascadeType ElementName: javaee:emptyType ElementType : cascade-merge
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>cascade-merge</code> element 
    * @return the current instance of <code>CascadeType<T></code> 
    */
   public CascadeType<T> cascadeMerge();

   /**
    * Removes the <code>cascade-merge</code> element 
    * @return the current instance of <code>CascadeType<T></code> 
    */
   public Boolean isCascadeMerge();

   /**
    * Removes the <code>cascade-merge</code> element 
    * @return the current instance of <code>CascadeType<T></code> 
    */
   public CascadeType<T> removeCascadeMerge();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: CascadeType ElementName: javaee:emptyType ElementType : cascade-remove
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>cascade-remove</code> element 
    * @return the current instance of <code>CascadeType<T></code> 
    */
   public CascadeType<T> cascadeRemove();

   /**
    * Removes the <code>cascade-remove</code> element 
    * @return the current instance of <code>CascadeType<T></code> 
    */
   public Boolean isCascadeRemove();

   /**
    * Removes the <code>cascade-remove</code> element 
    * @return the current instance of <code>CascadeType<T></code> 
    */
   public CascadeType<T> removeCascadeRemove();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: CascadeType ElementName: javaee:emptyType ElementType : cascade-refresh
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>cascade-refresh</code> element 
    * @return the current instance of <code>CascadeType<T></code> 
    */
   public CascadeType<T> cascadeRefresh();

   /**
    * Removes the <code>cascade-refresh</code> element 
    * @return the current instance of <code>CascadeType<T></code> 
    */
   public Boolean isCascadeRefresh();

   /**
    * Removes the <code>cascade-refresh</code> element 
    * @return the current instance of <code>CascadeType<T></code> 
    */
   public CascadeType<T> removeCascadeRefresh();
}
