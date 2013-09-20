package org.jboss.shrinkwrap.descriptor.api.orm21; 

/**
 * This class implements the <code> parameter-mode </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public enum ParameterMode
{
   _IN("IN"),
   _INOUT("INOUT"),
   _OUT("OUT"),
   _REF_CURSOR("REF_CURSOR");

   private String value;

   ParameterMode (String value) { this.value = value; }

   public String toString() {return value;}

   public static ParameterMode getFromStringValue(String value)
   {
      for(ParameterMode type: ParameterMode.values())
      {
         if(value != null && type.toString().equals(value))
        { return type;}
      }
      return null;
   }

}

