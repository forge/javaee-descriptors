package org.jboss.shrinkwrap.descriptor.api.orm20; 

/**
 * This class implements the <code> generation-type </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public enum GenerationType
{
   _TABLE("TABLE"),
   _SEQUENCE("SEQUENCE"),
   _IDENTITY("IDENTITY"),
   _AUTO("AUTO");

   private String value;

   GenerationType (String value) { this.value = value; }

   public String toString() {return value;}

   public static GenerationType getFromStringValue(String value)
   {
      for(GenerationType type: GenerationType.values())
      {
         if(value != null && type.toString().equals(value))
        { return type;}
      }
      return null;
   }

}

