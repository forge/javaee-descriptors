package org.jboss.shrinkwrap.descriptor.impl.javaee5; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.javaee5.InjectionTargetType;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> injection-targetType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class InjectionTargetTypeImpl<T> implements Child<T>, InjectionTargetType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public InjectionTargetTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public InjectionTargetTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: InjectionTargetType ElementName: xsd:token ElementType : injection-target-class
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>injection-target-class</code> element
    * @param injectionTargetClass the value for the element <code>injection-target-class</code> 
    * @return the current instance of <code>InjectionTargetType<T></code> 
    */
   public InjectionTargetType<T> injectionTargetClass(String injectionTargetClass)
   {
      childNode.getOrCreate("injection-target-class").text(injectionTargetClass);
      return this;
   }

   /**
    * Returns the <code>injection-target-class</code> element
    * @return the node defined for the element <code>injection-target-class</code> 
    */
   public String getInjectionTargetClass()
   {
      return childNode.getTextValueForPatternName("injection-target-class");
   }

   /**
    * Removes the <code>injection-target-class</code> element 
    * @return the current instance of <code>InjectionTargetType<T></code> 
    */
   public InjectionTargetType<T> removeInjectionTargetClass()
   {
      childNode.removeChildren("injection-target-class");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: InjectionTargetType ElementName: xsd:token ElementType : injection-target-name
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>injection-target-name</code> element
    * @param injectionTargetName the value for the element <code>injection-target-name</code> 
    * @return the current instance of <code>InjectionTargetType<T></code> 
    */
   public InjectionTargetType<T> injectionTargetName(String injectionTargetName)
   {
      childNode.getOrCreate("injection-target-name").text(injectionTargetName);
      return this;
   }

   /**
    * Returns the <code>injection-target-name</code> element
    * @return the node defined for the element <code>injection-target-name</code> 
    */
   public String getInjectionTargetName()
   {
      return childNode.getTextValueForPatternName("injection-target-name");
   }

   /**
    * Removes the <code>injection-target-name</code> element 
    * @return the current instance of <code>InjectionTargetType<T></code> 
    */
   public InjectionTargetType<T> removeInjectionTargetName()
   {
      childNode.removeChildren("injection-target-name");
      return this;
   }
}
