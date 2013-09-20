package org.jboss.shrinkwrap.descriptor.impl.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.AccessTimeoutType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.TimeUnitTypeType;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> access-timeoutType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class AccessTimeoutTypeImpl<T> implements Child<T>, AccessTimeoutType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public AccessTimeoutTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public AccessTimeoutTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: AccessTimeoutType ElementName: xsd:integer ElementType : timeout
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>timeout</code> element
    * @param timeout the value for the element <code>timeout</code> 
    * @return the current instance of <code>AccessTimeoutType<T></code> 
    */
   public AccessTimeoutType<T> timeout(Integer timeout)
   {
      childNode.getOrCreate("timeout").text(timeout);
      return this;
   }

   /**
    * Returns the <code>timeout</code> element
    * @return the node defined for the element <code>timeout</code> 
    */
   public Integer getTimeout()
   {
      if (childNode.getTextValueForPatternName("timeout") != null && !childNode.getTextValueForPatternName("timeout").equals("null")) {
         return Integer.valueOf(childNode.getTextValueForPatternName("timeout"));
      }
      return null;
   }

   /**
    * Removes the <code>timeout</code> element 
    * @return the current instance of <code>AccessTimeoutType<T></code> 
    */
   public AccessTimeoutType<T> removeTimeout()
   {
      childNode.removeChildren("timeout");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: AccessTimeoutType ElementName: javaee:time-unit-typeType ElementType : unit
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: true isDataType: false
   // --------------------------------------------------------------------------------------------------------||
   /**
    * Sets the <code>unit</code> element
    * @param unit the value for the element <code>unit</code> 
    * @return the current instance of <code>AccessTimeoutType<T></code> 
    */
   public AccessTimeoutType<T> unit(TimeUnitTypeType unit)
   {
      childNode.getOrCreate("unit").text(unit);
      return this;
   }
   /**
    * Sets the <code>unit</code> element
    * @param unit the value for the element <code>unit</code> 
    * @return the current instance of <code>AccessTimeoutType<T></code> 
    */
   public AccessTimeoutType<T> unit(String unit)
   {
      childNode.getOrCreate("unit").text(unit);
      return this;
   }

   /**
    * Returns the <code>unit</code> element
    * @return the value found for the element <code>unit</code> 
    */
   public TimeUnitTypeType getUnit()
   {
      return TimeUnitTypeType.getFromStringValue(childNode.getTextValueForPatternName("unit"));
   }

   /**
    * Returns the <code>unit</code> element
    * @return the value found for the element <code>unit</code> 
    */
   public String  getUnitAsString()
   {
      return childNode.getTextValueForPatternName("unit");
   }

   /**
    * Removes the <code>unit</code> attribute 
    * @return the current instance of <code>AccessTimeoutType<T></code> 
    */
   public AccessTimeoutType<T> removeUnit()
   {
      childNode.removeAttribute("unit");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: AccessTimeoutType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>AccessTimeoutType<T></code> 
    */
   public AccessTimeoutType<T> id(String id)
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
    * @return the current instance of <code>AccessTimeoutType<T></code> 
    */
   public AccessTimeoutType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
