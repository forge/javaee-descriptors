package org.jboss.shrinkwrap.descriptor.impl.ejbjar32; 

import java.util.ArrayList;
import java.util.List;

import org.jboss.shrinkwrap.descriptor.api.Child;
import org.jboss.shrinkwrap.descriptor.api.ejbjar32.NamedMethodType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar32.TimerScheduleType;
import org.jboss.shrinkwrap.descriptor.api.ejbjar32.TimerType;
import org.jboss.shrinkwrap.descriptor.impl.base.Strings;
import org.jboss.shrinkwrap.descriptor.impl.base.XMLDate;
import org.jboss.shrinkwrap.descriptor.spi.node.Node;

/**
 * This class implements the <code> timerType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public class TimerTypeImpl<T> implements Child<T>, TimerType<T>
{
   // -------------------------------------------------------------------------------------||
   // Instance Members 
   // -------------------------------------------------------------------------------------||

   private T t;
   private Node childNode;
   // -------------------------------------------------------------------------------------||
   // Constructor 
   // -------------------------------------------------------------------------------------||

   public TimerTypeImpl(T t, String nodeName, Node node)   {
      this.t = t;
      this.childNode = node.createChild(nodeName);
   }

   public TimerTypeImpl(T t, String nodeName, Node node, Node childNode)   {
      this.t = t;
      this.childNode = childNode;
   }


   public T up()
   {
      return t;
   }


 
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
   public TimerType<T> description(String ... values)
   {
      if (values != null)
      {
         for(String name: values)
         {
            childNode.createChild("description").text(name);
         }
      }
      return this;
   }

   /**
    * Returns all <code>description</code> elements
    * @return list of <code>description</code> 
    */
public List<String> getAllDescription()
   {
      List<String> result = new ArrayList<String>();
      List<Node> nodes = childNode.get("description");
      for (Node node : nodes)
      {
         result.add(node.getText());
      }
      return result;
   }

   /**
    * Removes the <code>description</code> element 
    * @return the current instance of <code>TimerType<T></code> 
    */
   public TimerType<T> removeAllDescription()
   {
      childNode.removeChildren("description");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TimerType ElementName: javaee:timer-scheduleType ElementType : schedule
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>schedule</code> element with the given value will be created.
    * Otherwise, the existing <code>schedule</code> element will be returned.
    * @return  a new or existing instance of <code>TimerScheduleType<TimerType<T>></code> 
    */
   public TimerScheduleType<TimerType<T>> getOrCreateSchedule()
   {
      Node node = childNode.getOrCreate("schedule");
      TimerScheduleType<TimerType<T>> schedule = new TimerScheduleTypeImpl<TimerType<T>>(this, "schedule", childNode, node);
      return schedule;
   }

   /**
    * Removes the <code>schedule</code> element 
    * @return the current instance of <code>TimerType<T></code> 
    */
   public TimerType<T> removeSchedule()
   {
      childNode.removeChildren("schedule");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TimerType ElementName: xsd:dateTime ElementType : start
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>start</code> element
    * @param start the value for the element <code>start</code> 
    * @return the current instance of <code>TimerType<T></code> 
    */
   public TimerType<T> start(java.util.Date start)
   {
      if (start != null)
      {
         childNode.getOrCreate("start").text(XMLDate.toXMLFormat(start));
         return this;
      }
      return null;
   }

   /**
    * Returns the <code>start</code> element
    * @return the node defined for the element <code>start</code> 
    */
   public java.util.Date getStart()
   {
      if (childNode.getTextValueForPatternName("start") != null) {
         return XMLDate.toDate(childNode.getTextValueForPatternName("start"));
      }
      return null;
   }

   /**
    * Removes the <code>start</code> element 
    * @return the current instance of <code>TimerType<T></code> 
    */
   public TimerType<T> removeStart()
   {
      childNode.removeChildren("start");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TimerType ElementName: xsd:dateTime ElementType : end
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>end</code> element
    * @param end the value for the element <code>end</code> 
    * @return the current instance of <code>TimerType<T></code> 
    */
   public TimerType<T> end(java.util.Date end)
   {
      if (end != null)
      {
         childNode.getOrCreate("end").text(XMLDate.toXMLFormat(end));
         return this;
      }
      return null;
   }

   /**
    * Returns the <code>end</code> element
    * @return the node defined for the element <code>end</code> 
    */
   public java.util.Date getEnd()
   {
      if (childNode.getTextValueForPatternName("end") != null) {
         return XMLDate.toDate(childNode.getTextValueForPatternName("end"));
      }
      return null;
   }

   /**
    * Removes the <code>end</code> element 
    * @return the current instance of <code>TimerType<T></code> 
    */
   public TimerType<T> removeEnd()
   {
      childNode.removeChildren("end");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TimerType ElementName: javaee:named-methodType ElementType : timeout-method
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: false
   // --------------------------------------------------------------------------------------------------------||

   /**
    * If not already created, a new <code>timeout-method</code> element with the given value will be created.
    * Otherwise, the existing <code>timeout-method</code> element will be returned.
    * @return  a new or existing instance of <code>NamedMethodType<TimerType<T>></code> 
    */
   public NamedMethodType<TimerType<T>> getOrCreateTimeoutMethod()
   {
      Node node = childNode.getOrCreate("timeout-method");
      NamedMethodType<TimerType<T>> timeoutMethod = new NamedMethodTypeImpl<TimerType<T>>(this, "timeout-method", childNode, node);
      return timeoutMethod;
   }

   /**
    * Removes the <code>timeout-method</code> element 
    * @return the current instance of <code>TimerType<T></code> 
    */
   public TimerType<T> removeTimeoutMethod()
   {
      childNode.removeChildren("timeout-method");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TimerType ElementName: javaee:xsdBooleanType ElementType : persistent
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>persistent</code> element
    * @param persistent the value for the element <code>persistent</code> 
    * @return the current instance of <code>TimerType<T></code> 
    */
   public TimerType<T> persistent(Boolean persistent)
   {
      childNode.getOrCreate("persistent").text(persistent);
      return this;
   }

   /**
    * Returns the <code>persistent</code> element
    * @return the node defined for the element <code>persistent</code> 
    */
   public Boolean isPersistent()
   {
      return Strings.isTrue(childNode.getTextValueForPatternName("persistent"));
   }

   /**
    * Removes the <code>persistent</code> element 
    * @return the current instance of <code>TimerType<T></code> 
    */
   public TimerType<T> removePersistent()
   {
      childNode.removeChildren("persistent");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TimerType ElementName: xsd:token ElementType : timezone
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>timezone</code> element
    * @param timezone the value for the element <code>timezone</code> 
    * @return the current instance of <code>TimerType<T></code> 
    */
   public TimerType<T> timezone(String timezone)
   {
      childNode.getOrCreate("timezone").text(timezone);
      return this;
   }

   /**
    * Returns the <code>timezone</code> element
    * @return the node defined for the element <code>timezone</code> 
    */
   public String getTimezone()
   {
      return childNode.getTextValueForPatternName("timezone");
   }

   /**
    * Removes the <code>timezone</code> element 
    * @return the current instance of <code>TimerType<T></code> 
    */
   public TimerType<T> removeTimezone()
   {
      childNode.removeChildren("timezone");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TimerType ElementName: xsd:token ElementType : info
   // MaxOccurs: -  isGeneric: true   isAttribute: false isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>info</code> element
    * @param info the value for the element <code>info</code> 
    * @return the current instance of <code>TimerType<T></code> 
    */
   public TimerType<T> info(String info)
   {
      childNode.getOrCreate("info").text(info);
      return this;
   }

   /**
    * Returns the <code>info</code> element
    * @return the node defined for the element <code>info</code> 
    */
   public String getInfo()
   {
      return childNode.getTextValueForPatternName("info");
   }

   /**
    * Removes the <code>info</code> element 
    * @return the current instance of <code>TimerType<T></code> 
    */
   public TimerType<T> removeInfo()
   {
      childNode.removeChildren("info");
      return this;
   }

 
   // --------------------------------------------------------------------------------------------------------||
   // ClassName: TimerType ElementName: xsd:ID ElementType : id
   // MaxOccurs: -  isGeneric: true   isAttribute: true isEnum: false isDataType: true
   // --------------------------------------------------------------------------------------------------------||

   /**
    * Sets the <code>id</code> attribute
    * @param id the value for the attribute <code>id</code> 
    * @return the current instance of <code>TimerType<T></code> 
    */
   public TimerType<T> id(String id)
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
    * @return the current instance of <code>TimerType<T></code> 
    */
   public TimerType<T> removeId()
   {
      childNode.removeAttribute("id");
      return this;
   }
}
