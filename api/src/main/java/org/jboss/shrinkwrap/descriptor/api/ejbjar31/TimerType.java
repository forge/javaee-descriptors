package org.jboss.shrinkwrap.descriptor.api.ejbjar31; 

import java.util.ArrayList;
import java.util.List;
import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.TimerScheduleType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar31.NamedMethodType;
/**
 * This interface defines the contract for the <code> timerType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public interface TimerType<T> extends Child<T>
{
 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TimerType ElementName: xsd:string ElementType : description
   // MaxOccurs: -unbounded  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Creates for all String objects representing <code>description</code> elements, 
    * a new <code>description</code> element 
    * @param values list of <code>description</code> objects 
    * @return the current instance of <code>TimerType<T></code> 
    */
   public TimerType<T> description(String ... values);

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
   public List<String> getAllDescription();

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>TimerType<T></code> 
    */
   public TimerType<T> removeAllDescription();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TimerType ElementName: javaee:timer-scheduleType ElementType : schedule
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>schedule</code> element with the given value will be created.
    * Otherwise, the existing <code>schedule</code> element will be returned.
    * @return  a new or existing instance of <code>TimerScheduleType<TimerType<T>></code> 
    */
   public TimerScheduleType<TimerType<T>> getOrCreateSchedule();

   /**
    * Removes the <code>schedule</code> element 
    * @return the current instance of <code>TimerType<T></code> 
    */
   public TimerType<T> removeSchedule();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TimerType ElementName: xsd:dateTime ElementType : start
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>start</code> element
    * @param start the value for the element <code>start</code> 
    * @return the current instance of <code>TimerType<T></code> 
    */
   public TimerType<T> start(java.util.Date start);

   /**
    * Returns the <code>start</code> element
    * @return the node defined for the element <code>start</code> 
    */
   public java.util.Date getStart();

   /**
    * Removes the <code>start</code> element 
    * @return the current instance of <code>TimerType<T></code> 
    */
   public TimerType<T> removeStart();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TimerType ElementName: xsd:dateTime ElementType : end
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>end</code> element
    * @param end the value for the element <code>end</code> 
    * @return the current instance of <code>TimerType<T></code> 
    */
   public TimerType<T> end(java.util.Date end);

   /**
    * Returns the <code>end</code> element
    * @return the node defined for the element <code>end</code> 
    */
   public java.util.Date getEnd();

   /**
    * Removes the <code>end</code> element 
    * @return the current instance of <code>TimerType<T></code> 
    */
   public TimerType<T> removeEnd();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TimerType ElementName: javaee:named-methodType ElementType : timeout-method
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>timeout-method</code> element with the given value will be created.
    * Otherwise, the existing <code>timeout-method</code> element will be returned.
    * @return  a new or existing instance of <code>NamedMethodType<TimerType<T>></code> 
    */
   public NamedMethodType<TimerType<T>> getOrCreateTimeoutMethod();

   /**
    * Removes the <code>timeout-method</code> element 
    * @return the current instance of <code>TimerType<T></code> 
    */
   public TimerType<T> removeTimeoutMethod();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TimerType ElementName: javaee:xsdBooleanType ElementType : persistent
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>persistent</code> element
    * @param persistent the value for the element <code>persistent</code> 
    * @return the current instance of <code>TimerType<T></code> 
    */
   public TimerType<T> persistent(Boolean persistent);

   /**
    * Returns the <code>persistent</code> element
    * @return the node defined for the element <code>persistent</code> 
    */
   public Boolean isPersistent();

   /**
    * Removes the <code>persistent</code> element 
    * @return the current instance of <code>TimerType<T></code> 
    */
   public TimerType<T> removePersistent();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TimerType ElementName: xsd:token ElementType : timezone
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>timezone</code> element
    * @param timezone the value for the element <code>timezone</code> 
    * @return the current instance of <code>TimerType<T></code> 
    */
   public TimerType<T> timezone(String timezone);

   /**
    * Returns the <code>timezone</code> element
    * @return the node defined for the element <code>timezone</code> 
    */
   public String getTimezone();

   /**
    * Removes the <code>timezone</code> element 
    * @return the current instance of <code>TimerType<T></code> 
    */
   public TimerType<T> removeTimezone();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TimerType ElementName: xsd:token ElementType : info
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>info</code> element
    * @param info the value for the element <code>info</code> 
    * @return the current instance of <code>TimerType<T></code> 
    */
   public TimerType<T> info(String info);

   /**
    * Returns the <code>info</code> element
    * @return the node defined for the element <code>info</code> 
    */
   public String getInfo();

   /**
    * Removes the <code>info</code> element 
    * @return the current instance of <code>TimerType<T></code> 
    */
   public TimerType<T> removeInfo();

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TimerType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>TimerType<T></code> 
    */
   public TimerType<T> id(String id);

   /**
    * Returns the <code>id</code> attribute
    * @return the value defined for the attribute <code>id</code> 
    */
   public String getId();

   /**
    * Removes the <code>id</code> attribute 
    * @return the current instance of <code>TimerType<T></code> 
    */
   public TimerType<T> removeId();
}
