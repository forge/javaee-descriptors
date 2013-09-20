package org.jboss.shrinkwrap.descriptor.api.permissions7; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> permission </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface Permission<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Permission ElementName: xsd:token ElementType : class-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>class-name</code> element
    * @param className the value for the element <code>class-name</code> 
    * @return the current instance of <code>Permission<T></code> 
    */
   public Permission<T> className(String className);

   /**
    * Returns the <code>class-name</code> element
    * @return the node defined for the element <code>class-name</code> 
    */
   public String getClassName();

   /**
    * Removes the <code>class-name</code> element 
    * @return the current instance of <code>Permission<T></code> 
    */
   public Permission<T> removeClassName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Permission ElementName: xsd:token ElementType : name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>name</code> element
    * @param name the value for the element <code>name</code> 
    * @return the current instance of <code>Permission<T></code> 
    */
   public Permission<T> name(String name);

   /**
    * Returns the <code>name</code> element
    * @return the node defined for the element <code>name</code> 
    */
   public String getName();

   /**
    * Removes the <code>name</code> element 
    * @return the current instance of <code>Permission<T></code> 
    */
   public Permission<T> removeName();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: Permission ElementName: xsd:token ElementType : actions
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>actions</code> element
    * @param actions the value for the element <code>actions</code> 
    * @return the current instance of <code>Permission<T></code> 
    */
   public Permission<T> actions(String actions);

   /**
    * Returns the <code>actions</code> element
    * @return the node defined for the element <code>actions</code> 
    */
   public String getActions();

   /**
    * Removes the <code>actions</code> element 
    * @return the current instance of <code>Permission<T></code> 
    */
   public Permission<T> removeActions();
}
