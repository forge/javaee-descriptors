package org.jboss.shrinkwrap.descriptor.api.orm10; 

/**
 * This class implements the <code> enum-type </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public enum EnumType
{
   _ORDINAL("ORDINAL"),
   _STRING("STRING");

   private String value;

   EnumType (String value) { this.value = value; }

   public String toString() {return value;}

   public static EnumType getFromStringValue(String value)
   {
      for(EnumType type: EnumType.values())
      {
         if(value != null && type.toString().equals(value))
        { return type;}
      }
      return null;
   }

}

