package org.jboss.shrinkwrap.descriptor.impl.ejbjar31; 

import org.jboss.shrinkwrap.descriptor.spi.node.Node;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.TimerScheduleType;
import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.api.DescriptorExporter;

/**
 * This class implements the <code> timer-scheduleType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class TimerScheduleTypeImpl<T> implements Child<T>, TimerScheduleType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public TimerScheduleTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public TimerScheduleTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TimerScheduleType ElementName: xsd:token ElementType : second
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>second</code> element
    * @param second the value for the element <code>second</code> 
    * @return the current instance of <code>TimerScheduleType<T></code> 
    */
   public TimerScheduleType<T> second(String second)
   {
      childNode.getOrCreate("second").text(second);
      return this;
   }

   /**
    * Returns the <code>second</code> element
    * @return the node defined for the element <code>second</code> 
    */
   public String getSecond()
   {
      return childNode.getTextValueForPatternName("second");
   }

   /**
    * Removes the <code>second</code> element 
    * @return the current instance of <code>TimerScheduleType<T></code> 
    */
   public TimerScheduleType<T> removeSecond()
   {
      childNode.removeChildren("second");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TimerScheduleType ElementName: xsd:token ElementType : minute
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>minute</code> element
    * @param minute the value for the element <code>minute</code> 
    * @return the current instance of <code>TimerScheduleType<T></code> 
    */
   public TimerScheduleType<T> minute(String minute)
   {
      childNode.getOrCreate("minute").text(minute);
      return this;
   }

   /**
    * Returns the <code>minute</code> element
    * @return the node defined for the element <code>minute</code> 
    */
   public String getMinute()
   {
      return childNode.getTextValueForPatternName("minute");
   }

   /**
    * Removes the <code>minute</code> element 
    * @return the current instance of <code>TimerScheduleType<T></code> 
    */
   public TimerScheduleType<T> removeMinute()
   {
      childNode.removeChildren("minute");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TimerScheduleType ElementName: xsd:token ElementType : hour
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>hour</code> element
    * @param hour the value for the element <code>hour</code> 
    * @return the current instance of <code>TimerScheduleType<T></code> 
    */
   public TimerScheduleType<T> hour(String hour)
   {
      childNode.getOrCreate("hour").text(hour);
      return this;
   }

   /**
    * Returns the <code>hour</code> element
    * @return the node defined for the element <code>hour</code> 
    */
   public String getHour()
   {
      return childNode.getTextValueForPatternName("hour");
   }

   /**
    * Removes the <code>hour</code> element 
    * @return the current instance of <code>TimerScheduleType<T></code> 
    */
   public TimerScheduleType<T> removeHour()
   {
      childNode.removeChildren("hour");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TimerScheduleType ElementName: xsd:token ElementType : day-of-month
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>day-of-month</code> element
    * @param dayOfMonth the value for the element <code>day-of-month</code> 
    * @return the current instance of <code>TimerScheduleType<T></code> 
    */
   public TimerScheduleType<T> dayOfMonth(String dayOfMonth)
   {
      childNode.getOrCreate("day-of-month").text(dayOfMonth);
      return this;
   }

   /**
    * Returns the <code>day-of-month</code> element
    * @return the node defined for the element <code>day-of-month</code> 
    */
   public String getDayOfMonth()
   {
      return childNode.getTextValueForPatternName("day-of-month");
   }

   /**
    * Removes the <code>day-of-month</code> element 
    * @return the current instance of <code>TimerScheduleType<T></code> 
    */
   public TimerScheduleType<T> removeDayOfMonth()
   {
      childNode.removeChildren("day-of-month");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TimerScheduleType ElementName: xsd:token ElementType : month
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>month</code> element
    * @param month the value for the element <code>month</code> 
    * @return the current instance of <code>TimerScheduleType<T></code> 
    */
   public TimerScheduleType<T> month(String month)
   {
      childNode.getOrCreate("month").text(month);
      return this;
   }

   /**
    * Returns the <code>month</code> element
    * @return the node defined for the element <code>month</code> 
    */
   public String getMonth()
   {
      return childNode.getTextValueForPatternName("month");
   }

   /**
    * Removes the <code>month</code> element 
    * @return the current instance of <code>TimerScheduleType<T></code> 
    */
   public TimerScheduleType<T> removeMonth()
   {
      childNode.removeChildren("month");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TimerScheduleType ElementName: xsd:token ElementType : day-of-week
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>day-of-week</code> element
    * @param dayOfWeek the value for the element <code>day-of-week</code> 
    * @return the current instance of <code>TimerScheduleType<T></code> 
    */
   public TimerScheduleType<T> dayOfWeek(String dayOfWeek)
   {
      childNode.getOrCreate("day-of-week").text(dayOfWeek);
      return this;
   }

   /**
    * Returns the <code>day-of-week</code> element
    * @return the node defined for the element <code>day-of-week</code> 
    */
   public String getDayOfWeek()
   {
      return childNode.getTextValueForPatternName("day-of-week");
   }

   /**
    * Removes the <code>day-of-week</code> element 
    * @return the current instance of <code>TimerScheduleType<T></code> 
    */
   public TimerScheduleType<T> removeDayOfWeek()
   {
      childNode.removeChildren("day-of-week");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TimerScheduleType ElementName: xsd:token ElementType : year
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>year</code> element
    * @param year the value for the element <code>year</code> 
    * @return the current instance of <code>TimerScheduleType<T></code> 
    */
   public TimerScheduleType<T> year(String year)
   {
      childNode.getOrCreate("year").text(year);
      return this;
   }

   /**
    * Returns the <code>year</code> element
    * @return the node defined for the element <code>year</code> 
    */
   public String getYear()
   {
      return childNode.getTextValueForPatternName("year");
   }

   /**
    * Removes the <code>year</code> element 
    * @return the current instance of <code>TimerScheduleType<T></code> 
    */
   public TimerScheduleType<T> removeYear()
   {
      childNode.removeChildren("year");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TimerScheduleType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>TimerScheduleType<T></code> 
    */
   public TimerScheduleType<T> id(String id)
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
    * @return the current instance of <code>TimerScheduleType<T></code> 
    */
   public TimerScheduleType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
