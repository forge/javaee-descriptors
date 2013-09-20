package org.jboss.shrinkwrap.descriptor.api.ejbjar32; 

/**
 * This class implements the <code> time-unit-typeType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public enum TimeUnitTypeType
{
   _DAYS("Days"),
   _HOURS("Hours"),
   _MINUTES("Minutes"),
   _SECONDS("Seconds"),
   _MILLISECONDS("Milliseconds"),
   _MICROSECONDS("Microseconds"),
   _NANOSECONDS("Nanoseconds");

   private String value;

   TimeUnitTypeType (String value) { this.value = value; }

   public String toString() {return value;}

   public static TimeUnitTypeType getFromStringValue(String value)
   {
      for(TimeUnitTypeType type: TimeUnitTypeType.values())
      {
         if(value != null && type.toString().equals(value))
        { return type;}
      }
      return null;
   }

}

