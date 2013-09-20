package org.jboss.shrinkwrap.descriptor.api.javaeewebservicesclient13; 

/**
 * This class implements the <code> addressing-responsesType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public enum AddressingResponsesType
{
   _ANONYMOUS("ANONYMOUS"),
   _NON_ANONYMOUS("NON_ANONYMOUS"),
   _ALL("ALL");

   private String value;

   AddressingResponsesType (String value) { this.value = value; }

   public String toString() {return value;}

   public static AddressingResponsesType getFromStringValue(String value)
   {
      for(AddressingResponsesType type: AddressingResponsesType.values())
      {
         if(value != null && type.toString().equals(value))
        { return type;}
      }
      return null;
   }

}

