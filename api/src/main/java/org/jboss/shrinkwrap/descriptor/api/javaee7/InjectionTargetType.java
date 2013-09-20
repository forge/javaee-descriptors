package org.jboss.shrinkwrap.descriptor.api.javaee7; 

import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> injection-targetType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface InjectionTargetType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: InjectionTargetType ElementName: xsd:token ElementType : injection-target-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>injection-target-class</code> element
    * @param injectionTargetClass the value for the element <code>injection-target-class</code> 
    * @return the current instance of <code>InjectionTargetType<T></code> 
    */
   public InjectionTargetType<T> injectionTargetClass(String injectionTargetClass);

   /**
    * Returns the <code>injection-target-class</code> element
    * @return the node defined for the element <code>injection-target-class</code> 
    */
   public String getInjectionTargetClass();

   /**
    * Removes the <code>injection-target-class</code> element 
    * @return the current instance of <code>InjectionTargetType<T></code> 
    */
   public InjectionTargetType<T> removeInjectionTargetClass();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: InjectionTargetType ElementName: xsd:token ElementType : injection-target-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>injection-target-name</code> element
    * @param injectionTargetName the value for the element <code>injection-target-name</code> 
    * @return the current instance of <code>InjectionTargetType<T></code> 
    */
   public InjectionTargetType<T> injectionTargetName(String injectionTargetName);

   /**
    * Returns the <code>injection-target-name</code> element
    * @return the node defined for the element <code>injection-target-name</code> 
    */
   public String getInjectionTargetName();

   /**
    * Removes the <code>injection-target-name</code> element 
    * @return the current instance of <code>InjectionTargetType<T></code> 
    */
   public InjectionTargetType<T> removeInjectionTargetName();
}
