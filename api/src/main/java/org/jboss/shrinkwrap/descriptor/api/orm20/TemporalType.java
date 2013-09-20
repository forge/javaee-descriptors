package org.jboss.shrinkwrap.descriptor.api.orm20; 

/**
 * This class implements the <code> temporal-type </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public enum TemporalType
{
   _DATE("DATE"),
   _TIME("TIME"),
   _TIMESTAMP("TIMESTAMP");

   private String value;

   TemporalType (String value) { this.value = value; }

   public String toString() {return value;}

   public static TemporalType getFromStringValue(String value)
   {
      for(TemporalType type: TemporalType.values())
      {
         if(value != null && type.toString().equals(value))
        { return type;}
      }
      return null;
   }

}

