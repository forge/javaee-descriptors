package org.jboss.shrinkwrap.descriptor.api.webapp25; 

/**
 * This class implements the <code> dispatcherType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public enum DispatcherType
{
   _FORWARD("FORWARD"),
   _INCLUDE("INCLUDE"),
   _REQUEST("REQUEST"),
   _ERROR("ERROR");

   private String value;

   DispatcherType (String value) { this.value = value; }

   public String toString() {return value;}

   public static DispatcherType getFromStringValue(String value)
   {
      for(DispatcherType type: DispatcherType.values())
      {
         if(value != null && type.toString().equals(value))
        { return type;}
      }
      return null;
   }

}

