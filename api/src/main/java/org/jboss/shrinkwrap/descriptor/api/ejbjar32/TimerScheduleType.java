package org.jboss.shrinkwrap.descriptor.api.ejbjar32; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
/**
 * This interface defines the contract for the <code> timer-scheduleType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface TimerScheduleType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TimerScheduleType ElementName: xsd:token ElementType : second
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>second</code> element
    * @param second the value for the element <code>second</code> 
    * @return the current instance of <code>TimerScheduleType<T></code> 
    */
   public TimerScheduleType<T> second(String second);

   /**
    * Returns the <code>second</code> element
    * @return the node defined for the element <code>second</code> 
    */
   public String getSecond();

   /**
    * Removes the <code>second</code> element 
    * @return the current instance of <code>TimerScheduleType<T></code> 
    */
   public TimerScheduleType<T> removeSecond();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TimerScheduleType ElementName: xsd:token ElementType : minute
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>minute</code> element
    * @param minute the value for the element <code>minute</code> 
    * @return the current instance of <code>TimerScheduleType<T></code> 
    */
   public TimerScheduleType<T> minute(String minute);

   /**
    * Returns the <code>minute</code> element
    * @return the node defined for the element <code>minute</code> 
    */
   public String getMinute();

   /**
    * Removes the <code>minute</code> element 
    * @return the current instance of <code>TimerScheduleType<T></code> 
    */
   public TimerScheduleType<T> removeMinute();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TimerScheduleType ElementName: xsd:token ElementType : hour
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>hour</code> element
    * @param hour the value for the element <code>hour</code> 
    * @return the current instance of <code>TimerScheduleType<T></code> 
    */
   public TimerScheduleType<T> hour(String hour);

   /**
    * Returns the <code>hour</code> element
    * @return the node defined for the element <code>hour</code> 
    */
   public String getHour();

   /**
    * Removes the <code>hour</code> element 
    * @return the current instance of <code>TimerScheduleType<T></code> 
    */
   public TimerScheduleType<T> removeHour();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TimerScheduleType ElementName: xsd:token ElementType : day-of-month
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>day-of-month</code> element
    * @param dayOfMonth the value for the element <code>day-of-month</code> 
    * @return the current instance of <code>TimerScheduleType<T></code> 
    */
   public TimerScheduleType<T> dayOfMonth(String dayOfMonth);

   /**
    * Returns the <code>day-of-month</code> element
    * @return the node defined for the element <code>day-of-month</code> 
    */
   public String getDayOfMonth();

   /**
    * Removes the <code>day-of-month</code> element 
    * @return the current instance of <code>TimerScheduleType<T></code> 
    */
   public TimerScheduleType<T> removeDayOfMonth();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TimerScheduleType ElementName: xsd:token ElementType : month
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>month</code> element
    * @param month the value for the element <code>month</code> 
    * @return the current instance of <code>TimerScheduleType<T></code> 
    */
   public TimerScheduleType<T> month(String month);

   /**
    * Returns the <code>month</code> element
    * @return the node defined for the element <code>month</code> 
    */
   public String getMonth();

   /**
    * Removes the <code>month</code> element 
    * @return the current instance of <code>TimerScheduleType<T></code> 
    */
   public TimerScheduleType<T> removeMonth();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TimerScheduleType ElementName: xsd:token ElementType : day-of-week
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>day-of-week</code> element
    * @param dayOfWeek the value for the element <code>day-of-week</code> 
    * @return the current instance of <code>TimerScheduleType<T></code> 
    */
   public TimerScheduleType<T> dayOfWeek(String dayOfWeek);

   /**
    * Returns the <code>day-of-week</code> element
    * @return the node defined for the element <code>day-of-week</code> 
    */
   public String getDayOfWeek();

   /**
    * Removes the <code>day-of-week</code> element 
    * @return the current instance of <code>TimerScheduleType<T></code> 
    */
   public TimerScheduleType<T> removeDayOfWeek();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TimerScheduleType ElementName: xsd:token ElementType : year
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>year</code> element
    * @param year the value for the element <code>year</code> 
    * @return the current instance of <code>TimerScheduleType<T></code> 
    */
   public TimerScheduleType<T> year(String year);

   /**
    * Returns the <code>year</code> element
    * @return the node defined for the element <code>year</code> 
    */
   public String getYear();

   /**
    * Removes the <code>year</code> element 
    * @return the current instance of <code>TimerScheduleType<T></code> 
    */
   public TimerScheduleType<T> removeYear();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TimerScheduleType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>TimerScheduleType<T></code> 
    */
   public TimerScheduleType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>TimerScheduleType<T></code> 
    */
   public TimerScheduleType<T> removeId();
}
