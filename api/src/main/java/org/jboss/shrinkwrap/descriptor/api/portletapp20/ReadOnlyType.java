package org.jboss.shrinkwrap.descriptor.api.portletapp20; 

/**
 * This class implements the <code> read-onlyType </code> xsd type 
 * @author <a href="mailto:ralf.battenfeld@bluewin.ch">Ralf Battenfeld</a>
 * @author <a href="mailto:alr@jboss.org">Andrew Lee Rubinger</a>
 */
public enum ReadOnlyType
{
   _TRUE("true"),
   _FALSE("false");

   private String value;

   ReadOnlyType (String value) { this.value = value; }

   public String toString() {return value;}

   public static ReadOnlyType getFromStringValue(String value)
   {
      for(ReadOnlyType type: ReadOnlyType.values())
      {
         if(value != null && type.toString().equals(value))
        { return type;}
      }
      return null;
   }

}

