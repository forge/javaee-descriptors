package org.jboss.shrinkwrap.descriptor.api.orm10; 

/**
 * This class implements the <code> fetch-type </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public enum FetchType
{
   _LAZY("LAZY"),
   _EAGER("EAGER");

   private String value;

   FetchType (String value) { this.value = value; }

   public String toString() {return value;}

   public static FetchType getFromStringValue(String value)
   {
      for(FetchType type: FetchType.values())
      {
         if(value != null && type.toString().equals(value))
        { return type;}
      }
      return null;
   }

}

